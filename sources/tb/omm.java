package tb;

import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class omm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25491a;

        public a(View view) {
            this.f25491a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qtm.n(this.f25491a);
            }
        }
    }

    static {
        t2o.a(468714663);
    }

    public static boolean d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f019f48", new Object[0])).booleanValue();
        }
        if (e0o.f("video")) {
            str = "softwareInHuitui";
        } else if (e0o.e("video")) {
            str = "softwareInColdLauncher";
        } else {
            str = "softwareInHotLauncher";
        }
        return e0o.b(o.J(), str, false);
    }

    public static HashMap<String, String> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("83941ab1", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("videoActionType", "init");
        hashMap.put(atb.EXP_KEY_PRECREATED_DW, "true");
        hashMap.put(atb.EXP_KEY_FULL_PAGE_INDEX, "0");
        hashMap.put(atb.EXP_KEY_SUB_BUSINESS_TYPE, "guangguang_pick");
        hashMap.put("isLocalVideo", String.valueOf(z));
        hashMap.put(atb.EXP_KEY_IS_HUITUI, String.valueOf(e0o.f("video")));
        hashMap.put(atb.EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo, String.valueOf(d()));
        HashMap<String, String> v = d5w.v(false);
        if (!sz3.b(v)) {
            hashMap.putAll(v);
        }
        if (e0o.e("video")) {
            hashMap.put("isFromLauncher", "true");
            hashMap.put("processLauncherFlag", "1");
        }
        return hashMap;
    }

    public static HashMap<String, String> c(String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c112eaac", new Object[]{str, map, new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", str);
        hashMap.put("x_bizline", "guangguang");
        hashMap.put("index", "0");
        hashMap.put("videoid", str);
        hashMap.put("version", AfcCustomSdk.SDK_VERSION);
        hashMap.put("xubo", "0");
        hashMap.put("sourceType", "guangguang_pick");
        hashMap.put("content_id", str);
        hashMap.put("spm", "a310p.13800399.0.0");
        hashMap.put("spm-cnt", "a310p.13800399.0.0");
        hashMap.put("sourceGroup", "guangguang");
        hashMap.put("source", "guangguang_pick");
        hashMap.put("page", "guangguang_pick");
        hashMap.put("cid", str);
        hashMap.put("x_object_id", str);
        hashMap.put("x_object_type", "common_video_page");
        hashMap.put("content_type", "video");
        hashMap.put("product_type", xau.PRODUCT_NAME);
        hashMap.put(atb.EXP_KEY_PRECREATED_DW, "true");
        hashMap.put("platform", "phone");
        if (e0o.e("video")) {
            hashMap.put("isFromLauncher", "true");
            hashMap.put("processLauncherFlag", "1");
        }
        hashMap.put("isLocalVideo", String.valueOf(z));
        hashMap.put(atb.EXP_KEY_IS_HUITUI, String.valueOf(e0o.f("video")));
        if (map != null) {
            hashMap.putAll(map);
            if (akt.p2("ShortVideo.addUtLogMapForPreDW", true)) {
                hashMap.put("utLogMap", JSON.toJSONString(map));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<tb.atb, java.lang.String> a(com.taobao.android.fluid.core.FluidContext r32, android.content.Context r33, boolean r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, android.view.ViewGroup r38, java.util.Map r39, com.taobao.android.fluid.framework.preload.cache.DetailCacheData r40) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.omm.a(com.taobao.android.fluid.core.FluidContext, android.content.Context, boolean, java.lang.String, java.lang.String, java.lang.String, android.view.ViewGroup, java.util.Map, com.taobao.android.fluid.framework.preload.cache.DetailCacheData):android.util.Pair");
    }
}
