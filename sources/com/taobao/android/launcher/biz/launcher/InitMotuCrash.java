package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.TaoPackageInfo;
import java.util.HashMap;
import tb.bti;
import tb.j5s;
import tb.k1s;
import tb.mss;
import tb.oeh;
import tb.zap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitMotuCrash extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k1s f8144a;

        public a(k1s k1sVar) {
            this.f8144a = k1sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TaoPackageInfo.init();
            String str = TaoPackageInfo.sTTID;
            String version = TaoPackageInfo.getVersion();
            k1s k1sVar = this.f8144a;
            if (k1sVar != null) {
                k1sVar.a(oeh.CHANNEL, str);
                this.f8144a.a("APP_VERSION", version);
            }
            zap.b().g(str);
            zap.b().f(version);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InitMotuCrash.q(InitMotuCrash.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class c {
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

    public InitMotuCrash(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(InitMotuCrash initMotuCrash, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitMotuCrash");
    }

    public static /* synthetic */ void q(InitMotuCrash initMotuCrash) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe10429", new Object[]{initMotuCrash});
        } else {
            initMotuCrash.r();
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df255e27", new Object[]{this});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo("sLinkOptOpened", String.valueOf(LauncherRuntime.n));
        crashCaughtHeader.addHeaderInfo("diagnoseSession", String.valueOf(LauncherRuntime.f8166a));
    }

    @Override // tb.mss
    public void p(final Application application, HashMap<String, Object> hashMap) {
        final k1s k1sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        UncaughtCrashManager manager = TCrashSDK.instance().getManager();
        if (manager instanceof k1s) {
            k1sVar = (k1s) manager;
        } else {
            k1sVar = null;
        }
        bti.b(c(), new a(k1sVar));
        bti.b(c(), new b());
        bti.b(c(), new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.InitMotuCrash.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginBroadcastHelper.registerLoginReceiver(application, new BroadcastReceiver() { // from class: com.taobao.android.launcher.biz.launcher.InitMotuCrash.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitMotuCrash$3$1");
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                                int i = c.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                                if (i == 1) {
                                    String nick = Login.getNick();
                                    k1s k1sVar2 = k1sVar;
                                    if (!(k1sVar2 == null || nick == null)) {
                                        k1sVar2.a(oeh.USERNICK, nick);
                                    }
                                    j5s.j().K(nick);
                                    LoginBroadcastHelper.unregisterLoginReceiver(application.getApplicationContext(), this);
                                } else if (i == 2 || i == 3) {
                                    k1s k1sVar3 = k1sVar;
                                    if (k1sVar3 != null) {
                                        k1sVar3.a(oeh.USERNICK, "");
                                    }
                                    j5s.j().K(null);
                                    LoginBroadcastHelper.unregisterLoginReceiver(application.getApplicationContext(), this);
                                }
                            }
                        }
                    });
                }
            }
        });
    }
}
