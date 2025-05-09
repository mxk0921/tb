package com.etao.feimagesearch.capture.scan;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import tb.agh;
import tb.bs6;
import tb.gd2;
import tb.grn;
import tb.jzu;
import tb.kso;
import tb.lg4;
import tb.lso;
import tb.mso;
import tb.mzu;
import tb.p73;
import tb.qyb;
import tb.s63;
import tb.t2o;
import tb.x6n;
import tb.xxh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b implements IDecodeTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALBUM_IMAGE_DETECT = 3;
    public static final int FRAME_DETECT = 1;
    public static final int REALTIME_BITMAP = 2;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4666a;
    public final ScanMode b;
    public final KakaLibImageWrapper c;
    public boolean d;
    public final int f;
    public final HashMap<String, String> g;
    public final boolean h;
    public final int i;
    public final PhotoFrom.Values j;
    public final boolean k;
    public IDecodeTask.TaskStatus l;
    public Bitmap m;
    public final int n;
    public final qyb o;

    static {
        t2o.a(481296693);
        t2o.a(481296697);
    }

    public b(boolean z, KakaLibImageWrapper kakaLibImageWrapper, int i, HashMap<String, String> hashMap, int i2, PhotoFrom.Values values, qyb qybVar, boolean z2) {
        this.d = false;
        this.f = 0;
        this.l = IDecodeTask.TaskStatus.NORMAL;
        this.m = null;
        this.n = 0;
        this.f4666a = z;
        this.c = kakaLibImageWrapper;
        this.b = ScanMode.TOUGH_MODE;
        this.f = i;
        this.g = hashMap;
        this.o = qybVar;
        this.h = false;
        this.i = i2;
        this.j = values;
        this.k = z2;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("858450e1", new Object[]{this})).booleanValue();
        }
        if (1 == this.i) {
            return true;
        }
        return false;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dc8682a", new Object[]{this})).booleanValue();
        }
        return this.f4666a;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fac11394", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a1d5e2", new Object[]{this})).booleanValue();
        }
        if (this.l == IDecodeTask.TaskStatus.TIMEOUT) {
            return true;
        }
        return false;
    }

    public final void I(MaResult maResult, YuvImage yuvImage, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f15a8b", new Object[]{this, maResult, yuvImage, rect});
            return;
        }
        rect.left = (yuvImage.getHeight() - maResult.getY()) - maResult.getHeight();
        rect.top = maResult.getX();
        rect.right = yuvImage.getHeight() - maResult.getY();
        rect.bottom = maResult.getX() + maResult.getWidth();
        agh.h("_scancode_DecodeTaskV2", "after rotation " + rect);
    }

    public final boolean K(kso[] ksoVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc7871d7", new Object[]{this, ksoVarArr})).booleanValue();
        }
        if (!(ksoVarArr == null || ksoVarArr.length == 0)) {
            kso ksoVar = ksoVarArr[0];
            if (ksoVar.c() != null && lg4.c1()) {
                return a(ksoVar.c());
            }
            if (ksoVar.d() != null) {
                return a(ksoVar.d().a());
            }
        }
        return false;
    }

    public final void L(Rect rect, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522de14b", new Object[]{this, rect, new Float(f)});
            return;
        }
        rect.left = (int) (rect.left * f);
        rect.right = (int) (rect.right * f);
        rect.top = (int) (rect.top * f);
        rect.bottom = (int) (rect.bottom * f);
        agh.h("_scancode_DecodeTaskV2", "after zoom, rect = " + rect);
    }

    public final Rect b(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2f414e58", new Object[]{this, kakaLibImageWrapper, maResult});
        }
        if (kakaLibImageWrapper.g == null) {
            return null;
        }
        Rect rect = new Rect(maResult.getX(), maResult.getY(), maResult.getX() + maResult.getWidth(), maResult.getY() + maResult.getHeight());
        float x = x(kakaLibImageWrapper);
        if (x <= 0.0f) {
            return null;
        }
        rect.left = (int) (rect.left * x);
        rect.top = (int) (rect.top * x);
        rect.right = (int) (rect.right * x);
        rect.bottom = (int) (rect.bottom * x);
        int floor = (int) Math.floor(this.m.getHeight() * x);
        int max = Math.max((kakaLibImageWrapper.g.width() - ((int) Math.floor(this.m.getWidth() * x))) / 2, 0);
        int max2 = Math.max((kakaLibImageWrapper.g.height() - floor) / 2, 0);
        rect.left += max;
        rect.right += max;
        rect.top += max2;
        rect.bottom += max2;
        return rect;
    }

    public final Rect c(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("4f6958cd", new Object[]{this, kakaLibImageWrapper, maResult, new Boolean(z)});
        }
        return e(kakaLibImageWrapper, maResult, z);
    }

    public final Rect e(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5b7f437c", new Object[]{this, kakaLibImageWrapper, maResult, new Boolean(z)});
        }
        YuvImage j = kakaLibImageWrapper.j();
        Rect rect = new Rect();
        I(maResult, j, rect);
        L(rect, G(kakaLibImageWrapper, rect, z));
        return rect;
    }

    public void f(IDecodeTask.TaskStatus taskStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3ff2e4", new Object[]{this, taskStatus});
            return;
        }
        if (!A()) {
            agh.h("_scancode_DecodeTaskV2", "changeTaskStatus " + taskStatus + ", token=" + this.c.hashCode());
        }
        this.l = taskStatus;
    }

    public final Bitmap h(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b85c7f92", new Object[]{this, kakaLibImageWrapper});
        }
        if (this.m == null) {
            return null;
        }
        if (lg4.f1()) {
            return this.m;
        }
        float x = x(kakaLibImageWrapper);
        if (x <= 0.0f) {
            return null;
        }
        Bitmap r = gd2.r(this.m, x, x);
        if (r == null || !r.isRecycled()) {
            return r;
        }
        return null;
    }

    public final Bitmap i(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f7aac87a", new Object[]{this, kakaLibImageWrapper});
        }
        Bitmap a2 = ((bs6.b) bs6.a(kakaLibImageWrapper.g(), kakaLibImageWrapper.i(), kakaLibImageWrapper.b(), this.f, this.f4666a)).b(kakaLibImageWrapper.g.width(), kakaLibImageWrapper.g.height()).a();
        kakaLibImageWrapper.k(a2);
        return a2;
    }

    public final Bitmap j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("363f1962", new Object[]{this});
        }
        if (A()) {
            return i(this.c);
        }
        return h(this.c);
    }

    public final Bitmap k(Bitmap bitmap, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c7a2565a", new Object[]{this, bitmap, new Boolean(z)});
        }
        int width = bitmap.getWidth();
        if (z) {
            i = 0;
        } else {
            i = bitmap.getHeight() - width;
        }
        if (i >= 0) {
            return Bitmap.createBitmap(bitmap, 0, i, width, width);
        }
        agh.r("AutoDetect", "_scancode_DecodeTaskV2", "cropLongImage: beginY = " + i);
        return null;
    }

    public final kso[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso[]) ipChange.ipc$dispatch("dd9aafd5", new Object[]{this});
        }
        if (A()) {
            return o(this.c);
        }
        return p(this.c);
    }

    public final MaResult[] m(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("9a4c2f", new Object[]{this, bitmap});
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        MaResult[] g = xxh.g(copy, 36607, false);
        if (copy != bitmap) {
            try {
                copy.recycle();
            } catch (Throwable unused) {
            }
        }
        return g;
    }

    public final MaResult[] n(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("2daac066", new Object[]{this, kakaLibImageWrapper, bitmap});
        }
        agh.h("_scancode_DecodeTaskV2", "decodeByAntSdk: bitmap width = " + bitmap.getWidth() + ", height " + bitmap.getHeight());
        long currentTimeMillis = System.currentTimeMillis();
        MaResult[] m = m(bitmap);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (m == null || m.length <= 0) {
            z = false;
        }
        agh.r("AutoDetect", "_scancode_DecodeTaskV2", "decodeInBatch cost " + currentTimeMillis2 + ", decodeSuccess=" + z);
        if (z()) {
            return null;
        }
        if (z) {
            this.m = bitmap;
            mzu.i(p73.f25916a, "albumDetectCode", "costTime", String.valueOf(currentTimeMillis2));
            return m;
        } else if (!this.h || !gd2.INSTANCE.s(kakaLibImageWrapper.c(), bitmap)) {
            return null;
        } else {
            return H(kakaLibImageWrapper, bitmap);
        }
    }

    public final kso[] o(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso[]) ipChange.ipc$dispatch("128a0ba9", new Object[]{this, kakaLibImageWrapper});
        }
        YuvImage j = kakaLibImageWrapper.j();
        Rect rect = null;
        if (j == null) {
            return null;
        }
        String replace = Build.MODEL.toLowerCase(Locale.US).replace(" ", "");
        long currentTimeMillis = System.currentTimeMillis();
        if (!replace.contains("nexus5x")) {
            rect = s(Math.min(j.getWidth(), j.getHeight()), Math.max(j.getWidth(), j.getHeight()), kakaLibImageWrapper.h, kakaLibImageWrapper.g);
        }
        MaResult[] h = xxh.h(j, rect, kakaLibImageWrapper.f());
        mso.INSTANCE.d(System.currentTimeMillis() - currentTimeMillis);
        return g(h);
    }

    public final kso[] p(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso[]) ipChange.ipc$dispatch("b48fb73c", new Object[]{this, kakaLibImageWrapper});
        }
        MaResult[] q = q(kakaLibImageWrapper);
        if (q == null || q.length == 0) {
            return null;
        }
        kso[] ksoVarArr = new kso[q.length];
        int i = 0;
        for (MaResult maResult : q) {
            ksoVarArr[i] = kso.a(maResult, this.d);
            i++;
        }
        return ksoVarArr;
    }

    public final MaResult[] q(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("6c46b793", new Object[]{this, kakaLibImageWrapper});
        }
        if (kakaLibImageWrapper.a() == null) {
            return null;
        }
        Bitmap a2 = kakaLibImageWrapper.a();
        this.m = a2;
        return n(kakaLibImageWrapper, a2);
    }

    public lso r() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lso) ipChange.ipc$dispatch("e2506aa9", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        try {
            kso[] l = l();
            if (l == null) {
                return new lso(null, null, null, this.g);
            }
            if (K(l)) {
                bitmap = j();
            } else {
                bitmap = null;
            }
            return new lso(bitmap, d(this.c, l, this.f4666a), l, this.g);
        } catch (Throwable th) {
            agh.d("_scancode_DecodeTaskV2", "DecodeTaskV2", th);
            return new lso(null, null, null, this.g);
        }
    }

    public final Rect s(int i, int i2, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a8b9325a", new Object[]{this, new Integer(i), new Integer(i2), rect, rect2});
        }
        float width = rect2.width();
        float height = rect2.height();
        float f = rect.left / width;
        float f2 = rect.top / height;
        float f3 = rect.right / width;
        float f4 = rect.bottom / height;
        Rect rect3 = new Rect();
        float f5 = i2;
        float f6 = i;
        rect3.set((int) (f2 * f5), (int) (f * f6), (int) ((f4 - f2) * f5), (int) ((f3 - f) * f6));
        return rect3;
    }

    public qyb t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyb) ipChange.ipc$dispatch("880d3ce4", new Object[]{this});
        }
        return this.o;
    }

    public KakaLibImageWrapper u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("65def0f9", new Object[]{this});
        }
        return this.c;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public PhotoFrom.Values w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom.Values) ipChange.ipc$dispatch("b01d9dff", new Object[]{this});
        }
        return this.j;
    }

    public final float x(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("813ed475", new Object[]{this, kakaLibImageWrapper})).floatValue();
        }
        Rect rect = kakaLibImageWrapper.g;
        if (rect == null || this.m == null) {
            return 0.0f;
        }
        float width = rect.width();
        float height = kakaLibImageWrapper.g.height();
        float min = Math.min(width / this.m.getWidth(), height / this.m.getHeight());
        agh.h("_scancode_DecodeTaskV2", "targetWidth = " + width + ", targetHeight = " + height + ", \t width = " + kakaLibImageWrapper.i() + ", height = " + kakaLibImageWrapper.b() + ", scale = " + min);
        return min;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        if (this.l == IDecodeTask.TaskStatus.CANCELLED) {
            return true;
        }
        return false;
    }

    public final float G(KakaLibImageWrapper kakaLibImageWrapper, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("360b3a67", new Object[]{this, kakaLibImageWrapper, rect, new Boolean(z)})).floatValue();
        }
        bs6.b bVar = (bs6.b) bs6.a(kakaLibImageWrapper.g(), kakaLibImageWrapper.i(), kakaLibImageWrapper.b(), 0, z);
        PointF pointF = new PointF(bVar.i(), bVar.g());
        float width = kakaLibImageWrapper.g.width();
        float height = kakaLibImageWrapper.g.height();
        PointF a2 = grn.a(new PointF(width, height), pointF);
        float f = (pointF.x - a2.x) / 2.0f;
        float f2 = (pointF.y - a2.y) / 2.0f;
        rect.left = (int) (rect.left - f);
        rect.right = (int) (rect.right - f);
        rect.top = (int) (rect.top - f2);
        rect.bottom = (int) (rect.bottom - f2);
        agh.h("_scancode_DecodeTaskV2", "xStart = " + f + ", yStart = " + f2);
        StringBuilder sb = new StringBuilder("after move, ");
        sb.append(rect);
        agh.h("_scancode_DecodeTaskV2", sb.toString());
        return Math.max(width / bVar.i(), height / bVar.g());
    }

    public final boolean a(MaResult maResult) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d640db74", new Object[]{this, maResult})).booleanValue();
        }
        if (maResult != null && !this.d) {
            if (maResult.getWidth() * maResult.getHeight() == 0) {
                z = false;
            }
        }
        if (!z) {
            agh.c("_scancode_DecodeTaskV2", "unableToGetCodeAnchor");
        }
        return z;
    }

    public final Rect[] d(KakaLibImageWrapper kakaLibImageWrapper, kso[] ksoVarArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("ef1e6f3e", new Object[]{this, kakaLibImageWrapper, ksoVarArr, new Boolean(z)});
        }
        if (kakaLibImageWrapper == null || ksoVarArr == null) {
            return null;
        }
        Rect[] rectArr = new Rect[ksoVarArr.length];
        for (int i = 0; i < ksoVarArr.length; i++) {
            kso ksoVar = ksoVarArr[i];
            agh.h("_scancode_DecodeTaskV2", "scanResult = " + JSON.toJSONString(ksoVar));
            if (ksoVar.d() != null && ksoVar.d().a() != null) {
                rectArr[i] = c(kakaLibImageWrapper, ksoVar.d().a(), z);
            } else if (ksoVar.c() != null) {
                rectArr[i] = b(kakaLibImageWrapper, ksoVar.c());
            }
            if (rectArr[i] == null) {
                return null;
            }
            agh.h("_scancode_DecodeTaskV2", "scanCode rect = " + rectArr[i]);
        }
        return rectArr;
    }

    public final kso[] g(MaResult[] maResultArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso[]) ipChange.ipc$dispatch("b35c238c", new Object[]{this, maResultArr});
        }
        if (maResultArr == null || maResultArr.length == 0) {
            return null;
        }
        if (maResultArr.length == 1) {
            return new kso[]{kso.b(new x6n(maResultArr[0], "masdk"))};
        }
        ArrayList arrayList = new ArrayList(10);
        for (MaResult maResult : maResultArr) {
            if (a(maResult)) {
                arrayList.add(kso.b(new x6n(maResult, "masdk")));
            }
        }
        return arrayList.size() == 0 ? new kso[]{kso.b(new x6n(maResultArr[0], "masdk"))} : (kso[]) arrayList.toArray(new kso[arrayList.size()]);
    }

    public final MaResult[] H(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("e85288de", new Object[]{this, kakaLibImageWrapper, bitmap});
        }
        agh.h("_scancode_DecodeTaskV2", "processLongImage---");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap k = k(bitmap, false);
        if (k == null) {
            agh.h("_scancode_DecodeTaskV2", "downPartBitmap is null");
            return null;
        }
        MaResult[] m = m(k);
        if (m == null || m.length <= 0) {
            if (k != bitmap) {
                k.recycle();
            }
            if (z()) {
                return null;
            }
            Bitmap k2 = k(bitmap, true);
            if (k2 == null) {
                agh.c("_scancode_DecodeTaskV2", "upPartBitmap is null");
                return null;
            }
            MaResult[] m2 = m(k2);
            if (m2 == null || m2.length <= 0) {
                agh.r("AutoDetect", "_scancode_DecodeTaskV2", "cannot find any code");
                F(bitmap, null, System.currentTimeMillis() - currentTimeMillis, false, true);
                if (k2 != bitmap) {
                    k2.recycle();
                }
                return null;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            agh.h("_scancode_DecodeTaskV2", "long image upPartBitmap cost " + currentTimeMillis2);
            mzu.i(p73.f25916a, "albumLongImageDetectCode", "costTime", String.valueOf(currentTimeMillis2));
            F(k2, m2, currentTimeMillis2, true, true);
            this.m = k2;
            this.d = true;
            return m2;
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
        agh.h("_scancode_DecodeTaskV2", "long image downPartBitmap cost " + currentTimeMillis3);
        F(k, m, currentTimeMillis3, true, false);
        this.m = k;
        this.d = true;
        mzu.i(p73.f25916a, "albumLongImageDetectCode", "costTime", String.valueOf(currentTimeMillis3));
        return m;
    }

    public final void F(Bitmap bitmap, MaResult[] maResultArr, long j, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fb2656", new Object[]{this, bitmap, maResultArr, new Long(j), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (maResultArr == null || maResultArr.length <= 0) {
            str = "default_code_type";
        } else {
            str = "" + maResultArr[0].getType();
        }
        String str3 = j + "";
        String str4 = bitmap.getWidth() + "_" + bitmap.getHeight();
        String str5 = "" + z;
        if (z2) {
            str2 = "top";
        } else {
            str2 = "down";
        }
        jzu.n(s63.ALBUM_PAGE_NAME, "LongPicScan", 2101, "scanCost", str3, "pixel", str4, "isScanSuc", str5, "codeRegion", str2, "scanMode", this.b.getScanMode(), "codeType", str);
    }

    public b(KakaLibImageWrapper kakaLibImageWrapper, ScanMode scanMode, HashMap<String, String> hashMap, int i, qyb qybVar, PhotoFrom.Values values, boolean z, int i2, boolean z2) {
        this.d = false;
        this.f = 0;
        this.l = IDecodeTask.TaskStatus.NORMAL;
        this.m = null;
        this.f4666a = false;
        this.b = scanMode;
        this.c = kakaLibImageWrapper;
        this.g = hashMap;
        this.o = qybVar;
        this.h = z2;
        this.i = i;
        this.j = values;
        this.k = z;
        this.n = i2;
    }
}
