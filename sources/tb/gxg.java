package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.nav.TaoLiveActionUtils;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699520);
    }

    public gxg(TaoLiveActionUtils taoLiveActionUtils) {
    }

    public String a(VideoInfo videoInfo, LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edbc54ef", new Object[]{this, videoInfo, liveItem, jSONObject});
        }
        String str = null;
        if (jSONObject != null) {
            if (zga.c() && d9m.n().isMultiStateSecKill(liveItem)) {
                str = jSONObject.getString("itemJumpUrl2");
            }
            if (TextUtils.isEmpty(str)) {
                str = jSONObject.getString("itemJumpUrl");
            }
            String string = jSONObject.getString("itemJumpUrlForPcg");
            if (!TextUtils.isEmpty(string) && videoInfo != null && zga.e(videoInfo.itemTransferInfo)) {
                str = string;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "http://a.m.taobao.com/sku" + liveItem.itemId + ".htm";
    }
}
