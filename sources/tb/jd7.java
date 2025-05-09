package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.p6m;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltb/jd7;", "Ltb/kd7;", "Ltb/ugj;", "Ltb/wyb;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jd7 extends kd7<ugj> implements wyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RelativeLayout h;
    public ImageView i;
    public View j;
    public ugj k;
    public i7m l;
    public boolean m;
    public gd7 n;
    public p6m.a p;
    public int o = -1;
    public final asc q = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ugj b;

        public a(ugj ugjVar) {
            this.b = ugjVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            tgh.b("desc video", "btnPlay onClick" + this.b.f23968a + "|" + jd7.this);
            if (jd7.x(jd7.this) != null) {
                q84.f(jd7.this.f22590a, new dw3());
                jd7.this.b(-1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            } else {
                jd7.A(jd7.this, false);
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            i7m x = jd7.x(jd7.this);
            if (x != null) {
                x.b(jd7.this.i());
            }
            jd7.B(jd7.this, 0);
            jd7.A(jd7.this, false);
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            jd7.B(jd7.this, 0);
            jd7.A(jd7.this, false);
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            gd7 w;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            } else if (jd7.z(jd7.this) && jd7.y(jd7.this) > 0 && (w = jd7.w(jd7.this)) != null) {
                w.g(jd7.y(jd7.this));
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(912262361);
        t2o.a(912262327);
    }

    public jd7(Context context) {
        super(context);
    }

    public static final /* synthetic */ void A(jd7 jd7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c5959d", new Object[]{jd7Var, new Boolean(z)});
        } else {
            jd7Var.m = z;
        }
    }

    public static final /* synthetic */ void B(jd7 jd7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea712b1", new Object[]{jd7Var, new Integer(i)});
        } else {
            jd7Var.o = i;
        }
    }

    public static /* synthetic */ Object ipc$super(jd7 jd7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.t();
            return null;
        } else if (hashCode == -1504501726) {
            super.p();
            return null;
        } else if (hashCode == 1838200670) {
            super.s(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/DescVideoViewHolder");
        }
    }

    public static final /* synthetic */ gd7 w(jd7 jd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gd7) ipChange.ipc$dispatch("361ce32d", new Object[]{jd7Var});
        }
        return jd7Var.n;
    }

    public static final /* synthetic */ i7m x(jd7 jd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i7m) ipChange.ipc$dispatch("73f7aaff", new Object[]{jd7Var});
        }
        return jd7Var.l;
    }

    public static final /* synthetic */ int y(jd7 jd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("894ce179", new Object[]{jd7Var})).intValue();
        }
        return jd7Var.o;
    }

    public static final /* synthetic */ boolean z(jd7 jd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37c260af", new Object[]{jd7Var})).booleanValue();
        }
        return jd7Var.H();
    }

    /* renamed from: D */
    public View j(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d846ab2", new Object[]{this, ugjVar});
        }
        this.k = ugjVar;
        if (ugjVar == null) {
            return null;
        }
        float f = ugjVar.m / ugjVar.n;
        int f2 = mr7.f(this.f22590a);
        int i = (int) (f * f2);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, i);
        DetailImageView detailImageView = new DetailImageView(this.f22590a);
        detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (!TextUtils.isEmpty(ugjVar.k)) {
            n(detailImageView, ugjVar.k, new koe(f2, i), null, null);
        } else {
            detailImageView.setBackgroundColor(w14.a("#000000"));
        }
        ImageView imageView = new ImageView(this.f22590a);
        imageView.setImageResource(R.drawable.tt_detail_tbavsdk_video_play);
        imageView.setOnClickListener(new a(ugjVar));
        this.i = imageView;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        RelativeLayout relativeLayout = new RelativeLayout(this.f22590a);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(detailImageView, layoutParams2);
        relativeLayout.addView(this.i, layoutParams3);
        relativeLayout.setContentDescription("视频");
        this.h = relativeLayout;
        E(ugjVar);
        return this.h;
    }

    public final void E(ugj ugjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6e8de0", new Object[]{this, ugjVar});
            return;
        }
        View inflate = LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_desc_video_text_info, (ViewGroup) null);
        this.j = inflate;
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.desc_video_text_info_title);
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                View findViewById2 = inflate.findViewById(R.id.desc_video_text_info_desc);
                if (findViewById2 != null) {
                    TextView textView2 = (TextView) findViewById2;
                    String str = ugjVar.p;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    textView.setText(str);
                    String str3 = ugjVar.q;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    textView2.setText(str2);
                    if (inflate.getParent() != null) {
                        ViewParent parent = inflate.getParent();
                        if (parent != null) {
                            ((ViewGroup) parent).removeView(inflate);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    RelativeLayout relativeLayout = this.h;
                    if (relativeLayout != null) {
                        relativeLayout.addView(inflate, layoutParams);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
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
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            this.o = gd7Var.b();
            gd7Var.k();
            i7m i7mVar = this.l;
            if (i7mVar != null) {
                i7mVar.a(i());
            }
            this.m = false;
        }
    }

    @Override // tb.wyb
    public void b(int i) {
        gd7 gd7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f662dab", new Object[]{this, new Integer(i)});
        } else if (!this.m && (gd7Var = this.n) != null) {
            i7m i7mVar = this.l;
            if (i7mVar != null) {
                i7mVar.c(i(), this.o);
            }
            p6m.a aVar = this.p;
            if (aVar != null) {
                Context context = this.f22590a;
                ckf.c(context, "mContext");
                gd7Var.c(context, aVar, true);
                gd7Var.i(this.q);
                gd7Var.m();
                gd7Var.j();
                this.m = true;
            }
        }
    }

    @Override // tb.wyb
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eec3385", new Object[]{this})).booleanValue();
        }
        if (this.o < 0) {
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
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            gd7Var.l(z, z2);
        }
    }

    @Override // tb.wyb
    public void e(i7m i7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7db6690", new Object[]{this, i7mVar});
        } else {
            this.l = i7mVar;
        }
    }

    @Override // tb.wyb
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe989d1", new Object[]{this});
            return;
        }
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            gd7Var.e();
        }
    }

    @Override // tb.wyb
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d10508", new Object[]{this});
            return;
        }
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            gd7Var.m();
        }
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.l = null;
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            gd7Var.i(null);
        }
        gd7 gd7Var2 = this.n;
        if (gd7Var2 != null) {
            gd7Var2.k();
        }
        this.n = null;
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
        gd7 gd7Var = this.n;
        if (gd7Var != null) {
            gd7Var.e();
        }
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ugj ugjVar = this.k;
        if (ugjVar != null && !TextUtils.isEmpty(ugjVar.l) && this.n == null) {
            p6m p6mVar = new p6m(ugjVar.f23968a, ugjVar.l, ugjVar.k, this.h, ugjVar.n, ugjVar.m);
            p6mVar.c(ugjVar.g);
            p6mVar.d(ugjVar.f);
            p6mVar.b(false);
            ugj ugjVar2 = this.k;
            if (ugjVar2 != null) {
                p6mVar.e(ugjVar2.o);
                this.p = p6mVar.a();
                q84.f(this.f22590a, p6mVar);
                this.n = new gd7();
            } else {
                ckf.s();
                throw null;
            }
        }
        super.t();
    }
}
