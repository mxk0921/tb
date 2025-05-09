package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import tb.ckf;
import tb.d1a;
import tb.njg;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\t\u0010\r\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000e\u0010\n\u001aQ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aa\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0016¨\u0006\u0018²\u0006\u0018\u0010\u0017\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0017\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Ltb/njg;", "viewModels", "(Landroidx/fragment/app/Fragment;Ltb/d1a;Ltb/d1a;)Ltb/njg;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "(Landroidx/fragment/app/Fragment;Ltb/d1a;Ltb/d1a;Ltb/d1a;)Ltb/njg;", "activityViewModels", "(Landroidx/fragment/app/Fragment;Ltb/d1a;)Ltb/njg;", "Ltb/wyf;", "viewModelClass", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "createViewModelLazy", "(Landroidx/fragment/app/Fragment;Ltb/wyf;Ltb/d1a;Ltb/d1a;)Ltb/njg;", "(Landroidx/fragment/app/Fragment;Ltb/wyf;Ltb/d1a;Ltb/d1a;Ltb/d1a;)Ltb/njg;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentViewModelLazyKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: access$viewModels$lambda-0  reason: not valid java name */
    public static final /* synthetic */ ViewModelStoreOwner m26access$viewModels$lambda0(njg njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStoreOwner) ipChange.ipc$dispatch("68781fe1", new Object[]{njgVar});
        }
        return m28viewModels$lambda0(njgVar);
    }

    /* renamed from: access$viewModels$lambda-1  reason: not valid java name */
    public static final /* synthetic */ ViewModelStoreOwner m27access$viewModels$lambda1(njg njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStoreOwner) ipChange.ipc$dispatch("8e0c28e2", new Object[]{njgVar});
        }
        return m29viewModels$lambda1(njgVar);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends ViewModel> njg<VM> activityViewModels(Fragment fragment, d1a<? extends ViewModelProvider.Factory> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("ba43ab53", new Object[]{fragment, d1aVar});
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg activityViewModels$default(Fragment fragment, d1a d1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("478ce22d", new Object[]{fragment, d1aVar, new Integer(i), obj});
        }
        ckf.m(4, "VM");
        throw null;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final /* synthetic */ njg createViewModelLazy(Fragment fragment, wyf wyfVar, d1a d1aVar, d1a d1aVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njg) ipChange.ipc$dispatch("2ce39a16", new Object[]{fragment, wyfVar, d1aVar, d1aVar2}) : createViewModelLazy(fragment, wyfVar, d1aVar, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), d1aVar2);
    }

    public static /* synthetic */ njg createViewModelLazy$default(Fragment fragment, wyf wyfVar, d1a d1aVar, d1a d1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("ecdf6aa4", new Object[]{fragment, wyfVar, d1aVar, d1aVar2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            d1aVar2 = null;
        }
        return createViewModelLazy(fragment, wyfVar, d1aVar, d1aVar2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends ViewModel> njg<VM> viewModels(Fragment fragment, d1a<? extends ViewModelStoreOwner> d1aVar, d1a<? extends ViewModelProvider.Factory> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("1793bbcb", new Object[]{fragment, d1aVar, d1aVar2});
        }
        a.a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(d1aVar));
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg viewModels$default(Fragment fragment, d1a d1aVar, d1a d1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("127d43b5", new Object[]{fragment, d1aVar, d1aVar2, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            d1aVar = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        a.a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(d1aVar));
        ckf.m(4, "VM");
        throw null;
    }

    /* renamed from: viewModels$lambda-0  reason: not valid java name */
    private static final ViewModelStoreOwner m28viewModels$lambda0(njg<? extends ViewModelStoreOwner> njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStoreOwner) ipChange.ipc$dispatch("5c741f21", new Object[]{njgVar});
        }
        return (ViewModelStoreOwner) njgVar.getValue();
    }

    /* renamed from: viewModels$lambda-1  reason: not valid java name */
    private static final ViewModelStoreOwner m29viewModels$lambda1(njg<? extends ViewModelStoreOwner> njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStoreOwner) ipChange.ipc$dispatch("82082822", new Object[]{njgVar});
        }
        return (ViewModelStoreOwner) njgVar.getValue();
    }

    public static final /* synthetic */ <VM extends ViewModel> njg<VM> activityViewModels(Fragment fragment, d1a<? extends CreationExtras> d1aVar, d1a<? extends ViewModelProvider.Factory> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("1c13123a", new Object[]{fragment, d1aVar, d1aVar2});
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg activityViewModels$default(Fragment fragment, d1a d1aVar, d1a d1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d9ba5fe6", new Object[]{fragment, d1aVar, d1aVar2, new Integer(i), obj});
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static final <VM extends ViewModel> njg<VM> createViewModelLazy(Fragment fragment, wyf<VM> wyfVar, d1a<? extends ViewModelStore> d1aVar, d1a<? extends CreationExtras> d1aVar2, d1a<? extends ViewModelProvider.Factory> d1aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("becf34fd", new Object[]{fragment, wyfVar, d1aVar, d1aVar2, d1aVar3});
        }
        if (d1aVar3 == null) {
            d1aVar3 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(wyfVar, d1aVar, d1aVar3, d1aVar2);
    }

    public static /* synthetic */ njg createViewModelLazy$default(Fragment fragment, wyf wyfVar, d1a d1aVar, d1a d1aVar2, d1a d1aVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d2354c5d", new Object[]{fragment, wyfVar, d1aVar, d1aVar2, d1aVar3, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            d1aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i & 8) != 0) {
            d1aVar3 = null;
        }
        return createViewModelLazy(fragment, wyfVar, d1aVar, d1aVar2, d1aVar3);
    }

    public static final /* synthetic */ <VM extends ViewModel> njg<VM> viewModels(Fragment fragment, d1a<? extends ViewModelStoreOwner> d1aVar, d1a<? extends CreationExtras> d1aVar2, d1a<? extends ViewModelProvider.Factory> d1aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("b24342b2", new Object[]{fragment, d1aVar, d1aVar2, d1aVar3});
        }
        a.a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(d1aVar));
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg viewModels$default(Fragment fragment, d1a d1aVar, d1a d1aVar2, d1a d1aVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("7d82a16e", new Object[]{fragment, d1aVar, d1aVar2, d1aVar3, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            d1aVar = new FragmentViewModelLazyKt$viewModels$5(fragment);
        }
        a.a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(d1aVar));
        ckf.m(4, "VM");
        throw null;
    }
}
