package com.taobao.android.dinamic.tempate;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import tb.bv7;
import tb.ojt;
import tb.t2o;
import tb.ym7;
import tb.zig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<AsyncTaskC0397a> f7265a = new ArrayDeque<>();
    public volatile AsyncTaskC0397a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f7268a;
        public String b;
        public DinamicTemplate c;

        static {
            t2o.a(444596381);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return TextUtils.equals(this.f7268a, ((c) obj).f7268a);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f7268a;
            if (str == null) {
                return -1;
            }
            return str.hashCode();
        }
    }

    static {
        t2o.a(444596377);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687322bc", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public synchronized void b(AsyncTaskC0397a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa60ae44", new Object[]{this, aVar});
            return;
        }
        AsyncTaskC0397a.a(aVar, this);
        this.f7265a.offer(aVar);
        if (this.b == null) {
            c();
        }
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
            return;
        }
        AsyncTaskC0397a poll = this.f7265a.poll();
        this.b = poll;
        if (poll != null) {
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.dinamic.tempate.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class AsyncTaskC0397a extends AsyncTask<Void, bv7, bv7> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final zig f7266a;
        public b b;
        public List<DinamicTemplate> c;
        public String d;
        public a e;
        public Timer f;
        public final long g;
        public volatile boolean h;
        public final ArrayList<DinamicTemplate> i = new ArrayList<>();
        public final ArrayList<DinamicTemplate> j = new ArrayList<>();
        public final ArrayList<DinamicTemplate> k = new ArrayList<>();
        public final ArrayList<DinamicTemplate> l = new ArrayList<>();
        public final ArrayList<DinamicTemplate> m = new ArrayList<>();
        public final TimerTask n = new C0398a();

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.dinamic.tempate.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0398a extends TimerTask {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0398a() {
            }

            public static /* synthetic */ Object ipc$super(C0398a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/SerialTaskManager$DownLoadTask$1");
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (AsyncTaskC0397a.this) {
                    if (!AsyncTaskC0397a.b(AsyncTaskC0397a.this)) {
                        try {
                        } catch (Exception e) {
                            ym7.c("SerialTaskManager", e, "callback onFinished is error");
                        }
                        if (AsyncTaskC0397a.c(AsyncTaskC0397a.this).size() <= 0) {
                            if (AsyncTaskC0397a.d(AsyncTaskC0397a.this).size() > 0) {
                            }
                        }
                        AsyncTaskC0397a aVar = AsyncTaskC0397a.this;
                        AsyncTaskC0397a.f(aVar, new bv7[]{AsyncTaskC0397a.e(aVar)});
                        AsyncTaskC0397a.c(AsyncTaskC0397a.this).clear();
                        AsyncTaskC0397a.d(AsyncTaskC0397a.this).clear();
                    }
                }
            }
        }

        static {
            t2o.a(444596378);
        }

        public AsyncTaskC0397a(zig zigVar, int i) {
            this.g = 3000L;
            this.f7266a = zigVar;
            this.g = i;
        }

        public static /* synthetic */ a a(AsyncTaskC0397a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a604996f", new Object[]{aVar, aVar2});
            }
            aVar.e = aVar2;
            return aVar2;
        }

        public static /* synthetic */ boolean b(AsyncTaskC0397a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5506ab8c", new Object[]{aVar})).booleanValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ ArrayList c(AsyncTaskC0397a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("30f0af01", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ ArrayList d(AsyncTaskC0397a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b0e2a0", new Object[]{aVar});
            }
            return aVar.j;
        }

        public static /* synthetic */ bv7 e(AsyncTaskC0397a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bv7) ipChange.ipc$dispatch("603a8d4d", new Object[]{aVar});
            }
            return aVar.g();
        }

        public static /* synthetic */ void f(AsyncTaskC0397a aVar, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b00d4ad", new Object[]{aVar, objArr});
            } else {
                aVar.publishProgress(objArr);
            }
        }

        public static /* synthetic */ Object ipc$super(AsyncTaskC0397a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/SerialTaskManager$DownLoadTask");
        }

        public final bv7 g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bv7) ipChange.ipc$dispatch("48cfd05a", new Object[]{this});
            }
            bv7 bv7Var = new bv7();
            bv7Var.f16658a = (ArrayList) this.i.clone();
            bv7Var.b = (ArrayList) this.j.clone();
            ArrayList arrayList = (ArrayList) this.k.clone();
            ArrayList arrayList2 = (ArrayList) this.l.clone();
            ArrayList arrayList3 = (ArrayList) this.m.clone();
            return bv7Var;
        }

        public final c h(DinamicTemplate dinamicTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("90810b9", new Object[]{this, dinamicTemplate});
            }
            String j = j(dinamicTemplate);
            if (TextUtils.isEmpty(j) || this.f7266a.f(j) != null) {
                return null;
            }
            c cVar = new c();
            cVar.f7268a = j;
            cVar.b = dinamicTemplate.templateUrl;
            cVar.c = dinamicTemplate;
            return cVar;
        }

        public String j(DinamicTemplate dinamicTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15bb640", new Object[]{this, dinamicTemplate});
            }
            return dinamicTemplate.name + "_" + dinamicTemplate.version;
        }

        /* renamed from: k */
        public void onPostExecute(bv7 bv7Var) {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f8ebcbb", new Object[]{this, bv7Var});
                    return;
                }
                try {
                    ((DTemplateManager.a) this.b).a(bv7Var);
                } catch (Exception e) {
                    ym7.c("SerialTaskManager", e, "callback onFinished is error");
                }
            } finally {
                a.a(this.e);
            }
        }

        /* renamed from: l */
        public void onProgressUpdate(bv7... bv7VarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732b251f", new Object[]{this, bv7VarArr});
                return;
            }
            try {
                ((DTemplateManager.a) this.b).a(bv7VarArr[0]);
            } catch (Exception e) {
                ym7.c("SerialTaskManager", e, "callback onFinished is error");
            }
        }

        /* renamed from: i */
        public bv7 doInBackground(Void... voidArr) {
            byte[] bArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bv7) ipChange.ipc$dispatch("d6d155f", new Object[]{this, voidArr});
            }
            List<DinamicTemplate> list = this.c;
            if (list == null || list.isEmpty()) {
                this.h = true;
                return g();
            }
            HashSet hashSet = new HashSet();
            for (DinamicTemplate dinamicTemplate : this.c) {
                if (dinamicTemplate == null || TextUtils.isEmpty(dinamicTemplate.templateUrl) || TextUtils.isEmpty(dinamicTemplate.name) || TextUtils.isEmpty(dinamicTemplate.version)) {
                    this.j.add(dinamicTemplate);
                    this.l.add(dinamicTemplate);
                } else {
                    c h = h(dinamicTemplate);
                    if (h == null) {
                        this.m.add(dinamicTemplate);
                    } else {
                        hashSet.add(h);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                Timer timer = new Timer();
                this.f = timer;
                TimerTask timerTask = this.n;
                long j = this.g;
                timer.schedule(timerTask, j, j);
                ArrayList arrayList = new ArrayList(hashSet);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) arrayList.get(i);
                    try {
                        bArr = this.f7266a.b(cVar.c, cVar.f7268a, cVar.b, new ojt(this.d));
                    } catch (Throwable th) {
                        ym7.b("SerialTaskManager", "remote getTemplate", th);
                        bArr = null;
                    }
                    synchronized (this) {
                        if (bArr == null) {
                            try {
                                this.l.add(cVar.c);
                                this.j.add(cVar.c);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } else {
                            this.k.add(cVar.c);
                            this.i.add(cVar.c);
                        }
                        if (i == size - 1) {
                            this.h = true;
                            this.f.cancel();
                        }
                    }
                }
            } else {
                this.h = true;
            }
            return g();
        }
    }
}
