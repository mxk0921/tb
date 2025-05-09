package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import tb.atj;
import tb.ckf;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0013J%\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", atj.CALL_BACK, "", "recursive", "Ltb/xhv;", "registerFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "unregisterFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "dispatchOnFragmentPreAttached", "(Landroidx/fragment/app/Fragment;Z)V", "dispatchOnFragmentAttached", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "dispatchOnFragmentPreCreated", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "dispatchOnFragmentCreated", "dispatchOnFragmentActivityCreated", "Landroid/view/View;", "v", "dispatchOnFragmentViewCreated", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "dispatchOnFragmentStarted", "dispatchOnFragmentResumed", "dispatchOnFragmentPaused", "dispatchOnFragmentStopped", "outState", "dispatchOnFragmentSaveInstanceState", "dispatchOnFragmentViewDestroyed", "dispatchOnFragmentDestroyed", "dispatchOnFragmentDetached", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "lifecycleCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "FragmentLifecycleCallbacksHolder", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentLifecycleCallbacksDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FragmentManager fragmentManager;
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> lifecycleCallbacks = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "callback", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "getCallback", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getRecursive", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class FragmentLifecycleCallbacksHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            ckf.g(fragmentLifecycleCallbacks, "callback");
            this.callback = fragmentLifecycleCallbacks;
            this.recursive = z;
        }

        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentManager.FragmentLifecycleCallbacks) ipChange.ipc$dispatch("d0a3d7a1", new Object[]{this});
            }
            return this.callback;
        }

        public final boolean getRecursive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68e03c07", new Object[]{this})).booleanValue();
            }
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        ckf.g(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
    }

    public final void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3b429", new Object[]{this, fragmentLifecycleCallbacks, new Boolean(z)});
            return;
        }
        ckf.g(fragmentLifecycleCallbacks, atj.CALL_BACK);
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    public final void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e779a4", new Object[]{this, fragmentLifecycleCallbacks});
            return;
        }
        ckf.g(fragmentLifecycleCallbacks, atj.CALL_BACK);
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.lifecycleCallbacks.get(i).getCallback() == fragmentLifecycleCallbacks) {
                        this.lifecycleCallbacks.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dispatchOnFragmentActivityCreated(Fragment fragment, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4ce0af", new Object[]{this, fragment, bundle, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentActivityCreated(this.fragmentManager, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentAttached(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58df1728", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentAttached(this.fragmentManager, fragment, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a73c8be", new Object[]{this, fragment, bundle, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentCreated(this.fragmentManager, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc59485", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentDestroyed(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentDetached(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce7321a", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentDetached(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentPaused(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52ba39e", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentPaused(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc533b7", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentPreAttached(this.fragmentManager, fragment, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b77f8d", new Object[]{this, fragment, bundle, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentPreCreated(this.fragmentManager, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentResumed(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7be69c7", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentResumed(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72396e95", new Object[]{this, fragment, bundle, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        ckf.g(bundle, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentSaveInstanceState(this.fragmentManager, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentStarted(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5053a95d", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentStarted(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentStopped(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42247791", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentStopped(this.fragmentManager, fragment);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30711259", new Object[]{this, fragment, view, bundle, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        ckf.g(view, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(fragment, view, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentViewCreated(this.fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e10360a", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            ckf.f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.getRecursive()) {
                next.getCallback().onFragmentViewDestroyed(this.fragmentManager, fragment);
            }
        }
    }
}
