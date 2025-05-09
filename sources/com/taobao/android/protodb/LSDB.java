package com.taobao.android.protodb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.gp;
import tb.jpf;
import tb.k3g;
import tb.kkj;
import tb.oo1;
import tb.oti;
import tb.rdg;
import tb.v3g;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LSDB extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int COMPACT_LEVEL_AGGRESSIVE = 2;
    public static int COMPACT_LEVEL_MINOR = 0;
    public static int COMPACT_LEVEL_NORMAL = 1;
    private static final long MIN_AVAILABLE_STORAGE = 1073741824;
    private static final long MIN_USAGE_STORAGE = 134217728;
    private static final int SIZE_OF_BOOL = 1;
    private static final int SIZE_OF_DOUBLE = 8;
    private static final int SIZE_OF_FLOAT = 4;
    private static final int SIZE_OF_INT = 4;
    private static final int SIZE_OF_LONG = 8;
    private static final String TO_BE_CLEAR_TAG = ".clear";
    private static final ConcurrentLinkedQueue<LSDB> sLSDBInstances = new ConcurrentLinkedQueue<>();
    private final String path;
    private final int sdkVersion;
    private final String tag = "ProtoDB";

    public LSDB(long j, String str, int i) {
        super(j);
        this.path = str;
        this.sdkVersion = i;
    }

    public static void compactAll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cbae9e", new Object[]{new Integer(i)});
            return;
        }
        Iterator<LSDB> it = sLSDBInstances.iterator();
        while (it.hasNext()) {
            it.next().forceCompact(i);
        }
    }

    private static long getAvailableInternalMemorySize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7670982d", new Object[0])).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    private static long getFolderDirectFileSize(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38335e5c", new Object[]{file})).longValue();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                j += file2.length();
            }
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(LSDB lsdb, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/protodb/LSDB");
    }

    private native boolean nativeClose(long j);

    private native boolean nativeCompact(long j);

    private native boolean nativeContains(long j, String str);

    private native boolean nativeDelete(long j, String str);

    private native byte[] nativeGetBinary(long j, String str);

    private native boolean nativeGetBinaryToBuffer(long j, String str, byte[] bArr, int i);

    private native int nativeGetDataSize(long j, String str);

    private native boolean nativeInsert(long j, String str, int i, byte[] bArr, int i2);

    private native String[] nativeKeyIterator(long j, String str, String str2);

    private static native long nativeOpen(String str, Config config);

    public static LSDB open(String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("95df478", new Object[]{str, config});
        }
        Application a2 = gp.a();
        if (a2 != null) {
            return open(a2, str, config);
        }
        throw new RuntimeException("Failed to get android context!");
    }

    private static LSDB openInternal(String str, Config config, int i) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("7bbdad88", new Object[]{str, config, new Integer(i)});
        }
        if (new File(str, TO_BE_CLEAR_TAG).exists() && (listFiles = new File(str).listFiles()) != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        long nativeOpen = nativeOpen(str, config);
        if (nativeOpen == 0) {
            return null;
        }
        LSDB lsdb = new LSDB(nativeOpen, str, i);
        sLSDBInstances.add(lsdb);
        return lsdb;
    }

    public static int tryLoadNativeLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5306abdd", new Object[0])).intValue();
        }
        return kkj.b();
    }

    public boolean close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ba683", new Object[]{this})).booleanValue();
        }
        sLSDBInstances.remove(this);
        return nativeClose(getNativePointer());
    }

    public boolean contains(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ea7e296", new Object[]{this, k3gVar})).booleanValue();
        }
        return nativeContains(getNativePointer(), k3gVar.a());
    }

    public boolean delete(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad8d1c22", new Object[]{this, k3gVar})).booleanValue();
        }
        return nativeDelete(getNativePointer(), k3gVar.a());
    }

    public boolean forceCompact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75df98a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == COMPACT_LEVEL_NORMAL) {
            return nativeCompact(getNativePointer());
        }
        if (i != COMPACT_LEVEL_AGGRESSIVE) {
            return true;
        }
        try {
            return new File(this.path, TO_BE_CLEAR_TAG).createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public byte[] getBinary(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("67dbdeb3", new Object[]{this, k3gVar});
        }
        return nativeGetBinary(getNativePointer(), k3gVar.a());
    }

    public boolean getBinaryToBuffer(k3g k3gVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b040b130", new Object[]{this, k3gVar, bArr})).booleanValue();
        }
        return nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, bArr.length);
    }

    public boolean getBool(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61c24357", new Object[]{this, k3gVar})).booleanValue();
        }
        byte[] bArr = new byte[1];
        if (!nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, 1) || ByteBuffer.wrap(bArr).get() == 0) {
            return false;
        }
        return true;
    }

    public int getDataSize(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1261fa7", new Object[]{this, k3gVar})).intValue();
        }
        return nativeGetDataSize(getNativePointer(), k3gVar.a());
    }

    public double getDouble(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e937d728", new Object[]{this, k3gVar})).doubleValue();
        }
        byte[] bArr = new byte[8];
        return nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, 8) ? ByteBuffer.wrap(bArr).getDouble() : vu3.b.GEO_NOT_SUPPORT;
    }

    public float getFloat(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c427bd89", new Object[]{this, k3gVar})).floatValue();
        }
        byte[] bArr = new byte[4];
        if (nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, 4)) {
            return ByteBuffer.wrap(bArr).getFloat();
        }
        return 0.0f;
    }

    public int getInt(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f76f01f", new Object[]{this, k3gVar})).intValue();
        }
        byte[] bArr = new byte[4];
        if (nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, 4)) {
            return ByteBuffer.wrap(bArr).getInt();
        }
        return 0;
    }

    public long getLong(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("553edd9", new Object[]{this, k3gVar})).longValue();
        }
        byte[] bArr = new byte[8];
        if (nativeGetBinaryToBuffer(getNativePointer(), k3gVar.a(), bArr, 8)) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return 0L;
    }

    public int getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("541225ae", new Object[]{this})).intValue();
        }
        return this.sdkVersion;
    }

    public String getString(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcc07c66", new Object[]{this, k3gVar});
        }
        byte[] nativeGetBinary = nativeGetBinary(getNativePointer(), k3gVar.a());
        if (nativeGetBinary == null || nativeGetBinary.length <= 0) {
            return null;
        }
        return new String(nativeGetBinary, Charset.forName("UTF-8"));
    }

    public boolean insertBinary(k3g k3gVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5903c98", new Object[]{this, k3gVar, bArr})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, bArr, bArr != null ? bArr.length : 0);
    }

    public boolean insertBool(k3g k3gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb091e2", new Object[]{this, k3gVar, new Boolean(z)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, new byte[]{z ? (byte) 1 : (byte) 0}, 1);
    }

    public boolean insertDouble(k3g k3gVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f1d05", new Object[]{this, k3gVar, new Double(d)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(8).putDouble(d).array(), 8);
    }

    public boolean insertFloat(k3g k3gVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0dda4ee", new Object[]{this, k3gVar, new Float(f)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(4).putFloat(f).array(), 4);
    }

    public boolean insertInt(k3g k3gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38585cbe", new Object[]{this, k3gVar, new Integer(i)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(4).putInt(i).array(), 4);
    }

    public boolean insertLong(k3g k3gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a53fd80", new Object[]{this, k3gVar, new Long(j)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(8).putLong(j).array(), 8);
    }

    public boolean insertStream(k3g k3gVar, int i, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85f5d80", new Object[]{this, k3gVar, new Integer(i), inputStream})).booleanValue();
        }
        if (inputStream != null) {
            try {
                int available = inputStream.available();
                byte[] bArr = new byte[available];
                if (inputStream.read(bArr, 0, inputStream.available()) == available) {
                    return insertBinary(k3gVar, i, bArr);
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean insertString(k3g k3gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b755fab", new Object[]{this, k3gVar, str})).booleanValue();
        }
        if (str == null) {
            return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, null, 0);
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        return nativeInsert(getNativePointer(), k3gVar.a(), Integer.MAX_VALUE, bytes, bytes.length);
    }

    public jpf<k3g> keyIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpf) ipChange.ipc$dispatch("79e68d7b", new Object[]{this}) : new v3g(nativeKeyIterator(getNativePointer(), null, null));
    }

    public static boolean downgradeOn32Bit(Context context) {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c929eb", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit) {
                return Objects.equals(context.getSharedPreferences(oo1.ORANGE_NAMESPACE, 0).getString("downgradeOn32Bit", "false"), "true");
            }
        }
        return false;
    }

    public boolean insertBinary(k3g k3gVar, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb8564e1", new Object[]{this, k3gVar, new Integer(i), bArr})).booleanValue();
        }
        return nativeInsert(getNativePointer(), k3gVar.a(), i, bArr, bArr != null ? bArr.length : 0);
    }

    public jpf<k3g> keyIterator(k3g k3gVar, k3g k3gVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpf) ipChange.ipc$dispatch("833a0053", new Object[]{this, k3gVar, k3gVar2}) : new v3g(nativeKeyIterator(getNativePointer(), k3gVar.a(), k3gVar2.a()));
    }

    public static void compactAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53616505", new Object[0]);
            return;
        }
        Iterator<LSDB> it = sLSDBInstances.iterator();
        while (it.hasNext()) {
            LSDB next = it.next();
            File file = new File(next.path);
            if (file.exists()) {
                long availableInternalMemorySize = getAvailableInternalMemorySize();
                long folderDirectFileSize = getFolderDirectFileSize(file);
                if (availableInternalMemorySize < MIN_AVAILABLE_STORAGE && folderDirectFileSize > 536870912) {
                    next.forceCompact(COMPACT_LEVEL_AGGRESSIVE);
                } else if (folderDirectFileSize > MIN_AVAILABLE_STORAGE) {
                    next.forceCompact(COMPACT_LEVEL_AGGRESSIVE);
                } else {
                    next.forceCompact(COMPACT_LEVEL_NORMAL);
                }
            }
        }
    }

    public static void removeDB(String str) {
        Application a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d95d13", new Object[]{str});
            return;
        }
        if (gp.a() != null) {
            File[] listFiles = new File(a2.getFilesDir() + File.separator + "lsdb-" + str).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
                return;
            }
            return;
        }
        throw new RuntimeException("Failed to get android context!");
    }

    public static LSDB open(Context context, String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("4d3c2ef2", new Object[]{context, str, config});
        }
        int b = kkj.b();
        if (b < 0) {
            oti.a(str, "FAILED_TO_LOAD_LIBRARY");
            return new rdg(context);
        } else if (getAvailableInternalMemorySize() < MIN_USAGE_STORAGE) {
            oti.a(str, "NO_AVAILABLE_SPACE");
            return new rdg(context);
        } else {
            if (config == null) {
                config = new Config();
            }
            LSDB openInternal = openInternal(context.getFilesDir() + File.separator + "lsdb-" + str, config, b);
            return openInternal != null ? openInternal : new rdg(context);
        }
    }
}
