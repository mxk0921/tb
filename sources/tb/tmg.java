package tb;

import android.text.InputFilter;
import android.text.Spanned;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tmg implements InputFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28802a;

    static {
        t2o.a(806355809);
    }

    public tmg(int i) {
        this.f28802a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
        }
        int length = this.f28802a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
            return charSequence.subSequence(i, i5);
        }
        return "";
    }
}
