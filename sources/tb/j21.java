package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j21 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626565);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af817e43", new Object[0])).booleanValue();
        }
        if (c21.g() != chb.DEFAULT) {
            return true;
        }
        return false;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c0554dc", new Object[]{str});
        }
        if (!a()) {
            return "";
        }
        chb g = c21.g();
        if (g == null) {
            return str;
        }
        String string = g.getString("currFragmentName", null);
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return str + "_" + string;
    }

    public static String c() {
        chb g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6efb597c", new Object[0]);
        }
        if (a() && (g = c21.g()) != null) {
            return g.getString("currActivitySchemaUrl", null);
        }
        return "";
    }
}
