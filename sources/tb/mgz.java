package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.components.text_span.NCComponentTextSpan;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mgz extends NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736973);
    }

    public static /* synthetic */ Object ipc$super(mgz mgzVar, String str, Object... objArr) {
        if (str.hashCode() == -76004444) {
            super.onUpdateViewWithContext((biz) objArr[0], (jkz) objArr[1], (jkz) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text_span/NCComponentTextSpanViewHandler");
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCComponentTextSpan(context);
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public void onUpdateViewWithContext(biz bizVar, jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7843a4", new Object[]{this, bizVar, jkzVar, jkzVar2});
            return;
        }
        ckf.g(bizVar, "nanoContext");
        if (jkzVar2 != null) {
            super.onUpdateViewWithContext(bizVar, jkzVar, jkzVar2);
        }
    }
}
