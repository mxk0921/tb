package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.IrpCodeProcessor;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zmf implements pyb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SCANCODE_TOKEN = -1;
    public static final int IRP_SCAN_CODE_RESULT_FLAG = 1;
    public static volatile zmf c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, c> f32865a = new HashMap<>();
    public final LimitLinkedHashMap<Integer, b> b = new LimitLinkedHashMap<>(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final MaResult f32866a;
        public final RectF b;
        public final String c;
        public RectF d;
        public final HashMap<String, String> e;
        public final ScancodeType f;
        public final boolean g;

        static {
            t2o.a(481296716);
        }

        public a(MaResult maResult, RectF rectF, String str, HashMap<String, String> hashMap, boolean z) {
            this.f32866a = maResult;
            this.b = rectF;
            this.c = str;
            this.e = new HashMap<>(hashMap);
            this.f = rso.n(maResult);
            this.g = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final PhotoFrom.Values f32867a;
        public final List<a> b;

        static {
            t2o.a(481296717);
        }

        public b(List<a> list, PhotoFrom.Values values) {
            this.b = list;
            this.f32867a = values;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void a(List<a> list, PhotoFrom.Values values);
    }

    static {
        t2o.a(481296715);
        t2o.a(481296695);
    }

    public static boolean e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fe8deb", new Object[]{num})).booleanValue();
        }
        if (num != null && (num.intValue() & 1) > 0) {
            return true;
        }
        return false;
    }

    public static zmf g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmf) ipChange.ipc$dispatch("bed375b2", new Object[0]);
        }
        if (c == null) {
            synchronized (zmf.class) {
                try {
                    if (c == null) {
                        c = new zmf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final RectF b(MaResult maResult, float f, float f2) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("60ed4d1e", new Object[]{this, maResult, new Float(f), new Float(f2)});
        }
        if (f == 0.0f || f2 == 0.0f) {
            return null;
        }
        float x = maResult.getX() + (maResult.getWidth() / 2.0f);
        float y = maResult.getY() + (maResult.getHeight() / 2.0f);
        agh.h("_scancode_IrpScancodeResultManager", "centerX=" + x + ", centerY=" + y + ", width=" + maResult.getWidth() + ", height=" + maResult.getHeight());
        if (Math.min(maResult.getWidth(), maResult.getHeight()) >= 80.0f) {
            rectF = new RectF(maResult.getX(), maResult.getY(), maResult.getX() + maResult.getWidth(), maResult.getY() + maResult.getHeight());
        } else if (maResult.getWidth() >= maResult.getHeight()) {
            float min = Math.min(Math.min(y, f2 - y) * 2.0f, 80.0f) / 2.0f;
            rectF = new RectF(maResult.getX(), y - min, maResult.getX() + maResult.getWidth(), y + min);
        } else {
            float min2 = Math.min(Math.min(x, f - x) * 2.0f, 80.0f) / 2.0f;
            rectF = new RectF(x - min2, maResult.getY(), x + min2, maResult.getY() + maResult.getHeight());
        }
        agh.h("_scancode_IrpScancodeResultManager", "result=" + rectF);
        return new RectF(rectF.left / f, rectF.top / f2, rectF.right / f, rectF.bottom / f2);
    }

    public final RectF c(Rect rect) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("23b18697", new Object[]{this, rect});
        }
        float l = caa.l();
        float j = caa.j();
        float f = (rect.left + rect.right) / 2.0f;
        float f2 = (rect.top + rect.bottom) / 2.0f;
        if (Math.min(rect.width(), rect.height()) >= 80.0f) {
            rectF = new RectF(rect);
        } else if (rect.width() < rect.height()) {
            float min = Math.min(Math.min(f, l - f) * 2.0f, 80.0f) / 2.0f;
            rectF = new RectF(f - min, rect.top, f + min, rect.bottom);
        } else {
            float min2 = Math.min(Math.min(f2, j - f2) * 2.0f, 80.0f) / 2.0f;
            rectF = new RectF(rect.left, f2 - min2, rect.right, f2 + min2);
        }
        RectF rectF2 = new RectF(rectF.left / l, rectF.top / j, rectF.right / l, rectF.bottom / j);
        agh.h("_scancode_IrpScancodeResultManager", "rectF=" + rectF2 + ", screenWidth=" + l + ", screenHeight=" + j);
        return rectF2;
    }

    public void d(FragmentActivity fragmentActivity, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ef1e99", new Object[]{this, fragmentActivity, aVar});
            return;
        }
        IrpCodeProcessor b2 = zlf.a().b(fragmentActivity, aVar.e);
        if (b2 != null) {
            b2.b(fragmentActivity, aVar.f32866a, aVar.c);
        }
    }

    public final LinkedList<a> f(Bitmap bitmap, lso lsoVar, String str) {
        RectF b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("8bf3ecb7", new Object[]{this, bitmap, lsoVar, str});
        }
        Rect[] c2 = lsoVar.c();
        kso[] d = lsoVar.d();
        if (d == null || d.length == 0 || c2 == null || d.length != c2.length) {
            return null;
        }
        LinkedList<a> linkedList = new LinkedList<>();
        for (int i = 0; i < d.length; i++) {
            kso ksoVar = d[i];
            if (ksoVar.c() != null) {
                MaResult c3 = ksoVar.c();
                if (!(bitmap == null || (b2 = b(c3, bitmap.getWidth(), bitmap.getHeight())) == null)) {
                    linkedList.add(new a(c3, b2, str, lsoVar.a(), ksoVar.e()));
                }
            } else if (ksoVar.d() != null) {
                linkedList.add(new a(ksoVar.d().a(), c(c2[i]), str, lsoVar.a(), false));
            }
        }
        return linkedList;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f32865a.clear();
        this.b.clear();
    }

    public void i(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fae794d", new Object[]{this, new Integer(i), cVar});
            return;
        }
        b bVar = this.b.get(Integer.valueOf(i));
        if (bVar != null) {
            agh.h("_scancode_IrpScancodeResultManager", "registerIrpScancodeResultListener: onGetScanResult");
            cVar.a(bVar.b, bVar.f32867a);
            return;
        }
        this.f32865a.put(Integer.valueOf(i), cVar);
        agh.h("_scancode_IrpScancodeResultManager", "registerIrpScancodeResultListener: cache listener");
    }

    public final void j(com.etao.feimagesearch.capture.scan.b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3b6c8e", new Object[]{this, bVar, lsoVar});
            return;
        }
        Bitmap a2 = bVar.u().a();
        if (a2 == null) {
            agh.r("Scan", "_scancode_IrpScancodeResultManager", "bitmap is null");
            return;
        }
        int hashCode = a2.hashCode();
        agh.h("_scancode_IrpScancodeResultManager", "storeScanResult: token=" + hashCode + " isFrame=" + bVar.A() + ", photoFrom=" + bVar.w());
        LinkedList<a> f = f(a2, lsoVar, bVar.w().getValue());
        if (f == null || f.size() == 0) {
            agh.r("Scan", "_scancode_IrpScancodeResultManager", "imgCodeDetectResultList is null or empty");
            return;
        }
        c cVar = this.f32865a.get(Integer.valueOf(hashCode));
        if (cVar != null) {
            agh.h("_scancode_IrpScancodeResultManager", "storeScanResult: token " + hashCode + ", listener is null");
            cVar.a(f, bVar.w());
            return;
        }
        this.b.put(Integer.valueOf(hashCode), new b(f, bVar.w()));
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627ce36", new Object[]{this, new Integer(i)});
            return;
        }
        this.f32865a.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
    }

    @Override // tb.pyb
    public void a(com.etao.feimagesearch.capture.scan.b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b7d12", new Object[]{this, bVar, lsoVar});
        } else if (lsoVar == null || lsoVar.d() == null || lsoVar.d().length == 0) {
            agh.h("_scancode_IrpScancodeResultManager", "scanResultWrapper is null or scanResultWrapper.getScanResults() is empty");
        } else {
            if (!lg4.M()) {
                for (kso ksoVar : lsoVar.d()) {
                    if (ksoVar.e()) {
                        return;
                    }
                }
            }
            j(bVar, lsoVar);
        }
    }
}
