package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698678);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ebcc59", new Object[0])).booleanValue();
        }
        if (!c() || giv.c() == null || !giv.c().b() || !b()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        VideoInfo.FavorHighlightCommentSwitch favorHighlightCommentSwitch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1039dca", new Object[0])).booleanValue();
        }
        VideoInfo c0 = up6.c0(vx9.d());
        return (c0 == null || (favorHighlightCommentSwitch = c0.favorHighlightCommentSwitch) == null || !"true".equals(favorHighlightCommentSwitch.enable)) ? false : true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dd37527", new Object[0])).booleanValue();
        }
        return d4s.e("enableHighLightComment", false);
    }

    public static void d(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98d6730", new Object[]{str, hashMap});
        } else if (giv.f() != null) {
            giv.f().f(str, hashMap);
        }
    }

    public static void e(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720dd665", new Object[]{str, hashMap});
        } else if (giv.f() != null) {
            giv.f().a(str, hashMap);
        }
    }
}
