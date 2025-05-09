package anetwork.channel.cache;

import android.text.TextUtils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CacheConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.CacheConfig";
    private String abExperiment;
    private String bizName;
    private long cacheSize;
    private final List<String> refererList = new CopyOnWriteArrayList();
    private final List<String> urlList = new CopyOnWriteArrayList();
    private final CachePrediction prediction = new CachePrediction() { // from class: anetwork.channel.cache.CacheConfig.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anetwork.channel.cache.CachePrediction
        public boolean handleCache(String str, Map<String, String> map) {
            String str2;
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fb09dede", new Object[]{this, str, map})).booleanValue();
            }
            if (map == null || map.containsKey("x-pv")) {
                return false;
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                Map.Entry<String, String> next = it.next();
                if (next != null && HttpConstant.REFERER.equalsIgnoreCase(next.getKey())) {
                    str2 = next.getValue();
                    break;
                }
            }
            if (TextUtils.isEmpty(str2) || CacheConfig.access$000(CacheConfig.this).isEmpty()) {
                z = false;
            } else {
                CacheConfig cacheConfig = CacheConfig.this;
                z = CacheConfig.access$100(cacheConfig, str2, CacheConfig.access$000(cacheConfig));
            }
            if (TextUtils.isEmpty(str) || CacheConfig.access$200(CacheConfig.this).isEmpty()) {
                z2 = false;
            } else {
                CacheConfig cacheConfig2 = CacheConfig.this;
                z2 = CacheConfig.access$100(cacheConfig2, str, CacheConfig.access$200(cacheConfig2));
            }
            return z || z2;
        }
    };

    static {
        t2o.a(607126024);
    }

    private CacheConfig() {
    }

    public static /* synthetic */ List access$000(CacheConfig cacheConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("71edb56a", new Object[]{cacheConfig});
        }
        return cacheConfig.refererList;
    }

    public static /* synthetic */ boolean access$100(CacheConfig cacheConfig, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a88ed3d", new Object[]{cacheConfig, str, list})).booleanValue();
        }
        return cacheConfig.containsKey(str, list);
    }

    public static /* synthetic */ List access$200(CacheConfig cacheConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8bc7e3a8", new Object[]{cacheConfig});
        }
        return cacheConfig.urlList;
    }

    public static CacheConfig create(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheConfig) ipChange.ipc$dispatch("15585261", new Object[]{jSONObject});
        }
        CacheConfig cacheConfig = new CacheConfig();
        try {
            cacheConfig.bizName = jSONObject.getString("biz");
            cacheConfig.cacheSize = jSONObject.getLong("size");
            cacheConfig.abExperiment = jSONObject.optString("ab");
            JSONArray optJSONArray = jSONObject.optJSONArray("referer");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        cacheConfig.refererList.add(string);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("url");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String string2 = optJSONArray2.getString(i2);
                    if (!TextUtils.isEmpty(string2)) {
                        cacheConfig.urlList.add(string2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return cacheConfig;
    }

    public String getAbExperiment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b54ffe05", new Object[]{this});
        }
        return this.abExperiment;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.bizName;
    }

    public long getCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6be5a9e8", new Object[]{this})).longValue();
        }
        return this.cacheSize;
    }

    public CachePrediction getPrediction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CachePrediction) ipChange.ipc$dispatch("f5824523", new Object[]{this});
        }
        return this.prediction;
    }

    private boolean containsKey(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efaebd46", new Object[]{this, str, list})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && list != null) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    ALog.e(TAG, "containsKey", null, "key", str, "container", list);
                    return true;
                }
            }
        }
        return false;
    }

    public static CacheConfig create(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheConfig) ipChange.ipc$dispatch("79e69125", new Object[]{str, new Long(j)});
        }
        CacheConfig cacheConfig = new CacheConfig();
        cacheConfig.bizName = str;
        cacheConfig.cacheSize = j;
        return cacheConfig;
    }
}
