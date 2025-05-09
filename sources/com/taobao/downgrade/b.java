package com.taobao.downgrade;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import tb.t81;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static DowngradeStrategy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("5d82c190", new Object[0]);
        }
        int q = t81.q();
        DowngradeStrategy.b bVar = new DowngradeStrategy.b();
        bVar.g("normal");
        if (q == 1) {
            bVar.h(a.TACTICS_PERFORMANCE_PART_DEGRADE);
        } else if (q != 2) {
            bVar.h("normal");
        } else {
            bVar.h("degrade");
        }
        return bVar.e();
    }

    public static DowngradeStrategy b(DefaultRule defaultRule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("7a2d3269", new Object[]{defaultRule, str});
        }
        return a.e(defaultRule, str);
    }

    public static DowngradeStrategy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("51eff653", new Object[0]);
        }
        return new DowngradeStrategy.b().g("normal").h("normal").e();
    }

    public static DowngradeStrategy d(BusinessRule businessRule, DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("29df0d2b", new Object[]{businessRule, defaultRule});
        }
        return a.k(businessRule, defaultRule);
    }
}
