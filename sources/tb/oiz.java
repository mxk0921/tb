package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oiz implements mmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321815);
    }

    @Override // tb.mmc
    public void a(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759e161d", new Object[]{this, preloadTaskEntity});
        } else if (preloadTaskEntity.items != null) {
            byj.d0();
            if (preloadTaskEntity.items.size() > byj.f()) {
                preloadTaskEntity.items.subList(byj.f(), preloadTaskEntity.items.size()).clear();
            }
        }
    }
}
