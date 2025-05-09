package com.taobao.tbpoplayer.view.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPopCenterAbility;
import com.taobao.android.abilityidl.ability.PopCenterCheckSuccessResult;
import com.taobao.android.abilityidl.ability.PopCenterCloseSuccessResult;
import com.taobao.android.abilityidl.ability.PopCenterTriggerSuccessResult;
import com.taobao.android.external.UCPManager;
import com.taobao.tbpoplayer.view.jsbridge.TBPopCenterAbility;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a9l;
import tb.auv;
import tb.ct2;
import tb.gsu;
import tb.hst;
import tb.jbm;
import tb.jdb;
import tb.jem;
import tb.kad;
import tb.kbm;
import tb.kdb;
import tb.lad;
import tb.lbm;
import tb.mbm;
import tb.nad;
import tb.nsu;
import tb.pl4;
import tb.qtv;
import tb.s2d;
import tb.t2o;
import tb.vem;
import tb.wdm;
import tb.xq;
import tb.zad;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPopCenterAbility extends AbsPopCenterAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13425a;
    public mbm b;
    public String c;
    public long d;
    public long e;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public JSONObject f = new JSONObject();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseConfigItem f13426a;

        public a(BaseConfigItem baseConfigItem) {
            this.f13426a = baseConfigItem;
        }

        @Override // tb.abd
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            } else {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, TBPopCenterAbility.access$000(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onViewCreated.");
            }
        }

        @Override // tb.abd
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, TBPopCenterAbility.access$000(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onDisplayed.");
            TBPopCenterAbility.access$300(TBPopCenterAbility.this);
            if (this.f13426a.actionCallBack) {
                TBPopCenterAbility.access$200(TBPopCenterAbility.this, "display", true, "");
            }
        }

        @Override // tb.abd
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c24585a", new Object[]{this, str});
                return;
            }
            String access$000 = TBPopCenterAbility.access$000(TBPopCenterAbility.this);
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, access$000, "TBPopHubAbility.trigger.onStartProcessFailed" + str);
            if (this.f13426a.actionCallBack) {
                TBPopCenterAbility.access$200(TBPopCenterAbility.this, "display", false, str);
            }
        }

        @Override // tb.zad
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa10be10", new Object[]{this, str, str2});
                return;
            }
            String access$000 = TBPopCenterAbility.access$000(TBPopCenterAbility.this);
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, access$000, "TBPopHubAbility.trigger.onAction" + str2);
            if (str2.equals(UserResultTrack.USER_RESULT_CLICK_ACTION) || str2.equals("Click")) {
                TBPopCenterAbility.access$100(TBPopCenterAbility.this);
                if (this.f13426a.actionCallBack) {
                    TBPopCenterAbility.access$200(TBPopCenterAbility.this, "click", true, "");
                }
            }
        }

        @Override // tb.abd
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
                return;
            }
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, TBPopCenterAbility.access$000(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onClosed.");
            if (z2) {
                TBPopCenterAbility.access$400(TBPopCenterAbility.this);
                if (this.f13426a.actionCallBack) {
                    TBPopCenterAbility.access$200(TBPopCenterAbility.this, "close", true, str2);
                }
            } else if (this.f13426a.actionCallBack) {
                TBPopCenterAbility.access$200(TBPopCenterAbility.this, "display", false, str2);
            }
        }
    }

    static {
        t2o.a(790626548);
    }

    public static /* synthetic */ String access$000(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92318b0d", new Object[]{tBPopCenterAbility});
        }
        return tBPopCenterAbility.f13425a;
    }

    public static /* synthetic */ void access$100(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7013234", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.t();
        }
    }

    public static /* synthetic */ void access$200(TBPopCenterAbility tBPopCenterAbility, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7844c3f", new Object[]{tBPopCenterAbility, str, new Boolean(z), str2});
        } else {
            tBPopCenterAbility.j(str, z, str2);
        }
    }

    public static /* synthetic */ void access$300(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee203ab6", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.v();
        }
    }

    public static /* synthetic */ void access$400(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afbef7", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.u();
        }
    }

    public static /* synthetic */ Object ipc$super(TBPopCenterAbility tBPopCenterAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/jsbridge/TBPopCenterAbility");
    }

    public static /* synthetic */ void k(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271ab0bf", new Object[]{executeResult});
        } else {
            wdm.d("Broadcast.dispatchEvent", new Object[0]);
        }
    }

    public final void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b8dc42", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str2);
        auv.a().f(19999, "PopHub", str, this.f13425a, this.m, hashMap);
    }

    public final void B(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d778480", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(z));
        auv.a().f(19999, "PopHub", "triggerPerf", this.f13425a, String.valueOf(SystemClock.elapsedRealtime() - j), hashMap);
    }

    public final String D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aeb826c", new Object[]{this, str});
        }
        if ("0".equals(str)) {
            return "";
        }
        if ("10".equals(str)) {
            return "resident10";
        }
        if (ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE.equals(str)) {
            return "resident20";
        }
        if ("30".equals(str)) {
            return "resident30";
        }
        if ("40".equals(str)) {
            return "custom40";
        }
        if ("50".equals(str)) {
            return "custom50";
        }
        return "";
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void checkShouldPop(kdb kdbVar, final kbm kbmVar, final kad kadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc4b5ec", new Object[]{this, kdbVar, kbmVar, kadVar});
        } else {
            hst.b(new Runnable() { // from class: tb.qsr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.l(kbm.this, kadVar);
                }
            });
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void closePop(kdb kdbVar, final lad ladVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c2138c", new Object[]{this, kdbVar, ladVar});
        } else {
            hst.c(new Runnable() { // from class: tb.osr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.this.m(ladVar);
                }
            });
        }
    }

    public final void j(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476765cc", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        try {
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq("PopHub", "poplayer").a(PopLayer.getReference().internalGetCurrentActivity()));
            kdb xqVar = new xq();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) "PopHub");
            jSONObject.put("eventName", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) this.f13425a);
            jSONObject2.put("success", (Object) Boolean.valueOf(z));
            jSONObject2.put("errorCode", (Object) str2);
            jSONObject.put("detail", (Object) jSONObject2);
            abilityHubAdapter.j("broadcast", "dispatchEvent", xqVar, jSONObject, new s2d() { // from class: tb.msr
                @Override // tb.s2d
                public final void onCallback(ExecuteResult executeResult) {
                    TBPopCenterAbility.k(executeResult);
                }
            });
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.broadcast.error", th);
        }
    }

    public final /* synthetic */ void o(boolean z, String str, JSONObject jSONObject, nad nadVar, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49079dfd", new Object[]{this, new Boolean(z), str, jSONObject, nadVar, baseConfigItem});
            return;
        }
        try {
            String str2 = this.f13425a;
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, str2, "TBPopHubAbility.checkDisplayWithCode.checkResult=" + z + ".reason=" + str);
            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
            popCenterTriggerSuccessResult.code = this.f13425a;
            popCenterTriggerSuccessResult.shouldPop = z;
            popCenterTriggerSuccessResult.restrictCode = str;
            this.f = jSONObject;
            if (!z) {
                x(nadVar, popCenterTriggerSuccessResult);
            } else if (!this.g) {
                x(nadVar, popCenterTriggerSuccessResult);
            } else {
                E(baseConfigItem);
                x(nadVar, popCenterTriggerSuccessResult);
            }
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.trigger.checkDisplayWithCode.error", th);
            w(nadVar, "NATIVE_ERROR_AFTER_CHECK_DEFAULT_PASS");
        }
    }

    public final /* synthetic */ void p(final nad nadVar, final BaseConfigItem baseConfigItem, final boolean z, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19282afe", new Object[]{this, nadVar, baseConfigItem, new Boolean(z), str, jSONObject});
        } else {
            hst.b(new Runnable() { // from class: tb.tsr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.this.o(z, str, jSONObject, nadVar, baseConfigItem);
                }
            });
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void recordPopAction(kdb kdbVar, final jbm jbmVar, final jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944b6d6b", new Object[]{this, kdbVar, jbmVar, jdbVar});
        } else {
            hst.b(new Runnable() { // from class: tb.psr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.this.q(jbmVar, jdbVar);
                }
            });
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void setProperties(kdb kdbVar, final lbm lbmVar, final jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e719378a", new Object[]{this, kdbVar, lbmVar, jdbVar});
        } else {
            hst.b(new Runnable() { // from class: tb.nsr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.this.r(lbmVar, jdbVar);
                }
            });
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27a9f86", new Object[]{this});
        } else if (!this.g) {
            wdm.d("TBPopHubAbility.onClickAction : not templateRender.code=" + this.f13425a, new Object[0]);
        } else if (this.l) {
            wdm.d("TBPopHubAbility.onClickAction : already closed.code=" + this.f13425a, new Object[0]);
        } else {
            wdm.d("TBPopHubAbility.onClickAction.code=" + this.f13425a, new Object[0]);
            z("clickEvent", null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void triggerPop(kdb kdbVar, final nad nadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5fd2cc", new Object[]{this, kdbVar, nadVar});
        } else {
            hst.b(new Runnable() { // from class: tb.lsr
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.this.s(nadVar);
                }
            });
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374aebf6", new Object[]{this});
        } else if (!this.g) {
            wdm.d("TBPopHubAbility.onCloseAction : not templateRender.code=" + this.f13425a, new Object[0]);
        } else if (this.l) {
            wdm.d("TBPopHubAbility.onCloseAction : already closed.code=" + this.f13425a, new Object[0]);
        } else {
            wdm.d("TBPopHubAbility.onCloseAction.code=" + this.f13425a, new Object[0]);
            z("closeEvent", null);
        }
    }

    public final void y(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19357f68", new Object[]{this, str, new Long(j)});
        } else {
            auv.a().f(19999, "PopHub", str, this.f13425a, String.valueOf(SystemClock.elapsedRealtime() - j), new HashMap());
        }
    }

    public final void z(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c784ec0b", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.g) {
            str2 = "template";
        } else {
            str2 = LinkageUtils.PolicyType.SELF;
        }
        map.put("render", str2);
        auv.a().f(19999, "PopHub", str, this.f13425a, this.m, map);
    }

    public final /* synthetic */ void m(lad ladVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d0b2f6", new Object[]{this, ladVar});
            return;
        }
        try {
            if (!this.g) {
                ladVar.O(new ErrorResult("notTemplateRender"));
            } else if (this.l) {
                ladVar.O(new ErrorResult("alreadyClosed"));
            } else if (TextUtils.isEmpty(this.f13425a)) {
                ladVar.O(new ErrorResult("codeIsEmpty"));
            } else {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TBPopHubAbility.close.");
                PopLayer.getReference().removeRequest(PageTriggerService.instance().getCurRequestingRequest(this.f13425a));
                PopCenterCloseSuccessResult popCenterCloseSuccessResult = new PopCenterCloseSuccessResult();
                popCenterCloseSuccessResult.code = this.f13425a;
                ladVar.E(popCenterCloseSuccessResult);
                this.l = true;
                z("close", null);
            }
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.close.error", th);
            ladVar.O(new ErrorResult("closePopCatchError"));
        }
    }

    public static /* synthetic */ void l(kbm kbmVar, kad kadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af87ee1", new Object[]{kbmVar, kadVar});
            return;
        }
        try {
            List<String> list = kbmVar.f22537a;
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TBPopHubAbility.checkShouldPop.codes=" + list);
            HashMap hashMap = new HashMap();
            int o = a9l.w().o();
            List<String> i = a9l.w().i();
            List<String> h = a9l.w().h();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    if (o == 1) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("checkResult", (Object) Boolean.TRUE);
                        jSONObject.put("reason", (Object) "PASS_BY_TRIGGER_MODE");
                        hashMap.put(str, jSONObject);
                    } else if (o == 2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("checkResult", (Object) Boolean.FALSE);
                        jSONObject2.put("reason", (Object) "FILTER_BY_TRIGGER_MODE");
                        hashMap.put(str, jSONObject2);
                    } else if (i != null && i.contains(str)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("checkResult", (Object) Boolean.TRUE);
                        jSONObject3.put("reason", (Object) "PASS_BY_WHITE_LIST");
                        hashMap.put(str, jSONObject3);
                    } else if (h == null || !h.contains(str)) {
                        JSONObject jSONObject4 = new JSONObject();
                        UCPManager.d(str, jSONObject4);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("checkResult", jSONObject4.get("checkResult"));
                        jSONObject5.put("reason", jSONObject4.get("reason"));
                        hashMap.put(str, jSONObject5);
                    } else {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("checkResult", (Object) Boolean.FALSE);
                        jSONObject6.put("reason", (Object) "FILTER_BY_BLACK_LIST");
                        hashMap.put(str, jSONObject6);
                    }
                }
            }
            PopCenterCheckSuccessResult popCenterCheckSuccessResult = new PopCenterCheckSuccessResult();
            popCenterCheckSuccessResult.codesCheckResult = hashMap;
            kadVar.w1(popCenterCheckSuccessResult);
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TBPopHubAbility.checkShouldPop.result=" + JSON.toJSONString(hashMap));
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.checkShouldPop.error", th);
            if (kadVar != null) {
                kadVar.O(ErrorResult.a.g("checkShouldPopCatchError"));
            }
        }
    }

    public final Pair<BaseConfigItem, String> C() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bf1ec39b", new Object[]{this});
        }
        if (!this.g) {
            return new Pair<>(null, "");
        }
        if (TextUtils.isEmpty(this.b.f23920a)) {
            return new Pair<>(null, "configTypeIsEmpty");
        }
        if (TextUtils.isEmpty(this.b.b)) {
            return new Pair<>(null, "configLayerTypeIsEmpty");
        }
        try {
            BaseConfigItem baseConfigItem = new BaseConfigItem();
            String str2 = this.f13425a;
            baseConfigItem.indexID = str2;
            baseConfigItem.uuid = str2;
            mbm mbmVar = this.b;
            baseConfigItem.type = mbmVar.f23920a;
            baseConfigItem.layerType = D(mbmVar.b);
            Boolean bool = this.b.f;
            baseConfigItem.embed = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.b.g;
            baseConfigItem.actionCallBack = bool2 != null ? bool2.booleanValue() : false;
            Map<String, ? extends Object> map = this.b.h;
            if (map == null || map.isEmpty()) {
                str = "";
            } else {
                str = JSON.toJSONString(this.b.h);
            }
            baseConfigItem.style = str;
            JSONObject jSONObject = new JSONObject();
            if (!"weex2".equals(this.b.f23920a) && !"webview".equals(this.b.f23920a)) {
                if ("native".equals(this.b.f23920a)) {
                    int a2 = EnvironmentSwitcher.a();
                    if (a2 == 0) {
                        z = true;
                    }
                    String str3 = this.f13425a;
                    wdm.g(wdm.CATEGORY_TRIGGER_EVENT, str3, "transConfig.currentEnvIndex=" + a2);
                    if (z) {
                        if (TextUtils.isEmpty(this.b.c)) {
                            return new Pair<>(null, "configCdnIdIsEmpty");
                        }
                        jSONObject.put("cdnId", (Object) this.b.c);
                    } else if (!TextUtils.isEmpty(this.b.d)) {
                        jSONObject.put(pl4.KEY_PAGE_ID, (Object) this.b.d);
                    } else if (TextUtils.isEmpty(this.b.c)) {
                        return new Pair<>(null, "configCdnIdAndPageIdIsEmpty");
                    } else {
                        jSONObject.put("cdnId", (Object) this.b.c);
                    }
                }
                baseConfigItem.params = jSONObject.toJSONString();
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, this.f13425a, "transConfig.done");
                return new Pair<>(baseConfigItem, "");
            }
            if (TextUtils.isEmpty(this.b.e)) {
                return new Pair<>(null, "configUrlIsEmpty");
            }
            jSONObject.put("url", (Object) this.b.e);
            baseConfigItem.params = jSONObject.toJSONString();
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, this.f13425a, "transConfig.done");
            return new Pair<>(baseConfigItem, "");
        } catch (Throwable th) {
            wdm.h("transConfigCatchError", th);
            return new Pair<>(null, "transConfigCatchError");
        }
    }

    public final void E(BaseConfigItem baseConfigItem) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25df2c57", new Object[]{this, baseConfigItem});
        } else if (!this.g || baseConfigItem == null) {
            String str = this.f13425a;
            StringBuilder sb = new StringBuilder("TBPopHubAbility.triggerPopLayer.notValid.mTemplateRender=");
            sb.append(this.g);
            sb.append(".configItemNotNull=");
            if (baseConfigItem == null) {
                z = false;
            }
            sb.append(z);
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, str, sb.toString());
        } else {
            jem.d().i(baseConfigItem, this.c, this.f13425a, this.f, new a(baseConfigItem));
        }
    }

    public final /* synthetic */ void n(BaseConfigItem baseConfigItem, nad nadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a24ca6c", new Object[]{this, baseConfigItem, nadVar});
        } else if (!this.h.get() && this.i.compareAndSet(false, true)) {
            z("triggerOutOfTime", new HashMap());
            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
            popCenterTriggerSuccessResult.shouldPop = true;
            popCenterTriggerSuccessResult.code = this.f13425a;
            popCenterTriggerSuccessResult.restrictCode = "COST_OUT_OF_TIME";
            E(baseConfigItem);
            nadVar.m(popCenterTriggerSuccessResult);
        }
    }

    public final /* synthetic */ void q(jbm jbmVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e634757", new Object[]{this, jbmVar, jdbVar});
            return;
        }
        try {
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "TBPopHubAbility.recordPopAction.action=" + jbmVar.f21893a);
            if (this.g) {
                jdbVar.O(new ErrorResult("TemplateRender"));
            } else if (TextUtils.isEmpty(this.f13425a)) {
                jdbVar.O(new ErrorResult("codeIsEmpty"));
            } else if (this.l) {
                jdbVar.O(new ErrorResult("alreadyClosed"));
            } else if ("display".equals(jbmVar.f21893a)) {
                if (this.k) {
                    jdbVar.O(new ErrorResult("alreadyDisplayed"));
                    return;
                }
                this.k = true;
                y("selfRenderPerf", this.e);
                z("recordDisplay", null);
                nsu.t("Expose", this.f13425a, this.f);
                qtv.p(vem.b(this.f13425a), false);
            } else if ("click".equals(jbmVar.f21893a)) {
                z("recordClick", null);
                nsu.t("Click", this.f13425a, this.f);
                qtv.n(vem.b(this.f13425a), false);
                gsu.b(this.f13425a);
            } else if ("close".equals(jbmVar.f21893a)) {
                this.l = true;
                z("recordClose", null);
                nsu.t("Cancel", this.f13425a, this.f);
                qtv.o(vem.b(this.f13425a), false);
            }
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.recordDisplay.error", th);
        }
    }

    public final /* synthetic */ void r(lbm lbmVar, jdb jdbVar) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98fa5c", new Object[]{this, lbmVar, jdbVar});
            return;
        }
        try {
            if (lbmVar == null) {
                jdbVar.O(ErrorResult.a.g("setPropertiesParamsNull"));
            } else if (TextUtils.isEmpty(lbmVar.f23235a)) {
                jdbVar.O(ErrorResult.a.g("setPropertiesParamsCodeNull"));
            } else {
                this.f13425a = lbmVar.f23235a;
                this.b = lbmVar.b;
                if (!TextUtils.isEmpty(lbmVar.c)) {
                    str = lbmVar.c;
                } else {
                    str = "";
                }
                this.c = str;
                if (this.b == null) {
                    z = false;
                }
                this.g = z;
                this.m = UUID.randomUUID().toString().replace("-", "");
                JSONObject jSONObject = new JSONObject();
                this.f = jSONObject;
                jSONObject.put("code", (Object) this.f13425a);
            }
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.setProperties.error", th);
            if (jdbVar != null) {
                jdbVar.O(ErrorResult.a.g("setPropertiesParamsCatchError"));
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aaf4ea", new Object[]{this});
        } else if (!this.g) {
            wdm.d("TBPopHubAbility.onDisplay : not templateRender.code=" + this.f13425a, new Object[0]);
        } else if (this.k) {
            wdm.d("TBPopHubAbility.onDisplay : already displayed.code=" + this.f13425a, new Object[0]);
        } else {
            wdm.d("TBPopHubAbility.onDisplay.code=" + this.f13425a, new Object[0]);
            this.k = true;
            y("templateRenderPerf", this.e);
            z("displayEvent", null);
        }
    }

    public final void w(nad nadVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b93a42c", new Object[]{this, nadVar, str});
            return;
        }
        this.h.set(true);
        B(this.d, false);
        A("triggerFail", str);
        if (nadVar != null && this.i.compareAndSet(false, true)) {
            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
            popCenterTriggerSuccessResult.code = this.f13425a;
            popCenterTriggerSuccessResult.shouldPop = true;
            popCenterTriggerSuccessResult.restrictCode = str;
            nadVar.m(popCenterTriggerSuccessResult);
        }
    }

    public final void x(nad nadVar, PopCenterTriggerSuccessResult popCenterTriggerSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572cc017", new Object[]{this, nadVar, popCenterTriggerSuccessResult});
            return;
        }
        this.h.set(true);
        B(this.d, true);
        if (popCenterTriggerSuccessResult.shouldPop) {
            this.e = SystemClock.elapsedRealtime();
            z("fatiguePass", null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", popCenterTriggerSuccessResult.restrictCode);
            z("fatigueRestrict", hashMap);
        }
        if (nadVar != null && this.i.compareAndSet(false, true)) {
            nadVar.m(popCenterTriggerSuccessResult);
        }
    }

    public final /* synthetic */ void s(final nad nadVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e3e17", new Object[]{this, nadVar});
        } else if (this.j) {
            nadVar.O(ErrorResult.a.g("alreadyTriggered"));
        } else {
            this.j = true;
            if (TextUtils.isEmpty(this.f13425a)) {
                nadVar.O(ErrorResult.a.g("triggerParamsCodeNull"));
                return;
            }
            this.d = SystemClock.elapsedRealtime();
            z("triggerStart", null);
            Pair<BaseConfigItem, String> C = C();
            if (!TextUtils.isEmpty((CharSequence) C.second)) {
                A("triggerFail", (String) C.second);
                nadVar.O(ErrorResult.a.g((String) C.second));
                return;
            }
            final BaseConfigItem baseConfigItem = (BaseConfigItem) C.first;
            try {
                String c = vem.c();
                if ("high".equals(c)) {
                    j = a9l.w().l();
                } else if ("middle".equals(c)) {
                    j = a9l.w().n();
                } else {
                    j = a9l.w().m();
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.rsr
                    @Override // java.lang.Runnable
                    public final void run() {
                        TBPopCenterAbility.this.n(baseConfigItem, nadVar);
                    }
                }, j);
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, this.f13425a, "TBPopHubAbility.trigger.");
                int o = a9l.w().o();
                if (o == 1) {
                    if (nadVar != null && this.i.compareAndSet(false, true)) {
                        PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
                        popCenterTriggerSuccessResult.code = this.f13425a;
                        popCenterTriggerSuccessResult.shouldPop = true;
                        popCenterTriggerSuccessResult.restrictCode = "PASS_BY_TRIGGER_MODE";
                        E(baseConfigItem);
                        nadVar.m(popCenterTriggerSuccessResult);
                    }
                } else if (o != 2) {
                    List<String> i = a9l.w().i();
                    if (i == null || !i.contains(this.f13425a)) {
                        List<String> h = a9l.w().h();
                        if (h == null || !h.contains(this.f13425a)) {
                            UCPManager.f(this.f13425a, new UCPManager.c() { // from class: tb.ssr
                                @Override // com.taobao.android.external.UCPManager.c
                                public final void a(boolean z, String str, JSONObject jSONObject) {
                                    TBPopCenterAbility.this.p(nadVar, baseConfigItem, z, str, jSONObject);
                                }
                            });
                        } else if (nadVar != null && this.i.compareAndSet(false, true)) {
                            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult2 = new PopCenterTriggerSuccessResult();
                            popCenterTriggerSuccessResult2.code = this.f13425a;
                            popCenterTriggerSuccessResult2.shouldPop = false;
                            popCenterTriggerSuccessResult2.restrictCode = "FILTER_BY_BLACK_LIST";
                            nadVar.m(popCenterTriggerSuccessResult2);
                        }
                    } else if (nadVar != null && this.i.compareAndSet(false, true)) {
                        PopCenterTriggerSuccessResult popCenterTriggerSuccessResult3 = new PopCenterTriggerSuccessResult();
                        popCenterTriggerSuccessResult3.code = this.f13425a;
                        popCenterTriggerSuccessResult3.shouldPop = true;
                        popCenterTriggerSuccessResult3.restrictCode = "PASS_BY_WHITE_LIST";
                        E(baseConfigItem);
                        nadVar.m(popCenterTriggerSuccessResult3);
                    }
                } else if (nadVar != null && this.i.compareAndSet(false, true)) {
                    PopCenterTriggerSuccessResult popCenterTriggerSuccessResult4 = new PopCenterTriggerSuccessResult();
                    popCenterTriggerSuccessResult4.code = this.f13425a;
                    popCenterTriggerSuccessResult4.shouldPop = false;
                    popCenterTriggerSuccessResult4.restrictCode = "FILTER_BY_TRIGGER_MODE";
                    nadVar.m(popCenterTriggerSuccessResult4);
                }
            } catch (Throwable th) {
                wdm.h("TBPopHubAbility.triggerPop.error", th);
                if (nadVar != null && this.i.compareAndSet(false, true)) {
                    PopCenterTriggerSuccessResult popCenterTriggerSuccessResult5 = new PopCenterTriggerSuccessResult();
                    popCenterTriggerSuccessResult5.code = this.f13425a;
                    popCenterTriggerSuccessResult5.shouldPop = true;
                    popCenterTriggerSuccessResult5.restrictCode = "NATIVE_ERROR_DEFAULT_PASS";
                    nadVar.m(popCenterTriggerSuccessResult5);
                }
            }
        }
    }
}
