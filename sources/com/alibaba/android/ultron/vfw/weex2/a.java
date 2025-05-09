package com.alibaba.android.ultron.vfw.weex2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b6x;
import tb.h6e;
import tb.hav;
import tb.kpc;
import tb.mbv;
import tb.pav;
import tb.qxq;
import tb.t2o;
import tb.tvh;
import tb.v9v;
import tb.vbv;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f2365a;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.ultron.vfw.weex2.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0078a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0078a(a aVar) {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (view == null) {
                UnifyLog.e("UltronWeex2InstanceFactory.generateInstanceByPreRender", "onCreateView:view is null");
            } else {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return;
                }
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a aVar) {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (view == null) {
                UnifyLog.e("UltronWeex2InstanceFactory.generateInstance", "onCreateView:view is null");
            } else {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return;
                }
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2366a;
        public final /* synthetic */ CopyOnWriteArrayList b;
        public final /* synthetic */ Pair c;
        public final /* synthetic */ mbv d;
        public final /* synthetic */ d e;
        public final /* synthetic */ String f;

        public c(Context context, CopyOnWriteArrayList copyOnWriteArrayList, Pair pair, mbv mbvVar, d dVar, String str) {
            this.f2366a = context;
            this.b = copyOnWriteArrayList;
            this.c = pair;
            this.d = mbvVar;
            this.e = dVar;
            this.f = str;
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            Context context = this.f2366a;
            if (!(context instanceof Activity)) {
                hav.d("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "context is not Activity");
                if (aVar != null) {
                    aVar.destroy();
                    return;
                }
                return;
            }
            tvh adapterMUSInstance = ((WeexInstanceImpl) aVar.b(context)).getAdapterMUSInstance();
            if (!a.this.c(adapterMUSInstance)) {
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(this.c);
                    this.b.add(new Pair(this.d, adapterMUSInstance));
                }
                d dVar = this.e;
                if (dVar != null) {
                    dVar.a(this.f, adapterMUSInstance);
                    hav.d("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "callback success: " + this.f);
                } else {
                    vbv vbvVar = new vbv(adapterMUSInstance);
                    adapterMUSInstance.registerRenderListener(vbvVar);
                    adapterMUSInstance.setTag("bizId", this.f);
                    adapterMUSInstance.setTag("bizLifecycleListener", vbvVar);
                    hav.d("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "generate success: " + this.f);
                }
                View renderRoot = adapterMUSInstance.getRenderRoot();
                if (renderRoot != null) {
                    ViewParent parent = renderRoot.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(renderRoot);
                    }
                    ViewGroup.LayoutParams layoutParams = renderRoot.getLayoutParams();
                    if (layoutParams == null) {
                        renderRoot.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void a(String str, com.taobao.android.weex_framework.a aVar);
    }

    static {
        t2o.a(157286792);
    }

    public static a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("68c6b74b", new Object[0]);
        }
        if (f2365a == null) {
            synchronized (a.class) {
                try {
                    if (f2365a == null) {
                        f2365a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2365a;
    }

    public void a(Context context, int i, int i2, mbv mbvVar, CopyOnWriteArrayList<Pair<mbv, Object>> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b97c633", new Object[]{this, context, new Integer(i), new Integer(i2), mbvVar, copyOnWriteArrayList});
        } else {
            b(context, i, i2, mbvVar, copyOnWriteArrayList, null);
        }
    }

    public WeexInstance f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("b61f906a", new Object[]{this, context, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        if (str2.equals(UltronTradeHybridInstanceRenderMode.TEXTURE)) {
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        } else if (str2.equals(UltronTradeHybridInstanceRenderMode.SURFACE)) {
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.surface);
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        weexInstanceConfig.s(weexUnicornConfig);
        weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
        WeexInstance a2 = com.taobao.android.weex.b.a(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        a2.initWithURL(str);
        return a2;
    }

    public MUSDKInstance h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("d45d89d7", new Object[]{this, str, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(z1x.PRE_RENDER, (Object) Boolean.valueOf(z));
        return com.taobao.android.weex_framework.b.f().e(str, jSONObject);
    }

    public boolean c(com.taobao.android.weex_framework.a aVar) {
        int instanceId;
        boolean i;
        boolean i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e0918a", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null || aVar.getUIContext() == null) {
            return false;
        }
        Context uIContext = aVar.getUIContext();
        if (!(uIContext instanceof FragmentActivity)) {
            hav.g("UltronWeex2InstanceFactory", "checkContextInvalid:", "context is not FragmentActivity");
            return false;
        } else if (!pav.b()) {
            hav.g("UltronWeex2InstanceFactory", "checkContextInvalid:", "not in main thread");
            return false;
        } else {
            try {
                instanceId = aVar.getInstanceId();
                i = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "weexInsDestroyByActivity", true);
                i2 = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "weexInsDestroyByFragment", true);
            } catch (Throwable unused) {
            }
            if (!i || !((FragmentActivity) uIContext).isDestroyed()) {
                ISupportFragment h = qxq.h(((FragmentActivity) uIContext).getSupportFragmentManager());
                if (i2 && h != null && (h.asFragment() instanceof h6e)) {
                    Fragment asFragment = h.asFragment();
                    if (asFragment.isRemoving() || asFragment.isDetached()) {
                        aVar.removeRenderListener();
                        aVar.destroy();
                        hav.g("UltronWeex2InstanceFactory", "checkContextInvalid:", "destroyByFragment - musInstance id: " + instanceId);
                        return true;
                    }
                }
                return false;
            }
            aVar.removeRenderListener();
            aVar.destroy();
            hav.g("UltronWeex2InstanceFactory", "checkContextInvalid:", "destroyByActivity - musInstance id: " + instanceId);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r10.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode.UNSPECIFIC) == false) goto L_0x0064;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex_framework.a d(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.android.ultron.vfw.weex2.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "36828298"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            r8 = 3
            r5[r8] = r10
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            com.taobao.android.weex_framework.a r8 = (com.taobao.android.weex_framework.a) r8
            return r8
        L_0x001e:
            com.taobao.android.weex_framework.MUSInstanceConfig r3 = new com.taobao.android.weex_framework.MUSInstanceConfig
            r3.<init>()
            com.taobao.android.weex.config.WeexInstanceConfig$WeexEmbedPresentMode r4 = com.taobao.android.weex.config.WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage
            r3.E(r4)
            r3.B(r1)
            com.taobao.android.weex_framework.MUSInstanceConfig$MUSRenderType r4 = com.taobao.android.weex_framework.MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn
            r3.t(r4)
            int r4 = r10.hashCode()
            r5 = -1853231955(0xffffffff9189ecad, float:-2.1760652E-28)
            java.lang.String r6 = "surface"
            if (r4 == r5) goto L_0x005c
            r5 = -1417816805(0xffffffffab7dd51b, float:-9.01794E-13)
            if (r4 == r5) goto L_0x0051
            r5 = -606646581(0xffffffffdbd74ecb, float:-1.21207508E17)
            if (r4 == r5) goto L_0x0047
            goto L_0x0064
        L_0x0047:
            java.lang.String r4 = "unspecific"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0051:
            java.lang.String r0 = "texture"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0064
            r0 = 0
            goto L_0x0065
        L_0x005c:
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = -1
        L_0x0065:
            if (r0 == 0) goto L_0x008b
            if (r0 == r1) goto L_0x0085
            java.lang.String r10 = "renderMode"
            java.lang.String r10 = tb.lbv.e(r9, r10)
            boolean r10 = android.text.TextUtils.equals(r10, r6)
            if (r10 == 0) goto L_0x007c
            com.taobao.android.weex_framework.MUSInstanceConfig$RenderMode r10 = com.taobao.android.weex_framework.MUSInstanceConfig.RenderMode.surface
            r3.y(r10)
            goto L_0x0093
        L_0x007c:
            r3.v(r2)
            com.taobao.android.weex_framework.MUSInstanceConfig$RenderMode r10 = com.taobao.android.weex_framework.MUSInstanceConfig.RenderMode.texture
            r3.y(r10)
            goto L_0x0093
        L_0x0085:
            com.taobao.android.weex_framework.MUSInstanceConfig$RenderMode r10 = com.taobao.android.weex_framework.MUSInstanceConfig.RenderMode.surface
            r3.y(r10)
            goto L_0x0093
        L_0x008b:
            r3.v(r2)
            com.taobao.android.weex_framework.MUSInstanceConfig$RenderMode r10 = com.taobao.android.weex_framework.MUSInstanceConfig.RenderMode.texture
            r3.y(r10)
        L_0x0093:
            java.lang.String r10 = "wx_opaque"
            java.lang.String r10 = tb.lbv.e(r9, r10)
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            if (r0 == 0) goto L_0x00a6
            r3.v(r2)
            goto L_0x00b1
        L_0x00a6:
            java.lang.String r0 = "1"
            boolean r10 = android.text.TextUtils.equals(r10, r0)
            if (r10 == 0) goto L_0x00b1
            r3.v(r1)
        L_0x00b1:
            com.alibaba.android.ultron.vfw.weex2.a$b r10 = new com.alibaba.android.ultron.vfw.weex2.a$b
            r10.<init>(r7)
            r3.u(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c2
            r3.p(r9)
        L_0x00c2:
            com.taobao.android.weex_framework.b r9 = com.taobao.android.weex_framework.b.f()
            com.taobao.android.weex_framework.a r8 = r9.c(r8, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.a.d(android.content.Context, java.lang.String, java.lang.String):com.taobao.android.weex_framework.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r11.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode.UNSPECIFIC) == false) goto L_0x0080;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.a.e(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (r8.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode.UNSPECIFIC) == false) goto L_0x00ca;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r15, int r16, int r17, tb.mbv r18, java.util.concurrent.CopyOnWriteArrayList<android.util.Pair<tb.mbv, java.lang.Object>> r19, com.alibaba.android.ultron.vfw.weex2.a.d r20) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.a.b(android.content.Context, int, int, tb.mbv, java.util.concurrent.CopyOnWriteArrayList, com.alibaba.android.ultron.vfw.weex2.a$d):void");
    }
}
