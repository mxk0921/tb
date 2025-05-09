package com.taobao.android.revisionswitch.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsBridgeRevisionSwitch extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_BUCKET = "getBucket";
    private static final String GET_ELDER_SIMPLE_SWITCH_VALUE = "getElderSimpleSwitchValue";
    private static final String GET_SWITCH_VALUE = "getSwitchValue";
    private static final String INSERT_SWITCH_IMMEDIATELY = "insertSwitchImmediately";
    public static final String NAME = "JsBridgeRevisionSwitch";

    private boolean getBucket(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bde00032", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String b = TBRevisionSwitchManager.c().b();
        if (b == null) {
            b = "";
        }
        nsw nswVar = new nsw("HY_SUCCESS");
        nswVar.b("bucket", b);
        wVCallBackContext.success(nswVar);
        return true;
    }

    private boolean insertSwitchImmediately(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8c3583", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            TBRevisionSwitchManager.c().k(new JSONObject(str));
            wVCallBackContext.success(new nsw("HY_SUCCESS"));
        } catch (JSONException e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(JsBridgeRevisionSwitch jsBridgeRevisionSwitch, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/revisionswitch/windvane/JsBridgeRevisionSwitch");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r8.equals(com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch.INSERT_SWITCH_IMMEDIATELY) == false) goto L_0x002d;
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
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = "bcd41fd1"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            java.lang.Object r8 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            if (r8 != 0) goto L_0x0025
            return r3
        L_0x0025:
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case 317811936: goto L_0x004f;
                case 1057359767: goto L_0x0044;
                case 1480233319: goto L_0x0039;
                case 2041375601: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0059
        L_0x002f:
            java.lang.String r1 = "insertSwitchImmediately"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0059
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "getSwitchValue"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            r0 = 2
            goto L_0x0059
        L_0x0044:
            java.lang.String r0 = "getElderSimpleSwitchValue"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004d
            goto L_0x002d
        L_0x004d:
            r0 = 1
            goto L_0x0059
        L_0x004f:
            java.lang.String r0 = "getBucket"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0058
            goto L_0x002d
        L_0x0058:
            r0 = 0
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0067;
                case 2: goto L_0x0062;
                case 3: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            return r3
        L_0x005d:
            boolean r8 = r7.insertSwitchImmediately(r9, r10)
            return r8
        L_0x0062:
            boolean r8 = r7.getSwitchValue(r9, r10)
            return r8
        L_0x0067:
            boolean r8 = r7.getElderSimpleSwitchValue(r9, r10)
            return r8
        L_0x006c:
            boolean r8 = r7.getBucket(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private boolean getElderSimpleSwitchValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82caa29", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            String e = TBRevisionSwitchManager.c().e(new JSONObject(str).getString("key"));
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.b("value", e);
            wVCallBackContext.success(nswVar);
        } catch (JSONException e2) {
            wVCallBackContext.error(e2.getMessage());
        }
        return true;
    }

    private boolean getSwitchValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2c4aff9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean d = TBRevisionSwitchManager.c().d(new JSONObject(str).getString("key"));
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.a("value", Boolean.valueOf(d));
            wVCallBackContext.success(nswVar);
        } catch (JSONException e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }
}
