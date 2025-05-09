package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fzu implements u9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092272);
        t2o.a(806355882);
    }

    @Override // tb.u9b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2691e843", new Object[]{this, str, obj});
        } else {
            UTABTest.activateServer(str, obj);
        }
    }

    @Override // tb.u9b
    public String b(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8970ebe", new Object[]{this, str, str2, str3, str4});
        }
        try {
            if (sbt.d()) {
                String d = d(str, str2, str3);
                if (!TextUtils.isEmpty(d)) {
                    q0h.a("UTABTestAdapter", "debug包测试逻辑 activateDebug ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + d);
                    return d;
                }
            }
            VariationSet activate = UTABTest.activate(str, str2);
            if (!(activate == null || (variation = activate.getVariation(str3)) == null)) {
                String valueAsString = variation.getValueAsString(str4);
                igq n = igq.n();
                n.r("AB", str + " " + str2 + " " + str3 + " " + str4 + " return:" + valueAsString);
                return valueAsString;
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    @Override // tb.u9b
    public String c(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f7f6c6", new Object[]{this, str, str2, str3, str4});
        }
        try {
            if (sbt.d()) {
                String d = d(str, str2, str3);
                if (!TextUtils.isEmpty(d)) {
                    q0h.a("UTABTestAdapter", "debug包测试逻辑 activateDebug ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + d);
                    return d;
                }
            }
            VariationSet activateSync = EVO.activateSync(str, str2, null, null);
            if (!(activateSync == null || (variation = activateSync.getVariation(str3)) == null)) {
                return variation.getValueAsString(str4);
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    public final String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e861e2fb", new Object[]{this, str, str2, str3});
        }
        try {
            SharedPreferences sharedPreferences = v2s.o().f().getApplication().getSharedPreferences("ab_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
