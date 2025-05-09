package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function1;", "Ltb/xhv;", "onChanged", "Landroidx/lifecycle/Observer;", "observe", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Ltb/g1a;)Landroidx/lifecycle/Observer;", "lifecycle-livedata-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LiveDataKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, final g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Observer) ipChange.ipc$dispatch("b26b91c6", new Object[]{liveData, lifecycleOwner, g1aVar});
        }
        ckf.g(liveData, "<this>");
        ckf.g(lifecycleOwner, "owner");
        ckf.g(g1aVar, "onChanged");
        Observer<T> liveDataKt$observe$wrappedObserver$1 = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3d3a6b8", new Object[]{this, t});
                } else {
                    g1aVar.invoke(t);
                }
            }
        };
        liveData.observe(lifecycleOwner, liveDataKt$observe$wrappedObserver$1);
        return liveDataKt$observe$wrappedObserver$1;
    }
}
