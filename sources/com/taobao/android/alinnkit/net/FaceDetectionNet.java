package com.taobao.android.alinnkit.net;

import android.content.Context;
import android.os.Debug;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNFlipType;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.alinnkit.entity.NativeFaceInfo;
import com.taobao.android.alinnkit.exception.AliNNKitLibraryLoadException;
import com.taobao.android.alinnkit.json.ModelConfig;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import tb.asj;
import tb.bzf;
import tb.bzn;
import tb.kgd;
import tb.oq0;
import tb.qq0;
import tb.t2o;
import tb.vj1;
import tb.zrj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FaceDetectionNet extends AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "FaceDetection";
    public static final boolean j;

    /* renamed from: a  reason: collision with root package name */
    public long f6337a;
    public long b;
    public long c;
    public long d;
    public long e;
    public final int[] f = new int[5];
    public final float[] g = new float[FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH];
    public final float[] h;
    public final float[] i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum DetectParamType {
        FACE_PARAM_DETECT_INTERVAL(1),
        FACE_PARAM_SMOOTH_THRESHOLD(2),
        FACE_PARAM_POSE_SMOOTH_THRESHOLD(4),
        FACE_PARAM_DETECT_THRESHOLD(5),
        FACE_ACTION_EYE_BLINK(6),
        FACE_ACTION_MOUTH_AH(7),
        FACE_ACTION_HEAD_YAW(8),
        FACE_ACTION_HEAD_PITCH(9),
        FACE_ACTION_BROW_JUMP(10),
        FACE_PARAM_ALIGNMENT_INTERVAL(11),
        FACE_PARAM_MAX_FACE_SUPPORT(12),
        FACE_PARAM_DETECT_IMG_SIZE(13);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int type;

        DetectParamType(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(DetectParamType detectParamType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/net/FaceDetectionNet$DetectParamType");
        }

        public static DetectParamType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetectParamType) ipChange.ipc$dispatch("e881c8e1", new Object[]{str});
            }
            return (DetectParamType) Enum.valueOf(DetectParamType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FaceDetectMode {
        MOBILE_DETECT_MODE_VIDEO,
        MOBILE_DETECT_MODE_IMAGE,
        SCOPE_DETECT_MODE_VIDEO,
        SCOPE_DETECT_MODE_IMAGE,
        CAT_DETECT_MODE_VIDEO,
        CAT_DETECT_MODE_IMAGE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FaceDetectMode faceDetectMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/net/FaceDetectionNet$FaceDetectMode");
        }

        public static FaceDetectMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FaceDetectMode) ipChange.ipc$dispatch("4158740e", new Object[]{str});
            }
            return (FaceDetectMode) Enum.valueOf(FaceDetectMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FacePixelFormat {
        FACE_PIXEL_FORMAT_Y(1),
        FACE_PIXEL_FORMAT_RGBA8888(2),
        FACE_PIXEL_FORMAT_BGRA8888(3),
        FACE_PIXEL_FORMAT_RGB888(4),
        FACE_PIXEL_FORMAT_BGR888(5),
        FACE_PIXEL_FORMAT_YUV420(6),
        FACE_PIXEL_FORMAT_NV21(7);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int format;

        FacePixelFormat(int i) {
            this.format = i;
        }

        public static /* synthetic */ Object ipc$super(FacePixelFormat facePixelFormat, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/net/FaceDetectionNet$FacePixelFormat");
        }

        public static FacePixelFormat valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FacePixelFormat) ipChange.ipc$dispatch("ca8166e5", new Object[]{str});
            }
            return (FacePixelFormat) Enum.valueOf(FacePixelFormat.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements oq0<FaceDetectionNet> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f6338a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(b bVar, Context context, String str) {
            this.f6338a = bVar;
            this.b = context;
            this.c = str;
        }

        /* renamed from: b */
        public FaceDetectionNet a(File file) {
            long j;
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FaceDetectionNet) ipChange.ipc$dispatch("e5bb1f7", new Object[]{this, file});
            }
            String path = new File(file, "fd_00002_1").getPath();
            String path2 = new File(file, "fd_00002_12").getPath();
            FaceDetectMode faceDetectMode = FaceDetectMode.MOBILE_DETECT_MODE_VIDEO;
            FaceDetectMode faceDetectMode2 = this.f6338a.f6339a;
            if (!(faceDetectMode == faceDetectMode2 || FaceDetectMode.MOBILE_DETECT_MODE_IMAGE == faceDetectMode2)) {
                if (FaceDetectMode.SCOPE_DETECT_MODE_VIDEO == faceDetectMode2 || FaceDetectMode.SCOPE_DETECT_MODE_IMAGE == faceDetectMode2) {
                    path = new File(file, "fd_00002_3").getPath();
                } else if (FaceDetectMode.CAT_DETECT_MODE_VIDEO == faceDetectMode2 || FaceDetectMode.CAT_DETECT_MODE_IMAGE == faceDetectMode2) {
                    path = new File(file, "fd_00002_21").getPath();
                    path2 = new File(file, "fd_00002_22").getPath();
                }
            }
            File file2 = new File(path);
            File file3 = new File(path2);
            if (!file2.exists() || !file3.exists()) {
                return null;
            }
            long a2 = FaceDetectionNet.a(this.f6338a.f6339a.ordinal(), path, path2, 4, 0);
            long j2 = 0;
            if (a2 == 0) {
                bzf.b("AliNNJava", "create face net return null ptr", new Object[0]);
                return null;
            }
            String b = FaceDetectionNet.b(a2);
            String h = FaceDetectionNet.h(a2);
            this.f6338a.getClass();
            this.f6338a.getClass();
            if (this.f6338a.b) {
                String path3 = new File(file, "fd_00002_4").getPath();
                if (!new File(path3).exists()) {
                    return null;
                }
                long i = FaceDetectionNet.i(path3);
                if (i == 0) {
                    bzf.a("AliNNJava", "create face smile net return null ptr", new Object[0]);
                    return null;
                }
                str = FaceDetectionNet.j(i);
                j = i;
            } else {
                j = 0;
                str = "";
            }
            if (this.f6338a.c) {
                String path4 = new File(file, "fd_00002_5").getPath();
                if (!new File(path4).exists()) {
                    return null;
                }
                long k = FaceDetectionNet.k(path4);
                if (k == 0) {
                    bzf.a("AliNNJava", "create face attribute net return null ptr", new Object[0]);
                    return null;
                }
                str2 = FaceDetectionNet.c(k);
                j2 = k;
            } else {
                str2 = "";
            }
            this.f6338a.getClass();
            this.f6338a.getClass();
            if (!FaceDetectionNet.d(this.b.getApplicationContext(), this.c, b, h, "", "", str, str2, "", "", this.f6338a).booleanValue()) {
                bzf.b("AliNNJava", "license code or model not match, please input the correct code or models", new Object[0]);
                FaceDetectionNet.e(a2);
                if (this.f6338a.b) {
                    FaceDetectionNet.f(j);
                }
                if (this.f6338a.c) {
                    FaceDetectionNet.g(j2);
                }
                this.f6338a.getClass();
                this.f6338a.getClass();
                return null;
            }
            this.f6338a.getClass();
            return new FaceDetectionNet(a2, j, j2, 0L, 0L, false, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public FaceDetectMode f6339a = FaceDetectMode.MOBILE_DETECT_MODE_VIDEO;
        public boolean b = false;
        public boolean c = false;

        static {
            t2o.a(460324872);
        }
    }

    static {
        t2o.a(460324869);
        try {
            if (!AliNNKitBaseNet.isCpuAbiSupported(kgd.ABI_ARM) && !AliNNKitBaseNet.isCpuAbiSupported(kgd.ABI_ARM64)) {
                return;
            }
            boolean i = bzn.d().c("mnnface").i();
            j = i;
            bzf.e(BIZ_NAME, "Load Lib With RemoteSo -" + i, new Object[0]);
        } catch (Throwable th) {
            bzf.b("AliNNJava", "load libmnnface.so exception=%s", th);
        }
    }

    public FaceDetectionNet(long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        float[] fArr;
        this.f6337a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        float[] fArr2 = null;
        if (z) {
            fArr = new float[FaceDetectionReport.NATIVE_EXTRA_FLOAT_OUT_LENGTH];
        } else {
            fArr = null;
        }
        this.h = fArr;
        this.i = z2 ? new float[82] : fArr2;
    }

    public static /* synthetic */ long a(int i, String str, String str2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd78c9d4", new Object[]{new Integer(i), str, str2, new Integer(i2), new Integer(i3)})).longValue();
        }
        return nativeCreateFrom(i, str, str2, i2, i3);
    }

    public static /* synthetic */ String b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("418b6314", new Object[]{new Long(j2)});
        }
        return nativeGetBizCodeFaceDetection(j2);
    }

    public static /* synthetic */ String c(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2836b582", new Object[]{new Long(j2)});
        }
        return nativeGetBizCodeFaceAttribute(j2);
    }

    public static /* synthetic */ Boolean d(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("252a7733", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, bVar});
        }
        return l(context, str, str2, str3, str4, str5, str6, str7, str8, str9, bVar);
    }

    public static /* synthetic */ void e(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bb2418", new Object[]{new Long(j2)});
        } else {
            nativeRelease(j2);
        }
    }

    public static /* synthetic */ void f(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9c50f7", new Object[]{new Long(j2)});
        } else {
            nativeSmileRelease(j2);
        }
    }

    public static /* synthetic */ void g(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67d7dd6", new Object[]{new Long(j2)});
        } else {
            nativeAttributeRelease(j2);
        }
    }

    public static /* synthetic */ String h(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5bbb015", new Object[]{new Long(j2)});
        }
        return nativeGetBizCodeFaceAlignment(j2);
    }

    public static /* synthetic */ long i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d64cfc7c", new Object[]{str})).longValue();
        }
        return nativeSmileCreateFrom(str);
    }

    public static /* synthetic */ Object ipc$super(FaceDetectionNet faceDetectionNet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/net/FaceDetectionNet");
    }

    public static /* synthetic */ String j(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dedd7e1b", new Object[]{new Long(j2)});
        }
        return nativeGetBizCodeFaceSmile(j2);
    }

    public static /* synthetic */ long k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dead967e", new Object[]{str})).longValue();
        }
        return nativeAttributeCreateFrom(str);
    }

    public static Boolean l(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("77e47576", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, bVar});
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(str2);
        if (str3 == null) {
            str3 = "";
        }
        arrayList.add(str3);
        bVar.getClass();
        if (bVar.b) {
            if (str6 == null) {
                str6 = "";
            }
            arrayList.add(str6);
        }
        if (bVar.c) {
            if (str7 == null) {
                str7 = "";
            }
            arrayList.add(str7);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return vj1.a(context, str, strArr);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44cd5c7f", new Object[0])).booleanValue();
        }
        if (!j || !AliNNKitBaseNet.isNativeLibAvailable()) {
            return true;
        }
        return false;
    }

    private static native long nativeAttributeCreateFrom(String str);

    private static native void nativeAttributeRelease(long j2);

    private static native long nativeCreateFrom(int i, String str, String str2, int i2, int i3);

    private static native int nativeFaceAdd240SubNet(long j2, String str);

    private static native int nativeFaceAddEyeballSubNet(long j2, String str);

    private static native long nativeFaceLivenessCreateFrom(String str);

    private static native void nativeFaceLivenessRelease(long j2);

    private static native long nativeFaceRecognitionCreateFrom(String str);

    private static native void nativeFaceRecognitionRelease(long j2);

    private static native float nativeFaceRecognitionSimilarity(long j2, float[] fArr, float[] fArr2);

    private static native String nativeGetBizCodeFace240SubNet(long j2);

    private static native String nativeGetBizCodeFaceAlignment(long j2);

    private static native String nativeGetBizCodeFaceAttribute(long j2);

    private static native String nativeGetBizCodeFaceDetection(long j2);

    private static native String nativeGetBizCodeFaceEyeballSubNet(long j2);

    private static native String nativeGetBizCodeFaceLiveness(long j2);

    private static native String nativeGetBizCodeFaceRecognition(long j2);

    private static native String nativeGetBizCodeFaceSmile(long j2);

    private static native FaceDetectionReport[] nativeInference(long j2, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, long j3, int i6, int i7, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    private static native FaceDetectionReport[] nativeInference(long j2, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j3, int i6, int i7, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    private static native FaceDetectionReport[] nativeInferenceARGB(long j2, int[] iArr, int i, int i2, int i3, long j3, int i4, int i5, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    public static native String nativeInferenceFaceAttribute(long j2, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, int[][] iArr, float[][] fArr);

    private static native String nativeInferenceFaceAttribute(long j2, byte[] bArr, int i, int i2, int i3, long j3, int[][] iArr, float[][] fArr);

    private static native String nativeInferenceFaceLiveness(long j2, byte[] bArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr, long j3);

    private static native float[] nativeInferenceFaceRecognition(long j2, byte[] bArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr, long j3);

    private static native float[] nativeInferenceFaceRecognition(long j2, int[] iArr, int i, int i2, int i3, int[] iArr2, float[] fArr, long j3);

    public static native String nativeInferenceFaceSmile(long j2, ByteBuffer byteBuffer, int i, int i2, int i3, int[] iArr, float[] fArr, long j3);

    public static native String nativeInferenceFaceSmile(long j2, byte[] bArr, int i, int i2, int i3, int[] iArr, float[] fArr, long j3);

    private static native void nativeRelease(long j2);

    private static native int nativeResetTracking(long j2);

    private static native void nativeSetParamThreshold(long j2, int i, float f);

    public static native void nativeSetSmileThreshold(long j2, float f);

    @Deprecated
    public static native void nativeSetSmoothThreshold(long j2, float f);

    private static native long nativeSmileCreateFrom(String str);

    private static native void nativeSmileRelease(long j2);

    public static native FaceDetectionReport nativeTransformDetectResult(long j2, int i, int i2, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, long j3, int[] iArr2, float[] fArr4, float[] fArr5, float[] fArr6, int i3, int i4);

    public static void s(Context context, b bVar, String str, asj<FaceDetectionNet> asjVar) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329aebe4", new Object[]{context, bVar, str, asjVar});
        } else if (context == null || asjVar == null) {
            throw new IllegalArgumentException("context or listener cannot be null");
        } else if (m()) {
            asjVar.a(new AliNNKitLibraryLoadException());
        } else {
            if (bVar == null) {
                bVar = new b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(BIZ_NAME);
            FaceDetectMode faceDetectMode = FaceDetectMode.MOBILE_DETECT_MODE_VIDEO;
            FaceDetectMode faceDetectMode2 = bVar.f6339a;
            if (faceDetectMode == faceDetectMode2 || FaceDetectMode.MOBILE_DETECT_MODE_IMAGE == faceDetectMode2) {
                arrayList.add("fd_00002_1");
                arrayList.add("fd_00002_12");
            } else if (FaceDetectMode.SCOPE_DETECT_MODE_VIDEO == faceDetectMode2 || FaceDetectMode.SCOPE_DETECT_MODE_IMAGE == faceDetectMode2) {
                arrayList.add("fd_00002_3");
                arrayList.add("fd_00002_12");
            } else if (FaceDetectMode.CAT_DETECT_MODE_VIDEO == faceDetectMode2 || FaceDetectMode.CAT_DETECT_MODE_IMAGE == faceDetectMode2) {
                arrayList.add("fd_00002_21");
                arrayList.add("fd_00002_22");
            }
            if (bVar.b) {
                arrayList.add("fd_00002_4");
            }
            if (bVar.c) {
                arrayList.add("fd_00002_5");
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            ModelConfig modelConfig = new ModelConfig();
            modelConfig.m = "946";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e41b79f771cca9875e41b62bd374deee";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/946/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap = new HashMap();
            hashMap.put("fd_00002_21", "af1297797c4b0341647bea1f4c753148");
            hashMap.put("fd_00002_12", "a0bbd6d2de593f798f1f05adf848d8df");
            hashMap.put("fd_00002_22", "9827b634b874c527932cdce494c4b435");
            hashMap.put("resource", "0b3d248490210348a473be203e2a1de8");
            hashMap.put("fd_00002_6", "01a1d9398985985b7d726e489dfb4633");
            hashMap.put("fd_00002_7", "851124c6406df62ea53a9e5a2e4e9ddb");
            hashMap.put("fd_00002_8", "bcdd54266d616b7dc29923f6e09422d3");
            hashMap.put("fd_00002_2", "3ba4d6202642dee4a8fa657093a4dacb");
            hashMap.put("fd_00002_3", "d692868b6845bbab338c37cab3e0f358");
            hashMap.put("fd_00002_4", "cf62eca50aafdce97cd57607cde826c9");
            hashMap.put("fd_00002_5", "8baac51f8eb90cd2976c1a0c75c42d2d");
            hashMap.put("fd_00002_1", "080cc7a62e1633e155a7829b77c3dd41");
            modelConfig.models = hashMap;
            new zrj(context.getApplicationContext(), asjVar, new a(bVar, context, str), modelConfig).execute(strArr);
        }
    }

    @Deprecated
    public static void t(Context context, FaceDetectMode faceDetectMode, boolean z, boolean z2, String str, asj<FaceDetectionNet> asjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e7995c", new Object[]{context, faceDetectMode, new Boolean(z), new Boolean(z2), str, asjVar});
            return;
        }
        b bVar = new b();
        bVar.f6339a = faceDetectMode;
        bVar.b = z;
        bVar.c = z2;
        s(context, bVar, str, asjVar);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6d1a5b", new Object[]{this});
        } else if (this.f6337a == 0) {
            throw new RuntimeException("FaceDetectionNet native pointer is null");
        }
    }

    public FaceDetectionReport[] o(byte[] bArr, int i, int i2, int i3, long j2, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("bd4c1774", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j2), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        }
        return p(bArr, FacePixelFormat.FACE_PIXEL_FORMAT_Y, i, i2, i3, j2, i4, aliNNFlipType, z, nativeFaceInfo);
    }

    public synchronized FaceDetectionReport[] p(byte[] bArr, FacePixelFormat facePixelFormat, int i, int i2, int i3, long j2, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("ae39bb0c", new Object[]{this, bArr, facePixelFormat, new Integer(i), new Integer(i2), new Integer(i3), new Long(j2), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        } else if (this.f6337a == 0) {
            return null;
        } else {
            long[] a2 = nativeFaceInfo != null ? nativeFaceInfo.a() : null;
            if (!z && a2 == null) {
                return null;
            }
            qq0.a aVar = new qq0.a();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            long currentTimeMillis = System.currentTimeMillis();
            FaceDetectionReport[] nativeInference = nativeInference(this.f6337a, bArr, facePixelFormat.format, i, i2, 0, i3, j2, i4, aliNNFlipType.type, this.f, this.g, this.h, this.i, z, a2);
            if (nativeInference != null && nativeInference.length > 0) {
                aVar.b = (float) (System.currentTimeMillis() - currentTimeMillis);
                aVar.f26876a = (float) ((Debug.getNativeHeapAllocatedSize() - nativeHeapAllocatedSize) / 1024);
                aVar.a(BIZ_NAME, this.mModelId, this.mModelFiles, "0", 1.0f, 0.0f, false);
            }
            return nativeInference;
        }
    }

    public FaceDetectionReport[] q(int[] iArr, int i, int i2, int i3, long j2, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("5584120d", new Object[]{this, iArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j2), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        }
        return r(iArr, i, i2, i3, j2, i4, aliNNFlipType, z, nativeFaceInfo);
    }

    public final synchronized FaceDetectionReport[] r(int[] iArr, int i, int i2, int i3, long j2, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("9a58c041", new Object[]{this, iArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j2), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        } else if (this.f6337a == 0) {
            return null;
        } else {
            if (nativeFaceInfo != null) {
                jArr = nativeFaceInfo.a();
            } else {
                jArr = null;
            }
            if (!z && jArr == null) {
                return null;
            }
            qq0.a aVar = new qq0.a();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            long currentTimeMillis = System.currentTimeMillis();
            FaceDetectionReport[] nativeInferenceARGB = nativeInferenceARGB(this.f6337a, iArr, i, i2, i3, j2, i4, aliNNFlipType.type, this.f, this.g, this.h, this.i, z, jArr);
            if (nativeInferenceARGB != null && nativeInferenceARGB.length > 0) {
                aVar.b = (float) (System.currentTimeMillis() - currentTimeMillis);
                aVar.f26876a = (float) ((Debug.getNativeHeapAllocatedSize() - nativeHeapAllocatedSize) / 1024);
                aVar.a(BIZ_NAME, this.mModelId, this.mModelFiles, "0", 1.0f, 0.0f, false);
            }
            return nativeInferenceARGB;
        }
    }

    @Override // com.taobao.android.alinnkit.net.AliNNKitBaseNet
    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        n();
        nativeRelease(this.f6337a);
        this.f6337a = 0L;
        long j2 = this.b;
        if (j2 != 0) {
            nativeSmileRelease(j2);
            this.b = 0L;
        }
        long j3 = this.c;
        if (j3 != 0) {
            nativeAttributeRelease(j3);
            this.c = 0L;
        }
        long j4 = this.d;
        if (j4 != 0) {
            nativeFaceRecognitionRelease(j4);
            this.d = 0L;
        }
        long j5 = this.e;
        if (j5 != 0) {
            nativeFaceLivenessRelease(j5);
            this.e = 0L;
        }
        OrangeConfig.getInstance().unregisterListener(new String[]{"android_alinn_FaceDetection_v01_config"});
    }

    public synchronized void u(DetectParamType detectParamType, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ba70d5", new Object[]{this, detectParamType, new Float(f)});
            return;
        }
        if (!m()) {
            long j2 = this.f6337a;
            if (j2 != 0) {
                nativeSetParamThreshold(j2, detectParamType.type, f);
            }
        }
    }

    public synchronized void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e07c7f4", new Object[]{this, new Float(f)});
            return;
        }
        if (!m()) {
            long j2 = this.b;
            if (j2 != 0) {
                nativeSetSmileThreshold(j2, f);
            }
        }
    }
}
