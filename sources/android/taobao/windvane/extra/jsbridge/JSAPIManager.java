package android.taobao.windvane.extra.jsbridge;

import android.os.SystemClock;
import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import tb.fsw;
import tb.ivf;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JSAPIManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final JSAPIManager INSTANCE = new JSAPIManager();
    private static boolean sInitialized = false;

    static {
        t2o.a(989855945);
    }

    private JSAPIManager() {
    }

    public static JSAPIManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSAPIManager) ipChange.ipc$dispatch("29837bcd", new Object[0]);
        }
        return INSTANCE;
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        synchronized (JSAPIManager.class) {
            try {
                if (!sInitialized) {
                    sInitialized = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    fsw.i(PayPasswrdValidateBridge.PLUGIN_NAME, PayPasswrdValidateBridge.class, true);
                    try {
                        ivf.a();
                    } catch (Exception e) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        lcn.f(rVLLevel, "WindVane/JSBridge", "registerPlugin error: " + e.getMessage());
                    }
                    IpChange ipChange2 = TRWidgetJsPlugin.$ipChange;
                    fsw.h("triver-widget", TRWidgetJsPlugin.class);
                    fsw.h("WVDevelopTool", WVDevelopTool.class);
                    lcn.a(RVLLevel.Info, "WindVane/JSBridge").j("register").a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
