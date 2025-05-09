package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p2s extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_NAME = "TLGoodsLVPreload";

    /* renamed from: a  reason: collision with root package name */
    public Application f25843a;

    static {
        t2o.a(806355557);
    }

    public p2s(Application application) {
        super(TASK_NAME);
        this.f25843a = application;
    }

    public static /* synthetic */ Object ipc$super(p2s p2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/launcherx/TLGoodsLVPreload");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        cwd A = v2s.o().A();
        if (A != null) {
            try {
                A.c(TASK_NAME, "start preload lv.");
            } catch (Exception e) {
                if (A != null) {
                    A.c(TASK_NAME, "exception=" + e);
                    return;
                }
                return;
            }
        }
        d9m.n().preloadLVContainers(this.f25843a);
    }
}
