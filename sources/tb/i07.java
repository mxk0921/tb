package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.android.split.PatchSplitFileInfo;
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
public class i07 implements l0c<upl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21003a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ev7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Executor f21004a;
        private l0c.b b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21005a;

            public a(int i) {
                this.f21005a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadProgress(this.f21005a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.i07$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0940b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21006a;
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;

            public RunnableC0940b(String str, int i, String str2) {
                this.f21006a = str;
                this.b = i;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadError(this.f21006a, this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21007a;
            public final /* synthetic */ String b;

            public c(String str, String str2) {
                this.f21007a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadFinish(this.f21007a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21008a;
            public final /* synthetic */ boolean b;

            public d(String str, boolean z) {
                this.f21008a = str;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onDownloadStateChange(this.f21008a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f21009a;

            public e(boolean z) {
                this.f21009a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).onFinish(this.f21009a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class f implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21010a;
            public final /* synthetic */ upl b;
            public final /* synthetic */ tu7.a c;

            public f(int i, upl uplVar, tu7.a aVar) {
                this.f21010a = i;
                this.b = uplVar;
                this.c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.b(b.this).a(this.f21010a, this.b, (l0c.a.AbstractC0976a) this.c);
                }
            }
        }

        public static /* synthetic */ l0c.b b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l0c.b) ipChange.ipc$dispatch("a195a1e2", new Object[]{bVar});
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
                Executor executor = this.f21004a;
                if (executor != null) {
                    executor.execute(new RunnableC0940b(str, i, str2));
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
                Executor executor = this.f21004a;
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
                Executor executor = this.f21004a;
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
                Executor executor = this.f21004a;
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
                Executor executor = this.f21004a;
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
                Executor executor = this.f21004a;
                if (executor != null) {
                    executor.execute(new f(i, uplVar, aVar));
                } else {
                    bVar.a(i, uplVar, (l0c.a.AbstractC0976a) aVar);
                }
            }
        }

        private b(Executor executor, l0c.b bVar) {
            this.f21004a = executor;
            this.b = bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements ev7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private c() {
        }

        @Override // tb.ev7
        public void a(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("949b07ab", new Object[]{this, str, hashMap});
            }
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    public i07(Context context) {
        this.f21003a = context;
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
                uplVar.g = bcq.a().e().i().getAbsolutePath();
            } catch (Exception unused) {
                uplVar.g = g();
            }
        } else {
            uplVar.g = g();
        }
        return uplVar;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        try {
            return h(new File(j(dh8.a()), "downloaded-splits")).getAbsolutePath();
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
            return h(new File(this.f21003a.getFilesDir(), "splitcompat"));
        }
        return h(new File(this.f21003a.getExternalFilesDir(null), "splitcompat"));
    }

    public final File j(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b91e5c55", new Object[]{this, new Boolean(z)});
        }
        return h(new File(i(z), this.b));
    }

    /* renamed from: f */
    public int b(List<SplitFileInfo> list, upl uplVar, Executor executor, Handler handler, l0c.b<upl> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6370480", new Object[]{this, list, uplVar, executor, handler, bVar})).intValue();
        }
        zu7 zu7Var = new zu7();
        zu7Var.b = uplVar;
        uplVar.f29547a = "splitdownload";
        uplVar.b = 20;
        zu7Var.f33016a = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SplitFileInfo splitFileInfo = list.get(i);
            if (!TextUtils.isEmpty(splitFileInfo.url)) {
                onf onfVar = new onf(splitFileInfo.url);
                onfVar.c = splitFileInfo.md5;
                if (splitFileInfo instanceof PatchSplitFileInfo) {
                    onfVar.d = splitFileInfo.splitName.concat(".patch");
                } else {
                    onfVar.d = splitFileInfo.splitName.concat(jcq.APK_EXTENSION);
                }
                onfVar.b = splitFileInfo.fileSize;
                zu7Var.f33016a.add(onfVar);
            }
        }
        return rv7.e().b(zu7Var, new b(executor, bVar));
    }
}
