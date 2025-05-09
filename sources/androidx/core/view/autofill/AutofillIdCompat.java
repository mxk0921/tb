package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ql1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AutofillIdCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutofillIdCompat) ipChange.ipc$dispatch("2dfe0d19", new Object[]{autofillId});
        }
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ql1.a(ipChange.ipc$dispatch("f58626d6", new Object[]{this}));
        }
        return ql1.a(this.mWrappedObj);
    }
}
