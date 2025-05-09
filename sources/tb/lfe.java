package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class lfe extends l32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float d = o1p.a(2.0f);
    public static final float e = o1p.a(10.0f);
    public static final int f = o1p.a(3.0f);
    public static final float g = o1p.a(0.5f);
    public final xfe b;
    public final View c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792377);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c84ce3b", new Object[]{this})).floatValue();
            }
            return lfe.d();
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6acf238", new Object[]{this})).floatValue();
            }
            return lfe.e();
        }

        public final float c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4f0472b4", new Object[]{this})).floatValue();
            }
            return lfe.f();
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fec9d2b", new Object[]{this})).intValue();
            }
            return lfe.g();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792376);
    }

    public lfe(xfe xfeVar, View view) {
        ckf.g(xfeVar, "itemInfo");
        ckf.g(view, "view");
        this.b = xfeVar;
        this.c = view;
    }

    public static final /* synthetic */ float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85b92804", new Object[0])).floatValue();
        }
        return g;
    }

    public static final /* synthetic */ float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a53a56e7", new Object[0])).floatValue();
        }
        return d;
    }

    public static final /* synthetic */ float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("699e04eb", new Object[0])).floatValue();
        }
        return e;
    }

    public static final /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a97d1c7a", new Object[0])).intValue();
        }
        return f;
    }

    public static /* synthetic */ Object ipc$super(lfe lfeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/icons/IconDrawable");
    }

    public final xfe h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfe) ipChange.ipc$dispatch("8e7d0ccb", new Object[]{this});
        }
        return this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06da122", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        }
    }
}
