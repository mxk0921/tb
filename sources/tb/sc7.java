package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.nar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sc7 extends kd7<tc7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout h;
    public TUrlImageView i;
    public tc7 j;
    public nar k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements xtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262360);
            t2o.a(452985008);
        }

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            }
        }

        public void b(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (sc7.w(sc7.this) != null && sc7.w(sc7.this).o() != null) {
                sc7.x(sc7.this).removeView(sc7.w(sc7.this).o());
                sc7.w(sc7.this).n();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730d4d01", new Object[]{this});
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(912262358);
    }

    public sc7(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(sc7 sc7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/DescGifViewHolder");
    }

    public static /* synthetic */ nar w(sc7 sc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nar) ipChange.ipc$dispatch("2505a425", new Object[]{sc7Var});
        }
        return sc7Var.k;
    }

    public static /* synthetic */ FrameLayout x(sc7 sc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f837c034", new Object[]{sc7Var});
        }
        return sc7Var.h;
    }

    public final HashMap<String, String> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c950822e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = this.j.p;
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                Object obj = this.j.p.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: C */
    public View j(tc7 tc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc9c7e3", new Object[]{this, tc7Var});
        }
        if (tc7Var == null) {
            return null;
        }
        this.j = tc7Var;
        this.h = (FrameLayout) LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_main_gif, (ViewGroup) null);
        TUrlImageView tUrlImageView = (TUrlImageView) this.h.findViewById(R.id.detail_gif_image);
        this.i = tUrlImageView;
        tUrlImageView.setPlaceHoldImageResId(R.drawable.tt_detail_img_load_fail);
        this.i.setSkipAutoSize(false);
        this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i.getLayoutParams().height = (int) ((tc7Var.n / ((tc7) this.g).o) * mr7.f(this.f22590a));
        this.i.getLayoutParams().width = mr7.f(this.f22590a);
        this.i.setImageUrl(tc7Var.k);
        z();
        y();
        this.k.x();
        return this.h;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7990005d", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.h = null;
        }
    }

    /* renamed from: e */
    public void h(tc7 tc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab9256f", new Object[]{this, tc7Var});
        }
    }

    /* renamed from: k */
    public boolean m(tc7 tc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e4c6bf3", new Object[]{this, tc7Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        nar narVar = this.k;
        if (!(narVar == null || narVar.o() == null)) {
            this.k.j();
            this.h.removeView(this.k.o());
            this.k.n();
        }
        E();
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        nar narVar = this.k;
        if (narVar != null) {
            narVar.t();
        }
    }

    @Override // tb.kd7
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33893726", new Object[]{this});
            return;
        }
        View o = this.k.o();
        if (o.getParent() != null) {
            ((ViewGroup) o).removeView(o);
        }
        this.h.addView(o, new FrameLayout.LayoutParams(mr7.f(this.f22590a), (int) ((this.j.n / ((tc7) this.g).o) * mr7.f(this.f22590a))));
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a604a3e4", new Object[]{this});
            return;
        }
        nar.a aVar = new nar.a((Activity) this.f22590a);
        aVar.h(this.j.m);
        aVar.j(this.j.l);
        aVar.b(this.j.k);
        aVar.f(true);
        aVar.a(nbf.STDPOP_POP_ID_DETAIL);
        aVar.i(true);
        aVar.g(A());
        aVar.e(true);
        aVar.k(mr7.f(this.f22590a));
        aVar.c((int) ((this.j.n / ((tc7) this.g).o) * mr7.f(this.f22590a)));
        aVar.d(true);
        nar l = aVar.l();
        this.k = l;
        l.u(new b());
        this.k.v();
    }
}
