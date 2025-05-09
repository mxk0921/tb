package com.taobao.android.layoutmanager.adapter.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLogin extends ILogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, BroadcastReceiver> f8168a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(502267947);
    }

    public static /* synthetic */ Object ipc$super(TBLogin tBLogin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/TBLogin");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public ILogin.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILogin.a) ipChange.ipc$dispatch("b51a0a4", new Object[]{this});
        }
        ILogin.a aVar = new ILogin.a();
        aVar.f12001a = Login.getUserId();
        aVar.b = Login.getNick();
        aVar.c = Login.getHeadPicLink();
        return aVar;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public void c(final ILogin.LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a03e10b", new Object[]{this, loginCallback});
        } else if (loginCallback != null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this) { // from class: com.taobao.android.layoutmanager.adapter.impl.TBLogin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/TBLogin$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i == 1) {
                        ((NotifyManager.f.a) loginCallback).a(1);
                    } else if (i == 2) {
                        ((NotifyManager.f.a) loginCallback).a(2);
                    } else if (i == 3) {
                        ((NotifyManager.f.a) loginCallback).a(3);
                    } else if (i == 4) {
                        ((NotifyManager.f.a) loginCallback).a(4);
                    }
                }
            };
            ((HashMap) this.f8168a).put(loginCallback.toString(), broadcastReceiver);
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), broadcastReceiver);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public void d(ILogin.LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1775052", new Object[]{this, loginCallback});
        } else if (loginCallback != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), (BroadcastReceiver) ((HashMap) this.f8168a).get(loginCallback.toString()));
        }
    }
}
