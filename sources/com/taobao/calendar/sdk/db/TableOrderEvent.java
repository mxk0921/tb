package com.taobao.calendar.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.taobao.calendar.sdk.common.DateUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TableOrderEvent {
    private static final String COL_END_TIME = "end_time";
    private static final String COL_ID = "uid";
    private static final String COL_MESSAGE = "message";
    private static final String COL_SOURCE_ID = "sourceid";
    private static final String COL_START_TIME = "start_time";
    private static final String COL_THEDATE = "thedate";
    private static final String COL_TITLE = "title";
    private static final String TABLE_NAME = "tsic_order_event";
    private static Context contextStatic;
    private static DBase dbase;
    private static String TAG = "TableOrderEvent";
    public static int SUCCESS = 0;
    public static int FAIL = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class QueryHandler {
        static {
            t2o.a(414187573);
        }

        public void callback(int i, ResultDO resultDO) {
        }

        public void callback(int i, List<EventDO> list) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f10282a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Handler d;

        public a(long j, String str, String str2, Handler handler) {
            this.f10282a = j;
            this.b = str;
            this.c = str2;
            this.d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList orderEventFromDB = TableOrderEvent.getOrderEventFromDB(this.f10282a, this.b, this.c);
            Message obtain = Message.obtain(this.d);
            obtain.what = TableOrderEvent.SUCCESS;
            obtain.obj = orderEventFromDB;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ QueryHandler f10283a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper, QueryHandler queryHandler, int i) {
            super(looper);
            this.f10283a = queryHandler;
            this.b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ArrayList arrayList;
            ResultDO resultDO;
            QueryHandler queryHandler = this.f10283a;
            if (queryHandler != null) {
                int i = message.what;
                int i2 = this.b;
                if (i2 == 0) {
                    if (i == DBase.SUCCESS) {
                        arrayList = (ArrayList) message.obj;
                    } else {
                        arrayList = new ArrayList();
                    }
                    queryHandler.callback(i, arrayList);
                } else if (i2 == 1 || i2 == 2) {
                    if (i == DBase.SUCCESS) {
                        resultDO = (ResultDO) message.obj;
                    } else {
                        resultDO = null;
                    }
                    queryHandler.callback(i, resultDO);
                }
            }
        }
    }

    static {
        t2o.a(414187570);
    }

    private static boolean cacheToDB(ArrayList<EventDO> arrayList) {
        if (arrayList == null) {
            return true;
        }
        try {
            SQLiteDatabase writableDatabase = dbase.getWritableDatabase();
            Iterator<EventDO> it = arrayList.iterator();
            while (it.hasNext()) {
                EventDO next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.uid);
                contentValues.put(COL_SOURCE_ID, Long.valueOf(next.sourceId));
                contentValues.put(COL_THEDATE, next.theDate);
                contentValues.put(COL_START_TIME, Long.valueOf(next.startTime));
                contentValues.put("end_time", Long.valueOf(next.endTime));
                contentValues.put("title", next.title);
                if (writableDatabase.replace(TABLE_NAME, "message", contentValues) == -1) {
                    return false;
                }
            }
            return true;
        } catch (SQLiteException e) {
            Log.e(TAG, "open tsic_order_event failed ! ", e);
            return false;
        } catch (Exception e2) {
            Log.e(TAG, "open tsic_order_event failed ! ", e2);
            return false;
        }
    }

    public static void getOrderEvent(int i, String str, QueryHandler queryHandler) {
        getOrderEvent(i, str, str, queryHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<EventDO> getOrderEventFromDB(long j, String str, String str2) {
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        Cursor cursor2 = null;
        if (readableDatabase == null) {
            return null;
        }
        ArrayList<EventDO> arrayList = new ArrayList<>();
        try {
            cursor = readableDatabase.query(TABLE_NAME, new String[]{"uid", COL_START_TIME, "end_time", "title"}, "thedate >= ? AND thedate <= ? AND sourceid = ?", new String[]{str, str2, j + ""}, null, null, "start_time ASC", null);
            while (cursor.moveToNext()) {
                try {
                    EventDO eventDO = new EventDO();
                    eventDO.uid = cursor.getString(0);
                    eventDO.startTime = cursor.getLong(1);
                    eventDO.endTime = cursor.getLong(2);
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(new Date(eventDO.startTime));
                    eventDO.theDate = DateUtils.getYYYYMMDD(instance);
                    eventDO.title = cursor.getString(3);
                    arrayList.add(eventDO);
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
            }
            cursor.close();
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static Handler getQueryHandler(QueryHandler queryHandler, int i) {
        return new b(Looper.myLooper(), queryHandler, i);
    }

    public static void init(Context context) {
        contextStatic = context;
    }

    private static ArrayList<EventDO> parseHttpResult(JSONArray jSONArray, long j) {
        ArrayList<EventDO> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                EventDO eventDO = new EventDO();
                eventDO.uid = optJSONObject.optString("id");
                eventDO.sourceId = j;
                eventDO.title = optJSONObject.optString("title");
                Date parseDate = DateUtils.parseDate(optJSONObject.optString(COL_START_TIME, ""));
                if (parseDate != null) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parseDate);
                    eventDO.theDate = DateUtils.getYYYYMMDD(instance);
                    eventDO.startTime = instance.getTimeInMillis();
                } else {
                    eventDO.theDate = null;
                }
                if (DateUtils.parseDate(optJSONObject.optString(COL_START_TIME, "")) != null) {
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTime(parseDate);
                    eventDO.endTime = instance2.getTimeInMillis();
                } else {
                    eventDO.endTime = 0L;
                }
                arrayList.add(eventDO);
            }
        }
        return arrayList;
    }

    public static void getOrderEvent(long j, String str, String str2, QueryHandler queryHandler) {
        Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        queryHandler2.post(new a(j, str, str2, queryHandler2));
    }
}
