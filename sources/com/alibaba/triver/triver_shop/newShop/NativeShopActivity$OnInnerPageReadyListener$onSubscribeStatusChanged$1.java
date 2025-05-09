package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $subscribe;
    public final /* synthetic */ JSONObject $subscribeData;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1(NativeShopActivity nativeShopActivity, boolean z, JSONObject jSONObject) {
        super(0);
        this.this$0 = nativeShopActivity;
        this.$subscribe = z;
        this.$subscribeData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1 nativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        NativeShopActivity.i4(this.this$0, this.$subscribe);
        NativeShopActivity.t4(this.this$0);
        if (NativeShopActivity.G3(this.this$0) != null) {
            View G3 = NativeShopActivity.G3(this.this$0);
            DXRootView dXRootView = null;
            if (G3 != null) {
                if (G3 instanceof DXRootView) {
                    dXRootView = (DXRootView) G3;
                }
                ShopExtKt.T(dXRootView, this.$subscribeData);
                return;
            }
            ckf.y("secondView");
            throw null;
        }
    }
}
