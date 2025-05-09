package tb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jtx {
    static {
        t2o.a(253755470);
    }

    public static Bundle a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", i);
        bundle.putString("resultMsg", str);
        return bundle;
    }

    public static Bundle b(String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        String str2;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.setClassLoader(jtx.class.getClassLoader());
        bundle2.putString("targetClass", str);
        if (iBridgeTargetIdentify != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(iBridgeTargetIdentify, 0);
            bundle2.putByteArray("targetIdentify", obtain.marshall());
            obtain.recycle();
        }
        bundle2.putInt("methodId", i);
        if (objArr != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < objArr.length; i3++) {
                if (objArr[i3] instanceof IBinder) {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(1);
                    String str3 = "args_i_binder" + i2;
                    arrayList.add(str3);
                    bundle2.putBinder(str3, (IBinder) objArr[i3]);
                    i2++;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(0);
                    arrayList.add(objArr[i3]);
                }
            }
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeArray(arrayList.toArray());
            bundle2.putByteArray("args", obtain2.marshall());
            obtain2.recycle();
        }
        Bundle bundle3 = new Bundle();
        bundle3.setClassLoader(jtx.class.getClassLoader());
        bundle3.putString("targetClass", str);
        if (iBridgeTargetIdentify != null) {
            bundle3.putParcelable("targetIdentifyV2", iBridgeTargetIdentify);
        }
        bundle3.putInt("methodId", i);
        if (objArr != null) {
            bundle3.putInt("paramsCount", objArr.length);
            for (int i4 = 0; i4 < objArr.length; i4++) {
                Object obj = objArr[i4];
                if (obj == null) {
                    str2 = "params" + i4;
                    bundle = null;
                } else if (obj instanceof Bundle) {
                    str2 = "params" + i4;
                    bundle = (Bundle) objArr[i4];
                } else {
                    if (obj instanceof IBinder) {
                        bundle3.putBinder("params" + i4, (IBinder) objArr[i4]);
                    } else if (obj instanceof Boolean) {
                        bundle3.putBoolean("params" + i4, ((Boolean) objArr[i4]).booleanValue());
                    } else if (obj instanceof boolean[]) {
                        bundle3.putBooleanArray("params" + i4, (boolean[]) objArr[i4]);
                    } else if (obj instanceof Byte) {
                        bundle3.putByte("params" + i4, ((Byte) objArr[i4]).byteValue());
                    } else if (obj instanceof byte[]) {
                        bundle3.putByteArray("params" + i4, (byte[]) objArr[i4]);
                    } else if (obj instanceof Character) {
                        bundle3.putChar("params" + i4, ((Character) objArr[i4]).charValue());
                    } else if (obj instanceof char[]) {
                        bundle3.putCharArray("params" + i4, (char[]) objArr[i4]);
                    } else if (obj instanceof CharSequence) {
                        bundle3.putCharSequence("params" + i4, (CharSequence) objArr[i4]);
                    } else if (obj instanceof CharSequence[]) {
                        bundle3.putCharSequenceArray("params" + i4, (CharSequence[]) objArr[i4]);
                    } else if (!(obj instanceof ArrayList) || !(((ArrayList) obj).get(0) instanceof CharSequence)) {
                        Object obj2 = objArr[i4];
                        if (obj2 instanceof Double) {
                            bundle3.putDouble("params" + i4, ((Double) objArr[i4]).doubleValue());
                        } else if (obj2 instanceof double[]) {
                            bundle3.putDoubleArray("params" + i4, (double[]) objArr[i4]);
                        } else if (obj2 instanceof Float) {
                            bundle3.putFloat("params" + i4, ((Float) objArr[i4]).floatValue());
                        } else if (obj2 instanceof float[]) {
                            bundle3.putFloatArray("params" + i4, (float[]) objArr[i4]);
                        } else if (obj2 instanceof Integer) {
                            bundle3.putInt("params" + i4, ((Integer) objArr[i4]).intValue());
                        } else if (obj2 instanceof int[]) {
                            bundle3.putIntArray("params" + i4, (int[]) objArr[i4]);
                        } else if (!(obj2 instanceof ArrayList) || !(((ArrayList) obj2).get(0) instanceof Integer)) {
                            Object obj3 = objArr[i4];
                            if (obj3 instanceof Long) {
                                bundle3.putLong("params" + i4, ((Long) objArr[i4]).longValue());
                            } else if (obj3 instanceof long[]) {
                                bundle3.putLongArray("params" + i4, (long[]) objArr[i4]);
                            } else if (obj3 instanceof Short) {
                                bundle3.putShort("params" + i4, ((Short) objArr[i4]).shortValue());
                            } else if (obj3 instanceof short[]) {
                                bundle3.putShortArray("params" + i4, (short[]) objArr[i4]);
                            } else if (obj3 instanceof String) {
                                bundle3.putString("params" + i4, (String) objArr[i4]);
                            } else if (obj3 instanceof String[]) {
                                bundle3.putStringArray("params" + i4, (String[]) objArr[i4]);
                            } else if (!(obj3 instanceof ArrayList) || !(((ArrayList) obj3).get(0) instanceof String)) {
                                Object obj4 = objArr[i4];
                                if (obj4 instanceof Size) {
                                    bundle3.putSize("params" + i4, (Size) objArr[i4]);
                                } else if (obj4 instanceof SizeF) {
                                    bundle3.putSizeF("params" + i4, (SizeF) objArr[i4]);
                                } else if (obj4 instanceof Parcelable) {
                                    bundle3.putParcelable("params" + i4, (Parcelable) objArr[i4]);
                                } else if (obj4 instanceof Parcelable[]) {
                                    bundle3.putParcelableArray("params" + i4, (Parcelable[]) objArr[i4]);
                                } else if (!(obj4 instanceof ArrayList) || !(((ArrayList) obj4).get(0) instanceof Parcelable)) {
                                    Object obj5 = objArr[i4];
                                    if (!(obj5 instanceof SparseArray) || !(((SparseArray) obj5).get(0) instanceof Parcelable)) {
                                        Object obj6 = objArr[i4];
                                        if (obj6 instanceof Serializable) {
                                            bundle3.putSerializable("params" + i4, (Serializable) objArr[i4]);
                                        } else {
                                            Objects.toString(obj6);
                                        }
                                    } else {
                                        bundle3.putSparseParcelableArray("params" + i4, (SparseArray) objArr[i4]);
                                    }
                                } else {
                                    bundle3.putParcelableArrayList("params" + i4, (ArrayList) objArr[i4]);
                                }
                            } else {
                                bundle3.putStringArrayList("params" + i4, (ArrayList) objArr[i4]);
                            }
                        } else {
                            bundle3.putIntegerArrayList("params" + i4, (ArrayList) objArr[i4]);
                        }
                    } else {
                        bundle3.putCharSequenceArrayList("params" + i4, (ArrayList) objArr[i4]);
                    }
                }
                bundle3.putBundle(str2, bundle);
            }
        }
        bundle3.putAll(bundle2);
        return bundle3;
    }

    public static boolean c(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj != null && !(obj instanceof PersistableBundle) && !(obj instanceof Size) && !(obj instanceof SizeF) && !(obj instanceof Integer) && !(obj instanceof Map) && !(obj instanceof Parcelable) && !(obj instanceof Short) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Boolean) && !(obj instanceof CharSequence) && !(obj instanceof List) && !(obj instanceof SparseArray) && !(obj instanceof boolean[]) && !(obj instanceof byte[]) && !(obj instanceof CharSequence[]) && !(obj instanceof IBinder) && !(obj instanceof Parcelable[]) && !(obj instanceof int[]) && !(obj instanceof long[]) && !(obj instanceof Byte) && !(obj instanceof double[])) {
                Class<?> cls = obj.getClass();
                if ((!cls.isArray() || cls.getComponentType() != Object.class) && !(obj instanceof Serializable)) {
                    return false;
                }
            }
        }
        return true;
    }
}
