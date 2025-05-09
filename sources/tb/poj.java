package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class poj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f26211a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("newIntentForUriName".equals(str)) {
                poj.a().edit().putBoolean("isNewIntentForUriOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isNewIntentForUriOpen", "true"))).putBoolean("isSimpleNavOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isSimpleNavOpen", "true"))).putBoolean("blockModifyDefaultTransition", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "blockModifyDefaultTransition", "true"))).putBoolean("isSimpleNavRestoreActivityNameOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isSimpleNavRestoreActivityNameOpen", "false"))).commit();
            }
        }
    }

    static {
        t2o.a(578814052);
    }

    public static /* synthetic */ SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f071a8b", new Object[0]);
        }
        return f26211a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7d267e4", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f26211a;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("blockModifyDefaultTransition", true);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("787b976e", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6859e653", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f26211a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("isSimpleNavRestoreActivityNameOpen", false);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ae46efc", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f26211a;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("isSimpleNavOpen", true);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9eeb3d", new Object[]{context});
            return;
        }
        f26211a = context.getSharedPreferences("newNav", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"newIntentForUriName"}, new a(), false);
    }
}
