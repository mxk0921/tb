package androidx.activity;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "", "enabled", "<init>", "(Z)V", "Ltb/xhv;", "remove", "()V", "Landroidx/activity/BackEventCompat;", "backEvent", "handleOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/Cancellable;", "cancellable", "addCancellable", "(Landroidx/activity/Cancellable;)V", "removeCancellable", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "enabledChangedCallback", "Ltb/d1a;", "getEnabledChangedCallback$activity_release", "()Ltb/d1a;", "setEnabledChangedCallback$activity_release", "(Ltb/d1a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class OnBackPressedCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private d1a<xhv> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(Cancellable cancellable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39f207d", new Object[]{this, cancellable});
            return;
        }
        ckf.g(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final d1a<xhv> getEnabledChangedCallback$activity_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("872fd589", new Object[]{this});
        }
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95b1c4a", new Object[]{this});
        }
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0dc6b05", new Object[]{this, backEventCompat});
        } else {
            ckf.g(backEventCompat, "backEvent");
        }
    }

    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cbe1cc", new Object[]{this, backEventCompat});
        } else {
            ckf.g(backEventCompat, "backEvent");
        }
    }

    public final boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.isEnabled;
    }

    public final void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        for (Cancellable cancellable : this.cancellables) {
            cancellable.cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28724b20", new Object[]{this, cancellable});
            return;
        }
        ckf.g(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isEnabled = z;
        d1a<xhv> d1aVar = this.enabledChangedCallback;
        if (d1aVar != null) {
            d1aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4043df0f", new Object[]{this, d1aVar});
        } else {
            this.enabledChangedCallback = d1aVar;
        }
    }
}
