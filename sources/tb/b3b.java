package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b3b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.pageUtils";
    public static String b;

    static {
        t2o.a(473956397);
        ImageStrategyConfig.v("home", 5111).a();
        ImageStrategyConfig.v("home", 5112).a();
        new ConcurrentHashMap(8);
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37198c60", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null) {
            return "0";
        }
        return jSONObject2.getString("dataFlag");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[0]);
        }
        if (TextUtils.isEmpty(b)) {
            PositionInfo c = kbq.c(Globals.getApplication());
            if (o78.CHINA_MAINLAND.equalsIgnoreCase(c.editionCode)) {
                b = "main";
            } else if ("CUN".equalsIgnoreCase(c.editionCode)) {
                b = i2b.HOMEPAGE_CTAO;
            } else if ("OLD".equalsIgnoreCase(c.editionCode)) {
                b = "old";
            } else {
                b = i2b.HOMEPAGE_HTAO;
            }
        }
        return b;
    }

    public static String d(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ebf7644", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : messageDigest.digest()) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return d(instance);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("207ac0ef", new Object[]{str})).booleanValue();
        }
        return !"1".equals(str);
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b846cb", new Object[]{str});
        } else {
            b = str;
        }
    }
}
