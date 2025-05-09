package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\u00012\u0019\b\b\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(Ltb/g1a;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "(Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;Ltb/g1a;)V", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class InitializerViewModelFactoryKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, g1a<? super CreationExtras, ? extends VM> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c3ff35", new Object[]{initializerViewModelFactoryBuilder, g1aVar});
            return;
        }
        ckf.g(initializerViewModelFactoryBuilder, "<this>");
        ckf.g(g1aVar, "initializer");
        ckf.m(4, "VM");
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(g1a<? super InitializerViewModelFactoryBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("afef8982", new Object[]{g1aVar});
        }
        ckf.g(g1aVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        g1aVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
