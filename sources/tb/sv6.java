package tb;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626500);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str, String str2, Object obj, Object obj2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842d6649", new Object[]{spannableStringBuilder, str, str2, obj, obj2});
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str).append(f7l.CONDITION_IF_MIDDLE);
        if (obj == null) {
            obj = new ForegroundColorSpan(-3355444);
        }
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        int length2 = spannableStringBuilder.length();
        if (str2 == null) {
            str2 = pg1.ATOM_EXT_Null;
        }
        spannableStringBuilder.append((CharSequence) str2).append('\n');
        if (str2 == null) {
            i = -65536;
        } else {
            i = tkt.DEFAULT_SHADOW_COLOR;
        }
        if (obj2 == null) {
            obj2 = new ForegroundColorSpan(i);
        }
        spannableStringBuilder.setSpan(obj2, length2, spannableStringBuilder.length(), 33);
    }
}
