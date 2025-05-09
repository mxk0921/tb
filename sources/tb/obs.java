package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Set;
import tb.pwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class obs implements pwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<mwd> f25288a = kfp.h(new v8s(), new kcs());
    public final pwd.a b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(851443742);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements pwd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pwd.a
        public void a(mwd mwdVar, jbs jbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a3e905c", new Object[]{this, mwdVar, jbsVar});
                return;
            }
            ckf.g(mwdVar, "task");
            ckf.g(jbsVar, "launchRuntime");
            TMSLogger.b("TMSLegacyWeexLauncherNG", "task: " + mwdVar.getName() + " onTaskSuccess");
        }

        @Override // tb.pwd.a
        public int b(mwd mwdVar, jbs jbsVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e1e2563", new Object[]{this, mwdVar, jbsVar, new Integer(i)})).intValue();
            }
            ckf.g(mwdVar, "task");
            ckf.g(jbsVar, "launchRuntime");
            TMSLogger.b("TMSLegacyWeexLauncherNG", "task: " + mwdVar.getName() + " onTaskFail");
            return i;
        }
    }

    static {
        t2o.a(851443741);
        t2o.a(839909727);
    }

    @Override // tb.pwd
    public Set<mwd> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8f43392f", new Object[]{this});
        }
        return this.f25288a;
    }

    @Override // tb.pwd
    public pwd.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwd.a) ipChange.ipc$dispatch("61a43bbe", new Object[]{this});
        }
        return this.b;
    }
}
