package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.adjust.cache")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fo0 extends js {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public io0 e;

    static {
        t2o.a(301990018);
    }

    public static /* synthetic */ Object ipc$super(fo0 fo0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/queryParams/AliBuyStreamResponseAdjustEventCacheExtension");
    }

    public final void J0(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf27c4cf", new Object[]{this, uMFLinkageTrigger});
            return;
        }
        io0 K0 = K0();
        if (K0 == null) {
            ck.g().e("stream", "streamExceptionProcessor is null, is not stream response ??");
        } else {
            K0.w(uMFLinkageTrigger);
        }
    }

    public final io0 K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io0) ipChange.ipc$dispatch("ea1f99eb", new Object[]{this});
        }
        if (this.e == null) {
            this.e = (io0) x().get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        }
        return this.e;
    }

    @Override // tb.js
    public void L(UMFLinkageTrigger uMFLinkageTrigger, List<nbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd90ae90", new Object[]{this, uMFLinkageTrigger, list});
        } else {
            J0(uMFLinkageTrigger);
        }
    }

    @Override // tb.js
    public boolean m0(mi miVar, mbb<mi, Void> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db904b0", new Object[]{this, miVar, mbbVar})).booleanValue();
        }
        if (!"AURANextRPCServiceDomain".equals(miVar.c())) {
            return false;
        }
        kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
        if (kkVar != null) {
            return "F-10000-05-15-002".equals(kkVar.h()) && K0() != null;
        }
        ck.g().e("stream", "remoteResponse is null");
        return false;
    }
}
