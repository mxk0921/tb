package tb;

import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class egr extends zne {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_CODE_STR = "15";
    public static final String DETAIL_IMG_BIZ_NAME = "detail";
    public static final String TAG = "TaobaoImageLoaderAdapter";
    public static volatile egr c;
    public final ImageStrategyConfig b = ImageStrategyConfig.v("detail", 15).d(false).a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ame {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ame f18567a;
        public final ImageView b;
        public boolean c;
        public boolean d;

        static {
            t2o.a(912262982);
            t2o.a(912262971);
        }

        public a(ame ameVar, ImageView imageView) {
            this.f18567a = ameVar;
            this.b = imageView;
        }

        @Override // tb.ame
        public void a(yle yleVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca00359c", new Object[]{this, yleVar});
                return;
            }
            ame ameVar = this.f18567a;
            if (ameVar != null) {
                ameVar.a(yleVar);
            }
        }

        @Override // tb.ame
        public void b(yle yleVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85aca743", new Object[]{this, yleVar});
                return;
            }
            BitmapDrawable bitmapDrawable = yleVar.f32167a;
            tgh.b(egr.TAG, "DetailImageLoadListenerWrapper onSuccess called.");
            ImageView imageView = this.b;
            if (!(imageView == null || bitmapDrawable == null)) {
                int width = imageView.getWidth();
                int height = this.b.getHeight();
                int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    if (this.c) {
                        width = (int) (((intrinsicWidth * 1.0d) / intrinsicHeight) * height);
                    } else if (this.d) {
                        height = (int) (((intrinsicHeight * 1.0d) / intrinsicWidth) * width);
                    }
                    if (height > 0 && width > 0) {
                        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = height;
                            layoutParams.width = width;
                        } else {
                            this.b.setLayoutParams(new ViewGroup.LayoutParams(width, height));
                        }
                    }
                }
            }
            ame ameVar = this.f18567a;
            if (ameVar != null) {
                ameVar.b(yleVar);
            }
        }
    }

    static {
        t2o.a(912262980);
        t2o.a(912262968);
    }

    public static egr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egr) ipChange.ipc$dispatch("6ffc923c", new Object[0]);
        }
        if (c == null) {
            synchronized (egr.class) {
                try {
                    if (c == null) {
                        c = new egr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static /* synthetic */ Object ipc$super(egr egrVar, String str, Object... objArr) {
        if (str.hashCode() == 1025844128) {
            super.a((String) objArr[0], (DetailImageView) objArr[1], (hme) objArr[2], (ame) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/image/TBImageLoaderProvider");
    }

    @Override // tb.zne
    public void a(String str, DetailImageView detailImageView, hme hmeVar, ame ameVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2523a0", new Object[]{this, str, detailImageView, hmeVar, ameVar});
            return;
        }
        if (hmeVar == null) {
            hmeVar = new hme.a().m();
        }
        b(hmeVar);
        a aVar = new a(ameVar, detailImageView);
        ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            if (i == -2 && layoutParams.height > 0) {
                hmeVar.i = true;
            } else if (layoutParams.height == -2 && i > 0) {
                hmeVar.h = true;
            }
        }
        if (hmeVar.i) {
            aVar.c = true;
        } else if (hmeVar.h) {
            aVar.d = true;
        }
        super.a(str, detailImageView, hmeVar, aVar);
    }

    public final void b(hme hmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43e312a", new Object[]{this, hmeVar});
        } else if (hmeVar != null) {
            hmeVar.k = "detail";
            hmeVar.j = 15;
        }
    }

    public String c(String str, koe koeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab1eaf3b", new Object[]{this, str, koeVar});
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(koeVar.f22798a), Integer.valueOf(koeVar.b), this.b);
    }

    public void e(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9426940", new Object[]{this, str, detailImageView});
        } else {
            f(str, detailImageView, null);
        }
    }

    public void f(String str, DetailImageView detailImageView, hme hmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5698d02c", new Object[]{this, str, detailImageView, hmeVar});
        } else {
            a(str, detailImageView, hmeVar, null);
        }
    }
}
