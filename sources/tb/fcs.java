package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.launcher.launcher_ng.TMSLaunchTaskType;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.jbs;
import tb.rwd;

/* compiled from: Taobao */
@TMSLaunchTaskType(superTask = c9s.class)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fcs extends c9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909742);
    }

    public fcs() {
        jfp.c(jbs.a.e(jbs.a.Companion.a()));
        IpChange ipChange = ExecutorType.$ipChange;
    }

    public static /* synthetic */ Object ipc$super(fcs fcsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/launcher_ng/task/TMSPageTask");
    }

    public JSONObject a(jbs jbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78d128a1", new Object[]{this, jbsVar});
        }
        ckf.g(jbsVar, "launchRuntime");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.TRUE);
        return jSONObject;
    }

    @Override // tb.c9s
    public ITMSPage e(jbs jbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("3e5fdbdd", new Object[]{this, jbsVar});
        }
        ckf.g(jbsVar, "launchRuntime");
        bbs instance = jbsVar.getInstance();
        rwd V = instance.V();
        ckf.f(V, "instance.pageFactory");
        String e0 = instance.e0();
        ckf.f(e0, "instance.url");
        return rwd.a.a(V, e0, null, a(jbsVar), null, 8, null);
    }
}
