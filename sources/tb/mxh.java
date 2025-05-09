package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final hvu f24368a = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends hvu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710033);
        }

        public a(Object obj) {
            super(obj);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/pool/mount/MUSViewPool$MUSViewLifecycle");
        }

        @Override // tb.hvu
        public Object onCreateMountContent(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
            }
            return new MUSView(context);
        }

        @Override // tb.hvu
        public int poolSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
            }
            return 10;
        }
    }

    static {
        t2o.a(986710032);
    }

    public static MUSView a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("3737a0a3", new Object[]{mUSDKInstance});
        }
        MUSView mUSView = (MUSView) dd4.a(mUSDKInstance.getUIContext(), f24368a);
        mUSView.setInstance(mUSDKInstance);
        return mUSView;
    }

    public static void b(MUSView mUSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742ce572", new Object[]{mUSView});
            return;
        }
        mUSView.release(true);
        mUSView.setInstance(null);
        try {
            dd4.h(mUSView.getContext(), f24368a, mUSView);
        } catch (Exception e) {
            wvh.a().b("MUSViewPool.releaseMUSView", e);
            dwh.i(e);
        }
    }
}
