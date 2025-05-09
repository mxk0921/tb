package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031831);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("dfa4e3c8", new Object[]{uri});
        }
        return !ykl.a() ? uri : uri.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
    }
}
