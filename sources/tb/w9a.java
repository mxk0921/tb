package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w9a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final w9a h = new w9a();

    /* renamed from: a  reason: collision with root package name */
    public Context f30530a;
    public volatile Handler b;
    public volatile Handler c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public String e;
    public String f;
    public String g;
    public final HandlerThread i;
    public final HandlerThread j;
    public volatile SharedPreferences k;

    public w9a() {
        HandlerThread handlerThread = new HandlerThread("APM-Procedure");
        this.i = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("APM-FrameMetrics");
        this.j = handlerThread2;
        handlerThread2.start();
    }

    public static w9a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9a) ipChange.ipc$dispatch("f137874d", new Object[0]);
        }
        return h;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("267167ae", new Object[]{this});
        }
        return this.f30530a;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e4bed88b", new Object[]{this});
        }
        if (this.c == null) {
            synchronized (w9a.class) {
                try {
                    if (this.c == null) {
                        this.c = new Handler(this.j.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1025c0ef", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        return this.e;
    }

    public Handler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("25d5cc55", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (w9a.class) {
                try {
                    if (this.b == null) {
                        this.b = new Handler(this.i.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public Handler i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9d55546e", new Object[]{this});
        }
        return this.d;
    }

    public w9a j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9a) ipChange.ipc$dispatch("8dde3805", new Object[]{this, context});
        }
        this.f30530a = context;
        return this;
    }

    public SharedPreferences k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (w9a.class) {
                try {
                    if (this.k == null) {
                        this.k = this.f30530a.getSharedPreferences("apm", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.k;
    }

    public w9a l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9a) ipChange.ipc$dispatch("2e00f1b", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        Context context = this.f30530a;
        if (context == null) {
            return "";
        }
        if (this.g == null) {
            int identifier = context.getResources().getIdentifier("ttid", "string", this.f30530a.getPackageName());
            if (identifier <= 0) {
                zq6.a("Global", "can not find valid ttid");
                this.g = "";
            } else {
                this.g = this.f30530a.getString(identifier);
            }
        }
        return this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40fe82e8", new Object[]{this})).booleanValue();
        }
        Context context = this.f30530a;
        if (context == null) {
            return false;
        }
        if (this.f == null) {
            int identifier = context.getResources().getIdentifier("publish_type", "string", this.f30530a.getPackageName());
            if (identifier <= 0) {
                zq6.a("Global", "can not find valid publish_type");
                this.f = "";
            } else {
                this.f = this.f30530a.getString(identifier);
            }
        }
        return "0".equals(this.f);
    }
}
