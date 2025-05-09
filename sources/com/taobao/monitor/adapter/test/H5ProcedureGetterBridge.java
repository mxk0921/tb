package com.taobao.monitor.adapter.test;

import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fln;
import tb.kpw;
import tb.luj;
import tb.mdd;
import tb.nsw;
import tb.o48;
import tb.uxm;
import tb.v5r;
import tb.w9a;
import tb.x11;
import tb.xxi;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class H5ProcedureGetterBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_PROCEDURE_GETTER = "procedureGetter";
    private static final String ACTION_PROCEDURE_GETTER_DEBUG = "findAllProcedure";
    private static final String ACTION_REALTIME_UPLOAD = "realTimeDisplay";
    public static final String API_SERVER_NAME = "H5ProcedureGetterBridge";
    public static final String SP_KEY_REALTIME_TRACE_ID = "realtime_display_trace_id";
    public static final String SP_KEY_REALTIME_TRACE_VALID_TIME = "realtime_trace_valid_time";

    private boolean getBoolValueFromJson(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8bf59a", new Object[]{this, jSONObject, str, new Boolean(z)})).booleanValue();
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return z;
        }
    }

    public static /* synthetic */ Object ipc$super(H5ProcedureGetterBridge h5ProcedureGetterBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/test/H5ProcedureGetterBridge");
    }

    private boolean startRealtimeUpload(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67f01a20", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean boolValueFromJson = getBoolValueFromJson(jSONObject, "need_launch_sample", true);
            getBoolValueFromJson(jSONObject, "need_page_sample", true);
            boolean boolValueFromJson2 = getBoolValueFromJson(jSONObject, "effect_permanently", false);
            String string = jSONObject.getString(ApLinkTokenUtils.KEY_TRACE_ID);
            long j = jSONObject.has("trace_valid_time") ? jSONObject.getLong("trace_valid_time") : -1L;
            o48.j = o48.j || !boolValueFromJson;
            SharedPreferences k = w9a.g().k();
            if (boolValueFromJson2) {
                v5r.c = false;
                SharedPreferences.Editor edit = k.edit();
                edit.putString(SP_KEY_REALTIME_TRACE_ID, string);
                if (j > 0) {
                    edit.putLong(SP_KEY_REALTIME_TRACE_VALID_TIME, j);
                }
                edit.putBoolean(x11.LAUNCHER_PROCESSOR_SAMPLE, o48.j);
                edit.apply();
            }
            v5r.d = string;
            v5r.e = "scan";
            luj.c().d(fln.class);
            luj.c().b(new fln());
            nsw nswVar = new nsw();
            nswVar.b("result", "APM实时上传已打开，请退出操作，有数据后页面将进行展示");
            wVCallBackContext.success(nswVar);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error("参数解析异常：" + e.getMessage());
            return false;
        }
    }

    private boolean getProcedure(String str, WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2dfa10d", new Object[]{this, str, wVCallBackContext, new Boolean(z)})).booleanValue();
        }
        try {
            zq6.a(API_SERVER_NAME, ACTION_PROCEDURE_GETTER);
            String string = new JSONObject(str).getString("h5Url");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.getWebview().getUrl();
            }
            xxi xxiVar = ProcedureGlobal.PROCEDURE_MANAGER;
            mdd e = xxiVar.e();
            String str2 = "";
            if (e.isAlive()) {
                str2 = uxm.e(xxiVar.v(e));
            }
            nsw nswVar = new nsw();
            nswVar.b("startup", str2);
            if (z) {
                nswVar.c("pages", new JSONArray((Collection) xxiVar.q(string)));
            } else {
                String u = xxiVar.u(string);
                nswVar.b("content", u);
                zq6.a(API_SERVER_NAME, "content", u);
            }
            wVCallBackContext.success(nswVar);
            zq6.a(API_SERVER_NAME, "startup", str2);
        } catch (Exception e2) {
            wVCallBackContext.error(e2.getMessage());
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r7.equals(com.taobao.monitor.adapter.test.H5ProcedureGetterBridge.ACTION_PROCEDURE_GETTER_DEBUG) == false) goto L_0x003b;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r7, java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.monitor.adapter.test.H5ProcedureGetterBridge.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "bcd41fd1"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0022:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "params"
            r3[r2] = r4
            r3[r1] = r8
            java.lang.String r4 = "H5ProcedureGetterBridge"
            tb.zq6.a(r4, r3)
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1345401673: goto L_0x0052;
                case -679498306: goto L_0x0046;
                case -44766581: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = -1
            goto L_0x005d
        L_0x003d:
            java.lang.String r4 = "findAllProcedure"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x005d
            goto L_0x003b
        L_0x0046:
            java.lang.String r0 = "procedureGetter"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0050
            goto L_0x003b
        L_0x0050:
            r0 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "realTimeDisplay"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005c
            goto L_0x003b
        L_0x005c:
            r0 = 0
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0066;
                case 2: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r2
        L_0x0061:
            boolean r7 = r6.getProcedure(r8, r9, r1)
            return r7
        L_0x0066:
            boolean r7 = r6.getProcedure(r8, r9, r2)
            return r7
        L_0x006b:
            boolean r7 = r6.startRealtimeUpload(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.monitor.adapter.test.H5ProcedureGetterBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
