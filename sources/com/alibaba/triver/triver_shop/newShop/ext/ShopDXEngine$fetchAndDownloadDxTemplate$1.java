package com.alibaba.triver.triver_shop.newShop.ext;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.npp;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopDXEngine$fetchAndDownloadDxTemplate$1 extends Lambda implements u1a<DXTemplateItem, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<View, xhv> $createViewCallback;
    public final /* synthetic */ d1a<xhv> $createViewFailedCallback;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ JSONObject $dxJsonConfig;
    public final /* synthetic */ boolean $useNewApiRender;
    public final /* synthetic */ ShopDXEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopDXEngine$fetchAndDownloadDxTemplate$1(g1a<? super View, xhv> g1aVar, ShopDXEngine shopDXEngine, JSONObject jSONObject, boolean z, JSONObject jSONObject2, d1a<xhv> d1aVar) {
        super(2);
        this.$createViewCallback = g1aVar;
        this.this$0 = shopDXEngine;
        this.$data = jSONObject;
        this.$useNewApiRender = z;
        this.$dxJsonConfig = jSONObject2;
        this.$createViewFailedCallback = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopDXEngine$fetchAndDownloadDxTemplate$1 shopDXEngine$fetchAndDownloadDxTemplate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$fetchAndDownloadDxTemplate$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(DXTemplateItem dXTemplateItem, Boolean bool) {
        invoke(dXTemplateItem, bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(DXTemplateItem dXTemplateItem, boolean z) {
        JSONArray X;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ba376c", new Object[]{this, dXTemplateItem, new Boolean(z)});
            return;
        }
        ckf.g(dXTemplateItem, "dxTemplate");
        if (z) {
            this.$createViewCallback.invoke(ShopDXEngine.a(this.this$0, dXTemplateItem, this.$data, this.$useNewApiRender));
            npp.Companion.b(ckf.p("dx template download success : ", dXTemplateItem.toString()));
            return;
        }
        npp.Companion.b(ckf.p("dx template download failed : ", dXTemplateItem.toString()));
        ShopDataParser l = this.this$0.l();
        if (!(l == null || (X = l.X()) == null)) {
            X.add(this.$dxJsonConfig);
        }
        d1a<xhv> d1aVar = this.$createViewFailedCallback;
        if (d1aVar != null) {
            d1aVar.invoke();
        }
    }
}
