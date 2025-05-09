package tb;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.richtext.span.CloneableUnderlineSpan;
import java.util.LinkedList;
import java.util.List;
import tb.keo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gmt implements keo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NONE_STRIKE_THROUGH = 0;
    public static final int NONE_UNDERLINE = 0;
    public static final String PADDING_TEXT = " ";
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public List<Object> F;
    public tv3 G;
    public sv3 H;
    public tv3 I;
    public sv3 J;

    /* renamed from: a  reason: collision with root package name */
    public String f20096a;
    public int b;
    public Integer c;
    public boolean d;
    public boolean e;
    public String f;
    public AssetManager g;
    public int h;
    public int i;
    public int[] j;
    public int k;
    public int l;
    public int m;
    public int[] n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public keo.a t;
    public keo.b u;
    public keo.d v;
    public keo.c w;
    public float x;
    public float y;
    public int z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements du3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.du3
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                gmt.G(gmt.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rjh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rjh
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            gmt.I(gmt.this).a();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements du3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.du3
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                gmt.d(gmt.this).a(gmt.b(gmt.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements rjh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.rjh
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            return gmt.B(gmt.this).a(gmt.p(gmt.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A;
        public int B;
        public int C;
        public final DinamicXEngine D;

        /* renamed from: a  reason: collision with root package name */
        public final String f20101a;
        public int b;
        public Integer c;
        public boolean d;
        public boolean e;
        public String f;
        public AssetManager g;
        public int h;
        public int i;
        public int[] j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int[] o;
        public int q;
        public int s;
        public String t;
        public String u;
        public float v;
        public float w;
        public int x;
        public float y;
        public int z;
        public int p = 0;
        public int r = 0;

        static {
            t2o.a(444597238);
        }

        public e(String str, DinamicXEngine dinamicXEngine) {
            this.f20101a = str;
            this.D = dinamicXEngine;
        }

        public e A(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7f69c710", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public e B(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("1a980982", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public gmt a() {
            int i;
            int i2;
            int max;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gmt) ipChange.ipc$dispatch("9e848ef9", new Object[]{this});
            }
            gmt gmtVar = new gmt(null);
            gmt.K(gmtVar, this.f20101a);
            gmt.L(gmtVar, this.b);
            gmt.M(gmtVar, this.c);
            gmt.e(gmtVar, this.d);
            gmt.g(gmtVar, this.e);
            gmt.h(gmtVar, this.f);
            gmt.i(gmtVar, this.g);
            gmt.j(gmtVar, this.h);
            gmt.k(gmtVar, this.i);
            gmt.l(gmtVar, this.k);
            gmt.m(gmtVar, this.q);
            gmt.n(gmtVar, this.p);
            gmt.o(gmtVar, this.s);
            gmt.q(gmtVar, this.r);
            gmt.c(gmtVar, this.t);
            gmt.r(gmtVar, this.u);
            gmt.f(gmtVar, null);
            gmt.D(gmtVar, null);
            gmt.H(gmtVar, null);
            gmt.J(gmtVar, null);
            gmt.s(gmtVar, this.x);
            gmt.t(gmtVar, this.v);
            gmt.u(gmtVar, this.w);
            gmt.v(gmtVar, this.y);
            gmt.w(gmtVar, this.z);
            gmt.x(gmtVar, this.A);
            gmt.y(gmtVar, this.B);
            gmt.z(gmtVar, this.C);
            gmt.A(gmtVar, this.j);
            int i4 = this.n;
            if (i4 > 0) {
                gmt.C(gmtVar, new int[]{i4, i4, i4, i4});
            } else {
                gmt.C(gmtVar, this.o);
            }
            if (this.k == 1) {
                if (this.l > -1 || DinamicXEngine.x() == null) {
                    i2 = Math.max(0, this.l);
                } else {
                    i2 = pb6.d(this.D, DinamicXEngine.x(), 6.0f);
                }
                if (this.m > -1 || DinamicXEngine.x() == null) {
                    max = Math.max(0, this.m);
                } else {
                    max = pb6.d(this.D, DinamicXEngine.x(), 4.0f);
                }
                i = max;
                i3 = i2;
            } else {
                i = 0;
            }
            gmt.E(gmtVar, i3);
            gmt.F(gmtVar, i);
            return gmtVar;
        }

        public e b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("e6a96236", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public e c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7d1c7cb4", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public e d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("5965bb53", new Object[]{this, new Integer(i)});
            }
            this.m = i;
            return this;
        }

        public e e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4dbb7263", new Object[]{this, new Integer(i)});
            }
            this.l = i;
            return this;
        }

        public e f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("16d185e1", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public e g(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("435a96dd", new Object[]{this, iArr});
            }
            this.j = iArr;
            return this;
        }

        public e h(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("24e8a940", new Object[]{this, iArr});
            }
            this.o = iArr;
            return this;
        }

        public e i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9d6f3140", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public e j(AssetManager assetManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("60ede4dc", new Object[]{this, assetManager, str});
            }
            this.f = str;
            this.g = assetManager;
            return this;
        }

        public e k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("cd542509", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public e l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("e0bed33e", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public e m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d340e61a", new Object[]{this, str});
            }
            this.t = str;
            return this;
        }

        public e n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("38b5fc4f", new Object[]{this, new Integer(i)});
            }
            this.C = i;
            return this;
        }

        public e o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7e303833", new Object[]{this, new Integer(i)});
            }
            this.z = i;
            return this;
        }

        public e p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bbd5fa7c", new Object[]{this, new Integer(i)});
            }
            this.A = i;
            return this;
        }

        public e q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f633bea3", new Object[]{this, new Integer(i)});
            }
            this.B = i;
            return this;
        }

        public e r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("88ca59a9", new Object[]{this, str});
            }
            this.u = str;
            return this;
        }

        public e s(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f66040a8", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public e t(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d8a65f63", new Object[]{this, new Float(f)});
            }
            this.v = f;
            return this;
        }

        public e u(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("1186c002", new Object[]{this, new Float(f)});
            }
            this.w = f;
            return this;
        }

        public e v(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("ded8f252", new Object[]{this, new Float(f)});
            }
            this.y = f;
            return this;
        }

        public e w(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f02e9b37", new Object[]{this, new Integer(i)});
            }
            this.s = i;
            return this;
        }

        public e x(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("8b5cdda9", new Object[]{this, new Integer(i)});
            }
            this.r = i;
            return this;
        }

        public e y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d1d070f5", new Object[]{this, new Integer(i)});
            }
            this.c = Integer.valueOf(i);
            return this;
        }

        public e z(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4f9b5119", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }
    }

    static {
        t2o.a(444597229);
        t2o.a(444597224);
    }

    public /* synthetic */ gmt(cmt cmtVar) {
        this();
    }

    public static /* synthetic */ int[] A(gmt gmtVar, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("bf8ac512", new Object[]{gmtVar, iArr});
        }
        gmtVar.j = iArr;
        return iArr;
    }

    public static /* synthetic */ keo.b B(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.b) ipChange.ipc$dispatch("885d0ca", new Object[]{gmtVar});
        }
        return gmtVar.u;
    }

    public static /* synthetic */ int[] C(gmt gmtVar, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a22b67a8", new Object[]{gmtVar, iArr});
        }
        gmtVar.n = iArr;
        return iArr;
    }

    public static /* synthetic */ keo.b D(gmt gmtVar, keo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.b) ipChange.ipc$dispatch("6aa3b798", new Object[]{gmtVar, bVar});
        }
        gmtVar.u = bVar;
        return bVar;
    }

    public static /* synthetic */ int E(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfe9db89", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.l = i;
        return i;
    }

    public static /* synthetic */ int F(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1da9538a", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.m = i;
        return i;
    }

    public static /* synthetic */ keo.d G(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.d) ipChange.ipc$dispatch("8eaae06d", new Object[]{gmtVar});
        }
        return gmtVar.v;
    }

    public static /* synthetic */ keo.d H(gmt gmtVar, keo.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.d) ipChange.ipc$dispatch("c8680f61", new Object[]{gmtVar, dVar});
        }
        gmtVar.v = dVar;
        return dVar;
    }

    public static /* synthetic */ keo.c I(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.c) ipChange.ipc$dispatch("b3496e28", new Object[]{gmtVar});
        }
        return gmtVar.w;
    }

    public static /* synthetic */ keo.c J(gmt gmtVar, keo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.c) ipChange.ipc$dispatch("b167609a", new Object[]{gmtVar, cVar});
        }
        gmtVar.w = cVar;
        return cVar;
    }

    public static /* synthetic */ String K(gmt gmtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68844102", new Object[]{gmtVar, str});
        }
        gmtVar.f20096a = str;
        return str;
    }

    public static /* synthetic */ int L(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c3cee3", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.b = i;
        return i;
    }

    public static /* synthetic */ Integer M(gmt gmtVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a0ba1ecc", new Object[]{gmtVar, num});
        }
        gmtVar.c = num;
        return num;
    }

    public static /* synthetic */ String b(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d40d6203", new Object[]{gmtVar});
        }
        return gmtVar.r;
    }

    public static /* synthetic */ String c(gmt gmtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("916cbabb", new Object[]{gmtVar, str});
        }
        gmtVar.r = str;
        return str;
    }

    public static /* synthetic */ keo.a d(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.a) ipChange.ipc$dispatch("929da42a", new Object[]{gmtVar});
        }
        return gmtVar.t;
    }

    public static /* synthetic */ boolean e(gmt gmtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adcb932c", new Object[]{gmtVar, new Boolean(z)})).booleanValue();
        }
        gmtVar.d = z;
        return z;
    }

    public static /* synthetic */ keo.a f(gmt gmtVar, keo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (keo.a) ipChange.ipc$dispatch("98cdbb92", new Object[]{gmtVar, aVar});
        }
        gmtVar.t = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean g(gmt gmtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8b0b2d", new Object[]{gmtVar, new Boolean(z)})).booleanValue();
        }
        gmtVar.e = z;
        return z;
    }

    public static /* synthetic */ String h(gmt gmtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e10e92ec", new Object[]{gmtVar, str});
        }
        gmtVar.f = str;
        return str;
    }

    public static /* synthetic */ AssetManager i(gmt gmtVar, AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("1d1d69cd", new Object[]{gmtVar, assetManager});
        }
        gmtVar.g = assetManager;
        return assetManager;
    }

    public static /* synthetic */ int j(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c9334e", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.h = i;
        return i;
    }

    public static /* synthetic */ int k(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3288ab4f", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.i = i;
        return i;
    }

    public static /* synthetic */ int l(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80482350", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.k = i;
        return i;
    }

    public static /* synthetic */ int m(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce079b51", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.p = i;
        return i;
    }

    public static /* synthetic */ int n(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bc71352", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.o = i;
        return i;
    }

    public static /* synthetic */ int o(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69868b53", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.getClass();
        return i;
    }

    public static /* synthetic */ String p(gmt gmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95000e05", new Object[]{gmtVar});
        }
        return gmtVar.s;
    }

    public static /* synthetic */ int q(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17fadb69", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.q = i;
        return i;
    }

    public static /* synthetic */ String r(gmt gmtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cee12a3d", new Object[]{gmtVar, str});
        }
        gmtVar.s = str;
        return str;
    }

    public static /* synthetic */ int s(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65ba536a", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.z = i;
        return i;
    }

    public static /* synthetic */ float t(gmt gmtVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b379c025", new Object[]{gmtVar, new Float(f)})).floatValue();
        }
        gmtVar.x = f;
        return f;
    }

    public static /* synthetic */ float u(gmt gmtVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1393826", new Object[]{gmtVar, new Float(f)})).floatValue();
        }
        gmtVar.y = f;
        return f;
    }

    public static /* synthetic */ float v(gmt gmtVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ef8b027", new Object[]{gmtVar, new Float(f)})).floatValue();
        }
        gmtVar.A = f;
        return f;
    }

    public static /* synthetic */ int w(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb8336e", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.B = i;
        return i;
    }

    public static /* synthetic */ int x(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea77ab6f", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.C = i;
        return i;
    }

    public static /* synthetic */ int y(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38372370", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.D = i;
        return i;
    }

    public static /* synthetic */ int z(gmt gmtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85f69b71", new Object[]{gmtVar, new Integer(i)})).intValue();
        }
        gmtVar.E = i;
        return i;
    }

    public final List<Object> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ccbcf46c", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        if (this.b > 0) {
            linkedList.add(new AbsoluteSizeSpan(this.b, true));
        }
        if (this.c != null) {
            linkedList.add(new ForegroundColorSpan(this.c.intValue()));
        }
        if (this.o != 0) {
            linkedList.add(new CloneableUnderlineSpan(this.p));
        }
        if (this.q != 0) {
            linkedList.add(new StrikethroughSpan());
        }
        if (this.d) {
            linkedList.add(new StyleSpan(1));
        }
        if (this.e) {
            linkedList.add(new StyleSpan(2));
        }
        if (this.h != 0) {
            linkedList.add(new BackgroundColorSpan(this.h));
        }
        this.G = new tv3();
        this.H = new sv3();
        this.I = new tv3();
        this.J = new sv3();
        linkedList.add(this.G);
        linkedList.add(this.H);
        linkedList.add(this.I);
        linkedList.add(this.J);
        if (this.t != null) {
            this.G.b(new cmt(this));
        }
        if (this.u != null) {
            this.H.c(new dmt(this));
        }
        if (this.v != null) {
            this.I.b(new emt(this));
        }
        if (this.w != null) {
            this.J.c(new fmt(this));
        }
        if (!(this.A == 0.0f || this.z == 0)) {
            linkedList.add(new vv3(this.A, this.x, this.y, this.z));
        }
        if (!(this.f == null || this.g == null || Build.VERSION.SDK_INT < 28)) {
            ku9 a2 = ku9.a();
            String str = this.f;
            linkedList.add(new TypefaceSpan(a2.b(str, Typeface.createFromAsset(this.g, str))));
        }
        if ((Q() && this.i != 0) || (this.h != 0 && (R() || S()))) {
            linkedList.add(new pgo(this.c, this.j, this.i, this.k, this.l, this.m, this.h, this.n, this.B, this.C, this.D, this.E));
        }
        return linkedList;
    }

    public Integer O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.c;
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdd5a8b", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length == 4) {
            for (int i : iArr) {
                if (i > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c927131", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.n;
        if (iArr != null && iArr.length == 4) {
            for (int i : iArr) {
                if (i > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06da122", new Object[]{this})).booleanValue();
        }
        if (this.B > 0 || this.C > 0 || this.D > 0 || this.E > 0) {
            return true;
        }
        return false;
    }

    public void T(keo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641ed63b", new Object[]{this, aVar});
            return;
        }
        this.t = aVar;
        if (this.F == null) {
            this.F = N();
        } else {
            this.G.b(new c());
        }
    }

    public void U(keo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6743803f", new Object[]{this, bVar});
            return;
        }
        this.u = bVar;
        if (this.F == null) {
            this.F = N();
        } else {
            this.H.c(new d());
        }
    }

    public void V(keo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dde983f", new Object[]{this, cVar});
            return;
        }
        this.w = cVar;
        this.J.c(new b());
    }

    public void W(keo.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99f6087", new Object[]{this, dVar});
            return;
        }
        this.v = dVar;
        this.I.b(new a());
    }

    public List<Object> X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("44fdd928", new Object[]{this, new Boolean(z)});
        }
        if (!z || this.F == null) {
            this.F = N();
        }
        return this.F;
    }

    @Override // tb.keo
    public Spanned a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spanned) ipChange.ipc$dispatch("cda1d37f", new Object[]{this, new Boolean(z)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.B > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new wc8(this.B), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        List<Object> X = X(z);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getText());
        for (Object obj : X) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        if (this.C > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new wc8(this.C), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // tb.keo
    public String getText() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.B > 0) {
            str = " ";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(this.f20096a);
        if (this.C > 0) {
            str2 = " ";
        }
        sb.append(str2);
        return sb.toString();
    }

    public gmt() {
    }
}
