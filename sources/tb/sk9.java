package tb;

import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class sk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final int f28108a = kew.P(30);
    public static final int b = kew.P(42);
    public static final int c = Color.parseColor("#eeeeee");
    public static final GradientDrawable d;
    public static final GradientDrawable e;
    public static final GradientDrawable f;
    public static final GradientDrawable g;
    public static final GradientDrawable h;
    public static final GradientDrawable i;
    public static final ColorDrawable j;
    public static final GradientDrawable k;
    public static final ColorDrawable l;
    public static final ColorDrawable m;
    public static final GradientDrawable n;
    public static final GradientDrawable o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.sk9$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C1054a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C1054a INSTANCE = new C1054a();

            /* renamed from: a  reason: collision with root package name */
            public static final GradientDrawable f28109a;
            public static final GradientDrawable b;
            public static final GradientDrawable c;

            static {
                t2o.a(766510059);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setAlpha(242);
                f28109a = gradientDrawable;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(Color.parseColor("#111111"));
                gradientDrawable2.setAlpha(76);
                b = gradientDrawable2;
                GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#4c000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
                gradientDrawable3.setGradientType(0);
                c = gradientDrawable3;
            }

            public final GradientDrawable a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("ccc6f381", new Object[]{this});
                }
                return c;
            }

            public final GradientDrawable b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("7afc5663", new Object[]{this});
                }
                return f28109a;
            }

            public final GradientDrawable c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("59ce3c83", new Object[]{this});
                }
                return b;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final b INSTANCE = new b();

            /* renamed from: a  reason: collision with root package name */
            public static final GradientDrawable f28110a;

            static {
                t2o.a(766510061);
                int parseColor = Color.parseColor("#b1000000");
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, ic1.h0(new Integer[]{Integer.valueOf(parseColor), Integer.valueOf(parseColor), Integer.valueOf(Color.parseColor("#5a000000"))}));
                gradientDrawable.setGradientType(0);
                float p = kew.p(21);
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, p, p, p, p});
                GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#e0000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
                gradientDrawable2.setGradientType(0);
                f28110a = gradientDrawable2;
            }

            public final GradientDrawable a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("d3392d2f", new Object[]{this});
                }
                return f28110a;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c extends ViewOutlineProvider {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f28111a;
            public final /* synthetic */ int b;
            public final /* synthetic */ boolean c;

            public c(boolean z, int i, boolean z2) {
                this.f28111a = z;
                this.b = i;
                this.c = z2;
            }

            public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/drawable/FlagShipDrawable$Companion$getCenterContainerOutLineProvider$1");
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                } else if (view != null && outline != null) {
                    int width = view.getWidth();
                    boolean z = this.f28111a;
                    int height = view.getHeight();
                    if (z) {
                        height += this.b;
                    }
                    if (this.c) {
                        f = this.b;
                    } else {
                        f = 0.0f;
                    }
                    outline.setRoundRect(0, 0, width, height, f);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class d {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final d INSTANCE = new d();

            /* renamed from: a  reason: collision with root package name */
            public static final GradientDrawable f28112a;
            public static final GradientDrawable b;

            static {
                t2o.a(766510060);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-16777216);
                gradientDrawable.setAlpha(ArtcParams.SD244pVideoParams.WIDTH);
                f28112a = gradientDrawable;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(-1);
                gradientDrawable2.setAlpha(242);
                b = gradientDrawable2;
            }

            public final GradientDrawable a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("7afc5663", new Object[]{this});
                }
                return b;
            }

            public final GradientDrawable b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (GradientDrawable) ipChange.ipc$dispatch("59ce3c83", new Object[]{this});
                }
                return f28112a;
            }
        }

        static {
            t2o.a(766510058);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static /* synthetic */ Object f(a aVar, boolean z, int i, boolean z2, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("10aecb8e", new Object[]{aVar, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), obj});
            }
            if ((i2 & 2) != 0) {
                i = aVar.g();
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.e(z, i, z2);
        }

        public final GradientDrawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("823c8db4", new Object[]{this});
            }
            return sk9.a();
        }

        public final GradientDrawable b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("39cd219e", new Object[]{this});
            }
            return sk9.b();
        }

        public final GradientDrawable c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("7afc5663", new Object[]{this});
            }
            return sk9.c();
        }

        public final GradientDrawable d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("59ce3c83", new Object[]{this});
            }
            return sk9.d();
        }

        public final Object e(boolean z, int i, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f872c7f1", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            }
            if (z) {
                return new c(z2, i, z);
            }
            return null;
        }

        public final int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4450da22", new Object[]{this})).intValue();
            }
            return sk9.e();
        }

        public final GradientDrawable h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("82c85246", new Object[]{this});
            }
            return sk9.f();
        }

        public final GradientDrawable i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("64e376e9", new Object[]{this});
            }
            return sk9.g();
        }

        public final ColorDrawable j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorDrawable) ipChange.ipc$dispatch("d3f2da74", new Object[]{this});
            }
            return sk9.h();
        }

        public final GradientDrawable k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("351e7a6f", new Object[]{this});
            }
            return sk9.i();
        }

        public final GradientDrawable l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("e2da205c", new Object[]{this});
            }
            return sk9.j();
        }

        public final ColorDrawable m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorDrawable) ipChange.ipc$dispatch("fa80637c", new Object[]{this});
            }
            return sk9.k();
        }

        public final ColorDrawable n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorDrawable) ipChange.ipc$dispatch("462a71e2", new Object[]{this});
            }
            return sk9.l();
        }

        public final GradientDrawable o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("78c4c444", new Object[]{this});
            }
            return sk9.m();
        }

        public final int p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e4500641", new Object[]{this})).intValue();
            }
            return sk9.n();
        }

        public final int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bfd5092a", new Object[]{this})).intValue();
            }
            return sk9.o();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510057);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#242424"));
        float p = kew.p(21);
        gradientDrawable.setCornerRadii(new float[]{p, p, p, p, 0.0f, 0.0f, 0.0f, 0.0f});
        d = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        float p2 = kew.p(21);
        gradientDrawable2.setCornerRadii(new float[]{p2, p2, p2, p2, 0.0f, 0.0f, 0.0f, 0.0f});
        e = gradientDrawable2;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#b1000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable3.setGradientType(0);
        f = gradientDrawable3;
        GradientDrawable gradientDrawable4 = new GradientDrawable(orientation, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#7f000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable4.setGradientType(0);
        g = gradientDrawable4;
        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.BOTTOM_TOP;
        GradientDrawable gradientDrawable5 = new GradientDrawable(orientation2, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#e5000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable5.setGradientType(0);
        h = gradientDrawable5;
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setOrientation(orientation2);
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable6.setColors(ic1.h0(new Integer[]{1962934272, 855638016, 0}), ic1.g0(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.7f), Float.valueOf(1.0f)}));
        } else {
            gradientDrawable6.setColors(ic1.h0(new Integer[]{1962934272, 855638016, 0}));
        }
        gradientDrawable6.setGradientType(0);
        i = gradientDrawable6;
        new GradientDrawable(orientation2, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#b2000000")), Integer.valueOf(Color.parseColor("#00000000"))})).setGradientType(0);
        j = new ColorDrawable(Color.parseColor("#cc111111"));
        GradientDrawable gradientDrawable7 = new GradientDrawable(orientation2, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#cc111111")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable7.setGradientType(0);
        k = gradientDrawable7;
        l = new ColorDrawable(Color.parseColor("#cc111111"));
        m = new ColorDrawable(0);
        new ColorDrawable(-1);
        GradientDrawable gradientDrawable8 = new GradientDrawable();
        gradientDrawable8.setColor(-1);
        gradientDrawable8.setAlpha(242);
        gradientDrawable8.setCornerRadius(kew.p(21));
        n = gradientDrawable8;
        GradientDrawable gradientDrawable9 = new GradientDrawable();
        gradientDrawable9.setColor(Color.parseColor("#111111"));
        gradientDrawable9.setAlpha(76);
        gradientDrawable9.setCornerRadius(kew.p(21));
        o = gradientDrawable9;
    }

    public static final /* synthetic */ GradientDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("3bc96d41", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ GradientDrawable b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("8bf18917", new Object[0]);
        }
        return h;
    }

    public static final /* synthetic */ GradientDrawable c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("205f6232", new Object[0]);
        }
        return n;
    }

    public static final /* synthetic */ GradientDrawable d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("223e3812", new Object[0]);
        }
        return o;
    }

    public static final /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a86f1a3", new Object[0])).intValue();
        }
        return f28108a;
    }

    public static final /* synthetic */ GradientDrawable f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("6743076f", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ GradientDrawable g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("d93b756c", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ ColorDrawable h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("7f737f65", new Object[0]);
        }
        return m;
    }

    public static final /* synthetic */ GradientDrawable i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("454c1c26", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ GradientDrawable j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("2b322999", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ ColorDrawable k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("5175fdd", new Object[0]);
        }
        return l;
    }

    public static final /* synthetic */ ColorDrawable l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("12b28937", new Object[0]);
        }
        return j;
    }

    public static final /* synthetic */ GradientDrawable m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("13986cb1", new Object[0]);
        }
        return k;
    }

    public static final /* synthetic */ int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f23633a4", new Object[0])).intValue();
        }
        return b;
    }

    public static final /* synthetic */ int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91acbc1b", new Object[0])).intValue();
        }
        return c;
    }
}
