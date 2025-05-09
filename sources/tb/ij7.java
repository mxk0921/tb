package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ij7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5407e686", new Object[0]);
        }
        chb g = c21.g();
        String str = "";
        if (g == null) {
            return str;
        }
        String string = g.getString("currActivityName", null);
        String string2 = g.getString("currFragmentName", null);
        if (string != null) {
            str = string;
        }
        if (string2 == null) {
            return str;
        }
        return str + "_" + string2;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3d13ef2", new Object[0]);
        }
        chb g = c21.g();
        if (g == null) {
            return "";
        }
        String string = g.getString("currActivitySchemaUrl", null);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            return URLEncoder.encode(string, "utf-8");
        } catch (Exception e) {
            ndh.a("DeviceUtil", "[currentPageUrlEncoded] error: " + e);
            return "";
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5348925b", new Object[]{context})).booleanValue();
        }
        if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fa0ffe", new Object[0])).booleanValue();
        }
        return c21.g().getBoolean("isInBackground", true);
    }
}
