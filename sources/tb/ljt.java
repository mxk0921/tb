package tb;

import android.os.AsyncTask;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ljt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ljt> f23372a;
        public vjt b;

        static {
            t2o.a(723517508);
        }

        public a(ljt ljtVar) {
            this.f23372a = new WeakReference<>(ljtVar);
        }

        public static /* synthetic */ vjt a(a aVar, vjt vjtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vjt) ipChange.ipc$dispatch("ed6f186b", new Object[]{aVar, vjtVar});
            }
            aVar.b = vjtVar;
            return vjtVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/template/manager/TemplateManager$JSONObjectShiftTask");
        }

        /* renamed from: b */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            ljt ljtVar = this.f23372a.get();
            if (ljtVar == null) {
                return null;
            }
            ljt.a(ljtVar, this.b, new wjt(), true);
            this.b.getClass();
            ljt.b(ljtVar);
            synchronized (ljt.b(ljtVar)) {
            }
            return null;
        }
    }

    static {
        t2o.a(723517505);
    }

    public static /* synthetic */ void a(ljt ljtVar, vjt vjtVar, wjt wjtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5ce9db", new Object[]{ljtVar, vjtVar, wjtVar, new Boolean(z)});
        } else {
            ljtVar.d(vjtVar, wjtVar, z);
        }
    }

    public static /* synthetic */ LruCache b(ljt ljtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("3639e1bb", new Object[]{ljtVar});
        }
        ljtVar.getClass();
        return null;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883aa4", new Object[]{this, str});
        }
        return "https://gw.alicdn.com/tfscom/L0/avengers/component/" + str;
    }

    public final void d(vjt vjtVar, wjt wjtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79809cd2", new Object[]{this, vjtVar, wjtVar, new Boolean(z)});
            return;
        }
        vjtVar.getClass();
        c(null);
        throw null;
    }
}
