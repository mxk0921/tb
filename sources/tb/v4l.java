package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v4l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093063);
    }

    public static String a(long j, long j2, boolean z, String str, VideoInfo videoInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321f276e", new Object[]{new Long(j), new Long(j2), new Boolean(z), str, videoInfo, context});
        }
        if (!(context == null || videoInfo == null || (j2 <= j && !z))) {
            try {
                if (k0r.r() && !TextUtils.isEmpty(str)) {
                    return str;
                }
                if (liv.j(videoInfo)) {
                    return context.getString(R.string.taolive_topbar_online_number_for_taolive_flexalocal, uak.d(j2));
                }
                return context.getString(R.string.taolive_topbar_online_number_flexalocal, uak.d(j2));
            } catch (Exception unused) {
            }
        }
        return "0";
    }
}
