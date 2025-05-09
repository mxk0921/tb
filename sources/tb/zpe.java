package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.PhotoView;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zpe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f32929a;
    public final PhotoView b;
    public int c;
    public pin d;
    public final PhenixOptions e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent == null || succPhenixEvent.getDrawable() == null)) {
                zpe.a(zpe.this, this.b);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements PhotoView.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.g
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d1abc70", new Object[]{this});
            } else {
                zpe.a(zpe.this, this.b);
            }
        }
    }

    public zpe(ViewGroup viewGroup) {
        ckf.g(viewGroup, "container");
        Context context = viewGroup.getContext();
        ckf.f(context, "container.context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.rate_preview_video_layout_v2, viewGroup, false);
        this.f32929a = inflate;
        View findViewById = inflate != null ? inflate.findViewById(R.id.rate_image_preview) : null;
        if (findViewById != null) {
            this.b = (PhotoView) findViewById;
            if (jhn.INSTANCE.a()) {
                this.e = new PhenixOptions().fuzzyMatchCache(true);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.PhotoView");
    }

    public static final /* synthetic */ void a(zpe zpeVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cbbe264", new Object[]{zpeVar, new Integer(i)});
        } else {
            zpeVar.f(i);
        }
    }

    public final void b(int i, PreviewItemV2 previewItemV2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735b0104", new Object[]{this, new Integer(i), previewItemV2});
            return;
        }
        ckf.g(previewItemV2, "data");
        this.b.setVisibility(0);
        this.b.enable();
        this.b.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.b.disableRotate();
        this.b.setLongClickable(true);
        PhotoView photoView = this.b;
        PreviewItemV2.PicInfo pic = previewItemV2.getPic();
        if (pic != null) {
            str = pic.getPicUrl();
        } else {
            str = null;
        }
        photoView.setImageUrl(str, this.e);
        this.b.succListener(new a(i));
        this.b.setCacheListener(new b(i));
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f32929a;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2132a9", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void e(pin pinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04671ab", new Object[]{this, pinVar});
        } else {
            this.d = pinVar;
        }
    }

    public final void f(int i) {
        pin pinVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65bec9e", new Object[]{this, new Integer(i)});
        } else if (i == this.c && (pinVar = this.d) != null) {
            pinVar.e();
        }
    }
}
