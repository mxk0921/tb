package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.LiveStreamStatsInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ulq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093363);
    }

    public static void a(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9682c2", new Object[]{sb, str, str2});
            return;
        }
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(",");
    }

    public static QualityLiveItem b(MediaData.QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QualityLiveItem) ipChange.ipc$dispatch("5a90f433", new Object[]{qualityLiveItem});
        }
        QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
        String str = qualityLiveItem.artpUrl;
        qualityLiveItem2.definition = qualityLiveItem.definition;
        qualityLiveItem2.flvUrl = qualityLiveItem.flvUrl;
        qualityLiveItem2.h265Url = qualityLiveItem.h265Url;
        qualityLiveItem2.hlsUrl = qualityLiveItem.hlsUrl;
        qualityLiveItem2.artpUrl = str;
        qualityLiveItem2.name = qualityLiveItem.name;
        qualityLiveItem2.replayUrl = qualityLiveItem.replayUrl;
        qualityLiveItem2.videoUrl = qualityLiveItem.videoUrl;
        qualityLiveItem2.wholeH265ArtpUrl = qualityLiveItem.wholeH265ArtpUrl;
        qualityLiveItem2.wholeH265FlvUrl = qualityLiveItem.wholeH265FlvUrl;
        qualityLiveItem2.bfrtcUrl = qualityLiveItem.bfrtcUrl;
        qualityLiveItem2.rtcLiveUrl = qualityLiveItem.rtcLiveUrl;
        qualityLiveItem2.unit = qualityLiveItem.unit;
        qualityLiveItem2.unitType = qualityLiveItem.unitType;
        qualityLiveItem2.liveUrlMiniBfrtc = qualityLiveItem.liveUrlMiniBfrtc;
        qualityLiveItem2.newDefinition = qualityLiveItem.newDefinition;
        qualityLiveItem2.recomm = qualityLiveItem.recomm;
        qualityLiveItem2.selectedProtocol = qualityLiveItem.selectedProtocol;
        qualityLiveItem2.newName = qualityLiveItem.newName;
        String str2 = qualityLiveItem.liveStreamStatsInfo;
        if (str2 != null) {
            qualityLiveItem2.liveStreamStatsInfo = (LiveStreamStatsInfo) JSON.parseObject(str2, LiveStreamStatsInfo.class);
        }
        String str3 = qualityLiveItem.additionUrlMap;
        if (str3 != null) {
            qualityLiveItem2.additionUrlMap = str3;
        }
        String str4 = qualityLiveItem.extInfo;
        if (str4 != null) {
            qualityLiveItem2.extInfo = str4;
        }
        return qualityLiveItem2;
    }

    public static ArrayList<QualityLiveItem> c(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("919620e8", new Object[]{list});
        }
        ArrayList<QualityLiveItem> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(b(list.get(i)));
            }
        }
        return arrayList;
    }

    public static void d(h7m h7mVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34809ced", new Object[]{h7mVar});
        } else if (h7mVar != null) {
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(h7mVar.c)) {
                str = h7mVar.f20456a;
            } else {
                str = h7mVar.c;
            }
            if (TextUtils.isEmpty(h7mVar.d)) {
                str2 = h7mVar.b;
            } else {
                str2 = h7mVar.d;
            }
            a(sb, str, str2);
            o3s.b("SteamChooseUtils", "当前播放的Definition:" + sb.toString());
        }
    }

    public static void e(List<h7m> list) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d7ed16", new Object[]{list});
        } else if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (h7m h7mVar : list) {
                if (TextUtils.isEmpty(h7mVar.c)) {
                    str = h7mVar.f20456a;
                } else {
                    str = h7mVar.c;
                }
                if (TextUtils.isEmpty(h7mVar.d)) {
                    str2 = h7mVar.b;
                } else {
                    str2 = h7mVar.d;
                }
                a(sb, str, str2);
            }
            o3s.b("SteamChooseUtils", "播放器返回给业务，DefinitionList:" + sb.toString());
        }
    }

    public static void f(List<MediaData.QualityLiveItem> list) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8099493", new Object[]{list});
        } else if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (MediaData.QualityLiveItem qualityLiveItem : list) {
                if (TextUtils.isEmpty(qualityLiveItem.name)) {
                    str = qualityLiveItem.newName;
                } else {
                    str = qualityLiveItem.name;
                }
                if (TextUtils.isEmpty(qualityLiveItem.definition)) {
                    str2 = qualityLiveItem.newDefinition;
                } else {
                    str2 = qualityLiveItem.definition;
                }
                a(sb, str, str2);
            }
            o3s.b("SteamChooseUtils", "从服务端获取并透传给播放器的UrlListName:" + sb.toString());
        }
    }
}
