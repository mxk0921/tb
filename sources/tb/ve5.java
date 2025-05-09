package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ve5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CENTERSHOP = -2330743468439842299L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f29955a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552729);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552728);
    }

    public ve5(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f29955a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(ve5 ve5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCEnterShopEventHandler");
    }

    public final void a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3223215", new Object[]{this, map, map2});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(map == null || (obj4 = map.get("utParams")) == null || !(obj4 instanceof Map))) {
            Map<String, Object> h = mqu.Companion.h(obj4, kotlin.collections.a.h());
            ckf.d(h);
            linkedHashMap.putAll(h);
        }
        Object obj5 = null;
        Object obj6 = map2 != null ? map2.get("item") : null;
        if (!(obj6 instanceof Map)) {
            obj6 = null;
        }
        Map map3 = (Map) obj6;
        if (!(map3 == null || (obj3 = map3.get("utParam")) == null || !(obj3 instanceof Map))) {
            Map<String, Object> h2 = mqu.Companion.h(obj3, kotlin.collections.a.h());
            ckf.d(h2);
            linkedHashMap.putAll(h2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Object obj7 = linkedHashMap.get("x_object_type");
        if (obj7 != null) {
            linkedHashMap2.put("x_object_type", obj7);
        }
        Object obj8 = linkedHashMap.get("x_object_id");
        if (obj8 != null) {
            linkedHashMap2.put("x_object_id", obj8);
        }
        Object obj9 = linkedHashMap.get("x_user_ids");
        if (obj9 != null) {
            linkedHashMap2.put("x_user_ids", obj9);
        }
        Object obj10 = linkedHashMap.get("x_keyname");
        if (obj10 != null) {
            linkedHashMap2.put("x_keyname", obj10);
        }
        if (!(map2 == null || (obj2 = map2.get("index")) == null)) {
            linkedHashMap2.put(nz3.X_POSITION, obj2);
        }
        Object obj11 = map2 != null ? map2.get("item") : null;
        if (!(obj11 instanceof Map)) {
            obj11 = null;
        }
        Map map4 = (Map) obj11;
        if (!(map4 == null || (obj = map4.get("itemid")) == null)) {
            linkedHashMap2.put("x_item_ids", obj);
        }
        Object obj12 = linkedHashMap.get(yj4.PARAM_PVID);
        if (!(obj12 instanceof Integer)) {
            obj12 = null;
        }
        Integer num = (Integer) obj12;
        if (num != null) {
            linkedHashMap2.put(yj4.PARAM_PVID, Integer.valueOf(num.intValue()));
        }
        Object obj13 = linkedHashMap.get("x_source");
        if (obj13 != null) {
            linkedHashMap2.put("source", obj13);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, value);
            }
        }
        Object obj14 = map2 != null ? map2.get("item") : null;
        if (!(obj14 instanceof Map)) {
            obj14 = null;
        }
        Map map5 = (Map) obj14;
        Object obj15 = map5 != null ? map5.get("targetUrl") : null;
        if (!(obj15 instanceof String)) {
            obj15 = null;
        }
        String str2 = (String) obj15;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        Object obj16 = map != null ? map.get("content") : null;
        if (!(obj16 instanceof Map)) {
            obj16 = null;
        }
        Map map6 = (Map) obj16;
        Object obj17 = map6 != null ? map6.get("id") : null;
        if (obj17 instanceof String) {
            obj5 = obj17;
        }
        String str4 = (String) obj5;
        if (str4 != null) {
            str3 = str4;
        }
        Nav.from(this.f29955a.getContext()).toUri(str2 + "&contId=" + str3 + "&contScn=1&utparam=" + Uri.encode(JSON.toJSONString(linkedHashMap2)));
        wn2.Companion.a(this.f29955a, map, map2, "itemDeatil");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        a(dXRuntimeContext.i(), mqu.Companion.h(objArr[0], null));
    }
}
