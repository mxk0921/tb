package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093435);
    }

    public static String c(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b60728f", new Object[]{videoInfo});
        }
        if (videoInfo == null || v2s.o().u() == null) {
            return "";
        }
        return doh.d(System.currentTimeMillis() + v2s.o().u().getUserId() + videoInfo.liveId);
    }

    public static VideoInfo e(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("585c4350", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null) {
            tBLiveDataModel = e7w.h(null);
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mVideoInfo;
        }
        return null;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37a39b9", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : pvs.d2()) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db57fed8", new Object[]{str})).intValue();
        }
        return "shop".equals(str) ? 1 : 2;
    }

    public static String d(String str, String str2, String str3) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d03eee8b", new Object[]{str, str2, str3});
        }
        if (!d4s.e("enableLiveItemId", true)) {
            return null;
        }
        return (!f(str2) || (d = fkx.d(str3)) == null || TextUtils.isEmpty(d.getString("item_id"))) ? str : d.getString("item_id");
    }

    public static String b(String str, Uri uri) {
        String[] split;
        String str2;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc3aeb40", new Object[]{str, uri});
        }
        if (TextUtils.isEmpty(str)) {
            if (!(uri == null || !"tpp_88".equals(uri.getQueryParameter("livesource")) || TextUtils.isEmpty(uri.getQueryParameter(yj4.PARAM_UT_PARAMS)) || (d = fkx.d(Uri.decode(uri.getQueryParameter(yj4.PARAM_UT_PARAMS)))) == null || d.getString(yj4.PARAMS_LIVE_TRACKINFO) == null)) {
                str = d.getString(yj4.PARAMS_LIVE_TRACKINFO);
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
        }
        String decode = Uri.decode(str);
        if (TextUtils.isEmpty(decode) || (split = decode.split("_")) == null || split.length < 1 || (str2 = split[0]) == null || str2.length() >= 128) {
            return "";
        }
        return split[0];
    }
}
