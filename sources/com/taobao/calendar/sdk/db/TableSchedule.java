package com.taobao.calendar.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.task.Coordinator;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.calendar.sdk.TBCalendarConfig;
import com.taobao.calendar.sdk.alarm.CalendarAlarm;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.calendar.sdk.synchronize.ScheduleModel;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TableSchedule {
    private static final String COL_ALARM_TIME = "alarm_time";
    private static final String COL_DELETED = "deleted";
    private static final String COL_DESCRIPTION = "description";
    private static final String COL_END_TIME = "end_time";
    private static final String COL_EVENT_ID = "event_id";
    private static final String COL_ISALLDAY = "isallday";
    private static final String COL_ISEDITABLE = "iseditable";
    private static final String COL_ISREPEAT = "isrepeat";
    private static final String COL_LINK = "link";
    private static final String COL_REMIND = "remind";
    private static final String COL_REPEAT = "repeat";
    private static final String COL_SOURCE_ID = "source_id";
    private static final String COL_START_TIME = "start_time";
    private static final String COL_SYNC = "sync";
    private static final String COL_THEDATE = "thedate";
    private static final String COL_TITLE = "title";
    private static final String COL_TYPE = "type";
    private static final String COL_UID = "uid";
    private static final String COL_USER_ID = "user_id";
    private static final String TABLE_NAME = "tsic_schedule";
    private static Context contextStatic;
    public static int SUCCESS = 0;
    public static int FAIL = 1;
    private static String TAG = "TBCalendar";
    public static boolean SynIngFlag = false;
    private static String groupName = "calendar";
    private static String appKey = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class QueryHandler {
        static {
            t2o.a(414187586);
        }

        public void callback(int i) {
        }

        public void callback(int i, ResultDO resultDO) {
        }

        public void callback(int i, List<ScheduleDO> list) {
        }

        public void callback(int i, List<ScheduleDO> list, String str) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ QueryHandler f10284a;
        public final /* synthetic */ int b;

        public a(QueryHandler queryHandler, int i) {
            this.f10284a = queryHandler;
            this.b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            List<ScheduleDO> list;
            Object obj;
            ResultDO resultDO;
            Object obj2;
            QueryHandler queryHandler = this.f10284a;
            if (queryHandler != null) {
                int i = message.what;
                int i2 = this.b;
                if (i2 == 0) {
                    String str = "";
                    if (i != DBase.SUCCESS || (obj = message.obj) == null) {
                        list = new ArrayList<>();
                    } else if (obj instanceof HashMap) {
                        HashMap hashMap = (HashMap) obj;
                        str = (String) hashMap.get("guid");
                        list = (List) hashMap.get("data");
                    } else {
                        list = (List) obj;
                    }
                    try {
                        queryHandler.callback(i, list);
                        queryHandler.callback(i, list, str);
                    } catch (NullPointerException unused) {
                        Log.e(TableSchedule.TAG, "h NullPointerException");
                    }
                } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                    if (i != DBase.SUCCESS || (obj2 = message.obj) == null) {
                        resultDO = null;
                    } else {
                        resultDO = (ResultDO) obj2;
                    }
                    queryHandler.callback(i, resultDO);
                    queryHandler.callback(i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10285a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Handler handler, String str2, String str3, String str4, String str5) {
            super(str);
            this.f10285a = handler;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtain = Message.obtain(this.f10285a);
            ArrayList scheduleListBySourceIdFromDB = TableSchedule.getScheduleListBySourceIdFromDB(this.b, this.c, this.d, this.e);
            obtain.what = DBase.SUCCESS;
            obtain.obj = scheduleListBySourceIdFromDB;
            obtain.sendToTarget();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10287a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Handler handler, String str2, String str3) {
            super(str);
            this.f10287a = handler;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                ContentValues contentValues = new ContentValues();
                contentValues.put("sync", (Integer) 0);
                contentValues.put(TableSchedule.COL_DELETED, (Integer) 1);
                Message obtain = Message.obtain(this.f10287a);
                if (writableDatabase.update(TableSchedule.TABLE_NAME, contentValues, "event_id = ?", new String[]{this.b}) != -1) {
                    obtain.what = TableSchedule.SUCCESS;
                } else {
                    obtain.what = TableSchedule.FAIL;
                }
                obtain.sendToTarget();
                TableSchedule.commit(this.c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10288a;
        final /* synthetic */ Handler b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Handler handler, String str3, int i) {
            super(str);
            this.f10288a = str2;
            this.b = handler;
            this.c = str3;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                ContentValues contentValues = new ContentValues();
                if (this.f10288a.equalsIgnoreCase("0")) {
                    contentValues.put("sync", (Integer) 2);
                } else {
                    contentValues.put("sync", (Integer) 0);
                }
                contentValues.put(TableSchedule.COL_DELETED, (Integer) 1);
                Message obtain = Message.obtain(this.b);
                if (writableDatabase.update(TableSchedule.TABLE_NAME, contentValues, "user_id = ? AND event_id = ? AND source_id =? ", new String[]{this.f10288a, this.c, String.valueOf(this.d)}) != -1) {
                    obtain.what = TableSchedule.SUCCESS;
                } else {
                    obtain.what = TableSchedule.FAIL;
                }
                TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "cancel_remind", "sourceId=" + this.d, "eventId=" + this.c);
                obtain.sendToTarget();
                TableSchedule.commit(this.f10288a);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10289a;
        final /* synthetic */ long[] b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Handler handler, long[] jArr, boolean z, String str2) {
            super(str);
            this.f10289a = handler;
            this.b = jArr;
            this.c = z;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
            Message obtain = Message.obtain(this.f10289a);
            if (readableDatabase == null) {
                obtain.what = TableSchedule.FAIL;
                obtain.sendToTarget();
                return;
            }
            String join = Utils.join(this.b, ",");
            if (this.c) {
                new StringBuilder("%%%%% delete ").append(readableDatabase.delete(TableSchedule.TABLE_NAME, "user_id = ? AND source_id in (?)", new String[]{this.d, join}));
            }
            obtain.what = TableSchedule.SUCCESS;
            obtain.sendToTarget();
            TableSchedule.commit(this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10290a;
        final /* synthetic */ String b;
        final /* synthetic */ Handler c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3, Handler handler) {
            super(str);
            this.f10290a = str2;
            this.b = str3;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cursor cursor = null;
            try {
                cursor = DBase.getReadableDatabase(TableSchedule.contextStatic).query(TableSchedule.TABLE_NAME, new String[]{"event_id"}, "event_id = ? AND source_id = ? AND deleted = 0", new String[]{this.f10290a, this.b}, null, null, null);
                boolean z = cursor.getCount() > 0;
                Message obtain = Message.obtain(this.c);
                if (z) {
                    obtain.what = TableSchedule.SUCCESS;
                } else {
                    obtain.what = TableSchedule.FAIL;
                }
                obtain.sendToTarget();
            } catch (Exception unused) {
                if (cursor == null) {
                    return;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10291a;
        final /* synthetic */ Handler b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, Handler handler, String str3) {
            super(str);
            this.f10291a = str2;
            this.b = handler;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
            String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_START_TIME, "title", "link"};
            String[] split = this.f10291a.split(",");
            String[] strArr2 = new String[split.length];
            System.arraycopy(split, 0, strArr2, 0, split.length);
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                cursor = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "event_id in (" + DBase.makePlaceholders(split.length) + ") AND deleted = 0", strArr2, null, null, null);
                while (cursor.moveToNext()) {
                    ScheduleDO scheduleDO = new ScheduleDO();
                    scheduleDO.sourceId = cursor.getLong(0);
                    scheduleDO.eventId = cursor.getString(1);
                    scheduleDO.setStartTime(Long.valueOf(cursor.getLong(2)));
                    scheduleDO.title = cursor.getString(3);
                    scheduleDO.link = cursor.getString(4);
                    arrayList.add(scheduleDO);
                }
                cursor.close();
                Message obtain = Message.obtain(this.b);
                obtain.what = DBase.SUCCESS;
                HashMap hashMap = new HashMap();
                hashMap.put("guid", this.c);
                hashMap.put("data", arrayList);
                obtain.obj = hashMap;
                obtain.sendToTarget();
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class i extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10292a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Handler handler, String str2, String str3, String str4) {
            super(str);
            this.f10292a = handler;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtain = Message.obtain(this.f10292a);
            ArrayList scheduleListFromDB = TableSchedule.getScheduleListFromDB(this.b, this.c, this.d);
            obtain.what = DBase.SUCCESS;
            obtain.obj = scheduleListFromDB;
            obtain.sendToTarget();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class k extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10294a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Handler handler, String str2, long j) {
            super(str);
            this.f10294a = handler;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
            Message obtain = Message.obtain(this.f10294a);
            String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_ALARM_TIME, TableSchedule.COL_START_TIME, "title"};
            String str = this.b;
            String[] strArr2 = {str, this.c + ""};
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                cursor = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "user_id = ? AND start_time >= ? AND isrepeat = 0 AND deleted = 0", strArr2, null, null, "start_time ASC", "1");
                while (cursor.moveToNext()) {
                    ScheduleDO scheduleDO = new ScheduleDO();
                    scheduleDO.sourceId = cursor.getLong(0);
                    scheduleDO.eventId = cursor.getString(1);
                    scheduleDO.alartTime = cursor.getLong(2);
                    scheduleDO.startTime = cursor.getLong(3);
                    scheduleDO.title = cursor.getString(4);
                    arrayList.add(scheduleDO);
                }
                cursor.close();
                obtain.what = DBase.SUCCESS;
                obtain.obj = arrayList;
                obtain.sendToTarget();
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    static {
        t2o.a(414187574);
    }

    public static void CheckSchedule(String str, String str2, QueryHandler queryHandler) {
        DBase.exec(new g(TAG, str, str2, getQueryHandler(queryHandler, 0)));
    }

    public static boolean cacheToDB(List<ScheduleModel> list) {
        boolean z;
        if (list == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = DBase.getWritableDatabase(contextStatic);
            writableDatabase.beginTransaction();
            Iterator<ScheduleModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                ScheduleModel next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.getUid());
                contentValues.put("user_id", next.getUserId());
                contentValues.put(COL_SOURCE_ID, Integer.valueOf(next.getSourceId()));
                contentValues.put("event_id", next.getEventId());
                contentValues.put("type", "");
                contentValues.put(COL_THEDATE, next.getThedate());
                contentValues.put("title", next.getTitle());
                contentValues.put("description", next.getDescription());
                contentValues.put("link", next.getLink());
                long j2 = 0;
                long timeInMillis = next.getStartTime() != null ? DateUtils.parseDateToCalendar(next.getStartTime()).getTimeInMillis() : 0L;
                contentValues.put(COL_START_TIME, Long.valueOf(timeInMillis));
                if (next.getEndTime() != null) {
                    j2 = DateUtils.parseDateToCalendar(next.getEndTime()).getTimeInMillis();
                }
                contentValues.put("end_time", Long.valueOf(j2));
                contentValues.put(COL_ALARM_TIME, Long.valueOf(timeInMillis - (next.getRemind() * 1000)));
                contentValues.put(COL_REMIND, Integer.valueOf(next.getRemind()));
                Repeat repeat = new Repeat();
                repeat.parse(next.getRepeat());
                contentValues.put("repeat", repeat.toString());
                contentValues.put(COL_ISREPEAT, Integer.valueOf(next.getIsrepeat()));
                contentValues.put(COL_DELETED, Integer.valueOf(next.getDeleted()));
                contentValues.put("sync", (Integer) 2);
                contentValues.put(COL_ISALLDAY, Integer.valueOf(next.getIsallday()));
                if (writableDatabase.replace(TABLE_NAME, null, contentValues) == -1) {
                    z = false;
                    break;
                }
            }
            if (z) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
            CalendarAlarm.reset(DBase.getContext());
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void cancelSchedule(String str, int i2, QueryHandler queryHandler, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        DBase.exec(new e(TAG, str2, getQueryHandler(queryHandler, 2), str, i2));
    }

    public static void commit(String str) {
        CalendarAlarm.reset(DBase.getContext());
        if (!TextUtils.equals(str, "0")) {
            CalendarAlarm.syn(DBase.getContext(), str);
        }
    }

    public static void deleteSchedule(String str, QueryHandler queryHandler, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        DBase.exec(new d(TAG, getQueryHandler(queryHandler, 2), str, str2));
    }

    public static void getCommingSchedule(QueryHandler queryHandler, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        DBase.exec(new k(TAG, getQueryHandler(queryHandler, 0), str, currentTimeMillis));
    }

    private static Handler getQueryHandler(QueryHandler queryHandler, int i2) {
        return new a(queryHandler, i2);
    }

    public static void getRecentRemindSchedule(QueryHandler queryHandler) {
        DBase.exec(new j(TAG, Calendar.getInstance().getTimeInMillis(), getQueryHandler(queryHandler, 0)));
    }

    public static void getSchedule(String str, QueryHandler queryHandler) {
        getSchedule(str, null, queryHandler);
    }

    public static void getScheduleAll(QueryHandler queryHandler, String str) {
        getScheduleBetween("1000-01-01", "9999-12-31", queryHandler, str);
    }

    public static void getScheduleBetween(String str, String str2, QueryHandler queryHandler, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "0";
        }
        DBase.exec(new i(TAG, getQueryHandler(queryHandler, 0), str3, str, str2));
    }

    public static void getScheduleBetweenBySourceId(String str, String str2, String str3, String str4, QueryHandler queryHandler) {
        DBase.exec(new b(TAG, getQueryHandler(queryHandler, 0), str, str2, str3, str4));
    }

    public static void getScheduleForDay(String str, QueryHandler queryHandler, String str2) {
        getScheduleBetween(str, str, queryHandler, str2);
    }

    public static void getScheduleForMonth(Date date, QueryHandler queryHandler) {
        Calendar.getInstance().setTime(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
        if (r10 == null) goto L_0x0148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.taobao.calendar.sdk.db.ScheduleDO> getScheduleListBySourceIdFromDB(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.db.TableSchedule.getScheduleListBySourceIdFromDB(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
        if (r10 == null) goto L_0x00da;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.taobao.calendar.sdk.db.ScheduleDO> getScheduleListFromDB(java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            android.content.Context r0 = com.taobao.calendar.sdk.db.TableSchedule.contextStatic
            android.database.sqlite.SQLiteDatabase r1 = com.taobao.calendar.sdk.db.DBase.getReadableDatabase(r0)
            java.lang.String r12 = "isallday"
            java.lang.String r13 = "link"
            java.lang.String r2 = "uid"
            java.lang.String r3 = "source_id"
            java.lang.String r4 = "event_id"
            java.lang.String r5 = "title"
            java.lang.String r6 = "description"
            java.lang.String r7 = "start_time"
            java.lang.String r8 = "end_time"
            java.lang.String r9 = "repeat"
            java.lang.String r10 = "thedate"
            java.lang.String r11 = "remind"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.lang.String r4 = "user_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0"
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "0"
        L_0x0036:
            r2 = r15
            r5 = r16
            goto L_0x003c
        L_0x003a:
            r0 = r14
            goto L_0x0036
        L_0x003c:
            java.lang.String[] r5 = new java.lang.String[]{r0, r15, r5}
            java.lang.String r8 = "start_time ASC"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = 0
            java.lang.String r2 = "tsic_schedule"
            r7 = 0
            r9 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x00c9, Exception -> 0x00cb
        L_0x0053:
            boolean r1 = r10.moveToNext()     // Catch: all -> 0x00c9, Exception -> 0x00cb
            if (r1 == 0) goto L_0x00cd
            com.taobao.calendar.sdk.db.ScheduleDO r1 = new com.taobao.calendar.sdk.db.ScheduleDO     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.<init>()     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r2 = 1
            r1.sourceId = r2     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r2 = 0
            java.lang.String r3 = r10.getString(r2)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.uid = r3     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r3 = 1
            long r4 = r10.getLong(r3)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.sourceId = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 2
            java.lang.String r4 = r10.getString(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.eventId = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 3
            java.lang.String r4 = r10.getString(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.title = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 4
            java.lang.String r4 = r10.getString(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.description = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 5
            long r4 = r10.getLong(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.setStartTime(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 6
            long r4 = r10.getLong(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.endTime = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            com.taobao.calendar.sdk.db.schedule.Repeat r4 = r1.repeat     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r5 = 7
            java.lang.String r5 = r10.getString(r5)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4.parse(r5)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 8
            java.lang.String r4 = r10.getString(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.theDate = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 9
            long r4 = r10.getLong(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.remind = r4     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r4 = 10
            int r4 = r10.getInt(r4)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            if (r4 != r3) goto L_0x00bb
            r2 = 1
        L_0x00bb:
            r1.isAllDay = r2     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r2 = 11
            java.lang.String r2 = r10.getString(r2)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r1.link = r2     // Catch: all -> 0x00c9, Exception -> 0x00cb
            r0.add(r1)     // Catch: all -> 0x00c9, Exception -> 0x00cb
            goto L_0x0053
        L_0x00c9:
            r0 = move-exception
            goto L_0x00d1
        L_0x00cb:
            goto L_0x00d7
        L_0x00cd:
            r10.close()
            goto L_0x00da
        L_0x00d1:
            if (r10 == 0) goto L_0x00d6
            r10.close()
        L_0x00d6:
            throw r0
        L_0x00d7:
            if (r10 == 0) goto L_0x00da
            goto L_0x00cd
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.db.TableSchedule.getScheduleListFromDB(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static List<ScheduleModel> getScheduleNoSynListFromDB(String str, String str2, String str3) {
        Throwable th;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr = {"uid", COL_SOURCE_ID, "event_id", "title", "description", COL_START_TIME, "end_time", "repeat", COL_THEDATE, COL_REMIND, COL_ISALLDAY, "link", COL_DELETED, "user_id", COL_ISEDITABLE, COL_ISREPEAT};
        String[] strArr2 = {TextUtils.isEmpty(str3) ? "0" : str3};
        String config = OrangeConfig.getInstance().getConfig(groupName, "maxSubmitCount", "false");
        if (!TextUtils.isEmpty(config) && config.equalsIgnoreCase("false")) {
            Log.e(TAG, "config center has no data,so default maxCount is maked 50!");
            config = "50";
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor query = readableDatabase.query(TABLE_NAME, strArr, "user_id = ? AND sync < 2", strArr2, null, null, "start_time ASC", config);
            while (query.moveToNext()) {
                try {
                    ScheduleModel scheduleModel = new ScheduleModel();
                    scheduleModel.setUid(query.getString(0));
                    scheduleModel.setSourceId(query.getInt(1));
                    scheduleModel.setEventId(query.getString(2));
                    scheduleModel.setTitle(query.getString(3));
                    scheduleModel.setDescription(query.getString(4));
                    scheduleModel.setStartTime(DateUtils.formatDate(query.getLong(5)));
                    scheduleModel.setEndTime(DateUtils.formatDate(query.getLong(6)));
                    scheduleModel.setThedate(query.getString(8));
                    scheduleModel.setRemind(query.getInt(9));
                    scheduleModel.setIsallday(query.getInt(10));
                    scheduleModel.setLink(query.getString(11));
                    scheduleModel.setDeleted(query.getShort(12));
                    scheduleModel.setUserId(query.getString(13));
                    scheduleModel.setAlarmTime(DateUtils.formatDate(query.getLong(5) + (query.getInt(9) * 10000)));
                    scheduleModel.setIseditable(query.getInt(14));
                    scheduleModel.setIsrepeat(query.getInt(15));
                    if (query.getInt(15) == 1) {
                        Repeat repeat = new Repeat();
                        repeat.parse(query.getString(7));
                        scheduleModel.setRepeat(repeat.parseJson());
                    } else {
                        scheduleModel.setRepeat(null);
                    }
                    arrayList.add(scheduleModel);
                } catch (Exception unused) {
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            query.close();
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
        return arrayList;
    }

    public static String[] getSchedulesBetween(String str, String str2, String str3, String str4) {
        String[] strArr;
        String str5;
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr2 = {"link"};
        if (TextUtils.isEmpty(str3)) {
            strArr = new String[]{str, str2};
            str5 = "source_id = ? AND thedate >= ? AND deleted = 0";
        } else {
            strArr = new String[]{str, str2, str3};
            str5 = "source_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0";
        }
        Cursor cursor2 = null;
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr2, str5, strArr, null, null, "start_time " + str4, null);
            try {
                String[] strArr3 = new String[cursor.getCount()];
                int i2 = 0;
                while (cursor.moveToNext()) {
                    strArr3[i2] = cursor.getString(0);
                    i2++;
                }
                cursor.close();
                return strArr3;
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String[] getSchedulesBetweenNew(String str, String str2, String str3, String str4) {
        String[] strArr;
        String str5;
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr2 = {"event_id", "link", "type", COL_ALARM_TIME, COL_START_TIME};
        if (TextUtils.isEmpty(str3)) {
            strArr = new String[]{str, str2};
            str5 = "source_id = ? AND thedate >= ? AND deleted = 0";
        } else {
            strArr = new String[]{str, str2, str3};
            str5 = "source_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0";
        }
        Cursor cursor2 = null;
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr2, str5, strArr, null, null, "start_time " + str4, null);
            try {
                String[] strArr3 = new String[cursor.getCount()];
                int i2 = 0;
                while (cursor.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_id", (Object) cursor.getString(0));
                    jSONObject.put("link", (Object) cursor.getString(1));
                    jSONObject.put("type", (Object) cursor.getString(2));
                    jSONObject.put(COL_ALARM_TIME, (Object) cursor.getString(3));
                    jSONObject.put(COL_START_TIME, (Object) cursor.getString(4));
                    strArr3[i2] = jSONObject.toString();
                    i2++;
                }
                cursor.close();
                return strArr3;
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void init(Context context) {
        contextStatic = context;
    }

    public static void newSchedule(ScheduleDO scheduleDO, QueryHandler queryHandler, String str) {
        DBase.exec(new c(TAG, str, scheduleDO, getQueryHandler(queryHandler, 2)));
    }

    public static String[] queryAllReminds(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        Cursor cursor;
        Throwable th;
        String str8;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr = {str, str2};
        if (!TextUtils.isEmpty(str3)) {
            str7 = "thedate >= ? AND thedate <= ? AND source_id =" + str3;
        } else {
            str7 = "thedate >= ? AND thedate <= ?";
        }
        if (!TextUtils.isEmpty(str4)) {
            str7 = str7 + " AND user_id =" + str4;
        }
        Cursor cursor2 = null;
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, null, str7, strArr, null, null, "start_time DESC", str6);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String[] strArr2 = new String[cursor.getCount()];
            int i2 = 0;
            while (cursor.moveToNext()) {
                JSONObject cursorToJsonObject = cursorToJsonObject(cursor);
                if (cursorToJsonObject == null) {
                    str8 = "";
                } else {
                    str8 = cursorToJsonObject.toString();
                }
                strArr2[i2] = str8;
                i2++;
            }
            cursor.close();
            return strArr2;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public static String[] queryAllRemindsCount(String str, String str2, String str3, String str4, String str5) {
        String str6;
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr = {COL_THEDATE, "count(*) as remindCount"};
        String[] strArr2 = {str, str2};
        if (!TextUtils.isEmpty(str3)) {
            str6 = "thedate >= ? AND thedate <= ? AND source_id =" + str3;
        } else {
            str6 = "thedate >= ? AND thedate <= ?";
        }
        if (!TextUtils.isEmpty(str4)) {
            str6 = str6 + " AND user_id =" + str4;
        }
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr, str6, strArr2, COL_THEDATE, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            String[] strArr3 = new String[cursor.getCount()];
            int i2 = 0;
            while (cursor.moveToNext()) {
                JSONObject jSONObject = new JSONObject();
                String string = cursor.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("key", (Object) string.replace("-", ""));
                    jSONObject.put("value", (Object) cursor.getString(1));
                    jSONObject.put("count", (Object) Integer.valueOf(cursor.getInt(1)));
                    strArr3[i2] = jSONObject.toString();
                    i2++;
                }
            }
            cursor.close();
            return strArr3;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void updateSchedule(ScheduleDO scheduleDO, QueryHandler queryHandler, String str) {
        newSchedule(scheduleDO, queryHandler, str);
    }

    public static void updateScheduleByType(ArrayList<ScheduleDO> arrayList, long[] jArr, boolean z, QueryHandler queryHandler, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        DBase.exec(new f(TAG, getQueryHandler(queryHandler, 2), jArr, z, str));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10286a;
        final /* synthetic */ ScheduleDO b;
        final /* synthetic */ Handler c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ScheduleDO scheduleDO, Handler handler) {
            super(str);
            this.f10286a = str2;
            this.b = scheduleDO;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            SQLiteException e;
            Exception e2;
            String str3;
            long j;
            String str4;
            String str5;
            String str6;
            if (TextUtils.isEmpty(this.f10286a)) {
                str = "0";
            } else {
                str = this.f10286a;
            }
            try {
                try {
                    try {
                        SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                        ContentValues contentValues = new ContentValues();
                        ScheduleDO scheduleDO = this.b;
                        String str7 = scheduleDO.eventId;
                        long j2 = scheduleDO.remind;
                        if (j2 == -1) {
                            j = 0;
                            str2 = "open tsic_schedule failed ! ";
                            str3 = "alarmTime=";
                        } else {
                            str2 = "open tsic_schedule failed ! ";
                            str3 = "alarmTime=";
                            try {
                                long j3 = scheduleDO.startTime;
                                Long.signum(j2);
                                j = j3 - (j2 * 1000);
                            } catch (SQLiteException e3) {
                                e = e3;
                                Log.e(TableSchedule.TAG, str2, e);
                                return;
                            } catch (Exception e4) {
                                e2 = e4;
                                Log.e(TableSchedule.TAG, str2, e2);
                                return;
                            }
                        }
                        contentValues.put("uid", Utils.md5ToHex(str + this.b.sourceId + str7));
                        contentValues.put("user_id", str);
                        contentValues.put(TableSchedule.COL_SOURCE_ID, Long.valueOf(this.b.sourceId));
                        if (str7 != null) {
                            str4 = "eventId=";
                            str6 = str7;
                            str5 = str6;
                        } else {
                            StringBuilder sb = new StringBuilder("1");
                            str4 = "eventId=";
                            str5 = str7;
                            sb.append(System.currentTimeMillis());
                            str6 = sb.toString();
                        }
                        contentValues.put("event_id", str6);
                        contentValues.put("type", this.b.type);
                        contentValues.put(TableSchedule.COL_THEDATE, this.b.theDate);
                        contentValues.put("title", this.b.title);
                        contentValues.put("description", this.b.description);
                        contentValues.put("link", this.b.link);
                        contentValues.put(TableSchedule.COL_START_TIME, Long.valueOf(this.b.startTime));
                        contentValues.put("end_time", Long.valueOf(this.b.endTime));
                        contentValues.put(TableSchedule.COL_ALARM_TIME, Long.valueOf(j));
                        contentValues.put(TableSchedule.COL_REMIND, Long.valueOf(this.b.remind));
                        contentValues.put("repeat", this.b.repeat.toString());
                        contentValues.put(TableSchedule.COL_ISALLDAY, Integer.valueOf(this.b.isAllDay ? 1 : 0));
                        contentValues.put(TableSchedule.COL_ISREPEAT, Integer.valueOf(this.b.repeat.isRepeat() ? 1 : 0));
                        contentValues.put(TableSchedule.COL_ISEDITABLE, Boolean.valueOf(this.b.isEditable));
                        if (TextUtils.equals(str, "0")) {
                            contentValues.put("sync", (Integer) 2);
                        } else {
                            contentValues.put("sync", (Integer) 0);
                        }
                        contentValues.put(TableSchedule.COL_DELETED, (Integer) 0);
                        long replace = writableDatabase.replace(TableSchedule.TABLE_NAME, null, contentValues);
                        StringBuilder sb2 = new StringBuilder();
                        ScheduleDO scheduleDO2 = this.b;
                        sb2.append(scheduleDO2.startTime - (scheduleDO2.remind * 1000));
                        sb2.append("");
                        TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "add_remind", "sourceId=" + this.b.sourceId, str4 + str5, str3 + j, "url=" + this.b.link);
                        Message obtain = Message.obtain(this.c);
                        if (replace != -1) {
                            obtain.what = TableSchedule.SUCCESS;
                        } else {
                            obtain.what = TableSchedule.FAIL;
                        }
                        obtain.sendToTarget();
                        TableSchedule.commit(str);
                    } catch (SQLiteException e5) {
                        e = e5;
                        str2 = "open tsic_schedule failed ! ";
                    }
                } catch (Exception e6) {
                    e2 = e6;
                    str2 = "open tsic_schedule failed ! ";
                }
            } catch (SQLiteException e7) {
                e = e7;
                str2 = "open tsic_schedule failed ! ";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class j extends Coordinator.TaggedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f10293a;
        final /* synthetic */ Handler b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, long j, Handler handler) {
            super(str);
            this.f10293a = j;
            this.b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cursor cursor;
            Cursor cursor2;
            Throwable th;
            Cursor cursor3;
            Cursor cursor4;
            Throwable th2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10293a);
            sb.append("");
            SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
            Message obtain = Message.obtain(this.b);
            String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_ALARM_TIME, "title", "link"};
            String[] strArr2 = {this.f10293a + ""};
            ArrayList arrayList = new ArrayList();
            try {
                Cursor query = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "alarm_time >= ? AND isrepeat = 0 AND deleted = 0", strArr2, null, null, "start_time ASC", "15");
                while (query.moveToNext()) {
                    try {
                        ScheduleDO scheduleDO = new ScheduleDO();
                        scheduleDO.sourceId = query.getLong(0);
                        scheduleDO.eventId = query.getString(1);
                        scheduleDO.alartTime = query.getLong(2);
                        scheduleDO.title = query.getString(3);
                        scheduleDO.link = query.getString(4);
                        arrayList.add(scheduleDO);
                    } catch (Exception unused) {
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = query;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                query.close();
                try {
                    Cursor query2 = readableDatabase.query(TableSchedule.TABLE_NAME, new String[]{"event_id", TableSchedule.COL_START_TIME, "repeat", TableSchedule.COL_REMIND, "title"}, "isrepeat = 1 AND deleted = 0", null, null, null, "start_time ASC", null);
                    while (query2.moveToNext()) {
                        try {
                            ScheduleDO scheduleDO2 = new ScheduleDO();
                            scheduleDO2.sourceId = 1L;
                            scheduleDO2.eventId = query2.getString(0);
                            scheduleDO2.startTime = query2.getLong(1);
                            scheduleDO2.repeat.parse(query2.getString(2));
                            scheduleDO2.remind = query2.getLong(3);
                            scheduleDO2.title = query2.getString(4);
                            scheduleDO2.processRepeat(this.f10293a);
                            long j = scheduleDO2.remind;
                            long j2 = j == -1 ? 0L : scheduleDO2.startTime - (j * 1000);
                            scheduleDO2.alartTime = j2;
                            if (j2 > this.f10293a) {
                                arrayList.add(scheduleDO2);
                            }
                        } catch (Exception unused2) {
                            cursor3 = query2;
                            if (cursor3 != null) {
                                cursor3.close();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                            cursor4 = query2;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            throw th2;
                        }
                    }
                    query2.close();
                    obtain.what = DBase.SUCCESS;
                    obtain.obj = arrayList;
                    obtain.sendToTarget();
                } catch (Exception unused3) {
                    cursor3 = null;
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor4 = null;
                }
            } catch (Exception unused4) {
                cursor = null;
            } catch (Throwable th6) {
                th = th6;
                cursor2 = null;
            }
        }
    }

    public static void getSchedule(String str, String str2, QueryHandler queryHandler) {
        Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        queryHandler2.post(new h(TAG, str, queryHandler2, str2));
    }

    private static JSONObject cursorToJsonObject(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String string = cursor.getString(cursor.getColumnIndex(COL_SOURCE_ID));
        if (TextUtils.isEmpty(string)) {
            string = "0";
        }
        jSONObject.put("userId", (Object) cursor.getString(cursor.getColumnIndex("user_id")));
        jSONObject.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) string);
        jSONObject.put("eventId", (Object) cursor.getString(cursor.getColumnIndex("event_id")));
        jSONObject.put(COL_THEDATE, (Object) cursor.getString(cursor.getColumnIndex(COL_THEDATE)));
        jSONObject.put("startTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex(COL_START_TIME)), "yyyy-MM-dd HH:mm:ss"));
        jSONObject.put("endTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex("end_time")), "yyyy-MM-dd HH:mm:ss"));
        jSONObject.put("type", (Object) cursor.getString(cursor.getColumnIndex("type")));
        jSONObject.put("title", (Object) cursor.getString(cursor.getColumnIndex("title")));
        jSONObject.put("description", (Object) cursor.getString(cursor.getColumnIndex("description")));
        jSONObject.put("link", (Object) cursor.getString(cursor.getColumnIndex("link")));
        jSONObject.put("alarmTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex(COL_ALARM_TIME)), "yyyy-MM-dd HH:mm:ss"));
        jSONObject.put(COL_REMIND, (Object) cursor.getString(cursor.getColumnIndex(COL_REMIND)));
        jSONObject.put(COL_ISREPEAT, (Object) cursor.getString(cursor.getColumnIndex(COL_ISREPEAT)));
        jSONObject.put(COL_ISEDITABLE, (Object) cursor.getString(cursor.getColumnIndex(COL_ISEDITABLE)));
        jSONObject.put(COL_DELETED, (Object) cursor.getString(cursor.getColumnIndex(COL_DELETED)));
        jSONObject.put("sourceName", (Object) TBCalendarConfig.EventType.get(Long.valueOf(Long.parseLong(string)))[0]);
        return jSONObject;
    }

    public static boolean CheckSchedule(String str, String str2) {
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = DBase.getReadableDatabase(contextStatic).query(TABLE_NAME, new String[]{"event_id"}, "event_id = ? AND source_id = ? AND deleted = 0", new String[]{str, str2}, null, null, null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            cursor.close();
            return z;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean cacheToDB(List<ScheduleModel> list, int i2) {
        long j2;
        if (list == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = DBase.getWritableDatabase(contextStatic);
            writableDatabase.beginTransaction();
            Iterator<ScheduleModel> it = list.iterator();
            String str = null;
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ScheduleModel next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.getUid());
                contentValues.put("user_id", next.getUserId());
                contentValues.put(COL_SOURCE_ID, Integer.valueOf(next.getSourceId()));
                contentValues.put("event_id", next.getEventId());
                contentValues.put("type", "");
                contentValues.put(COL_THEDATE, next.getThedate());
                contentValues.put("title", next.getTitle());
                contentValues.put("description", next.getDescription());
                contentValues.put("link", next.getLink());
                long j3 = 0;
                if (next.getStartTime() != null) {
                    j2 = DateUtils.parseDateToCalendar(next.getStartTime()).getTimeInMillis();
                    if (j2 < System.currentTimeMillis()) {
                    }
                } else {
                    j2 = 0;
                }
                contentValues.put(COL_START_TIME, Long.valueOf(j2));
                if (next.getEndTime() != null) {
                    j3 = DateUtils.parseDateToCalendar(next.getEndTime()).getTimeInMillis();
                }
                contentValues.put("end_time", Long.valueOf(j3));
                contentValues.put(COL_ALARM_TIME, Long.valueOf(j2 - (next.getRemind() * 1000)));
                contentValues.put(COL_REMIND, Integer.valueOf(next.getRemind()));
                Repeat repeat = new Repeat();
                repeat.parse(next.getRepeat());
                contentValues.put("repeat", repeat.toString());
                contentValues.put(COL_ISREPEAT, Integer.valueOf(next.getIsrepeat()));
                contentValues.put(COL_DELETED, Integer.valueOf(next.getDeleted()));
                contentValues.put("sync", Integer.valueOf(i2));
                contentValues.put(COL_ISALLDAY, Integer.valueOf(next.getIsallday()));
                if (writableDatabase.replace(TABLE_NAME, null, contentValues) == -1) {
                    z = false;
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    str = next.getUserId();
                }
                z = true;
            }
            if (z) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
            commit(str);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
