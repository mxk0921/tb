package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.TimeMovingType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ubt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092723);
    }

    public static fxa a(VideoInfo videoInfo, String str, String str2) {
        fxa fxaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxa) ipChange.ipc$dispatch("b73e634d", new Object[]{videoInfo, str, str2});
        }
        if (videoInfo == null) {
            return null;
        }
        if (!uwa.h() || !TimeMovingType.checkContentTimeMove(videoInfo) || TextUtils.isEmpty(str2)) {
            fxaVar = c(videoInfo, str, str2);
        } else {
            fxaVar = d(videoInfo, str2);
        }
        lxa.a("roomStatus:" + videoInfo.roomStatus + "liveId:" + videoInfo.liveId + " sSjsdItemId:" + str + " getKandianPlayInfo: spfPlayVideo" + JSON.toJSONString(fxaVar));
        return fxaVar;
    }

    public static LiveItem b(VideoInfo videoInfo, String str) {
        ArrayList<LiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("b793e788", new Object[]{videoInfo, str});
        }
        if (TextUtils.isEmpty(str) || videoInfo == null || (arrayList = videoInfo.curItemList) == null) {
            return null;
        }
        Iterator<LiveItem> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveItem next = it.next();
            if (next.itemId == zqq.h(str)) {
                return next;
            }
        }
        return null;
    }

    public static fxa c(VideoInfo videoInfo, String str, String str2) {
        LiveItem liveItem;
        LiveItem.Ext ext;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        LiveItem.SpfPlayVideo spfPlayVideo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxa) ipChange.ipc$dispatch("bdf8d95e", new Object[]{videoInfo, str, str2});
        }
        up6.Q0("0", vx9.d());
        if (videoInfo == null) {
            return null;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo2 = videoInfo.timeMovingPlayInfo;
        if (timeMovingPlayInfo2 == null || (spfPlayVideo = timeMovingPlayInfo2.spfPlayVideo) == null || TextUtils.isEmpty(spfPlayVideo.playInfo) || TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.videoType)) {
            up6.L0(null, vx9.d());
            ArrayList<LiveItem> arrayList = videoInfo.curItemList;
            if (arrayList != null && arrayList.size() > 0 && uwa.c() && (liveItem = videoInfo.curItemList.get(0)) != null && !TextUtils.isEmpty(str) && str.equals(String.valueOf(liveItem.itemId)) && (ext = liveItem.extendVal) != null && !TextUtils.isEmpty(ext.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
                if (!TextUtils.isEmpty(timeMovingPlayInfo.videoId)) {
                    return new fxa(timeMovingPlayInfo.videoId, ryp.FILE_TYPE_VIDEO_MP4, "1", str2);
                }
                if (!TextUtils.isEmpty(timeMovingPlayInfo.timeMovingM3u8Url)) {
                    return new fxa(timeMovingPlayInfo.timeMovingM3u8Url, "m3u8", "1", str2);
                }
            }
            return null;
        }
        if (videoInfo.timeMovingPlayInfo.isMounting) {
            up6.Q0("1", vx9.d());
        }
        LiveItem.SpfPlayVideo spfPlayVideo2 = videoInfo.timeMovingPlayInfo.spfPlayVideo;
        up6.L0(spfPlayVideo2.timeMovingUtParams, vx9.d());
        return new fxa(spfPlayVideo2.playInfo, spfPlayVideo2.videoType, "1", str2);
    }

    public static fxa d(VideoInfo videoInfo, String str) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        LiveItem.SpfPlayVideo spfPlayVideo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxa) ipChange.ipc$dispatch("22bd1940", new Object[]{videoInfo, str});
        }
        up6.Q0("0", vx9.d());
        if (videoInfo == null || (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) == null || TextUtils.isEmpty(timeMovingPlayInfo.timeMovingType) || (spfPlayVideo = videoInfo.timeMovingPlayInfo.spfPlayVideo) == null || TextUtils.isEmpty(spfPlayVideo.playInfo) || TextUtils.isEmpty(videoInfo.timeMovingPlayInfo.spfPlayVideo.videoType)) {
            return null;
        }
        if (videoInfo.timeMovingPlayInfo.isMounting) {
            up6.Q0("1", vx9.d());
        }
        LiveItem.SpfPlayVideo spfPlayVideo2 = videoInfo.timeMovingPlayInfo.spfPlayVideo;
        up6.L0(spfPlayVideo2.timeMovingUtParams, vx9.d());
        return new fxa(spfPlayVideo2.playInfo, spfPlayVideo2.videoType, videoInfo.timeMovingPlayInfo.timeMovingType, str);
    }

    public static LiveItem.TimeMovingPlayInfo e(LiveItem liveItem) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.TimeMovingPlayInfo) ipChange.ipc$dispatch("2e94879", new Object[]{liveItem});
        }
        if (liveItem == null || TextUtils.isEmpty(liveItem.extendVal.timeMovingPlayInfo) || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null) {
            return null;
        }
        return timeMovingPlayInfo;
    }

    public static void f(LiveItem liveItem, ux9 ux9Var) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989742d2", new Object[]{liveItem, ux9Var});
        } else if (liveItem != null && (ext = liveItem.extendVal) != null) {
            if (!TextUtils.isEmpty(ext.timeMovingPlayInfo)) {
                LiveItem.TimeMovingPlayInfo e = e(liveItem);
                if (e != null && !TextUtils.isEmpty(e.timeMovingId)) {
                    up6.N0(e.timeMovingId, ux9Var);
                    if ((ux9Var instanceof cdr) && ((cdr) ux9Var).p0) {
                        iba.l0(e.timeMovingId, vx9.f(ux9Var));
                    }
                }
            } else if (!TextUtils.isEmpty(liveItem.extendVal.timeMovingContentId)) {
                JSONObject d = fkx.d(liveItem.extendVal.timeMovingContentId);
                if (d.get(String.valueOf(liveItem.itemId)) != null) {
                    up6.N0(String.valueOf(d.get(String.valueOf(liveItem.itemId))), ux9Var);
                    if ((ux9Var instanceof cdr) && ((cdr) ux9Var).p0) {
                        iba.l0(String.valueOf(d.get(String.valueOf(liveItem.itemId))), vx9.f(ux9Var));
                    }
                }
            }
        }
    }
}
