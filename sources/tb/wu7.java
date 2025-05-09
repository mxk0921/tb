package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<zzp, m0c> f30927a = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap a(wu7 wu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("1577fe18", new Object[]{wu7Var});
        }
        return wu7Var.f30927a;
    }

    public void e(zzp zzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac451c0", new Object[]{this, zzpVar});
        } else {
            f(zzpVar, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zzp f30928a;
        public final /* synthetic */ m0c b;
        public final /* synthetic */ qkc c;

        public a(zzp zzpVar, m0c m0cVar, qkc qkcVar) {
            this.f30928a = zzpVar;
            this.b = m0cVar;
            this.c = qkcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (wu7.a(wu7.this).get(this.f30928a) == null) {
                fs7.e("Downloader.DownManager", "startDownload 任务在下载前已经被删除了", "url", this.f30928a.e.f25507a);
            }
            zzp zzpVar = this.f30928a;
            if (!zzpVar.f33127a) {
                zzpVar.b = 0;
                zzpVar.c = null;
            }
            File file = new File(this.f30928a.g);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b.a(this.f30928a, this.c);
            if (!this.f30928a.i) {
                wu7.a(wu7.this).remove(this.f30928a);
            }
        }
    }

    public void b(zzp zzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f7c048", new Object[]{this, zzpVar});
            return;
        }
        fs7.e("Downloader.DownManager", "cancelDownload", "url", zzpVar.e.f25507a);
        m0c m0cVar = this.f30927a.get(zzpVar);
        if (m0cVar != null) {
            m0cVar.cancel();
            this.f30927a.remove(zzpVar);
        }
    }

    public void c(zzp zzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde2e686", new Object[]{this, zzpVar});
        } else if (zzpVar != null && zzpVar.i && this.f30927a.get(zzpVar) != null) {
            fs7.e("Downloader.DownManager", "removeBoostTask", "url", zzpVar.e.f25507a);
            this.f30927a.remove(zzpVar);
        }
    }

    public void d(zzp zzpVar, qkc qkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392a7312", new Object[]{this, zzpVar, qkcVar});
            return;
        }
        fs7.e("Downloader.DownManager", "startDownload", "url", zzpVar.e.f25507a);
        m0c a2 = ((jxp) xh4.h).a(zzpVar.f);
        if (!zzpVar.i || this.f30927a.get(zzpVar) == null) {
            this.f30927a.put(zzpVar, a2);
            srt.a(new a(zzpVar, a2, qkcVar), false);
            return;
        }
        fs7.e("Downloader.DownManager", "startDownload 分包任务未完成 return", "url", zzpVar.e.f25507a);
    }

    public void f(zzp zzpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc69914", new Object[]{this, zzpVar, new Boolean(z)});
            return;
        }
        if (!z) {
            try {
                if (zzpVar.i) {
                    fs7.e("Downloader.DownManager", "stopDownload failed 分包任务不取消", "url", zzpVar.e.f25507a);
                    return;
                }
            } catch (Throwable th) {
                fs7.e("Downloader.DownManager", "stopDownload exception 分包任务不取消", "url", zzpVar.e.f25507a, th);
            }
        }
        fs7.e("Downloader.DownManager", "stopDownload", "url", zzpVar.e.f25507a);
        m0c m0cVar = this.f30927a.get(zzpVar);
        if (m0cVar != null) {
            m0cVar.pause();
            this.f30927a.remove(zzpVar);
        }
    }
}
