package com.taobao.android.middleware.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.info.AppInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.LoginSwitch;
import java.net.URLDecoder;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.TBSdkLog;
import tb.zti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopSimpleSessionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f8947a = null;
    public static String b = null;
    public static long c = -1;
    public static String d;
    public static SharedPreferences e;
    public static Context f;
    public static boolean g;
    public static final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.middleware.compat.MtopSimpleSessionManager$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8948a;

            public a(String str) {
                this.f8948a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtopSimpleSessionManager.a(this.f8948a);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/MtopSimpleSessionManager$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                zti.a(new a(intent.getAction()));
            }
        }
    };
    public static final BroadcastReceiver i = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.middleware.compat.MtopSimpleSessionManager$2$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8949a;

            public a(String str) {
                this.f8949a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtopSimpleSessionManager.b(this.f8949a);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/MtopSimpleSessionManager$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                zti.a(new a(intent.getAction()));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            j(str);
        }
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            i(str);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[0])).booleanValue();
        }
        if (g) {
            if (TextUtils.isEmpty(f8947a) || TextUtils.isEmpty(b)) {
                return false;
            }
            return true;
        } else if (TextUtils.isEmpty(f8947a) || TextUtils.isEmpty(b)) {
            return false;
        } else {
            if (c < 0 || System.currentTimeMillis() / 1000 < c) {
                return true;
            }
            return false;
        }
    }

    public static void d(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fe0cb2", new Object[]{str, str2, new Long(j), str3});
        } else if (!TextUtils.equals(f8947a, str) || !TextUtils.equals(b, str2) || c != j) {
            f8947a = str;
            b = str2;
            c = j;
            d = str3;
            m(str, str2, j, str3);
        }
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf355fcb", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            int length = split.length;
            for (int i2 = 0; i2 < length; i2++) {
                String[] split2 = split[i2].split("=", 2);
                if (split2.length == 2) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    if (str2.equals(trim)) {
                        try {
                            return URLDecoder.decode(trim2, "UTF-8");
                        } catch (Exception unused) {
                            TBSdkLog.e("mtopsdk.SimpleSessionManager", "[getCookie]decode error. value=" + trim2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[0]);
        }
        return b;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4defb86b", new Object[0]);
        }
        if (!g) {
            return null;
        }
        return d;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        return f8947a;
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602bff0f", new Object[]{str});
            return;
        }
        String userId = Login.getUserId();
        String sid = Login.getSid();
        long sessionExpiredTime = SessionManager.getInstance(f).getSessionExpiredTime();
        String e2 = e(CookieManager.getInstance().getCookie("https://guide-acs.m.taobao.com"), LoginSwitch.SGCOOKIE);
        TBSdkLog.e("mtopsdk.SimpleSessionManager", "loginInitReceiver action=" + str + ", userid=" + userId + ", sid=" + sid + ", expired=" + sessionExpiredTime);
        d(userId, sid, sessionExpiredTime, e2);
        LocalBroadcastManager.getInstance(f).unregisterReceiver(i);
    }

    public static void k(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6b2936", new Object[]{context, new Boolean(z)});
            return;
        }
        f = context;
        LoginBroadcastHelper.registerLoginReceiver(context, h);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AppInfo.INITED_ACTION);
        LocalBroadcastManager.getInstance(context).registerReceiver(i, intentFilter);
        SharedPreferences sharedPreferences = context.getSharedPreferences(ConfigStoreManager.MTOP_CONFIG_STORE, 0);
        e = sharedPreferences;
        f8947a = sharedPreferences.getString("mtop_u_i", "");
        b = e.getString("mtop_s_i", "");
        c = e.getLong("mtop_e_t", -1L);
        d = e.getString("mtop_sg_c", "");
        g = z;
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b4ddc4", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = e.edit();
        edit.remove("mtop_u_i");
        edit.remove("mtop_s_i");
        edit.remove("mtop_e_t");
        edit.remove("mtop_sg_c");
        edit.apply();
    }

    public static void m(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fad0639", new Object[]{str, str2, new Long(j), str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            TBSdkLog.e("mtopsdk.SimpleSessionManager", "storeUserInfo, uid=" + str + ", sid=" + str2 + ", sgcookie=" + str3);
            SharedPreferences.Editor edit = e.edit();
            edit.putString("mtop_u_i", str);
            edit.putString("mtop_s_i", str2);
            edit.putLong("mtop_e_t", j);
            edit.putString("mtop_sg_c", str3);
            edit.apply();
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939a715f", new Object[]{str});
            return;
        }
        LoginAction valueOf = LoginAction.valueOf(str);
        if (valueOf != null) {
            TBSdkLog.e("mtopsdk.SimpleSessionManager", "loginAction=" + str);
            int i2 = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
            if (i2 == 1) {
                f8947a = Login.getUserId();
                b = Login.getSid();
                c = SessionManager.getInstance(f).getSessionExpiredTime();
                String e2 = e(CookieManager.getInstance().getCookie("https://guide-acs.m.taobao.com"), LoginSwitch.SGCOOKIE);
                d = e2;
                m(f8947a, b, c, e2);
            } else if (i2 == 2) {
                f8947a = null;
                b = null;
                c = -1L;
                d = null;
                l();
            }
        }
    }
}
