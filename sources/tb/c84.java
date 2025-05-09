package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355850);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("593ee01a", new Object[]{context})).booleanValue();
        }
        return context.getSharedPreferences("giftEffect", 0).getBoolean("enableGiftEffect", true);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b89caa3a", new Object[]{new Integer(i)})).intValue();
        }
        return x3s.a(i);
    }

    public static boolean c(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d199f9e", new Object[]{tBLiveDataModel})).booleanValue();
        }
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.commentSwitchStatus != 1) {
            return false;
        }
        return true;
    }

    public static void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393bedb1", new Object[]{context, new Boolean(z)});
        } else {
            context.getSharedPreferences("giftEffect", 0).edit().putBoolean("enableGiftEffect", z).apply();
        }
    }
}
