package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.devtools.IDevToolsService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c5g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_NAME_ALBUM = "album";
    public static final String SCENE_NAME_LIVE = "live";
    public static final String SCENE_NAME_VIDEO = "video";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Boolean> f16873a = new HashMap<>();
    public static HashMap<String, String> b = null;

    static {
        t2o.a(468714601);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1af5295c", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (akt.q2("disable_" + str)) {
            return false;
        }
        if (akt.q2("enable_" + str)) {
            return true;
        }
        return lwv.a(akt.G2("AB_fullscreenpage_android.kirinAB." + str, Boolean.toString(z)), z);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        HashMap<String, Boolean> hashMap = f16873a;
        Boolean bool = hashMap.get(str);
        if (bool == null) {
            bool = Boolean.valueOf(a(str, z));
            hashMap.put(str, bool);
        }
        return bool.booleanValue();
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4886794b", new Object[]{str})).booleanValue();
        }
        return b("kirin_" + str, FluidSDK.isBetaAppPackage());
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c23b67f5", new Object[]{str})).booleanValue();
        }
        return b("std_" + str, FluidSDK.isBetaAppPackage());
    }

    public static boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28672b3a", new Object[]{fluidContext})).booleanValue();
        }
        i(fluidContext);
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3628d0ba", new Object[0])).booleanValue();
        }
        return b("useSameVideoDWCreatorForFirst", FluidSDK.isBetaAppPackage());
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a435b8ca", new Object[0])).booleanValue();
        }
        return b("useSameVideoDWCreatorForList", FluidSDK.isBetaAppPackage());
    }

    public static HashMap<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("25ce72e", new Object[0]);
        }
        if (b == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            b = hashMap;
            hashMap.put("video_sameCreatorForFirst", Boolean.toString(f()));
            b.put("video_sameCreatorForList", Boolean.toString(g()));
            b.put("video_kirin", Boolean.toString(c("video")));
            b.put("video_std", Boolean.toString(d("video")));
            b.put("live_kirin", Boolean.toString(c("live")));
            b.put("live_std", Boolean.toString(d("live")));
            b.put("album_kirin", Boolean.toString(c("album")));
            b.put("album_std", Boolean.toString(d("album")));
        }
        return b;
    }

    public static void i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141bdf88", new Object[]{fluidContext});
            return;
        }
        String str = "【视频】首坑统一创建: " + f() + "\t\t其他坑位统一创建: " + g() + "\t\tkirin: " + c("video") + "\t\t标准化: " + d("video") + "\n【直播】kirin: " + c("live") + "\t\t标准化: " + d("live") + "\n【图集】kirin: " + c("album") + "\t\t标准化: " + d("album");
        ir9.b("KirinConfig", "printConfig:" + str);
        IDevToolsService iDevToolsService = (IDevToolsService) fluidContext.getService(IDevToolsService.class);
        if (iDevToolsService != null) {
            iDevToolsService.setDebugText(str);
        }
    }
}
