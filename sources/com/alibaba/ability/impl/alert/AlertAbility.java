package com.alibaba.ability.impl.alert;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAlertAbility;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.Map;
import tb.a07;
import tb.cfb;
import tb.ckf;
import tb.e9;
import tb.f04;
import tb.h9;
import tb.hbl;
import tb.hij;
import tb.iih;
import tb.kdb;
import tb.r38;
import tb.s2d;
import tb.t2o;
import tb.tk0;
import tb.x96;
import tb.xhv;
import tb.xk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AlertAbility extends AbsAlertAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "cancel";
    public static final String CONFIRM = "confirm";
    public static final a Companion = new a(null);
    public static final String DATA_KEY_ACTION = "action";
    public static final String OTHER = "other";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(94371842);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfb f1891a;

        public b(cfb cfbVar) {
            this.f1891a = cfbVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            if (ckf.b(executeResult.getType(), "onClose")) {
                Map<String, Object> data = executeResult.getData();
                if (data != null && (obj = data.get("action")) != null) {
                    AlertConfirmInfo alertConfirmInfo = new AlertConfirmInfo();
                    alertConfirmInfo.confirm = Boolean.valueOf(ckf.b(obj, "confirm"));
                    Object obj2 = data.get("isChecked");
                    alertConfirmInfo.isChecked = Boolean.valueOf(ckf.b(obj2 != null ? obj2.toString() : null, "true"));
                    if (ckf.b(obj, "confirm")) {
                        this.f1891a.n(alertConfirmInfo);
                    } else if (ckf.b(obj, "other")) {
                        this.f1891a.B(alertConfirmInfo);
                    } else if (ckf.b(obj, "cancel")) {
                        this.f1891a.J(alertConfirmInfo);
                    }
                }
            } else if (executeResult instanceof ErrorResult) {
                this.f1891a.O((ErrorResult) executeResult);
            } else if (executeResult.getStatusCode() > 99) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("AlertAbility", "Alert 能力执行异常：" + executeResult.toFormattedData());
            }
        }
    }

    static {
        t2o.a(94371841);
    }

    public static /* synthetic */ Object ipc$super(AlertAbility alertAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/alert/AlertAbility");
    }

    public final JSONArray a(xk0 xk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("99f6361b", new Object[]{this, xk0Var});
        }
        JSONArray jSONArray = new JSONArray();
        String str = xk0Var.d;
        if (!(str == null || str == null || str.length() == 0)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) xk0Var.d);
            jSONObject.put("highlighted", (Object) Boolean.TRUE);
            jSONObject.put("action", (Object) "confirm");
            xhv xhvVar = xhv.INSTANCE;
            jSONArray.add(jSONObject);
        }
        String str2 = xk0Var.f;
        if (!(str2 == null || str2 == null || str2.length() == 0)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", (Object) xk0Var.f);
            jSONObject2.put("highlighted", (Object) Boolean.FALSE);
            jSONObject2.put("action", (Object) "other");
            xhv xhvVar2 = xhv.INSTANCE;
            jSONArray.add(jSONObject2);
        }
        String str3 = xk0Var.e;
        if (!(str3 == null || str3 == null || str3.length() == 0)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("text", (Object) xk0Var.e);
            jSONObject3.put("highlighted", (Object) Boolean.FALSE);
            jSONObject3.put("action", (Object) "cancel");
            xhv xhvVar3 = xhv.INSTANCE;
            jSONArray.add(jSONObject3);
        }
        if (jSONArray.size() == 2) {
            f04.N(jSONArray);
        }
        return jSONArray;
    }

    public final JSONObject b(xk0 xk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6dcf07d7", new Object[]{this, xk0Var});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", "alert:" + System.currentTimeMillis());
        jSONObject.put((JSONObject) "bizId", "megability");
        JSONObject jSONObject2 = new JSONObject();
        JSONArray a2 = a(xk0Var);
        jSONObject2.put((JSONObject) "title", xk0Var.f31435a);
        jSONObject2.put((JSONObject) "content", xk0Var.b);
        jSONObject2.put((JSONObject) "actions", (String) a2);
        jSONObject2.put((JSONObject) "imageUrl", xk0Var.g);
        if (xk0Var.c != null) {
            JSONObject jSONObject3 = new JSONObject();
            tk0 tk0Var = xk0Var.c;
            String str = null;
            jSONObject3.put((JSONObject) "isChecked", String.valueOf(tk0Var != null ? tk0Var.f28759a : null));
            tk0 tk0Var2 = xk0Var.c;
            if (tk0Var2 != null) {
                str = tk0Var2.b;
            }
            jSONObject3.put((JSONObject) "text", str);
            jSONObject2.put((JSONObject) UiUtil.INPUT_TYPE_VALUE_CHECKBOX, (String) jSONObject3);
        }
        jSONObject2.put((JSONObject) "popId", jSONObject.getString("popId"));
        jSONObject2.put((JSONObject) "bizId", jSONObject.getString("bizId"));
        jSONObject.put((JSONObject) "content", (String) jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "gravity", "center");
        Boolean bool = Boolean.FALSE;
        jSONObject4.put((JSONObject) "tapEnable", (String) bool);
        jSONObject4.put((JSONObject) "panEnable", (String) bool);
        Boolean bool2 = Boolean.TRUE;
        jSONObject4.put((JSONObject) e9.TAK_ABILITY_MATCH_CONTENT, (String) bool2);
        jSONObject4.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) 0);
        jSONObject4.put((JSONObject) "animation", "fadeInOut");
        if (hbl.i()) {
            jSONObject4.put((JSONObject) "droidBlockHandleBack", (String) bool2);
        }
        jSONObject.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        if (!hbl.INSTANCE.l() || xk0Var.c != null || a2.size() > 2) {
            jSONObject5.put((JSONObject) "template", (String) r38.a());
            jSONObject5.put((JSONObject) x96.REFRESH_TYPE, "renderFirst");
            jSONObject5.put((JSONObject) "sharedEngine", (String) bool);
        } else {
            jSONObject5.put((JSONObject) "template_nano", (String) r38.c());
        }
        jSONObject.put((JSONObject) h9.KEY_EXT_CONFIG, (String) jSONObject5);
        return jSONObject;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAlertAbility
    public void show(kdb kdbVar, xk0 xk0Var, cfb cfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c118d6b", new Object[]{this, kdbVar, xk0Var, cfbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(xk0Var, "params");
        ckf.g(cfbVar, "callback");
        AbilityHubAdapter adapter = kdbVar.l().getAdapter();
        if (adapter != null) {
            if (hbl.g()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("content", (Object) xk0Var.b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("api", (Object) "Alert.show");
                    jSONObject2.put("params", (Object) jSONObject);
                    jSONObject2.put("namespace", (Object) kdbVar.l().getNamespace());
                    jSONObject2.put(PopConst.BRIDGE_KEY_BUSINESS_ID, (Object) kdbVar.l().getBusinessID());
                    jSONObject2.put("url", kdbVar.m("url"));
                    AppMonitor.Alarm.commitSuccess("Megability", "WidgetMonitor", jSONObject2.toJSONString());
                } catch (Exception unused) {
                }
            }
            b bVar = new b(cfbVar);
            JSONArray a2 = a(xk0Var);
            if (!hbl.INSTANCE.l() || xk0Var.c != null || a2.size() > 2) {
                adapter.j("stdPop", StdPopAbility.API_STD_DX, kdbVar, b(xk0Var), bVar);
            } else {
                adapter.j("stdPop", StdPopAbility.API_SHOW_NANO_COMPOSE, kdbVar, b(xk0Var), bVar);
            }
        } else {
            cfbVar.O(new ErrorResult("AdapterIsNull", (String) null, (Map) null, 6, (a07) null));
        }
    }
}
