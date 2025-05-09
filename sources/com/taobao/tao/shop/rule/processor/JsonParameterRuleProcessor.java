package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class JsonParameterRuleProcessor implements IRuleProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991577);
        t2o.a(668991576);
    }

    @Override // com.taobao.tao.shop.rule.processor.IRuleProcessor
    public Result executor(TBUrlRule tBUrlRule, Uri uri) {
        JSONObject parseObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7addac2b", new Object[]{this, tBUrlRule, uri});
        }
        Result result = new Result();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || (jSONArray = (parseObject = JSON.parseObject(tBUrlRule.content)).getJSONArray("host")) == null) {
            return result;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof String) && host.equals((String) next)) {
                result.isMatch = true;
                result.isShop = true;
                result.target = tBUrlRule.target;
                break;
            }
        }
        JSONArray jSONArray2 = parseObject.getJSONArray("path");
        if (jSONArray2 == null) {
            return result;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            path = "";
        }
        Iterator<Object> it2 = jSONArray2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if ((next2 instanceof String) && path.equals((String) next2)) {
                result.isMatch = true;
                result.isShop = true;
                result.target = tBUrlRule.target;
                break;
            }
        }
        return result;
    }
}
