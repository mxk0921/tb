package com.taobao.taobaoavsdk.Tracer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.HashMap;
import java.util.Map;
import tb.iu0;
import tb.qz8;
import tb.s9u;
import tb.sy8;
import tb.t2o;
import tb.tfb;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseAnalysis implements tfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public final tz8 f12970a;
    public final boolean b;
    public sy8 c;
    public final Map<String, qz8> d = new HashMap();
    public iu0 e = new iu0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum Stage {
        INIT_PLAYER,
        PREPARE,
        PLAYING,
        PAUSE,
        RELEASE,
        SEEK,
        MUTE,
        FIRST_FRAME,
        VIDEO_STALL,
        VIDEO_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Stage stage, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/Tracer/BaseAnalysis$Stage");
        }

        public static Stage valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Stage) ipChange.ipc$dispatch("aa96014e", new Object[]{str});
            }
            return (Stage) Enum.valueOf(Stage.class, str);
        }
    }

    static {
        t2o.a(774897852);
        t2o.a(774897854);
    }

    public BaseAnalysis() {
        tz8 tz8Var = FalcoGlobalTracer.get();
        this.f12970a = tz8Var;
        if (tz8Var != null) {
            this.b = true;
            if (!f) {
                s9u.u().v();
                f = true;
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc043a9", new Object[]{this})).booleanValue();
        }
        if (d() && this.c != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1727589b", new Object[]{this})).booleanValue();
        }
        if (enable() && this.b) {
            return true;
        }
        return false;
    }

    public iu0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iu0) ipChange.ipc$dispatch("c0ddee1d", new Object[]{this});
        }
        return this.e;
    }

    public qz8 f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("6e7e9766", new Object[]{this, str});
        }
        if (d() && !((HashMap) this.d).isEmpty()) {
            return (qz8) ((HashMap) this.d).get(str);
        }
        return null;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e0d08e", new Object[]{this, str});
        } else if (c()) {
            this.c.A(str);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.e = new iu0();
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10b21f3", new Object[]{this, str, str2});
        } else if (c()) {
            this.c.X(str, str2);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3935f4e", new Object[]{this, str});
        } else if (c()) {
            this.c.t(str);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4003bf", new Object[]{this});
        } else if (d()) {
            this.c = this.f12970a.d(tfb.MODULE_SDK_PAGE, tfb.SCENE_PREFIX + a()).i();
            for (String str : b()) {
                ((HashMap) this.d).put(str, this.c.n(str));
            }
        }
    }

    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c178e9", new Object[]{this, str, str2});
            return;
        }
        qz8 f2 = f(str);
        if (f2 != null) {
            this.c.t("failed");
            f2.a(null, str2);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e12aa3", new Object[]{this, str});
            return;
        }
        qz8 f2 = f(str);
        if (f2 != null) {
            f2.c(null);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba46df95", new Object[]{this, str});
            return;
        }
        qz8 f2 = f(str);
        if (f2 != null) {
            f2.b(null);
        }
    }

    public void o(iu0 iu0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f273d615", new Object[]{this, iu0Var});
        } else if (iu0Var != null) {
            iu0 iu0Var2 = this.e;
            iu0Var2.f21584a = iu0Var.f21584a;
            iu0Var2.b = iu0Var.b;
            iu0Var2.c = iu0Var.c;
            iu0Var2.d = iu0Var.d;
            iu0Var2.e = iu0Var.e;
            iu0Var2.f = iu0Var.f;
            iu0Var2.g = iu0Var.g;
            iu0Var2.h = iu0Var.h;
            iu0Var2.i = iu0Var.i;
            iu0Var2.j = iu0Var.j;
            iu0Var2.k = iu0Var.k;
            iu0Var2.l = iu0Var.l;
            iu0Var2.m = iu0Var.m;
            iu0Var2.n = iu0Var.n;
            iu0Var2.o = iu0Var.o;
            iu0Var2.p = iu0Var.p;
        }
    }
}
