package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class avq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sb4 f16029a;

    static {
        t2o.a(758120462);
    }

    public avq(sb4 sb4Var) {
        this.f16029a = sb4Var;
    }

    public final JSONObject a(Collection<?> collection, Component component) {
        String string;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1640b2a", new Object[]{this, collection, component});
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Component component2 = (Component) it.next();
            if (component == null) {
                jSONObject = component2.b();
            } else {
                jSONObject = component2.a();
            }
            if (jSONObject != null) {
                jSONObject2.put(component2.f(), (Object) jSONObject);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        ne8 b = this.f16029a.b();
        JSONObject jSONObject4 = b.d;
        if (jSONObject4 != null) {
            JSONObject jSONObject5 = new JSONObject();
            String string2 = jSONObject4.getString("validateParams");
            boolean booleanValue = jSONObject4.getBooleanValue("compress");
            if (component == null) {
                String string3 = jSONObject4.getString("submitParams");
                if (!(string3 == null && string2 == null)) {
                    if (string3 != null && !string3.isEmpty()) {
                        jSONObject5.put("submitParams", (Object) string3);
                    }
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject5.put("validateParams", (Object) string2);
                    }
                    jSONObject5.put("compress", (Object) Boolean.valueOf(booleanValue));
                    jSONObject4 = jSONObject5;
                }
                jSONObject3.put("common", (Object) jSONObject4);
            } else {
                String string4 = jSONObject4.getString("queryParams");
                if (!(string4 == null && string2 == null)) {
                    if (string4 != null && !string4.isEmpty()) {
                        jSONObject5.put("queryParams", (Object) string4);
                    }
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject5.put("validateParams", (Object) string2);
                    }
                    jSONObject5.put("compress", (Object) Boolean.valueOf(booleanValue));
                    jSONObject4 = jSONObject5;
                }
                jSONObject3.put("common", (Object) jSONObject4);
            }
        }
        JSONObject jSONObject6 = b.c;
        if (!(jSONObject6 == null || (string = jSONObject6.getString(SimpleProfile.KEY_SIGNATURE)) == null || string.isEmpty())) {
            jSONObject3.put(SimpleProfile.KEY_SIGNATURE, (Object) string);
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("structure", (Object) b.f24678a);
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("data", (Object) jSONObject2);
        jSONObject8.put("linkage", (Object) jSONObject3);
        jSONObject8.put("hierarchy", (Object) jSONObject7);
        if (component != null) {
            jSONObject8.put(x96.PATH_OPERATOR, (Object) component.f());
        }
        return jSONObject8;
    }

    public JSONObject b() {
        HashMap<String, Component> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cdddf1ea", new Object[]{this});
        }
        ne8 b = this.f16029a.b();
        if (b == null || (hashMap = b.g) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Component component : hashMap.values()) {
            if (component.l()) {
                arrayList.add(component);
            }
        }
        return a(arrayList, null);
    }
}
