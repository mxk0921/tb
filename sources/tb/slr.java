package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class slr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static slr b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Object, Boolean> f28135a = new HashMap<>();

    static {
        t2o.a(779092243);
    }

    public static slr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slr) ipChange.ipc$dispatch("9d416b30", new Object[0]);
        }
        if (b == null) {
            b = new slr();
        }
        return b;
    }

    public void b(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26934ec4", new Object[]{this, obj, new Boolean(z)});
        } else {
            this.f28135a.put(obj, Boolean.valueOf(z));
        }
    }

    public boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("336fc18f", new Object[]{this, obj})).booleanValue();
        }
        Boolean bool = this.f28135a.get(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
