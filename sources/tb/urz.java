package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class urz extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_ID = -1300963021;
    public static final a Companion = new a(null);
    public static final int TEXT_SPAN_PROPS_COLOR_HASH = 787264307;
    public static final int TEXT_SPAN_PROPS_FONT_FAMILY_HASH = -1810251623;
    public static final int TEXT_SPAN_PROPS_FONT_SIZE_HASH = -1974757381;
    public static final int TEXT_SPAN_PROPS_FONT_STYLE_HASH = -1731357491;
    public static final int TEXT_SPAN_PROPS_FONT_WEIGHT_HASH = 1102323907;
    public static final int TEXT_SPAN_PROPS_LETTER_SPACING_HASH = -8255201;
    public static final int TEXT_SPAN_PROPS_TEXT_DECORATION_HASH = 342963046;
    public static final int TEXT_SPAN_PROPS_TEXT_HASH = -1744627738;
    public static final int TextSpanEventOnClickHash = -365276219;
    public String f = "";
    public String g = "";
    public float h = Float.NaN;
    public int i = i7z.a(0);
    public int j = l7z.a(400);
    public String k = "";
    public float l = Float.NaN;
    public int m = rrz.a(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598736979);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598736978);
    }

    public static /* synthetic */ Object ipc$super(urz urzVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070965779:
                super.k(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -2070962896:
                super.h(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -213708779:
                return super.b();
            case 1028750679:
                return new Boolean(super.u((fzy) objArr[0]));
            case 1255407421:
                super.g(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text_span/TextSpanProps");
        }
    }

    /* renamed from: A */
    public fzy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("351db6c3", new Object[]{this});
        }
        urz urzVar = (urz) super.b();
        urzVar.f = H();
        urzVar.g = B();
        urzVar.h = D();
        urzVar.i = E();
        urzVar.j = F();
        urzVar.k = C();
        urzVar.l = G();
        urzVar.m = I();
        return urzVar;
    }

    public final String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c976c", new Object[]{this});
        }
        return this.g;
    }

    public final String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73773a10", new Object[]{this});
        }
        return this.k;
    }

    public final float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db8bfdd", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36275af4", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f869ed", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final float G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e451a67e", new Object[]{this})).floatValue();
        }
        return this.l;
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f;
    }

    public final int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33595e1e", new Object[]{this})).intValue();
        }
        return this.m;
    }

    @Override // tb.fzy, tb.jkz
    public void g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad3ff3d", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "value");
        if (i == -1810251623) {
            this.k = str;
        } else if (i == -1744627738) {
            this.f = str;
        } else if (i != 787264307) {
            super.g(i, str);
        } else {
            this.g = str;
        }
    }

    @Override // tb.fzy, tb.jkz
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        switch (i) {
            case -1974757381:
                k(i, i2);
                return;
            case -1731357491:
                this.i = i7z.a(i2);
                return;
            case -8255201:
                k(i, i2);
                return;
            case 342963046:
                this.m = rrz.a(i2);
                return;
            case 1102323907:
                this.j = l7z.a(i2);
                return;
            default:
                super.h(i, i2);
                return;
        }
    }

    @Override // tb.fzy, tb.jkz
    public void k(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f91ed", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == -1974757381) {
            this.h = f;
        } else if (i != -8255201) {
            super.k(i, f);
        } else {
            this.l = f;
        }
    }

    @Override // tb.fzy
    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new urz();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof urz) && super.u(fzyVar)) {
            urz urzVar = (urz) fzyVar;
            if (ckf.b(this.f, urzVar.f) && ckf.b(this.g, urzVar.g) && this.h == urzVar.h && i7z.b(E(), urzVar.E()) && l7z.b(F(), urzVar.F()) && ckf.b(this.k, urzVar.k) && this.l == urzVar.l && rrz.b(I(), urzVar.I())) {
                return true;
            }
        }
        return false;
    }
}
