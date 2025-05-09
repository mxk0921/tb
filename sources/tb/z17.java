package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z17 extends rpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237984);
    }

    public static /* synthetic */ Object ipc$super(z17 z17Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/DefaultLayoutHelper");
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d623d5e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }
}
