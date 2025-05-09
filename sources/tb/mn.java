package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mn extends kk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int j;
    public boolean k;

    static {
        t2o.a(80740389);
    }

    public static /* synthetic */ Object ipc$super(mn mnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/datamodel/nextrpc/AURAStreamNextPRCResponse");
    }

    public void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07e45f1", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175eb867", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2dbfa3d1", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f80a649", new Object[]{this})).booleanValue();
        }
        return this.k;
    }
}
