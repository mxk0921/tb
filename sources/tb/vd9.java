package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.downloader.TbDownloader;
import com.taobao.downloader.sync.SyncItem;
import java.util.List;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "fileSync";

    /* renamed from: a  reason: collision with root package name */
    public boolean f29938a;
    public boolean c;
    public int b = 0;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vd9.a(vd9.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downloader/sync/FileSyncApp$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vd9.b(vd9.this);
            }
        }
    }

    public vd9() {
        ual.a().e(new a());
    }

    public static /* synthetic */ boolean a(vd9 vd9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9dc148d", new Object[]{vd9Var, new Boolean(z)})).booleanValue();
        }
        vd9Var.d = z;
        return z;
    }

    public static /* synthetic */ void b(vd9 vd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673fb4ea", new Object[]{vd9Var});
        } else {
            vd9Var.e();
        }
    }

    public static /* synthetic */ int c(vd9 vd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1bfef26", new Object[]{vd9Var})).intValue();
        }
        int i = vd9Var.b;
        vd9Var.b = 1 + i;
        return i;
    }

    public static /* synthetic */ boolean d(vd9 vd9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673bfa2a", new Object[]{vd9Var, new Boolean(z)})).booleanValue();
        }
        vd9Var.c = z;
        return z;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0443231", new Object[]{this});
            return;
        }
        fs7.c(TAG, "stop download", new Object[0]);
        this.f29938a = false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SyncItem f29941a;

        public c(SyncItem syncItem) {
            this.f29941a = syncItem;
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
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            fs7.g(vd9.TAG, "download, finish sync", "url", this.f29941a.url);
            this.f29941a.finish = z;
            vd9.c(vd9.this);
            vd9.d(vd9.this, false);
            vd9.b(vd9.this);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72815e91", new Object[]{this});
            return;
        }
        fs7.c(TAG, "start Download", new Object[0]);
        this.f29938a = true;
        Coordinator.postTask(new b("download_sdk"));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c90f", new Object[]{this});
        } else if (!this.c && !ual.a().c()) {
            if (this.d) {
                this.b = 0;
                this.d = false;
            }
            try {
                List<SyncItem> b2 = ual.a().b();
                if (b2 != null && this.b < b2.size() && this.f29938a) {
                    SyncItem syncItem = b2.get(this.b);
                    if (TextUtils.isEmpty(syncItem.version) || i3w.c(syncItem.version)) {
                        this.c = true;
                        fs7.g(TAG, "download start sync", "url", syncItem.url);
                        zu7 convert = syncItem.convert();
                        if (!TextUtils.isEmpty(TbDownloader.getInstance().f(convert.b.g, convert.f33016a.get(0)))) {
                            this.b++;
                            this.c = false;
                            e();
                            return;
                        }
                        TbDownloader.getInstance().b(convert, new c(syncItem));
                        return;
                    }
                    fs7.h(TAG, "download item vesion is not need to download", "url", syncItem.url, "version", syncItem.version);
                    syncItem.finish = true;
                    this.b++;
                    e();
                }
            } catch (Throwable th) {
                fs7.d(TAG, "on sync", th, new Object[0]);
            }
        }
    }
}
