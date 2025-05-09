package com.alibaba.ability.impl.modal;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.abl;
import tb.ckf;
import tb.cu;
import tb.efb;
import tb.gxv;
import tb.h9;
import tb.kdb;
import tb.pr;
import tb.s2d;
import tb.t2o;
import tb.uk0;
import tb.vq;
import tb.wsq;
import tb.x96;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ModalAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CONFIRM = "confirm";
    public static final String API_SHOW = "show";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(118489091);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements efb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1974a;

        public b(vq vqVar) {
            this.f1974a = vqVar;
        }

        @Override // tb.efb
        public final void onResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("confirm", (Object) Boolean.valueOf(z));
            if (z) {
                this.f1974a.c(new FinishResult(jSONObject, "confirm"));
            } else {
                this.f1974a.c(new FinishResult(jSONObject, "cancel"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f1975a;
        public final /* synthetic */ vq b;
        public final /* synthetic */ AbilityHubAdapter c;
        public final /* synthetic */ kdb d;

        public c(ModalAbility modalAbility, Map map, vq vqVar, AbilityHubAdapter abilityHubAdapter, kdb kdbVar) {
            this.f1975a = map;
            this.b = vqVar;
            this.c = abilityHubAdapter;
            this.d = kdbVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            Map<String, Object> data;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            if (ckf.b(executeResult.getType(), "onClose") && (data = executeResult.getData()) != null && (obj = data.get("action")) != null) {
                this.b.a(new FinishResult(executeResult.getData(), (String) obj));
            }
        }
    }

    static {
        t2o.a(118489090);
    }

    public static /* synthetic */ Object ipc$super(ModalAbility modalAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/modal/ModalAbility");
    }

    public final ExecuteResult a(Activity activity, String str, String str2, String str3, String str4, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("faa0849d", new Object[]{this, activity, str, str2, str3, str4, vqVar});
        }
        try {
            new uk0(activity, new b(vqVar), str, str2, str3, str4).c();
            return new FinishResult(null, null, 3, null);
        } catch (Exception e) {
            return new ErrorResult("500", "AlertExp=" + pr.d(e), (Map) null, 4, (a07) null);
        }
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (!ckf.b(str, "confirm") && !ckf.b(str, "show")) {
            return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
        }
        AbilityHubAdapter adapter = kdbVar.l().getAdapter();
        if (adapter == null) {
            return new ErrorResult("500", "AbilityHubAdapter is null", (Map) null, 4, (a07) null);
        }
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return new ErrorResult("400", "NoActivity", (Map) null, 4, (a07) null);
        }
        String w = MegaUtils.w(map, "title", null);
        String i2 = gxv.i(map, null, "content", "msg");
        String i3 = gxv.i(map, null, "confirmButtonText", "confirmText");
        String i4 = gxv.i(map, null, "cancelButtonText", "cancelText");
        JSONObject jSONObject = new JSONObject(map);
        jSONObject.put((JSONObject) "title", w);
        jSONObject.put((JSONObject) "content", i2);
        if (map.get("actions") == null) {
            JSONArray jSONArray = new JSONArray();
            if (!(i4 == null || i4.length() == 0)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "text", i4);
                jSONObject2.put((JSONObject) "action", "cancel");
                xhv xhvVar = xhv.INSTANCE;
                jSONArray.add(jSONObject2);
            }
            if (!(i3 == null || i3.length() == 0)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "text", i3);
                jSONObject3.put((JSONObject) "action", "confirm");
                xhv xhvVar2 = xhv.INSTANCE;
                jSONArray.add(jSONObject3);
            }
            xhv xhvVar3 = xhv.INSTANCE;
            jSONObject.put((JSONObject) "actions", (String) jSONArray);
        } else {
            jSONObject.put((JSONObject) "actions", (String) map.get("actions"));
        }
        if (abl.e()) {
            return a(activity, w, i2, i4, i3, vqVar);
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        jSONObject.put((JSONObject) "popId", valueOf);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "popId", valueOf);
        jSONObject4.put((JSONObject) "bizId", "megaability");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put((JSONObject) "originHeight", (String) 1);
        jSONObject5.put((JSONObject) "tabEnable", "false");
        Boolean bool = Boolean.FALSE;
        jSONObject5.put((JSONObject) "panEnable", (String) bool);
        jSONObject5.put((JSONObject) "animation", "fadeInOut");
        xhv xhvVar4 = xhv.INSTANCE;
        jSONObject4.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        String v = abl.v();
        List z0 = v != null ? wsq.z0(v, new String[]{","}, false, 0, 6, null) : null;
        jSONObject7.put((JSONObject) "name", "alert_ability_ui");
        if (z0 == null || z0.size() < 2) {
            i = 1;
        } else {
            i = z0.get(1);
        }
        jSONObject7.put((JSONObject) "version", (String) i);
        List list = z0;
        if (list != null && !list.isEmpty()) {
            v = (String) z0.get(0);
        }
        jSONObject7.put((JSONObject) "url", v);
        jSONObject6.put((JSONObject) "template", (String) jSONObject7);
        jSONObject6.put((JSONObject) x96.REFRESH_TYPE, "renderFirst");
        jSONObject6.put((JSONObject) "sharedEngine", (String) bool);
        jSONObject6.put((JSONObject) "data", (String) jSONObject);
        jSONObject4.put((JSONObject) "content", (String) jSONObject6);
        return adapter.z("stdPop", StdPopAbility.API_STD_DX, kdbVar, jSONObject4, new c(this, map, vqVar, adapter, kdbVar));
    }
}
