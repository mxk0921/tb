package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n9 extends k8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<View> g;

    static {
        t2o.a(336592934);
    }

    public static /* synthetic */ Object ipc$super(n9 n9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/AKUIAbilityRuntimeContext");
    }

    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        WeakReference<View> weakReference = this.g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.g.get();
    }

    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.g = new WeakReference<>(view);
        }
    }
}
