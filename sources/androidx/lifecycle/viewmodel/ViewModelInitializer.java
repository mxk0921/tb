package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.gyf;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bB0\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Ltb/wyf;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "<init>", "(Ltb/wyf;Ltb/g1a;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Ltb/g1a;)V", "Ltb/wyf;", "getClazz$lifecycle_viewmodel_release", "()Ltb/wyf;", "Ltb/g1a;", "getInitializer$lifecycle_viewmodel_release", "()Ltb/g1a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final wyf<T> clazz;
    private final g1a<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(wyf<T> wyfVar, g1a<? super CreationExtras, ? extends T> g1aVar) {
        ckf.g(wyfVar, "clazz");
        ckf.g(g1aVar, "initializer");
        this.clazz = wyfVar;
        this.initializer = g1aVar;
    }

    public final wyf<T> getClazz$lifecycle_viewmodel_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wyf) ipChange.ipc$dispatch("70d917e0", new Object[]{this});
        }
        return this.clazz;
    }

    public final g1a<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("da7ab2b6", new Object[]{this});
        }
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> cls, g1a<? super CreationExtras, ? extends T> g1aVar) {
        this(gyf.d(cls), g1aVar);
        ckf.g(cls, "clazz");
        ckf.g(g1aVar, "initializer");
    }
}
