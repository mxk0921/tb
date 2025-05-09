package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $dataCenter;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniAppShopContentRender f3127a;
        public final /* synthetic */ String b;

        public a(MiniAppShopContentRender miniAppShopContentRender, String str) {
            this.f3127a = miniAppShopContentRender;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App L = this.f3127a.L();
            if (L != null) {
                L.putStringValue("shopDataCenter", this.b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1(MiniAppShopContentRender miniAppShopContentRender, String str) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$dataCenter = str;
    }

    public static /* synthetic */ Object ipc$super(MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1 miniAppShopContentRender$PreloadCallback$onGetDataCenter$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1");
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
        a aVar = new a(miniAppShopContentRender, this.$dataCenter);
        if (MiniAppShopContentRender.B(miniAppShopContentRender)) {
            aVar.run();
        } else {
            MiniAppShopContentRender.z(this.this$0).add(aVar);
        }
    }
}
