package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.gyf;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Ltb/wyf;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "createViewModel", "(Landroidx/lifecycle/ViewModelProvider$Factory;Ltb/wyf;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelProviderImpl_androidKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, wyf<VM> wyfVar, CreationExtras creationExtras) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VM) ((ViewModel) ipChange.ipc$dispatch("dc585489", new Object[]{factory, wyfVar, creationExtras}));
        }
        ckf.g(factory, "factory");
        ckf.g(wyfVar, "modelClass");
        ckf.g(creationExtras, "extras");
        try {
            try {
                return (VM) factory.create(wyfVar, creationExtras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(gyf.b(wyfVar));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(gyf.b(wyfVar), creationExtras);
        }
    }
}
