package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.c21;
import tb.t2o;
import tb.u11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppLifecycle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AppLifeCycle";
    private static CopyOnWriteArraySet<AppLifecycleListener> listeners = new CopyOnWriteArraySet<>();
    public static volatile long lastEnterBackgroundTime = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface AppLifecycleListener {
        void background();

        void forground();
    }

    static {
        t2o.a(607125929);
    }

    private AppLifecycle() {
    }

    public static /* synthetic */ CopyOnWriteArraySet access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]);
        }
        return listeners;
    }

    public static void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[0]);
            return;
        }
        ALog.e(TAG, "registerApmEventListener", null, new Object[0]);
        registerApmEventListener();
    }

    public static void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[0]);
            return;
        }
        GlobalAppRuntimeInfo.setBackground(true);
        lastEnterBackgroundTime = System.currentTimeMillis();
        notifyListener(false);
    }

    public static void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[0]);
            return;
        }
        GlobalAppRuntimeInfo.setBackground(false);
        notifyListener(true);
    }

    public static void registerApmEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca62b7ba", new Object[0]);
            return;
        }
        try {
            c21.c(new u11() { // from class: anet.channel.util.AppLifecycle.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.u11, com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i == 1) {
                        AppLifecycle.onBackground();
                    } else if (i == 2) {
                        AppLifecycle.onForeground();
                    }
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "registerApmEventListener exception. e=" + e.toString(), null, e, new Object[0]);
        }
    }

    public static void registerLifecycleListener(AppLifecycleListener appLifecycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb75b35", new Object[]{appLifecycleListener});
        } else if (appLifecycleListener != null) {
            listeners.add(appLifecycleListener);
        }
    }

    public static void unregisterLifecycleListener(AppLifecycleListener appLifecycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da50d8e", new Object[]{appLifecycleListener});
        } else {
            listeners.remove(appLifecycleListener);
        }
    }

    private static void notifyListener(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c054230", new Object[]{new Boolean(z)});
            return;
        }
        String str = "foreground";
        ALog.e(TAG, "notifyListener", null, str, Boolean.valueOf(z));
        IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
        if (!z) {
            str = "background";
        }
        v3Instance.recordAppStatus("Lifecycle", str);
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.AppLifecycle.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Iterator it = AppLifecycle.access$000().iterator();
                while (it.hasNext()) {
                    AppLifecycleListener appLifecycleListener = (AppLifecycleListener) it.next();
                    try {
                        if (z) {
                            appLifecycleListener.forground();
                        } else {
                            appLifecycleListener.background();
                        }
                    } catch (Exception e) {
                        ALog.e(AppLifecycle.TAG, "notifyListener exception. e=" + e.toString(), null, e, new Object[0]);
                    }
                }
            }
        });
    }
}
