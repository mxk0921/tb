package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gxa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIDEO_TYPE_LIVE = "live";
    public static final String VIDEO_TYPE_VIDEO = "video";

    static {
        t2o.a(779092514);
    }

    public static HashMap<String, String> a(LiveItem liveItem, LiveItem.TimeMovingPlayInfo timeMovingPlayInfo, String str, ux9 ux9Var) {
        String str2;
        LiveItem.ExtraPlayInfo extraPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b6b79c10", new Object[]{liveItem, timeMovingPlayInfo, str, ux9Var});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = liveItem.personalityData.getJSONObject("spfPlayVideo");
        if (liveItem.personalityData == null || jSONObject == null || jSONObject.isEmpty()) {
            if (timeMovingPlayInfo.isSpeaking) {
                hashMap.put(yj4.PARAM_PLAY_URL, str);
                hashMap.put("type", "live");
            } else {
                hashMap.put(yj4.PARAM_PLAY_URL, timeMovingPlayInfo.timeMovingM3u8Url);
                hashMap.put("loop", "true");
                hashMap.put(lf9.KEY_VIDEO_ID, timeMovingPlayInfo.videoId);
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            }
            up6.L0(null, vx9.d());
            c(ux9Var, null);
        } else {
            LiveItem.SpfPlayVideo spfPlayVideo = (LiveItem.SpfPlayVideo) jSONObject.toJavaObject(LiveItem.SpfPlayVideo.class);
            if (ryp.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(spfPlayVideo.videoType) && (extraPlayInfo = spfPlayVideo.extraPlayInfo) != null) {
                str2 = extraPlayInfo.mp4Url;
            } else if ("m3u8".equalsIgnoreCase(spfPlayVideo.videoType)) {
                str2 = spfPlayVideo.playInfo;
            } else {
                str2 = spfPlayVideo.playInfo;
            }
            if (ryp.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(spfPlayVideo.videoType)) {
                hashMap.put(lf9.KEY_VIDEO_ID, spfPlayVideo.playInfo);
            }
            if (!timeMovingPlayInfo.isSpeaking) {
                hashMap.put("loop", "true");
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            } else {
                hashMap.put("type", "live");
            }
            hashMap.put(yj4.PARAM_PLAY_URL, str2);
            up6.L0(spfPlayVideo.timeMovingUtParams, vx9.d());
            c(ux9Var, spfPlayVideo);
        }
        return hashMap;
    }

    public static HashMap<String, String> b(LiveItem.TimeMovingPlayInfo timeMovingPlayInfo, String str, ux9 ux9Var) {
        String str2;
        LiveItem.ExtraPlayInfo extraPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6d8eb881", new Object[]{timeMovingPlayInfo, str, ux9Var});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        LiveItem.SpfPlayVideo spfPlayVideo = timeMovingPlayInfo.spfPlayVideo;
        if (spfPlayVideo != null) {
            if (ryp.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(spfPlayVideo.videoType) && (extraPlayInfo = timeMovingPlayInfo.spfPlayVideo.extraPlayInfo) != null) {
                str2 = extraPlayInfo.mp4Url;
            } else if ("m3u8".equalsIgnoreCase(timeMovingPlayInfo.spfPlayVideo.videoType)) {
                str2 = timeMovingPlayInfo.spfPlayVideo.playInfo;
            } else {
                str2 = timeMovingPlayInfo.spfPlayVideo.playInfo;
            }
            if (ryp.FILE_TYPE_VIDEO_MP4.equalsIgnoreCase(timeMovingPlayInfo.spfPlayVideo.videoType)) {
                hashMap.put(lf9.KEY_VIDEO_ID, timeMovingPlayInfo.spfPlayVideo.playInfo);
            }
            if (!timeMovingPlayInfo.isSpeaking) {
                hashMap.put("loop", "true");
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            } else {
                hashMap.put("type", "live");
            }
            hashMap.put(yj4.PARAM_PLAY_URL, str2);
            up6.L0(timeMovingPlayInfo.spfPlayVideo.timeMovingUtParams, ux9Var);
            c(ux9Var, timeMovingPlayInfo.spfPlayVideo);
        } else {
            if (timeMovingPlayInfo.isSpeaking) {
                hashMap.put(yj4.PARAM_PLAY_URL, str);
                hashMap.put("type", "live");
            } else {
                hashMap.put(yj4.PARAM_PLAY_URL, timeMovingPlayInfo.timeMovingM3u8Url);
                hashMap.put("loop", "true");
                hashMap.put(lf9.KEY_VIDEO_ID, timeMovingPlayInfo.videoId);
                hashMap.put("type", "video");
                hashMap.put("startSeekTime", "0");
            }
            up6.L0(null, ux9Var);
            c(ux9Var, null);
        }
        return hashMap;
    }

    public static void c(ux9 ux9Var, LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7848a2", new Object[]{ux9Var, spfPlayVideo});
        } else if (uwa.F() && ux9Var != null && ux9Var.x() != null) {
            if (spfPlayVideo == null || !"ALGO_CUT_VIDEO".equals(spfPlayVideo.playMaterialType)) {
                ux9Var.x().O(null, false);
            } else {
                ux9Var.x().O(IMediaPlayer.AspectRatio.FIT_CENTER, false);
            }
        }
    }
}
