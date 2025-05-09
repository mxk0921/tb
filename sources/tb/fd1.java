package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.android.split.SplitFileInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import tb.l0c;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fd1 implements l0c<upl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19200a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ev7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Executor f19201a;
        private l0c.b b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f19202a;

            public a(int i) {
                this.f19202a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadProgress(this.f19202a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.fd1$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0925b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f19203a;
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;

            public RunnableC0925b(String str, int i, String str2) {
                this.f19203a = str;
                this.b = i;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadError(this.f19203a, this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f19204a;
            public final /* synthetic */ String b;

            public c(String str, String str2) {
                this.f19204a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadFinish(this.f19204a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f19205a;
            public final /* synthetic */ boolean b;

            public d(String str, boolean z) {
                this.f19205a = str;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadStateChange(this.f19205a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f19206a;

            public e(boolean z) {
                this.f19206a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onFinish(this.f19206a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class f implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f19207a;
            public final /* synthetic */ upl b;
            public final /* synthetic */ tu7.a c;

            public f(int i, upl uplVar, tu7.a aVar) {
                this.f19207a = i;
                this.b = uplVar;
                this.c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).a(this.f19207a, this.b, (l0c.a.AbstractC0976a) this.c);
                }
            }
        }

        static {
            t2o.a(674234371);
        }

        public static /* synthetic */ l0c.b b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l0c.b) ipChange.ipc$dispatch("a5b4b88c", new Object[]{bVar});
            }
            return bVar.b;
        }

        @Override // tb.ev7
        public void a(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("949b07ab", new Object[]{this, str, hashMap});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                bVar.b(str, hashMap);
            }
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new RunnableC0925b(str, i, str2));
                } else {
                    bVar.onDownloadError(str, i, str2);
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new c(str, str2));
                } else {
                    bVar.onDownloadFinish(str, str2);
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new a(i));
                } else {
                    bVar.onDownloadProgress(i);
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new d(str, z));
                } else {
                    bVar.onDownloadStateChange(str, z);
                }
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new e(z));
                } else {
                    bVar.onFinish(z);
                }
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            l0c.b bVar = this.b;
            if (bVar != null) {
                Executor executor = this.f19201a;
                if (executor != null) {
                    executor.execute(new f(i, uplVar, aVar));
                } else {
                    bVar.a(i, uplVar, (l0c.a.AbstractC0976a) aVar);
                }
            }
        }

        private b(Executor executor, l0c.b bVar) {
            this.f19201a = executor;
            this.b = bVar;
        }
    }

    static {
        t2o.a(674234369);
        t2o.a(676331597);
    }

    public fd1(Context context) {
        this.f19200a = context;
        try {
            this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static File h(File file) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3c4b5b4b", new Object[]{file});
        }
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.length() != 0) {
                str = "Unable to create directory: ".concat(absolutePath);
            } else {
                str = new String("Unable to create directory: ");
            }
            throw new IOException(str);
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    @Override // tb.l0c
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503a4a7", new Object[]{this, new Integer(i)});
        } else {
            rv7.e().h(i);
        }
    }

    @Override // tb.l0c
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8929cf8", new Object[]{this, new Integer(i)});
        } else {
            rv7.e().i(i);
        }
    }

    /* renamed from: e */
    public upl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upl) ipChange.ipc$dispatch("461ea23", new Object[]{this});
        }
        upl uplVar = new upl();
        if (bcq.a() != null) {
            try {
                uplVar.g = bcq.a().e().h().getAbsolutePath();
            } catch (Exception unused) {
                uplVar.g = g();
            }
        } else {
            uplVar.g = g();
        }
        return uplVar;
    }

    /* renamed from: f */
    public int b(List<SplitFileInfo> list, upl uplVar, Executor executor, Handler handler, l0c.b<upl> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6370480", new Object[]{this, list, uplVar, executor, handler, bVar})).intValue();
        }
        zu7 zu7Var = new zu7();
        zu7Var.b = uplVar;
        uplVar.f29547a = "assetsdownload";
        uplVar.b = 20;
        zu7Var.f33016a = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SplitFileInfo splitFileInfo = list.get(i);
            if (!TextUtils.isEmpty(splitFileInfo.url)) {
                onf onfVar = new onf(splitFileInfo.url);
                onfVar.c = splitFileInfo.md5;
                onfVar.d = splitFileInfo.splitName;
                onfVar.b = splitFileInfo.fileSize;
                zu7Var.f33016a.add(onfVar);
            }
        }
        return rv7.e().b(zu7Var, new b(executor, bVar));
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        try {
            return h(new File(j(dh8.a()), "downloaded-assets")).getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public final File i(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d0c4b891", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return h(new File(this.f19200a.getFilesDir(), "splitcompat"));
        }
        return h(new File(this.f19200a.getExternalFilesDir(null), "splitcompat"));
    }

    public final File j(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b91e5c55", new Object[]{this, new Boolean(z)});
        }
        return h(new File(i(z), this.b));
    }
}
