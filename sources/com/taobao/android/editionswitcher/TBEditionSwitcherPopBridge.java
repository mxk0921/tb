package com.taobao.android.editionswitcher;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBEditionSwitcherPopBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_VALUE = "standard_version";
    private static final String PAGE_HOME = "Page_Home";
    public static final String SWITCHER_VERSION = "switcherVersion";
    public static final String SWITCH_TO_VERSION = "switchToVersion";
    private static final String TAG = "TBEditionSwitcherPopBridge";

    static {
        t2o.a(456130594);
    }

    public static void commitEvent(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb96d94", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, obj, null, null, strArr);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(TBEditionSwitcherPopBridge tBEditionSwitcherPopBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/TBEditionSwitcherPopBridge");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean switchToVersion(java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
        /*
            r7 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = "adf6251b"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r3[r0] = r8
            r8 = 2
            r3[r8] = r9
            java.lang.Object r8 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001f:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r2 = "switcherVersion"
            if (r1 != 0) goto L_0x0031
            com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r8)     // Catch: Exception -> 0x0031
            java.lang.String r8 = r8.getString(r2)     // Catch: Exception -> 0x0031
            goto L_0x0032
        L_0x0031:
            r8 = 0
        L_0x0032:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r3 = "TBEditionSwitcherPopBridge"
            java.lang.String r4 = "Page_Home"
            if (r1 == 0) goto L_0x0043
            java.lang.String r8 = "switchToVersionValue is null"
            com.taobao.tao.log.TLog.loge(r4, r3, r8)
            return r0
        L_0x0043:
            java.lang.String r1 = "standard_version"
            java.lang.String r1 = tb.nno.a(r2, r1)
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0056
            java.lang.String r8 = "Pop Bridge change version stoped, reasion: Same Version"
            com.taobao.tao.log.TLog.loge(r4, r3, r8)
            return r0
        L_0x0056:
            tb.s78 r1 = tb.s78.d()
            java.lang.String r5 = "popBridge"
            tb.s78 r1 = r1.a(r5)
            tb.a3w r5 = tb.a3w.h()
            tb.a3w r5 = r5.f(r8)
            tb.a3w r2 = r5.c(r2, r8)
            tb.s78 r1 = r1.b(r2)
            tb.r78 r2 = tb.r78.b()
            tb.t7l r5 = new tb.t7l
            java.lang.String r6 = "triggerRequest"
            r5.<init>(r6)
            r2.a(r1, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action="
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 2101(0x835, float:2.944E-42)
            java.lang.String r5 = "button-change"
            commitEvent(r4, r2, r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Pop Bridge change version = "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.taobao.tao.log.TLog.loge(r4, r3, r8)
            r9.success()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge.switchToVersion(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.logd("Edition_Switcher", "TBEditionSwitcherPopBridge; bridge: action" + str + "params:" + str2);
        if (SWITCH_TO_VERSION.equals(str)) {
            return switchToVersion(str2, wVCallBackContext);
        }
        nsw nswVar = new nsw();
        nswVar.b("errorMsg", "no matched method");
        wVCallBackContext.error(nswVar);
        return false;
    }
}
