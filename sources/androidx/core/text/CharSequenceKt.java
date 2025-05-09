package androidx.core.text;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0086\b¨\u0006\u0005"}, d2 = {"isDigitsOnly", "", "", "trimmedLength", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CharSequenceKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isDigitsOnly(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf20cab", new Object[]{charSequence})).booleanValue();
        }
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a78120e", new Object[]{charSequence})).intValue();
        }
        return TextUtils.getTrimmedLength(charSequence);
    }
}
