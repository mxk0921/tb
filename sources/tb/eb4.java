package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538160);
    }

    public static List<DeliverInfoBean> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6345c026", new Object[]{iDMComponent});
        }
        if (!(iDMComponent == null || iDMComponent.getFields() == null || !iDMComponent.getFields().containsKey("deliveryList"))) {
            try {
                return JSON.parseArray(iDMComponent.getFields().getString("deliveryList"), DeliverInfoBean.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String b(int i, DealInfo dealInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ac70f9", new Object[]{new Integer(i), dealInfo});
        }
        if (dealInfo == null) {
            return "0";
        }
        if (i == 1) {
            str = dealInfo.toPayBiz;
        } else if (i == 2) {
            str = dealInfo.hasPaid;
        } else if (i == 3) {
            str = dealInfo.toConfirmBiz;
        } else if (i == 4) {
            str = dealInfo.toComment;
        } else if (i != 5) {
            str = null;
        } else {
            str = dealInfo.refundBiz;
        }
        if (str == null) {
            return "0";
        }
        return str;
    }

    public static void d(IDMComponent iDMComponent, List<DeliverInfoBean> list) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7172a873", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null && (fields = iDMComponent.getFields()) != null) {
            fields.put("deliveryList", JSON.toJSON(list));
        }
    }

    public static void e(IDMComponent iDMComponent, JSONObject jSONObject) {
        JSONObject events;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff6b394", new Object[]{iDMComponent, jSONObject});
        } else if (iDMComponent != null && jSONObject != null && (events = iDMComponent.getEvents()) != null) {
            HashSet hashSet = new HashSet();
            hashSet.add("scrollBarExposureItem");
            for (String str : events.keySet()) {
                if (str.startsWith("exposeScrollBar") || str.startsWith("removeScrollBar")) {
                    hashSet.add(str);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                events.remove((String) it.next());
            }
            events.putAll(jSONObject);
        }
    }

    public static void c(IDMComponent iDMComponent, DealInfo dealInfo) {
        JSONObject fields;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6321cca7", new Object[]{iDMComponent, dealInfo});
        } else if (iDMComponent != null && iDMComponent.getFields() != null && dealInfo != null && (fields = iDMComponent.getFields()) != null && (jSONObject = fields.getJSONObject("orderInfo")) != null) {
            try {
                String b = b(1, dealInfo);
                jSONObject.getJSONObject(lcl.KEY_ORDER_PAY).put("count", (Object) b);
                JSONObject jSONObject2 = jSONObject.getJSONObject(lcl.KEY_ORDER_PAY);
                jSONObject2.put("accessbility", (Object) (jSONObject.getJSONObject(lcl.KEY_ORDER_PAY).getString("name") + b));
                String b2 = b(2, dealInfo);
                jSONObject.getJSONObject(lcl.KEY_ORDER_DELIVER).put("count", (Object) b2);
                JSONObject jSONObject3 = jSONObject.getJSONObject(lcl.KEY_ORDER_DELIVER);
                jSONObject3.put("accessbility", (Object) (jSONObject.getJSONObject(lcl.KEY_ORDER_DELIVER).getString("name") + b2));
                String b3 = b(3, dealInfo);
                jSONObject.getJSONObject(lcl.KEY_ORDER_RECEIVE).put("count", (Object) b3);
                JSONObject jSONObject4 = jSONObject.getJSONObject(lcl.KEY_ORDER_RECEIVE);
                jSONObject4.put("accessbility", (Object) (jSONObject.getJSONObject(lcl.KEY_ORDER_RECEIVE).getString("name") + b3));
                String b4 = b(4, dealInfo);
                jSONObject.getJSONObject(lcl.KEY_ORDER_RATE).put("count", (Object) b4);
                JSONObject jSONObject5 = jSONObject.getJSONObject(lcl.KEY_ORDER_RATE);
                jSONObject5.put("accessbility", (Object) (jSONObject.getJSONObject(lcl.KEY_ORDER_RATE).getString("name") + b4));
                String b5 = b(5, dealInfo);
                jSONObject.getJSONObject(lcl.KEY_ORDER_REFUND).put("count", (Object) b5);
                JSONObject jSONObject6 = jSONObject.getJSONObject(lcl.KEY_ORDER_REFUND);
                jSONObject6.put("accessbility", (Object) (jSONObject.getJSONObject(lcl.KEY_ORDER_REFUND).getString("name") + b5));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean f(IDMComponent iDMComponent, DealInfo dealInfo) {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1922261f", new Object[]{iDMComponent, dealInfo})).booleanValue();
        }
        if (!(iDMComponent == null || iDMComponent.getFields() == null || dealInfo == null)) {
            JSONObject fields = iDMComponent.getFields();
            if (fields == null || (jSONObject = fields.getJSONObject("orderInfo")) == null) {
                return false;
            }
            try {
                Iterator<lcl> it = lcl.a().iterator();
                while (it.hasNext()) {
                    if (g(jSONObject, dealInfo, it.next())) {
                        z = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static boolean g(JSONObject jSONObject, DealInfo dealInfo, lcl lclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e26df4", new Object[]{jSONObject, dealInfo, lclVar})).booleanValue();
        }
        if (lclVar == null) {
            return false;
        }
        String b = b(lclVar.f23258a, dealInfo);
        if (TextUtils.equals(b, jSONObject.getJSONObject(lclVar.b).getString("count"))) {
            return false;
        }
        jSONObject.getJSONObject(lclVar.b).put("count", (Object) b);
        JSONObject jSONObject2 = jSONObject.getJSONObject(lclVar.b);
        jSONObject2.put("accessbility", (Object) (jSONObject.getJSONObject(lclVar.b).getString("name") + b));
        return true;
    }
}
