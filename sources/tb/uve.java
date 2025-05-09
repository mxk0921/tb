package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static mfc f29633a;

    static {
        t2o.a(486539293);
    }

    public static void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "updateNextPageUtParam gUserTrack == null");
            return;
        }
        try {
            mfcVar.a(str, i, str2, str3, str4, str5);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "commitEvent error", th);
        }
    }

    public static void b(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9834d145", new Object[]{str, map, map2, map3});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "sceneTrackerBeginScene gUserTrack == null");
            return;
        }
        try {
            mfcVar.c(str, map, map2, map3);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "sceneTrackerBeginScene error", th);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b8e06e", new Object[]{str});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "sceneTrackerBeginScene gUserTrack == null");
            return;
        }
        try {
            mfcVar.b(str);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "sceneTrackerBeginScene error", th);
        }
    }

    public static void d(mfc mfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e265965", new Object[]{mfcVar});
        } else {
            f29633a = mfcVar;
        }
    }

    public static void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{map});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "updateNextPageProperties gUserTrack == null");
            return;
        }
        try {
            mfcVar.updateNextPageProperties(map);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "updateNextPageProperties error", th);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac44f4", new Object[]{str});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "updateNextPageUtParam gUserTrack == null");
            return;
        }
        try {
            mfcVar.updateNextPageUtParam(str);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "updateNextPageUtParam error", th);
        }
    }

    public static void g(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
            return;
        }
        mfc mfcVar = f29633a;
        if (mfcVar == null) {
            fve.f("BaseUserTrackUtils", "updatePageProperties gUserTrack == null");
            return;
        }
        try {
            mfcVar.updatePageProperties(obj, map);
        } catch (Throwable th) {
            fve.c("BaseUserTrackUtils", "updatePageProperties error", th);
        }
    }
}
