package com.taobao.calendar.sdk;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBCalendarConfig {
    private static String groupName = "calendar";
    private static String key = "calendarConfig";
    private static boolean initEventTyping = false;
    public static Map<Long, String[]> EventType_old = new HashMap<Long, String[]>() { // from class: com.taobao.calendar.sdk.TBCalendarConfig.1
        {
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_MIAOSHA), new String[]{"秒 杀", "#ff8a00", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_QIANG), new String[]{"抢 购", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_ACTIVITY), new String[]{"活 动", "#ff4400", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_COUPON), new String[]{"卡 券", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_TUANGOU), new String[]{"跟我团", "#ff4400", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_MIAO), new String[]{"瞄一眼", "#ff4400", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_WEEKEND), new String[]{"周末淘", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_CRAZYANCHOR), new String[]{"疯狂主播", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_FUWU), new String[]{"服 务", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_MAKEUP), new String[]{"美 妆", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_GOLD_COIN), new String[]{"金 币", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_MUYING), new String[]{"母 婴", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_TRY), new String[]{"试 用", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_AUCTION), new String[]{"拍 卖", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_CAR), new String[]{"汽 车", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_JHS), new String[]{"开 团", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHOP_NEW), new String[]{"上 新", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_GOOD_SALE), new String[]{"开 售", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_YUSOU), new String[]{"预 售", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_LVXING), new String[]{"旅 行", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_ENTERTAINMENT), new String[]{"娱 乐", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_REDIAN), new String[]{"热点商品", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_TMALL_CHONGWU), new String[]{"天猫宠物", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHANGJIA_OPEN), new String[]{"店铺提醒", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_DETAIL_ITEM), new String[]{"宝贝详情", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_JIYOUJIA), new String[]{"极有家", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIYI), new String[]{"双11大促", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIYI2), new String[]{"提 醒", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIYI3), new String[]{"提 醒", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIYI4), new String[]{"提 醒", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIER), new String[]{"双12大促", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIER1), new String[]{"1212", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIER2), new String[]{"1212", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_SHUANGSHIER3), new String[]{"1212", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_MOVIE), new String[]{"电 影", "#c800ca", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_KTV), new String[]{"唱 K", "#fea1ff", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_LIVE_FESTIVAL), new String[]{"生活节", "#ff003c", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_GOLD), new String[]{"淘金币", "#ffae00", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_NEAR), new String[]{"附 近", "#33d0ce", "true"});
            put(Long.valueOf(TBCalendarDataSource.TAOBAO_QITA), new String[]{"其 他", "#CD661D", "true"});
        }
    };
    public static Map<Long, String[]> EventType = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (!TBCalendarConfig.initEventTyping) {
                boolean unused = TBCalendarConfig.initEventTyping = true;
                String config = OrangeConfig.getInstance().getConfig(TBCalendarConfig.groupName, TBCalendarConfig.key, "");
                if (!TextUtils.isEmpty(config)) {
                    try {
                        JSONArray parseArray = JSON.parseArray(config);
                        if (parseArray != null && parseArray.size() > 0) {
                            TBCalendarConfig.EventType.clear();
                            for (int i = 0; i < parseArray.size(); i++) {
                                JSONObject jSONObject = parseArray.getJSONObject(i);
                                if (jSONObject != null) {
                                    TBCalendarConfig.EventType.put(jSONObject.getLong(BaseOuterComponent.b.SOURCE_COMPONENT_ID), new String[]{jSONObject.getString("name"), jSONObject.getString("color"), jSONObject.getString(pg1.ATOM_EXT_del)});
                                }
                            }
                            boolean unused2 = TBCalendarConfig.initEventTyping = false;
                            return;
                        }
                    } catch (Exception unused3) {
                    }
                }
                TBCalendarConfig.EventType = TBCalendarConfig.EventType_old;
                boolean unused4 = TBCalendarConfig.initEventTyping = false;
            }
        }
    }

    static {
        t2o.a(414187526);
    }

    public static void init() {
        initEventType();
    }

    public static void initEventType() {
        new Thread(new a()).start();
    }

    public static void setDataSourceStyle(Long l, String[] strArr) {
        EventType_old.put(l, strArr);
    }
}
