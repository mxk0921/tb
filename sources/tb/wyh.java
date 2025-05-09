package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static aqc f31011a;

    static {
        t2o.a(729809292);
    }

    public static void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{str, str2, obj, strArr});
            return;
        }
        aqc aqcVar = f31011a;
        if (aqcVar == null) {
            fve.f("MainContainerBx", "commitEnter mMainContainerBx == null");
        } else {
            ((bgt) aqcVar).g(str, str2, obj, strArr);
        }
    }

    public static void b(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{str, str2, str3, obj, strArr});
            return;
        }
        aqc aqcVar = f31011a;
        if (aqcVar == null) {
            fve.f("MainContainerBx", "commitLeave mMainContainerBx == null");
        } else {
            ((bgt) aqcVar).h(str, str2, str3, obj, strArr);
        }
    }

    public static void c(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{str, str2, str3, strArr});
            return;
        }
        aqc aqcVar = f31011a;
        if (aqcVar == null) {
            fve.f("MainContainerBx", "commitLeave mMainContainerBx == null");
        } else {
            ((bgt) aqcVar).i(str, str2, str3, strArr);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc96f9ad", new Object[0]);
            return;
        }
        aqc aqcVar = f31011a;
        if (aqcVar == null) {
            fve.f("MainContainerBx", "push mMainContainerBx == null");
        } else {
            ((bgt) aqcVar).j();
        }
    }

    public static void e(aqc aqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4025f", new Object[]{aqcVar});
        } else {
            f31011a = aqcVar;
        }
    }
}
