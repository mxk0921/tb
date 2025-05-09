package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class y1m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_FROM_ALBUM = 1002;
    public static final int CODE_FROM_CAPTURE = 1003;
    public static final int CODE_TAKE_PHOTO = 1001;
    public static final int DEFAULT_MAX_IMAGE_SIZE = 1048576;
    public static final String ERROR_CODE_CAPTURE_ERROR = "SCREEN_CAPTURE_ERROR";
    public static final String ERROR_CODE_NO_PERMISSION = "NO_PERMISSION";
    public static final String ERROR_CODE_SELECT_ERROR = "SELECT_ERROR";
    public static final String ERROR_CODE_TAKE_PHOTO_ERROR = "TAKE_PHOTO_ERROR";
    public static final String ERROR_CODE_USER_CANCELED = "USER_CANCELED";
    public static final int MAX_VIDEO_SIZE = 83888680;
    public static final String TAG_IMG = "PhotoAbility";

    /* renamed from: a  reason: collision with root package name */
    public static final eji f31789a = new eji("IMAGE-SAVE", 3);

    static {
        t2o.a(126877724);
    }

    public static final eji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("ca89ece1", new Object[0]);
        }
        return f31789a;
    }
}
