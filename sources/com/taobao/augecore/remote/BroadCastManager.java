package com.taobao.augecore.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.data.GroupData;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.List;
import tb.gj1;
import tb.hj1;
import tb.jj1;
import tb.ry4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BroadCastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
            }
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
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            b();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e409bd40", new Object[0]);
            return;
        }
        hj1.a(jj1.LOG_TAG, "接收到登录广播，开始请求网络，处理请求对列数据，保存数据到本地");
        if (gj1.c().c) {
            hj1.a(jj1.LOG_TAG, "接收到登录广播，正在发起的请求，不重新发起请求");
        } else {
            gj1.c().d(new a());
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8f6866", new Object[]{context});
            return;
        }
        hj1.a(jj1.LOG_TAG, "注册登录广播监听");
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.augecore.remote.BroadCastManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/augecore/remote/BroadCastManager$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null) {
                    String action = intent.getAction();
                    hj1.a(jj1.LOG_TAG, "接收登录广播，当前的action是 == " + action);
                    LoginAction valueOf = LoginAction.valueOf(action);
                    if (valueOf != null) {
                        int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                        if (i == 1 || i == 2) {
                            BroadCastManager.a();
                        }
                    }
                }
            }
        });
    }
}
