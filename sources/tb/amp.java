package tb;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class amp implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<String, Object> f15844a;
    public final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> b;
    public j c;
    public boolean d;
    public final File e;
    public final String f;
    public int g;
    public FileChannel h;
    public MappedByteBuffer i;
    public final Handler j;
    public final Object k;
    public final Object l;
    public int m;
    public final Vector<SharedPreferences.Editor> n;
    public long o;
    public final Runnable p;
    public final l q;

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
                return;
            }
            try {
                File file = new File(amp.a(amp.this));
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            amp ampVar = amp.this;
            amp ampVar2 = amp.this;
            amp.c(ampVar, new j(amp.a(ampVar2), 2));
            if (amp.d(amp.this).size() > 0) {
                amp.b(amp.this).startWatching();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            int s = amp.this.s();
            if (s > 0 && s != amp.f(amp.this)) {
                amp.g(amp.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15847a;

        public c(boolean z) {
            this.f15847a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                amp.g(amp.this, this.f15847a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/util/SharedPreferencesNewImpl$4");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                amp.g(amp.this, ((Boolean) a()).booleanValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (amp.this) {
                amp.h(amp.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static float a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ce24e4b4", new Object[]{bArr})).floatValue();
            }
            return ByteBuffer.wrap(bArr).getFloat();
        }

        public static byte[] b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e75a598", new Object[]{new Float(f)});
            }
            return ByteBuffer.allocate(4).putFloat(f).array();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static int a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b3e1ce8a", new Object[]{bArr})).intValue();
            }
            return ByteBuffer.wrap(bArr).getInt();
        }

        public static byte[] b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("2b667402", new Object[]{new Integer(i)});
            }
            return ByteBuffer.allocate(4).putInt(i).array();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static long a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("98ef05e4", new Object[]{bArr})).longValue();
            }
            return ByteBuffer.wrap(bArr).getLong();
        }

        public static byte[] b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("43886f4", new Object[]{new Long(j)});
            }
            return ByteBuffer.allocate(8).putLong(j).array();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class i implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, Object> f15849a = new HashMap<>();
        public boolean b;

        public i() {
        }

        public boolean a() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40cd4c0d", new Object[]{this})).booleanValue();
            }
            synchronized (this) {
                z = this.b;
                this.b = false;
            }
            return z;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                amp.e(amp.this, this, false, false, true);
            }
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("2718fe55", new Object[]{this});
            }
            synchronized (this) {
                hashMap = this.f15849a;
            }
            return hashMap;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            synchronized (this) {
                this.b = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            amp.e(amp.this, this, false, true, false);
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            synchronized (this) {
                this.f15849a.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            synchronized (this) {
                this.f15849a.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            synchronized (this) {
                this.f15849a.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            synchronized (this) {
                this.f15849a.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this) {
                this.f15849a.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            throw new RuntimeException("putStringSet is not supported!");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            synchronized (this) {
                this.f15849a.put(str, null);
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class j extends FileObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/util/SharedPreferencesNewImpl$FileMonitor");
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            } else if (amp.d(amp.this).size() > 0) {
                amp.i(amp.this);
            } else {
                stopWatching();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface k {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f15851a;

        public Object a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("9b105a6b", new Object[]{this});
            }
            return this.f15851a;
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd9f6c37", new Object[]{this, obj});
            } else {
                this.f15851a = obj;
            }
        }
    }

    public amp(File file) {
        this(file, 0, null);
    }

    public static /* synthetic */ String a(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24b1b518", new Object[]{ampVar});
        }
        return ampVar.f;
    }

    public static /* synthetic */ j b(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("87ab5dbc", new Object[]{ampVar});
        }
        return ampVar.c;
    }

    public static /* synthetic */ j c(amp ampVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("5613de35", new Object[]{ampVar, jVar});
        }
        ampVar.c = jVar;
        return jVar;
    }

    public static /* synthetic */ ArrayList d(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("32906d20", new Object[]{ampVar});
        }
        return ampVar.b;
    }

    public static /* synthetic */ void e(amp ampVar, SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf28f94", new Object[]{ampVar, editor, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            ampVar.M(editor, z, z2, z3);
        }
    }

    public static /* synthetic */ int f(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92d86ff7", new Object[]{ampVar})).intValue();
        }
        return ampVar.g;
    }

    public static /* synthetic */ void g(amp ampVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f5bb51", new Object[]{ampVar, new Boolean(z)});
        } else {
            ampVar.N(z);
        }
    }

    public static /* synthetic */ void h(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9a77c2", new Object[]{ampVar});
        } else {
            ampVar.B();
        }
    }

    public static /* synthetic */ void i(amp ampVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb7ba1", new Object[]{ampVar});
        } else {
            ampVar.Q();
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a95f1de", new Object[]{this});
        } else if (!this.d) {
            z(false);
            this.d = true;
            notifyAll();
        }
    }

    public final FileLock C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileLock) ipChange.ipc$dispatch("a082f61", new Object[]{this, new Boolean(z)});
        }
        FileChannel fileChannel = this.h;
        FileLock fileLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (fileLock == null) {
                try {
                    fileLock = this.h.tryLock();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (fileLock == null) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (SystemClock.elapsedRealtime() - elapsedRealtime > 10000) {
                    return fileLock;
                }
            }
            return fileLock;
        }
        try {
            return fileChannel.tryLock();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final boolean D(SharedPreferences.Editor editor, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f28534cd", new Object[]{this, editor, map, new Boolean(z)})).booleanValue();
        }
        if (editor == null) {
            return false;
        }
        i iVar = (i) editor;
        boolean a2 = iVar.a();
        if (a2) {
            map.clear();
        }
        HashMap<String, Object> b2 = iVar.b();
        if (b2.size() != 0) {
            synchronized (editor) {
                try {
                    for (Map.Entry<String, Object> entry : b2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            map.remove(key);
                        } else {
                            if (map.containsKey(key)) {
                                map.remove(key);
                            }
                            map.put(key, value);
                        }
                        if (!z) {
                            F(key);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (a2) {
            return true;
        } else {
            return false;
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176a86d2", new Object[]{this});
            return;
        }
        synchronized (this.f15844a) {
            try {
                if (this.n.size() > 0) {
                    Iterator<SharedPreferences.Editor> it = this.n.iterator();
                    while (it.hasNext()) {
                        D(it.next(), this.f15844a, true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e486c72", new Object[]{this, str});
        } else if (this.b.size() > 0) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.b.get(i2);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    public final byte[] G() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d16be2aa", new Object[]{this});
        }
        Pair<Integer, byte[][]> q = q();
        int intValue = ((Integer) q.first).intValue() + 10 + ((byte[][]) q.second).length;
        if (intValue > 2097152) {
            intValue = 2097152;
        }
        byte[] bArr = new byte[intValue];
        byte[] b2 = g.b(intValue);
        System.arraycopy(b2, 0, bArr, 0, b2.length);
        int length = b2.length;
        bArr[length] = r(b2);
        int i2 = length + 1;
        byte[] b3 = g.b(w());
        System.arraycopy(b3, 0, bArr, i2, b3.length);
        int length2 = i2 + b3.length;
        bArr[length2] = r(b3);
        int i3 = length2 + 1;
        byte[][] bArr2 = (byte[][]) q.second;
        int length3 = bArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                break;
            }
            byte[] bArr3 = bArr2[i4];
            if (bArr3 != null) {
                if (bArr3.length + i3 + 1 <= 2097152) {
                    System.arraycopy(bArr3, 0, bArr, i3, bArr3.length);
                    int length4 = i3 + bArr3.length;
                    bArr[length4] = r(bArr3);
                    i3 = length4 + 1;
                } else {
                    StringBuilder sb = new StringBuilder("Write too much data in ");
                    File file = this.e;
                    if (file != null) {
                        str = file.getAbsolutePath();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    Log.e("SharedPreferencesNew", sb.toString());
                }
            }
            i4++;
        }
        return bArr;
    }

    public final boolean H(byte[] bArr, boolean z) {
        LinkedHashMap linkedHashMap;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe0c1e46", new Object[]{this, bArr, new Boolean(z)})).booleanValue();
        }
        if (z) {
            linkedHashMap = new LinkedHashMap(this.f15844a);
        } else {
            linkedHashMap = null;
        }
        synchronized (this.f15844a) {
            if (z) {
                try {
                    if (this.g > 0) {
                        this.f15844a.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!(bArr == null || bArr.length == 0)) {
                int i2 = 0;
                boolean z3 = true;
                while (true) {
                    if (i2 >= bArr.length) {
                        z2 = z3;
                        break;
                    }
                    try {
                        Pair<byte[], Integer> v = v(bArr, i2);
                        Pair<byte[], Integer> v2 = v(bArr, ((Integer) v.second).intValue());
                        int intValue = ((Integer) v2.second).intValue();
                        byte b2 = bArr[intValue];
                        byte b3 = bArr[intValue + 1];
                        int i3 = intValue + 2;
                        if (b3 != 18 && b3 != r(new byte[]{b2})) {
                            break;
                        } else if (!m(b2)) {
                            i2 = i3;
                            z3 = false;
                        } else {
                            Object t = t((byte[]) v2.first, b2);
                            Object obj = v.first;
                            if (!(obj == null || ((byte[]) obj).length <= 0 || t == null)) {
                                String str = new String((byte[]) obj);
                                if (z || !this.f15844a.containsKey(str)) {
                                    this.f15844a.put(str, t);
                                }
                            }
                            i2 = i3;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!z2 && z) {
                    this.f15844a.putAll(linkedHashMap);
                }
                return z2;
            }
            return true;
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2031f49", new Object[]{this});
        } else if (this.i != null) {
            synchronized (this.k) {
                try {
                    int p = p();
                    if (p > this.i.capacity()) {
                        j(p + 1024);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final boolean J(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c70a279", new Object[]{this, mappedByteBuffer, bArr})).booleanValue();
        }
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        if (mappedByteBuffer.position() + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    public final void K(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03599dc", new Object[]{this, mappedByteBuffer, bArr});
        } else if (mappedByteBuffer != null && bArr != null && bArr.length != 0) {
            if (mappedByteBuffer.position() + bArr.length >= mappedByteBuffer.capacity()) {
                mappedByteBuffer = j(mappedByteBuffer.position() + bArr.length + 1024);
            }
            mappedByteBuffer.put(bArr);
        }
    }

    public final void L(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20728b9", new Object[]{this, closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void M(SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99e2a95", new Object[]{this, editor, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (editor != null) {
            synchronized (this.f15844a) {
                try {
                    this.m = 0;
                    if (D(editor, this.f15844a, false)) {
                        this.n.add(editor);
                        if (z2) {
                            N(z);
                            return;
                        }
                        if (z3) {
                            j2 = 1000;
                        } else {
                            j2 = 0;
                        }
                        this.q.b(Boolean.valueOf(z));
                        Message obtain = Message.obtain(this.j, this.q);
                        obtain.what = 21310;
                        this.j.sendMessageDelayed(obtain, j2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5779bf4", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.l) {
            FileLock C = C(false);
            if (C != null) {
                if (R()) {
                    E();
                    F(null);
                }
                synchronized (this.f15844a) {
                    if (this.n.size() <= 0) {
                        try {
                            C.release();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return;
                    }
                    O(G(), z);
                    l();
                    try {
                        C.release();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                int i2 = this.m;
                this.m = 1 + i2;
                if (i2 < 6) {
                    this.j.postDelayed(new c(z), 2000L);
                }
            }
        }
    }

    public final void O(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb83f95b", new Object[]{this, bArr, new Boolean(z)});
            return;
        }
        synchronized (this.k) {
            try {
                this.i.position(0);
                K(this.i, bArr);
                if (z) {
                    this.i.force();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90da1f6", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.d = false;
        }
        this.j.post(new e());
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0881bb", new Object[]{this});
        } else if (SystemClock.elapsedRealtime() - this.o > 60) {
            this.o = SystemClock.elapsedRealtime();
            this.j.removeCallbacks(this.p);
            this.j.post(this.p);
        }
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73745236", new Object[]{this})).booleanValue();
        }
        int s = s();
        if (s <= 0 || s == this.g) {
            return false;
        }
        z(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean containsKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        k();
        synchronized (this.f15844a) {
            containsKey = this.f15844a.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        k();
        return new i();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        k();
        synchronized (this.f15844a) {
            hashMap = new HashMap(this.f15844a);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        k();
        synchronized (this.f15844a) {
            try {
                Boolean bool = (Boolean) this.f15844a.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException unused) {
                return z;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f2)})).floatValue();
        }
        k();
        synchronized (this.f15844a) {
            try {
                Float f3 = (Float) this.f15844a.get(str);
                if (f3 != null) {
                    f2 = f3.floatValue();
                }
            } catch (ClassCastException unused) {
                return f2;
            }
        }
        return f2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i2)})).intValue();
        }
        k();
        synchronized (this.f15844a) {
            try {
                Integer num = (Integer) this.f15844a.get(str);
                if (num != null) {
                    i2 = num.intValue();
                }
            } catch (ClassCastException unused) {
                return i2;
            }
        }
        return i2;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j2)})).longValue();
        }
        k();
        synchronized (this.f15844a) {
            try {
                Long l2 = (Long) this.f15844a.get(str);
                if (l2 != null) {
                    j2 = l2.longValue();
                }
            } catch (ClassCastException unused) {
                return j2;
            }
        }
        return j2;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        k();
        synchronized (this.f15844a) {
            try {
                try {
                    String str3 = (String) this.f15844a.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (ClassCastException unused) {
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        throw new RuntimeException("putStringSet is not supported!");
    }

    public final MappedByteBuffer j(int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MappedByteBuffer) ipChange.ipc$dispatch("a6c02075", new Object[]{this, new Integer(i2)});
        }
        MappedByteBuffer mappedByteBuffer = this.i;
        if (mappedByteBuffer != null) {
            i3 = mappedByteBuffer.position();
        }
        try {
            this.i = this.h.map(FileChannel.MapMode.READ_WRITE, 0L, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MappedByteBuffer mappedByteBuffer2 = this.i;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.position(i3);
        }
        return this.i;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365afdec", new Object[]{this});
            return;
        }
        synchronized (this) {
            while (!this.d) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        Throwable th;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8414949", new Object[]{this});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(this.f);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
        try {
            fileChannel = fileOutputStream.getChannel();
            this.h.transferTo(0L, this.i.capacity(), fileChannel);
        } catch (Throwable th3) {
            fileChannel = fileOutputStream;
            fileOutputStream = fileOutputStream;
            th = th3;
            try {
                th.printStackTrace();
            } finally {
                L(fileOutputStream);
                L(fileChannel);
            }
        }
    }

    public boolean m(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6738e09f", new Object[]{this, new Byte(b2)})).booleanValue();
        }
        if (b2 == 4 || b2 == 2 || b2 == 1 || b2 == 3 || b2 == 5) {
            return true;
        }
        return false;
    }

    public final byte n(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36de1d3", new Object[]{this, bArr})).byteValue();
        }
        byte b2 = 0;
        for (byte b3 : bArr) {
            b2 = (byte) (b2 ^ b3);
        }
        return b2;
    }

    public final byte[] o(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6751f245", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                return ((String) obj).getBytes();
            }
            if (obj instanceof Boolean) {
                return new byte[]{((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0};
            }
            if (obj instanceof Float) {
                return f.b(((Float) obj).floatValue());
            }
            if (obj instanceof Integer) {
                return g.b(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return h.b(((Long) obj).longValue());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e384f103", new Object[]{this})).intValue();
        }
        if (this.i == null || this.h == null) {
            return -1;
        }
        synchronized (this.k) {
            try {
                this.i.position(0);
                byte[] bArr = new byte[4];
                J(this.i, bArr);
                int a2 = g.a(bArr);
                this.i.position(4);
                byte b2 = this.i.get();
                if (b2 != 18) {
                    if (b2 == r(bArr)) {
                    }
                    return -1;
                }
                if (a2 >= 0) {
                    if (a2 > 2097152) {
                        a2 = 2097152;
                    }
                    return a2;
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Pair<Integer, byte[][]> q() {
        byte[][] bArr;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c8564cfc", new Object[]{this});
        }
        synchronized (this.f15844a) {
            bArr = new byte[this.f15844a.size() * 5];
            arrayList = new ArrayList(this.f15844a.entrySet());
            this.n.clear();
        }
        int i2 = 0;
        int i3 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Map.Entry entry = (Map.Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(str == null || str.trim().length() <= 0 || value == null)) {
                byte[] bytes = str.getBytes();
                byte[] b2 = g.b(bytes.length);
                bArr[i3] = b2;
                bArr[i3 + 1] = bytes;
                int length = i2 + b2.length + bytes.length;
                byte[] o = o(value);
                byte[] b3 = g.b(o.length);
                bArr[i3 + 2] = b3;
                bArr[i3 + 3] = o;
                byte[] bArr2 = new byte[1];
                bArr2[0] = (byte) u(value);
                bArr[i3 + 4] = bArr2;
                i2 = length + b3.length + o.length + 1;
                i3 += 5;
            }
        }
        return new Pair<>(Integer.valueOf(i2), bArr);
    }

    public final byte r(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b126784", new Object[]{this, bArr})).byteValue();
        }
        return n(bArr);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
        } else if (onSharedPreferenceChangeListener != null) {
            this.b.add(onSharedPreferenceChangeListener);
            j jVar = this.c;
            if (jVar != null) {
                jVar.startWatching();
            }
        }
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58709fc5", new Object[]{this})).intValue();
        }
        if (this.i == null) {
            return -1;
        }
        synchronized (this.k) {
            try {
                this.i.position(5);
                byte[] bArr = new byte[4];
                J(this.i, bArr);
                int a2 = g.a(bArr);
                this.i.position(9);
                byte b2 = this.i.get();
                if (b2 != 18) {
                    if (b2 == r(bArr)) {
                    }
                    return -1;
                }
                if (a2 >= 0) {
                    return a2;
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object t(byte[] bArr, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("98252763", new Object[]{this, bArr, new Integer(i2)});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            if (i2 == 5) {
                return new String(bArr);
            }
            if (i2 == 4) {
                if (bArr[0] != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (i2 == 2) {
                return Float.valueOf(f.a(bArr));
            } else {
                if (i2 == 1) {
                    return Integer.valueOf(g.a(bArr));
                }
                if (i2 == 3) {
                    return Long.valueOf(h.a(bArr));
                }
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final int u(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd26265", new Object[]{this, obj})).intValue();
        }
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof Boolean) {
            return 4;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        return 0;
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
        } else if (onSharedPreferenceChangeListener != null) {
            this.b.remove(onSharedPreferenceChangeListener);
            if (this.c != null && this.b.size() <= 0) {
                this.c.stopWatching();
            }
        }
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecf28cb1", new Object[]{this})).intValue();
        }
        int i2 = (this.g + 1) % Integer.MAX_VALUE;
        this.g = i2;
        return i2;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5409460", new Object[]{this});
        } else if (this.i != null) {
            byte[] bArr = new byte[10];
            byte[] b2 = g.b(0);
            System.arraycopy(b2, 0, bArr, 0, 4);
            bArr[4] = r(b2);
            byte[] b3 = g.b(0);
            System.arraycopy(b3, 0, bArr, 5, 4);
            bArr[9] = r(b3);
            this.i.position(0);
            this.i.put(bArr);
        }
    }

    public final void z(boolean z) {
        FileLock fileLock;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe1a07", new Object[]{this, new Boolean(z)});
            return;
        }
        byte[] bArr = null;
        if (z) {
            fileLock = null;
        } else {
            fileLock = C(true);
        }
        if (fileLock != null || z) {
            try {
                I();
                MappedByteBuffer mappedByteBuffer = this.i;
                if (!(mappedByteBuffer == null || mappedByteBuffer.capacity() == 0)) {
                    long p = p();
                    if (p <= 10) {
                        try {
                            z2 = H(null, true);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (!z2 || this.g < 0) {
                            A();
                        }
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                                return;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        int s = s();
                        this.g = s;
                        if (s > 0) {
                            synchronized (this.k) {
                                this.i.position(10);
                                bArr = new byte[((int) p) - 10];
                                J(this.i, bArr);
                            }
                        }
                        try {
                            z2 = H(bArr, true);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        if (!z2 || (bArr == null && this.g < 0)) {
                            A();
                        }
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                                return;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                try {
                    z2 = H(null, true);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                if (!z2 || this.g < 0) {
                    A();
                }
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    z2 = H(bArr, true);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                if (!z2 || (bArr == null && this.g < 0)) {
                    A();
                }
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        } else if (!z) {
            A();
        }
    }

    public amp(File file, int i2, k kVar) {
        this.f15844a = new LinkedHashMap<>();
        this.b = new ArrayList<>();
        this.d = true;
        this.k = new Object();
        this.l = new Object();
        this.n = new Vector<>();
        this.p = new b();
        this.q = new d();
        HandlerThread handlerThread = new HandlerThread(file.getName());
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.j = handler;
        this.e = file;
        this.f = file.getAbsolutePath() + ".bak";
        if (x()) {
            P();
        }
        handler.post(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.amp.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "48053c63"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r12
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: all -> 0x0070
            java.lang.String r4 = r12.f     // Catch: all -> 0x0070
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch: all -> 0x0070
            r4 = 4
            byte[] r5 = new byte[r4]     // Catch: all -> 0x0053
            r3.read(r5, r0, r4)     // Catch: all -> 0x0053
            int r4 = tb.amp.g.a(r5)     // Catch: all -> 0x0053
            r5 = 10
            if (r4 > r5) goto L_0x003e
            r12.L(r3)
            r12.H(r2, r0)     // Catch: Exception -> 0x0039
            goto L_0x003d
        L_0x0039:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003d:
            return r0
        L_0x003e:
            r6 = 2097152(0x200000, float:2.938736E-39)
            if (r4 <= r6) goto L_0x0044
            r4 = 2097152(0x200000, float:2.938736E-39)
        L_0x0044:
            long r6 = (long) r4
            long r8 = r3.length()     // Catch: all -> 0x0053
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0058
            long r6 = r3.length()     // Catch: all -> 0x0053
            int r4 = (int) r6     // Catch: all -> 0x0053
            goto L_0x0058
        L_0x0053:
            r4 = move-exception
            r11 = r3
            r3 = r2
            r2 = r11
            goto L_0x0072
        L_0x0058:
            int r4 = r4 - r5
            byte[] r2 = new byte[r4]     // Catch: all -> 0x0053
            r4 = 10
            r3.seek(r4)     // Catch: all -> 0x0053
            r3.read(r2)     // Catch: all -> 0x0053
            r12.L(r3)
            boolean r1 = r12.H(r2, r0)     // Catch: Exception -> 0x006b
            goto L_0x007c
        L_0x006b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x007c
        L_0x0070:
            r4 = move-exception
            r3 = r2
        L_0x0072:
            r4.printStackTrace()     // Catch: all -> 0x007d
            r12.L(r2)
            boolean r1 = r12.H(r3, r0)     // Catch: Exception -> 0x006b
        L_0x007c:
            return r1
        L_0x007d:
            r1 = move-exception
            r12.L(r2)
            r12.H(r3, r0)     // Catch: Exception -> 0x0085
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0089:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.amp.A():boolean");
    }

    public final boolean x() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a82125fb", new Object[]{this})).booleanValue();
        }
        if (this.i != null) {
            return true;
        }
        try {
            if (!this.e.exists()) {
                this.e.getParentFile().mkdirs();
                this.e.createNewFile();
                z = new File(this.f).exists();
            } else if (this.e.length() == 0) {
                z = false;
            }
            this.h = new RandomAccessFile(this.e, "rw").getChannel();
            j(10);
            if (!z) {
                y();
            }
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final Pair<byte[], Integer> v(byte[] bArr, int i2) throws Exception {
        int i3;
        int i4;
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dbfb7fe", new Object[]{this, bArr, new Integer(i2)});
        }
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, i2, bArr3, 0, 4);
        byte b2 = bArr[4 + i2];
        if (b2 == 18 || b2 == r(bArr3)) {
            int i5 = i2 + 5;
            int a2 = g.a(bArr3);
            if (a2 < 0 || (i3 = i5 + a2) >= bArr.length || a2 > 2097152) {
                throw new Exception("length string is invalid");
            }
            if (a2 == 0) {
                i4 = i2 + 6;
                bArr2 = null;
            } else {
                byte[] bArr4 = new byte[a2];
                System.arraycopy(bArr, i5, bArr4, 0, a2);
                byte b3 = bArr[i3];
                if (b3 == 18 || b3 == r(bArr4)) {
                    i4 = i3 + 1;
                    bArr2 = bArr4;
                } else {
                    throw new Exception("Stored bytes' finish mark missing");
                }
            }
            return new Pair<>(bArr2, Integer.valueOf(i4));
        }
        throw new Exception("length string's finish mark missing");
    }
}
