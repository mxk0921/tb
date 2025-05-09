package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.launcher.launcher_ng.TMSLaunchTaskType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.Set;
import tb.jbs;

/* compiled from: Taobao */
@TMSLaunchTaskType(superTask = c9s.class)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class v8s extends fcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f = "TMSAsyncPageTask";
    public final Set<jbs.a> g = jfp.c(jbs.a.e(jbs.a.Companion.d()));
    public final ExecutorType h = ExecutorType.URGENT_DISPLAY;

    static {
        t2o.a(839909739);
    }

    public static /* synthetic */ Object ipc$super(v8s v8sVar, String str, Object... objArr) {
        if (str.hashCode() == 2026973345) {
            return super.a((jbs) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/launcher_ng/task/TMSAsyncPageTask");
    }

    @Override // tb.mwd
    public Set<jbs.a> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("e038254a", new Object[]{this}) : this.g;
    }

    @Override // tb.mwd
    public ExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorType) ipChange.ipc$dispatch("23c9b0d7", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.c9s, tb.mwd
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.fcs
    public JSONObject a(jbs jbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78d128a1", new Object[]{this, jbsVar});
        }
        ckf.g(jbsVar, "launchRuntime");
        JSONObject a2 = super.a(jbsVar);
        if (TMSInstanceExtKt.w(jbsVar.getInstance())) {
            a2.put((JSONObject) "isPreRender", (String) Boolean.TRUE);
        }
        return a2;
    }
}
