package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uhv extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_NEXT_EVENTS = "nextEvents";
    public static final String FIELD_OLD_DATA = "oldData";
    public static final String NEXT_TAG_FINISH = "finish";
    public static final String SUBSCRIBER_ID = "unionOrderConverterV2";
    public static final String[] j = {"babel_orderdetail_unionpay_title", "4", "https://ossgw.alicdn.com/rapid-oss-bucket/publish/1699951192210/babel_orderdetail_unionpay_title.zip"};
    public static final String[] k = {"babel_orderdetail_unionpay_body", "4", "https://ossgw.alicdn.com/rapid-oss-bucket/publish/1699951239526/babel_orderdetail_unionpay_body.zip"};
    public static final String[] l = {"babel_orderdetail_unionpay_tail", "7", "https://dinamicx.alibabausercontent.com/pub/babel_orderdetail_unionpay_tail/1699953946811/babel_orderdetail_unionpay_tail.zip"};
    public static final String[] m = {"overseas_babel_orderdetail_unionpay_title", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_title/1723044196091/overseas_babel_orderdetail_unionpay_title.zip"};
    public static final String[] n = {"overseas_babel_orderdetail_unionpay_body", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_body/1723089887530/overseas_babel_orderdetail_unionpay_body.zip"};
    public static final String[] o = {"overseas_babel_orderdetail_unionpay_tail", "9", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_tail/1723102536297/overseas_babel_orderdetail_unionpay_tail.zip"};

    public static /* synthetic */ Object ipc$super(uhv uhvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/UnionOrderConverterV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-1819325845950889468";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        JSONObject J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (E(b8vVar) != null && (E(b8vVar).get(FIELD_OLD_DATA) instanceof JSONObject) && (E(b8vVar).get(FIELD_NEXT_EVENTS) instanceof JSONObject) && (J = J(E(b8vVar).getJSONObject(FIELD_OLD_DATA), E(b8vVar).getJSONObject(FIELD_NEXT_EVENTS), b8vVar.d())) != null) {
            D(b8vVar, "finish", J);
        }
    }

    static {
        t2o.a(614465766);
    }

    public final JSONObject J(JSONObject jSONObject, JSONObject jSONObject2, IDMComponent iDMComponent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("974f061f", new Object[]{this, jSONObject, jSONObject2, iDMComponent});
        }
        if (iDMComponent == null || !(jSONObject.get("data") instanceof JSONObject) || !(jSONObject.getJSONObject("data").get("title") instanceof String) || !(jSONObject.getJSONObject("data").get("multiDetailInfo") instanceof JSONArray) || !(jSONObject.getJSONObject("data").get(k68.KEY_OP) instanceof JSONArray)) {
            return null;
        }
        if (Localization.o()) {
            String[] strArr = m;
            String str7 = strArr[0];
            String str8 = strArr[1];
            String str9 = strArr[2];
            String[] strArr2 = n;
            str4 = k68.KEY_OP;
            String str10 = strArr2[0];
            str3 = "multiDetailInfo";
            String str11 = strArr2[1];
            str2 = "title";
            String str12 = strArr2[2];
            String[] strArr3 = o;
            str = "data";
            str5 = "{\n    \"data\":{\n        \"container\": {\n            \"data\": [\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + str7 + "\",\n                    \"type\": [\n                        \"dinamicx$unionordertitle\"\n                    ],\n                    \"version\": \"" + str8 + "\",\n                    \"url\": \"" + str9 + "\",\n                    \"md5\": \"fb78b2e75f737992d2d20ecb261b79bf\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + str10 + "\",\n                    \"type\": [\n                        \"dinamicx$unionorderbody\"\n                    ],\n                    \"version\": \"" + str11 + "\",\n                    \"url\": \"" + str12 + "\",\n                    \"md5\": \"411fca69a51849b8cb6a54ae946e6ffd\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + strArr3[0] + "\",\n                    \"type\": [\n                        \"dinamicx$unionorderbuttons\"\n                    ],\n                    \"version\": \"" + strArr3[1] + "\",\n                    \"url\": \"" + strArr3[2] + "\",\n                    \"md5\": \"9b285cb1130e0537129528215ea169fe\"\n                }\n            ]\n        },\n        \"endpoint\": {\n            \"protocolVersion\": \"3.0\",\n            \"ultronage\": \"true\"\n        },\n        \"reload\": \"true\",\n        \"data\": {\n            \"popTitle\": {\n                \"id\": \"1\",\n                \"position\": \"header\",\n                \"type\": \"dinamicx$unionordertitle\",\n                \"fields\": {\n                    \"title\": \"\"\n                }\n            },\n            \"opButtons\": {\n                \"id\": \"1\",\n                \"position\": \"footer\",\n                \"type\": \"dinamicx$unionorderbuttons\",\n                \"fields\": {\n                    \"leftButtonEvent\": \"\",\n                    \"leftButtonText\": \"\",\n                    \"rightButtonText\": \"\",\n                    \"rightButtonEvent\": \"\",\n                    \"cancelOrderDowngrade\":{\n                        \n                    }\n                },\n                \"events\": {\n                }\n            },\n            \"popBody\": {\n                \"id\": \"1\",\n                \"type\": \"dinamicx$unionorderbody\",\n                \"fields\": {\n                    \"warnTips\": {\n                        \"desc\": \"\"\n                    },\n                    \"multiDetailInfo\": [\n                        {\n                            \"highLight\": \"true\",\n                            \"name\": \"\",\n                            \"nameTips\": \"\",\n                            \"value\": \"\"\n                        }\n                    ],\n                    \"detailInfo\": [\n                        {\n                            \"name\": \"\",\n                            \"value\": \"\"\n                        }\n                    ]\n                }\n            },\n            \"unionOrderPop\": {\n                \"type\": \"block$emptyBlock\",\n                \"tag\": \"bodyBlock\"\n            }\n        },\n        \"hierarchy\": {\n            \"root\": \"unionOrderPop\",\n            \"structure\": {\n                \"unionOrderPop\": [\n                    \"popTitle\",\n                    \"popBody\",\n                    \"opButtons\"\n                ]\n            }\n        },\n        \"linkage\": {}\n    }\n}";
        } else {
            str = "data";
            str2 = "title";
            str3 = "multiDetailInfo";
            str4 = k68.KEY_OP;
            String[] strArr4 = j;
            String str13 = strArr4[0];
            String str14 = strArr4[1];
            String str15 = strArr4[2];
            String[] strArr5 = k;
            String str16 = strArr5[0];
            String str17 = strArr5[1];
            String str18 = strArr5[2];
            String[] strArr6 = l;
            str5 = "{\n    \"data\":{\n        \"container\": {\n            \"data\": [\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + str13 + "\",\n                    \"type\": [\n                        \"dinamicx$unionordertitle\"\n                    ],\n                    \"version\": \"" + str14 + "\",\n                    \"url\": \"" + str15 + "\",\n                    \"md5\": \"fb78b2e75f737992d2d20ecb261b79bf\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + str16 + "\",\n                    \"type\": [\n                        \"dinamicx$unionorderbody\"\n                    ],\n                    \"version\": \"" + str17 + "\",\n                    \"url\": \"" + str18 + "\",\n                    \"md5\": \"411fca69a51849b8cb6a54ae946e6ffd\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"" + strArr6[0] + "\",\n                    \"type\": [\n                        \"dinamicx$unionorderbuttons\"\n                    ],\n                    \"version\": \"" + strArr6[1] + "\",\n                    \"url\": \"" + strArr6[2] + "\",\n                    \"md5\": \"9b285cb1130e0537129528215ea169fe\"\n                }\n            ]\n        },\n        \"endpoint\": {\n            \"protocolVersion\": \"3.0\",\n            \"ultronage\": \"true\"\n        },\n        \"reload\": \"true\",\n        \"data\": {\n            \"popTitle\": {\n                \"id\": \"1\",\n                \"position\": \"header\",\n                \"type\": \"dinamicx$unionordertitle\",\n                \"fields\": {\n                    \"title\": \"\"\n                }\n            },\n            \"opButtons\": {\n                \"id\": \"1\",\n                \"position\": \"footer\",\n                \"type\": \"dinamicx$unionorderbuttons\",\n                \"fields\": {\n                    \"leftButtonEvent\": \"\",\n                    \"leftButtonText\": \"\",\n                    \"rightButtonText\": \"\",\n                    \"rightButtonEvent\": \"\",\n                    \"cancelOrderDowngrade\":{\n                        \n                    }\n                },\n                \"events\": {\n                }\n            },\n            \"popBody\": {\n                \"id\": \"1\",\n                \"type\": \"dinamicx$unionorderbody\",\n                \"fields\": {\n                    \"warnTips\": {\n                        \"desc\": \"\"\n                    },\n                    \"multiDetailInfo\": [\n                        {\n                            \"highLight\": \"true\",\n                            \"name\": \"\",\n                            \"nameTips\": \"\",\n                            \"value\": \"\"\n                        }\n                    ],\n                    \"detailInfo\": [\n                        {\n                            \"name\": \"\",\n                            \"value\": \"\"\n                        }\n                    ]\n                }\n            },\n            \"unionOrderPop\": {\n                \"type\": \"block$emptyBlock\",\n                \"tag\": \"bodyBlock\"\n            }\n        },\n        \"hierarchy\": {\n            \"root\": \"unionOrderPop\",\n            \"structure\": {\n                \"unionOrderPop\": [\n                    \"popTitle\",\n                    \"popBody\",\n                    \"opButtons\"\n                ]\n            }\n        },\n        \"linkage\": {}\n    }\n}";
        }
        JSONObject parseObject = JSON.parseObject(str5);
        parseObject.getJSONObject(str).getJSONObject(str).getJSONObject("popTitle").getJSONObject("fields").put(str2, (Object) jSONObject.getJSONObject(str).getString(str2));
        JSONObject jSONObject3 = parseObject.getJSONObject(str).getJSONObject(str).getJSONObject("popBody").getJSONObject("fields");
        if (jSONObject.getJSONObject(str).get("detailInfo") instanceof JSONArray) {
            jSONObject3.put("detailInfo", (Object) jSONObject.getJSONObject(str).getJSONArray("detailInfo"));
        }
        jSONObject3.put(str3, (Object) jSONObject.getJSONObject(str).getJSONArray(str3));
        JSONObject jSONObject4 = parseObject.getJSONObject(str).getJSONObject(str).getJSONObject("opButtons").getJSONObject("fields");
        JSONObject jSONObject5 = parseObject.getJSONObject(str).getJSONObject(str).getJSONObject("opButtons").getJSONObject("events");
        Iterator<Object> it = jSONObject.getJSONObject(str).getJSONArray(str4).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                String str19 = (String) next;
                if (i > 1) {
                    break;
                } else if ((jSONObject2.get(str19) instanceof JSONObject) && (jSONObject2.getJSONObject(str19).get("text") instanceof String)) {
                    if (i == 0) {
                        str6 = "leftButtonEvent";
                        jSONObject4.put(str6, (Object) str19);
                        jSONObject4.put("leftButtonText", (Object) jSONObject2.getJSONObject(str19).getString("text"));
                    } else {
                        str6 = "rightButtonEvent";
                        jSONObject4.put(str6, (Object) str19);
                        jSONObject4.put("rightButtonText", (Object) jSONObject2.getJSONObject(str19).getString("text"));
                    }
                    if (iDMComponent.getFields() == null || iDMComponent.getFields().getJSONObject(oml.EVENT_CODE_CANCEL_ORDER_DOWNGRADE) == null || !TextUtils.equals(iDMComponent.getFields().getJSONObject(oml.EVENT_CODE_CANCEL_ORDER_DOWNGRADE).getString(v4s.PARAM_OP_CODE), str19)) {
                        jSONObject5.put(str19, (Object) axf.a(jSONObject2.getJSONObject(str19).getJSONArray("event")));
                    } else {
                        jSONObject4.put(oml.EVENT_CODE_CANCEL_ORDER_DOWNGRADE, (Object) iDMComponent.getFields().getJSONObject(oml.EVENT_CODE_CANCEL_ORDER_DOWNGRADE));
                        jSONObject4.put(str6, (Object) oml.e(iDMComponent, str19));
                    }
                    i++;
                }
            }
        }
        return parseObject;
    }
}
