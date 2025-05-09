package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jg3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21981a;
    public final Class<?> b;
    public final b c;
    public AsyncTask<Void, Integer, Object> d;
    public int e;
    public String f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AsyncTask<Void, Integer, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f21982a = 0;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/cdn/CdnRequestTask$1");
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
            if (r7 == 0) goto L_0x011c;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v3, types: [tb.jg3] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Unknown variable types count: 2 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object doInBackground(java.lang.Void... r7) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.jg3.a.doInBackground(java.lang.Void[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            super.onPostExecute(obj);
            if (jg3.i(jg3.this) == null) {
                return;
            }
            if (obj != null) {
                jg3.i(jg3.this).b(obj, this.f21982a);
            } else {
                jg3.i(jg3.this).a(jg3.d(jg3.this), jg3.f(jg3.this), jg3.b(jg3.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i, String str, String str2);

        void b(Object obj, long j);
    }

    static {
        t2o.a(295698923);
    }

    public jg3(String str, Class<?> cls, b bVar) {
        this.f21981a = str;
        this.b = cls;
        this.c = bVar;
    }

    public static /* synthetic */ String a(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd987025", new Object[]{jg3Var});
        }
        return jg3Var.f21981a;
    }

    public static /* synthetic */ String b(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed4fa426", new Object[]{jg3Var});
        }
        return jg3Var.g;
    }

    public static /* synthetic */ String c(jg3 jg3Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b131961e", new Object[]{jg3Var, str});
        }
        jg3Var.g = str;
        return str;
    }

    public static /* synthetic */ int d(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f631618c", new Object[]{jg3Var})).intValue();
        }
        return jg3Var.e;
    }

    public static /* synthetic */ int e(jg3 jg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de4d08ff", new Object[]{jg3Var, new Integer(i)})).intValue();
        }
        jg3Var.e = i;
        return i;
    }

    public static /* synthetic */ String f(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cbe0c28", new Object[]{jg3Var});
        }
        return jg3Var.f;
    }

    public static /* synthetic */ String g(jg3 jg3Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("242ac1a0", new Object[]{jg3Var, str});
        }
        jg3Var.f = str;
        return str;
    }

    public static /* synthetic */ Class h(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9463004", new Object[]{jg3Var});
        }
        return jg3Var.b;
    }

    public static /* synthetic */ b i(jg3 jg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c09d1d3d", new Object[]{jg3Var});
        }
        return jg3Var.c;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AsyncTask<Void, Integer, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new a();
        }
        this.d.execute(new Void[0]);
    }
}
