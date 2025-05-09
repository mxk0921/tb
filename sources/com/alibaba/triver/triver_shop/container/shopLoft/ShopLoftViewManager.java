package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.aqp;
import tb.npp;
import tb.or9;
import tb.t2o;
import tb.v4i;
import tb.x4i;
import tb.xpd;
import tb.ypd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopLoftViewManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TYPE_NEW_VIDEO = "newVideo";
    public static String TYPE_GRAPHIC = "graphic";
    public static String TYPE_VIDEO = "video";
    public static String TYPE_LIVE = "live";
    public static String TYPE_MARKET = "market";
    public static String TYPE_MARKET_VIDEO = "market_video";
    public static String TYPE_MINI_CARD_VIDEO = "mini_video";
    public static String TYPE_MINI_CARD_LIVE = "mini_live";
    public static String TYPE_LIVE_CARD = "liveCard";
    public static String TYPE_NEW_DETAIL = "newDetail";
    public static String TYPE_SHOP_2023_LIVE = "live2023";
    public static String TYPE_SHOP_2023_LIVE_NEW = "live2023new";
    private static Map<String, Class<? extends xpd>> shopLoftViewClassMap = new ConcurrentHashMap();

    public static xpd createShopLoftViewByType(String str) {
        npp.c("loftType  " + str);
        if (TYPE_LIVE.equals(str)) {
            return ypd.a();
        }
        if (TYPE_LIVE_CARD.equals(str) && aqp.Companion.b1()) {
            return new WidgetLoftViewV2();
        }
        Class<? extends xpd> shopLoftViewClassByType = getShopLoftViewClassByType(str);
        if (shopLoftViewClassByType == null) {
            return null;
        }
        try {
            return (xpd) shopLoftViewClassByType.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static xpd getMiniVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd) ipChange.ipc$dispatch("6ba14d68", new Object[0]);
        }
        if (aqp.Companion.a1()) {
            return new TBMiniShopVideoView();
        }
        return new MiniVideoLoftView();
    }

    public static Class<? extends xpd> getShopLoftViewClassByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c6d08b05", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return shopLoftViewClassMap.get(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r5.equals("661") == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTypeFromSceneId(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "b85fcfa2"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0015:
            r2 = 0
            if (r5 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case 53617: goto L_0x005a;
                case 53619: goto L_0x004f;
                case 53622: goto L_0x0044;
                case 53623: goto L_0x0039;
                case 54391: goto L_0x002e;
                case 55352: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0 = -1
            goto L_0x0063
        L_0x0023:
            java.lang.String r0 = "800"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002c
            goto L_0x0021
        L_0x002c:
            r0 = 5
            goto L_0x0063
        L_0x002e:
            java.lang.String r0 = "700"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0037
            goto L_0x0021
        L_0x0037:
            r0 = 4
            goto L_0x0063
        L_0x0039:
            java.lang.String r0 = "667"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0042
            goto L_0x0021
        L_0x0042:
            r0 = 3
            goto L_0x0063
        L_0x0044:
            java.lang.String r0 = "666"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x004d
            goto L_0x0021
        L_0x004d:
            r0 = 2
            goto L_0x0063
        L_0x004f:
            java.lang.String r0 = "663"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0058
            goto L_0x0021
        L_0x0058:
            r0 = 1
            goto L_0x0063
        L_0x005a:
            java.lang.String r1 = "661"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0063
            goto L_0x0021
        L_0x0063:
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0073;
                case 2: goto L_0x0070;
                case 3: goto L_0x006d;
                case 4: goto L_0x006a;
                case 5: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            return r2
        L_0x0067:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_GRAPHIC
            return r5
        L_0x006a:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_NEW_VIDEO
            return r5
        L_0x006d:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_LIVE
            return r5
        L_0x0070:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_MARKET
            return r5
        L_0x0073:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_VIDEO
            return r5
        L_0x0076:
            java.lang.String r5 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.TYPE_NEW_DETAIL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager.getTypeFromSceneId(java.lang.String):java.lang.String");
    }

    public static boolean isMarketType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c6348f5", new Object[]{str})).booleanValue();
        }
        return TYPE_MARKET.equals(getTypeFromSceneId(str));
    }

    public static boolean isNewShopLoftStyleType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("686f5943", new Object[]{str})).booleanValue();
        }
        if (TYPE_GRAPHIC.equals(str) || TYPE_NEW_VIDEO.equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isVideoType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b40c4a0", new Object[]{str})).booleanValue();
        }
        return TYPE_VIDEO.equals(getTypeFromSceneId(str));
    }

    public static void registerShopLoftView(String str, Class<? extends xpd> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122176bd", new Object[]{str, cls});
        } else if (str != null && cls != null) {
            shopLoftViewClassMap.put(str, cls);
        }
    }

    static {
        t2o.a(766509192);
        registerShopLoftView(TYPE_MARKET, v4i.class);
        registerShopLoftView(TYPE_LIVE_CARD, WidgetLoftView.class);
        registerShopLoftView(TYPE_NEW_DETAIL, ShopLoftNewDetailView.class);
        registerShopLoftView(TYPE_GRAPHIC, ShopLoftGraphicView.class);
        registerShopLoftView(TYPE_SHOP_2023_LIVE, ShopNewLiveLoftView.class);
        registerShopLoftView(TYPE_SHOP_2023_LIVE_NEW, ShopLiveOpenCardView.class);
        aqp.a aVar = aqp.Companion;
        if (aVar.a1()) {
            registerShopLoftView(TYPE_MINI_CARD_VIDEO, TBMiniShopVideoView.class);
            registerShopLoftView(TYPE_MARKET_VIDEO, TBMarketShopVideoView.class);
            registerShopLoftView(TYPE_NEW_VIDEO, TBLoftDWShopVideoView.class);
        } else {
            registerShopLoftView(TYPE_MINI_CARD_VIDEO, MiniVideoLoftView.class);
            registerShopLoftView(TYPE_MARKET_VIDEO, x4i.class);
            registerShopLoftView(TYPE_NEW_VIDEO, ShopLoftNewVideoViewWithDW.class);
        }
        try {
            if (!aVar.c()) {
                registerShopLoftView(TYPE_VIDEO, or9.m());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
