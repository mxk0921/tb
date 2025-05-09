package com.taobao.android.fluid.framework.deprecated.message.module;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoJsBridgeProxy;
import tb.ir9;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ELEMENTS_RECTS = "elementsRects";
    private static final String POST_MESSAGE = "postMessage";
    private static final String SEND_MESSAGE = "sendMessage";
    private static final String TAG = "ShortVideoJsBridgechangfeng";
    private final ShortVideoJsBridgeProxy mFluidSDKProxy = new ShortVideoJsBridgeProxy();

    static {
        t2o.a(468714339);
    }

    public ShortVideoJsBridge() {
        ir9.b(TAG, "初始化 ShortVideoJsBridge");
    }

    public static /* synthetic */ Object ipc$super(ShortVideoJsBridge shortVideoJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/module/ShortVideoJsBridge");
    }

    private boolean parseTrusteeshipTouchRectData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba5935e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy != null) {
            return shortVideoJsBridgeProxy.parseTrusteeshipTouchRectData(str, wVCallBackContext);
        }
        return false;
    }

    private boolean postMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb451d9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy != null) {
            return shortVideoJsBridgeProxy.postMessage(str, wVCallBackContext);
        }
        return false;
    }

    private boolean sendMessatge(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69f8803", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy != null) {
            return shortVideoJsBridgeProxy.sendMessage(str, wVCallBackContext);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r7.equals(com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoJsBridge.POST_MESSAGE) == false) goto L_0x0048;
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoJsBridge.$ipChange
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
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ShortVideoJsBridge 执行方法:"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = ","
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ShortVideoJsBridgechangfeng"
            tb.ir9.a(r4, r3)
            if (r7 != 0) goto L_0x0040
            return r2
        L_0x0040:
            r3 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -47762344: goto L_0x0060;
                case 691453791: goto L_0x0054;
                case 1490029383: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r0 = -1
            goto L_0x006a
        L_0x004a:
            java.lang.String r1 = "postMessage"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x006a
            goto L_0x0048
        L_0x0054:
            java.lang.String r0 = "sendMessage"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x0048
        L_0x005e:
            r0 = 1
            goto L_0x006a
        L_0x0060:
            java.lang.String r0 = "elementsRects"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0069
            goto L_0x0048
        L_0x0069:
            r0 = 0
        L_0x006a:
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0073;
                case 2: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            return r2
        L_0x006e:
            boolean r7 = r6.postMessage(r8, r9)
            return r7
        L_0x0073:
            boolean r7 = r6.sendMessatge(r8, r9)
            return r7
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "execute elements rects, action: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = ", params: "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            tb.ir9.a(r4, r7)
            boolean r7 = r6.parseTrusteeshipTouchRectData(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoJsBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
