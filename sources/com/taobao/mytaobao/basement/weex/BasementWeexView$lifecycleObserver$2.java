package com.taobao.mytaobao.basement.weex;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.w32;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/GenericLifecycleObserver;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementWeexView$lifecycleObserver$2 extends Lambda implements d1a<GenericLifecycleObserver> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BasementWeexView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView$lifecycleObserver$2(BasementWeexView basementWeexView) {
        super(0);
        this.this$0 = basementWeexView;
    }

    public static /* synthetic */ Object ipc$super(BasementWeexView$lifecycleObserver$2 basementWeexView$lifecycleObserver$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/weex/BasementWeexView$lifecycleObserver$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final GenericLifecycleObserver invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GenericLifecycleObserver) ipChange.ipc$dispatch("195431dc", new Object[]{this}) : new GenericLifecycleObserver() { // from class: com.taobao.mytaobao.basement.weex.BasementWeexView$lifecycleObserver$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                a mInstance;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                } else if (event != null) {
                    int i = w32.$EnumSwitchMapping$0[event.ordinal()];
                    if (i == 1) {
                        a mInstance2 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance2 != null) {
                            mInstance2.onActivityStart();
                        }
                    } else if (i == 2) {
                        a mInstance3 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance3 != null) {
                            mInstance3.onActivityResume();
                        }
                    } else if (i == 3) {
                        a mInstance4 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance4 != null) {
                            mInstance4.onActivityPause();
                        }
                    } else if (i == 4 && (mInstance = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance()) != null) {
                        mInstance.onActivityStop();
                    }
                }
            }
        };
    }
}
