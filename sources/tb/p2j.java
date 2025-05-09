package tb;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.message.kit.util.Env;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.PowerMsgReceiver;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p2j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d;
    public static String e;
    public static String g;
    public static Application h;
    public static boolean l;

    /* renamed from: a  reason: collision with root package name */
    public static int f25831a = 0;
    public static boolean b = false;
    public static int c = -1;
    public static long f = Long.MIN_VALUE;
    public static Map<Integer, String> i = new HashMap();
    public static int j = -1;
    public static final int k = 1;
    public static b m = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.p2j.b
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe3957f0", new Object[]{this});
            }
            return "";
        }

        @Override // tb.p2j.b
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14dcb523", new Object[]{this});
            }
            return "";
        }

        @Override // tb.p2j.b
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f6e2b01", new Object[]{this});
            }
            return null;
        }

        @Override // tb.p2j.b
        public Boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("9183597d", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        String a();

        String b();

        String c();

        Boolean d();
    }

    static {
        t2o.a(628097150);
    }

    public static String b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5342eaff", new Object[0]);
        }
        try {
            return aoh.b(e + g + System.currentTimeMillis() + (new Random().nextInt(TaobaoMediaPlayer.FFP_PROP_FLOAT_AUDIO_GAIN_VALUE) + 10000));
        } catch (Exception e2) {
            e2.printStackTrace();
            return (EncryptUtils.IV_PARAMETER_SPEC + System.currentTimeMillis()).substring(str.length() - 16);
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[0]);
        }
        String a2 = m.a();
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        String b2 = m.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (!TextUtils.isEmpty(d)) {
            return "5.0.0";
        }
        try {
            String str = h.getPackageManager().getPackageInfo(h.getPackageName(), 0).versionName;
            d = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "5.0.0";
        }
    }

    public static synchronized void f() {
        synchronized (p2j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b27ff74", new Object[0]);
            } else if (TextUtils.isEmpty(e) || TextUtils.isEmpty(g) || h == null || i == null) {
                throw new Error("deviceID | appKey | application | serviceMap not bind");
            } else {
                MsgLog.g("MsgEnvironment", "init ing");
                int i2 = f25831a;
                f25831a = i2 + 1;
                if (i2 > 0) {
                    MsgLog.g("MsgEnvironment", "has inited inited=" + f25831a);
                    return;
                }
                e();
                g();
                f = hyv.a(e);
                Intent intent = new Intent("com.taobao.tao.messagkit.receive");
                intent.putExtra("key", "init");
                new PowerMsgReceiver().b(h, intent);
                mlm.c();
            }
        }
    }

    public static boolean g() {
        boolean z;
        Boolean d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            d2 = (Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0]);
        } else {
            b bVar = m;
            if (bVar == null || bVar.d() == null) {
                if (c != 0) {
                    try {
                        if ((h.getApplicationInfo().flags & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        b = z;
                        c = 0;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return b;
            }
            d2 = m.d();
        }
        return d2.booleanValue();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0bf554", new Object[0])).booleanValue();
        }
        return l;
    }

    public static void a(Application application, String str, String str2, int i2, Map<Integer, String> map, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554e6a3b", new Object[]{application, str, str2, new Integer(i2), map, bVar});
            return;
        }
        h = application;
        e = str;
        g = str2;
        j = i2;
        i = map;
        s15.d().e(application);
        if (bVar != null) {
            m = bVar;
        }
        try {
            if (Env.getApplication() == null) {
                Env.setGlobalAppContext(application);
            }
        } catch (Throwable th) {
            MsgLog.g("MsgEnvironment", "setGlobalAppContext e=" + th.getMessage());
        }
        f();
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7eef18", new Object[0]);
            return;
        }
        MsgLog.g("MsgEnvironment", "setInitSuccess");
        l = true;
    }
}
