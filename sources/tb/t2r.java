package tb;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t2r implements tkb {
    public static final String c = "content://com.android.calendar/events";
    public static final String d = "content://com.android.calendar/reminders";

    /* renamed from: a  reason: collision with root package name */
    public final Context f28442a;
    public final s2r b = new s2r();

    static {
        t2o.a(693108756);
        t2o.a(693108746);
    }

    public t2r(Context context) {
        this.f28442a = context;
    }

    public void a(ScheduleDTOModule scheduleDTOModule, ned nedVar) {
        s2r s2rVar = this.b;
        Context context = this.f28442a;
        int b = s2rVar.b(context);
        if (nedVar != null) {
            if (!a84.b(scheduleDTOModule)) {
                nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, a84.e(scheduleDTOModule));
            } else if (!a84.a(scheduleDTOModule)) {
                nedVar.a(CalendarResult.KTCALENDAR_REMINDER_DATE_ERROR, a84.e(scheduleDTOModule));
            } else if (b < 0) {
                nedVar.a(CalendarResult.kTBCALENDAR_SYSTEM_ACCOUNT_ERROR, a84.e(scheduleDTOModule));
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", scheduleDTOModule.getTitle());
                String str = "";
                String subTitle = scheduleDTOModule.getSubTitle() == null ? str : scheduleDTOModule.getSubTitle();
                StringBuilder sb = new StringBuilder();
                sb.append(subTitle);
                sb.append("\n");
                String encode = Uri.encode(scheduleDTOModule.getLink());
                String bizId = scheduleDTOModule.getBizId() != null ? scheduleDTOModule.getBizId() : str;
                if (scheduleDTOModule.getOutId() != null) {
                    str = scheduleDTOModule.getOutId();
                }
                sb.append("tbopen://m.taobao.com/tbopen/index.html?packageName=com.taobao.calendar&action=ali.open.nav&module=h5&h5Url=" + encode + "&bootImage=0&visa=69c03b312acd34ae&bizId=" + bizId + "&outId=" + str);
                contentValues.put("description", sb.toString());
                contentValues.put("calendar_id", Integer.valueOf(b));
                int repeatDays = scheduleDTOModule.getRepeatDays();
                if (repeatDays > 30) {
                    repeatDays = 30;
                }
                contentValues.put("dtstart", Long.valueOf(vu6.a(scheduleDTOModule.getStartTime()).getTimeInMillis()));
                contentValues.put("dtend", Long.valueOf(vu6.a(scheduleDTOModule.getEndTime()).getTimeInMillis()));
                contentValues.put("hasAlarm", (Integer) 1);
                contentValues.put("eventTimezone", wqx.SHANGHAI_ZONE_ID_NAME);
                if (repeatDays > 1) {
                    contentValues.put("rrule", "FREQ=DAILY;COUNT=" + repeatDays);
                }
                Uri insert = context.getContentResolver().insert(Uri.parse(c), contentValues);
                if (insert == null) {
                    nedVar.a(CalendarResult.kTBCALENDAR_OTHER_ERROR, a84.e(scheduleDTOModule));
                    return;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(insert)));
                contentValues2.put("minutes", Long.valueOf(a84.c("remind", 180L) / 60));
                contentValues2.put("method", (Integer) 1);
                if (context.getContentResolver().insert(Uri.parse(d), contentValues2) == null) {
                    nedVar.a(CalendarResult.kTBCALENDAR_OTHER_ERROR, a84.e(scheduleDTOModule));
                } else {
                    nedVar.a(CalendarResult.KTCALENDAR_SUCCESS, a84.e(scheduleDTOModule));
                }
            }
        }
    }

    public void b(ScheduleDTOModule scheduleDTOModule, ned nedVar) {
        a(scheduleDTOModule, nedVar);
    }

    public void c(String str, String str2, ned nedVar) {
        e(str, str2, nedVar);
    }

    public final void d(Map<Integer, ScheduleDTOModule> map, ned nedVar) {
        if (map == null || map.isEmpty()) {
            nedVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, "");
            return;
        }
        int i = -1;
        for (Map.Entry<Integer, ScheduleDTOModule> entry : map.entrySet()) {
            if (this.f28442a.getContentResolver().delete(ContentUris.withAppendedId(Uri.parse(c), entry.getKey().intValue()), null, null) != -1) {
                i = entry.getKey().intValue();
            }
        }
        if (i > 0) {
            nedVar.a(CalendarResult.KTCALENDAR_SUCCESS, a84.e(map.get(Integer.valueOf(i))));
        } else {
            nedVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, "");
        }
    }

    public void e(String str, String str2, ned nedVar) {
        Cursor query = this.f28442a.getContentResolver().query(Uri.parse(c), null, null, null, null);
        if (nedVar != null) {
            ScheduleDTOModule scheduleDTOModule = null;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                nedVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
                return;
            }
            Iterator it = ((ArrayList) ts2.c().d()).iterator();
            while (it.hasNext()) {
                ScheduleDTOModule scheduleDTOModule2 = (ScheduleDTOModule) it.next();
                if (scheduleDTOModule2 != null && str.equals(scheduleDTOModule2.getBizId()) && str2.equals(scheduleDTOModule2.getOutId())) {
                    scheduleDTOModule = scheduleDTOModule2;
                }
            }
            if (scheduleDTOModule == null) {
                nedVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, a84.e(scheduleDTOModule));
                return;
            }
            HashMap hashMap = new HashMap();
            if (query != null) {
                try {
                    if (query.getCount() <= 0) {
                        query.close();
                        return;
                    }
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        String string = query.getString(query.getColumnIndex("title"));
                        if (!TextUtils.isEmpty(scheduleDTOModule.getTitle()) && scheduleDTOModule.getTitle().equals(string)) {
                            hashMap.put(Integer.valueOf(query.getInt(query.getColumnIndex("_id"))), scheduleDTOModule);
                        }
                        query.moveToNext();
                    }
                    query.close();
                    d(hashMap, nedVar);
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } else if (query != null) {
                query.close();
            }
        }
    }
}
