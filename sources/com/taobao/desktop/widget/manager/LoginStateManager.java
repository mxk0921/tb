package com.taobao.desktop.widget.manager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.broadcast.LoginBroadcastReceiver;
import com.taobao.widgetvivo.server.WidgetVivoService;
import tb.nn8;
import tb.t2o;
import tb.vd7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(437256253);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130e1aac", new Object[]{context});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new LoginBroadcastReceiver() { // from class: com.taobao.desktop.widget.manager.LoginStateManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.desktop.widget.manager.LoginStateManager$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Context f10329a;

                    public a(Context context) {
                        this.f10329a = context;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            vd7.e(this.f10329a).i(Login.getUserId());
                        }
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.desktop.widget.manager.LoginStateManager$1$b */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class b implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Context f10330a;

                    public b(Context context) {
                        this.f10330a = context;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            vd7.e(this.f10330a).i("");
                        }
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1006950490) {
                        super.onReceive((Context) objArr[0], (Intent) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/manager/LoginStateManager$1");
                }

                @Override // com.taobao.login4android.broadcast.LoginBroadcastReceiver, android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    super.onReceive(context2, intent);
                    if (intent != null) {
                        try {
                            LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                            Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver action: " + valueOf);
                            int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                            if (i == 1) {
                                Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGIN_SUCCESS");
                                WidgetVivoService.n(context2, valueOf.name());
                                nn8.c().execute(new a(context2));
                            } else if (i == 2) {
                                Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGOUT");
                                WidgetVivoService.n(context2, valueOf.name());
                                nn8.c().execute(new b(context2));
                            } else if (i == 3) {
                                Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGIN_FAILED");
                            }
                        } catch (Throwable th) {
                            Log.e(WidgetVivoService.LOG_TAG, th.getMessage());
                        }
                    }
                }
            });
        }
    }
}
