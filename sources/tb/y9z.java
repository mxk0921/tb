package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y9z extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_ID = -1338914217;
    public static final a Companion = new a(null);
    public static final int IMAGE_SPAN_PROPS_ASPECT_RATIO_HASH = -1369777380;
    public static final int IMAGE_SPAN_PROPS_CONTENT_SCALE_HASH = 1283637724;
    public static final int IMAGE_SPAN_PROPS_HEIGHT_HASH = -1391160911;
    public static final int IMAGE_SPAN_PROPS_IMAGE_NAME_HASH = -540842376;
    public static final int IMAGE_SPAN_PROPS_IMAGE_URL_HASH = -170280559;
    public static final int IMAGE_SPAN_PROPS_WIDTH_HASH = 1326383060;
    public static final int ImageSpanEventOnClickHash = -365276219;
    public float i;
    public float j;
    public String f = "";
    public String g = "";
    public int h = x2z.a(1);
    public float k = 1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598736952);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598736951);
    }

    public static /* synthetic */ Object ipc$super(y9z y9zVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/image_span/ImageSpanProps");
        }
    }

    /* renamed from: A */
    public fzy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("351db6c3", new Object[]{this});
        }
        y9z y9zVar = (y9z) super.b();
        y9zVar.f = F();
        y9zVar.g = E();
        y9zVar.h = C();
        y9zVar.i = G();
        y9zVar.j = D();
        y9zVar.k = B();
        return y9zVar;
    }

    public final float B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        return this.k;
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a5ae3d", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc9bcd29", new Object[]{this});
        }
        return this.g;
    }

    public final String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.f;
    }

    public final float G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    @Override // tb.fzy, tb.jkz
    public void g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad3ff3d", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "value");
        if (i == -540842376) {
            this.g = str;
        } else if (i != -170280559) {
            super.g(i, str);
        } else {
            this.f = str;
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
            case -1391160911:
                k(i, i2);
                return;
            case -1369777380:
                k(i, i2);
                return;
            case 1283637724:
                this.h = x2z.a(i2);
                return;
            case 1326383060:
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
        } else if (i == -1391160911) {
            this.j = f;
        } else if (i == -1369777380) {
            this.k = f;
        } else if (i != 1326383060) {
            super.k(i, f);
        } else {
            this.i = f;
        }
    }

    @Override // tb.fzy
    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new y9z();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof y9z) && super.u(fzyVar)) {
            y9z y9zVar = (y9z) fzyVar;
            if (ckf.b(this.f, y9zVar.f) && ckf.b(this.g, y9zVar.g) && x2z.b(C(), y9zVar.C()) && this.i == y9zVar.i && this.j == y9zVar.j && this.k == y9zVar.k) {
                return true;
            }
        }
        return false;
    }
}
