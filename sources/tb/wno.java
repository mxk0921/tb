package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.Map;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wno {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MODULE_NAME = "MainSearch";
    public static final String SCENE_LOAD_MORE = "MainSearch_LoadMore";
    public static final String SCENE_NEW_SEARCH = "MainSearch_FirstScreen";

    /* renamed from: a  reason: collision with root package name */
    public boolean f30802a;
    public uy8 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792171);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792170);
    }

    public wno(boolean z) {
        uy8 uy8Var;
        String str;
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            if (z) {
                str = SCENE_NEW_SEARCH;
            } else {
                str = SCENE_LOAD_MORE;
            }
            tz8.a d = tz8Var.d(MODULE_NAME, str);
            if (d != null) {
                uy8Var = d.d();
                this.b = uy8Var;
            }
        }
        uy8Var = null;
        this.b = uy8Var;
    }

    public final void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249768ff", new Object[]{this, l});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.e(l);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10569556", new Object[]{this});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.t("failed");
        }
        this.f30802a = true;
        this.b = null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.finish();
        }
        this.f30802a = true;
        this.b = null;
    }

    public final Map<String, String> d() {
        raq a2;
        tz8 tz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9fd60393", new Object[]{this});
        }
        uy8 uy8Var = this.b;
        if (uy8Var == null || (a2 = uy8Var.a()) == null || (tz8Var = FalcoGlobalTracer.get()) == null) {
            return null;
        }
        return tz8Var.c(a2);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue();
        }
        return this.f30802a;
    }

    public final void f(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2306d0a7", new Object[]{this, l});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.o(l);
        }
    }

    public final void g(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f601053c", new Object[]{this, l});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.n0(l);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7382a68", new Object[]{this});
            return;
        }
        uy8 uy8Var = this.b;
        if (uy8Var != null) {
            uy8Var.t(tfb.UNFINISHED);
        }
        this.f30802a = true;
        this.b = null;
    }
}
