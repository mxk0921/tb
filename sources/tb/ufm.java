package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ufm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626367);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef8ac7e", new Object[]{this});
            return;
        }
        try {
            SharedPreferences c = c();
            if (c != null) {
                String string = c.getString("poplayer_config", "");
                if (!TextUtils.isEmpty(string)) {
                    List asList = Arrays.asList(string.split(","));
                    Map<String, ?> all = c.getAll();
                    SharedPreferences.Editor edit = c.edit();
                    for (String str : all.keySet()) {
                        if (!TextUtils.isEmpty(str) && !"poplayer_config".equals(str) && !"orange_version".equals(str) && !asList.contains(str)) {
                            edit.remove(str);
                        }
                    }
                    edit.apply();
                }
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.clearOldConfigs.error.", th);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaa1a704", new Object[]{this});
        }
        try {
            SharedPreferences c = c();
            if (c == null) {
                return "";
            }
            return c.getString("orange_version", "");
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.getLocalOrangeVersion.error.", th);
            return "";
        }
    }

    public String d(String str) {
        SharedPreferences c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6699150", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str) && (c = c()) != null) {
                return c.getString(str, "");
            }
            return "";
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.getValueByOrangeKey.error.", th);
            return "";
        }
    }

    public final void e(String str, String str2) {
        SharedPreferences c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa59cbf", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (c = c()) != null) {
                c.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.putPopConfig.error.", th);
        }
    }

    public final void f(String str, String str2) {
        SharedPreferences c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedd6b65", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && (c = c()) != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.putString("poplayer_config", str);
                edit.putString("orange_version", str2);
                edit.apply();
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.putPopConfigIndexIds.error.", th);
        }
    }

    public final SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        if (PopLayer.getReference() == null || PopLayer.getReference().getApp() == null) {
            return null;
        }
        return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_configs", 0);
    }

    public boolean g(String str, String str2, String str3) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1470958", new Object[]{this, str, str2, str3})).booleanValue();
        }
        String d = d("orange_version");
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopConfigLocalManager.updateLocalConfigs.orangeVersion=" + str3 + ".localOrangeVersion=" + d);
        try {
            if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(str3)) {
                boolean equals = str3.equals(d);
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopConfigLocalManager.updateLocalConfigs.orangeVersionSame=" + equals);
                if (equals) {
                    return false;
                }
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.parseOrangeVersionUpdated.error.", th);
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        f(config, str3);
        for (String str4 : config.split(",")) {
            e(str4, OrangeConfig.getInstance().getConfig(str, str4, ""));
        }
        a();
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopConfigLocalManager.updateLocalConfigs.done");
        return true;
    }
}
