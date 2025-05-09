package com.alibaba.triver.triver_shop.newShop.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WeexShopContentRender$rootContainer$2 extends Lambda implements d1a<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexShopContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexShopContentRender$rootContainer$2(WeexShopContentRender weexShopContentRender) {
        super(0);
        this.this$0 = weexShopContentRender;
    }

    public static /* synthetic */ Object ipc$super(WeexShopContentRender$rootContainer$2 weexShopContentRender$rootContainer$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/WeexShopContentRender$rootContainer$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FrameLayout invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(WeexShopContentRender.v(this.this$0));
        frameLayout.setBackgroundColor(Color.parseColor("#F2F2F2"));
        return frameLayout;
    }
}
