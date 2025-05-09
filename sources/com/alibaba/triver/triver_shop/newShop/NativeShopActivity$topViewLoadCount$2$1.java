package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$topViewLoadCount$2$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3071a;
        public final /* synthetic */ JSONObject b;

        public a(NativeShopActivity nativeShopActivity, JSONObject jSONObject) {
            this.f3071a = nativeShopActivity;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NativeShopActivity.d4(this.f3071a, this.b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$topViewLoadCount$2$1(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$topViewLoadCount$2$1 nativeShopActivity$topViewLoadCount$2$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$topViewLoadCount$2$1");
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
        NativeShopActivity nativeShopActivity = this.this$0;
        nativeShopActivity.runOnUiThread(new a(nativeShopActivity, jSONObject));
    }
}
