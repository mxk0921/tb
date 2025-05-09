package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.info.CdnConfigModel;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class egm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18563a;
        public String b;
        public Set<String> c;

        static {
            t2o.a(790626369);
        }
    }

    static {
        t2o.a(790626368);
    }

    public final void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbae2681", new Object[]{this, set});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e != null) {
                Map<String, ?> all = e.getAll();
                SharedPreferences.Editor edit = e.edit();
                for (String str : all.keySet()) {
                    if (!TextUtils.isEmpty(str) && !"index_id_set".equals(str) && !"config_version".equals(str) && !"uri_map".equals(str) && !set.contains(str)) {
                        edit.remove(str);
                    }
                }
                edit.apply();
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.clearOldConfigs.error.", th);
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        return g(str);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eac35e18", new Object[]{this});
        }
        return g("config_version");
    }

    public Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d56beb59", new Object[]{this});
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return null;
            }
            return e.getStringSet("index_id_set", null);
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.getPopConfigIndexIds.error.", th);
            return null;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e469373", new Object[]{this});
        }
        return g("uri_map");
    }

    public final String g(String str) {
        SharedPreferences e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22fbbe02", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str) && (e = e()) != null) {
                return e.getString(str, "");
            }
            return "";
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.getValueByKey.error.", th);
            return "";
        }
    }

    public final boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a256b391", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (str.equals(str2)) {
            return false;
        }
        try {
            if (Long.parseLong(str) > Long.parseLong(str2)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            wdm.h("ConfigInfoNew.needUpdateConfigs.error", th);
            return false;
        }
    }

    public final SharedPreferences.Editor i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("88a0023e", new Object[]{this});
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return null;
            }
            return e.edit();
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.startEdit.error.", th);
            return null;
        }
    }

    public final SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        if (PopLayer.getReference() == null || PopLayer.getReference().getApp() == null) {
            return null;
        }
        return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_configs_v2", 0);
    }

    public a j(String str, CdnConfigModel cdnConfigModel) {
        SharedPreferences.Editor i;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9cf6ab9", new Object[]{this, str, cdnConfigModel});
        }
        if (cdnConfigModel == null || !cdnConfigModel.isValid() || TextUtils.isEmpty(str)) {
            return null;
        }
        String g = g("config_cdn_url");
        if (TextUtils.isEmpty(g) || !g.equals(str)) {
            z2 = true;
        }
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopNewLocalConfigManager.updateLocalConfigs.lastCdnUrl=" + g + ".newcdnUrl=" + str + ".urlChanged=" + z2);
        String str2 = cdnConfigModel.ver;
        if (!z2) {
            String c = c();
            boolean h = h(str2, c);
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopNewLocalConfigManager.updateLocalConfigs.newConfigVersion=" + str2 + ".localConfigVersion=" + c + ".needUpdateConfigs=" + h);
            z = h;
        }
        if (!z || (i = i()) == null) {
            return null;
        }
        a aVar = new a();
        i.putString("config_cdn_url", str);
        i.putString("config_version", str2);
        i.putString("uri_map", cdnConfigModel.uriMap);
        aVar.f18563a = str2;
        aVar.b = cdnConfigModel.uriMap;
        Set<String> keySet = cdnConfigModel.configs.keySet();
        i.putStringSet("index_id_set", keySet);
        aVar.c = keySet;
        for (String str3 : keySet) {
            i.putString(str3, cdnConfigModel.configs.get(str3));
        }
        i.apply();
        a(keySet);
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopNewLocalConfigManager.updateLocalConfigs.done.cdnUrl=" + str + "...newConfigVersion=" + str2 + "...uriMap=" + cdnConfigModel.uriMap);
        return aVar;
    }
}
