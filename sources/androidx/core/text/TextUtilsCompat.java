package androidx.core.text;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TextUtilsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private TextUtilsCompat() {
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5050ddb2", new Object[]{locale})).intValue();
        }
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static String htmlEncode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e43f656e", new Object[]{str});
        }
        return TextUtils.htmlEncode(str);
    }
}
