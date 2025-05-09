package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long b;
    public static String f;
    public static String g;
    public static long i;
    public static long j;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28086a = sj9.class.getSimpleName();
    public static int c = 0;
    public static String d = null;
    public static int e = Integer.MIN_VALUE;
    public static String h = "-1";

    static {
        t2o.a(779093350);
    }

    public static void A(Context context, boolean z) {
        View findViewById;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3bf6c4", new Object[]{context, new Boolean(z)});
        } else if (s() && !pvs.c1() && (context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.taolive_top_afc_loading)) != null) {
            if (!z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }

    public static void B(ViewGroup viewGroup, boolean z) {
        View findViewById;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82b80bd", new Object[]{viewGroup, new Boolean(z)});
        } else if (s() && !pvs.c1() && viewGroup != null && (findViewById = viewGroup.findViewById(R.id.taolive_top_afc_loading)) != null) {
            if (!z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }

    public static void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70c4197", new Object[0]);
        } else {
            H(null, "simple_live_detail_response", l(), null, true);
        }
    }

    public static void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9056fce1", new Object[]{str});
        } else if (u()) {
            TLog.loge("apm", f28086a + "_InitTaoLiveColdLaunch_" + str);
        }
    }

    public static void E(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb25db9", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        uTHitBuilders$UTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void F(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4054cf36", new Object[]{ux9Var, str});
        } else {
            H(ux9Var, str, l(), null, false);
        }
    }

    public static void G(ux9 ux9Var, String str, long j2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb94a5", new Object[]{ux9Var, str, new Long(j2), hashMap});
        } else {
            H(ux9Var, str, j2, hashMap, false);
        }
    }

    public static void I(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5635e411", new Object[]{ux9Var});
            return;
        }
        long l = l();
        j = l;
        G(ux9Var, "video_launch_play", l, null);
    }

    public static void a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f706531", new Object[]{ux9Var});
        } else {
            F(ux9Var, "comp_list_request");
        }
    }

    public static void b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d5b55d", new Object[]{ux9Var});
        } else {
            F(ux9Var, "comp_list_response");
        }
    }

    public static void c(ux9 ux9Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e643d6", new Object[]{ux9Var, hashMap});
        } else {
            G(ux9Var, "dx_panel_detail_request", l(), hashMap);
        }
    }

    public static void d(ux9 ux9Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf54cc2", new Object[]{ux9Var, hashMap});
        } else {
            G(ux9Var, "dx_panel_detail_response", l(), hashMap);
        }
    }

    public static void e(ux9 ux9Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22df781", new Object[]{ux9Var, hashMap});
        } else {
            G(ux9Var, "dx_panel_render_begin", l(), hashMap);
        }
    }

    public static void f(ux9 ux9Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2cf5cb", new Object[]{ux9Var, hashMap});
        } else {
            G(ux9Var, "dx_panel_render_finish", l(), hashMap);
        }
    }

    public static void g(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39be8b5", new Object[]{ux9Var});
            return;
        }
        long l = l();
        i = l;
        G(ux9Var, "first_frame_render_finish", l, null);
    }

    public static void h(long j2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916fed3c", new Object[]{new Long(j2), new Boolean(z), str});
        } else {
            j(j2, z, str, false, null);
        }
    }

    public static void j(long j2, boolean z, String str, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6b80e2", new Object[]{new Long(j2), new Boolean(z), str, new Boolean(z2), str2});
        } else {
            i(j2, z, null, null, str, z2, str2);
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[0]);
        }
        if (u()) {
            return f;
        }
        return "";
    }

    public static long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    public static long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecefd714", new Object[0])).longValue();
        }
        if (s()) {
            long j2 = i;
            if (j2 > 0) {
                long j3 = j;
                if (j3 > 0) {
                    return j2 - j3;
                }
            }
        }
        return 0L;
    }

    public static void n(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a250b2d4", new Object[]{ux9Var});
        } else {
            H(ux9Var, "h5_container_init_begin", l(), null, true);
        }
    }

    public static void o(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9b6d46", new Object[]{ux9Var});
        } else {
            H(ux9Var, "h5_container_init_finish", l(), null, true);
        }
    }

    public static void p(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac17ad5", new Object[]{ux9Var});
        } else {
            H(ux9Var, "h5_url_start_load", l(), null, true);
        }
    }

    public static void q(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36910d6", new Object[]{ux9Var});
        } else {
            F(ux9Var, "h5_webview_init_success");
        }
    }

    public static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d1da0c", new Object[0]);
        } else {
            H(null, "init_afc_cold_launch", l(), null, true);
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e850742", new Object[0])).booleanValue();
        }
        if (!u() || c != 1) {
            return false;
        }
        return true;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf7afb89", new Object[0])).booleanValue();
        }
        if (c == 1) {
            return true;
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("725c22e7", new Object[0])).booleanValue();
        }
        int i2 = e;
        if (i2 > 1 || i2 < 0) {
            return false;
        }
        return true;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbe7cfd", new Object[0])).booleanValue();
        }
        if (!u() || c == 0) {
            return false;
        }
        return true;
    }

    public static void w(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca68b21", new Object[]{ux9Var});
        } else {
            F(ux9Var, "live_detail_request");
        }
    }

    public static void x(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411bd5f7", new Object[]{ux9Var, str});
            return;
        }
        h = str;
        F(ux9Var, "live_detail_response");
    }

    public static void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[0]);
            return;
        }
        e++;
        D("onWillAppear");
    }

    public static void H(ux9 ux9Var, String str, long j2, HashMap<String, String> hashMap, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f77b2cf", new Object[]{ux9Var, str, new Long(j2), hashMap, new Boolean(z)});
            return;
        }
        try {
            if (u() || z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("session_id", f);
                hashMap2.put("timestamp", String.valueOf(j2));
                hashMap2.put("is_first_liveroom", String.valueOf(u()));
                hashMap2.put("live_source", g);
                hashMap2.put("livesource", g);
                if (c != 1) {
                    z2 = false;
                }
                hashMap2.put("isAfcColdContext", String.valueOf(z2));
                hashMap2.put("FlagAfcColdContext", String.valueOf(c));
                hashMap2.put("spm", d);
                hashMap2.put("entry_live_source", g);
                hashMap2.put("room_status", h);
                if (gq0.i() != null) {
                    hashMap2.put("is_login", String.valueOf(gq0.i().checkSessionValid()));
                }
                hashMap2.put("timestampSystemClock", String.valueOf(SystemClock.uptimeMillis()));
                if (hashMap != null) {
                    hashMap2.putAll(hashMap);
                }
                if (v2s.o().E() == null) {
                    E("Page_TaobaoLiveWatch", str, hashMap2);
                } else if (ux9Var == null) {
                    v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, hashMap2);
                } else {
                    rbu.K(ux9Var, str, hashMap2);
                }
                D(str + " time " + new Date(j2).toString() + " " + (j2 % 1000) + " timeLen " + (j2 - b) + " timestampSystemClock " + SystemClock.uptimeMillis());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void z(String str, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fee08f", new Object[]{str, jSONObject});
        } else if (jSONObject != null) {
            jSONObject.put("session_id", (Object) f);
            jSONObject.put("timestamp", (Object) String.valueOf(l()));
            jSONObject.put("timestampSystemClock", (Object) String.valueOf(SystemClock.uptimeMillis()));
            jSONObject.put("is_first_liveroom", (Object) String.valueOf(u()));
            if (c != 1) {
                z = false;
            }
            jSONObject.put("isAfcColdContext", (Object) String.valueOf(z));
            jSONObject.put("FlagAfcColdContext", (Object) String.valueOf(c));
            jSONObject.put("spm", (Object) d);
            long l = l();
            D("putFirstStartTrackParams " + str + " time " + new Date(l).toString() + " " + l + " timeLen " + (l - b) + " timestampSystemClock " + SystemClock.uptimeMillis() + " " + jSONObject.toJSONString());
        }
    }

    public static void i(long j2, boolean z, String str, String str2, String str3, boolean z2, String str4) {
        String str5;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbe994e", new Object[]{new Long(j2), new Boolean(z), str, str2, str3, new Boolean(z2), str4});
            return;
        }
        e = 0;
        b = j2;
        g = str3;
        d = str2;
        if (z) {
            c = 1;
        } else if ("1".equals(str)) {
            c = 2;
        } else if (TextUtils.isEmpty(str2) || !str2.startsWith("huitui.huitui")) {
            c = 0;
        } else {
            c = 3;
        }
        f = UUID.randomUUID().toString();
        i = 0L;
        j = 0L;
        rc.c(str3);
        HashMap hashMap = new HashMap();
        hashMap.put("isLive", String.valueOf(z2));
        String queryParameter = (TextUtils.isEmpty(str4) || (parse = Uri.parse(str4)) == null) ? null : parse.getQueryParameter(yj4.PARAM_TCP_OUTER_PARAM);
        if (TextUtils.isEmpty(queryParameter)) {
            str5 = "false";
        } else {
            str5 = "true";
        }
        hashMap.put("hasTcpOuterParams", str5);
        hashMap.put("tcpOuterParams", queryParameter);
        G(null, "first_init", b, hashMap);
    }
}
