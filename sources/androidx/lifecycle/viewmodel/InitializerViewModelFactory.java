package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import kotlin.Metadata;
import tb.ckf;
import tb.gyf;
import tb.wyf;
import tb.zew;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", "VM", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... viewModelInitializerArr) {
        ckf.g(viewModelInitializerArr, "initializers");
        this.initializers = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return zew.a(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(wyf wyfVar, CreationExtras creationExtras) {
        return zew.c(this, wyfVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <VM extends ViewModel> VM create(Class<VM> cls, CreationExtras creationExtras) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VM) ((ViewModel) ipChange.ipc$dispatch("16b4753d", new Object[]{this, cls, creationExtras}));
        }
        ckf.g(cls, "modelClass");
        ckf.g(creationExtras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        wyf<VM> d = gyf.d(cls);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.initializers;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(d, creationExtras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
