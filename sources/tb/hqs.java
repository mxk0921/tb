package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.LowPriceFragment;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hqs implements hvd, jpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f20829a = 0;
    public fs0 b;

    static {
        t2o.a(1032847373);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bd849d", new Object[0]);
            return;
        }
        hqs hqsVar = new hqs();
        a.h(hqsVar);
        a.g(hqsVar);
        if ("1".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "openNavigationExposuredOpt", "1"))) {
            hqsVar.a();
        }
    }

    @Override // tb.jpj
    public void a() {
        fs0 fs0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f207b1", new Object[]{this});
        } else if (s74.b() && System.currentTimeMillis() - this.f20829a >= 3000) {
            this.f20829a = System.currentTimeMillis();
            try {
                IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);
                String str = "";
                if (iEdlpTabBarActionButtonProvider != null) {
                    str = iEdlpTabBarActionButtonProvider.a().toString();
                    fs0Var = iEdlpTabBarActionButtonProvider.b();
                } else {
                    fs0Var = b();
                }
                if (fs0Var == null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("alien_type", str);
                    jSONObject.put("spm", "a2141.1.tabbar.edlp_backup");
                    jSONObject.put("scm", "1007.tabbar.edlp.backup");
                    TBS.Ext.commitEvent("Page_TabVC", 2201, "Page_TabVC_Show-EDLP", null, null, v4v.b(jSONObject));
                    return;
                }
                String optString = fs0Var.p.optString("page");
                int optInt = fs0Var.p.optInt("eventId");
                String optString2 = fs0Var.p.optString("arg1");
                JSONObject optJSONObject = fs0Var.p.optJSONObject("args");
                if (optJSONObject != null) {
                    optJSONObject.put("alien_type", str);
                    TBS.Ext.commitEvent(optString, optInt, optString2, null, null, v4v.b(optJSONObject));
                }
            } catch (Throwable th) {
                TLog.loge("tab3edlp", "onNavigationExposured error " + Log.getStackTraceString(th));
            }
        }
    }

    public final fs0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("c5c4f798", new Object[]{this});
        }
        if (this.b == null) {
            this.b = es0.b(Login.getUserId());
        }
        return this.b;
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        String str2;
        fs0 fs0Var;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
        } else if (TextUtils.equals(str, a68.TAG)) {
            long currentTimeMillis = System.currentTimeMillis();
            Fragment currentFragment = a.o().getCurrentFragment();
            if (currentFragment instanceof LowPriceFragment) {
                try {
                    LowPriceFragment lowPriceFragment = (LowPriceFragment) currentFragment;
                    lowPriceFragment.setTabClickTime(currentTimeMillis);
                    lowPriceFragment.p2((Activity) a.o().getContext());
                    IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);
                    if (iEdlpTabBarActionButtonProvider != null) {
                        str2 = iEdlpTabBarActionButtonProvider.a().toString();
                        fs0Var = iEdlpTabBarActionButtonProvider.b();
                    } else {
                        fs0Var = b();
                        str2 = null;
                    }
                    if (fbl.f()) {
                        v4v.c(fs0Var);
                    }
                    if (!(fs0Var == null || (jSONObject = fs0Var.o) == null)) {
                        String optString = jSONObject.optString("page");
                        int optInt = fs0Var.o.optInt("eventId");
                        String optString2 = fs0Var.o.optString("arg1");
                        JSONObject optJSONObject = fs0Var.o.optJSONObject("args");
                        if (optJSONObject != null) {
                            optJSONObject.put("alien_type", str2);
                            TBS.Ext.commitEvent(optString, optInt, optString2, null, null, v4v.b(optJSONObject));
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("alien_type", str2);
                    jSONObject2.put("spm", "a2141.1.tabbar.edlp_backup");
                    jSONObject2.put("scm", "1007.tabbar.edlp.backup");
                    TBS.Ext.commitEvent("Page_TabVC", 2101, "Page_TabVC_Button-EDLP", null, null, v4v.b(jSONObject2));
                } catch (Throwable th) {
                    TLog.loge("tab3edlp", "onTabChanged error " + Log.getStackTraceString(th));
                }
            }
        }
    }
}
