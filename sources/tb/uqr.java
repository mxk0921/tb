package tb;

import android.content.Context;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.monitor.QualityChangeFilter;
import anetwork.channel.monitor.Monitor;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29565a;
    public static boolean b;
    public static boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends QualityChangeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/TBNetwork4Phenix$2");
        }

        @Override // anet.channel.monitor.QualityChangeFilter
        public boolean detectNetSpeedSlow(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("75eecd4d", new Object[]{this, new Double(d)})).booleanValue();
            }
            if (d <= 30.0d) {
                return true;
            }
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57141658", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("462d4a7a", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b0ec8", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb23e56", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b81709", new Object[]{context});
            return;
        }
        try {
            s0m.B().z().b(new h5j(context));
            f29565a = true;
            fiv.f("TBNetwork4Phenix", "http loader setup", new Object[0]);
        } catch (RuntimeException e) {
            fiv.c("TBNetwork4Phenix", "http loader setup error=%s", e);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54a28ef", new Object[0]);
        } else if (f29565a) {
            Monitor.addListener(new a(), new b());
            fiv.f("TBNetwork4Phenix", "network quality monitor setup", new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements INetworkQualityChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.monitor.INetworkQualityChangeListener
        public void onNetworkQualityChanged(NetworkSpeed networkSpeed) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6565bb89", new Object[]{this, networkSpeed});
                return;
            }
            fiv.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed detect: %K/s", Integer.valueOf((int) (Monitor.getNetSpeedValue() * 1024.0d)));
            ouo a2 = s0m.B().j0().a();
            if (a2 instanceof buj) {
                buj bujVar = (buj) a2;
                if (networkSpeed != NetworkSpeed.Slow) {
                    z = false;
                }
                bujVar.d(z);
            }
        }
    }
}
