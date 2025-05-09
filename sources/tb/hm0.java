package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20738a = false;

    static {
        t2o.a(301989913);
    }

    public static List<DXTemplateItem> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28c6e4d1", new Object[]{jSONObject});
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : jSONObject.keySet()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                String string = jSONObject2.getString("v");
                String string2 = jSONObject2.getString("url");
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = str;
                dXTemplateItem.b = Long.valueOf(string).longValue();
                dXTemplateItem.c = string2;
                arrayList.add(dXTemplateItem);
            }
            return arrayList;
        } catch (Throwable th) {
            rbb g = ck.g();
            g.e("提前下载模版异常：" + th.getMessage(), ck.b.b().i("AURA/preload").a());
            vm0.e("预下载模版解析异常", th.getMessage());
            return null;
        }
    }

    public static s b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("50c3a88c", new Object[]{str});
        }
        return new s(new DXEngineConfig.b(str).F());
    }

    public static void d(Context context, s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b69628", new Object[]{context, sVar, new Boolean(z)});
        } else if (!f20738a) {
            ck.g().e("DX preloadMockData ", ck.b.b().i("AURA/preload").h("needPreRender", z).a());
            UltronProtocol ultronProtocol = new UltronProtocol(JSON.parseObject("{\"container\":{\"data\":[{\"name\":\"buy_v2_action_bar\",\"containerType\":\"dinamicx\",\"version\":\"38\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_action_bar/1718703347261/buy_v2_action_bar.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_action_bar$0$generalv2\"]},{\"name\":\"buy_v2_address\",\"containerType\":\"dinamicx\",\"version\":\"83\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_address/1719471309086/buy_v2_address.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_address$0$generalv2\"]},{\"name\":\"buy_v2_address_sticky\",\"containerType\":\"dinamicx\",\"version\":\"8\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_address_sticky/1718592958637/buy_v2_address_sticky.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_address_sticky$0$generalv2\"]},{\"name\":\"buy_v2_common_title\",\"containerType\":\"dinamicx\",\"version\":\"30\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_common_title/1718591668972/buy_v2_common_title.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_common_title$0$generalv2\"]},{\"name\":\"buy_v2_foot_elevator\",\"containerType\":\"dinamicx\",\"version\":\"11\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_foot_elevator/1718614667109/buy_v2_foot_elevator.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_foot_elevator$0$generalv2\"]},{\"name\":\"buy_v2_item\",\"containerType\":\"dinamicx\",\"version\":\"95\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item/1719819864285/buy_v2_item.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_item$0$generalv2\"]},{\"name\":\"buy_v2_item_ext\",\"containerType\":\"dinamicx\",\"version\":\"84\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item_ext/1719904743105/buy_v2_item_ext.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_item_ext$0$generalv2\"]},{\"name\":\"buy_v2_item_sale_agreement\",\"containerType\":\"dinamicx\",\"version\":\"17\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item_sale_agreement/1718591126498/buy_v2_item_sale_agreement.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_item_sale_agreement$0$generalv2\"]},{\"name\":\"buy_v2_item_tie_sale_2022\",\"containerType\":\"dinamicx\",\"version\":\"53\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item_tie_sale_2022/1719457349808/buy_v2_item_tie_sale_2022.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_item_tie_sale_2022$0$generalv2\"]},{\"name\":\"buy_v2_payment\",\"containerType\":\"dinamicx\",\"version\":\"62\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_payment/1718595849068/buy_v2_payment.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_payment$0$generalv2\"]},{\"name\":\"buy_v2_price\",\"containerType\":\"dinamicx\",\"version\":\"47\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_price/1719995143988/buy_v2_price.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_price$0$generalv2\"]},{\"name\":\"buy_v2_separater\",\"containerType\":\"dinamicx\",\"version\":\"2\",\"url\":\"https://ossgw.alicdn.com/rapid-oss-bucket/1648622952399/buy_v2_separater.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_separater$0$generalv2\"]},{\"name\":\"buy_v2_submit_order\",\"containerType\":\"dinamicx\",\"version\":\"39\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_submit_order/1720082078843/buy_v2_submit_order.zip\",\"md5\":null,\"type\":[\"dinamicx$buy_v2_submit_order$0$generalv2\"]},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_action_bar\",\"type\":[\"dinamicx$buy_v2_action_bar$0$generalv2\"],\"version\":\"38\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_action_bar/1718703347261/buy_v2_action_bar.zip\"},]},\"data\":{\"actionBarComponent\":{\"type\":\"dinamicx$buy_v2_action_bar$0$generalv2\",\"fields\":{\"bgColor\":\"#00000000\",\"hideBackArrow\":\"false\",\"isAutoScroll\":\"false\",\"position\":\"actionBar\",\"speed\":\"4000\",\"title\":\"确认订单\",\"unBold\":\"true\"}},\"address\":{\"type\":\"dinamicx$buy_v2_address$0$generalv2\",\"fields\":{\"address\":\"新湖果岭店\",\"arrow\":\"true\",\"descStyle\":\"desc\",\"icon\":\"https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png\",\"name\":\"鲤鱼\",\"phone\":\"14498107507\"},},\"addressRemindV2\":{\"type\":\"dinamicx$buy_v2_address_sticky$0$generalv2\",\"fields\":{\"address\":\"新湖果岭店\",\"arrow\":\"true\",\"icon\":\"https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png\"}},\"shopTitle_ee5a5d76b3ba7012a0a376b669bfec21\":{\"type\":\"dinamicx$buy_v2_common_title$0$generalv2\",\"fields\":{\"icon\":\"//gw.alicdn.com/tfs/TB1CzD7SXXXXXXJaXXXXXXXXXXX-32-32.png\",\"iconV2\":\"https://img.alicdn.com/imgextra/i2/O1CN01YXk7Uv1m5crVf1xzx_!!6000000004903-2-tps-90-42.png\",\"title\":\"三星家电旗舰店\"}},\"itemInfo_8843b3742f436f98917f23998445d279\":{\"type\":\"dinamicx$buy_v2_item$0$generalv2\",\"fields\":{\"arrow\":\"true\",\"desc\":\"颜色分类:极地白;\",\"icon\":\"//gw.alicdn.com/imgextra/i1/2435073206/O1CN01Evu45E1ZYOhqb96l7_!!2435073206.png\",\"label\":[\"假一赔四\",\"极速退款\",\"7天无理由退换\"],\"lastQuantity\":\"1\",\"max\":\"4\",\"min\":\"1\",\"price\":\"￥14000\",\"priceAfterPromotion\":\"￥8949\",\"priceAfterPromotionStripZero\":\"￥8949\",\"priceAfterPromotionText\":\"券后\",\"quantity\":\"1\",\"serviceDesc\":[{\"price\":\"\",\"text\":\"选择相关服务\"}],\"showPriceAfterPromotion\":\"true\",\"showPriceType\":\"highlightPromotionPrice\",\"step\":\"1\",\"title\":\"三星635L对开门水吧制冰机冰箱白\"}},\"deliveryServiceV2_ee5a5d76b3ba7012a0a376b669bfec21\":{\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\",\"fields\":{\"arrow\":\"true\",\"group\":{\"max\":\"1\",\"min\":\"1\"},\"subtitles\":[{\"text\":\"快递 包邮\"},{\"text\":\"07月31日 09:00-21:00,可改时间\"},{\"displayType\":\"deliveryHome\"}],\"title\":\"配送服务\"}},\"deliveryMethodHeader_ee5a5d76b3ba7012a0a376b669bfec21\":{\"type\":\"dinamicx$buy_v2_common_title$0$generalv2\",\"status\":\"hidden\",\"fields\":{\"ignoreCard\":\"true\",\"title\":\"发货服务\"}},\"newtonNormalOrderExt_Invoice4Newton_hiddenInvoiceCard_ee5a5d76b3ba7012a0a376b669bfec21\":{\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\",\"fields\":{\"arrow\":\"true\",\"subtitles\":[{\"style\":\"normal\",\"text\":\"个人-普通发票-电子\"}],\"title\":\"开具发票\"}},\"orderRemark_ee5a5d76b3ba7012a0a376b669bfec21\":{\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\",\"fields\":{\"arrow\":\"true\",\"subtitles\":[{\"style\":\"desc\",\"text\":\"无备注\"}],\"title\":\"订单备注\"}},\"newtonSingleItemConditionSaleCard_buyOneBusiness_conditionalSaleCard_1\":{\"type\":\"dinamicx$buy_v2_item_tie_sale_2022$0$generalv2\",\"fields\":{\"action\":\"checkbox\",\"helpIcon\":\"//img.alicdn.com/imgextra/i3/O1CN01UXCzlz1wSCEoNym2v_!!6000000006306-2-tps-32-32.png\",\"promotionPrice\":\"￥\",\"state\":\"unsel\",\"title\":\"顺手买一件 null\",\"titleStyle\":\"normal\",\"version\":\"v2\"}},\"newtonSingleItemConditionSaleCardElevator_buyOneBusiness_conditionalSaleCard_1\":{\"type\":\"dinamicx$buy_v2_foot_elevator$0$generalv2\",\"fields\":{\"asyncStatus\":\"init\",\"bgColor\":\"#333333\",\"darkModeBgColor\":\"#E6FFFFFF\",\"darkModeIcon\":\"https://img.alicdn.com/imgextra/i2/O1CN01OlGPAS1ZagYFhOOx0_!!6000000003211-2-tps-32-36.png\",\"icon\":\"https://img.alicdn.com/imgextra/i2/O1CN014TcqC329wVaSq99sF_!!6000000008132-2-tps-32-36.png\",\"marginBottom\":\"100\"}},\"settlementTitle\":{\"type\":\"dinamicx$buy_v2_common_title$0$generalv2\",\"fields\":{\"title\":\"价格明细\"}},\"settlementFee_ItemPrice\":{\"type\":\"dinamicx$buy_v2_price$0$generalv2\",\"fields\":{\"arrow\":\"false\",\"price\":\"￥14000.00\",\"priceStyle\":\"normal\",\"promptStyle\":\"normal\",\"subtitle\":\"共1件宝贝\",\"subtitleStyle\":\"desc\",\"title\":\"商品总价\"}},\"settlementDiscount_compositeShopPromotion\":{\"type\":\"dinamicx$buy_v2_price$0$generalv2\",\"fields\":{\"arrow\":\"true\",\"icon\":\"https://img.alicdn.com/imgextra/i2/O1CN01iuN6Bp1OCRp2vn6bD_!!6000000001669-2-tps-66-66.png\",\"prePriceText\":\"减\",\"price\":\"￥5051.00\",\"priceStyle\":\"highlight\",\"promptStyle\":\"desc\",\"subtitle\":\"\",\"subtitleStyle\":\"desc\",\"tag\":{\"position\":\"right\",\"text\":\"入会最高减1000元\"},\"title\":\"店铺优惠\"}},\"paymentUsePrimaryAction_AlipayFrontPlanB4Newton\":{\"type\":\"dinamicx$buy_v2_payment$0$generalv2\",\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i2/O1CN01GU2o4m1VzBAjv2zYV_!!6000000002723-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"sel\",\"title\":\"支付宝\"}},\"paymentUsePrimaryAction_Agency4Newton\":{\"type\":\"dinamicx$buy_v2_payment$0$generalv2\",\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i4/O1CN01U4WSFq1cwcGj2zGOS_!!6000000003665-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"unsel\",\"subtitle\":\"找人帮忙付，购物更方便\",\"subtitleStyle\":\"desc\",\"title\":\"找朋友帮忙付\"}},\"newtonCheckboxAgreement_privacy_protect_privacyCheckbox_1\":{\"type\":\"dinamicx$buy_v2_item_sale_agreement$0$generalv2\",\"fields\":{\"attachInfo\":\"\",\"helpIconUrl\":\"https://img.alicdn.com/imgextra/i1/O1CN01QKhsKS23TkxhwpL7L_!!6000000007257-2-tps-32-32.png\",\"icon\":\"https://img.alicdn.com/imgextra/i1/O1CN01EuZ7xH1DaIamKYT04_!!6000000000232-2-tps-66-66.png\",\"state\":\"sel\",\"subtitle\":[{\"style\":{\"color\":\"#999999\"},\"text\":\"隐藏收件人真实手机号，保护隐私\"}],\"title\":\"号码保护\"}},\"bottomMargin\":{\"type\":\"dinamicx$buy_v2_separater$0$generalv2\",\"fields\":{\"hello\":\"world\"},\"position\":\"body\"},\"submit\":{\"type\":\"dinamicx$buy_v2_submit_order$0$generalv2\",\"fields\":{\"count\":\"1款，共1件\",\"countV2\":\"共1件\",\"desc\":\"共减￥5051.00\",\"descCss\":{\"color\":\"#FF5000\",\"isBold\":\"false\",\"isItalic\":\"false\"},\"insideBuyBtn\":{\"desc\":\"立即支付\",\"price\":\"￥8949\"},\"isShowFamilyPayBtn\":\"false\",\"payBtn\":{\"title\":\"提交订单\"},\"price\":\"￥8949.00\",\"priceTitle\":\"合计:\",\"reducePrice\":\"减￥5051.00\",\"reducePriceColor\":\"#FF5000\",\"settlementBenefitColor\":\"#FF5000\",\"settlementBenefitIcon\":\"https://img.alicdn.com/imgextra/i3/O1CN01Hi0OCH1use96JiCK2_!!6000000006093-2-tps-48-56.png\",\"settlementBenefitText\":\"入会最高减1000元\",\"useSpecialPay\":\"false\"}}}}"));
            if (z) {
                gm0.e(context, sVar, ultronProtocol);
            } else {
                gm0.f(sVar, ultronProtocol.getContainer());
            }
            f20738a = true;
        }
    }

    public static void c(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17643e4", new Object[]{str, str2, jSONObject});
        } else if (jSONObject == null) {
            rbb g = ck.g();
            g.e("[" + str + "]未收到模版预下载配置", ck.b.b().i("AURA/preload").a());
        } else {
            try {
                if (TextUtils.isEmpty(str2) || !m9v.d("aliBuyTemplateId").h(str2, false) || !i0r.e("enableDownloadOnce", false)) {
                    List<DXTemplateItem> a2 = a(jSONObject);
                    if (a2 != null && !a2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        s b = b(str);
                        for (DXTemplateItem dXTemplateItem : a2) {
                            DXTemplateItem i = b.i(dXTemplateItem);
                            if (i == null || i.b < dXTemplateItem.b) {
                                arrayList.add(dXTemplateItem);
                                arrayList2.add(dXTemplateItem.f7343a + "#" + dXTemplateItem.b);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            m9v.d("aliBuyTemplateId").p(str2, true);
                            return;
                        }
                        rbb g2 = ck.g();
                        g2.e("[" + str + "]提前下载模版：" + arrayList2, ck.b.b().i("AURA/preload").a());
                        vm0.a a3 = vm0.a.a("preDownloadTemplate");
                        vm0.d(a3.tag("[" + str + "]提前下载模版").message(arrayList2.toString()).sampling(0.001f));
                        Log.e("PURCHASE", "[" + str + "]提前下载模版 " + arrayList2);
                        b.h(arrayList);
                        return;
                    }
                    rbb g3 = ck.g();
                    g3.e("[" + str + "] " + str2 + " 模版解析失败", ck.b.b().i("AURA/preload").a());
                    return;
                }
                rbb g4 = ck.g();
                g4.e("[" + str + "] " + str2 + " 模版已经下载，不需要重复下载", ck.b.b().i("AURA/preload").a());
            } catch (Throwable th) {
                vm0.e("PRE_FETCH_TEMPLATE_EXCEPTION", th.getMessage());
            }
        }
    }
}
