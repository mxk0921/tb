package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d7z extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String templateName = "tb_shop_header_tag_list_2025";
    public Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510417);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView I = d7z.this.I();
            if (I != null) {
                I.startScroll();
            }
        }
    }

    static {
        t2o.a(766510416);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7z(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(d7z d7zVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/FlagShipV25HeaderTagListTemplate");
        }
    }

    public final Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView) ipChange.ipc$dispatch("8c471f00", new Object[]{this});
        }
        return this.o;
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d88e252", new Object[]{this});
            return;
        }
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.o;
        if (autoScrollAndScrollableTagView != null) {
            autoScrollAndScrollableTagView.post(new b());
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.o;
        ckf.d(autoScrollAndScrollableTagView);
        return autoScrollAndScrollableTagView;
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
        D().getRenderHeight();
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = new Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView(context);
        this.o = autoScrollAndScrollableTagView;
        kew.b(autoScrollAndScrollableTagView, g());
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView2 = this.o;
        if (autoScrollAndScrollableTagView2 != null) {
            autoScrollAndScrollableTagView2.setContentView(g());
        }
        q(D().getDXJSONConfig(), shopDataParser.O0().t(D().getData()), true);
    }
}
