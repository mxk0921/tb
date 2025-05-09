package com.taobao.taolive.sdk.ui.media;

import android.os.Trace;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.net.URI;
import java.util.ArrayList;
import tb.pvs;
import tb.t2o;
import tb.ulq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093500);
    }

    public static MediaLiveInfo a(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("de9ae561", new Object[]{mediaData});
        }
        Trace.beginSection("TLiveFFTrace -- player proxy convert");
        if (mediaData == null) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = mediaData.h265;
        mediaLiveInfo.rateAdapte = mediaData.rateAdapte;
        mediaLiveInfo.anchorId = mediaData.anchorId;
        mediaLiveInfo.liveId = mediaData.liveId;
        mediaLiveInfo.mediaSourceType = mediaData.mediaSourceType;
        mediaLiveInfo.edgePcdn = mediaData.edgePcdn;
        mediaLiveInfo.mediaConfig = mediaData.mediaConfig;
        ArrayList<MediaData.QualityLiveItem> arrayList = mediaData.liveUrlList;
        if (arrayList != null && arrayList.size() > 0) {
            mediaLiveInfo.liveUrlList = ulq.c(mediaData.liveUrlList);
        }
        Trace.endSection();
        return mediaLiveInfo;
    }

    public static String b(MediaData mediaData, String str) {
        int indexOf;
        ArrayList<MediaData.QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21f1644", new Object[]{mediaData, str});
        }
        if (pvs.W0()) {
            return c(mediaData, str);
        }
        if (!(mediaData == null || (arrayList = mediaData.liveUrlList) == null || arrayList.size() <= 1 || mediaData.liveUrlList.get(1) == null)) {
            if (mediaData.liveUrlList.get(1).rtcLiveUrl != null) {
                str = mediaData.liveUrlList.get(1).rtcLiveUrl;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && mediaData.liveUrlList.get(1).flvUrl != null) {
                str = mediaData.liveUrlList.get(1).flvUrl;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = new URI(str).getPath().split("/");
                if (split.length - 1 >= 0) {
                    String str2 = split[split.length - 1];
                    if (str2 == null || (indexOf = str2.indexOf(".")) < 0) {
                        return str2;
                    }
                    return str2.substring(0, indexOf);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String c(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37bbf9c0", new Object[]{mediaData, str});
        }
        MediaLiveInfo a2 = a(mediaData);
        if (a2 == null) {
            return null;
        }
        a2.liveUrlListJson = null;
        return s.c.h(a2, str);
    }
}
