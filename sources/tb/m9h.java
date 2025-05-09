package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m9h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile SharedPreferences f23864a;

    static {
        t2o.a(503317412);
    }

    public static Object b(String str) {
        Map z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d12f52a7", new Object[]{str});
        }
        Map d = d();
        if (d == null || (z = nwv.z(d.get("ab"), null)) == null) {
            return null;
        }
        return nwv.L(z, str);
    }

    public static String c(String str, String str2) {
        Map z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf905ff8", new Object[]{str, str2});
        }
        Map d = d();
        if (d == null || (z = nwv.z(d.get(str), null)) == null) {
            return null;
        }
        return nwv.I(z.get(str2), null);
    }

    public static Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9325f897", new Object[0]);
        }
        Map z = nwv.z(e().getString("local_setting", null), null);
        if (z != null) {
            return nwv.z(z.get(BizContext.KEY_SETTING_FILTER), null);
        }
        return null;
    }

    public static SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[0]);
        }
        if (f23864a == null) {
            synchronized (m9h.class) {
                try {
                    if (f23864a == null) {
                        f23864a = o.J().getSharedPreferences("tnode_local_setting_file", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23864a;
    }

    public static void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb97bf4a", new Object[]{obj});
        } else {
            e().edit().putString("local_setting", JSON.toJSONString(obj)).apply();
        }
    }

    public static String a(String str) {
        Map z;
        List v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f80cf3a", new Object[]{str});
        }
        String str2 = "?";
        int indexOf = str.indexOf(str2);
        String substring = indexOf > 0 ? str.substring(indexOf + 1) : null;
        Map d = d();
        if (!(d == null || (z = nwv.z(d.get("tnode"), null)) == null || (v = nwv.v(z.get("dslMapper"), null)) == null)) {
            String replace = str.replace("dev.", "");
            for (int i = 0; i < v.size(); i++) {
                Object obj = v.get(i);
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    String I = nwv.I(map.get("key"), null);
                    String I2 = nwv.I(map.get("value"), null);
                    if (replace.contains(I.replace("dev.", "")) && !TextUtils.isEmpty(I2)) {
                        if (substring == null) {
                            return I2;
                        }
                        if (I2.contains(str2)) {
                            str2 = "&";
                        }
                        return I2 + str2 + substring;
                    }
                }
            }
        }
        return str;
    }
}
