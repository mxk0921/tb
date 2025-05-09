package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ1\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ltb/wyf;", "modelClass", "", "key", "getViewModel$lifecycle_viewmodel_release", "(Ltb/wyf;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "getViewModel", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelProviderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CreationExtras extras;
    private final ViewModelProvider.Factory factory;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore viewModelStore, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        ckf.g(viewModelStore, "store");
        ckf.g(factory, "factory");
        ckf.g(creationExtras, "extras");
        this.store = viewModelStore;
        this.factory = factory;
        this.extras = creationExtras;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, wyf wyfVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModel) ipChange.ipc$dispatch("abde6d6", new Object[]{viewModelProviderImpl, wyfVar, str, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(wyfVar);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(wyfVar, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(wyf<T> wyfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewModel) ipChange.ipc$dispatch("880e5b6", new Object[]{this, wyfVar, str}));
        }
        ckf.g(wyfVar, "modelClass");
        ckf.g(str, "key");
        T t = (T) this.store.get(str);
        if (wyfVar.a(t)) {
            ViewModelProvider.Factory factory = this.factory;
            if (factory instanceof ViewModelProvider.OnRequeryFactory) {
                ckf.d(t);
                ((ViewModelProvider.OnRequeryFactory) factory).onRequery(t);
            }
            ckf.e(t, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return t;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.extras);
        mutableCreationExtras.set(ViewModelProviders.ViewModelKey.INSTANCE, str);
        T t2 = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, wyfVar, mutableCreationExtras);
        this.store.put(str, t2);
        return t2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProviderImpl(ViewModelStoreOwner viewModelStoreOwner, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        this(viewModelStoreOwner.getViewModelStore(), factory, creationExtras);
        ckf.g(viewModelStoreOwner, "owner");
        ckf.g(factory, "factory");
        ckf.g(creationExtras, "extras");
    }
}
