package com.taobao.android.dxv4common.logic.dex;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ao6;
import tb.eb5;
import tb.h36;
import tb.hvb;
import tb.ic5;
import tb.j7b;
import tb.jb6;
import tb.la6;
import tb.t2o;
import tb.u06;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXModuleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ASSET_DEPENDENCIES_DIR = "dinamicx/native_logic_dependencies/dependencies.json";
    private static final String ROOT_DIR = "dinamicx_logic/native_logic_dependencies";
    private static final String SEPARATOR = "/";
    private hvb dxDownloader;
    private File fileRoorPath;
    private Map<String, Map<String, DXNativeLogicLoader>> logicMaps;
    private Map<String, Map<String, DXNativeLogicLoader>> moduleDependenciesMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f7593a;
        public final /* synthetic */ d b;
        public final /* synthetic */ long c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.dxv4common.logic.dex.DXModuleManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0404a implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.dxv4common.logic.dex.DXModuleManager$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class C0405a implements e {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0405a() {
                }

                @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.e
                public void a(JSONArray jSONArray) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("df908cc", new Object[]{this, jSONArray});
                        return;
                    }
                    String str = a.this.c + " second download failed " + JSON.toJSONString(jSONArray);
                    d dVar = a.this.b;
                    if (dVar != null) {
                        ((DXNativeLogicLoadTask.a) dVar).a(str);
                    }
                    la6.b(str);
                    f fVar = new f("dinamicx");
                    f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", f.DX_V4_LOGIC_4100006);
                    aVar.e = str;
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                }

                @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.e
                public void onFinish() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("badeed9", new Object[]{this});
                        return;
                    }
                    a aVar = a.this;
                    List<DXNativeLogicLoader> access$200 = DXModuleManager.access$200(DXModuleManager.this, aVar.f7593a);
                    d dVar = a.this.b;
                    if (dVar != null) {
                        ((DXNativeLogicLoadTask.a) dVar).b(access$200);
                    }
                }
            }

            public C0404a() {
            }

            @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.e
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df908cc", new Object[]{this, jSONArray});
                    return;
                }
                String str = a.this.c + " first download fail , retry " + JSON.toJSONString(jSONArray);
                la6.b(str);
                f fVar = new f("dinamicx");
                f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", f.DX_V4_LOGIC_4100005);
                aVar.e = str;
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
                DXModuleManager.this.download(jSONArray, new C0405a());
            }

            @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.e
            public void onFinish() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                List<DXNativeLogicLoader> access$200 = DXModuleManager.access$200(DXModuleManager.this, aVar.f7593a);
                d dVar = a.this.b;
                if (dVar != null) {
                    ((DXNativeLogicLoadTask.a) dVar).b(access$200);
                }
            }
        }

        public a(JSONArray jSONArray, d dVar, long j) {
            this.f7593a = jSONArray;
            this.b = dVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXModuleManager.this.download(this.f7593a, new C0404a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXModuleManager.this.download(JSON.parseArray(new String(u06.f(DXModuleManager.ASSET_DEPENDENCIES_DIR))), null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final DXModuleManager f7597a = new DXModuleManager(null);

        static {
            t2o.a(444597949);
        }

        public static /* synthetic */ DXModuleManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXModuleManager) ipChange.ipc$dispatch("556b9fc3", new Object[0]);
            }
            return f7597a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void a(JSONArray jSONArray);

        void onFinish();
    }

    static {
        t2o.a(444597944);
    }

    public /* synthetic */ DXModuleManager(a aVar) {
        this();
    }

    public static /* synthetic */ List access$200(DXModuleManager dXModuleManager, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10f1c7c", new Object[]{dXModuleManager, jSONArray});
        }
        return dXModuleManager.afterDownload(jSONArray);
    }

    private boolean deleteDir(File file) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{this, file})).booleanValue();
        }
        if (!(file == null || !file.isDirectory() || (list = file.list()) == null)) {
            for (String str : list) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        if (file != null) {
            h36.g("DXModuleManager", " dir " + file.getAbsoluteFile());
        }
        if (file == null || !file.delete()) {
            return false;
        }
        return true;
    }

    private boolean deleteOldFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbacb0ad", new Object[]{this, str})).booleanValue();
        }
        File file = new File(this.fileRoorPath.getAbsolutePath() + "/" + str);
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        long lastModified = listFiles[0].lastModified();
        for (File file2 : listFiles) {
            if (file2.lastModified() < lastModified) {
                deleteDir(file2);
            }
        }
        return true;
    }

    private byte[] downLoad(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("80821ec4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.dxDownloader.a(str);
    }

    private String generatorKey(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1e04eb1", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
        return str + "-" + str2 + "-" + str3 + "-" + str4 + '-' + str5 + "-" + str6;
    }

    public static DXModuleManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXModuleManager) ipChange.ipc$dispatch("6f8645e", new Object[0]);
        }
        return c.a();
    }

    public void clearDiskCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8201949f", new Object[]{this});
            return;
        }
        deleteOldFile("atomicfu-jvm-0.21.0");
        deleteOldFile("stdlibV1-megability-release");
    }

    public void clearMemoryCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9614fb", new Object[]{this});
            return;
        }
        Map<String, Map<String, DXNativeLogicLoader>> map = this.logicMaps;
        if (map != null) {
            map.clear();
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            jb6.r(new b());
        }
    }

    public void load(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7750895", new Object[]{this, str, dVar});
            return;
        }
        JSONArray parseArray = JSON.parseArray(str);
        if (parseArray == null || parseArray.size() == 0) {
            ((DXNativeLogicLoadTask.a) dVar).b(null);
            return;
        }
        long nanoTime = System.nanoTime();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jb6.r(new a(parseArray, dVar, nanoTime));
            return;
        }
        download(parseArray, null);
        List<DXNativeLogicLoader> afterDownload = afterDownload(parseArray);
        if (dVar != null) {
            ((DXNativeLogicLoadTask.a) dVar).b(afterDownload);
        }
    }

    private DXModuleManager() {
        this.moduleDependenciesMap = new ConcurrentHashMap();
        this.logicMaps = new ConcurrentHashMap();
        if (this.dxDownloader == null) {
            this.dxDownloader = new j7b();
        } else {
            this.dxDownloader = g.d();
        }
        File file = new File(DinamicXEngine.x().getFilesDir(), ROOT_DIR);
        this.fileRoorPath = file;
        if (!file.exists()) {
            this.fileRoorPath.mkdirs();
        }
    }

    public void download(JSONArray jSONArray, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d2e887", new Object[]{this, jSONArray, eVar});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("version");
                String string3 = jSONObject.getString("type");
                String string4 = jSONObject.getString("url");
                String str = this.fileRoorPath.getAbsolutePath() + "/" + string + "/" + string2 + "/" + string + "." + string3;
                if (!new File(str).exists()) {
                    byte[] downLoad = downLoad(string4);
                    if (downLoad == null || downLoad.length == 0) {
                        jSONArray2.add(jSONObject);
                    } else if (!u06.k(str, downLoad, false)) {
                        jSONArray2.add(jSONObject);
                    }
                }
            }
            if (zg5.B2()) {
                if (eVar == null) {
                    return;
                }
                if (jSONArray2.size() == 0) {
                    eVar.onFinish();
                } else {
                    eVar.a(jSONArray2);
                }
            } else if (eVar != null) {
                eVar.onFinish();
            }
        } else if (eVar != null) {
            eVar.onFinish();
        }
    }

    private synchronized List<DXNativeLogicLoader> afterDownload(JSONArray jSONArray) {
        String str;
        DXNativeLogicLoader dXNativeLogicLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("78101fb4", new Object[]{this, jSONArray});
        }
        String str2 = null;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (ao6.a().d()) {
            return arrayList;
        }
        int size = jSONArray.size();
        String str3 = "baseMain";
        String str4 = "1";
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (i < size) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                str2 = jSONObject.getString("name");
                str = jSONObject.getString("version");
            } else {
                str = str2;
            }
            int i2 = i - 1;
            if (i2 < 0 || i2 >= size) {
                str3 = "baseMain";
                str4 = "1";
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2 != null) {
                    str3 = jSONObject2.getString("name");
                    str4 = jSONObject2.getString("version");
                }
            }
            int i3 = i + 1;
            if (i3 < 0 || i3 >= size) {
                str5 = "null";
                str6 = "null";
            } else {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                if (jSONObject3 != null) {
                    str5 = jSONObject3.getString("name");
                    str6 = jSONObject3.getString("version");
                }
            }
            String generatorKey = generatorKey(str3, str4, str2, str, str5, str6);
            String string = jSONObject.getString("type");
            Map<String, DXNativeLogicLoader> map = this.logicMaps.get(str2);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.logicMaps.put(str2, map);
            }
            DXNativeLogicLoader dXNativeLogicLoader2 = map.get(generatorKey);
            if (dXNativeLogicLoader2 != null) {
                if (DinamicXEngine.j0()) {
                    h36.c("获取到logicLoader  直接跳出  " + generatorKey);
                }
                if (eb5.C()) {
                    h36.v("获取到logicLoader memoryCacheVersion " + generatorKey + "  loader  " + dXNativeLogicLoader2.hashCode() + " thread " + Thread.currentThread().getName());
                }
                arrayList.add(dXNativeLogicLoader2);
            } else {
                String str7 = this.fileRoorPath.getAbsolutePath() + "/" + str2 + "/" + str + "/" + str2 + "." + string;
                if (i == 0) {
                    dXNativeLogicLoader = new DXNativeLogicLoader(str7, true);
                } else {
                    DXNativeLogicLoader dXNativeLogicLoader3 = (DXNativeLogicLoader) arrayList.get(arrayList.size() - 1);
                    String name = dXNativeLogicLoader3.getName();
                    String version = dXNativeLogicLoader3.getVersion();
                    str3 = name;
                    str4 = version;
                    dXNativeLogicLoader = new DXNativeLogicLoader(str7, false, null, null, dXNativeLogicLoader3, name, version, str5, str6, str2, str);
                }
                if (eb5.C()) {
                    h36.v("put memoryCacheVersion " + generatorKey + "  loader  " + dXNativeLogicLoader.hashCode() + " thread " + Thread.currentThread().getName());
                }
                map.put(generatorKey, dXNativeLogicLoader);
                arrayList.add(dXNativeLogicLoader);
            }
            str5 = str5;
            str6 = str6;
            i = i3;
            str2 = null;
        }
        return arrayList;
    }
}
