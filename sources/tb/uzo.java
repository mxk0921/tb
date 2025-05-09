package tb;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.share.ShareEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uzo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAVORITE_SDK_FILTER = "FavoriteSdkFilter";
    public static final String FAV_CONTENT_BLACKLIST = "content_fav_url_param_blacklist";
    public static final String FAV_ORANGE_INVALID_TIME = "FavListInvalidTime";
    public static final String FAV_ORANGE_IS_FAV_CACHE_RIGHT_USER = "IsFavCacheRightUser";
    public static final String FAV_ORANGE_IS_FAV_HIT_MODE_RIGHT_USER = "IsFavHitModeRightUser";
    public static final String FAV_ORANGE_IS_FAV_RIGHT_USER = "IsFavRightUser";
    public static final String FAV_ORANGE_IS_USE_COLLECTIONS_IDS_RIGHT_USER = "IsUseCollectionIdsRightUser";
    public static final String FAV_SDK_GROUPS = "favorite_sdk";

    /* renamed from: a  reason: collision with root package name */
    public static String f29701a = null;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "enableFavSdkKmp", null);
            TLog.loge("favoritesdk", "orange回调 enableFavSdkKmp=" + config);
            if (!TextUtils.isEmpty(config)) {
                PreferenceManager.getDefaultSharedPreferences(ShareEnv.getApplication()).edit().putString("enableFavSdkKmp", config).apply();
            }
        }
    }

    static {
        t2o.a(463470639);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23b5b03", new Object[0]);
            return;
        }
        TLog.loge("favoritesdk", "enableFavSdkKmp orange为空");
        if (!b) {
            b = true;
            OrangeConfig.getInstance().registerListener(new String[]{"android_share_bizconfig"}, new a());
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f882314b", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("favorite_sdk", FAVORITE_SDK_FILTER, "");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a8842a6", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41b09ee8", new Object[0])).booleanValue();
        }
        String str = f29701a;
        if (str != null) {
            return "true".equals(str);
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "enableFavSdkKmp", null);
        if (config != null) {
            TLog.loge("favoritesdk", "enableFavSdkKmp orange不为空".concat(config));
            f29701a = config;
            PreferenceManager.getDefaultSharedPreferences(ShareEnv.getApplication()).edit().putString("enableFavSdkKmp", config).apply();
            return "true".equals(config);
        }
        String string = PreferenceManager.getDefaultSharedPreferences(ShareEnv.getApplication()).getString("enableFavSdkKmp", "true");
        a();
        f29701a = string;
        return "true".equals(string);
    }
}
