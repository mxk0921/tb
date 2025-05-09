package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wxi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_KEY_BUNDLE_PARAM = "imageEditor.KEY_BUNDLE_PARAM";
    public static final String EXTRA_KEY_PIC_URI = "capture.KEY_IMAGE_URI";
    public static final Set<String> IRP_KEY_BLACK_LIST;
    public static final String KEY_ANIMATION_OPEN = "animation_open";
    public static final String KEY_AR_SCENE = "arScene";
    public static final String KEY_AR_TAB = "ar_tab";
    public static final String KEY_DISTANCE = "n_distance";
    public static final String KEY_FORCE_NEW_IRP = "force_new_irp";
    public static final String KEY_FROM_OUTER_APP = "fromOuterApp";
    public static final String KEY_FROM_SYS = "fromSys";
    public static final String KEY_IMAGE_ID = "image_id";
    public static final String KEY_IRP_GARBAGE = "irp_garbage";
    public static final String KEY_IRP_INTELLI = "irp_intelli";
    public static final String KEY_IRP_INTELLI_HINT = "irp_intelli_hint";
    public static final String KEY_IRP_JS_EXTRA = "_js_extra_json";
    public static final String KEY_IRP_PAGE_CONFIG = "irp_page_config";
    public static final String KEY_IRP_REGION = "region";
    public static final String KEY_IS_NATIVE_ALBUM_SHOW = "isNativeAlbumShow";
    public static final String KEY_IS_SCAN_MODE = "isScanMode";
    public static final String KEY_OPEN_HISTORY = "openHistory";
    public static final String KEY_ORIENTATION = "orientation";
    public static final String KEY_PHOTO_FROM = "photofrom";
    public static final String KEY_PIC_URL = "picurl";
    public static final String KEY_PRELOAD_KEY = "preload";
    public static final String KEY_PSSOURCE = "pssource";
    public static final String KEY_RATIO = "n_ratio";
    public static final String KEY_SCAN_ONLY = "scanOnly";
    public static final String KEY_SELLER_ID = "sellerId";
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_SHOP_ID = "shopId";
    public static final String KEY_SHOW_SYS_HISTORY_TAB = "show_sys_history_tab";
    public static final String KEY_SOURCE_ID = "source";
    public static final String KEY_TIPS = "tips";
    public static final String PSSOURCE_SYSTEM_ALBUM = "xtxc";
    public static final String SPM = "spm";

    public static boolean isLocalKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c900a53", new Object[]{str})).booleanValue();
        }
        return IRP_KEY_BLACK_LIST.contains(str);
    }

    static {
        t2o.a(481297097);
        HashSet hashSet = new HashSet();
        IRP_KEY_BLACK_LIST = hashSet;
        hashSet.add("pssource");
        hashSet.add(KEY_FROM_OUTER_APP);
        hashSet.add(KEY_PIC_URL);
        hashSet.add("orientation");
        hashSet.add(KEY_PHOTO_FROM);
        hashSet.add(KEY_ANIMATION_OPEN);
        hashSet.add(KEY_IRP_PAGE_CONFIG);
        hashSet.add(KEY_IRP_INTELLI);
        hashSet.add(KEY_IRP_GARBAGE);
        hashSet.add(KEY_IRP_INTELLI_HINT);
        hashSet.add(KEY_IRP_JS_EXTRA);
        hashSet.add("preload");
        hashSet.add("sellerId");
        hashSet.add("shopId");
        hashSet.add(KEY_RATIO);
        hashSet.add(KEY_DISTANCE);
    }
}
