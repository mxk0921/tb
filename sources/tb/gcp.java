package tb;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Parcelable.Creator<?>> f19898a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends ObjectInputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1072899230) {
                return super.resolveClass((ObjectStreamClass) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/utils/SerializeUtils$1");
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
            }
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, re.class.getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    static {
        t2o.a(393216101);
    }

    public static Object a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("86713b6", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Object d = d(obtain);
        obtain.recycle();
        return d;
    }

    public static byte[] b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6f4c5dc4", new Object[]{obj});
        }
        Parcel obtain = Parcel.obtain();
        h(obtain, obj);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Object[] c(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("128471e4", new Object[]{parcel});
        }
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        Object[] objArr = new Object[readInt];
        for (int i = 0; i < readInt; i++) {
            objArr[i] = d(parcel);
        }
        return objArr;
    }

    public static Object d(Parcel parcel) {
        Parcelable.Creator<?> creator;
        int readInt = parcel.readInt();
        CharSequence[] charSequenceArr = null;
        boolean z = false;
        switch (readInt) {
            case -1:
                return null;
            case 0:
                return parcel.readString();
            case 1:
                return Integer.valueOf(parcel.readInt());
            case 2:
                return parcel.readHashMap(re.class.getClassLoader());
            case 3:
                return parcel.readBundle(re.class.getClassLoader());
            case 4:
                return parcel.readParcelable(re.class.getClassLoader());
            case 5:
                return Short.valueOf((short) parcel.readInt());
            case 6:
                return Long.valueOf(parcel.readLong());
            case 7:
                return Float.valueOf(parcel.readFloat());
            case 8:
                return Double.valueOf(parcel.readDouble());
            case 9:
                if (parcel.readInt() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            case 11:
                return parcel.readArrayList(re.class.getClassLoader());
            case 12:
                return parcel.readSparseArray(re.class.getClassLoader());
            case 13:
                return parcel.createByteArray();
            case 14:
                return parcel.createStringArray();
            case 15:
                return parcel.readStrongBinder();
            case 16:
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                try {
                    Class<?> a2 = equ.e().a(readString);
                    HashMap<String, Parcelable.Creator<?>> hashMap = f19898a;
                    synchronized (hashMap) {
                        try {
                            creator = hashMap.get(a2.getName());
                            if (creator == null) {
                                try {
                                    creator = (Parcelable.Creator) a2.getField("CREATOR").get(null);
                                    if (creator != null) {
                                        hashMap.put(a2.getName(), creator);
                                    } else {
                                        throw new BadParcelableException("Parcelable protocol requires a non-null Parcelable.Creator object called CREATOR on class ".concat(a2.getName()));
                                    }
                                } catch (IllegalAccessException unused) {
                                    throw new BadParcelableException("IllegalAccessException when unmarshalling: ".concat(a2.getName()));
                                } catch (NoSuchFieldException unused2) {
                                    throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ".concat(a2.getName()));
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Object[] newArray = creator.newArray(readInt2);
                    for (int i = 0; i < readInt2; i++) {
                        newArray[i] = creator.createFromParcel(parcel);
                    }
                    return newArray;
                } catch (IPCException e) {
                    throw new RuntimeException(e);
                }
            case 17:
                return c(parcel);
            case 18:
                return parcel.createIntArray();
            case 19:
                return parcel.createLongArray();
            case 20:
                return Byte.valueOf(parcel.readByte());
            case 21:
                try {
                    return new a(new ByteArrayInputStream(parcel.createByteArray())).readObject();
                } catch (IOException unused3) {
                    throw new RuntimeException("Parcelable encountered IOException reading a Serializable object)");
                } catch (ClassNotFoundException unused4) {
                    throw new RuntimeException("Parcelable encountered ClassNotFoundException reading a Serializable object)");
                }
            case 22:
                return parcel.readSparseBooleanArray();
            case 23:
                return parcel.createBooleanArray();
            case 24:
                int readInt3 = parcel.readInt();
                if (readInt3 >= 0) {
                    charSequenceArr = new CharSequence[readInt3];
                    for (int i2 = 0; i2 < readInt3; i2++) {
                        charSequenceArr[i2] = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                }
                return charSequenceArr;
            case 25:
            case 26:
            case 27:
            default:
                switch (readInt) {
                    case 25:
                        return parcel.readPersistableBundle(re.class.getClassLoader());
                    case 26:
                        return parcel.readSize();
                    case 27:
                        return parcel.readSizeF();
                    default:
                        StringBuilder sb = new StringBuilder("Parcel ");
                        sb.append(parcel);
                        sb.append(": Unmarshalling unknown type code ");
                        sb.append(readInt);
                        sb.append(" at offset ");
                        sb.append(parcel.dataPosition() - 4);
                        throw new RuntimeException(sb.toString());
                }
            case 28:
                return parcel.createDoubleArray();
            case 29:
                return ParameterWrapper.CREATOR.createFromParcel(parcel);
            case 30:
                int readInt4 = parcel.readInt();
                ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[readInt4];
                for (int i3 = 0; i3 < readInt4; i3++) {
                    parameterWrapperArr[i3] = ParameterWrapper.CREATOR.createFromParcel(parcel);
                }
                return parameterWrapperArr;
        }
    }

    public static Object e(ClassLoader classLoader, Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fb9b8bbf", new Object[]{classLoader, parcel});
        }
        if (parcel.readInt() == 0) {
            return d(parcel);
        }
        return a(mlp.a(parcel.readParcelable(classLoader)));
    }

    public static void f(Parcel parcel, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7d6aa5", new Object[]{parcel, objArr});
        } else if (objArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(objArr.length);
            for (Object obj : objArr) {
                h(parcel, obj);
            }
        }
    }

    public static long g(Parcel parcel, Object obj, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cea966c4", new Object[]{parcel, obj, new Integer(i), new Boolean(z)})).longValue();
        }
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        h(parcel, obj);
        long dataSize = parcel.dataSize();
        if (z && dataSize > Constants.MAX_SIZE) {
            parcel.setDataSize(dataPosition);
            parcel.setDataPosition(dataPosition);
            parcel.writeInt(1);
            parcel.writeParcelable(mlp.b(b(obj)), i);
        }
        return dataSize;
    }

    public static void h(Parcel parcel, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989e25f", new Object[]{parcel, obj});
            return;
        }
        if (obj instanceof ParameterWrapper) {
            parcel.writeInt(29);
            ((ParameterWrapper) obj).writeToParcel(parcel, 0);
        } else if (obj instanceof ParameterWrapper[]) {
            ParameterWrapper[] parameterWrapperArr = (ParameterWrapper[]) obj;
            parcel.writeInt(30);
            parcel.writeInt(parameterWrapperArr.length);
            for (ParameterWrapper parameterWrapper : parameterWrapperArr) {
                parameterWrapper.writeToParcel(parcel, 0);
            }
        } else if (obj == null) {
            parcel.writeInt(-1);
        } else if (obj instanceof String) {
            parcel.writeInt(0);
            parcel.writeString((String) obj);
        } else if (obj instanceof Integer) {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Map) {
            parcel.writeInt(2);
            parcel.writeMap((Map) obj);
        } else if (obj instanceof Bundle) {
            parcel.writeInt(3);
            parcel.writeBundle((Bundle) obj);
        } else if (obj instanceof Parcelable) {
            parcel.writeInt(4);
            parcel.writeParcelable((Parcelable) obj, 0);
        } else if (obj instanceof Short) {
            parcel.writeInt(5);
            parcel.writeInt(((Short) obj).intValue());
        } else if (obj instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            parcel.writeInt(7);
            parcel.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            parcel.writeInt(8);
            parcel.writeDouble(((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            parcel.writeInt(9);
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof CharSequence) {
            parcel.writeInt(10);
            TextUtils.writeToParcel((CharSequence) obj, parcel, 0);
        } else if (obj instanceof List) {
            parcel.writeInt(11);
            parcel.writeList((List) obj);
        } else if (obj instanceof SparseArray) {
            parcel.writeInt(12);
            parcel.writeSparseArray((SparseArray) obj);
        } else if (obj instanceof boolean[]) {
            parcel.writeInt(23);
            parcel.writeBooleanArray((boolean[]) obj);
        } else if (obj instanceof byte[]) {
            parcel.writeInt(13);
            parcel.writeByteArray((byte[]) obj);
        } else if (obj instanceof String[]) {
            parcel.writeInt(14);
            parcel.writeStringArray((String[]) obj);
        } else if (obj instanceof CharSequence[]) {
            parcel.writeInt(24);
        } else if (obj instanceof IBinder) {
            parcel.writeInt(15);
            parcel.writeStrongBinder((IBinder) obj);
        } else if (obj instanceof Parcelable[]) {
            parcel.writeInt(16);
            parcel.writeString(obj.getClass().getComponentType().getName());
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            parcel.writeInt(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                parcelable.writeToParcel(parcel, 0);
            }
        } else if (obj instanceof int[]) {
            parcel.writeInt(18);
            parcel.writeIntArray((int[]) obj);
        } else if (obj instanceof long[]) {
            parcel.writeInt(19);
            parcel.writeLongArray((long[]) obj);
        } else if (obj instanceof Byte) {
            parcel.writeInt(20);
            parcel.writeInt(((Byte) obj).byteValue());
        } else if (obj instanceof double[]) {
            parcel.writeInt(28);
            parcel.writeDoubleArray((double[]) obj);
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isArray() && cls.getComponentType() == Object.class) {
                parcel.writeInt(17);
                f(parcel, (Object[]) obj);
            } else if (obj instanceof Serializable) {
                parcel.writeInt(21);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                    parcel.writeByteArray(byteArrayOutputStream.toByteArray());
                } catch (IOException unused) {
                    throw new RuntimeException("Parcelable encountered IOException writing serializable object");
                }
            } else {
                throw new RuntimeException("Parcel: unable to marshal value " + obj);
            }
        }
        if (obj instanceof Size) {
            parcel.writeInt(26);
            parcel.writeSize((Size) obj);
        } else if (obj instanceof SizeF) {
            parcel.writeInt(27);
            parcel.writeSizeF((SizeF) obj);
        } else if (obj instanceof PersistableBundle) {
            parcel.writeInt(25);
            parcel.writePersistableBundle((PersistableBundle) obj);
        }
    }
}
