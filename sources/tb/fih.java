package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fih implements gdh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ROOT_TAG = "update_";

    /* renamed from: a  reason: collision with root package name */
    public final String f19316a;
    public final gdh b;
    public static boolean logEnable = true;
    public static final Map<String, gdh> c = new HashMap();
    public static int logLevel = 6;

    static {
        t2o.a(950009894);
        t2o.a(950009893);
    }

    public fih(String str, gdh gdhVar) {
        this.b = gdhVar;
        this.f19316a = str;
    }

    public static gdh getLog(Class cls, gdh gdhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gdh) ipChange.ipc$dispatch("16837a72", new Object[]{cls, gdhVar}) : getLog(cls.getSimpleName(), gdhVar);
    }

    @Override // tb.gdh
    public int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{this, str})).intValue();
        }
        if (logLevel < 6 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.e(ROOT_TAG.concat(this.f19316a), str);
        }
        return gdhVar.e(str);
    }

    @Override // tb.gdh
    public int w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53e977bb", new Object[]{this, str})).intValue();
        }
        if (logLevel < 5 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.i(ROOT_TAG.concat(this.f19316a), str);
        }
        return gdhVar.w(str);
    }

    public static gdh getLog(String str, gdh gdhVar) {
        gdh gdhVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdh) ipChange.ipc$dispatch("24353d7b", new Object[]{str, gdhVar});
        }
        synchronized (fih.class) {
            try {
                Map<String, gdh> map = c;
                gdhVar2 = (gdh) ((HashMap) map).get(str);
                if (gdhVar2 == null) {
                    gdhVar2 = new fih(str, gdhVar);
                    ((HashMap) map).put(str, gdhVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gdhVar2;
    }

    @Override // tb.gdh
    public int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        if (logLevel < 3 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.d(ROOT_TAG.concat(this.f19316a), str);
        }
        return gdhVar.d(str);
    }

    @Override // tb.gdh
    public int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4533162d", new Object[]{this, str})).intValue();
        }
        if (logLevel < 4 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.i(ROOT_TAG.concat(this.f19316a), str);
        }
        return gdhVar.i(str);
    }

    @Override // tb.gdh
    public int v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b7de7a", new Object[]{this, str})).intValue();
        }
        if (logLevel < 2 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.v(ROOT_TAG.concat(this.f19316a), str);
        }
        return gdhVar.v(str);
    }

    @Override // tb.gdh
    public int e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c94072", new Object[]{this, str, th})).intValue();
        }
        if (logLevel < 6 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.e(ROOT_TAG.concat(this.f19316a), str, th);
        }
        return gdhVar.e(str, th);
    }

    @Override // tb.gdh
    public int w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be68a920", new Object[]{this, str, th})).intValue();
        }
        if (logLevel < 5 || !logEnable) {
            return 0;
        }
        gdh gdhVar = this.b;
        if (gdhVar == null) {
            return Log.w(ROOT_TAG.concat(this.f19316a), str, th);
        }
        return gdhVar.w(str, th);
    }
}
