package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import java.util.List;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uhi extends com.taobao.android.layoutmanager.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f29386a;

        public a(b bVar) {
            this.f29386a = bVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                return;
            }
            uhi.e(uhi.this).setImageDrawable(bitmapDrawable);
            Point f = uhi.f(uhi.this, bitmapDrawable);
            ViewPropertyAnimator animate = uhi.e(uhi.this).animate();
            int i = f.x;
            this.f29386a.getClass();
            this.f29386a.getClass();
            ViewPropertyAnimator translationXBy = animate.translationXBy(i / 2);
            int i2 = f.y;
            this.f29386a.getClass();
            this.f29386a.getClass();
            ViewPropertyAnimator translationYBy = translationXBy.translationYBy((i2 / 2) + s6o.z(uhi.this.f8186a));
            this.f29386a.getClass();
            float f2 = 0;
            ViewPropertyAnimator scaleX = translationYBy.scaleX((f.x * 1.0f) / f2);
            this.f29386a.getClass();
            scaleX.scaleY((f.y * 1.0f) / f2).setDuration(300L).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        static {
            t2o.a(502267999);
        }
    }

    static {
        t2o.a(502267997);
    }

    public uhi(Context context, BaseContainerFragment baseContainerFragment, lgs.b bVar) {
        super(context, baseContainerFragment, bVar);
    }

    public static /* synthetic */ ImageView e(uhi uhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("8c00c240", new Object[]{uhiVar});
        }
        return uhiVar.e;
    }

    public static /* synthetic */ Point f(uhi uhiVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("cfc9fa55", new Object[]{uhiVar, bitmapDrawable});
        }
        return uhiVar.g(bitmapDrawable);
    }

    public static /* synthetic */ Object ipc$super(uhi uhiVar, String str, Object... objArr) {
        if (str.hashCode() == 668965158) {
            super.d((Activity) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/MediabrowserContainerLifecycle");
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void d(Activity activity) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27df9926", new Object[]{this, activity});
            return;
        }
        super.d(activity);
        if (activity != null) {
            activity.overridePendingTransition(17432576, 0);
        }
        this.c.v2().setBackgroundColor(-1);
        ImageView imageView = new ImageView(this.f8186a);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String queryParameter = this.b.b.getQueryParameter("extraData");
        if (!TextUtils.isEmpty(queryParameter) && (parseArray = JSON.parseArray(queryParameter, b.class)) != null && !parseArray.isEmpty()) {
            b bVar = (b) parseArray.get(0);
            bVar.getClass();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0 - s6o.z(this.f8186a);
            this.c.u2().addView(this.e, 0, layoutParams);
            od0.D().a().e(this.f8186a, null, -1, -1, new a(bVar));
        }
    }

    public final Point g(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("9a4a2689", new Object[]{this, bitmapDrawable});
        }
        Point point = new Point();
        int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
        int i = this.f8186a.getResources().getDisplayMetrics().widthPixels;
        point.x = i;
        point.y = (int) (((i * 1.0f) / intrinsicWidth) * intrinsicHeight);
        return point;
    }
}
