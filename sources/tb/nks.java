package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nks {
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

    public static String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0d59e6d", new Object[]{uri});
        }
        if (uri.isHierarchical()) {
            return uri.getQueryParameter("_wml_code");
        }
        return null;
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91fa5ef6", new Object[]{uri})).booleanValue();
        }
        if (uri == null || !uri.isHierarchical() || !TextUtils.equals(uri.getQueryParameter("_afc_link"), "1")) {
            return false;
        }
        return true;
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ee4797", new Object[]{uri})).booleanValue();
        }
        return !TextUtils.isEmpty(a(uri));
    }

    public static boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa838723", new Object[]{uri})).booleanValue();
        }
        return !TextUtils.isEmpty(b(uri));
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35b6e4e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("true", Uri.parse(str).getQueryParameter("isATS"));
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1180a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("true", Uri.parse(str).getQueryParameter("isCanal"));
    }
}
