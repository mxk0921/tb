package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092125);
    }

    public static String a(String str, LivePreloadData livePreloadData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c10e06", new Object[]{str, livePreloadData});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse != null && TextUtils.isEmpty(parse.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL))) {
            if (livePreloadData == null || !livePreloadData.canComposeQuickOpenParams()) {
                tfs.e(a.TAG, "没有秒开参数,pageUrl:" + str);
            } else {
                String str2 = livePreloadData.customPlayCtrlParams;
                tfs.e(a.TAG, "拼接秒开参数,id:" + livePreloadData.id + ",customPlayCtrlParams:" + (true ^ TextUtils.isEmpty(str2)));
                return parse.buildUpon().appendQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL, str2).appendQueryParameter("id", livePreloadData.id).appendQueryParameter("trackInfo", livePreloadData.trackInfo).build().toString();
            }
        }
        return str;
    }

    public static String b(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7cc131f", new Object[]{uri, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    if (entry.getValue() != null) {
                        hashMap.put(entry.getKey(), Uri.encode(entry.getValue().toString()));
                    }
                }
            }
        } catch (Throwable unused) {
            tfs.e(a.TAG, "parse extParams error, extParams: " + str);
        }
        String[] split = akt.H2("tab2liveRoomExtraKeys", "").split(",");
        if (split != null) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    String queryParameter = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        hashMap.put(str2, queryParameter);
                    }
                }
            }
        }
        String x = a.x(akt.H2("tab2liveRoomUrl", a.DEFAULT_REFRESH_URL), hashMap);
        tfs.g(a.TAG, "convert2LiveRoomUrl: " + x);
        return x;
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b04eb", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String str = uri.getHost() + uri.getPath();
        return TextUtils.equals(str, "market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html") || TextUtils.equals(str, "h5.m.taobao.com/taolive/video.html") || TextUtils.equals(str, "huodong.m.taobao.com/act/talent/live.html");
    }
}
