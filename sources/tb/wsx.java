package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wsx extends vyx {
    static {
        t2o.a(253755410);
    }

    public wsx(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.k = new String[]{"com.heytap.htms.MspCoreProvider"};
    }

    @Override // tb.vyx
    public String g() {
        return "com.heytap.msp.v2.ipcchannel.provider.MspCoreProvider";
    }

    public final IBinder i() {
        Object d = d(this.f16066a, "com.heytap.msp.v2.ipcchannel.provider.MspCoreModule", this.c, 0, new Object[0]);
        if (IBinder.class.isPrimitive() && d == null) {
            throw new BridgeExecuteException("Primitive not allow return null", 101009);
        } else if (d == null || (d instanceof IBinder)) {
            return (IBinder) d;
        } else {
            throw new BridgeExecuteException("return value is not match:" + d, 102004);
        }
    }
}
