package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.PluginInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<ead> f29857a = new ArrayList();

    static {
        t2o.a(511705497);
    }

    public static void a(ead eadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a51fb9e", new Object[]{eadVar});
        } else {
            ((ArrayList) f29857a).add(eadVar);
        }
    }

    public static r9g b(b8g b8gVar, PluginInfo pluginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9g) ipChange.ipc$dispatch("4a2a5716", new Object[]{b8gVar, pluginInfo});
        }
        Iterator it = ((ArrayList) f29857a).iterator();
        while (it.hasNext()) {
            r9g a2 = ((ead) it.next()).a(pluginInfo.pluginClass);
            if (a2 != null) {
                a2.M(b8gVar, pluginInfo);
                return a2;
            }
        }
        return null;
    }
}
