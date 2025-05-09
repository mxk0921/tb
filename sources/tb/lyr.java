package tb;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lyr implements pvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final lyr f23650a = new lyr();

    static {
        t2o.a(668991558);
        t2o.a(668991557);
    }

    public static lyr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyr) ipChange.ipc$dispatch("dc5c52f7", new Object[0]);
        }
        return f23650a;
    }

    @Override // tb.pvd
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2da3d57", new Object[]{this, str});
        }
        TBBundleUrlRuleInfo a2 = o7r.a(str);
        if (a2 == null || TextUtils.isEmpty(a2.mRuleFileName)) {
            return null;
        }
        Log.e("TBSR", "getRuleFromFile=" + a2.mRuleFileName);
        return iio.j(a2.mRuleFileName);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("979a3403", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder("com.taobao.tao.shop.ruleversion.cache.key");
        if (!TextUtils.isEmpty(str)) {
            sb.append("-");
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82c02dd", new Object[]{this, str, str2})).booleanValue();
        }
        PreferenceManager.getDefaultSharedPreferences(lvr.b).edit().putString(b(str), str2).apply();
        return false;
    }

    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580db02f", new Object[]{this, str, str2})).booleanValue();
        }
        TBBundleUrlRuleInfo a2 = o7r.a(str);
        if (a2 == null || TextUtils.isEmpty(a2.mRuleFileName)) {
            return false;
        }
        return iio.q(str2, a2.mRuleFileName);
    }
}
