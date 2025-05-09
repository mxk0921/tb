package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class gsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        static {
            t2o.a(1018167317);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a();

        void b(Set<ow> set, Set<ow> set2);
    }

    static {
        t2o.a(1018167316);
    }

    public static gsj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsj) ipChange.ipc$dispatch("bffae6a6", new Object[0]);
        }
        return hsj.s();
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb9af7", new Object[]{this, bVar});
        } else {
            hsj.s().C(bVar);
        }
    }

    public abstract wrj c(ow owVar);
}
