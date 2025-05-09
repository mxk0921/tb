package com.taobao.mytaobao.scroll;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.weex_framework.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1", "invoke", "()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1;"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexNestedScrollHelper$scrollListener$2 extends Lambda implements d1a<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexNestedScrollHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexNestedScrollHelper$scrollListener$2(WeexNestedScrollHelper weexNestedScrollHelper) {
        super(0);
        this.this$0 = weexNestedScrollHelper;
    }

    public static /* synthetic */ Object ipc$super(WeexNestedScrollHelper$scrollListener$2 weexNestedScrollHelper$scrollListener$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2$1] */
    @Override // tb.d1a
    public final AnonymousClass1 invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnonymousClass1) ipChange.ipc$dispatch("9ead5379", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                super.onScrolled(recyclerView, i, i2);
                if (i2 != 0) {
                    if (!WeexNestedScrollHelper.e(WeexNestedScrollHelper$scrollListener$2.this.this$0).canScrollVertically(2)) {
                        WeexNestedScrollHelper$scrollListener$2.this.this$0.h(true);
                    } else {
                        WeexNestedScrollHelper$scrollListener$2.this.this$0.h(false);
                    }
                    if (i2 > 0 && !WeexNestedScrollHelper.e(WeexNestedScrollHelper$scrollListener$2.this.this$0).canScrollVertically(2) && WeexNestedScrollHelper.f(WeexNestedScrollHelper$scrollListener$2.this.this$0) > 0) {
                        a mInstance = WeexNestedScrollHelper.c(WeexNestedScrollHelper$scrollListener$2.this.this$0).getMInstance();
                        if (mInstance != null) {
                            mInstance.scrollToDecelerate((int) (WeexNestedScrollHelper.f(WeexNestedScrollHelper$scrollListener$2.this.this$0) * 0.5f));
                        }
                        WeexNestedScrollHelper.g(WeexNestedScrollHelper$scrollListener$2.this.this$0, 0);
                    }
                }
            }
        };
    }
}
