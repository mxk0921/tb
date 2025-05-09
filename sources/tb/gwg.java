package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699595);
    }

    public static void a(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f444bb5", new Object[]{ux9Var, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "LayerThickness_MiniProfile_Footer", hashMap);
    }

    public static void b(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dba53", new Object[]{ux9Var, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "LayerThickness_MiniProfile_HeadPortrait", hashMap);
    }

    public static void c(ux9 ux9Var, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a34ffc", new Object[]{ux9Var, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "chatGroup");
        hashMap.put("spm-cnt", "a2141.8001249");
        if (z) {
            str2 = "NORMAL";
        } else {
            str2 = "UNFOLLOW";
        }
        hashMap.put("followDegree", str2);
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "LayerThickness_MiniProfile_GuideIcon", hashMap);
    }

    public static void d(ux9 ux9Var, boolean z, String str, boolean z2) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afea09de", new Object[]{ux9Var, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "NORMAL";
        } else {
            str2 = "UNFOLLOW";
        }
        hashMap.put("followDegree", str2);
        if (z2) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put("is_tag", str3);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "pageAnchor_Tag", hashMap);
    }

    public static void e(ux9 ux9Var, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd108b5", new Object[]{ux9Var, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_location", "miniprofile");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_tag", str2);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "AccountFollow", hashMap);
    }

    public static void f(ux9 ux9Var, boolean z, long j, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce4b7da", new Object[]{ux9Var, new Boolean(z), new Long(j), str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (z) {
            str2 = "NORMAL";
        } else {
            str2 = "UNFOLLOW";
        }
        hashMap.put("followDegree", str2);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        giv.f().p(ux9Var, "LayerThickness_MiniProfile_End", hashMap);
    }

    public static void g(ux9 ux9Var, boolean z, String str, boolean z2, boolean z3, boolean z4) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fae5c91", new Object[]{ux9Var, new Boolean(z), str, new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (z) {
            str2 = "NORMAL";
        } else {
            str2 = "UNFOLLOW";
        }
        hashMap.put("followDegree", str2);
        String str3 = "0";
        hashMap.put("is_tag", z2 ? "1" : str3);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("is_addAnchor", z3 ? "1" : str3);
        if (z4) {
            str3 = "1";
        }
        hashMap.put("addType", str3);
        hashMap.put("sourceType", str);
        giv.f().p(ux9Var, "LayerThickness_MiniProfile", hashMap);
    }

    public static void h(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382c807b", new Object[]{ux9Var, str, str2});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        hashMap.put("dynamic_type", str2);
        hashMap.put("spm-url", up6.U(ux9Var));
        giv.f().p(ux9Var, "LayerThickness_MiniProfile_GuideCast", hashMap);
    }

    public static void i(ux9 ux9Var, String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5974e71", new Object[]{ux9Var, str, str2, new Boolean(z)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", str);
        if (z) {
            str3 = "NORMAL";
        } else {
            str3 = "UNFOLLOW";
        }
        hashMap.put("followDegree", str3);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str2);
        giv.f().p(ux9Var, "LayerThickness_MiniProfile_GuideIcon", hashMap);
    }

    public static void j(ux9 ux9Var, boolean z, String str, HashMap<String, String> hashMap, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb2c371", new Object[]{ux9Var, new Boolean(z), str, hashMap, str2});
            return;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        if (z) {
            str3 = "NORMAL";
        } else {
            str3 = "UNFOLLOW";
        }
        hashMap2.put("followDegree", str3);
        hashMap2.put("spm-cnt", "a2141.8001249");
        hashMap2.put("sourceType", str);
        hashMap2.put("spm-url", up6.U(ux9Var));
        giv.f().p(ux9Var, str2, hashMap2);
    }

    public static void k(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566aebf4", new Object[]{ux9Var, str, str2});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", str);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str2);
        giv.f().p(ux9Var, "LayerThickness_MiniProfile_FeedCard", hashMap);
    }

    public static void l(long j, int i, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, Context context) {
        String str;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4588da79", new Object[]{new Long(j), new Integer(i), ux9Var, tBLiveDataModel, context});
            return;
        }
        HashMap hashMap = new HashMap();
        if (j > 0) {
            hashMap.put("clickAvatarTimeDifference", String.valueOf(System.currentTimeMillis() - j));
        }
        hashMap.put("clickAvatarNumber", String.valueOf(i));
        String str2 = "0";
        if (p3u.b(tBLiveDataModel, context)) {
            str = "1";
        } else {
            str = str2;
        }
        hashMap.put("isTriggerPrePrender", str);
        VideoInfo c0 = up6.c0(vx9.d());
        if (!(c0 == null || (accountInfo = c0.broadCaster) == null)) {
            if (accountInfo.follow) {
                str2 = "1";
            }
            hashMap.put(gt9.MTOP_ISFOLLOW, str2);
        }
        if (giv.f() != null) {
            giv.f().m(ux9Var, "Avatar_CLK", hashMap);
        }
    }

    public static void m(ux9 ux9Var, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162d25c", new Object[]{ux9Var, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_tag", str2);
        hashMap.put("sourceType", str);
        giv.f().m(ux9Var, "LayerThickness_MiniProfile_UnFollow", hashMap);
    }
}
