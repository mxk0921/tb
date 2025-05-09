package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yb4 implements xb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yb4 f31957a = new yb4();

        static {
            t2o.a(578814029);
        }

        public static /* synthetic */ yb4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yb4) ipChange.ipc$dispatch("924375b4", new Object[0]);
            }
            return f31957a;
        }
    }

    static {
        t2o.a(578814028);
        t2o.a(578814027);
    }

    public static yb4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yb4) ipChange.ipc$dispatch("96d906b9", new Object[0]);
        }
        return a.a();
    }

    @Override // tb.xb4
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15c09d0", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.xb4
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8cdc9e", new Object[]{this, str})).booleanValue();
        }
        return true;
    }
}
