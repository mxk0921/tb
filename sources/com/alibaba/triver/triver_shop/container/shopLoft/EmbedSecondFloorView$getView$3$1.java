package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EmbedSecondFloorView$getView$3$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ EmbedSecondFloorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedSecondFloorView$getView$3$1(EmbedSecondFloorView embedSecondFloorView) {
        super(1);
        this.this$0 = embedSecondFloorView;
    }

    public static /* synthetic */ Object ipc$super(EmbedSecondFloorView$getView$3$1 embedSecondFloorView$getView$3$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/EmbedSecondFloorView$getView$3$1");
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
        g1a<JSONObject, xhv> h = this.this$0.h();
        if (h != null) {
            h.invoke(jSONObject);
        }
    }
}
