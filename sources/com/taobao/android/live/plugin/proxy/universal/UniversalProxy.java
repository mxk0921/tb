package com.taobao.android.live.plugin.proxy.universal;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.UniversalProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.k2n;
import tb.nzc;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UniversalProxy extends k2n<IUniversalProxy> implements IUniversalProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UniversalProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final UniversalProxy f8773a = new UniversalProxy();

        static {
            t2o.a(806355296);
        }

        public static /* synthetic */ UniversalProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UniversalProxy) ipChange.ipc$dispatch("13bd1e95", new Object[0]);
            }
            return f8773a;
        }
    }

    static {
        t2o.a(806355294);
        t2o.a(806355290);
    }

    public static UniversalProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UniversalProxy) ipChange.ipc$dispatch("c7bb336f", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(UniversalProxy universalProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/universal/UniversalProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public nzc createNegativeFeedbackHandler(Context context, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        nzc nzcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzc) ipChange.ipc$dispatch("5d3f90b0", new Object[]{this, context, tBLiveDataModel, ux9Var});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            nzcVar = real.createNegativeFeedbackHandler(context, tBLiveDataModel, ux9Var);
        } else {
            nzcVar = null;
        }
        FlexaLiveX.w("[UniversalProxy#createNegativeFeedbackHandler]  value: " + nzcVar);
        return nzcVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public DialogFragment createStreamSwitchDialog(String str, String str2) {
        DialogFragment dialogFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogFragment) ipChange.ipc$dispatch("ae075dd3", new Object[]{this, str, str2});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            dialogFragment = real.createStreamSwitchDialog(str, str2);
        } else {
            dialogFragment = null;
        }
        FlexaLiveX.w("[UniversalProxy#createStreamSwitchDialog]  value: " + dialogFragment);
        return dialogFragment;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public DialogFragment createTaoliveQualityDialog(ux9 ux9Var, String str, boolean z) {
        DialogFragment dialogFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogFragment) ipChange.ipc$dispatch("2867d5e0", new Object[]{this, ux9Var, str, new Boolean(z)});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            dialogFragment = real.createTaoliveQualityDialog(ux9Var, str, z);
        } else {
            dialogFragment = null;
        }
        FlexaLiveX.w("[UniversalProxy#createTaoliveQualityDialog]  value: " + dialogFragment);
        return dialogFragment;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IUniversalProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.a getLiveBizRequestManager() {
        IUniversalProxy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.a) ipChange.ipc$dispatch("b03d9f82", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            aVar = real.getLiveBizRequestManager();
        } else {
            aVar = null;
        }
        FlexaLiveX.w("[UniversalProxy#getLiveBizRequestManager]  value: " + aVar);
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.b getLiveEventReportInstance() {
        IUniversalProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.b) ipChange.ipc$dispatch("ef215d42", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            bVar = real.getLiveEventReportInstance();
        } else {
            bVar = null;
        }
        FlexaLiveX.w("[UniversalProxy#getLiveEventReportInstance]  value: " + bVar);
        return bVar;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.UniversalProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "统一架构其它 BType 功能";
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.c getVolumeChangeUploadManager() {
        IUniversalProxy.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.c) ipChange.ipc$dispatch("a2bb2f62", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        if (real != null) {
            cVar = real.getVolumeChangeUploadManager();
        } else {
            cVar = null;
        }
        FlexaLiveX.w("[UniversalProxy#getVolumeChangeUploadManager]  value: " + cVar);
        return cVar;
    }

    private UniversalProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[UniversalProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IUniversalProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IUniversalProxy) ipChange.ipc$dispatch("e794972c", new Object[]{this})) : new UniversalProxyX();
    }
}
