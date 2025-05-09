package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gq7 f20166a = new gq7();

        static {
            t2o.a(620757044);
        }

        public static /* synthetic */ gq7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gq7) ipChange.ipc$dispatch("d8c8c205", new Object[0]);
            }
            return f20166a;
        }
    }

    static {
        t2o.a(620757042);
    }

    public static gq7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gq7) ipChange.ipc$dispatch("b3f5f65f", new Object[0]);
        }
        return b.a();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6e0beb", new Object[]{this, new Boolean(z)});
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e6a567", new Object[]{this, new Integer(i)});
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74d62f9", new Object[]{this, new Integer(i)});
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8dd4418", new Object[]{this, new Integer(i)});
        }
    }

    public gq7() {
    }
}
