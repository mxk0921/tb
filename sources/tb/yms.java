package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.TScheduleStatusService;
import com.taobao.android.tschedule.aidl.ITScheduleStatus;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ITScheduleStatus f32204a;

    static {
        t2o.a(329252879);
    }

    public static /* synthetic */ ITScheduleStatus a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITScheduleStatus) ipChange.ipc$dispatch("bdd37b72", new Object[0]);
        }
        return f32204a;
    }

    public static /* synthetic */ ITScheduleStatus b(ITScheduleStatus iTScheduleStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITScheduleStatus) ipChange.ipc$dispatch("17bf9cdd", new Object[]{iTScheduleStatus});
        }
        f32204a = iTScheduleStatus;
        return iTScheduleStatus;
    }

    public static void c(String str, String str2, List<TimeContent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e517c38", new Object[]{str, str2, list});
        } else if (!cns.g(TScheduleInitialize.b())) {
            zdh.a("TS.Status", "not main process, discard addConfigUrl");
        } else {
            TScheduleStatusService.d(str, str2, list);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87c7273", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                ITScheduleStatus iTScheduleStatus = f32204a;
                if (iTScheduleStatus == null) {
                    zdh.a("TS.Status", "addRenderUrl aidl service is empty");
                    TScheduleStatusService.e(str, str2);
                    return;
                }
                iTScheduleStatus.addRenderUrl(str, str2);
            } catch (Throwable th) {
                zdh.b("TS.Status", "addRenderUrl error", th);
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772a4074", new Object[]{str});
            return;
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus == null) {
                zdh.a("TS.Status", "finishChange aidl service is empty");
            } else {
                iTScheduleStatus.finishChange(str);
            }
        } catch (Throwable th) {
            zdh.b("TS.Status", "finishChange error", th);
        }
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7ce575bf", new Object[0]);
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus == null) {
                zdh.a("TS.Status", "getChangeFlags aidl service is empty");
                return null;
            }
            String changeFlags = iTScheduleStatus.getChangeFlags();
            if (TextUtils.isEmpty(changeFlags)) {
                return null;
            }
            return JSON.parseArray(changeFlags, String.class);
        } catch (Throwable th) {
            zdh.b("TS.Status", "getChangeFlags error", th);
            return null;
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9989600", new Object[0]);
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.getPageKeys();
            }
            zdh.a("TS.Status", "getPageKeys aidl service is empty");
            return null;
        } catch (Throwable th) {
            zdh.b("TS.Status", "getPageKeys error", th);
            return null;
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2107aac5", new Object[]{str});
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus == null) {
                return TScheduleStatusService.g(str);
            }
            return iTScheduleStatus.getPageUrl(str);
        } catch (Throwable th) {
            zdh.b("TS.Status", "getPageUrl error", th);
            return null;
        }
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e186b8c", new Object[]{str});
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.getRenderUrl(str);
            }
            zdh.a("TS.Status", "getRenderUrl aidl service is empty");
            return TScheduleStatusService.h(str);
        } catch (Throwable th) {
            zdh.b("TS.Status", "getRenderUrl error", th);
            return null;
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb356d69", new Object[0]);
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.getRenderUrls();
            }
            zdh.a("TS.Status", "isRenderUrl aidl service is empty");
            return null;
        } catch (Throwable th) {
            zdh.b("TS.Status", "isRenderUrl error", th);
            return null;
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e0de04", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                ITScheduleStatus iTScheduleStatus = f32204a;
                if (iTScheduleStatus == null) {
                    zdh.a("TS.Status", "removeRenderUrlByKey aidl service is empty");
                    TScheduleStatusService.k(str);
                    return;
                }
                iTScheduleStatus.removeRenderUrlByKey(str);
            } catch (Throwable th) {
                zdh.b("TS.Status", "removeRenderUrlByKey error", th);
            }
        }
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaa0ca", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.removeRenderUrlByValue(str);
            }
            zdh.a("TS.Status", "removeRenderUrlByValue aidl service is empty");
            return TScheduleStatusService.l(str);
        } catch (Throwable th) {
            zdh.b("TS.Status", "removeRenderUrlByValue error", th);
            return null;
        }
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else if (!cns.g(TScheduleInitialize.b())) {
            zdh.a("TS.Status", "not main process, discard reset status");
        } else {
            TScheduleStatusService.m();
        }
    }

    public static void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd32672", new Object[]{str, str2});
        } else if (!cns.g(TScheduleInitialize.b())) {
            zdh.a("TS.Status", "not main process, discard updatePageUrl");
        } else {
            TScheduleStatusService.n(str, str2);
        }
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82b147e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.isConfigrUrl(str);
            }
            zdh.a("TS.Status", "isConfigrUrl aidl service is empty");
            return false;
        } catch (Throwable th) {
            zdh.b("TS.Status", "isConfigrUrl error", th);
            return false;
        }
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44196b44", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ITScheduleStatus iTScheduleStatus = f32204a;
            if (iTScheduleStatus != null) {
                return iTScheduleStatus.isRenderUrl(str);
            }
            zdh.a("TS.Status", "isRenderUrl aidl service is empty");
            return TScheduleStatusService.j(str);
        } catch (Throwable th) {
            zdh.b("TS.Status", "isRenderUrl error", th);
            return false;
        }
    }
}
