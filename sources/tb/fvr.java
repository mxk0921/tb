package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import com.taobao.tao.shop.rule.data.TBUrlRuleSet;
import com.taobao.tao.shop.rule.processor.RuleProcessCenter;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19557a = false;
        public String b;
        public String c;
        public String d;

        static {
            t2o.a(668991547);
        }
    }

    static {
        t2o.a(668991545);
    }

    public static a a(TBUrlRuleSet tBUrlRuleSet, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("960ff419", new Object[]{tBUrlRuleSet, uri});
        }
        a aVar = new a();
        if (!(tBUrlRuleSet == null || tBUrlRuleSet.subRules == null)) {
            Result result = new Result();
            Iterator<TBUrlRule> it = tBUrlRuleSet.subRules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                result = RuleProcessCenter.process(it.next(), uri);
                if (result.isMatch) {
                    aVar.f19557a = true;
                    if (TextUtils.isEmpty(result.target)) {
                        aVar.b = tBUrlRuleSet.target;
                    }
                    aVar.c = tBUrlRuleSet.name;
                    aVar.d = tBUrlRuleSet.handleType;
                }
            }
            if (!result.isMatch && tBUrlRuleSet.actionAfterMiss.equals("toNext")) {
                return a(tBUrlRuleSet.successor, uri);
            }
        }
        return aVar;
    }
}
