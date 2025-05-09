package tb;

import android.util.Pair;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q9w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f26612a;
    public final prp b;
    public r8e c;
    public FrameLayout.LayoutParams d;
    public final IContainerService e;

    static {
        t2o.a(468714099);
    }

    public q9w(prp prpVar) {
        FluidContext U = prpVar.U();
        this.f26612a = U;
        this.b = prpVar;
        this.e = (IContainerService) U.getService(IContainerService.class);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this});
        }
        return this.b.U().getInstanceConfig().getPreCoverKey();
    }

    public FrameLayout.LayoutParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b1ecf96", new Object[]{this});
        }
        return this.d;
    }

    public r8e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("42367b10", new Object[]{this});
        }
        return this.c;
    }

    public final Pair<Integer, Integer> d(a.d dVar) {
        rv4 b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("71b8bb11", new Object[]{this, dVar});
        }
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf(dVar.P()), Integer.valueOf(dVar.v()));
        if (!((IQuickOpenService) this.f26612a.getService(IQuickOpenService.class)).isUsePreSize() || (b = qv4.c().b(a())) == null) {
            return create;
        }
        int m = b.m();
        int g = b.g();
        tfs.d("AVSDK_TBVideoComponentSharePlayer,onBindData,视频宽：" + m + ",视频高：" + g);
        return new Pair<>(Integer.valueOf(m), Integer.valueOf(g));
    }

    public void f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eba1aa", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        this.d = layoutParams;
        layoutParams.topMargin = i3;
    }

    public void g(String str, boolean z) {
        r8e r8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd29076", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int M = this.b.M();
        a Z = this.b.Z();
        if (M == 0) {
            Pair<Integer, Integer> d = d(Z.e());
            r8eVar = Z.e().K().h(this.f26612a, this.b, ((Integer) d.first).intValue(), ((Integer) d.second).intValue(), z);
        } else {
            r8eVar = Z.e().K().i(this.f26612a, this.b, z);
        }
        h(r8eVar);
        ir9.a("VideoPicSizeManager", "updateVideoCommentSizeObject from" + str + ":" + this.c);
    }

    public void h(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdfda2b", new Object[]{this, r8eVar});
            return;
        }
        this.c = r8eVar;
        int i = r8eVar.k;
        if (i == 0) {
            i = r8eVar.c;
        }
        f(r8eVar.d, i, r8eVar.e);
    }

    public void e() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        ir9.b("VideoPicSizeManager", h9z.EVENT_ON_APPEAR);
        if (((ICardService) this.f26612a.getService(ICardService.class)).getConfig().v()) {
            boolean b = ogi.e().b(a());
            r8e r8eVar = this.c;
            if (r8eVar.k != 0 && !b) {
                r8eVar.e = 0;
                ir9.b("VideoPicSizeManager", "全屏页内部画幅计算，onAppear触发");
                boolean d = f2k.d(this.f26612a);
                int i = this.b.Z().l;
                if (d) {
                    z = i > 0;
                } else {
                    z = this.e.isHighActionbar();
                }
                if (!d) {
                    i = this.e.getWeexActionBarHeight();
                }
                bbw.j(this.b.U(), this.e.getWindowWidth(), this.e.getWindowHeight(), z, i, this.c, false);
            }
        }
    }
}
