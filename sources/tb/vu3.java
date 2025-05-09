package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.utils.Global;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import tb.pwv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String U = vu3.class.getName();
    public static int V = 0;
    public static short W = -1;
    public static long X = 0;
    public static boolean Y = false;
    public static short[] Z = {-1, -1, -1};
    public static long a0 = 0;
    public static boolean b0 = false;
    public static short[] c0 = {-1, -1, -1};
    public static long d0 = 0;
    public static boolean e0 = false;
    public static float f0 = -1.0f;
    public static long g0 = 0;
    public static boolean h0 = false;
    public String A;
    public String B;
    public String E;
    public String F;
    public String L;
    public String M;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f30259a;
    public final Context b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public byte j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public String x;
    public final double y;
    public final double z;
    public int C = -1;
    public long D = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public int Q = 0;
    public int R = -1;
    public int S = -1;
    public final SensorEventListener T = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
                return;
            }
            try {
                Sensor sensor = sensorEvent.sensor;
                long currentTimeMillis = System.currentTimeMillis();
                if (sensor.getType() == 5) {
                    vu3.i(vu3.j(sensorEvent.values[0]));
                    vu3.k(currentTimeMillis);
                    vu3.l(false);
                } else if (sensor.getType() == 3) {
                    vu3.m(vu3.n(sensorEvent.values));
                    vu3.o(currentTimeMillis);
                    vu3.a(false);
                } else if (sensor.getType() == 1) {
                    vu3.b(vu3.n(sensorEvent.values));
                    vu3.c(currentTimeMillis);
                    vu3.d(false);
                } else if (sensor.getType() == 19) {
                    vu3.e(sensorEvent.values[0]);
                    vu3.f(currentTimeMillis);
                    vu3.g(false);
                }
                vu3.h(vu3.this, sensor.getType());
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_INT_VALUE = -1;
        public static final double GEO_NOT_SUPPORT = 0.0d;
        public static final int INT_VALUE_ZERO = 0;
        public static final String LOCAL_LATITUDE = "latitude";
        public static final String LOCAL_LONGITUDE = "longitude";
        public static final String VIEW_HEIGHT = "viewH";
        public static final String VIEW_WIDTH = "viewW";

        /* renamed from: a  reason: collision with root package name */
        public static final byte[] f30261a = {-1};

        static {
            t2o.a(1017118862);
        }

        public static /* synthetic */ byte[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("ddeae846", new Object[0]);
            }
            return f30261a;
        }
    }

    static {
        t2o.a(1017118859);
    }

    public vu3() {
    }

    public static byte[] A(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("1894d64f", new Object[]{new Integer(i)}) : new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
    }

    public static void B(OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50480ecf", new Object[]{outputStream, new Integer(i)});
            return;
        }
        outputStream.write((byte) (i >> 24));
        outputStream.write((byte) (i >> 16));
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) i);
    }

    public static void C(OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169752e1", new Object[]{outputStream, new Integer(i)});
            return;
        }
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) i);
    }

    public static void E(byte b2, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca43b9", new Object[]{new Byte(b2), bArr, new Integer(i)});
        } else {
            bArr[i] = b2;
        }
    }

    public static void F(byte[] bArr, byte[] bArr2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192b824f", new Object[]{bArr, bArr2, new Integer(i)});
            return;
        }
        bArr2[i] = bArr[0];
        bArr2[1 + i] = bArr[5];
        bArr2[2 + i] = bArr[10];
        bArr2[i + 3] = bArr[15];
    }

    public static void G(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4105ec96", new Object[]{str, bArr, new Integer(i)});
            return;
        }
        try {
            String[] split = str.split("\\.");
            bArr[i] = Integer.valueOf(split[0]).byteValue();
            bArr[i + 1] = Integer.valueOf(split[1]).byteValue();
        } catch (Exception unused) {
        }
    }

    public static byte[] H(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("64d3054b", new Object[]{sArr});
        }
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            System.arraycopy(I(sArr[i]), 0, bArr, i * 2, 2);
        }
        return bArr;
    }

    public static byte[] I(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("dbfd0298", new Object[]{new Short(s)}) : new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static void J(OutputStream outputStream, String str, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f6324", new Object[]{outputStream, str, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (TextUtils.isEmpty(str)) {
            outputStream.write(0);
            return;
        }
        byte[] bytes = str.getBytes();
        if (bytes.length > i) {
            bytes = Arrays.copyOf(bytes, i);
        }
        outputStream.write((byte) bytes.length);
        outputStream.write(bytes);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ade0430", new Object[]{new Boolean(z)})).booleanValue();
        }
        b0 = z;
        return z;
    }

    public static /* synthetic */ short[] b(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("2fd7abcd", new Object[]{sArr});
        }
        c0 = sArr;
        return sArr;
    }

    public static /* synthetic */ long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aa021ce", new Object[]{new Long(j)})).longValue();
        }
        d0 = j;
        return j;
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2818acd", new Object[]{new Boolean(z)})).booleanValue();
        }
        e0 = z;
        return z;
    }

    public static /* synthetic */ float e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a626c84", new Object[]{new Float(f)})).floatValue();
        }
        f0 = f;
        return f;
    }

    public static /* synthetic */ long f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8243a86b", new Object[]{new Long(j)})).longValue();
        }
        g0 = j;
        return j;
    }

    public static /* synthetic */ boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea25116a", new Object[]{new Boolean(z)})).booleanValue();
        }
        h0 = z;
        return z;
    }

    public static /* synthetic */ void h(vu3 vu3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2868b58c", new Object[]{vu3Var, new Integer(i)});
        } else {
            vu3Var.L(i);
        }
    }

    public static /* synthetic */ short i(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f8b7ce", new Object[]{new Short(s)})).shortValue();
        }
        W = s;
        return s;
    }

    public static /* synthetic */ short j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d7002a2", new Object[]{new Float(f)})).shortValue();
        }
        return u(f);
    }

    public static /* synthetic */ long k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8baefba", new Object[]{new Long(j)})).longValue();
        }
        X = j;
        return j;
    }

    public static /* synthetic */ boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c58b9", new Object[]{new Boolean(z)})).booleanValue();
        }
        Y = z;
        return z;
    }

    public static /* synthetic */ short[] m(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("8f530216", new Object[]{sArr});
        }
        Z = sArr;
        return sArr;
    }

    public static /* synthetic */ short[] n(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("b3d430a4", new Object[]{fArr});
        }
        return s(fArr);
    }

    public static /* synthetic */ long o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883fa336", new Object[]{new Long(j)})).longValue();
        }
        a0 = j;
        return j;
    }

    public static short[] s(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("96276531", new Object[]{fArr});
        }
        short[] sArr = new short[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            sArr[i] = u(fArr[i]);
        }
        return sArr;
    }

    public static byte[] t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e75a598", new Object[]{new Float(f)});
        }
        byte[] bArr = new byte[4];
        try {
            int floatToIntBits = Float.floatToIntBits(f);
            bArr[0] = (byte) (floatToIntBits & 255);
            bArr[1] = (byte) ((floatToIntBits >> 8) & 255);
            bArr[2] = (byte) ((floatToIntBits >> 16) & 255);
            bArr[3] = (byte) ((floatToIntBits >> 24) & 255);
        } catch (Throwable unused) {
            Arrays.fill(bArr, (byte) -1);
        }
        return bArr;
    }

    public static short u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c3cbb8c", new Object[]{new Float(f)})).shortValue();
        }
        int floatToIntBits = Float.floatToIntBits(f);
        int i = (floatToIntBits >>> 16) & 32768;
        int i2 = Integer.MAX_VALUE & floatToIntBits;
        int i3 = i2 + 4096;
        if (i3 >= 1199570944) {
            if (i2 < 1199570944) {
                return (short) (i | 31743);
            }
            if (i3 < 2139095040) {
                return (short) (i | 31744);
            }
            return (short) (((floatToIntBits & 8388607) >>> 13) | i | 31744);
        } else if (i3 >= 947912704) {
            return (short) (((i2 - 939520000) >>> 13) | i);
        } else {
            if (i3 < 855638016) {
                return (short) i;
            }
            int i4 = i2 >>> 23;
            return (short) (((((floatToIntBits & 8388607) | 8388608) + (8388608 >>> (i4 - 102))) >>> (126 - i4)) | i);
        }
    }

    public static void v(OutputStream outputStream, double d, int i) throws IOException {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804ce7d2", new Object[]{outputStream, new Double(d), new Integer(i)});
            return;
        }
        int i4 = (d > b.GEO_NOT_SUPPORT ? 1 : (d == b.GEO_NOT_SUPPORT ? 0 : -1));
        if (i4 != 0) {
            int floor = (int) Math.floor(Math.abs(d));
            int floor2 = (int) Math.floor(pwv.r(Math.abs(d)) * 60.0d);
            if (i4 > 0) {
                i3 = floor + 180;
            } else {
                i3 = 180 - floor;
            }
            i2 = (floor2 & 63) | ((i3 << 6) & 32704);
        } else {
            i2 = -1;
        }
        C(outputStream, i2);
    }

    public static void w(OutputStream outputStream, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af54c9", new Object[]{outputStream, str});
        } else if (str == null || str.trim().length() <= 0) {
            outputStream.write(0);
        } else {
            byte[] bytes = str.getBytes();
            outputStream.write((byte) bytes.length);
            outputStream.write(bytes);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1ce03a", new Object[]{this});
            return;
        }
        W = (short) -1;
        Z = new short[]{-1, -1, -1};
        c0 = new short[]{-1, -1, -1};
        f0 = -1.0f;
    }

    public final String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d981946", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("emulator:\r\n");
        sb.append("osVersion:" + this.e);
        sb.append("\r\n");
        sb.append("MAC:" + this.g);
        sb.append("\r\n");
        sb.append("IMSI:" + this.h);
        sb.append("\r\n");
        sb.append("deviceId:" + this.i);
        sb.append("\r\n");
        sb.append("deviceType:" + ((int) this.j));
        sb.append("\r\n");
        sb.append("manufacturer:" + this.k);
        sb.append("\r\n");
        sb.append("appWidth:" + this.l);
        sb.append("\r\n");
        sb.append("appHight:" + this.m);
        sb.append("\r\n");
        sb.append("screenDensity:" + this.n);
        sb.append("\r\n");
        sb.append("screenBright:" + this.o);
        sb.append("\r\n");
        sb.append("netType:" + this.p);
        sb.append("\r\n");
        sb.append("netProtocol:" + this.q);
        sb.append("\r\n");
        sb.append("appRunTime:" + V);
        sb.append("\r\n");
        sb.append("touchDownX:" + this.r);
        sb.append("\r\n");
        sb.append("touchDownY:" + this.s);
        sb.append("\r\n");
        sb.append("availPower:" + this.t);
        sb.append("\r\n");
        sb.append("totalMemory:" + this.u);
        sb.append("\r\n");
        sb.append("availMemory:" + this.v);
        sb.append("\r\n");
        sb.append("netTraffic:" + this.w);
        sb.append("\r\n");
        sb.append("packName:" + this.x);
        sb.append("\r\n");
        sb.append("longitude:" + this.y);
        sb.append("\r\n");
        sb.append("latitude:" + this.z);
        sb.append("\r\nisRoot:-1\r\n");
        sb.append("sensorNum:" + this.C);
        sb.append("\r\n");
        sb.append("deviceElapseTime:" + this.D);
        sb.append("\r\n");
        sb.append("ssid:" + this.E);
        sb.append("\r\n");
        sb.append("bssid:" + this.F);
        sb.append("\r\n");
        sb.append("systemVolume:" + this.G);
        sb.append("\r\n");
        sb.append("callVolume:" + this.H);
        sb.append("\r\n");
        sb.append("ringVolume:" + this.I);
        sb.append("\r\n");
        sb.append("musicVolume:" + this.J);
        sb.append("\r\n");
        sb.append("alarmVolume:" + this.K);
        sb.append("\r\n");
        sb.append("appVersion:" + this.L);
        sb.append("\r\n");
        sb.append("sdkVersion:" + this.M);
        sb.append("\r\n");
        return sb.toString();
    }

    public final void L(int i) {
        Sensor defaultSensor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a440b7b2", new Object[]{this, new Integer(i)});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.b.getSystemService(APower.TYPE_SENSOR);
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(i)) != null) {
            sensorManager.unregisterListener(this.T, defaultSensor);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b372d9", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = (int) ((currentTimeMillis - X) / 1000);
        this.N = i;
        if (i > 65535) {
            this.N = 65535;
        }
        int i2 = (int) ((currentTimeMillis - a0) / 1000);
        this.O = i2;
        if (i2 > 65535) {
            this.O = 65535;
        }
        int i3 = (int) ((currentTimeMillis - d0) / 1000);
        this.P = i3;
        if (i3 > 65535) {
            this.P = 65535;
        }
        int i4 = (int) ((currentTimeMillis - g0) / 1000);
        this.Q = i4;
        if (i4 > 65535) {
            this.Q = 65535;
        }
    }

    public String q(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{this, str});
        }
        String str2 = U;
        TaoLog.Logd(str2, "Encode data:" + K());
        this.A = str;
        return pwv.x(new String(r()));
    }

    public final byte[] r() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("98dd45bc", new Object[]{this});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        w(byteArrayOutputStream, this.f);
        C(byteArrayOutputStream, this.e);
        w(byteArrayOutputStream, this.g);
        w(byteArrayOutputStream, this.h);
        w(byteArrayOutputStream, this.i);
        byteArrayOutputStream.write(this.j);
        w(byteArrayOutputStream, this.k);
        C(byteArrayOutputStream, this.l);
        C(byteArrayOutputStream, this.m);
        C(byteArrayOutputStream, this.n);
        byteArrayOutputStream.write((byte) this.o);
        byteArrayOutputStream.write((byte) this.p);
        byteArrayOutputStream.write((byte) this.q);
        B(byteArrayOutputStream, V);
        C(byteArrayOutputStream, this.r);
        C(byteArrayOutputStream, this.s);
        byteArrayOutputStream.write((byte) this.t);
        C(byteArrayOutputStream, this.u);
        C(byteArrayOutputStream, this.v);
        C(byteArrayOutputStream, this.w);
        w(byteArrayOutputStream, this.x);
        v(byteArrayOutputStream, this.y, 180);
        v(byteArrayOutputStream, this.z, 180);
        byteArrayOutputStream.write(b.a());
        w(byteArrayOutputStream, this.A);
        w(byteArrayOutputStream, this.B);
        byteArrayOutputStream.write((byte) this.C);
        B(byteArrayOutputStream, (int) this.D);
        J(byteArrayOutputStream, this.E, 32);
        J(byteArrayOutputStream, this.F, 17);
        byteArrayOutputStream.write((byte) this.G);
        byteArrayOutputStream.write((byte) this.H);
        byteArrayOutputStream.write((byte) this.I);
        byteArrayOutputStream.write((byte) this.J);
        byteArrayOutputStream.write((byte) this.K);
        w(byteArrayOutputStream, this.L);
        w(byteArrayOutputStream, this.M);
        p();
        byteArrayOutputStream.write(I(W));
        byteArrayOutputStream.write(A(this.N));
        byteArrayOutputStream.write(H(Z));
        byteArrayOutputStream.write(A(this.O));
        byteArrayOutputStream.write(H(c0));
        byteArrayOutputStream.write(A(this.P));
        byteArrayOutputStream.write(t(f0));
        byteArrayOutputStream.write(A(this.Q));
        byteArrayOutputStream.write((byte) this.R);
        byteArrayOutputStream.write((byte) this.S);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[byteArray.length + 7];
        this.f30259a = pwv.a.a(byteArray);
        G(this.c, bArr, 0);
        F(this.f30259a, bArr, 2);
        E((byte) this.d, bArr, 6);
        System.arraycopy(byteArray, 0, bArr, 7, byteArray.length);
        try {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Base64.encode(bArr, 0);
        } finally {
            D();
            byteArrayOutputStream.close();
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f874892", new Object[]{this});
            return;
        }
        this.c = IPlayPublicService.PlayRate.PLAY_SPEED_1_5X;
        if (V == 0) {
            V = (int) (Global.getStartupTimestamp() / 1000);
        }
        this.d = 1;
        this.e = pwv.p();
        this.f = pwv.j();
        this.g = pwv.l(this.b);
        this.h = pwv.k(this.b);
        this.i = pwv.i(this.b);
        this.j = (byte) 3;
        this.k = pwv.m();
        this.l = pwv.e(this.b);
        this.m = pwv.d(this.b);
        this.r = -1;
        this.s = -1;
        this.t = pwv.g(this.b);
        this.n = pwv.u(this.b);
        this.o = pwv.t(this.b);
        this.p = pwv.o(this.b);
        this.q = pwv.n(this.b);
        this.u = pwv.w(this.b);
        this.v = pwv.f(this.b);
        this.w = -1;
        this.x = pwv.q(this.b);
        this.B = "";
        if (vm2.q()) {
            this.C = pwv.v(this.b);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.D = elapsedRealtime;
            if (elapsedRealtime > 2147483647L) {
                long j = elapsedRealtime / 1000;
                this.D = j;
                if (j > 2147483647L) {
                    this.D = -1L;
                }
            }
            this.E = pwv.s();
            this.F = pwv.h();
            z();
            this.L = Global.getVersionName();
            this.M = "5.15.27";
        }
        this.R = pwv.c(this.b);
        this.S = pwv.b(this.b);
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f77bd1", new Object[]{this});
            return;
        }
        AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
        this.G = audioManager.getStreamVolume(1);
        this.H = audioManager.getStreamVolume(0);
        this.I = audioManager.getStreamVolume(2);
        this.J = audioManager.getStreamVolume(3);
        this.K = audioManager.getStreamVolume(4);
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773ead45", new Object[]{this});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.b.getSystemService(APower.TYPE_SENSOR);
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            if (defaultSensor != null && !Y) {
                sensorManager.registerListener(this.T, defaultSensor, 3);
                Y = true;
            }
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(3);
            if (defaultSensor2 != null && !b0) {
                sensorManager.registerListener(this.T, defaultSensor2, 3);
                b0 = true;
            }
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(1);
            if (defaultSensor3 != null && !e0) {
                sensorManager.registerListener(this.T, defaultSensor3, 3);
                e0 = true;
            }
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(19);
            if (defaultSensor4 != null && !h0) {
                sensorManager.registerListener(this.T, defaultSensor4, 3);
                h0 = true;
            }
        }
    }

    public vu3(Context context, Bundle bundle) {
        TBLocationDTO a2;
        this.b = context;
        y();
        if (bundle != null) {
            this.y = bundle.getDouble("longitude", b.GEO_NOT_SUPPORT);
            this.z = bundle.getDouble("latitude", b.GEO_NOT_SUPPORT);
        } else {
            this.y = b.GEO_NOT_SUPPORT;
            this.z = b.GEO_NOT_SUPPORT;
            yyd b2 = com.taobao.alimama.services.a.e().b();
            if (!(b2 == null || (a2 = b2.a()) == null)) {
                try {
                    this.y = Double.parseDouble(a2.longitude);
                    this.z = Double.parseDouble(a2.latitude);
                } catch (Exception unused) {
                }
            }
        }
        x();
    }
}
