package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class beg extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final peg f16344a;
    public final Map<String, Object> b;

    static {
        t2o.a(295699227);
    }

    public beg(peg pegVar, Map<String, Object> map) {
        this.f16344a = pegVar;
        this.b = map;
    }

    public static /* synthetic */ Object ipc$super(beg begVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultronnew/events/LVDXContext");
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("82d494d7", new Object[]{this});
        }
        return this.b;
    }

    public peg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (peg) ipChange.ipc$dispatch("717d4eba", new Object[]{this});
        }
        return this.f16344a;
    }
}
