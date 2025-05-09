package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.launcher.step.TMSBasePageStep;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dcs extends TMSBasePageStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909752);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcs(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(dcs dcsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/TMSPageStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSPageStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBasePageStep
    public ITMSPage m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("2b198197", new Object[]{this});
        }
        rwd V = this.b.V();
        ckf.f(V, "mInstance.pageFactory");
        String e0 = this.b.e0();
        ckf.f(e0, "mInstance.url");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.TRUE);
        xhv xhvVar = xhv.INSTANCE;
        ITMSPage a2 = rwd.a.a(V, e0, null, jSONObject, null, 8, null);
        this.b.W().a(a2);
        return a2;
    }
}
