package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class htq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(974127109);
    }

    public static void a(hrt hrtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e90f0ab", new Object[]{hrtVar});
            return;
        }
        VExecutors.setThreadPoolFactory(hrtVar);
        VExecutors.setCurrentThreadGetter(new ez4() { // from class: tb.gtq
            @Override // tb.ez4
            public final Thread a() {
                return VirtualThread.currentThread();
            }
        });
        VExecutors.setThreadLocalFactory(new b());
    }
}
