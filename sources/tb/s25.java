package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Cut;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s25 extends hu1<Cut> implements srb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705464);
        t2o.a(511705354);
    }

    public static /* synthetic */ Object ipc$super(s25 s25Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/CutEditorImpl");
    }

    @Override // tb.srb
    public void K(Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db23ad30", new Object[]{this, cut});
            return;
        }
        t();
        g().b(cut.clone());
    }

    @Override // tb.srb
    public Cut O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cut) ipChange.ipc$dispatch("2424227e", new Object[]{this});
        }
        return g().a().get();
    }
}
