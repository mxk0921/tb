package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile rjr c;
    public static final String d = rjr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Random f27427a = new Random();
    public final HashMap<String, evr> b = new HashMap<>();

    static {
        t2o.a(806356081);
    }

    public static rjr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjr) ipChange.ipc$dispatch("d551306b", new Object[0]);
        }
        if (c == null) {
            synchronized (rjr.class) {
                try {
                    if (c == null) {
                        c = new rjr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(Context context, String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66c539a", new Object[]{this, context, str, ux9Var});
        } else if (context == null || str == null) {
            eir.a(d, "createRoomEngine context null");
        } else {
            evr evrVar = new evr();
            evrVar.b(context, str, ux9Var);
            this.b.put(str, evrVar);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0f81e8", new Object[]{this, str});
        } else if (str == null) {
            eir.a(d, "destroyRoomEngine liveContextKey =  null");
        } else {
            evr remove = this.b.remove(str);
            if (remove != null) {
                remove.d();
            }
        }
    }

    public String c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b6407fe", new Object[]{this, str});
        }
        if (qvs.W0()) {
            return imy.b(str);
        }
        if (v2s.o().u() != null) {
            str2 = v2s.o().u().getUserId();
        } else {
            str2 = "";
        }
        return str + "_" + str2 + "_" + this.f27427a.nextInt(1000) + "_" + System.currentTimeMillis();
    }

    public <T extends xkd> T d(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((xkd) ipChange.ipc$dispatch("20597527", new Object[]{this, str, cls}));
        }
        if (str == null) {
            eir.a(d, "getService liveContextKey =  null");
            return null;
        }
        evr evrVar = this.b.get(str);
        if (evrVar != null) {
            return (T) evrVar.a(cls);
        }
        return null;
    }
}
