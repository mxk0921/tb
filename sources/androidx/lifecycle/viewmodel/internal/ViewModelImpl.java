package androidx.lifecycle.viewmodel.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.d04;
import tb.pg1;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000fJ!\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "Ltb/uu4;", "viewModelScope", "(Ltb/uu4;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ltb/uu4;[Ljava/lang/AutoCloseable;)V", "closeable", "Ltb/xhv;", "closeWithRuntimeException", "(Ljava/lang/AutoCloseable;)V", pg1.ATOM_EXT_clear, "", "key", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", OConstant.DIMEN_FILE_LOCK, "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "", "keyToCloseables", "Ljava/util/Map;", "", "Ljava/util/Set;", "", "isCleared", "Z", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    public static final /* synthetic */ void access$closeWithRuntimeException(ViewModelImpl viewModelImpl, AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a441df5", new Object[]{viewModelImpl, autoCloseable});
        } else {
            viewModelImpl.closeWithRuntimeException(autoCloseable);
        }
    }

    public static final /* synthetic */ Set access$getCloseables$p(ViewModelImpl viewModelImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("19251b7e", new Object[]{viewModelImpl});
        }
        return viewModelImpl.closeables;
    }

    public static final /* synthetic */ Map access$getKeyToCloseables$p(ViewModelImpl viewModelImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("651d9c56", new Object[]{viewModelImpl});
        }
        return viewModelImpl.keyToCloseables;
    }

    private final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4554b496", new Object[]{this, autoCloseable});
        } else if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af34c30", new Object[]{this, str, autoCloseable});
            return;
        }
        ckf.g(str, "key");
        ckf.g(autoCloseable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable2 = (AutoCloseable) access$getKeyToCloseables$p(this).put(str, autoCloseable);
        }
        closeWithRuntimeException(autoCloseable2);
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (!this.isCleared) {
            this.isCleared = true;
            synchronized (this.lock) {
                try {
                    for (AutoCloseable autoCloseable : access$getKeyToCloseables$p(this).values()) {
                        access$closeWithRuntimeException(this, autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : access$getCloseables$p(this)) {
                        access$closeWithRuntimeException(this, autoCloseable2);
                    }
                    access$getCloseables$p(this).clear();
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((AutoCloseable) ipChange.ipc$dispatch("2dddae4f", new Object[]{this, str}));
        }
        ckf.g(str, "key");
        synchronized (this.lock) {
            t = (T) ((AutoCloseable) access$getKeyToCloseables$p(this).get(str));
        }
        return t;
    }

    public ViewModelImpl(uu4 uu4Var) {
        ckf.g(uu4Var, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(uu4Var));
    }

    public final void addCloseable(AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0900ba", new Object[]{this, autoCloseable});
            return;
        }
        ckf.g(autoCloseable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.lock) {
            access$getCloseables$p(this).add(autoCloseable);
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public ViewModelImpl(AutoCloseable... autoCloseableArr) {
        ckf.g(autoCloseableArr, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        d04.w(linkedHashSet, autoCloseableArr);
    }

    public ViewModelImpl(uu4 uu4Var, AutoCloseable... autoCloseableArr) {
        ckf.g(uu4Var, "viewModelScope");
        ckf.g(autoCloseableArr, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(uu4Var));
        d04.w(linkedHashSet, autoCloseableArr);
    }
}
