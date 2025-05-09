package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mop;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "seller")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Seller extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String sellerId;
    private final String sellerNick;
    private final String sellerType;
    private final String shopIcon;
    private final String shopId;
    private final String shopName;
    private final int shopType;
    private final String shopTypeOriginal;
    private final String shopUrl;
    private final String userId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TAOBAO = 1;
        public static final int TMALL = 2;

        static {
            t2o.a(912261705);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9b78446c", new Object[]{str})).intValue();
            }
            if ("B".equalsIgnoreCase(str)) {
                return 2;
            }
            return 1;
        }
    }

    static {
        t2o.a(912261704);
    }

    public Seller(JSONObject jSONObject) {
        super(jSONObject);
        this.sellerId = jSONObject.getString("sellerId");
        this.shopId = jSONObject.getString("shopId");
        this.shopIcon = jSONObject.getString("shopIcon");
        this.userId = jSONObject.getString("userId");
        this.sellerType = jSONObject.getString("sellerType");
        this.shopName = jSONObject.getString("shopName");
        this.shopUrl = jSONObject.getString(mop.KEY_APM_SHOP_URL);
        this.shopTypeOriginal = jSONObject.getString("shopType");
        this.shopType = a.a(jSONObject.getString("shopType"));
        this.sellerNick = jSONObject.getString("sellerNick");
    }

    public static /* synthetic */ Object ipc$super(Seller seller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Seller");
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.sellerId;
    }

    public String getSellerNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baba4e81", new Object[]{this});
        }
        return this.sellerNick;
    }

    public String getSellerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3157730a", new Object[]{this});
        }
        return this.sellerType;
    }

    public String getShopIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("132e3614", new Object[]{this});
        }
        return this.shopIcon;
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.shopId;
    }

    public String getShopName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6105d742", new Object[]{this});
        }
        return this.shopName;
    }

    public int getShopType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7e96240", new Object[]{this})).intValue();
        }
        return this.shopType;
    }

    public String getShopTypeOriginal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ce1ea2", new Object[]{this});
        }
        return this.shopTypeOriginal;
    }

    public String getShopUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935d5876", new Object[]{this});
        }
        return this.shopUrl;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }
}
