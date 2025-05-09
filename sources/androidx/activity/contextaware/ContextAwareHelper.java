package androidx.activity.contextaware;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "<init>", "()V", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "context", "dispatchOnContextAvailable", "(Landroid/content/Context;)V", "clearAvailableContext", "", "listeners", "Ljava/util/Set;", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContextAwareHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile Context context;
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c378f99", new Object[]{this, onContextAvailableListener});
            return;
        }
        ckf.g(onContextAvailableListener, DataReceiveMonitor.CB_LISTENER);
        Context context = this.context;
        if (context != null) {
            onContextAvailableListener.onContextAvailable(context);
        }
        this.listeners.add(onContextAvailableListener);
    }

    public final void clearAvailableContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ac21a", new Object[]{this});
        } else {
            this.context = null;
        }
    }

    public final void dispatchOnContextAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd92720e", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        this.context = context;
        for (OnContextAvailableListener onContextAvailableListener : this.listeners) {
            onContextAvailableListener.onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b325d120", new Object[]{this});
        }
        return this.context;
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7553d16", new Object[]{this, onContextAvailableListener});
            return;
        }
        ckf.g(onContextAvailableListener, DataReceiveMonitor.CB_LISTENER);
        this.listeners.remove(onContextAvailableListener);
    }
}
