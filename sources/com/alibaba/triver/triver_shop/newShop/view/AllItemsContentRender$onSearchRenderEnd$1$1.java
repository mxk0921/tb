package com.alibaba.triver.triver_shop.newShop.view;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AllItemsContentRender$onSearchRenderEnd$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RecyclerView $it;
    public final /* synthetic */ int $lastIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$onSearchRenderEnd$1$1(RecyclerView recyclerView, int i) {
        super(0);
        this.$it = recyclerView;
        this.$lastIndex = i;
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender$onSearchRenderEnd$1$1 allItemsContentRender$onSearchRenderEnd$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender$onSearchRenderEnd$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.$it;
        int i2 = this.$lastIndex;
        if (i2 > 6) {
            i = i2 - 2;
        }
        recyclerView.scrollToPosition(i);
    }
}
