package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.TBContainerWVPlugin;
import com.taobao.infoflow.jsbridge.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class do4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17980a;
    public static final Map<String, a> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        boolean a(JsActionModel jsActionModel, hhc.a.AbstractC0939a aVar);
    }

    static {
        t2o.a(490733584);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba42fdd", new Object[0]);
        } else if (!f17980a) {
            f17980a = true;
            try {
                fve.e("ContainerWvPluginRegister", "registerWvPlugin : TBContainerWVPlugin");
                fsw.i("TBContainerWVPlugin", TBContainerWVPlugin.class, true);
            } catch (Exception unused) {
                fve.e("ContainerWvPluginRegister", "registerPlugin error");
            }
        }
    }

    public static void c(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21db700f", new Object[]{str, aVar});
        } else {
            ((ConcurrentHashMap) b).put(str, aVar);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fba1f2f", new Object[]{str});
            return;
        }
        Map<String, a> map = b;
        if (!((ConcurrentHashMap) map).isEmpty()) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }

    public static boolean b(JsActionModel jsActionModel, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc66997", new Object[]{jsActionModel, aVar})).booleanValue();
        }
        String businessId = jsActionModel.getBusinessId();
        a aVar2 = (a) ((ConcurrentHashMap) b).get(businessId);
        if (aVar2 != null) {
            return aVar2.a(jsActionModel, aVar);
        }
        fve.e("ContainerWvPluginRegister", "未查找到对应的 wvResponder， containerId ： " + businessId);
        ((mvf) aVar).c("未找到目标容器，请联系客户端同学确认，containerId：" + businessId);
        return false;
    }
}
