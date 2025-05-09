package com.taobao.android.behavir.util.bridge;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.weex.common.WXConfig;
import java.io.Serializable;
import java.util.Map;
import tb.azi;
import tb.f82;
import tb.km1;
import tb.kpw;
import tb.nsw;
import tb.qv6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UCPJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "UCP";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext b;

        public a(WVCallBackContext wVCallBackContext) {
            this.b = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/bridge/UCPJSBridge$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                qv6.e();
                this.b.success();
            } catch (Exception e) {
                this.b.error(e.getMessage());
            }
        }
    }

    static {
        t2o.a(404750440);
    }

    public static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return false;
        }
        String string = parseObject.getString("name");
        JSONObject jSONObject = parseObject.getJSONObject(Constants.KEY_USER_ID);
        if (TextUtils.isEmpty(string) || jSONObject == null) {
            wVCallBackContext.error("name为空");
            return false;
        } else if (f82.d() == null) {
            return false;
        } else {
            Intent intent = new Intent(string);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof Double) {
                    intent.putExtra(key, (Double) value);
                } else if (value instanceof JSONObject) {
                    intent.putExtra(key, (Serializable) value);
                }
            }
            wVCallBackContext.success();
            km1.a(intent);
            return true;
        }
    }

    public static boolean applyLogLevelChange(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95b8a750", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return false;
        }
        String string = parseObject.getString(WXConfig.logLevel);
        if (TextUtils.isEmpty(string)) {
            wVCallBackContext.error("logLevel can not be null");
            return false;
        }
        qv6.b.c(string);
        wVCallBackContext.success();
        return true;
    }

    private static boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        String string = JSON.parseObject(str).getString(azi.CACHE_SQL);
        int updateUCPDBByJSBridge = FatigueManager.updateUCPDBByJSBridge(string);
        if (updateUCPDBByJSBridge >= 0) {
            nsw nswVar = new nsw();
            nswVar.a("result", Integer.valueOf(updateUCPDBByJSBridge));
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.error();
        }
        UtUtils.e("UCP", UtUtils.CHANGED_UPP_EVENT_ID, "Log", "updateUCPDB", string, "");
        return true;
    }

    public static /* synthetic */ Object ipc$super(UCPJSBridge uCPJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/bridge/UCPJSBridge");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r8.equals("triggerServiceRequest") == false) goto L_0x0034;
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
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.behavir.util.bridge.UCPJSBridge.$ipChange
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
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L_0x0029
            return r4
        L_0x0029:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1376771198: goto L_0x0086;
                case -584166313: goto L_0x007a;
                case 94627080: goto L_0x006f;
                case 1336114674: goto L_0x0065;
                case 1563990591: goto L_0x0059;
                case 1564116395: goto L_0x004d;
                case 1710176880: goto L_0x0042;
                case 2051041975: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = -1
            goto L_0x0091
        L_0x0036:
            java.lang.String r0 = "tryDecision"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r0 = 7
            goto L_0x0091
        L_0x0042:
            java.lang.String r0 = "changeLogLevel"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004b
            goto L_0x0034
        L_0x004b:
            r0 = 6
            goto L_0x0091
        L_0x004d:
            java.lang.String r0 = "postNotification"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0057
            goto L_0x0034
        L_0x0057:
            r0 = 5
            goto L_0x0091
        L_0x0059:
            java.lang.String r0 = "uploadDB"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0063
            goto L_0x0034
        L_0x0063:
            r0 = 4
            goto L_0x0091
        L_0x0065:
            java.lang.String r1 = "triggerServiceRequest"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0091
            goto L_0x0034
        L_0x006f:
            java.lang.String r0 = "check"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0078
            goto L_0x0034
        L_0x0078:
            r0 = 2
            goto L_0x0091
        L_0x007a:
            java.lang.String r0 = "updateUCPDB"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0084
            goto L_0x0034
        L_0x0084:
            r0 = 1
            goto L_0x0091
        L_0x0086:
            java.lang.String r0 = "previewPlans"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0090
            goto L_0x0034
        L_0x0090:
            r0 = 0
        L_0x0091:
            switch(r0) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00a1;
                case 6: goto L_0x009c;
                case 7: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            return r4
        L_0x0095:
            android.taobao.windvane.webview.IWVWebView r8 = r7.mWebView
            boolean r8 = tb.enu.b(r7, r8, r9, r10)
            return r8
        L_0x009c:
            boolean r8 = applyLogLevelChange(r9, r10)
            return r8
        L_0x00a1:
            boolean r8 = a(r9, r10)
            return r8
        L_0x00a6:
            a(r10)
            return r3
        L_0x00aa:
            b(r10)
            return r3
        L_0x00ae:
            com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r9)
            boolean r8 = tb.enu.a(r8, r10)
            return r8
        L_0x00b7:
            boolean r8 = b(r9, r10)
            return r8
        L_0x00bc:
            tb.jvm.a(r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.behavir.util.bridge.UCPJSBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    public static void b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9f8a6", new Object[]{wVCallBackContext});
            return;
        }
        NativeDelegate.triggerServiceRequest(null);
        wVCallBackContext.success();
    }

    public static void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{wVCallBackContext});
        } else {
            b.b(new a(wVCallBackContext));
        }
    }
}
