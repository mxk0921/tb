package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class VideoShopView$initBigCardIfNeeded$1 extends FunctionReferenceImpl implements u1a<String, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VideoShopView$initBigCardIfNeeded$1(VideoShopView videoShopView) {
        super(2, videoShopView, VideoShopView.class, "processEvent", "processEvent(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(VideoShopView$initBigCardIfNeeded$1 videoShopView$initBigCardIfNeeded$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/VideoShopView$initBigCardIfNeeded$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, JSONObject jSONObject) {
        invoke2(str, jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
        } else {
            VideoShopView.access$processEvent((VideoShopView) this.receiver, str, jSONObject);
        }
    }
}
