package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.model.MediaLiveInfo;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897755);
    }

    public static String a(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d793821", new Object[]{mediaPlayControlContext});
        }
        if (mediaPlayControlContext.mEnableSRSByRTCWeakNetFlag && b()) {
            return MediaConstant.DEFINITION_HD;
        }
        return "";
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad40d586", new Object[0])).booleanValue();
        }
        return TaobaoMediaPlayer.getRtcWeakNetFlag();
    }

    public static boolean c(String str, MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa48e0d", new Object[]{str, mediaPlayControlContext})).booleanValue();
        }
        if (!mediaPlayControlContext.mEnableSRSByRTCWeakNetFlag || !b()) {
            return false;
        }
        return !str.toLowerCase().endsWith(MediaConstant.DEFINITION_HD);
    }

    public static List<Integer> d(MediaLiveInfo mediaLiveInfo, MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a105adf", new Object[]{mediaLiveInfo, mediaPlayControlContext});
        }
        ArrayList arrayList = new ArrayList();
        if (!mediaPlayControlContext.mEnableSRSByRTCWeakNetFlag) {
            return arrayList;
        }
        if (!b()) {
            return arrayList;
        }
        for (int i = 0; i < mediaLiveInfo.liveUrlList.size(); i++) {
            if (MediaConstant.DEFINITION_HD.equals(mediaLiveInfo.liveUrlList.get(i).newDefinition)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static void e(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75840c9", new Object[]{mediaPlayControlContext});
        } else if (mediaPlayControlContext.mEnableSRSByRTCWeakNetFlag) {
            mediaPlayControlContext.mSelectDefinitionReason |= 1024;
            mediaPlayControlContext.mLiveRtcWeakNetFlag = true;
            mediaPlayControlContext.mLiveRtcWeakNetSVCDrop = mediaPlayControlContext.mEnableLiveRtcWeakNetSVCDrop;
        }
    }
}
