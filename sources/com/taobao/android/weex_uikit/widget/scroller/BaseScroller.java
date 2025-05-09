package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.scroller.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.pxh;
import tb.t2o;
import tb.yio;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseScroller extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public ywh nodeTree;
    public ScrollerRootNode rootNode;
    public int scrollDistance;
    public pxh scrollListener;
    public a.C0526a scrollToDelayTask;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MUSValue[] d;
        public final /* synthetic */ UINode e;

        public a(MUSValue[] mUSValueArr, UINode uINode) {
            this.d = mUSValueArr;
            this.e = uINode;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/BaseScroller$1");
        }

        @Override // tb.yio
        public void e() {
            float f;
            boolean z;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            egl eglVar = new egl();
            Float f2 = (Float) jxh.e(BaseScroller.this.getInstance(), null, Float.TYPE, BaseScroller.access$000(BaseScroller.this, this.d, 1));
            Boolean bool = (Boolean) jxh.e(BaseScroller.this.getInstance(), null, Boolean.TYPE, BaseScroller.access$100(BaseScroller.this, this.d, 2));
            MUSDKInstance instance = BaseScroller.this.getInstance();
            Class cls = Integer.TYPE;
            Integer num = (Integer) jxh.e(instance, null, cls, BaseScroller.access$200(BaseScroller.this, this.d, 3));
            UINode uINode = this.e;
            int intValue = ((Integer) jxh.e(BaseScroller.this.getInstance(), null, cls, BaseScroller.access$300(BaseScroller.this, this.d, 0))).intValue();
            if (f2 == null) {
                f = 0.0f;
            } else {
                f = f2.floatValue();
            }
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            com.taobao.android.weex_uikit.widget.scroller.a.m(uINode, intValue, f, z, i, eglVar, BaseScroller.this.rootNode);
            if (eglVar.b()) {
                BaseScroller.this.scrollToDelayTask = (a.C0526a) eglVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends ny1<BaseScroller> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710217);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/BaseScroller$NodeHolder");
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return "[\"scrollTo\"]";
        }
    }

    public BaseScroller(int i) {
        super(i);
    }

    public static /* synthetic */ MUSValue access$000(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("59c4fae9", new Object[]{baseScroller, mUSValueArr, new Integer(i)});
        }
        return baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("f7011248", new Object[]{baseScroller, mUSValueArr, new Integer(i)});
        }
        return baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("943d29a7", new Object[]{baseScroller, mUSValueArr, new Integer(i)});
        }
        return baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("31794106", new Object[]{baseScroller, mUSValueArr, new Integer(i)});
        }
        return baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ Object ipc$super(BaseScroller baseScroller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/BaseScroller");
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

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.c(uINode, mUSDKInstance, this.rootNode);
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return com.taobao.android.weex_uikit.widget.scroller.a.e(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
            return;
        }
        str.hashCode();
        if (str.equals("scrollTo")) {
            scrollTo(uINode, mUSValueArr);
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
        egl eglVar2 = new egl();
        com.taobao.android.weex_uikit.widget.scroller.a.f(this, mUSDKInstance, (ScrollerContainer) obj, this.scrollToDelayTask, this.rootNode, this.nodeTree, this.scrollDistance, this.scrollListener, eglVar, eglVar2);
        if (eglVar.b()) {
            this.scrollToDelayTask = (a.C0526a) eglVar.a();
        }
        if (eglVar2.b()) {
            this.scrollDistance = ((Integer) eglVar2.a()).intValue();
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
        com.taobao.android.weex_uikit.widget.scroller.a.d(uINode, eglVar);
        if (eglVar.b()) {
            this.scrollListener = (pxh) eglVar.a();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        egl eglVar = new egl();
        egl eglVar2 = new egl();
        com.taobao.android.weex_uikit.widget.scroller.a.h(this, mUSDKInstance, (ScrollerContainer) obj, eglVar, eglVar2);
        if (eglVar.b()) {
            this.scrollDistance = ((Integer) eglVar.a()).intValue();
        }
        if (eglVar2.b()) {
            this.scrollToDelayTask = (a.C0526a) eglVar2.a();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.i(this, i, i2, i3, i4, this.rootNode);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.g(this, list, this.rootNode);
        }
    }

    public void refreshScrollDirection(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e996a22", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.j(uINode, (ScrollerContainer) obj, (String) obj2, this.nodeTree, this.rootNode);
        }
    }

    public void refreshScrollable(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7499d77", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.k(uINode, (ScrollerContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshShowScrollBar(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1db56b", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.l(uINode, (ScrollerContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void scrollTo(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba879fa9", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new a(mUSValueArr, uINode));
        }
    }

    public void setScrollDirection(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a237b89e", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.scroller.a.n(uINode, str);
    }

    public void setScrollable(UINode uINode, MUSValue mUSValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1265185", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.scroller.a.o(uINode, z);
    }

    public void setShowScrollBar(UINode uINode, MUSValue mUSValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b8a0a7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.scroller.a.p(uINode, z);
    }

    static {
        t2o.a(986710215);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("scrollDirection", "vertical");
        Boolean bool = Boolean.TRUE;
        hashMap.put("showScrollbar", bool);
        hashMap.put("scrollable", bool);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r9.equals("scrollDirection") == false) goto L_0x0029;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode r7, java.lang.Object r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.scroller.BaseScroller.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "fd3c7823"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001e:
            r9.hashCode()
            r3 = -1
            int r4 = r9.hashCode()
            switch(r4) {
                case -223520855: goto L_0x0041;
                case 66669991: goto L_0x0035;
                case 1614714674: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x004c
        L_0x002b:
            java.lang.String r1 = "scrollDirection"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x004c
            goto L_0x0029
        L_0x0035:
            java.lang.String r0 = "scrollable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r0 = "showScrollbar"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004b
            goto L_0x0029
        L_0x004b:
            r0 = 0
        L_0x004c:
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0054;
                case 2: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x005b
        L_0x0050:
            r6.refreshScrollDirection(r7, r8, r10)
            goto L_0x005b
        L_0x0054:
            r6.refreshScrollable(r7, r8, r10)
            goto L_0x005b
        L_0x0058:
            r6.refreshShowScrollBar(r7, r8, r10)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.scroller.BaseScroller.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r8.equals("scrollDirection") == false) goto L_0x002d;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r7, java.lang.String r8, com.taobao.android.weex_framework.MUSValue r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.scroller.BaseScroller.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "7ff29263"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0022:
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -223520855: goto L_0x0045;
                case 66669991: goto L_0x0039;
                case 1614714674: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0050
        L_0x002f:
            java.lang.String r4 = "scrollDirection"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0050
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "scrollable"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0043
            goto L_0x002d
        L_0x0043:
            r0 = 1
            goto L_0x0050
        L_0x0045:
            java.lang.String r0 = "showScrollbar"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004f
            goto L_0x002d
        L_0x004f:
            r0 = 0
        L_0x0050:
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0058;
                case 2: goto L_0x0054;
                default: goto L_0x0053;
            }
        L_0x0053:
            return r2
        L_0x0054:
            r6.setScrollDirection(r7, r9)
            return r1
        L_0x0058:
            r6.setScrollable(r7, r9)
            return r1
        L_0x005c:
            r6.setShowScrollBar(r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.scroller.BaseScroller.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }
}
