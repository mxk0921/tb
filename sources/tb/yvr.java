package tb;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792256);
    }

    public static SpannableStringBuilder a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("7fcf5c54", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str4 = str2 + str;
        int indexOf = str4.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        int c = srl.c(str3, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c), indexOf, str2.length() + indexOf, 34);
        return spannableStringBuilder;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2adeea8", new Object[]{str});
        }
        return g6p.e(str, "shop_id");
    }
}
