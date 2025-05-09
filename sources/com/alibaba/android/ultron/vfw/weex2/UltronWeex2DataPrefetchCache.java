package com.alibaba.android.ultron.vfw.weex2;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import java.util.HashMap;
import tb.hav;
import tb.m;
import tb.m9v;
import tb.pav;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2DataPrefetchCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXPIRED_TIME = "expiredTime";
    public static final String KEY_PREFETCH_TIME_MILLIS = "prefetchTimeMillis";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, LruCache<String, JSONObject>> f2353a = new HashMap<>();
    public m9v b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum CacheType {
        VALID,
        EXPIRED,
        UNREQUESTED,
        EXCEPTION;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CacheType cacheType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/UltronWeex2DataPrefetchCache$CacheType");
        }

        public static CacheType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CacheType) ipChange.ipc$dispatch("16a0f20e", new Object[]{str});
            }
            return (CacheType) Enum.valueOf(CacheType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2354a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f2354a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                LruCache lruCache = (LruCache) UltronWeex2DataPrefetchCache.a(UltronWeex2DataPrefetchCache.this).get(this.f2354a);
                if (lruCache == null) {
                    lruCache = new LruCache(10);
                }
                String l = UltronWeex2DataPrefetchCache.b(UltronWeex2DataPrefetchCache.this).l(this.f2354a);
                if (!TextUtils.isEmpty(l)) {
                    jSONObject = JSON.parseObject(l);
                } else {
                    jSONObject = new JSONObject();
                }
                for (String str : this.b.keySet()) {
                    if (!TextUtils.isEmpty(str) && (jSONObject2 = this.b.getJSONObject(str)) != null) {
                        lruCache.put(str, jSONObject2);
                        jSONObject.put(str, (Object) jSONObject2);
                    }
                }
                UltronWeex2DataPrefetchCache.a(UltronWeex2DataPrefetchCache.this).put(this.f2354a, lruCache);
                UltronWeex2DataPrefetchCache.b(UltronWeex2DataPrefetchCache.this).s(this.f2354a, jSONObject.toString());
            } catch (Throwable th) {
                hav.d("UltronWeex2DataPrefetchCache.setCache", th.toString());
            }
        }
    }

    static {
        t2o.a(157286775);
    }

    public static /* synthetic */ HashMap a(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6a1b649", new Object[]{ultronWeex2DataPrefetchCache});
        }
        return ultronWeex2DataPrefetchCache.f2353a;
    }

    public static /* synthetic */ m9v b(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("2673c8bb", new Object[]{ultronWeex2DataPrefetchCache});
        }
        return ultronWeex2DataPrefetchCache.e();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f2353a.remove(str);
            e().b(str);
        }
    }

    public Pair<JSONObject, String> d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dffa4271", new Object[]{this, str, str2});
        }
        try {
        } catch (Throwable th) {
            hav.d("UltronWeex2DataPrefetchCache.getCache", th.toString());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Pair<JSONObject, String> g = g(str, str2);
            if (g != null && g.first != null) {
                return g;
            }
            Pair<JSONObject, String> f = f(str, str2);
            if (f != null) {
                if (f.first != null) {
                    return f;
                }
            }
            return null;
        }
        return null;
    }

    public final m9v e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("b07d407e", new Object[]{this});
        }
        m9v m9vVar = this.b;
        if (m9vVar != null) {
            return m9vVar;
        }
        Config config = new Config();
        config.walSize = 1048576;
        m9v e = m9v.e("UltronWeex2DataPrefetchCache", config);
        this.b = e;
        return e;
    }

    public final Pair<JSONObject, String> f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("165dfc8c", new Object[]{this, str, str2});
        }
        if (!e().a(str)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        String l = e().l(str);
        if (TextUtils.isEmpty(l)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        try {
            JSONObject parseObject = JSON.parseObject(l);
            if (parseObject == null) {
                return new Pair<>(null, CacheType.UNREQUESTED.name());
            }
            JSONObject jSONObject = parseObject.getJSONObject(str2);
            if (jSONObject == null) {
                return new Pair<>(null, CacheType.UNREQUESTED.name());
            }
            if (System.currentTimeMillis() - (jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS) == null ? 0L : jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS).longValue()) < (jSONObject.getLong("expiredTime") == null ? m.CONFIG_TRACK_1022_INTERVAL_TIME : jSONObject.getLong("expiredTime").longValue())) {
                return new Pair<>(jSONObject, CacheType.VALID.name());
            }
            parseObject.remove(str2);
            e().s(str, parseObject.toString());
            return new Pair<>(null, CacheType.EXPIRED.name());
        } catch (Throwable th) {
            hav.d("UltronWeex2DataPrefetchCache.getLSDBCache", th.toString());
            return new Pair<>(null, CacheType.EXCEPTION.name());
        }
    }

    public final Pair<JSONObject, String> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("560b608", new Object[]{this, str, str2});
        }
        if (!this.f2353a.containsKey(str)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        LruCache<String, JSONObject> lruCache = this.f2353a.get(str);
        if (lruCache == null) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        JSONObject jSONObject = lruCache.get(str2);
        if (jSONObject == null) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        if (System.currentTimeMillis() - (jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS) == null ? 0L : jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS).longValue()) < (jSONObject.getLong("expiredTime") == null ? m.CONFIG_TRACK_1022_INTERVAL_TIME : jSONObject.getLong("expiredTime").longValue())) {
            return new Pair<>(jSONObject, CacheType.VALID.name());
        }
        lruCache.remove(str2);
        this.f2353a.put(str, lruCache);
        return new Pair<>(null, CacheType.EXPIRED.name());
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3978579", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            j(str, str2);
            i(str, str2);
        }
    }

    public final void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f90754", new Object[]{this, str, str2});
        } else if (e().a(str)) {
            String l = e().l(str);
            if (!TextUtils.isEmpty(l)) {
                try {
                    JSONObject parseObject = JSON.parseObject(l);
                    if (parseObject != null && parseObject.containsKey(str2)) {
                        parseObject.remove(str2);
                        e().s(str, parseObject.toString());
                    }
                } catch (Throwable th) {
                    hav.d("UltronWeex2DataPrefetchCache.removeLSDBCache", th.toString());
                }
            }
        }
    }

    public final void j(String str, String str2) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1843ec6c", new Object[]{this, str, str2});
        } else if (this.f2353a.containsKey(str) && (lruCache = this.f2353a.get(str)) != null) {
            lruCache.remove(str2);
            this.f2353a.put(str, lruCache);
        }
    }

    public void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2a9e3f", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            pav.k(new a(str, jSONObject));
        }
    }
}
