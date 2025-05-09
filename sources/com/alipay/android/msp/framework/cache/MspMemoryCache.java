package com.alipay.android.msp.framework.cache;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspMemoryCache implements ICache<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, String> f3592a = new LruCache<String, String>(100000) { // from class: com.alipay.android.msp.framework.cache.MspMemoryCache.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/cache/MspMemoryCache$1");
        }

        public void entryRemoved(boolean z, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91c088fd", new Object[]{this, new Boolean(z), str, str2, str3});
            } else if (z && MspMemoryCache.access$000(MspMemoryCache.this) != null) {
                MspMemoryCache.access$000(MspMemoryCache.this).handleEvictEntry(str, str2);
            }
        }

        public int sizeOf(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4b317c6", new Object[]{this, str, str2})).intValue() : str2.getBytes().length;
        }
    };
    public EvictedListener b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EvictedListener {
        void handleEvictEntry(String str, String str2);
    }

    public static /* synthetic */ EvictedListener access$000(MspMemoryCache mspMemoryCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EvictedListener) ipChange.ipc$dispatch("c1965e81", new Object[]{mspMemoryCache});
        }
        return mspMemoryCache.b;
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f3592a.evictAll();
        }
    }

    public String getTwoLevel(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dcf2000", new Object[]{this, str, strArr});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f3592a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (strArr == null || strArr.length == 0) {
            return parseObject.toJSONString();
        }
        if (parseObject == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str3 : strArr) {
            jSONObject.put(str3, (Object) parseObject.getString(str3));
        }
        return jSONObject.toJSONString();
    }

    public boolean hasEvictedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("845af10d", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public String putTwoLevel(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8deeb4fe", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "{}";
        }
        JSONObject parseObject = JSON.parseObject(this.f3592a.get(str));
        JSONObject parseObject2 = JSON.parseObject(str2);
        if (parseObject != null) {
            parseObject2 = JsonUtil.merge(parseObject, parseObject2);
        }
        String json = parseObject2.toString();
        put(str, json);
        return json;
    }

    public void setEvictedListener(EvictedListener evictedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710148d7", new Object[]{this, evictedListener});
        } else {
            this.b = evictedListener;
        }
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3592a.get(str);
    }

    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            this.f3592a.put(str, str2);
        }
    }

    public String remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccd9492b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3592a.remove(str);
    }
}
