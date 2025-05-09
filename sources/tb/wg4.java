package tb;

import android.content.Context;
import com.alibaba.ut.abtest.UTABMethod;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wg4 implements ug4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30676a = false;
    public UTABMethod b = UTABMethod.Pull;
    public final Set<String> c = S();
    public final Object d = new Object();

    static {
        t2o.a(961544295);
        t2o.a(961544294);
    }

    @Override // tb.ug4
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c3de61a", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().f();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isAccsBetaEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb3d191", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().E()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isStabilityMonitorEnabled", th);
            return false;
        }
    }

    @Override // tb.ug4
    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d925e6", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().Q()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isUtPageLifecycleListenerEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8f04683", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().A();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isPreDecisionEnable", th);
            return false;
        }
    }

    @Override // tb.ug4
    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8667d462", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().P();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isUrlPrefixTrackEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26594523", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().G();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isSwitchVariationEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ade509f3", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().w()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isNavEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142fc4a", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().l();
        } catch (Throwable th) {
            ogh.h("ConfigServiceImpl", th.getMessage(), th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37979f", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().j();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isClearRetainBeforeRefresh", th);
            return true;
        }
    }

    @Override // tb.ug4
    public long J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c04cd", new Object[]{this})).longValue();
        }
        try {
            return f9l.c().d();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.getRequestExperimentDataIntervalTime", th);
            return m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        }
    }

    @Override // tb.ug4
    public boolean K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f41c38f3", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            return f9l.c().N(String.valueOf(j));
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isUnDecodeUrlParamExp", th);
            return false;
        }
    }

    @Override // tb.ug4
    public void L(UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38e180b", new Object[]{this, uTABMethod});
        } else {
            this.b = uTABMethod;
        }
    }

    @Override // tb.ug4
    public boolean M(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790a7063", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return f9l.c().I(l);
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrack1022ExperimentDisabled", th);
            return false;
        }
    }

    @Override // tb.ug4
    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c329f0f", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().y();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isParamRegexMatchEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf826886", new Object[]{this})).longValue();
        }
        try {
            return f9l.c().b();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.getDownloadExperimentDataDelayTime", th);
            return 60000L;
        }
    }

    @Override // tb.ug4
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80451bfc", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().O();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isUrlParseErrorToDp2", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb54172", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().u();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isLazyLoadEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf99b052", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().n();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isDbHitCountEnable", th);
            return true;
        }
    }

    public final Set<String> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bc7a4c82", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("http://m.taobao.com/channel/act/other/taobao_android");
        hashSet.add("http://m.taobao.com/index.htm");
        hashSet.add(MessageNavProcessorV2.ROUTE_URL_MESSAGETAB);
        hashSet.add("http://h5.m.taobao.com/we/index.htm");
        hashSet.add("http://h5.m.taobao.com/awp/base/newcart.htm");
        hashSet.add("http://h5.m.taobao.com/awp/mtb/mtb.htm");
        return hashSet;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ded1b0", new Object[]{this})).booleanValue();
        }
        return this.f30676a;
    }

    @Override // tb.ug4
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2578988", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().m()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isDataTriggerEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("900948ba", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().B();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isPreloadLaunchExperiment", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a681be39", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().h();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isAccsWhitelistEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6e7780", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().C();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isRetainExperimentEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e456ed9c", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().M()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrackAutoEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a00102c", new Object[]{this, context});
        } else {
            f9l.c().V(context);
        }
    }

    @Override // tb.ug4
    public boolean g(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd638ee5", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return f9l.c().K(l);
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrack1022GroupDisabled", th);
            return false;
        }
    }

    @Override // tb.ug4
    public UTABMethod getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("13ea5d19", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ug4
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb701e10", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().i();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isParseDbConfigWhenUsing", th);
            return false;
        }
    }

    @Override // tb.ug4
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6430be8e", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().v();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isMtopIndexEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76627e81", new Object[]{this})).longValue();
        }
        try {
            return f9l.c().e();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.getTrack1022IntervalTime", th);
            return m.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
    }

    @Override // tb.ug4
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c42b0e", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().H()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrack1022Enable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb965f9a", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().o();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isDropOnInsertFail", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d1b37da", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().r()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isEvoActivateClientEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68aab0c", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().L()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrackAppEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d33a1c9c", new Object[]{this})).intValue();
        }
        try {
            return f9l.c().a();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.getActivatePageTrackHistorySize", th);
            return 10;
        }
    }

    @Override // tb.ug4
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("587741bb", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().F();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isSupportVariationConfig", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843120e7", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().k();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isClodWorkEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abc74ce", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.d) {
            try {
                if (this.c.contains(str)) {
                    return true;
                }
                try {
                    return f9l.c().x(str);
                } catch (Throwable th) {
                    ku0.j("ConfigServiceImpl.isNavIgnored", th);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tb.ug4
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44423c49", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().g();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isAccsGreyEnable", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean t(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8651ace", new Object[]{this, l})).booleanValue();
        }
        if (l == null) {
            return false;
        }
        try {
            return f9l.c().J(l);
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isTrack1022ExperimentEnabled", th);
            return false;
        }
    }

    @Override // tb.ug4
    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1397be70", new Object[]{this, new Boolean(z)});
        } else {
            this.f30676a = z;
        }
    }

    @Override // tb.ug4
    public void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ca1d6f", new Object[]{this, context});
        } else {
            f9l.c().X(context);
        }
    }

    @Override // tb.ug4
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e20f27c", new Object[]{this})).booleanValue();
        }
        if (T()) {
            return false;
        }
        try {
            return f9l.c().p();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isSdkEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("641e174c", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().z();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isParseDbConfigWhenUsing", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f32ea162", new Object[]{this})).booleanValue();
        }
        try {
            if (!w()) {
                return false;
            }
            if (f9l.c().s()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isEvoActivateServerEnabled", th);
            return true;
        }
    }

    @Override // tb.ug4
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95bc079c", new Object[]{this})).booleanValue();
        }
        try {
            return f9l.c().D();
        } catch (Throwable th) {
            ku0.j("ConfigServiceImpl.isRollbackLastFix", th);
            return false;
        }
    }
}
