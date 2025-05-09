package com.ut.mini;

import com.alibaba.analytics.AnalyticsMgr;
import tb.c2v;
import tb.g1v;
import tb.hsq;
import tb.nhh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTHitBuilders$UTControlHitBuilder extends g1v {
    static {
        t2o.a(962593159);
    }

    public UTHitBuilders$UTControlHitBuilder(String str) {
        if (!hsq.f(str)) {
            String currentPageName = c2v.getInstance().getCurrentPageName();
            if (!hsq.f(currentPageName)) {
                super.setProperty(g1v.FIELD_PAGE, currentPageName);
                super.setProperty(g1v.FIELD_EVENT_ID, "2101");
                super.setProperty(g1v.FIELD_ARG1, currentPageName + "_" + str);
            } else if (!AnalyticsMgr.r) {
                nhh.i("Please call in at PageAppear and PageDisAppear.", new Object[0]);
            } else {
                throw new IllegalArgumentException("Please call in at PageAppear and PageDisAppear.");
            }
        } else if (!AnalyticsMgr.r) {
            nhh.i("Control name can not be empty.", new Object[0]);
        } else {
            throw new IllegalArgumentException("Control name can not be empty.");
        }
    }

    public UTHitBuilders$UTControlHitBuilder(String str, String str2) {
        if (hsq.f(str2)) {
            if (!AnalyticsMgr.r) {
                nhh.i("Control name can not be empty.", new Object[0]);
                return;
            }
            throw new IllegalArgumentException("Control name can not be empty.");
        } else if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_PAGE, str);
            super.setProperty(g1v.FIELD_EVENT_ID, "2101");
            super.setProperty(g1v.FIELD_ARG1, str + "_" + str2);
        } else if (!AnalyticsMgr.r) {
            nhh.i("Page name can not be empty.", new Object[0]);
        } else {
            throw new IllegalArgumentException("Page name can not be empty.");
        }
    }
}
