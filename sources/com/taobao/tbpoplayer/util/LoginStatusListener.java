package com.taobao.tbpoplayer.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.o78;
import tb.rgm;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginStatusListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f13408a = new AtomicBoolean(false);

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
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(790626502);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b164bd", new Object[0]);
            return;
        }
        try {
            if (f13408a.compareAndSet(false, true)) {
                LoginBroadcastHelper.registerLoginReceiver(PopLayer.getReference().getApp(), new BroadcastReceiver() { // from class: com.taobao.tbpoplayer.util.LoginStatusListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/util/LoginStatusListener$1");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent != null) {
                            try {
                                LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                                JSONObject jSONObject = new JSONObject();
                                int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                                if (i == 1) {
                                    String userId = Login.getUserId();
                                    jSONObject.put("loginStatus", (Object) o78.REFRESH_SOURCE_LOGIN_SUCCESS);
                                    jSONObject.put("userId", (Object) userId);
                                    rgm.h().p("PopLayer", rgm.PAGE_EVENT_LOGIN_STATUS_SWITCHED, jSONObject, new JSONObject());
                                } else if (i == 2) {
                                    jSONObject.put("loginStatus", (Object) "logout");
                                    jSONObject.put("userId", (Object) "");
                                    rgm.h().p("PopLayer", rgm.PAGE_EVENT_LOGIN_STATUS_SWITCHED, jSONObject, new JSONObject());
                                }
                            } catch (Throwable th) {
                                wdm.h("LoginStatusListener.onReceive.error", th);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("LoginStatusListener.startListener.error", th);
        }
    }
}
