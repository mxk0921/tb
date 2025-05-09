package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wh6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSET_DIR = "template/";
    public static final String ASSET_PRESET_TEMPLATE_INFOLIST = "/presetTemplateInfos.json";
    public static final String ASSET_PRESET_TEMPLATE_OTHER = "other";
    public static final String ASSET_PRESET_TEMPLATE_VERSION = "version";
    public static final String ASSET_SUB_PRESET_TEMPLATE_INFOLIST = "/subPresetTemplateInfos.json";
    public static final String DB_NAME = "dinamicx";
    public static final String DEFAULT_ROOT_DIR = "dinamicx/";
    public static final char DIR = '/';
    public static final String DX_MAIN_TEMPLATE_NAME = "main.dx";

    static {
        t2o.a(444597043);
    }

    public static long a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b82cd1f", new Object[]{strArr})).longValue();
        }
        long j = -1;
        if (strArr != null && strArr.length >= 1) {
            if (strArr.length == 1) {
                try {
                    return Long.valueOf(strArr[0]).longValue();
                } catch (NumberFormatException unused) {
                    return -1L;
                }
            } else {
                long j2 = -1;
                for (String str : strArr) {
                    try {
                        j2 = Long.valueOf(str).longValue();
                    } catch (NumberFormatException unused2) {
                    }
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
        }
        return j;
    }

    public static boolean b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdf17a66", new Object[]{dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(dXTemplateItem.f7343a) || dXTemplateItem.b <= -1) {
            return false;
        }
        return true;
    }

    public static boolean c(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b996270", new Object[]{str, dXTemplateItem})).booleanValue();
        }
        if (!b(dXTemplateItem) || TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }
}
