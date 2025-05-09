package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.p;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g8w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f19790a;
    public static Boolean b;

    static {
        t2o.a(468714245);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9314aa63", new Object[]{str});
        }
        ir9.b("VideoInfoRequest_PickPreloadController", "PickPreloadController,构建tab3请求链接");
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2?");
            sb.append("id=88888888&type=guangguang_pick&source=guangguang_pick&detailParameters={\"switchMode\":\"default\"}");
            sb.append("&extParams=");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb.append(URLEncoder.encode(str, "utf-8"));
        } catch (Throwable th) {
            th.printStackTrace();
            ir9.c("VideoInfoRequest_PickPreloadController", "", th);
        }
        return sb.toString();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38bb99b", new Object[0])).booleanValue();
        }
        if (b == null) {
            if (e0o.g() && e0o.b(o.J(), "request_new_iteminfo", false)) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc7341c0", new Object[0])).booleanValue();
        }
        if (f19790a == null) {
            if (e0o.g() && e0o.b(o.J(), "request_new_videoinfo", false)) {
                z = true;
            }
            f19790a = Boolean.valueOf(z);
        }
        return f19790a.booleanValue();
    }

    public static String d(Map map, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447ded0e", new Object[]{map, fluidContext});
        }
        String d = vrl.d(fluidContext);
        ntm preloadedVideo = ((IPreloadService) fluidContext.getService(IPreloadService.class)).getPreloadedVideo();
        if (preloadedVideo == null) {
            return d;
        }
        boolean z = preloadedVideo.o;
        if (!sz3.b(map) || !preloadedVideo.r || z || TextUtils.isEmpty(preloadedVideo.b)) {
            return d;
        }
        return preloadedVideo.b;
    }

    public static JSONObject e(Map map, String str, boolean z, boolean z2, int i, Map map2, boolean z3, FluidContext fluidContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5fc04a", new Object[]{map, str, new Boolean(z), new Boolean(z2), new Integer(i), map2, new Boolean(z3), fluidContext});
        }
        if (sz3.b(map)) {
            str2 = null;
        } else {
            str2 = JSON.toJSONString(map);
        }
        return jwi.b(z2, z, i, str, new pep(Uri.parse(a(str2))), map2, map, z3, fluidContext).build();
    }

    public static void g(Map map, String str, boolean z, boolean z2, int i, Map map2, boolean z3, IRemoteBaseListener iRemoteBaseListener, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b59f800", new Object[]{map, str, new Boolean(z), new Boolean(z2), new Integer(i), map2, new Boolean(z3), iRemoteBaseListener, fluidContext});
        } else {
            MtopModule.requestWithParserInner(new d.j(null, e(map, str, z, z2, i, map2, z3, fluidContext), null), iRemoteBaseListener, null, null, new ug7());
        }
    }

    public static void h(String str, String str2, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        boolean z2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3571fb7", new Object[]{str, str2, new Boolean(z), iRemoteBaseListener});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            z2 = b();
        } else {
            z2 = c();
        }
        if (z2) {
            str3 = "mtop.taobao.content.detail.video.info.encrypt";
            str4 = "1.0";
        } else {
            str3 = "mtop.taobao.content.detail.video.info";
            str4 = "2.0";
        }
        i(str3, str4, str, str2, z, iRemoteBaseListener);
    }

    public static void f(String str, String str2, String str3, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719c550a", new Object[]{str, str2, str3, new Boolean(z), iRemoteBaseListener});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) k75.VIDEOCONFIG_API_NAME);
        jSONObject.put("v", (Object) k75.VIDEOCONFIG_API_VERSION_3);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("videoId", str);
        } else {
            hashMap.put("videoId", "0");
        }
        hashMap.put("playScenes", str2);
        hashMap.put("from", str3);
        jSONObject.put("data", (Object) hashMap);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("prefetch", Boolean.TRUE);
            jSONObject.put("options", (Object) hashMap2);
        }
        MtopModule.requestWithParser(new d.j(null, jSONObject, null), iRemoteBaseListener, null);
    }

    public static void i(String str, String str2, String str3, String str4, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbee0d28", new Object[]{str, str2, str3, str4, new Boolean(z), iRemoteBaseListener});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) str);
        jSONObject.put("v", (Object) str2);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("videoId", str3);
        } else {
            hashMap.put("videoId", "0");
        }
        hashMap.put("type", "guangguang_pick");
        hashMap.put("source", "guangguang_pick");
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put(c4o.KEY_ENABLE_SERVER_ABR, "true");
        if (!TextUtils.isEmpty(str4)) {
            hashMap2.put("itemId", str4);
        }
        hashMap.put("extendParameters", JSON.toJSONString(hashMap2));
        jSONObject.put("data", (Object) hashMap);
        if (z) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("prefetch", Boolean.TRUE);
            jSONObject.put("options", (Object) hashMap3);
        }
        d.j jVar = new d.j(null, jSONObject, null);
        if (!z && iRemoteBaseListener != null && e0o.b(o.J(), "async_request_callback", false)) {
            jVar.h = p.f().h().c();
        }
        MtopModule.requestWithParser(jVar, iRemoteBaseListener, null);
    }
}
