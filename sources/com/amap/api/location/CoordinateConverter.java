package com.amap.api.location;

import android.content.Context;
import com.loc.fr;
import com.loc.fy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CoordinateConverter {
    private static int b = 0;
    private static int c = 1;
    private static int d = 2;
    private static int e = 4;
    private static int f = 8;
    private static int g = 16;
    private static int h = 32;
    private static int i = 64;
    private Context j;
    private CoordType k = null;
    private DPoint l = null;

    /* renamed from: a  reason: collision with root package name */
    DPoint f4587a = null;

    /* compiled from: Taobao */
    /* renamed from: com.amap.api.location.CoordinateConverter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4588a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f4588a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4588a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4588a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4588a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4588a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4588a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4588a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS
    }

    public CoordinateConverter(Context context) {
        this.j = context;
    }

    public static float calculateLineDistance(DPoint dPoint, DPoint dPoint2) {
        try {
            return fy.a(dPoint, dPoint2);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return fr.a(d2, d3);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x0016, B:11:0x0025, B:13:0x0034, B:15:0x0043, B:16:0x0050, B:18:0x0055, B:20:0x005d, B:24:0x0068, B:25:0x0070, B:26:0x0074, B:28:0x007c, B:30:0x0084, B:31:0x0087, B:33:0x008f, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:40:0x00a9, B:41:0x00ac, B:43:0x00b4, B:45:0x00bc, B:46:0x00bf, B:49:0x00d4, B:50:0x00d8, B:55:0x00ee, B:57:0x00f9, B:58:0x00fe, B:59:0x0105, B:62:0x0109, B:63:0x0111, B:64:0x0112, B:65:0x011a, B:66:0x011b, B:67:0x0123, B:68:0x0124, B:69:0x012c), top: B:72:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.amap.api.location.DPoint convert() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.location.CoordinateConverter.convert():com.amap.api.location.DPoint");
    }

    public synchronized CoordinateConverter coord(DPoint dPoint) throws Exception {
        if (dPoint == null) {
            throw new IllegalArgumentException("传入经纬度对象为空");
        } else if (dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
            throw new IllegalArgumentException("请传入合理经度");
        } else if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d) {
            throw new IllegalArgumentException("请传入合理纬度");
        } else {
            this.l = dPoint;
        }
        return this;
    }

    public synchronized CoordinateConverter from(CoordType coordType) {
        this.k = coordType;
        return this;
    }
}
