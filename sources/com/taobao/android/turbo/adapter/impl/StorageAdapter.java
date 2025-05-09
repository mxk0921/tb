package com.taobao.android.turbo.adapter.impl;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.be8;
import tb.ckf;
import tb.dg9;
import tb.g1a;
import tb.njg;
import tb.t2o;
import tb.tpu;
import tb.xhv;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StorageAdapter implements IStorageAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final njg c = kotlin.a.b(StorageAdapter$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f9732a = new HashMap();
    public final LruCache<String, Object> b = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f9733a;
        public Object b;
        public int c;

        static {
            t2o.a(919601211);
        }

        public final Object a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
            }
            return this.b;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.f9733a;
        }

        public final void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
            } else {
                this.b = obj;
            }
        }

        public final void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff9f752e", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
            } else {
                this.f9733a = i;
            }
        }

        public final void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601212);
        }

        public b() {
        }

        public final StorageAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("509cf74", new Object[]{this});
            } else {
                value = StorageAdapter.f().getValue();
            }
            return (StorageAdapter) value;
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ g1a d;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Object b;

            public a(Object obj) {
                this.b = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.this.d.invoke(this.b);
                }
            }
        }

        public c(String str, String str2, g1a g1aVar) {
            this.b = str;
            this.c = str2;
            this.d = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zrt.Companion.b(new a(StorageAdapter.this.e(this.b, this.c)));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object d;

        public d(String str, String str2, Object obj) {
            this.b = str;
            this.c = str2;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StorageAdapter.h(StorageAdapter.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ byte[] c;

        public e(String str, byte[] bArr) {
            this.b = str;
            this.c = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StorageAdapter.g(StorageAdapter.this, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(919601210);
        t2o.a(919601172);
    }

    public static final /* synthetic */ njg f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ boolean g(StorageAdapter storageAdapter, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ab55d82", new Object[]{storageAdapter, str, bArr})).booleanValue();
        }
        return storageAdapter.p(str, bArr);
    }

    public static final /* synthetic */ boolean h(StorageAdapter storageAdapter, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49e8eac7", new Object[]{storageAdapter, str, str2, obj})).booleanValue();
        }
        return storageAdapter.q(str, str2, obj);
    }

    @Override // com.taobao.android.turbo.adapter.IStorageAdapter
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3b02d75", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return e("config", str);
    }

    @Override // com.taobao.android.turbo.adapter.IStorageAdapter
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beefb6e0", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        d("config", str, obj);
    }

    @Override // com.taobao.android.turbo.adapter.IStorageAdapter
    public void c(String str, g1a<Object, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246b0923", new Object[]{this, str, g1aVar});
            return;
        }
        ckf.g(str, "key");
        ckf.g(g1aVar, "callback");
        j("config", str, g1aVar);
    }

    @Override // com.taobao.android.turbo.adapter.IStorageAdapter
    public void d(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4073892a", new Object[]{this, str, str2, obj});
            return;
        }
        ckf.g(str, "type");
        ckf.g(str2, "key");
        if (TextUtils.isEmpty(str2)) {
            tpu.a.b(tpu.Companion, "StorageAdapter", "putCache key is empty", null, 4, null);
            return;
        }
        switch (str.hashCode()) {
            case -1354792126:
                if (str.equals("config")) {
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "StorageAdapter", "putCache with  key:" + str2 + " type:" + str, null, 4, null);
                    AsyncTask.execute(new d(str, str2, obj));
                    return;
                }
                return;
            case 107439:
                if (str.equals("lru")) {
                    this.b.put(str2, obj);
                    return;
                }
                return;
            case 107989:
                if (str.equals("mem")) {
                    ((HashMap) this.f9732a).put(str2, obj);
                    return;
                }
                return;
            case 3143036:
                if (!str.equals("file")) {
                    return;
                }
                if (obj instanceof byte[]) {
                    o(str2, (byte[]) obj);
                    return;
                } else {
                    tpu.a.b(tpu.Companion, "StorageAdapter", "value is not byte[], key: ".concat(str2), null, 4, null);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.taobao.android.turbo.adapter.IStorageAdapter
    public Object e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79ca62b", new Object[]{this, str, str2});
        }
        ckf.g(str, "type");
        ckf.g(str2, "key");
        if (TextUtils.isEmpty(str2)) {
            tpu.a.b(tpu.Companion, "StorageAdapter", "getCache key is empty", null, 4, null);
            return null;
        } else if (ckf.b("file", str)) {
            File k = k(str2);
            if (k != null) {
                try {
                    byte[] a2 = dg9.Companion.a(new FileInputStream(k));
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "StorageAdapter", "getCache success with key:" + str2 + " type: " + str, null, 4, null);
                    return a2;
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "StorageAdapter", "getCache failed with key:" + str2 + " type: " + str, null, 4, null);
            return null;
        } else if (ckf.b("mem", str)) {
            return ((HashMap) this.f9732a).get(str2);
        } else {
            if (ckf.b("lru", str)) {
                return this.b.get(str2);
            }
            a n = n(str, str2);
            if (n.b() == 0) {
                tpu.a aVar3 = tpu.Companion;
                tpu.a.b(aVar3, "StorageAdapter", "getCache " + str2 + " success with key " + str2 + " type: " + str, null, 4, null);
                Object a3 = n.a();
                ckf.d(a3);
                return a3;
            }
            tpu.a aVar4 = tpu.Companion;
            tpu.a.b(aVar4, "StorageAdapter", "getCache " + str2 + " failed for " + l(n.b()), null, 4, null);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r11.equals("config") != false) goto L_0x0056;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File i(java.lang.String r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.turbo.adapter.impl.StorageAdapter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "7e28f04d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            java.lang.Object r11 = r0.ipc$dispatch(r1, r2)
            java.io.File r11 = (java.io.File) r11
            return r11
        L_0x0018:
            tb.spu$a r0 = tb.spu.Companion
            android.content.Context r0 = r0.d()
            int r1 = r11.hashCode()
            r2 = -1354792126(0xffffffffaf3f8342, float:-1.7417981E-10)
            java.lang.String r3 = "tnode_storage_cache"
            if (r1 == r2) goto L_0x003c
            r2 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 == r2) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            java.lang.String r1 = "file"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0045
            java.lang.String r3 = "tnode_storage_file"
            goto L_0x0056
        L_0x003c:
            java.lang.String r1 = "config"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0045
            goto L_0x0056
        L_0x0045:
            tb.tpu$a r4 = tb.tpu.Companion
            java.lang.String r1 = "unknown storage type: "
            java.lang.String r6 = r1.concat(r11)
            r8 = 4
            r9 = 0
            java.lang.String r5 = "StorageAdapter"
            r7 = 0
            tb.tpu.a.b(r4, r5, r6, r7, r8, r9)
        L_0x0056:
            java.io.File r11 = new java.io.File
            java.io.File r0 = r0.getFilesDir()
            r11.<init>(r0, r3)
            boolean r0 = r11.exists()
            if (r0 != 0) goto L_0x0068
            r11.mkdir()
        L_0x0068:
            boolean r0 = r11.isDirectory()
            if (r0 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r11 = 0
        L_0x0070:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.adapter.impl.StorageAdapter.i(java.lang.String):java.io.File");
    }

    public void j(String str, String str2, g1a<Object, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b34dad", new Object[]{this, str, str2, g1aVar});
            return;
        }
        ckf.g(str, "type");
        ckf.g(str2, "key");
        ckf.g(g1aVar, "callback");
        int hashCode = str.hashCode();
        if (hashCode != 107439) {
            if (hashCode == 107989 && str.equals("mem")) {
                g1aVar.invoke(((HashMap) this.f9732a).get(str2));
                return;
            }
        } else if (str.equals("lru")) {
            g1aVar.invoke(this.b.get(str2));
            return;
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(str, str2, g1aVar));
    }

    public File k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("add4caea", new Object[]{this, str});
        }
        ckf.g(str, "fileName");
        File i = i("file");
        if (i != null) {
            return new File(i, str);
        }
        return null;
    }

    public final String l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5011d94", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "FLAG_VALID";
        }
        if (i == 1) {
            return "FLAG_DIR_NOT_EXIST";
        }
        if (i == 2) {
            return "FLAG_EXCEPTION";
        }
        if (i == 3) {
            return "FLAG_FILE_NOT_EXIST";
        }
        return "" + i;
    }

    public void o(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2f78b1", new Object[]{this, str, bArr});
            return;
        }
        ckf.g(str, "fileName");
        if (TextUtils.isEmpty(str)) {
            tpu.a.b(tpu.Companion, "StorageAdapter", "saveFile fileName is empty", null, 4, null);
            return;
        }
        tpu.a.b(tpu.Companion, "StorageAdapter", "saveFile with  fileName:".concat(str), null, 4, null);
        AsyncTask.execute(new e(str, bArr));
    }

    public final a n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c9751a6e", new Object[]{this, str, str2});
        }
        File i = i(str);
        if (i != null) {
            return m(i, str2);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "StorageAdapter", "readObject failed for ensureDir,  key:" + str2, null, 4, null);
        a aVar2 = new a();
        aVar2.e(1);
        return aVar2;
    }

    public final boolean q(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d5e2557", new Object[]{this, str, str2, obj})).booleanValue();
        }
        File i = i(str);
        if (i != null) {
            return r(i, str2, obj);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "StorageAdapter", "saveObject failed for ensureDir,  key:" + str2 + "  value:" + obj, null, 4, null);
        return false;
    }

    public final boolean s(File file, String str, byte[] bArr) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24c0ff8", new Object[]{this, file, str, bArr})).booleanValue();
        }
        File file2 = new File(file, str);
        File file3 = new File(file, str + ".bak");
        FileOutputStream fileOutputStream = null;
        try {
            if (!file3.exists()) {
                file3.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                boolean renameTo = file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return renameTo;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "StorageAdapter", "writeFile exception " + th.getMessage() + " fileName:" + str, null, 4, null);
                    return false;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.android.turbo.adapter.impl.StorageAdapter.a m(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 2
            r1 = 0
            r2 = 3
            java.lang.String r3 = "readFile key:"
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.turbo.adapter.impl.StorageAdapter.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001e
            java.lang.String r3 = "1519f384"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r12
            r1 = 1
            r2[r1] = r13
            r2[r0] = r14
            java.lang.Object r13 = r4.ipc$dispatch(r3, r2)
            com.taobao.android.turbo.adapter.impl.StorageAdapter$a r13 = (com.taobao.android.turbo.adapter.impl.StorageAdapter.a) r13
            return r13
        L_0x001e:
            tb.be8$a r4 = tb.be8.Companion
            java.lang.String r4 = r4.a(r14)
            com.taobao.android.turbo.adapter.impl.StorageAdapter$a r5 = new com.taobao.android.turbo.adapter.impl.StorageAdapter$a
            r5.<init>()
            java.io.File r6 = new java.io.File
            r6.<init>(r13, r4)
            boolean r13 = r6.exists()
            if (r13 == 0) goto L_0x00c2
            r13 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: all -> 0x0085, Exception -> 0x0089
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: all -> 0x0085, Exception -> 0x0089
            r4.<init>(r6)     // Catch: all -> 0x0085, Exception -> 0x0089
            r2.<init>(r4)     // Catch: all -> 0x0085, Exception -> 0x0089
            byte r13 = r2.readByte()     // Catch: all -> 0x0060, Exception -> 0x0062
            r5.g(r13)     // Catch: all -> 0x0060, Exception -> 0x0062
            byte r13 = r2.readByte()     // Catch: all -> 0x0060, Exception -> 0x0062
            r5.f(r13)     // Catch: all -> 0x0060, Exception -> 0x0062
            int r13 = r5.c()     // Catch: all -> 0x0060, Exception -> 0x0062
            if (r13 != r0) goto L_0x006d
            java.lang.Object r13 = r2.readObject()     // Catch: all -> 0x0060, Exception -> 0x0062
            if (r13 == 0) goto L_0x0064
            java.lang.String r13 = (java.lang.String) r13     // Catch: all -> 0x0060, Exception -> 0x0062
            java.lang.Object r13 = com.alibaba.fastjson.JSON.parse(r13)     // Catch: all -> 0x0060, Exception -> 0x0062
            goto L_0x0071
        L_0x0060:
            r13 = move-exception
            goto L_0x00b7
        L_0x0062:
            r13 = move-exception
            goto L_0x008c
        L_0x0064:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch: all -> 0x0060, Exception -> 0x0062
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r13.<init>(r1)     // Catch: all -> 0x0060, Exception -> 0x0062
            throw r13     // Catch: all -> 0x0060, Exception -> 0x0062
        L_0x006d:
            java.lang.Object r13 = r2.readObject()     // Catch: all -> 0x0060, Exception -> 0x0062
        L_0x0071:
            java.lang.String r4 = "if (cacheData.type == TY…bject()\n                }"
            tb.ckf.f(r13, r4)     // Catch: all -> 0x0060, Exception -> 0x0062
            r5.d(r13)     // Catch: all -> 0x0060, Exception -> 0x0062
            r5.e(r1)     // Catch: all -> 0x0060, Exception -> 0x0062
            r2.close()     // Catch: IOException -> 0x0080
            goto L_0x00c5
        L_0x0080:
            r13 = move-exception
            r13.printStackTrace()
            goto L_0x00c5
        L_0x0085:
            r14 = move-exception
            r2 = r13
            r13 = r14
            goto L_0x00b7
        L_0x0089:
            r1 = move-exception
            r2 = r13
            r13 = r1
        L_0x008c:
            r5.e(r0)     // Catch: all -> 0x0060
            tb.tpu$a r6 = tb.tpu.Companion     // Catch: all -> 0x0060
            java.lang.String r7 = "StorageAdapter"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0060
            r0.<init>(r3)     // Catch: all -> 0x0060
            r0.append(r14)     // Catch: all -> 0x0060
            java.lang.String r14 = " exception:"
            r0.append(r14)     // Catch: all -> 0x0060
            java.lang.String r13 = r13.getMessage()     // Catch: all -> 0x0060
            r0.append(r13)     // Catch: all -> 0x0060
            java.lang.String r8 = r0.toString()     // Catch: all -> 0x0060
            r11 = 0
            r9 = 0
            r10 = 4
            tb.tpu.a.b(r6, r7, r8, r9, r10, r11)     // Catch: all -> 0x0060
            if (r2 == 0) goto L_0x00c5
            r2.close()     // Catch: IOException -> 0x0080
            goto L_0x00c5
        L_0x00b7:
            if (r2 == 0) goto L_0x00c1
            r2.close()     // Catch: IOException -> 0x00bd
            goto L_0x00c1
        L_0x00bd:
            r14 = move-exception
            r14.printStackTrace()
        L_0x00c1:
            throw r13
        L_0x00c2:
            r5.e(r2)
        L_0x00c5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.adapter.impl.StorageAdapter.m(java.io.File, java.lang.String):com.taobao.android.turbo.adapter.impl.StorageAdapter$a");
    }

    public final boolean p(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00b7392", new Object[]{this, str, bArr})).booleanValue();
        }
        File i = i("file");
        if (i == null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "StorageAdapter", "saveFile failed for ensureFileDir,  fileName:" + str, null, 4, null);
            return false;
        } else if (bArr != null) {
            return s(i, str, bArr);
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "StorageAdapter", "saveFile failed for file is null,  fileName:" + str, null, 4, null);
            return false;
        }
    }

    public final boolean r(File file, String str, Object obj) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb8499a3", new Object[]{this, file, str, obj})).booleanValue();
        }
        String a2 = be8.Companion.a(str);
        File file2 = new File(file, a2);
        File file3 = new File(file, a2 + ".bak");
        ObjectOutputStream objectOutputStream = null;
        try {
            if (!file3.exists()) {
                file3.createNewFile();
            }
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file3));
            try {
                objectOutputStream2.writeByte(1);
                if (obj instanceof JSON) {
                    objectOutputStream2.writeByte(2);
                    objectOutputStream2.writeObject(JSON.toJSONString(obj));
                } else {
                    objectOutputStream2.writeByte(1);
                    objectOutputStream2.writeObject(obj);
                }
                objectOutputStream2.flush();
                boolean renameTo = file3.renameTo(file2);
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "StorageAdapter", "writeFile success: " + renameTo + " key:" + str, null, 4, null);
                try {
                    objectOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return renameTo;
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    tpu.a aVar2 = tpu.Companion;
                    tpu.a.b(aVar2, "StorageAdapter", "writeFile exception " + th.getMessage() + " key:" + str + " value:" + obj, null, 4, null);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
