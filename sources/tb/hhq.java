package tb;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hhq implements qmi<Object> {
    public static final hhq INSTANCE = new hhq();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20649a;
    public static final Charset b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends ByteArrayOutputStream {
        static {
            t2o.a(945815775);
        }

        public byte[] e() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        boolean z;
        t2o.a(945815774);
        t2o.a(945815765);
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f20649a = z;
        b = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        n(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f20649a) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f20649a) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void m(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f20649a) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void n(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            l(byteArrayOutputStream, i);
        }
    }

    @Override // tb.qmi
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    @Override // tb.qmi
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        o(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.e(), 0, aVar.size());
        return allocateDirect;
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object g(byte b2, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = b;
        int i = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                bigInteger = new BigInteger(new String(d(byteBuffer), charset), 16);
                break;
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                bigInteger = new String(d(byteBuffer), charset);
                break;
            case 8:
                return d(byteBuffer);
            case 9:
                int e = e(byteBuffer);
                int[] iArr = new int[e];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (e * 4));
                return iArr;
            case 10:
                int e2 = e(byteBuffer);
                long[] jArr = new long[e2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (e2 * 8));
                return jArr;
            case 11:
                int e3 = e(byteBuffer);
                double[] dArr = new double[e3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (e3 * 8));
                return dArr;
            case 12:
                int e4 = e(byteBuffer);
                ArrayList arrayList = new ArrayList(e4);
                while (i < e4) {
                    arrayList.add(f(byteBuffer));
                    i++;
                }
                return arrayList;
            case 13:
                int e5 = e(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < e5) {
                    hashMap.put(f(byteBuffer), f(byteBuffer));
                    i++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void o(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj == Boolean.TRUE) {
            byteArrayOutputStream.write(1);
        } else if (obj == Boolean.FALSE) {
            byteArrayOutputStream.write(2);
        } else {
            boolean z = obj instanceof Number;
            Charset charset = b;
            if (z) {
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    byteArrayOutputStream.write(3);
                    l(byteArrayOutputStream, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    byteArrayOutputStream.write(4);
                    m(byteArrayOutputStream, ((Long) obj).longValue());
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    byteArrayOutputStream.write(6);
                    h(byteArrayOutputStream, 8);
                    k(byteArrayOutputStream, ((Number) obj).doubleValue());
                } else if (obj instanceof BigInteger) {
                    byteArrayOutputStream.write(5);
                    i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(charset));
                } else {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
            } else if (obj instanceof String) {
                byteArrayOutputStream.write(7);
                i(byteArrayOutputStream, ((String) obj).getBytes(charset));
            } else if (obj instanceof byte[]) {
                byteArrayOutputStream.write(8);
                i(byteArrayOutputStream, (byte[]) obj);
            } else if (obj instanceof int[]) {
                byteArrayOutputStream.write(9);
                int[] iArr = (int[]) obj;
                n(byteArrayOutputStream, iArr.length);
                h(byteArrayOutputStream, 4);
                int length = iArr.length;
                while (i < length) {
                    l(byteArrayOutputStream, iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                byteArrayOutputStream.write(10);
                long[] jArr = (long[]) obj;
                n(byteArrayOutputStream, jArr.length);
                h(byteArrayOutputStream, 8);
                int length2 = jArr.length;
                while (i < length2) {
                    m(byteArrayOutputStream, jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                byteArrayOutputStream.write(11);
                double[] dArr = (double[]) obj;
                n(byteArrayOutputStream, dArr.length);
                h(byteArrayOutputStream, 8);
                int length3 = dArr.length;
                while (i < length3) {
                    k(byteArrayOutputStream, dArr[i]);
                    i++;
                }
            } else if (obj instanceof List) {
                byteArrayOutputStream.write(12);
                List<Object> list = (List) obj;
                n(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    o(byteArrayOutputStream, obj2);
                }
            } else if (obj instanceof Map) {
                byteArrayOutputStream.write(13);
                Map map = (Map) obj;
                n(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    o(byteArrayOutputStream, entry.getKey());
                    o(byteArrayOutputStream, entry.getValue());
                }
            } else {
                throw new IllegalArgumentException("Unsupported value: " + obj);
            }
        }
    }
}
