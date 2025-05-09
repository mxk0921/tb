package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Traceroute;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkDiagnose {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DIAGNOSE-NETWORKDIAGNOSE";
    public static NetworkDiagnose h;

    /* renamed from: a  reason: collision with root package name */
    public Storage f4185a = null;
    public AmnetNetworkDiagnoseListener b = null;
    public Configuration.DetectInf[] c = null;
    public Traceroute.PingInf[] d = null;
    public int e = 0;
    public long f = 0;
    public boolean g = false;

    public static final NetworkDiagnose instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkDiagnose) ipChange.ipc$dispatch("19cefa8a", new Object[0]);
        }
        if (h == null) {
            h = new NetworkDiagnose();
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnose.a():void");
    }

    public void register(Storage storage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e903683", new Object[]{this, storage});
        } else {
            this.f4185a = storage;
        }
    }

    public void register(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74afe47", new Object[]{this, amnetNetworkDiagnoseListener});
        } else {
            this.b = amnetNetworkDiagnoseListener;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x001e, B:9:0x0025, B:14:0x002d, B:16:0x0072, B:17:0x0076, B:19:0x007b, B:21:0x0088, B:22:0x0092, B:24:0x00b1, B:25:0x00bb, B:26:0x00c3), top: B:29:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x001e, B:9:0x0025, B:14:0x002d, B:16:0x0072, B:17:0x0076, B:19:0x007b, B:21:0x0088, B:22:0x0092, B:24:0x00b1, B:25:0x00bb, B:26:0x00c3), top: B:29:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x001e, B:9:0x0025, B:14:0x002d, B:16:0x0072, B:17:0x0076, B:19:0x007b, B:21:0x0088, B:22:0x0092, B:24:0x00b1, B:25:0x00bb, B:26:0x00c3), top: B:29:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void launch() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnose.launch():void");
    }

    public void register(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feebbe9", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        this.f = j;
        this.e = i;
    }
}
