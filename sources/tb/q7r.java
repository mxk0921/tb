package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.event.adjust.autorefresh")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class q7r extends js {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837434);
    }

    public static /* synthetic */ Object ipc$super(q7r q7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/TBBuyAutoRefreshExtension");
    }

    @Override // tb.js
    public void L(UMFLinkageTrigger uMFLinkageTrigger, List<nbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd90ae90", new Object[]{this, uMFLinkageTrigger, list});
        } else {
            o9r.c().j();
        }
    }

    @Override // tb.js
    public boolean m0(mi miVar, mbb<mi, Void> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db904b0", new Object[]{this, miVar, mbbVar})).booleanValue();
        }
        return false;
    }
}
