package android.taobao.windvane.cache;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.oqw;
import tb.pqw;
import tb.sb9;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVFileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CREATE = 4;
    public static final int DELETE = 3;
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final String i = "WVFileCache";

    /* renamed from: a  reason: collision with root package name */
    public final String f1754a;
    public final String b;
    public RandomAccessFile e;
    public FileChannel f;
    public final int h;
    public final Map<String, oqw> d = Collections.synchronizedMap(new FixedSizeLinkedHashMap());
    public final boolean g = true;
    public boolean c = false;

    static {
        t2o.a(989855763);
    }

    public WVFileCache(String str, String str2, int i2, boolean z) {
        this.f1754a = str;
        this.b = str2;
        this.h = i2;
    }

    public static /* synthetic */ int a(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb9493e7", new Object[]{wVFileCache})).intValue();
        }
        return wVFileCache.h;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ String c(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f8c3eae", new Object[]{wVFileCache});
        }
        return wVFileCache.f1754a;
    }

    public static /* synthetic */ FileChannel d(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileChannel) ipChange.ipc$dispatch("e8eaf1d2", new Object[]{wVFileCache});
        }
        return wVFileCache.f;
    }

    public boolean e() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42d4c58", new Object[]{this})).booleanValue();
        }
        if (!this.c || (list = new File(this.f1754a).list()) == null) {
            return false;
        }
        boolean z = true;
        for (String str : list) {
            z &= g(str);
        }
        return z;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.e;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileChannel fileChannel = this.f;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        super.finalize();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a504e5d", new Object[]{this});
        }
        return this.f1754a;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f70b24", new Object[]{this});
            return;
        }
        v7t.a(i, "onFileOverflow");
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, oqw>> entrySet = this.d.entrySet();
        int size = this.d.size();
        for (Map.Entry<String, oqw> entry : entrySet) {
            if (size < this.h) {
                break;
            }
            oqw value = entry.getValue();
            if (value != null) {
                arrayList.add(value);
            }
            size--;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g(((oqw) it.next()).c);
        }
    }

    public final void k(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64e71a0", new Object[]{this, new Integer(i2)});
        } else if (this.d.size() > i2) {
            j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1;

        static {
            t2o.a(989855764);
        }

        public FixedSizeLinkedHashMap() {
        }

        public static /* synthetic */ Object ipc$super(FixedSizeLinkedHashMap fixedSizeLinkedHashMap, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/cache/WVFileCache$FixedSizeLinkedHashMap");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() <= WVFileCache.a(WVFileCache.this)) {
                return false;
            }
            if (v7t.h()) {
                String b = WVFileCache.b();
                v7t.a(b, "removeEldestEntry, size:" + size() + " " + entry.getKey());
            }
            V value = entry.getValue();
            if (value instanceof oqw) {
                oqw oqwVar = (oqw) value;
                if (sb9.a(new File(WVFileCache.c(WVFileCache.this), oqwVar.c))) {
                    pqw.d(3, oqwVar, WVFileCache.d(WVFileCache.this));
                }
            }
            return true;
        }
    }

    public boolean g(String str) {
        oqw oqwVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{this, str})).booleanValue();
        }
        if (this.c && str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(this.f1754a, str);
            if (file.isFile()) {
                z = file.delete();
            }
            if ((z || !file.exists()) && (oqwVar = this.d.get(str)) != null) {
                String str2 = i;
                v7t.a(str2, "delete success");
                pqw.d(3, oqwVar, this.f);
                this.d.remove(str);
                if (v7t.h()) {
                    v7t.a(str2, "delete time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                return true;
            }
        }
        return z;
    }

    public synchronized boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            File file = new File(this.b, "wv_web_info.dat");
            if (!file.exists()) {
                new File(this.b).mkdirs();
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    String str = i;
                    v7t.d(str, "init createNewFile:" + e.getMessage());
                    return false;
                }
            }
            new File(this.f1754a).mkdirs();
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "rw");
                this.e = randomAccessFile;
                if (this.f == null) {
                    this.f = randomAccessFile.getChannel();
                }
                if (v7t.h()) {
                    String str2 = i;
                    v7t.a(str2, "lock success process is " + Process.myPid());
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!f()) {
                    return false;
                }
                if (v7t.h()) {
                    String str3 = i;
                    v7t.a(str3, "init time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                this.c = true;
                k(this.h);
                if (this.d.size() == 0) {
                    e();
                }
            } catch (Exception e2) {
                String str4 = i;
                v7t.d(str4, "init fInfoOs RandomAccessFile:" + e2.getMessage());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(tb.oqw r10, java.nio.ByteBuffer r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.cache.WVFileCache.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "6426fda"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r1] = r10
            r5[r0] = r11
            java.lang.Object r10 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001f:
            if (r10 == 0) goto L_0x00bc
            java.lang.String r3 = r10.c
            if (r3 != 0) goto L_0x0027
            goto L_0x00bc
        L_0x0027:
            boolean r4 = tb.v7t.h()
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = android.taobao.windvane.cache.WVFileCache.i
            java.lang.String r5 = "write:"
            java.lang.String r5 = r5.concat(r3)
            tb.v7t.a(r4, r5)
        L_0x0039:
            boolean r4 = r9.c
            if (r4 == 0) goto L_0x00bc
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r9.f1754a
            r4.<init>(r5, r3)
            boolean r11 = tb.sb9.g(r4, r11)     // Catch: NotEnoughSpace -> 0x0049
            goto L_0x007b
        L_0x0049:
            r5 = move-exception
            java.lang.String r6 = android.taobao.windvane.cache.WVFileCache.i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "write error. fileName="
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r8 = ". NotEnoughSpace: "
            r7.append(r8)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            tb.v7t.d(r6, r5)
            boolean r5 = r9.g
            if (r5 == 0) goto L_0x007a
            r9.e()
            boolean r11 = tb.sb9.g(r4, r11)     // Catch: NotEnoughSpace -> 0x0076
            goto L_0x007b
        L_0x0076:
            r11 = move-exception
            r11.printStackTrace()
        L_0x007a:
            r11 = 0
        L_0x007b:
            if (r11 == 0) goto L_0x00bc
            java.util.Map<java.lang.String, tb.oqw> r11 = r9.d
            java.lang.Object r11 = r11.get(r3)
            tb.oqw r11 = (tb.oqw) r11
            if (r11 == 0) goto L_0x00a3
            java.lang.String r2 = android.taobao.windvane.cache.WVFileCache.i
            java.lang.String r4 = "writed success, file exist"
            tb.v7t.a(r2, r4)
            long r4 = r11.h
            r10.h = r4
            java.nio.channels.FileChannel r11 = r9.f
            tb.oqw r10 = tb.pqw.d(r0, r10, r11)
            java.util.Map<java.lang.String, tb.oqw> r11 = r9.d
            tb.oqw r10 = r10.b()
            r11.put(r3, r10)
            goto L_0x00bb
        L_0x00a3:
            java.lang.String r11 = android.taobao.windvane.cache.WVFileCache.i
            java.lang.String r0 = "writed success, file do not exist"
            tb.v7t.a(r11, r0)
            r11 = 4
            java.nio.channels.FileChannel r0 = r9.f
            tb.oqw r10 = tb.pqw.d(r11, r10, r0)
            java.util.Map<java.lang.String, tb.oqw> r11 = r9.d
            tb.oqw r10 = r10.b()
            r11.put(r3, r10)
        L_0x00bb:
            return r1
        L_0x00bc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.cache.WVFileCache.l(tb.oqw, java.nio.ByteBuffer):boolean");
    }

    public final boolean f() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93289978", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) this.f.size());
            this.f.read(allocate);
            bArr = allocate.array();
        } catch (IOException e) {
            String str = i;
            v7t.d(str, "collectFiles fInfoChannel.read error:" + e.getMessage());
            bArr = null;
        }
        if (v7t.h()) {
            String str2 = i;
            v7t.a(str2, "collectFiles read fileinfo:" + (System.currentTimeMillis() - currentTimeMillis));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (bArr == null) {
            return false;
        }
        v7t.a("collectFiles", "read fileinfo success");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 60;
        boolean z = false;
        int i3 = 0;
        while (i2 < bArr.length) {
            if (bArr[i2] == 10) {
                int i4 = i2 - i3;
                oqw b = pqw.b(bArr, i3, i4);
                if (b != null) {
                    String str3 = b.c;
                    if (!this.d.containsKey(str3)) {
                        b.h = byteArrayOutputStream.size();
                        this.d.put(str3, b);
                        byteArrayOutputStream.write(bArr, i3, i4 + 1);
                        i3 = i2 + 1;
                        i2 += 60;
                    }
                }
                z = true;
                i3 = i2 + 1;
                i2 += 60;
            }
            i2++;
        }
        if (v7t.h()) {
            String str4 = i;
            v7t.a(str4, "parse fileinfo:" + (System.currentTimeMillis() - currentTimeMillis2));
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        if (z) {
            try {
                this.f.truncate(0L);
                this.f.position(0L);
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                wrap.position(0);
                this.f.write(wrap);
            } catch (IOException e2) {
                String str5 = i;
                v7t.d(str5, "collectFiles fInfoChannel.write error:" + e2.getMessage());
            }
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        if (v7t.h()) {
            String str6 = i;
            v7t.a(str6, "write fileinfo:" + (System.currentTimeMillis() - currentTimeMillis3));
        }
        return true;
    }
}
