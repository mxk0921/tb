package com.taobao.themis.inside.adapter;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.logger.IRemoteLoggerAdapter;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Result;
import tb.bmv;
import tb.ckf;
import tb.icn;
import tb.lcn;
import tb.p8s;
import tb.qqt;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJA\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJA\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJA\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJQ\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSRemoteLoggerImpl;", "Lcom/taobao/themis/kernel/logger/IRemoteLoggerAdapter;", "<init>", "()V", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "eventName", "eventId", "parentId", "Lcom/alibaba/fastjson/JSONObject;", "extra", "Ltb/xhv;", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", bmv.MSGTYPE_INTERVAL, "d", "w", "e", "errorCode", "errorMsg", "criticalError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSRemoteLoggerImpl implements IRemoteLoggerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13551a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            Application application;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
                if (iEnvironmentService == null) {
                    application = null;
                } else {
                    application = iEnvironmentService.getApplicationContext();
                }
                lcn.n(application);
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13552a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public b(String str, String str2, String str3, String str4, JSONObject jSONObject, String str5, String str6) {
            this.f13552a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = jSONObject;
            this.f = str5;
            this.g = str6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RVLLevel rVLLevel = RVLLevel.Error;
                String str = this.f13552a;
                if (str == null) {
                    str = "";
                }
                icn a2 = lcn.a(rVLLevel, str);
                String str2 = this.b;
                if (str2 == null) {
                    str2 = "";
                }
                a2.k(str2, this.c).m(this.d).b(this.e).i(this.f, this.g).f();
            } catch (Throwable th) {
                TMSLogger.c("TMSRemoteLoggerImpl", "", th);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RVLLevel f13553a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONObject f;

        public c(RVLLevel rVLLevel, String str, String str2, String str3, String str4, JSONObject jSONObject) {
            this.f13553a = rVLLevel;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RVLLevel rVLLevel = this.f13553a;
                String str = this.b;
                if (str == null) {
                    str = "";
                }
                icn a2 = lcn.a(rVLLevel, str);
                String str2 = this.c;
                if (str2 == null) {
                    str2 = "";
                }
                a2.k(str2, this.d).m(this.e).b(this.f).f();
            } catch (Throwable th) {
                TMSLogger.c("TMSRemoteLoggerImpl", "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // tb.qqt
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis_Remote_Log_Executor";
        }
    }

    static {
        t2o.a(837812306);
        t2o.a(839909753);
    }

    public TMSRemoteLoggerImpl() {
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(d.INSTANCE);
        ckf.f(newSingleThreadExecutor, "newSingleThreadExecutor(…s_Remote_Log_Executor\" })");
        this.f13551a = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(a.INSTANCE);
    }

    public final void a(RVLLevel rVLLevel, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb516dfa", new Object[]{this, rVLLevel, str, str2, str3, str4, jSONObject});
        } else {
            this.f13551a.execute(new c(rVLLevel, str, str2, str4, str3, jSONObject));
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void criticalError(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61428184", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject});
            return;
        }
        ckf.g(str5, "errorCode");
        ckf.g(str6, "errorMsg");
        this.f13551a.execute(new b(str, str2, str4, str3, jSONObject, str5, str6));
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void d(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd41993d", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Debug, str, str2, str4, str3, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void e(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbcaedc", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Error, str, str2, str3, str4, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void i(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa90558", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Info, str, str2, str4, str3, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void v(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e91e6b", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Verbose, str, str2, str4, str3, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void w(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8664340a", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Warn, str, str2, str3, str4, jSONObject);
        }
    }
}
