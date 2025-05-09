package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wl0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final g00 f30757a = (g00) xck.a(g00.class, "com.taobao.android.behavir.BehaviR");

        public static /* synthetic */ g00 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g00) ipChange.ipc$dispatch("5ca536f4", new Object[0]);
            }
            return f30757a;
        }
    }

    public static g00 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g00) ipChange.ipc$dispatch("fc788723", new Object[0]);
        }
        return a.a();
    }
}
