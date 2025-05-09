package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/OnBackPressedCallback;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", "onBackPressed", "addCallback", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLtb/g1a;)Landroidx/activity/OnBackPressedCallback;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class OnBackPressedDispatcherKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z, final g1a<? super OnBackPressedCallback, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnBackPressedCallback) ipChange.ipc$dispatch("2cb4742", new Object[]{onBackPressedDispatcher, lifecycleOwner, new Boolean(z), g1aVar});
        }
        ckf.g(onBackPressedDispatcher, "<this>");
        ckf.g(g1aVar, "onBackPressed");
        OnBackPressedCallback onBackPressedDispatcherKt$addCallback$callback$1 = new OnBackPressedCallback(z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(OnBackPressedDispatcherKt$addCallback$callback$1 onBackPressedDispatcherKt$addCallback$callback$12, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcherKt$addCallback$callback$1");
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4681e31b", new Object[]{this});
                } else {
                    g1aVar.invoke(this);
                }
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedDispatcherKt$addCallback$callback$1);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedDispatcherKt$addCallback$callback$1);
        }
        return onBackPressedDispatcherKt$addCallback$callback$1;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnBackPressedCallback) ipChange.ipc$dispatch("9c08e9ce", new Object[]{onBackPressedDispatcher, lifecycleOwner, new Boolean(z), g1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, g1aVar);
    }
}
