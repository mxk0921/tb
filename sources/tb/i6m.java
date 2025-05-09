package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import java.util.List;
import tb.l8p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i6m implements d0c, wlb, l8p.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PLAY_RATE = "1.00";
    public static final String DOUBLE_SPEED_PLAY_RATE = "2.00";
    private static final String h = "PlayRateManager";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f21128a;
    private final prp b;
    public j6m c;
    public boolean d = false;
    public String e = DEFAULT_PLAY_RATE;
    private boolean f = false;
    private int g = 0;

    static {
        t2o.a(468714090);
        t2o.a(468713944);
        t2o.a(468713934);
        t2o.a(468714015);
    }

    public i6m(prp prpVar) {
        this.f21128a = prpVar.U();
        this.b = prpVar;
        v();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
            return;
        }
        this.b.N().addCardLifecycleListener(this);
        this.b.O().b(this);
        this.b.y1().S(this);
    }

    @Override // tb.d0c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
        } else if (m() && this.f) {
            ((IMediaService) this.f21128a.getService(IMediaService.class)).getConfig().h(false);
            F(this.e, false);
            if (this.c == null) {
                this.c = new j6m(this.b.U(), (ViewGroup) this.b.W());
            }
            this.c.a();
            this.f = false;
            x(false);
            this.b.V().S(true);
        }
    }

    @Override // tb.d0c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
        }
    }

    @Override // tb.d0c
    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // tb.d0c
    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // tb.d0c
    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // tb.l8p.c
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a203f3e", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        j6m j6mVar = this.c;
        if (j6mVar != null && j6mVar.b()) {
            this.c.c(i);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713129e2", new Object[]{this})).booleanValue();
        }
        return ((IDataService) this.f21128a.getService(IDataService.class)).getConfig().h();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aeabad8f", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        }
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        }
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else {
            F(DEFAULT_PLAY_RATE, true);
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601d94dd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        if (z) {
            this.b.y1().A0(true);
        } else {
            this.b.y1().A0(false);
        }
    }

    public void F(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83452ced", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            this.e = str;
        }
        float r = nwv.r(str, 1);
        prp prpVar = this.b;
        s19.d(prpVar, "rate" + r);
        this.b.n1().setPlayRate(r);
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }

    @Override // tb.d0c
    public boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ir9.b(h, "倍速播放,ShortVideoCard onLongClick():" + z);
        if (!m() || !z || !this.b.n1().isPlaying()) {
            xau.z(this.b.U(), false);
            return false;
        }
        yre.c(this.f21128a, "4", null, String.valueOf(this.b.M()), null, null);
        this.f = true;
        x(true);
        ((IMediaService) this.f21128a.getService(IMediaService.class)).getConfig().h(true);
        F(DOUBLE_SPEED_PLAY_RATE, false);
        if (this.c == null) {
            this.c = new j6m(this.b.U(), (ViewGroup) this.b.W());
        }
        this.c.c(this.g);
        this.b.V().S(false);
        xau.z(this.b.U(), true);
        return true;
    }
}
