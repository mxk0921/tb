package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValueImpl;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Object $data;
    public final /* synthetic */ XSDStoreWeexModeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1(XSDStoreWeexModeComponent xSDStoreWeexModeComponent, Object obj) {
        super(0);
        this.this$0 = xSDStoreWeexModeComponent;
        this.$data = obj;
    }

    public static /* synthetic */ Object ipc$super(XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1 xSDStoreWeexModeComponent$initComponent$1$1$onGetData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        WeexInstance f1 = XSDStoreWeexModeComponent.f1(this.this$0);
        if (f1 != null) {
            f1.updateInstanceData("shop", "xsdCategory", WeexValueImpl.ofJSON((JSONObject) this.$data));
        }
    }
}
