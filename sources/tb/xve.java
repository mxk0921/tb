package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.InfoFlowWVPlugin;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INFO_FLOW_WV_PLUGIN_NAME = "InfoFlowWVPlugin";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31627a;
    public static final Map<String, a> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        boolean a(JsActionModel jsActionModel, IJsBridgeService.a.AbstractC0565a aVar);
    }

    static {
        t2o.a(491782237);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec1d6e8", new Object[0]);
        } else if (!f31627a) {
            f31627a = true;
            try {
                fve.e("InfoFlowWvPluginRegister", "registerWvPlugin : InfoFlowWVPlugin");
                fsw.i(INFO_FLOW_WV_PLUGIN_NAME, InfoFlowWVPlugin.class, true);
                xue.c().a().a(INFO_FLOW_WV_PLUGIN_NAME, new fue());
            } catch (Throwable unused) {
                fve.e("InfoFlowWvPluginRegister", "registerPlugin error");
            }
        }
    }

    public static void c(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cdd4bf", new Object[]{str, aVar});
        } else {
            ((ConcurrentHashMap) b).put(str, aVar);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797e319c", new Object[]{str});
            return;
        }
        Map<String, a> map = b;
        if (!((ConcurrentHashMap) map).isEmpty()) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }

    public static boolean b(JsActionModel jsActionModel, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("379d8345", new Object[]{jsActionModel, aVar})).booleanValue();
        }
        String container = jsActionModel.getContainer();
        a aVar2 = (a) ((ConcurrentHashMap) b).get(container);
        if (aVar2 != null) {
            return aVar2.a(jsActionModel, aVar);
        }
        fve.e("InfoFlowWvPluginRegister", "未查找到对应的 wvResponder， containerId ： " + container);
        aVar.error("未找到目标容器，请联系客户端同学确认，containerId：" + container);
        return false;
    }
}
