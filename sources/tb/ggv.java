package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ggv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19980a;

    static {
        t2o.a(806356156);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("893fcb39", new Object[0])).booleanValue();
        }
        if (f19980a && hjr.E("enableMergeUnImportantLiveInfo0926", true)) {
            return zqq.c(hjr.A("taolive", "MergeUnImportantLiveInfo0806", "enableMergeUnImportantLiveInfo0806", "false"));
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3e12115", new Object[0])).booleanValue();
        }
        return hjr.E("enableObserveUnImportantLiveInfo", true);
    }
}
