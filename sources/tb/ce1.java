package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ce1<T> extends jn8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(670040070);
    }

    public static /* synthetic */ boolean a(ce1 ce1Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aa56cc", new Object[]{ce1Var, obj})).booleanValue();
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(ce1 ce1Var, String str, Object... objArr) {
        if (str.hashCode() != -331693476) {
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/AsyncDecorator");
        }
        Object obj = objArr[0];
        throw null;
    }
}
