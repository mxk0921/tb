package androidx.core.widget;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Ltb/xhv;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TextViewKt$addTextChangedListener$2 extends Lambda implements y1a<CharSequence, Integer, Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TextViewKt$addTextChangedListener$2 INSTANCE = new TextViewKt$addTextChangedListener$2();

    public TextViewKt$addTextChangedListener$2() {
        super(4);
    }

    public static /* synthetic */ Object ipc$super(TextViewKt$addTextChangedListener$2 textViewKt$addTextChangedListener$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/widget/TextViewKt$addTextChangedListener$2");
    }

    public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafc5320", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.y1a
    public /* bridge */ /* synthetic */ xhv invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return xhv.INSTANCE;
    }
}
