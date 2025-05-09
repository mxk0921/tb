package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cta extends hta implements nu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b = "*";

    public static /* synthetic */ Object ipc$super(cta ctaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/handshake/HandshakeImpl1Client");
    }

    public void a(String str) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97996770", new Object[]{this, str});
        } else if (str != null) {
            this.b = str;
        } else {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
    }

    @Override // tb.mu3
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this});
        }
        return this.b;
    }
}
