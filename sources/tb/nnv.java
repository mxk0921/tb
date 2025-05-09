package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de58acb3", new Object[]{uri, str, str2});
        }
        if (str == null || uri == null || uri.getQueryParameter(str) == null) {
            return str2;
        }
        return uri.getQueryParameter(str);
    }
}
