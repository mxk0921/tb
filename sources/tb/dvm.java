package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static JSONObject c;
    public static JSONObject d;
    public static JSONObject e;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f18096a;
    public JSONObject b;

    static {
        t2o.a(708837524);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4673f98", new Object[]{this});
        }
        JSONObject jSONObject = c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject("{\"data\":[{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_address/1732520010562/buy_v3_address.zip\",\"version\":\"11\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_address$0$11\",\"dinamicx$buy_v3_address$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_address\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_common_title/1733125899879/buy_v3_common_title.zip\",\"version\":\"7\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_common_title$0$7\",\"dinamicx$buy_v3_common_title$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_common_title\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_item/1736840612877/buy_v3_item.zip\",\"version\":\"16\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_item$0$16\",\"dinamicx$buy_v3_item$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_item\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_item_ext/1733209673983/buy_v3_item_ext.zip\",\"version\":\"10\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_item_ext$0$10\",\"dinamicx$buy_v3_item_ext$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_item_ext\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_item_sale_agreement/1731403378540/buy_v3_item_sale_agreement.zip\",\"version\":\"5\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_item_sale_agreement$0$5\"],\"md5\":null,\"name\":\"buy_v3_item_sale_agreement\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_order_remark/1732259760860/buy_v3_order_remark.zip\",\"version\":\"3\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_order_remark$0$3\"],\"md5\":null,\"name\":\"buy_v3_order_remark\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_payment/1732093834437/buy_v3_payment.zip\",\"version\":\"12\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_payment$0$12\",\"dinamicx$buy_v3_payment$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_payment\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_pop_bottom/1732517696409/buy_v3_pop_bottom.zip\",\"version\":\"3\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_pop_bottom$0$3\",\"dinamicx$buy_v3_pop_bottom$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_pop_bottom\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_pop_error/1730442528087/buy_v3_pop_error.zip\",\"version\":\"1\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_pop_error$0$1\",\"dinamicx$buy_v3_pop_error$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_pop_error\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_pop_item/1733814026248/buy_v3_pop_item.zip\",\"version\":\"7\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_pop_item$0$7\",\"dinamicx$buy_v3_pop_item$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_pop_item\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_pop_title/1732244763514/buy_v3_pop_title.zip\",\"version\":\"4\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_pop_title$0$4\",\"dinamicx$buy_v3_pop_title$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_pop_title\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_price/1732519766844/buy_v3_price.zip\",\"version\":\"9\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_price$0$9\",\"dinamicx$buy_v3_price$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_price\"},{\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_submit_order/1741609985796/buy_v3_submit_order.zip\",\"version\":\"23\",\"containerType\":\"dinamicx\",\"type\":[\"dinamicx$buy_v3_submit_order$0$22\",\"dinamicx$buy_v3_submit_order$0$generalv2\"],\"md5\":null,\"name\":\"buy_v3_submit_order\"},{\"url\":null,\"version\":\"0\",\"containerType\":\"layout\",\"type\":[\"layout$card$0$0\"],\"md5\":null,\"name\":\"card\"},{\"url\":null,\"version\":\"0\",\"containerType\":\"layout\",\"type\":[\"layout$linear$0$0\"],\"md5\":null,\"name\":\"linear\"},{\"url\":null,\"version\":\"0\",\"containerType\":\"layout\",\"type\":[\"layout$popup_window$0$0\"],\"md5\":null,\"name\":\"popup_window\"},{\"url\":null,\"version\":\"0\",\"containerType\":\"layout\",\"type\":[\"layout$sticky$0$0\"],\"md5\":null,\"name\":\"sticky\"}]}");
        c = parseObject;
        return parseObject;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3207461", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject("{\"commonErrorPopup\":{\"type\":\"layout$popup_window$0$0\",\"fields\":{\"style\":{\"heightRatio\":\"0.5\",\"needCloseButton\":\"false\",\"showCloseButton\":\"false\"}}},\"commonErrorPopupTips\":{\"type\":\"dinamicx$buy_v3_pop_error$0$generalv2\"},\"commonErrorPopupFooter\":{\"type\":\"layout$sticky$0$0\"},\"commonErrorActionButtion\":{\"type\":\"dinamicx$buy_v3_pop_bottom$0$generalv2\"},\"itemErrorPopup\":{\"type\":\"layout$popup_window$0$0\"},\"itemErrorPopupHeader\":{\"type\":\"layout$sticky$0$0\",\"fields\":{\"position\":\"top\"}},\"ItemErrorTitle\":{\"type\":\"dinamicx$buy_v3_pop_title$0$generalv2\"},\"errorItem_0\":{\"type\":\"dinamicx$buy_v3_pop_item$0$generalv2\",\"fields\":{\"visible\":\"false\"}},\"errorItem_1\":{\"type\":\"dinamicx$buy_v3_pop_item$0$generalv2\",\"fields\":{\"visible\":\"false\"}},\"itemErrorPopupFooter\":{\"type\":\"layout$sticky$0$0\"},\"itemErrorButton\":{\"type\":\"dinamicx$buy_v3_pop_bottom$0$generalv2\"},\"address\":{\"fields\":{\"address\":\"@data{header.fields.addressText}\",\"arrow\":\"true\",\"descStyle\":\"desc\",\"icon\":\"https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png\",\"name\":\"@data{header.fields.fullName}\",\"phone\":\"@data{header.fields.mobile}\",\"cornerType\":\"top\"},\"type\":\"dinamicx$buy_v3_address$0$generalv2\"},\"addressCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"marginLeft\":\"12\",\"cardMargin\":\"8\",\"iosCornerRadius\":\"0\",\"cornerRadius\":\"25\",\"marginRight\":\"12\",\"dividerHeght\":\"9\"}},\"type\":\"layout$card$0$0\"},\"bottomMargin\":{\"fields\":{\"hello\":\"world\"},\"position\":\"body\",\"type\":\"dinamicx$buy_v3_separater$0$generalv2\"},\"checkboxAgreemnet\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"marginLeft\":\"12\",\"cardMargin\":\"8\",\"iosCornerRadius\":\"0\",\"cornerRadius\":\"25\",\"marginRight\":\"12\",\"dividerHeght\":\"9\"}},\"type\":\"layout$card$0$0\"},\"footer\":{\"fields\":{\"position\":\"bottom\"},\"position\":\"footer\",\"type\":\"layout$sticky$0$0\"},\"itemInfo_86fc1804e610aa6762585a82bee9d8ca\":{\"fields\":{\"arrow\":\"true\",\"desc\":\"@data{item[0].fields.sku.title}\",\"icon\":\"@data{item[0].fields.pic}\",\"label\":\"@data{item[0].fields.label}\",\"max\":\"50\",\"min\":\"1\",\"price\":\"@data{item[0].fields.pay.nowTitle}\",\"quantity\":\"@data{item[0].fields.quantity}\",\"serviceDesc\":[{\"price\":\"\",\"text\":\"选择相关服务\"}],\"step\":\"1\",\"title\":\"@data{item[0].fields.title}\"},\"type\":\"dinamicx$buy_v3_item$0$generalv2\",\"events\":{\"quantityChange\":[]}},\"newtonCheckboxAgreement_privacy_protect_privacyCheckbox_1\":{\"fields\":{\"attachInfo\":\"\",\"helpIconUrl\":\"https://img.alicdn.com/imgextra/i1/O1CN01QKhsKS23TkxhwpL7L_!!6000000007257-2-tps-32-32.png\",\"icon\":\"https://img.alicdn.com/imgextra/i1/O1CN01EuZ7xH1DaIamKYT04_!!6000000000232-2-tps-66-66.png\",\"state\":\"disable\",\"subtitle\":[{\"style\":{\"color\":\"#999999\"},\"text\":\"隐藏收件人真实手机号，保护隐私\"}],\"title\":\"号码保护\"},\"type\":\"dinamicx$buy_v3_item_sale_agreement$0$generalv2\"},\"newtonNormalOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"开具发票\"},\"type\":\"dinamicx$buy_v3_item_ext$0$generalv2\"},\"orderRemark_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"订单备注\"},\"type\":\"dinamicx$buy_v3_item_ext$0$generalv2\"},\"paymentCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"marginLeft\":\"12\",\"cardMargin\":\"8\",\"iosCornerRadius\":\"0\",\"cornerRadius\":\"25\",\"marginRight\":\"12\",\"dividerHeght\":\"9\"}},\"type\":\"layout$card$0$0\"},\"paymentUsePrimaryAction_Agency4Newton\":{\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i4/O1CN01U4WSFq1cwcGj2zGOS_!!6000000003665-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"disable\",\"subtitle\":\"找人帮忙付，购物更方便\",\"subtitleStyle\":\"desc\",\"title\":\"找朋友帮忙付\"},\"type\":\"dinamicx$buy_v3_payment$0$generalv2\"},\"paymentUsePrimaryAction_AlipayFrontPlanB4Newton\":{\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i2/O1CN01GU2o4m1VzBAjv2zYV_!!6000000002723-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"force\",\"title\":\"支付宝\"},\"type\":\"dinamicx$buy_v3_payment$0$generalv2\"},\"paymentUseThirdAction_AlipayFrontPlanB4Newton\":{\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i2/O1CN016XDyFB1scUjGwta3x_!!6000000005787-2-tps-28-28.png\",\"label\":\"\",\"operationId\":\"\",\"state\":\"unsel\",\"title\":\"\",\"visible\":\"false\"},\"type\":\"dinamicx$buy_alipay_selection_attachment_v2$0$generalv2\"},\"settlementCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"marginLeft\":\"12\",\"cardMargin\":\"8\",\"iosCornerRadius\":\"0\",\"cornerRadius\":\"25\",\"marginRight\":\"12\",\"dividerHeght\":\"9\"}},\"type\":\"layout$card$0$0\"},\"settlementDiscount_RedCouponCrossShopPromotionPrice\":{\"fields\":{\"isPreView\":\"true\",\"title\":\"红包\"},\"type\":\"dinamicx$buy_v3_price$0$generalv2\"},\"settlementDiscount_compositeShopPromotion\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"店铺优惠\"},\"type\":\"dinamicx$buy_v3_price$0$generalv2\"},\"settlementFee_ItemPrice\":{\"fields\":{\"isPreView\":\"false\",\"title\":\"商品总价\"},\"type\":\"dinamicx$buy_v3_price$0$generalv2\"},\"settlementTitle\":{\"fields\":{\"title\":\"价格明细\"},\"type\":\"dinamicx$buy_v3_common_title$0$generalv2\"},\"shopCard_3ffff6cd7857594544f8c684f1e29638\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"marginLeft\":\"12\",\"cardMargin\":\"8\",\"iosCornerRadius\":\"0\",\"cornerRadius\":\"25\",\"marginRight\":\"12\",\"dividerHeght\":\"9\"}},\"type\":\"layout$card$0$0\"},\"shopPromotionSelect_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"店铺优惠\"},\"type\":\"dinamicx$buy_v3_item_ext$0$generalv2\"},\"shopTitle_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"icon\":\"@data{item[0].fields.shopIcon}\",\"title\":\"@data{item[0].fields.shopName}\"},\"type\":\"dinamicx$buy_v3_common_title$0$generalv2\"},\"submit\":{\"fields\":{\"isPreView\":\"true\"},\"position\":\"footer\",\"type\":\"dinamicx$buy_v3_submit_order$0$generalv2\"},\"submitOrder\":{\"position\":\"footer\"}}");
        this.b = parseObject;
        return parseObject;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a387c0cc", new Object[]{this});
        }
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject("{\"protocolVersion\":\"4.0\",\"umfVersions\":{\"version\":\"0.1.0\"}}");
        d = parseObject;
        return parseObject;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("747abb4c", new Object[]{this});
        }
        JSONObject jSONObject = e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject("{\"root\":\"generalV2\",\"structure\":{\"addressCard\":[\"baseAddress\"],\"baseAddress\":[\"address\"],\"checkboxAgreemnet\":[\"newtonCheckboxAgreements\"],\"footer\":[\"submitOrder\"],\"generalV2\":[\"errorPopup\",\"actionBarComponent\",\"addressCard\",\"shopCard_3ffff6cd7857594544f8c684f1e29638\",\"settlementCard\",\"paymentCard\",\"checkboxAgreemnet\",\"bottomMargin\",\"footer\"],\"errorPopup\":[\"commonErrorPopup\",\"itemErrorPopup\"],\"commonErrorPopup\":[\"commonErrorPopupTips\",\"commonErrorPopupFooter\"],\"commonErrorPopupFooter\":[\"commonErrorActionButtion\"],\"itemErrorPopup\":[\"itemErrorPopupHeader\",\"itemErrorPopupBody\",\"itemErrorPopupFooter\"],\"itemErrorPopupHeader\":[\"ItemErrorTitle\"],\"itemErrorPopupBody\":[\"errorItem_0\",\"errorItem_1\"],\"itemErrorPopupFooter\":[\"itemErrorButton\"],\"item_86fc1804e610aa6762585a82bee9d8ca\":[\"itemInfo_86fc1804e610aa6762585a82bee9d8ca\"],\"newtonCheckboxAgreements\":[\"newtonCheckboxAgreement_privacy_protect_privacyCheckbox_1\"],\"newtonOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\":[\"newtonNormalOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\"],\"orderExt_3ffff6cd7857594544f8c684f1e29638\":[\"newtonOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\",\"orderRemarks_3ffff6cd7857594544f8c684f1e29638\"],\"orderLine_86fc1804e610aa6762585a82bee9d8ca\":[\"item_86fc1804e610aa6762585a82bee9d8ca\"],\"orderRemarks_3ffff6cd7857594544f8c684f1e29638\":[\"orderRemark_3ffff6cd7857594544f8c684f1e29638\"],\"order_3ffff6cd7857594544f8c684f1e29638\":[\"orderLine_86fc1804e610aa6762585a82bee9d8ca\",\"delivery_3ffff6cd7857594544f8c684f1e29638\"],\"paymentCard\":[\"payment_AlipayFrontPlanB4Newton\",\"payment_Agency4Newton\"],\"paymentUse_Agency4Newton\":[\"paymentUsePrimaryAction_Agency4Newton\"],\"paymentUse_AlipayFrontPlanB4Newton\":[\"paymentUsePrimaryAction_AlipayFrontPlanB4Newton\",\"paymentUseThirdAction_AlipayFrontPlanB4Newton\"],\"payment_Agency4Newton\":[\"paymentUse_Agency4Newton\"],\"payment_AlipayFrontPlanB4Newton\":[\"paymentUse_AlipayFrontPlanB4Newton\"],\"settlementCard\":[\"settlementHeader\",\"settlementFees\",\"settlementDiscounts\",\"settlementFooter\"],\"settlementDiscounts\":[\"settlementDiscount_compositeShopPromotion\",\"settlementDiscount_RedCouponCrossShopPromotionPrice\"],\"settlementFees\":[\"settlementFee_ItemPrice\"],\"settlementHeader\":[\"settlementTitle\"],\"shopCard_3ffff6cd7857594544f8c684f1e29638\":[\"shopHead_3ffff6cd7857594544f8c684f1e29638\",\"order_3ffff6cd7857594544f8c684f1e29638\",\"shopPromotion_3ffff6cd7857594544f8c684f1e29638\",\"orderExt_3ffff6cd7857594544f8c684f1e29638\"],\"shopHead_3ffff6cd7857594544f8c684f1e29638\":[\"shopTitle_3ffff6cd7857594544f8c684f1e29638\"],\"shopPromotion_3ffff6cd7857594544f8c684f1e29638\":[\"shopPromotionSelect_3ffff6cd7857594544f8c684f1e29638\"],\"submitOrder\":[\"submit\"]}}");
        e = parseObject;
        return parseObject;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a9e2c4f", new Object[]{this});
        }
        JSONObject jSONObject = this.f18096a;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f18096a = jSONObject2;
        jSONObject2.put("container", (Object) a());
        this.f18096a.put("data", (Object) b());
        this.f18096a.put(AURASubmitEvent.RPC_ENDPOINT, (Object) c());
        this.f18096a.put("hierarchy", (Object) d());
        return this.f18096a;
    }
}
