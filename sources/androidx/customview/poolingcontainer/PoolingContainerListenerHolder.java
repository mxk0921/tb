package androidx.customview.poolingcontainer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.ckf;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "<init>", "()V", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "addListener", "(Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "removeListener", "onRelease", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PoolingContainerListenerHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c146f375", new Object[]{this, poolingContainerListener});
            return;
        }
        ckf.g(poolingContainerListener, DataReceiveMonitor.CB_LISTENER);
        this.listeners.add(poolingContainerListener);
    }

    public final void onRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2933d9af", new Object[]{this});
            return;
        }
        for (int k = yz3.k(this.listeners); -1 < k; k--) {
            this.listeners.get(k).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d4fb2", new Object[]{this, poolingContainerListener});
            return;
        }
        ckf.g(poolingContainerListener, DataReceiveMonitor.CB_LISTENER);
        this.listeners.remove(poolingContainerListener);
    }
}
