package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBUrlRuleResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991585);
    }

    public static TBUrlRuleResponse a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBUrlRuleResponse) ipChange.ipc$dispatch("2254fc83", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            TBUrlRuleResponse tBUrlRuleResponse = (TBUrlRuleResponse) JSON.parseObject(str2, TBUrlRuleResponse.class);
            if (!TextUtils.isEmpty(tBUrlRuleResponse.version)) {
                if (jio.a(str, tBUrlRuleResponse.version)) {
                    return tBUrlRuleResponse;
                }
            }
            return null;
        } catch (Throwable th) {
            mvr.b(th, "RuleParser.parseRuleContent() throw error, bundleName=" + str + ", rule=" + str2);
            return null;
        }
    }
}
