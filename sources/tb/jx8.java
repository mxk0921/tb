package tb;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.android.mnncv.MNNCVImage;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jx8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f22266a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Point c;
        public final /* synthetic */ float d;

        public a(float f, View view, Point point, float f2) {
            this.f22266a = f;
            this.b = view;
            this.c = point;
            this.d = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float f = this.f22266a;
            if (this.b.getScaleX() != this.f22266a) {
                f = this.b.getScaleX();
            }
            this.b.setPivotX(this.c.x);
            this.b.setPivotY(this.c.y);
            jx8.a(Float.valueOf(f), this.d, this.b);
        }
    }

    static {
        t2o.a(491782342);
    }

    public static /* synthetic */ void a(Float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c388fd54", new Object[]{f, new Float(f2), view});
        } else {
            k(f, f2, view);
        }
    }

    public static Map<String, Object> b(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cd9069e8", new Object[]{bitmap, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_IMAGE, new MNNCVImage(bitmap));
        hashMap.put("_width", Integer.valueOf(bitmap.getWidth()));
        hashMap.put("_height", Integer.valueOf(bitmap.getHeight()));
        hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_FORMAT, 0);
        hashMap.put("_bizcode", str);
        return hashMap;
    }

    public static List<TextureView> c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7d796e3", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(c((ViewGroup) childAt));
            } else if (childAt instanceof TextureView) {
                arrayList.add((TextureView) childAt);
            }
        }
        return arrayList;
    }

    public static Rect e(Map<String, Object> map, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1a683aa6", new Object[]{map, tBLiveOpenCardView});
        }
        Object obj = map.get("algo_results");
        boolean z = !(obj instanceof Map);
        Map map2 = (Map) obj;
        if (map2 == null) {
            z = true;
        }
        ArrayList arrayList = (ArrayList) map2.get("body_region");
        if (arrayList == null || arrayList.size() < 4) {
            z = true;
        }
        if (z) {
            return null;
        }
        return new Rect(((Integer) arrayList.get(0)).intValue() + tBLiveOpenCardView.getLeft(), ((Integer) arrayList.get(1)).intValue() + tBLiveOpenCardView.getTop(), ((Integer) arrayList.get(2)).intValue() + tBLiveOpenCardView.getLeft(), ((Integer) arrayList.get(3)).intValue() + tBLiveOpenCardView.getTop());
    }

    public static Point f(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("1412d0", new Object[]{rect});
        }
        int i = (rect.right + rect.left) / 2;
        int i2 = (rect.bottom + rect.top) / 2;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new Point(i, i2);
    }

    public static List<TextureView> g(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f109491", new Object[]{tBLiveOpenCardView});
        }
        ViewGroup playerRootView = tBLiveOpenCardView.getPlayerRootView();
        ArrayList arrayList = new ArrayList();
        if (playerRootView != null && playerRootView.getChildCount() >= 1) {
            for (int i = 0; i < playerRootView.getChildCount(); i++) {
                View childAt = playerRootView.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    arrayList.addAll(c((ViewGroup) childAt));
                } else if (childAt instanceof TextureView) {
                    arrayList.add((TextureView) childAt);
                }
            }
        }
        return arrayList;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb1cc90", new Object[0])).booleanValue();
        }
        return TextUtils.equals("h", sue.a());
    }

    public static String[] i(HashMap<String, String> hashMap) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d9a5539", new Object[]{hashMap});
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        String[] strArr = new String[entrySet.size()];
        for (Map.Entry<String, String> entry : entrySet) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        return strArr;
    }

    public static void j(View view, j3h j3hVar) {
        Rect rect;
        Point f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ad75fd", new Object[]{view, j3hVar});
        } else if (view != null && j3hVar != null && j3hVar.u && !j3hVar.t && (rect = j3hVar.s) != null && j3hVar.r != j3hVar.q && (f = f(rect)) != null) {
            get.a().h(new a(j3hVar.q, view, f, j3hVar.r));
            j3hVar.q = j3hVar.r;
        }
    }

    public static Bitmap d(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4748bcf5", new Object[]{tBLiveOpenCardView});
        }
        if (tBLiveOpenCardView == null) {
            fve.e(FaceDetectionNet.BIZ_NAME, "parentView or videoContainer is null");
            return null;
        }
        List<TextureView> g = g(tBLiveOpenCardView);
        if (g.isEmpty()) {
            fve.e(FaceDetectionNet.BIZ_NAME, "view list is empty");
            return null;
        }
        TextureView textureView = g.get(0);
        if (textureView == null) {
            fve.e(FaceDetectionNet.BIZ_NAME, "TextureView is null");
            return null;
        }
        try {
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                fve.e(FaceDetectionNet.BIZ_NAME, "getBitmap is null");
                return null;
            }
            int width = (bitmap.getWidth() - tBLiveOpenCardView.getWidth()) / 2;
            int height = (bitmap.getHeight() - tBLiveOpenCardView.getHeight()) / 2;
            if (width < 0 || height < 0) {
                return null;
            }
            return Bitmap.createBitmap(bitmap, width, height, tBLiveOpenCardView.getWidth(), tBLiveOpenCardView.getHeight());
        } catch (NullPointerException unused) {
            fve.e(FaceDetectionNet.BIZ_NAME, "Texture内部初始化异常或被回收");
            return null;
        }
    }

    public static void k(Float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132ef095", new Object[]{f, new Float(f2), view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f.floatValue(), f2);
        ofFloat.setDuration(200L);
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f.floatValue(), f2);
        ofFloat2.setDuration(200L);
        ofFloat2.start();
    }
}
