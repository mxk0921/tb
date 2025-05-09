package com.taobao.android.litecreator.util;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.video.FrameExtractor;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.cbw;
import tb.cg9;
import tb.ed2;
import tb.i8g;
import tb.knv;
import tb.krq;
import tb.mkd;
import tb.ng8;
import tb.odg;
import tb.ole;
import tb.qaw;
import tb.t2o;
import tb.trt;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEGREES_180 = 180;
    public static final int DEGREES_270 = 270;
    public static final int DEGREES_90 = 90;
    public static final int VIDEO_RATIO_4_3 = 16;
    public static final int VIDEO_RATIO_OTHERS = 128;
    public static final int VIDEO_RATIO_OVER_16_9 = 32;
    public static final int VIDEO_RATIO_OVER_9_16 = 64;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, e> f8325a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface RatioType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f8326a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ mkd d;

        public a(long j, int i, String str, mkd mkdVar) {
            this.f8326a = j;
            this.b = i;
            this.c = str;
            this.d = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaUtils.a(this.d, MediaUtils.w(this.f8326a, this.b, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f8327a;
        public final /* synthetic */ String b;
        public final /* synthetic */ mkd c;

        public b(Bitmap bitmap, String str, mkd mkdVar) {
            this.f8327a = bitmap;
            this.b = str;
            this.c = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaUtils.a(this.c, MediaUtils.x(this.f8327a, this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mkd f8328a;
        public final /* synthetic */ String b;

        public c(mkd mkdVar, String str) {
            this.f8328a = mkdVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mkd mkdVar = this.f8328a;
            if (mkdVar != null) {
                mkdVar.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8329a;
        public final /* synthetic */ mkd b;

        public d(String str, mkd mkdVar) {
            this.f8329a = str;
            this.b = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaUtils.b(this.f8329a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public double f8330a = vu3.b.GEO_NOT_SUPPORT;
        public double b = vu3.b.GEO_NOT_SUPPORT;

        static {
            t2o.a(511705641);
        }

        public static e a(String str) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("298aae0d", new Object[]{str});
            }
            if (str == null) {
                return null;
            }
            e eVar = new e();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if ((charAt < '0' || charAt > '9') && charAt != '.') {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (arrayList.size() < 2) {
                return null;
            }
            try {
                eVar.f8330a = Double.parseDouble(str.substring(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue()));
                int intValue = ((Integer) arrayList.get(1)).intValue();
                if (arrayList.size() > 2) {
                    i = ((Integer) arrayList.get(2)).intValue();
                } else {
                    i = arrayList.size();
                }
                eVar.b = Double.parseDouble(str.substring(intValue, i));
                return eVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MediaLocation{latitude=" + this.f8330a + ", longitude=" + this.b + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f8331a;

        static {
            t2o.a(511705643);
        }

        public f(int i, int i2, int i3, String str) {
            this.f8331a = str;
        }
    }

    static {
        t2o.a(511705636);
    }

    public static /* synthetic */ void a(mkd mkdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356b8dd4", new Object[]{mkdVar, str});
        } else {
            d(mkdVar, str);
        }
    }

    public static /* synthetic */ void b(String str, mkd mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1bc855", new Object[]{str, mkdVar});
        } else {
            i(str, mkdVar);
        }
    }

    public static int c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64d11b9f", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        double d2 = (i * 1.0f) / i2;
        if (Math.abs(d2 - 1.0d) < 0.01d) {
            return 2;
        }
        if (Math.abs(d2 - 0.5625d) >= 0.01d) {
            double d3 = d2 - 1.7777777777777777d;
            if (Math.abs(d3) < 0.01d) {
                if (i3 == 90 || i3 == 270) {
                    return 1;
                }
                return 4;
            } else if (Math.abs(d2 - 1.3333333333333333d) < 0.01d) {
                if (i3 == 90 || i3 == 270) {
                    return 8;
                }
                return 16;
            } else if (Math.abs(d2 - 0.75d) < 0.01d) {
                if (i3 == 90 || i3 == 270) {
                    return 16;
                }
                return 8;
            } else if (0.5625d - d2 > 0.01d) {
                if (i3 == 90 || i3 == 270) {
                    return 32;
                }
                return 64;
            } else if (d3 <= 0.01d) {
                return 128;
            } else {
                if (i3 == 90 || i3 == 270) {
                    return 64;
                }
                return 32;
            }
        } else if (i3 == 90 || i3 == 270) {
            return 4;
        } else {
            return 1;
        }
    }

    public static void d(mkd<String> mkdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d613f71", new Object[]{mkdVar, str});
        } else {
            trt.h(new c(mkdVar, str));
        }
    }

    public static void e(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null && (closeable instanceof Closeable)) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1f9dfd3", new Object[]{new Integer(i)})).intValue();
        }
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdc5e109", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 2 || i == 7 || i == 4 || i == 5) {
            return -1;
        }
        return 1;
    }

    public static void h(String str, mkd<String> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f160ed7", new Object[]{str, mkdVar});
        } else {
            trt.g(new d(str, mkdVar));
        }
    }

    public static void i(String str, mkd<String> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7754887", new Object[]{str, mkdVar});
        } else if (mkdVar != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(krq.k(mediaMetadataRetriever.extractMetadata(9), 0L) * 1000, 3);
                String b2 = i8g.b(Globals.getApplication());
                if (frameAtTime == null || !ed2.q(frameAtTime, b2)) {
                    TLog.loge("MediaUtils", "extractorLastFrameAtTime save bitmap fail");
                } else {
                    d(mkdVar, b2);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static void j(String str, long j, int i, mkd<String> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a8618b", new Object[]{str, new Long(j), new Integer(i), mkdVar});
        } else if (mkdVar != null) {
            trt.g(new a(j, i, str, mkdVar));
        }
    }

    public static void k(String str, Bitmap bitmap, mkd<String> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea4bf28", new Object[]{str, bitmap, mkdVar});
        } else if (mkdVar != null) {
            trt.g(new b(bitmap, str, mkdVar));
        }
    }

    public static int l(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a671ff3", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 90 || i3 == 270) {
            return i;
        }
        return i2;
    }

    public static int m(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b098c104", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 90 || i3 == 270) {
            return i2;
        }
        return i;
    }

    public static int n(Context context, Uri uri) {
        IOException e2;
        int i;
        InputStream openInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5ab4123", new Object[]{context, uri})).intValue();
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            int r = cg9.r(uri.getPath());
            if (r == 90) {
                return 6;
            }
            if (r == 270) {
                return 8;
            }
            if (r == 180) {
                return 3;
            }
            return 0;
        }
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (IOException e3) {
            e2 = e3;
            i = 0;
        }
        if (openInputStream == null) {
            return 0;
        }
        i = new ole(openInputStream).b();
        try {
            e(openInputStream);
        } catch (IOException e4) {
            e2 = e4;
            odg.c("getExifOrientation", "getExifOrientation: " + uri.toString() + " " + e2.getMessage());
            return i;
        }
        return i;
    }

    public static int o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db7bad7b", new Object[]{str})).intValue();
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 48936:
                if (str.equals("1:1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 50861:
                if (str.equals(cbw.VALUE_THREE_FOUR_RATIO)) {
                    c2 = 1;
                    break;
                }
                break;
            case 51821:
                if (str.equals("4:3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1513508:
                if (str.equals(cbw.VALUE_SIXTEEN_NINE_RATIO)) {
                    c2 = 3;
                    break;
                }
                break;
            case 1755398:
                if (str.equals("9:16")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 16;
            case 3:
                return 4;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public static int p(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdd88953", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return (i3 * i2) / i;
    }

    public static int r(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c572d31e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return (i3 * i) / i2;
    }

    public static f s(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a3bfd486", new Object[]{str});
        }
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                f fVar = new f(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(24)), str);
                mediaMetadataRetriever.release();
                return fVar;
            } catch (Throwable unused) {
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                return null;
            }
        } catch (Throwable unused2) {
            mediaMetadataRetriever = null;
        }
    }

    public static e t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("364864af", new Object[]{str});
        }
        HashMap hashMap = (HashMap) f8325a;
        if (hashMap.containsKey(str)) {
            return (e) hashMap.get(str);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
            if (TextUtils.isEmpty(extractMetadata)) {
                return null;
            }
            e a2 = e.a(extractMetadata);
            if (a2 != null) {
                hashMap.put(str, a2);
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean u(LocalMedia localMedia) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1db911b0", new Object[]{localMedia})).booleanValue();
        }
        if (localMedia == null) {
            return false;
        }
        Application application = Globals.getApplication();
        if (ng8.e(application)) {
            z = knv.h(application, localMedia.uri);
        } else {
            z = cg9.l(localMedia.path);
        }
        odg.c("MediaUtils", "isExist. result=" + z + ", media=" + localMedia.path + "," + localMedia.uri);
        return z;
    }

    public static boolean v(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9084b0b0", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int[] b2 = qaw.b(i);
        if (b2 != null && b2.length == 2 && i2 / b2[0] == i3 / b2[1]) {
            return true;
        }
        if (i == 16 && i2 / 4 == i3 / 3) {
            return true;
        }
        return false;
    }

    public static String w(long j, int i, String str) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9acf7f17", new Object[]{new Long(j), new Integer(i), str});
        }
        int p = FrameExtractor.p(str);
        if (i == 3) {
            bitmap = ed2.l(true, j, p, false);
        } else if (i == 1) {
            bitmap = ed2.l(false, j, p, false);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        return x(bitmap, str);
    }

    public static String x(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("caceafd7", new Object[]{bitmap, str});
        }
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        int min = Math.min(FrameExtractor.p(str), bitmap.getWidth());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, min, (bitmap.getHeight() * min) / bitmap.getWidth(), false);
        String b2 = i8g.b(Globals.getApplication());
        if (!ed2.r(createScaledBitmap, b2, FrameExtractor.o(str))) {
            return null;
        }
        return b2;
    }

    public static String q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("467f00d5", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "9:16";
        }
        if (i == 2) {
            return "1:1";
        }
        if (i == 4) {
            return cbw.VALUE_SIXTEEN_NINE_RATIO;
        }
        if (i == 8) {
            return cbw.VALUE_THREE_FOUR_RATIO;
        }
        if (i == 16) {
            return "4:3";
        }
        if (i == 32) {
            return "over16:9";
        }
        if (i == 64) {
            return "over9:16";
        }
        if (i != 128) {
            return "unknown";
        }
        return "others";
    }
}
