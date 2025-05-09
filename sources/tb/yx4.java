package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093348);
    }

    public static ufi a(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ufi) ipChange.ipc$dispatch("2b99b10", new Object[]{mediaData, str});
        }
        String b = a.b(mediaData, str);
        ufi ufiVar = new ufi();
        ufiVar.f29342a = tfi.h(b);
        ufiVar.b = b;
        return ufiVar;
    }
}
