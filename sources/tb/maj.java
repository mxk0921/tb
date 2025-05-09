package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class maj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDICATOR_COLOR = "indicatorColor";
    public static final String LABEL_IMAGE = "labelImage";
    public static final String MORE_IMAGE = "moreImage";
    public static final String SEARCH_BAR_BG_COLOR = "searchbarBgColor";
    public static final String SEARCH_BAR_BG_IMAGE = "searchbarBgImage";
    public static final String TAB_BG = "tabBg";
    public static final String TAB_IMAGE = "tabImage";
    public static final String TAB_TEXT_COLOR = "tabTextColor";
    public static final String TAB_TEXT_SIZE = "tabTextSize";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f23889a = new ConcurrentHashMap();

    static {
        t2o.a(729809478);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e624d54", new Object[]{str, str2})).booleanValue();
        }
        Map<String, String> map = f23889a;
        boolean equals = TextUtils.equals((String) ((ConcurrentHashMap) map).get(str), str2);
        if (!equals) {
            ((ConcurrentHashMap) map).put(str, str2);
        }
        return equals;
    }

    public static boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f1e57d", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(str, String.valueOf(i));
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e43218", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(str, str2);
    }
}
