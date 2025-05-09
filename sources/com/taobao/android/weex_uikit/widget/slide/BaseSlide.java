package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.slide.a;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseSlide extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public a.C0527a currentIndex;
    public SlideDelegateNode delegateNode;
    public ViewPager.OnPageChangeListener pageListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public a(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/BaseSlide$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.slide.a.r(this.d, ((Integer) jxh.e(BaseSlide.this.getInstance(), null, Integer.TYPE, BaseSlide.access$000(BaseSlide.this, this.e, 0))).intValue(), ((Boolean) jxh.e(BaseSlide.this.getInstance(), null, Boolean.TYPE, BaseSlide.access$100(BaseSlide.this, this.e, 1))).booleanValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends ny1<BaseSlide> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710234);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/BaseSlide$NodeHolder");
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

    public BaseSlide(int i) {
        super(i);
    }

    public static /* synthetic */ MUSValue access$000(BaseSlide baseSlide, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("11e5a78b", new Object[]{baseSlide, mUSValueArr, new Integer(i)});
        }
        return baseSlide.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseSlide baseSlide, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("7662722a", new Object[]{baseSlide, mUSValueArr, new Integer(i)});
        }
        return baseSlide.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ Object ipc$super(BaseSlide baseSlide, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/BaseSlide");
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
            com.taobao.android.weex_uikit.widget.slide.a.f(uINode, mUSDKInstance, this.delegateNode);
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return com.taobao.android.weex_uikit.widget.slide.a.g(context);
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
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.h(this, mUSDKInstance, (SlideContainer) obj, this.delegateNode, this.pageListener, this.currentIndex);
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
        egl eglVar2 = new egl();
        egl eglVar3 = new egl();
        com.taobao.android.weex_uikit.widget.slide.a.i(uINode, eglVar, eglVar2, eglVar3);
        if (eglVar.b()) {
            this.delegateNode = (SlideDelegateNode) eglVar.a();
        }
        if (eglVar2.b()) {
            this.currentIndex = (a.C0527a) eglVar2.a();
        }
        if (eglVar3.b()) {
            this.pageListener = (ViewPager.OnPageChangeListener) eglVar3.a();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.k(this, mUSDKInstance, (SlideContainer) obj, this.pageListener);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 5;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.j(this, list, this.delegateNode);
        }
    }

    public void refreshAutoPlay(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaf565b", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.l(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshEffect(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e86d4d", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.m(uINode, (SlideContainer) obj, (JSONObject) obj2);
        }
    }

    public void refreshIndex(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eecba42", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.n(uINode, (SlideContainer) obj, ((Integer) obj2).intValue(), this.currentIndex);
        }
    }

    public void refreshInfinite(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3350f5ea", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.o(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue(), this.delegateNode);
        }
    }

    public void refreshInterval(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88811b59", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.p(uINode, (SlideContainer) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshScrollable(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7499d77", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.q(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void scrollTo(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba879fa9", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new a(uINode, mUSValueArr));
        }
    }

    public void setAutoPlay(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca058a9", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.s(uINode, z);
    }

    public void setEffect(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a55fdb", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.t(uINode, (JSONObject) jxh.e(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setIndex(UINode uINode, MUSValue mUSValue) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93d157e", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            i = ((Integer) jxh.e(getInstance(), null, Integer.TYPE, mUSValue)).intValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.u(uINode, i);
    }

    public void setInfinite(UINode uINode, MUSValue mUSValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576cf938", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.v(uINode, z);
    }

    public void setInterval(UINode uINode, MUSValue mUSValue) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa543fa7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            i = ((Integer) jxh.e(getInstance(), null, Integer.TYPE, mUSValue)).intValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.w(uINode, i);
    }

    public void setNextMargin(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0bfdeb", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.slide.a.x(uINode, str);
    }

    public void setPreviousMargin(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de9e67", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.slide.a.y(uINode, str);
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
        com.taobao.android.weex_uikit.widget.slide.a.z(uINode, z);
    }

    static {
        t2o.a(986710232);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        Boolean bool = Boolean.TRUE;
        hashMap.put("scrollable", bool);
        hashMap.put("infinite", bool);
        hashMap.put("autoplay", Boolean.FALSE);
        hashMap.put("index", 0);
        hashMap.put(Constants.Name.INTERVAL, 1);
        hashMap.put("previousMargin", 0);
        hashMap.put("nextMargin", 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r9.equals("scrollable") == false) goto L_0x002d;
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
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_uikit.widget.slide.BaseSlide.$ipChange
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
                case -1453344127: goto L_0x007d;
                case -1306084975: goto L_0x0072;
                case -202057851: goto L_0x0066;
                case 66669991: goto L_0x005c;
                case 100346066: goto L_0x0051;
                case 173173268: goto L_0x0046;
                case 570418373: goto L_0x003a;
                case 1439562083: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x0088
        L_0x002f:
            java.lang.String r0 = "autoplay"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0038
            goto L_0x002d
        L_0x0038:
            r0 = 7
            goto L_0x0088
        L_0x003a:
            java.lang.String r0 = "interval"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0044
            goto L_0x002d
        L_0x0044:
            r0 = 6
            goto L_0x0088
        L_0x0046:
            java.lang.String r0 = "infinite"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004f
            goto L_0x002d
        L_0x004f:
            r0 = 5
            goto L_0x0088
        L_0x0051:
            java.lang.String r0 = "index"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x005a
            goto L_0x002d
        L_0x005a:
            r0 = 4
            goto L_0x0088
        L_0x005c:
            java.lang.String r1 = "scrollable"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0088
            goto L_0x002d
        L_0x0066:
            java.lang.String r0 = "previousMargin"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0070
            goto L_0x002d
        L_0x0070:
            r0 = 2
            goto L_0x0088
        L_0x0072:
            java.lang.String r0 = "effect"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x007b
            goto L_0x002d
        L_0x007b:
            r0 = 1
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "nextMargin"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0087
            goto L_0x002d
        L_0x0087:
            r0 = 0
        L_0x0088:
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a0;
                case 3: goto L_0x009c;
                case 4: goto L_0x0098;
                case 5: goto L_0x0094;
                case 6: goto L_0x0090;
                case 7: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r4
        L_0x008c:
            r7.setAutoPlay(r8, r10)
            return r3
        L_0x0090:
            r7.setInterval(r8, r10)
            return r3
        L_0x0094:
            r7.setInfinite(r8, r10)
            return r3
        L_0x0098:
            r7.setIndex(r8, r10)
            return r3
        L_0x009c:
            r7.setScrollable(r8, r10)
            return r3
        L_0x00a0:
            r7.setPreviousMargin(r8, r10)
            return r3
        L_0x00a4:
            r7.setEffect(r8, r10)
            return r3
        L_0x00a8:
            r7.setNextMargin(r8, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.slide.BaseSlide.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r11.equals(com.taobao.weex.common.Constants.Name.INTERVAL) == false) goto L_0x0029;
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
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.weex_uikit.widget.slide.BaseSlide.$ipChange
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
                case -1306084975: goto L_0x0062;
                case 66669991: goto L_0x0056;
                case 100346066: goto L_0x004b;
                case 173173268: goto L_0x0040;
                case 570418373: goto L_0x0036;
                case 1439562083: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x006c
        L_0x002b:
            java.lang.String r0 = "autoplay"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = 5
            goto L_0x006c
        L_0x0036:
            java.lang.String r1 = "interval"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x006c
            goto L_0x0029
        L_0x0040:
            java.lang.String r0 = "infinite"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0049
            goto L_0x0029
        L_0x0049:
            r0 = 3
            goto L_0x006c
        L_0x004b:
            java.lang.String r0 = "index"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0054
            goto L_0x0029
        L_0x0054:
            r0 = 2
            goto L_0x006c
        L_0x0056:
            java.lang.String r0 = "scrollable"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0060
            goto L_0x0029
        L_0x0060:
            r0 = 1
            goto L_0x006c
        L_0x0062:
            java.lang.String r0 = "effect"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x006b
            goto L_0x0029
        L_0x006b:
            r0 = 0
        L_0x006c:
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0080;
                case 2: goto L_0x007c;
                case 3: goto L_0x0078;
                case 4: goto L_0x0074;
                case 5: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0087
        L_0x0070:
            r8.refreshAutoPlay(r9, r10, r12)
            goto L_0x0087
        L_0x0074:
            r8.refreshInterval(r9, r10, r12)
            goto L_0x0087
        L_0x0078:
            r8.refreshInfinite(r9, r10, r12)
            goto L_0x0087
        L_0x007c:
            r8.refreshIndex(r9, r10, r12)
            goto L_0x0087
        L_0x0080:
            r8.refreshScrollable(r9, r10, r12)
            goto L_0x0087
        L_0x0084:
            r8.refreshEffect(r9, r10, r12)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.slide.BaseSlide.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }
}
