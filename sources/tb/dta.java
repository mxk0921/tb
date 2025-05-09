package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dta extends hta implements scp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    public static /* synthetic */ Object ipc$super(dta dtaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/handshake/HandshakeImpl1Server");
    }

    public void a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9167e1ca", new Object[]{this, new Short(s)});
        }
    }

    @Override // tb.rcp
    public String getHttpStatusMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d8dc02", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.scp
    public void setHttpStatusMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c1ac1c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
