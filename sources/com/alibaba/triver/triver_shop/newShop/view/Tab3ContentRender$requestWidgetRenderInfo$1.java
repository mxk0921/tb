package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3ContentRender$requestWidgetRenderInfo$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<JSONObject, xhv> $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Tab3ContentRender$requestWidgetRenderInfo$1(g1a<? super JSONObject, xhv> g1aVar) {
        super(1);
        this.$success = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(Tab3ContentRender$requestWidgetRenderInfo$1 tab3ContentRender$requestWidgetRenderInfo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3ContentRender$requestWidgetRenderInfo$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        g1a<JSONObject, xhv> g1aVar = this.$success;
        if (g1aVar != null) {
            g1aVar.invoke(jSONObject);
        }
    }
}
