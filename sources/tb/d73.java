package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d73 extends d32<b73, yr3, CaptureManager> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CaptureScanPresenterV2";
    public ViewGroup l;
    public oaj m;
    public final String n = lg4.w3(m().M());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857565);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(730857564);
        t2o.a(481296507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d73(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
    }

    public static /* synthetic */ Object ipc$super(d73 d73Var, String str, Object... objArr) {
        if (str.hashCode() == -3136315) {
            super.K();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureScanViewV2");
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
        R((ViewGroup) findViewById);
    }

    /* renamed from: N */
    public b73 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b73) ipChange.ipc$dispatch("430d2eff", new Object[]{this});
        }
        return new b73();
    }

    public final ViewGroup O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        ViewGroup viewGroup = this.l;
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
        if (wroVar.d() != null && wroVar.c() != null) {
            agh.h("CaptureScanPresenterV2", "showMultiScanCodes");
            oaj oajVar = this.m;
            if (oajVar == null) {
                xhvVar = null;
            } else {
                oajVar.f(p73.f25916a, wroVar);
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                oaj oajVar2 = new oaj(this.c);
                oajVar2.f(p73.f25916a, wroVar);
                this.m = oajVar2;
            }
        }
    }

    public final void R(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "<set-?>");
        this.l = viewGroup;
    }

    public final void S() {
        p3e B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57376ddc", new Object[]{this});
            return;
        }
        TipShowMsg tipShowMsg = new TipShowMsg(this.n, 0L, "scan", TipShowMsg.TipShowType.TEXT_TYPE);
        CaptureManager m = m();
        if (m != null && (B = m.B()) != null) {
            B.t(tipShowMsg);
        }
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            S();
            m().f0((hdd) this.f17536a);
            if (m().r() > 0) {
                m().s0((qlb) this.f17536a);
            }
        } else {
            m().F0((hdd) this.f17536a);
        }
        b73 b73Var = (b73) this.f17536a;
        if (b73Var != null) {
            b73Var.O(z);
        }
    }

    @Override // tb.hjb
    public void i(MusOuterAlbumBean musOuterAlbumBean) {
        b73 b73Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "outerAlbumBean");
        if (!TextUtils.isEmpty(musOuterAlbumBean.getImgKey()) && (b73Var = (b73) this.f17536a) != null) {
            b73Var.K(musOuterAlbumBean);
        }
    }

    @Override // tb.hjb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aeec19", new Object[]{this});
        } else {
            S();
        }
    }

    @Override // tb.hjb
    public void u(pei peiVar, boolean z) {
        b73 b73Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2404a526", new Object[]{this, peiVar, new Boolean(z)});
        } else if (peiVar != null && (b73Var = (b73) this.f17536a) != null) {
            b73Var.G(peiVar, z);
        }
    }
}
