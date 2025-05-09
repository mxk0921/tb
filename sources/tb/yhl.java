package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.privacyguard.config.RuleConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yhl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PGRuleManager";
    public static volatile yhl b;

    /* renamed from: a  reason: collision with root package name */
    public RuleConfig f32101a = new RuleConfig();

    static {
        t2o.a(757071883);
    }

    public static yhl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yhl) ipChange.ipc$dispatch("9189e447", new Object[0]);
        }
        if (b == null) {
            synchronized (yhl.class) {
                try {
                    if (b == null) {
                        b = new yhl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public RuleConfig b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleConfig) ipChange.ipc$dispatch("d7e2e6af", new Object[]{this});
        }
        return this.f32101a;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d026d9bf", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "updateRules: jsonRules is null!");
        } else {
            try {
                this.f32101a = (RuleConfig) JSON.toJavaObject(JSON.parseObject(str), RuleConfig.class);
            } catch (Throwable th) {
                Log.e(TAG, "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            StringBuilder sb = new StringBuilder("updateRules: update rules success, rules : [");
            sb.append(str);
            sb.append("] ");
        }
    }
}
