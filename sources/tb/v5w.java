package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.vpm.VPMManagerInstance;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v5w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f29800a = v5w.class.getSimpleName();

    static {
        t2o.a(468713640);
    }

    public static void b(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3a7ed", new Object[]{uq9Var});
        } else if (ju0.c()) {
            try {
                HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics("RefNetSpeed");
                if (hAMetrics != null) {
                    JSONObject jSONObject = new JSONObject(hAMetrics);
                    jSONObject.put("netlib_speed", z5r.l() * 1000);
                    String jSONObject2 = jSONObject.toString();
                    b.I(uq9Var, "vpm_ref_netspeed", jSONObject2, "", "", "");
                    ir9.b(f29800a, jSONObject2);
                }
            } catch (Throwable th) {
                ir9.c(f29800a, "", th);
            }
        }
    }

    public static void a(uq9 uq9Var, String str) {
        String str2;
        VideoControllerManager.a aVar;
        int i = 1;
        i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f610d5b", new Object[]{uq9Var, str});
        } else if (VideoControllerManager.l()) {
            try {
                VideoControllerManager.a g = VideoControllerManager.g(str);
                if (g != null) {
                    if (g.i <= 0 || (aVar = g.j) == null) {
                        str2 = "";
                    } else {
                        int i2 = g.d;
                        int i3 = aVar.d;
                        if (i2 != i3) {
                            i = i2 > i3 ? 2 : 3;
                        }
                        str2 = aVar.c;
                    }
                    b.I(uq9Var, "opti_bitrate_info", String.valueOf(i), g.c, str2, g.a());
                }
            } catch (Throwable th) {
                ir9.c(f29800a, "", th);
            }
        }
    }
}
