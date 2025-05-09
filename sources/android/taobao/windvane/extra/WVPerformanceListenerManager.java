package android.taobao.windvane.extra;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.mqw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPerformanceListenerManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile WVPerformanceListenerManager sInstance;
    private final List<IPerformanceListener> mPerformanceListeners = new CopyOnWriteArrayList();

    static {
        t2o.a(989855927);
    }

    private WVPerformanceListenerManager() {
    }

    public static /* synthetic */ List access$000(WVPerformanceListenerManager wVPerformanceListenerManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc67504c", new Object[]{wVPerformanceListenerManager});
        }
        return wVPerformanceListenerManager.mPerformanceListeners;
    }

    public static WVPerformanceListenerManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPerformanceListenerManager) ipChange.ipc$dispatch("dc4436e8", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (WVPerformanceListenerManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new WVPerformanceListenerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean addPerformanceListener(IPerformanceListener iPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eaddbbf", new Object[]{this, iPerformanceListener})).booleanValue();
        }
        return this.mPerformanceListeners.add(iPerformanceListener);
    }

    public void onWhitePageOccur(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99bd10b", new Object[]{this, map});
        } else if (this.mPerformanceListeners.size() != 0) {
            mqw.a().b(new Runnable() { // from class: android.taobao.windvane.extra.WVPerformanceListenerManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        for (IPerformanceListener iPerformanceListener : WVPerformanceListenerManager.access$000(WVPerformanceListenerManager.this)) {
                            if ((iPerformanceListener.getFlag() & 1) == 1) {
                                iPerformanceListener.onPerformanceEventOccur(1, map);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public boolean removePerformanceListener(IPerformanceListener iPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d437fc", new Object[]{this, iPerformanceListener})).booleanValue();
        }
        return this.mPerformanceListeners.remove(iPerformanceListener);
    }
}
