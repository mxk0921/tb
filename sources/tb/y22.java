package tb;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251182);
    }

    public static CharSequence a(CharSequence charSequence, CharSequence charSequence2) {
        Spanned fromHtml;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a042154b", new Object[]{charSequence, charSequence2});
        }
        if (Build.VERSION.SDK_INT < 24 || TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        fromHtml = Html.fromHtml(String.format("<font color=\"%s\">%s</font>", charSequence2, charSequence), 0);
        return fromHtml;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16ad649", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!Localization.p()) {
            return sq2.g(Long.valueOf(currentTimeMillis), "SHORT");
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd-HH:mm").format(Long.valueOf(currentTimeMillis));
        } catch (Throwable unused) {
            return "";
        }
    }
}
