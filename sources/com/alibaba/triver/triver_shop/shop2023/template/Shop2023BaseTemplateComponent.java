package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Shop2023BaseTemplateComponent extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ShopComponentModel i;
    public final ArrayList<Runnable> j = new ArrayList<>();
    public g1a<? super Shop2023BaseTemplateComponent, xhv> k;

    static {
        t2o.a(766510426);
    }

    public Shop2023BaseTemplateComponent(ShopComponentModel shopComponentModel) {
        ckf.g(shopComponentModel, "shopComponentModel");
        this.i = shopComponentModel;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent");
        }
    }

    public final void B(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca68e56", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.j;
        if (runnable != null) {
            arrayList.add(runnable);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef2b149", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.j.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
        this.j.clear();
    }

    public final ShopComponentModel D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopComponentModel) ipChange.ipc$dispatch("a343badb", new Object[]{this});
        }
        return this.i;
    }

    public final g1a<Shop2023BaseTemplateComponent, xhv> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("8297c87d", new Object[]{this});
        }
        return this.k;
    }

    public final void F(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24908d6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        if (l() && (jSONObject = ShopExtKt.q(f()).getJSONObject("nativeData")) != null) {
            JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
            jSONObject2.remove(str);
            y("nativeData", jSONObject2);
        }
    }

    public final void G(g1a<? super Shop2023BaseTemplateComponent, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304f6f39", new Object[]{this, g1aVar});
        } else {
            this.k = g1aVar;
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8757a44e", new Object[]{this});
        } else if (this.i.getSendMtop()) {
            ShopExtKt.b0(e(), this.i, new Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1(this), new Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        super.b(view);
        if (!this.i.getSendMtop()) {
            o();
        }
        C();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        super.k(context, shopDataParser, shopDXEngine, jSONObject);
        H();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return m();
    }
}
