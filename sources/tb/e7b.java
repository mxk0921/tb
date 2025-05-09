package tb;

import android.app.Application;
import android.os.Build;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.TBHeapDumper;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.tao.log.statistics.UploadFileType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e7b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f18338a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ff9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.e7b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0911a implements ff9 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0911a(a aVar) {
            }

            @Override // tb.ff9
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                } else {
                    ehh.b("TBHeapDumper", "Upload tlog file successfully.");
                }
            }

            @Override // tb.ff9
            public void onError(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                } else {
                    ehh.b("TBHeapDumper", "Upload tlog file failed.");
                }
            }
        }

        @Override // tb.ff9
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                return;
            }
            ehh.b("TBHeapDumper", "Upload file succ", str);
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            hf9.f("ERROR", "MEM_EXHAUST", new HashMap(), new C0911a(this));
        }

        @Override // tb.ff9
        public void onError(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                return;
            }
            ehh.b("TBHeapDumper", "Upload file failed. errcode , errmsg ", str2, str3);
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void b(x0s x0sVar) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b39316", new Object[]{x0sVar});
            return;
        }
        File file = new File(new rgt(x0sVar.g(), x0sVar.h()).e(), "heapDump");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.length() > 104857600) {
                    file2.delete();
                } else if (file2.getName().endsWith(".zst") || file2.getName().endsWith(".strip") || file2.getName().endsWith(".part")) {
                    arrayList.add(file2.getAbsolutePath());
                } else {
                    file2.delete();
                }
            }
            if (!arrayList.isEmpty()) {
                hf9.o(arrayList, "USER_UPLOAD", "taobao_hprof_upload", new HashMap(), new a(), 7, UploadFileType.HEAP_DUMP);
            }
        }
    }

    public static void a(x0s x0sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1a82d7", new Object[]{x0sVar, str});
        } else if (x0sVar.h().equals(x0sVar.g().getPackageName()) && !f18338a && Looper.getMainLooper() != Looper.myLooper()) {
            synchronized (e7b.class) {
                try {
                    if (!f18338a) {
                        Application g = x0sVar.g();
                        File file = new File(new rgt(g, x0sVar.h()).e(), "heapDump");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, njo.j(g) + "-" + njo.d(g) + "-" + str);
                        if (bzn.d().load(DefaultPlugin.PLUGIN_LIB_NAME).i()) {
                            com.taobao.android.tbuprofen.adapter.a aVar = new com.taobao.android.tbuprofen.adapter.a();
                            aVar.b = njo.j(g);
                            aVar.f9613a = njo.d(g);
                            TBProfConfig.HeapDumpConfig heapDumpConfig = new TBProfConfig.HeapDumpConfig();
                            file2.delete();
                            int nativeForkDumpStripHprof = TBHeapDumper.nativeForkDumpStripHprof(file2.getAbsolutePath(), aVar.b, heapDumpConfig.hprofTimeout, heapDumpConfig.zipLevel, heapDumpConfig.splitSize, 2, y74.a(g, "appkey") + "@" + g.getPackageName() + "@" + aVar.b + "@" + aVar.f9613a + "@" + Boolean.FALSE + "@" + Build.VERSION.RELEASE + "@" + Build.VERSION.SDK_INT + "@" + Build.BRAND + "@" + Build.MODEL + "@" + Build.FINGERPRINT + "@" + Boolean.TRUE + "@" + y74.a(g, "build_id") + "@" + y74.a(g, "package_type") + "@" + y74.a(g, "publish_type") + "@" + UTDevice.getUtdid(g));
                            if (nativeForkDumpStripHprof == 0) {
                                f18338a = true;
                                ehh.b("dump succ", new Object[0]);
                            } else {
                                ehh.b("dump fail", Integer.valueOf(nativeForkDumpStripHprof));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
