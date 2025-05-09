package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jxj implements yxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<Object>, Object> f22270a = new HashMap();

    static {
        t2o.a(352321883);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9a7e49", new Object[]{this});
            return;
        }
        fxj.a(this);
        ((HashMap) this.f22270a).put(yn9.class, new zn9());
    }
}
