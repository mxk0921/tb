package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779091992);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3acd08c6", new Object[0])).booleanValue();
        }
        boolean c = zqq.c(v2s.o().p().b("tblive", "TBLIVE_ORANGE_BFRTC_MiniLive_Enable", "true"));
        if (!c || !c()) {
            return c;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366b4096", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "TBLIVE_ORANGE_RTCLive_MiniLive_Enable_V2", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("718e4702", new Object[0])).booleanValue();
        }
        String b = v2s.o().p().b("tblive", "BFRTCDeviceBlackist", "");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = b.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
