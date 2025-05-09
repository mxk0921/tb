package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k09 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700052);
    }

    public static void a(boolean z, TBLiveDataModel tBLiveDataModel, String str) {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5f31fb", new Object[]{new Boolean(z), tBLiveDataModel, str});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
            }
            hashMap.put("stateType", str);
            if (z) {
                o.c("FanClub", hashMap);
            } else {
                o.b("Show-FanClub", hashMap);
            }
        }
    }
}
