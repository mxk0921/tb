package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gtw;
import tb.t2o;
import tb.v7t;
import tb.x74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWPManager";
    private static volatile WVWPManager sInstance;
    private final Map<Integer, WVWPData> wvwpMap = new ConcurrentHashMap();

    static {
        t2o.a(989856016);
    }

    private WVWPManager() {
    }

    public static WVWPManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVWPManager) ipChange.ipc$dispatch("ffe49ba8", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (WVWPManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new WVWPManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public WVWPData findDataByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVWPData) ipChange.ipc$dispatch("8a3326ab", new Object[]{this, str});
        }
        for (WVWPData wVWPData : this.wvwpMap.values()) {
            try {
                WeakReference<IWVWebView> weakReference = wVWPData.webviewWeakRef;
                if (weakReference != null) {
                    IWVWebView iWVWebView = weakReference.get();
                    if (iWVWebView instanceof IPerformance) {
                        String cachedUrl = ((IPerformance) iWVWebView).getCachedUrl();
                        boolean isPreInit = ((IPerformance) iWVWebView).isPreInit();
                        if (!TextUtils.equals(gtw.i(cachedUrl), gtw.i(str))) {
                            continue;
                        } else if (!isPreInit) {
                            return wVWPData;
                        } else {
                            v7t.d(TAG, "isPreInit, abort upload white page:" + cachedUrl);
                            return null;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Throwable th) {
                v7t.d(TAG, x74.i(th));
            }
        }
        return null;
    }

    public void onDestroy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24115721", new Object[]{this, new Integer(i)});
        } else {
            this.wvwpMap.remove(Integer.valueOf(i));
        }
    }

    public void onViewInit(int i, WVWPData wVWPData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857c570d", new Object[]{this, new Integer(i), wVWPData});
        } else {
            this.wvwpMap.put(Integer.valueOf(i), wVWPData);
        }
    }
}
