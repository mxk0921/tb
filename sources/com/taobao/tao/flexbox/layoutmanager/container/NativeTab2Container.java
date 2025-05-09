package com.taobao.tao.flexbox.layoutmanager.container;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngine;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.navigation.TBFragmentTabHost;
import java.util.Map;
import tb.bcq;
import tb.cvh;
import tb.f21;
import tb.f6d;
import tb.kpu;
import tb.nwv;
import tb.od0;
import tb.oy3;
import tb.q8u;
import tb.s0j;
import tb.spu;
import tb.t2o;
import tb.tpu;
import tb.y9a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NativeTab2Container implements a.AbstractC0688a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MainDexContainerFragment f12166a;
    public TurboEngine b;
    public FrameLayout c;
    public BroadcastReceiver d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int pageState;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TurboEngine h = NativeTab2Container.h(NativeTab2Container.this);
            if (h != null && NativeTab2Container.j(NativeTab2Container.this) != null && NativeTab2Container.j(NativeTab2Container.this).getContext() != null && (pageState = h.getPageState()) != 5 && pageState != -1) {
                h.onPagePause();
                h.onPageStop();
                h.onPageDestroy();
                NativeTab2Container nativeTab2Container = NativeTab2Container.this;
                NativeTab2Container.i(nativeTab2Container, NativeTab2Container.k(nativeTab2Container));
                NativeTab2Container nativeTab2Container2 = NativeTab2Container.this;
                NativeTab2Container.l(nativeTab2Container2, NativeTab2Container.h(nativeTab2Container2), pageState);
                NativeTab2Container.m(NativeTab2Container.this).removeAllViews();
                NativeTab2Container.m(NativeTab2Container.this).addView(NativeTab2Container.h(NativeTab2Container.this).getView());
            }
        }
    }

    static {
        t2o.a(502268249);
        t2o.a(502268253);
    }

    public static /* synthetic */ String e(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e86c0ad0", new Object[]{nativeTab2Container});
        }
        return nativeTab2Container.e;
    }

    public static /* synthetic */ String f(NativeTab2Container nativeTab2Container, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36d72504", new Object[]{nativeTab2Container, str});
        }
        nativeTab2Container.e = str;
        return str;
    }

    public static /* synthetic */ void g(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a2e91", new Object[]{nativeTab2Container});
        } else {
            nativeTab2Container.q();
        }
    }

    public static /* synthetic */ TurboEngine h(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("d7081e77", new Object[]{nativeTab2Container});
        }
        return nativeTab2Container.b;
    }

    public static /* synthetic */ TurboEngine i(NativeTab2Container nativeTab2Container, TurboEngine turboEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("9f1bf9a2", new Object[]{nativeTab2Container, turboEngine});
        }
        nativeTab2Container.b = turboEngine;
        return turboEngine;
    }

    public static /* synthetic */ MainDexContainerFragment j(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainDexContainerFragment) ipChange.ipc$dispatch("a7e4ad9a", new Object[]{nativeTab2Container});
        }
        return nativeTab2Container.f12166a;
    }

    public static /* synthetic */ TurboEngine k(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("f3207235", new Object[]{nativeTab2Container});
        }
        return nativeTab2Container.n();
    }

    public static /* synthetic */ void l(NativeTab2Container nativeTab2Container, TurboEngine turboEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44a0f3b", new Object[]{nativeTab2Container, turboEngine, new Integer(i)});
        } else {
            nativeTab2Container.p(turboEngine, i);
        }
    }

    public static /* synthetic */ FrameLayout m(NativeTab2Container nativeTab2Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("589cfec3", new Object[]{nativeTab2Container});
        }
        return nativeTab2Container.c;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae9ef8b", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            return ((f6d) turboEngine.getInvoker(f6d.class)).a(z);
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void c(MainDexContainerFragment mainDexContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07ca75e", new Object[]{this, mainDexContainerFragment});
        } else {
            this.f12166a = mainDexContainerFragment;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void d(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dba2f9", new Object[]{this, str, uri});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            ((f6d) turboEngine.getInvoker(f6d.class)).c(uri);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        if (this.c == null) {
            q8u.a aVar = q8u.Companion;
            aVar.a("initEngine");
            bcq.a().f(this.f12166a.getContext(), kpu.BUNDLE_TURBOFLOW_BIZ_REMOTE);
            this.c = new FrameLayout(this.f12166a.getContext());
            f21.i(f21.TASK_CONTAINER_RENDER);
            if (this.b == null) {
                this.b = n();
            }
            aVar.a("onPageCreate");
            this.b.onPageCreate();
            aVar.c();
            f21.o(f21.TASK_CONTAINER_RENDER, null);
            this.c.addView(this.b.getView());
            r();
            aVar.c();
        }
        return this.c;
    }

    public final TurboEngine n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("653b1a96", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        TurboEngineConfig.a a2 = TurboEngineConfig.Companion.a();
        a2.d(this.f12166a.getContext());
        a2.i(this.f12166a.getUrl());
        a2.g(kpu.d(false));
        a2.f(kpu.c());
        a2.e(this.f12166a);
        a2.h(this.f12166a.getActivity());
        tpu.a aVar = tpu.Companion;
        aVar.a("NativeTab2Container", "getOrCreatePreloadTurboEngine " + (System.currentTimeMillis() - currentTimeMillis), null);
        return spu.Companion.e(a2.a());
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c902cd", new Object[]{this})).booleanValue();
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o == null || o.getCurrentTab() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            ((f6d) turboEngine.getInvoker(f6d.class)).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onCreate(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (bundle == null) {
            z = false;
        }
        this.f12166a.getArguments().putBoolean("isTNodeRecovery", z);
        long j = this.f12166a.getArguments().getLong(y9a.CLICK_STAGE);
        if (!z && j > 0) {
            long a2 = cvh.a(j);
            if (this.b == null) {
                TurboEngine n = n();
                this.b = n;
                ((f6d) n.getInvoker(f6d.class)).b(a2);
            }
            f21.i(f21.TASK_FRAGMENT_ONCREATE);
            oy3.h(this.f12166a.getContext(), Uri.parse(this.f12166a.getUrl()));
            JSONObject jSONObject = new JSONObject(od0.D().f().P());
            jSONObject.put(s0j.MTS_TAG_CLICK_TIME, (Object) Long.valueOf(a2));
            f21.o(f21.TASK_FRAGMENT_ONCREATE, jSONObject);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            ((f6d) turboEngine.getInvoker(f6d.class)).onRefresh();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            turboEngine.onPageDestroy();
        }
        s();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            turboEngine.onPagePause();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("onResume");
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            turboEngine.onPageResume();
        }
        aVar.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("onStart");
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            turboEngine.onPageStart();
        }
        aVar.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a.AbstractC0688a
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        TurboEngine turboEngine = this.b;
        if (turboEngine != null) {
            turboEngine.onPageStop();
        }
    }

    public final void p(TurboEngine turboEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553cb546", new Object[]{this, turboEngine, new Integer(i)});
            return;
        }
        if (!o()) {
            turboEngine.onReady();
        }
        turboEngine.onPageCreate();
        if (i == 1) {
            turboEngine.onPageStart();
        } else if (i == 2) {
            turboEngine.onPageStart();
            turboEngine.onPageResume();
        } else if (i == 3) {
            turboEngine.onPageStart();
            turboEngine.onPageResume();
            turboEngine.onPagePause();
        } else if (i == 4) {
            turboEngine.onPageStart();
            turboEngine.onPageStop();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca1ae21", new Object[]{this});
        } else {
            nwv.y0(new a());
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9d7b4d", new Object[]{this});
        } else if (this.d == null) {
            this.e = Login.getUserId();
            this.d = new BroadcastReceiver() { // from class: com.taobao.tao.flexbox.layoutmanager.container.NativeTab2Container.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/container/NativeTab2Container$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null) {
                        LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                        if (valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS || valueOf == LoginAction.NOTIFY_LOGIN_FAILED || valueOf == LoginAction.NOTIFY_LOGIN_CANCEL || valueOf == LoginAction.NOTIFY_LOGOUT) {
                            String userId = Login.getUserId();
                            if (!TextUtils.equals(NativeTab2Container.e(NativeTab2Container.this), userId)) {
                                NativeTab2Container.f(NativeTab2Container.this, userId);
                                NativeTab2Container.g(NativeTab2Container.this);
                            }
                        }
                    }
                }
            };
            LoginBroadcastHelper.registerLoginReceiver(spu.g(), this.d);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725c1094", new Object[]{this});
        } else if (this.d != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(spu.g(), this.d);
            this.d = null;
        }
    }
}
