package com.tmall.android.dai;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import java.util.HashMap;
import java.util.Map;
import tb.fdb;
import tb.kgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DAIKVStoreage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, String>> f14201a = new HashMap();
    public static final int b = 1024;
    public static final int c = 1024;
    public static int d = 0;

    static {
        t2o.a(1034944590);
    }

    public static boolean a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63c93ad2", new Object[]{objArr})).booleanValue();
        }
        for (Object obj : objArr) {
            if (!(obj instanceof String)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized String getMemoryValue(String str, String str2) {
        synchronized (DAIKVStoreage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cbcdd56b", new Object[]{str, str2});
            } else if (a(str, str2)) {
                return null;
            } else {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    Map map = (Map) ((HashMap) f14201a).get(str);
                    if (map == null) {
                        return null;
                    }
                    return (String) map.get(str2);
                }
                return null;
            }
        }
    }

    public static String getValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        if (a(str, str2)) {
            return null;
        }
        String memoryValue = getMemoryValue(str, str2);
        if (memoryValue != null) {
            return memoryValue;
        }
        return getDiskValue(str, str2);
    }

    public static boolean put(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234b2d78", new Object[]{str, str2, str3})).booleanValue();
        }
        if (a(str, str2, str3)) {
            return false;
        }
        putToMemory(str, str2, str3);
        putToDisk(str, str2, str3);
        return true;
    }

    public static synchronized boolean putToMemory(String str, String str2, String str3) {
        synchronized (DAIKVStoreage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16f6eef4", new Object[]{str, str2, str3})).booleanValue();
            } else if (a(str, str2, str3)) {
                return false;
            } else {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (str3 == null) {
                        Map<String, Map<String, String>> map = f14201a;
                        Map map2 = (Map) ((HashMap) map).get(str);
                        if (map2 != null && map2.containsKey(str2)) {
                            map2.remove(str2);
                            d--;
                            if (map2.size() == 0) {
                                ((HashMap) map).remove(str);
                            }
                        }
                        return true;
                    } else if (d >= b) {
                        return false;
                    } else {
                        if (str3.length() > c) {
                            return false;
                        }
                        Map<String, Map<String, String>> map3 = f14201a;
                        Map map4 = (Map) ((HashMap) map3).get(str);
                        if (map4 == null) {
                            map4 = new HashMap();
                            ((HashMap) map3).put(str, map4);
                        }
                        if (!map4.containsKey(str2)) {
                            d++;
                        }
                        map4.put(str2, str3);
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public static String getDiskValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a26287", new Object[]{str, str2});
        }
        if (a(str, str2)) {
            return null;
        }
        try {
            fdb C = AVFSCacheManager.getInstance().cacheForModule("DAI").C();
            return (String) C.d0(str + "_" + str2);
        } catch (Throwable th) {
            kgh.d("DAIKVStoreage", "getDiskValue error", th);
            return null;
        }
    }

    public static boolean removeFromDisk(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3417682a", new Object[]{str, str2})).booleanValue();
        }
        if (a(str, str2)) {
            return false;
        }
        try {
            fdb C = AVFSCacheManager.getInstance().cacheForModule("DAI").C();
            C.A0(str + "_" + str2);
        } catch (Throwable th) {
            kgh.d("DAIKVStoreage", "removeFromDisk error", th);
        }
        return true;
    }

    public static boolean putToDisk(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c26eff10", new Object[]{str, str2, str3})).booleanValue();
        }
        if (a(str, str2, str3)) {
            return false;
        }
        try {
            fdb C = AVFSCacheManager.getInstance().cacheForModule("DAI").C();
            C.N(str + "_" + str2, str3);
        } catch (Throwable th) {
            kgh.d("DAIKVStoreage", "putToDisk error", th);
        }
        return true;
    }
}
