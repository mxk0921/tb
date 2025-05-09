package tb;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final hme f32888a;
        public final DetailImageView b;
        public final ame c;

        static {
            t2o.a(912262976);
            t2o.a(620757101);
        }

        public a(String str, hme hmeVar, DetailImageView detailImageView, ame ameVar) {
            this.f32888a = hmeVar;
            this.b = detailImageView;
            this.c = ameVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (this.b == null) {
                return false;
            }
            hme hmeVar = this.f32888a;
            if (hmeVar != null) {
                if (hmeVar.a() != null) {
                    this.b.setScaleType(this.f32888a.a());
                }
                try {
                    this.b.setImageResource(this.f32888a.c());
                } catch (Throwable unused) {
                }
            }
            if (this.c != null) {
                this.c.a(new yle());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final hme f32889a;
        public final DetailImageView b;
        public final ame c;
        public final String d;

        static {
            t2o.a(912262977);
            t2o.a(620757101);
        }

        public b(String str, hme hmeVar, DetailImageView detailImageView, ame ameVar) {
            try {
                detailImageView.setImageResource(hmeVar.c());
            } catch (Throwable unused) {
            }
            this.f32889a = hmeVar;
            this.b = detailImageView;
            this.c = ameVar;
            this.d = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (this.b == null) {
                return false;
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable == null || drawable.getBitmap() == null || drawable.getBitmap().isRecycled()) {
                hme hmeVar = this.f32889a;
                if (!(hmeVar == null || hmeVar.e() == null)) {
                    this.b.setScaleType(this.f32889a.e());
                }
                return false;
            }
            this.b.setImageDrawable(this.d, drawable, this.f32889a);
            hme hmeVar2 = this.f32889a;
            if (!(hmeVar2 == null || hmeVar2.f() == null)) {
                this.b.setScaleType(this.f32889a.f());
            }
            if (this.c != null) {
                yle yleVar = new yle();
                yleVar.f32167a = succPhenixEvent.getDrawable();
                this.c.b(yleVar);
            }
            return true;
        }
    }

    static {
        t2o.a(912262975);
        t2o.a(912262974);
    }

    public void a(String str, DetailImageView detailImageView, hme hmeVar, ame ameVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2523a0", new Object[]{this, str, detailImageView, hmeVar, ameVar});
        } else if (detailImageView != null) {
            if (TextUtils.isEmpty(str)) {
                detailImageView.setImageDrawable(null);
            } else if (hmeVar == null || (i = hmeVar.j) == 0) {
                throw new IllegalArgumentException("option is invalid");
            } else {
                String str2 = "default";
                if (hmeVar.l == null) {
                    String str3 = hmeVar.k;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    ImageStrategyConfig.b d = ImageStrategyConfig.v(str3, i).d(false);
                    if (hmeVar.i()) {
                        d.h(10000);
                        d.j(0);
                    } else if (hmeVar.h()) {
                        d.j(10000);
                        d.h(0);
                    }
                    if (hmeVar.j()) {
                        d.p(true);
                    }
                    hmeVar.l = d.a();
                }
                if (hmeVar.e() != null) {
                    detailImageView.setScaleType(hmeVar.e());
                }
                if (hmeVar.g() > 0 && hmeVar.b() > 0) {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(hmeVar.g()), Integer.valueOf(hmeVar.b()), hmeVar.l);
                } else if (detailImageView.getWidth() <= 0 || detailImageView.getHeight() <= 0) {
                    ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
                    if (layoutParams != null && (i2 = layoutParams.width) > 0 && layoutParams.height > 0) {
                        str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(layoutParams.height), hmeVar.l);
                    } else if (str.startsWith("http") && str.endsWith(".jpg")) {
                        String str4 = hmeVar.k;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        ImageStrategyConfig.b h = ImageStrategyConfig.v(str2, hmeVar.j).d(false).j(1200).h(1200);
                        if (hmeVar.j()) {
                            h.p(true);
                        } else {
                            h.i(TaobaoImageUrlStrategy.ImageQuality.q90);
                        }
                        hmeVar.l = h.a();
                        str = ImageStrategyDecider.decideUrl(str, 1200, 1200, hmeVar.l);
                    }
                } else {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(detailImageView.getWidth()), Integer.valueOf(detailImageView.getHeight()), hmeVar.l);
                }
                if (str.endsWith("END_IMAGE_URL")) {
                    str = str.substring(0, str.length() - 13);
                }
                PhenixCreator addLoaderExtra = s0m.B().T(str).succListener(new b(str, hmeVar, detailImageView, ameVar)).failListener(new a(str, hmeVar, detailImageView, ameVar)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "15");
                if (!(hmeVar.d() == Integer.MAX_VALUE || hmeVar.d() == 0)) {
                    addLoaderExtra.placeholder(hmeVar.d());
                }
                if (hmeVar.j()) {
                    addLoaderExtra.forceHighQualityAccess(true);
                }
                addLoaderExtra.fetch();
            }
        }
    }
}
