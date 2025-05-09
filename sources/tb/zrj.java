package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.json.ModelConfig;
import com.taobao.android.alinnkit.net.AliNNKitBaseNet;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.downloader.manager.PriorityTaskManager;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zrj<T extends AliNNKitBaseNet> extends AsyncTask<String, Integer, c<T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f32973a = new Object();
    public final Object b = new Object();
    public volatile boolean c;
    public volatile boolean d;
    public volatile String e;
    public Map<String, List<String>> f;
    public final Context g;
    public final oq0<T> h;
    public final asj<T> i;
    public final ModelConfig j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            synchronized (zrj.a(zrj.this)) {
                zrj.b(zrj.this, true);
                zrj.a(zrj.this).notifyAll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f32975a;

        public b(c cVar) {
            this.f32975a = cVar;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            bzf.g("AliNNJava", " download error: " + str2, new Object[0]);
            zrj.e(zrj.this, String.valueOf(i));
            c cVar = this.f32975a;
            cVar.b = new Exception(str2 + " code=" + zrj.d(zrj.this));
            synchronized (zrj.f(zrj.this)) {
                zrj.g(zrj.this, true);
                zrj.f(zrj.this).notifyAll();
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            bzf.e("AliNNJava", str + " is finished", new Object[0]);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            zrj.c(zrj.this, new Integer[]{Integer.valueOf(((i * 50) / 100) + 10)});
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
                return;
            }
            synchronized (zrj.f(zrj.this)) {
                bzf.e("AliNNJava", "download finish, success: " + String.valueOf(z), new Object[0]);
                zrj.g(zrj.this, true);
                zrj.f(zrj.this).notifyAll();
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            uplVar.c = 7;
            ((PriorityTaskManager.c.a) aVar).a(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c<R extends AliNNKitBaseNet> {

        /* renamed from: a  reason: collision with root package name */
        public R f32976a;
        public Throwable b;

        static {
            t2o.a(367001637);
        }
    }

    static {
        t2o.a(367001634);
    }

    public zrj(Context context, asj<T> asjVar, oq0<T> oq0Var, ModelConfig modelConfig) {
        this.g = context;
        this.i = asjVar;
        this.h = oq0Var;
        this.j = modelConfig;
        n();
    }

    public static /* synthetic */ Object a(zrj zrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d0a3ac1", new Object[]{zrjVar});
        }
        return zrjVar.f32973a;
    }

    public static /* synthetic */ boolean b(zrj zrjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4f87ea", new Object[]{zrjVar, new Boolean(z)})).booleanValue();
        }
        zrjVar.c = z;
        return z;
    }

    public static /* synthetic */ void c(zrj zrjVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a2dc82", new Object[]{zrjVar, objArr});
        } else {
            zrjVar.publishProgress(objArr);
        }
    }

    public static /* synthetic */ String d(zrj zrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4f0cd32", new Object[]{zrjVar});
        }
        return zrjVar.e;
    }

    public static /* synthetic */ String e(zrj zrjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b547a2a", new Object[]{zrjVar, str});
        }
        zrjVar.e = str;
        return str;
    }

    public static /* synthetic */ Object f(zrj zrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9939d6c5", new Object[]{zrjVar});
        }
        return zrjVar.b;
    }

    public static /* synthetic */ boolean g(zrj zrjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49fabee", new Object[]{zrjVar, new Boolean(z)})).booleanValue();
        }
        zrjVar.d = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(zrj zrjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/help/NetPrepareTask");
    }

    public static ModelConfig m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelConfig) ipChange.ipc$dispatch("da6d553f", new Object[]{str});
        }
        ModelConfig modelConfig = new ModelConfig();
        if (FaceDetectionNet.BIZ_NAME.equals(str)) {
            modelConfig.m = "347";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "2e0604b637433ad4ee0ff1f90435e443";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/347/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap = new HashMap();
            hashMap.put("fd_00002_12", "8a4f2cb230a822c3911686f65c8a30bd");
            hashMap.put("fd_00002_6", "dc6cb91661a35eb507c379c314d4b24f");
            hashMap.put("fd_00002_2", "9412d0e0d3222258687a5b61ff8a9636");
            hashMap.put("fd_00002_3", "39ac15930206880e410b3c87a52640af");
            hashMap.put("fd_00002_4", "01abf23eba082606b2b4f385ed8db13c");
            hashMap.put("fd_00002_5", "86139486e21ec0e35c8f24266b2bb582");
            hashMap.put("fd_00002_1", "2a99bf5dc7fc14275377587bafa03cc1");
            modelConfig.models = hashMap;
        } else if ("HandGesture".equals(str)) {
            modelConfig.m = "243";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "86b72ab033e411d59e75607429c4c74b";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/243/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("resource", "51b4b5faad052455a2206e596ab6d8d3");
            hashMap2.put("hr_00018_3", "5e2dada28eafec8c11b157ee6c26bba5");
            hashMap2.put("hr_00018_1", "8c07eeb4b4526884db7d02cec1e4db67");
            hashMap2.put("hr_00018_2", "091f0cfb27b8191049212090592adf31");
            modelConfig.models = hashMap2;
        } else if ("doodleRecognition".equals(str)) {
            modelConfig.m = "189";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e959f9b12f6de640183f5aa7b6509157";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/189/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap3 = new HashMap();
            hashMap3.put("resource", "660e142ac183023c6010c9f1cd31e27e");
            hashMap3.put("dn_00023_1", "dd7aea0838c72ed1c6935aac83362e34");
            modelConfig.models = hashMap3;
        } else if ("PostureDetection".equals(str)) {
            modelConfig.m = "272";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "dcbe72de65868ff94e51aa35e09ff17b";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/272/0_3.zip";
            modelConfig.unpacked = "0";
        } else if ("HairDetection".equals(str)) {
            modelConfig.m = "240";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e1da93190044407c7e137a5c454f6249";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/240/0_3.zip";
            modelConfig.unpacked = "0";
        } else if ("DetectGraph".equals(str)) {
            modelConfig.m = "367";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "88ce06d263dd164078e334a2c609d236";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/367/0_3.zip";
            modelConfig.unpacked = "0";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap4 = new HashMap();
            hashMap4.put("dg_00041_1", "88ce06d263dd164078e334a2c609d236");
            modelConfig.models = hashMap4;
        } else if ("GenericObjectTrack".equals(str)) {
            modelConfig.m = "385";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "400c2ad38a6236094d27909b37612c94";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/385/0_3.zip";
            modelConfig.unpacked = "0";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap5 = new HashMap();
            hashMap5.put("ot_00043_1", "400c2ad38a6236094d27909b37612c94");
            modelConfig.models = hashMap5;
        }
        return modelConfig;
    }

    /* renamed from: h */
    public c<T> doInBackground(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("25992281", new Object[]{this, strArr});
        }
        c<T> cVar = new c<>();
        String str = strArr[0];
        if (strArr.length > 1) {
            List list = (List) ((HashMap) this.f).get(str);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.f).put(str, list);
            }
            list.clear();
            for (int i = 1; i < strArr.length; i++) {
                list.add(strArr[i]);
            }
            bzf.a("AliNNJava", "biz explicitly use this models: %s", String.valueOf(Arrays.asList(list)));
        }
        File filesDir = this.g.getFilesDir();
        File file = new File(filesDir, "alinn_files_cache/" + str);
        if (file.exists() || file.mkdirs()) {
            l(str, file, cVar);
            bzf.a("AliNNJava", "init net model result=%s, error=%s", cVar.f32976a, cVar.b);
            return cVar;
        }
        cVar.b = new Exception("AlinnNet fail to create model dir");
        return cVar;
    }

    public final boolean i(List<onf> list, String str, boolean z, c cVar) {
        int i = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ceae6a", new Object[]{this, list, str, new Boolean(z), cVar})).booleanValue();
        }
        if (!z) {
            i = 7;
        }
        zu7 zu7Var = new zu7();
        upl uplVar = zu7Var.b;
        uplVar.k = true;
        uplVar.g = str;
        uplVar.f29547a = "AliNNJava";
        uplVar.c = i;
        uplVar.f = true;
        for (onf onfVar : list) {
            zu7Var.f33016a.add(onfVar);
        }
        this.d = false;
        this.e = "ALINN_UNCOMMIT_VALUE";
        rv7.e().b(zu7Var, new b(cVar));
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this.b) {
                if (this.d || System.currentTimeMillis() - currentTimeMillis > 60000) {
                    break;
                }
                try {
                    this.b.wait(60000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        publishProgress(60);
        Boolean bool = Boolean.TRUE;
        Iterator<onf> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!new File(str, it.next().d).exists()) {
                    bool = Boolean.FALSE;
                    break;
                }
            } else {
                break;
            }
        }
        return bool.booleanValue();
    }

    public final boolean j(List<File> list, c<T> cVar) {
        Throwable th;
        IOException e;
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f19af59", new Object[]{this, list, cVar})).booleanValue();
        }
        for (File file : list) {
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile(file.getPath());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (!Pattern.matches(".*__MACOSX.*", name) && !name.contains("..")) {
                        String path = new File(file.getParent(), name).getPath();
                        qwv.d(zipFile, zipEntry, path);
                        bzf.a("AliNNJava", "exact file " + path, new Object[0]);
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException unused) {
                }
            } catch (IOException e3) {
                e = e3;
                zipFile2 = zipFile;
                e.printStackTrace();
                cVar.b = e;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException unused2) {
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
        publishProgress(80);
        return true;
    }

    public final String k(String str) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba2697cd", new Object[]{this, str});
        }
        String[] strArr = {str};
        a aVar = new a();
        this.c = false;
        OrangeConfig.getInstance().registerListener(strArr, aVar, true);
        try {
            OrangeConfig.getInstance().forceCheckUpdate();
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                synchronized (this.f32973a) {
                    config = OrangeConfig.getInstance().getConfig(str, "config_0_3", "NO_MODEL_CONFIG_GET");
                    if (this.c || System.currentTimeMillis() - currentTimeMillis > 60000 || "NO_MODEL_CONFIG_GET".equals(config)) {
                        break;
                    }
                    try {
                        this.f32973a.wait(60000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            return config;
        } finally {
            OrangeConfig.getInstance().unregisterListener(strArr, aVar);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dadf7a6", new Object[]{this});
            return;
        }
        this.f = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add("fd_00002_1");
        arrayList.add("fd_00002_2");
        arrayList.add("fd_00002_4");
        arrayList.add("fd_00002_5");
        this.f.put(FaceDetectionNet.BIZ_NAME, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("hr_00018_1");
        arrayList2.add("hr_00018_2");
        arrayList2.add("hr_00018_3");
        arrayList2.add("resource");
        this.f.put("HandGesture", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("dn_00023_1");
        arrayList3.add("resource");
        this.f.put("doodleRecognition", arrayList3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.android.alinnkit.net.AliNNKitBaseNet, R extends com.taobao.android.alinnkit.net.AliNNKitBaseNet] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(java.io.File r6, tb.zrj.c<T> r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zrj.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "df3148ba"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            tb.oq0<T extends com.taobao.android.alinnkit.net.AliNNKitBaseNet> r2 = r5.h
            com.taobao.android.alinnkit.net.FaceDetectionNet$a r2 = (com.taobao.android.alinnkit.net.FaceDetectionNet.a) r2
            com.taobao.android.alinnkit.net.AliNNKitBaseNet r6 = r2.a(r6)
            if (r6 == 0) goto L_0x002c
            r7.f32976a = r6
            return r0
        L_0x002c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "fail to load alinn model from files"
            r6.<init>(r0)
            r7.b = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zrj.o(java.io.File, tb.zrj$c):boolean");
    }

    /* renamed from: p */
    public void onPostExecute(c<T> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5333fe3a", new Object[]{this, cVar});
            return;
        }
        T t = cVar.f32976a;
        if (t != null) {
            this.i.b(t);
        } else {
            this.i.a(cVar.b);
        }
    }

    /* renamed from: q */
    public void onProgressUpdate(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34baede", new Object[]{this, numArr});
        } else {
            this.i.c(numArr[0].intValue());
        }
    }

    public final void s(String str, ModelConfig modelConfig, File file, c<T> cVar) {
        String str2;
        String str3;
        Map.Entry<String, String> next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782e128f", new Object[]{this, str, modelConfig, file, cVar});
            return;
        }
        Map<String, String> map = modelConfig.models;
        HashSet hashSet = new HashSet();
        List list = (List) ((HashMap) this.f).get(str);
        if (list == null || list.size() == 0) {
            cVar.b = new Exception("");
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            String str4 = ".zip";
            if (it.hasNext()) {
                String str5 = map.get((String) it.next());
                if (str5 == null) {
                    cVar.b = new Exception("designated model names not in default/orange config models");
                    return;
                }
                hashSet.add(str5.concat(str4));
            } else {
                HashSet hashSet2 = new HashSet(Arrays.asList(file.list()));
                HashSet hashSet3 = new HashSet(Arrays.asList(file.list()));
                HashSet hashSet4 = new HashSet();
                HashMap hashMap = new HashMap();
                for (Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                    String value = it2.next().getValue();
                    hashSet4.add(value + str4);
                    hashMap.put(value + str4, modelConfig.urlPrefix + "static/files/" + modelConfig.m + "/0_3/" + next.getKey() + str4);
                }
                String str6 = "0";
                if (!hashSet2.containsAll(hashSet)) {
                    hashSet4.retainAll(hashSet);
                    hashSet4.removeAll(hashSet2);
                    if (hashSet4.size() > 0) {
                        String str7 = modelConfig.allNet;
                        boolean z = str7 == null || Integer.parseInt(str7) == 0;
                        if (!z || qwv.e(this.g)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it3 = hashSet4.iterator();
                            while (it3.hasNext()) {
                                String str8 = (String) it3.next();
                                if (str8.endsWith(str4)) {
                                    str6 = str6;
                                    str4 = str4;
                                    str3 = str8.substring(0, str8.indexOf(str4));
                                } else {
                                    str4 = str4;
                                    str6 = str6;
                                    str3 = "";
                                }
                                onf onfVar = new onf();
                                onfVar.f25507a = (String) hashMap.get(str8);
                                onfVar.c = str3;
                                onfVar.d = new File(file, str8).getName();
                                arrayList.add(onfVar);
                                it3 = it3;
                                hashMap = hashMap;
                            }
                            str2 = str6;
                            long currentTimeMillis = System.currentTimeMillis();
                            boolean i = i(arrayList, file.getPath(), z, cVar);
                            qq0.f(str, modelConfig.m, i ? str2 : "1", this.e, i, (float) (System.currentTimeMillis() - currentTimeMillis));
                            if (i) {
                                bzf.a("AliNNJava", "success download: ".concat(String.valueOf(Arrays.asList(hashSet4))), new Object[0]);
                                hashSet3.removeAll(hashSet);
                                qwv.c(file, new ArrayList(hashSet3));
                                bzf.a("AliNNJava", "delete cache files: ".concat(String.valueOf(Arrays.asList(hashSet3))), new Object[0]);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = hashSet.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(new File(file, (String) it4.next()));
                                }
                                j(arrayList2, cVar);
                                bzf.a("AliNNJava", "success to download and exact model".concat(String.valueOf(Arrays.asList(file.list()))), new Object[0]);
                            }
                        } else {
                            bzf.a("AliNNJava", "only download model in wifi status", new Object[0]);
                            cVar.b = new Exception("fail to download, only enable in wifi env");
                            qq0.f(str, modelConfig.m, "1", vgn.RATE_LIST_CODE, false, 0.0f);
                            return;
                        }
                    } else {
                        str2 = str6;
                    }
                } else {
                    str2 = str6;
                    bzf.a("AliNNJava", "zip file exist: ".concat(String.valueOf(Arrays.asList(hashSet))), new Object[0]);
                    if (hashSet2.size() < hashSet.size() * 2) {
                        bzf.a("AliNNJava", "zip file exist, but unzip fail last time!", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(new File(file, (String) it5.next()));
                        }
                        j(arrayList3, cVar);
                    }
                }
                if (file.list() == null || file.list().length == 0) {
                    cVar.b = new Exception("modelDir is empty, fail to load model");
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                boolean o = o(file, cVar);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                String valueOf = String.valueOf(Arrays.asList(file.list()));
                if (o) {
                    T t = cVar.f32976a;
                    t.mModelId = modelConfig.m;
                    t.mModelFiles = valueOf;
                    t.mBizName = str;
                    bzf.e("AliNNJava", "success to load model, model id is " + modelConfig.m + ", md5 is " + modelConfig.md5, new Object[0]);
                    publishProgress(100);
                } else {
                    cVar.b = new Exception("fail to load model");
                }
                if (!o) {
                    str2 = "ALINN_UNCOMMIT_VALUE";
                }
                qq0.h(str, modelConfig.m, valueOf, str2, o, (float) currentTimeMillis3);
                return;
            }
        }
    }

    public final void l(String str, File file, c<T> cVar) {
        ModelConfig modelConfig;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e5e03a", new Object[]{this, str, file, cVar});
            return;
        }
        String k = k("android_alinn_" + str + "_v01_config");
        bzf.a("AliNNJava", "fetch orange config v3: %s", k);
        try {
            modelConfig = (ModelConfig) JSON.parseObject(k, ModelConfig.class);
            qq0.i(str, modelConfig.m);
        } catch (JSONException unused) {
            bzf.a("AliNNJava", "fail to parse json config", new Object[0]);
            modelConfig = this.j;
            if (modelConfig == null || (str2 = modelConfig.url) == null || (str3 = modelConfig.md5) == null || (str4 = modelConfig.m) == null) {
                modelConfig = m(str);
                bzf.a("AliNNJava", "use local default config, url: %s, md5:%s m: %s allNet: %s unpacked: %s", modelConfig.url, modelConfig.md5, modelConfig.m, modelConfig.allNet, modelConfig.unpacked);
            } else {
                bzf.a("AliNNJava", "use user default config, url: %s, md5:%s m: %s allNet: %s unpacked: %s", str2, str3, str4, modelConfig.allNet, modelConfig.unpacked);
            }
        }
        if (modelConfig.url == null || modelConfig.md5 == null || modelConfig.m == null) {
            String str5 = "fail to get model url config, modelConfig = " + k;
            bzf.a("AliNNJava", str5, new Object[0]);
            cVar.b = new NullPointerException(str5);
            return;
        }
        publishProgress(10);
        String str6 = modelConfig.unpacked;
        if (str6 == null || !str6.equals("1")) {
            r(str, modelConfig, file, cVar);
        } else {
            s(str, modelConfig, file, cVar);
        }
    }

    public final void r(String str, ModelConfig modelConfig, File file, c<T> cVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a78076", new Object[]{this, str, modelConfig, file, cVar});
            return;
        }
        File file2 = new File(file, modelConfig.md5 + ".zip");
        String str3 = "0";
        if (!file2.exists()) {
            bzf.a("AliNNJava", "packed file not exist: " + file2.getAbsolutePath(), new Object[0]);
            HashSet hashSet = new HashSet(Arrays.asList(file.list()));
            String str4 = modelConfig.allNet;
            boolean z = str4 == null || Integer.parseInt(str4) == 0;
            if (!z || qwv.e(this.g)) {
                ArrayList arrayList = new ArrayList();
                onf onfVar = new onf();
                onfVar.f25507a = modelConfig.url;
                onfVar.c = modelConfig.md5;
                onfVar.d = file2.getName();
                arrayList.add(onfVar);
                long currentTimeMillis = System.currentTimeMillis();
                boolean i = i(arrayList, file.getPath(), z, cVar);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str5 = i ? str3 : "1";
                str2 = "AliNNJava";
                qq0.f(str, modelConfig.m, str5, this.e, i, (float) currentTimeMillis2);
                bzf.a(str2, "download model url: %s, md5: %s, status: %s, cost: %d", modelConfig.url, modelConfig.md5, str5, Long.valueOf(currentTimeMillis2));
                if (i) {
                    qwv.c(file, new ArrayList(hashSet));
                    bzf.a(str2, "delete cache files: ".concat(String.valueOf(Arrays.asList(hashSet))), new Object[0]);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(file2);
                    j(arrayList2, cVar);
                    bzf.a(str2, "success to download and exact model: ".concat(String.valueOf(Arrays.asList(file.list()))), new Object[0]);
                }
            } else {
                bzf.a("AliNNJava", "only download model in wifi status", new Object[0]);
                cVar.b = new Exception("fail to download, only enable in wifi env");
                qq0.f(str, modelConfig.m, "1", vgn.RATE_LIST_CODE, false, 0.0f);
                return;
            }
        } else {
            str2 = "AliNNJava";
            bzf.a(str2, "zip file exist: " + modelConfig.md5 + ".zip", new Object[0]);
            if (file.list().length < 2) {
                bzf.a(str2, "zip file exist, but unzip fail last time!", new Object[0]);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(file2);
                j(arrayList3, cVar);
            }
        }
        if (file.list() == null || file.list().length == 0) {
            cVar.b = new Exception("modelDir is empty, fail to load model");
            return;
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        boolean o = o(file, cVar);
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        String valueOf = String.valueOf(Arrays.asList(file.list()));
        if (o) {
            T t = cVar.f32976a;
            t.mModelId = modelConfig.m;
            t.mModelFiles = valueOf;
            t.mBizName = str;
            bzf.e(str2, "success to load model, model id is " + modelConfig.m + ", md5 is " + modelConfig.md5, new Object[0]);
            publishProgress(100);
        } else {
            cVar.b = new Exception("fail to load model");
        }
        if (!o) {
            str3 = "ALINN_UNCOMMIT_VALUE";
        }
        qq0.h(str, modelConfig.m, valueOf, str3, o, (float) currentTimeMillis4);
    }
}
