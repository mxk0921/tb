package com.taobao.themis.kernel.extension.page;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import tb.a07;
import tb.ckf;
import tb.dgy;
import tb.f9s;
import tb.fnd;
import tb.g1a;
import tb.o9s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultScreenShotPageExtension implements fnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13572a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909600);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<Bitmap, xhv> f13573a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ g1a<Integer, xhv> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Bitmap, xhv> g1aVar, Bitmap bitmap, g1a<? super Integer, xhv> g1aVar2) {
            this.f13573a = g1aVar;
            this.b = bitmap;
            this.c = g1aVar2;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                g1a<Bitmap, xhv> g1aVar = this.f13573a;
                Bitmap bitmap = this.b;
                ckf.f(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                g1aVar.invoke(bitmap);
            } else {
                this.c.invoke(Integer.valueOf(i));
            }
        }
    }

    static {
        t2o.a(839909599);
        t2o.a(839909644);
    }

    public DefaultScreenShotPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13572a = iTMSPage;
    }

    @Override // tb.fnd
    public void E(fnd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa76c511", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        View view = this.f13572a.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            bVar.a(null);
        } else if (o9s.e(viewGroup, SurfaceView.class) != null) {
            TMSLogger.b("DefaultScreenShotPageExtension", "can't get page snapshot due to SurfaceView");
            bVar.a(null);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Activity I = this.f13572a.getInstance().I();
            ckf.f(I, "page.getInstance().activity");
            f(viewGroup, I, new DefaultScreenShotPageExtension$getScreenShotAsync$1(bVar), new DefaultScreenShotPageExtension$getScreenShotAsync$2(bVar));
        } else {
            bVar.a(a(viewGroup));
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            fnd.a.b(this, iTMSPage);
        }
    }

    public final Bitmap a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ca9ba431", new Object[]{this, viewGroup});
        }
        if (o9s.e(viewGroup, SurfaceView.class) != null) {
            TMSLogger.b("DefaultScreenShotPageExtension", "can't get page snapshot due to SurfaceView");
            return null;
        } else if (o9s.e(viewGroup, TextureView.class) == null) {
            return f9s.a(viewGroup, viewGroup.getWidth(), viewGroup.getHeight(), 0, 0);
        } else {
            TMSLogger.b("DefaultScreenShotPageExtension", "can't get page snapshot due to TextureView");
            return null;
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            fnd.a.c(this);
        }
    }

    public final void f(View view, Activity activity, g1a<? super Bitmap, xhv> g1aVar, g1a<? super Integer, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f61b61f", new Object[]{this, view, activity, g1aVar, g1aVar2});
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        PixelCopy.request(activity.getWindow(), new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()), createBitmap, dgy.a(new b(g1aVar, createBitmap, g1aVar2)), CommonExtKt.b());
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            fnd.a.a(this);
        }
    }
}
