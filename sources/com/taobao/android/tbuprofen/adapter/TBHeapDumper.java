package com.taobao.android.tbuprofen.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.TBHeapDumper;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.statistics.UploadFileType;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.br2;
import tb.drx;
import tb.f7l;
import tb.ff9;
import tb.hf9;
import tb.lur;
import tb.mur;
import tb.t2o;
import tb.teh;
import tb.urr;
import tb.v4s;
import tb.y74;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBHeapDumper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_DIAGNOSE_DUMP_HEAP = "com.taobao.android.diagnose.action.DUMP_HEAP";
    public static final String ACTION_DIAGNOSE_DUMP_HEAP_TEST = "com.taobao.android.diagnose.action.DUMP_HEAP_TEST";
    public static final String ACTION_PARAM_PROCESS = "processName";
    public static final String ACTION_PARAM_STRIP_TYPE = "strip";
    public static final String ACTION_PARAM_TYPE = "type";
    public static final int CODE_DUMP_DISABLE = 201;
    public static final int CODE_IN_PROCESS = 202;
    public static final int CODE_SPACE_LIMIT = 203;
    public static final int FLAG_STRIP_ARRAY = 2;
    public static final int FLAG_STRIP_SPLIT = 4;
    public static final int FLAG_STRIP_SYSTEM = 1;
    public static final int TYPE_DUMP_ART_HPROF_FULL = 1;
    public static final int TYPE_DUMP_ART_HPROF_STD = 0;
    public static final int TYPE_DUMP_ART_HPROF_STRIP = 2;
    public static final int TYPE_DUMP_INSTANCE = 4;
    public static final int TYPE_DUMP_REFERENCE = 8;
    public static int k = 0;
    public static boolean l = false;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9607a;
    public final DefaultPlugin b;
    public final lur c;
    public final File d;
    public final TBProfConfig.HeapDumpConfig g;
    public final com.taobao.android.tbuprofen.adapter.a h;
    public String i = null;
    public boolean j = false;
    public HeapDumpReceiver e = null;
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ff9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9609a;
        public final /* synthetic */ Map b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.tbuprofen.adapter.TBHeapDumper$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0494a implements ff9 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0494a(a aVar) {
            }

            @Override // tb.ff9
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                } else {
                    urr.d("TBHeapDumper", "Upload tlog file successfully.", new Object[0]);
                }
            }

            @Override // tb.ff9
            public void onError(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                } else {
                    urr.b("TBHeapDumper", "Upload tlog file failed.", new Object[0]);
                }
            }
        }

        public a(TBHeapDumper tBHeapDumper, boolean z, Map map) {
            this.f9609a = z;
            this.b = map;
        }

        @Override // tb.ff9
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            urr.d("TBHeapDumper", "Upload file %s successfully.", str);
            if (teh.ALL_DONE.equals(str) && this.f9609a) {
                hf9.f("ERROR", "MEM_EXHAUST", this.b, new C0494a(this));
            }
        }

        @Override // tb.ff9
        public void onError(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            } else {
                urr.b("TBHeapDumper", "Upload file failed. errcode=%s, errmsg=%s", str2, str3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            if (th instanceof OutOfMemoryError) {
                if (!TBHeapDumper.f(TBHeapDumper.this).processOnce || TBHeapDumper.h() == 0) {
                    long j = Runtime.getRuntime().totalMemory();
                    if ((j >> 20) < 500) {
                        return null;
                    }
                    String.format("OOM Crash!!! Heap:%d", Long.valueOf(j));
                    TBHeapDumper.j(true);
                } else {
                    urr.b("TBHeapDumper", "Heap dump only once in same process. %d", Integer.valueOf(TBHeapDumper.h()));
                    return null;
                }
            }
            return null;
        }
    }

    static {
        t2o.a(824180737);
    }

    public TBHeapDumper(Context context, DefaultPlugin defaultPlugin, com.taobao.android.tbuprofen.adapter.a aVar) {
        this.f9607a = context;
        this.b = defaultPlugin;
        this.c = aVar.d;
        TBProfConfig.HeapDumpConfig heapDumpConfig = aVar.e;
        if (heapDumpConfig == null) {
            this.g = new TBProfConfig.HeapDumpConfig();
        } else {
            this.g = heapDumpConfig;
        }
        this.h = aVar;
        File externalCacheDir = context.getExternalCacheDir();
        File file = new File(externalCacheDir == null ? context.getCacheDir() : externalCacheDir, "tbp-dump");
        this.d = file;
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static /* synthetic */ AtomicBoolean d(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("f61c17d6", new Object[]{tBHeapDumper});
        }
        return tBHeapDumper.f;
    }

    public static /* synthetic */ boolean e(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357b539", new Object[]{tBHeapDumper})).booleanValue();
        }
        return tBHeapDumper.A();
    }

    public static /* synthetic */ TBProfConfig.HeapDumpConfig f(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBProfConfig.HeapDumpConfig) ipChange.ipc$dispatch("b06d64ad", new Object[]{tBHeapDumper});
        }
        return tBHeapDumper.g;
    }

    public static /* synthetic */ List g(TBHeapDumper tBHeapDumper, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9bc14a06", new Object[]{tBHeapDumper, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        return tBHeapDumper.o(i, i2, z);
    }

    public static /* synthetic */ int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906ef46e", new Object[0])).intValue();
        }
        return k;
    }

    public static /* synthetic */ boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue();
        }
        return l;
    }

    public static /* synthetic */ boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        l = z;
        return z;
    }

    public static native int nativeForkDumpHprof(String str, String str2, int i, int i2, String str3);

    public static native int nativeForkDumpStripHprof(String str, String str2, int i, int i2, long j, int i3, String str3);

    public static long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9068c1bf", new Object[0])).longValue();
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
    }

    public final void F(List<File> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255df35f", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            StringBuilder sb = new StringBuilder();
            for (File file : list) {
                if (this.g.uploadData || !file.getName().contains(".dat")) {
                    arrayList.add(file.getAbsolutePath());
                    sb.append(file.length() >> 20);
                    sb.append(";");
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "3");
            hashMap.put("packageName", this.f9607a.getPackageName());
            hashMap.put("appVersion", this.h.f9613a);
            hashMap.put(v4s.PARAM_IS_DEBUG, Boolean.toString(this.h.c));
            hashMap.put("osVer", Build.VERSION.RELEASE);
            hashMap.put("sdkVer", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("brand", Build.BRAND);
            hashMap.put("model", Build.MODEL);
            hashMap.put("buildId", y74.a(this.f9607a, "build_id"));
            hashMap.put("packageType", y74.a(this.f9607a, "package_type"));
            hashMap.put("publishType", y74.a(this.f9607a, "publish_type"));
            hashMap.put("count", String.valueOf(list.size()));
            String str = this.h.f9613a;
            hashMap.put("content", "HeapDump[" + str + "][" + z + "](" + ((Object) sb) + f7l.BRACKET_END_STR);
            hf9.o(arrayList, "USER_UPLOAD", "taobao_hprof_upload", hashMap, new a(this, z, hashMap), 7, UploadFileType.HEAP_DUMP);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3931c130", new Object[]{this});
        } else {
            mur.b().c(new Runnable() { // from class: tb.her
                @Override // java.lang.Runnable
                public final void run() {
                    TBHeapDumper.this.k();
                }
            }, 10L, TimeUnit.SECONDS);
        }
    }

    public final void m(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d1d619", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        lur lurVar = this.c;
        if (lurVar != null) {
            if (str == null) {
                str = "";
            }
            lurVar.m(i, i2, str);
        }
    }

    public final List<File> n(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("34d1528f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        List<File> list = null;
        if (this.g.processOnce) {
            int i3 = k;
            if ((i3 & i) == i) {
                urr.b("TBHeapDumper", "Heap dump only once in same process. %d", Integer.valueOf(i3));
                return null;
            }
        }
        urr.d("TBHeapDumper", "Start to dump heap info. Type: %d", Integer.valueOf(i));
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 2) {
            list = t(i2);
        } else if (i != 4) {
            if (i != 8) {
                urr.b("TBHeapDumper", "Unknown dump type: %d", Integer.valueOf(i));
                return null;
            } else if (this.b != null) {
                list = r();
            } else {
                urr.b("TBHeapDumper", "TBP is not start!", new Object[0]);
            }
        } else if (this.b != null) {
            list = q();
        } else {
            urr.b("TBHeapDumper", "TBP is not start!", new Object[0]);
        }
        if (list != null && !list.isEmpty()) {
            k |= i;
            urr.d("TBHeapDumper", "End of dump heap info. Type: %d", Integer.valueOf(i));
            if (this.c != null) {
                long j = 0;
                for (File file : list) {
                    j += file.length();
                }
                this.c.n(i, System.currentTimeMillis() - currentTimeMillis, j);
            }
        }
        return list;
    }

    public final List<File> o(int i, int i2, boolean z) {
        List<File> n;
        List<File> n2;
        List<File> n3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("22ad5a68", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (!this.g.isEnable) {
            urr.b("TBHeapDumper", "Heap dump is disable", new Object[0]);
            return null;
        }
        urr.d("TBHeapDumper", "Dump heap info. Type: %d, StripType: %d, Upload: %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList();
        if ((i & 2) == 2 && (n3 = n(2, i2)) != null) {
            arrayList.addAll(n3);
        }
        if ((i & 4) == 4 && (n2 = n(4, i2)) != null) {
            arrayList.addAll(n2);
        }
        if ((i & 8) == 8 && (n = n(8, i2)) != null) {
            arrayList.addAll(n);
        }
        if (z && !arrayList.isEmpty()) {
            F(arrayList, true);
        }
        return arrayList;
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece325f4", new Object[]{this, new Integer(i)});
            return;
        }
        lur lurVar = this.c;
        if (lurVar != null) {
            lurVar.l(i);
        }
    }

    public String w(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5be7b063", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(this.h.b)) {
            str2 = this.h.b.replaceAll("[:*?<>|\"\\\\/]", "_");
        } else {
            str2 = "default";
        }
        String str3 = this.h.f9613a;
        return str3 + "-" + str2 + "-" + str;
    }

    public final List<File> x(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59ddf824", new Object[]{this, file});
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return Collections.emptyList();
        }
        final File file2 = new File(parentFile, file.getName() + ".zst");
        if (file2.exists()) {
            return Collections.singletonList(file2);
        }
        File[] listFiles = parentFile.listFiles(new FilenameFilter() { // from class: tb.jer
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                boolean C;
                C = TBHeapDumper.C(file2, file3, str);
                return C;
            }
        });
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    public final boolean z(boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79c47270", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.g.isDebug) {
            return true;
        }
        long e = TBProfConfig.e(this.f9607a);
        if (z || System.currentTimeMillis() - e > this.g.dumpInterval * 60 * 1000) {
            int i3 = Build.VERSION.SDK_INT;
            TBProfConfig.HeapDumpConfig heapDumpConfig = this.g;
            if (i3 < heapDumpConfig.minSDK || i3 > heapDumpConfig.maxSDK) {
                urr.b("TBHeapDumper", "Unsupported sdk version: %d", Integer.valueOf(i3));
                return false;
            }
            if (!heapDumpConfig.releaseVerList.isEmpty()) {
                for (String str : this.g.releaseVerList) {
                    if (!this.h.f9613a.equals(str)) {
                        if (this.h.f9613a.startsWith(str)) {
                        }
                    }
                }
                urr.b("TBHeapDumper", "Unsupported app version %s", this.h.f9613a);
                return false;
            }
            int b2 = y74.b(this.f9607a);
            if (z) {
                i = this.g.oomSample;
            } else {
                if (b2 == 1) {
                    i2 = this.g.sample;
                } else if (b2 == 2) {
                    i2 = this.g.graySample;
                } else if (b2 == 3) {
                    i2 = this.g.selfGraySample;
                } else if (b2 != 4) {
                    i2 = this.g.otherSample;
                } else {
                    i2 = this.g.integrationSample;
                }
                urr.d("TBHeapDumper", "PackageType:%d. sample: %d", Integer.valueOf(b2), Integer.valueOf(i2));
                i = i2;
            }
            if (y74.d(i)) {
                return true;
            }
            urr.b("TBHeapDumper", "Can't dump heap. sample: %d, oom: %b", Integer.valueOf(i), Boolean.valueOf(z));
            return false;
        }
        urr.b("TBHeapDumper", "Can't dump heap. lastDump at %d", Long.valueOf(e));
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HeapDumpReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TBHeapDumper f9608a;

        static {
            t2o.a(824180742);
        }

        public HeapDumpReceiver(TBHeapDumper tBHeapDumper) {
            this.f9608a = tBHeapDumper;
        }

        public static /* synthetic */ Object ipc$super(HeapDumpReceiver heapDumpReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/TBHeapDumper$HeapDumpReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TBHeapDumper.d(this.f9608a).compareAndSet(false, true)) {
                urr.g("TBHeapDumper", "Current in dump process", new Object[0]);
            } else {
                new Thread(new Runnable() { // from class: tb.ler
                    @Override // java.lang.Runnable
                    public final void run() {
                        TBHeapDumper.HeapDumpReceiver.this.b(intent, context);
                    }
                }, "tbp-dump-thread").start();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[Catch: all -> 0x0034, Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:6:0x001b, B:8:0x0023, B:13:0x003a, B:17:0x0062, B:24:0x0077, B:27:0x0082, B:30:0x008d, B:40:0x00af, B:42:0x00c4, B:43:0x00c8, B:46:0x00de, B:51:0x00ec, B:52:0x0100, B:53:0x0127, B:57:0x013b, B:59:0x0143, B:61:0x0149), top: B:68:0x001b, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0131 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[Catch: all -> 0x0034, Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:6:0x001b, B:8:0x0023, B:13:0x003a, B:17:0x0062, B:24:0x0077, B:27:0x0082, B:30:0x008d, B:40:0x00af, B:42:0x00c4, B:43:0x00c8, B:46:0x00de, B:51:0x00ec, B:52:0x0100, B:53:0x0127, B:57:0x013b, B:59:0x0143, B:61:0x0149), top: B:68:0x001b, outer: #0 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ void b(android.content.Intent r13, android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 366
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.TBHeapDumper.HeapDumpReceiver.b(android.content.Intent, android.content.Context):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements OnFileCreatedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File[] f9611a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ File d;
        public final /* synthetic */ File e;

        public c(File[] fileArr, String str, String str2, File file, File file2) {
            this.f9611a = fileArr;
            this.b = str;
            this.c = str2;
            this.d = file;
            this.e = file2;
        }

        @Override // com.taobao.android.tcrash.OnFileCreatedListener
        public void onFileCreated(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
            } else if (TBHeapDumper.i()) {
                for (File file : this.f9611a) {
                    file.delete();
                }
                TBHeapDumper.nativeForkDumpStripHprof(this.b, "tbp-dump-process", TBHeapDumper.f(TBHeapDumper.this).hprofTimeout, TBHeapDumper.f(TBHeapDumper.this).zipLevel, TBHeapDumper.f(TBHeapDumper.this).splitSize, TBHeapDumper.f(TBHeapDumper.this).stripFlag, this.c);
                this.d.delete();
                this.e.delete();
            }
        }
    }

    public static /* synthetic */ boolean B(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af036835", new Object[]{file})).booleanValue();
        }
        if (file.getName().contains("tbp.hprof")) {
            file.delete();
        }
        return false;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            urr.b("TBHeapDumper", "Init TBHeapDumper", new Object[0]);
            this.g.exhaustDumpEnable = z(false);
            TBProfConfig.r(this.f9607a, this.g.exhaustDumpEnable);
            if (this.e == null) {
                this.e = new HeapDumpReceiver(this);
                IntentFilter intentFilter = new IntentFilter("com.taobao.android.diagnose.action.JAVA_LOW_MEMORY");
                intentFilter.addAction(ACTION_DIAGNOSE_DUMP_HEAP);
                LocalBroadcastManager.getInstance(this.f9607a).registerReceiver(this.e, intentFilter);
                if (new File("/data/local/tmp/.dump_hprof_enable").exists()) {
                    IntentFilter intentFilter2 = new IntentFilter(ACTION_DIAGNOSE_DUMP_HEAP_TEST);
                    if (Build.VERSION.SDK_INT > 33) {
                        this.f9607a.registerReceiver(this.e, intentFilter2, 2);
                    } else {
                        this.f9607a.registerReceiver(this.e, intentFilter2);
                    }
                }
            }
            E();
        } catch (Exception e) {
            urr.c("TBHeapDumper", e, "Init exception", new Object[0]);
        }
    }

    public static /* synthetic */ boolean C(File file, File file2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d486aad4", new Object[]{file, file2, str})).booleanValue();
        }
        return str.endsWith(".part") && str.contains(file.getName());
    }

    public static /* synthetic */ boolean D(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42e7a0c7", new Object[]{file})).booleanValue();
        }
        return file.getName().contains("tbp-oom.hprof");
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c0f40f", new Object[]{this})).booleanValue();
        }
        if (this.j) {
            return true;
        }
        try {
        } catch (UnsatisfiedLinkError unused) {
            urr.b("TBHeapDumper", "Failed to load plugin lib", new Object[0]);
        }
        if (!drx.b()) {
            urr.b("TBHeapDumper", "Zstd is not ready!!.", new Object[0]);
            return false;
        }
        if (this.b == null) {
            String loadLibrary = zrr.c().loadLibrary(DefaultPlugin.PLUGIN_LIB_NAME);
            if (!TextUtils.isEmpty(loadLibrary)) {
                urr.b("TBHeapDumper", "Failed to load plugin lib. %s", loadLibrary);
            } else {
                this.j = true;
            }
        }
        return this.j;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b19c59", new Object[]{this});
        } else if (!z(true)) {
            urr.b("TBHeapDumper", "Dump for OOM is disable!", new Object[0]);
        } else if (v() < this.g.minSpace) {
            urr.b("TBHeapDumper", "Do not have enough space to dump oom hprof!", new Object[0]);
        } else {
            String u = u();
            String w = w("tbp-oom.hprof");
            File file = new File(this.d, w);
            File file2 = this.d;
            File file3 = new File(file2, w + ".strip");
            String absolutePath = file.getAbsolutePath();
            File[] listFiles = this.d.listFiles(new FileFilter() { // from class: tb.ier
                @Override // java.io.FileFilter
                public final boolean accept(File file4) {
                    boolean D;
                    D = TBHeapDumper.D(file4);
                    return D;
                }
            });
            urr.b("TBHeapDumper", "Enable OOM Dump!!", new Object[0]);
            TCrashSDK.instance().addJvmUncaughtCrashListener(new b());
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.JAVA_ONLY, new c(listFiles, absolutePath, u, file, file3));
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64031d2b", new Object[]{this});
        } else if (!this.f.get()) {
            urr.a("TBHeapDumper", "checkFile", new Object[0]);
            File[] listFiles = this.d.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (file.getName().endsWith(".zst") || file.getName().endsWith(".part")) {
                        long j = this.g.expireDay * 24 * 3600000;
                        if (j <= 0 || System.currentTimeMillis() - file.lastModified() >= j) {
                            file.delete();
                            urr.a("TBHeapDumper", "Delete expire file:%s", file.getName());
                        } else {
                            arrayList.add(file);
                            urr.a("TBHeapDumper", "Add upload list:%s", file.getName());
                        }
                    } else {
                        file.delete();
                        urr.a("TBHeapDumper", "Delete file:%s", file.getName());
                    }
                }
                if (this.g.upload && !arrayList.isEmpty()) {
                    F(arrayList, false);
                }
            }
        }
    }

    public final List<File> r() {
        int b2;
        List<File> x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e5a2dd3f", new Object[]{this});
        }
        s(8);
        String w = w("tbp.ref");
        File file = new File(this.d, w);
        File file2 = this.d;
        File file3 = new File(file2, w + ".zst");
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                for (File file4 : x(file3)) {
                    if (file4.exists()) {
                        file4.delete();
                    }
                }
                DefaultPlugin defaultPlugin = this.b;
                String absolutePath = file.getAbsolutePath();
                TBProfConfig.HeapDumpConfig heapDumpConfig = this.g;
                b2 = defaultPlugin.b(absolutePath, "tbp-dump-process", heapDumpConfig.referenceTimeout, heapDumpConfig.zipLevel, heapDumpConfig.splitSize);
                x = x(file3);
            } catch (Exception e) {
                urr.c("TBHeapDumper", e, "dumpReferenceData exception", new Object[0]);
                m(8, 3, e.getClass().getName());
            }
            if (b2 != 0 || x.isEmpty()) {
                m(8, 2, String.valueOf(b2));
                file.delete();
                return null;
            }
            for (File file5 : x) {
                if (!(file5.canRead() || file5.setReadable(true))) {
                    urr.b("TBHeapDumper", "Instance file can not read", new Object[0]);
                    m(4, 1, null);
                    file.delete();
                    return null;
                }
            }
            file.delete();
            return x;
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public final String u() {
        TBHeapDumper tBHeapDumper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e40543a0", new Object[]{this});
        }
        if (!this.g.addHeaderInfo) {
            return null;
        }
        if (this.i == null) {
            String a2 = y74.a(this.f9607a, "appkey");
            String packageName = this.f9607a.getPackageName();
            com.taobao.android.tbuprofen.adapter.a aVar = this.h;
            String str = aVar.b;
            String str2 = aVar.f9613a;
            boolean z = aVar.c;
            String str3 = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            String str4 = Build.BRAND;
            String str5 = Build.MODEL;
            String str6 = Build.FINGERPRINT;
            boolean b2 = br2.b();
            String a3 = y74.a(this.f9607a, "build_id");
            String a4 = y74.a(this.f9607a, "package_type");
            String a5 = y74.a(this.f9607a, "publish_type");
            String utdid = UTDevice.getUtdid(this.f9607a);
            tBHeapDumper = this;
            tBHeapDumper.i = a2 + "@" + packageName + "@" + str + "@" + str2 + "@" + z + "@" + str3 + "@" + i + "@" + str4 + "@" + str5 + "@" + str6 + "@" + b2 + "@" + a3 + "@" + a4 + "@" + a5 + "@" + utdid;
        } else {
            tBHeapDumper = this;
        }
        return tBHeapDumper.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final List<File> q() {
        String str;
        Exception e;
        int a2;
        List<File> x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("856460d", new Object[]{this});
        }
        s(4);
        String w = w("tbp.ins");
        File file = new File(this.d, w);
        File file2 = new File(this.d, w + ".zst");
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                for (File file3 : x(file2)) {
                    if (file3.exists()) {
                        file3.delete();
                    }
                }
                DefaultPlugin defaultPlugin = this.b;
                String absolutePath = file.getAbsolutePath();
                TBProfConfig.HeapDumpConfig heapDumpConfig = this.g;
                long j = heapDumpConfig.instanceMinCount;
                long j2 = heapDumpConfig.instanceMinSize;
                int i = heapDumpConfig.instanceTopCount;
                int i2 = heapDumpConfig.instanceTimeout;
                str = heapDumpConfig.zipLevel;
                str = "TBHeapDumper";
                try {
                    a2 = defaultPlugin.a(absolutePath, j, j2, i, "tbp-dump-process", i2, str, heapDumpConfig.splitSize);
                    x = x(file2);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                str = "TBHeapDumper";
            }
            try {
            } catch (Exception e4) {
                e = e4;
                urr.c(str, e, "dumpInstanceData exception", new Object[0]);
                m(4, 3, e.getClass().getName());
                file.delete();
                return null;
            }
            if (a2 != 0 || x.isEmpty()) {
                m(4, 2, String.valueOf(a2));
                for (File file4 : x) {
                    file4.delete();
                }
                file.delete();
                return null;
            }
            str = str;
            for (File file5 : x) {
                if (file5.canRead() || file5.setReadable(true)) {
                    str = str;
                } else {
                    urr.b(str, "Instance file can not read", new Object[0]);
                    m(4, 1, null);
                    file.delete();
                    return null;
                }
            }
            file.delete();
            return x;
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public final List<File> t(int i) {
        File file;
        File file2;
        Throwable th;
        Exception e;
        File file3;
        File file4;
        String absolutePath;
        TBProfConfig.HeapDumpConfig heapDumpConfig;
        int nativeForkDumpStripHprof;
        List<File> x;
        List<File> x2;
        File file5;
        File file6;
        File file7 = null;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9c36093", new Object[]{this, new Integer(i)});
        }
        s(2);
        String w = w("tbp.hprof");
        this.d.listFiles(new FileFilter() { // from class: tb.ker
            @Override // java.io.FileFilter
            public final boolean accept(File file8) {
                boolean B;
                B = TBHeapDumper.B(file8);
                return B;
            }
        });
        if (v() < this.g.minSpace) {
            urr.b("TBHeapDumper", "Do not have enough space to dump hprof!", new Object[0]);
            m(2, 2, String.valueOf(203));
            return null;
        }
        File file8 = new File(this.d, w);
        File file9 = new File(this.d, w + ".strip");
        File file10 = new File(this.d, w + ".dat");
        try {
            try {
                urr.b("TBHeapDumper", "Dump tb hprof data with type %d, flag %d", 2, Integer.valueOf(i));
                absolutePath = file8.getAbsolutePath();
                heapDumpConfig = this.g;
                file7 = file9;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            file3 = file8;
            file4 = file10;
            file7 = file9;
        } catch (Throwable th3) {
            th = th3;
            file = file8;
            file2 = file10;
            file7 = file9;
        }
        try {
            nativeForkDumpStripHprof = nativeForkDumpStripHprof(absolutePath, "tbp-dump-process", heapDumpConfig.hprofTimeout, heapDumpConfig.zipLevel, heapDumpConfig.splitSize, i, u());
            x = x(file7);
            x2 = x(file10);
            try {
            } catch (Exception e3) {
                e = e3;
                urr.c("TBHeapDumper", e, "dumpHprofData exception", new Object[0]);
                m(2, 3, e.getClass().getName());
                file7.delete();
                file3.delete();
                file4.delete();
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            file4 = file10;
            file3 = file8;
            urr.c("TBHeapDumper", e, "dumpHprofData exception", new Object[0]);
            m(2, 3, e.getClass().getName());
            file7.delete();
            file3.delete();
            file4.delete();
            return null;
        } catch (Throwable th4) {
            th = th4;
            file2 = file10;
            file = file8;
            file7.delete();
            file.delete();
            file2.delete();
            throw th;
        }
        if (nativeForkDumpStripHprof == 0) {
            long j = 0;
            for (File file11 : x) {
                j += file11.length();
            }
            long j2 = 0;
            for (File file12 : x2) {
                j2 += file12.length();
            }
            lur lurVar = this.c;
            if (lurVar != null) {
                file6 = file10;
                file5 = file8;
                lurVar.o(2, file8.length(), file7.length(), j, file10.length(), j2);
            } else {
                file6 = file10;
                file5 = file8;
            }
            file7.delete();
            file5.delete();
            file6.delete();
            return x;
        }
        file4 = file10;
        file3 = file8;
        m(2, 2, String.valueOf(nativeForkDumpStripHprof));
        for (File file13 : x) {
            file13.delete();
        }
        for (File file14 : x2) {
            file14.delete();
        }
        file7.delete();
        file3.delete();
        file4.delete();
        return null;
    }

    public void p(String str, int i, int i2, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eda3733", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && str.equals(this.h.b)) {
            File file = new File(this.d.getParentFile(), "tbp-dump-local");
            if (!file.exists()) {
                file.mkdirs();
            }
            String w = w(System.currentTimeMillis() + "-tbp.hprof");
            File file2 = new File(file, w);
            urr.b("TBHeapDumper", "Dump heap info for type %d, stripFlag %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i != 0) {
                if (i == 1) {
                    String path = file2.getPath();
                    TBProfConfig.HeapDumpConfig heapDumpConfig = this.g;
                    nativeForkDumpHprof(path, "tbp-dump-process", heapDumpConfig.hprofTimeout, heapDumpConfig.zipLevel, u());
                } else if (i != 2) {
                    urr.b("TBHeapDumper", "Unsupported dump type %d", Integer.valueOf(i));
                } else {
                    String absolutePath = file2.getAbsolutePath();
                    TBProfConfig.HeapDumpConfig heapDumpConfig2 = this.g;
                    nativeForkDumpStripHprof(absolutePath, "tbp-dump-process", heapDumpConfig2.hprofTimeout, heapDumpConfig2.zipLevel, heapDumpConfig2.splitSize, i2, u());
                }
                if (!(z || (listFiles = file.listFiles()) == null)) {
                    for (File file3 : listFiles) {
                        if (file3.getName().contains(w) && !file3.getName().endsWith(".zst")) {
                            file3.delete();
                        }
                    }
                    return;
                }
                return;
            }
            nativeForkDumpHprof(file2.getPath(), "tbp-dump-process", this.g.hprofTimeout, 0, null);
        }
    }
}
