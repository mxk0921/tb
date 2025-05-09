package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f5a f19022a = new f5a();

        static {
            t2o.a(475005020);
        }
    }

    static {
        t2o.a(475005019);
    }

    public static f5a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5a) ipChange.ipc$dispatch("28e354e0", new Object[0]);
        }
        return a.f19022a;
    }

    public es6 b(String str, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es6) ipChange.ipc$dispatch("e50c02e", new Object[]{this, str, g5aVar});
        }
        if (g5aVar.a() instanceof i5a) {
            return ((i5a) g5aVar.a()).c().b(str);
        }
        return null;
    }
}
