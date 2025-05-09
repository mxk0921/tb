package com.taobao.taolive.sdk.business.commission;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.u2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.abilityidl.ability.AbsContentCommissionAbility;
import com.taobao.android.abilityidl.ability.ContentCommissionCommitSuccResult;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.drb;
import tb.fkx;
import tb.gat;
import tb.kdb;
import tb.ldb;
import tb.m3s;
import tb.mo4;
import tb.no4;
import tb.o3s;
import tb.oo4;
import tb.qvs;
import tb.t2o;
import tb.v2s;
import tb.vx9;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ContentCommissionService extends AbsContentCommissionAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355991);
    }

    public static /* synthetic */ void access$000(ContentCommissionService contentCommissionService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8939c5", new Object[]{contentCommissionService, str});
        } else {
            contentCommissionService.s(str);
        }
    }

    public static /* synthetic */ Object ipc$super(ContentCommissionService contentCommissionService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/commission/ContentCommissionService");
    }

    public final void a(mo4 mo4Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a64137", new Object[]{this, mo4Var, hashMap});
            return;
        }
        if (vx9.d() != null && !TextUtils.isEmpty(mo4Var.c) && vx9.a(mo4Var.c)) {
            hashMap.put("liveToken", vx9.d().p());
        }
        if (!TextUtils.isEmpty(mo4Var.e)) {
            hashMap.put("sourceType", mo4Var.e);
        }
    }

    public mo4 buildContentCommissionParams(kdb kdbVar, no4 no4Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mo4) ipChange.ipc$dispatch("dfdefa68", new Object[]{this, kdbVar, no4Var, jSONObject});
        }
        String m = m(k(kdbVar));
        f(jSONObject, m);
        mo4 c = c(no4Var, jSONObject, m);
        s("buildContentCommissionParams, basicModel=" + c);
        return c;
    }

    public final mo4 c(no4 no4Var, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mo4) ipChange.ipc$dispatch("280d7dd6", new Object[]{this, no4Var, jSONObject, str});
        }
        JSONObject l = l(jSONObject, str);
        JSONObject n = n(jSONObject, "itemBizInfo");
        if (l == null || n == null) {
            return null;
        }
        String p = p(no4Var.b);
        String o = o(no4Var.b);
        JSONObject b = b(n, l, no4Var.b);
        mo4 mo4Var = new mo4();
        mo4Var.h = l.getString(gat.TCP_BID);
        mo4Var.d = l.getString(gat.BIZ_TYPE);
        mo4Var.c = n.getString("liveId");
        mo4Var.b = n.getString("itemId");
        mo4Var.f24177a = n.getString("accountId");
        mo4Var.e = p;
        mo4Var.g = o;
        q(no4Var.b, "pageName", "");
        HashMap hashMap = new HashMap();
        hashMap.put("jumpTarget", q(no4Var.b, "jumpTarget", ""));
        mo4Var.l = hashMap;
        mo4Var.k = b;
        Map<String, ? extends Object> map = no4Var.c;
        if (map != null && !map.isEmpty()) {
            mo4Var.n = no4Var.c;
        }
        Map<String, ? extends Object> map2 = no4Var.b;
        if (map2 != null && !map2.isEmpty()) {
            mo4Var.m = no4Var.b;
        }
        return mo4Var;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContentCommissionAbility
    public void commitContentCommissionTrack(kdb kdbVar, mo4 mo4Var, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7750a70", new Object[]{this, kdbVar, mo4Var, drbVar});
            return;
        }
        s("提交内容推广追踪数据, 参数: " + mo4Var);
        i(mo4Var, drbVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContentCommissionAbility
    public void commitLiveCommissionTrack(kdb kdbVar, no4 no4Var, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd9ee1d", new Object[]{this, kdbVar, no4Var, drbVar});
            return;
        }
        s("提交直播推广追踪数据, 参数: " + no4Var);
        j(kdbVar, no4Var, drbVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContentCommissionAbility
    public void commitOuterCommissionTrack(kdb kdbVar, oo4 oo4Var, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2181a2fb", new Object[]{this, kdbVar, oo4Var, drbVar});
            return;
        }
        s("提交外部推广追踪数据, 参数: " + oo4Var);
    }

    public final String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bf459e9", new Object[]{this, jSONObject});
        }
        String str = v2s.o().u().getUserId() + "_" + jSONObject.getString("accountId") + "_" + jSONObject.getString("liveId") + "_" + jSONObject.getString("itemId") + "_" + System.currentTimeMillis();
        s("buildTraceId,traceId=" + str);
        return str;
    }

    public final String e(mo4 mo4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0e723c", new Object[]{this, mo4Var});
        }
        String str = v2s.o().u().getUserId() + "_" + mo4Var.f24177a + "_" + mo4Var.c + "_" + mo4Var.b + "_" + System.currentTimeMillis();
        s("buildTraceId,traceId=" + str);
        return str;
    }

    public final ContentBusinessModel g(mo4 mo4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentBusinessModel) ipChange.ipc$dispatch("5e6f2d22", new Object[]{this, mo4Var});
        }
        ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
        contentBusinessModel.contentId = mo4Var.c;
        contentBusinessModel.itemId = mo4Var.b;
        contentBusinessModel.adUserId = mo4Var.f24177a;
        contentBusinessModel.ct = mo4Var.g;
        contentBusinessModel.actionSource = mo4Var.f;
        contentBusinessModel.sourceType = mo4Var.e;
        contentBusinessModel.trackSource = mo4Var.i;
        contentBusinessModel.trackSubSource = mo4Var.j;
        contentBusinessModel.tcpBid = mo4Var.h;
        contentBusinessModel.scenceId = mo4Var.d;
        if (mo4Var.l != null) {
            contentBusinessModel.dataAttributes = new org.json.JSONObject(mo4Var.l);
        }
        contentBusinessModel.context = new org.json.JSONObject(mo4Var.k);
        return contentBusinessModel;
    }

    public final IRemoteBaseListener h(mo4 mo4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("688a0b9a", new Object[]{this, mo4Var});
        }
        return new IRemoteBaseListener() { // from class: com.taobao.taolive.sdk.business.commission.ContentCommissionService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ContentCommissionService contentCommissionService = ContentCommissionService.this;
                ContentCommissionService.access$000(contentCommissionService, "onError重试,code=" + i);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    ContentCommissionService.access$000(ContentCommissionService.this, "onSuccess");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ContentCommissionService contentCommissionService = ContentCommissionService.this;
                ContentCommissionService.access$000(contentCommissionService, "onSystemError重试,code=" + i);
            }
        };
    }

    public final Context k(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9d185ef3", new Object[]{this, kdbVar});
        }
        ldb l = kdbVar.l();
        if (l != null) {
            return l.getContext();
        }
        return null;
    }

    public final JSONObject l(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2c94fef", new Object[]{this, jSONObject, str});
        }
        JSONObject n = n(jSONObject, "cpsTcpInfo");
        if (n != null) {
            return n.getJSONObject(str);
        }
        return null;
    }

    public final String m(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6b3c368", new Object[]{this, context});
        }
        if (v2s.o().f() != null) {
            str = v2s.o().f().getAppName(context);
        } else {
            str = "unknown";
        }
        return str.toLowerCase();
    }

    public final JSONObject n(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9b3d213", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public final String o(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b6b483", new Object[]{this, map});
        }
        return q(map, "popularizeTargetType", "1");
    }

    public final String p(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2de3bd94", new Object[]{this, map});
        }
        return q(map, "sourceType", "2");
    }

    public final String q(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf7a61f0", new Object[]{this, map, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (map == null || map.isEmpty() || !map.containsKey(str)) {
            return str2;
        }
        return String.valueOf(map.get(str));
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            o3s.b("ContentCommissionService", str);
        }
    }

    public final void u(String str, String str2, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f1a8d3", new Object[]{this, str, str2, drbVar});
            return;
        }
        if (drbVar != null) {
            drbVar.O(new ErrorResult(str, str2));
        }
        s(str2);
    }

    public final JSONObject v(no4 no4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("abc499bd", new Object[]{this, no4Var});
        }
        Map<String, ? extends Object> map = no4Var.f24858a;
        if (map.isEmpty()) {
            return null;
        }
        return fkx.d(fkx.i(map));
    }

    public final void w(mo4 mo4Var, boolean z) {
        IRemoteBaseListener iRemoteBaseListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf88273", new Object[]{this, mo4Var, new Boolean(z)});
            return;
        }
        ContentBusinessModel g = g(mo4Var);
        gat gatVar = new gat();
        if (z) {
            iRemoteBaseListener = h(mo4Var);
        } else {
            iRemoteBaseListener = null;
        }
        gatVar.e(g, iRemoteBaseListener);
    }

    public final void x(drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711af59", new Object[]{this, drbVar});
        } else if (drbVar != null) {
            ContentCommissionCommitSuccResult contentCommissionCommitSuccResult = new ContentCommissionCommitSuccResult();
            contentCommissionCommitSuccResult.isSuccess = Boolean.TRUE;
            contentCommissionCommitSuccResult.result = new HashMap();
            drbVar.T0(contentCommissionCommitSuccResult);
        }
    }

    public final void y(mo4 mo4Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78606f53", new Object[]{this, mo4Var, jSONObject});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        a(mo4Var, hashMap);
        hashMap.put("item_id", mo4Var.b);
        hashMap.put(z9u.KEY_ACCOUNT_ID, mo4Var.f24177a);
        hashMap.put("feed_id", mo4Var.c);
        hashMap.put("bizTraceId", e(mo4Var));
        hashMap.put("scenceId", mo4Var.d);
        hashMap.put(gat.TCP_BID, mo4Var.h);
        hashMap.put(gat.CT, mo4Var.g);
        String q = q(mo4Var.m, "itemJumpUrl", "");
        if (!TextUtils.isEmpty(q)) {
            hashMap.put("itemJumpUrl", q);
        }
        hashMap.put("platformType", "1");
        hashMap.put(u2.q, "MEGA");
        Map<String, ? extends Object> map = mo4Var.k;
        if (map != null) {
            hashMap.put("context", map.toString());
        }
        if (jSONObject != null) {
            str = jSONObject.getString("isDefault");
        } else {
            str = "false";
        }
        hashMap.put("isDefault", str);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "LiveCpsMonitor", hashMap);
        }
    }

    public final JSONObject b(JSONObject jSONObject, JSONObject jSONObject2, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("79dfd43c", new Object[]{this, jSONObject, jSONObject2, map});
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("clickPos", (Object) q(map, "clickPos", ""));
            String q = q(map, "livesource", "");
            jSONObject3.put("entrylivesource", (Object) q);
            jSONObject3.put("livesource", (Object) q);
            String q2 = q(map, "spm", "");
            jSONObject3.put("spm-url", (Object) q2);
            jSONObject3.put("entryspm", (Object) q2);
            jSONObject3.put("bizTraceId", (Object) d(jSONObject));
            jSONObject3.put("appkey", (Object) GetAppKeyFromSecurity.getAppKey(0));
            String string = jSONObject2.getString("context");
            if (!TextUtils.isEmpty(string)) {
                HashMap<String, String> b = m3s.b(fkx.d(string));
                if (!b.keySet().isEmpty()) {
                    for (String str : b.keySet()) {
                        String valueOf = String.valueOf(str);
                        jSONObject3.put(valueOf, (Object) b.get(valueOf));
                    }
                }
            }
            return jSONObject3;
        } catch (Throwable th) {
            s("buildContextFromLiveBizParams error: " + th.getMessage());
            return null;
        }
    }

    public final void f(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23445cac", new Object[]{this, jSONObject, str});
        } else if (t(jSONObject, str)) {
            try {
                jSONObject.put("cpsTcpInfo", (Object) qvs.x0());
                jSONObject.put("isDefault", (Object) String.valueOf(true));
                s("直播商业化cps参数补全");
            } catch (Exception e) {
                s("直播商业化cps参数补全失败" + e.getMessage());
            }
        }
    }

    public final void i(mo4 mo4Var, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56065772", new Object[]{this, mo4Var, drbVar});
        } else if (!r(mo4Var.n)) {
            u("-10000", "直播商业化调用BizCode校验失败", drbVar);
        } else {
            w(mo4Var, true);
            x(drbVar);
        }
    }

    public final void j(kdb kdbVar, no4 no4Var, drb drbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e281eac2", new Object[]{this, kdbVar, no4Var, drbVar});
        } else if (!r(no4Var.c)) {
            u("-10000", "直播商业化调用BizCode校验失败", drbVar);
        } else {
            JSONObject v = v(no4Var);
            if (v == null) {
                u(Constant.CODE_ERROR_START_AUTH_PAGE_FAIL, "直播业务参数解析失败", drbVar);
                return;
            }
            mo4 buildContentCommissionParams = buildContentCommissionParams(kdbVar, no4Var, v);
            if (buildContentCommissionParams == null) {
                u(Constant.CODE_ERROR_START_AUTH_PAGE_FAIL, "直播业务参数构建失败", drbVar);
                return;
            }
            w(buildContentCommissionParams, true);
            x(drbVar);
            y(buildContentCommissionParams, v);
        }
    }

    public final boolean r(Map<String, ?> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5e4e384", new Object[]{this, map})).booleanValue();
        }
        if (qvs.U() && map != null && !map.isEmpty() && map.get("bizCode") != null) {
            String str = (String) map.get("bizCode");
            String Q0 = qvs.Q0();
            if (!TextUtils.isEmpty(Q0)) {
                for (String str2 : Q0.split(",")) {
                    if (TextUtils.equals(str2, str)) {
                        s("白名单允许请求: " + str2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a643d7ba", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (n(jSONObject, "itemBizInfo") != null) {
            return n(jSONObject, "cpsTcpInfo") == null || !n(jSONObject, "cpsTcpInfo").containsKey(str);
        }
        return false;
    }
}
