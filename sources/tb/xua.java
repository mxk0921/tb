package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xua {

    /* renamed from: a  reason: collision with root package name */
    public ay4<Void, ? extends qib> f31610a = TAB_VIEW_CREATOR;
    public ay4<Void, ? extends pib> b = TAB_PRESENTER_CREATOR;
    public static final ay4<Void, ? extends qib> TAB_VIEW_CREATOR = new a();
    public static final ay4<Void, y02> TAB_PRESENTER_CREATOR = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ay4<Void, qib> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public qib a(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qib) ipChange.ipc$dispatch("ff2011", new Object[]{this, r5});
            }
            return new z02();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ay4<Void, y02> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public y02 a(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y02) ipChange.ipc$dispatch("8067f0a1", new Object[]{this, r5});
            }
            return new y02();
        }
    }

    static {
        t2o.a(993001653);
    }
}
