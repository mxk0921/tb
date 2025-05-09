package tb;

import com.ali.alidatabasees.NativeBridgedObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class mjq extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public mjq(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(mjq mjqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/Statement");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            a();
        }
    }
}
