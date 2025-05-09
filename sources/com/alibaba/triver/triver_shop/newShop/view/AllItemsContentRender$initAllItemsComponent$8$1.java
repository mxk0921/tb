package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.ckf;
import tb.olo;
import tb.w1a;
import tb.xhv;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AllItemsContentRender$initAllItemsComponent$8$1 extends Lambda implements w1a<JSONObject, String, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ olo $allItemsModule;
    public final /* synthetic */ AllItemsContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$initAllItemsComponent$8$1(AllItemsContentRender allItemsContentRender, olo oloVar) {
        super(3);
        this.this$0 = allItemsContentRender;
        this.$allItemsModule = oloVar;
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender$initAllItemsComponent$8$1 allItemsContentRender$initAllItemsComponent$8$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender$initAllItemsComponent$8$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        invoke2(jSONObject, str, jSONObject2);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c310f5", new Object[]{this, jSONObject, str, jSONObject2});
            return;
        }
        ckf.g(jSONObject, "queryStringMap");
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            ckf.f(key, "entry.key");
            Object value = next.getValue();
            if (value != null) {
                str2 = value.toString();
            }
            hashMap.put(key, str2);
        }
        hashMap.put("nextCategoryGuidText", str);
        Context F = this.this$0.F();
        if (jSONObject2 != null) {
            str2 = jSONObject2.toString();
        }
        a1v.g(F, yj4.PARAM_UT_PARAMS, str2);
        this.$allItemsModule.G();
        this.$allItemsModule.M(hashMap);
        this.$allItemsModule.k();
    }
}
