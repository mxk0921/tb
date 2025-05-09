package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXViewUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bb2;
import tb.cww;
import tb.db2;
import tb.fb2;
import tb.gfh;
import tb.hb2;
import tb.i3c;
import tb.k21;
import tb.zuw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXBindingXModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bb2 mBindingXCore;
    private com.alibaba.android.bindingx.core.a mPlatformManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXBindingXModule.access$000(WXBindingXModule.this) != null) {
                WXBindingXModule.access$000(WXBindingXModule.this).j();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WXBindingXModule.access$000(WXBindingXModule.this) != null) {
                WXBindingXModule.access$000(WXBindingXModule.this).k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(WXBindingXModule wXBindingXModule) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new BindingXScrollHandler(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(WXBindingXModule wXBindingXModule) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new db2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(WXBindingXModule wXBindingXModule) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new fb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(WXBindingXModule wXBindingXModule) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new hb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements bb2.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f2184a;

        public g(WXBindingXModule wXBindingXModule, JSCallback jSCallback) {
            this.f2184a = jSCallback;
        }

        @Override // tb.bb2.g
        public void callback(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9c6f28", new Object[]{this, obj});
                return;
            }
            JSCallback jSCallback = this.f2184a;
            if (jSCallback != null) {
                jSCallback.invokeAndKeepAlive(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (WXBindingXModule.access$000(WXBindingXModule.this) != null) {
                WXBindingXModule.access$000(WXBindingXModule.this).f();
                WXBindingXModule.access$002(WXBindingXModule.this, null);
            }
            cww.d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class i implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2186a;

        public i(int i) {
            this.f2186a = i;
        }

        @Override // com.alibaba.android.bindingx.core.a.c
        public double a(double d, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d30f9d0e", new Object[]{this, new Double(d), objArr})).doubleValue();
            }
            return WXViewUtils.getRealPxByWidth((float) d, this.f2186a);
        }

        @Override // com.alibaba.android.bindingx.core.a.c
        public double b(double d, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("671cd02a", new Object[]{this, new Double(d), objArr})).doubleValue();
            }
            return WXViewUtils.getWebPxByWidth((float) d, this.f2186a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class k implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.bindingx.core.a.e
        public View a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("9738d72d", new Object[]{this, str, objArr});
            }
            if (objArr.length <= 0) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            return zuw.b((String) obj, str);
        }
    }

    public WXBindingXModule() {
    }

    public static /* synthetic */ bb2 access$000(WXBindingXModule wXBindingXModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bb2) ipChange.ipc$dispatch("39b0eb41", new Object[]{wXBindingXModule});
        }
        return wXBindingXModule.mBindingXCore;
    }

    public static /* synthetic */ bb2 access$002(WXBindingXModule wXBindingXModule, bb2 bb2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bb2) ipChange.ipc$dispatch("e35376bb", new Object[]{wXBindingXModule, bb2Var});
        }
        wXBindingXModule.mBindingXCore = bb2Var;
        return bb2Var;
    }

    public static com.alibaba.android.bindingx.core.a createPlatformManager(WXSDKInstance wXSDKInstance) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.bindingx.core.a) ipChange.ipc$dispatch("bb992cb5", new Object[]{wXSDKInstance});
        }
        if (wXSDKInstance == null) {
            i2 = 750;
        } else {
            i2 = wXSDKInstance.P();
        }
        return new a.b().d(new k()).e(new j()).b(new i(i2)).a();
    }

    public static /* synthetic */ Object ipc$super(WXBindingXModule wXBindingXModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/plugin/weex/WXBindingXModule");
    }

    private void prepareInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e4b36b", new Object[]{this});
            return;
        }
        if (this.mPlatformManager == null) {
            this.mPlatformManager = createPlatformManager(this.mWXSDKInstance);
        }
        if (this.mBindingXCore == null) {
            bb2 bb2Var = new bb2(this.mPlatformManager);
            this.mBindingXCore = bb2Var;
            bb2Var.l("scroll", new c(this));
            this.mBindingXCore.l("pan", new d(this));
            this.mBindingXCore.l("pinch", new e(this));
            this.mBindingXCore.l(Key.ROTATION, new f(this));
        }
    }

    @JSMethod(uiThread = false)
    public void bindAsync(Map<String, Object> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60462d3f", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        Map<String, String> bind = bind(map, jSCallback);
        if (jSCallback2 != null && bind != null) {
            jSCallback2.invoke(bind);
        }
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new h(), (Object) null);
        }
    }

    @JSMethod(uiThread = false)
    public void getComputedStyleAsync(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd0dfe9", new Object[]{this, str, jSCallback});
            return;
        }
        Map<String, Object> computedStyle = getComputedStyle(str);
        if (jSCallback != null) {
            jSCallback.invoke(computedStyle);
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new a(), (Object) null);
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new b(), (Object) null);
        }
    }

    @JSMethod(uiThread = false)
    public void prepare(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7987b7", new Object[]{this, map});
        } else {
            prepareInternal();
        }
    }

    @JSMethod(uiThread = false)
    public List<String> supportFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a54d7e34", new Object[]{this});
        }
        return Arrays.asList("pan", "orientation", "timing", "scroll", "experimentalGestureFeatures");
    }

    @JSMethod(uiThread = false)
    public void unbind(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c175de08", new Object[]{this, map});
            return;
        }
        bb2 bb2Var = this.mBindingXCore;
        if (bb2Var != null) {
            bb2Var.h(map);
        }
    }

    @JSMethod(uiThread = false)
    public void unbindAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f807f272", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.mBindingXCore;
        if (bb2Var != null) {
            bb2Var.f();
        }
    }

    public WXBindingXModule(bb2 bb2Var) {
        this.mBindingXCore = bb2Var;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class j implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.bindingx.core.a.f
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da6c6fb7", new Object[]{this, view, str, obj, cVar, map, objArr});
            } else if (objArr != null && objArr.length >= 2) {
                Object obj2 = objArr[0];
                if (obj2 instanceof String) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof String) {
                        String str2 = (String) obj2;
                        String str3 = (String) obj3;
                        WXComponent a2 = zuw.a(str3, str2);
                        if (a2 == null) {
                            gfh.b("unexpected error. component not found [ref:" + str2 + ",instanceId:" + str3 + "]");
                            return;
                        }
                        cww.f(str).a(a2, view, obj, cVar, map);
                    }
                }
            }
        }
    }

    @JSMethod(uiThread = false)
    public Map<String, String> bind(Map<String, Object> map, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aad72a1c", new Object[]{this, map, jSCallback});
        }
        String str = null;
        try {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            k21.b("weex", wXSDKInstance != null ? wXSDKInstance.getBundleUrl() : null);
        } catch (Throwable unused) {
        }
        prepareInternal();
        bb2 bb2Var = this.mBindingXCore;
        WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
        Context context = wXSDKInstance2 == null ? null : wXSDKInstance2.getContext();
        WXSDKInstance wXSDKInstance3 = this.mWXSDKInstance;
        if (wXSDKInstance3 != null) {
            str = wXSDKInstance3.N();
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        String c2 = bb2Var.c(context, str, map, new g(this, jSCallback), new Object[0]);
        HashMap hashMap = new HashMap(2);
        hashMap.put("token", c2);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0252  */
    @com.taobao.weex.annotation.JSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> getComputedStyle(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.getComputedStyle(java.lang.String):java.util.Map");
    }
}
