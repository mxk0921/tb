package org.android.agoo.message;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bmv;
import tb.t2o;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCS_SPACE_NAME = "accs_message";
    private static final String ADD_MESSAGE = "accs.add_agoo_message";
    private static final String BODY_CODE = "body_code";
    private static final String CREATE_TIME = "create_time";
    private static final String DATABASE_NAME = "message_accs_db";
    private static final int DATABASE_VERSION = 3;
    private static final String DEAL_MESSAGE = "accs.dealMessage";
    private static final String ID = "id";
    private static final String MESSAGE = "message";
    private static final String MESSAGE_TARGET_TIME = "target_time";
    private static final String MESSAGE_TARGET_TIME_INTERVAL = "interval";
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";
    private static final int NOTICE = 1;
    private static final String NOTIFY = "notify";
    private static final String REPORT = "report";
    private static final String SPACE_NAME = "message";
    private static final String STATE = "state";
    private static final String TAG = "MessageService";
    private static final String TYPE = "type";
    private static Context mContext = null;
    private static Map<String, Integer> messageStores = null;
    private volatile SQLiteOpenHelper sqliteOpenHelper = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MessageDBHelper extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343933343);
        }

        private String createmMessageTableSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b8e47a3", new Object[]{this});
            }
            return "create table accs_message(id text UNIQUE not null,state text,message text,create_time date);";
        }

        private String getCreateBodyCodeIndexSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("570cbb9c", new Object[]{this});
            }
            return "CREATE INDEX body_code_index ON message(body_code)";
        }

        private String getCreateIdIndexSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3ff28b30", new Object[]{this});
            }
            return "CREATE INDEX id_index ON message(id)";
        }

        private String getCreateTableSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("395a6107", new Object[]{this});
            }
            return "create table message(id text UNIQUE not null,state integer,body_code integer,report long,target_time long,interval integer,type text,message text,notify integer,create_time date);";
        }

        public static /* synthetic */ Object ipc$super(MessageDBHelper messageDBHelper, String str, Object... objArr) {
            if (str.hashCode() == 305025623) {
                return super.getWritableDatabase();
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/message/MessageService$MessageDBHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
            }
            if (!xd0.b(super.getWritableDatabase().getPath(), C1180n.b)) {
                return null;
            }
            return super.getWritableDatabase();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            } else if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL(getCreateTableSQL());
                    sQLiteDatabase.execSQL(getCreateIdIndexSQL());
                    sQLiteDatabase.execSQL(getCreateBodyCodeIndexSQL());
                    sQLiteDatabase.execSQL(createmMessageTableSQL());
                } catch (Throwable th) {
                    ALog.e(MessageService.TAG, "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th) {
                    try {
                        ALog.e(MessageService.TAG, "messagedbhelper create", th, new Object[0]);
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(createmMessageTableSQL());
                            return;
                        } catch (Throwable th2) {
                            ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th2, new Object[0]);
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(createmMessageTableSQL());
                        } catch (Throwable th4) {
                            ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th4, new Object[0]);
                        }
                        throw th3;
                    }
                }
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                sQLiteDatabase.execSQL(createmMessageTableSQL());
            } catch (Throwable th5) {
                ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th5, new Object[0]);
            }
        }

        public MessageDBHelper(Context context) {
            super(context, MessageService.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 3);
        }
    }

    static {
        t2o.a(343933342);
    }

    public static final boolean checkPackage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948c6ad1", new Object[]{context, str})).booleanValue();
        }
        if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
            return true;
        }
        return false;
    }

    private String getStackMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38cdb21", new Object[]{this, th});
        }
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public void addMessage(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38207498", new Object[]{this, str, str2, str3, new Integer(i)});
        } else {
            addMessage(str, str2, str3, 1, -1L, -1, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r3.getInt(0) > 0) goto L_0x0076;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #3 {all -> 0x008c, blocks: (B:34:0x0084, B:36:0x0089), top: B:48:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasMessageDuplicate(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "hasMessageDuplicate,msgid="
            com.android.alibaba.ip.runtime.IpChange r3 = org.android.agoo.message.MessageService.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r2 = "8c284f93"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r2, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            r3 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r4 = org.android.agoo.message.MessageService.messageStores     // Catch: all -> 0x0044
            boolean r4 = r4.containsKey(r7)     // Catch: all -> 0x0044
            if (r4 == 0) goto L_0x0049
            com.taobao.accs.utl.ALog$Level r4 = com.taobao.accs.utl.ALog.Level.E     // Catch: all -> 0x0044
            boolean r4 = com.taobao.accs.utl.ALog.isPrintLog(r4)     // Catch: all -> 0x0044
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = "MessageService"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0044
            r5.<init>(r2)     // Catch: all -> 0x0044
            r5.append(r7)     // Catch: all -> 0x0044
            java.lang.String r2 = r5.toString()     // Catch: all -> 0x0044
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: all -> 0x0044
            com.taobao.accs.utl.ALog.e(r4, r2, r5)     // Catch: all -> 0x0044
            goto L_0x0047
        L_0x0044:
        L_0x0045:
            r4 = r3
            goto L_0x0082
        L_0x0047:
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            android.database.sqlite.SQLiteOpenHelper r4 = r6.sqliteOpenHelper     // Catch: all -> 0x007f
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch: all -> 0x007f
            if (r4 != 0) goto L_0x0058
            if (r4 == 0) goto L_0x0057
            r4.close()     // Catch: all -> 0x0057
        L_0x0057:
            return r2
        L_0x0058:
            java.lang.String r5 = "select count(1) from message where id = ?"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: all -> 0x0072
            android.database.Cursor r3 = r4.rawQuery(r5, r7)     // Catch: all -> 0x0072
            if (r3 == 0) goto L_0x0075
            boolean r7 = r3.moveToFirst()     // Catch: all -> 0x0072
            if (r7 == 0) goto L_0x0075
            int r7 = r3.getInt(r1)     // Catch: all -> 0x0072
            if (r7 <= 0) goto L_0x0075
            goto L_0x0076
        L_0x0072:
            r1 = r2
            goto L_0x0082
        L_0x0075:
            r0 = r2
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            r3.close()     // Catch: all -> 0x008d
        L_0x007b:
            r4.close()     // Catch: all -> 0x008d
            goto L_0x008d
        L_0x007f:
            r1 = r2
            goto L_0x0045
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch: all -> 0x008c
        L_0x0087:
            if (r4 == 0) goto L_0x008c
            r4.close()     // Catch: all -> 0x008c
        L_0x008c:
            r0 = r1
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.hasMessageDuplicate(java.lang.String):boolean");
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        messageStores = new HashMap();
        mContext = context;
        this.sqliteOpenHelper = new MessageDBHelper(context);
    }

    private void addMessage(String str, String str2, String str3, int i, long j, int i2, int i3) {
        SQLiteDatabase sQLiteDatabase;
        Object th;
        int i4;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aac5a8c", new Object[]{this, str, str2, str3, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
            return;
        }
        ALog.d(TAG, "add sqlite3--->[" + str + "]", new Object[0]);
        try {
            String str5 = "";
            if (TextUtils.isEmpty(str2)) {
                str4 = str5;
                i4 = -1;
            } else {
                i4 = str2.hashCode();
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3;
            }
            if (!messageStores.containsKey(str)) {
                messageStores.put(str, Integer.valueOf(i4));
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "addMessage,messageId=" + str + ",messageStores＝" + messageStores.toString(), new Object[0]);
                }
            }
            sQLiteDatabase = this.sqliteOpenHelper.getWritableDatabase();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?,date('now'))", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i4), 0, Long.valueOf(j), Integer.valueOf(i2), str5, str4, Integer.valueOf(i3)});
                    try {
                        sQLiteDatabase.close();
                    } catch (Throwable th2) {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th2 + "]", new Object[0]);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.e(TAG, "addMessage error,e--->[" + th + "]", new Object[0]);
                        }
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.close();
                            } catch (Throwable th4) {
                                if (ALog.isPrintLog(ALog.Level.E)) {
                                    ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th4 + "]", new Object[0]);
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.close();
                            } catch (Throwable th6) {
                                if (ALog.isPrintLog(ALog.Level.E)) {
                                    ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th6 + "]", new Object[0]);
                                }
                            }
                        }
                        throw th5;
                    }
                }
            } else if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.close();
                } catch (Throwable th7) {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th7 + "]", new Object[0]);
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
            sQLiteDatabase = null;
        }
    }

    public void deleteCacheMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e6cff7", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.sqliteOpenHelper.getWritableDatabase();
        } catch (Throwable th) {
            try {
                ALog.e(TAG, "deleteCacheMessage sql Throwable", th, new Object[0]);
                if (sQLiteDatabase == null) {
                    return;
                }
            } finally {
                if (0 != 0) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
            sQLiteDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
        } else if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused2) {
            }
        }
    }

    private static Bundle getFlag(long j, MsgDO msgDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("82cc92c4", new Object[]{new Long(j), msgDO});
        }
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder("");
                    sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #2 {all -> 0x0175, blocks: (B:61:0x0154, B:63:0x015c), top: B:90:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #8 {all -> 0x017e, blocks: (B:67:0x017a, B:71:0x0182), top: B:102:0x017a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<org.android.agoo.common.MsgDO> getUnReportMsg() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.getUnReportMsg():java.util.ArrayList");
    }

    public void addAccsMessage(String str, String str2, String str3) {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5e2a59", new Object[]{this, str, str2, str3});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "addAccsMessage sqlite3--->[" + str + ",message=" + str2 + ",state=" + str3 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.sqliteOpenHelper.getWritableDatabase();
                if (writableDatabase != null) {
                    try {
                        Cursor rawQuery = writableDatabase.rawQuery("select count(1) from accs_message where id = ?", new String[]{str});
                        if (rawQuery == null || !rawQuery.moveToFirst() || rawQuery.getInt(0) <= 0) {
                            writableDatabase.execSQL("INSERT INTO accs_message VALUES(?,?,?,date('now'))", new Object[]{str, str3, str2});
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            writableDatabase.close();
                            return;
                        }
                        rawQuery.close();
                        rawQuery.close();
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        sQLiteDatabase = writableDatabase;
                        try {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.e(TAG, "addAccsMessage error,e--->[" + th + "],ex=" + getStackMsg(th), new Object[0]);
                            }
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                        }
                    }
                } else if (writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public void updateAccsMessage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18fb527", new Object[]{this, str, str2});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
        } catch (Throwable th) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e(TAG, "updateAccsMessage error,e--->[" + th + "],ex=" + th.getStackTrace().toString(), new Object[0]);
                }
                if (0 == 0) {
                    return;
                }
            } finally {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            sQLiteDatabase = this.sqliteOpenHelper.getWritableDatabase();
            if (sQLiteDatabase != null) {
                if (TextUtils.equals(str2, "1")) {
                    sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, "0"});
                } else {
                    sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
                }
                sQLiteDatabase.close();
            }
        }
    }

    private MsgDO createMsg(String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MsgDO) ipChange.ipc$dispatch("a0584e0b", new Object[]{this, str, str2});
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "msgRecevie,message--->[" + str + "],utdid=" + xd0.c(mContext), new Object[0]);
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            new Bundle();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("p");
                    String string2 = jSONObject.getString(bmv.MSGTYPE_INTERVAL);
                    String string3 = jSONObject.getString(TplMsg.VALUE_T_NATIVE_RETURN);
                    long j = jSONObject.getLong("f");
                    if (!jSONObject.isNull("ext")) {
                        str3 = jSONObject.getString("ext");
                    }
                    msgDO.msgIds = string2;
                    msgDO.extData = str3;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string3)) {
                        msgDO.errorCode = "11";
                    } else if (TextUtils.isEmpty(string)) {
                        msgDO.errorCode = "12";
                    } else if (j == -1) {
                        msgDO.errorCode = "13";
                    } else if (!checkPackage(mContext, string)) {
                        ALog.d(TAG, "ondata checkpackage is del,pack=" + string, new Object[0]);
                        msgDO.removePacks = string;
                    } else {
                        String string4 = getFlag(j, msgDO).getString(AgooConstants.MESSAGE_ENCRYPTED);
                        if (mContext.getPackageName().equals(string)) {
                            if (!TextUtils.equals("0", string4) && !TextUtils.equals("4", string4)) {
                                msgDO.errorCode = "15";
                                ALog.e(TAG, "error encrypted: " + string4, new Object[0]);
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        msgDO.agooFlag = z;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e(TAG, "createMsg is error,e: " + th, new Object[0]);
            }
        }
        return msgDO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r4.getInt(0) > 0) goto L_0x0098;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #4 {all -> 0x00ae, blocks: (B:36:0x00a6, B:38:0x00ab), top: B:52:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasMessageDuplicate(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = ""
            java.lang.String r3 = "addMessage,messageStores hasMessageDuplicate,msgid="
            com.android.alibaba.ip.runtime.IpChange r4 = org.android.agoo.message.MessageService.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0029
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r1] = r8
            r10[r0] = r9
            r9 = 2
            r10[r9] = r2
            java.lang.String r9 = "f8e21558"
            java.lang.Object r9 = r4.ipc$dispatch(r9, r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0029:
            r4 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r5 = org.android.agoo.message.MessageService.messageStores     // Catch: all -> 0x005a
            boolean r5 = r5.containsKey(r9)     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x005f
            java.util.Map<java.lang.String, java.lang.Integer> r5 = org.android.agoo.message.MessageService.messageStores     // Catch: all -> 0x005a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch: all -> 0x005a
            boolean r5 = r5.containsValue(r6)     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x005f
            com.taobao.accs.utl.ALog$Level r5 = com.taobao.accs.utl.ALog.Level.I     // Catch: all -> 0x005a
            boolean r5 = com.taobao.accs.utl.ALog.isPrintLog(r5)     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x005d
            java.lang.String r5 = "MessageService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x005a
            r6.<init>(r3)     // Catch: all -> 0x005a
            r6.append(r9)     // Catch: all -> 0x005a
            java.lang.String r3 = r6.toString()     // Catch: all -> 0x005a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: all -> 0x005a
            com.taobao.accs.utl.ALog.i(r5, r3, r6)     // Catch: all -> 0x005a
            goto L_0x005d
        L_0x005a:
        L_0x005b:
            r5 = r4
            goto L_0x00a4
        L_0x005d:
            r3 = 1
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            android.database.sqlite.SQLiteOpenHelper r5 = r8.sqliteOpenHelper     // Catch: all -> 0x00a1
            android.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch: all -> 0x00a1
            if (r5 != 0) goto L_0x006e
            if (r5 == 0) goto L_0x006d
            r5.close()     // Catch: all -> 0x006d
        L_0x006d:
            return r3
        L_0x006e:
            java.lang.String r6 = "select count(1) from message where id = ? and body_code=? create_time< date('now','-1 day')"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x0094
            r7.<init>(r2)     // Catch: all -> 0x0094
            r7.append(r10)     // Catch: all -> 0x0094
            java.lang.String r10 = r7.toString()     // Catch: all -> 0x0094
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: all -> 0x0094
            android.database.Cursor r4 = r5.rawQuery(r6, r9)     // Catch: all -> 0x0094
            if (r4 == 0) goto L_0x0097
            boolean r9 = r4.moveToFirst()     // Catch: all -> 0x0094
            if (r9 == 0) goto L_0x0097
            int r9 = r4.getInt(r1)     // Catch: all -> 0x0094
            if (r9 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0094:
            r1 = r3
            goto L_0x00a4
        L_0x0097:
            r0 = r3
        L_0x0098:
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch: all -> 0x00af
        L_0x009d:
            r5.close()     // Catch: all -> 0x00af
            goto L_0x00af
        L_0x00a1:
            r1 = r3
            goto L_0x005b
        L_0x00a4:
            if (r4 == 0) goto L_0x00a9
            r4.close()     // Catch: all -> 0x00ae
        L_0x00a9:
            if (r5 == 0) goto L_0x00ae
            r5.close()     // Catch: all -> 0x00ae
        L_0x00ae:
            r0 = r1
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.hasMessageDuplicate(java.lang.String, int):boolean");
    }
}
