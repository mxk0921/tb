package com.alibaba.android.ultron.vfw.weex2.highPerformance.utils;

import androidx.fragment.app.FragmentManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.TBXSkuCore;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.ae2;
import tb.ckf;
import tb.dbv;
import tb.h6e;
import tb.njg;
import tb.qxq;
import tb.t2o;
import tb.v9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UltronTradeHybridSwitcherHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_KEY_ALI_PAY = "tradeHybridAlipay";
    public static final String ORANGE_KEY_ASK_LIST = "tradeHybridAskList";
    public static final String ORANGE_KEY_COMMON_CONTAINER = "tradeHybridCommonContainer";
    public static final String ORANGE_KEY_DX_MONITOR = "tradeHybridDXMonitor";
    public static final String ORANGE_KEY_HYBRID_CONTAINER = "trade_weex_container";
    public static final String ORANGE_KEY_LIGHT_BUY = "tradeHybridLightBuy";
    public static final String ORANGE_KEY_LOGISTICS_DETAIL = "tradeHybridLogisticsDetail";
    public static final String ORANGE_KEY_MY_TAOBAO = "tradeHybridMytaobao";
    public static final String ORANGE_KEY_NAV_OPT = "tradeHybridNavOpt";
    public static final String ORANGE_KEY_NEW_BUY = "tradeHybridNewBuy";
    public static final String ORANGE_KEY_ORDER_DETAIL = "tradeHybridOrderDetail";
    public static final String ORANGE_KEY_ORDER_LIST = "tradeHybridOrderList";
    public static final String ORANGE_KEY_PAY_SUCCESS = "tradeHybridPaySuccess";
    public static final String ORANGE_KEY_PURCHASE = "tradeHybridPurchase";
    public static final String ORANGE_KEY_RATE_HOME = "tradeHybridRateHome";
    public static final String ORANGE_KEY_RATE_LIST = "tradeHybridRateList";
    public static final String ORANGE_KEY_REFUND_DETAIL = "tradeHybridRefundDetail";
    public static final String ORANGE_KEY_REFUND_LIST = "tradeHybridRefundList";
    public static final String ORANGE_KEY_TAB_CART = "tradeHybridTabCart";
    public static final String ORANGE_KEY_THEMIS = "tradeHybridThemis";
    public static final String ORANGE_KEY_UNEXPECTED_REACH = "tradeHybridUnexpectedReach";
    public static final String ORANGE_KEY_WAIT_PAY = "tradeHybridWaitPay";
    public static final UltronTradeHybridSwitcherHelper INSTANCE = new UltronTradeHybridSwitcherHelper();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f2379a = a.b(UltronTradeHybridSwitcherHelper$enableFragmentPrerenderInsToPool$2.INSTANCE);

    static {
        t2o.a(157286946);
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7de8b94", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_ORDER_LIST, "downgradePageByBroadcast", false);
    }

    @JvmStatic
    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86b001b3", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_HYBRID_CONTAINER, "enableSurfaceViewRenderMode", true);
    }

    @JvmStatic
    public static final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eb1623", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_THEMIS, "enableThemisAServerOpt", false);
    }

    @JvmStatic
    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8056508", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_HYBRID_CONTAINER, "enableTradeHybrid", true);
    }

    @JvmStatic
    public static final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04de0ae", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_THEMIS, "enableTradeHybridThemis", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[ORIG_RETURN, RETURN] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String p(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "f88299ad"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.lang.String r0 = "sceneName"
            tb.ckf.g(r4, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1711306698: goto L_0x00a4;
                case -1554129835: goto L_0x0097;
                case -1414960566: goto L_0x008b;
                case -1204616613: goto L_0x007e;
                case -1048872762: goto L_0x0071;
                case -391817972: goto L_0x0064;
                case 120528346: goto L_0x0057;
                case 378830166: goto L_0x004a;
                case 1116288755: goto L_0x0040;
                case 1187338559: goto L_0x0032;
                case 1743324417: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00b1
        L_0x0024:
            java.lang.String r0 = "purchase"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridPurchase"
            goto L_0x00b4
        L_0x0032:
            java.lang.String r0 = "orderDetail"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridOrderDetail"
            goto L_0x00b4
        L_0x0040:
            java.lang.String r0 = "waitPay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            goto L_0x0053
        L_0x004a:
            java.lang.String r0 = "tbWaitPayDetail"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
        L_0x0053:
            java.lang.String r4 = "tradeHybridWaitPay"
            goto L_0x00b4
        L_0x0057:
            java.lang.String r0 = "mytaobao"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridMytaobao"
            goto L_0x00b4
        L_0x0064:
            java.lang.String r0 = "orderList"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridOrderList"
            goto L_0x00b4
        L_0x0071:
            java.lang.String r0 = "newBuy"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridNewBuy"
            goto L_0x00b4
        L_0x007e:
            java.lang.String r0 = "paysuccess"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridPaySuccess"
            goto L_0x00b4
        L_0x008b:
            java.lang.String r0 = "alipay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridAlipay"
            goto L_0x00b4
        L_0x0097:
            java.lang.String r0 = "tabCart"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridTabCart"
            goto L_0x00b4
        L_0x00a4:
            java.lang.String r0 = "refundList"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = "tradeHybridRefundList"
            goto L_0x00b4
        L_0x00b1:
            java.lang.String r4 = "trade_weex_container"
        L_0x00b4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.p(java.lang.String):java.lang.String");
    }

    @JvmStatic
    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5284de59", new Object[0])).booleanValue();
        }
        return v9v.i(ORANGE_KEY_REFUND_DETAIL, "enableHitStdPopFragment", true);
    }

    public final boolean o() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("42af04a0", new Object[]{this});
        } else {
            value = f2379a.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbab90e", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "sceneName");
        return v9v.i(ORANGE_KEY_HYBRID_CONTAINER, "enableCustomCallback", true);
    }

    @JvmStatic
    public static final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fec8d28", new Object[]{str, str2})).booleanValue();
        }
        ckf.g(str, "sceneName");
        int hashCode = str.hashCode();
        if (hashCode != -1554129835) {
            if (hashCode != -391817972) {
                if (hashCode == 120528346 && str.equals("mytaobao") && str2 != null && str2.hashCode() == -754911396 && str2.equals(dbv.BIZ_ORDER_LIST)) {
                    return v9v.i("babelorder", "preDownloadTemplates", true);
                }
                return false;
            } else if (str.equals("orderList")) {
                return v9v.i("babelorder", "preDownloadTemplates", true);
            }
        } else if (str.equals("tabCart")) {
            return v9v.i(ORANGE_KEY_TAB_CART, "enableDXPreDowngrade", true);
        }
        return false;
    }

    @JvmStatic
    public static final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91cbb44f", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -608005468) {
            if (hashCode != -391817972) {
                if (hashCode == 1419859807 && str.equals("rate_home_list")) {
                    return v9v.i(ORANGE_KEY_RATE_HOME, "enableNavDispatch", true);
                }
                return false;
            } else if (str.equals("orderList")) {
                return v9v.i(ORANGE_KEY_ORDER_LIST, "enableNavDispatch", true);
            } else {
                return false;
            }
        } else if (str.equals("ask_list")) {
            return v9v.i(ORANGE_KEY_ASK_LIST, "enableNavDispatch", true);
        } else {
            return false;
        }
    }

    @JvmStatic
    public static final boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30efcbf5", new Object[]{str, str2})).booleanValue();
        }
        ckf.g(str, "sceneName");
        switch (str.hashCode()) {
            case -1711306698:
                if (!str.equals("refundList") || str2 == null || str2.hashCode() != -2014517863 || !str2.equals(dbv.BIZ_REFUND_DETAIL)) {
                    return false;
                }
                return v9v.i(ORANGE_KEY_REFUND_LIST, "enableRefundDetailTMSPreRender", false);
            case -1204616613:
                if (str.equals(ae2.BizKeyPaysuccess)) {
                    return v9v.i(ORANGE_KEY_PAY_SUCCESS, "enableODetailPreRender", false);
                }
                return false;
            case -1048872762:
                return str.equals(TBXSkuCore.CONTAINER_TYPE_NEWBUY) && !Localization.o() && v9v.i(ORANGE_KEY_NEW_BUY, "enablePaySuccessPreRender", true);
            case -391817972:
                if (!str.equals("orderList") || str2 == null) {
                    return false;
                }
                int hashCode = str2.hashCode();
                if (hashCode != -2076803997) {
                    if (hashCode == 344030109 && str2.equals(dbv.BIZ_CONFIRM_GOOD)) {
                        return v9v.i("babelorder", "enableConfirmGoodTradeHybrid", true);
                    }
                    return false;
                } else if (str2.equals(dbv.BIZ_LOGISTICS)) {
                    return v9v.i(ORANGE_KEY_ORDER_LIST, "enableLogisticsPreRender", false);
                } else {
                    return false;
                }
            case 120528346:
                if (str.equals("mytaobao")) {
                    return v9v.i(ORANGE_KEY_MY_TAOBAO, "enableRefundPreRender", false);
                }
                return false;
            case 378830166:
                if (!str.equals("tbWaitPayDetail")) {
                    return false;
                }
                break;
            case 1116288755:
                if (!str.equals("waitPay")) {
                    return false;
                }
                break;
            case 1187338559:
                if (!str.equals(ae2.BizKeyOrderDetail) || str2 == null) {
                    return false;
                }
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -2076803997) {
                    if (hashCode2 == 344030109 && str2.equals(dbv.BIZ_CONFIRM_GOOD)) {
                        return v9v.i("babelorder", "enableConfirmGoodTradeHybrid", true);
                    }
                    return false;
                } else if (str2.equals(dbv.BIZ_LOGISTICS)) {
                    return v9v.i(ORANGE_KEY_ORDER_DETAIL, "enableLogisticsPreRender", false);
                } else {
                    return false;
                }
            case 1743324417:
                return str.equals("purchase") && !Localization.o() && v9v.i(ORANGE_KEY_PURCHASE, "enablePaySuccessPreRender", true);
            default:
                return false;
        }
        return !Localization.o() && v9v.i(ORANGE_KEY_WAIT_PAY, "enablePaySuccessPreRender", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r5.equals("rate_home_info") != false) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r5.equals("ask_list") != false) goto L_0x00f0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
        if (r5.equals("rate_home_rated_list") != false) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
        return tb.v9v.i(com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.ORANGE_KEY_RATE_HOME, "enableRateHomePreRequest", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
        if (r5.equals("ask_list_item_info") != false) goto L_0x00f0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
        return tb.v9v.i(com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.ORANGE_KEY_ASK_LIST, "enableAskListPreRequest", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r5.equals("rate_home_list") != false) goto L_0x00de;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.f(java.lang.String, java.lang.String):boolean");
    }

    @JvmStatic
    public static final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4f32b36", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "sceneName");
        int hashCode = str.hashCode();
        if (hashCode == -1414960566) {
            return str.equals("alipay") && !Localization.o() && v9v.i(ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequestFrontEnd", true);
        }
        if (hashCode != -391817972) {
            if (hashCode != 1187338559 || !str.equals(ae2.BizKeyOrderDetail)) {
                return false;
            }
        } else if (!str.equals("orderList")) {
            return false;
        }
        return v9v.i("babelorder", "enableConfirmGoodTradeHybrid", true);
    }

    @JvmStatic
    public static final boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6715b46b", new Object[]{str, str2})).booleanValue();
        }
        ckf.g(str, "sceneName");
        switch (str.hashCode()) {
            case -1711306698:
                if (!str.equals("refundList") || str2 == null || str2.hashCode() != -82300954 || !str2.equals(dbv.BIZ_REFUND_LIST)) {
                    return false;
                }
                return v9v.i(ORANGE_KEY_REFUND_LIST, "enableImagePrefetch", true);
            case -1335224239:
                if (!str.equals("detail") || str2 == null || str2.hashCode() != 422052254 || !str2.equals("rateList")) {
                    return false;
                }
                return v9v.i(ORANGE_KEY_RATE_LIST, "enableImagePrefetch", true);
            case -767426601:
                if (!str.equals("refundProcess") || str2 == null || str2.hashCode() != -82300954 || !str2.equals(dbv.BIZ_REFUND_LIST)) {
                    return false;
                }
                return v9v.i(ORANGE_KEY_REFUND_LIST, "enableImagePrefetch", true);
            case -391817972:
                if (!str.equals("orderList") || str2 == null) {
                    return false;
                }
                int hashCode = str2.hashCode();
                if (hashCode != -754911396) {
                    if (hashCode == -82300954 && str2.equals(dbv.BIZ_REFUND_LIST)) {
                        return v9v.i(ORANGE_KEY_REFUND_LIST, "enableImagePrefetch", true);
                    }
                    return false;
                } else if (str2.equals(dbv.BIZ_ORDER_LIST)) {
                    return v9v.i(ORANGE_KEY_MY_TAOBAO, "enableMytaobaoPreRequestImage", true);
                } else {
                    return false;
                }
            case 120528346:
                if (!str.equals("mytaobao") || str2 == null) {
                    return false;
                }
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -754911396) {
                    if (hashCode2 == -82300954 && str2.equals(dbv.BIZ_REFUND_LIST)) {
                        return v9v.i(ORANGE_KEY_REFUND_LIST, "enableImagePrefetch", true);
                    }
                    return false;
                } else if (str2.equals(dbv.BIZ_ORDER_LIST)) {
                    return v9v.i(ORANGE_KEY_MY_TAOBAO, "enableMytaobaoPreRequestImage", true);
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r5.equals("rate_home_info") != false) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r5.equals("ask_list") != false) goto L_0x0086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r5.equals("rate_home_rated_list") != false) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        return tb.v9v.i(com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.ORANGE_KEY_RATE_HOME, "enableRateHomePreRequestWithoutPreRender", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r5.equals("ask_list_item_info") != false) goto L_0x0086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
        return tb.v9v.i(com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.ORANGE_KEY_ASK_LIST, "enableAskListPreRequestWithoutPreRender", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r5.equals("rate_home_list") != false) goto L_0x0074;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "5ffbe6bf"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            java.lang.String r6 = "sceneName"
            tb.ckf.g(r5, r6)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1991039361: goto L_0x007e;
                case -1921057158: goto L_0x006b;
                case -1554129835: goto L_0x0059;
                case -1335224239: goto L_0x0047;
                case -608005468: goto L_0x003e;
                case 1419774831: goto L_0x0034;
                case 1419859807: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0090
        L_0x002a:
            java.lang.String r6 = "rate_home_list"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
            goto L_0x0074
        L_0x0034:
            java.lang.String r6 = "rate_home_info"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
            goto L_0x0074
        L_0x003e:
            java.lang.String r6 = "ask_list"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
            goto L_0x0086
        L_0x0047:
            java.lang.String r6 = "detail"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
            java.lang.String r5 = "tradeHybridRateList"
            java.lang.String r6 = "enableRateListPreRequestWithoutPreRender"
            boolean r5 = tb.v9v.i(r5, r6, r0)
            return r5
        L_0x0059:
            java.lang.String r6 = "tabCart"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
            java.lang.String r5 = "iCart"
            java.lang.String r6 = "enableWeexPopPreLoad"
            boolean r5 = tb.vav.a(r5, r6, r0)
            return r5
        L_0x006b:
            java.lang.String r6 = "rate_home_rated_list"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
        L_0x0074:
            java.lang.String r5 = "tradeHybridRateHome"
            java.lang.String r6 = "enableRateHomePreRequestWithoutPreRender"
            boolean r5 = tb.v9v.i(r5, r6, r0)
            return r5
        L_0x007e:
            java.lang.String r6 = "ask_list_item_info"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0090
        L_0x0086:
            java.lang.String r5 = "tradeHybridAskList"
            java.lang.String r6 = "enableAskListPreRequestWithoutPreRender"
            boolean r5 = tb.v9v.i(r5, r6, r0)
            return r5
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper.i(java.lang.String, java.lang.String):boolean");
    }

    @JvmStatic
    public static final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("869adc0d", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "sceneName");
        int hashCode = str.hashCode();
        if (hashCode == -1414960566) {
            return str.equals("alipay") && !Localization.o() && v9v.i(ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequest", true);
        }
        if (hashCode != -767426601) {
            if (hashCode == 120528346 && str.equals("mytaobao")) {
                return v9v.i(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefund", true);
            }
            return false;
        } else if (str.equals("refundProcess")) {
            return v9v.i(ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundRefundProcess", false);
        } else {
            return false;
        }
    }

    @JvmStatic
    public static final boolean q(FragmentManager fragmentManager, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8ff8646", new Object[]{fragmentManager, new Boolean(z)})).booleanValue();
        }
        if (z) {
            z2 = v9v.i(ORANGE_KEY_COMMON_CONTAINER, "enableAddTMSFragmentAgain", true);
        } else {
            z2 = v9v.i(ORANGE_KEY_COMMON_CONTAINER, "enableAddFragmentAgain", true);
        }
        return z2 || (fragmentManager != null && (qxq.h(fragmentManager) instanceof h6e) && v9v.i(ORANGE_KEY_COMMON_CONTAINER, "checkInHostFragment", true));
    }
}
