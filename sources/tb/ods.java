package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.web.solution.TMSWaitUCReadyStep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ods extends a9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(840957953);
    }

    public ods(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(ods odsVar, String str, Object... objArr) {
        if (str.hashCode() == -2016635603) {
            super.a((lwd) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/TMSTinyAppLauncher");
    }

    @Override // tb.a9s, tb.owd
    public void a(lwd lwdVar) {
        TMSWaitUCReadyStep tMSWaitUCReadyStep;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
            return;
        }
        super.a(lwdVar);
        IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) p8s.b(IBizLaunchAdapter.class);
        if (iBizLaunchAdapter != null) {
            tMSWaitUCReadyStep = iBizLaunchAdapter.createBizLaunchStep(this.c, this);
        } else {
            tMSWaitUCReadyStep = null;
        }
        s8s s8sVar = new s8s(this.c, this);
        if (tMSWaitUCReadyStep != null) {
            s8sVar.j(tMSWaitUCReadyStep);
        } else {
            tMSWaitUCReadyStep = s8sVar;
        }
        boolean G2 = q9s.G2();
        if (G2) {
            TMSWaitUCReadyStep tMSWaitUCReadyStep2 = new TMSWaitUCReadyStep(this.c, this);
            tMSWaitUCReadyStep.j(tMSWaitUCReadyStep2);
            tMSWaitUCReadyStep = tMSWaitUCReadyStep2;
        }
        TMSLogger.f("TMSLauncher", "enableWaitWebReady: " + G2);
        tMSWaitUCReadyStep.j(new dcs(this.c, this));
        s8sVar.a();
    }
}
