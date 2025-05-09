package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f30792a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static long e = 0;

    static {
        t2o.a(779093355);
    }

    public static Map<String, String> a(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b105594", new Object[]{ux9Var, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("liveToken", ux9Var.p());
        hashMap.put("livesource", str);
        hashMap.put("entryLiveSource", up6.r(ux9Var));
        return hashMap;
    }

    public static void b(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435be9ce", new Object[]{ux9Var, str});
        } else if (ux9Var != null) {
            rbu.P("live_room_page_did_appear", a(ux9Var, str));
        }
    }

    public static void c(ux9 ux9Var, String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cdba88", new Object[]{ux9Var, str, new Long(j), new Long(j2)});
        } else if (ux9Var != null) {
            Map<String, String> a2 = a(ux9Var, str);
            a2.put("startPlayTs", String.valueOf(j));
            a2.put("decodeCompleteTs", String.valueOf(j2));
            rbu.P("live_room_page_first_frame_finish", a2);
        }
    }

    public static void d(Context context) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de7bc00", new Object[]{context});
            return;
        }
        HashMap hashMap = new HashMap();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!(activity.getIntent() == null || (data = activity.getIntent().getData()) == null)) {
                hashMap.put("liveId", data.getQueryParameter("id"));
            }
        }
        hashMap.put("onCreate", String.valueOf(e));
        long uptimeMillis = SystemClock.uptimeMillis();
        hashMap.put("surfaceRenderFirstFrame", String.valueOf(uptimeMillis));
        hashMap.put("duration", String.valueOf(uptimeMillis - e));
        rbu.P("live_room_page_onSurfaceRender_finsh", hashMap);
    }

    public static void e(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2fb389", new Object[]{ux9Var, str, str2});
        } else if (ux9Var != null) {
            Map<String, String> a2 = a(ux9Var, str);
            if (str2 == null || str2.isEmpty() || z9u.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(str)) {
                str2 = String.valueOf(0L);
            }
            a2.put("enterClickTs", str2);
            a2.put("onCreateTs", String.valueOf(f30792a));
            rbu.P("live_room_page_will_appear", a2);
        }
    }
}
