package com.taobao.tao.shop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TBShopPageType {
    SHOP_PAGE_CATEGORY,
    SHOP_PAGE_SEARCH,
    SHOP_PAGE_SUPERMARKET_OLD,
    SHOP_PAGE_SUPERMARKET,
    SHOP_PAGE_OLD_HOME,
    SHOP_PAGE_NEW_HOME,
    SHOP_PAGE_OLD_LOFT,
    SHOP_PAGE_NEW_LOFT,
    SHOP_PAGE_REDIRECT,
    SHOP_PAGE_PERSONAL_ERROR,
    SHOP_PAGE_FORCE_H5_BROWSER,
    SHOP_PAGE_PROCESSED_ERROR,
    SHOP_PAGE_NOT_SHOP;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBShopPageType tBShopPageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/TBShopPageType");
    }

    public static TBShopPageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBShopPageType) ipChange.ipc$dispatch("7ad0a326", new Object[]{str});
        }
        return (TBShopPageType) Enum.valueOf(TBShopPageType.class, str);
    }
}
