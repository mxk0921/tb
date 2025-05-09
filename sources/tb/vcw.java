package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.q;
import com.taobao.detail.rate.v2.PhotoView;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29926a;
    public final ViewGroup b;
    public final PhotoView c;
    public q d;
    public int e;
    public pin f;
    public final PhenixOptions g;
    public final FragmentActivity h;

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
                vcw.a(vcw.this, this.b);
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
                vcw.a(vcw.this, this.b);
            }
        }
    }

    public vcw(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        ckf.g(viewGroup, "container");
        this.h = fragmentActivity;
        Context context = viewGroup.getContext();
        ckf.f(context, "container.context");
        this.f29926a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.rate_preview_video_layout_v2, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            this.b = viewGroup2;
            View findViewById = viewGroup2.findViewById(R.id.rate_image_preview);
            if (findViewById != null) {
                this.c = (PhotoView) findViewById;
                if (jhn.INSTANCE.a()) {
                    this.g = new PhenixOptions().fuzzyMatchCache(true);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.PhotoView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static final /* synthetic */ void a(vcw vcwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d875584", new Object[]{vcwVar, new Integer(i)});
        } else {
            vcwVar.i(i);
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
        this.c.setVisibility(0);
        this.c.enable();
        this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.c.disableRotate();
        this.c.setLongClickable(true);
        PhotoView photoView = this.c;
        PreviewItemV2.VideoInfo video = previewItemV2.getVideo();
        if (video != null) {
            str = video.getPicUrl();
        } else {
            str = null;
        }
        photoView.setImageUrl(str, this.g);
        this.c.succListener(new a(i));
        this.c.setCacheListener(new b(i));
    }

    public final q75 c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q75) ipChange.ipc$dispatch("ebf166aa", new Object[]{this, context, str});
        }
        q75 q75Var = new q75();
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setImageUrl(str);
        q75Var.c(tUrlImageView);
        return q75Var;
    }

    public final View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final void e(PreviewItemV2.VideoInfo videoInfo) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a737bd", new Object[]{this, videoInfo});
        } else if (this.d == null && videoInfo != null) {
            q.a aVar = new q.a(this.h);
            aVar.J(true).U(true).Q(true);
            aVar.l0(videoInfo.getVideoId()).n0("TBVideo");
            aVar.q0(0);
            aVar.x(vwo.e(this.f29926a)).B(DWVideoScreenType.NORMAL);
            Context context = this.f29926a;
            String picUrl = videoInfo.getPicUrl();
            if (picUrl == null) {
                picUrl = "";
            }
            aVar.v(c(context, picUrl));
            aVar.k0(DWAspectRatio.DW_CENTER_CROP);
            aVar.L(false);
            aVar.p0(videoInfo.getVideoUrl()).n("baobeipingjia");
            aVar.m0(true);
            aVar.j(true);
            aVar.g(true);
            aVar.h(true);
            aVar.l(true);
            q r0 = aVar.r0();
            this.d = r0;
            if (r0 != null) {
                r0.hideController();
            }
            q qVar = this.d;
            if (qVar != null) {
                qVar.setVideoBackgroundColor(0);
            }
            ViewGroup viewGroup2 = this.b;
            if (viewGroup2 != null) {
                q qVar2 = this.d;
                if (qVar2 != null) {
                    viewGroup = qVar2.getView();
                } else {
                    viewGroup = null;
                }
                viewGroup2.addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public final void f(PreviewItemV2.VideoInfo videoInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67efcac6", new Object[]{this, videoInfo});
            return;
        }
        e(videoInfo);
        q qVar = this.d;
        if (qVar != null) {
            if (videoInfo != null) {
                str = videoInfo.getVideoUrl();
            } else {
                str = null;
            }
            qVar.setVideoUrl(str);
        }
        q qVar2 = this.d;
        if (qVar2 != null) {
            qVar2.start();
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2132a9", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void h(pin pinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04671ab", new Object[]{this, pinVar});
        } else {
            this.f = pinVar;
        }
    }

    public final void i(int i) {
        pin pinVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65bec9e", new Object[]{this, new Integer(i)});
        } else if (i == this.e && (pinVar = this.f) != null) {
            pinVar.e();
        }
    }
}
