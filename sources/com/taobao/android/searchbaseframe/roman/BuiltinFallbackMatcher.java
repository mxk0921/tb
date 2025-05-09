package com.taobao.android.searchbaseframe.roman;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bpl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BuiltinFallbackMatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLT_CAMERA = "plt-camera";
    public static final String PLT_CAMERA_I18N = "i18n-camera-page-2023";
    public static final String PLT_CAMERA_TAB_3 = "plt_camera_page_tab3";
    public static final String PLT_IRP = "image-search-2022";
    public static final String PLT_IRP_I18N = "i18n-image-search-2022";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, bpl<String, Integer>> f9346a = new HashMap<String, bpl<String, Integer>>() { // from class: com.taobao.android.searchbaseframe.roman.BuiltinFallbackMatcher.1
        {
            put(BuiltinFallbackMatcher.PLT_CAMERA, bpl.a("https://g.alicdn.com/asr-pages/camera-page-2023/0.0.49/weex/home.v20.wlm", 23));
            put("plt_camera_page_tab3", bpl.a("https://g.alicdn.com/asr-pages/plt_camera_page_tab3/0.0.1/weex/home.v20.wlm", 1));
            put(BuiltinFallbackMatcher.PLT_CAMERA_I18N, bpl.a("https://g.alicdn.com/tmall-ovs-rax/i18n-camera-page-2023/0.0.55/weex/home.v20.wlm", 1));
            put(BuiltinFallbackMatcher.PLT_IRP, bpl.a("https://g.alicdn.com/imagesearch-page/image-search-2022/1.0.50/weex/home.v20.wlm", 1));
        }
    };

    static {
        t2o.a(993001929);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4abc5902", new Object[0]);
        }
        if (Localization.o()) {
            return "i18n-camera-page-2023,i18n-image-search-2022";
        }
        return "plt-camera,image-search-2022,plt_camera_page_tab3";
    }

    public static bpl<String, Integer> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("be8db296", new Object[]{str});
        }
        return (bpl) ((HashMap) f9346a).get(str);
    }
}
