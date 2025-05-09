package com.taobao.android.icart.weex;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.instance.BaseHybridInstance;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.c9x;
import tb.ckf;
import tb.hav;
import tb.j2e;
import tb.mmm;
import tb.ne3;
import tb.pg1;
import tb.qnm;
import tb.t2o;
import tb.u7k;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/taobao/android/icart/weex/TradeHybridInstanceManager;", "", "<init>", "()V", "Ltb/j2e;", "syncGetPreRenderInstance", "()Ltb/j2e;", "Ltb/xhv;", "preRenderInstance", "", "hasPreRenderInstance", "()Z", "isTabMain", "preCreateInstance", "(Z)V", "destroyPreInstance", "Lcom/taobao/android/icart/BaseICartFragmentProxy;", pg1.ATOM_proxy, "getAvailableInstance", "(Lcom/taobao/android/icart/BaseICartFragmentProxy;Z)Ltb/j2e;", "mPreRenderInstance", "Ltb/j2e;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStartCreateOtherInstance", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPreCreateInstance", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TradeHybridInstanceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeHybridInstanceManager INSTANCE = new TradeHybridInstanceManager();
    private static AtomicBoolean isStartCreateOtherInstance = new AtomicBoolean();
    private static volatile j2e mPreCreateInstance;
    private static volatile j2e mPreRenderInstance;

    static {
        t2o.a(478150914);
    }

    private TradeHybridInstanceManager() {
    }

    public final void destroyPreInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d4d585", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                j2e j2eVar = mPreRenderInstance;
                if (j2eVar != null) {
                    j2eVar.destroy();
                }
                mPreRenderInstance = null;
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        j2e j2eVar2 = mPreCreateInstance;
        if (j2eVar2 != null) {
            j2eVar2.destroy();
        }
        mPreCreateInstance = null;
    }

    public final boolean hasPreRenderInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265318df", new Object[]{this})).booleanValue();
        }
        if (mPreRenderInstance != null) {
            return true;
        }
        return false;
    }

    public final void preCreateInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa01c79", new Object[]{this, new Boolean(z)});
        } else if (mPreCreateInstance == null) {
            if (!z || mPreRenderInstance == null) {
                isStartCreateOtherInstance.set(true);
                mmm mmmVar = new mmm(z);
                mPreCreateInstance = mmmVar;
                mmmVar.r(c9x.Companion.b());
            }
        }
    }

    public final void preRenderInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf1d755", new Object[]{this});
        } else if (OrangeUtil.useWeexPrerender() && mPreRenderInstance == null && !isStartCreateOtherInstance.getAndSet(true)) {
            synchronized (this) {
                qnm qnmVar = new qnm();
                mPreRenderInstance = qnmVar;
                qnmVar.r(c9x.Companion.b());
                xhv xhvVar = xhv.INSTANCE;
            }
        }
    }

    private final j2e syncGetPreRenderInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2e) ipChange.ipc$dispatch("eeacc73a", new Object[]{this});
        }
        if (mPreRenderInstance == null) {
            return null;
        }
        synchronized (this) {
            j2e j2eVar = mPreRenderInstance;
            mPreRenderInstance = null;
            if (j2eVar == null || !j2eVar.e()) {
                return j2eVar;
            }
            j2eVar.destroy();
            ne3.c.e(ne3.Companion, "GetPreRenderInstanceHasError", "获取预热实例，但是实例发生过JSError异常", 0.0f, 4, null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [tb.j2e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.icart.weex.instance.BaseHybridInstance, tb.u7k] */
    /* JADX WARN: Type inference failed for: r4v4, types: [tb.j2e] */
    public final j2e getAvailableInstance(BaseICartFragmentProxy baseICartFragmentProxy, boolean z) {
        j2e j2eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2e) ipChange.ipc$dispatch("17daf5e1", new Object[]{this, baseICartFragmentProxy, new Boolean(z)});
        }
        ckf.g(baseICartFragmentProxy, pg1.ATOM_proxy);
        Activity b = baseICartFragmentProxy.b();
        String b2 = c9x.Companion.b();
        if (z) {
            j2eVar = syncGetPreRenderInstance();
            if (j2eVar instanceof qnm) {
                ((BaseHybridInstance) j2eVar).v();
            }
        } else {
            j2eVar = null;
        }
        if (j2eVar == null) {
            j2eVar = mPreCreateInstance;
            mPreCreateInstance = null;
        }
        if (j2eVar == 0) {
            j2eVar = new u7k(baseICartFragmentProxy, z);
            isStartCreateOtherInstance.set(true);
            j2eVar.r(b2);
        }
        hav.d(c9x.TAG, "CartTradeHybridManager 获取到" + j2eVar.name() + " isTabMain=" + z);
        ckf.f(b, "activity");
        j2eVar.d(b);
        j2eVar.k(baseICartFragmentProxy);
        return j2eVar;
    }
}
