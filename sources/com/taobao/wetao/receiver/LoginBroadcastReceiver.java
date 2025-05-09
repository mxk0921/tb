package com.taobao.wetao.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LoginBroadcastReceiver b = new LoginBroadcastReceiver();

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f14158a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a();

        void o();

        void y();

        void z();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9512450", new Object[]{this});
            }
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
            }
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82cd926b", new Object[]{this});
            }
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33eb5eae", new Object[]{this});
            }
        }
    }

    private LoginBroadcastReceiver() {
    }

    public static LoginBroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginBroadcastReceiver) ipChange.ipc$dispatch("9d743fa", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/receiver/LoginBroadcastReceiver");
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3dc9db", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.f14158a).add(bVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
            if (i == 1) {
                Iterator it = ((ArrayList) this.f14158a).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).o();
                }
            } else if (i == 2) {
                Iterator it2 = ((ArrayList) this.f14158a).iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).z();
                }
            } else if (i == 3) {
                Iterator it3 = ((ArrayList) this.f14158a).iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).y();
                }
            } else if (i == 4) {
                Iterator it4 = ((ArrayList) this.f14158a).iterator();
                while (it4.hasNext()) {
                    ((b) it4.next()).a();
                }
            }
        }
    }
}
