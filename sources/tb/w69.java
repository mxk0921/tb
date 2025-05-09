package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w69 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FOREIGN_SKIN_CODE = "foreignSkinCode";
    public static final String SP_KEY_ENABLE_MTOP = "enableMtop";
    public static final String SP_KEY_SKIN_DOWNGRADE = "skinDowngrade";

    /* renamed from: a  reason: collision with root package name */
    public static volatile SharedPreferences f30482a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            SharedPreferences.Editor edit = w69.a().edit();
            edit.putString(w69.SP_KEY_ENABLE_MTOP, w69.c(w69.SP_KEY_ENABLE_MTOP, "false"));
            edit.putBoolean("enableFestival", Boolean.parseBoolean(w69.c("enableFestival", "false")));
            edit.putString(w69.SP_KEY_SKIN_DOWNGRADE, w69.c(w69.SP_KEY_SKIN_DOWNGRADE, ""));
            edit.apply();
        }
    }

    static {
        t2o.a(464519173);
        OrangeConfig.getInstance().registerListener(new String[]{"festivalskin_switch"}, new a(), true);
    }

    public static /* synthetic */ SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f071a8b", new Object[0]);
        }
        return g();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return g().getString(str, str2);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e98fa15", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("festivalskin_switch", str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2925f45a", new Object[]{new Integer(i)})).intValue();
        }
        String c = c("skinMaxSize", String.valueOf(i));
        if (TextUtils.isEmpty(c)) {
            return i;
        }
        try {
            int intValue = Integer.valueOf(c).intValue();
            if (intValue > 5) {
                return 5;
            }
            return intValue;
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbced451", new Object[0])).longValue();
        }
        String c = c("festivalRequestInterval", "-1");
        if (TextUtils.isEmpty(c)) {
            return -1L;
        }
        try {
            return Long.valueOf(c).longValue();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("296f7877", new Object[0]);
        }
        return g().getString(SP_KEY_SKIN_DOWNGRADE, "");
    }

    public static SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[0]);
        }
        if (f30482a == null) {
            synchronized (w69.class) {
                try {
                    if (f30482a == null) {
                        f30482a = Globals.getApplication().getSharedPreferences("festivalSP", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30482a;
    }
}
