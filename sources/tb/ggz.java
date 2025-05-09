package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.component.NCComponentColumn;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ggz extends NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736924);
    }

    public static /* synthetic */ Object ipc$super(ggz ggzVar, String str, Object... objArr) {
        if (str.hashCode() == 1612780854) {
            super.updateViewWithContext((String) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/base/component/NCComponentColumnViewHandler");
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCComponentColumn(context);
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public void updateViewWithContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60211536", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "newProps");
        ckf.g(str2, "oldProps");
        super.updateViewWithContext(str, str2);
        iiz.a aVar = iiz.Companion;
        aVar.j(" NCComponentColumnViewHandler updatePropsToView newProps:" + str + " oldProps:" + str2);
    }
}
