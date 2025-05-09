package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xf0 extends hu1<Adjust> implements qeb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705459);
        t2o.a(511705350);
    }

    public static /* synthetic */ Object ipc$super(xf0 xf0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/AdjustEditorImpl");
    }

    @Override // tb.qeb
    public Adjust A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adjust) ipChange.ipc$dispatch("a43eb512", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.qeb
    public void Q(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28830dfe", new Object[]{this, adjust});
            return;
        }
        t();
        g().b(adjust.clone());
    }
}
