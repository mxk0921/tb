package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"(\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0016\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroid/view/View;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "addPoolingContainerListener", "(Landroid/view/View;Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "removePoolingContainerListener", "callPoolingContainerOnRelease", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "callPoolingContainerOnReleaseForChildren", "(Landroid/view/ViewGroup;)V", "", "PoolingContainerListenerHolderTag", TLogTracker.LEVEL_INFO, "IsPoolingContainerTag", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "getPoolingContainerListenerHolder", "(Landroid/view/View;)Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PoolingContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = R.id.is_pooling_container_tag;

    public static final void addPoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfce6796", new Object[]{view, poolingContainerListener});
            return;
        }
        ckf.g(view, "<this>");
        ckf.g(poolingContainerListener, DataReceiveMonitor.CB_LISTENER);
        getPoolingContainerListenerHolder(view).addListener(poolingContainerListener);
    }

    public static final void callPoolingContainerOnRelease(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d54e3c", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        for (View view2 : ViewKt.getAllViews(view)) {
            getPoolingContainerListenerHolder(view2).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaeb8df", new Object[]{viewGroup});
            return;
        }
        ckf.g(viewGroup, "<this>");
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            getPoolingContainerListenerHolder(view).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PoolingContainerListenerHolder) ipChange.ipc$dispatch("250a86ef", new Object[]{view});
        }
        int i = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(i, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final boolean isPoolingContainer(View view) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3503092a", new Object[]{view})).booleanValue();
        }
        ckf.g(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6398b9bf", new Object[]{view})).booleanValue();
        }
        ckf.g(view, "<this>");
        for (ViewParent viewParent : ViewKt.getAncestors(view)) {
            if ((viewParent instanceof View) && isPoolingContainer((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    public static final void removePoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173afa39", new Object[]{view, poolingContainerListener});
            return;
        }
        ckf.g(view, "<this>");
        ckf.g(poolingContainerListener, DataReceiveMonitor.CB_LISTENER);
        getPoolingContainerListenerHolder(view).removeListener(poolingContainerListener);
    }

    public static final void setPoolingContainer(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cee5a6", new Object[]{view, new Boolean(z)});
            return;
        }
        ckf.g(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z));
    }
}
