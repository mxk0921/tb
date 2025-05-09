package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final pmi f26185a = new pmi();
    public static final boolean b;
    public static final Charset c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends ByteArrayOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/themis/graphics/MessageCodec$ExposedByteArrayOutputStream");
        }

        public byte[] e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("c01220f6", new Object[]{this});
            }
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        boolean z;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        c = Charset.forName("UTF8");
    }

    public static pmi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmi) ipChange.ipc$dispatch("3b43d9d0", new Object[0]);
        }
        return f26185a;
    }

    public static void d(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debedfc6", new Object[]{byteBuffer, new Integer(i)});
            return;
        }
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c2d8c728", new Object[]{byteBuffer});
        }
        byte[] bArr = new byte[f(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static int f(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4d10446", new Object[]{byteBuffer})).intValue();
        }
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

    public static void i(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81127d23", new Object[]{byteArrayOutputStream, new Integer(i)});
            return;
        }
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218c3c9f", new Object[]{byteArrayOutputStream, bArr});
            return;
        }
        p(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dc8bb4", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
        } else {
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i);
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210bbc2a", new Object[]{byteArrayOutputStream, new Double(d)});
        } else {
            o(byteArrayOutputStream, Double.doubleToLongBits(d));
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9a4259", new Object[]{byteArrayOutputStream, new Float(f)});
        } else {
            n(byteArrayOutputStream, Float.floatToIntBits(f));
        }
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1673f9ef", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
        } else {
            byteArrayOutputStream.write(i >>> 24);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i);
        }
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eca79b", new Object[]{byteArrayOutputStream, new Long(j)});
        } else if (b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
        } else {
            byteArrayOutputStream.write((byte) (j >>> 56));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) j);
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96481edf", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (i < 0) {
            lcn.f(RVLLevel.Error, "themis_gfx|writeSize", "write a negative size is not allowed!");
            throw new IllegalArgumentException("write a negative size is not allowed!");
        } else if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            k(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            n(byteArrayOutputStream, i);
        }
    }

    public JSONObject b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe20c4f6", new Object[]{this, byteBuffer});
        }
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.rewind();
        sds.e("Java_MessageCodec_decodeByteBuffer");
        byteBuffer.order(ByteOrder.nativeOrder());
        Object g = g(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        } else if (g instanceof JSONObject) {
            sds.h("Java_MessageCodec_decodeByteBuffer");
            return (JSONObject) g;
        } else {
            throw new IllegalArgumentException("decode to JSON with failure");
        }
    }

    public ByteBuffer c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("4ab63f2a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        sds.e("Java_MessageCodec_encodeJSONToBuffer");
        a aVar = new a();
        q(aVar, jSONObject);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.e(), 0, aVar.size());
        sds.h("Java_MessageCodec_encodeJSONToBuffer");
        return allocateDirect;
    }

    public final Object g(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("74a1103", new Object[]{this, byteBuffer});
        }
        if (byteBuffer.hasRemaining()) {
            return h(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public final void q(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8255ce6e", new Object[]{this, byteArrayOutputStream, obj});
        } else if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i = 1;
            }
            byteArrayOutputStream.write(i);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                n(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                o(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                i(byteArrayOutputStream, 8);
                l(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigDecimal) {
                byteArrayOutputStream.write(6);
                i(byteArrayOutputStream, 8);
                l(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                j(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            j(byteArrayOutputStream, obj.toString().getBytes(c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            j(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            p(byteArrayOutputStream, iArr.length);
            i(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i2 < length) {
                n(byteArrayOutputStream, iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            p(byteArrayOutputStream, jArr.length);
            i(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                o(byteArrayOutputStream, jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            p(byteArrayOutputStream, dArr.length);
            i(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                l(byteArrayOutputStream, dArr[i2]);
                i2++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            p(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                q(byteArrayOutputStream, obj2);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            p(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                q(byteArrayOutputStream, entry.getKey());
                q(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            p(byteArrayOutputStream, fArr.length);
            i(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i2 < length4) {
                m(byteArrayOutputStream, fArr[i2]);
                i2++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }

    public Object h(byte b2, ByteBuffer byteBuffer) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ac0514ca", new Object[]{this, new Byte(b2), byteBuffer});
        }
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
                return new BigInteger(new String(e(byteBuffer), c), 16);
            case 6:
                d(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(e(byteBuffer), c);
            case 8:
                e(byteBuffer);
                throw new IllegalArgumentException("parse failure because of byte array is not valid for JSONObject");
            case 9:
                int f = f(byteBuffer);
                int[] iArr = new int[f];
                d(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                JSONArray jSONArray = new JSONArray(f);
                while (i < f) {
                    jSONArray.add(Integer.valueOf(iArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (f * 4));
                return jSONArray;
            case 10:
                int f2 = f(byteBuffer);
                long[] jArr = new long[f2];
                d(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                JSONArray jSONArray2 = new JSONArray(f2);
                while (i < f2) {
                    jSONArray2.add(Long.valueOf(jArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (f2 * 8));
                return jSONArray2;
            case 11:
                int f3 = f(byteBuffer);
                double[] dArr = new double[f3];
                d(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                JSONArray jSONArray3 = new JSONArray(f3);
                while (i < f3) {
                    jSONArray3.add(Double.valueOf(dArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (f3 * 8));
                return jSONArray3;
            case 12:
                int f4 = f(byteBuffer);
                JSONArray jSONArray4 = new JSONArray(f4);
                while (i < f4) {
                    jSONArray4.add(g(byteBuffer));
                    i++;
                }
                return jSONArray4;
            case 13:
                int f5 = f(byteBuffer);
                JSONObject jSONObject = new JSONObject();
                while (i < f5) {
                    Object g = g(byteBuffer);
                    if (g instanceof CharSequence) {
                        jSONObject.put((JSONObject) ((String) g), (String) g(byteBuffer));
                        i++;
                    } else {
                        throw new IllegalStateException("parse failure because of map key is not a string!");
                    }
                }
                return jSONObject;
            case 14:
                int f6 = f(byteBuffer);
                float[] fArr = new float[f6];
                d(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                JSONArray jSONArray5 = new JSONArray(f6);
                while (i < f6) {
                    jSONArray5.add(Double.valueOf(fArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (f6 * 4));
                return jSONArray5;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }
}
