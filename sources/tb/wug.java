package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wug implements a2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596296);
        t2o.a(444596298);
    }

    @Override // tb.a2w
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180563cc", new Object[]{this, obj, cls, str})).booleanValue();
        }
        return obj instanceof List;
    }

    @Override // tb.a2w
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56bce25a", new Object[]{this, obj, cls, str});
        }
        List list = (List) obj;
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                return list.get(Integer.parseInt(str));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
