package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.login4android.api.Login;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r63 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final r63 INSTANCE = new r63();
    public static final String TAG = "OrderListCapture";

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f27134a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public b(Bitmap bitmap, Context context, String str) {
            this.f27134a = bitmap;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f27134a != null) {
                try {
                    String userId = Login.getUserId();
                    if (!(userId == null || userId.length() == 0)) {
                        File file = new File(this.b.getCacheDir() + "/fullBitmap_" + userId + this.c + ".jpg");
                        if (file.exists()) {
                            file.delete();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        this.f27134a.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        hav.d(r63.TAG, "截图保存");
                        this.f27134a.recycle();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        t2o.a(713031918);
    }

    public static final /* synthetic */ void a(r63 r63Var, Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8289e408", new Object[]{r63Var, context, bitmap, str});
        } else {
            r63Var.e(context, bitmap, str);
        }
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a99f8", new Object[0])).booleanValue();
        }
        if (yh.a().f32082a <= 1) {
            return uel.l("enableOLAsyncAnim", false);
        }
        if (!nrr.o() || !uel.l("enableOLAsyncAnim", false)) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1d1733", new Object[]{context, str});
        }
        if (ykl.a() || !c() || context == null || str == null || str.length() == 0 || TabType.REFUND.getValue().equals(str)) {
            return null;
        }
        try {
            hav.d(TAG, "读取截图文件 start: " + str);
            String userId = Login.getUserId();
            if (!(userId == null || userId.length() == 0)) {
                String str2 = context.getCacheDir() + "/fullBitmap_" + userId + str + ".jpg";
                if (!new File(str2).exists()) {
                    return null;
                }
                hav.d(TAG, "读取截图文件 end: " + str);
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void e(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cde47a", new Object[]{this, context, bitmap, str});
        } else if (context != null && str != null && str.length() != 0) {
            pav.k(new b(bitmap, context, str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f27132a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.r63$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class PixelCopy$OnPixelCopyFinishedListenerC1045a implements PixelCopy.OnPixelCopyFinishedListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Bitmap b;

            public PixelCopy$OnPixelCopyFinishedListenerC1045a(Bitmap bitmap) {
                this.b = bitmap;
            }

            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    r63.a(r63.INSTANCE, a.this.f27132a.getContext(), this.b, a.this.c);
                } else {
                    hav.d(r63.TAG, "截图失败");
                }
            }
        }

        public a(View view, boolean z, String str) {
            this.f27132a = view;
            this.b = z;
            this.c = str;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.f27132a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f27132a.getContext() instanceof Activity) {
                try {
                    Context context = this.f27132a.getContext();
                    if (context != null) {
                        Window window = ((Activity) context).getWindow();
                        Bitmap createBitmap = Bitmap.createBitmap(this.f27132a.getWidth(), this.f27132a.getHeight(), Bitmap.Config.RGB_565);
                        if (!this.b || yh.a().f32082a > 1) {
                            this.f27132a.draw(new Canvas(createBitmap));
                            r63.a(r63.INSTANCE, this.f27132a.getContext(), createBitmap, this.c);
                            return;
                        }
                        PixelCopy.request(window, new Rect(0, 0, this.f27132a.getWidth(), this.f27132a.getHeight()), createBitmap, dgy.a(new PixelCopy$OnPixelCopyFinishedListenerC1045a(createBitmap)), new Handler(Looper.getMainLooper()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                } catch (Throwable th) {
                    hav.g(r63.TAG, th.getMessage());
                }
            }
        }
    }

    @JvmStatic
    public static final void b(View view, String str, boolean z) {
        ViewTreeObserver viewTreeObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f995edea", new Object[]{view, str, new Boolean(z)});
        } else if (!ykl.a() && v9v.i(wbl.NEW_BABEL_ORDER, "enableCaptureOLView", true) && !TabType.WAIT_RATE.getValue().equals(str) && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a(view, z, str));
        }
    }
}
