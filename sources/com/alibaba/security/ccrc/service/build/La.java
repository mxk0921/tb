package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.La;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class La {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2562a = "BehaviorDataPreManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(serialize = false)

        /* renamed from: a  reason: collision with root package name */
        public String f2563a;
        @JSONField(serialize = false)
        public Map<String, Object> b;

        public a() {
        }

        public Map<String, Object> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            Map<String, Object> map = JsonUtils.toMap(this);
            Map<String, Object> map2 = this.b;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.b);
            }
            return map;
        }

        public /* synthetic */ a(Ka ka2) {
        }
    }

    private BehaviorRiskSample b(C1199x xVar, Object obj) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviorRiskSample) ipChange.ipc$dispatch("61029925", new Object[]{this, xVar, obj});
        }
        String jSONString = JsonUtils.toJSONString(obj);
        if (!TextUtils.isEmpty(jSONString) && (map = JsonUtils.toMap(jSONString)) != null && !map.isEmpty()) {
            BxData.a a2 = obj != null ? a(xVar, map, jSONString) : null;
            if (a2 != null && a2.h) {
                Map<String, Object> a3 = a(a2).a();
                if (a3 == null || a3.isEmpty()) {
                    b(xVar.d(), xVar.getCcrcCode(), -1, "resultMap is null or empty", a2.i);
                    return null;
                }
                String uuid = UUID.randomUUID().toString();
                return new BehaviorRiskSample("BXS_" + uuid, a3);
            } else if (a2 == null || a2.g != -2) {
                String d = xVar.d();
                String ccrcCode = xVar.getCcrcCode();
                StringBuilder a4 = Kb.a("SeqResult parse fail: ");
                a4.append(a2 == null ? "seqResult is null" : a2.f);
                b(d, ccrcCode, -1, a4.toString(), a2 == null ? "" : a2.i);
            }
        }
        return null;
    }

    public BehaviorRiskSample a(C1199x xVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviorRiskSample) ipChange.ipc$dispatch("7d43a924", new Object[]{this, xVar, obj});
        }
        BehaviorRiskSample b = b(xVar, obj);
        if (b == null) {
            b(xVar.d(), xVar.getCcrcCode(), -1, "sample is null", null);
        }
        return b;
    }

    private BxData.a a(C1199x xVar, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BxData.a) ipChange.ipc$dispatch("d1913abc", new Object[]{this, xVar, map, str});
        }
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    Na a2 = Ma.a(xVar, map);
                    if (a2 == null) {
                        return BxData.a.a(-1, "parser is null", str);
                    }
                    return a2.a(map, str);
                }
            } catch (Throwable th) {
                StringBuilder a3 = Kb.a("handle bx data fail: ");
                a3.append(Arrays.toString(th.getStackTrace()));
                return BxData.a.a(-1, a3.toString(), str);
            }
        }
        return BxData.a.a(-1, "Map is empty", str);
    }

    private a a(BxData.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c10d7e17", new Object[]{this, aVar});
        }
        a aVar2 = new a(null);
        aVar2.b = aVar.e;
        aVar2.f2563a = aVar.i;
        return aVar2;
    }

    public static /* synthetic */ void a(String str, String str2, int i, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce129b", new Object[]{str, str2, new Integer(i), str3, str4});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("detect").setOperation(C1174ka.a.p).setStatus(i).addParam("errorMsg", str3).addParam("bxData", str4).build());
        }
    }

    public void b(final String str, final String str2, final int i, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cf643a", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        if (C1180n.a(str4)) {
            str4 = "features over limit size";
        }
        TrackManager.getExecutor().execute(new Runnable() { // from class: tb.saz
            @Override // java.lang.Runnable
            public final void run() {
                La.a(str, str2, i, str3, str4);
            }
        });
    }
}
