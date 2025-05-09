package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.ContentShopComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.DefaultShopV2;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3;
import com.alibaba.triver.triver_shop.newShop.view.component.OverseaShop;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.alibaba.triver.triver_shop.shop2023.FlagShipV25;
import com.alibaba.triver.triver_shop.shop2023.TmallCardShop;
import com.alibaba.triver.triver_shop.shop2023.XSDStoreWeexModeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class eop {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAR_SHOP = "tmallcar";
    public static final String VIDEO_SHOP = "videoShop";
    public static final a Companion = new a(null);
    public static final String FLAG_SHIP_SHOP = "brandFlagshipShop";
    public static final String FLAG_SHIP_SHOP_V2 = "brandFlagshipShopV2";
    public static final String C_BRAND_CLOTH_SHOP = "brandShopClothC";
    public static final String VIDEO_SHOP_2 = "videoShopV2";
    public static final String DEFAULT_SHOP_V2 = "defaultShopV2";
    public static final String DEFAULT_SHOP = "defaultShop";
    public static final String DEFAULT_2023 = "commonC2023";
    public static final String XSD_SHOP = "xsdStore";
    public static final String OVERSEA_SHOP = "overseaShop";
    public static final String TMALL_CAR_SHOP = "tmallCarShop";
    public static final String FLAG_SHIP_V25 = "commonShop2025";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends BaseContentComponent>> f18732a = kotlin.collections.a.j(jpu.a(FLAG_SHIP_SHOP, FlagShipContentComponentV2.class), jpu.a(FLAG_SHIP_SHOP_V2, FlagShipContentComponentV2.class), jpu.a(C_BRAND_CLOTH_SHOP, DefaultShopV2.class), jpu.a(VIDEO_SHOP_2, ContentShopComponent.class), jpu.a(DEFAULT_SHOP_V2, DefaultShopV2.class), jpu.a(DEFAULT_SHOP, DefaultShopV2.class), jpu.a(DEFAULT_2023, Default2023Shop.class), jpu.a(XSD_SHOP, XSDStoreWeexModeComponent.class), jpu.a(OVERSEA_SHOP, OverseaShop.class), jpu.a("farmshop_c", FarmShop.class), jpu.a("farmshop_x", FarmShop.class), jpu.a("farmshop_z", FarmShop.class), jpu.a(TMALL_CAR_SHOP, TmallCardShop.class), jpu.a(FLAG_SHIP_V25, FlagShipV25.class));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509578);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final BaseContentComponent a(String str, ShopDataParser shopDataParser) {
            ckf.g(str, "type");
            if (shopDataParser != null && shopDataParser.M1()) {
                return new FlagShipContentComponentV3();
            }
            Class cls = (Class) eop.a().get(str);
            if (cls == null) {
                return null;
            }
            return (BaseContentComponent) cls.newInstance();
        }

        public a() {
        }
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f7d9c098", new Object[0]);
        }
        return f18732a;
    }

    static {
        t2o.a(766509577);
    }
}
