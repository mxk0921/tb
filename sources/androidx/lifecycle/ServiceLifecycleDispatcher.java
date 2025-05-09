package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ltb/xhv;", "postDispatchRunnable", "(Landroidx/lifecycle/Lifecycle$Event;)V", "onServicePreSuperOnCreate", "()V", "onServicePreSuperOnBind", "onServicePreSuperOnStart", "onServicePreSuperOnDestroy", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "lastDispatchRunnable", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ServiceLifecycleDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Handler handler = new Handler();
    private DispatchRunnable lastDispatchRunnable;
    private final LifecycleRegistry registry;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/Lifecycle$Event;", "event", "<init>", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "Ltb/xhv;", "run", "()V", "Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "", "wasExecuted", "Z", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class DispatchRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Lifecycle.Event event;
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            ckf.g(lifecycleRegistry, "registry");
            ckf.g(event, "event");
            this.registry = lifecycleRegistry;
            this.event = event;
        }

        public final Lifecycle.Event getEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Lifecycle.Event) ipChange.ipc$dispatch("fe6b5285", new Object[]{this});
            }
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.wasExecuted) {
                this.registry.handleLifecycleEvent(this.event);
                this.wasExecuted = true;
            }
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        ckf.g(lifecycleOwner, "provider");
        this.registry = new LifecycleRegistry(lifecycleOwner);
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbff8238", new Object[]{this, event});
            return;
        }
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        this.handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    public Lifecycle getLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lifecycle) ipChange.ipc$dispatch("a130f2cb", new Object[]{this});
        }
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94765871", new Object[]{this});
        } else {
            postDispatchRunnable(Lifecycle.Event.ON_START);
        }
    }

    public void onServicePreSuperOnCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0268670", new Object[]{this});
        } else {
            postDispatchRunnable(Lifecycle.Event.ON_CREATE);
        }
    }

    public void onServicePreSuperOnDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb03634", new Object[]{this});
            return;
        }
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59cf75c", new Object[]{this});
        } else {
            postDispatchRunnable(Lifecycle.Event.ON_START);
        }
    }
}
