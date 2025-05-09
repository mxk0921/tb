package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.PlayControlService;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.context.PlayControlOptimizationStrategy;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.listener.MediaInfoType;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state.PlayControlInstanceState;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state.PlayControlPlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class z5m implements jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PlayControlService f32553a;
    public final List<f9d> b;
    public int c;
    public PlayControlPlayerState d;
    public final d6m e;
    public final List<a6m<j9d>> f;
    public final Map<String, g1a<h9d, xhv>> g;
    public final Map<String, g1a<h9d, xhv>> h;
    public final Map<String, g1a<h9d, xhv>> i;
    public final Map<String, g1a<g9d, xhv>> j;
    public final Map<String, g1a<i9d, xhv>> k;
    public final Map<String, g1a<j9d, xhv>> l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            t2o.a(1004536627);
            int[] iArr = new int[PlayControlOptimizationStrategy.values().length];
            try {
                iArr[PlayControlOptimizationStrategy.PlayerRetryStrategy1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.ContinuePrepare.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.AutoResumeWhenPause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.All.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.None.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.AutoPlayWhenPlayComponentLoaded.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.respawnWhenMeetLiveStreamError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlayControlOptimizationStrategy.respawnWhenMeetLiveStreamCompleted.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlayControlPlayerState.values().length];
            try {
                iArr2[PlayControlPlayerState.Init.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PlayControlPlayerState.Prepared.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PlayControlPlayerState.Play.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PlayControlPlayerState.Resume.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PlayControlPlayerState.Stop.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PlayControlPlayerState.Pause.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PlayControlPlayerState.Pausing.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PlayControlPlayerState.Seek.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PlayControlPlayerState.Completed.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PlayControlPlayerState.Error.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[PlayControlPlayerState.InfoReport.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[PlayControlPlayerState.ProgressReport.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[PlayControlPlayerState.Destroy.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlayControlInstanceState.values().length];
            try {
                iArr3[PlayControlInstanceState.InitPlayerControl.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[PlayControlInstanceState.LoadContext.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[PlayControlInstanceState.PerformUIAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[PlayControlInstanceState.PerformPlayerAction.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[PlayControlInstanceState.ComponentLoaded.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[PlayControlInstanceState.DestroyInstance.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        t2o.a(1004536626);
        t2o.a(1002438710);
    }

    public z5m() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void G(z5m z5mVar, PlayControlInstanceState playControlInstanceState, a6m a6mVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835d88c", new Object[]{z5mVar, playControlInstanceState, a6mVar, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            a6mVar = null;
        }
        z5mVar.F(playControlInstanceState, a6mVar);
    }

    public static /* synthetic */ void K(z5m z5mVar, PlayControlOptimizationStrategy playControlOptimizationStrategy, a6m a6mVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbae8ace", new Object[]{z5mVar, playControlOptimizationStrategy, a6mVar, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            a6mVar = null;
        }
        z5mVar.J(playControlOptimizationStrategy, a6mVar);
    }

    public static final xhv L(PlayControlOptimizationStrategy playControlOptimizationStrategy, a6m a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ec5003ca", new Object[]{playControlOptimizationStrategy, a6mVar});
        }
        ckf.g(playControlOptimizationStrategy, "s");
        return xhv.INSTANCE;
    }

    public static final xhv M(PlayControlOptimizationStrategy playControlOptimizationStrategy, a6m a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d2724129", new Object[]{playControlOptimizationStrategy, a6mVar});
        }
        ckf.g(playControlOptimizationStrategy, "<unused var>");
        return xhv.INSTANCE;
    }

    public static final xhv N(PlayControlOptimizationStrategy playControlOptimizationStrategy, a6m a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b8947e88", new Object[]{playControlOptimizationStrategy, a6mVar});
        }
        ckf.g(playControlOptimizationStrategy, "<unused var>");
        return xhv.INSTANCE;
    }

    public static /* synthetic */ void n(z5m z5mVar, int i, j9d j9dVar, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b205a6", new Object[]{z5mVar, new Integer(i), j9dVar, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            j9dVar = null;
        }
        z5mVar.m(i, j9dVar);
    }

    public static /* synthetic */ void w(z5m z5mVar, a6m a6mVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3fab6e", new Object[]{z5mVar, a6mVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            a6mVar = null;
        }
        z5mVar.i(a6mVar);
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e782f5f4", new Object[]{this});
        } else {
            w(this, null, 1, null);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:play");
        }
        a6m<j9d> a6mVar = new a6m<>();
        a6mVar.c(PlayControlPlayerState.Play);
        F(PlayControlInstanceState.PerformPlayerAction, a6mVar);
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:prepare");
        }
        a6m<j9d> a6mVar = new a6m<>();
        a6mVar.c(PlayControlPlayerState.Prepared);
        F(PlayControlInstanceState.PerformPlayerAction, a6mVar);
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329a6d2b", new Object[]{this});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:prepareAndPlay");
        }
        D();
        C();
    }

    public final void F(PlayControlInstanceState playControlInstanceState, a6m<j9d> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9a4bb5", new Object[]{this, playControlInstanceState, a6mVar});
            return;
        }
        n(this, playControlInstanceState.getState(), null, 2, null);
        int i = a.$EnumSwitchMapping$2[playControlInstanceState.ordinal()];
        if (i == 3) {
            A();
        } else if (i != 4) {
            if (i == 5) {
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    F(PlayControlInstanceState.PerformPlayerAction, (a6m) it.next());
                }
                ((ArrayList) this.f).clear();
            } else if (i == 6 && a6mVar != null) {
                H(a6mVar.b(), a6mVar);
            }
        } else if (a6mVar != null) {
            x(a6mVar);
        }
        this.c = playControlInstanceState.getState() | this.c;
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77eceb05", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean o = o();
        if (z) {
            l();
        }
        O();
        E();
        j(o);
    }

    public final void J(PlayControlOptimizationStrategy playControlOptimizationStrategy, a6m<?> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7e5357", new Object[]{this, playControlOptimizationStrategy, a6mVar});
        } else if (playControlOptimizationStrategy == PlayControlOptimizationStrategy.All || d(playControlOptimizationStrategy)) {
            u1a w5mVar = new u1a() { // from class: tb.w5m
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv L;
                    L = z5m.L((PlayControlOptimizationStrategy) obj, (a6m) obj2);
                    return L;
                }
            };
            u1a x5mVar = new u1a() { // from class: tb.x5m
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv M;
                    M = z5m.M((PlayControlOptimizationStrategy) obj, (a6m) obj2);
                    return M;
                }
            };
            u1a y5mVar = new u1a() { // from class: tb.y5m
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv N;
                    N = z5m.N((PlayControlOptimizationStrategy) obj, (a6m) obj2);
                    return N;
                }
            };
            int i = a.$EnumSwitchMapping$0[playControlOptimizationStrategy.ordinal()];
            if (i == 1) {
                w5mVar.invoke(playControlOptimizationStrategy, a6mVar);
            } else if (i == 2) {
                x5mVar.invoke(playControlOptimizationStrategy, a6mVar);
            } else if (i == 3) {
                y5mVar.invoke(playControlOptimizationStrategy, a6mVar);
            } else if (i == 4) {
                w5mVar.invoke(playControlOptimizationStrategy, a6mVar);
                x5mVar.invoke(playControlOptimizationStrategy, a6mVar);
                y5mVar.invoke(playControlOptimizationStrategy, a6mVar);
            }
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8d71b9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        K(this, PlayControlOptimizationStrategy.All, null, 2, null);
        List<f9d> list = this.b;
        if (list != null) {
            list.clear();
        }
        ((LinkedHashMap) this.g).clear();
        ((LinkedHashMap) this.h).clear();
        ((LinkedHashMap) this.i).clear();
        ((LinkedHashMap) this.j).clear();
        ((LinkedHashMap) this.k).clear();
        ((LinkedHashMap) this.l).clear();
        ((ArrayList) this.f).clear();
        this.f32553a = null;
    }

    public final List<Double> g() {
        double d;
        Integer b;
        Integer c;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e25ee323", new Object[]{this});
        }
        ar7 a2 = nr7.a();
        double d3 = vu3.b.GEO_NOT_SUPPORT;
        double d4 = 1.0d;
        if (a2 == null || (c = a2.c()) == null) {
            d = 0.0d;
        } else {
            double intValue = c.intValue();
            Double a3 = a2.a();
            if (a3 != null) {
                d2 = a3.doubleValue();
            } else {
                d2 = 1.0d;
            }
            d = intValue / d2;
        }
        if (!(a2 == null || (b = a2.b()) == null)) {
            double intValue2 = b.intValue();
            Double a4 = a2.a();
            if (a4 != null) {
                d4 = a4.doubleValue();
            }
            d3 = intValue2 / d4;
        }
        return yz3.l(Double.valueOf(d), Double.valueOf(d3));
    }

    public final List<Double> h(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4d21f834", new Object[]{this, new Double(d), new Double(d2)});
        }
        if (d / d2 > 0.5625d) {
            double d3 = d2 * 0.5625d;
            if (d3 < d) {
                d2 = d / 0.5625d;
            } else {
                d = d3;
            }
        } else {
            double d4 = d / 0.5625d;
            if (d4 < d2) {
                d = d2 * 0.5625d;
            } else {
                d2 = d4;
            }
        }
        return yz3.l(Double.valueOf(d), Double.valueOf(d2));
    }

    public final void i(a6m<?> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6b83f7", new Object[]{this, a6mVar});
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ffc05", new Object[]{this, new Boolean(z)});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:changeMuteState(isMute:" + z + ')');
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:destroy");
        }
        a6m<j9d> a6mVar = new a6m<>();
        a6mVar.c(PlayControlPlayerState.Destroy);
        F(PlayControlInstanceState.DestroyInstance, a6mVar);
    }

    public final void m(int i, j9d j9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff747dc1", new Object[]{this, new Integer(i), j9dVar});
            return;
        }
        List<f9d> list = this.b;
        if (list != null) {
            for (f9d f9dVar : list) {
                f9dVar.e(this, i, this.c, j9dVar);
            }
        }
    }

    public final PlayControlPlayerState q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlPlayerState) ipChange.ipc$dispatch("143778b3", new Object[]{this});
        }
        return this.d;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36df418", new Object[]{this});
            return;
        }
        e();
        IpChange ipChange2 = PlayControlPlayerState.$ipChange;
    }

    public final void x(a6m<j9d> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7896d2e8", new Object[]{this, a6mVar});
        } else if ((this.c & PlayControlInstanceState.ComponentLoaded.getState()) != PlayControlInstanceState.Undefined.getState() || PlayControlPlayerState.Init == a6mVar.b()) {
            H(a6mVar.b(), a6mVar);
        } else {
            ((ArrayList) this.f).add(a6mVar);
        }
    }

    public final void y(a6m<?> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4dd08b", new Object[]{this, a6mVar});
            return;
        }
        PlayControlOptimizationStrategy playControlOptimizationStrategy = PlayControlOptimizationStrategy.respawnWhenMeetLiveStreamCompleted;
        if (d(playControlOptimizationStrategy)) {
            I(true);
            K(this, playControlOptimizationStrategy, null, 2, null);
        }
    }

    public final void z(a6m<?> a6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d19462e", new Object[]{this, a6mVar});
            return;
        }
        PlayControlOptimizationStrategy playControlOptimizationStrategy = PlayControlOptimizationStrategy.respawnWhenMeetLiveStreamError;
        if (d(playControlOptimizationStrategy)) {
            I(true);
            K(this, playControlOptimizationStrategy, null, 2, null);
        }
    }

    public z5m(PlayControlService playControlService, e9d e9dVar, List<f9d> list) {
        this.f32553a = playControlService;
        this.b = list;
        this.c = PlayControlInstanceState.Undefined.getState();
        this.d = PlayControlPlayerState.Undefined;
        this.e = new d6m(false, null, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 15, null);
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('@');
        sb.append(this);
        if (list != null) {
            this.b = list;
        } else {
            this.b = new ArrayList();
        }
        this.c |= PlayControlInstanceState.InitInstance.getState();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:start");
        }
        G(this, PlayControlInstanceState.InitPlayerControl, null, 2, null);
        G(this, PlayControlInstanceState.LoadContext, null, 2, null);
        G(this, PlayControlInstanceState.PerformUIAction, null, 2, null);
        a6m<j9d> a6mVar = new a6m<>();
        a6mVar.c(PlayControlPlayerState.Init);
        F(PlayControlInstanceState.PerformPlayerAction, a6mVar);
        j(true);
    }

    public final boolean d(PlayControlOptimizationStrategy playControlOptimizationStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e0db6a9", new Object[]{this, playControlOptimizationStrategy})).booleanValue();
        }
        ckf.g(playControlOptimizationStrategy, "strategy");
        return false;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f27119e9", new Object[]{this})).booleanValue();
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("尝试执行方法:fetchMuteState(isMute:false)");
        }
        return false;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfdb13fb", new Object[]{this})).booleanValue();
        }
        return true ^ ckf.b(null, "undefined");
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e09352", new Object[]{this});
            return;
        }
        this.e.c(false);
        Object obj = "100%";
        Object obj2 = ckf.b(obj, obj) ? g().get(0) : obj;
        if (ckf.b(obj, obj)) {
            obj = g().get(1);
        }
        ckf.e(obj2, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue = ((Double) obj2).doubleValue();
        ckf.e(obj, "null cannot be cast to non-null type kotlin.Double");
        List<Double> h = h(doubleValue, ((Double) obj).doubleValue());
        double doubleValue2 = h.get(0).doubleValue();
        double doubleValue3 = h.get(1).doubleValue();
        this.e.b(doubleValue2);
        this.e.a(doubleValue3);
    }

    public final void H(PlayControlPlayerState playControlPlayerState, a6m<?> a6mVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2878dd", new Object[]{this, playControlPlayerState, a6mVar});
            return;
        }
        PlayControlService playControlService = this.f32553a;
        if (playControlService != null) {
            playControlService.a("执行Player Intent 开始：{next:" + playControlPlayerState + ",current:" + this.d + '}');
        }
        String str2 = "";
        Integer num = null;
        i9d i9dVar = null;
        switch (a.$EnumSwitchMapping$1[playControlPlayerState.ordinal()]) {
            case 1:
                PlayControlService playControlService2 = this.f32553a;
                if (playControlService2 != null) {
                    playControlService2.a("执行Player Intent ✅(state:Init)");
                }
                s();
                break;
            case 2:
                PlayControlPlayerState playControlPlayerState2 = this.d;
                boolean z = playControlPlayerState2 == PlayControlPlayerState.Init || playControlPlayerState2 == PlayControlPlayerState.PreparedFinished;
                boolean z2 = t() || e();
                if (z && z2) {
                    PlayControlService playControlService3 = this.f32553a;
                    if (playControlService3 != null) {
                        playControlService3.a("执行Player Intent ✅(state:Prepared)");
                        break;
                    }
                } else {
                    PlayControlService playControlService4 = this.f32553a;
                    if (playControlService4 != null) {
                        StringBuilder sb = new StringBuilder("执行Player Intent ❌(state:Prepared) Reason:");
                        if (!z) {
                            str2 = "状态错误:" + this.d;
                        } else if (!z2) {
                            str2 = "非法流地址";
                        }
                        sb.append(str2);
                        playControlService4.a(sb.toString());
                        return;
                    }
                    return;
                }
                break;
            case 3:
            case 4:
                PlayControlPlayerState playControlPlayerState3 = PlayControlPlayerState.Play;
                boolean contains = yz3.l(PlayControlPlayerState.Init, PlayControlPlayerState.Destroy, playControlPlayerState3, PlayControlPlayerState.Resume, PlayControlPlayerState.Playing).contains(this.d);
                boolean z3 = t() || e();
                if (!contains && z3) {
                    PlayControlService playControlService5 = this.f32553a;
                    if (playControlService5 != null) {
                        StringBuilder sb2 = new StringBuilder("执行Player Intent ✅(state:");
                        if (playControlPlayerState == playControlPlayerState3) {
                            str = "Play";
                        } else {
                            str = esu.KEY_RESUME;
                        }
                        sb2.append(str);
                        sb2.append(')');
                        playControlService5.a(sb2.toString());
                    }
                    K(this, PlayControlOptimizationStrategy.ContinuePrepare, null, 2, null);
                    break;
                } else {
                    PlayControlService playControlService6 = this.f32553a;
                    if (playControlService6 != null) {
                        if (contains) {
                            str2 = "状态错误";
                        } else if (!z3) {
                            str2 = "非法流地址";
                        }
                        playControlService6.a("执行Player Intent ❌(state:Prepared) Reason:".concat(str2));
                        return;
                    }
                    return;
                }
                break;
            case 5:
                PlayControlService playControlService7 = this.f32553a;
                if (playControlService7 != null) {
                    playControlService7.a("执行Player Intent ✅(state:Stop|Release)");
                    break;
                }
                break;
            case 6:
                PlayControlService playControlService8 = this.f32553a;
                if (playControlService8 != null) {
                    playControlService8.a("执行Player Intent ✅(state:Pause)");
                    break;
                }
                break;
            case 7:
                PlayControlService playControlService9 = this.f32553a;
                if (playControlService9 != null) {
                    playControlService9.a("执行Player Intent ✅(state:Pausing)");
                    break;
                }
                break;
            case 8:
                if (a6mVar != null) {
                    PlayControlService playControlService10 = this.f32553a;
                    if (playControlService10 != null) {
                        playControlService10.a("执行Player Intent ✅(state:Seek)");
                        return;
                    }
                    return;
                }
                break;
            case 9:
                PlayControlService playControlService11 = this.f32553a;
                if (playControlService11 != null) {
                    playControlService11.a("执行Player Intent ✅(state:Completed)");
                }
                List<f9d> list = this.b;
                if (list != null) {
                    for (f9d f9dVar : list) {
                        f9dVar.a(a6mVar != null ? a6mVar.a() : null);
                    }
                }
                for (g1a g1aVar : ((LinkedHashMap) this.l).values()) {
                    g1aVar.invoke(a6mVar != null ? a6mVar.a() : null);
                }
                y(a6mVar);
                break;
            case 10:
                PlayControlService playControlService12 = this.f32553a;
                if (playControlService12 != null) {
                    playControlService12.a("执行Player Intent ✅(state:Error)");
                }
                List<f9d> list2 = this.b;
                if (list2 != null) {
                    for (f9d f9dVar2 : list2) {
                        f9dVar2.c(a6mVar != null ? a6mVar.a() : null);
                    }
                }
                for (g1a g1aVar2 : ((LinkedHashMap) this.j).values()) {
                    j9d a2 = a6mVar != null ? a6mVar.a() : null;
                    ckf.e(a2, "null cannot be cast to non-null type com.taobao.kmp.nexus.arch.openArch.service.playcontrol.listener.IPlayControlListenerFailureResult");
                    g1aVar2.invoke((g9d) a2);
                }
                z(a6mVar);
                break;
            case 11:
                j9d a3 = a6mVar != null ? a6mVar.a() : null;
                h9d h9dVar = a3 instanceof h9d ? (h9d) a3 : null;
                if (h9dVar != null) {
                    num = Integer.valueOf(h9dVar.a());
                }
                int code = MediaInfoType.MEDIA_INFO_VIDEO_RENDERING_START.getCode();
                if (num != null && num.intValue() == code) {
                    PlayControlService playControlService13 = this.f32553a;
                    if (playControlService13 != null) {
                        playControlService13.a("执行Player Intent ✅(state:InfoReport| onFirstFrameRendered)");
                    }
                    List<f9d> list3 = this.b;
                    if (list3 != null) {
                        for (f9d f9dVar3 : list3) {
                            f9dVar3.f(h9dVar);
                        }
                    }
                    for (g1a g1aVar3 : ((LinkedHashMap) this.g).values()) {
                        g1aVar3.invoke(h9dVar);
                    }
                    break;
                } else {
                    int code2 = MediaInfoType.MEDIA_INFO_BUFFERING_START.getCode();
                    if (num != null && num.intValue() == code2) {
                        PlayControlService playControlService14 = this.f32553a;
                        if (playControlService14 != null) {
                            playControlService14.a("执行Player Intent ✅(state:InfoReport| onStalledMeet)");
                        }
                        List<f9d> list4 = this.b;
                        if (list4 != null) {
                            for (f9d f9dVar4 : list4) {
                                f9dVar4.d(h9dVar);
                            }
                        }
                        for (g1a g1aVar4 : ((LinkedHashMap) this.h).values()) {
                            g1aVar4.invoke(h9dVar);
                        }
                        break;
                    } else {
                        int code3 = MediaInfoType.MEDIA_INFO_BUFFERING_END.getCode();
                        if (num != null && num.intValue() == code3) {
                            PlayControlService playControlService15 = this.f32553a;
                            if (playControlService15 != null) {
                                playControlService15.a("执行Player Intent ✅(state:InfoReport| onStalledResolved)");
                            }
                            List<f9d> list5 = this.b;
                            if (list5 != null) {
                                for (f9d f9dVar5 : list5) {
                                    f9dVar5.g(h9dVar);
                                }
                            }
                            for (g1a g1aVar5 : ((LinkedHashMap) this.i).values()) {
                                g1aVar5.invoke(h9dVar);
                            }
                            break;
                        }
                    }
                }
                break;
            case 12:
                j9d a4 = a6mVar != null ? a6mVar.a() : null;
                if (a4 instanceof i9d) {
                    i9dVar = (i9d) a4;
                }
                if (i9dVar != null) {
                    List<f9d> list6 = this.b;
                    if (list6 != null) {
                        for (f9d f9dVar6 : list6) {
                            f9dVar6.b(i9dVar);
                        }
                    }
                    for (g1a g1aVar6 : ((LinkedHashMap) this.k).values()) {
                        g1aVar6.invoke(i9dVar);
                    }
                    break;
                }
                break;
            case 13:
                PlayControlService playControlService16 = this.f32553a;
                if (playControlService16 != null) {
                    playControlService16.a("执行Player Intent ✅(state:Destroy|destroy+release)");
                }
                K(this, PlayControlOptimizationStrategy.All, null, 2, null);
                break;
        }
        if (yz3.l(PlayControlPlayerState.Destroy, PlayControlPlayerState.Init, PlayControlPlayerState.Prepared, PlayControlPlayerState.Play, PlayControlPlayerState.Stop, PlayControlPlayerState.Pause, PlayControlPlayerState.Resume, PlayControlPlayerState.Error, PlayControlPlayerState.Playing, PlayControlPlayerState.PreparedFinished, PlayControlPlayerState.Pausing, PlayControlPlayerState.Completed, PlayControlPlayerState.LoopCompleted).contains(playControlPlayerState)) {
            this.d = playControlPlayerState;
        }
    }

    public /* synthetic */ z5m(PlayControlService playControlService, e9d e9dVar, List list, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : playControlService, (i & 2) != 0 ? null : e9dVar, (i & 4) != 0 ? null : list);
    }
}
