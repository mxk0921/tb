package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltb/mzf;", "", "<init>", "()V", "", "isParsed", "Z", "()Z", "setParsed", "(Z)V", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "jsonObj", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getJsonObj", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setJsonObj", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isParsed = true;
    private KMPJsonObject jsonObj;

    static {
        t2o.a(1029701710);
    }

    public final KMPJsonObject getJsonObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("a7f1b94", new Object[]{this});
        }
        return this.jsonObj;
    }

    public final boolean isParsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471d4ce6", new Object[]{this})).booleanValue();
        }
        return this.isParsed;
    }

    public final void setJsonObj(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11459b2", new Object[]{this, kMPJsonObject});
        } else {
            this.jsonObj = kMPJsonObject;
        }
    }

    public final void setParsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d41ffa", new Object[]{this, new Boolean(z)});
        } else {
            this.isParsed = z;
        }
    }
}
