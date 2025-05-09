package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class b2r<T> extends jn8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(670040077);
    }

    public static /* synthetic */ boolean a(b2r b2rVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fc54a85", new Object[]{b2rVar, obj})).booleanValue();
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(b2r b2rVar, String str, Object... objArr) {
        if (str.hashCode() != -331693476) {
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/SyncDecorator");
        }
        Object obj = objArr[0];
        throw null;
    }
}
