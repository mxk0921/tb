package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.pre.PreRequestInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ufo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092721);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebdcd454", new Object[]{str});
        }
        JSONObject d = fkx.d(str);
        if (TextUtils.isEmpty(str) || d == null) {
            return str;
        }
        d.remove("pcmId");
        return d.toJSONString();
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88929457", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        JSONObject d = fkx.d(str);
        if (d == null) {
            d = new JSONObject();
        }
        d.put("pcmId", (Object) str2);
        return d.toJSONString();
    }

    public static LiveItem.SpfPlayVideo a(Map<String, String> map) {
        PreRequestInfo d;
        VideoInfo videoInfo;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.SpfPlayVideo) ipChange.ipc$dispatch("1190c049", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("timeMovingSpfPlayVideo");
        if (!TextUtils.isEmpty(str)) {
            return (LiveItem.SpfPlayVideo) fkx.f(str, LiveItem.SpfPlayVideo.class);
        }
        if (map.get(yj4.PRE_REQUEST_TIME_MOVE_KEY) == null || (d = vnm.c().d(map.get(yj4.PRE_REQUEST_TIME_MOVE_KEY))) == null || d.responseStatus != 1 || (videoInfo = d.info) == null || (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) == null) {
            return null;
        }
        return timeMovingPlayInfo.spfPlayVideo;
    }
}
