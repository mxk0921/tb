package com.taobao.android.icart.weex.call;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.callback.CartCallbackManager;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.Globals;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.f8e;
import tb.fkj;
import tb.g1a;
import tb.gkj;
import tb.j2e;
import tb.jdb;
import tb.kjf;
import tb.o6g;
import tb.rv;
import tb.sv;
import tb.t2o;
import tb.t6x;
import tb.v4s;
import tb.xhv;
import tb.z5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartMegaManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CartMegaManager INSTANCE = new CartMegaManager();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, rv> f8041a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/icart/weex/call/CartMegaManager$InstanceType;", "", "(Ljava/lang/String;I)V", "WEEX", "NATIVE", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum InstanceType {
        WEEX,
        NATIVE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(InstanceType instanceType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/CartMegaManager$InstanceType");
        }

        public static InstanceType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("666a16b6", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(InstanceType.class, str);
            }
            return (InstanceType) valueOf;
        }
    }

    static {
        t2o.a(478150922);
    }

    public static /* synthetic */ void e(CartMegaManager cartMegaManager, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c160497", new Object[]{cartMegaManager, str, str2, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        cartMegaManager.d(str, str2, jSONObject);
    }

    public static /* synthetic */ JSONObject h(CartMegaManager cartMegaManager, List list, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9ca6a60f", new Object[]{cartMegaManager, list, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return cartMegaManager.g(list);
    }

    public final void a(String str, f8e f8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602b876f", new Object[]{this, str, f8eVar});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(f8eVar, "cartVEngine");
        f8041a.put(str, new fkj(new gkj(f8eVar)));
    }

    public final void b(String str, j2e j2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a6c3cc", new Object[]{this, str, j2eVar});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(j2eVar, "traceHybridInstance");
        f8041a.put(str, new z5x(new t6x(j2eVar, InstanceType.WEEX)));
    }

    public final void d(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47475f5", new Object[]{this, str, str2, jSONObject});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(str2, "method");
        c(str, "", str2, jSONObject);
    }

    public final g1a<Map<String, ? extends Object>, xhv> f(String str) {
        sv b;
        CartCallbackManager g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f6a892d0", new Object[]{this, str});
        }
        ckf.g(str, "callbackID");
        rv i = i(CartCallbackManager.Companion.a(str));
        if (i == null || (b = i.b()) == null || (g = b.g()) == null) {
            return null;
        }
        return g.a(str);
    }

    public final JSONObject g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f967f43", new Object[]{this, list});
        }
        JSONObject jSONObject = new JSONObject();
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            CheckHoldManager i = CheckHoldManager.i();
            ckf.f(i, "CheckHoldManager.getInstance()");
            jSONObject.put((JSONObject) "iCheckedCartIds", (String) i.f());
            CheckHoldManager i2 = CheckHoldManager.i();
            ckf.f(i2, "CheckHoldManager.getInstance()");
            jSONObject.put((JSONObject) "iCheckedCartIdsForRepeatBuy", (String) i2.k());
            jSONObject.put((JSONObject) v4s.PARAM_IS_INNER, String.valueOf(kjf.a()));
            jSONObject.put((JSONObject) "shopIdInfoStr", o6g.c(Globals.getApplication()));
            CheckHoldManager i3 = CheckHoldManager.i();
            ckf.f(i3, "CheckHoldManager.getInstance()");
            jSONObject.put((JSONObject) "latestQueryParamVersion", i3.j());
            return jSONObject;
        }
        for (String str : list) {
            switch (str.hashCode()) {
                case -1350553636:
                    if (str.equals("iCheckedCartIdsForRepeatBuy")) {
                        CheckHoldManager i4 = CheckHoldManager.i();
                        ckf.f(i4, "CheckHoldManager.getInstance()");
                        jSONObject.put((JSONObject) str, (String) i4.k());
                        break;
                    } else {
                        break;
                    }
                case -1326603348:
                    if (str.equals("latestQueryParamVersion")) {
                        CheckHoldManager i5 = CheckHoldManager.i();
                        ckf.f(i5, "CheckHoldManager.getInstance()");
                        jSONObject.put((JSONObject) str, i5.j());
                        break;
                    } else {
                        break;
                    }
                case 750247578:
                    if (str.equals("iCheckedCartIds")) {
                        CheckHoldManager i6 = CheckHoldManager.i();
                        ckf.f(i6, "CheckHoldManager.getInstance()");
                        jSONObject.put((JSONObject) str, (String) i6.f());
                        break;
                    } else {
                        break;
                    }
                case 1727552178:
                    if (str.equals("shopIdInfoStr")) {
                        jSONObject.put((JSONObject) str, o6g.c(Globals.getApplication()));
                        break;
                    } else {
                        break;
                    }
                case 2061761356:
                    if (str.equals(v4s.PARAM_IS_INNER)) {
                        jSONObject.put((JSONObject) str, String.valueOf(kjf.a()));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return jSONObject;
    }

    public final rv i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv) ipChange.ipc$dispatch("e1fb51a2", new Object[]{this, str});
        }
        ckf.g(str, "instanceId");
        return f8041a.get(str);
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c79d13", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "instanceId");
        rv rvVar = f8041a.get(str);
        if (rvVar != null) {
            return rvVar.b().l();
        }
        return false;
    }

    public final String k(String str, jdb jdbVar) {
        CartCallbackManager cartCallbackManager;
        sv b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4bccb5f", new Object[]{this, str, jdbVar});
        }
        ckf.g(str, "instanceId");
        ckf.g(jdbVar, "callback");
        rv i = i(str);
        String str2 = null;
        if (i == null || (b = i.b()) == null) {
            cartCallbackManager = null;
        } else {
            cartCallbackManager = b.g();
        }
        if (cartCallbackManager != null) {
            str2 = cartCallbackManager.b(new CartMegaManager$putCallback$id$1(jdbVar));
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    public final void l(String str) {
        sv b;
        CartCallbackManager g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9586eba", new Object[]{this, str});
            return;
        }
        ckf.g(str, "callbackID");
        rv i = i(CartCallbackManager.Companion.a(str));
        if (i != null && (b = i.b()) != null && (g = b.g()) != null) {
            g.c(str);
        }
    }

    public final boolean m(JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3661476", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int hashCode = key.hashCode();
                JSONArray jSONArray = null;
                if (hashCode != -1350553636) {
                    if (hashCode != -1326603348) {
                        if (hashCode == 750247578 && key.equals("iCheckedCartIds")) {
                            Object value = entry.getValue();
                            if (value instanceof JSONArray) {
                                jSONArray = value;
                            }
                            JSONArray<Object> jSONArray2 = jSONArray;
                            if (jSONArray2 != null) {
                                for (Object obj : jSONArray2) {
                                    hashSet.add(obj.toString());
                                }
                            }
                            z = true;
                        }
                    } else if (key.equals("latestQueryParamVersion")) {
                        String string = jSONObject.getString("latestQueryParamVersion");
                        CheckHoldManager i = CheckHoldManager.i();
                        ckf.f(i, "CheckHoldManager.getInstance()");
                        i.s(string);
                    }
                } else if (key.equals("iCheckedCartIdsForRepeatBuy")) {
                    Object value2 = entry.getValue();
                    if (value2 instanceof JSONArray) {
                        jSONArray = value2;
                    }
                    JSONArray<Object> jSONArray3 = (JSONArray) jSONArray;
                    if (jSONArray3 != null) {
                        for (Object obj2 : jSONArray3) {
                            hashSet2.add(obj2.toString());
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            CheckHoldManager.i().n(2, hashSet, hashSet2, true);
        }
        return true;
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea9915c", new Object[]{this, str});
            return;
        }
        ckf.g(str, "instanceId");
        f8041a.remove(str);
    }

    public final boolean c(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b53abe03", new Object[]{this, str, str2, str3, jSONObject})).booleanValue();
        }
        ckf.g(str, "instanceId");
        ckf.g(str2, "callbackID");
        ckf.g(str3, "method");
        rv i = i(str);
        if (i == null) {
            return false;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return i.a(str, str2, str3, jSONObject);
    }
}
