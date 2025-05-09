package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mj4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_ALBUM_PAGE_NAME = "Page_TaoAlbumAlbum_Pi";
    public static final String ALBUM_ALBUM_SPM = "a2116i.11566232";
    public static final String ALBUM_PAGE_NAME = "Page_TaoAlbum_Pi";
    public static final String ALBUM_SPM = "a2116i.11566223";
    public static final String CONTROL_ALBUM = "Album";
    public static final String CONTROL_CLIP = "Clip";
    public static final String CONTROL_DETECT_POST_SUCCESS = "DetectPoseSuccess";
    public static final String CONTROL_EDIT = "Edit";
    public static final String CONTROL_FILTER = "Filter";
    public static final String CONTROL_GRAFFITI = "Graffiti";
    public static final String CONTROL_MOSAIC = "Mosaic";
    public static final String CONTROL_NAME_CANCEL = "Cancel";
    public static final String CONTROL_NAME_OK = "OK";
    public static final String CONTROL_PHOTO = "Photo";
    public static final String CONTROL_POSTURE = "Posture";
    public static final String CONTROL_STICKER = "Sticker";
    public static final String EDIT_PAGE_NAME = "Page_TaoAlbumEdit_Pi";
    public static final String EDIT_SPM = "a2116i.11566228";
    public static final String KEY_BIZ_ID = "bizid";
    public static final String KEY_OPTION = "option";
    public static final String KEY_SCORE = "score";
    public static final String KEY_SPM_CNT = "spm-cnt";
    public static final String PAGE_NAME = "Page_Pic_Publish";
    public static final String PREVIEW_PAGE_NAME = "Page_TaoAlbumPreview_Pi";
    public static final String PREVIEW_SPM = "a2116i.11566225";
    public static final String SPM_CNT = "a21xm.9439189.0.0";

    static {
        t2o.a(623902804);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f81aa51d", new Object[0]);
        }
        String sb = new StringBuilder().toString();
        if (!TextUtils.isEmpty(sb)) {
            return sb.substring(1);
        }
        return sb;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        }
    }
}
