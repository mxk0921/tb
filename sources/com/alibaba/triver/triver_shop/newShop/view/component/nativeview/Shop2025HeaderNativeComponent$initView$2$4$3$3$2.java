package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2025HeaderNativeComponent$initView$2$4$3$3$2 extends Lambda implements g1a<MotionEvent, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2025HeaderNativeComponent$initView$2$4$3$3$2(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        super(1);
        this.this$0 = shop2025HeaderNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2025HeaderNativeComponent$initView$2$4$3$3$2 shop2025HeaderNativeComponent$initView$2$4$3$3$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$4$3$3$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
        return Boolean.valueOf(invoke2(motionEvent));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b44f658", new Object[]{this, motionEvent})).booleanValue();
        }
        LinearLayout j = Shop2025HeaderNativeComponent.j(this.this$0);
        if (j != null) {
            return ((double) j.getAlpha()) > 0.9d;
        }
        ckf.y("llShopInfo");
        throw null;
    }
}
