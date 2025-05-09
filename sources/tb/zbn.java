package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zbn extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASYNC_IMAGE_PROPS_ANIMATED_HASH = 314862070;
    public static final int ASYNC_IMAGE_PROPS_CONTENT_SCALE_HASH = 1283637724;
    public static final int ASYNC_IMAGE_PROPS_IMAGE_NAME_HASH = -540842376;
    public static final int ASYNC_IMAGE_PROPS_IMAGE_URL_HASH = -170280559;
    public static final int COMPONENT_ID = 714233622;
    public static final a Companion = new a(null);
    public String f = "";
    public String g = "";
    public int h = x2z.a(1);
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598736944);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598736943);
    }

    public static /* synthetic */ Object ipc$super(zbn zbnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070962896:
                super.h(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -2070946559:
                super.l(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/async_image/AsyncImageProps");
        }
    }

    /* renamed from: A */
    public fzy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("351db6c3", new Object[]{this});
        }
        zbn zbnVar = (zbn) super.b();
        zbnVar.f = E();
        zbnVar.g = D();
        zbnVar.h = C();
        zbnVar.i = B();
        return zbnVar;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5eb724", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a5ae3d", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc9bcd29", new Object[]{this});
        }
        return this.g;
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.f;
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
        } else if (i == 1283637724) {
            this.h = x2z.a(i2);
        } else {
            super.h(i, i2);
        }
    }

    @Override // tb.fzy, tb.jkz
    public void l(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fdd01", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i == 314862070) {
            this.i = z;
        } else {
            super.l(i, z);
        }
    }

    @Override // tb.fzy
    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new zbn();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof zbn) && super.u(fzyVar)) {
            zbn zbnVar = (zbn) fzyVar;
            if (ckf.b(this.f, zbnVar.f) && ckf.b(this.g, zbnVar.g) && x2z.b(C(), zbnVar.C()) && this.i == zbnVar.i) {
                return true;
            }
        }
        return false;
    }
}
