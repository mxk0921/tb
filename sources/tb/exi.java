package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class exi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031924);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dd165ab5", new Object[0]);
        }
        return JSON.parseObject("{\"api\":\"mtop.order.querydetail\",\"data\":{\"container\":{\"data\":[{\"containerType\":\"dinamicx\",\"md5\":null,\"name\":\"babel_orderdetailtitle_v3\",\"type\":[\"dinamicx$babel_orderdetailtitle$8772$8\"],\"url\":\"https://dinamicx.alibabausercontent.com/pub/babel_orderdetailtitle_v3/1699243065369/babel_orderdetailtitle_v3.zip\",\"version\":\"90\"}]},\"data\":{\"generalorderdetail\":{\"tag\":\"generalorderdetail\"},\"root\":{\"tag\":\"root\"},\"pageHeader\":{\"fields\":{\"title\":\"订单详情\"},\"position\":\"header\",\"tag\":\"pageHeader\",\"type\":\"dinamicx$babel_orderdetailtitle$8772$8\"}},\"endpoint\":{\"protocolVersion\":\"3.0\",\"ultronage\":true},\"global\":{\"events\":{}},\"hierarchy\":{\"root\":\"generalorderdetail\",\"structure\":{\"generalorderdetail\":[\"root\"],\"root\":[\"pageHeader\"]}},\"linkage\":{},\"reload\":true},\"ret\":[\"SUCCESS::调用成功\"],\"v\":\"5.0\"}");
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("722ccb42", new Object[0]);
        }
        return c(false);
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5eb25bf0", new Object[0]);
        }
        return e(false);
    }

    public static JSONObject c(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f374f212", new Object[]{new Boolean(z)});
        }
        if (Localization.o()) {
            String[] strArr = hn2.EN_titleConfig;
            String str2 = strArr[0];
            String str3 = strArr[1];
            String str4 = strArr[2];
            String[] strArr2 = hn2.EN_tabConfig;
            str = "{\n  \"api\": \"mtop.taobao.order.queryboughtlist\",\n  \"data\": {\n    \"container\": {\n      \"data\": [{\n        \"name\": \"" + str2 + "\",\n        \"containerType\": \"dinamicx\",\n        \"version\": \"" + str3 + "\",\n        \"url\": \"" + str4 + "\",\n        \"md5\": null,\n        \"type\": [\"dinamicx$ol3_orderlisttitle$0$9\"]\n      },\n        {\n          \"name\": \"" + strArr2[0] + "\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"" + strArr2[1] + "\",\n          \"url\": \"" + strArr2[2] + "\",\n          \"md5\": null,\n          \"type\": [\"dinamicx$ol3_orderlisttabs$0$25\"]\n        }\n      ]\n    },\n    \"data\": {\n      \"boughtlist\": {\n        \"tag\": \"boughtlist\",\n        \"extendBlock\": \"true\",\n        \"hasMore\": \"true\"\n      },\n      \"query\": {\n        \"tag\": \"query\",\n        \"type\": \"dinamicx$ol3_orderlisttitle$0$9\",\n        \"fields\": {\n          \"url\": \"https://market.wapa.taobao.com/app/tb-source-app/order-search/pages/index?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&showBanner=true&newEntrance=true\"\n        },\n        \"position\": \"header\"\n      },\n      \"tab\": {\n        \"tag\": \"tab\",\n        \"type\": \"dinamicx$ol3_orderlisttabs$0$25\",\n        \"position\": \"header\"\n      }\n    },\n    \"linkage\": {\n      \"common\": {\n        \"compress\": \"false\"\n      }\n    },\n    \"hierarchy\": {\n      \"root\": \"boughtlist\",\n      \"structure\": {\n        \"boughtlist\": [\"query\", \"tab\"]\n      }\n    },\n    \"endpoint\": {\n      \"ultronage\": \"true\",\n      \"protocolVersion\": \"3.0\",\n      \"contextVersion\": \"trademanager2_20200915150443685_233077\",\n      \"page\": \"boughtlist\"\n    },\n    \"global\": {\n      \"foldDeviceRelatedPage\": \"" + z + "\"\n    },\n    \"reload\": \"true\"\n  },\n  \"ret\": [\"SUCCESS::调用成功\"],\n  \"v\": \"1.0\"\n}";
        } else {
            String[] strArr3 = hn2.CN_titleConfig;
            String str5 = strArr3[0];
            String str6 = strArr3[1];
            String str7 = strArr3[2];
            String[] strArr4 = hn2.CN_tabConfig;
            str = "{\n  \"api\": \"mtop.taobao.order.queryboughtlist\",\n  \"data\": {\n    \"container\": {\n      \"data\": [{\n        \"name\": \"" + str5 + "\",\n        \"containerType\": \"dinamicx\",\n        \"version\": \"" + str6 + "\",\n        \"url\": \"" + str7 + "\",\n        \"md5\": null,\n        \"type\": [\"dinamicx$ol3_orderlisttitle$0$9\"]\n      },\n        {\n          \"name\": \"" + strArr4[0] + "\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"" + strArr4[1] + "\",\n          \"url\": \"" + strArr4[2] + "\",\n          \"md5\": null,\n          \"type\": [\"dinamicx$ol3_orderlisttabs$0$25\"]\n        }\n      ]\n    },\n    \"data\": {\n      \"boughtlist\": {\n        \"tag\": \"boughtlist\",\n        \"extendBlock\": \"true\",\n        \"hasMore\": \"true\"\n      },\n      \"query\": {\n        \"tag\": \"query\",\n        \"type\": \"dinamicx$ol3_orderlisttitle$0$9\",\n        \"fields\": {\n          \"url\": \"https://market.wapa.taobao.com/app/tb-source-app/order-search/pages/index?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&showBanner=true&newEntrance=true\"\n        },\n        \"position\": \"header\"\n      },\n      \"tab\": {\n        \"tag\": \"tab\",\n        \"type\": \"dinamicx$ol3_orderlisttabs$0$25\",\n        \"position\": \"header\"\n      }\n    },\n    \"linkage\": {\n      \"common\": {\n        \"compress\": \"false\"\n      }\n    },\n    \"hierarchy\": {\n      \"root\": \"boughtlist\",\n      \"structure\": {\n        \"boughtlist\": [\"query\", \"tab\"]\n      }\n    },\n    \"endpoint\": {\n      \"ultronage\": \"true\",\n      \"protocolVersion\": \"3.0\",\n      \"contextVersion\": \"trademanager2_20200915150443685_233077\",\n      \"page\": \"boughtlist\"\n    },\n    \"global\": {\n      \"foldDeviceRelatedPage\": \"" + z + "\"\n    },\n    \"reload\": \"true\"\n  },\n  \"ret\": [\"SUCCESS::调用成功\"],\n  \"v\": \"1.0\"\n}";
        }
        return JSON.parseObject(str);
    }

    public static JSONObject e(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97a17724", new Object[]{new Boolean(z)});
        }
        if (Localization.o()) {
            String[] strArr = hn2.EN_titleConfig;
            str = "{\n  \"api\": \"mtop.taobao.order.queryboughtlist\",\n  \"data\": {\n    \"container\": {\n      \"data\": [\n         {\n        \"name\": \"" + strArr[0] + "\",\n        \"containerType\": \"dinamicx\",\n        \"version\": \"" + strArr[1] + "\",\n        \"url\": \"" + strArr[2] + "\",\n        \"md5\": null,\n        \"type\": [\"dinamicx$ol3_orderlisttitle$0$9\"]\n      }]\n    },\n    \"data\": {\n      \"boughtlist\": {\n        \"tag\": \"boughtlist\",\n        \"extendBlock\": \"true\",\n        \"hasMore\": \"true\"\n      },\n      \"query\": {\n        \"tag\": \"query\",\n        \"type\": \"dinamicx$ol3_orderlisttitle$0$9\",\n        \"fields\": {\n          \"url\": \"https://market.wapa.taobao.com/app/tb-source-app/order-search/pages/index?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&showBanner=true&newEntrance=true\"\n        },\n        \"position\": \"header\"\n      }\n    },\n    \"linkage\": {\n      \"common\": {\n        \"compress\": \"false\"\n      }\n    },\n    \"hierarchy\": {\n      \"root\": \"boughtlist\",\n      \"structure\": {\n        \"boughtlist\": [\"query\"]}\n    },\n    \"endpoint\": {\n      \"ultronage\": \"true\",\n      \"protocolVersion\": \"3.0\",\n      \"contextVersion\": \"trademanager2_20200915150443685_233077\",\n      \"page\": \"boughtlist\"\n    },\n    \"global\": {\n      \"foldDeviceRelatedPage\": \"" + z + "\"\n    },\n    \"reload\": \"true\"\n  },\n  \"ret\": [\"SUCCESS::调用成功\"],\n  \"v\": \"1.0\"\n}";
        } else {
            String[] strArr2 = hn2.CN_titleConfig;
            str = "{\n  \"api\": \"mtop.taobao.order.queryboughtlist\",\n  \"data\": {\n    \"container\": {\n      \"data\": [\n         {\n        \"name\": \"" + strArr2[0] + "\",\n        \"containerType\": \"dinamicx\",\n        \"version\": \"" + strArr2[1] + "\",\n        \"url\": \"" + strArr2[2] + "\",\n        \"md5\": null,\n        \"type\": [\"dinamicx$ol3_orderlisttitle$0$9\"]\n      }]\n    },\n    \"data\": {\n      \"boughtlist\": {\n        \"tag\": \"boughtlist\",\n        \"extendBlock\": \"true\",\n        \"hasMore\": \"true\"\n      },\n      \"query\": {\n        \"tag\": \"query\",\n        \"type\": \"dinamicx$ol3_orderlisttitle$0$9\",\n        \"fields\": {\n          \"url\": \"https://market.wapa.taobao.com/app/tb-source-app/order-search/pages/index?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&showBanner=true&newEntrance=true\"\n        },\n        \"position\": \"header\"\n      }\n    },\n    \"linkage\": {\n      \"common\": {\n        \"compress\": \"false\"\n      }\n    },\n    \"hierarchy\": {\n      \"root\": \"boughtlist\",\n      \"structure\": {\n        \"boughtlist\": [\"query\"]}\n    },\n    \"endpoint\": {\n      \"ultronage\": \"true\",\n      \"protocolVersion\": \"3.0\",\n      \"contextVersion\": \"trademanager2_20200915150443685_233077\",\n      \"page\": \"boughtlist\"\n    },\n    \"global\": {\n      \"foldDeviceRelatedPage\": \"" + z + "\"\n    },\n    \"reload\": \"true\"\n  },\n  \"ret\": [\"SUCCESS::调用成功\"],\n  \"v\": \"1.0\"\n}";
        }
        return JSON.parseObject(str);
    }
}
