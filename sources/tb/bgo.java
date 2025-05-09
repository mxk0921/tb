package tb;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bgo extends j02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710207);
    }

    public bgo(RichText richText) {
        super(richText);
    }

    public static /* synthetic */ Object ipc$super(bgo bgoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/RootNode");
    }

    @Override // tb.j02
    public void q(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4be97", new Object[]{this, spannableString, new Integer(i)});
            return;
        }
        o(spannableString, i, g().length() + i);
        p(spannableString, i);
    }
}
