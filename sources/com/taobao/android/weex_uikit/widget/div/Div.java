package com.taobao.android.weex_uikit.widget.div;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.media.MediaConstant;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Div extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends ny1<Div> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710136);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/div/Div$NodeHolder");
        }

        /* renamed from: e */
        public Div d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Div) ipChange.ipc$dispatch("5d206e39", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Div div = new Div(i);
            div.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                div.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                div.updateAttrs(mUSProps2);
            }
            return div;
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    static {
        t2o.a(986710135);
    }

    public Div(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(Div div, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/div/Div");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
