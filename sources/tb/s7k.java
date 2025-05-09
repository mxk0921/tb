package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.service.redpoint.RedpointService;
import com.taobao.android.turbo.service.redpoint.tabicon.TabIconDisplayManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.f2e;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class s7k extends t12 implements jfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TabIconDisplayManager c;
    public final a d = new a(Looper.getMainLooper());
    public final HashMap<String, Object> e = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements d7d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RedpointModel f = s7k.this.f();
                if (f != null) {
                    s7k.k(s7k.this).M(f, s7k.this);
                }
            }
        }

        public b() {
        }

        @Override // tb.d7d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abdb378c", new Object[]{this});
            } else {
                zrt.Companion.d(new a(), 100L);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                s7k.this.h(null);
            }
        }
    }

    static {
        t2o.a(916455628);
        t2o.a(916455623);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7k(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "context");
        this.c = new TabIconDisplayManager(qpuVar);
    }

    public static /* synthetic */ Object ipc$super(s7k s7kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/NormalTabIconManager");
    }

    public static final /* synthetic */ TabIconDisplayManager k(s7k s7kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabIconDisplayManager) ipChange.ipc$dispatch("c82c7649", new Object[]{s7kVar});
        }
        return s7kVar.c;
    }

    public static /* synthetic */ void s(s7k s7kVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a81cab", new Object[]{s7kVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        s7kVar.r(z);
    }

    @Override // tb.jfe
    public void a(RedpointModel redpointModel, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8add326", new Object[]{this, redpointModel, str, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(redpointModel, "redpoint");
        ckf.g(str, "displayState");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, RedpointService.TAG, "onRotationUpdate, displayState: " + str + ", iconIndex: " + i + ", currentLoopCount: " + i2, null, 4, null);
    }

    @Override // tb.jfe
    public void b(RedpointModel redpointModel, boolean z, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb828aa", new Object[]{this, redpointModel, new Boolean(z), map});
            return;
        }
        ckf.g(redpointModel, "redpoint");
        ckf.g(map, "outInfo");
        if (z) {
            j(redpointModel);
            m(redpointModel);
        } else {
            u(redpointModel);
        }
        if (!z) {
            redpointModel = null;
        }
        g(redpointModel);
    }

    @Override // tb.t12
    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66c4d118", new Object[]{this});
        }
        return this.e;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.W();
        s(this, false, 1, null);
    }

    public final void m(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bad95c2", new Object[]{this, redpointModel});
            return;
        }
        this.d.removeMessages(1);
        this.d.sendEmptyMessageDelayed(1, redpointModel.getLightDuration());
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c.G();
        ((b7d) c().getService(b7d.class)).g1(new b());
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c902cd", new Object[]{this})).booleanValue();
        }
        return ((tjb) c().getService(tjb.class)).B0();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        i();
        s(this, false, 1, null);
        this.e.clear();
    }

    public final void t(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efd0f07", new Object[]{this, redpointModel});
            return;
        }
        v(redpointModel);
        w(redpointModel);
        this.c.M(redpointModel, this);
    }

    public final void u(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9448ce1", new Object[]{this, redpointModel});
            return;
        }
        f2e f2eVar = (f2e) c().getService(f2e.class);
        f2e.a.c(f2eVar, "Page_GuangGuang", "FilterLTV", v3i.f(jpu.a("args", v3i.f(jpu.a("redpoint", redpointModel)))), "a2141.1", "tabbar.filterltv", false, 32, null);
        f2e.a.b(f2eVar, "Page_GuangGuang", "FilterLTV", null, null, v3i.f(jpu.a("args", v3i.f(jpu.a("redpoint", redpointModel)))), 19999, false, 64, null);
    }

    public final void w(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4b7e14", new Object[]{this, redpointModel});
        } else if (ckf.b(redpointModel.getPicMode(), "badge")) {
            String x1 = ((did) c().getService(did.class)).x1();
            int hashCode = x1.hashCode();
            if (hashCode != 3322092) {
                if (hashCode == 112202875 && x1.equals("video")) {
                    redpointModel.setTabbarItemTitle("视频");
                    return;
                }
            } else if (x1.equals("live")) {
                redpointModel.setTabbarItemTitle("直播");
                return;
            }
            redpointModel.setTabbarItemTitle("逛逛");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/NormalTabIconManager$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            if (message.what == 1) {
                s7k.s(s7k.this, false, 1, null);
            }
        }
    }

    public final void n(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cabe3c", new Object[]{this, redpointModel});
            return;
        }
        ckf.g(redpointModel, "redpoint");
        h(redpointModel);
        this.e.clear();
        if (redpointModel.isIconMode()) {
            t2c t2cVar = (t2c) c().getService(t2c.class);
            if ((!t2cVar.t().c() || !ckf.b("badge", redpointModel.getPicMode())) && !t2cVar.J1()) {
                t(redpointModel);
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, RedpointService.TAG, "do not show Icon, picMode: " + redpointModel.getPicMode() + ", elderVersion " + t2cVar.J1() + ", festivalOn " + t2cVar.J1(), null, 4, null);
            return;
        }
        if (redpointModel.getUtParams() != null) {
            HashMap<String, Object> hashMap = this.e;
            Map<String, String> utParams = redpointModel.getUtParams();
            ckf.d(utParams);
            hashMap.putAll(utParams);
        }
        s(this, false, 1, null);
    }

    public final void r(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1d3727", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean I = this.c.I();
        if (!p() && (I || !z)) {
            g(null);
        }
        if (f() == null) {
            z2 = false;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, RedpointService.TAG, "resetTab, hasRedpoint: " + z2 + ", ltvSwitch: " + z, null, 4, null);
        if (z2) {
            zrt.Companion.b(new c());
        }
    }

    public final void v(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3743ed7c", new Object[]{this, redpointModel});
        } else {
            f2e.a.c((f2e) c().getService(f2e.class), "Page_GuangGuang", "TryTabGif", v3i.f(jpu.a("args", kotlin.collections.a.j(jpu.a("guangguangCreated", Boolean.valueOf(((b7d) c().getService(b7d.class)).getPageState() != -1)), jpu.a("redpoint", redpointModel)))), "a2141.1", "tabbar.trytabgif", false, 32, null);
        }
    }
}
