package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ymh implements nq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f32191a;
    public final feh b = new feh(ymh.class.getSimpleName(), "Global");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ymh ymhVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "file_cache_touch_thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Callable<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final File f32192a;

        static {
            t2o.a(774897914);
        }

        public b(File file) {
            this.f32192a = file;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
            }
            ymh.c(ymh.this, this.f32192a);
            return null;
        }
    }

    static {
        t2o.a(774897912);
        t2o.a(774897907);
    }

    public static /* synthetic */ void c(ymh ymhVar, File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e2d101", new Object[]{ymhVar, file});
        } else {
            ymhVar.f(file);
        }
    }

    public abstract boolean a(File file, long j, int i, int i2);

    public abstract boolean b(File file, long j, int i);

    public final long d(List<File> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d6f3982", new Object[]{this, list})).longValue();
        }
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }

    public void e(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7233c33d", new Object[]{this, file});
            return;
        }
        a aVar = new a(this);
        synchronized (this) {
            try {
                if (this.f32191a == null) {
                    this.f32191a = dq.d(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32191a.submit(new b(file));
    }

    public final void f(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df35650", new Object[]{this, file});
            return;
        }
        kh9.e(file);
        g(kh9.a(file.getParentFile()));
    }

    public final int h(List<File> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f13e803", new Object[]{this, list})).intValue();
        }
        for (File file : list) {
            if (file.getName().startsWith("0_")) {
                i++;
            }
        }
        return i;
    }

    public final void g(List<File> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d5329a", new Object[]{this, list});
            return;
        }
        long d = d(list);
        int size = list.size();
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableDelFileWhichNoData", "true"))) {
            i = h(list);
        }
        for (File file : list) {
            boolean a2 = a(file, d, size, i);
            if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableUpdegradeCache", "true"))) {
                a2 = b(file, d, size);
            }
            if (!a2) {
                AVSDKLog.e(this.b, "file deleted:" + file + ",size:" + file.length());
                long length = file.length();
                if (file.delete()) {
                    size--;
                    d -= length;
                }
            }
        }
        for (File file2 : list) {
            if (!b(file2, d, size)) {
                AVSDKLog.e(this.b, file2 + "file deleted anyway, for size is full.After deleted, size=" + list.size());
                long length2 = file2.length();
                if (file2.delete()) {
                    size--;
                    d -= length2;
                }
            } else {
                return;
            }
        }
    }
}
