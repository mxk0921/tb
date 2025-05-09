package com.taobao.android.diagnose.scene.engine.reader;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.func.ToolConfigManager;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.model.NetInfo;
import com.taobao.android.diagnose.scene.engine.reader.RulesManager;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONObject;
import tb.al7;
import tb.cio;
import tb.cl7;
import tb.dio;
import tb.dwf;
import tb.idh;
import tb.jgg;
import tb.lio;
import tb.mio;
import tb.n68;
import tb.oto;
import tb.pwf;
import tb.t2o;
import tb.tx8;
import tb.uk7;
import tb.v4s;
import tb.x64;
import tb.xk7;
import tb.zht;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RulesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7250a;
    public lio b;
    public dio g = null;
    public final mio c = new x64();
    public final File d = new File(uk7.i().k(), "scene_rules_config.json");
    public final File e = new File(uk7.i().k(), "scene_rules_channel_config.json");
    public Map<String, RuleDefine> f = null;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.diagnose.scene.engine.reader.RulesManager$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass2 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        public AnonymousClass2(Runnable runnable) {
            this.val$runnable = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$7(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f7a66", new Object[]{this, mtopResponse});
                return;
            }
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject != null) {
                RulesManager.c(RulesManager.this, dataJsonObject.toString());
                onFinish();
            }
        }

        private void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            Runnable runnable = this.val$runnable;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    idh.c("RulesManager", "checkUpdate onFinish", e);
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            TLog.loge("Diagnose", "RulesManager", "Request scene rule onError. ErrorCode=" + retCode + ",ErrorMsg=" + retMsg);
            onFinish();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                al7.b().a(new Runnable() { // from class: tb.pio
                    @Override // java.lang.Runnable
                    public final void run() {
                        RulesManager.AnonymousClass2.this.lambda$onSuccess$7(mtopResponse);
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            TLog.loge("Diagnose", "RulesManager", "Request scene rule onSystemError. ErrorCode=" + retCode + ",ErrorMsg=" + retMsg);
            onFinish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends TypeReference<ConcurrentHashMap<String, RuleDefine>> {
        public a(RulesManager rulesManager) {
        }
    }

    static {
        t2o.a(615514214);
    }

    public RulesManager(Context context) {
        this.f7250a = context;
    }

    public static /* synthetic */ void c(RulesManager rulesManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144f763a", new Object[]{rulesManager, str});
        } else {
            rulesManager.u(str);
        }
    }

    public final Map<String, cio> e(List<RuleDefine> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8142687f", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        for (RuleDefine ruleDefine : list) {
            cio f = f(ruleDefine);
            if (f != null) {
                f.n(false);
                f.m(ruleDefine.expireType);
                f.l(ruleDefine.expireTime);
                f.k(ruleDefine.bizName);
                hashMap.put(f.e(), f);
            }
        }
        return hashMap;
    }

    public final cio f(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cio) ipChange.ipc$dispatch("134ce047", new Object[]{this, ruleDefine});
        }
        dio k = k(ruleDefine.conditionVer);
        if (k != null) {
            return k.a(ruleDefine);
        }
        TLog.loge("Diagnose", "RulesManager", "unsupported expression version: " + ruleDefine.conditionVer);
        return null;
    }

    public final Map<String, cio> j(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("64ff5d12", new Object[]{this, file});
        }
        if (file == null || !file.exists()) {
            idh.a("RulesManager", "Do not have config file");
            return null;
        }
        List<RuleDefine> a2 = new dwf(file).a();
        if (a2 != null && !a2.isEmpty()) {
            return e(a2);
        }
        idh.a("RulesManager", "Config RulesDefine is null");
        return null;
    }

    public final dio k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dio) ipChange.ipc$dispatch("e31a2ace", new Object[]{this, str});
        }
        if (!"1".equals(str)) {
            return null;
        }
        if (this.g == null) {
            this.g = new n68();
        }
        return this.g;
    }

    public void l(final com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2fd584", new Object[]{this, aVar});
            return;
        }
        idh.a("RulesManager", "RulesManager init");
        try {
            oto.d();
            ToolConfigManager.d();
            this.b = o();
            al7.b().d(new Runnable() { // from class: tb.nio
                @Override // java.lang.Runnable
                public final void run() {
                    RulesManager.this.m(aVar);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            idh.c("RulesManager", "init failed: ", e);
        }
    }

    public final /* synthetic */ void n(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8560fc9", new Object[]{this, aVar});
            return;
        }
        idh.a("RulesManager", "Trigger SCENE_LAUNCH & SCENE_CHANGE_CONFIG after launch!");
        aVar.n("scene_launch", null);
        aVar.n("scene_change_config", null);
        xk7.f(this.f7250a, uk7.i().g().c());
    }

    public final lio o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lio) ipChange.ipc$dispatch("2d384217", new Object[]{this});
        }
        idh.a("RulesManager", "Load rules");
        HashMap hashMap = new HashMap();
        Map<String, cio> j = j(this.d);
        Map<String, cio> i = i();
        if (j != null) {
            for (cio cioVar : j.values()) {
                if (cioVar.d() == 1 || cioVar.i()) {
                    String cioVar2 = cioVar.toString();
                    idh.a("RulesManager", "The rule " + cioVar2 + " is out of data.");
                    ToolConfigManager.k(cioVar);
                    if (i == null || !i.containsKey(cioVar.e())) {
                        oto.j(cioVar.e());
                    }
                } else {
                    idh.a("RulesManager", "Load the rule: " + cioVar.toString());
                    hashMap.put(cioVar.e(), cioVar);
                }
            }
        }
        if (i != null) {
            for (cio cioVar3 : i.values()) {
                if (cioVar3.d() == 1 || cioVar3.i()) {
                    String cioVar4 = cioVar3.toString();
                    idh.a("RulesManager", "The channel rule " + cioVar4 + " is out of data.");
                    ToolConfigManager.k(cioVar3);
                    h(cioVar3.e(), cioVar3.h());
                    if (!hashMap.containsKey(cioVar3.e())) {
                        oto.j(cioVar3.e());
                    }
                } else {
                    cio cioVar5 = (cio) hashMap.get(cioVar3.e());
                    if (cioVar5 == null || cioVar5.h() < cioVar3.h()) {
                        hashMap.put(cioVar3.e(), cioVar3);
                        idh.a("RulesManager", "Load the channel rule: " + cioVar3.toString());
                    } else {
                        String cioVar6 = cioVar5.toString();
                        String cioVar7 = cioVar3.toString();
                        idh.a("RulesManager", "Use mtop rule " + cioVar6 + ", delete channel rule " + cioVar7);
                        h(cioVar3.e(), cioVar3.h());
                        ToolConfigManager.k(cioVar3);
                    }
                }
            }
        }
        lio lioVar = new lio(hashMap.values());
        idh.a("RulesManager", "Register rule count " + lioVar.size());
        return lioVar;
    }

    public int p(String str, tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a33a955", new Object[]{this, str, tx8Var})).intValue();
        }
        return q(str, tx8Var, this.b);
    }

    public final int r(cio cioVar, tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7952e4d1", new Object[]{this, cioVar, tx8Var})).intValue();
        }
        if (!com.taobao.android.diagnose.scene.a.i(cioVar.g())) {
            return 0;
        }
        return q(cioVar.g(), tx8Var, new lio(cioVar));
    }

    public final boolean s(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c69d06", new Object[]{this, ruleDefine})).booleanValue();
        }
        idh.a("RulesManager", String.format("Save the RuleDefine %s_%d to file!", ruleDefine.id, Long.valueOf(ruleDefine.sceneVersion)));
        if (this.f == null) {
            this.f = new ConcurrentHashMap();
        }
        this.f.put(ruleDefine.id, ruleDefine);
        return cl7.i(this.e, JSON.toJSONString(this.f));
    }

    public final synchronized void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18359b94", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            idh.e("RulesManager", "The scene data is empty");
        } else {
            List<RuleDefine> a2 = new pwf(str).a();
            if (a2 == null) {
                idh.b("RulesManager", "Failed to parse the json to RuleDefine");
                return;
            }
            if (cl7.i(this.d, str)) {
                oto.h();
            }
            Map<String, cio> e = e(a2);
            idh.a("RulesManager", "Server rules count: " + e.size());
            Iterator<cio> it = this.b.iterator();
            while (it.hasNext()) {
                cio next = it.next();
                cio cioVar = e.get(next.e());
                if (next.j()) {
                    if (cioVar == null || cioVar.h() < next.h()) {
                        e.put(next.e(), next);
                        idh.a("RulesManager", "Use local channel rule: " + next.toString());
                    } else {
                        String cioVar2 = cioVar.toString();
                        String cioVar3 = next.toString();
                        idh.a("RulesManager", "Replace the local channel rule. " + cioVar2 + "-->" + cioVar3);
                        h(next.e(), next.h());
                        ToolConfigManager.k(next);
                    }
                } else if (cioVar == null) {
                    idh.a("RulesManager", "The rule is offline: " + next.toString());
                    oto.j(next.e());
                    ToolConfigManager.k(next);
                } else if (cioVar.h() != next.h()) {
                    String cioVar4 = next.toString();
                    String cioVar5 = cioVar.toString();
                    idh.a("RulesManager", "The rule version changed. " + cioVar4 + " --> " + cioVar5);
                    ToolConfigManager.k(next);
                }
            }
            this.b = new lio(e.values());
            idh.a("RulesManager", "Total rules: " + this.b.size());
        }
    }

    public void d(boolean z, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f1ce5a", new Object[]{this, new Boolean(z), runnable});
        } else if (z || oto.a()) {
            idh.a("RulesManager", "Check scene rule update!! isForce=" + z);
            try {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.get");
                mtopRequest.setVersion("1.0");
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jgg j = uk7.i().j();
                jSONObject.put("identifier", (Object) j.f21986a);
                jSONObject.put("resourceType", (Object) "scene");
                AppInfo c = uk7.i().g().c();
                NetInfo f = uk7.i().g().f();
                jSONObject.put("appVersion", (Object) c.appVer);
                jSONObject.put("arch", (Object) c.abi);
                jSONObject.put("uid", (Object) c.uid);
                jSONObject.put("nk", (Object) c.accountName);
                jSONObject.put("isInnerUser", (Object) Integer.valueOf(c.isInner ? 1 : 0));
                jSONObject.put("networkType", (Object) Integer.valueOf(f.getType()));
                jSONObject.put(zht.TAG_ACCESS, (Object) f.getOperator());
                jSONObject.put(v4s.PARAM_IS_DEBUG, (Object) Integer.valueOf(c.isDebug ? 1 : 0));
                jSONObject.put("brand", (Object) c.brand);
                mtopRequest.setData(jSONObject.toJSONString());
                idh.a("RulesManager", "mtop request: " + mtopRequest.toString());
                MtopBusiness.build(Mtop.instance(j.b, this.f7250a), mtopRequest).reqMethod(MethodEnum.POST).retryTime(2).registerListener((IRemoteListener) new AnonymousClass2(runnable)).startRequest();
            } catch (Exception e) {
                idh.c("RulesManager", "checkUpdate failed: ", e);
            }
        } else {
            idh.a("RulesManager", "Limit to check the scene update!");
        }
    }

    public final /* synthetic */ void m(final com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e2c013", new Object[]{this, aVar});
            return;
        }
        try {
            d(false, new Runnable() { // from class: tb.oio
                @Override // java.lang.Runnable
                public final void run() {
                    RulesManager.this.n(aVar);
                }
            });
        } catch (Exception e) {
            idh.c("RulesManager", "init in runnable", e);
        }
    }

    public final int q(String str, tx8 tx8Var, lio lioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a566f4e", new Object[]{this, str, tx8Var, lioVar})).intValue();
        }
        try {
            if (this.c != null && !TextUtils.isEmpty(str)) {
                return ((x64) this.c).b(lioVar, tx8Var, str);
            }
        } catch (Exception e) {
            idh.c("RulesManager", "onFacts", e);
        }
        return 0;
    }

    public final Map<String, cio> i() {
        cio f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7a12844", new Object[]{this});
        }
        File file = this.e;
        if (file == null || !file.exists()) {
            idh.a("RulesManager", "Do not have channel config file");
            return null;
        }
        try {
            String h = cl7.h(this.e);
            if (TextUtils.isEmpty(h)) {
                idh.a("RulesManager", "Channel config file is empty");
                return null;
            }
            Map<String, RuleDefine> map = (Map) JSON.parseObject(h, new a(this), new Feature[0]);
            this.f = map;
            if (!(map == null || map.values() == null)) {
                HashMap hashMap = new HashMap();
                for (RuleDefine ruleDefine : this.f.values()) {
                    if (!(ruleDefine == null || (f = f(ruleDefine)) == null)) {
                        f.n(true);
                        f.m(ruleDefine.expireType);
                        f.l(ruleDefine.expireTime);
                        f.k(ruleDefine.bizName);
                        hashMap.put(f.e(), f);
                    }
                }
                return hashMap;
            }
            idh.a("RulesManager", "Channel config RulesDefine is null");
            return null;
        } catch (Exception e) {
            idh.c("RulesManager", "Filed to load channel config", e);
            return null;
        }
    }

    public synchronized void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2afd385", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            idh.e("RulesManager", "The channel content is empty");
        } else {
            idh.a("RulesManager", "deleteChannelRule: " + str);
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
            String string2 = parseObject.getString("id");
            Long l = parseObject.getLong("sceneVersion");
            long longValue = l.longValue();
            h(string2, longValue);
            ToolConfigManager.j(string, string2, longValue);
            cio a2 = this.b.a(string2);
            if (a2 != null && a2.j() && a2.h() == longValue) {
                this.b.c(a2);
                idh.a("RulesManager", String.format("Unregister channel rule: %s_%d", string2, l));
                oto.j(string2);
            }
        }
    }

    public final boolean h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180aab91", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        Map<String, RuleDefine> map = this.f;
        if (map == null) {
            idh.a("RulesManager", String.format("channelRulesDefine is null: %s_%d", str, Long.valueOf(j)));
            return false;
        }
        RuleDefine ruleDefine = map.get(str);
        if (ruleDefine == null || ruleDefine.sceneVersion != j) {
            idh.a("RulesManager", String.format("Can't find the %s_%d from file!", str, Long.valueOf(j)));
            return false;
        }
        idh.a("RulesManager", String.format("Remove the RuleDefine %s_%d from file!", str, Long.valueOf(j)));
        this.f.remove(str);
        return cl7.i(this.e, JSON.toJSONString(this.f));
    }

    public synchronized void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc117c27", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            idh.e("RulesManager", "The channel content is empty");
        } else {
            idh.a("RulesManager", "updateChannelRule: " + str);
            RuleDefine b = new pwf(str).b();
            if (b == null) {
                idh.b("RulesManager", "Failed to parse the channel content to RuleDefine");
            } else if (b.isExpire()) {
                idh.e("RulesManager", String.format("The channel rule %s_%d is out of date. %d", b.id, Long.valueOf(b.sceneVersion), Long.valueOf(b.expireTime)));
            } else {
                int i = b.expireType;
                if (i == 1 || i == 2) {
                    cio a2 = this.b.a(b.id);
                    if (a2 != null) {
                        long h = a2.h();
                        long j = b.sceneVersion;
                        if (h >= j) {
                            idh.b("RulesManager", String.format("The new channel rule version %s_%d <= %s", b.id, Long.valueOf(j), a2.toString()));
                            return;
                        }
                    }
                    cio f = f(b);
                    if (f == null) {
                        idh.b("RulesManager", "Failed to convert Ruledefine to Rule");
                        return;
                    }
                    f.n(true);
                    f.m(b.expireType);
                    f.l(b.expireTime);
                    f.k(b.bizName);
                    if (a2 != null) {
                        this.b.c(a2);
                        idh.a("RulesManager", "Unregister local rule: " + a2.toString());
                        ToolConfigManager.k(a2);
                    }
                    if (!s(b)) {
                        idh.e("RulesManager", "Failed to save the channel rule");
                        return;
                    }
                    this.b.b(f);
                    idh.a("RulesManager", "Register new channel rule: " + f.toString());
                    if ("scene_change_config".equals(f.g())) {
                        idh.a("RulesManager", "Trigger rule: " + f.toString());
                        r(f, null);
                    }
                    return;
                }
                idh.e("RulesManager", "Invalid expireType: " + b.expireType);
            }
        }
    }
}
