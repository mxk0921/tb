package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tun extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final String j = "refreshListItemAsync";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031906);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af64b3bd", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(tun tunVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/event/RefreshListItemAsyncSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "372668979346071596";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        fsb b;
        List<IDMComponent> components;
        JSONObject fields;
        JSONObject jSONObject;
        String str = "matchBenefitList";
        String str2 = "benefitDTOList";
        String str3 = "orderId";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            try {
                o5e n = b8vVar.n();
                if (!(n == null || (b = n.b()) == null || (components = b.getComponents()) == null)) {
                    ArrayList arrayList = new ArrayList();
                    DMEvent dMEvent = (DMEvent) b8vVar.f();
                    if (!(dMEvent == null || (fields = dMEvent.getFields()) == null || (jSONObject = fields.getJSONObject("content")) == null)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("data").getJSONObject(0).getJSONObject("item").getJSONArray("asyncBenefitResList");
                        ckf.f(jSONArray, "responseData.getJSONArra…ay(\"asyncBenefitResList\")");
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                JSONObject jSONObject2 = (JSONObject) next;
                                String string = jSONObject2.getString(str3);
                                JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                                ckf.f(jSONArray2, str2);
                                for (Object obj : jSONArray2) {
                                    if (obj != null) {
                                        JSONObject jSONObject3 = (JSONObject) obj;
                                        String string2 = jSONObject3.getString(str3);
                                        JSONArray jSONArray3 = jSONObject3.getJSONObject("boughtBenefitDTO").getJSONArray(str);
                                        ckf.f(jSONArray3, str);
                                        for (Object obj2 : jSONArray3) {
                                            if (obj2 != null) {
                                                JSONObject jSONObject4 = (JSONObject) obj2;
                                                String string3 = jSONObject4.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
                                                String string4 = jSONObject4.getString("matchArrayKey");
                                                JSONArray jSONArray4 = jSONObject4.getJSONArray("matchArrayValue");
                                                String string5 = jSONObject4.getString("matchArrayMapKey");
                                                JSONObject jSONObject5 = jSONObject4.getJSONObject(pg1.ATOM_values);
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj3 : components) {
                                                    IDMComponent iDMComponent = (IDMComponent) obj3;
                                                    ckf.f(iDMComponent, AdvanceSetting.NETWORK_TYPE);
                                                    if (ckf.b(iDMComponent.getId(), string) && ckf.b(iDMComponent.getTag(), string3)) {
                                                        arrayList2.add(obj3);
                                                    }
                                                    str = str;
                                                    str2 = str2;
                                                    str3 = str3;
                                                }
                                                Iterator it2 = arrayList2.iterator();
                                                while (it2.hasNext()) {
                                                    IDMComponent iDMComponent2 = (IDMComponent) it2.next();
                                                    ckf.f(iDMComponent2, AdvanceSetting.NETWORK_TYPE);
                                                    String string6 = iDMComponent2.getFields().getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID);
                                                    if (!(string6 == null || string6.length() == 0 || string2 == null || string2.length() == 0 || ckf.b(iDMComponent2.getFields().getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID), string2))) {
                                                    }
                                                    if (!arrayList.contains(iDMComponent2)) {
                                                        arrayList.add(iDMComponent2);
                                                    }
                                                    K(iDMComponent2, string4, jSONArray4, string5, jSONObject5);
                                                }
                                                it = it;
                                                str = str;
                                                str2 = str2;
                                                str3 = str3;
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                            }
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                            }
                        }
                        b8vVar.n().e(arrayList);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void K(IDMComponent iDMComponent, String str, JSONArray jSONArray, String str2, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf9f45b", new Object[]{this, iDMComponent, str, jSONArray, str2, jSONObject});
        } else if (str != null && jSONObject != null) {
            try {
                List z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    JSONObject data = iDMComponent.getData();
                    if (z0.size() > 1) {
                        String str3 = (String) i04.l0(z0);
                        for (Object obj : z0) {
                            i++;
                            if (i >= 0) {
                                String str4 = (String) obj;
                                if (data.get(str4) instanceof JSONArray) {
                                    Object obj2 = data.get(str4);
                                    if (obj2 != null) {
                                        for (Object obj3 : (JSONArray) obj2) {
                                            if (obj3 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                            } else if (jSONArray.contains(((JSONObject) obj3).getString(str3))) {
                                                if (str2 != null) {
                                                    L((JSONObject) obj3, str2, jSONObject);
                                                } else {
                                                    ((JSONObject) obj3).putAll(jSONObject);
                                                }
                                            }
                                        }
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                                    }
                                } else if (!(data.get(str4) instanceof JSONObject)) {
                                    continue;
                                } else {
                                    Object obj4 = data.get(str4);
                                    if (obj4 != null) {
                                        data = (JSONObject) obj4;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                    }
                                }
                            } else {
                                yz3.p();
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                JSONObject data2 = iDMComponent.getData();
                ckf.f(data2, "component.data");
                L(data2, str, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void L(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280c06d", new Object[]{this, jSONObject, str, jSONObject2});
            return;
        }
        try {
            List z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
            for (Object obj : z0) {
                i++;
                if (i >= 0) {
                    Object obj2 = jSONObject.get((String) obj);
                    if (obj2 != null) {
                        jSONObject = (JSONObject) obj2;
                        if (i == z0.size() - 1) {
                            jSONObject.putAll(jSONObject2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                } else {
                    yz3.p();
                    throw null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        t2o.a(713031905);
    }
}
