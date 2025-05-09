package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897729);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4880887c", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String c = c(str);
            String c2 = c(str2);
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(c2)) {
                return c.equals(c2);
            }
        }
        return false;
    }

    public static boolean b(QualityLiveItem qualityLiveItem, QualityLiveItem qualityLiveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db14333", new Object[]{qualityLiveItem, qualityLiveItem2})).booleanValue();
        }
        if (!TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) && !TextUtils.isEmpty(qualityLiveItem2.rtcLiveUrl)) {
            return a(qualityLiveItem.rtcLiveUrl, qualityLiveItem2.rtcLiveUrl);
        }
        if (!TextUtils.isEmpty(qualityLiveItem.bfrtcUrl) && !TextUtils.isEmpty(qualityLiveItem2.bfrtcUrl)) {
            return a(qualityLiveItem.bfrtcUrl, qualityLiveItem2.bfrtcUrl);
        }
        if (!TextUtils.isEmpty(qualityLiveItem.flvUrl) && !TextUtils.isEmpty(qualityLiveItem2.flvUrl)) {
            return a(qualityLiveItem.flvUrl, qualityLiveItem2.flvUrl);
        }
        if (TextUtils.isEmpty(qualityLiveItem.hlsUrl) || TextUtils.isEmpty(qualityLiveItem2.hlsUrl)) {
            return false;
        }
        return a(qualityLiveItem.hlsUrl, qualityLiveItem2.hlsUrl);
    }

    public static String c(String str) {
        URI uri;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d21d7f52", new Object[]{str});
        }
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        if (!TextUtils.isEmpty(path) && (lastIndexOf = path.lastIndexOf(47)) >= 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static void e(PlayerQualityItem playerQualityItem, MediaLiveInfo mediaLiveInfo) {
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a40291e", new Object[]{playerQualityItem, mediaLiveInfo});
        } else if (playerQualityItem != null && mediaLiveInfo != null && (arrayList = mediaLiveInfo.liveUrlList) != null) {
            int size = arrayList.size();
            int i = playerQualityItem.index;
            if (size > i) {
                playerQualityItem.name = mediaLiveInfo.liveUrlList.get(i).name;
                playerQualityItem.newName = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).newName;
                playerQualityItem.definition = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).definition;
                playerQualityItem.newDefinition = mediaLiveInfo.liveUrlList.get(playerQualityItem.index).newDefinition;
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, " updatePlayerQualityItem name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
            }
        }
    }

    public static void d(MediaLiveInfo mediaLiveInfo, List<QualityLiveItem> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443e1c95", new Object[]{mediaLiveInfo, list, new Integer(i)});
        } else if (mediaLiveInfo != null) {
            if (i == 1) {
                for (int i2 = 0; i2 < mediaLiveInfo.liveUrlList.size(); i2++) {
                    QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i2);
                    if (!TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            QualityLiveItem qualityLiveItem2 = list.get(i3);
                            if (!TextUtils.isEmpty(qualityLiveItem2.newDefinition) && b(qualityLiveItem2, qualityLiveItem)) {
                                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_BY_URL_ID_OF_NEW_DEFINITION updateIndex=" + i3 + ", baseIndex=" + i2);
                                qualityLiveItem.copy(qualityLiveItem2);
                            }
                        }
                    }
                }
            } else if (i == 2) {
                LinkedList linkedList = new LinkedList();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    QualityLiveItem qualityLiveItem3 = list.get(i4);
                    if (!TextUtils.isEmpty(qualityLiveItem3.newDefinition)) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= mediaLiveInfo.liveUrlList.size()) {
                                i5 = -1;
                                break;
                            } else if (qualityLiveItem3.newDefinition.equals(mediaLiveInfo.liveUrlList.get(i5).newDefinition)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 != -1) {
                            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_FORCE_OF_NEW_DEFINITION updateIndex=" + i4 + ", baseIndex=" + i5);
                            mediaLiveInfo.liveUrlList.get(i5).copy(qualityLiveItem3);
                        } else {
                            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updateMediaLiveInfo REPLACE_FORCE_OF_NEW_DEFINITION add updateIndex=" + i4);
                            linkedList.add(Integer.valueOf(i4));
                        }
                    }
                }
                for (int i6 = 0; i6 < linkedList.size(); i6++) {
                    mediaLiveInfo.liveUrlList.add(list.get(((Integer) linkedList.get(i6)).intValue()));
                }
            }
        }
    }
}
