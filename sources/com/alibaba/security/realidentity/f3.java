package com.alibaba.security.realidentity;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import tb.f7l;
import tb.vqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class f3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2700a = "CameraConfiguration";
    public static final Pattern b = Pattern.compile(";");
    public static final int c = 153600;
    public static final int d = 1024000;
    public static final int e = 307200;
    public static final int f = 384000;
    public static final int g = 921600;
    public static final int h = -1;
    public static final int i = -1;
    public static final float j = 1.5f;
    public static final float k = 0.0f;
    public static final double l = 0.15d;
    public static final int m = 10;
    public static final int n = 20;
    public static final int o = 400;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c970e147", new Object[]{this, size, size2})).intValue();
            }
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            if (i2 > i) {
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c970e147", new Object[]{this, size, size2})).intValue();
            }
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            if (i2 > i) {
                return 1;
            }
            return 0;
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : e;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251c63e", new Object[]{parameters, new Boolean(z)});
            return;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            str = a("flash mode", supportedFlashModes, "off");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            com.alibaba.security.realidentity.a.c(f2700a, "Flash mode already set to ".concat(str));
            return;
        }
        com.alibaba.security.realidentity.a.c(f2700a, "Setting flash mode to ".concat(str));
        parameters.setFlashMode(str);
    }

    public static void c(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78a0257", new Object[]{parameters});
        } else {
            a(parameters, 10, 20);
        }
    }

    public static void d(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742a2d58", new Object[]{parameters});
        } else if (parameters.getMaxNumFocusAreas() > 0) {
            com.alibaba.security.realidentity.a.c(f2700a, "Old focus areas: " + a((Iterable<Camera.Area>) parameters.getFocusAreas()));
            List<Camera.Area> a2 = a(400);
            com.alibaba.security.realidentity.a.c(f2700a, "Setting focus area to : " + a((Iterable<Camera.Area>) a2));
            parameters.setFocusAreas(a2);
        } else {
            com.alibaba.security.realidentity.a.c(f2700a, "Device does not support focus areas");
        }
    }

    public static void e(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5859", new Object[]{parameters});
        } else if (vqx.HUMMER_FOUNDATION_NEGATIVE.equals(parameters.getColorEffect())) {
            com.alibaba.security.realidentity.a.c(f2700a, "Negative effect already set");
        } else {
            String a2 = a("color effect", parameters.getSupportedColorEffects(), vqx.HUMMER_FOUNDATION_NEGATIVE);
            if (a2 != null) {
                parameters.setColorEffect(a2);
            }
        }
    }

    public static void f(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6a835a", new Object[]{parameters});
        } else if (parameters.getMaxNumMeteringAreas() > 0) {
            com.alibaba.security.realidentity.a.c(f2700a, "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> a2 = a(400);
            com.alibaba.security.realidentity.a.c(f2700a, "Setting metering area to : " + a((Iterable<Camera.Area>) a2));
            parameters.setMeteringAreas(a2);
        } else {
            com.alibaba.security.realidentity.a.c(f2700a, "Device does not support metering areas");
        }
    }

    public static void g(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0aae5b", new Object[]{parameters});
        } else if (!parameters.isVideoStabilizationSupported()) {
            com.alibaba.security.realidentity.a.c(f2700a, "This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            com.alibaba.security.realidentity.a.c(f2700a, "Video stabilization already enabled");
        } else {
            com.alibaba.security.realidentity.a.c(f2700a, "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue() : z ? g : f;
    }

    public static void a(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2231fdf", new Object[]{parameters, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!z) {
            str = null;
        } else if (z3 || z2) {
            str = a("focus mode", supportedFocusModes, "auto");
        } else {
            str = a("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        }
        if (!z3 && str == null) {
            str = a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFocusMode())) {
            com.alibaba.security.realidentity.a.c(f2700a, "Focus mode already set to ".concat(str));
        } else {
            parameters.setFocusMode(str);
        }
    }

    public static void b(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae9d756", new Object[]{parameters});
        } else if ("barcode".equals(parameters.getSceneMode())) {
            com.alibaba.security.realidentity.a.c(f2700a, "Barcode scene mode already set");
        } else {
            String a2 = a("scene mode", parameters.getSupportedSceneModes(), "barcode");
            if (a2 != null) {
                parameters.setSceneMode(a2);
            }
        }
    }

    public static void a(Camera.Parameters parameters, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec911f", new Object[]{parameters, new Boolean(z)});
            return;
        }
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f2 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f2 = 1.5f;
                }
                int round = Math.round(f2 / exposureCompensationStep);
                float f3 = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    com.alibaba.security.realidentity.a.c(f2700a, "Exposure compensation already set to " + max + " / " + f3);
                    return;
                }
                com.alibaba.security.realidentity.a.c(f2700a, "Setting exposure compensation to " + max + " / " + f3);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        com.alibaba.security.realidentity.a.c(f2700a, "Camera does not support exposure compensation");
    }

    public static void b(Camera.Parameters parameters, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25173a8", new Object[]{parameters, new Double(d2)});
        } else if (parameters.isZoomSupported()) {
            Integer a2 = a(parameters, d2);
            if (a2 != null) {
                if (parameters.getZoom() == a2.intValue()) {
                    com.alibaba.security.realidentity.a.c(f2700a, "Zoom is already set to " + a2);
                    return;
                }
                com.alibaba.security.realidentity.a.c(f2700a, "Setting zoom to " + a2);
                parameters.setZoom(a2.intValue());
            }
        } else {
            com.alibaba.security.realidentity.a.c(f2700a, "Zoom is not supported");
        }
    }

    public static void a(Camera.Parameters parameters, int i2, int i3) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629e4b75", new Object[]{parameters, new Integer(i2), new Integer(i3)});
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        com.alibaba.security.realidentity.a.c(f2700a, "Supported FPS ranges: " + a((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iArr = null;
                    break;
                }
                iArr = it.next();
                int i4 = iArr[0];
                int i5 = iArr[1];
                if (i4 >= i2 * 1000 && i5 <= i3 * 1000) {
                    break;
                }
            }
            if (iArr == null) {
                com.alibaba.security.realidentity.a.c(f2700a, "No suitable FPS range?");
                return;
            }
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (Arrays.equals(iArr2, iArr)) {
                com.alibaba.security.realidentity.a.c(f2700a, "FPS range already set to " + Arrays.toString(iArr));
                return;
            }
            com.alibaba.security.realidentity.a.c(f2700a, "Setting FPS range to " + Arrays.toString(iArr));
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
        }
    }

    public static List<Camera.Area> a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{new Integer(i2)});
        }
        int i3 = -i2;
        return Collections.singletonList(new Camera.Area(new Rect(i3, i3, i2, i2), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point a(android.hardware.Camera.Parameters r6, int r7, boolean r8) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.security.realidentity.f3.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0025
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r6
            r6 = 1
            r8[r6] = r2
            r6 = 2
            r8[r6] = r7
            java.lang.String r6 = "97a36273"
            java.lang.Object r6 = r1.ipc$dispatch(r6, r8)
            android.graphics.Point r6 = (android.graphics.Point) r6
            return r6
        L_0x0025:
            java.util.List r6 = r6.getSupportedPictureSizes()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            com.alibaba.security.realidentity.f3$a r6 = new com.alibaba.security.realidentity.f3$a
            r6.<init>()
            java.util.Collections.sort(r1, r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x003a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r6.next()
            android.hardware.Camera$Size r2 = (android.hardware.Camera.Size) r2
            int r3 = r2.width
            int r2 = r2.height
            int r4 = r3 * r2
            int r5 = a(r8)
            if (r4 <= r5) goto L_0x005c
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r5 = "LA6-L"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003a
        L_0x005c:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r3, r2)
            return r6
        L_0x0062:
            java.lang.Object r6 = r1.get(r0)
            android.hardware.Camera$Size r6 = (android.hardware.Camera.Size) r6
            int r7 = r7 % 180
            if (r7 != 0) goto L_0x0071
            int r7 = r6.width
            int r6 = r6.height
            goto L_0x0075
        L_0x0071:
            int r7 = r6.height
            int r6 = r6.width
        L_0x0075:
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.f3.a(android.hardware.Camera$Parameters, int, boolean):android.graphics.Point");
    }

    public static Integer a(Camera.Parameters parameters, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("80c8ad70", new Object[]{parameters, new Double(d2)});
        }
        List<Integer> zoomRatios = parameters.getZoomRatios();
        com.alibaba.security.realidentity.a.c(f2700a, "Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            com.alibaba.security.realidentity.a.e(f2700a, "Invalid zoom ratios!");
            return null;
        }
        double d3 = d2 * 100.0d;
        double d4 = Double.POSITIVE_INFINITY;
        int i2 = 0;
        for (int i3 = 0; i3 < zoomRatios.size(); i3++) {
            double abs = Math.abs(zoomRatios.get(i3).intValue() - d3);
            if (abs < d4) {
                i2 = i3;
                d4 = abs;
            }
        }
        com.alibaba.security.realidentity.a.c(f2700a, "Chose zoom ratio of " + (zoomRatios.get(i2).intValue() / 100.0d));
        return Integer.valueOf(i2);
    }

    public static Point a(Camera.Parameters parameters, Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("c7546281", new Object[]{parameters, point});
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            com.alibaba.security.realidentity.a.e(f2700a, "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new b());
        if (com.alibaba.security.realidentity.a.a()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Camera.Size size = (Camera.Size) it.next();
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            com.alibaba.security.realidentity.a.c(f2700a, "Supported preview sizes: " + ((Object) sb));
        }
        double d2 = point.x / point.y;
        if (d2 >= 1.0d) {
            d2 = 1.0d / d2;
        }
        com.alibaba.security.realidentity.a.c(f2700a, "SQY:" + point.x + "x" + point.y);
        Iterator it2 = arrayList.iterator();
        Point point2 = null;
        double d3 = Double.POSITIVE_INFINITY;
        while (it2.hasNext()) {
            Camera.Size size2 = (Camera.Size) it2.next();
            int i2 = size2.width;
            int i3 = size2.height;
            int i4 = i2 * i3;
            if (i4 < 153600 || i4 > 1024000) {
                it2.remove();
            } else {
                boolean z = i2 > i3;
                int i5 = z ? i3 : i2;
                int i6 = z ? i2 : i3;
                if (i5 == point.x && i6 == point.y) {
                    return new Point(i2, i3);
                }
                double abs = Math.abs((i5 / i6) - d2);
                if (abs < d3) {
                    point2 = new Point(i2, i3);
                    d3 = abs;
                }
            }
        }
        if (point2 != null) {
            return point2;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 != null) {
            return new Point(previewSize2.width, previewSize2.height);
        }
        throw new IllegalStateException("Parameters contained no preview size!");
    }

    public static void a(List<Camera.Size> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
            return;
        }
        String str = "";
        for (Camera.Size size : list) {
            str = str + size.width + "x" + size.height + "\n";
        }
    }

    public static String a(String str, Collection<String> collection, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c46a8444", new Object[]{str, collection, strArr});
        }
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static String a(Collection<int[]> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2afc0da7", new Object[]{collection});
        }
        if (collection == null || collection.isEmpty()) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String a(Iterable<Camera.Area> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6333f4f", new Object[]{iterable});
        }
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(f7l.CONDITION_IF_MIDDLE);
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String a(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe6ddceb", new Object[]{parameters}) : a(parameters.flatten());
    }

    public static String a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc861514", new Object[]{charSequence});
        }
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append("\nBRAND=");
        sb.append(Build.BRAND);
        sb.append("\nCPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append("\nDEVICE=");
        sb.append(Build.DEVICE);
        sb.append("\nDISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append("\nFINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append("\nHOST=");
        sb.append(Build.HOST);
        sb.append("\nID=");
        sb.append(Build.ID);
        sb.append("\nMANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append("\nMODEL=");
        sb.append(Build.MODEL);
        sb.append("\nPRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append("\nTAGS=");
        sb.append(Build.TAGS);
        sb.append("\nTIME=");
        sb.append(Build.TIME);
        sb.append("\nTYPE=");
        sb.append(Build.TYPE);
        sb.append("\nUSER=");
        sb.append(Build.USER);
        sb.append("\nVERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append("\nVERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\nVERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nVERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] split = b.split(charSequence);
            Arrays.sort(split);
            for (String str : split) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
