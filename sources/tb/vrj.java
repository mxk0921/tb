package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vrj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ADVANCED_DETECT = "plt_autodetect";
    public static final String TYPE_OBJECT = "Object";
    public static final String TYPE_REALTIME_DETECT = "plt_search";
    public static final String TYPE_SMART_DETECT = "plt_smart_camera";
    public static final String TYPE_VIDEO = "Video";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, b> f30201a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a<INPUT, OUTPUT> {
        OUTPUT a(INPUT input);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b extends a<NetConfig, vio> {
    }

    static {
        t2o.a(481297306);
    }

    public static vio a(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vio) ipChange.ipc$dispatch("dd717aa", new Object[]{netConfig});
        }
        a aVar = (a) ((ConcurrentHashMap) f30201a).get(netConfig.type);
        if (aVar == null) {
            return null;
        }
        return (vio) aVar.a(netConfig);
    }

    public static void b(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e877be", new Object[]{str, bVar});
        } else {
            ((ConcurrentHashMap) f30201a).put(str, bVar);
        }
    }
}
