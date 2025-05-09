package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25192a = "shop";
    public static final String b = "huichang";
    public static final ConcurrentHashMap<String, TBBundleUrlRuleInfo> c = new ConcurrentHashMap<>();

    public static TBBundleUrlRuleInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBBundleUrlRuleInfo) ipChange.ipc$dispatch("5bb2b96a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c.get(str);
    }

    public static Collection<TBBundleUrlRuleInfo> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("ba2fa318", new Object[0]);
        }
        return c.values();
    }

    public static boolean c(TBBundleUrlRuleInfo tBBundleUrlRuleInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a537a1", new Object[]{tBBundleUrlRuleInfo})).booleanValue();
        }
        if (tBBundleUrlRuleInfo == null || TextUtils.isEmpty(tBBundleUrlRuleInfo.mBundleName)) {
            return false;
        }
        c.put(tBBundleUrlRuleInfo.mBundleName, tBBundleUrlRuleInfo);
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790489d9", new Object[0])).booleanValue();
        }
        TBBundleUrlRuleInfo tBBundleUrlRuleInfo = new TBBundleUrlRuleInfo();
        tBBundleUrlRuleInfo.mBundleName = f25192a;
        tBBundleUrlRuleInfo.mRuleFileName = "shop-rule-5.3.json";
        Log.e("TBShopInit", "shop-rule-5.3.json");
        tBBundleUrlRuleInfo.mBaseLineVersion = "5.2";
        tBBundleUrlRuleInfo.mFirstBitVersion = 5;
        tBBundleUrlRuleInfo.mSecBitVersion = 2;
        return c(tBBundleUrlRuleInfo);
    }

    static {
        t2o.a(668991544);
    }
}
