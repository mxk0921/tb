package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qqu<BEAN extends TypedBean, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, az<? extends BEAN, CTX>> f26887a = new ConcurrentHashMap();
    public final az b;
    public final az c;
    public final yko d;

    static {
        t2o.a(993001928);
    }

    public qqu(yko ykoVar, az azVar, az azVar2) {
        this.b = azVar;
        this.c = azVar2;
        this.d = ykoVar;
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73b9b741", new Object[]{jSONObject});
        }
        String string = jSONObject.getString("tItemType");
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("type");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4f849e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TypedBean.isMuise(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57c89ca0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TypedBean.isWeex(str);
    }

    public static void g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eae676", new Object[]{jSONObject, str});
        } else {
            jSONObject.put("tItemType", (Object) str);
        }
    }

    public TypedBean d(JSONObject jSONObject, CTX ctx) {
        az azVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedBean) ipChange.ipc$dispatch("c2101dd6", new Object[]{this, jSONObject, ctx});
        }
        String a2 = a(jSONObject);
        if (a2 == null) {
            return null;
        }
        if (c(a2) && this.b != null) {
            azVar = WXSDKEngine.isRemoteInstalled() ? this.b : null;
        } else if (!b(a2) || (azVar = this.c) == null) {
            azVar = (az) ((ConcurrentHashMap) this.f26887a).get(a2);
        }
        if (azVar != null) {
            return (TypedBean) azVar.f(jSONObject, ctx);
        }
        this.d.l().d("BaseParserRegistration", "no parser for ".concat(a2));
        return null;
    }

    public void e(String str, az<? extends BEAN, CTX> azVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d88f1c", new Object[]{this, str, azVar});
            return;
        }
        if (((ConcurrentHashMap) this.f26887a).containsKey(str)) {
            c4p l = this.d.l();
            l.d("BaseParserRegistration", "register parser type exist already: " + str);
        }
        ((ConcurrentHashMap) this.f26887a).put(str, azVar);
    }

    public void f(az<? extends BEAN, CTX> azVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5dd3e26", new Object[]{this, azVar});
            return;
        }
        String c = azVar.c();
        if (((ConcurrentHashMap) this.f26887a).containsKey(c)) {
            c4p l = this.d.l();
            l.d("BaseParserRegistration", "register parser type exist already: " + c);
        }
        ((ConcurrentHashMap) this.f26887a).put(c, azVar);
    }
}
