package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.musview.a;
import com.taobao.media.MediaConstant;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseMUSUrlView extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a.C0525a measureResult;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends ny1<BaseMUSUrlView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710185);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/musview/BaseMUSUrlView$NodeHolder");
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
        t2o.a(986710184);
    }

    public BaseMUSUrlView(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(BaseMUSUrlView baseMUSUrlView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/musview/BaseMUSUrlView");
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
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
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return com.taobao.android.weex_uikit.widget.musview.a.a(context);
    }

    @Override // tb.hvu
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.c(this, i, i2, i3, i4, iArr, this.measureResult);
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.d(this, mUSDKInstance, (MUSUrlHost) obj, this.measureResult);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        egl eglVar = new egl();
        com.taobao.android.weex_uikit.widget.musview.a.b(uINode, eglVar);
        if (eglVar.b()) {
            this.measureResult = (a.C0525a) eglVar.a();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
        } else {
            str.getClass();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.e(this, mUSDKInstance, (MUSUrlHost) obj);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void setBundleUrl(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e24823", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.musview.a.f(uINode, str);
    }

    public void setData(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e0762", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.g(uINode, (JSONObject) jxh.e(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setEnv(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b722a43", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.h(uINode, (JSONObject) jxh.e(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setScriptUrl(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9648ec", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.musview.a.i(uINode, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r9.equals("scriptUrl") == false) goto L_0x002d;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = "7ff29263"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            java.lang.Object r8 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            r9.hashCode()
            r4 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case -1479592563: goto L_0x004f;
                case 100589: goto L_0x0044;
                case 3076010: goto L_0x0039;
                case 249939108: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0059
        L_0x002f:
            java.lang.String r1 = "scriptUrl"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0059
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "data"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            r0 = 2
            goto L_0x0059
        L_0x0044:
            java.lang.String r0 = "env"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004d
            goto L_0x002d
        L_0x004d:
            r0 = 1
            goto L_0x0059
        L_0x004f:
            java.lang.String r0 = "bundleUrl"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0058
            goto L_0x002d
        L_0x0058:
            r0 = 0
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0065;
                case 2: goto L_0x0061;
                case 3: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            return r3
        L_0x005d:
            r7.setScriptUrl(r8, r10)
            return r2
        L_0x0061:
            r7.setData(r8, r10)
            return r2
        L_0x0065:
            r7.setEnv(r8, r10)
            return r2
        L_0x0069:
            r7.setBundleUrl(r8, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.musview.BaseMUSUrlView.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }
}
