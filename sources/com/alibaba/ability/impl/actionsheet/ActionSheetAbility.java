package com.alibaba.ability.impl.actionsheet;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.e9;
import tb.h9;
import tb.hbl;
import tb.jpu;
import tb.kdb;
import tb.s2d;
import tb.t2o;
import tb.vq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ActionSheetAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_HIDE = "hide";
    public static final String API_SHOW = "show";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f1887a = new JSONObject(kotlin.collections.a.k(jpu.a("name", "menu_select_pop"), jpu.a("version", "9"), jpu.a("url", "https://dinamicx.alibabausercontent.com/pub/menu_select_pop/1706178855808/menu_select_pop.zip")));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(92274690);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1889a;

        public c(vq vqVar) {
            this.f1889a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f1889a.a(executeResult);
        }
    }

    public static /* synthetic */ Object ipc$super(ActionSheetAbility actionSheetAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/actionsheet/ActionSheetAbility");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1888a;

        public b(vq vqVar) {
            this.f1888a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            if (ckf.b(executeResult.getType(), "onClose")) {
                Map<String, Object> data = executeResult.getData();
                if (data != null) {
                    Object obj = data.get("action");
                    if (ckf.b(obj, "confirm")) {
                        this.f1888a.a(new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("tabIndex", data.get("tabIndex")), jpu.a("data", data.get("data")))), "onAction"));
                    } else if (ckf.b(obj, "cancel")) {
                        this.f1888a.a(new FinishResult(new JSONObject(), "onCancel"));
                    } else {
                        vq vqVar = this.f1888a;
                        JSONObject jSONObject = new JSONObject();
                        if (obj != null) {
                            vqVar.a(new FinishResult(jSONObject, (String) obj));
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                this.f1888a.a(executeResult);
            }
        }
    }

    static {
        t2o.a(92274689);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (kdbVar.l().getContext() == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null);
        }
        AbilityHubAdapter adapter = kdbVar.l().getAdapter();
        if (adapter == null) {
            return new ErrorResult("500", "AbilityHubAdapter is null", (Map) null, 4, (a07) null);
        }
        int hashCode = str.hashCode();
        if (hashCode != 3202370) {
            if (hashCode == 3529469 && str.equals("show")) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                JSONObject jSONObject = f1887a;
                String f = hbl.f("actionSheetTemplate", "non");
                if (!ckf.b(f, "non")) {
                    jSONObject = JSON.parseObject(f);
                    ckf.f(jSONObject, "JSONObject.parseObject(remoteTemplate)");
                }
                Pair a2 = jpu.a("popId", valueOf);
                Pair a3 = jpu.a("bizId", "megaability");
                Map k = kotlin.collections.a.k(jpu.a("popId", valueOf));
                k.putAll(map);
                xhv xhvVar = xhv.INSTANCE;
                return adapter.z("stdPop", StdPopAbility.API_STD_DX, kdbVar, new JSONObject(kotlin.collections.a.k(a2, a3, jpu.a("content", new JSONObject(k)), jpu.a(h9.KEY_POP_CONFIG, new JSONObject(kotlin.collections.a.k(jpu.a(e9.TAK_ABILITY_MATCH_CONTENT, Boolean.TRUE)))), jpu.a(h9.KEY_EXT_CONFIG, new JSONObject(kotlin.collections.a.k(jpu.a("template", jSONObject), jpu.a("sharedEngine", Boolean.FALSE)))))), new b(vqVar));
            }
        } else if (str.equals("hide")) {
            return adapter.z("stdPop", "close", kdbVar, map, new c(vqVar));
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.a("api " + str + " not found");
    }
}
