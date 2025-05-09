package com.taobao.android.detail.ttdetail.mega;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsDetailAbility;
import com.taobao.android.abilityidl.ability.DetailError;
import com.taobao.android.abilityidl.ability.DetailResult;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.a07;
import tb.bw7;
import tb.ckf;
import tb.eg7;
import tb.fg7;
import tb.i3l;
import tb.ir;
import tb.kdb;
import tb.qf7;
import tb.t2o;
import tb.vbl;
import tb.y3l;
import tb.ze7;
import tb.zyb;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/detail/ttdetail/mega/DetailMegaAbility;", "Lcom/taobao/android/abilityidl/ability/AbsDetailAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/fg7;", "params", "Ltb/zyb;", "callback", "Ltb/xhv;", "openInnerSKU", "(Ltb/kdb;Ltb/fg7;Ltb/zyb;)V", "Ltb/eg7;", y3l.EVENT_TYPE, "(Ltb/kdb;Ltb/eg7;Ltb/zyb;)V", "Ltb/qf7;", "requestPicGallery", "(Ltb/kdb;Ltb/qf7;Ltb/zyb;)V", "Companion", "a", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DetailMegaAbility extends AbsDetailAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, JSONObject> f6865a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262078);
        }

        public a() {
        }

        public final JSONObject a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("3447e09e", new Object[]{this, str});
            }
            if (str != null) {
                return (JSONObject) DetailMegaAbility.access$getMap$cp().get(str);
            }
            return null;
        }

        public final void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("279ffebf", new Object[]{this, str, jSONObject});
            } else if (str != null && jSONObject != null) {
                DetailMegaAbility.access$getMap$cp().put(str, jSONObject);
            }
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a3b0910", new Object[]{this, str});
            } else if (str != null) {
                DetailMegaAbility.access$getMap$cp().remove(str);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262077);
    }

    public static final /* synthetic */ ConcurrentHashMap access$getMap$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("3908834", new Object[0]);
        }
        return f6865a;
    }

    public static /* synthetic */ Object ipc$super(DetailMegaAbility detailMegaAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/mega/DetailMegaAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsDetailAbility
    public void requestPicGallery(kdb kdbVar, qf7 qf7Var, zyb zybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f94843d", new Object[]{this, kdbVar, qf7Var, zybVar});
            return;
        }
        ckf.h(kdbVar, "context");
        ckf.h(qf7Var, "params");
        ckf.h(zybVar, "callback");
        String str = qf7Var.f26719a;
        if (str != null) {
            JSONObject a2 = Companion.a(str);
            if (a2 != null) {
                JSONObject jSONObject = a2.getJSONObject(AliDetailGalleryWVPlugin.KEY_PARAMS_BRIDGE_DATA);
                if (jSONObject != null) {
                    JSONObject jSONObject2 = a2.getJSONObject(AliDetailGalleryWVPlugin.KEY_PARAMS_ASYNC_BRIDGE_DATA);
                    if (jSONObject2 != null) {
                        jSONObject.putAll(jSONObject2);
                    }
                    DetailResult detailResult = new DetailResult();
                    detailResult.result = jSONObject;
                    zybVar.F0(detailResult);
                    return;
                }
                DetailError detailError = new DetailError();
                detailError.errorMSG = "获取bridgeData失败";
                zybVar.V0(detailError);
                return;
            }
            DetailError detailError2 = new DetailError();
            detailError2.errorMSG = "获取data失败";
            zybVar.V0(detailError2);
            return;
        }
        DetailError detailError3 = new DetailError();
        detailError3.errorMSG = "获取voName失败";
        zybVar.V0(detailError3);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsDetailAbility
    public void openInnerSKU(kdb kdbVar, fg7 fg7Var, zyb zybVar) {
        AbilityCenter b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ab6998", new Object[]{this, kdbVar, fg7Var, zybVar});
            return;
        }
        ckf.h(kdbVar, "context");
        ckf.h(fg7Var, "params");
        ckf.h(zybVar, "callback");
        if (vbl.b0()) {
            WeakReference<ze7> f = ze7.f(fg7Var.f19272a);
            if (f != null) {
                ze7 ze7Var = f.get();
                if (!(ze7Var == null || (b = ze7Var.b()) == null)) {
                    b.h(OpenSkuImplementor.h("ADDCART_AND_BUYNOW", null), new RuntimeAbilityParam[0]);
                }
                zybVar.F0(new DetailResult());
                String str = fg7Var.b;
                if (str != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", str);
                    bw7.b(hashMap, -600007, "头图打开Sku");
                    return;
                }
                return;
            }
            DetailError detailError = new DetailError();
            detailError.errorMSG = "获取详情的detailContext失败";
            zybVar.V0(detailError);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsDetailAbility
    public void openLightOff(kdb kdbVar, eg7 eg7Var, zyb zybVar) {
        ze7 ze7Var;
        AbilityCenter b;
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9572d7c", new Object[]{this, kdbVar, eg7Var, zybVar});
            return;
        }
        ckf.h(kdbVar, "context");
        ckf.h(eg7Var, "params");
        ckf.h(zybVar, "callback");
        WeakReference<ze7> f = ze7.f(eg7Var.f18555a);
        if (f == null || (ze7Var = f.get()) == null || (b = ze7Var.b()) == null) {
            DetailError detailError = new DetailError();
            detailError.errorMSG = "获取详情context失败，检查通信token";
            zybVar.V0(detailError);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) i3l.EVENT_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, ? extends Object> map = eg7Var.b;
        JSONArray jSONArray = null;
        jSONObject2.put("float", (Object) ((map == null || (obj2 = map.get("float")) == null) ? null : JSON.parseObject(obj2.toString())));
        Map<String, ? extends Object> map2 = eg7Var.b;
        if (!(map2 == null || (obj = map2.get("list")) == null)) {
            jSONArray = JSON.parseArray(obj.toString());
        }
        jSONObject2.put("list", (Object) jSONArray);
        jSONObject.put("fields", (Object) jSONObject2);
        b.h(new ir(jSONObject), new RuntimeAbilityParam[0]);
    }
}
