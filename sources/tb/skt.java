package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.CardModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class skt extends fwa<CardModel, View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(918552652);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skt(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(skt sktVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/outer/TextComponent");
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public View createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("af9921ca", new Object[]{this});
        }
        return new View(o().getContext());
    }

    @Override // tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return "text_component";
    }
}
