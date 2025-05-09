package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.event.RecmdGatewayMsg;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = "preloadOptimize";
    public static boolean d;

    /* renamed from: a  reason: collision with root package name */
    public final imi f26514a;
    public final xs6 b;

    public q5a(xs6 xs6Var, imi imiVar) {
        this.f26514a = imiVar;
        this.b = xs6Var;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc65eb13", new Object[0])).booleanValue();
        }
        return d;
    }

    public final void a(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c39f27", new Object[]{this, str, strArr, jSONObject});
            return;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str, "PageBack")) {
                h(str2, jSONObject);
            }
        }
    }

    public final JSONObject b(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f89d7bde", new Object[]{this, str, strArr, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("containers", (Object) strArr);
        a(str, strArr, c(jSONObject));
        return jSONObject;
    }

    public final JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f42aa86", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("bizParam", (Object) jSONObject3);
        return jSONObject3;
    }

    public final void e(String str, x4a x4aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3489b7", new Object[]{this, str, x4aVar, jSONObject});
            return;
        }
        b5a b5aVar = new b5a(str, x4aVar, jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            this.f26514a.c(message);
        }
    }

    public final String[] f(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e82e5829", new Object[]{this, strArr});
        }
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void g(String str, x4a x4aVar, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722aaaa2", new Object[]{this, str, x4aVar, strArr, jSONObject});
            return;
        }
        String[] f = f(strArr);
        if (!TextUtils.isEmpty(str) && f != null && x4aVar != null) {
            e(str, x4aVar, b(str, f, jSONObject));
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65540b9a", new Object[]{this, str, jSONObject});
            return;
        }
        d = false;
        dwe.g(this.b.e(), str);
        JSONObject d2 = dwe.d(str);
        boolean n = dwe.n();
        if (d2 != null && n) {
            d = true;
            for (String str2 : d2.keySet()) {
                String string = d2.getString(str2);
                jSONObject.put(str2, (Object) d2.getString(str2));
                if (TextUtils.equals("itemId", str2)) {
                    dwe.h(str, string);
                }
            }
        }
    }

    static {
        t2o.a(487587951);
    }
}
