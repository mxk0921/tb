package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z73 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY = "utCacheKey";
    public static final String ENABLE_SAVE_PERSISTENCE = "save_persistence";
    public static final String OVERLAY_CACHE_KEY = "overlayCacheKey";

    /* renamed from: a  reason: collision with root package name */
    public static volatile LSDB f32582a = null;
    public static volatile LSDB b = null;

    static {
        t2o.a(486539727);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57896acb", new Object[0]);
            return;
        }
        eve.c("CardCache", "clearPersistenceOverlayCache");
        LSDB.removeDB("info_flow_persistence_cache");
        b = null;
        eve.b("CardCache", "clearPersistenceOverlayCache");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bb9b05", new Object[0]);
            return;
        }
        eve.c("CardCache", "clearUtLogMapCache");
        LSDB.removeDB("info_flow_cache");
        eve.b("CardCache", "clearUtLogMapCache");
    }

    public static LSDB c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("e66440c0", new Object[0]);
        }
        if (f32582a == null) {
            synchronized (z73.class) {
                try {
                    if (f32582a == null) {
                        LSDB.removeDB("info_flow_cache");
                        f32582a = LSDB.open("info_flow_cache", new Config());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32582a;
    }

    public static LSDB d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("3f0a9193", new Object[0]);
        }
        if (b == null) {
            synchronized (z73.class) {
                try {
                    if (b == null) {
                        b = LSDB.open("info_flow_persistence_cache", new Config());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void g(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        BaseSubSectionModel subSection;
        LSDB lsdb;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1beb10fc", new Object[]{baseSectionModel});
        } else if (baseSectionModel != null && (args = baseSectionModel.getArgs()) != null) {
            String string = args.getString(CACHE_KEY);
            boolean booleanValue = args.getBooleanValue(ENABLE_SAVE_PERSISTENCE);
            if (string != null && (subSection = baseSectionModel.getSubSection()) != null) {
                if (booleanValue) {
                    lsdb = d();
                } else {
                    lsdb = c();
                }
                if (lsdb != null && (jSONObject = subSection.getJSONObject("overlay")) != null) {
                    String json = jSONObject.toString();
                    String concat = OVERLAY_CACHE_KEY.concat(string);
                    if (lsdb.insertString(new k3g(concat), json)) {
                        subSection.remove("overlay");
                        subSection.put(OVERLAY_CACHE_KEY, (Object) concat);
                    }
                }
            }
        }
    }

    public static void e(BaseSectionModel<?> baseSectionModel) {
        BaseSubSectionModel subSection;
        LSDB lsdb;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef0f73", new Object[]{baseSectionModel});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (baseSectionModel != null && (subSection = baseSectionModel.getSubSection()) != null) {
            String string = subSection.getString(OVERLAY_CACHE_KEY);
            JSONObject args = baseSectionModel.getArgs();
            if (args != null) {
                z = args.getBooleanValue(ENABLE_SAVE_PERSISTENCE);
            }
            if (z) {
                lsdb = d();
            } else {
                lsdb = c();
            }
            if (lsdb != null) {
                String string2 = lsdb.getString(new k3g(string));
                long currentTimeMillis2 = System.currentTimeMillis();
                if (baseSectionModel.getSectionBizCode() == null || string2 == null || string2.isEmpty()) {
                    fve.e("CardCacheManager", "加载的缓存数据为空");
                    return;
                }
                try {
                    JSONObject parseObject = JSON.parseObject(string2);
                    if (parseObject != null) {
                        subSection.put("overlay", (Object) parseObject);
                        fve.e("CardCacheManager", "overlay db loadTime: " + (currentTimeMillis2 - currentTimeMillis));
                    }
                } catch (JSONException unused) {
                    fve.e("CardCacheManager", "over cache json parse failed");
                }
            }
        }
    }

    public static void f(BaseSectionModel<?> baseSectionModel) {
        LSDB lsdb;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf47d3ca", new Object[]{baseSectionModel});
            return;
        }
        eve.c("CardCache", "loadUtLogMapFromCache");
        if (baseSectionModel == null) {
            eve.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            eve.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        String string = args.getString(CACHE_KEY);
        if (args.getBooleanValue(ENABLE_SAVE_PERSISTENCE) && bve.r()) {
            z = true;
        }
        if (string != null) {
            if (z) {
                lsdb = d();
            } else {
                lsdb = c();
            }
            if (lsdb == null) {
                eve.b("CardCache", "loadUtLogMapFromCache");
                return;
            }
            String string2 = lsdb.getString(new k3g(string));
            if (baseSectionModel.getSectionBizCode() == null || TextUtils.isEmpty(string2)) {
                eve.b("CardCache", "loadUtLogMapFromCache");
                return;
            }
            try {
                JSON.parseObject(URLDecoder.decode(string2, "UTF-8"));
                args.put("utLogMap", (Object) string2);
            } catch (Throwable th) {
                fve.c("CardCacheManager", "utlogmap error: " + th.getMessage(), th);
            }
            eve.b("CardCache", "loadUtLogMapFromCache");
        }
    }

    public static void h(BaseSectionModel<?> baseSectionModel) {
        LSDB lsdb;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc970dc8", new Object[]{baseSectionModel});
            return;
        }
        eve.c("CardCache", "saveUtLogMapInCache");
        if (baseSectionModel == null) {
            eve.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            eve.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        String string = args.getString("utLogMap");
        String string2 = args.getString(CACHE_KEY);
        if (args.getBooleanValue(ENABLE_SAVE_PERSISTENCE) && bve.r()) {
            z = true;
        }
        if (string2 == null || string == null) {
            eve.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        if (z) {
            lsdb = d();
        } else {
            lsdb = c();
        }
        if (lsdb == null) {
            eve.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        if (lsdb.insertString(new k3g(string2), string)) {
            args.put("utLogMap", (Object) "");
        }
        eve.b("CardCache", "saveUtLogMapInCache");
    }
}
