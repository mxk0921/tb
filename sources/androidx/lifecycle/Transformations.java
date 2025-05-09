package androidx.lifecycle;

import androidx.arch.core.util.Function;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\u0007\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "transform", "map", "(Landroidx/lifecycle/LiveData;Ltb/g1a;)Landroidx/lifecycle/LiveData;", "Landroidx/arch/core/util/Function;", "mapFunction", "(Landroidx/lifecycle/LiveData;Landroidx/arch/core/util/Function;)Landroidx/lifecycle/LiveData;", "switchMap", "switchMapFunction", "distinctUntilChanged", "(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Transformations {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("3f23b477", new Object[]{liveData});
        }
        ckf.g(liveData, "<this>");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (liveData.isInitialized()) {
            ref$BooleanRef.element = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$distinctUntilChanged$1(mediatorLiveData, ref$BooleanRef)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, g1a<X, Y> g1aVar) {
        MediatorLiveData mediatorLiveData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("4f6136b3", new Object[]{liveData, g1aVar});
        }
        ckf.g(liveData, "<this>");
        ckf.g(g1aVar, "transform");
        if (liveData.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(g1aVar.invoke(liveData.getValue()));
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$1(mediatorLiveData, g1aVar)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, g1a<X, LiveData<Y>> g1aVar) {
        MediatorLiveData mediatorLiveData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("ad868207", new Object[]{liveData, g1aVar});
        }
        ckf.g(liveData, "<this>");
        ckf.g(g1aVar, "transform");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (liveData.isInitialized()) {
            LiveData<Y> invoke = g1aVar.invoke(liveData.getValue());
            if (invoke == null || !invoke.isInitialized()) {
                mediatorLiveData = new MediatorLiveData();
            } else {
                mediatorLiveData = new MediatorLiveData(invoke.getValue());
            }
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1(g1aVar, ref$ObjectRef, mediatorLiveData)));
        return mediatorLiveData;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData map(LiveData liveData, Function function) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("b4ef7af4", new Object[]{liveData, function});
        }
        ckf.g(liveData, "<this>");
        ckf.g(function, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$2(mediatorLiveData, function)));
        return mediatorLiveData;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function function) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("1eef4148", new Object[]{liveData, function});
        }
        ckf.g(liveData, "<this>");
        ckf.g(function, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations$switchMap$2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private LiveData liveData;

            public final LiveData getLiveData() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (LiveData) ipChange2.ipc$dispatch("14016fc3", new Object[]{this});
                }
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3d3a6b8", new Object[]{this, obj});
                    return;
                }
                LiveData liveData2 = (LiveData) Function.this.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 != liveData2) {
                    if (liveData3 != null) {
                        MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                        ckf.d(liveData3);
                        mediatorLiveData2.removeSource(liveData3);
                    }
                    this.liveData = liveData2;
                    if (liveData2 != null) {
                        MediatorLiveData mediatorLiveData3 = mediatorLiveData;
                        ckf.d(liveData2);
                        mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                    }
                }
            }

            public final void setLiveData(LiveData liveData2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2e3fb381", new Object[]{this, liveData2});
                } else {
                    this.liveData = liveData2;
                }
            }
        });
        return mediatorLiveData;
    }
}
