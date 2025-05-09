package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback3;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspRenderCallback implements ICashierRenderCallback3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3729a;
    public final Context b;
    public final IRenderCallback c;

    public MspRenderCallback(int i, Context context, IRenderCallback iRenderCallback) {
        this.f3729a = i;
        this.b = context;
        this.c = iRenderCallback;
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public Object getStatisticAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3d5eade0", new Object[]{this});
        }
        Object obj = StatisticCollector.GLOBAL_AGENT;
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f3729a);
        if (mspContextByBizId != null) {
            return mspContextByBizId.getStatisticInfo().getStatisticAgent();
        }
        return obj;
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    public void onAsyncEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1266b8e", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    public void onEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r11.equals("fpInfo") == false) goto L_0x007b;
     */
    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onGetCustomAttr(java.lang.Object r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.birdnest.render.api.MspRenderCallback.onGetCustomAttr(java.lang.Object, java.lang.String):java.lang.String");
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str});
        } else {
            this.c.onAsyncEvent(iTemplateClickCallback, obj, str);
        }
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public void onEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str});
        } else {
            this.c.onEvent(obj, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r7.equals("scaleFactor") == false) goto L_0x0035;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String onGetGlobalCustomAttr(java.lang.Object r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.ui.birdnest.render.api.MspRenderCallback.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "4d585bf7"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0018:
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "params："
            java.lang.String r6 = r3.concat(r6)
            java.lang.String r3 = "MspRenderCallback::onGetGlobalCustomAttr"
            com.alipay.android.msp.utils.LogUtil.record(r2, r3, r6)
            r7.hashCode()
            java.lang.String r6 = ""
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1962630338: goto L_0x0064;
                case -1210167495: goto L_0x005a;
                case 1352062436: goto L_0x004e;
                case 1458635954: goto L_0x0043;
                case 1812004436: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r0 = -1
            goto L_0x006f
        L_0x0037:
            java.lang.String r0 = "osVersion"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0035
        L_0x0041:
            r0 = 4
            goto L_0x006f
        L_0x0043:
            java.lang.String r0 = "currentTplId"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0035
        L_0x004c:
            r0 = 3
            goto L_0x006f
        L_0x004e:
            java.lang.String r0 = "mspType"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0035
        L_0x0058:
            r0 = 2
            goto L_0x006f
        L_0x005a:
            java.lang.String r1 = "scaleFactor"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x0035
        L_0x0064:
            java.lang.String r0 = "sdkVersion"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x0035
        L_0x006e:
            r0 = 0
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0095;
                case 2: goto L_0x0092;
                case 3: goto L_0x00a2;
                case 4: goto L_0x008f;
                default: goto L_0x0072;
            }
        L_0x0072:
            java.lang.String r0 = "error-params："
            java.lang.String r0 = r0.concat(r7)
            r1 = 8
            com.alipay.android.msp.utils.LogUtil.record(r1, r3, r0)
            java.lang.Object r0 = com.alipay.android.app.safepaylogv2.api.StatisticCollector.GLOBAL_AGENT
            java.lang.String r1 = "params:"
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r1 = "ex"
            java.lang.String r4 = "onGetGlobalCustomAttr"
            com.alipay.android.app.safepaylogv2.api.StatisticCollector.addError(r0, r1, r4, r7)
            goto L_0x00a2
        L_0x008f:
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            goto L_0x00a2
        L_0x0092:
            java.lang.String r6 = "6"
            goto L_0x00a2
        L_0x0095:
            int r6 = com.alipay.android.msp.utils.FlybirdUtil.getSizeGear()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x00a2
        L_0x009e:
            java.lang.String r6 = com.alipay.android.msp.pay.GlobalSdkConstant.getMspVersion()
        L_0x00a2:
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "res："
            java.lang.String r7 = r0.concat(r7)
            com.alipay.android.msp.utils.LogUtil.record(r2, r3, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.birdnest.render.api.MspRenderCallback.onGetGlobalCustomAttr(java.lang.Object, java.lang.String):java.lang.String");
    }
}
