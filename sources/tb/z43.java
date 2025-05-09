package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class z43 extends d32<Object, yr3, CaptureManager> implements pjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup l;
    public ViewGroup m;
    public TUrlImageView n;
    public TextView o;
    public TUrlImageView p;
    public final ojb s;
    public boolean r = false;
    public int q = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV2$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            z43.O(z43.this).addView(z43.N(z43.this));
            z43.P(z43.this, 0);
            z43.Q(z43.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                z43.Q(z43.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;

        public c(boolean z) {
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV2$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (z43.U(z43.this) != null) {
                z43.U(z43.this).w(this.c);
            }
        }
    }

    static {
        t2o.a(481296523);
        t2o.a(481296540);
    }

    public z43(Activity activity, rcc<yr3, CaptureManager> rccVar, ViewGroup viewGroup, ojb ojbVar) {
        super(activity, rccVar);
        this.l = viewGroup;
        this.s = ojbVar;
        vpt.g("CaptureBottomAreaNavBarViewV2_addView", new a());
    }

    public static /* synthetic */ ViewGroup N(z43 z43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e8af9c7e", new Object[]{z43Var});
        }
        return z43Var.m;
    }

    public static /* synthetic */ ViewGroup O(z43 z43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("28da833f", new Object[]{z43Var});
        }
        return z43Var.l;
    }

    public static /* synthetic */ void P(z43 z43Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9935852e", new Object[]{z43Var, new Integer(i)});
        } else {
            z43Var.V(i);
        }
    }

    public static /* synthetic */ void Q(z43 z43Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51223280", new Object[]{z43Var, new Boolean(z)});
        } else {
            z43Var.X(z);
        }
    }

    public static /* synthetic */ int R(z43 z43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a193926", new Object[]{z43Var})).intValue();
        }
        return z43Var.q;
    }

    public static /* synthetic */ int S(z43 z43Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580613a5", new Object[]{z43Var, new Integer(i)})).intValue();
        }
        z43Var.q = i;
        return i;
    }

    public static /* synthetic */ TextView T(z43 z43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d4182a06", new Object[]{z43Var});
        }
        return z43Var.o;
    }

    public static /* synthetic */ ojb U(z43 z43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ojb) ipChange.ipc$dispatch("7707108b", new Object[]{z43Var});
        }
        return z43Var.s;
    }

    public static /* synthetic */ Object ipc$super(z43 z43Var, String str, Object... objArr) {
        if (str.hashCode() == -3136315) {
            super.K();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV2");
    }

    public final void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6978311", new Object[]{this, new Integer(i)});
        } else {
            vpt.g("switchShowType", new a53(this, i));
        }
    }

    public final void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80bf54f", new Object[]{this, new Boolean(z)});
        } else {
            vpt.g("updatePageUpState", new c(z));
        }
    }

    @Override // tb.pjb
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d7a6c4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.r = z;
        W();
    }

    @Override // tb.pjb
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6be5b61", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.pjb
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dc77d", new Object[]{this, new Integer(i)});
            return;
        }
        V(i);
        X(true);
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_bottom_area_nav_v2, (ViewGroup) null, false);
        this.m = viewGroup;
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.iv_close);
        this.n = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01ZJDNzV1x6xlJqr5p7_!!6000000006395-2-tps-26-26.png");
        this.n.setOnClickListener(new b());
        TextView textView = (TextView) this.m.findViewById(R.id.tv_cur_tab);
        this.o = textView;
        textView.setTextSize(1, m().M() ? 21.0f : 16.0f);
        this.p = (TUrlImageView) this.m.findViewById(R.id.iv_cur_tab_hint);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193ef039", new Object[]{this});
        } else if (this.q != 1) {
        } else {
            if (this.r) {
                this.p.setVisibility(0);
                this.p.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01LzZS071FUvNUt2fHT_!!6000000000491-2-tps-128-68.png");
                return;
            }
            this.p.setVisibility(8);
        }
    }
}
