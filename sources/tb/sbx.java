package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.dzn;
import tb.pxw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class sbx extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements dzn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f27934a;

        public a(CountDownLatch countDownLatch) {
            this.f27934a = countDownLatch;
        }

        @Override // tb.dzn.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
                return;
            }
            TMSLogger.b("TRWidget", "remote mnn plugin load success!");
            this.f27934a.countDown();
        }

        @Override // tb.dzn.d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28289ca5", new Object[]{this});
                return;
            }
            TMSLogger.b("TRWidget", "remote mnn plugin load failed!");
            this.f27934a.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements pxw.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f27935a;

        public b(CountDownLatch countDownLatch) {
            this.f27935a = countDownLatch;
        }

        @Override // tb.pxw.b
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
                return;
            }
            TMSLogger.b("TRWidget", "remote wasm plugin load failed!");
            this.f27935a.countDown();
        }

        @Override // tb.pxw.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            TMSLogger.b("TRWidget", "remote wasm plugin load success!");
            this.f27935a.countDown();
        }
    }

    static {
        t2o.a(852492371);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbx(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(sbx sbxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/WidgetEngineStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "WidgetEngineStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        d5x d;
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        ckf.f(bbsVar, "mInstance");
        if (!ckf.b(r8s.B(bbsVar), "3.0-vue")) {
            g(new eas("TMS_ERR_INVALID_RUNTIME_TYPE", "not supported widget version", ""));
            return;
        }
        try {
            d = com.taobao.android.weex.b.d();
            IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
            applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
        } catch (Throwable th) {
            TMSLogger.d("WidgetEngineStep", th);
        }
        if (applicationContext != null) {
            d.c(applicationContext);
            bbs bbsVar2 = this.b;
            ckf.f(bbsVar2, "mInstance");
            if (TMSInstanceExtKt.s(bbsVar2) && !MUSEngine.hasJSBindingPlugin(qu3.MNN)) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                TMSLogger.b("TRWidget", "need download remote mnn plugin!");
                dzn.a(new a(countDownLatch));
                try {
                    countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    TMSLogger.d("TRWidget", th2);
                    countDownLatch.countDown();
                }
                if (!MUSEngine.hasJSBindingPlugin(qu3.MNN)) {
                    g(new eas("MNN_INIT_FAIL", "mnn plugin init fail", ""));
                    TMSLogger.b("TRWidget", "remote mnn plugin load timeout!");
                    return;
                }
            }
            bbs bbsVar3 = this.b;
            ckf.f(bbsVar3, "mInstance");
            if (TMSInstanceExtKt.s(bbsVar3) && !MUSEngine.hasJSBindingPlugin("wasm_binding")) {
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                TMSLogger.b("TRWidget", "need download remote wasm plugin!");
                pxw.a(new b(countDownLatch2));
                try {
                    countDownLatch2.await(3000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th3) {
                    TMSLogger.d("TRWidget", th3);
                    countDownLatch2.countDown();
                }
                if (!MUSEngine.hasJSBindingPlugin("wasm_binding")) {
                    g(new eas("WASM_INIT_FAIL", "wasm plugin init fail", ""));
                    TMSLogger.b("TRWidget", "remote wasm plugin load timeout!");
                    return;
                }
            }
            i();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }
}
