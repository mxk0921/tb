package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ec1 implements d2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789089);
        t2o.a(81789099);
    }

    @Override // tb.d2w
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180563cc", new Object[]{this, obj, cls, str})).booleanValue();
        }
        return cls.isArray();
    }

    @Override // tb.d2w
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56bce25a", new Object[]{this, obj, cls, str});
        }
        try {
            return Array.get(obj, Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
