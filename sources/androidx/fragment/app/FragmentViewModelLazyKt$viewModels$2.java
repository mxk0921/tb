package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.njg;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends Lambda implements d1a<ViewModelStore> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ njg<ViewModelStoreOwner> $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$2(njg<? extends ViewModelStoreOwner> njgVar) {
        super(0);
        this.$owner$delegate = njgVar;
    }

    public static /* synthetic */ Object ipc$super(FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentViewModelLazyKt$viewModels$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ViewModelStore invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelStore) ipChange.ipc$dispatch("57f6fc68", new Object[]{this}) : FragmentViewModelLazyKt.m26access$viewModels$lambda0(this.$owner$delegate).getViewModelStore();
    }
}
