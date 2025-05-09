package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u5c f31135a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final x49 f31136a = new x49();

        static {
            t2o.a(676331703);
        }

        public static /* synthetic */ x49 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x49) ipChange.ipc$dispatch("b8a6e9ca", new Object[0]);
            }
            return f31136a;
        }
    }

    static {
        t2o.a(676331701);
    }

    public static x49 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x49) ipChange.ipc$dispatch("6a33ae65", new Object[0]);
        }
        return b.a();
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83975e59", new Object[]{this, str})).longValue();
        }
        return ((a17) this.f31135a).a(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb7a516a", new Object[]{this, str});
        }
        return ((a17) this.f31135a).b(str);
    }

    public x49() {
        this.f31135a = new a17();
    }
}
