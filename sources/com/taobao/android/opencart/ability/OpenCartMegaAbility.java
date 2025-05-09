package com.taobao.android.opencart.ability;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.abilityidl.ability.AbsOpenCartAbility;
import com.taobao.android.abilityidl.ability.OpenCartAddBagResult;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.de0;
import tb.hav;
import tb.kdb;
import tb.o3d;
import tb.q2q;
import tb.r4p;
import tb.rrh;
import tb.to8;
import tb.tsq;
import tb.vrh;
import tb.y2l;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/android/opencart/ability/OpenCartMegaAbility;", "Lcom/taobao/android/abilityidl/ability/AbsOpenCartAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/y2l;", "params", "Ltb/o3d;", "callback", "Ltb/xhv;", "addBag", "(Ltb/kdb;Ltb/y2l;Ltb/o3d;)V", "OpenCart_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OpenCartMegaAbility extends AbsOpenCartAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements de0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o3d f9062a;

        public a(o3d o3dVar) {
            this.f9062a = o3dVar;
        }

        @Override // tb.de0
        public void a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("476d5dea", new Object[]{this, str, str2, jSONObject});
                return;
            }
            OpenCartAddBagResult openCartAddBagResult = new OpenCartAddBagResult();
            openCartAddBagResult.addCartResult = jSONObject;
            this.f9062a.e0(openCartAddBagResult);
        }

        @Override // tb.de0
        public void onSuccess(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            OpenCartAddBagResult openCartAddBagResult = new OpenCartAddBagResult();
            if (jSONObject != null) {
                jSONObject2 = jSONObject.getJSONObject("addCartResult");
            } else {
                jSONObject2 = null;
            }
            openCartAddBagResult.addCartResult = jSONObject2;
            this.f9062a.K0(openCartAddBagResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o3d b;

        public b(o3d o3dVar) {
            this.b = o3dVar;
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
            OpenCartAddBagResult openCartAddBagResult = new OpenCartAddBagResult();
            openCartAddBagResult.addCartResult = OpenCartMegaAbility.access$getUserInfo(OpenCartMegaAbility.this, map);
            this.b.e0(openCartAddBagResult);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !ckf.b("7", map.get("resultCode"))) {
                JSONObject access$getCartResult = OpenCartMegaAbility.access$getCartResult(OpenCartMegaAbility.this, map);
                if (map == null || !ckf.b("1", map.get("resultCode"))) {
                    OpenCartAddBagResult openCartAddBagResult = new OpenCartAddBagResult();
                    openCartAddBagResult.addCartResult = OpenCartMegaAbility.access$getUserInfo(OpenCartMegaAbility.this, map);
                    this.b.e0(openCartAddBagResult);
                    return;
                }
                OpenCartAddBagResult openCartAddBagResult2 = new OpenCartAddBagResult();
                openCartAddBagResult2.addCartResult = access$getCartResult;
                this.b.K0(openCartAddBagResult2);
            }
        }
    }

    public static final /* synthetic */ JSONObject access$getCartResult(OpenCartMegaAbility openCartMegaAbility, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0fcfb35", new Object[]{openCartMegaAbility, map});
        }
        return openCartMegaAbility.b(map);
    }

    public static final /* synthetic */ JSONObject access$getUserInfo(OpenCartMegaAbility openCartMegaAbility, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("66ae7671", new Object[]{openCartMegaAbility, map});
        }
        return openCartMegaAbility.c(map);
    }

    public static /* synthetic */ Object ipc$super(OpenCartMegaAbility openCartMegaAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/ability/OpenCartMegaAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenCartAbility
    public void addBag(kdb kdbVar, y2l y2lVar, o3d o3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69675afd", new Object[]{this, kdbVar, y2lVar, o3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(y2lVar, "params");
        ckf.g(o3dVar, "callback");
        hav.d(DismissPopWeexModule.MODULE_NAME, "Mega加购，params=" + y2lVar);
        if (y2lVar.f31808a) {
            a(y2lVar, o3dVar);
            return;
        }
        AddBagRequester addBagRequester = new AddBagRequester();
        AddBagModel.b k = new AddBagModel.b().i("").g(y2lVar.b).h(y2lVar.c).k(y2lVar.d);
        Map<String, ? extends Object> map = y2lVar.e;
        addBagRequester.x(kdbVar.l().getContext(), k.f(map != null ? map.toString() : null).d(y2lVar.f).j(y2lVar.f31808a).a(), new a(o3dVar));
    }

    public final JSONObject b(Map<String, ? extends Object> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3db290b", new Object[]{this, map});
        }
        if (map == null || (jSONObject = new JSONObject(map).getJSONObject(to8.ADD_CART)) == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("addCartResult");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        return new JSONObject();
    }

    public final JSONObject c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26f7224f", new Object[]{this, map});
        }
        JSONObject b2 = b(map);
        b2.put((JSONObject) "MSOAErrorWVUserInfo", (String) Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) Constants.KEY_USER_ID, (String) b2);
        if (map != null) {
            jSONObject.put((JSONObject) "resultCode", (String) map.get("resultCode"));
        }
        return jSONObject;
    }

    public final void a(y2l y2lVar, o3d o3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4416290d", new Object[]{this, y2lVar, o3dVar});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("itemId", y2lVar.b);
        hashMap.put("sourceType", 5);
        Map<String, ? extends Object> map = y2lVar.e;
        if (!(map instanceof JSONObject)) {
            map = null;
        }
        JSONObject jSONObject = (JSONObject) map;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) "openFrom", DismissPopWeexModule.MODULE_NAME);
        StringBuilder sb = new StringBuilder();
        for (String str : jSONObject.keySet()) {
            sb.append(str);
            sb.append(",");
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "stringBuilder.toString()");
        if (tsq.w(sb2, ",", false, 2, null)) {
            sb.delete(sb.length() - 1, sb.length());
        }
        jSONObject.put((JSONObject) r4p.KEY_MSOA_TRANS_KEY, sb.toString());
        jSONObject.put((JSONObject) "bizName", "minidetail");
        String str2 = y2lVar.d;
        if (str2 != null) {
            jSONObject.put((JSONObject) q2q.KEY_SKU_ID, str2);
        }
        jSONObject.put((JSONObject) "quantity", (String) Integer.valueOf(y2lVar.c));
        hashMap.put("exParams", jSONObject);
        try {
            rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new b(o3dVar));
        } catch (Exception unused) {
        }
    }
}
