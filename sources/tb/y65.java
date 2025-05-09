package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.component.DWComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends DWComponent>> f31877a = new HashMap();

    static {
        t2o.a(452985061);
    }

    public static Class<? extends DWComponent> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("cb863c96", new Object[]{str});
        }
        return (Class) ((HashMap) f31877a).get(str);
    }
}
