package com.taobao.android.turbo.adapter.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.a07;
import tb.ckf;
import tb.foc;
import tb.mih;
import tb.njg;
import tb.plk;
import tb.spu;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LoginAdapter implements foc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final njg d = kotlin.a.b(LoginAdapter$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f9726a;
    public final plk<foc.a> c = new plk<>();
    public foc.b b = g();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601196);
        }

        public a() {
        }

        public final LoginAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("297c8da2", new Object[]{this});
            } else {
                value = LoginAdapter.c().getValue();
            }
            return (LoginAdapter) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601195);
        t2o.a(919601167);
    }

    public LoginAdapter() {
        i();
    }

    public static final /* synthetic */ njg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ foc.b d(LoginAdapter loginAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (foc.b) ipChange.ipc$dispatch("96c411df", new Object[]{loginAdapter});
        }
        return loginAdapter.b;
    }

    public static final /* synthetic */ void e(LoginAdapter loginAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1040f2a9", new Object[]{loginAdapter});
        } else {
            loginAdapter.h();
        }
    }

    @Override // tb.foc
    public void a(foc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d5e68a", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.c.c(aVar);
    }

    @Override // tb.foc
    public void b(foc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3de467", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.c.a(aVar);
    }

    public final boolean f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc3f8e4c", new Object[]{this})).booleanValue();
        }
        foc.b g = g();
        String c = g.c();
        foc.b bVar = this.b;
        if (bVar != null) {
            str = bVar.c();
        } else {
            str = null;
        }
        boolean equals = TextUtils.equals(c, str);
        boolean z = true ^ equals;
        if (!equals) {
            this.b = g;
        }
        return z;
    }

    public foc.b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (foc.b) ipChange.ipc$dispatch("20da5835", new Object[]{this});
        }
        return new foc.b(Login.getUserId(), Login.getNick(), Login.getHeadPicLink());
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71f760b", new Object[]{this});
        } else if (f()) {
            tpu.a.b(tpu.Companion, "LoginAdapter", "onUserChanged", null, 4, null);
            this.c.d(new LoginAdapter$notifyUserChange$1(this));
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4d2375", new Object[]{this});
        } else if (this.f9726a == null) {
            this.f9726a = new BroadcastReceiver() { // from class: com.taobao.android.turbo.adapter.impl.LoginAdapter$registerLoginStateChangedCallback$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(LoginAdapter$registerLoginStateChangedCallback$1 loginAdapter$registerLoginStateChangedCallback$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/LoginAdapter$registerLoginStateChangedCallback$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.g(context, "context");
                    ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    String action = intent.getAction();
                    ckf.d(action);
                    LoginAction valueOf = LoginAction.valueOf(action);
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "LoginAdapter", "onReceive action = " + valueOf, null, 4, null);
                    int i = mih.$EnumSwitchMapping$0[valueOf.ordinal()];
                    if (i == 1) {
                        LoginAdapter.e(LoginAdapter.this);
                    } else if (i == 2) {
                        LoginAdapter.e(LoginAdapter.this);
                    } else if (i == 3) {
                        LoginAdapter.e(LoginAdapter.this);
                    } else if (i == 4) {
                        LoginAdapter.e(LoginAdapter.this);
                    }
                }
            };
            LoginBroadcastHelper.registerLoginReceiver(spu.Companion.d(), this.f9726a);
        }
    }

    @Override // tb.foc
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // tb.foc
    public void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{this, new Boolean(z)});
        } else if (!Login.checkSessionValid()) {
            Login.login(z);
        }
    }
}
