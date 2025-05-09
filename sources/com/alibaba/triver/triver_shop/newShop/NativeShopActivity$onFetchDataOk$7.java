package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$onFetchDataOk$7 extends Lambda implements g1a<View, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$onFetchDataOk$7(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$onFetchDataOk$7 nativeShopActivity$onFetchDataOk$7, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$onFetchDataOk$7");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(View view) {
        invoke2(view);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, view});
            return;
        }
        ckf.g(view, AdvanceSetting.NETWORK_TYPE);
        NativeShopActivity.p4(this.this$0, view);
        NativeShopActivity.S3(this.this$0).addView(view);
        View T3 = NativeShopActivity.T3(this.this$0);
        if (T3 != null) {
            kew.T(T3);
            if (NativeShopActivity.R3(this.this$0)) {
                kew.g0(NativeShopActivity.S3(this.this$0));
                return;
            }
            return;
        }
        ckf.y("videoShopTabView");
        throw null;
    }
}
