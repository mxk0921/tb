package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_URL_PRE_1 = "http://item.taobao.com/item.htm";
    public static final String DETAIL_URL_PRE_1s = "https://item.taobao.com/item.htm";
    public static final String DETAIL_URL_PRE_2 = "http://a.m.taobao.com/";
    public static final String DETAIL_URL_PRE_2s = "https://a.m.taobao.com/";
    public static final int ERROR_DECODE_FAILED = -3;
    public static final int ERROR_DOWNLOAD_FAILED = -4;
    public static final int ERROR_EMPTY_PATH = -2;
    public static final int ERROR_INVALID_CHANNEL = -7;
    public static final int ERROR_TOO_SMALL = -5;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UPLOAD_FAILED = -6;
    public static final int MSG_FILE_UPLOAD_FAILED = 30001;
    public static final int MSG_FILE_UPLOAD_SUCCESS = 30000;
    public static final int PERMISSION_TYPE_ALBUM = 1;
    public static final int PERMISSION_TYPE_CAMERA = 0;
    public static final String REGION_SCAN = "regionScan";
    public static final String REGION_SEARCH = "regionSearch";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f26338a;
    public static final String h5_daily = "http://wapp.waptest.taobao.com";
    public static final String h5_online = "http://h5.m.taobao.com";
    public static final String h5_pre = "http://wapp.wapa.taobao.com";
    public static final String TIP_ERROR = Localization.q(R.string.taobao_app_1007_1_19003);
    public static final String TIP_NETWORK_OFFLINE = Localization.q(R.string.taobao_app_1007_1_19025);
    public static final String TIP_IMAGE_UPLOAD_ERROR = Localization.q(R.string.taobao_app_1007_1_19007);
    public static final String TIP_DECODE_FAILED = Localization.q(R.string.taobao_app_1007_1_19016);
    public static final String TIP_IMAGE_DOWNLOAD_ERROR = Localization.q(R.string.taobao_app_1007_1_18998);

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f490891", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f26338a) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    static {
        t2o.a(481296388);
        LinkedList linkedList = new LinkedList();
        f26338a = linkedList;
        linkedList.add(DETAIL_URL_PRE_1);
        linkedList.add(DETAIL_URL_PRE_1s);
        linkedList.add(DETAIL_URL_PRE_2);
        linkedList.add(DETAIL_URL_PRE_2s);
        linkedList.add("http://s.taobao.com/search?");
    }
}
