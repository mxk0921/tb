package android.taobao.windvane.extra.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/WVMegaBridgeContext;", "", "enableLoggingAPIInvocation", "", "callToken", "", "parentId", "(ZLjava/lang/String;Ljava/lang/String;)V", "getCallToken", "()Ljava/lang/String;", "getEnableLoggingAPIInvocation", "()Z", "getParentId", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WVMegaBridgeContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String callToken;
    private final boolean enableLoggingAPIInvocation;
    private final String parentId;

    static {
        t2o.a(989855962);
    }

    public WVMegaBridgeContext(boolean z, String str, String str2) {
        this.enableLoggingAPIInvocation = z;
        this.callToken = str;
        this.parentId = str2;
    }

    public final String getCallToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c637894", new Object[]{this});
        }
        return this.callToken;
    }

    public final boolean getEnableLoggingAPIInvocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efa51cf", new Object[]{this})).booleanValue();
        }
        return this.enableLoggingAPIInvocation;
    }

    public final String getParentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ba388fe", new Object[]{this});
        }
        return this.parentId;
    }
}
