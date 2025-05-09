package com.taobao.android.tab2liveroom.liveroom.plugins;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.taobao.R;
import tb.akt;
import tb.alc;
import tb.d4s;
import tb.o78;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AutoLoginPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9514a;
    public final alc d;
    public final FrameLayout e;
    public View f;
    public boolean g;
    public BroadcastReceiver h;
    public final Handler b = new Handler(Looper.getMainLooper());
    public int c = 0;
    public final Runnable j = new a();
    public final boolean i = akt.p2("enableAutoLoginPlugin", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (AutoLoginPlugin.f(AutoLoginPlugin.this) != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(AutoLoginPlugin.j(AutoLoginPlugin.this), AutoLoginPlugin.f(AutoLoginPlugin.this));
            }
            AutoLoginPlugin.b(AutoLoginPlugin.this, 2);
            tfs.e("AutoLoginPlugin", "autoLoginTimeoutTask showLoginUI");
            AutoLoginPlugin.g(AutoLoginPlugin.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(779092144);
    }

    public AutoLoginPlugin(Context context, FrameLayout frameLayout, alc alcVar) {
        this.f9514a = context;
        this.e = frameLayout;
        this.d = alcVar;
    }

    public static /* synthetic */ int a(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66b852b", new Object[]{autoLoginPlugin})).intValue();
        }
        return autoLoginPlugin.c;
    }

    public static /* synthetic */ int b(AutoLoginPlugin autoLoginPlugin, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb9afe7c", new Object[]{autoLoginPlugin, new Integer(i)})).intValue();
        }
        autoLoginPlugin.c = i;
        return i;
    }

    public static /* synthetic */ Handler c(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("97757ded", new Object[]{autoLoginPlugin});
        }
        return autoLoginPlugin.b;
    }

    public static /* synthetic */ void d(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9483533a", new Object[]{autoLoginPlugin});
        } else {
            autoLoginPlugin.p();
        }
    }

    public static /* synthetic */ void e(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f3a3b", new Object[]{autoLoginPlugin});
        } else {
            autoLoginPlugin.m();
        }
    }

    public static /* synthetic */ BroadcastReceiver f(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("82f5c633", new Object[]{autoLoginPlugin});
        }
        return autoLoginPlugin.h;
    }

    public static /* synthetic */ void g(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a7083d", new Object[]{autoLoginPlugin});
        } else {
            autoLoginPlugin.s();
        }
    }

    public static /* synthetic */ boolean h(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b2ef42", new Object[]{autoLoginPlugin})).booleanValue();
        }
        return autoLoginPlugin.g;
    }

    public static /* synthetic */ void i(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bed63f", new Object[]{autoLoginPlugin});
        } else {
            autoLoginPlugin.o();
        }
    }

    public static /* synthetic */ Context j(AutoLoginPlugin autoLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("95c35c38", new Object[]{autoLoginPlugin});
        }
        return autoLoginPlugin.f9514a;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5834ce81", new Object[]{this});
            return;
        }
        tfs.e("AutoLoginPlugin", "checkLoginState");
        if (n()) {
            tfs.e("AutoLoginPlugin", "checkLoginState return : isLogin");
            return;
        }
        this.c = 1;
        r();
        this.b.postDelayed(this.j, 3000L);
        Login.login(false);
        if (this.h == null) {
            this.h = new BroadcastReceiver() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/plugins/AutoLoginPlugin$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null) {
                        int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            AutoLoginPlugin.b(AutoLoginPlugin.this, 3);
                            AutoLoginPlugin.c(AutoLoginPlugin.this).removeCallbacksAndMessages(null);
                            AutoLoginPlugin.d(AutoLoginPlugin.this);
                            AutoLoginPlugin.e(AutoLoginPlugin.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(context, AutoLoginPlugin.f(AutoLoginPlugin.this));
                            tfs.e("AutoLoginPlugin", "自动登录回调 " + AutoLoginPlugin.a(AutoLoginPlugin.this));
                        } else if (i == 2) {
                            AutoLoginPlugin.b(AutoLoginPlugin.this, 2);
                            AutoLoginPlugin.c(AutoLoginPlugin.this).removeCallbacksAndMessages(null);
                            AutoLoginPlugin.g(AutoLoginPlugin.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(context, AutoLoginPlugin.f(AutoLoginPlugin.this));
                            tfs.e("AutoLoginPlugin", "自动登录回调 " + AutoLoginPlugin.a(AutoLoginPlugin.this));
                        }
                    }
                }
            };
        }
        LoginBroadcastHelper.registerLoginReceiver(this.f9514a, this.h);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d35257", new Object[]{this});
        } else if (this.i) {
            this.g = true;
            tfs.e("AutoLoginPlugin", "checkLoginState: " + this.c);
            int i = this.c;
            if (i < 4) {
                k();
            } else if (i == 4) {
                o();
            } else if (i == 5) {
                o();
            } else if (i == 6) {
                p();
            } else if (i == 7) {
                s();
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8a54a4", new Object[]{this});
            return;
        }
        tfs.e("AutoLoginPlugin", "hideAutoLoginView");
        View view = this.f;
        if (view != null) {
            this.e.removeView(view);
            this.f = null;
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89040e8d", new Object[]{this});
            return;
        }
        this.c = 7;
        tfs.e("AutoLoginPlugin", "loginFailed");
        alc alcVar = this.d;
        if (alcVar != null) {
            alcVar.sendLiveRoomMessage("onLiveLoginFailed", null);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else if (this.i) {
            this.g = false;
            this.b.removeCallbacksAndMessages(null);
            BroadcastReceiver broadcastReceiver = this.h;
            if (broadcastReceiver != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(this.f9514a, broadcastReceiver);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ba37e1", new Object[]{this});
            return;
        }
        this.c = 0;
        tfs.e("AutoLoginPlugin", o78.REFRESH_SOURCE_LOGIN_SUCCESS);
        alc alcVar = this.d;
        if (alcVar != null) {
            alcVar.sendLiveRoomMessage("onLiveLoginSuccess", null);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80f2449", new Object[]{this});
            return;
        }
        tfs.e("AutoLoginPlugin", "showAutoLoginView");
        if (this.f == null) {
            this.f = LayoutInflater.from(this.f9514a).inflate(R.layout.tab2_liveroom_layout_live_login, (ViewGroup) null);
        }
        if (d4s.e("enableFixLoadingView", true) && this.f.getParent() != null) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
        this.e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c31e87", new Object[]{this});
        } else if (!n()) {
            tfs.e("AutoLoginPlugin", "showLoginUI");
            this.c = 4;
            Login.login(true);
            LoginBroadcastHelper.registerLoginReceiver(this.f9514a, new BroadcastReceiver() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/plugins/AutoLoginPlugin$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null) {
                        int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            if (AutoLoginPlugin.a(AutoLoginPlugin.this) == 4) {
                                AutoLoginPlugin.b(AutoLoginPlugin.this, 6);
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                            tfs.e("AutoLoginPlugin", "登录页面回调 SUCCESS" + AutoLoginPlugin.a(AutoLoginPlugin.this) + " isPageAppear :" + AutoLoginPlugin.h(AutoLoginPlugin.this));
                            if (AutoLoginPlugin.h(AutoLoginPlugin.this)) {
                                AutoLoginPlugin.d(AutoLoginPlugin.this);
                            }
                        } else if (i == 2 || i == 3) {
                            if (AutoLoginPlugin.a(AutoLoginPlugin.this) == 4) {
                                AutoLoginPlugin.b(AutoLoginPlugin.this, 5);
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                            tfs.e("AutoLoginPlugin", "登录页面回调 FAILED" + AutoLoginPlugin.a(AutoLoginPlugin.this) + " isPageAppear :" + AutoLoginPlugin.h(AutoLoginPlugin.this));
                            if (AutoLoginPlugin.h(AutoLoginPlugin.this)) {
                                AutoLoginPlugin.i(AutoLoginPlugin.this);
                            }
                        }
                    }
                }
            });
        }
    }
}
