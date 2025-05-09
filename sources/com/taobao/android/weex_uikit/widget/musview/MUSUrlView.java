package com.taobao.android.weex_uikit.widget.musview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSUrlView extends BaseMUSUrlView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends BaseMUSUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710190);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/musview/MUSUrlView$NodeHolder");
        }

        /* renamed from: e */
        public MUSUrlView d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSUrlView) ipChange.ipc$dispatch("12153e02", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            MUSUrlView mUSUrlView = new MUSUrlView(i);
            mUSUrlView.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                mUSUrlView.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                mUSUrlView.updateAttrs(mUSProps2);
            }
            return mUSUrlView;
        }
    }

    static {
        t2o.a(986710189);
    }

    public MUSUrlView(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MUSUrlView mUSUrlView, String str, Object... objArr) {
        if (str.hashCode() == -939675523) {
            super.refreshAttribute((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/musview/MUSUrlView");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void refreshAttribute(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, map});
            return;
        }
        super.refreshAttribute(map);
        if (getMountContent() != null) {
            com.taobao.android.weex_uikit.widget.musview.a.d(this, getInstance(), (MUSUrlHost) getMountContent(), this.measureResult);
        }
    }
}
