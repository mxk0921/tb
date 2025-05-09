package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.taobao.R;
import com.taobao.utils.Global;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEMORY_OPT_LEVEL = "memory-opt-level";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO = "screenRatio";

    static {
        t2o.a(352321686);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cc722c0", new Object[0]);
        }
        AliLoginInterface c = kq0.c();
        if (c != null) {
            return c.getUserId();
        }
        return null;
    }

    public static int b(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5a9d30d", new Object[]{context, str, str2, new Integer(i)})).intValue();
        }
        if (context != null && !TextUtils.isEmpty(str2)) {
            try {
                str2 = URLDecoder.decode(str2, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
            int k = xmo.k(context, str, str2);
            if (k != -1) {
                return k;
            }
        }
        return i;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a650b887", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.new_detail_nav_bar_height);
    }

    public static Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad82b921", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        fvo p = xmo.p(Global.getApplication());
        if (p.f19556a != -1) {
            hashMap.put("screenHeight", String.valueOf(ec7.d(Global.getApplication(), p.f19556a)));
            hashMap.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(ec7.d(Global.getApplication(), p.c)));
            hashMap.put(KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO, String.valueOf(p.d));
        } else {
            int d = ec7.d(Global.getApplication(), cxo.a(Global.getApplication()));
            int d2 = ec7.d(Global.getApplication(), cxo.b(Global.getApplication()));
            hashMap.put("screenHeight", String.valueOf(d));
            hashMap.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(d2));
            hashMap.put(KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO, String.valueOf(d2 / d));
        }
        return hashMap;
    }

    public static Map<String, String> e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9fcda103", new Object[]{aVar});
        }
        HashMap hashMap = new HashMap();
        NewDetailScreenConfig K = aVar.K();
        if (K == null) {
            return hashMap;
        }
        hashMap.put("screenHeight", String.valueOf(ec7.d(Global.getApplication(), K.c())));
        hashMap.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(ec7.d(Global.getApplication(), K.b())));
        hashMap.put(KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO, String.valueOf(K.d()));
        return hashMap;
    }

    public static boolean g() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf7f490", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        is64Bit = Process.is64Bit();
        if (is64Bit) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        if (c21.g().getInt("deviceLevel", -1) == 2) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55197d26", new Object[0])).booleanValue();
        }
        if ("0".equals(a.g0())) {
            return false;
        }
        if ("1".equals(a.g0())) {
            return !g();
        }
        if (!"2".equals(a.g0())) {
            return false;
        }
        if (!g() || h()) {
            return true;
        }
        return false;
    }

    public static int f(Context context) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
