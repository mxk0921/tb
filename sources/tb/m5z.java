package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.download.SingleDownloadTask;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m5z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final m5z INSTANCE = new m5z();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Long, SingleDownloadTask> f23804a = new ConcurrentHashMap<>();

    static {
        t2o.a(598737204);
        t2o.a(598737188);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public final void b(SingleDownloadTask singleDownloadTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0214f1f", new Object[]{this, singleDownloadTask});
        } else if (singleDownloadTask != null) {
            f23804a.put(Long.valueOf(singleDownloadTask.d()), singleDownloadTask);
            singleDownloadTask.i();
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7993c884", new Object[]{this, new Long(j)});
        } else {
            f23804a.remove(Long.valueOf(j));
        }
    }

    public final void a(mzy mzyVar, u1a<? super Short, ? super Short, xhv> u1aVar, g1a<? super izy, xhv> g1aVar, u1a<? super Short, ? super String, xhv> u1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41362795", new Object[]{this, mzyVar, u1aVar, g1aVar, u1aVar2});
        } else if (u1aVar2 != null) {
            u1aVar2.invoke((short) 1, "task is null");
        }
    }
}
