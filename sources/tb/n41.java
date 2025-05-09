package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SymbolExpUtil;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.cache.domain.AppConfigDo;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class n41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c = "";
    public static n41 d;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ApiCacheDo> f24495a = new ConcurrentHashMap<>();
    public Set<String> b = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24496a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f24496a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (TextUtils.isEmpty(n41.a())) {
                    n41.b(this.f24496a.getExternalFilesDir(null).getAbsoluteFile() + "/mtop");
                }
                MtopUtils.writeObject(n41.this.f24495a, new File(n41.a()), "apiCacheConf");
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.AppConfigManager", this.b, "[storeApiCacheDoMap] save apiCacheConf succeed.");
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.AppConfigManager", this.b, "[storeApiCacheDoMap] save apiCacheConf error.", e);
            }
        }
    }

    static {
        t2o.a(589299804);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        c = str;
        return str;
    }

    public static n41 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n41) ipChange.ipc$dispatch("c775e569", new Object[0]);
        }
        if (d == null) {
            synchronized (n41.class) {
                try {
                    if (d == null) {
                        d = new n41();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void c(String str, ApiCacheDo apiCacheDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1878a6e9", new Object[]{this, str, apiCacheDo});
        } else if (!StringUtils.isBlank(str) && apiCacheDo != null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.AppConfigManager", "[addApiCacheDoToGroup] apiCacheDo:" + apiCacheDo);
            }
            this.f24495a.put(str, apiCacheDo);
        }
    }

    public ApiCacheDo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiCacheDo) ipChange.ipc$dispatch("49bdde4e", new Object[]{this, str});
        }
        if (StringUtils.isBlank(str)) {
            return null;
        }
        return this.f24495a.get(str);
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3572fd1", new Object[]{this, str})).booleanValue();
        }
        return this.b.contains(str);
    }

    public boolean g(String str, String str2) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f1d6f", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("clientCache");
            if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("clientCacheAppConfList")) == null) {
                return false;
            }
            for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("api");
                    String optString2 = optJSONObject2.optString("v");
                    String optString3 = optJSONObject2.optString(pg1.ATOM_EXT_block);
                    String concatStr2LowerCase = StringUtils.concatStr2LowerCase(optString, optString2);
                    ApiCacheDo d2 = e().d(concatStr2LowerCase);
                    if (d2 != null) {
                        d2.blockName = optString3;
                    } else {
                        e().c(concatStr2LowerCase, new ApiCacheDo(optString, optString2, optString3));
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject(mh1.PRICE_UNIT);
            if (!(optJSONObject3 == null || (optJSONArray2 = optJSONObject3.optJSONArray("tradeUnitApiList")) == null)) {
                HashSet hashSet = new HashSet();
                for (int length2 = optJSONArray2.length() - 1; length2 >= 0; length2--) {
                    JSONObject optJSONObject4 = optJSONArray2.optJSONObject(length2);
                    if (optJSONObject4 != null) {
                        hashSet.add(StringUtils.concatStr2LowerCase(optJSONObject4.optString("api"), optJSONObject4.optString("v")));
                    }
                }
                this.b = hashSet;
            }
            return true;
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AppConfigManager", str2, "[parseAppConfig]parse appConf node error.", e);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void h(String str, ApiCacheDo apiCacheDo) {
        String[] split;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a6b3f4", new Object[]{this, str, apiCacheDo});
        } else if (str != null && apiCacheDo != null) {
            for (String str2 : str.split(",")) {
                try {
                    if (HttpHeaderConstant.OFFLINE_FLAG_ON.equalsIgnoreCase(str2)) {
                        apiCacheDo.offline = true;
                    } else if (HttpHeaderConstant.PRIVATE_FLAG_FALSE.equalsIgnoreCase(str2)) {
                        apiCacheDo.privateScope = false;
                    } else if (str2.contains("kt=")) {
                        String substring = str2.substring(3);
                        switch (substring.hashCode()) {
                            case 64897:
                                if (substring.equals("ALL")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 69104:
                                if (substring.equals(ApiCacheDo.CacheKeyType.EXC)) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 72638:
                                if (substring.equals(ApiCacheDo.CacheKeyType.INC)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2402104:
                                if (substring.equals("NONE")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            apiCacheDo.cacheKeyType = "ALL";
                        } else if (c2 == 1) {
                            apiCacheDo.cacheKeyType = "NONE";
                        } else if (c2 == 2) {
                            apiCacheDo.cacheKeyType = ApiCacheDo.CacheKeyType.INC;
                        } else if (c2 == 3) {
                            apiCacheDo.cacheKeyType = ApiCacheDo.CacheKeyType.EXC;
                        }
                    } else {
                        if (str2.contains("ks=")) {
                            apiCacheDo.cacheKeyItems = Arrays.asList(str2.substring(3).split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                        }
                        apiCacheDo.cacheControlHeader = str;
                    }
                } catch (Exception unused) {
                    TBSdkLog.w("mtopsdk.AppConfigManager", "[parseCacheControlHeader] parse item in CacheControlHeader error.item =" + str2 + ",CacheControlHeader=" + str);
                }
            }
        }
    }

    public void i(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04f3ff4", new Object[]{this, mtopConfig});
        } else if (mtopConfig != null) {
            try {
                File file = new File(mtopConfig.context.getExternalFilesDir(null).getAbsoluteFile() + "/mtop");
                AppConfigDo appConfigDo = (AppConfigDo) MtopUtils.readObject(file, "appConf");
                if (appConfigDo != null && StringUtils.isNotBlank(appConfigDo.appConf) && appConfigDo.appConfigVersion > mtopConfig.xAppConfigVersion) {
                    synchronized (mtopConfig.lock) {
                        if (appConfigDo.appConfigVersion > mtopConfig.xAppConfigVersion && e().g(appConfigDo.appConf, "")) {
                            mtopConfig.xAppConfigVersion = appConfigDo.appConfigVersion;
                            TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] reload appConf succeed. appConfVersion=" + mtopConfig.xAppConfigVersion);
                        }
                    }
                }
                Map map = (Map) MtopUtils.readObject(file, "apiCacheConf");
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        ApiCacheDo apiCacheDo = (ApiCacheDo) entry.getValue();
                        ApiCacheDo apiCacheDo2 = this.f24495a.get(str);
                        if (apiCacheDo2 == null) {
                            this.f24495a.put(str, apiCacheDo);
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] add apiCacheDo config,apiKey=" + str);
                            }
                        } else if (!apiCacheDo2.equals(apiCacheDo)) {
                            apiCacheDo2.cacheControlHeader = apiCacheDo.cacheControlHeader;
                            apiCacheDo2.privateScope = apiCacheDo.privateScope;
                            apiCacheDo2.offline = apiCacheDo.offline;
                            apiCacheDo2.cacheKeyType = apiCacheDo.cacheKeyType;
                            apiCacheDo2.cacheKeyItems = apiCacheDo.cacheKeyItems;
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] update apiCacheDo config,apiKey=" + str);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                TBSdkLog.e("mtopsdk.AppConfigManager", "[reloadAppConfig] reload appConf file error.");
            }
        }
    }

    public void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d06dae3", new Object[]{this, context, str});
        } else {
            MtopSDKThreadPoolExecutorFactory.submit(new a(context, str));
        }
    }
}
