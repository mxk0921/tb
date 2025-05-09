package com.taobao.tao.remotebusiness.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.iby;
import tb.inx;
import tb.p27;
import tb.rid;
import tb.sih;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbsRemoteLogin implements rid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context m;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f12739a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final sih i = new sih();
    public BroadcastReceiver j = null;
    public final Mtop k;
    public static final ThreadLocal<b> l = new ThreadLocal<>();
    public static volatile AtomicBoolean n = new AtomicBoolean(false);

    static {
        t2o.a(589299769);
        t2o.a(589299774);
    }

    public static /* synthetic */ Mtop b(AbsRemoteLogin absRemoteLogin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("1cd1f069", new Object[]{absRemoteLogin});
        }
        return absRemoteLogin.k;
    }

    public static /* synthetic */ AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba88d1f8", new Object[0]);
        }
        return n;
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173c73e6", new Object[]{this, obj});
        } else if (obj instanceof MtopResponse) {
            l.set(new b((MtopResponse) obj, (String) d(this.g, new Object[0])));
        } else if (obj instanceof MtopRequest) {
            l.set(new b((MtopRequest) obj));
        } else if (obj instanceof MtopBuilder) {
            l.set(new b(((MtopBuilder) obj).request, true));
        }
    }

    @Override // tb.rid
    public sih getLoginContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sih) ipChange.ipc$dispatch("a65acccd", new Object[]{this});
        }
        this.i.f28073a = (String) d(this.e, new Object[0]);
        this.i.b = (String) d(this.f, new Object[0]);
        this.i.c = (String) d(this.g, new Object[0]);
        return this.i;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUploadStats f12741a;
        public final /* synthetic */ b b;

        public a(IUploadStats iUploadStats, b bVar) {
            this.f12741a = iUploadStats;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (AbsRemoteLogin.c().compareAndSet(false, true)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add("long_nick");
                    hashSet.add("apiName");
                    hashSet.add("apiV");
                    hashSet.add("msgCode");
                    hashSet.add("S_STATUS");
                    hashSet.add("processName");
                    hashSet.add("appBackGround");
                    IUploadStats iUploadStats = this.f12741a;
                    if (iUploadStats != null) {
                        iUploadStats.onRegister("mtoprb", "SessionInvalid", hashSet, null, false);
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "onRegister called. module=mtoprb,monitorPoint=SessionInvalid");
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("long_nick", this.b.b);
                hashMap.put("apiName", this.b.c);
                hashMap.put("apiV", this.b.d);
                hashMap.put("msgCode", this.b.e);
                hashMap.put("S_STATUS", this.b.f);
                hashMap.put("processName", this.b.g);
                if (this.b.h) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("appBackGround", str);
                IUploadStats iUploadStats2 = this.f12741a;
                if (iUploadStats2 != null) {
                    iUploadStats2.onCommit("mtoprb", "SessionInvalid", hashMap, null);
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.AbsRemoteLogin", "upload  SessionInvalid Stats error.", e);
            }
        }
    }

    @Override // tb.rid
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) d(this.d, new Object[0]);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // tb.rid
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) d(this.c, new Object[0]);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final <T> T d(Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return (T) method.invoke(this.f12739a, objArr);
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[invokeMethod]invokeMethod error,method:" + method + ",args:" + objArr, e);
            return null;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
        } else if (this.j != null) {
        } else {
            if (m == null) {
                TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[registerReceiver]Context is null, register receiver fail.");
                return;
            }
            synchronized (p27.class) {
                try {
                    if (this.j == null) {
                        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.tao.remotebusiness.login.AbsRemoteLogin.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/login/AbsRemoteLogin$1");
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
                                if (r7.equals(com.taobao.android.ucp.util.LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS) == false) goto L_0x0047;
                             */
                            @Override // android.content.BroadcastReceiver
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void onReceive(android.content.Context r7, android.content.Intent r8) {
                                /*
                                    r6 = this;
                                    r0 = 2
                                    r1 = 1
                                    r2 = 0
                                    com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.AnonymousClass1.$ipChange
                                    boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                                    if (r4 == 0) goto L_0x0018
                                    java.lang.String r4 = "3c04d85a"
                                    r5 = 3
                                    java.lang.Object[] r5 = new java.lang.Object[r5]
                                    r5[r2] = r6
                                    r5[r1] = r7
                                    r5[r0] = r8
                                    r3.ipc$dispatch(r4, r5)
                                    return
                                L_0x0018:
                                    if (r8 != 0) goto L_0x001b
                                    return
                                L_0x001b:
                                    java.lang.String r7 = r8.getAction()
                                    mtopsdk.common.util.TBSdkLog$LogEnable r8 = mtopsdk.common.util.TBSdkLog.LogEnable.ErrorEnable
                                    boolean r8 = mtopsdk.common.util.TBSdkLog.isLogEnable(r8)
                                    if (r8 == 0) goto L_0x003b
                                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                    java.lang.String r3 = "[onReceive]Login Broadcast Received. action="
                                    r8.<init>(r3)
                                    r8.append(r7)
                                    java.lang.String r8 = r8.toString()
                                    java.lang.String r3 = "mtopsdk.AbsRemoteLogin"
                                    mtopsdk.common.util.TBSdkLog.e(r3, r8)
                                L_0x003b:
                                    r7.hashCode()
                                    r8 = 0
                                    r3 = -1
                                    int r4 = r7.hashCode()
                                    switch(r4) {
                                        case -1186442906: goto L_0x005d;
                                        case -1100695767: goto L_0x0052;
                                        case -542410121: goto L_0x0049;
                                        default: goto L_0x0047;
                                    }
                                L_0x0047:
                                    r0 = -1
                                    goto L_0x0067
                                L_0x0049:
                                    java.lang.String r1 = "NOTIFY_LOGIN_SUCCESS"
                                    boolean r7 = r7.equals(r1)
                                    if (r7 != 0) goto L_0x0067
                                    goto L_0x0047
                                L_0x0052:
                                    java.lang.String r0 = "NOTIFY_LOGIN_FAILED"
                                    boolean r7 = r7.equals(r0)
                                    if (r7 != 0) goto L_0x005b
                                    goto L_0x0047
                                L_0x005b:
                                    r0 = 1
                                    goto L_0x0067
                                L_0x005d:
                                    java.lang.String r0 = "NOTIFY_LOGIN_CANCEL"
                                    boolean r7 = r7.equals(r0)
                                    if (r7 != 0) goto L_0x0066
                                    goto L_0x0047
                                L_0x0066:
                                    r0 = 0
                                L_0x0067:
                                    switch(r0) {
                                        case 0: goto L_0x00a1;
                                        case 1: goto L_0x0086;
                                        case 2: goto L_0x006b;
                                        default: goto L_0x006a;
                                    }
                                L_0x006a:
                                    goto L_0x00bb
                                L_0x006b:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                    if (r7 != 0) goto L_0x0078
                                    mtopsdk.mtop.intf.Mtop r7 = mtopsdk.mtop.intf.Mtop.instance(r8)
                                    goto L_0x007e
                                L_0x0078:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                L_0x007e:
                                    tb.wih r7 = tb.wih.b(r7, r8)
                                    r7.e()
                                    goto L_0x00bb
                                L_0x0086:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                    if (r7 != 0) goto L_0x0093
                                    mtopsdk.mtop.intf.Mtop r7 = mtopsdk.mtop.intf.Mtop.instance(r8)
                                    goto L_0x0099
                                L_0x0093:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                L_0x0099:
                                    tb.wih r7 = tb.wih.b(r7, r8)
                                    r7.d()
                                    goto L_0x00bb
                                L_0x00a1:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                    if (r7 != 0) goto L_0x00ae
                                    mtopsdk.mtop.intf.Mtop r7 = mtopsdk.mtop.intf.Mtop.instance(r8)
                                    goto L_0x00b4
                                L_0x00ae:
                                    com.taobao.tao.remotebusiness.login.AbsRemoteLogin r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.this
                                    mtopsdk.mtop.intf.Mtop r7 = com.taobao.tao.remotebusiness.login.AbsRemoteLogin.b(r7)
                                L_0x00b4:
                                    tb.wih r7 = tb.wih.b(r7, r8)
                                    r7.c()
                                L_0x00bb:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.login.AbsRemoteLogin.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
                            }
                        };
                        this.j = broadcastReceiver;
                        d(this.h, m, broadcastReceiver);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AbsRemoteLogin(Context context, Mtop mtop) throws ClassNotFoundException, NoSuchMethodException {
        try {
            IpChange ipChange = Login.$ipChange;
            this.f12739a = Login.class;
        } catch (ClassNotFoundException unused) {
            this.f12739a = com.taobao.login4android.Login.class;
        }
        this.b = this.f12739a.getDeclaredMethod("login", Boolean.TYPE, Bundle.class);
        this.c = this.f12739a.getDeclaredMethod("checkSessionValid", new Class[0]);
        this.e = this.f12739a.getDeclaredMethod("getSid", new Class[0]);
        this.f = this.f12739a.getDeclaredMethod("getUserId", new Class[0]);
        this.g = this.f12739a.getDeclaredMethod("getNick", new Class[0]);
        IpChange ipChange2 = LoginStatus.$ipChange;
        this.d = LoginStatus.class.getDeclaredMethod("isLogining", new Class[0]);
        IpChange ipChange3 = LoginBroadcastHelper.$ipChange;
        this.h = LoginBroadcastHelper.class.getMethod("registerLoginReceiver", Context.class, BroadcastReceiver.class);
        if (mtop != null && this.k == null) {
            this.k = mtop;
        }
        if (context != null && m == null) {
            m = context;
        }
        e();
        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "register login event receiver");
    }

    @Override // tb.rid
    public void login(iby ibyVar, boolean z) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf0ecd2", new Object[]{this, ibyVar, new Boolean(z)});
            return;
        }
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.ErrorEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]call login,showLoginUI:" + z + " , listener:" + ibyVar);
        }
        ThreadLocal<b> threadLocal = l;
        b bVar = threadLocal.get();
        Bundle bundle = null;
        if (bVar != null) {
            try {
                try {
                    Bundle bundle2 = new Bundle();
                    try {
                        String a2 = bVar.a();
                        if (TBSdkLog.isLogEnable(logEnable)) {
                            TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]apiRefer=" + a2);
                        }
                        bundle2.putString(LoginConstants.MTOP_API_REFERENCE, a2);
                        IUploadStats iUploadStats = Mtop.instance(m).getMtopConfig().uploadStats;
                        if (iUploadStats == null) {
                            threadLocal.remove();
                            return;
                        }
                        MtopSDKThreadPoolExecutorFactory.submit(new a(iUploadStats, bVar));
                        threadLocal.remove();
                        bundle = bundle2;
                    } catch (Exception e2) {
                        e = e2;
                        bundle = bundle2;
                        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]  login extra bundle error.", e);
                        l.remove();
                        e();
                        d(this.b, Boolean.valueOf(z), bundle);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                l.remove();
                throw th;
            }
        }
        e();
        d(this.b, Boolean.valueOf(z), bundle);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f12742a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;

        static {
            t2o.a(589299772);
        }

        public b(MtopResponse mtopResponse, String str) {
            this.f12742a = LoginConstants.EVENT_SESSION_INVALID;
            this.b = str;
            this.c = mtopResponse.getApi();
            this.d = mtopResponse.getV();
            this.e = mtopResponse.getRetCode();
            this.f = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), ExifInterface.LATITUDE_SOUTH);
            this.g = MtopUtils.getCurrentProcessName(AbsRemoteLogin.m);
            this.h = inx.h();
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", (Object) this.f12742a);
            jSONObject.put("apiName", (Object) this.c);
            jSONObject.put("v", (Object) this.d);
            jSONObject.put("processName", (Object) this.g);
            jSONObject.put("appBackGround", (Object) Boolean.valueOf(this.h));
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("long_nick", (Object) this.b);
            }
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("msgCode", (Object) this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                jSONObject.put("S_STATUS", (Object) this.f);
            }
            return jSONObject.toJSONString();
        }

        public b(MtopRequest mtopRequest) {
            this(mtopRequest, false);
        }

        public b(MtopRequest mtopRequest, boolean z) {
            this.f12742a = z ? "BX_RETRY" : "REQUEST_NEED_LOGIN";
            this.c = mtopRequest.getApiName();
            this.d = mtopRequest.getVersion();
            this.g = MtopUtils.getCurrentProcessName(AbsRemoteLogin.m);
            this.h = inx.h();
        }
    }
}
