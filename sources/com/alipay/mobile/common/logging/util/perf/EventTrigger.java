package com.alipay.mobile.common.logging.util.perf;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventTrigger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static EventTrigger e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4005a;
    public final Map<String, String> b = new HashMap();
    public final AtomicInteger c = new AtomicInteger(0);
    public final List<EventListener> d = new ArrayList();

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EventListener {
        void onEvent(String str, Map<String, String> map);
    }

    public EventTrigger(Context context) {
        this.f4005a = null;
        Context applicationContext = context.getApplicationContext();
        this.f4005a = applicationContext;
        if (applicationContext == null) {
            this.f4005a = context;
        }
    }

    public static void event(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb6b094", new Object[]{context, str, map});
        } else {
            getInstance(context).event(str, map);
        }
    }

    public static EventTrigger getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventTrigger) ipChange.ipc$dispatch("51e5cf92", new Object[]{context});
        }
        if (e == null) {
            synchronized (EventTrigger.class) {
                try {
                    if (e == null) {
                        e = new EventTrigger(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void a(String str, Map<String, String> map) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.b) {
                try {
                    equals = Constants.VAL_YES.equals((String) ((HashMap) this.b).get(str));
                    ((HashMap) this.b).put(str, Constants.VAL_YES);
                    if ("background".equals(str)) {
                        ((HashMap) this.b).remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!equals) {
                ArrayList arrayList = new ArrayList();
                synchronized (this.d) {
                    arrayList.addAll(this.d);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((EventListener) it.next()).onEvent(str, map);
                    } catch (Throwable unused) {
                    }
                }
                if (Constants.EVENT_ENTER_IDLE.equals(str)) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(Constants.BROADCAST_ACTION);
                        intent.setPackage(this.f4005a.getPackageName());
                        intent.putExtra("event", str);
                        String str2 = "3";
                        if (map != null && map.containsKey(Constants.PARAM_PERF_LEVEL)) {
                            str2 = map.get(Constants.PARAM_PERF_LEVEL);
                        }
                        intent.putExtra(Constants.PARAM_PERF_LEVEL, str2);
                        LocalBroadcastManager.getInstance(this.f4005a).sendBroadcast(intent);
                    } catch (Throwable unused2) {
                    }
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("mpaas.perf.judge.event.".concat(String.valueOf(str)));
                        intent2.setPackage(this.f4005a.getPackageName());
                        String str3 = "3";
                        if (map != null && map.containsKey(Constants.PARAM_PERF_LEVEL)) {
                            str3 = map.get(Constants.PARAM_PERF_LEVEL);
                        }
                        intent2.putExtra(Constants.PARAM_PERF_LEVEL, str3);
                        LocalBroadcastManager.getInstance(this.f4005a).sendBroadcast(intent2);
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public boolean isInImpZone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30161ab4", new Object[]{this})).booleanValue();
        }
        if (this.c.get() > 0) {
            return true;
        }
        return false;
    }

    public void registerEventListener(EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48f0b0", new Object[]{this, eventListener});
        } else if (eventListener != null) {
            synchronized (this.d) {
                try {
                    if (!((ArrayList) this.d).contains(eventListener)) {
                        ((ArrayList) this.d).add(eventListener);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void unregisterEventListener(EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59f1349", new Object[]{this, eventListener});
        } else if (eventListener != null) {
            synchronized (this.d) {
                try {
                    if (((ArrayList) this.d).contains(eventListener)) {
                        ((ArrayList) this.d).remove(eventListener);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void event(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365127a", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, String> judgement = Judge.getInstance(this.f4005a).getJudgement();
            if (judgement != null) {
                map.putAll(judgement);
            }
            if ("clientLaunch".equals(str)) {
                a("clientLaunch", map);
                IdleChecker.getInstance(this.f4005a).triggerTimeout(false);
            } else if (Constants.EVENT_CLIENT_LAUNCH_FINISH.equals(str)) {
                a("clientLaunch", map);
                a(Constants.EVENT_CLIENT_LAUNCH_FINISH, map);
                IdleChecker.getInstance(this.f4005a).triggerTimeout(true);
            } else if (Constants.EVENT_ENTER_IDLE.equals(str)) {
                a("clientLaunch", map);
                a(Constants.EVENT_CLIENT_LAUNCH_FINISH, map);
                a(Constants.EVENT_ENTER_IDLE, map);
            } else if ("background".equals(str)) {
                a("background", map);
            } else if (Constants.EVENT_ENTER_IMP_ZONE.equals(str)) {
                this.c.incrementAndGet();
            } else if (Constants.EVENT_LEAVE_IMP_ZONE.equals(str)) {
                this.c.decrementAndGet();
            }
        }
    }
}
