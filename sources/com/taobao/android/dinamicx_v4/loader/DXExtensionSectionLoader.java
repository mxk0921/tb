package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dxv4common.model.node.event.DXNativeLogicEventProperty;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a16;
import tb.bc5;
import tb.hh5;
import tb.jb6;
import tb.l06;
import tb.lg5;
import tb.m06;
import tb.t16;
import tb.t2o;
import tb.wv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXExtensionSectionLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int Async = 1;
    public static final int Sync = 2;
    public static final int TYPE_LAUNCHED = 1;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f7545a;
    public final hh5 b;
    public final bc5 c;
    public final l06 d;
    public final Map<Integer, List<a>> e = new HashMap();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXEffectThreadType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXEffectType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597862);
        }

        public void a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fc3fcc6", new Object[]{this, dXEvent, dXRuntimeContext, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final wv5 f7546a;
        public final int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXEvent f7547a;
            public final /* synthetic */ DXRuntimeContext b;

            public a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
                this.f7547a = dXEvent;
                this.b = dXRuntimeContext;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXEvent dXEvent = this.f7547a;
                if (dXEvent == null) {
                    b.this.f7546a.executeEvent(new DXLaunchedEffectEvent(), this.b);
                } else {
                    b.this.f7546a.executeEvent(dXEvent, this.b);
                }
            }
        }

        static {
            t2o.a(444597865);
        }

        public b(wv5 wv5Var, int i) {
            this.f7546a = wv5Var;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/loader/DXExtensionSectionLoader$DXLaunchedEffect");
        }

        @Override // com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader.a
        public void a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fc3fcc6", new Object[]{this, dXEvent, dXRuntimeContext, map});
                return;
            }
            wv5 wv5Var = this.f7546a;
            if (wv5Var == null) {
                return;
            }
            if (this.b != 2 && !(wv5Var instanceof t16)) {
                jb6.r(new a(dXEvent, dXRuntimeContext));
            } else if (dXEvent == null) {
                this.f7546a.executeEvent(new DXLaunchedEffectEvent(), dXRuntimeContext);
            } else {
                wv5Var.executeEvent(dXEvent, dXRuntimeContext);
            }
        }
    }

    static {
        t2o.a(444597861);
        t2o.a(444597873);
    }

    public DXExtensionSectionLoader(m06 m06Var, a16 a16Var, hh5 hh5Var, bc5 bc5Var, l06 l06Var) {
        this.f7545a = a16Var;
        this.b = hh5Var;
        this.c = bc5Var;
        this.d = l06Var;
    }

    public Map<Integer, List<a>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf2dda5f", new Object[]{this});
        }
        return this.e;
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        wv5 wv5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f7545a.f());
        short j = lg5Var.j();
        for (int i = 0; i < j; i++) {
            byte e = lg5Var.e();
            short j2 = lg5Var.j();
            if (e == 1) {
                byte e2 = lg5Var.e();
                if (this.d.a() == 0 || this.d.a() == 3) {
                    wv5Var = new t16(this.b.b(lg5Var.h()), this.b.b(lg5Var.h()), this.b.b(lg5Var.h()));
                } else if (this.d.a() == 2) {
                    String b2 = this.b.b(lg5Var.h());
                    String b3 = this.b.b(lg5Var.h());
                    String b4 = this.b.b(lg5Var.h());
                    wv5Var = new DXNativeLogicEventProperty(b4 + "." + b2, b3);
                } else {
                    wv5Var = null;
                }
                b bVar = new b(wv5Var, e2);
                List list = (List) ((HashMap) this.e).get(1);
                if (list == null) {
                    list = new ArrayList();
                    ((HashMap) this.e).put(1, list);
                }
                list.add(bVar);
            } else if (!DinamicXEngine.j0()) {
                lg5Var.l(j2);
                List<f.a> list2 = dXRuntimeContext.m().c;
                ((ArrayList) list2).add(new f.a("LOAD_ERROR_V4", "LOAD_ERROR_EFFECT_V4", f.DX_LOADER_4000003, " 不认识的effect类型" + ((int) e)));
            } else {
                throw new RuntimeException(" 不认识的effect类型" + ((int) e));
            }
        }
        return this.c.b(lg5Var, dXRuntimeContext);
    }
}
