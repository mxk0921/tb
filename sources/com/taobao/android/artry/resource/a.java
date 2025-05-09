package com.taobao.android.artry.resource;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import tb.bbi;
import tb.dxv;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.ze1;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e f6382a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.artry.resource.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0333a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0333a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                try {
                    e.b(a.a(a.this)).b();
                } catch (Throwable th) {
                    Log.e("DownloadTask", "failed to invoke onResourceLoadAllFinish method..." + th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                try {
                    e.b(a.a(a.this)).onError("download execute error.");
                } catch (Throwable th) {
                    Log.e("DownloadTask", "failed to invoke onError method..." + th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ onf f6385a;

        public c(onf onfVar) {
            this.f6385a = onfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                e.b(a.a(a.this)).c(this.f6385a.f25507a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ onf f6386a;
        public final /* synthetic */ String b;

        public d(onf onfVar, String str) {
            this.f6386a = onfVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                try {
                    e.b(a.a(a.this)).a(this.f6386a.f25507a, this.b);
                } catch (Throwable th) {
                    Log.e("DownloadTask", "failed to invoke onResourceLoad method..." + th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6387a;
        public final String b;
        public final List<onf> c = new LinkedList();
        public f d;

        static {
            t2o.a(396361792);
        }

        public e(String str, String str2) {
            this.f6387a = str;
            this.b = str2;
        }

        public static /* synthetic */ String a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2122c927", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ f b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("7ad331f3", new Object[]{eVar});
            }
            return eVar.d;
        }

        public static /* synthetic */ String c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bafcfac4", new Object[]{eVar});
            }
            return eVar.f6387a;
        }

        public static /* synthetic */ List d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("20deb4a9", new Object[]{eVar});
            }
            return eVar.c;
        }

        public e e(long j, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("723ab771", new Object[]{this, new Long(j), str, str2, str3});
            }
            onf onfVar = new onf();
            onfVar.b = j;
            onfVar.f25507a = str;
            onfVar.c = str2;
            onfVar.d = str3;
            ((LinkedList) this.c).add(onfVar);
            return this;
        }

        public e f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a7011a69", new Object[]{this, str, str2});
            }
            return e(0L, str, null, str2);
        }

        public a g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dbbd89cd", new Object[]{this});
            }
            return new a(this, null);
        }

        public e h(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("759c6843", new Object[]{this, fVar});
            }
            this.d = fVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
        void a(String str, String str2);

        void b();

        void c(String str);

        void onError(String str);

        void onProgress(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6388a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.artry.resource.a$g$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0334a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6389a;

            public RunnableC0334a(int i) {
                this.f6389a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                    try {
                        int b = g.b(g.this);
                        int i = this.f6389a;
                        if (b < i) {
                            g.c(g.this, i);
                            e.b(a.a(a.this)).onProgress(g.b(g.this));
                        }
                    } catch (Throwable th) {
                        Log.e("DownloadTask", "failed to invoke onResourceLoadFail method..." + th);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6390a;

            public b(String str) {
                this.f6390a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                    try {
                        e.b(a.a(a.this)).c(this.f6390a);
                    } catch (Throwable th) {
                        Log.e("DownloadTask", "failed to invoke onResourceLoadFail method..." + th);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6391a;
            public final /* synthetic */ String b;

            public c(String str, String str2) {
                this.f6391a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                    try {
                        e.b(a.a(a.this)).a(this.f6391a, this.b);
                    } catch (Throwable th) {
                        Log.e("DownloadTask", "failed to invoke onResourceLoaded method..." + th);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                    try {
                        e.b(a.a(a.this)).b();
                    } catch (Throwable th) {
                        Log.e("DownloadTask", "failed to invoke onResourceLoadAllFinish method..." + th);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6393a;

            public e(int i) {
                this.f6393a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null && e.b(a.a(a.this)) != null) {
                    try {
                        f b = e.b(a.a(a.this));
                        b.onError("NetworkLimit,CODE:" + this.f6393a);
                    } catch (Throwable th) {
                        Log.e("DownloadTask", "failed to invoke onError method..." + th);
                    }
                }
            }
        }

        static {
            t2o.a(396361794);
        }

        public g() {
        }

        public static /* synthetic */ int b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46e1f17c", new Object[]{gVar})).intValue();
            }
            return gVar.f6388a;
        }

        public static /* synthetic */ int c(g gVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("198b0d4b", new Object[]{gVar, new Integer(i)})).intValue();
            }
            gVar.f6388a = i;
            return i;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            Log.e("DownloadTask", "failed to load resource[%s]; the reason is %d[%s]" + str + " errorCode " + i + " msg " + str2);
            ze1.b().c(new b(str));
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("succes to load resource[%s]; the local file is [%s]");
            sb.append(str);
            sb.append("filepath is ");
            sb.append(str2);
            ze1.b().c(new c(str, str2));
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            StringBuilder sb = new StringBuilder("the progress of download task is [%d], the thread is %s");
            sb.append(i);
            sb.append(" ttid ");
            sb.append(Thread.currentThread().getId());
            ze1.b().c(new RunnableC0334a(i));
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            Log.e("DownloadTask", "onDownloadStateChange:%s,%s" + str + " b " + z);
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            new StringBuilder("all download tasks are finished[s]").append(z);
            ze1.b().c(new d());
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            Log.e("DownloadTask", "onNetworkLimit...");
            ze1.b().c(new e(i));
        }

        public /* synthetic */ g(a aVar, RunnableC0333a aVar2) {
            this();
        }
    }

    static {
        t2o.a(396361787);
    }

    public /* synthetic */ a(e eVar, RunnableC0333a aVar) {
        this(eVar);
    }

    public static /* synthetic */ e a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c8b0d187", new Object[]{aVar});
        }
        return aVar.f6382a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c90f", new Object[]{this});
            return;
        }
        try {
            File file = new File(e.a(this.f6382a));
            if (file.isFile()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            List<onf> c2 = c(file);
            if (!(c2 == null || c2.size() == 0)) {
                zu7 zu7Var = new zu7();
                zu7Var.f33016a = c2;
                upl uplVar = new upl();
                zu7Var.b = uplVar;
                uplVar.f29547a = e.c(this.f6382a);
                zu7Var.b.g = file.getAbsolutePath();
                rv7.e().b(zu7Var, new g(this, null));
                return;
            }
            ze1.b().c(new RunnableC0333a());
        } catch (Throwable th) {
            ze1.b().c(new b());
            Log.e("DownloadTask", "downloadTask {biz:%s}error" + e.c(this.f6382a) + " e val is " + th);
        }
    }

    public final List<onf> c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("264a8641", new Object[]{this, file});
        }
        List<onf> d2 = e.d(this.f6382a);
        if (dxv.h(d2)) {
            return null;
        }
        if (file == null || !file.exists() || !file.isDirectory()) {
            throw new IllegalArgumentException();
        }
        LinkedList linkedList = new LinkedList();
        for (onf onfVar : d2) {
            if (TextUtils.isEmpty(onfVar.d) || !dxv.j(onfVar.f25507a)) {
                ze1.b().c(new c(onfVar));
            }
            File file2 = new File(file, onfVar.d);
            String absolutePath = file2.getAbsolutePath();
            if (file2.exists()) {
                if (bbi.d(onfVar.c, absolutePath)) {
                    ze1.b().c(new d(onfVar, absolutePath));
                } else {
                    file2.delete();
                }
            }
            linkedList.add(onfVar);
        }
        return linkedList;
    }

    public a(e eVar) {
        this.f6382a = eVar;
    }
}
