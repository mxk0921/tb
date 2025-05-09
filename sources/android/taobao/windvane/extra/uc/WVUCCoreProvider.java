package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.extra.core.WVCore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.au4;
import tb.t2o;
import tb.yt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCCoreProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UC_CORE_FAILED_HAS_CALLED = 1001;
    private yt4 coreCallback;
    private boolean hasCalled = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface WVUCCoreProviderCallback {
        void onUCCoreFailed(au4 au4Var);

        void onUCCorePrepared();
    }

    static {
        t2o.a(989856101);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.coreCallback != null) {
            WVCoreSettings.getInstance().removeEventCallback2(this.coreCallback);
            this.coreCallback = null;
        }
    }

    public void request(Context context, final WVUCCoreProviderCallback wVUCCoreProviderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be30e7f6", new Object[]{this, context, wVUCCoreProviderCallback});
        } else if (context == null) {
            if (wVUCCoreProviderCallback != null) {
                wVUCCoreProviderCallback.onUCCoreFailed(au4.b(1, "context is null"));
            }
        } else if (!this.hasCalled) {
            if (this.coreCallback == null) {
                this.coreCallback = new yt4() { // from class: android.taobao.windvane.extra.uc.WVUCCoreProvider.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCCoreProvider$1");
                    }

                    @Override // tb.yt4
                    public void onUCCoreInitFailed(au4 au4Var) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("764065fe", new Object[]{this, au4Var});
                            return;
                        }
                        WVUCCoreProviderCallback wVUCCoreProviderCallback2 = wVUCCoreProviderCallback;
                        if (wVUCCoreProviderCallback2 != null) {
                            wVUCCoreProviderCallback2.onUCCoreFailed(au4Var);
                        }
                    }

                    @Override // tb.zt4
                    public void onUCCorePrepared() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                            return;
                        }
                        WVUCCoreProviderCallback wVUCCoreProviderCallback2 = wVUCCoreProviderCallback;
                        if (wVUCCoreProviderCallback2 != null) {
                            wVUCCoreProviderCallback2.onUCCorePrepared();
                        }
                    }
                };
            }
            this.hasCalled = true;
            WVCore.getInstance().initUCCore2(context, this.coreCallback);
        } else if (wVUCCoreProviderCallback != null) {
            wVUCCoreProviderCallback.onUCCoreFailed(au4.b(1001, "already has called"));
        }
    }
}
