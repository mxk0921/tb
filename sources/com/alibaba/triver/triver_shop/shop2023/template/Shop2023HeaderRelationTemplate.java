package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import tb.brf;
import tb.ckf;
import tb.fmi;
import tb.l77;
import tb.mmi;
import tb.nmi;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023HeaderRelationTemplate extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3346a;
        public final /* synthetic */ Shop2023HeaderRelationTemplate b;

        public a(ShopDataParser shopDataParser, Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate) {
            this.f3346a = shopDataParser;
            this.b = shop2023HeaderRelationTemplate;
        }

        @Override // tb.fmi
        public final void b(Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = obj instanceof String ? brf.k((String) obj) : null;
                if (jSONObject == null) {
                    return;
                }
            }
            String string = jSONObject.getString("sellerId");
            String string2 = jSONObject.getString("name");
            if (ckf.b(string, this.f3346a.N0()) && ckf.b(string2, "authSuccess")) {
                this.b.H();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3347a;
        public final /* synthetic */ Shop2023HeaderRelationTemplate b;

        public b(ShopDataParser shopDataParser, Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate) {
            this.f3347a = shopDataParser;
            this.b = shop2023HeaderRelationTemplate;
        }

        @Override // tb.fmi
        public final void b(Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = obj instanceof String ? brf.k((String) obj) : null;
                if (jSONObject == null) {
                    return;
                }
            }
            if (ckf.b(jSONObject.getString("sellerId"), this.f3347a.N0())) {
                this.b.H();
            }
        }
    }

    static {
        t2o.a(766510446);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023HeaderRelationTemplate(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderRelationTemplate");
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        h().k().b((DXRootView) view, new l77(e(), this));
        super.b(view);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
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
        BaseTemplateComponent.r(this, D().getDXJSONConfig(), shopDataParser.O0().t(D().getData()), false, 4, null);
        final mmi mmiVar = new mmi(context, "member_auth_poplayer", new a(shopDataParser, this));
        final mmi mmiVar2 = new mmi(context, "exit_member_success", new b(shopDataParser, this));
        Context Q = shopDataParser.Q();
        if (Q != null && (Q instanceof FragmentActivity)) {
            ((FragmentActivity) Q).getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderRelationTemplate$init$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroyed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                        return;
                    }
                    mmi.this.a();
                    mmiVar2.a();
                }
            });
        }
        nmi.a(shopDataParser.Q());
    }
}
