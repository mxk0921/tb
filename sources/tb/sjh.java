package tb;

import android.text.style.ClickableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class sjh extends ClickableSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710254);
    }

    public static /* synthetic */ Object ipc$super(sjh sjhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/text/LongClickableSpan");
    }

    public abstract boolean a(View view);
}
