package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class VersionedParcel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    public final ArrayMap<String, Class> mParcelizerCache;
    public final ArrayMap<String, Method> mReadCache;
    public final ArrayMap<String, Method> mWriteCache;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    private Exception createException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Exception) ipChange.ipc$dispatch("e3e5fe49", new Object[]{this, new Integer(i), str});
        }
        switch (i) {
            case -9:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6dadc8d", new Object[]{this, cls});
        }
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        String name = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    public static Throwable getRootCause(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("773a7d62", new Object[]{th});
        }
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int getType(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0161446", new Object[]{this, t})).intValue();
        }
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof VersionedParcelable) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName().concat(" cannot be VersionedParcelled"));
    }

    private <T, S extends Collection<T>> S readCollection(S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (S) ((Collection) ipChange.ipc$dispatch("3212d17b", new Object[]{this, s}));
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    s.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    s.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    s.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    s.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    s.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return s;
    }

    private int readExceptionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64f06e60", new Object[]{this})).intValue();
        }
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13bd50e", new Object[]{this, collection, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeCollection(collection);
    }

    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c822d68", new Object[]{this, versionedParcelable});
            return;
        }
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
        }
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a2210d5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T[]) ((Object[]) ipChange.ipc$dispatch("bb11ddbd", new Object[]{this, tArr, new Integer(i)})) : !readField(i) ? tArr : (T[]) readArray(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a06e1ac", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue() : !readField(i) ? z : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("1f621f3f", new Object[]{this, zArr, new Integer(i)}) : !readField(i) ? zArr : readBooleanArray();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("a4e886b2", new Object[]{this, bundle, new Integer(i)}) : !readField(i) ? bundle : readBundle();
    }

    public byte readByte(byte b, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1311ddb8", new Object[]{this, new Byte(b), new Integer(i)})).byteValue();
        }
        if (!readField(i)) {
            return b;
        }
        return (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6f0c8083", new Object[]{this, bArr, new Integer(i)}) : !readField(i) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("920f1477", new Object[]{this, cArr, new Integer(i)});
        }
        if (!readField(i)) {
            return cArr;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        char[] cArr2 = new char[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            cArr2[i2] = (char) readInt();
        }
        return cArr2;
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("f2197def", new Object[]{this, charSequence, new Integer(i)}) : !readField(i) ? charSequence : readCharSequence();
    }

    public abstract double readDouble();

    public double readDouble(double d, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab813101", new Object[]{this, new Double(d), new Integer(i)})).doubleValue() : !readField(i) ? d : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (double[]) ipChange.ipc$dispatch("f31008de", new Object[]{this, dArr, new Integer(i)}) : !readField(i) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i) {
        int readExceptionCode;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Exception) ipChange.ipc$dispatch("7460bd3", new Object[]{this, exc, new Integer(i)}) : (readField(i) && (readExceptionCode = readExceptionCode()) != 0) ? readException(readExceptionCode, readString()) : exc;
    }

    public abstract boolean readField(int i);

    public abstract float readFloat();

    public float readFloat(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35e903e0", new Object[]{this, new Float(f), new Integer(i)})).floatValue() : !readField(i) ? f : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("714e7ce3", new Object[]{this, fArr, new Integer(i)}) : !readField(i) ? fArr : readFloatArray();
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) ((VersionedParcelable) getReadMethod(str).invoke(null, versionedParcel));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int readInt();

    public int readInt(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a33b6d3", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : !readField(i2) ? i : readInt();
    }

    public int[] readIntArray(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b8dca36", new Object[]{this, iArr, new Integer(i)}) : !readField(i) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("406375b0", new Object[]{this, list, new Integer(i)});
        }
        if (!readField(i)) {
            return list;
        }
        return (List) readCollection(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdccff2c", new Object[]{this, new Long(j), new Integer(i)})).longValue() : !readField(i) ? j : readLong();
    }

    public long[] readLongArray(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("6f04539f", new Object[]{this, jArr, new Integer(i)}) : !readField(i) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4859680", new Object[]{this, map, new Integer(i)});
        }
        if (!readField(i)) {
            return map;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (readInt == 0) {
            return arrayMap;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        readCollection(arrayList);
        readCollection(arrayList2);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayMap.put(arrayList.get(i2), arrayList2.get(i2));
        }
        return arrayMap;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((Parcelable) ipChange.ipc$dispatch("c92a39b3", new Object[]{this, t, new Integer(i)})) : !readField(i) ? t : (T) readParcelable();
    }

    public Serializable readSerializable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("6e4599ae", new Object[]{this});
        }
        String readString = readString();
        if (readString == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1072899230) {
                        return super.resolveClass((ObjectStreamClass) objArr[0]);
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/versionedparcelable/VersionedParcel$1");
                }

                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Class) ipChange2.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
                    }
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    if (cls != null) {
                        return cls;
                    }
                    return super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + readString + f7l.BRACKET_END_STR, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + readString + f7l.BRACKET_END_STR, e2);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a79dd746", new Object[]{this, set, new Integer(i)});
        }
        if (!readField(i)) {
            return set;
        }
        return (Set) readCollection(new ArraySet());
    }

    public Size readSize(Size size, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("d8926a51", new Object[]{this, size, new Integer(i)});
        }
        if (!readField(i)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    public SizeF readSizeF(SizeF sizeF, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizeF) ipChange.ipc$dispatch("d1284c97", new Object[]{this, sizeF, new Integer(i)});
        }
        if (!readField(i)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseBooleanArray) ipChange.ipc$dispatch("4e73f361", new Object[]{this, sparseBooleanArray, new Integer(i)});
        }
        if (!readField(i)) {
            return sparseBooleanArray;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f402a95", new Object[]{this, str, new Integer(i)}) : !readField(i) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("7c47bf9f", new Object[]{this, iBinder, new Integer(i)}) : !readField(i) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((VersionedParcelable) ipChange.ipc$dispatch("a1bcb11e", new Object[]{this, t, new Integer(i)})) : !readField(i) ? t : (T) readVersionedParcelable();
    }

    public abstract void setOutputField(int i);

    public void setSerializationFlags(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6587c700", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public <T> void writeArray(T[] tArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7587f8b3", new Object[]{this, tArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeArray(tArr);
    }

    public abstract void writeBoolean(boolean z);

    public void writeBoolean(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4521ff", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        setOutputField(i);
        writeBoolean(z);
    }

    public void writeBooleanArray(boolean[] zArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e8538d", new Object[]{this, zArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeBooleanArray(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7601f7", new Object[]{this, bundle, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeBundle(bundle);
    }

    public void writeByte(byte b, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93054d5", new Object[]{this, new Byte(b), new Integer(i)});
            return;
        }
        setOutputField(i);
        writeInt(b);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70733fe3", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i, int i2);

    public void writeCharArray(char[] cArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a4e190", new Object[]{this, cArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (cArr != null) {
            writeInt(cArr.length);
            for (char c : cArr) {
                writeInt(c);
            }
            return;
        }
        writeInt(-1);
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67722942", new Object[]{this, charSequence, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeCharSequence(charSequence);
    }

    public abstract void writeDouble(double d);

    public void writeDouble(double d, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43de09dc", new Object[]{this, new Double(d), new Integer(i)});
            return;
        }
        setOutputField(i);
        writeDouble(d);
    }

    public void writeDoubleArray(double[] dArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6feda2a", new Object[]{this, dArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeDoubleArray(dArr);
    }

    public void writeException(Exception exc, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44211b4", new Object[]{this, exc, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (exc == null) {
            writeNoException();
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        }
        writeInt(i2);
        if (i2 != 0) {
            writeString(exc.getMessage());
            if (i2 == -9) {
                writeParcelable((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    public abstract void writeFloat(float f);

    public void writeFloat(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53996e07", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        setOutputField(i);
        writeFloat(f);
    }

    public void writeFloatArray(float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b93895", new Object[]{this, fArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeFloatArray(fArr);
    }

    public abstract void writeInt(int i);

    public void writeInt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855bab7", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setOutputField(i2);
        writeInt(i);
    }

    public void writeIntArray(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a4b05", new Object[]{this, iArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dc8d8e", new Object[]{this, list, new Integer(i)});
        } else {
            writeCollection(list, i);
        }
    }

    public abstract void writeLong(long j);

    public void writeLong(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73eb7641", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        setOutputField(i);
        writeLong(j);
    }

    public void writeLongArray(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6aba4f", new Object[]{this, jArr, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80751322", new Object[]{this, map, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            writeCollection(arrayList);
            writeCollection(arrayList2);
        }
    }

    public void writeNoException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6f9f36", new Object[]{this});
        } else {
            writeInt(0);
        }
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b98a39", new Object[]{this, parcelable, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33c03ca", new Object[]{this, serializable, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a8f2e", new Object[]{this, set, new Integer(i)});
        } else {
            writeCollection(set, i);
        }
    }

    public void writeSize(Size size, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c538e97", new Object[]{this, size, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (size == null) {
            z = false;
        }
        writeBoolean(z);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    public void writeSizeF(SizeF sizeF, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e152b01f", new Object[]{this, sizeF, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (sizeF == null) {
            z = false;
        }
        writeBoolean(z);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9711afb7", new Object[]{this, sparseBooleanArray, new Integer(i)});
            return;
        }
        setOutputField(i);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            writeInt(sparseBooleanArray.keyAt(i2));
            writeBoolean(sparseBooleanArray.valueAt(i2));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f039fc2", new Object[]{this, str, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae533eb5", new Object[]{this, iBinder, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520dae87", new Object[]{this, iInterface, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeStrongInterface(iInterface);
    }

    public <T extends VersionedParcelable> void writeToParcel(T t, VersionedParcel versionedParcel) {
        try {
            getWriteMethod(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ea4051", new Object[]{this, versionedParcelable, new Integer(i)});
            return;
        }
        setOutputField(i);
        writeVersionedParcelable(versionedParcelable);
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("5d6e9b60", new Object[]{this, str});
        }
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    private <T> void writeCollection(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921ab095", new Object[]{this, collection});
        } else if (collection == null) {
            writeInt(-1);
        } else {
            int size = collection.size();
            writeInt(size);
            if (size > 0) {
                int type = getType(collection.iterator().next());
                writeInt(type);
                switch (type) {
                    case 1:
                        for (T t : collection) {
                            writeVersionedParcelable(t);
                        }
                        return;
                    case 2:
                        for (T t2 : collection) {
                            writeParcelable(t2);
                        }
                        return;
                    case 3:
                        for (T t3 : collection) {
                            writeSerializable(t3);
                        }
                        return;
                    case 4:
                        for (T t4 : collection) {
                            writeString(t4);
                        }
                        return;
                    case 5:
                        for (T t5 : collection) {
                            writeStrongBinder(t5);
                        }
                        return;
                    case 6:
                    default:
                        return;
                    case 7:
                        for (T t6 : collection) {
                            writeInt(t6.intValue());
                        }
                        return;
                    case 8:
                        for (T t7 : collection) {
                            writeFloat(t7.floatValue());
                        }
                        return;
                }
            }
        }
    }

    private void writeSerializable(Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43bba59", new Object[]{this, serializable});
        } else if (serializable == null) {
            writeString(null);
        } else {
            String name = serializable.getClass().getName();
            writeString(name);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                writeByteArray(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + f7l.BRACKET_END_STR, e);
            }
        }
    }

    public <T> T[] readArray(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("98962028", new Object[]{this, tArr}));
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readInt);
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    arrayList.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    arrayList.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    arrayList.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    arrayList.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    arrayList.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public boolean[] readBooleanArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("b93de5e7", new Object[]{this});
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        for (int i = 0; i < readInt; i++) {
            zArr[i] = readInt() != 0;
        }
        return zArr;
    }

    public double[] readDoubleArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("da3662e6", new Object[]{this});
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        double[] dArr = new double[readInt];
        for (int i = 0; i < readInt; i++) {
            dArr[i] = readDouble();
        }
        return dArr;
    }

    public float[] readFloatArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a4cd2587", new Object[]{this});
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = readFloat();
        }
        return fArr;
    }

    public int[] readIntArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("260159dd", new Object[]{this});
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i = 0; i < readInt; i++) {
            iArr[i] = readInt();
        }
        return iArr;
    }

    public long[] readLongArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("c8ad8957", new Object[]{this});
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = readLong();
        }
        return jArr;
    }

    public <T extends VersionedParcelable> T readVersionedParcelable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((VersionedParcelable) ipChange.ipc$dispatch("df8a87fb", new Object[]{this}));
        }
        String readString = readString();
        if (readString == null) {
            return null;
        }
        return (T) readFromParcel(readString, createSubParcel());
    }

    public <T> void writeArray(T[] tArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d990450", new Object[]{this, tArr});
        } else if (tArr == null) {
            writeInt(-1);
        } else {
            int length = tArr.length;
            writeInt(length);
            if (length > 0) {
                int type = getType(tArr[0]);
                writeInt(type);
                if (type == 1) {
                    while (i < length) {
                        writeVersionedParcelable((VersionedParcelable) tArr[i]);
                        i++;
                    }
                } else if (type == 2) {
                    while (i < length) {
                        writeParcelable((Parcelable) tArr[i]);
                        i++;
                    }
                } else if (type == 3) {
                    while (i < length) {
                        writeSerializable((Serializable) tArr[i]);
                        i++;
                    }
                } else if (type == 4) {
                    while (i < length) {
                        writeString((String) tArr[i]);
                        i++;
                    }
                } else if (type == 5) {
                    while (i < length) {
                        writeStrongBinder((IBinder) tArr[i]);
                        i++;
                    }
                }
            }
        }
    }

    public void writeBooleanArray(boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb4e636", new Object[]{this, zArr});
        } else if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z : zArr) {
                writeInt(z ? 1 : 0);
            }
        } else {
            writeInt(-1);
        }
    }

    public void writeByteArray(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b13383", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        setOutputField(i3);
        writeByteArray(bArr, i, i2);
    }

    public void writeDoubleArray(double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9497f9", new Object[]{this, dArr});
        } else if (dArr != null) {
            writeInt(dArr.length);
            for (double d : dArr) {
                writeDouble(d);
            }
        } else {
            writeInt(-1);
        }
    }

    public void writeFloatArray(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2f402e", new Object[]{this, fArr});
        } else if (fArr != null) {
            writeInt(fArr.length);
            for (float f : fArr) {
                writeFloat(f);
            }
        } else {
            writeInt(-1);
        }
    }

    public void writeIntArray(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eca1fbe", new Object[]{this, iArr});
        } else if (iArr != null) {
            writeInt(iArr.length);
            for (int i : iArr) {
                writeInt(i);
            }
        } else {
            writeInt(-1);
        }
    }

    public void writeLongArray(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c99f34", new Object[]{this, jArr});
        } else if (jArr != null) {
            writeInt(jArr.length);
            for (long j : jArr) {
                writeLong(j);
            }
        } else {
            writeInt(-1);
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2050f2", new Object[]{this, versionedParcelable});
        } else if (versionedParcelable == null) {
            writeString(null);
        } else {
            writeVersionedParcelableCreator(versionedParcelable);
            VersionedParcel createSubParcel = createSubParcel();
            writeToParcel(versionedParcelable, createSubParcel);
            createSubParcel.closeField();
        }
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("d282a092", new Object[]{this, cls});
        }
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class findParcelClass = findParcelClass(cls);
        System.currentTimeMillis();
        Method declaredMethod = findParcelClass.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Exception readException(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Exception) ipChange.ipc$dispatch("e0187de3", new Object[]{this, new Integer(i), str}) : createException(i, str);
    }
}
