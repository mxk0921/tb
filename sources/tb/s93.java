package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class s93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            ckf.g(str, "s");
            ckf.g(str2, "s1");
            ckf.g(map, "map");
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, ? extends Object> map) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            JSONObject p = s93.p(s93.this);
            if (!(p == null || (string = p.getString("success")) == null)) {
                IDMComponent q = s93.q(s93.this);
                ckf.f(q, "mComponent");
                List<gsb> list = q.getEventMap().get(string);
                if (list != null) {
                    for (gsb gsbVar : list) {
                        kmb r = s93.r(s93.this);
                        ckf.d(r);
                        lcu d = r.g().d();
                        ckf.f(gsbVar, AdvanceSetting.NETWORK_TYPE);
                        lcu i = d.l(gsbVar.getType()).i(s93.q(s93.this));
                        i.k(gsbVar);
                        i.m("addCartResultMap", map);
                        i.q(string);
                        kmb r2 = s93.r(s93.this);
                        ckf.d(r2);
                        r2.g().h(i);
                    }
                }
            }
        }
    }

    static {
        t2o.a(478150765);
    }

    public static /* synthetic */ Object ipc$super(s93 s93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartAddCartSubscriber");
    }

    public static final /* synthetic */ JSONObject p(s93 s93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f6039498", new Object[]{s93Var});
        }
        return s93Var.c();
    }

    public static final /* synthetic */ IDMComponent q(s93 s93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ae821fd1", new Object[]{s93Var});
        }
        return s93Var.e;
    }

    public static final /* synthetic */ kmb r(s93 s93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("c224eac1", new Object[]{s93Var});
        }
        return s93Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        String string;
        Object obj;
        String obj2;
        Object obj3;
        Object obj4;
        int i = 1;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        String str = null;
        String obj5 = (c == null || (obj4 = c.get("itemId")) == null) ? null : obj4.toString();
        if (obj5 != null && obj5.length() != 0) {
            JSONObject c2 = c();
            String obj6 = (c2 == null || (obj3 = c2.get(q2q.KEY_SKU_ID)) == null) ? null : obj3.toString();
            JSONObject c3 = c();
            if (c3 != null) {
                Object obj7 = c3.get("quantity");
                if (obj7 != null) {
                    str = obj7.toString();
                }
                if (str != null) {
                    i = Integer.parseInt(str);
                }
            }
            JSONObject c4 = c();
            if (!(c4 == null || (obj = c4.get("showSKU")) == null || (obj2 = obj.toString()) == null)) {
                z = Boolean.parseBoolean(obj2);
            }
            HashMap hashMap = new HashMap();
            JSONObject c5 = c();
            if (!(c5 == null || (string = c5.getString("exParams")) == null)) {
                hashMap.put("exParams", string);
            }
            hashMap.put("itemId", obj5);
            hashMap.put("showSKU", Boolean.valueOf(z));
            if (obj6 != null) {
                hashMap.put(q2q.KEY_SKU_ID, obj6);
            }
            hashMap.put("quantity", Integer.valueOf(i));
            rrh.e().o(new vrh("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "cart", hashMap), new a());
        }
    }
}
