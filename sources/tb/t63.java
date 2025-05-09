package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.taobao.R;
import tb.l53;
import tb.rke;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class t63 extends d32<s63, yr3, CaptureManager> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public oaj l;
    public ViewGroup m;

    static {
        t2o.a(730857555);
        t2o.a(481296507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t63(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
    }

    public static /* synthetic */ Object ipc$super(t63 t63Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -3136315) {
            super.K();
            return null;
        } else if (hashCode == 1876185637) {
            super.G(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/biz/CapturePaiViewV2");
        }
    }

    @Override // tb.d32
    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i)});
            return;
        }
        super.G(i);
        if (i == 1 || i == 2) {
            oaj oajVar = this.l;
            if (oajVar != null && oajVar.e()) {
                oajVar.c();
            }
            s63 s63Var = (s63) this.f17536a;
            if (s63Var != null) {
                s63Var.R(i);
            }
        }
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View findViewById = this.c.findViewById(R.id.root_layout);
        ckf.f(findViewById, "activity.findViewById(R.id.root_layout)");
        S((ViewGroup) findViewById);
    }

    /* renamed from: N */
    public s63 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s63) ipChange.ipc$dispatch("8882ca64", new Object[]{this});
        }
        return new s63();
    }

    public final ViewGroup O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            return viewGroup;
        }
        ckf.y("rootView");
        throw null;
    }

    public final Rect P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("29d992f1", new Object[]{this});
        }
        return new Rect(0, 0, O().getWidth(), O().getHeight());
    }

    public final void Q(wro wroVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f927ca9", new Object[]{this, wroVar});
            return;
        }
        ckf.g(wroVar, "scanCodeFoundEvent");
        oaj oajVar = this.l;
        if (oajVar == null) {
            xhvVar = null;
        } else {
            oajVar.f(p73.f25916a, wroVar);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            oaj oajVar2 = new oaj(this.c);
            this.l = oajVar2;
            oajVar2.f(p73.f25916a, wroVar);
        }
    }

    public final void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397f7446", new Object[]{this, new Boolean(z)});
            return;
        }
        Object obj = this.b;
        if (obj instanceof t73) {
            ((t73) obj).y0(z);
        }
    }

    public final void S(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "<set-?>");
        this.m = viewGroup;
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25c32b2", new Object[]{this});
        } else if (lg4.u4()) {
            rke.a aVar = rke.Companion;
            CaptureManager m = m();
            ckf.f(m, ThemisConfig.SCENE_MANAGER);
            TipShowMsg tipShowMsg = new TipShowMsg(aVar.c(m), 0L, l53.b.SCENE_AUTO_DETECT, TipShowMsg.TipShowType.TEXT_TYPE);
            if (m().B() != null) {
                m().B().t(tipShowMsg);
            }
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            m().f0((hdd) this.f17536a);
            m().s0((qlb) this.f17536a);
            T();
        } else {
            m().F0((hdd) this.f17536a);
        }
        s63 s63Var = (s63) this.f17536a;
        if (s63Var != null) {
            s63Var.a0(z);
        }
    }

    @Override // tb.hjb
    public void i(MusOuterAlbumBean musOuterAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "outerAlbumBean");
        s63 s63Var = (s63) this.f17536a;
        if (s63Var != null) {
            s63Var.T(musOuterAlbumBean);
        }
    }

    @Override // tb.hjb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aeec19", new Object[]{this});
        } else {
            T();
        }
    }

    @Override // tb.hjb
    public void u(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2404a526", new Object[]{this, peiVar, new Boolean(z)});
            return;
        }
        s63 s63Var = (s63) this.f17536a;
        if (s63Var != null) {
            s63Var.Q(peiVar, z);
        }
    }
}
