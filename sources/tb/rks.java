package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f39041e6", new Object[]{uri});
        }
        if (uri.isHierarchical()) {
            return uri.getQueryParameter("_ariver_appid");
        }
        return null;
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91fa5ef6", new Object[]{uri})).booleanValue();
        }
        if (uri == null || !uri.isHierarchical() || !TextUtils.equals(uri.getQueryParameter("_afc_link"), "1")) {
            return false;
        }
        return true;
    }
}
