package tb;

import android.content.Context;
import android.os.Bundle;
import com.heytap.msp.keychain.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qyx extends s3y implements r4y {
    static {
        t2o.a(253755427);
        t2o.a(253755428);
    }

    public qyx(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.i = new String[]{"com.heytap.htms.action.KEY_CHAIN_SERVICE"};
    }

    @Override // tb.r4y
    public final void a(Bundle bundle, a aVar) {
        h();
        a(this.f16066a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 4, bundle, aVar);
    }

    @Override // tb.r4y
    public final void b(Bundle bundle, a aVar) {
        h();
        a(this.f16066a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 1, bundle, aVar);
    }

    @Override // tb.r4y
    public final void c(Bundle bundle, a aVar) {
        h();
        a(this.f16066a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 2, bundle, aVar);
    }

    @Override // tb.s3y
    public String l() {
        return "com.heytap.msp.keychain.KeyChainService";
    }
}
