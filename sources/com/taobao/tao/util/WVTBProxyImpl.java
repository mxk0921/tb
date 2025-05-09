package com.taobao.tao.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.WVIAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WVTBProxyImpl extends BroadcastReceiver implements WVIAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler = null;
    private final Object lock = new Object();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.util.WVTBProxyImpl$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(775946450);
        t2o.a(989855926);
    }

    public static /* synthetic */ Object ipc$super(WVTBProxyImpl wVTBProxyImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/WVTBProxyImpl");
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        new StringBuilder("getTimestamp success, timestamp: ").append(currentTimeStamp);
        return currentTimeStamp;
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public synchronized void login(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66feea0", new Object[]{this, handler});
            return;
        }
        synchronized (this.lock) {
            this.mHandler = handler;
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this);
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
            Login.login(true, bundle);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
            int i = AnonymousClass1.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
            if (i != 1) {
                if ((i == 2 || i == 3) && this.mHandler != null) {
                    this.mHandler.sendEmptyMessage(0);
                    LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                    this.mHandler = null;
                }
            } else if (this.mHandler != null) {
                this.mHandler.sendEmptyMessage(1);
                LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                this.mHandler = null;
            }
        }
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public Map<String, String> getLoginInfo(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d26d646d", new Object[]{this, handler});
        }
        synchronized (this.lock) {
            try {
                this.mHandler = handler;
                if (Login.checkSessionValid()) {
                    this.mHandler = null;
                    String ecode = Login.getEcode();
                    StringBuilder sb = new StringBuilder("getLoginInfo, sid: ");
                    sb.append(Login.getSid());
                    sb.append(";ecode: ");
                    sb.append(ecode);
                    HashMap hashMap = new HashMap();
                    hashMap.put("sid", Login.getSid());
                    hashMap.put(SessionConstants.ECODE, ecode);
                    return hashMap;
                }
                LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this);
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
                Login.login(false, bundle);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
