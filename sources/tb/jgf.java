package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.InteractBusiness;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jgf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FOLLOW = "follow";

    static {
        t2o.a(806355841);
    }

    public static void a(TBLiveDataModel tBLiveDataModel, ux9 ux9Var, String str) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0b1891", new Object[]{tBLiveDataModel, ux9Var, str});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            String str2 = videoInfo.topic;
            if (!TextUtils.isEmpty(str2)) {
                boolean z = videoInfo.publishCommentsUseMtop;
                AccountInfo accountInfo = videoInfo.broadCaster;
                String str3 = accountInfo != null ? accountInfo.accountId : null;
                InteractBusiness interactBusiness = new InteractBusiness(ux9Var.u0());
                if ("follow".equals(str)) {
                    if (z) {
                        interactBusiness.j(str3, str2, u2j.SYS_PREFIX + str, null, null);
                    } else {
                        interactBusiness.g(str2, u2j.SYS_PREFIX + str);
                    }
                }
                InteractBusiness interactBusiness2 = new InteractBusiness(ux9Var.u0());
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(yj4.PARAM_CHAT_RENDERS_ENHANCE, str);
                interactBusiness2.j(str3, str2, "test", hashMap, null);
            }
        }
    }
}
