package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class iln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f21391a = new ConcurrentHashMap<>(4);
    public final int b;

    static {
        t2o.a(745537690);
    }

    public iln(int i) {
        this.b = i;
    }

    public final ConcurrentHashMap<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("c04231b4", new Object[]{this});
        }
        return this.f21391a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19410cb4", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
