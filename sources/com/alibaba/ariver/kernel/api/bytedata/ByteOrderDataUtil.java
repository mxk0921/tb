package com.alibaba.ariver.kernel.api.bytedata;

import com.alibaba.ariver.kernel.api.bytedata.ByteArrayPools;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ByteOrderDataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BYTE_127 = 127;
    public static final int BYTE_2 = 2;
    public static final int BYTE_4 = 4;
    public static final int BYTE_8 = 8;

    /* renamed from: a  reason: collision with root package name */
    public static final ByteArrayPools.ByteArray2Pool f2432a = new ByteArrayPools.ByteArray2Pool();
    public static final ByteArrayPools.ByteArray4Pool b = new ByteArrayPools.ByteArray4Pool();
    public static final ByteArrayPools.ByteArray8Pool c = new ByteArrayPools.ByteArray8Pool();
    public static final ByteArrayPools.ByteArray127Pool d = new ByteArrayPools.ByteArray127Pool();

    @Deprecated
    public static boolean readBoolean(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52095bd", new Object[]{bufferedInputStream})).booleanValue();
        }
        if (bufferedInputStream.read() > 0) {
            return true;
        }
        return false;
    }

    public static boolean readBoolean2(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e1a46f", new Object[]{bufferedInputStream})).booleanValue();
        }
        if (readByte(bufferedInputStream) > 0) {
            return true;
        }
        return false;
    }

    public static byte readByte(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc4fe919", new Object[]{bufferedInputStream})).byteValue();
        }
        int read = bufferedInputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new IOException("end of the stream has been reached");
    }

    public static int readBytes(BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("848e8290", new Object[]{bufferedInputStream, bArr})).intValue();
        }
        int read = bufferedInputStream.read(bArr);
        if (read != -1) {
            return read;
        }
        throw new IOException("end of the stream has been reached, expect length " + bArr.length + " but got " + read);
    }

    public static double readDouble(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc0c30f2", new Object[]{bufferedInputStream})).doubleValue();
        }
        ByteArrayPools.ByteArray8Pool byteArray8Pool = c;
        byte[] obtain = byteArray8Pool.obtain();
        readBytes(bufferedInputStream, obtain);
        double d2 = ByteOrderValues.getDouble(obtain);
        byteArray8Pool.free(obtain);
        return d2;
    }

    public static float readFloat(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bf2eb75", new Object[]{bufferedInputStream})).floatValue();
        }
        ByteArrayPools.ByteArray4Pool byteArray4Pool = b;
        byte[] obtain = byteArray4Pool.obtain();
        readBytes(bufferedInputStream, obtain);
        float f = ByteOrderValues.getFloat(obtain);
        byteArray4Pool.free(obtain);
        return f;
    }

    public static int readInt(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85c589c5", new Object[]{bufferedInputStream})).intValue();
        }
        ByteArrayPools.ByteArray4Pool byteArray4Pool = b;
        byte[] obtain = byteArray4Pool.obtain();
        readBytes(bufferedInputStream, obtain);
        int i = ByteOrderValues.getInt(obtain);
        byteArray4Pool.free(obtain);
        return i;
    }

    public static long readLong(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("791022d", new Object[]{bufferedInputStream})).longValue();
        }
        ByteArrayPools.ByteArray8Pool byteArray8Pool = c;
        byte[] obtain = byteArray8Pool.obtain();
        readBytes(bufferedInputStream, obtain);
        long j = ByteOrderValues.getLong(obtain);
        byteArray8Pool.free(obtain);
        return j;
    }

    public static short readShort(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92ea4d62", new Object[]{bufferedInputStream})).shortValue();
        }
        ByteArrayPools.ByteArray2Pool byteArray2Pool = f2432a;
        byte[] obtain = byteArray2Pool.obtain();
        readBytes(bufferedInputStream, obtain);
        short s = ByteOrderValues.getShort(obtain);
        byteArray2Pool.free(obtain);
        return s;
    }

    @Deprecated
    public static String[] readStringArray(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e66a25a8", new Object[]{bufferedInputStream});
        }
        int read = bufferedInputStream.read();
        if (read == 0) {
            return null;
        }
        String[] strArr = new String[read];
        for (int i = 0; i < read; i++) {
            strArr[i] = readString(bufferedInputStream);
        }
        return strArr;
    }

    public static String[] readStringArray2(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d1de071a", new Object[]{bufferedInputStream});
        }
        int readInt = readInt(bufferedInputStream);
        if (readInt < 0) {
            return null;
        }
        if (readInt == 0) {
            return new String[0];
        }
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = readString2(bufferedInputStream);
        }
        return strArr;
    }

    @Deprecated
    public static List<String> readStringList(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a18d241", new Object[]{bufferedInputStream});
        }
        int read = bufferedInputStream.read();
        if (read <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(read);
        for (int i = 0; i < read; i++) {
            arrayList.add(readString(bufferedInputStream));
        }
        return arrayList;
    }

    public static List<String> readStringList2(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21546609", new Object[]{bufferedInputStream});
        }
        int readInt = readInt(bufferedInputStream);
        if (readInt < 0) {
            return null;
        }
        if (readInt == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(readString2(bufferedInputStream));
        }
        return arrayList;
    }

    @Deprecated
    public static void writeBoolean(BufferedOutputStream bufferedOutputStream, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c521fd1", new Object[]{bufferedOutputStream, new Boolean(z)});
        } else {
            bufferedOutputStream.write(z ? 1 : 0);
        }
    }

    public static void writeBoolean2(BufferedOutputStream bufferedOutputStream, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddc8511", new Object[]{bufferedOutputStream, new Boolean(z)});
        } else {
            writeByte(bufferedOutputStream, z ? (byte) 1 : (byte) 0);
        }
    }

    public static void writeByte(BufferedOutputStream bufferedOutputStream, byte b2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25ceabb", new Object[]{bufferedOutputStream, new Byte(b2)});
        } else {
            bufferedOutputStream.write(b2);
        }
    }

    public static void writeDouble(BufferedOutputStream bufferedOutputStream, double d2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1309694", new Object[]{bufferedOutputStream, new Double(d2)});
            return;
        }
        ByteArrayPools.ByteArray8Pool byteArray8Pool = c;
        byte[] obtain = byteArray8Pool.obtain();
        ByteOrderValues.putDouble(d2, obtain);
        bufferedOutputStream.write(obtain);
        byteArray8Pool.free(obtain);
    }

    public static void writeFloat(BufferedOutputStream bufferedOutputStream, float f) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b115c9", new Object[]{bufferedOutputStream, new Float(f)});
            return;
        }
        ByteArrayPools.ByteArray4Pool byteArray4Pool = b;
        byte[] obtain = byteArray4Pool.obtain();
        ByteOrderValues.putFloat(f, obtain);
        bufferedOutputStream.write(obtain);
        byteArray4Pool.free(obtain);
    }

    public static void writeInt(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8971e59", new Object[]{bufferedOutputStream, new Integer(i)});
            return;
        }
        ByteArrayPools.ByteArray4Pool byteArray4Pool = b;
        byte[] obtain = byteArray4Pool.obtain();
        ByteOrderValues.putInt(i, obtain);
        byteArray4Pool.free(obtain);
        bufferedOutputStream.write(obtain);
    }

    public static void writeLong(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bc0ecf", new Object[]{bufferedOutputStream, new Long(j)});
            return;
        }
        ByteArrayPools.ByteArray8Pool byteArray8Pool = c;
        byte[] obtain = byteArray8Pool.obtain();
        ByteOrderValues.putLong(j, obtain);
        bufferedOutputStream.write(obtain);
        byteArray8Pool.free(obtain);
    }

    public static void writeShort(BufferedOutputStream bufferedOutputStream, short s) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a57b076", new Object[]{bufferedOutputStream, new Short(s)});
            return;
        }
        ByteArrayPools.ByteArray2Pool byteArray2Pool = f2432a;
        byte[] obtain = byteArray2Pool.obtain();
        ByteOrderValues.putShort(s, obtain);
        bufferedOutputStream.write(obtain);
        byteArray2Pool.free(obtain);
    }

    @Deprecated
    public static void writeString(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8069ee74", new Object[]{bufferedOutputStream, str});
        } else if (str == null || str.length() == 0) {
            bufferedOutputStream.write(0);
        } else {
            byte[] bytes = str.getBytes();
            bufferedOutputStream.write(bytes.length);
            bufferedOutputStream.write(bytes);
        }
    }

    public static void writeString2(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cd4206", new Object[]{bufferedOutputStream, str});
        } else if (str == null) {
            writeInt(bufferedOutputStream, -1);
        } else if (str.length() == 0) {
            writeInt(bufferedOutputStream, 0);
        } else {
            byte[] bytes = str.getBytes();
            writeInt(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes);
        }
    }

    @Deprecated
    public static void writeStringArray(BufferedOutputStream bufferedOutputStream, String[] strArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eff80bc", new Object[]{bufferedOutputStream, strArr});
        } else if (strArr == null || strArr.length == 0) {
            bufferedOutputStream.write(0);
        } else {
            bufferedOutputStream.write(strArr.length);
            for (String str : strArr) {
                writeString(bufferedOutputStream, str);
            }
        }
    }

    public static void writeStringArray2(BufferedOutputStream bufferedOutputStream, String[] strArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b2a3c", new Object[]{bufferedOutputStream, strArr});
        } else if (strArr == null) {
            writeInt(bufferedOutputStream, -1);
        } else if (strArr.length == 0) {
            writeInt(bufferedOutputStream, 0);
        } else {
            writeInt(bufferedOutputStream, strArr.length);
            for (String str : strArr) {
                writeString2(bufferedOutputStream, str);
            }
        }
    }

    @Deprecated
    public static void writeStringList(BufferedOutputStream bufferedOutputStream, List<String> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9700c559", new Object[]{bufferedOutputStream, list});
        } else if (list == null || list.isEmpty()) {
            bufferedOutputStream.write(0);
        } else {
            bufferedOutputStream.write(list.size());
            for (String str : list) {
                writeString(bufferedOutputStream, str);
            }
        }
    }

    public static void writeStringList2(BufferedOutputStream bufferedOutputStream, List<String> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd15aaf", new Object[]{bufferedOutputStream, list});
        } else if (list == null) {
            writeInt(bufferedOutputStream, -1);
        } else if (list.isEmpty()) {
            writeInt(bufferedOutputStream, 0);
        } else {
            writeInt(bufferedOutputStream, list.size());
            for (String str : list) {
                writeString2(bufferedOutputStream, str);
            }
        }
    }

    @Deprecated
    public static String readString(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f721c05c", new Object[]{bufferedInputStream});
        }
        int read = bufferedInputStream.read();
        if (read == 0) {
            return null;
        }
        if (read > 127) {
            byte[] bArr = new byte[read];
            bufferedInputStream.read(bArr);
            return new String(bArr, "utf-8");
        }
        ByteArrayPools.ByteArray127Pool byteArray127Pool = d;
        byte[] obtain = byteArray127Pool.obtain();
        bufferedInputStream.read(obtain, 0, read);
        String str = new String(obtain, 0, read, "utf-8");
        byteArray127Pool.free(obtain);
        return str;
    }

    public static String readString2(BufferedInputStream bufferedInputStream) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63a05e0", new Object[]{bufferedInputStream});
        }
        int readInt = readInt(bufferedInputStream);
        if (readInt < 0) {
            return null;
        }
        if (readInt == 0) {
            return "";
        }
        if (readInt > 127) {
            synchronized (ByteOrderDataUtil.class) {
                byte[] bArr = new byte[readInt];
                readBytes(bufferedInputStream, bArr);
                str = new String(bArr, "utf-8");
            }
            return str;
        }
        ByteArrayPools.ByteArray127Pool byteArray127Pool = d;
        byte[] obtain = byteArray127Pool.obtain();
        readBytes(bufferedInputStream, obtain, 0, readInt);
        String str2 = new String(obtain, 0, readInt, "utf-8");
        byteArray127Pool.free(obtain);
        return str2;
    }

    public static int readBytes(BufferedInputStream bufferedInputStream, byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b06afb0", new Object[]{bufferedInputStream, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = bufferedInputStream.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        throw new IOException("end of the stream has been reached, expect count " + i2 + " but got " + read);
    }
}
