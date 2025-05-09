package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909821);
    }

    public static final int a(AppManifest.Page page) {
        int i;
        List<String> children;
        JSONObject groupConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aea8b0b", new Object[]{page})).intValue();
        }
        ckf.g(page, "<this>");
        try {
            groupConfig = page.getGroupConfig();
        } catch (Exception unused) {
        }
        if (groupConfig == null) {
            i = 0;
            children = page.getChildren();
            if (children != null && i >= 0 && i < children.size()) {
                return i;
            }
            return 0;
        }
        i = groupConfig.getIntValue("defaultIndex");
        children = page.getChildren();
        if (children != null) {
            return i;
        }
        return 0;
    }

    public static final boolean b(AppManifest.Page page) {
        List<String> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49deaad9", new Object[]{page})).booleanValue();
        }
        ckf.g(page, "<this>");
        return ckf.b(page.getPageType(), "swiper") && (children = page.getChildren()) != null && !children.isEmpty();
    }
}
