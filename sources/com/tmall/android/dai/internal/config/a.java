package com.tmall.android.dai.internal.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.model.DAIModelTriggerType;
import java.util.Map;
import tb.j45;
import tb.k45;
import tb.kgh;
import tb.m45;
import tb.o45;
import tb.p45;
import tb.t2o;
import tb.u45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944637);
    }

    public static j45 a(Config.ModelTrigger modelTrigger) {
        j45 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("1c4dcccb", new Object[]{modelTrigger});
        }
        if (TextUtils.equals(BHRTaskConfigBase.TYPE_CONFIG_UT, modelTrigger.type)) {
            Config.ModelTriggerMatchRuleForUT modelTriggerMatchRuleForUT = modelTrigger.dataExtend;
            if (modelTriggerMatchRuleForUT != null) {
                j45 f = f(modelTrigger, modelTriggerMatchRuleForUT, modelTrigger.triId);
                if (f == null) {
                    return null;
                }
                String str = modelTrigger.triId;
                if (str != null) {
                    f.e(str);
                }
                return f;
            }
            Map<String, Object> map = modelTrigger.data;
            if (map == null || map.isEmpty() || (e = e(modelTrigger)) == null) {
                return null;
            }
            String str2 = modelTrigger.triId;
            if (str2 != null) {
                e.e(str2);
            }
            return e;
        } else if (TextUtils.equals("timing", modelTrigger.type)) {
            j45 d = d(modelTrigger);
            String str3 = modelTrigger.triId;
            if (str3 != null) {
                d.e(str3);
            }
            return d;
        } else if (TextUtils.equals("cep", modelTrigger.type)) {
            return b(modelTrigger);
        } else {
            if (TextUtils.equals("stream", modelTrigger.type)) {
                return c(modelTrigger);
            }
            return null;
        }
    }

    public static j45 b(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("b3c1f1b3", new Object[]{modelTrigger});
        }
        k45 k45Var = new k45(modelTrigger.dataCep);
        j45 j45Var = new j45();
        j45Var.f(DAIModelTriggerType.CEP);
        j45Var.d(k45Var);
        j45Var.e(modelTrigger.triId);
        return j45Var;
    }

    public static j45 c(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("cd9a9b2b", new Object[]{modelTrigger});
        }
        m45 m45Var = new m45(modelTrigger.dataCep);
        j45 j45Var = new j45();
        j45Var.f(DAIModelTriggerType.Stream);
        j45Var.d(m45Var);
        j45Var.e(modelTrigger.triId);
        return j45Var;
    }

    public static j45 d(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("3cd86575", new Object[]{modelTrigger});
        }
        u45 u45Var = new u45(modelTrigger.data);
        j45 j45Var = new j45();
        j45Var.f(DAIModelTriggerType.Timing);
        j45Var.d(u45Var);
        return j45Var;
    }

    public static j45 e(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("4ca59e0a", new Object[]{modelTrigger});
        }
        o45 o45Var = new o45(modelTrigger.data);
        int i = o45Var.f24498a;
        if (i > 0 || i == -19999) {
            j45 j45Var = new j45();
            j45Var.f(DAIModelTriggerType.Ut);
            j45Var.d(o45Var);
            return j45Var;
        }
        kgh.s("TriggerConvert", "Event Id is null or invalid.");
        return null;
    }

    public static j45 f(Config.ModelTrigger modelTrigger, Config.ModelTriggerMatchRuleForUT modelTriggerMatchRuleForUT, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j45) ipChange.ipc$dispatch("494d4c9e", new Object[]{modelTrigger, modelTriggerMatchRuleForUT, str});
        }
        int i = modelTriggerMatchRuleForUT.eventId;
        if (i > 0 || i == -19999) {
            j45 j45Var = new j45();
            j45Var.f(DAIModelTriggerType.Ut);
            p45 p45Var = new p45(modelTriggerMatchRuleForUT);
            p45Var.j(str);
            p45Var.c = modelTriggerMatchRuleForUT.batch;
            p45Var.b = modelTriggerMatchRuleForUT.ownerId;
            j45Var.d(p45Var);
            return j45Var;
        }
        kgh.s("TriggerConvert", "Event Id is null or invalid.");
        return null;
    }
}
