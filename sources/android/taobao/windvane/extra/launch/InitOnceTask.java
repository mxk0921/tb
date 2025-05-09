package android.taobao.windvane.extra.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.r9u;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class InitOnceTask implements ILaunchInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicBoolean mInitialized = new AtomicBoolean(false);

    static {
        t2o.a(989855971);
        t2o.a(989855970);
    }

    @Override // android.taobao.windvane.extra.launch.ILaunchInitTask
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "InitOnceTask";
    }

    public abstract void initImpl(Application application, HashMap<String, Object> hashMap);

    @Override // android.taobao.windvane.extra.launch.ILaunchInitTask
    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (this.mInitialized.compareAndSet(false, true)) {
            r9u.b(getName());
            initImpl(application, hashMap);
            r9u.d();
        }
    }
}
