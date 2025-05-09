package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f17408a = null;
    public static String b = null;
    public static boolean c = false;

    static {
        t2o.a(779092716);
    }

    public static String b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e2c4ef0", new Object[]{liveItem});
        }
        String str = null;
        if (liveItem == null) {
            return null;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
        if (timeMovingPlayInfo != null) {
            str = timeMovingPlayInfo.timeMovingM3u8Url;
        }
        if (TextUtils.isEmpty(str)) {
            return liveItem.extendVal.playUrl;
        }
        return str;
    }

    public static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4dbffe", new Object[]{str, str2, str3, str4});
            return;
        }
        String d = t90.d(str);
        if (!TextUtils.isEmpty(str4)) {
            nwa a2 = nwa.a(vx9.d());
            dxa b2 = dxa.b(vx9.d());
            String str5 = d + "&forceRefresh=true&livesource=" + str4 + "&productType=timemove";
            if (!TextUtils.isEmpty(str2)) {
                str5 = str5 + "&sjsdItemId=" + str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str5 + "&timeMovingSpfPlayVideo=" + Uri.encode(str3);
            }
            if (uwa.l()) {
                str5 = str5 + "&spm=a2141.8001249";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", str5);
            if (a2.c() != null) {
                String b3 = a2.c().b();
                if (!TextUtils.isEmpty(b3)) {
                    hashMap.put(yj4.HIGHLIGHT_TRANSPARENT_PARAMS, b3);
                }
            }
            String str6 = null;
            if ((vx9.d() instanceof cdr) && ((cdr) vx9.d()).Y0()) {
                new sya(vx9.d()).a(null, hashMap);
            }
            hashMap.put("highlightSignByRePlay", "true");
            if (b2.f() != null) {
                b2.f().b(vx9.d(), hashMap);
                return;
            }
            ux9 d2 = vx9.d();
            if (d2 != null) {
                str6 = d2.C();
            }
            sjr.g().c("com.taobao.taolive.room.mediaplatform_switch_room", hashMap, str6);
        }
    }

    public static void d(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d0a60c", new Object[]{str, ux9Var});
            return;
        }
        String str2 = t90.d(str) + "&forceRefresh=true&livesource=switchRoom";
        if (uwa.l()) {
            str2 = str2 + "&spm=a2141.8001249";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str2);
        hashMap.put("RePlaySignByhighlight", "true");
        sbu.e(ux9Var, "toPlaybackFromTimeMove", null);
        if (dxa.b(ux9Var).f() != null) {
            dxa.b(ux9Var).f().b(ux9Var, hashMap);
        }
    }

    public static void e(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23752b1a", new Object[]{context, str, new Boolean(z)});
        } else {
            voj.d(context, str, z);
        }
    }

    public static void a(HashMap<String, String> hashMap, Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55cb1f4", new Object[]{hashMap, context, ux9Var});
            return;
        }
        nwa a2 = nwa.a(ux9Var);
        dxa b2 = dxa.b(ux9Var);
        if (a2.c() != null) {
            if (b2.f() != null) {
                b2.f().k(ux9Var);
            }
            cv1 f = vx9.f(ux9Var);
            if (f instanceof cba) {
                cba cbaVar = (cba) f;
                a2.c().j(cbaVar);
                a2.c().e(cbaVar, context);
                f17408a = RecModel.MEDIA_TYPE_TIMEMOVE;
                up6.R0(0, ux9Var);
                String str = "switchTimemove";
                if ((ux9Var instanceof air) && uwa.p() && !TextUtils.isEmpty(cbaVar.F)) {
                    str = "switchTimemove." + cbaVar.F;
                }
                iba.W0(str, cbaVar);
                if (uwa.l()) {
                    iba.j1(sbu.c(ux9Var), cbaVar);
                } else if (uwa.m()) {
                    if (up6.q0(ux9Var)) {
                        iba.j1("a2141.23201685", cbaVar);
                    } else {
                        iba.j1("a2141.8001249", cbaVar);
                    }
                }
                a2.c().a(cbaVar, context, "Page_TaobaoLiveWatch");
                a2.c().h(ux9Var, context);
                a2.c().c(cbaVar, context);
            }
        }
        if (b2.f() != null) {
            b2.f().m(ux9Var, hashMap);
        }
    }
}
