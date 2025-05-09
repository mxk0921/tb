package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class czn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17470a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final czn f17471a = new czn();

        public static /* synthetic */ czn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (czn) ipChange.ipc$dispatch("5ada6e5d", new Object[0]);
            }
            return f17471a;
        }
    }

    public static czn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czn) ipChange.ipc$dispatch("bd417737", new Object[0]);
        }
        return b.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b250c4a6", new Object[]{this})).booleanValue();
        }
        return f17470a;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a1dcf4", new Object[]{this, new Boolean(z)});
        } else {
            f17470a = z;
        }
    }

    public czn() {
    }
}
