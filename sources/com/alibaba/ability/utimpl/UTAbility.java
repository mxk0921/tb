package com.alibaba.ability.utimpl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUTAbility;
import com.taobao.android.abilityidl.ability.UTPageSpmPreResult;
import com.taobao.android.abilityidl.ability.UTPageSpmUrlResult;
import com.taobao.android.abilityidl.ability.UTResult;
import com.taobao.android.abilityidl.ability.UTResultWithData;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTPageStatus;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import tb.a07;
import tb.a2v;
import tb.a4v;
import tb.b4v;
import tb.bbs;
import tb.c21;
import tb.c4v;
import tb.ckf;
import tb.e4v;
import tb.kdb;
import tb.l0v;
import tb.swd;
import tb.t2o;
import tb.tao;
import tb.u3v;
import tb.v3v;
import tb.w3v;
import tb.x3v;
import tb.y3v;
import tb.y4e;
import tb.z3v;
import tb.z4e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UTAbility extends AbsUTAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(158334985);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ l0v b;
        public final /* synthetic */ y4e c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.c.O(ErrorResult.a.Companion.g("arg1 参数必传"));
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.utimpl.UTAbility$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0057b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0057b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.c.O(ErrorResult.a.Companion.g("参数错误"));
                }
            }
        }

        public b(l0v l0vVar, y4e y4eVar) {
            this.b = l0vVar;
            this.c = y4eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            l0v l0vVar = this.b;
            String str = l0vVar.f23047a;
            if (str == null) {
                str = "";
            }
            String str2 = l0vVar.b;
            String str3 = str2 != null ? str2 : "";
            String str4 = l0vVar.c;
            String str5 = l0vVar.d;
            String str6 = l0vVar.e;
            Map<String, ? extends Object> map = l0vVar.f;
            Map<String, ? extends Object> map2 = !(map instanceof Map) ? null : map;
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        Integer num = this.b.g;
                        int intValue = num != null ? num.intValue() : 19999;
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str3, intValue <= 0 ? 19999 : intValue, str4, str5, str6, map2);
                        UTAnalytics instance = UTAnalytics.getInstance();
                        ckf.f(instance, "UTAnalytics.getInstance()");
                        instance.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
                        UTAbility.finishCallback$default(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        if (str4 == null) {
                            MegaUtils.z(new a(), -1L);
                            return;
                        }
                        if (this.b.h) {
                            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder2 = new UTOriginalCustomHitBuilder(str3, 2101, str4, str5, str6, map2);
                            UTAnalytics instance2 = UTAnalytics.getInstance();
                            ckf.f(instance2, "UTAnalytics.getInstance()");
                            instance2.getDefaultTracker().send(uTOriginalCustomHitBuilder2.build());
                        } else {
                            if (str3.length() == 0) {
                                uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str4);
                            } else {
                                uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str3, str4);
                            }
                            uTHitBuilders$UTControlHitBuilder.setProperties(map2);
                            UTAnalytics instance3 = UTAnalytics.getInstance();
                            ckf.f(instance3, "UTAnalytics.getInstance()");
                            instance3.getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
                        }
                        UTAbility.finishCallback$default(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 570049718:
                    if (str.equals("pageExposure")) {
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder3 = new UTOriginalCustomHitBuilder(str3, 2001, str4, str5, str6, map2);
                        UTAnalytics instance4 = UTAnalytics.getInstance();
                        ckf.f(instance4, "UTAnalytics.getInstance()");
                        instance4.getDefaultTracker().send(uTOriginalCustomHitBuilder3.build());
                        UTAbility.finishCallback$default(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 1113764132:
                    if (str.equals("componentExposure")) {
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder4 = new UTOriginalCustomHitBuilder(str3, 2201, str4, str5, str6, map2);
                        UTAnalytics instance5 = UTAnalytics.getInstance();
                        ckf.f(instance5, "UTAnalytics.getInstance()");
                        instance5.getDefaultTracker().send(uTOriginalCustomHitBuilder4.build());
                        UTAbility.finishCallback$default(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
            }
            MegaUtils.z(new RunnableC0057b(), -1L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y4e f2085a;

        public c(y4e y4eVar) {
            this.f2085a = y4eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UTResult uTResult = new UTResult();
            uTResult.success = Boolean.TRUE;
            this.f2085a.k0(uTResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f2086a;
        public final /* synthetic */ z4e b;

        public d(Map map, z4e z4eVar) {
            this.f2086a = map;
            this.b = z4eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UTResultWithData uTResultWithData = new UTResultWithData();
            Map<String, ? extends Object> map = this.f2086a;
            if (map != null) {
                uTResultWithData.success = Boolean.TRUE;
                uTResultWithData.utData = map;
            } else {
                uTResultWithData.success = Boolean.FALSE;
            }
            this.b.j1(uTResultWithData);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ z3v b;
        public final /* synthetic */ y4e c;

        public e(z3v z3vVar, y4e y4eVar) {
            this.b = z3vVar;
            this.c = y4eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.c.O(ErrorResult.a.Companion.g("参数错误"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ c4v b;
        public final /* synthetic */ y4e c;

        public f(c4v c4vVar, y4e y4eVar) {
            this.b = c4vVar;
            this.c = y4eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.b.f16862a;
            if (!(map instanceof Map)) {
                map = null;
            }
            if (map == null) {
                this.c.O(ErrorResult.a.Companion.g("参数错误"));
            }
            if (map != null) {
                UTAnalytics.getInstance().updateSessionProperties(map);
                UTAbility.finishCallback$default(UTAbility.this, this.c, null, 2, null);
            }
        }
    }

    static {
        t2o.a(158334984);
    }

    public static /* synthetic */ void finishCallback$default(UTAbility uTAbility, y4e y4eVar, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8808c8ed", new Object[]{uTAbility, y4eVar, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        uTAbility.a(y4eVar, map);
    }

    public static /* synthetic */ void finishCallbackProperties$default(UTAbility uTAbility, z4e z4eVar, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75f6f0a", new Object[]{uTAbility, z4eVar, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        uTAbility.b(z4eVar, map);
    }

    public static /* synthetic */ Activity getActivity$default(UTAbility uTAbility, kdb kdbVar, Boolean bool, y4e y4eVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("7be2087d", new Object[]{uTAbility, kdbVar, bool, y4eVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            y4eVar = null;
        }
        return uTAbility.c(kdbVar, bool, y4eVar);
    }

    public static /* synthetic */ Object ipc$super(UTAbility uTAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/utimpl/UTAbility");
    }

    public final void a(y4e y4eVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16874b67", new Object[]{this, y4eVar, map});
        } else {
            MegaUtils.z(new c(y4eVar), -1L);
        }
    }

    public final void b(z4e z4eVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35ccaa", new Object[]{this, z4eVar, map});
        } else {
            MegaUtils.z(new d(map, z4eVar), -1L);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void commitEvent(kdb kdbVar, l0v l0vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5014d07d", new Object[]{this, kdbVar, l0vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(l0vVar, "params");
        ckf.g(y4eVar, "callback");
        MegaUtils.C(new b(l0vVar, y4eVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void requestPageAllProperties(kdb kdbVar, e4v e4vVar, z4e z4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a6ad1b", new Object[]{this, kdbVar, e4vVar, z4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(e4vVar, "params");
        ckf.g(z4eVar, "callback");
        Activity activity$default = getActivity$default(this, kdbVar, e4vVar.f18279a, null, 4, null);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        b(z4eVar, instance.getDefaultTracker().getPageAllProperties(activity$default));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateSessionProperties(kdb kdbVar, c4v c4vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e375dd", new Object[]{this, kdbVar, c4vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(c4vVar, "params");
        ckf.g(y4eVar, "callback");
        MegaUtils.C(new f(c4vVar, y4eVar));
    }

    public final Activity c(kdb kdbVar, Boolean bool, y4e y4eVar) {
        Activity activity;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("282fa189", new Object[]{this, kdbVar, bool, y4eVar});
        }
        Object m = kdbVar.m("ut_page_object");
        if (m instanceof Activity) {
            return (Activity) m;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        if (z) {
            activity = c21.i();
        } else {
            Context context = kdbVar.l().getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            activity = (Activity) context;
        }
        if (activity == null && y4eVar != null) {
            y4eVar.O(ErrorResult.a.Companion.g("没有获取到 activity"));
        }
        return activity;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public tao<UTPageSpmPreResult, ErrorResult> getPageSpmPre(kdb kdbVar, e4v e4vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("c1ac7edc", new Object[]{this, kdbVar, e4vVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(e4vVar, "params");
        UTPageSpmPreResult uTPageSpmPreResult = new UTPageSpmPreResult();
        Activity activity$default = getActivity$default(this, kdbVar, e4vVar.f18279a, null, 4, null);
        if (activity$default == null) {
            return new tao<>(uTPageSpmPreResult, ErrorResult.a.Companion.g("没有获取到 activity"));
        }
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        Map<String, String> pageAllProperties = instance.getDefaultTracker().getPageAllProperties(activity$default);
        if (!(pageAllProperties instanceof Map)) {
            pageAllProperties = null;
        }
        if (pageAllProperties != null) {
            uTPageSpmPreResult.spmPre = pageAllProperties.get("spm-pre");
        } else {
            uTPageSpmPreResult.spmPre = "";
        }
        return new tao<>(uTPageSpmPreResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public tao<UTPageSpmUrlResult, ErrorResult> getPageSpmUrl(kdb kdbVar, e4v e4vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("60b1ffa8", new Object[]{this, kdbVar, e4vVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(e4vVar, "params");
        UTPageSpmUrlResult uTPageSpmUrlResult = new UTPageSpmUrlResult();
        Activity activity$default = getActivity$default(this, kdbVar, e4vVar.f18279a, null, 4, null);
        if (activity$default == null) {
            return new tao<>(uTPageSpmUrlResult, ErrorResult.a.Companion.g("没有获取到 activity"));
        }
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        Map<String, String> pageAllProperties = instance.getDefaultTracker().getPageAllProperties(activity$default);
        if (!(pageAllProperties instanceof Map)) {
            pageAllProperties = null;
        }
        if (pageAllProperties != null) {
            uTPageSpmUrlResult.spmUrl = pageAllProperties.get("spm-url");
        } else {
            uTPageSpmUrlResult.spmUrl = "";
        }
        return new tao<>(uTPageSpmUrlResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageAppear(kdb kdbVar, a2v a2vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a96e21", new Object[]{this, kdbVar, a2vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(a2vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, a2vVar.f15519a, y4eVar);
        if (c2 != null) {
            String str = a2vVar.b;
            if (str == null) {
                str = "";
            }
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageAppear(c2, str);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageAppearDonotSkip(kdb kdbVar, a2v a2vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5319c40", new Object[]{this, kdbVar, a2vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(a2vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, a2vVar.f15519a, y4eVar);
        if (c2 != null) {
            String str = a2vVar.b;
            if (str == null) {
                str = "";
            }
            try {
                bbs g = CommonExtKt.g(kdbVar);
                if (g != null) {
                    swd W = g.W();
                    int intValue = (W != null ? Integer.valueOf(W.getAlivePageCount()) : null).intValue();
                    UTAnalytics instance = UTAnalytics.getInstance();
                    ckf.f(instance, "UTAnalytics.getInstance()");
                    instance.getDefaultTracker().pageAppearWithRouter(c2, str, intValue);
                } else {
                    UTAnalytics instance2 = UTAnalytics.getInstance();
                    ckf.f(instance2, "UTAnalytics.getInstance()");
                    instance2.getDefaultTracker().pageAppearDonotSkip(c2, str);
                }
            } catch (Throwable unused) {
                UTAnalytics instance3 = UTAnalytics.getInstance();
                ckf.f(instance3, "UTAnalytics.getInstance()");
                instance3.getDefaultTracker().pageAppearDonotSkip(c2, str);
            }
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageDisAppear(kdb kdbVar, e4v e4vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44aadb2d", new Object[]{this, kdbVar, e4vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(e4vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, e4vVar.f18279a, y4eVar);
        if (c2 != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageDisAppear(c2);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void skipPage(kdb kdbVar, e4v e4vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84c9fb3", new Object[]{this, kdbVar, e4vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(e4vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, e4vVar.f18279a, y4eVar);
        if (c2 != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().skipPage(c2);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageProperties(kdb kdbVar, u3v u3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375ec0d5", new Object[]{this, kdbVar, u3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(u3vVar, "params");
        ckf.g(y4eVar, "callback");
        Map<String, ? extends Object> map = u3vVar.f29124a;
        if (!(map instanceof Map)) {
            map = null;
        }
        if (map == null) {
            y4eVar.O(ErrorResult.a.Companion.g("参数错误"));
        }
        if (map != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updateNextPageProperties(map);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageUtparam(kdb kdbVar, w3v w3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e31bd", new Object[]{this, kdbVar, w3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(w3vVar, "params");
        ckf.g(y4eVar, "callback");
        String str = w3vVar.f30438a;
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updateNextPageUtparam(str);
        finishCallback$default(this, y4eVar, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageUtparamCnt(kdb kdbVar, v3v v3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105d0ce5", new Object[]{this, kdbVar, v3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(v3vVar, "params");
        ckf.g(y4eVar, "callback");
        String str = v3vVar.f29771a;
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updateNextPageUtparamCnt(str);
        finishCallback$default(this, y4eVar, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageName(kdb kdbVar, x3v x3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742dce9f", new Object[]{this, kdbVar, x3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(x3vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, x3vVar.f31126a, y4eVar);
        if (c2 != null) {
            String str = x3vVar.b;
            if (str == null) {
                str = "";
            }
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageName(c2, str);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageProperties(kdb kdbVar, y3v y3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd91b2f", new Object[]{this, kdbVar, y3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(y3vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, y3vVar.f31836a, y4eVar);
        if (c2 != null) {
            Map<String, ? extends Object> map = y3vVar.b;
            if (!(map instanceof Map)) {
                map = null;
            }
            if (map == null) {
                y4eVar.O(ErrorResult.a.Companion.g("参数错误"));
            }
            if (map != null) {
                UTAnalytics instance = UTAnalytics.getInstance();
                ckf.f(instance, "UTAnalytics.getInstance()");
                instance.getDefaultTracker().updatePageProperties(c2, map);
                finishCallback$default(this, y4eVar, null, 2, null);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageStatus(kdb kdbVar, z3v z3vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ad69ad", new Object[]{this, kdbVar, z3vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(z3vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, z3vVar.f32513a, y4eVar);
        if (c2 != null) {
            String str = z3vVar.b;
            if (str == null) {
                str = "";
            }
            if (str.hashCode() == 783991761 && str.equals("UT_H5_IN_WebView")) {
                UTAnalytics instance = UTAnalytics.getInstance();
                ckf.f(instance, "UTAnalytics.getInstance()");
                instance.getDefaultTracker().updatePageStatus(c2, UTPageStatus.UT_H5_IN_WebView);
                finishCallback$default(this, y4eVar, null, 2, null);
                return;
            }
            MegaUtils.z(new e(z3vVar, y4eVar), -1L);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageUrl(kdb kdbVar, a4v a4vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8a833d", new Object[]{this, kdbVar, a4vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(a4vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, a4vVar.f15545a, y4eVar);
        if (c2 != null) {
            String str = a4vVar.b;
            if (str == null) {
                str = "";
            }
            Uri parse = Uri.parse(str);
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageUrl(c2, parse);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageUtparam(kdb kdbVar, b4v b4vVar, y4e y4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34856d1d", new Object[]{this, kdbVar, b4vVar, y4eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(b4vVar, "params");
        ckf.g(y4eVar, "callback");
        Activity c2 = c(kdbVar, b4vVar.f16180a, y4eVar);
        if (c2 != null) {
            String str = b4vVar.b;
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageUtparam(c2, str);
            finishCallback$default(this, y4eVar, null, 2, null);
        }
    }
}
