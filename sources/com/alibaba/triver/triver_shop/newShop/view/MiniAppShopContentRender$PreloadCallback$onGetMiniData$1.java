package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiniAppShopContentRender$PreloadCallback$onGetMiniData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $miniData;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniAppShopContentRender f3129a;
        public final /* synthetic */ String b;

        public a(MiniAppShopContentRender miniAppShopContentRender, String str) {
            this.f3129a = miniAppShopContentRender;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App L = this.f3129a.L();
            if (L != null) {
                L.putStringValue("shopMiniData", this.b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$PreloadCallback$onGetMiniData$1(MiniAppShopContentRender miniAppShopContentRender, String str) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$miniData = str;
    }

    public static /* synthetic */ Object ipc$super(MiniAppShopContentRender$PreloadCallback$onGetMiniData$1 miniAppShopContentRender$PreloadCallback$onGetMiniData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MiniAppShopContentRender$PreloadCallback$onGetMiniData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        MiniAppShopContentRender miniAppShopContentRender = this.this$0;
        a aVar = new a(miniAppShopContentRender, this.$miniData);
        if (MiniAppShopContentRender.B(miniAppShopContentRender)) {
            aVar.run();
        } else {
            MiniAppShopContentRender.z(this.this$0).add(aVar);
        }
    }
}
