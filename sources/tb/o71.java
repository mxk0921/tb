package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "PopLayer";
    public static final String POINT_ACCS = "accsLaunch";
    public static final String POINT_COLD_LAUNCH_REOPEN = "ColdLaunchReopen";
    public static final String POINT_CONFIG_FAIL = "ConfigCheckFail";
    public static final String POINT_CONFIG_PARSE_TIME = "ConfigParseTime";
    public static final String POINT_CONFIG_START = "ConfigCheckStart";
    public static final String POINT_JUMPLOSE = "JumpLose";
    public static final String POINT_ONE_POP = "OnePop";
    public static final String POINT_POP_DISPLAY = "PopDisplay";
    public static final String POINT_POP_ERROR = "PopError";
    public static final String POINT_POP_PROCESS = "PopProcess";
    public static final String POINT_TEMPLATE_CACHE = "TemplateCache";
    public static final String POINT_WEBVIEW_LOAD = "webviewLoadTime";
    public static final String POINT_WEEX_RENDER = "weexRenderTime";

    /* renamed from: a  reason: collision with root package name */
    public List<xgb> f25177a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o71 f25178a = new o71();

        static {
            t2o.a(625999982);
        }

        public static /* synthetic */ o71 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o71) ipChange.ipc$dispatch("ddc67aec", new Object[0]);
            }
            return f25178a;
        }
    }

    static {
        t2o.a(625999981);
    }

    public static o71 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o71) ipChange.ipc$dispatch("4df893e7", new Object[0]);
        }
        return a.a();
    }

    public void b(xgb xgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d188148", new Object[]{this, xgbVar});
            return;
        }
        if (this.f25177a == null) {
            this.f25177a = new ArrayList();
        }
        if (!this.f25177a.contains(xgbVar)) {
            this.f25177a.add(xgbVar);
        }
        wdm.d("AppMonitorManager.registerAppMonitorAdapter.", new Object[0]);
    }

    public void c(String str, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90eb5085", new Object[]{this, str, map, map2});
            return;
        }
        try {
            if (this.f25177a != null && !TextUtils.isEmpty(str)) {
                Iterator it = ((ArrayList) this.f25177a).iterator();
                while (it.hasNext()) {
                    xgb xgbVar = (xgb) it.next();
                    if (xgbVar != null) {
                        xgbVar.a(str, map, map2);
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("AppMonitorManager.stat.error.", th);
        }
    }
}
