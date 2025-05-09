package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.util.a;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.weex.common.Constants;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ooe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_QUALITY = "auto";
    public static final String IMG_DISABLE_FLAG = "img_load_disable";
    public static final String KEY_IMG_LOAD_FLAG = "muise:img_load";

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<Integer> f25526a = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pme f25527a;
        public final /* synthetic */ UINode b;
        public final /* synthetic */ MUSDKInstance c;
        public final /* synthetic */ Object d;

        public a(pme pmeVar, UINode uINode, MUSDKInstance mUSDKInstance, Object obj) {
            this.f25527a = pmeVar;
            this.b = uINode;
            this.c = mUSDKInstance;
            this.d = obj;
        }

        @Override // com.taobao.android.weex_framework.a.b
        public void onNativeStateChange(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
            } else if (!this.f25527a.f26181a && !TextUtils.equals(str2, ooe.IMG_DISABLE_FLAG)) {
                ooe.a(this.b, this.c, this.d);
                this.f25527a.f26181a = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements a.b<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Integer b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("930bd0d4", new Object[]{this, str});
            }
            return Integer.valueOf((int) fxh.e(str));
        }
    }

    static {
        t2o.a(986710140);
    }

    public static /* synthetic */ void a(UINode uINode, MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5936e7c1", new Object[]{uINode, mUSDKInstance, obj});
        } else {
            c(uINode, mUSDKInstance, obj);
        }
    }

    public static void d(UINode uINode, egl<pme> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb72d69", new Object[]{uINode, eglVar});
        } else {
            eglVar.c(new pme());
        }
    }

    public static UIImageDrawable e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UIImageDrawable) ipChange.ipc$dispatch("dfe068b9", new Object[]{context});
        }
        return new UIImageDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(com.taobao.android.weex_uikit.ui.UINode r18, int r19, int r20, int r21, int r22, int[] r23, tb.pme r24) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ooe.f(com.taobao.android.weex_uikit.ui.UINode, int, int, int, int, int[], tb.pme):void");
    }

    public static void g(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, egl<a.b> eglVar, pme pmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fd61ff", new Object[]{uINode, mUSDKInstance, obj, eglVar, pmeVar});
        } else if (TextUtils.equals(mUSDKInstance.getNativeState(KEY_IMG_LOAD_FLAG), IMG_DISABLE_FLAG)) {
            eglVar.c(new a(pmeVar, uINode, mUSDKInstance, obj));
            mUSDKInstance.registerNativeStateListener(KEY_IMG_LOAD_FLAG, eglVar.a());
        } else {
            eglVar.c(null);
            c(uINode, mUSDKInstance, obj);
        }
    }

    public static int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a4d470", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            List e = new com.taobao.android.weex_uikit.util.a(str, f25526a).e(Constants.Event.BLUR);
            if (e != null && !e.isEmpty()) {
                return ((Integer) e.get(0)).intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void j(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e31eac6", new Object[]{uINode, uIImageDrawable, str});
        }
    }

    public static void k(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d109501", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.C(i(str));
        }
    }

    public static void l(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f260f3fd", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.D(str);
        }
    }

    public static void m(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c9b1c", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.E(uINode.getInstance(), str, b(uINode));
        }
    }

    public static void n(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0942b0", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.F(uINode.getInstance(), (String) uINode.getAttribute("src"), b(uINode));
        }
    }

    public static void o(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8326d2eb", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.F(uINode.getInstance(), str, b(uINode));
        }
    }

    public static void p(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595330a4", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute("alt", str);
        uINode.setExtra(Constants.Name.ARIA_LABEL, str);
    }

    public static void q(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799b99b1", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("blurRadius", Integer.valueOf(i(str)));
        }
    }

    public static void r(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7953b5b", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("objectFit", str);
        }
    }

    public static void s(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3642c17a", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("placeholder", str);
        }
    }

    public static void t(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1e858e", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("quality", str);
        }
    }

    public static void c(UINode uINode, MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3b1ae6", new Object[]{uINode, mUSDKInstance, obj});
        } else if (uINode.isMounted()) {
            UIImageDrawable uIImageDrawable = (UIImageDrawable) obj;
            Integer num = (Integer) uINode.getAttribute("blurRadius");
            uIImageDrawable.x(uINode, mUSDKInstance, (String) uINode.getAttribute("src"), (String) uINode.getAttribute("placeholder"), (String) uINode.getAttribute("objectFit"), num == null ? 0 : num.intValue(), uINode.getContentWidth(), uINode.getContentHeight(), b(uINode));
        }
    }

    public static void h(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, a.b bVar, pme pmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d2d02b", new Object[]{uINode, mUSDKInstance, obj, bVar, pmeVar});
            return;
        }
        pmeVar.f26181a = false;
        if (bVar != null) {
            mUSDKInstance.unregisterNativeStateListener(KEY_IMG_LOAD_FLAG, bVar);
        }
        ((UIImageDrawable) obj).z(mUSDKInstance);
    }

    public static void u(UINode uINode, String str, pme pmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b50a44", new Object[]{uINode, str, pmeVar});
            return;
        }
        uINode.setAttribute("src", str);
        if (TextUtils.isEmpty(str)) {
            pmeVar.b(0, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r5.equals("auto") != false) goto L_0x005d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.weex_framework.adapter.MUSImageQuality b(com.taobao.android.weex_uikit.ui.UINode r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ooe.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "b6498e65"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = (com.taobao.android.weex_framework.adapter.MUSImageQuality) r5
            return r5
        L_0x0015:
            java.lang.String r2 = "quality"
            java.lang.Object r5 = r5.getAttribute(r2)
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.hashCode()
            r3 = 2
            r4 = 3
            switch(r2) {
                case -1039745817: goto L_0x0051;
                case 107348: goto L_0x0046;
                case 3005871: goto L_0x003d;
                case 3202466: goto L_0x0033;
                case 1379043793: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x005c
        L_0x0028:
            java.lang.String r0 = "original"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x0033:
            java.lang.String r0 = "high"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r0 = 4
            goto L_0x005d
        L_0x003d:
            java.lang.String r2 = "auto"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x005c
            goto L_0x005d
        L_0x0046:
            java.lang.String r0 = "low"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r0 = 3
            goto L_0x005d
        L_0x0051:
            java.lang.String r0 = "normal"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r0 = 2
            goto L_0x005d
        L_0x005c:
            r0 = -1
        L_0x005d:
            if (r0 == 0) goto L_0x0071
            if (r0 == r1) goto L_0x006e
            if (r0 == r3) goto L_0x006b
            if (r0 == r4) goto L_0x0068
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = com.taobao.android.weex_framework.adapter.MUSImageQuality.HIGH
            return r5
        L_0x0068:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = com.taobao.android.weex_framework.adapter.MUSImageQuality.LOW
            return r5
        L_0x006b:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = com.taobao.android.weex_framework.adapter.MUSImageQuality.NORMAL
            return r5
        L_0x006e:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = com.taobao.android.weex_framework.adapter.MUSImageQuality.ORIGINAL
            return r5
        L_0x0071:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r5 = com.taobao.android.weex_framework.adapter.MUSImageQuality.AUTO
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ooe.b(com.taobao.android.weex_uikit.ui.UINode):com.taobao.android.weex_framework.adapter.MUSImageQuality");
    }
}
