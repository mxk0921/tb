package com.taobao.android.weex_uikit.widget.a;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.media.MediaConstant;
import com.taobao.weex.common.Constants;
import tb.af;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class A extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View.OnClickListener hrefListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends ny1<A> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710124);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/a/A$NodeHolder");
        }

        /* renamed from: e */
        public A d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (A) ipChange.ipc$dispatch("91c62e99", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            A a2 = new A(i);
            a2.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                a2.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                a2.updateAttrs(mUSProps2);
            }
            return a2;
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
        t2o.a(986710123);
    }

    public A(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(A a2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/a/A");
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.LAYOUT;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        egl eglVar = new egl();
        af.c(this, mUSDKInstance, obj, eglVar);
        if (eglVar.b()) {
            this.hrefListener = (View.OnClickListener) eglVar.a();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        str.hashCode();
        if (str.equals("")) {
            refreshRef(uINode, obj, obj2);
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            af.d(this, mUSDKInstance, obj, this.hrefListener);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        str.hashCode();
        if (!str.equals(Constants.Name.HREF)) {
            return false;
        }
        setRef(uINode, mUSValue);
        return true;
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void refreshRef(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdff61", new Object[]{this, uINode, obj, obj2});
            return;
        }
        egl eglVar = new egl();
        af.f(uINode, obj, (String) obj2, this.hrefListener, eglVar);
        if (eglVar.b()) {
            this.hrefListener = (View.OnClickListener) eglVar.a();
        }
    }

    public void setRef(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9daf15d", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        af.g(uINode, str);
    }
}
