package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y5v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTER_ID = "filter_id";
    public static final String KEY_FILTER_ID = "ugc_utFilterId";
    public static final String KEY_STICKER_IDS = "ugc_utStickerIds";
    public static final String KEY_STICKER_URLS = "ugc_utStickerUrls";
    public static final String KEY_TEMPLATES_ID = "ugc_utTemplatesApplied";
    public static final String STICKER_IDS = "sticker_ids";
    public static final String STICKER_URLS = "sticker_urls";
    public static final String TEMPLATE_APPLIED = "templatesApplied";
    public static final String TEMPLATE_ID = "template_id";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f31875a = new HashMap();

    static {
        t2o.a(782237724);
    }

    public static synchronized void a(String str) {
        String str2;
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a49b0c4", new Object[]{str});
                return;
            }
            Map<String, String> map = f31875a;
            String str3 = (String) ((HashMap) map).get(KEY_STICKER_URLS);
            if (TextUtils.isEmpty(str3)) {
                str2 = "";
            } else {
                str2 = str3 + ",";
            }
            ((HashMap) map).put(KEY_STICKER_URLS, str2 + str);
        }
    }

    public static synchronized void b() {
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c823e69b", new Object[0]);
            } else {
                ((HashMap) f31875a).clear();
            }
        }
    }

    public static synchronized String c() {
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fb9454bf", new Object[0]);
            }
            return (String) ((HashMap) f31875a).get(KEY_TEMPLATES_ID);
        }
    }

    public static synchronized String d(String str) {
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
            }
            return (String) ((HashMap) f31875a).get(str);
        }
    }

    public static synchronized void e(String str) {
        String str2;
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b22e4a7", new Object[]{str});
                return;
            }
            Map<String, String> map = f31875a;
            String str3 = (String) ((HashMap) map).get(KEY_STICKER_URLS);
            if (!TextUtils.isEmpty(str3)) {
                String str4 = "," + str;
                String str5 = str + ",";
                if (str3.endsWith(str4)) {
                    str2 = str3.replace(str4, "");
                } else {
                    str2 = str3.replace(str5, "");
                }
                ((HashMap) map).put(KEY_STICKER_URLS, str2);
            }
        }
    }

    public static synchronized void f(String str, String str2) {
        synchronized (y5v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8d794a", new Object[]{str, str2});
            } else {
                ((HashMap) f31875a).put(str, str2);
            }
        }
    }
}
