package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EmbedSecondFloorView$onReceivedMessage$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $action;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ EmbedSecondFloorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedSecondFloorView$onReceivedMessage$1(EmbedSecondFloorView embedSecondFloorView, String str, JSONObject jSONObject) {
        super(0);
        this.this$0 = embedSecondFloorView;
        this.$action = str;
        this.$data = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(EmbedSecondFloorView$onReceivedMessage$1 embedSecondFloorView$onReceivedMessage$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/EmbedSecondFloorView$onReceivedMessage$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            EmbedSecondFloorView.a(this.this$0, this.$action, this.$data);
        }
    }
}
