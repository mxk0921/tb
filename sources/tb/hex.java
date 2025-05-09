package tb;

import android.app.Application;
import android.taobao.windvane.extra.launch.WindVaneLaunchTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hex extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249519);
    }

    public hex(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(hex hexVar, String str, Object... objArr) {
        if (str.hashCode() == -1265548210) {
            super.f((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/early/WindVaneInitAtWelcomeTask");
    }

    @Override // tb.z8s
    public TMSInitTaskExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("45d39259", new Object[]{this});
        }
        return TMSInitTaskExecutorType.SYNC;
    }

    @Override // tb.z8s
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "WindVane.initAtWelcome";
    }

    @Override // tb.z8s
    public void f(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b491444e", new Object[]{this, application, hashMap});
            return;
        }
        super.f(application, hashMap);
        WindVaneLaunchTask.initAtWelcome(application, hashMap);
    }
}
