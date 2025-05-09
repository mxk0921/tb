package androidx.fragment.app;

import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentViewModelLazyKt$createViewModelLazy$2 extends Lambda implements d1a<CreationExtras> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$2(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    public static /* synthetic */ Object ipc$super(FragmentViewModelLazyKt$createViewModelLazy$2 fragmentViewModelLazyKt$createViewModelLazy$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentViewModelLazyKt$createViewModelLazy$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final CreationExtras invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CreationExtras) ipChange.ipc$dispatch("ec09e5b8", new Object[]{this}) : this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
    }
}
