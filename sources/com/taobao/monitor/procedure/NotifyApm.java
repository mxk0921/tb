package com.taobao.monitor.procedure;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.snl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NotifyApm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALGORITHM_CANVAS = 0;
    public static final int ALGORITHM_SHADOW = 2;
    public static final int ALGORITHM_SPECIFIC_VIEW_AREA = 1;
    public static final String KEY_NOTIFY_FINISH_LAUNCH = "finishLaunch";
    public static final int NOTIFY_LANDING_PAGE_MISS_HIT = 1;
    public static final int NOTIFY_TRIGGER_PAGE_LOAD_CALCULATE = 2;
    public static volatile NotifyApm b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, List<a>> f11127a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface AlgorithmType {
    }

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface NotifyType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void w(Map<String, Object> map);
    }

    public static NotifyApm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifyApm) ipChange.ipc$dispatch("c3bb8e2", new Object[0]);
        }
        if (b == null) {
            synchronized (NotifyApm.class) {
                try {
                    if (b == null) {
                        b = new NotifyApm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec73853", new Object[]{this, new Integer(i), aVar});
        } else if (aVar != null) {
            List list = (List) ((ConcurrentHashMap) this.f11127a).get(Integer.valueOf(i));
            if (list == null) {
                list = new CopyOnWriteArrayList();
                ((ConcurrentHashMap) this.f11127a).put(Integer.valueOf(i), list);
            }
            list.add(aVar);
        }
    }

    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8985da9", new Object[]{this, activity});
            return;
        }
        List<a> list = (List) ((ConcurrentHashMap) this.f11127a).get(1);
        if (list != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activity", activity);
            for (a aVar : list) {
                aVar.w(hashMap);
            }
        }
    }

    public void d(int i, a aVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a90d76", new Object[]{this, new Integer(i), aVar});
        } else if (aVar != null && (list = (List) ((ConcurrentHashMap) this.f11127a).get(Integer.valueOf(i))) != null) {
            list.remove(aVar);
        }
    }

    public void e(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d395c5f1", new Object[]{this, activity, new Integer(i)});
            return;
        }
        List<a> list = (List) ((ConcurrentHashMap) this.f11127a).get(2);
        if (list != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("page", snl.f28161a.f(activity));
            hashMap.put("algorithmType", Integer.valueOf(i));
            for (a aVar : list) {
                aVar.w(hashMap);
            }
        }
    }
}
