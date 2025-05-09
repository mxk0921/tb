package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class swh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final swh f28322a = new swh();

        static {
            t2o.a(982515726);
        }

        public static /* synthetic */ swh a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (swh) ipChange.ipc$dispatch("aac8dfc8", new Object[0]);
            }
            return f28322a;
        }
    }

    static {
        t2o.a(982515724);
        vvh.m();
    }

    public static swh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swh) ipChange.ipc$dispatch("d2fe8a2", new Object[0]);
        }
        return b.a();
    }

    public byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("115ef8ec", new Object[]{this, str});
        }
        return null;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ae396f", new Object[]{this, str});
        }
    }

    public swh() {
    }
}
