package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kfs implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22635a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public a(String str, String str2, Object obj) {
            this.f22635a = str;
            this.b = str2;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kfs.i(kfs.this, this.f22635a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22636a;
        public final /* synthetic */ byte[] b;

        public b(String str, byte[] bArr) {
            this.f22636a = str;
            this.b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kfs.j(kfs.this, this.f22636a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f22637a;
        public final /* synthetic */ File b;

        public c(long j, File file) {
            this.f22637a = j;
            this.b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tfs.f("clearExpiredCache :" + this.f22637a);
            File[] listFiles = this.b.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file != null && file.isFile()) {
                        long lastModified = file.lastModified();
                        if (lastModified > 0 && System.currentTimeMillis() - lastModified > this.f22637a) {
                            tfs.f("clearExpiredCache, cache " + file.getName() + " is deleted");
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Object f22638a;
        public int b;

        static {
            t2o.a(502267966);
        }

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        t2o.a(502267962);
        t2o.a(503316602);
    }

    public static /* synthetic */ boolean i(kfs kfsVar, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("870e771f", new Object[]{kfsVar, str, str2, obj})).booleanValue();
        }
        return kfsVar.r(str, str2, obj);
    }

    public static /* synthetic */ boolean j(kfs kfsVar, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed8c0d5f", new Object[]{kfsVar, str, bArr})).booleanValue();
        }
        return kfsVar.q(str, bArr);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3b02d75", new Object[]{this, str});
        }
        return e("config", str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beefb6e0", new Object[]{this, str, obj});
        } else {
            d("config", str, obj);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void c(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2f78b1", new Object[]{this, str, bArr});
        } else if (TextUtils.isEmpty(str)) {
            tfs.d("saveFile fileName is empty");
        } else {
            tfs.f("saveFile with  fileName:" + str);
            AsyncTask.execute(new b(str, bArr));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public void d(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4073892a", new Object[]{this, str, str2, obj});
        } else if (TextUtils.isEmpty(str2)) {
            tfs.d("putCache key is empty");
        } else if (!"file".equals(str)) {
            tfs.f("putCache with  key:" + str2 + " type:" + str);
            AsyncTask.execute(new a(str, str2, obj));
        } else if (obj instanceof byte[]) {
            c(str2, (byte[]) obj);
        } else {
            tfs.d("value is not byte[], key: " + str2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public Object e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79ca62b", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            tfs.d("getCache key is empty");
            return null;
        } else if ("file".equals(str)) {
            File g = g(str2);
            if (g != null) {
                try {
                    byte[] f0 = nwv.f0(new FileInputStream(g));
                    tfs.f("getCache success with key:" + str2 + " type: " + str);
                    return f0;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            tfs.f("getCache failed with key:" + str2 + " type: " + str);
            return null;
        } else {
            d p = p(str, str2);
            if (p.b == 0) {
                tfs.f("getCache " + str2 + " success with key " + str2 + " type: " + str);
                return p.f22638a;
            }
            tfs.f("getCache " + str2 + " failed for " + n(p.b));
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public boolean f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c3a1b17", new Object[]{this, new Long(j)})).booleanValue();
        }
        k("config", j);
        k(IStorage.TYPE_DSL, j);
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public File g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("add4caea", new Object[]{this, str});
        }
        File m = m("file");
        if (m != null) {
            return new File(m, str);
        }
        return null;
    }

    public final void k(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36da287d", new Object[]{this, str, new Long(j)});
            return;
        }
        File m = m(str);
        if (m != null) {
            AsyncTask.execute(new c(j, m));
        }
    }

    public final boolean l(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8871653", new Object[]{this, file, str})).booleanValue();
        }
        tfs.d("deleteFile key: " + str);
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return false;
        }
        file2.delete();
        return true;
    }

    public final String n(int i) {
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

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage
    public boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a397857d", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            tfs.d("removeCache failed, key is empty, type: " + str);
            return false;
        }
        File m = m(str);
        if (m == null) {
            return false;
        }
        boolean l = l(m, "file".equals(str) ? str2 : noh.a(str2));
        tfs.d("removeCache success:" + l + " key: " + str2 + " type: " + str);
        return l;
    }

    public final d p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7257b9fa", new Object[]{this, str, str2});
        }
        File m = m(str);
        if (m != null) {
            return o(m, str2);
        }
        tfs.d("readObject failed for ensureDir,  key:" + str2);
        d dVar = new d(null);
        dVar.b = 1;
        return dVar;
    }

    public final boolean q(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00b7392", new Object[]{this, str, bArr})).booleanValue();
        }
        File m = m("file");
        if (m == null) {
            tfs.d("saveFile failed for ensureFileDir,  fileName:" + str);
            return false;
        } else if (bArr != null) {
            return t(m, str, bArr);
        } else {
            tfs.d("saveFile failed for file is null,  fileName:" + str);
            return false;
        }
    }

    public final boolean r(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d5e2557", new Object[]{this, str, str2, obj})).booleanValue();
        }
        File m = m(str);
        if (m != null) {
            return s(m, str2, obj);
        }
        tfs.d("saveObject failed for ensureDir,  key:" + str2 + "  value:" + obj);
        return false;
    }

    public final boolean t(File file, String str, byte[] bArr) {
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return renameTo;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    tfs.d("writeFile exception " + th.getMessage() + " fileName:" + str);
                    return false;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r8.equals(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage.TYPE_DSL) == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File m(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.kfs.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "7e28f04d"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.io.File r8 = (java.io.File) r8
            return r8
        L_0x0018:
            android.content.Context r3 = com.taobao.tao.flexbox.layoutmanager.core.o.J()
            r8.hashCode()
            java.lang.String r4 = "tnode_storage_cache"
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1354792126: goto L_0x0040;
                case 99773: goto L_0x0037;
                case 3143036: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x004a
        L_0x002c:
            java.lang.String r0 = "file"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r0 = 2
            goto L_0x004a
        L_0x0037:
            java.lang.String r1 = "dsl"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x002a
        L_0x0040:
            java.lang.String r0 = "config"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0049
            goto L_0x002a
        L_0x0049:
            r0 = 0
        L_0x004a:
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005c;
                case 2: goto L_0x0058;
                default: goto L_0x004d;
            }
        L_0x004d:
            java.lang.String r0 = "unknown storage type: "
            java.lang.String r8 = r0.concat(r8)
            tb.tfs.d(r8)
            goto L_0x005f
        L_0x0058:
            java.lang.String r4 = "tnode_storage_file"
            goto L_0x005f
        L_0x005c:
            java.lang.String r4 = "tnode_storage_dsl"
        L_0x005f:
            java.io.File r8 = new java.io.File
            java.io.File r0 = r3.getFilesDir()
            r8.<init>(r0, r4)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x0071
            r8.mkdir()
        L_0x0071:
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L_0x0078
            return r8
        L_0x0078:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kfs.m(java.lang.String):java.io.File");
    }

    public final d o(File file, String str) {
        Throwable th;
        Exception e;
        ObjectInputStream objectInputStream;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("76a57724", new Object[]{this, file, str});
        }
        String a2 = noh.a(str);
        ObjectInputStream objectInputStream2 = null;
        d dVar = new d(null);
        File file2 = new File(file, a2);
        try {
            if (file2.exists()) {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    objectInputStream.readByte();
                    if (objectInputStream.readByte() == 2) {
                        obj = JSON.parse((String) objectInputStream.readObject());
                    } else {
                        obj = objectInputStream.readObject();
                    }
                    dVar.f22638a = obj;
                    dVar.b = 0;
                    objectInputStream.close();
                } catch (Exception e3) {
                    e = e3;
                    objectInputStream2 = objectInputStream;
                    dVar.b = 2;
                    tfs.d("readFile key:" + str + " exception:" + e.getMessage());
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return dVar;
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                dVar.b = 3;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return dVar;
    }

    public final boolean s(File file, String str, Object obj) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb8499a3", new Object[]{this, file, str, obj})).booleanValue();
        }
        String a2 = noh.a(str);
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
                tfs.d("writeFile success: " + renameTo + " key:" + str);
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return renameTo;
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    tfs.d("writeFile exception " + th.getMessage() + " key:" + str + " value:" + obj);
                    return false;
                } finally {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
