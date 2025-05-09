package tb;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import tb.d3i;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hjf {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f20682a = Charset.forName("UTF-8");
    public static final Object LAZY_INIT_LOCK = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static <K, V> int a(Map<K, V> map, int i, int i2, int i3) {
        int D = CodedOutputByteBufferNano.D(i);
        int i4 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int h = CodedOutputByteBufferNano.h(1, i2, key) + CodedOutputByteBufferNano.h(2, i3, value);
            i4 += D + h + CodedOutputByteBufferNano.t(h);
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    public static final <K, V> Map<K, V> b(ly3 ly3Var, Map<K, V> map, d3i.c cVar, int i, int i2, V v, int i3, int i4) throws IOException {
        Map<K, V> a2 = ((d3i.b) cVar).a(map);
        int h = ly3Var.h(ly3Var.x());
        Object obj = null;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                break;
            } else if (E == i3) {
                obj = ly3Var.s(i);
            } else if (E == i4) {
                if (i2 == 11) {
                    ly3Var.r((MessageNano) v);
                } else {
                    v = ly3Var.s(i2);
                }
            } else if (!ly3Var.J(E)) {
                break;
            }
        }
        ly3Var.a(0);
        ly3Var.g(h);
        if (obj == null) {
            obj = c(i);
        }
        if (v == 0) {
            v = (V) c(i2);
        }
        a2.put(obj, (Object) v);
        return a2;
    }

    public static Object c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Type: " + i + " is not a primitive type.");
            case 12:
                return hix.EMPTY_BYTES;
        }
    }

    public static <K, V> void d(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i, int i2, int i3) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            codedOutputByteBufferNano.G0(i, 2);
            codedOutputByteBufferNano.u0(CodedOutputByteBufferNano.h(1, i2, key) + CodedOutputByteBufferNano.h(2, i3, value));
            codedOutputByteBufferNano.Z(1, i2, key);
            codedOutputByteBufferNano.Z(2, i3, value);
        }
    }
}
