package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xug implements b2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475005007);
        t2o.a(475005009);
    }

    @Override // tb.b2w
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180563cc", new Object[]{this, obj, cls, str})).booleanValue();
        }
        return obj instanceof List;
    }

    @Override // tb.b2w
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56bce25a", new Object[]{this, obj, cls, str});
        }
        try {
            return ((List) obj).get(Integer.parseInt(str));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
