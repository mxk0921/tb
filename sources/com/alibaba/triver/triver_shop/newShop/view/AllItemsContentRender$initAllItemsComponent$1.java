package com.alibaba.triver.triver_shop.newShop.view;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class AllItemsContentRender$initAllItemsComponent$1 extends FunctionReferenceImpl implements g1a<Bundle, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AllItemsContentRender$initAllItemsComponent$1(AllItemsContentRender allItemsContentRender) {
        super(1, allItemsContentRender, AllItemsContentRender.class, "saveInstanceData", "saveInstanceData(Landroid/os/Bundle;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender$initAllItemsComponent$1 allItemsContentRender$initAllItemsComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender$initAllItemsComponent$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Bundle bundle) {
        invoke2(bundle);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcba175", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "p0");
        AllItemsContentRender.A((AllItemsContentRender) this.receiver, bundle);
    }
}
