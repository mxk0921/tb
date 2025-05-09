package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.regex.Pattern;
import tb.iio;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TextRuleProcessor implements IRuleProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991582);
        t2o.a(668991576);
    }

    @Override // com.taobao.tao.shop.rule.processor.IRuleProcessor
    public Result executor(TBUrlRule tBUrlRule, Uri uri) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7addac2b", new Object[]{this, tBUrlRule, uri});
        }
        Result result = new Result();
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            return result;
        }
        String lowerCase = uri2.toLowerCase();
        if (iio.p(tBUrlRule.regex)) {
            z = Pattern.compile(tBUrlRule.content).matcher(lowerCase).find();
        } else {
            z = lowerCase.equals(tBUrlRule.content);
        }
        if (z) {
            result.isMatch = true;
            result.isShop = true;
            result.target = tBUrlRule.target;
        }
        return result;
    }
}
