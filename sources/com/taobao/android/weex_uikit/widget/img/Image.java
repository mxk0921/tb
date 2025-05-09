package com.taobao.android.weex_uikit.widget.img;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.media.MediaConstant;
import java.util.HashMap;
import java.util.Map;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.ooe;
import tb.pme;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Image extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public pme mountState;
    public a.b stateListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends ny1<Image> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710138);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/img/Image$NodeHolder");
        }

        /* renamed from: e */
        public Image d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Image) ipChange.ipc$dispatch("9fc4d37d", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Image image = new Image(i);
            image.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                image.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                image.updateAttrs(mUSProps2);
            }
            return image;
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

    public Image(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(Image image, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/img/Image");
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acae82d0", new Object[]{this, str});
        }
        return ATTR_DEF_MAP.get(str);
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.DRAWABLE;
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
        return ooe.e(context);
    }

    @Override // tb.hvu
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            ooe.f(this, i, i2, i3, i4, iArr, this.mountState);
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        egl eglVar = new egl();
        ooe.g(this, mUSDKInstance, obj, eglVar, this.mountState);
        if (eglVar.b()) {
            this.stateListener = (a.b) eglVar.a();
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
        ooe.d(uINode, eglVar);
        if (eglVar.b()) {
            this.mountState = (pme) eglVar.a();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            ooe.h(this, mUSDKInstance, obj, this.stateListener, this.mountState);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 30;
    }

    public void refreshAlt(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adf7d0b", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.j(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshFilter(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d693e46", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.k(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshObjectFit(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b614942", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.l(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshPlaceHolder(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c881bb61", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.m(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshQuality(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcc86f5", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.n(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshSrc(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df32e30", new Object[]{this, uINode, obj, obj2});
        } else {
            ooe.o(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void setAlt(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a12507", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.p(uINode, str);
    }

    public void setFilter(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e627d4", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.q(uINode, str);
    }

    public void setObjectFit(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fda8fe", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.r(uINode, str);
    }

    public void setPlaceHolder(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6600b65d", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.s(uINode, str);
    }

    public void setQuality(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7944c971", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.t(uINode, str);
    }

    public void setSrc(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4157e12c", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        ooe.u(uINode, str, this.mountState);
    }

    static {
        t2o.a(986710137);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("quality", "auto");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r9.equals("src") == false) goto L_0x002d;
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
            r2 = 4
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_uikit.widget.img.Image.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = "7ff29263"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r7
            r2[r3] = r8
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r8 = r5.ipc$dispatch(r6, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            r9.hashCode()
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1489619886: goto L_0x0067;
                case -1274492040: goto L_0x005c;
                case 96681: goto L_0x0051;
                case 114148: goto L_0x0047;
                case 598246771: goto L_0x003b;
                case 651215103: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0072
        L_0x002f:
            java.lang.String r0 = "quality"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r0 = 5
            goto L_0x0072
        L_0x003b:
            java.lang.String r0 = "placeholder"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            r0 = 4
            goto L_0x0072
        L_0x0047:
            java.lang.String r1 = "src"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0072
            goto L_0x002d
        L_0x0051:
            java.lang.String r0 = "alt"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x005a
            goto L_0x002d
        L_0x005a:
            r0 = 2
            goto L_0x0072
        L_0x005c:
            java.lang.String r0 = "filter"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0065
            goto L_0x002d
        L_0x0065:
            r0 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r0 = "objectFit"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0071
            goto L_0x002d
        L_0x0071:
            r0 = 0
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0086;
                case 2: goto L_0x0082;
                case 3: goto L_0x007e;
                case 4: goto L_0x007a;
                case 5: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            return r4
        L_0x0076:
            r7.setQuality(r8, r10)
            return r3
        L_0x007a:
            r7.setPlaceHolder(r8, r10)
            return r3
        L_0x007e:
            r7.setSrc(r8, r10)
            return r3
        L_0x0082:
            r7.setAlt(r8, r10)
            return r3
        L_0x0086:
            r7.setFilter(r8, r10)
            return r3
        L_0x008a:
            r7.setObjectFit(r8, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.img.Image.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r11.equals("placeholder") == false) goto L_0x0029;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode r9, java.lang.Object r10, java.lang.String r11, java.lang.Object r12) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 5
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.weex_uikit.widget.img.Image.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = "fd3c7823"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r8
            r5[r3] = r9
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            r6.ipc$dispatch(r7, r5)
            return
        L_0x001e:
            r11.hashCode()
            r6 = -1
            int r7 = r11.hashCode()
            switch(r7) {
                case -1489619886: goto L_0x0063;
                case -1274492040: goto L_0x0058;
                case 96681: goto L_0x004d;
                case 114148: goto L_0x0041;
                case 598246771: goto L_0x0037;
                case 651215103: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x006e
        L_0x002b:
            java.lang.String r0 = "quality"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r0 = 5
            goto L_0x006e
        L_0x0037:
            java.lang.String r1 = "placeholder"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x006e
            goto L_0x0029
        L_0x0041:
            java.lang.String r0 = "src"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x004b
            goto L_0x0029
        L_0x004b:
            r0 = 3
            goto L_0x006e
        L_0x004d:
            java.lang.String r0 = "alt"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0056
            goto L_0x0029
        L_0x0056:
            r0 = 2
            goto L_0x006e
        L_0x0058:
            java.lang.String r0 = "filter"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0061
            goto L_0x0029
        L_0x0061:
            r0 = 1
            goto L_0x006e
        L_0x0063:
            java.lang.String r0 = "objectFit"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x006d
            goto L_0x0029
        L_0x006d:
            r0 = 0
        L_0x006e:
            switch(r0) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0082;
                case 2: goto L_0x007e;
                case 3: goto L_0x007a;
                case 4: goto L_0x0076;
                case 5: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0089
        L_0x0072:
            r8.refreshQuality(r9, r10, r12)
            goto L_0x0089
        L_0x0076:
            r8.refreshPlaceHolder(r9, r10, r12)
            goto L_0x0089
        L_0x007a:
            r8.refreshSrc(r9, r10, r12)
            goto L_0x0089
        L_0x007e:
            r8.refreshAlt(r9, r10, r12)
            goto L_0x0089
        L_0x0082:
            r8.refreshFilter(r9, r10, r12)
            goto L_0x0089
        L_0x0086:
            r8.refreshObjectFit(r9, r10, r12)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.img.Image.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }
}
