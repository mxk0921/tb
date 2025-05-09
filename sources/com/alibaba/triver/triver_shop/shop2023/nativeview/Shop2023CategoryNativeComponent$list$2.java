package com.alibaba.triver.triver_shop.shop2023.nativeview;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023CategoryNativeComponent$list$2 extends Lambda implements d1a<List<Shop2023CategoryNativeComponent.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023CategoryNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$list$2(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        super(0);
        this.this$0 = shop2023CategoryNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023CategoryNativeComponent$list$2 shop2023CategoryNativeComponent$list$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$list$2");
    }

    @Override // tb.d1a
    public final List<Shop2023CategoryNativeComponent.a> invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray c = Shop2023CategoryNativeComponent.c(this.this$0);
        if (c != null) {
            for (Object obj : c) {
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("categoryId");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("image");
                    String string3 = jSONObject2 == null ? null : jSONObject2.getString("url");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("queryStringMap");
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    arrayList.add(new Shop2023CategoryNativeComponent.a(string, string2, jSONObject3, string3, 0, jSONObject.getJSONObject(yj4.PARAM_UT_PARAMS), jSONObject.getJSONObject("utLogMap"), 16, null));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        return arrayList;
    }
}
