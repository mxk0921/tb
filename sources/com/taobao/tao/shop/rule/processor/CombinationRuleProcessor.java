package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CombinationRuleProcessor implements IRuleProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991573);
        t2o.a(668991576);
    }

    @Override // com.taobao.tao.shop.rule.processor.IRuleProcessor
    public Result executor(TBUrlRule tBUrlRule, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7addac2b", new Object[]{this, tBUrlRule, uri});
        }
        Result result = new Result();
        if (tBUrlRule == null) {
            return result;
        }
        Iterator<TBUrlRule> it = tBUrlRule.subRules.iterator();
        while (it.hasNext()) {
            result = RuleProcessCenter.process(it.next(), uri);
            if (!result.isMatch) {
                return result;
            }
        }
        if (result.isMatch && !TextUtils.isEmpty(result.target)) {
            result.target = tBUrlRule.target;
        }
        return result;
    }
}
