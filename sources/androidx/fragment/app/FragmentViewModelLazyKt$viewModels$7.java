package androidx.fragment.app;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.njg;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$7 extends Lambda implements d1a<CreationExtras> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d1a<CreationExtras> $extrasProducer;
    public final /* synthetic */ njg<ViewModelStoreOwner> $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$7(d1a<? extends CreationExtras> d1aVar, njg<? extends ViewModelStoreOwner> njgVar) {
        super(0);
        this.$extrasProducer = d1aVar;
        this.$owner$delegate = njgVar;
    }

    public static /* synthetic */ Object ipc$super(FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final CreationExtras invoke() {
        CreationExtras invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CreationExtras) ipChange.ipc$dispatch("ec09e5b8", new Object[]{this});
        }
        d1a<CreationExtras> d1aVar = this.$extrasProducer;
        if (d1aVar != null && (invoke = d1aVar.invoke()) != null) {
            return invoke;
        }
        ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.m27access$viewModels$lambda1(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
        return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }
}
