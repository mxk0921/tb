package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ute {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static wec f29602a;

    static {
        t2o.a(486539276);
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beece4de", new Object[]{str, str2, str3})).booleanValue();
        }
        wec wecVar = f29602a;
        if (wecVar == null) {
            fve.e("InfoFlowAbGlobal", "gIInfoFlowAbGlobal is null");
            return false;
        }
        try {
            return wecVar.a(str, str2, str3);
        } catch (Throwable th) {
            fve.c("InfoFlowAbGlobal", "isFeatureOpened error", th);
            return false;
        }
    }

    public static void b(wec wecVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33f0507", new Object[]{wecVar});
        } else {
            f29602a = wecVar;
        }
    }
}
