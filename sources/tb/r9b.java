package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Map<String, Map<String, String>> f27208a = new ConcurrentHashMap();
    public static volatile Map<String, String> b = new ConcurrentHashMap();
    public static volatile Language c = Language.SIMPLIFIED_CHINESE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else if (language != null) {
                OLog.i("LanguageUtil", "Locale onChange", LoggingSPCache.STORAGE_LANGUAGE, language, r4p.KEY_EDITION_CODE, str);
                if (r9b.a() != language) {
                    r9b.c().clear();
                    r9b.d().clear();
                    r9b.b(language);
                }
            }
        }
    }

    public static /* synthetic */ Language a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("fe1c1e0", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Language b(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("e33da509", new Object[]{language});
        }
        c = language;
        return language;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return f27208a;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return b;
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08a7ef3", new Object[]{str, str2});
        } else if (NameSpaceDO.TYPE_STANDARD.equals(str2)) {
            ((ConcurrentHashMap) f27208a).remove(str);
        } else if ("CUSTOM".equals(str2)) {
            ((ConcurrentHashMap) b).remove(str);
        }
    }

    public static Map<String, String> f(Map<String, String> map, String str, dy4 dy4Var, hf4 hf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a39c1bf", new Object[]{map, str, dy4Var, hf4Var});
        }
        try {
            if (Localization.o() && i(map, str)) {
                if (((ConcurrentHashMap) f27208a).get(str) != null) {
                    return (Map) ((ConcurrentHashMap) f27208a).get(str);
                }
                JSONObject h = h(dy4Var, hf4Var, str);
                if (h == null) {
                    return map;
                }
                HashMap hashMap = new HashMap(map);
                for (String str2 : h.keySet()) {
                    hashMap.put(str2, h.getString(str2));
                }
                ((ConcurrentHashMap) f27208a).put(str, hashMap);
                return hashMap;
            }
            return map;
        } catch (Throwable th) {
            OLog.e("LanguageUtil", "getI18nConfigsMap fail", th, new Object[0]);
            return map;
        }
    }

    public static String g(String str, String str2, dy4 dy4Var, hf4 hf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af17e3d", new Object[]{str, str2, dy4Var, hf4Var});
        }
        try {
            if (Localization.o() && i(str, str2)) {
                if (((ConcurrentHashMap) b).get(str2) != null) {
                    return (String) ((ConcurrentHashMap) b).get(str2);
                }
                JSONObject h = h(dy4Var, hf4Var, str2);
                if (h == null) {
                    return str;
                }
                String json = h.toString();
                ((ConcurrentHashMap) b).put(str2, json);
                return json;
            }
            return str;
        } catch (Throwable th) {
            OLog.e("LanguageUtil", "getI18nCustomConfig fail", th, new Object[0]);
            return null;
        }
    }

    public static JSONObject h(dy4 dy4Var, hf4 hf4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6b33b05", new Object[]{dy4Var, hf4Var, str});
        }
        if (!(dy4Var == null || hf4Var == null)) {
            ConfigDO configDO = dy4Var.c().get(str);
            if (configDO == null || configDO.isExpired.get()) {
                configDO = hf4Var.g().get(str);
            }
            if (!(configDO == null || configDO.scenes == null)) {
                try {
                    c = Localization.h();
                    return configDO.scenes.getJSONObject(c.getTag());
                } catch (Throwable th) {
                    OLog.e("LanguageUtil", "getI18nObject fail", th, new Object[0]);
                }
            }
        }
        return null;
    }

    public static <T> boolean i(T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767aa3b", new Object[]{t, str})).booleanValue();
        }
        if (t == null || str == null || ((Integer) jno.a(com.taobao.orange.a.g, OConstant.SYSKEY_ENABLE_I18n, 1)).intValue() == 0) {
            return false;
        }
        return true;
    }

    static {
        t2o.a(613417113);
        try {
            Localization.a(new a());
        } catch (Throwable th) {
            OLog.e("LanguageUtil", "register LocaleChangeListener fail", th, new Object[0]);
        }
    }
}
