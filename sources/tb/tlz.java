package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tlz extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_ID = 753874803;
    public static final a Companion = new a(null);
    public static final int RICH_TEXT_PROPS_BASELINE_OFFSET_HASH = 422301020;
    public static final int RICH_TEXT_PROPS_COLOR_HASH = 787264307;
    public static final int RICH_TEXT_PROPS_FONT_FAMILY_HASH = -1810251623;
    public static final int RICH_TEXT_PROPS_FONT_SIZE_HASH = -1974757381;
    public static final int RICH_TEXT_PROPS_LETTER_SPACING_HASH = -8255201;
    public static final int RICH_TEXT_PROPS_LINE_HEIGHT_HASH = 2137545482;
    public static final int RICH_TEXT_PROPS_MAX_LINES_HASH = 807610899;
    public static final int RICH_TEXT_PROPS_MIN_LINES_HASH = 312258752;
    public static final int RICH_TEXT_PROPS_TEXT_ALIGN_HASH = 349138628;
    public float f = Float.NaN;
    public String g = "";
    public String h = "#FF000000";
    public float i = Float.NaN;
    public float j = Float.NaN;
    public int k = qrz.a(0);
    public int l = 1;
    public int m = 1;
    public float n = Float.NaN;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598736962);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598736961);
    }

    public static /* synthetic */ Object ipc$super(tlz tlzVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/rich_text/RichTextProps");
        }
    }

    /* renamed from: A */
    public fzy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("351db6c3", new Object[]{this});
        }
        tlz tlzVar = (tlz) super.b();
        tlzVar.f = E();
        tlzVar.g = D();
        tlzVar.h = C();
        tlzVar.i = F();
        tlzVar.j = G();
        tlzVar.k = J();
        tlzVar.l = H();
        tlzVar.m = I();
        tlzVar.n = B();
        return tlzVar;
    }

    public final float B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("256c39a5", new Object[]{this})).floatValue();
        }
        return this.n;
    }

    public final String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c976c", new Object[]{this});
        }
        return this.h;
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73773a10", new Object[]{this});
        }
        return this.g;
    }

    public final float E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db8bfdd", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final float F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e451a67e", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    public final float G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b2228", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public final int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a208196b", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public final int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be4f443d", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bcc57a3", new Object[]{this})).intValue();
        }
        return this.k;
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
            this.g = str;
        } else if (i != 787264307) {
            super.g(i, str);
        } else {
            this.h = str;
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
            case -8255201:
                k(i, i2);
                return;
            case RICH_TEXT_PROPS_MIN_LINES_HASH /* 312258752 */:
                this.m = i2;
                return;
            case 349138628:
                this.k = qrz.a(i2);
                return;
            case RICH_TEXT_PROPS_BASELINE_OFFSET_HASH /* 422301020 */:
                k(i, i2);
                return;
            case 807610899:
                this.l = i2;
                return;
            case 2137545482:
                k(i, i2);
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
            return;
        }
        switch (i) {
            case -1974757381:
                this.f = f;
                return;
            case -8255201:
                this.i = f;
                return;
            case RICH_TEXT_PROPS_BASELINE_OFFSET_HASH /* 422301020 */:
                this.n = f;
                return;
            case 2137545482:
                this.j = f;
                return;
            default:
                super.k(i, f);
                return;
        }
    }

    @Override // tb.fzy
    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new tlz();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof tlz) && super.u(fzyVar)) {
            tlz tlzVar = (tlz) fzyVar;
            if (this.f == tlzVar.f && ckf.b(this.g, tlzVar.g) && ckf.b(this.h, tlzVar.h) && this.i == tlzVar.i && this.j == tlzVar.j && qrz.b(J(), tlzVar.J()) && this.l == tlzVar.l && this.m == tlzVar.m && this.n == tlzVar.n) {
                return true;
            }
        }
        return false;
    }
}
