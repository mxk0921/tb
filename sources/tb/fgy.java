package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import tb.d2m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fgy INSTANCE = new fgy();

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f19290a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19291a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Activity c;

        public a(Bitmap bitmap, int i, Activity activity) {
            this.f19291a = bitmap;
            this.b = i;
            this.c = activity;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                hs3 hs3Var = hs3.INSTANCE;
                Bitmap bitmap = this.f19291a;
                ckf.f(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                hs3Var.b(bitmap, String.valueOf(this.b));
                d2m.a aVar = d2m.Companion;
                Activity activity = this.c;
                JSONObject jSONObject = new JSONObject();
                int i2 = this.b;
                Activity activity2 = this.c;
                jSONObject.put((JSONObject) "token", String.valueOf(i2));
                jSONObject.put((JSONObject) "pssource", fgy.a(fgy.INSTANCE, activity2));
                xhv xhvVar = xhv.INSTANCE;
                aVar.d(activity, jSONObject);
            } else {
                agh.c("CSGestureInterceptor", ckf.p("PixelCopy result:", Integer.valueOf(i)));
            }
        }
    }

    static {
        t2o.a(481296910);
    }

    public static final /* synthetic */ String a(fgy fgyVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd11fb2", new Object[]{fgyVar, activity});
        }
        return fgyVar.b(activity);
    }

    public final String b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0befed", new Object[]{this, activity});
        }
        agh.h("CSGestureInterceptor", ckf.p("getPssourceByActivity: ", activity.getClass().getName()));
        String name = activity.getClass().getName();
        switch (name.hashCode()) {
            case -1051285494:
                if (name.equals("com.taobao.android.detail.alittdetail.TTDetailActivity")) {
                    return "productDetail";
                }
                break;
            case 27418133:
                if (name.equals("com.taobao.search.sf.MainSearchResultActivity")) {
                    return "textsrp";
                }
                break;
            case 1070669480:
                if (name.equals("com.etao.feimagesearch.IrpActivity")) {
                    return "photoSearch";
                }
                break;
            case 1860592800:
                if (name.equals("com.taobao.android.detail2.core.framework.NewDetailActivity")) {
                    return "ND";
                }
                break;
        }
        return "unknown";
    }

    public final void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e632909", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        int hashCode = activity.hashCode();
        View decorView = activity.getWindow().getDecorView();
        ckf.f(decorView, "activity.window.decorView");
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PixelCopy.request(activity.getWindow(), createBitmap, dgy.a(new a(createBitmap, hashCode, activity)), f19290a);
            }
        } catch (Exception e) {
            agh.d("CSGestureInterceptor", "triggerCircleSearch cache Error:", e);
            createBitmap.recycle();
        }
    }
}
