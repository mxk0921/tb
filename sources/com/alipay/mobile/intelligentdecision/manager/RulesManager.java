package com.alipay.mobile.intelligentdecision.manager;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alipay.mobile.intelligentdecision.db.model.DecisionModel;
import com.alipay.mobile.intelligentdecision.db.model.FeatureModel;
import com.alipay.mobile.intelligentdecision.db.model.RuleModel;
import com.alipay.mobile.intelligentdecision.db.model.StrategyModel;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.parser.ParserUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RulesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f4256a = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, ConcurrentHashMap<String, FeatureModel>> b = new ConcurrentHashMap<>();
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface RuleListener {
        void a(Object obj, String str);
    }

    static {
        new HashMap().put("bizDataPerceiveStrategy", "content://com.alipay.mobile.alertsentry.provider/journal");
    }

    public static /* synthetic */ Object a(RulesManager rulesManager, DecisionModel decisionModel, boolean z, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("45e5cda8", new Object[]{rulesManager, decisionModel, new Boolean(z), str, bundle}) : rulesManager.a(decisionModel, z, str, bundle);
    }

    public static /* synthetic */ ConcurrentHashMap b(RulesManager rulesManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("3e3a1658", new Object[]{rulesManager}) : rulesManager.b;
    }

    public static String d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "''";
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return String.valueOf(obj);
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            return "'" + String.valueOf(obj) + "'";
        }
        try {
            return "'" + JSON.toJSONString(obj) + "'";
        } catch (Throwable th) {
            DecisionLogcat.b("RulesManager", "json parse error:" + th.getMessage());
            return String.valueOf(obj);
        }
    }

    public static void f(RuleModel ruleModel, StrategyModel strategyModel, String str, String str2, long j, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee21b411", new Object[]{ruleModel, strategyModel, str, str2, new Long(j), bundle});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("rule_name", ruleModel.name);
        hashMap.put("rule_action", ruleModel.action);
        hashMap.put("rule_result", str2);
        if (bundle != null && bundle.containsKey("final_expression")) {
            hashMap.put("rule_expression", bundle.getString("final_expression"));
        }
        DecisonLogBehavior.a().a("191121-5", strategyModel.id, str, ruleModel.id, String.valueOf(j), hashMap);
    }

    public static void g(String str, String str2, String str3, FeatureModel featureModel, String str4, long j, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333d84a1", new Object[]{str, str2, str3, featureModel, str4, new Long(j), str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("feature_id", featureModel.id);
        hashMap.put("feature_error", str5);
        hashMap.put("feature_result", str4);
        DecisonLogBehavior a2 = DecisonLogBehavior.a();
        a2.a("191121-6", str, str3, str2 + "_" + featureModel.id, String.valueOf(j), hashMap);
    }

    public static /* synthetic */ ConcurrentHashMap a(RulesManager rulesManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("14d29d79", new Object[]{rulesManager}) : rulesManager.f4256a;
    }

    public static void e(FeatureModel featureModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798b95e1", new Object[]{featureModel});
            return;
        }
        String str = featureModel.content;
        if (!TextUtils.isEmpty(str) && str.contains("#{") && str.contains("}")) {
            JSONArray jSONArray = new JSONArray();
            try {
                int indexOf = str.indexOf("#{");
                int indexOf2 = str.indexOf("}");
                while (indexOf != -1 && indexOf2 != -1) {
                    int i = indexOf + 2;
                    if (i <= indexOf2) {
                        String substring = str.substring(i, indexOf2);
                        if (!TextUtils.isEmpty(substring) && !substring.contains("#{") && !substring.contains("}") && !jSONArray.contains(substring)) {
                            jSONArray.add(substring);
                        }
                    }
                    int i2 = indexOf2 + 1;
                    indexOf = str.indexOf("#{", i2);
                    indexOf2 = str.indexOf("}", i2);
                }
            } catch (Throwable unused) {
            }
            featureModel.relay = jSONArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0407 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.ArrayList<com.alipay.mobile.intelligentdecision.db.model.FeatureModel> r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, android.os.Bundle r32, com.flybird.FBDocument.Duktape r33) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.RulesManager.b(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, com.flybird.FBDocument$Duktape):java.lang.Object");
    }

    public final Object a(DecisionModel decisionModel, boolean z, String str, Bundle bundle) {
        ArrayList<RuleModel> arrayList;
        FBDocument.Duktape duktape;
        int i;
        String str2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c58bb9ed", new Object[]{this, decisionModel, new Boolean(z), str, bundle});
        }
        DecisionLogcat.b("RulesManager", "getDecisonResult");
        StrategyModel strategyModel = decisionModel.getStrategyModel();
        if (z) {
            arrayList = decisionModel.tryRuleMap;
        } else {
            arrayList = decisionModel.ruleMap;
        }
        try {
            duktape = FBDocument.createDuk();
        } catch (Throwable unused) {
            duktape = null;
        }
        if (duktape == null) {
            DecisonLogBehavior.a().a("200221-5", strategyModel.id, str, "createDuk null", "", new HashMap());
            return "EXCEPTION";
        }
        ArrayList<FeatureModel> arrayList2 = decisionModel.commonFeatureMap;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            RuleModel ruleModel = arrayList.get(i2);
            if (TextUtils.isEmpty(ruleModel.expression)) {
                ruleModel.expression = "";
            }
            String str3 = ruleModel.expression;
            DecisionLogcat.b("RulesManager", "rule expression:" + str3);
            ArrayList a2 = ParserUtils.a(ruleModel.features, ruleModel.id);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                FeatureModel featureModel = (FeatureModel) it.next();
                if (FeatureModel.TYPE_DERIVE.equalsIgnoreCase(featureModel.type)) {
                    e(featureModel);
                    JSONArray jSONArray = featureModel.relay;
                    if (jSONArray != null && jSONArray.size() > 0) {
                        for (int i3 = 0; i3 < featureModel.relay.size(); i3++) {
                            hashMap.put((String) featureModel.relay.get(i3), "");
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<FeatureModel> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    FeatureModel next = it2.next();
                    next.isCommon = true;
                    if (!FeatureModel.TYPE_DERIVE.equalsIgnoreCase(next.type)) {
                        hashMap2.put(next.id, next);
                    }
                    String str4 = "#{" + next.id + "}";
                    if (hashMap.containsKey(next.id)) {
                        a2.add(next);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (str3.contains(str4)) {
                        if (!z2) {
                            a2.add(next);
                        }
                        if (FeatureModel.TYPE_DERIVE.equalsIgnoreCase(next.type)) {
                            e(next);
                            if (next.relay != null) {
                                for (int i4 = 0; i4 < next.relay.size(); i4++) {
                                    arrayList3.add((String) next.relay.get(i4));
                                }
                            }
                        }
                    }
                    i2 = i2;
                    arrayList2 = arrayList2;
                    arrayList = arrayList;
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String str5 = (String) it3.next();
                if (hashMap2.containsKey(str5)) {
                    a2.add(hashMap2.get(str5));
                }
            }
            if (a2.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                arrayList2 = arrayList2;
                arrayList = arrayList;
                Object b = b(a2, str3, str, ruleModel.id, strategyModel.id, bundle, duktape);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (b != null) {
                    String valueOf = String.valueOf(b);
                    if ("true".equalsIgnoreCase(valueOf)) {
                        f(ruleModel, strategyModel, str, "true", currentTimeMillis2, bundle);
                        if (!z) {
                            JsV8Manager.a();
                            JsV8Manager.a(duktape);
                            String str6 = ruleModel.action;
                            if (TextUtils.isEmpty(str6) || !str6.startsWith("#{") || !str6.endsWith("}")) {
                                return ruleModel.action;
                            }
                            DecisionLogcat.b("RulesManager", "matchAction:" + ruleModel.action);
                            ConcurrentHashMap<String, String> concurrentHashMap = this.f4256a.get(str);
                            if (concurrentHashMap == null) {
                                return "EXCEPTION";
                            }
                            String str7 = ruleModel.action;
                            String substring = str7.substring(2, str7.length() - 1);
                            DecisionLogcat.b("RulesManager", "matchAction feature_id:" + substring + ", result:" + concurrentHashMap.get(substring));
                            return concurrentHashMap.get(substring);
                        }
                        str2 = str;
                        i = i2;
                    } else {
                        str2 = str;
                        if ("false".equalsIgnoreCase(valueOf)) {
                            i = i2;
                            if (i == arrayList.size() - 1) {
                                f(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                                if (!z) {
                                    JsV8Manager.a();
                                    JsV8Manager.a(duktape);
                                    return "NOT_MATCH";
                                }
                            } else {
                                f(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                            }
                        } else {
                            i = i2;
                            f(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                            if (!z) {
                                JsV8Manager.a();
                                JsV8Manager.a(duktape);
                                return "EXCEPTION";
                            }
                        }
                    }
                } else {
                    str2 = str;
                    i = i2;
                    f(ruleModel, strategyModel, str, "rule result null", currentTimeMillis2, bundle);
                    if (!z) {
                        JsV8Manager.a();
                        JsV8Manager.a(duktape);
                        return "EXCEPTION";
                    }
                }
            } else {
                i = i2;
                str2 = str;
                arrayList2 = arrayList2;
                arrayList = arrayList;
                f(ruleModel, strategyModel, str, "feature is null", 0L, bundle);
                if (!z) {
                    JsV8Manager.a();
                    JsV8Manager.a(duktape);
                    return "EXCEPTION";
                }
            }
            i2 = i + 1;
        }
        JsV8Manager.a();
        JsV8Manager.a(duktape);
        return strategyModel.failover_action;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(com.alipay.mobile.intelligentdecision.db.model.FeatureModel r21, android.os.Bundle r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.RulesManager.c(com.alipay.mobile.intelligentdecision.db.model.FeatureModel, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
