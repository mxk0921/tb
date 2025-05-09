package android.taobao.windvane.monitor;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.t2o;
import tb.v7t;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVLocPerformanceMonitor implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APP_STATUS = 1;
    public static final int LOADURL_STATUS = 3;
    public static final int WEBVIEW_STATUS = 2;
    private HashMap<String, Object> monitorData;
    private static String TAG = WVLocPerformanceMonitor.class.getSimpleName();
    private static boolean isOpenLocPerformanceMonitor = false;
    private static WVLocPerformanceMonitor instance = null;
    public float cpu_app = 0.0f;
    public float mem_app = 0.0f;
    public float cpu_webview = 0.0f;
    public float mem_webview = 0.0f;
    private long time_webview_start = 0;
    private long time_webview = 0;
    public float cpu_loadurl = 0.0f;
    public float mem_loadurl = 0.0f;
    private long time_load_start = 0;
    private long time_load = 0;
    private boolean isInit = false;

    static {
        t2o.a(989856330);
        t2o.a(989856388);
    }

    public static WVLocPerformanceMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVLocPerformanceMonitor) ipChange.ipc$dispatch("8c1f3cb1", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVLocPerformanceMonitor.class) {
                instance = new WVLocPerformanceMonitor();
            }
        }
        return instance;
    }

    public static boolean isOpenLocPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57da9c1", new Object[0])).booleanValue();
        }
        return isOpenLocPerformanceMonitor;
    }

    public static void setOpenLocPerformanceMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26497def", new Object[]{new Boolean(z)});
        } else {
            isOpenLocPerformanceMonitor = z;
        }
    }

    public HashMap<String, Object> getMonitorData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("61276a98", new Object[]{this});
        }
        return this.monitorData;
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (3009 == i) {
            setCpuAndMemery(yaa.n, 1);
            return null;
        } else if (3008 == i) {
            this.time_webview_start = System.currentTimeMillis();
            return null;
        } else if (3010 == i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.time_load_start = currentTimeMillis;
            this.time_webview = currentTimeMillis - this.time_webview_start;
            setCpuAndMemery(yaa.n, 2);
            return null;
        } else if (1001 == i) {
            this.time_load_start = System.currentTimeMillis();
            return null;
        } else if (1002 != i) {
            return null;
        } else {
            try {
                this.time_load = System.currentTimeMillis() - this.time_load_start;
                setCpuAndMemery(yaa.n, 3);
                IWVWebView iWVWebView = iqwVar.f21515a;
                IWVWebView.JsbridgeHis.clear();
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.cpu_app = 0.0f;
        this.mem_app = 0.0f;
        this.cpu_webview = 0.0f;
        this.mem_webview = 0.0f;
        this.time_webview = 0L;
        this.cpu_loadurl = 0.0f;
        this.mem_loadurl = 0.0f;
        this.time_load = 0L;
        this.isInit = false;
    }

    public void setMonitorData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400ed2a", new Object[]{this, hashMap});
            return;
        }
        this.monitorData = hashMap;
        setCpuAndMemery(yaa.n, 3);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.isInit) {
            try {
                String jSONString = JSON.toJSONString(getInstance());
                String str = TAG;
                v7t.a(str, "data: " + jSONString);
                return jSONString;
            } catch (Exception e) {
                e.printStackTrace();
                String str2 = TAG;
                v7t.a(str2, "性能数据采集失败，json解析异常 json 解析异常：" + e.getMessage());
                return null;
            }
        } else {
            v7t.a(TAG, "性能数据未初始化");
            return null;
        }
    }

    public void setCpuAndMemery(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8bcea", new Object[]{this, context, new Integer(i)});
        } else if (!isOpenLocPerformanceMonitor()) {
            v7t.a(TAG, "非debug状态，不开启性能数据采集模式");
        } else {
            if (i == 1) {
                this.cpu_app = 0.0f;
                this.mem_app = 0.0f;
            } else if (i == 2) {
                this.cpu_webview = 0.0f;
                this.mem_webview = 0.0f;
            } else if (i == 3) {
                this.cpu_loadurl = 0.0f;
                this.mem_loadurl = 0.0f;
            }
            this.isInit = true;
        }
    }
}
