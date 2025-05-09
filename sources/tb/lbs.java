package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.web.solution.TMSWaitUCReadyStep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lbs extends a9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(850395187);
    }

    public lbs(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(lbs lbsVar, String str, Object... objArr) {
        if (str.hashCode() == -2016635603) {
            super.a((lwd) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSLegacyWebLauncher");
    }

    @Override // tb.a9s, tb.owd
    public void a(lwd lwdVar) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
            return;
        }
        super.a(lwdVar);
        TMSWaitUCReadyStep tMSWaitUCReadyStep = new TMSWaitUCReadyStep(this.c, this);
        tMSWaitUCReadyStep.j(new dcs(this.c, this));
        tMSWaitUCReadyStep.a();
        ViewGroup a2 = ads.INSTANCE.a(this.c);
        if (a2 != null && (bbsVar = this.c) != null) {
            bbsVar.Z().createSplashView(a2);
        }
    }
}
