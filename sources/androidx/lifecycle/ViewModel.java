package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import tb.ckf;
import tb.pg1;
import tb.uu4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bB\u001d\b\u0017\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\"\u00020\f¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "<init>", "()V", "Ltb/uu4;", "viewModelScope", "(Ltb/uu4;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ltb/uu4;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "Ltb/xhv;", "onCleared", "clear$lifecycle_viewmodel_release", pg1.ATOM_EXT_clear, "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af34c30", new Object[]{this, str, autoCloseable});
            return;
        }
        ckf.g(str, "key");
        ckf.g(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5739387", new Object[]{this});
            return;
        }
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((AutoCloseable) ipChange.ipc$dispatch("2dddae4f", new Object[]{this, str}));
        }
        ckf.g(str, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(str);
        }
        return null;
    }

    public void onCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3bad4", new Object[]{this});
        }
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0900ba", new Object[]{this, autoCloseable});
            return;
        }
        ckf.g(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(autoCloseable);
        }
    }

    public ViewModel(uu4 uu4Var) {
        ckf.g(uu4Var, "viewModelScope");
        this.impl = new ViewModelImpl(uu4Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1826f4b3", new Object[]{this, closeable});
            return;
        }
        ckf.g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(AutoCloseable... autoCloseableArr) {
        ckf.g(autoCloseableArr, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public ViewModel(uu4 uu4Var, AutoCloseable... autoCloseableArr) {
        ckf.g(uu4Var, "viewModelScope");
        ckf.g(autoCloseableArr, "closeables");
        this.impl = new ViewModelImpl(uu4Var, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ ViewModel(Closeable... closeableArr) {
        ckf.g(closeableArr, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
