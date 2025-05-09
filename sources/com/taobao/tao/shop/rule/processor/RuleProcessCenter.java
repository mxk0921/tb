package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RuleProcessCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991580);
    }

    public static Result process(TBUrlRule tBUrlRule, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7f49a10f", new Object[]{tBUrlRule, uri});
        }
        Result result = new Result();
        if (tBUrlRule == null) {
            return result;
        }
        IRuleProcessor newInstance = RuleFactory.newInstance(tBUrlRule.type);
        if (newInstance == null) {
            return result;
        }
        return newInstance.executor(tBUrlRule, uri);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RuleFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Map<String, Class<? extends IRuleProcessor>> f12781a;

        public static IRuleProcessor newInstance(String str) {
            Class cls = (Class) ((HashMap) f12781a).get(str);
            if (cls != null) {
                try {
                    return (IRuleProcessor) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        static {
            t2o.a(668991581);
            HashMap hashMap = new HashMap();
            f12781a = hashMap;
            hashMap.put("collection", CollectionRuleProcessor.class);
            hashMap.put("combination", CombinationRuleProcessor.class);
            hashMap.put("text", TextRuleProcessor.class);
            hashMap.put("fragment", FragmentRuleProcessor.class);
            hashMap.put("parameter", ParameterRuleProcessor.class);
            hashMap.put("jsonParameter", JsonParameterRuleProcessor.class);
            hashMap.put("url", UrlRuleProcessor.class);
            hashMap.put("host", HostRuleProcessor.class);
            hashMap.put("path", PathRuleProcessor.class);
        }
    }
}
