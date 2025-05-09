package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.c;
import com.flybird.deploy.model.FBUpdatePolicy$DeploymentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tu8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f28961a;
    public String b;
    public c c;
    public vu8 d;
    @Deprecated
    public uu8 e;
    @Deprecated
    public com.flybird.deploy.callback.b f;
    public FBUpdatePolicy$DeploymentType g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tu8 f28962a = new tu8();

        public tu8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tu8) ipChange.ipc$dispatch("4101a59b", new Object[]{this});
            }
            pgh.o(this.f28962a.f28961a, "missing appCtx");
            pgh.o(this.f28962a.b, "missing bundlePath");
            tu8 tu8Var = this.f28962a;
            if (tu8Var.c == null) {
                tu8Var.c = c.alwaysFalse;
            }
            pgh.o(tu8Var.g, "missing deployment type");
            return this.f28962a;
        }

        public b b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6d6b2c2f", new Object[]{this, context});
            }
            this.f28962a.f28961a = context.getApplicationContext();
            return this;
        }

        public b c(FBUpdatePolicy$DeploymentType fBUpdatePolicy$DeploymentType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e8e9eb53", new Object[]{this, fBUpdatePolicy$DeploymentType});
            }
            this.f28962a.g = fBUpdatePolicy$DeploymentType;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("70a90949", new Object[]{this, str});
            }
            this.f28962a.b = str;
            return this;
        }

        @Deprecated
        public b e(com.flybird.deploy.callback.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8a17b5dc", new Object[]{this, bVar});
            }
            this.f28962a.f = bVar;
            return this;
        }

        @Deprecated
        public b f(uu8 uu8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bc558e6", new Object[]{this, uu8Var});
            }
            this.f28962a.e = uu8Var;
            return this;
        }

        public b g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a96c80f3", new Object[]{this, cVar});
            }
            this.f28962a.c = cVar;
            return this;
        }

        public b h(vu8 vu8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("942393f5", new Object[]{this, vu8Var});
            }
            this.f28962a.d = vu8Var;
            return this;
        }
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        return this.f28961a;
    }

    public FBUpdatePolicy$DeploymentType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBUpdatePolicy$DeploymentType) ipChange.ipc$dispatch("9993f9e6", new Object[]{this});
        }
        return this.g;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2963a75c", new Object[]{this});
        }
        return this.b;
    }

    @Deprecated
    public com.flybird.deploy.callback.b d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.flybird.deploy.callback.b) ipChange.ipc$dispatch("2fade40d", new Object[]{this});
        }
        return this.f;
    }

    @Deprecated
    public uu8 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uu8) ipChange.ipc$dispatch("ec9d1fed", new Object[]{this});
        }
        return this.e;
    }

    public c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bd2d0a24", new Object[]{this});
        }
        return this.c;
    }

    public vu8 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vu8) ipChange.ipc$dispatch("cd68fc68", new Object[]{this});
        }
        return this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBTemplateDeciderCreateOptions{applicationContext=" + this.f28961a + ", bundlePath='" + this.b + "', shouldRetryHandler=" + this.c + ", statusListener=" + this.d + ", errorLogListener=" + this.e + '}';
    }

    public tu8() {
    }
}
