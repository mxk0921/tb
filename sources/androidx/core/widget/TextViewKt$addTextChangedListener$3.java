package androidx.core.widget;

import android.text.Editable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Editable;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TextViewKt$addTextChangedListener$3 extends Lambda implements g1a<Editable, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TextViewKt$addTextChangedListener$3 INSTANCE = new TextViewKt$addTextChangedListener$3();

    public TextViewKt$addTextChangedListener$3() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(TextViewKt$addTextChangedListener$3 textViewKt$addTextChangedListener$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/widget/TextViewKt$addTextChangedListener$3");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44397bdc", new Object[]{this, editable});
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Editable editable) {
        invoke2(editable);
        return xhv.INSTANCE;
    }
}
