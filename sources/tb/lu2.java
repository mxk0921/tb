package tb;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.PublishError;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPPO_AUTHORITY = "com.coloros.calendar";
    public static final List<String> d;
    public static Context f;

    /* renamed from: a  reason: collision with root package name */
    public static Uri f23566a = e(CalendarContract.Calendars.CONTENT_URI, "taobao_android", "com.taobao.taobao");
    public static Uri b = CalendarContract.Events.CONTENT_URI;
    public static Uri c = CalendarContract.Reminders.CONTENT_URI;
    public static final SimpleDateFormat e = new SimpleDateFormat("YYYYMMdd-HHmmss-");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
    }

    public static void b(Context context, ContentValues contentValues, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2d1e31", new Object[]{context, contentValues, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(xu2.g(context))) {
            contentValues.put("hwext_service_description", str3);
            if (TextUtils.isEmpty(str2)) {
                str2 = "Shopping";
            }
            contentValues.put("hwext_service_type", str2);
            if (TextUtils.isEmpty(str)) {
                str = "tbopen://m.taobao.com/tbopen/index.html?action=&module=&bootImage=&h5Url=&bc_fl_src";
            }
            contentValues.put("hwext_service_cp_bz_uri", str);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put("hwext_alert_type", str4);
            }
            ggh.d("CalenderHuaweiManager.serviceEnable true");
        }
    }

    public static String d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94961d6d", new Object[]{str, str2, new Long(j)});
        }
        try {
            StringBuilder sb = new StringBuilder("FREQ=");
            sb.append(str);
            if ("WEEKLY".equals(str)) {
                String u = u(str2);
                if (TextUtils.isEmpty(u)) {
                    return "PARAM_ERR_repeatWeekList";
                }
                sb.append(";WKST=SU;BYDAY=");
                sb.append(u);
            }
            sb.append(";UNTIL=");
            sb.append(e.format(new Date(j)).replaceFirst("-", "T").replaceFirst("-", "Z"));
            return sb.toString();
        } catch (Throwable th) {
            ggh.d("CalendarManager.deleteCalendarEvent.error: " + th.getMessage());
            return null;
        }
    }

    public static Uri e(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d5fc4789", new Object[]{uri, str, str2});
        }
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", str).appendQueryParameter("account_type", str2).build();
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b851663", new Object[]{context});
            return;
        }
        if (TextUtils.isEmpty(xu2.g(context))) {
            b = Uri.parse("content://com.huawei.calendar/events");
        }
        if (TextUtils.isEmpty(yu2.d(context))) {
            f23566a = Uri.parse("content://com.coloros.calendar/calendars");
            b = Uri.parse("content://com.coloros.calendar/events");
            c = Uri.parse("content://com.coloros.calendar/reminders");
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd41e30b", new Object[]{str});
            return;
        }
        try {
            String str2 = (String) gno.b(f).a(iu2.SP_CALENDER_QUERY_LOCAL, "");
            if (!TextUtils.isEmpty(str2)) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str2, new c(), new Feature[0]);
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    if (str.equals(jSONObject.get("calendarEventId"))) {
                        copyOnWriteArrayList.remove(jSONObject);
                    }
                }
                ggh.d("calendarManger calenderDelLocal calenderList: " + copyOnWriteArrayList);
                gno.b(f).e(iu2.SP_CALENDER_QUERY_LOCAL, copyOnWriteArrayList.toString());
            }
        } catch (Exception e2) {
            ggh.d("calendarManger calenderDelLocal error: " + e2.getMessage());
        }
    }

    public static List<String> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d96dbf10", new Object[]{str});
        }
        try {
            String str2 = (String) gno.b(f).a(iu2.SP_CALENDER_QUERY_LOCAL, "");
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str2, new a(), new Feature[0]);
            ggh.d("calendarManger calenderQueryLocal calenderList: " + copyOnWriteArrayList);
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (str.equals(jSONObject.get("calendarTitle"))) {
                    ggh.d("calendarManger has title: " + str);
                    arrayList.add((String) jSONObject.get("calendarEventId"));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            ggh.d("calendarManger calenderQueryLocal error: " + e2.getMessage());
            return null;
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5da76f", new Object[]{str, str2});
            return;
        }
        try {
            String str3 = (String) gno.b(f).a(iu2.SP_CALENDER_QUERY_LOCAL, "");
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (!TextUtils.isEmpty(str3)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str3, new b(), new Feature[0]);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("calendarTitle", (Object) str);
            jSONObject.put("calendarEventId", (Object) str2);
            copyOnWriteArrayList.add(jSONObject);
            ggh.d("calendarManger calenderSaveLocal calenderList: " + copyOnWriteArrayList);
            gno.b(f).e(iu2.SP_CALENDER_QUERY_LOCAL, copyOnWriteArrayList.toString());
        } catch (Exception e2) {
            ggh.d("calendarManger calenderSaveLocal error: " + e2.getMessage());
        }
    }

    public static String k(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80bd03", new Object[]{context, list});
        }
        try {
            for (String str : list) {
                if (context.getContentResolver().delete(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(str)), null, null) == -1) {
                    return iu2.CALENDAR_ERROR_DELETE_FAILED;
                }
                g(str);
            }
            return "";
        } catch (Throwable th) {
            ggh.d("CalendarManager.deleteCalendarByEventId error: " + th.getMessage());
            return "DELETE_EXCEPT";
        }
    }

    public static String l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d46d66", new Object[]{context, str});
        }
        return m(context, str, q8l.b());
    }

    public static String m(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f76446", new Object[]{context, str, new Boolean(z)});
        }
        if (context == null) {
            return "PARAM_INVALID";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (!o(context)) {
                return "NO_PERMISSION";
            }
            int j = j(context);
            if (j < 0) {
                return iu2.CALENDAR_ERROR_ACCOUNT_INVALID;
            }
            if (q8l.e()) {
                List<String> h = h(str);
                if (h != null && !h.isEmpty()) {
                    return k(context, h);
                }
                return "";
            } else if (z) {
                List<Pair<Integer, String>> s = s(context, str, j);
                if (s != null && !s.isEmpty()) {
                    ggh.d("CalendarManager deleteCalendarEvent list: " + s);
                    for (Pair<Integer, String> pair : s) {
                        n(context, ((Integer) pair.first).intValue(), (String) pair.second);
                    }
                }
                return "";
            } else {
                Pair<Integer, String> q = q(context, str, j);
                if (((Integer) q.first).intValue() < 0) {
                    return "";
                }
                return n(context, ((Integer) q.first).intValue(), (String) q.second);
            }
        } catch (Throwable th) {
            ggh.d("CalendarManager.deleteCalendarEvent.error: " + th.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String n(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eedc332d", new Object[]{context, new Integer(i), str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("rrule", "");
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = b;
                if (contentResolver.update(uri, contentValues, "_id=" + i, null) < 0) {
                    return "DELETE_FAILED_ON_UPDATE_RULE";
                }
            }
            ContentResolver contentResolver2 = context.getContentResolver();
            Uri uri2 = b;
            if (contentResolver2.delete(uri2, "_id=" + i, null) == -1) {
                return iu2.CALENDAR_ERROR_DELETE_FAILED;
            }
            return "";
        } catch (Throwable th) {
            ggh.d("CalendarManager.deleteSingleEvent.error; " + th.getMessage());
            return "DELETE_EXCPT";
        }
    }

    public static boolean o(Context context) {
        boolean z;
        boolean z2;
        int checkSelfPermission;
        int checkSelfPermission2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5a569e", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = context.checkSelfPermission("android.permission.READ_CALENDAR");
            if (checkSelfPermission == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            checkSelfPermission2 = context.checkSelfPermission("android.permission.WRITE_CALENDAR");
            if (checkSelfPermission2 == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        if (q8l.e()) {
            return z;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public static String p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f5fc9c", new Object[]{context, str});
        }
        if (!o(context)) {
            return "NO_PERMISSION";
        }
        int j = j(context);
        if (j < 0) {
            return iu2.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (q8l.e()) {
            List<String> h = h(str);
            if (h == null || h.isEmpty()) {
                return "false";
            }
            return "true";
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (((Integer) r(context, str, j, currentTimeMillis - 31536000000L, currentTimeMillis + 31536000000L).first).intValue() > 0) {
                return "true";
            }
            return "false";
        } catch (Throwable th) {
            ggh.d("CalendarManager.isEventExist.error: " + th.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static Pair<Integer, String> q(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e1d23d71", new Object[]{context, str, new Integer(i)});
        }
        return r(context, str, i, 0L, 0L);
    }

    public static List<Pair<Integer, String>> s(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f66642c", new Object[]{context, str, new Integer(i)});
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor query = context.getContentResolver().query(b, null, "calendar_id=" + i + " and title like '%" + str + "%' ", null, null);
        if (query == null) {
            if (query != null) {
            }
            return null;
        }
        try {
            if (query.getCount() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(Pair.create(Integer.valueOf(query.getInt(query.getColumnIndex("_id"))), query.getString(query.getColumnIndex("rrule"))));
                query.moveToNext();
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public static int t(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f5695bf", new Object[]{context, new Long(j)})).intValue();
        }
        if (context == null || j < 0) {
            return -1;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = c;
        Cursor query = contentResolver.query(uri, null, "event_id=" + j, null, null);
        if (query == null) {
            if (query != null) {
            }
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                return -1;
            }
            query.moveToFirst();
            return query.getInt(query.getColumnIndex("_id"));
        } finally {
            query.close();
        }
    }

    public static String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551f1cda", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.replace("[", "").replace("]", "").replaceAll(" ", "").split(",");
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                switch (Integer.parseInt(str2)) {
                    case 1:
                        sb.append("MO");
                        break;
                    case 2:
                        sb.append("TU");
                        break;
                    case 3:
                        sb.append("WE");
                        break;
                    case 4:
                        sb.append("TH");
                        break;
                    case 5:
                        sb.append("FR");
                        break;
                    case 6:
                        sb.append("SA");
                        break;
                    case 7:
                        sb.append("SU");
                        break;
                }
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String v(Context context, long j, String str, String str2, long j2, long j3, long j4, String str3, String str4, long j5) {
        long j6 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ef700aa", new Object[]{context, new Long(j6), str, str2, new Long(j2), new Long(j3), new Long(j4), str3, str4, new Long(j5)});
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j2 < 0 || j3 < 0) {
            return "PARAM_INVALID";
        }
        if (!o(context)) {
            return "NO_PERMISSION";
        }
        int j7 = j(context);
        if (j7 < 0) {
            return iu2.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (j6 < 0) {
            j6 = ((Integer) q(context, str, j7).first).intValue();
        }
        if (j6 < 0) {
            return "CANNOT_FIND_EVENT";
        }
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"), Locale.CHINA);
            gregorianCalendar.setTimeInMillis(j2);
            long time = gregorianCalendar.getTime().getTime();
            gregorianCalendar.setTimeInMillis(j3 + time);
            long time2 = gregorianCalendar.getTime().getTime();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("dtstart", Long.valueOf(time));
            contentValues.put("dtend", Long.valueOf(time2));
            if (((ArrayList) d).contains(str3)) {
                String d2 = d(str3, str4, j5);
                contentValues.put("rrule", d2);
                ggh.d("updateCalendarEvent.rrule：" + d2);
            } else {
                contentValues.put("rrule", "");
            }
            Uri withAppendedId = ContentUris.withAppendedId(b, j6);
            int update = context.getContentResolver().update(withAppendedId, contentValues, null, null);
            if (update == -1) {
                return "UPDATE_FAILED";
            }
            ggh.d("updateCalendarEvent.rows=%s: " + update);
            if (j4 >= 0) {
                int t = t(context, j6);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("minutes", Long.valueOf(j4));
                contentValues2.put("method", (Integer) 1);
                if (t <= 0) {
                    contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(withAppendedId)));
                    if (context.getContentResolver().insert(c, contentValues2) == null) {
                        return iu2.CALENDAR_ERROR_REMINDER_INVALID;
                    }
                } else if (context.getContentResolver().update(ContentUris.withAppendedId(c, t), contentValues2, null, null) == -1) {
                    return "UPDATE_EVENT_REMINDER_FAILED";
                }
            }
            return "";
        } catch (Throwable th) {
            ggh.d("CalendarManager.updateCalendarEvent.error: " + th.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static void c(Context context, ContentValues contentValues, CalendarInsertData calendarInsertData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cdeb91", new Object[]{context, contentValues, calendarInsertData});
        } else if (TextUtils.isEmpty(yu2.d(context))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) "");
            jSONObject.put("deeplinkUrl", (Object) calendarInsertData.getDeepLink());
            jSONObject.put("instantUrl", (Object) "");
            jSONObject.put("targetUrl", (Object) calendarInsertData.getTargetUrl());
            jSONObject.put("packageName", (Object) context.getPackageName());
            jSONObject.put("appName", (Object) "淘宝");
            jSONObject.put("appIcon", (Object) "https://img.alicdn.com/imgextra/i2/O1CN01znGs3z1pDMFUtRqtG_!!6000000005326-2-tps-80-80.png");
            jSONObject.put("buttonText", (Object) calendarInsertData.getButtonText());
            jSONObject.put("traceId", (Object) "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad", (Object) jSONObject);
            contentValues.put("events_json_extensions", jSONObject2.toString());
            contentValues.put("force_reminder", (Integer) 0);
            ggh.d("CalenderManager addOppoParams true");
        }
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72b0338d", new Object[]{context})).intValue();
        }
        f = context;
        if (q8l.e()) {
            return 1;
        }
        f(context);
        Cursor query = context.getContentResolver().query(f23566a, null, null, null, null);
        if (query == null) {
            if (query != null) {
                query.close();
            }
            return -1;
        }
        try {
            int count = query.getCount();
            if (count <= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_name", "taobao_android");
                contentValues.put("account_type", "com.taobao.taobao");
                contentValues.put("ownerAccount", "taobao_android");
                contentValues.put("allowedReminders", "0,1");
                contentValues.put("maxReminders", "5");
                contentValues.put("isPrimary", (Integer) 0);
                contentValues.put("allowedAvailability", "0,1");
                contentValues.put("name", "Taobao Calendar");
                contentValues.put("canModifyTimeZone", (Integer) 1);
                contentValues.put("calendar_displayName", "calendar_taobao");
                contentValues.put("calendar_access_level", (Integer) 700);
                contentValues.put("canOrganizerRespond", (Integer) 0);
                context.getContentResolver().insert(f23566a, contentValues);
                query = context.getContentResolver().query(f23566a, null, null, null, null);
                if (query != null) {
                    count = query.getCount();
                }
            }
            if (count > 0) {
                query.moveToFirst();
                int i = query.getInt(query.getColumnIndex("_id"));
                query.close();
                return i;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    static {
        t2o.a(435159044);
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add("DAILY");
        arrayList.add("WEEKLY");
    }

    public static String a(Context context, CalendarInsertData calendarInsertData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f27a04b", new Object[]{context, calendarInsertData});
        }
        if (context == null || calendarInsertData == null) {
            return PublishError.CODE_KFC_ERROR;
        }
        if (TextUtils.isEmpty(calendarInsertData.getTitle()) || TextUtils.isEmpty(calendarInsertData.getContent()) || calendarInsertData.getReminderTime() < 0 || calendarInsertData.getKeepTime() < 0) {
            return "PARAM_INVALID";
        }
        if (!o(context)) {
            return "NO_PERMISSION";
        }
        int j = j(context);
        if (j < 0) {
            return iu2.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (!q8l.b()) {
            if (q8l.e()) {
                List<String> h = h(calendarInsertData.getTitle());
                if (h == null || h.isEmpty()) {
                    return "ALREADY_ADDED";
                }
            } else if (((Integer) q(context, calendarInsertData.getTitle(), j).first).intValue() >= 0) {
                return "ALREADY_ADDED";
            }
        }
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"), Locale.CHINA);
            gregorianCalendar.setTimeInMillis(calendarInsertData.getReminderTime());
            long time = gregorianCalendar.getTime().getTime();
            gregorianCalendar.setTimeInMillis(calendarInsertData.getKeepTime() + time);
            long time2 = gregorianCalendar.getTime().getTime();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", calendarInsertData.getTitle());
            contentValues.put("description", calendarInsertData.getContent());
            contentValues.put("calendar_id", Integer.valueOf(j));
            contentValues.put("dtstart", Long.valueOf(time));
            contentValues.put("hasAlarm", (Integer) 0);
            contentValues.put("eventTimezone", wqx.SHANGHAI_ZONE_ID_NAME);
            contentValues.put("dtend", Long.valueOf(time2));
            if (((ArrayList) d).contains(calendarInsertData.getFreq())) {
                String d2 = d(calendarInsertData.getFreq(), calendarInsertData.getByDay(), calendarInsertData.getRepeatEnd());
                contentValues.put("rrule", d2);
                ggh.d("addCalendarEvent.rrule：" + d2);
            }
            b(context, contentValues, calendarInsertData.getHuaweiLink(), calendarInsertData.getHuaweiType(), calendarInsertData.getHuaweiDesc(), calendarInsertData.getHuaweiImportant());
            c(context, contentValues, calendarInsertData);
            Uri insert = context.getContentResolver().insert(b, contentValues);
            if (insert == null) {
                return iu2.CALENDAR_ERROR_ADD_EVENT_FAILED;
            }
            if (calendarInsertData.getPreviousMinutes() >= 0) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(insert)));
                contentValues2.put("minutes", Long.valueOf(calendarInsertData.getPreviousMinutes()));
                contentValues2.put("method", (Integer) 1);
                if (context.getContentResolver().insert(c, contentValues2) == null) {
                    return iu2.CALENDAR_ERROR_REMINDER_INVALID;
                }
            }
            i(calendarInsertData.getTitle(), insert.getLastPathSegment());
            return "";
        } catch (Throwable th) {
            ggh.d("CalendarManager.addCalendarEvent.error: " + th.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static Pair<Integer, String> r(Context context, String str, int i, long j, long j2) {
        Throwable th;
        Cursor query;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("52e1517", new Object[]{context, str, new Integer(i), new Long(j), new Long(j2)});
        }
        Cursor cursor = null;
        if (context == null || TextUtils.isEmpty(str)) {
            return Pair.create(-1, null);
        }
        try {
            if (j <= 0 || j2 <= 0 || j2 - j < 0) {
                query = context.getContentResolver().query(b, null, "calendar_id=? and title=?", new String[]{String.valueOf(i), str}, null);
            } else {
                query = context.getContentResolver().query(b, null, "calendar_id='" + i + "' and title='" + str + "' and dtstart>=" + j + " and dtstart<=" + j2, null, null);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (query == null) {
                Pair<Integer, String> create = Pair.create(-1, null);
                if (query != null) {
                    query.close();
                }
                return create;
            } else if (query.getCount() > 0) {
                query.moveToFirst();
                Pair<Integer, String> create2 = Pair.create(Integer.valueOf(query.getInt(query.getColumnIndex("_id"))), query.getString(query.getColumnIndex("rrule")));
                query.close();
                return create2;
            } else {
                query.close();
                return Pair.create(-1, null);
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
