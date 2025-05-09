package tb;

import android.os.Build;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698800);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4386d47b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableMultiLinkChatroom", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ba14be", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableDxSmartLiveRecommendPop", "true"));
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fddea8d", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "findViewBugFix", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52cf2518", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLandscapePKLink", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da110f07", new Object[0])).booleanValue();
        }
        z = yqq.h(v2s.o().p().b("tblive", "enableLikeAtmos", "false"));
        if (z && v2s.o().c() != null) {
            z = d4s.a("taolive", "enableLikeAtmos", "enable", true);
        }
        if (z) {
            if (xj7.a() != 2) {
                z = true;
            }
        }
        return z ? !yqq.f(Build.MODEL, v2s.o().p().b("tblive", "likeAtmosBlacklist", "")) : z;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59542298", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveRoomBackward", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a938347", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableMultiPKLinkMic", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec30e61", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowClubFans", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6a552df", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "EnablePkAnim", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("848d8bd8", new Object[0])).booleanValue();
        }
        return qvs.v0();
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30d9c462", new Object[0]);
        }
        return v2s.o().p().b("tblive", "fansClubPanelUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/fans-group/home?x-ssr=true");
    }

    public static Long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("4a2ebc5", new Object[0]);
        }
        return Long.valueOf(yqq.m(v2s.o().p().b("tblive", "muteVisiableTime", "10")));
    }

    public static float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7df10f70", new Object[0])).floatValue();
        }
        return yqq.j(v2s.o().p().b("tblive", "openQAWebViewLayerHeight", "0.6666"));
    }

    public static long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("179662c6", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "removeViewRecommendPopTime", IDecisionResult.ENGINE_ERROR));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7428e782", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "showPrivateVip", "true"));
    }
}
