package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVanePreCreateTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855985);
    }

    public static /* synthetic */ Object ipc$super(WindVanePreCreateTask windVanePreCreateTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVanePreCreateTask");
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask, android.taobao.windvane.extra.launch.ILaunchInitTask
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "WindVanePreCreateTask";
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
        } else {
            WebViewPool.setUp(application);
        }
    }
}
