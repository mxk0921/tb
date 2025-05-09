package com.taobao.themis.kernel.manager;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.njg;
import tb.q9s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSActivityKeepAliveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSActivityKeepAliveManager INSTANCE = new TMSActivityKeepAliveManager();

    /* renamed from: a  reason: collision with root package name */
    public static final int f13587a = q9s.m4();
    public static final ConcurrentHashMap<String, WeakReference<Activity>> b = new ConcurrentHashMap<>();
    public static final njg c = a.a(LazyThreadSafetyMode.NONE, TMSActivityKeepAliveManager$keepAliveWhiteList$2.INSTANCE);

    static {
        t2o.a(839909756);
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b545baed", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "id");
        JSONArray<Object> c2 = INSTANCE.c();
        if ((c2 instanceof Collection) && c2.isEmpty()) {
            return false;
        }
        for (Object obj : c2) {
            if (ckf.b(obj, str)) {
                ConcurrentHashMap<String, WeakReference<Activity>> concurrentHashMap = b;
                if (concurrentHashMap.size() >= f13587a || concurrentHashMap.get(str) != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final Activity b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("cd964756", new Object[]{str});
        }
        ckf.g(str, "id");
        WeakReference<Activity> weakReference = b.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    public static final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436226f0", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "id");
        b.remove(str);
        return true;
    }

    public final JSONArray c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d099d9c2", new Object[]{this});
        }
        Object value = c.getValue();
        ckf.f(value, "<get-keepAliveWhiteList>(...)");
        return (JSONArray) value;
    }

    @JvmStatic
    public static final boolean d(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3648f43b", new Object[]{str, activity})).booleanValue();
        }
        ckf.g(str, "id");
        ckf.g(activity, "activity");
        ConcurrentHashMap<String, WeakReference<Activity>> concurrentHashMap = b;
        if (concurrentHashMap.size() >= f13587a) {
            TMSLogger.b("TMSActivityKeepAliveManager", "registerKeepAliveActivity failed, max keep alive");
            return false;
        } else if (concurrentHashMap.get(str) != null) {
            TMSLogger.b("TMSActivityKeepAliveManager", "registerKeepAliveActivity failed, uniAppId already exist");
            return false;
        } else {
            concurrentHashMap.put(str, new WeakReference<>(activity));
            return true;
        }
    }
}
