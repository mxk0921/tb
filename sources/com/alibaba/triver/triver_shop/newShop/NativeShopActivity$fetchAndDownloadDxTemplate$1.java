package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.mop;
import tb.npp;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$fetchAndDownloadDxTemplate$1 extends Lambda implements u1a<DXTemplateItem, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<View, xhv> $createViewCallback;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ JSONObject $dxJsonConfig;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeShopActivity$fetchAndDownloadDxTemplate$1(g1a<? super View, xhv> g1aVar, NativeShopActivity nativeShopActivity, JSONObject jSONObject, JSONObject jSONObject2) {
        super(2);
        this.$createViewCallback = g1aVar;
        this.this$0 = nativeShopActivity;
        this.$data = jSONObject;
        this.$dxJsonConfig = jSONObject2;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$fetchAndDownloadDxTemplate$1 nativeShopActivity$fetchAndDownloadDxTemplate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$fetchAndDownloadDxTemplate$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(DXTemplateItem dXTemplateItem, Boolean bool) {
        invoke(dXTemplateItem, bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(DXTemplateItem dXTemplateItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ba376c", new Object[]{this, dXTemplateItem, new Boolean(z)});
            return;
        }
        ckf.g(dXTemplateItem, "dxTemplate");
        if (z) {
            this.$createViewCallback.invoke(NativeShopActivity.n3(this.this$0, dXTemplateItem, this.$data));
            NativeShopActivity nativeShopActivity = this.this$0;
            NativeShopActivity.m4(nativeShopActivity, NativeShopActivity.N3(nativeShopActivity) + 1);
            this.this$0.L5(mop.KEY_PAGE_LOADED);
            npp.Companion.b(ckf.p("dx template download success : ", dXTemplateItem.toString()));
            return;
        }
        npp.Companion.b(ckf.p("dx template download failed : ", dXTemplateItem.toString()));
        ShopDataParser I3 = NativeShopActivity.I3(this.this$0);
        if (I3 != null) {
            I3.X().add(this.$dxJsonConfig);
            NativeShopActivity.o3(this.this$0);
            return;
        }
        ckf.y("shopDataParser");
        throw null;
    }
}
