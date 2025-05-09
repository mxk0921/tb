package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00132\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00132\u001a\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u0017\"\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 JK\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\"\u001a\u00020\u001e2\u001a\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u0017\"\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Ltb/wyf;", "modelClass", "", "getDefaultKey$lifecycle_viewmodel_release", "(Ltb/wyf;)Ljava/lang/String;", "getDefaultKey", "VM", "unsupportedCreateViewModel$lifecycle_viewmodel_release", "()Landroidx/lifecycle/ViewModel;", "unsupportedCreateViewModel", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory$lifecycle_viewmodel_release", "(Ljava/util/Collection;)Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory", "", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "getDefaultFactory$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras", "extras", "createViewModelFromInitializers$lifecycle_viewmodel_release", "(Ltb/wyf;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;", "createViewModelFromInitializers", "VIEW_MODEL_PROVIDER_DEFAULT_KEY", "Ljava/lang/String;", "ViewModelKey", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelProviders {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders$ViewModelKey;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class ViewModelKey implements CreationExtras.Key<String> {
        public static final ViewModelKey INSTANCE = new ViewModelKey();

        private ViewModelKey() {
        }
    }

    private ViewModelProviders() {
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(Collection<? extends ViewModelInitializer<?>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("933244e6", new Object[]{this, collection});
        }
        ckf.g(collection, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) collection.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CreationExtras) ipChange.ipc$dispatch("c265f6c4", new Object[]{this, viewModelStoreOwner});
        }
        ckf.g(viewModelStoreOwner, "owner");
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        }
        return CreationExtras.Empty.INSTANCE;
    }

    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("f58d4478", new Object[]{this, viewModelStoreOwner});
        }
        ckf.g(viewModelStoreOwner, "owner");
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
        }
        return DefaultViewModelProviderFactory.INSTANCE;
    }

    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dc6151a", new Object[]{this, wyfVar});
        }
        ckf.g(wyfVar, "modelClass");
        String canonicalName = ViewModelProviders_jvmKt.getCanonicalName(wyfVar);
        if (canonicalName != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VM) ((ViewModel) ipChange.ipc$dispatch("f7573a3f", new Object[]{this}));
        }
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(wyf<VM> wyfVar, CreationExtras creationExtras, ViewModelInitializer<?>... viewModelInitializerArr) {
        VM vm;
        ViewModelInitializer<?> viewModelInitializer;
        g1a<CreationExtras, ?> initializer$lifecycle_viewmodel_release;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VM) ((ViewModel) ipChange.ipc$dispatch("5d16f4c2", new Object[]{this, wyfVar, creationExtras, viewModelInitializerArr}));
        }
        ckf.g(wyfVar, "modelClass");
        ckf.g(creationExtras, "extras");
        ckf.g(viewModelInitializerArr, "initializers");
        int length = viewModelInitializerArr.length;
        while (true) {
            vm = null;
            if (i >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = viewModelInitializerArr[i];
            if (ckf.b(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), wyfVar)) {
                break;
            }
            i++;
        }
        if (!(viewModelInitializer == null || (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) == null)) {
            vm = (VM) ((ViewModel) initializer$lifecycle_viewmodel_release.invoke(creationExtras));
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(wyfVar)).toString());
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(ViewModelInitializer<?>... viewModelInitializerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("62e3a53f", new Object[]{this, viewModelInitializerArr});
        }
        ckf.g(viewModelInitializerArr, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
