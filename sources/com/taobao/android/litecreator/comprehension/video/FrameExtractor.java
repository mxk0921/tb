package com.taobao.android.litecreator.comprehension.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.MediaUtils;
import com.taobao.favorites.template.FavTemplateConstant;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.c07;
import tb.cg9;
import tb.ckg;
import tb.ed2;
import tb.fpb;
import tb.i8g;
import tb.khs;
import tb.mkd;
import tb.odg;
import tb.t2o;
import tb.trt;
import tb.w7w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FrameExtractor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCCOM.FrameExtractor";

    /* renamed from: a  reason: collision with root package name */
    public static List<FrameConfig> f8264a = new ArrayList();
    public static fpb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class FrameConfig implements Serializable {
        public String type = "default";
        public int frameCount = 5;
        public float frameInterval = 0.2f;
        public int frameResolutionSize = 256;
        public int frameQuality = 70;
        public long frameDecodeTimeout = Constants.STARTUP_TIME_LEVEL_1;
        public long frameUploadTimeout = Constants.STARTUP_TIME_LEVEL_1;

        static {
            t2o.a(511705224);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8265a;
        public final /* synthetic */ HashSet b;
        public final /* synthetic */ List c;
        public final /* synthetic */ long d;
        public final /* synthetic */ mkd e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.comprehension.video.FrameExtractor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0437a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0437a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                aVar.e.a(aVar.c);
            }
        }

        public a(String str, HashSet hashSet, List list, long j, mkd mkdVar) {
            this.f8265a = str;
            this.b = hashSet;
            this.c = list;
            this.d = j;
            this.e = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int k = FrameExtractor.k(this.f8265a);
            CountDownLatch countDownLatch = new CountDownLatch(Math.min(this.b.size(), k));
            FrameExtractor.a(this.b, k, this.c, this.f8265a, countDownLatch);
            try {
                countDownLatch.await(this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            trt.c(new RunnableC0437a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements mkd<List<String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f8267a;
        public final /* synthetic */ CountDownLatch b;

        public b(List list, CountDownLatch countDownLatch) {
            this.f8267a = list;
            this.b = countDownLatch;
        }

        /* renamed from: b */
        public void a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd3207d5", new Object[]{this, list});
                return;
            }
            if (list != null) {
                this.f8267a.addAll(list);
            }
            this.b.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8268a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ long e;
        public final /* synthetic */ mkd f;

        public c(String str, String str2, long j, boolean z, long j2, mkd mkdVar) {
            this.f8268a = str;
            this.b = str2;
            this.c = j;
            this.d = z;
            this.e = j2;
            this.f = mkdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FrameExtractor.b(this.f8268a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements khs.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8269a;
        public final /* synthetic */ List b;
        public final /* synthetic */ List c;
        public final /* synthetic */ CountDownLatch d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8270a;
            public final /* synthetic */ Bitmap b;

            public a(int i, Bitmap bitmap) {
                this.f8270a = i;
                this.b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                new StringBuilder("run: saveBitmap ").append(this.f8270a);
                String b = i8g.b(Globals.getApplication());
                if (ed2.r(this.b, b, FrameExtractor.o(d.this.f8269a))) {
                    d.this.b.add(b);
                    d.this.c.add(this.b);
                }
                d.this.d.countDown();
            }
        }

        public d(String str, List list, List list2, CountDownLatch countDownLatch) {
            this.f8269a = str;
            this.b = list;
            this.c = list2;
            this.d = countDownLatch;
        }

        public void a(int i, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b81d0476", new Object[]{this, new Integer(i), bitmap});
                return;
            }
            trt.g(new a(i, bitmap));
            odg.d(FrameExtractor.TAG, "VideoFrameOnThumbnail. i:" + i + ", bitmap:" + bitmap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mkd f8271a;
        public final /* synthetic */ List b;

        public e(mkd mkdVar, List list) {
            this.f8271a = mkdVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mkd mkdVar = this.f8271a;
            if (mkdVar != null) {
                mkdVar.a(this.b);
            }
        }
    }

    static {
        t2o.a(511705216);
    }

    public static /* synthetic */ void a(HashSet hashSet, int i, List list, String str, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df1cdce", new Object[]{hashSet, new Integer(i), list, str, countDownLatch});
        } else {
            w(hashSet, i, list, str, countDownLatch);
        }
    }

    public static /* synthetic */ void b(String str, String str2, long j, boolean z, long j2, mkd mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a15203b", new Object[]{str, str2, new Long(j), new Boolean(z), new Long(j2), mkdVar});
        } else {
            h(str, str2, j, z, j2, mkdVar);
        }
    }

    public static void c(mkd<List<String>> mkdVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4111e058", new Object[]{mkdVar, list});
        } else {
            trt.h(new e(mkdVar, list));
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad695fe", new Object[]{str})).booleanValue();
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth == -1) {
                return false;
            }
            if (options.outHeight != -1) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void e(String str, long j, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6cfbce", new Object[]{str, new Long(j), list});
        } else if (list.isEmpty() && j > 0) {
            String w = MediaUtils.w(j, 3, str);
            odg.c(TAG, "VideoFrameOnThumbnail. use media id bitmap," + w);
            if (cg9.l(w)) {
                list.add(w);
            }
            z(str, w);
        }
    }

    public static void f(String str, String str2, long j, boolean z, long j2, mkd<List<String>> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf4a628", new Object[]{str, str2, new Long(j), new Boolean(z), new Long(j2), mkdVar});
        } else if (mkdVar != null && cg9.l(str2)) {
            trt.g(new c(str, str2, j, z, j2, mkdVar));
        }
    }

    public static void g(String str, HashSet<String> hashSet, long j, mkd<List<String>> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ab34ff", new Object[]{str, hashSet, new Long(j), mkdVar});
        } else if (mkdVar != null) {
            if (hashSet == null || hashSet.size() < 1) {
                mkdVar.a(new ArrayList());
            } else {
                trt.g(new a(str, hashSet, new ArrayList(), j, mkdVar));
            }
        }
    }

    public static long[] i(String str, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("71cf657b", new Object[]{str, new Long(j), new Boolean(z)});
        }
        int k = k(str);
        if (z) {
            return new long[]{500};
        }
        long[] jArr = new long[k];
        for (int i = 0; i < k; i++) {
            jArr[i] = m(str) * i * ((float) j);
        }
        if (k > 1) {
            if (k == 2) {
                jArr[k - 1] = ((float) j) * 0.5f;
            } else {
                jArr[k - 1] = ((float) j) * 0.99f;
            }
        }
        return jArr;
    }

    public static FrameConfig j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameConfig) ipChange.ipc$dispatch("73d2ba7", new Object[]{str});
        }
        List<FrameConfig> list = f8264a;
        if (list != null) {
            for (FrameConfig frameConfig : list) {
                if (frameConfig != null && TextUtils.equals(frameConfig.type, str)) {
                    return frameConfig;
                }
            }
        }
        return new FrameConfig();
    }

    public static int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("866927ad", new Object[]{str})).intValue();
        }
        return j(str).frameCount;
    }

    public static long l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9e57b32", new Object[]{str})).longValue();
        }
        return j(str).frameDecodeTimeout;
    }

    public static float m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bb65fae", new Object[]{str})).floatValue();
        }
        return j(str).frameInterval;
    }

    public static List<String> n(List<Bitmap> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f7214dfd", new Object[]{list, list2});
        }
        if (list == null || list.size() < 1) {
            return list2;
        }
        if (list2 == null || list2.size() < 1) {
            return null;
        }
        List<Integer> a2 = new ckg().a(list);
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (Integer num : a2) {
            if (num.intValue() < size) {
                arrayList.add(list2.get(num.intValue()));
            }
        }
        return arrayList;
    }

    public static int o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f747b15d", new Object[]{str})).intValue();
        }
        return j(str).frameQuality;
    }

    public static int p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92d25879", new Object[]{str})).intValue();
        }
        return j(str).frameResolutionSize;
    }

    public static long q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50a3ae3f", new Object[]{str})).longValue();
        }
        return j(str).frameUploadTimeout;
    }

    public static void s(String str, List<FrameConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed461303", new Object[]{str, list});
        } else {
            f8264a = list;
        }
    }

    public static void t(fpb fpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96d45d0", new Object[]{fpbVar});
        } else {
            b = fpbVar;
        }
    }

    public static w7w u(String str, String str2, long[] jArr, List<String> list, int i, CountDownLatch countDownLatch, List<Bitmap> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7w) ipChange.ipc$dispatch("6cc540e7", new Object[]{str, str2, jArr, list, new Integer(i), countDownLatch, list2});
        }
        return new w7w(new c07(str2), jArr, i, new d(str, list, list2, countDownLatch));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37b08eb", new Object[0])).booleanValue();
        }
        return new ckg().c();
    }

    public static void w(HashSet<String> hashSet, int i, List<String> list, String str, CountDownLatch countDownLatch) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38b9a6d", new Object[]{hashSet, new Integer(i), list, str, countDownLatch});
            return;
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (i2 <= i) {
                if (d(next)) {
                    list.add(next);
                } else {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    h(str, next, -1L, true, 1000L, new b(list, countDownLatch2));
                    try {
                        countDownLatch2.await();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                countDownLatch.countDown();
                i2++;
            } else {
                return;
            }
        }
    }

    public static void x(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e65215", new Object[]{list});
        } else if (list.size() > 0) {
            for (Bitmap bitmap : list) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    public static void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd518bb", new Object[0]);
        } else if (b != null) {
            HashMap hashMap = new HashMap();
            ckg ckgVar = new ckg();
            String str = "0";
            hashMap.put("mcv_available", ckgVar.b() ? "1" : str);
            if (ckgVar.c()) {
                str = "1";
            }
            hashMap.put("mnn_enable", str);
            b.a("MNN_Env", hashMap, true);
        }
    }

    public static void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb1f6", new Object[]{str, str2});
        } else if (b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("biz_type", str);
            hashMap.put("is_suc", String.valueOf(cg9.l(str2)));
            b.a("UseMediaThumbnail", hashMap, false);
        }
    }

    public static void r(mkd<List<String>> mkdVar, List<String> list, List<Bitmap> list2, boolean z) {
        String str;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3c064a", new Object[]{mkdVar, list, list2, new Boolean(z)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<String> n = n(list2, list);
        int size = n != null ? n.size() : 0;
        int size2 = list.size();
        odg.d("isEnableMNN", "extractorAsync: getFrameListByMNN " + n + " ,delCount=" + (size - size2));
        if (z) {
            if (n == null || n.size() <= 0) {
                c(mkdVar, list);
                z2 = false;
            } else {
                c(mkdVar, n);
            }
            if (b != null) {
                HashMap hashMap = new HashMap();
                if (z2) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("success", str);
                hashMap.put(FavTemplateConstant.FAV_TOTAL_COUNT, String.valueOf(size2));
                hashMap.put("filtered_count", String.valueOf(size));
                hashMap.put("time_cost", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                b.a("Duplicate_Detector", hashMap, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:37:0x0106, B:39:0x010a, B:43:0x0124), top: B:49:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.String r20, java.lang.String r21, long r22, boolean r24, long r25, tb.mkd<java.util.List<java.lang.String>> r27) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.litecreator.comprehension.video.FrameExtractor.h(java.lang.String, java.lang.String, long, boolean, long, tb.mkd):void");
    }
}
