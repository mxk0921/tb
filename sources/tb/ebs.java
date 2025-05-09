package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.core.utils.transition.BKTransitionPageSnapShotBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ebs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements byt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BKTransitionPageSnapShotBinder f18458a;
        public final /* synthetic */ Activity b;

        public a(BKTransitionPageSnapShotBinder bKTransitionPageSnapShotBinder, Activity activity) {
            this.f18458a = bKTransitionPageSnapShotBinder;
            this.b = activity;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c12cdaf", new Object[]{this, str});
                return;
            }
            fve.e("TransitionPageSnapShotUtil", "无极缩放 onBitmapCreateError:errorMsg:" + str);
        }

        public void b(Bitmap bitmap, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2455258", new Object[]{this, bitmap, str});
                return;
            }
            this.f18458a.setPageSnapShotBitmap(bitmap);
            fve.e("TransitionPageSnapShotUtil", "无极缩放 onBitmapCreateSuccess:successMsg:" + str + " bitmap:" + bitmap);
            if (cw6.b() && eue.b() && bve.v()) {
                t2s.a(this.b, bitmap);
                fve.e("TransitionPageSnapShotUtil", "无极缩放 enableSaveHomeSnapShotForDebugApp:bitmap:" + bitmap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Window f18459a;
        public final /* synthetic */ View b;
        public final /* synthetic */ byt c;
        public final /* synthetic */ Bitmap.Config d;

        public b(Window window, View view, byt bytVar, Bitmap.Config config) {
            this.f18459a = window;
            this.b = view;
            this.c = bytVar;
            this.d = config;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ebs.a(this.f18459a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byt f18460a;
        public final /* synthetic */ Bitmap b;

        public c(byt bytVar, Bitmap bitmap) {
            this.f18460a = bytVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                ((a) this.f18460a).b(this.b, "无极缩放 asyncScreenshotPixelCopyOnView success.");
            } else {
                this.b.recycle();
                byt bytVar = this.f18460a;
                ((a) bytVar).a("无极缩放 asyncScreenshotPixelCopyOnView error.copyResult:" + i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18461a;
        public final /* synthetic */ Bitmap.Config b;
        public final /* synthetic */ byt c;

        public d(View view, Bitmap.Config config, byt bytVar) {
            this.f18461a = view;
            this.b = config;
            this.c = bytVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Bitmap b = ebs.b(this.f18461a, this.b);
            if (b == null) {
                ((a) this.c).a("无极缩放 asyncScreenshotDrawOnView error.");
            } else {
                ((a) this.c).b(b, "无极缩放 asyncScreenshotDrawOnView success.");
            }
        }
    }

    static {
        t2o.a(486539752);
    }

    public static /* synthetic */ void a(Window window, View view, byt bytVar, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4b3d8d", new Object[]{window, view, bytVar, config});
        } else {
            f(window, view, bytVar, config);
        }
    }

    public static /* synthetic */ Bitmap b(View view, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ee748254", new Object[]{view, config});
        }
        return g(view, config);
    }

    public static void c(View view, byt bytVar, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c117ae", new Object[]{view, bytVar, config});
            return;
        }
        try {
            Coordinator.execute(new d(view, config, bytVar), 30);
        } catch (Exception e) {
            fve.e("TransitionPageSnapShotUtil", "无极缩放 asyncScreenshotDrawOnView with exception:errorMsg:" + Log.getStackTraceString(e));
        }
    }

    public static void d(Window window, View view, byt bytVar, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d71620", new Object[]{window, view, bytVar, config});
        } else {
            Coordinator.execute(new b(window, view, bytVar, config), 30);
        }
    }

    public static BKTransitionPageSnapShotBinder e(peu peuVar, Activity activity, Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BKTransitionPageSnapShotBinder) ipChange.ipc$dispatch("2e280a75", new Object[]{peuVar, activity, window});
        }
        View decorView = window.getDecorView();
        if (!peuVar.n) {
            decorView = decorView.findViewById(16908290);
        }
        BKTransitionPageSnapShotBinder bKTransitionPageSnapShotBinder = new BKTransitionPageSnapShotBinder(null);
        a aVar = new a(bKTransitionPageSnapShotBinder, activity);
        if (!peuVar.m || !peuVar.n) {
            c(decorView, aVar, peuVar.p);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d(window, decorView, aVar, peuVar.p);
        } else {
            c(decorView, aVar, peuVar.p);
        }
        return bKTransitionPageSnapShotBinder;
    }

    public static void f(Window window, View view, byt bytVar, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c903e9", new Object[]{window, view, bytVar, config});
        } else if (view == null) {
            ((a) bytVar).a("无极缩放 pixelCopyOnView:view is null");
        } else if (view.isLayoutRequested()) {
            ((a) bytVar).a("无极缩放 pixelCopyOnView:view isLayoutRequested");
        } else if (view.getWindowToken() == null) {
            ((a) bytVar).a("无极缩放 pixelCopyOnView:view window token is null");
        } else {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                ((a) bytVar).a("无极缩放 pixelCopyOnView:no width or height.");
            } else if (Build.VERSION.SDK_INT >= 26) {
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                PixelCopy.request(window, createBitmap, new c(bytVar, createBitmap), new Handler(Looper.getMainLooper()));
            }
        }
    }

    public static Bitmap g(View view, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b9afb7b0", new Object[]{view, config});
        }
        if (view == null || view.isLayoutRequested() || view.getWindowToken() == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static void h(cfc cfcVar, peu peuVar, View view, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5096bc98", new Object[]{cfcVar, peuVar, view, bundle, new Boolean(z)});
        } else if (peuVar == null || view == null) {
            fve.e("TransitionPageSnapShotUtil", "无极缩放 处理页面截屏失败。transitionAnimParams:" + peuVar + " rootView:" + view);
        } else {
            fve.e("TransitionPageSnapShotUtil", "无极缩放:跟手返回:页面截屏检测中:状态开关为:enableDragBackAnim:" + peuVar.k + ":enablePageSnapshot:" + peuVar.l);
            if (!peuVar.k || !peuVar.l) {
                fve.e("TransitionPageSnapShotUtil", "Abort:无极缩放 放弃处理页面截屏。开关未开。");
            } else if (bundle == null) {
                fve.e("TransitionPageSnapShotUtil", "Error:无极缩放 处理页面截屏失败。extras is null");
            } else {
                Activity k = r4b.k(view, cfcVar);
                if (k == null) {
                    fve.e("TransitionPageSnapShotUtil", "无极缩放 处理页面截屏失败。activity is null。infoFlowContext:" + cfcVar);
                    return;
                }
                Window window = k.getWindow();
                if (window == null) {
                    fve.e("TransitionPageSnapShotUtil", "无极缩放 处理页面截屏失败。window is null");
                    return;
                }
                peuVar.o = e(peuVar, k, window);
                fve.e("TransitionPageSnapShotUtil", "无极缩放 处理页面截屏开始了。");
            }
        }
    }
}
