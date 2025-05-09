package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SpeedTestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static SpeedTestManager c = null;
    public static boolean firstTime = true;
    public static int netErrCode = -2;

    /* renamed from: a  reason: collision with root package name */
    public DiagnoseStateManager f4188a = null;
    public NetworkDiagnoseManager.ResultCount b = null;

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:15:0x0041, B:17:0x004b, B:19:0x0053, B:21:0x0068, B:25:0x0073, B:26:0x0079, B:28:0x0083, B:32:0x008e, B:33:0x0094, B:35:0x009e, B:39:0x00a9, B:40:0x00b1, B:42:0x00bb, B:44:0x00c3), top: B:49:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:15:0x0041, B:17:0x004b, B:19:0x0053, B:21:0x0068, B:25:0x0073, B:26:0x0079, B:28:0x0083, B:32:0x008e, B:33:0x0094, B:35:0x009e, B:39:0x00a9, B:40:0x00b1, B:42:0x00bb, B:44:0x00c3), top: B:49:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData> convertLinkData(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestManager.convertLinkData(java.lang.String):java.util.List");
    }

    public static final SpeedTestManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeedTestManager) ipChange.ipc$dispatch("7808e34c", new Object[0]);
        }
        if (c == null) {
            c = new SpeedTestManager();
        }
        return c;
    }

    public final void a(boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556bc9b6", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (this.f4188a != null) {
            if (str != null) {
                str = "out_diago:" + str;
            }
            this.f4188a.report(z, z2, z3, str);
        }
    }

    public boolean diagnose(Configuration.DetectInf detectInf) {
        double d;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb1ca75", new Object[]{this, detectInf})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        LogCatUtil.info("DIAGNOSE-SPEEDTESTMANAGER", "[diagnose]detectInf begin.");
        if (detectInf == null) {
            LogCatUtil.warn("DIAGNOSE-SPEEDTESTMANAGER", "[diagnose] dectectInf is null.");
            a(true, false, false, "[diagnose] dectectInf is null.");
            return false;
        }
        if (1 != detectInf.protocol) {
            z = false;
        }
        Configuration.Address sysProxy = NetworkDiagnoseUtil.sysProxy(null, z);
        boolean start = new Link(detectInf, this.f4188a, null).start();
        if (sysProxy != null) {
            Link link = new Link(detectInf, this.f4188a, sysProxy);
            NetworkDiagnoseManager.ResultCount resultCount = this.b;
            if (resultCount != null) {
                resultCount.addTotal();
            }
            start |= link.start();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        AlipayQosService instance = AlipayQosService.getInstance();
        if (start) {
            d = currentTimeMillis2 - currentTimeMillis;
        } else {
            d = 5000.0d;
        }
        instance.estimate(d, (byte) 3);
        return start;
    }

    public void register(NetworkDiagnoseManager.ResultCount resultCount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7565437b", new Object[]{this, resultCount});
        } else if (resultCount != null) {
            this.b = resultCount;
        }
    }

    public void register(DiagnoseStateManager diagnoseStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772af310", new Object[]{this, diagnoseStateManager});
        } else if (diagnoseStateManager != null) {
            this.f4188a = diagnoseStateManager;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r13.equals("y") == false) goto L_0x00d0;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:18:0x004b, B:21:0x005a, B:23:0x0060, B:25:0x0068, B:27:0x006c, B:34:0x0078, B:35:0x007b, B:37:0x007e, B:39:0x0084, B:41:0x00b8, B:43:0x00be, B:45:0x00c6, B:47:0x00ca), top: B:53:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData diagnoseByLink(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestManager.diagnoseByLink(java.lang.String, boolean):com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData");
    }
}
