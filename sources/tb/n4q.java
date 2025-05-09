package tb;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.linkage.pop.small.SmallPopView;
import tb.ysr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24510a = false;

    static {
        t2o.a(573571155);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("babbd586", new Object[0]);
        }
        try {
            String b = b();
            jgh.a("SmallPopHelper", "SmallPopView.checkMamaCommercialSplashCanStart.result= " + b);
            return b;
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc1557f1", new Object[0]);
        }
        try {
            f24510a = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            ysr ysrVar = new ysr();
            if (!ysrVar.d()) {
                return "SDK_NOT_READY";
            }
            if (!lf4.f()) {
                return "ORANGE_DOWNGRADE";
            }
            if (ysrVar.c()) {
                return "HAS_REQUESTING_POP";
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("205f7678", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            ysr ysrVar = new ysr();
            if (!ysrVar.d()) {
                return "SDK_NOT_READY";
            }
            if (!lf4.f()) {
                return "ORANGE_DOWNGRADE";
            }
            ysr.a a2 = ysrVar.a(str);
            jgh.a("SmallPopHelper", "doIsMamaCommercialHasOtherLevelRequestingPop. indexId=" + str + ", popInfo=" + a2);
            if (a2 != null && !TextUtils.isEmpty(a2.c) && !TextUtils.isEmpty(a2.b)) {
                if (ysrVar.b(a2.b)) {
                    return "";
                }
                return "NO_OTHER_LAYER_POP";
            }
            return "NO_REQUESTING_POP";
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a6154af", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            ysr.a a2 = new ysr().a(str);
            if (a2 == null) {
                return "NO_REQUESTING_POP";
            }
            if (!SmallPopView.VIEW_TYPE.equals(a2.f32324a)) {
                return "NOT_SUPPORT_VIEW_TYPE";
            }
            View view = a2.e;
            if (view == null && !"true".equals(Boolean.valueOf(a2.d))) {
                return "VIEW_NOT_CREATED";
            }
            if (!(view instanceof SmallPopView)) {
                return "LAYER_TYPE_ERROR";
            }
            jgh.a("SmallPopHelper", "SmallPopView.doIsPopReadyToDisplay. view = SmallPopView");
            if (((SmallPopView) view).isPopReadyToDisplay()) {
                return "";
            }
            return "EXPOSE_NOT_READY";
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("843c23c3", new Object[]{str});
        }
        try {
            if (!lf4.f()) {
                return "ORANGE_CLOSE";
            }
            String c = c(str);
            jgh.a("SmallPopHelper", "SmallPopView.isMamaCommercialHasOtherLevelRequestingPop.result= " + c);
            return c;
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba674593", new Object[0])).booleanValue();
        }
        return f24510a;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb4ffc4", new Object[]{str});
        }
        try {
            if (!lf4.f()) {
                return "ORANGE_CLOSE";
            }
            String d = d(str);
            jgh.a("SmallPopHelper", "SmallPopView.isPopReadyToDisplay.indexId= " + str + ".result= " + d);
            return d;
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c80041df", new Object[]{str});
        }
        try {
            if (!lf4.f()) {
                return "ORANGE_CLOSE";
            }
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            ysr.a a2 = new ysr().a(str);
            jgh.a("SmallPopHelper", "notifyPopToChangeImg. indexId=" + str + ", popInfo=" + a2);
            if (a2 == null) {
                jgh.a("SmallPopHelper", "BootImagePopNaitveApi.notifyPopToChangeImg.popInfo= null");
                return "NO_REQUESTING_POP";
            } else if (!SmallPopView.VIEW_TYPE.equals(a2.f32324a)) {
                return "NOT_SUPPORT_VIEW_TYPE";
            } else {
                View view = a2.e;
                if (view == null && !"true".equals(Boolean.valueOf(a2.d))) {
                    return "VIEW_NOT_CREATED";
                }
                if (!(view instanceof SmallPopView)) {
                    return "LAYER_TYPE_ERROR";
                }
                if (((SmallPopView) view).changeImg()) {
                    return "";
                }
                return "EXPOSE_NOT_READY";
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbc440f0", new Object[]{str});
        }
        try {
            if (!lf4.f()) {
                return "ORANGE_CLOSE";
            }
            String e = e(str);
            jgh.a("SmallPopHelper", "SmallPopView.notifyPopToDisplay.indexId= " + str + ".result= " + e);
            return e;
        } catch (Throwable th) {
            jgh.a("SmallPopHelper", "SmallPopView.notifyPopToDisplay.error= " + th.getMessage());
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb1422a5", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            f24510a = true;
            ysr.a a2 = new ysr().a(str);
            jgh.a("SmallPopHelper", "doNotifyPopToDisplay. indexId=" + str + ", popInfo=" + a2);
            if (a2 == null) {
                return "NO_REQUESTING_POP";
            }
            if (!SmallPopView.VIEW_TYPE.equals(a2.f32324a)) {
                return "NOT_SUPPORT_VIEW_TYPE";
            }
            View view = a2.e;
            if (view == null && !"true".equals(Boolean.valueOf(a2.d))) {
                return "VIEW_NOT_CREATED";
            }
            if (!(view instanceof SmallPopView)) {
                return "LAYER_TYPE_ERROR";
            }
            jgh.a("SmallPopHelper", "SmallPopView.doNotifyPopToDisplay. view = SmallPopView");
            if (((SmallPopView) view).notifyDisplay()) {
                return "";
            }
            return "EXPOSE_NOT_READY";
        } catch (Throwable th) {
            th.printStackTrace();
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }
}
