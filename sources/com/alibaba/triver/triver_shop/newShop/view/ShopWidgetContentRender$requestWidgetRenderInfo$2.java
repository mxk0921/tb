package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWidgetContentRender$requestWidgetRenderInfo$2 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a<Integer, String, xhv> $failure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopWidgetContentRender$requestWidgetRenderInfo$2(u1a<? super Integer, ? super String, xhv> u1aVar) {
        super(2);
        this.$failure = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopWidgetContentRender$requestWidgetRenderInfo$2 shopWidgetContentRender$requestWidgetRenderInfo$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopWidgetContentRender$requestWidgetRenderInfo$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        return invoke(num.intValue(), str);
    }

    public final xhv invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("dbc7292d", new Object[]{this, new Integer(i), str});
        }
        u1a<Integer, String, xhv> u1aVar = this.$failure;
        if (u1aVar == null) {
            return null;
        }
        u1aVar.invoke(Integer.valueOf(i), str);
        return xhv.INSTANCE;
    }
}
