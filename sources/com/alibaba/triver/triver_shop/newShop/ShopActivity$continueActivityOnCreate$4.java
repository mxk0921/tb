package com.alibaba.triver.triver_shop.newShop;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.mdd;
import tb.mop;
import tb.vxm;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopActivity$continueActivityOnCreate$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $containerRealStart;
    public final /* synthetic */ long $containerStart;
    public final /* synthetic */ Intent $targetIntent;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$continueActivityOnCreate$4(ShopActivity shopActivity, long j, long j2, Intent intent) {
        super(0);
        this.this$0 = shopActivity;
        this.$containerStart = j;
        this.$containerRealStart = j2;
        this.$targetIntent = intent;
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$continueActivityOnCreate$4 shopActivity$continueActivityOnCreate$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$continueActivityOnCreate$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser p3 = ShopActivity.p3(this.this$0);
        String str = null;
        if (p3 != null) {
            ShopExtKt.p0(p3);
            ShopDataParser p32 = ShopActivity.p3(this.this$0);
            if (p32 != null) {
                p32.Y2(mop.KEY_CONTAINER_START, Long.valueOf(this.$containerStart));
                ShopDataParser p33 = ShopActivity.p3(this.this$0);
                if (p33 != null) {
                    p33.Y2(mop.KEY_CONTAINER_INIT_START, Long.valueOf(this.$containerRealStart));
                    ShopDataParser p34 = ShopActivity.p3(this.this$0);
                    if (p34 != null) {
                        p34.X2(mop.KEY_CONTAINER_FINISH);
                        ShopDataParser p35 = ShopActivity.p3(this.this$0);
                        if (p35 != null) {
                            Intent intent = this.$targetIntent;
                            ShopDataParser p36 = ShopActivity.p3(this.this$0);
                            if (p36 != null) {
                                ShopExtKt.h(p35, intent, p36.A0());
                                mdd a2 = vxm.b.a(this.this$0);
                                Uri data = this.$targetIntent.getData();
                                if (data != null) {
                                    str = data.toString();
                                }
                                a2.a(mop.KEY_APM_SHOP_URL, str);
                                return;
                            }
                            ckf.y("shopDataParser");
                            throw null;
                        }
                        ckf.y("shopDataParser");
                        throw null;
                    }
                    ckf.y("shopDataParser");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
            ckf.y("shopDataParser");
            throw null;
        }
        ckf.y("shopDataParser");
        throw null;
    }
}
