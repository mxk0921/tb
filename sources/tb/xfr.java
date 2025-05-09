package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, qc4> f31362a = new HashMap<>();
    public final HashMap<String, lb4> b = new HashMap<>();
    public final ArrayList<String> c = new ArrayList<>();

    static {
        t2o.a(804257841);
    }

    public final HashMap<String, qc4> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8eb022fa", new Object[]{this});
        }
        return this.f31362a;
    }

    public final ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b71d1560", new Object[]{this});
        }
        return this.c;
    }

    public final HashMap<String, lb4> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b96bff5d", new Object[]{this});
        }
        return this.b;
    }
}
