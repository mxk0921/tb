package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tlog.adapter.TLogDiagnose;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b5s;
import tb.fsw;
import tb.g6s;
import tb.hf9;
import tb.j5s;
import tb.kpw;
import tb.rb;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogDiagnose extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_TLOG_LIST = "getTLogList";
    private static final String ACTION_GET_TLOG_LIST_DAY = "getTLogListByDay";
    private static final String ACTION_GET_TLOG_LIST_TIME = "getTLogListByTime";
    private static final String ACTION_IS_ENABLE = "isUploadEnable";
    private static final String ACTION_UPLOAD_TLOG = "uploadTLog";
    private static final String ACTION_UPLOAD_TLOG_TIME = "uploadTLogByTime";
    private static final String BRIDGE = "TLogDiagnoseBridge";
    private static final String ERROR_DATA_INVALID = "204";
    private static final String ERROR_EXEC = "100";
    private static final String ERROR_IS_DISABLE = "101";
    private static final String ERROR_NEED_BIZ_INFO = "202";
    private static final String ERROR_NEED_SESSION_ID = "203";
    private static final String ERROR_NO_TLOG_FILE = "201";
    private static final String ERROR_TIME_INVALID = "205";
    private static final String EVENT_UPLOAD_PROCESS = "uploadProcess";
    private static final String TAG = "TLogDiagnose";
    private static final String VER = "1";
    private String sessionID;

    private void error(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f7cf16", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(rb.RESULT_KEY, str);
            wVCallBackContext.error(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void getTLogFileList(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a62f44", new Object[]{this, wVCallBackContext});
        } else if (!j5s.j().v()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            sendTLogList(b5s.f(), wVCallBackContext);
        }
    }

    private void getTLogFileListByDay(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a84bb3", new Object[]{this, str, wVCallBackContext});
        } else if (!j5s.j().v()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                sendTLogList(b5s.o(new JSONObject(str).optString("days", "")), wVCallBackContext);
            } catch (JSONException e) {
                e.printStackTrace();
                error(wVCallBackContext, ERROR_DATA_INVALID);
            }
        }
    }

    private void getTLogFileListByTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a005e332", new Object[]{this, str, wVCallBackContext});
        } else if (!j5s.j().v()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("startTime", "");
                String optString2 = jSONObject.optString("endTime", "");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                long time = simpleDateFormat.parse(optString).getTime();
                long time2 = simpleDateFormat.parse(optString2).getTime();
                if (time2 < time) {
                    error(wVCallBackContext, ERROR_TIME_INVALID);
                } else {
                    sendTLogList(b5s.q(time, time2), wVCallBackContext);
                }
            } catch (Exception e) {
                e.printStackTrace();
                error(wVCallBackContext, ERROR_DATA_INVALID);
            }
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            fsw.h(BRIDGE, TLogDiagnose.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(TLogDiagnose tLogDiagnose, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tlog/adapter/TLogDiagnose");
    }

    private void isEnable(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4165291", new Object[]{this, wVCallBackContext});
        } else if (j5s.j().v()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "1");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            wVCallBackContext.success(jSONObject.toString());
        } else {
            wVCallBackContext.error();
        }
    }

    private void uploadLogFile(String str, final WVCallBackContext wVCallBackContext) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9493a2d", new Object[]{this, str, wVCallBackContext});
        } else if (!j5s.j().v()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("bizType", "");
                String optString2 = jSONObject.optString("bizCode", "");
                String optString3 = jSONObject.optString("startTime", "");
                String optString4 = jSONObject.optString("endTime", "");
                String optString5 = jSONObject.optString("days", "");
                this.sessionID = jSONObject.optString(v4s.PARAM_SESSION_ID, "");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    if (TextUtils.isEmpty(this.sessionID)) {
                        error(wVCallBackContext, ERROR_NEED_SESSION_ID);
                        return;
                    }
                    long j = -1;
                    long j2 = -2;
                    if (TextUtils.isEmpty(optString5)) {
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                            j = simpleDateFormat.parse(optString3).getTime();
                            j2 = simpleDateFormat.parse(optString4).getTime();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (j2 < j) {
                            error(wVCallBackContext, ERROR_TIME_INVALID);
                            return;
                        }
                        strArr = null;
                    } else {
                        strArr = new String[]{optString5};
                    }
                    HashMap hashMap = new HashMap();
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("extraInfos");
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, optJSONObject.getString(next));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    TLogEventHelper.j(this.sessionID, new g6s() { // from class: tb.u4s
                        @Override // tb.g6s
                        public final void a(String str2, String str3, String str4, Map map) {
                            TLogDiagnose.this.lambda$uploadLogFile$0(wVCallBackContext, str2, str3, str4, map);
                        }
                    });
                    hf9.j(this.sessionID, strArr, j, j2, optString, optString2, hashMap, null);
                    wVCallBackContext.success();
                    return;
                }
                error(wVCallBackContext, ERROR_NEED_BIZ_INFO);
            } catch (Exception e3) {
                e3.printStackTrace();
                error(wVCallBackContext, "100");
            }
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!TextUtils.isEmpty(this.sessionID)) {
            TLogEventHelper.a(this.sessionID);
        }
    }

    private void sendTLogList(List<String> list, WVCallBackContext wVCallBackContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401a374b", new Object[]{this, list, wVCallBackContext});
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                File file = new File(str);
                if (file.exists()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fileName", file.getName());
                    jSONObject.put("fileSize", file.length());
                    jSONObject.put("filePath", str);
                    jSONObject.put("lastModify", simpleDateFormat.format(Long.valueOf(file.lastModified())));
                    i++;
                    jSONArray.put(i, jSONObject);
                }
            }
            if (jSONArray.length() == 0) {
                Log.e(TAG, "TLog file is empty!");
                error(wVCallBackContext, ERROR_NO_TLOG_FILE);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(rb.RESULT_KEY, jSONArray);
            wVCallBackContext.success(jSONObject2.toString());
        } catch (Exception e) {
            Log.e(TAG, "Get TLog file exception!");
            e.printStackTrace();
            error(wVCallBackContext, "100");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadLogFile$0(WVCallBackContext wVCallBackContext, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431e8d55", new Object[]{this, wVCallBackContext, str, str2, str3, map});
        } else if (!TextUtils.isEmpty(str) && str.equals(this.sessionID)) {
            String.format("UploadDiagnose: sessionID=%s, stage=%s, event=%s, data=%s", str, str2, str3, map);
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put(v4s.PARAM_SESSION_ID, str);
                jSONObject.put(v4s.PARAM_UPLOAD_STAGE, str2);
                jSONObject.put("event", str3);
                wVCallBackContext.fireEvent(EVENT_UPLOAD_PROCESS, jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(TAG, "fireEvent exception!!");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r8.equals(com.taobao.tlog.adapter.TLogDiagnose.ACTION_GET_TLOG_LIST_DAY) == false) goto L_0x002d;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 4
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.tlog.adapter.TLogDiagnose.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = "bcd41fd1"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r7
            r2[r3] = r8
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r8 = r5.ipc$dispatch(r6, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1009675960: goto L_0x0069;
                case -243105839: goto L_0x005d;
                case 91598948: goto L_0x0051;
                case 521603521: goto L_0x0047;
                case 651057909: goto L_0x003b;
                case 1438698798: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0074
        L_0x002f:
            java.lang.String r0 = "isUploadEnable"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r0 = 5
            goto L_0x0074
        L_0x003b:
            java.lang.String r0 = "uploadTLogByTime"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            r0 = 4
            goto L_0x0074
        L_0x0047:
            java.lang.String r1 = "getTLogListByDay"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0074
            goto L_0x002d
        L_0x0051:
            java.lang.String r0 = "getTLogList"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005b
            goto L_0x002d
        L_0x005b:
            r0 = 2
            goto L_0x0074
        L_0x005d:
            java.lang.String r0 = "uploadTLog"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0067
            goto L_0x002d
        L_0x0067:
            r0 = 1
            goto L_0x0074
        L_0x0069:
            java.lang.String r0 = "getTLogListByTime"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0073
            goto L_0x002d
        L_0x0073:
            r0 = 0
        L_0x0074:
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0084;
                case 2: goto L_0x0080;
                case 3: goto L_0x007c;
                case 4: goto L_0x0084;
                case 5: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            return r4
        L_0x0078:
            r7.isEnable(r10)
            goto L_0x008b
        L_0x007c:
            r7.getTLogFileListByDay(r9, r10)
            goto L_0x008b
        L_0x0080:
            r7.getTLogFileList(r10)
            goto L_0x008b
        L_0x0084:
            r7.uploadLogFile(r9, r10)
            goto L_0x008b
        L_0x0088:
            r7.getTLogFileListByTime(r9, r10)
        L_0x008b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tlog.adapter.TLogDiagnose.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
