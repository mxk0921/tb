package tb;

import android.text.TextUtils;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class um2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944555);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0eed141", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && i > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = digest[i2];
                }
                return new BigInteger(1, bArr).mod(BigInteger.valueOf(i)).intValue();
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[0]);
        }
        try {
            return Login.getNick();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean d(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ab68e5", new Object[]{new Integer(i), new Integer(i2), str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && i > 0 && i2 > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = digest[i3];
                }
                if (Math.abs(new BigInteger(1, bArr).intValue()) % i2 < i) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean e(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b8bb8e", new Object[]{new Integer(i), new Integer(i2), str})).booleanValue();
        }
        return d(i, i2, kzo.c().j() + str);
    }

    public static boolean f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61bcfe78", new Object[]{str, str2})).booleanValue();
        }
        try {
            String[] split = str.split(":");
            return e(Integer.parseInt(split[0]), Integer.parseInt(split[1]), str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa73859", new Object[]{jSONObject, str})).booleanValue();
        }
        Object opt = jSONObject.opt("l");
        Object opt2 = jSONObject.opt(o.b);
        Object opt3 = jSONObject.opt("r");
        if (opt == null || opt2 == null || opt3 == null) {
            return false;
        }
        if (opt2.equals("&") || opt2.equals("|")) {
            boolean b = opt.getClass() == JSONObject.class ? b((JSONObject) opt, str) : false;
            boolean b2 = opt3.getClass() == JSONObject.class ? b((JSONObject) opt3, str) : false;
            return opt2.equals("&") ? b && b2 : b || b2;
        }
        if (opt.getClass().equals(String.class) && opt.equals("app_ver") && opt3.getClass().equals(String.class)) {
            long d = prl.d(str, 0);
            String str2 = (String) opt3;
            long d2 = prl.d(str2, 0);
            if ("=".equals(opt2)) {
                if (d == d2) {
                    return true;
                }
            } else if (">".equals(opt2)) {
                if (d > d2) {
                    return true;
                }
            } else if ("<".equals(opt2)) {
                if (d < d2) {
                    return true;
                }
            } else if (">=".equals(opt2)) {
                if (d >= d2) {
                    return true;
                }
            } else if ("<=".equals(opt2)) {
                if (d <= d2) {
                    return true;
                }
            } else if ("~=".equals(opt2)) {
                if (str.startsWith(str2)) {
                    return true;
                }
            } else if ("!=".equals(opt2)) {
                if (d != d2) {
                    return true;
                }
            } else if ("!~".equals(opt2) && !str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
