package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.aef;
import tb.pg1;
import tb.x96;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Landroid/text/Spannable;", "toSpannable", "(Ljava/lang/CharSequence;)Landroid/text/Spannable;", "Ltb/xhv;", "clearSpans", "(Landroid/text/Spannable;)V", "", "start", "end", "", pg1.ATOM_EXT_span, "set", "(Landroid/text/Spannable;IILjava/lang/Object;)V", "Ltb/aef;", x96.REFRESH_TYPE_RANGE, "(Landroid/text/Spannable;Ltb/aef;Ljava/lang/Object;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpannableStringKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void clearSpans(Spannable spannable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024aaf6", new Object[]{spannable});
            return;
        }
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30513078", new Object[]{spannable, new Integer(i), new Integer(i2), obj});
        } else {
            spannable.setSpan(obj, i, i2, 17);
        }
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spannable) ipChange.ipc$dispatch("5168f53b", new Object[]{charSequence});
        }
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, aef aefVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466bbbee", new Object[]{spannable, aefVar, obj});
        } else {
            spannable.setSpan(obj, aefVar.getStart().intValue(), aefVar.getEndInclusive().intValue(), 17);
        }
    }
}
