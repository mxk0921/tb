package com.taobao.android.autosize;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnWindowChangedListener;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.rhx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Activity, Set<OnWindowChangedListener>> f6423a = new ConcurrentHashMap();

    public void a(Activity activity, OnWindowChangedListener onWindowChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cb6083", new Object[]{this, activity, onWindowChangedListener});
        } else if (activity == null || onWindowChangedListener == null) {
            TLog.loge("TBAutoSize.WindowChangedDispatcher", "activity is null? " + activity + " or listener is null: " + onWindowChangedListener + ". add failed");
        } else {
            Set set = (Set) ((ConcurrentHashMap) this.f6423a).get(activity);
            if (set == null) {
                set = new CopyOnWriteArraySet();
                ((ConcurrentHashMap) this.f6423a).put(activity, set);
            }
            set.add(onWindowChangedListener);
            TLog.loge("TBAutoSize.WindowChangedDispatcher", "addOnWindowChangedListener activity=" + activity + " listener=" + onWindowChangedListener);
        }
    }

    public void b(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17617f6", new Object[]{this, activity, configuration, new Integer(i)});
        } else if ((activity instanceof OnWindowChangedListener) || ((ConcurrentHashMap) this.f6423a).get(activity) != null) {
            OnWindowChangedListener.a e = e(activity, configuration, i);
            TLog.loge("TBAutoSize.WindowChangedDispatcher", "dispatchWindowChanged activity=" + activity + " windowConfig=" + e);
            f(activity, e);
            g(activity, e);
        }
    }

    public void c(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9ed48f", new Object[]{this, activity, configuration, new Integer(i)});
            return;
        }
        OnWindowChangedListener.a e = e(activity, configuration, i);
        for (Activity activity2 : ((ConcurrentHashMap) this.f6423a).keySet()) {
            g(activity2, e);
        }
    }

    public int d(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("256061be", new Object[]{this, activity, configuration})).intValue();
        }
        return 1;
    }

    public final OnWindowChangedListener.a e(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnWindowChangedListener.a) ipChange.ipc$dispatch("1a1565a8", new Object[]{this, activity, configuration, new Integer(i)});
        }
        OnWindowChangedListener.a aVar = new OnWindowChangedListener.a();
        aVar.f6410a = i;
        Rect a2 = rhx.a(activity);
        aVar.e = a2.height();
        aVar.d = a2.width();
        aVar.c = TBAutoSizeConfig.b0(activity, aVar.e);
        aVar.b = TBAutoSizeConfig.b0(activity, aVar.d);
        aVar.f = TBAutoSizeConfig.z(aVar.d, activity.getResources().getDisplayMetrics().density);
        aVar.h = configuration.orientation;
        TBAutoSizeConfig.x().W(activity, configuration);
        aVar.g = TBAutoSizeConfig.x().L(aVar.b);
        return aVar;
    }

    public final void f(Activity activity, OnWindowChangedListener.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30864eb", new Object[]{this, activity, aVar});
        } else if (activity instanceof OnWindowChangedListener) {
            ((OnWindowChangedListener) activity).a(aVar);
            TLog.loge("TBAutoSize.WindowChangedDispatcher", "notifyActivityListener activity=" + activity);
        }
    }

    public final void g(Activity activity, OnWindowChangedListener.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0a249e", new Object[]{this, activity, aVar});
            return;
        }
        Set<OnWindowChangedListener> set = (Set) ((ConcurrentHashMap) this.f6423a).get(activity);
        if (set != null) {
            for (OnWindowChangedListener onWindowChangedListener : set) {
                if (onWindowChangedListener != null) {
                    onWindowChangedListener.a(aVar);
                    TLog.loge("TBAutoSize.WindowChangedDispatcher", "notifyRegisteredListener activity=" + activity + " listener=" + onWindowChangedListener);
                }
            }
        }
    }

    public void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b247780e", new Object[]{this, activity});
        } else {
            ((ConcurrentHashMap) this.f6423a).remove(activity);
        }
    }

    public void i(Activity activity, OnWindowChangedListener onWindowChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5a4626", new Object[]{this, activity, onWindowChangedListener});
        } else if (activity == null || onWindowChangedListener == null) {
            TLog.loge("TBAutoSize.WindowChangedDispatcher", "activity is null? " + activity + " or listener is null: " + onWindowChangedListener + ". remove failed");
        } else {
            Set set = (Set) ((ConcurrentHashMap) this.f6423a).get(activity);
            if (set != null) {
                set.remove(onWindowChangedListener);
                if (set.isEmpty()) {
                    ((ConcurrentHashMap) this.f6423a).remove(activity);
                }
                TLog.loge("TBAutoSize.WindowChangedDispatcher", "removeOnWindowChangedListener activity=" + activity + " listener=" + onWindowChangedListener);
            }
        }
    }
}
