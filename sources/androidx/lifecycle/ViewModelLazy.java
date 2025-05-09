package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.njg;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Ltb/njg;", "Ltb/wyf;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Ltb/wyf;Ltb/d1a;Ltb/d1a;Ltb/d1a;)V", "", "isInitialized", "()Z", "Ltb/wyf;", "Ltb/d1a;", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelLazy<VM extends ViewModel> implements njg<VM> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VM cached;
    private final d1a<CreationExtras> extrasProducer;
    private final d1a<ViewModelProvider.Factory> factoryProducer;
    private final d1a<ViewModelStore> storeProducer;
    private final wyf<VM> viewModelClass;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.ViewModelLazy$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<CreationExtras.Empty> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/ViewModelLazy$1");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // tb.d1a
        public final CreationExtras.Empty invoke() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CreationExtras.Empty) ipChange.ipc$dispatch("b508798f", new Object[]{this}) : CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(wyf<VM> wyfVar, d1a<? extends ViewModelStore> d1aVar, d1a<? extends ViewModelProvider.Factory> d1aVar2) {
        this(wyfVar, d1aVar, d1aVar2, null, 8, null);
        ckf.g(wyfVar, "viewModelClass");
        ckf.g(d1aVar, "storeProducer");
        ckf.g(d1aVar2, "factoryProducer");
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(wyf<VM> wyfVar, d1a<? extends ViewModelStore> d1aVar, d1a<? extends ViewModelProvider.Factory> d1aVar2, d1a<? extends CreationExtras> d1aVar3) {
        ckf.g(wyfVar, "viewModelClass");
        ckf.g(d1aVar, "storeProducer");
        ckf.g(d1aVar2, "factoryProducer");
        ckf.g(d1aVar3, "extrasProducer");
        this.viewModelClass = wyfVar;
        this.storeProducer = d1aVar;
        this.factoryProducer = d1aVar2;
        this.extrasProducer = d1aVar3;
    }

    @Override // tb.njg
    public VM getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VM) ((ViewModel) ipChange.ipc$dispatch("663b8bca", new Object[]{this}));
        }
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(wyf wyfVar, d1a d1aVar, d1a d1aVar2, d1a d1aVar3, int i, a07 a07Var) {
        this(wyfVar, d1aVar, d1aVar2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : d1aVar3);
    }
}
