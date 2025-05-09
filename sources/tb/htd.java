package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltb/htd;", "", "Ltb/qpu;", "engineContext", "", vaj.KEY_TAB_ID, "<init>", "(Ltb/qpu;Ljava/lang/String;)V", "Ltb/xhv;", "onCreate", "()V", "", "args", "", "duration", "Ltb/lrm;", "preloadConfig", "", "onPreload", "(Ljava/util/Map;ILtb/lrm;)Z", "cancel", "()Z", "Ltb/qpu;", "getEngineContext", "()Ltb/qpu;", "Ljava/lang/String;", "getTabId", "()Ljava/lang/String;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class htd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final qpu engineContext;
    private final String tabId;

    static {
        t2o.a(919601363);
    }

    public htd(qpu qpuVar, String str) {
        ckf.g(qpuVar, "engineContext");
        ckf.g(str, vaj.KEY_TAB_ID);
        this.engineContext = qpuVar;
        this.tabId = str;
    }

    public abstract boolean cancel();

    public final qpu getEngineContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("410e9e8c", new Object[]{this});
        }
        return this.engineContext;
    }

    public final String getTabId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303a5d5f", new Object[]{this});
        }
        return this.tabId;
    }

    public abstract void onCreate();

    public abstract boolean onPreload(Map<String, Object> map, int i, lrm lrmVar);
}
