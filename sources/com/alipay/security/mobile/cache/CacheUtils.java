package com.alipay.security.mobile.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CacheUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_SHARED_PREFERENCE_DK = "iotauth_digital_key_cache";
    public static final String APP_SHARED_PREFERENCE_NAME = "iotauth_common_cache";
    public static Map<String, CacheUtils> allInstance = new HashMap();
    public static Context appContext;
    private SharedPreferences appSharePref;
    private Object localDatalock;
    private HashMap<String, Object> mLocalDatas;

    public CacheUtils() {
        Object obj = new Object();
        this.localDatalock = obj;
        synchronized (obj) {
            try {
                if (this.mLocalDatas == null) {
                    this.mLocalDatas = new HashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static CacheUtils getInstance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CacheUtils) ipChange.ipc$dispatch("d1da5796", new Object[]{context}) : getInstance(context, APP_SHARED_PREFERENCE_NAME);
    }

    public <T> void addToLocalData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e469fc", new Object[]{this, t});
        } else if (t != null) {
            this.mLocalDatas.put(t.getClass().getCanonicalName(), t);
        }
    }

    public <T> T getLocalData(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("abc8f41b", new Object[]{this, cls});
        }
        if (cls == null) {
            return null;
        }
        T t = (T) this.mLocalDatas.get(cls.getCanonicalName());
        if (t != null) {
            return t;
        }
        T t2 = (T) pullFromPref(cls);
        if (t2 == null) {
            return t2;
        }
        addToLocalData(t2);
        return t2;
    }

    public <T> T pullFromPref(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6f631d2e", new Object[]{this, cls});
        }
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        this.appSharePref = sharedPreferences;
        String string = sharedPreferences.getString(cls.getCanonicalName(), "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (T) JSON.parseObject(string, cls);
    }

    public <T> void pushToPref(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68c59b", new Object[]{this, t});
            return;
        }
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        this.appSharePref = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(t.getClass().getCanonicalName(), JSON.toJSONString(t));
        edit.apply();
    }

    public static synchronized CacheUtils getInstance(Context context, String str) {
        synchronized (CacheUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CacheUtils) ipChange.ipc$dispatch("cf5728e0", new Object[]{context, str});
            }
            if (!allInstance.containsKey(str)) {
                allInstance.put(str, new CacheUtils());
            }
            if (appContext == null) {
                appContext = context.getApplicationContext();
            }
            return allInstance.get(str);
        }
    }

    public void addToLocalData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de56734", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            this.mLocalDatas.put(str, str2);
        }
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.mLocalDatas.clear();
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        this.appSharePref = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.apply();
    }

    public String getLocalData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68833650", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) this.mLocalDatas.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String pullFromPref = pullFromPref(str);
        if (pullFromPref == null) {
            return pullFromPref;
        }
        addToLocalData(str, pullFromPref);
        return pullFromPref;
    }

    public String pullFromPref(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("182e2f9d", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        this.appSharePref = sharedPreferences;
        return sharedPreferences.getString(str, "");
    }

    public void pushToPref(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efbb913", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences sharedPreferences = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        this.appSharePref = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
