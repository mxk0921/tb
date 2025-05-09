package com.taobao.themis.open.permission.auth;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.auth.ui.OpenAuthDialog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.a07;
import tb.arf;
import tb.bbs;
import tb.ck1;
import tb.ckf;
import tb.d1a;
import tb.p8s;
import tb.q9s;
import tb.r8s;
import tb.sj1;
import tb.t2o;
import tb.xhv;
import tb.yj1;
import tb.zj1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSAuthHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String ERROR_CODE_CANCEL = "PC_USER_CANCEL";
    public static final String ERROR_CODE_EXCEPTION = "PC_EXCEPTION";
    public static final String ERROR_CODE_PARAMS = "PC_PARAMS_ERROR";
    public static final String ERROR_MESSAGE_CANCEL = "用户取消授权";
    public static final String ERROR_MESSAGE_PARAMS = "scopes至少传入1个，且最大支持5个";
    public static final String TAG = "TMSAuthHelper";

    /* renamed from: a  reason: collision with root package name */
    public final yj1 f13656a;
    public final bbs b;
    public final ITMSPage c;
    public final a d;
    public boolean e;
    public final Map<String, String> f;
    public final zj1 g = new zj1();
    public final Queue<d1a<xhv>> h;

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.taobao.themis.open.permission.auth.TMSAuthHelper$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1(Object obj) {
            super(0, obj, TMSAuthHelper.class, "checkAuthStorage", "checkAuthStorage()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/TMSAuthHelper$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                TMSAuthHelper.b((TMSAuthHelper) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.taobao.themis.open.permission.auth.TMSAuthHelper$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2(Object obj) {
            super(0, obj, TMSAuthHelper.class, "sendAuthCheckRequest", "sendAuthCheckRequest()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/TMSAuthHelper$2");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                TMSAuthHelper.h((TMSAuthHelper) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.taobao.themis.open.permission.auth.TMSAuthHelper$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3(Object obj) {
            super(0, obj, TMSAuthHelper.class, "showAuthDialog", "showAuthDialog()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/TMSAuthHelper$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                TMSAuthHelper.i((TMSAuthHelper) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.taobao.themis.open.permission.auth.TMSAuthHelper$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4(Object obj) {
            super(0, obj, TMSAuthHelper.class, "updateAuthStatus", "updateAuthStatus()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/TMSAuthHelper$4");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                TMSAuthHelper.j((TMSAuthHelper) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(boolean z, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        static {
            t2o.a(843055328);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements sj1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TMSAuthHelper f13658a;

            public a(TMSAuthHelper tMSAuthHelper) {
                this.f13658a = tMSAuthHelper;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TMSAuthHelper.g(this.f13658a);
                }
            }
        }

        public c() {
        }

        @Override // tb.sj1
        public void a(List<String> list) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a5d50d9", new Object[]{this, list});
                return;
            }
            ckf.g(list, "confirmedScopes");
            TMSLogger.g(TMSAuthHelper.TAG, "onConfirm");
            ArrayList arrayList = new ArrayList();
            TMSAuthHelper tMSAuthHelper = TMSAuthHelper.this;
            for (String str : TMSAuthHelper.e(TMSAuthHelper.this).e()) {
                if (AuthUtils.INSTANCE.r(str, TMSAuthHelper.f(tMSAuthHelper))) {
                    arrayList.add(str);
                    ck1.INSTANCE.t(r8s.j(TMSAuthHelper.d(tMSAuthHelper)), str, true);
                    TMSAuthHelper.c(tMSAuthHelper).b().c().add(str);
                }
            }
            TMSAuthHelper.e(TMSAuthHelper.this).e().removeAll(arrayList);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null)) {
                executor.execute(new a(TMSAuthHelper.this));
            }
        }

        @Override // tb.sj1
        public void b(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbd95231", new Object[]{this, list});
                return;
            }
            ckf.g(list, "canceledScopes");
            TMSLogger.g(TMSAuthHelper.TAG, "onCancel");
            if (!TMSInstanceExtKt.u(TMSAuthHelper.d(TMSAuthHelper.this)) || !q9s.INSTANCE.p()) {
                ck1 ck1Var = ck1.INSTANCE;
                String L = TMSAuthHelper.d(TMSAuthHelper.this).L();
                ckf.f(L, "instance.appId");
                ck1Var.r(L, list);
            }
            TMSAuthHelper tMSAuthHelper = TMSAuthHelper.this;
            for (String str : TMSAuthHelper.e(TMSAuthHelper.this).e()) {
                if (AuthUtils.INSTANCE.r(str, TMSAuthHelper.f(tMSAuthHelper))) {
                    ck1.INSTANCE.t(r8s.j(TMSAuthHelper.d(tMSAuthHelper)), str, false);
                } else {
                    ck1.INSTANCE.q(r8s.j(TMSAuthHelper.d(tMSAuthHelper)), str, false);
                }
            }
            TMSAuthHelper.a(TMSAuthHelper.this, TMSAuthHelper.ERROR_CODE_CANCEL, TMSAuthHelper.ERROR_MESSAGE_CANCEL, null);
        }
    }

    static {
        t2o.a(843055322);
    }

    public TMSAuthHelper(Context context, yj1 yj1Var, bbs bbsVar, ITMSPage iTMSPage, a aVar) {
        ckf.g(context, "context");
        ckf.g(yj1Var, "requestModel");
        ckf.g(bbsVar, "instance");
        ckf.g(aVar, "callback");
        this.f13656a = yj1Var;
        this.b = bbsVar;
        this.c = iTMSPage;
        this.d = aVar;
        this.f = AuthUtils.INSTANCE.m(bbsVar, yj1Var.e());
        LinkedList linkedList = new LinkedList();
        this.h = linkedList;
        linkedList.add(new AnonymousClass1(this));
        linkedList.add(new AnonymousClass2(this));
        linkedList.add(new AnonymousClass3(this));
        linkedList.add(new AnonymousClass4(this));
    }

    public static final /* synthetic */ void a(TMSAuthHelper tMSAuthHelper, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217f1ca0", new Object[]{tMSAuthHelper, str, str2, jSONObject});
        } else {
            tMSAuthHelper.l(str, str2, jSONObject);
        }
    }

    public static final /* synthetic */ void b(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23ab6c7", new Object[]{tMSAuthHelper});
        } else {
            tMSAuthHelper.m();
        }
    }

    public static final /* synthetic */ zj1 c(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zj1) ipChange.ipc$dispatch("970b5c5a", new Object[]{tMSAuthHelper});
        }
        return tMSAuthHelper.g;
    }

    public static final /* synthetic */ bbs d(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("a76ff9ff", new Object[]{tMSAuthHelper});
        }
        return tMSAuthHelper.b;
    }

    public static final /* synthetic */ yj1 e(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yj1) ipChange.ipc$dispatch("56e70b8b", new Object[]{tMSAuthHelper});
        }
        return tMSAuthHelper.f13656a;
    }

    public static final /* synthetic */ Map f(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df7b04c1", new Object[]{tMSAuthHelper});
        }
        return tMSAuthHelper.f;
    }

    public static final /* synthetic */ void g(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e13df7b", new Object[]{tMSAuthHelper});
        } else {
            tMSAuthHelper.o();
        }
    }

    public static final /* synthetic */ void h(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21a813", new Object[]{tMSAuthHelper});
        } else {
            tMSAuthHelper.p();
        }
    }

    public static final /* synthetic */ void i(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2992a9", new Object[]{tMSAuthHelper});
        } else {
            tMSAuthHelper.r();
        }
    }

    public static final /* synthetic */ void j(TMSAuthHelper tMSAuthHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a6449f", new Object[]{tMSAuthHelper});
        } else {
            tMSAuthHelper.s();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554c4e2f", new Object[]{this});
            return;
        }
        try {
            if (!this.f13656a.e().isEmpty() && this.f13656a.e().size() <= 5) {
                d1a d1aVar = (d1a) ((LinkedList) this.h).poll();
                if (d1aVar != null) {
                    d1aVar.invoke();
                    return;
                }
                return;
            }
            l(ERROR_CODE_PARAMS, ERROR_MESSAGE_PARAMS, null);
        } catch (Throwable th) {
            TMSLogger.c(TAG, " ", th);
            l(ERROR_CODE_EXCEPTION, th.getMessage(), null);
        }
    }

    public final void l(String str, String str2, JSONObject jSONObject) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b60575", new Object[]{this, str, str2, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "errorCode", str);
        jSONObject2.put((JSONObject) "errorMessage", str2);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str4 : this.f13656a.e()) {
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            linkedHashMap.put(str4, str3);
        }
        this.g.b().b().putAll(linkedHashMap);
        q(false, jSONObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.open.permission.auth.TMSAuthHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "aaa56492"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.String r2 = "TMSAuthHelper"
            java.lang.String r3 = "enter checkAuthStorage"
            com.taobao.themis.kernel.basic.TMSLogger.a(r2, r3)
            tb.zj1 r3 = r9.g
            tb.tj1 r3 = r3.b()
            com.taobao.themis.open.permission.auth.AuthUtils r4 = com.taobao.themis.open.permission.auth.AuthUtils.INSTANCE
            tb.bbs r5 = r9.b
            java.lang.String r4 = r4.n(r5)
            r3.d(r4)
            tb.zj1 r3 = r9.g
            tb.tj1 r3 = r3.b()
            java.lang.String r3 = r3.a()
            if (r3 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            tb.yj1 r3 = r9.f13656a
            java.util.List r3 = r3.e()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = tb.i04.B0(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x004a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            tb.yj1 r5 = r9.f13656a
            java.lang.String r5 = r5.d()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0098
            tb.ck1 r5 = tb.ck1.INSTANCE
            tb.bbs r6 = r9.b
            tb.yj1 r7 = r9.f13656a
            java.lang.String r7 = r7.d()
            tb.ckf.d(r7)
            java.util.List r5 = r5.l(r6, r7)
            if (r5 != 0) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x007d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0099
            java.lang.Object r7 = r5.next()
            com.taobao.themis.open.permission.auth.model.ScopeEntity r7 = (com.taobao.themis.open.permission.auth.model.ScopeEntity) r7
            java.lang.String r8 = r7.getScope()
            boolean r8 = tb.ckf.b(r8, r4)
            if (r8 == 0) goto L_0x007d
            boolean r6 = r7.getStatus()
            goto L_0x007d
        L_0x0098:
            r6 = 0
        L_0x0099:
            if (r6 != 0) goto L_0x00cc
            com.taobao.themis.open.permission.auth.AuthUtils r5 = com.taobao.themis.open.permission.auth.AuthUtils.INSTANCE
            java.util.Map<java.lang.String, java.lang.String> r7 = r9.f
            boolean r5 = r5.r(r4, r7)
            if (r5 == 0) goto L_0x00b8
            tb.ck1 r5 = tb.ck1.INSTANCE
            tb.bbs r6 = r9.b
            java.lang.String r6 = tb.r8s.j(r6)
            java.lang.Boolean r5 = r5.i(r6, r4)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = tb.ckf.b(r5, r6)
            goto L_0x00cc
        L_0x00b8:
            if (r1 == 0) goto L_0x00cc
            tb.ck1 r5 = tb.ck1.INSTANCE
            tb.bbs r6 = r9.b
            java.lang.String r6 = tb.r8s.j(r6)
            java.lang.Boolean r5 = r5.c(r6, r4)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = tb.ckf.b(r5, r6)
        L_0x00cc:
            if (r6 == 0) goto L_0x00ef
            java.lang.String r5 = " already has local auth"
            java.lang.String r5 = tb.ckf.p(r4, r5)
            com.taobao.themis.kernel.basic.TMSLogger.a(r2, r5)
            tb.yj1 r5 = r9.f13656a
            java.util.List r5 = r5.e()
            r5.remove(r4)
            tb.zj1 r5 = r9.g
            tb.tj1 r5 = r5.b()
            java.util.List r5 = r5.c()
            r5.add(r4)
            goto L_0x004a
        L_0x00ef:
            java.lang.String r5 = " not has local auth"
            java.lang.String r4 = tb.ckf.p(r4, r5)
            com.taobao.themis.kernel.basic.TMSLogger.a(r2, r4)
            goto L_0x004a
        L_0x00fa:
            r9.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.TMSAuthHelper.m():void");
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ccebdb0", new Object[]{this})).booleanValue();
        }
        if (this.e) {
            return true;
        }
        if (!this.f13656a.e().isEmpty()) {
            return false;
        }
        q(this.g.b().b().isEmpty(), null);
        return true;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacf6c46", new Object[]{this});
        } else if (!n()) {
            d1a d1aVar = (d1a) ((LinkedList) this.h).poll();
            if (d1aVar == null) {
                q(true, null);
            } else {
                d1aVar.invoke();
            }
        }
    }

    public final void q(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
        } else if (!this.e) {
            this.e = true;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String a2 = this.g.b().a();
            if (a2 == null) {
                a2 = "";
            }
            jSONObject.put((JSONObject) "accessToken", a2);
            jSONObject.put((JSONObject) "authSuccessScopes", (String) arf.INSTANCE.a(this.g.b().c()));
            jSONObject.put((JSONObject) "authErrorScopes", (String) new JSONObject(this.g.b().b()));
            this.d.a(z, jSONObject);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e938df4", new Object[]{this});
            return;
        }
        TMSLogger.a(TAG, "enter showAuthDialog");
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null && iTMSPage.isDestroyed()) {
            TMSLogger.g(TAG, "auth should show dailog but page is exited!");
            l(ERROR_CODE_CANCEL, "页面已退出", null);
            return;
        }
        if (!TMSInstanceExtKt.u(this.b) || !q9s.INSTANCE.p()) {
            ck1 ck1Var = ck1.INSTANCE;
            String L = this.b.L();
            ckf.f(L, "instance.appId");
            for (String str : ck1Var.e(L)) {
                if (this.f13656a.e().remove(str)) {
                    TMSLogger.g(TAG, ckf.p(str, " hit refusedScopes"));
                    this.g.b().b().put(str, ERROR_CODE_CANCEL);
                }
            }
        }
        if (this.f13656a.e().isEmpty()) {
            TMSLogger.g(TAG, "all hit refusedScopes, callback error");
            l(ERROR_CODE_CANCEL, ERROR_MESSAGE_CANCEL, null);
            return;
        }
        Activity I = this.b.I();
        ckf.f(I, "instance.activity");
        new OpenAuthDialog(I, this.b, this.g.a(), this.f13656a.e(), new c()).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x027a, code lost:
        if (tb.ckf.b("TOPAUTH_ACCESSTOKEN_EXPIRED", r2 == null ? null : r2.getErrorMsg()) != false) goto L_0x027c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.TMSAuthHelper.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.TMSAuthHelper.p():void");
    }
}
