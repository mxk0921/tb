package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AllItemsContentRender$initAllItemsComponent$3 extends Lambda implements g1a<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AllItemsContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$initAllItemsComponent$3(AllItemsContentRender allItemsContentRender) {
        super(1);
        this.this$0 = allItemsContentRender;
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender$initAllItemsComponent$3 allItemsContentRender$initAllItemsComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender$initAllItemsComponent$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Shop2023CategoryNativeComponent w = AllItemsContentRender.w(this.this$0);
        if (w == null) {
            return false;
        }
        return w.H(z);
    }
}
