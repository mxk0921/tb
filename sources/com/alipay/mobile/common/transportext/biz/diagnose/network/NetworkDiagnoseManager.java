package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Traceroute;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkDiagnoseManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> h = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Configuration.DetectInf[] f4186a;
    public final Traceroute.PingInf[] b;
    public AmnetNetworkDiagnoseListener c = null;
    public DiagnoseStateManager d = null;
    public ResultCount e = null;
    public int f = 0;
    public long g = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DiagnoseStateManagerImpl implements DiagnoseStateManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DiagnoseStateManagerImpl() {
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void notify(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b32c451a", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void report(boolean z, boolean z2, boolean z3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
                return;
            }
            if (1 == NetworkDiagnoseManager.access$300(NetworkDiagnoseManager.this)) {
                String str2 = (String) NetworkDiagnoseManager.access$400().get(String.valueOf(NetworkDiagnoseManager.access$300(NetworkDiagnoseManager.this)));
                if (TextUtils.isEmpty(str2) || !str2.equals(String.valueOf(NetworkDiagnoseManager.access$500(NetworkDiagnoseManager.this)))) {
                    LogCatUtil.warn("DIAGNOSE-MANAGER", "not the same diagnose, ignose result.");
                    return;
                }
            }
            if (NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this) != null) {
                NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this).report(z, z2, z3, str);
            }
            if (NetworkDiagnoseManager.access$700(NetworkDiagnoseManager.this) != null) {
                NetworkDiagnoseManager.access$700(NetworkDiagnoseManager.this).addCount();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ResultCount {
        void addCount();

        void addTotal();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ResultCountImpl implements ResultCount {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f4187a;
        public int b;

        public ResultCountImpl() {
            this.f4187a = 0;
            this.b = 0;
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.ResultCount
        public void addCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48478275", new Object[]{this});
                return;
            }
            synchronized (this) {
                try {
                    int i = this.b + 1;
                    this.b = i;
                    if (i >= this.f4187a && NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this) != null) {
                        NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this).report(true, false, true, "");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.ResultCount
        public void addTotal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d54cea2a", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.f4187a++;
            }
        }
    }

    public NetworkDiagnoseManager(Configuration.DetectInf[] detectInfArr, Traceroute.PingInf[] pingInfArr) {
        this.f4186a = detectInfArr;
        this.b = pingInfArr;
    }

    public static /* synthetic */ Configuration.DetectInf[] access$200(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration.DetectInf[]) ipChange.ipc$dispatch("7a305beb", new Object[]{networkDiagnoseManager});
        }
        return networkDiagnoseManager.f4186a;
    }

    public static /* synthetic */ int access$300(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0364c", new Object[]{networkDiagnoseManager})).intValue();
        }
        return networkDiagnoseManager.f;
    }

    public static /* synthetic */ Map access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb521370", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ long access$500(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b91ec8b", new Object[]{networkDiagnoseManager})).longValue();
        }
        return networkDiagnoseManager.g;
    }

    public static /* synthetic */ AmnetNetworkDiagnoseListener access$600(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetNetworkDiagnoseListener) ipChange.ipc$dispatch("3a2a72d7", new Object[]{networkDiagnoseManager});
        }
        return networkDiagnoseManager.c;
    }

    public static /* synthetic */ ResultCount access$700(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultCount) ipChange.ipc$dispatch("c96f572a", new Object[]{networkDiagnoseManager});
        }
        return networkDiagnoseManager.e;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Configuration.DetectInf[] detectInfArr = this.f4186a;
        if (detectInfArr == null || detectInfArr.length < 1) {
            LogCatUtil.warn("DIAGNOSE-MANAGER", "detectInfs is null.");
            return;
        }
        int length = detectInfArr.length;
        for (final int i = 0; i < length; i++) {
            if (this.f4186a[i] != null) {
                this.e.addTotal();
                final SpeedTestManager speedTestManager = new SpeedTestManager();
                speedTestManager.register(this.e);
                speedTestManager.register(this.d);
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            speedTestManager.diagnose(NetworkDiagnoseManager.access$200(NetworkDiagnoseManager.this)[i]);
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void register(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74afe47", new Object[]{this, amnetNetworkDiagnoseListener});
        } else {
            this.c = amnetNetworkDiagnoseListener;
        }
    }

    public void start() {
        Traceroute.PingInf[] pingInfArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.e = new ResultCountImpl();
        this.d = new DiagnoseStateManagerImpl();
        Configuration.DetectInf[] detectInfArr = this.f4186a;
        if ((detectInfArr == null || detectInfArr.length < 1) && ((pingInfArr = this.b) == null || pingInfArr.length < 1)) {
            AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener = this.c;
            if (amnetNetworkDiagnoseListener != null) {
                amnetNetworkDiagnoseListener.report(true, false, true, "");
            }
            LogCatUtil.warn("DIAGNOSE-MANAGER", "all input is null");
            return;
        }
        a();
        b();
    }

    public void register(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fee4b4b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        this.f = i;
        this.g = j;
        ((HashMap) h).put(String.valueOf(i), String.valueOf(j));
    }
}
