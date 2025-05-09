package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699496);
    }

    public static void a(Context context, cv1 cv1Var, TBLiveDataModel tBLiveDataModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fdc0cc", new Object[]{context, cv1Var, tBLiveDataModel});
        } else if (context != null && cv1Var != null && tBLiveDataModel != null && (map = tBLiveDataModel.mInitParams) != null && !cv1Var.n) {
            String str = map.get(yj4.PARAM_INTENT_URL);
            String str2 = tBLiveDataModel.mInitParams.get(yj4.PARAM_302_URL);
            String str3 = tBLiveDataModel.mInitParams.get(yj4.PARAM_302_TYPE);
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                cv1Var.n = true;
                if (str3 != null) {
                    if (str3.equals("shareItem")) {
                        b(context, str, str2, tBLiveDataModel);
                    } else if (str3.equals("normal")) {
                        Nav.from(context).toUri(str2);
                    }
                }
            }
        }
    }

    public static void b(Context context, String str, String str2, TBLiveDataModel tBLiveDataModel) {
        String str3;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe50a32b", new Object[]{context, str, str2, tBLiveDataModel});
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(yj4.PARAM_ITEM_IDS);
            String queryParameter2 = parse.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE);
            if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                q0h.a("Jump302Util", "[processShareItem]  holdItemIds or itemHoldType is empty");
                return;
            }
            boolean z2 = (tBLiveDataModel == null || (videoInfo2 = tBLiveDataModel.mVideoInfo) == null || videoInfo2.status != 0) ? false : true;
            boolean z3 = (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || !TextUtils.equals("1", videoInfo.streamStatus)) ? false : true;
            q0h.a("Jump302Util", "[processShareItem]  isLive: " + z2 + ", isStreamLive: " + z3);
            if (z2 && z3) {
                z = false;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str3 = "to_detail";
            } else {
                str3 = "to_live";
            }
            hashMap.put("detail_back_action", str3);
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "Detail_Back", hashMap);
            if (z) {
                Nav.from(context).toUri(str2);
            }
        }
    }
}
