package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092746);
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89d08e6b", new Object[]{videoInfo})).booleanValue();
        }
        if (pvs.x0() && videoInfo != null && !tz3.a(videoInfo.punishInfoList)) {
            for (VideoInfo.LivePunishInfo livePunishInfo : videoInfo.punishInfoList) {
                if (livePunishInfo != null && TextUtils.equals(livePunishInfo.actionType, "1")) {
                    o3s.b("LivePunishController", "直播处罚被拉停，停止原因：" + livePunishInfo.reason + ",处罚类型：" + livePunishInfo.punishType);
                    return true;
                }
            }
        }
        return false;
    }
}
