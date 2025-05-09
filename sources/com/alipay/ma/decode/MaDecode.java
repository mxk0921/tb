package com.alipay.ma.decode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.ma.MaBuryRecord;
import com.alipay.ma.MaLogger;
import com.alipay.ma.analyze.api.MaEngineAPI;
import com.alipay.ma.analyze.helper.MaResultTypeHelper;
import com.alipay.ma.common.result.ResultMaType;
import com.alipay.ma.util.ImageTool;
import com.alipay.ma.util.StringEncodeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileDescriptor;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaDecode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AVOID_DESTROY_ENGINE_LOCK = "avoid_destroy_engine_lock";
    public static final String CAMERA2_UPLOAD_IMAGE = "camera2_upload_image";
    public static final String DIAGNOSE_SCAN_FOCUS = "diagnose_scan_focus";
    public static final String FRAME_READ_INFO_BINARIZE_ID = "BINARIZE_ID";
    public static final String FRAME_READ_INFO_FRAME_ID = "FRAME_ID";
    public static final String FRAME_READ_INFO_READ_STEPS = "READ_STEPS";
    public static final String IMAGE_INFO_BLOCK_MAX_STDDEV = "imageInfoBlockMaxStdDev";
    public static final String IMAGE_INFO_ENTROPY = "imageInfoEntropy";
    public static final String IMAGE_INFO_GLOBAL_STDDEV = "imageInfoGlobalStdDev";
    public static final String KEY_CONFIG_JPEG_QUALITY = "config_jpeg_quality";
    public static final String KEY_SCANNOTHINGDURATION = "scanNothingDuration";
    public static final int QR_PARTITION_SOURCE_TRADITION = 0;
    public static final int QR_PARTITION_SOURCE_XNN = 1;
    public static final String SCAN_UPLOAD_IMAGE = "scan_upload_image";
    public static final String SCAN_USE_KEY_INFO = "useKeyDecodeInfo";
    public static final String SO_NAME = "decode100260";
    public static final String TAG = "MaDecode_LOG";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3860a = false;
    public static int decodeThreadTID = 0;
    public static boolean dynamicCodeDev = false;
    public static long firstFrameIn = -1;
    public static long frameEngineIn = -1;
    public static String loadSoName = "decode100260";
    public static long sEngineSoLoadedTimestamp = 0;
    public static boolean sEngineUseKeyInfo = false;
    public static String scanActivity = "null";
    public static String scanInnerToken = "null";
    public static String scanSourceId = "null";
    public static String scanUIType = "oldUI";

    static {
        init("static");
    }

    public static native int AISetup(String str, String str2, String str3, String str4, String str5);

    public static synchronized int AISetupJ(String str, String str2, String str3, String str4, String str5) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd94faa1", new Object[]{str, str2, str3, str4, str5})).intValue();
            }
            MaLogger.w(TAG, "AISetupJ called");
            return AISetup(str, str2, str3, str4, str5);
        }
    }

    private static native int AISetupQRToMixed(boolean z);

    public static native int AIUninstall();

    public static int AIUninstallJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d893d26a", new Object[0])).intValue();
        }
        try {
            return AIUninstall();
        } catch (Throwable th) {
            MaLogger.e(TAG, "AIUninstallJ: ", th);
            return 0;
        }
    }

    public static native void MultiCodeSwitch(boolean z);

    public static native long RegistDSLReader(String str, boolean z);

    public static synchronized long RegistDSLReaderJ(String str, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa1ef2b7", new Object[]{str, new Boolean(z)})).longValue();
            }
            MaLogger.w(TAG, "RegistDSLReaderJ called");
            return RegistDSLReader(str, z);
        }
    }

    public static native long UnRegistDSLReader(boolean z);

    public static synchronized long UnRegistDSLReaderJ(boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("50975268", new Object[]{new Boolean(z)})).longValue();
            }
            MaLogger.w(TAG, "UnRegistDSLReaderJ called");
            return UnRegistDSLReader(z);
        }
    }

    public static long UnRegistDSLReaderJWithNoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d61575d6", new Object[]{new Boolean(z)})).longValue();
        }
        try {
            MaLogger.w(TAG, "UnRegistDSLReaderJWithNoLock called");
            return UnRegistDSLReader(z);
        } catch (Throwable th) {
            MaLogger.e(TAG, "UnRegistDSLReaderJWithNoLock", th);
            return 0L;
        }
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefbdf21", new Object[]{str, new Long(j)});
        } else if (MaLogger.isDebuggable()) {
            try {
                Thread.currentThread().getName();
                Process.myTid();
            } catch (Exception e) {
                MaLogger.e(TAG, "buryInformation: " + e.getMessage());
            }
        }
    }

    public static synchronized void adjustMaPositionCoordinate(DecodeResult[] decodeResultArr, ImageTool.ImageSampleOutInfo imageSampleOutInfo) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a34151c1", new Object[]{decodeResultArr, imageSampleOutInfo});
                return;
            }
            MaLogger.w(TAG, "adjustMaPositionCoordinate called");
            if (!(decodeResultArr == null || imageSampleOutInfo == null || decodeResultArr.length <= 0)) {
                for (int i = 0; i < decodeResultArr.length; i++) {
                    int i2 = imageSampleOutInfo.sampleSize;
                    if (i2 > 1) {
                        DecodeResult decodeResult = decodeResultArr[i];
                        int i3 = decodeResult.x;
                        int i4 = decodeResult.y;
                        int i5 = decodeResult.width;
                        int i6 = decodeResult.height;
                        decodeResult.x = i3 * i2;
                        decodeResult.y = i4 * i2;
                        decodeResult.width = i5 * i2;
                        decodeResult.height = i2 * i6;
                        MaLogger.d(TAG, "adjustMaPositionCoordinate sample outInfo=" + imageSampleOutInfo.toString() + ", Coordinate change from [" + i3 + "," + i4 + "," + i5 + "," + i6 + "] to [" + decodeResultArr[i].x + "," + decodeResultArr[i].y + "," + decodeResultArr[i].width + "," + decodeResultArr[i].height + "]");
                    }
                }
            }
        }
    }

    private static native DecodeResult[] bitmapDecode(Bitmap bitmap, int i, int i2, boolean z);

    public static synchronized DecodeResult[] bitmapDecodeJ(Bitmap bitmap, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("64864200", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            MaLogger.d(TAG, "bitmap_scan_opt()");
            return bitmapDecode(bitmap, i, i2, z);
        }
    }

    public static native int cameraDecodeInit();

    public static int cameraDecodeInitJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5151481", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int cameraDecodeInit = cameraDecodeInit();
            a("cameraDecodeInitJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return cameraDecodeInit;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "cameraDecodeInitJ: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "cameraDecodeInitJ: " + e2.getMessage());
            return 0;
        }
    }

    public static native int cameraDecodeUnInit();

    public static int cameraDecodeUnInitJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("983ac2a8", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int cameraDecodeUnInit = cameraDecodeUnInit();
            a("cameraDecodeUnInitJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return cameraDecodeUnInit;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "cameraDecodeUnInitJ: " + e);
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "cameraDecodeUnInitJ: " + e2);
            return 0;
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(String str, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("73470f41", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            try {
                MaLogger.w(TAG, "codeDecodePictureWithQr called, path= " + str);
                if (TextUtils.isEmpty(str)) {
                    d(-1, str, i, 0, 0);
                    return null;
                }
                File file = new File(str);
                if (!file.exists()) {
                    d(-2, str, i, 0, 0);
                    return null;
                }
                ImageTool.ImageSampleOutInfo imageSampleOutInfo = new ImageTool.ImageSampleOutInfo();
                DecodeResult[] codeDecodePictureWithQr = codeDecodePictureWithQr(ImageTool.createThumbnail(file, 1500, 1500, imageSampleOutInfo), i, str, i2, z);
                adjustMaPositionCoordinate(codeDecodePictureWithQr, imageSampleOutInfo);
                return codeDecodePictureWithQr;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static native DecodeResult[] codeDecodeWithQr(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z);

    public static void d(int i, String str, int i2, int i3, int i4) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0e9f6d", new Object[]{new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (i == -1 || i == -2 || i == -3) {
            map = new HashMap();
        } else {
            map = getDecodeInfoJ();
        }
        if (map != null) {
            map.put("scanMode", Integer.valueOf(i2));
            map.put("resultCode", Integer.valueOf(i));
            if (str != null) {
                map.put("path", str);
            }
            if (i3 > 0 && i4 > 0) {
                map.put("originWidth", Integer.valueOf(i3));
                map.put("originHeight", Integer.valueOf(i4));
            }
            if (i == 0) {
                MaBuryRecord.recordScanDecodeTrack("SCAN_IMAGE_CODE", "SCAN_IMAGE_SUCCEED", map);
            } else {
                MaBuryRecord.recordScanDecodeTrack("SCAN_IMAGE_CODE", "SCAN_IMAGE_FAILED", map);
            }
        }
    }

    public static void decodeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca909a5", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "decodeInit()");
        firstFrameIn = -1L;
        frameEngineIn = -1L;
        cameraDecodeInitJ();
    }

    public static void decodeUnInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95207de", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "decodeUnInit()");
        firstFrameIn = -1L;
        frameEngineIn = -1L;
        cameraDecodeUnInitJ();
    }

    private static native Object enableFastBitmapDecode();

    public static Object enableFastBitmapDecodeJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46be9c9d", new Object[0]);
        }
        MaLogger.d(TAG, "enableFastBitmapDecodeJ()");
        try {
            enableFastBitmapDecode();
            return null;
        } catch (Throwable th) {
            MaLogger.e(TAG, "enableFastBitmapDecodeJ call native exception", th);
            return null;
        }
    }

    public static native String genDslCodeSvg(String str, String str2, int i, float f, int i2, float f2, int i3, float f3);

    public static native Map getDecodeInfo();

    public static Map getDecodeInfoJ() {
        Map map;
        String str;
        String str2 = "getImportantDecodeInfo: ";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebbd9354", new Object[0]);
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (sEngineUseKeyInfo) {
                map = getImportantDecodeInfo();
            } else {
                map = getDecodeInfo();
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (sEngineUseKeyInfo) {
                str = "getImportantDecodeInfo";
            } else {
                str = "getDecodeInfo";
            }
            a(str, elapsedRealtime2);
            return map;
        } catch (UnsatisfiedLinkError e) {
            if (!sEngineUseKeyInfo) {
                str2 = "getDecodeInfo: " + e.getMessage();
            }
            MaLogger.e(TAG, str2);
            return null;
        } catch (Error e2) {
            if (!sEngineUseKeyInfo) {
                str2 = "getDecodeInfo: " + e2.getMessage();
            }
            MaLogger.e(TAG, str2);
            return null;
        }
    }

    public static native Map getFrameReadInfo();

    public static Map getFrameReadInfoJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("195f442b", new Object[0]);
        }
        try {
            return getFrameReadInfo();
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getFrameReadInfoJ: " + e);
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "getFrameReadInfoJ: " + e2);
            return null;
        }
    }

    public static native byte[] getImageDataWithToken(String str, String str2, int i);

    public static byte[] getImageDataWithTokenJ(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9f74923b", new Object[]{str, str2, new Integer(i)});
        }
        try {
            return getImageDataWithToken(str, str2, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("getImageDataWithTokenJ");
            return null;
        }
    }

    public static native Map getImageInfo(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public static Map getImageInfoJ(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ed48cf3", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        try {
            return getImageInfo(bArr, i, i2, i3, i4, i5, i6, i7);
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getImageInfoJ: " + e.getMessage());
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "getImageInfoJ: " + e2.getMessage());
            return null;
        }
    }

    public static native Map getImportantDecodeInfo();

    public static int getLastFrameAverageGray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30599299", new Object[0])).intValue();
        }
        try {
            return getLastFrameAvgGray();
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return 0;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("getLastFrameAverageGray");
            return 0;
        }
    }

    public static native int getLastFrameAvgGray();

    public static native float getLimitZoomFactor();

    public static float getLimitZoomFactorJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bf79d3a", new Object[0])).floatValue();
        }
        try {
            return getLimitZoomFactor();
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public static native float getMaProportion();

    public static float getMaProportionJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6796f27d", new Object[0])).floatValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float maProportion = getMaProportion();
            a("getMaProportionJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return maProportion;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getMaProportionJ: " + e.getMessage());
            return -1.0f;
        } catch (Error e2) {
            MaLogger.e(TAG, "getMaProportionJ: " + e2.getMessage());
            return -1.0f;
        }
    }

    public static native int getMaProportionSource();

    public static int getMaProportionSourceJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80960e25", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int maProportionSource = getMaProportionSource();
            a("getMaProportionSourceJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return maProportionSource;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getMaProportionSourceJ: " + e.getMessage());
            return -1;
        } catch (Error e2) {
            MaLogger.e(TAG, "getMaProportionSourceJ: " + e2.getMessage());
            return -1;
        }
    }

    public static native int getQrSizeAndCenter(float[] fArr);

    public static void init(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int i = 0;
            boolean booleanValue = ((Boolean) Class.forName("com.alipay.ma.dynamic.SoDynamicManager").getDeclaredMethod("loadSo", null).invoke(null, new Object[0])).booleanValue();
            long currentTimeMillis2 = System.currentTimeMillis();
            sEngineSoLoadedTimestamp = currentTimeMillis2;
            long j = currentTimeMillis2 - currentTimeMillis;
            if (!booleanValue) {
                i = 2;
            }
            MaBuryRecord.reportSoLoadResult(i, str, j);
            MaEngineAPI.sEngineSoLoaded = true;
            Log.e(TAG, "decode so load duration " + j);
            MaLogger.w(TAG, "decode so load duration " + j);
        } catch (Throwable th) {
            MaLogger.w(TAG, "so load with framework failed, fall back: decode100260, error: " + th.getMessage());
            try {
                System.loadLibrary(SO_NAME);
                long currentTimeMillis3 = System.currentTimeMillis();
                sEngineSoLoadedTimestamp = currentTimeMillis3;
                MaBuryRecord.reportSoLoadResult(1, str, currentTimeMillis3 - currentTimeMillis);
                MaEngineAPI.sEngineSoLoaded = true;
            } catch (UnsatisfiedLinkError e) {
                MaLogger.e(TAG, "Failed to load decode100260, " + e.getMessage());
                MaBuryRecord.reportSoLoadResult(-1, str, -1L);
            }
        }
    }

    public static void markEngineFrameIn(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5a53fa", new Object[]{new Long(j)});
        } else {
            frameEngineIn = j;
        }
    }

    public static void markFirstFrameIn(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea787a6e", new Object[]{new Long(j)});
        } else {
            firstFrameIn = j;
        }
    }

    private static native void materialModelCleanup(long j);

    public static void materialModelCleanupJ(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2761195", new Object[]{new Long(j)});
            return;
        }
        try {
            materialModelCleanup(j);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelCleanupJ: ", th);
        }
    }

    private static native String materialModelRecognize(long j, byte[] bArr, Rect rect, int i, int i2, int i3, int i4);

    public static String materialModelRecognizeJ(long j, byte[] bArr, Rect rect, Point point, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc75c58a", new Object[]{new Long(j), bArr, rect, point, new Integer(i), new Integer(i2)});
        }
        if (i2 != 17 && i2 != 842094169 && i2 != 35) {
            return null;
        }
        try {
            return materialModelRecognize(j, bArr, rect, point.x, point.y, i, 1);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelCleanupJ: ", th);
            return null;
        }
    }

    private static native long materialModelSetup(String str, String str2, String str3, String str4, String str5);

    public static long materialModelSetupJ(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c563bc", new Object[]{str, str2, str3, str4, str5})).longValue();
        }
        try {
            MaLogger.d(TAG, "xNNModelUrl: " + str + ", xNNConfig: " + str2 + ", xNNFrameworkUrl: " + str3 + ", cvEngineFrameworkUrl: " + str4 + ", codeType: " + str5);
            return materialModelSetup(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelSetupJ: ", th);
            return 0L;
        }
    }

    private static native String materialNDAnalyze(byte[] bArr, Rect rect, int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, List<String> list);

    public static String materialNDAnalyzeJ(byte[] bArr, Rect rect, int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb75651", new Object[]{bArr, rect, new Integer(i), new Integer(i2), new Integer(i3), str, str2, str3, str4, str5, new Integer(i4), list});
        }
        if (i4 != 17 && i4 != 842094169 && i4 != 35) {
            return null;
        }
        try {
            return materialNDAnalyze(bArr, rect, i, i2, i3, str, str2, str3, str4, str5, 1, list);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialNDAnalyzeJ: ", th);
            return null;
        }
    }

    public static native String needA();

    public static String needAJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c8391a", new Object[0]);
        }
        try {
            return needA();
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "needAJ: " + e.getMessage());
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "needAJ: " + e2.getMessage());
            return null;
        }
    }

    public static native void needDownGradeSdkMemoryAllocate();

    public static void needDownGradeSdkMemoryAllocateJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d763d8", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "needDownGradeSdkMemoryAllocate()");
        try {
            needDownGradeSdkMemoryAllocate();
        } catch (Throwable th) {
            MaLogger.e(TAG, "needDownGradeSdkMemoryAllocate call native exception", th);
        }
    }

    public static native boolean pushCyclerStream(byte[] bArr, String str, int i);

    public static long pushCyclerStreamJNew(byte[] bArr, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b4bef9", new Object[]{bArr, str, str2, new Integer(i)})).longValue();
        }
        try {
            return pushCyclerStreamNew(bArr, str, str2, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return -1L;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("pushCyclerStreamJ");
            return -1L;
        }
    }

    public static native long pushCyclerStreamNew(byte[] bArr, String str, String str2, int i);

    public static void recordScanDecodeLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ea09c3", new Object[]{str, str2});
        } else {
            MaLogger.d(str, str2);
        }
    }

    public static native void refreshTinyCodeBizConfig(boolean z, int i, String str);

    public static void refreshTinyCodeBizConfigJ(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e278d29d", new Object[]{new Boolean(z), new Integer(i), str});
            return;
        }
        try {
            refreshTinyCodeBizConfig(z, i, str);
        } catch (Exception e) {
            MaLogger.e(TAG, "refreshTinyCodeBizConfig: " + e.getMessage());
        }
    }

    public static native void setFilterConfig(String str);

    public static void setFilterConfigJ(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e78d17f", new Object[]{str});
            return;
        }
        try {
            setFilterConfig(str);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("MultiCodeConfigJ");
        }
    }

    public static native int setReaderParams(String str, String str2);

    public static native String statisticsCodeMainColorV1(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4);

    public static String statisticsCodeMainColorV1J(byte[] bArr, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1286a58f", new Object[]{bArr, new Integer(i), new Integer(i2), iArr});
        }
        if (bArr == null || iArr == null) {
            return null;
        }
        try {
            return statisticsCodeMainColorV1(bArr, bArr.length, i, i2, iArr, iArr.length);
        } catch (Exception e) {
            MaLogger.e(TAG, "statisticsCodeMainColorV1: " + e.getMessage());
            return null;
        }
    }

    public static native String statisticsCodeMainColorV2(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5, int i6, int[] iArr, int i7);

    private static native DecodeResult[] yuvcodeDecode(byte[] bArr, int i, int i2, int i3, Rect rect, int i4, String str, String[] strArr, float f);

    public static boolean c() {
        try {
            return ((Boolean) Class.forName("com.alipay.mobile.mascanengine.AlipayMaEngineUtils").getMethod("isNeedBitmapInterfaceOpt", null).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[Catch: all -> 0x0022, TryCatch #4 {, blocks: (B:4:0x000e, B:9:0x0015, B:11:0x0019, B:16:0x0026, B:17:0x004e, B:20:0x0059, B:21:0x005a, B:28:0x006f, B:29:0x0079, B:30:0x0093, B:32:0x0097, B:34:0x00a4, B:36:0x00ac, B:41:0x0108, B:44:0x010c, B:46:0x010f, B:37:0x00d3), top: B:58:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108 A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x000e, B:9:0x0015, B:11:0x0019, B:16:0x0026, B:17:0x004e, B:20:0x0059, B:21:0x005a, B:28:0x006f, B:29:0x0079, B:30:0x0093, B:32:0x0097, B:34:0x00a4, B:36:0x00ac, B:41:0x0108, B:44:0x010c, B:46:0x010f, B:37:0x00d3), top: B:58:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x000e, B:9:0x0015, B:11:0x0019, B:16:0x0026, B:17:0x004e, B:20:0x0059, B:21:0x005a, B:28:0x006f, B:29:0x0079, B:30:0x0093, B:32:0x0097, B:34:0x00a4, B:36:0x00ac, B:41:0x0108, B:44:0x010c, B:46:0x010f, B:37:0x00d3), top: B:58:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.alipay.ma.decode.DecodeResult[] codeDecode(byte[] r12, int r13, int r14, int r15, android.graphics.Rect r16, int r17, java.lang.String r18, java.lang.String[] r19, float r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.ma.decode.MaDecode.codeDecode(byte[], int, int, int, android.graphics.Rect, int, java.lang.String, java.lang.String[], float):com.alipay.ma.decode.DecodeResult[]");
    }

    public static String genDslCodeSvgJ(String str, String str2, int i, float f, int i2, float f2, int i3, float f3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7454e0e", new Object[]{str, str2, new Integer(i), new Float(f), new Integer(i2), new Float(f2), new Integer(i3), new Float(f3)});
        }
        try {
            if ("fu2022".equals(str)) {
                z = Pattern.compile("[A-Z0-9\\$\\.\\+\\%\\*\\- /:]{1,7}").matcher(str2).matches();
            } else if ("miniapp".equals(str)) {
                z = Pattern.compile("[0-9A-Z]{20}").matcher(str2).matches();
            }
            if (!z) {
                return null;
            }
            return genDslCodeSvg(str, str2, i, f, i2, f2, i3, f3);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            return null;
        }
    }

    public static int getQrSizeAndCenterJ(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f668c99b", new Object[]{fArr})).intValue();
        }
        try {
            return getQrSizeAndCenter(fArr);
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getQrSizeAndCenterJ: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "getQrSizeAndCenterJ: " + e2.getMessage());
            return 0;
        }
    }

    public static boolean pushCyclerStreamJ(byte[] bArr, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d29adecb", new Object[]{bArr, str, new Integer(i)})).booleanValue();
        }
        try {
            return pushCyclerStream(bArr, str, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return false;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("pushCyclerStreamJ");
            return false;
        }
    }

    public static void recordScanDecodeTrack(String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299cdda9", new Object[]{str, str2, hashMap});
            return;
        }
        if (hashMap != null) {
            hashMap.put("scanUIType", scanUIType);
            hashMap.put("scan_SourceId", scanSourceId);
            hashMap.put("innerToken", scanInnerToken);
            hashMap.put("loadSoName", loadSoName);
            hashMap.put("isDynamicSo", Boolean.valueOf(true ^ SO_NAME.equals(loadSoName)));
        }
        MaBuryRecord.recordScanDecodeTrack(str, str2, hashMap);
    }

    public static int setReaderParamsJ(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66aedf0d", new Object[]{str, str2})).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int readerParams = setReaderParams(str, str2);
            a("setReaderParamsJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return readerParams;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "setReaderParams: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "setReaderParams: " + e2.getMessage());
            return 0;
        }
    }

    public static DecodeResult b(DecodeResult decodeResult) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult) ipChange.ipc$dispatch("86cf6fe8", new Object[]{decodeResult});
        }
        if (decodeResult == null || (bArr = decodeResult.bytes) == null || bArr.length <= 0) {
            return null;
        }
        try {
            long j = decodeResult.strLen;
            if (j > 0) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                String stringEncode = StringEncodeUtils.getStringEncode(bArr2, false);
                if (TextUtils.isEmpty(stringEncode)) {
                    decodeResult.strCode = new String(bArr2, "utf-8");
                    decodeResult.encodeCharset = "utf-8";
                } else {
                    decodeResult.strCode = new String(bArr2, stringEncode);
                    decodeResult.encodeCharset = stringEncode;
                    if (TextUtils.equals(stringEncode, "UTF8") && decodeResult.strCode.charAt(0) == 65279) {
                        decodeResult.strCode = decodeResult.strCode.substring(1);
                    }
                }
                if (TextUtils.isEmpty(decodeResult.strCode)) {
                    decodeResult = null;
                }
            } else if (j == 0) {
                if (MaResultTypeHelper.getMaType(decodeResult) == ResultMaType.QR) {
                    decodeResult.strCode = "null";
                    decodeResult.encodeCharset = null;
                }
                MaBuryRecord.recodeDecodeFailedMaInfo(MaResultTypeHelper.getMaType(decodeResult) != null ? MaResultTypeHelper.getMaType(decodeResult).name() : null);
            }
            return decodeResult;
        } catch (UnsupportedEncodingException | Exception unused) {
            return null;
        }
    }

    public static long RegistDSLReaderJ(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc328625", new Object[]{str})).longValue() : RegistDSLReaderJ(str, false);
    }

    public static long UnRegistDSLReaderJ(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50971658", new Object[]{new Long(j)})).longValue() : UnRegistDSLReaderJ(false);
    }

    public static String statisticsCodeMainColorV2J(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21a88bf", new Object[]{bArr, bArr2, bArr3, new Integer(i), new Integer(i2), new Integer(i3), iArr});
        }
        if (bArr2 == null || bArr3 == null || iArr == null) {
            return null;
        }
        try {
            return statisticsCodeMainColorV2(bArr, i2 * i3, bArr2, bArr2.length, bArr3, bArr3.length, i, i2, i3, iArr, iArr.length);
        } catch (Exception e) {
            MaLogger.e(TAG, "statisticsCodeMainColorV1: " + e.getMessage());
            return null;
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(String str, Context context, int i, int i2, boolean z) {
        ParcelFileDescriptor parcelFileDescriptor;
        Throwable th;
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("7b541473", new Object[]{str, context, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            if (TextUtils.isEmpty(str)) {
                d(-1, str, i, 0, 0);
                return null;
            }
            try {
                MaLogger.d(TAG, "codeDecodePictureWithQr called, uriStr=" + str);
                parcelFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            } catch (Exception unused) {
                parcelFileDescriptor = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (parcelFileDescriptor == null) {
                    d(-2, str, i, 0, 0);
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (Exception e) {
                            MaLogger.e(TAG, "error:" + e.getMessage());
                        }
                    }
                    return null;
                }
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                ImageTool.ImageSampleOutInfo imageSampleOutInfo = new ImageTool.ImageSampleOutInfo();
                DecodeResult[] codeDecodePictureWithQr = codeDecodePictureWithQr(ImageTool.createThumbnail(fileDescriptor, 1500, 1500, imageSampleOutInfo), i, str, i2, z);
                adjustMaPositionCoordinate(codeDecodePictureWithQr, imageSampleOutInfo);
                try {
                    parcelFileDescriptor.close();
                } catch (Exception e2) {
                    MaLogger.e(TAG, "error:" + e2.getMessage());
                }
                return codeDecodePictureWithQr;
            } catch (Exception unused2) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e3) {
                        MaLogger.e(TAG, "error:" + e3.getMessage());
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor2 = parcelFileDescriptor;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (Exception e4) {
                        MaLogger.e(TAG, "error:" + e4.getMessage());
                    }
                }
                throw th;
            }
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(Bitmap bitmap, int i, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("3cf76bec", new Object[]{bitmap, new Integer(i), new Boolean(z)});
            }
            return codeDecodePictureWithQr(bitmap, i, 4, z);
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(Bitmap bitmap, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("3b1a0f23", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            return codeDecodePictureWithQr(bitmap, i, (String) null, i2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0120 A[Catch: all -> 0x0042, OutOfMemoryError -> 0x0065, TryCatch #1 {OutOfMemoryError -> 0x0065, blocks: (B:15:0x0055, B:17:0x005d, B:21:0x0069, B:23:0x006f, B:26:0x0077, B:28:0x0083, B:29:0x009f, B:30:0x00b5, B:33:0x00d7, B:34:0x00e1, B:36:0x00fd, B:40:0x0102, B:42:0x0105, B:44:0x0108, B:45:0x0112, B:47:0x0120, B:48:0x012d), top: B:54:0x0055, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d A[Catch: all -> 0x0042, OutOfMemoryError -> 0x0065, TRY_LEAVE, TryCatch #1 {OutOfMemoryError -> 0x0065, blocks: (B:15:0x0055, B:17:0x005d, B:21:0x0069, B:23:0x006f, B:26:0x0077, B:28:0x0083, B:29:0x009f, B:30:0x00b5, B:33:0x00d7, B:34:0x00e1, B:36:0x00fd, B:40:0x0102, B:42:0x0105, B:44:0x0108, B:45:0x0112, B:47:0x0120, B:48:0x012d), top: B:54:0x0055, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.alipay.ma.decode.DecodeResult[] codeDecodePictureWithQr(android.graphics.Bitmap r16, int r17, java.lang.String r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.ma.decode.MaDecode.codeDecodePictureWithQr(android.graphics.Bitmap, int, java.lang.String, int, boolean):com.alipay.ma.decode.DecodeResult[]");
    }
}
