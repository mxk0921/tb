package androidx.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.njg;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Ltb/njg;", "viewModels", "(Landroidx/activity/ComponentActivity;Ltb/d1a;)Ltb/njg;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "(Landroidx/activity/ComponentActivity;Ltb/d1a;Ltb/d1a;)Ltb/njg;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityViewModelLazyKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends ViewModel> njg<VM> viewModels(ComponentActivity componentActivity, d1a<? extends ViewModelProvider.Factory> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("b231e04f", new Object[]{componentActivity, d1aVar});
        }
        ckf.g(componentActivity, "<this>");
        if (d1aVar == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg viewModels$default(ComponentActivity componentActivity, d1a d1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("6cb83e0b", new Object[]{componentActivity, d1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            d1aVar = null;
        }
        ckf.g(componentActivity, "<this>");
        if (d1aVar == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static final /* synthetic */ <VM extends ViewModel> njg<VM> viewModels(ComponentActivity componentActivity, d1a<? extends CreationExtras> d1aVar, d1a<? extends ViewModelProvider.Factory> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("8e8e5736", new Object[]{componentActivity, d1aVar, d1aVar2});
        }
        ckf.g(componentActivity, "<this>");
        if (d1aVar2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        ckf.m(4, "VM");
        throw null;
    }

    public static /* synthetic */ njg viewModels$default(ComponentActivity componentActivity, d1a d1aVar, d1a d1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("63cec3c4", new Object[]{componentActivity, d1aVar, d1aVar2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            d1aVar2 = null;
        }
        ckf.g(componentActivity, "<this>");
        if (d1aVar2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        ckf.m(4, "VM");
        throw null;
    }
}
