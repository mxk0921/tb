package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d11 f29682a;

    public static d11 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("6c157b5f", new Object[0]);
        }
        if (f29682a == null) {
            f29682a = new d11("mtop.ovs.compass.cn.homepage.recommend", "1.0");
        }
        return f29682a;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d525bead", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                a.Z(Integer.valueOf(Color.parseColor("#837d83")), Integer.valueOf(Color.parseColor("#666666")), Integer.valueOf(Color.parseColor("#252126")));
                a.P(Integer.valueOf(Color.parseColor("#666666")));
            } else {
                a.Z(null, null, null);
                a.P(null);
            }
        } catch (Exception unused) {
        }
    }
}
