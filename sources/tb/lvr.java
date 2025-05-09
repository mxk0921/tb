package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23598a = false;
    public static Application b;
    public static int c;

    static {
        t2o.a(668991500);
    }

    public static void b(Application application, String str, int i, Collection<TBBundleUrlRuleInfo> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e33d5c2", new Object[]{application, str, new Integer(i), collection});
        } else if (f23598a || application == null || TextUtils.isEmpty(str) || i < 0) {
            mvr.a("ShopRule init error");
        } else {
            b = application;
            c = i;
            a(collection);
            jvr.p().E(application);
            c(application);
            f23598a = true;
            mvr.a("ShopRule init success");
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e339c6bc", new Object[]{context});
        } else {
            new TBSRUrlProcessFetcher(context).g();
        }
    }

    public static void a(Collection<TBBundleUrlRuleInfo> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c56b194", new Object[]{collection});
        } else if (collection.size() <= 0) {
            mvr.a("ruleInfos is empty");
        } else {
            for (TBBundleUrlRuleInfo tBBundleUrlRuleInfo : collection) {
                myr.e().g(tBBundleUrlRuleInfo);
            }
            String[] strArr = new String[collection.size()];
            for (TBBundleUrlRuleInfo tBBundleUrlRuleInfo2 : collection) {
                strArr[0] = tBBundleUrlRuleInfo2.mBundleName;
                OrangeConfig.getInstance().getConfigs(tBBundleUrlRuleInfo2.mBundleName);
            }
            OrangeConfig.getInstance().registerListener(strArr, new nyr(strArr));
        }
    }
}
