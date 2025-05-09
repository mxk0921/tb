package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.component.NCComponentBox;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fgz extends NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736921);
    }

    public static /* synthetic */ Object ipc$super(fgz fgzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/base/component/NCComponentBoxHandler");
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCComponentBox(context);
    }
}
