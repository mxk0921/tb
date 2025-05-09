package com.alipay.mobile.intelligentdecision.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IDCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile IDCacheManager e;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f4251a;
    public final LruCache<String, JSONObject> d = new LruCache<>(9);
    public ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Object> c = new ConcurrentHashMap<>();

    public IDCacheManager(Context context) {
        this.f4251a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static IDCacheManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDCacheManager) ipChange.ipc$dispatch("2c042fab", new Object[]{context});
        }
        if (e == null) {
            synchronized (IDCacheManager.class) {
                try {
                    if (e == null) {
                        e = new IDCacheManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void a(String str, JSONObject jSONObject) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (jSONObject != null && (lruCache = this.d) != null) {
            lruCache.put(str, jSONObject);
        }
    }

    public final JSONObject a(String str) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (lruCache = this.d) != null) {
            return lruCache.get(str);
        }
        return null;
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, obj);
        }
    }
}
