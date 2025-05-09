package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String j;
    public static final String k;

    /* renamed from: a  reason: collision with root package name */
    public String f26174a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public JSONArray g;
    public String h;
    public JSONArray i;

    public pm0 a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("5946e128", new Object[]{this, str, jSONArray});
        }
        this.f = str;
        this.g = jSONArray;
        return this;
    }

    public pm0 b(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("282e7f69", new Object[]{this, str, jSONArray});
        }
        this.h = str;
        this.i = jSONArray;
        return this;
    }

    public pm0 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("c8e9371f", new Object[]{this, str});
        }
        this.f26174a = str;
        return this;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73f0d972", new Object[]{this});
        }
        String m = m();
        String str = k;
        String str2 = this.b;
        String str3 = this.e;
        JSONObject a2 = tj.a(l(str, str2, str3, "", m, this.d, this.f26174a, str3, this.f, this.h));
        if (a2 == null) {
            a2 = j();
        }
        n(a2);
        return a2;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc1aa3cd", new Object[]{this});
        }
        String m = m();
        String str = j;
        String str2 = this.b;
        String str3 = this.e;
        JSONObject a2 = tj.a(l(str, str2, str3, "", m, this.d, this.f26174a, str3, this.f, this.h));
        if (a2 == null) {
            a2 = k();
        }
        n(a2);
        return a2;
    }

    public pm0 f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("3fa8440d", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public pm0 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("153181da", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public pm0 h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("a44bab1e", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public pm0 i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm0) ipChange.ipc$dispatch("d00253b5", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public final JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ea1197", new Object[]{this});
        }
        return JSON.parseObject(l(k, Localization.q(R.string.app_purchase_fail), Localization.q(R.string.purchase_taobao_app_1029_1_19070), "", "0000000000000", "0000000000000", "", Localization.q(R.string.taobao_app_1029_1_17517), null, null));
    }

    public final JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f6d8419c", new Object[]{this});
        }
        return JSON.parseObject(l(j, Localization.q(R.string.app_purchase_fail), Localization.q(R.string.purchase_taobao_app_1029_1_19070), "", "0000000000000", "0000000000000", "", Localization.q(R.string.taobao_app_1029_1_17517), null, null));
    }

    public final String l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f8dbbf7", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
        }
        String str19 = "";
        if (str2 != null) {
            str11 = str2;
        } else {
            str11 = str19;
        }
        if (str3 != null) {
            str12 = str3;
        } else {
            str12 = str19;
        }
        if (str4 != null) {
            str13 = str4;
        } else {
            str13 = str19;
        }
        if (str5 != null) {
            str14 = str5;
        } else {
            str14 = str19;
        }
        if (str6 != null) {
            str15 = str6;
        } else {
            str15 = str19;
        }
        if (str7 != null) {
            str16 = str7;
        } else {
            str16 = str19;
        }
        if (str8 != null) {
            str17 = str8;
        } else {
            str17 = str19;
        }
        if (str9 != null) {
            str18 = str9;
        } else {
            str18 = str19;
        }
        if (str10 != null) {
            str19 = str10;
        }
        return String.format(str, str11, str12, str13, str14, str18, str19, str15, str16, str17);
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e533a3c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(this.d);
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append(" \n ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    public final void n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf06aa71", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("commonErrorActionButtion")) != null && (jSONObject3 = jSONObject2.getJSONObject("events")) != null) {
            JSONArray jSONArray = this.g;
            if (jSONArray != null) {
                jSONObject3.put("leftClick", (Object) jSONArray);
            }
            JSONArray jSONArray2 = this.i;
            if (jSONArray2 != null) {
                jSONObject3.put("rightClick", (Object) jSONArray2);
            }
        }
    }

    static {
        t2o.a(301990102);
        String q = Localization.q(R.string.app_i_know);
        j = "{\n    \"container\": {\n      \"data\": [\n        {\n          \"name\": \"buy_v2_pop_bottom\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"10\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_bottom/1698133079319/buy_v2_pop_bottom.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_error\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"15\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_error/1699341740087/buy_v2_pop_error.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_error$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_item\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"18\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_item/1698132718062/buy_v2_pop_item.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_item$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_title\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"10\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_title/1698132583405/buy_v2_pop_title.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_title$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"popup_window\",\n          \"containerType\": \"layout\",\n          \"version\": \"0\",\n          \"url\": null,\n          \"md5\": null,\n          \"type\": [\n            \"layout$popup_window$0$0\"\n          ]\n        },\n        {\n          \"name\": \"sticky\",\n          \"containerType\": \"layout\",\n          \"version\": \"0\",\n          \"url\": null,\n          \"md5\": null,\n          \"type\": [\n            \"layout$sticky$0$0\"\n          ]\n        }\n      ]\n    },\n    \"data\": {\n      \"commonErrorPopup\": {\n        \"tag\": \"commonErrorPopup\",\n        \"type\": \"layout$popup_window$0$0\",\n        \"fields\": {\n          \"code\": \"commonErrorPopup\",\n          \"state\": \"open\",\n          \"style\": {\n            \"diablePullGesture\": \"true\",\n            \"disableTapGesture\": \"true\",\n            \"heightRatio\": \"0.5\",\n            \"needCloseButton\": \"false\",\n            \"showCloseButton\": \"false\"\n          }\n        }\n      },\n      \"commonErrorPopupTips\": {\n        \"tag\": \"commonErrorPopupTips\",\n        \"type\": \"dinamicx$buy_v2_pop_error$0$generalerrorpage\",\n        \"fields\": {\n          \"title\": \"%s\",\n          \"firstSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"icon\": \"https://img.alicdn.com/imgextra/i1/O1CN01o7ua0u1VDY4sH1hCj_!!6000000002619-2-tps-300-300.png\",\n          \"secondSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"traceInfo\": \"%s\"\n        }\n      },\n      \"commonErrorPopupFooter\": {\n        \"tag\": \"commonErrorPopupFooter\",\n        \"type\": \"layout$sticky$0$0\",\n        \"fields\": {\n          \"position\": \"bottom\"\n        }\n      },\n      \"commonErrorActionButtion\": {\n        \"tag\": \"commonErrorActionButtion\",\n        \"type\": \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\",\n        \"fields\": {\n          \"buttonText\": \"" + q + "\",\n          \"leftButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FECB00\",\n               \"endGradientColor\": \"#FE9502\"\n          },\n          \"rightButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FF7D00\",\n               \"endGradientColor\": \"#FF5000\"\n           }\n        },\n        \"events\": {\n          \"itemClick\": [\n            {\n              \"type\": \"pop\"\n            }\n          ],\n          \"exposureItem\": [\n            {\n              \"type\": \"userTrack\",\n              \"fields\": {\n                \"arg1\": \"Page_ConfirmOrder_Alert_New\",\n                \"arg2\": \"commonErrorPage\",\n                \"args\": {\n                  \"errorCode\": \"%s\",\n                  \"api\": \"%s\",\n                  \"errorMsg\": \"%s\"\n                },\n                \"eventId\": \"2201\",\n                \"page\": \"Page_Order\"\n              }\n            }\n          ]\n        }\n      }\n    },\n    \"endpoint\": {\n      \"protocolVersion\": \"4.0\"\n    },\n    \"hierarchy\": {\n      \"root\": \"generalErrorPage\",\n      \"structure\": {\n        \"generalErrorPage\": [\n          \"errorPopup\"\n        ],\n        \"errorPopup\": [\n          \"commonErrorPopup\"\n        ],\n        \"commonErrorPopup\": [\n          \"commonErrorPopupTips\",\n          \"commonErrorPopupFooter\"\n        ],\n        \"commonErrorPopupFooter\": [\n          \"commonErrorActionButtion\"\n        ]\n      }\n    }\n  }";
        k = "{\n    \"data\": {\n      \"commonErrorPopup\": {\n        \"tag\": \"commonErrorPopup\",\n        \"type\": \"layout$popup_window$0$0\",\n        \"fields\": {\n          \"code\": \"commonErrorPopup\",\n          \"state\": \"open\",\n          \"style\": {\n            \"diablePullGesture\": \"true\",\n            \"disableTapGesture\": \"true\",\n            \"heightRatio\": \"0.5\",\n            \"needCloseButton\": \"false\",\n            \"showCloseButton\": \"false\"\n          }\n        }\n      },\n      \"commonErrorPopupTips\": {\n        \"tag\": \"commonErrorPopupTips\",\n        \"type\": \"dinamicx$buy_v2_pop_error$0$generalerrorpage\",\n        \"fields\": {\n          \"title\": \"%s\",\n          \"firstSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"icon\": \"https://img.alicdn.com/imgextra/i1/O1CN01o7ua0u1VDY4sH1hCj_!!6000000002619-2-tps-300-300.png\",\n          \"secondSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"traceInfo\": \"%s\"\n        }\n      },\n      \"commonErrorPopupFooter\": {\n        \"tag\": \"commonErrorPopupFooter\",\n        \"type\": \"layout$sticky$0$0\",\n        \"fields\": {\n          \"position\": \"bottom\"\n        }\n      },\n      \"commonErrorActionButtion\": {\n        \"tag\": \"commonErrorActionButtion\",\n        \"type\": \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\",\n        \"fields\": {\n          \"buttonText\": \"" + q + "\",\n          \"leftButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FECB00\",\n               \"endGradientColor\": \"#FE9502\"\n          },\n          \"rightButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FF7D00\",\n               \"endGradientColor\": \"#FF5000\"\n           }\n        },\n        \"events\": {\n          \"itemClick\": [\n            {\n              \"type\": \"pop\"\n            }\n          ],\n          \"exposureItem\": [\n            {\n              \"type\": \"userTrack\",\n              \"fields\": {\n                \"arg1\": \"Page_ConfirmOrder_Alert_New\",\n                \"arg2\": \"commonErrorPage\",\n                \"args\": {\n                  \"api\": \"%s\",\n                  \"errorCode\": \"%s\",\n                  \"errorMsg\": \"%s\"\n                },\n                \"eventId\": \"2201\",\n                \"page\": \"Page_Order\"\n              }\n            }\n          ]\n        }\n      }\n    },\n    \"hierarchy\": {\n      \"delta\": [\n        {\n          \"opType\": \"replace\",\n          \"target\": \"commonErrorPopup\"\n        },\n        {\n          \"opType\": \"replace\",\n          \"target\": \"commonErrorPopupTips\"\n        },\n        {\n          \"opType\": \"replace\",\n          \"target\": \"commonErrorPopupFooter\"\n        },\n        {\n          \"opType\": \"replace\",\n          \"target\": \"commonErrorActionButtion\"\n        }\n      ]\n    },\n  }";
    }
}
