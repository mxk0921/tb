package com.taobao.umipublish.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.taobao.vpm.publish.contentDO.ContentMetaInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dov;
import tb.f9w;
import tb.io4;
import tb.t2o;
import tb.wp4;
import tb.ydv;
import tb.yp4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VPM_TRACK_ID = "vpmTrackId";

    static {
        t2o.a(944767249);
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138eefa7", new Object[]{map});
        } else if (h() && map != null) {
            wp4.e(e(map), (HashMap) map);
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3679b975", new Object[]{context});
        }
        return new yp4().b(context);
    }

    public static io4 e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io4) ipChange.ipc$dispatch("23d2560b", new Object[]{map});
        }
        return new io4(map.get(dov.KEY_BIZ_LINE), f(map), map.get("biz_scene"), map.get(VPM_TRACK_ID));
    }

    public static String f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae8cb49", new Object[]{map});
        }
        String str = map.get(dov.URL_KEY_PHOTO_BIZ_CODE);
        return TextUtils.isEmpty(str) ? map.get(dov.URL_KEY_VIDEO_BIZ_CODE) : str;
    }

    public static UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo g(UmiPublishMonitor.UmiPublishTracker.VideoMeta videoMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo) ipChange.ipc$dispatch("fa6f8a4f", new Object[]{videoMeta});
        }
        UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo videoMetaInfo = videoMeta.edit_meta;
        if (videoMetaInfo != null) {
            return videoMetaInfo;
        }
        return videoMeta.origin_meta;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a33990", new Object[0])).booleanValue();
        }
        return ydv.w();
    }

    public static Map<String, String> i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c6740f5", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        String str = map == null ? null : map.get(VPM_TRACK_ID);
        if (h() && !TextUtils.isEmpty(str)) {
            hashMap.put("EagleEye-UserData", "cqp_track_id=" + map.get(VPM_TRACK_ID));
        }
        return hashMap;
    }

    public static void j(Context context, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4551a25", new Object[]{context, iUGCMedia});
        } else if (iUGCMedia.getMeta(VPM_TRACK_ID) == null && h()) {
            iUGCMedia.setMeta(VPM_TRACK_ID, d(context));
        }
    }

    public static void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5634d849", new Object[]{map});
        } else if (h() && map != null) {
            wp4.f(e(map), (HashMap) map);
        }
    }

    public static void l(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker) {
        List<UmiPublishMonitor.UmiPublishTracker.VideoMeta> list;
        f9w f9wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edd7b1e", new Object[]{map, umiPublishTracker});
        } else if (h() && map != null && umiPublishTracker != null && (list = umiPublishTracker.videos) != null && !list.isEmpty()) {
            UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo g = g(umiPublishTracker.videos.get(0));
            if (g != null) {
                f9wVar = new f9w(g.fps, g.resolution, g.file_size, String.valueOf(g.duration), g.video_bps);
            } else {
                f9wVar = null;
            }
            wp4.g(e(map), f9wVar, (HashMap) map);
        }
    }

    public static void a(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker, String str, boolean z) {
        String str2;
        ContentMetaInfo.PublishState publishState;
        UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ab41aa", new Object[]{map, umiPublishTracker, str, new Boolean(z)});
        } else if (h() && map != null && umiPublishTracker != null) {
            String str3 = map.get(dov.KEY_BIZ_LINE);
            String f = f(map);
            String str4 = map.get("biz_scene");
            String str5 = map.get(VPM_TRACK_ID);
            List<UmiPublishMonitor.UmiPublishTracker.VideoMeta> list = umiPublishTracker.videos;
            f9w f9wVar = (list == null || list.isEmpty() || (g = g(umiPublishTracker.videos.get(0))) == null) ? null : new f9w(g.fps, g.resolution, g.file_size, String.valueOf(g.duration), g.video_bps);
            UmiPublishMonitor.UmiPublishTracker.ExtraInfo extraInfo = umiPublishTracker.extra;
            if (extraInfo == null) {
                str2 = "unkonwn";
            } else {
                str2 = extraInfo.postType;
            }
            if (z) {
                publishState = ContentMetaInfo.PublishState.SUCCESS;
            } else {
                publishState = ContentMetaInfo.PublishState.ERROR;
            }
            wp4.c(new ContentMetaInfo(str3, f, str4, str5, publishState, umiPublishTracker.umimonitor_error_code, null, null, str, str2), f9wVar, (HashMap) map);
        }
    }

    public static void b(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker, String str, boolean z) {
        List<UmiPublishMonitor.UmiPublishTracker.VideoMeta> list;
        String str2;
        ContentMetaInfo.PublishState publishState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af68e865", new Object[]{map, umiPublishTracker, str, new Boolean(z)});
        } else if (h() && map != null && umiPublishTracker != null && (list = umiPublishTracker.videos) != null && !list.isEmpty()) {
            String str3 = map.get(dov.KEY_BIZ_LINE);
            String f = f(map);
            String str4 = map.get("biz_scene");
            String str5 = map.get(VPM_TRACK_ID);
            UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo g = g(umiPublishTracker.videos.get(0));
            f9w f9wVar = g != null ? new f9w(g.fps, g.resolution, g.file_size, String.valueOf(g.duration), g.video_bps) : null;
            UmiPublishMonitor.UmiPublishTracker.ExtraInfo extraInfo = umiPublishTracker.extra;
            if (extraInfo == null) {
                str2 = "unkonwn";
            } else {
                str2 = extraInfo.postType;
            }
            if (z) {
                publishState = ContentMetaInfo.PublishState.SUCCESS;
            } else {
                publishState = ContentMetaInfo.PublishState.ERROR;
            }
            wp4.d(new ContentMetaInfo(str3, f, str4, str5, publishState, umiPublishTracker.umimonitor_error_code, null, null, str, str2), f9wVar, (HashMap) map);
        }
    }
}
