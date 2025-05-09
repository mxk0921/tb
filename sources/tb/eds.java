package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.ability.TMSStorageBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class eds extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(834666584);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eds(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(eds edsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSStorageCopyStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSStorageCopyStep";
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        TMSStorageBridge.a aVar = TMSStorageBridge.Companion;
        bbs bbsVar = this.b;
        ckf.f(bbsVar, "mInstance");
        bbs bbsVar2 = this.b;
        ckf.f(bbsVar2, "mInstance");
        aVar.b(bbsVar, TMSInstanceExtKt.f(bbsVar2));
        i();
    }
}
