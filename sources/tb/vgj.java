package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import tb.p6m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vgj extends kd7<ugj> implements wyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RelativeLayout h;
    public ImageView i;
    public ugj j;
    public i7m k;
    public id7 l;
    public View n;
    public p6m.a p;
    public int m = -1;
    public boolean o = false;
    public final ztb q = new b();
    public final mtb r = new c(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ugj f30004a;

        public a(ugj ugjVar) {
            this.f30004a = ugjVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            tgh.b("desc video", "btnPlay onClick" + this.f30004a.f23968a + "|" + vgj.this);
            if (vgj.w(vgj.this) != null) {
                q84.f(vgj.this.f22590a, new dw3());
                vgj.this.b(-1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ztb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                vgj.B(vgj.this, false);
            }
        }

        @Override // tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            if (vgj.w(vgj.this) != null) {
                vgj.w(vgj.this).b(vgj.this.i());
            }
            vgj.z(vgj.this, 0);
            vgj.B(vgj.this, false);
        }

        @Override // tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            vgj.z(vgj.this, 0);
            vgj.B(vgj.this, false);
        }

        @Override // tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else if (vgj.x(vgj.this) && vgj.y(vgj.this) > 0) {
                vgj.A(vgj.this).k(vgj.y(vgj.this));
            }
        }

        @Override // tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements mtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(vgj vgjVar) {
        }

        @Override // tb.mtb
        public void hide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            }
        }

        @Override // tb.mtb
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(912262377);
        t2o.a(912262327);
    }

    public vgj(Context context) {
        super(context);
    }

    public static /* synthetic */ id7 A(vgj vgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (id7) ipChange.ipc$dispatch("e3956448", new Object[]{vgjVar});
        }
        return vgjVar.l;
    }

    public static /* synthetic */ boolean B(vgj vgjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b86ee4b", new Object[]{vgjVar, new Boolean(z)})).booleanValue();
        }
        vgjVar.o = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(vgj vgjVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.t();
                return null;
            case -1504501726:
                super.p();
                return null;
            case 188604040:
                super.u();
                return null;
            case 1838200670:
                super.s(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/NBVideoViewHolder");
        }
    }

    public static /* synthetic */ i7m w(vgj vgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i7m) ipChange.ipc$dispatch("e734d92", new Object[]{vgjVar});
        }
        return vgjVar.k;
    }

    public static /* synthetic */ boolean x(vgj vgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33524b16", new Object[]{vgjVar})).booleanValue();
        }
        return vgjVar.H();
    }

    public static /* synthetic */ int y(vgj vgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b432624", new Object[]{vgjVar})).intValue();
        }
        return vgjVar.m;
    }

    public static /* synthetic */ int z(vgj vgjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf319ce7", new Object[]{vgjVar, new Integer(i)})).intValue();
        }
        vgjVar.m = i;
        return i;
    }

    /* renamed from: D */
    public View j(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d846ab2", new Object[]{this, ugjVar});
        }
        if (ugjVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(ugjVar.l)) {
            float f = ugjVar.m / ((ugj) this.g).n;
            int f2 = mr7.f(this.f22590a);
            int i = (int) (f * f2);
            this.h = new RelativeLayout(this.f22590a);
            this.h.setLayoutParams(new AbsListView.LayoutParams(-1, i));
            DetailImageView detailImageView = new DetailImageView(this.f22590a);
            detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.h.addView(detailImageView, new RelativeLayout.LayoutParams(-1, -1));
            if (!TextUtils.isEmpty(ugjVar.k)) {
                n(detailImageView, ugjVar.k, new koe(f2, i), null, null);
            } else {
                detailImageView.setBackgroundColor(w14.a("#000000"));
            }
            E(ugjVar);
            ImageView imageView = new ImageView(this.f22590a);
            this.i = imageView;
            imageView.setImageResource(R.drawable.tt_detail_tbavsdk_video_play);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.h.addView(this.i, layoutParams);
            this.i.setOnClickListener(new a(ugjVar));
            this.h.setContentDescription("视频");
            this.j = ugjVar;
        }
        return this.h;
    }

    public final void E(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6e8de0", new Object[]{this, ugjVar});
            return;
        }
        View inflate = LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_desc_video_text_info, (ViewGroup) null);
        this.n = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.desc_video_text_info_title);
        TextView textView2 = (TextView) this.n.findViewById(R.id.desc_video_text_info_desc);
        if (!TextUtils.isEmpty(ugjVar.p) && !TextUtils.isEmpty(ugjVar.q)) {
            textView.setText(ugjVar.p);
            textView2.setText(ugjVar.q);
        }
        if (this.n.getParent() != null) {
            ((ViewGroup) this.n.getParent()).removeView(this.n);
        }
        this.h.addView(this.n, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33a1a620", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.wyb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        id7 id7Var = this.l;
        if (id7Var != null) {
            this.m = id7Var.d();
            this.l.s();
            i7m i7mVar = this.k;
            if (i7mVar != null) {
                i7mVar.a(i());
            }
            this.o = false;
        }
    }

    @Override // tb.wyb
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f662dab", new Object[]{this, new Integer(i)});
        } else if (this.l != null && !this.o) {
            i7m i7mVar = this.k;
            if (i7mVar != null) {
                i7mVar.c(i(), this.m);
            }
            this.l.e(this.f22590a, this.p, true);
            this.l.n(this.q);
            this.l.m(this.r);
            this.l.u();
            this.o = true;
            this.l.p();
        }
    }

    @Override // tb.wyb
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eec3385", new Object[]{this})).booleanValue();
        }
        if (this.m < 0) {
            return true;
        }
        return false;
    }

    @Override // tb.wyb
    public void d(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916bb854", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        id7 id7Var = this.l;
        if (id7Var != null) {
            id7Var.t(z, z2);
        }
    }

    @Override // tb.wyb
    public void e(i7m i7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7db6690", new Object[]{this, i7mVar});
        } else {
            this.k = i7mVar;
        }
    }

    @Override // tb.wyb
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe989d1", new Object[]{this});
            return;
        }
        id7 id7Var = this.l;
        if (id7Var != null) {
            id7Var.h();
        }
    }

    @Override // tb.wyb
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d10508", new Object[]{this});
            return;
        }
        id7 id7Var = this.l;
        if (id7Var != null) {
            id7Var.u();
        }
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.k = null;
        id7 id7Var = this.l;
        if (id7Var != null) {
            id7Var.n(null);
            this.l.m(null);
            this.l.s();
            this.l = null;
        }
        super.p();
    }

    /* renamed from: q */
    public void h(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a324fe", new Object[]{this, ugjVar});
        }
    }

    /* renamed from: r */
    public boolean m(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ddab82", new Object[]{this, ugjVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.kd7
    public void s(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.s(z, z2);
        id7 id7Var = this.l;
        if (id7Var != null) {
            id7Var.h();
        }
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        T t = this.g;
        if (t != 0 && !TextUtils.isEmpty(((ugj) t).l)) {
            if (this.l == null) {
                ugj ugjVar = this.j;
                p6m p6mVar = new p6m(ugjVar.f23968a, ugjVar.l, ugjVar.k, this.h, ugjVar.n, ugjVar.m);
                p6mVar.c(this.j.g);
                p6mVar.d(((ugj) this.g).f);
                p6mVar.b(false);
                p6mVar.e(this.j.o);
                this.p = p6mVar.a();
                q84.f(this.f22590a, p6mVar);
                this.l = new id7();
            }
            super.t();
        }
    }

    @Override // tb.kd7
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.u();
        }
    }
}
