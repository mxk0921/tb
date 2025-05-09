package tb;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.r;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.umipublish.extension.preview.PreviewModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class maw implements com.taobao.umipublish.extension.preview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public r f23899a;
    public ImageView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                maw.d(maw.this).Y();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements ztb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23901a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = b.this.b;
                if (view != null) {
                    view.setVisibility(8);
                }
                b.this.c.setVisibility(8);
            }
        }

        public b(maw mawVar, Context context, View view, View view2) {
            this.f23901a = context;
            this.b = view;
            this.c = view2;
        }

        @Override // tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            ebg.l(this.f23901a, Localization.q(R.string.gg_pub_video_playback_failed));
            View view = this.b;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        @Override // tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (i == 3) {
                trt.d(new a(), 100L);
            }
        }

        @Override // tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            }
        }

        @Override // tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23903a;

        public c(View view) {
            this.f23903a = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int H = maw.d(maw.this).H();
            if (H == 1) {
                maw.d(maw.this).W();
                this.f23903a.setVisibility(0);
            } else if (H == 2) {
                maw.d(maw.this).Y();
                this.f23903a.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f23904a;
        public final int b;
        public final int c;

        static {
            t2o.a(944767058);
        }

        public d(int i, int i2, int i3) {
            this.f23904a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        t2o.a(944767053);
        t2o.a(944767023);
    }

    public static /* synthetic */ r d(maw mawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("2646ac16", new Object[]{mawVar});
        }
        return mawVar.f23899a;
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public View a(ViewGroup viewGroup, PreviewModel.Media media) {
        TUrlImageView tUrlImageView;
        int i;
        int i2;
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d7c9742", new Object[]{this, viewGroup, media});
        }
        r.a aVar = new r.a((Activity) viewGroup.getContext());
        aVar.c0(true);
        aVar.Z(DWAspectRatio.DW_FIT_CENTER);
        aVar.q(DWInstanceType.VIDEO);
        aVar.f(false);
        aVar.d0(media.path);
        aVar.A(false);
        int b2 = bxo.b();
        int a2 = bxo.a() - b65.a(52.0f);
        FrameLayout.LayoutParams f3 = f();
        d g = g(media.path);
        if (g != null && (i = g.f23904a) > 0 && (i2 = g.b) > 0) {
            if (g.c % 180 == 0) {
                f = i2;
                f2 = i;
            } else {
                f = i;
                f2 = i2;
            }
            float f4 = f / f2;
            if (f4 > 1.3333334f) {
                f3.gravity = 49;
                a2 = (int) Math.min(a2, b2 * f4);
                f3.height = a2;
            }
        }
        aVar.g0(b2);
        aVar.t(a2);
        aVar.f0(media.path);
        aVar.x(true);
        r h0 = aVar.a();
        this.f23899a = h0;
        ViewGroup K = h0.K();
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(K, f3);
        if (ydv.x()) {
            if (!TextUtils.isEmpty(media.coverUrl)) {
                tUrlImageView = new TUrlImageView(context);
                boolean startsWith = media.coverUrl.startsWith("http");
                String str = media.coverUrl;
                if (!startsWith) {
                    str = uuo.q(str);
                }
                tUrlImageView.setImageUrl(str);
                tUrlImageView.setOnClickListener(new a());
                frameLayout.addView(tUrlImageView, f());
            } else {
                tUrlImageView = null;
            }
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.umi_icon_video_preview_play));
            FrameLayout.LayoutParams f5 = f();
            f5.width = b65.a(64.0f);
            f5.height = b65.a(53.0f);
            frameLayout.addView(imageView, f5);
            e(context, K, tUrlImageView, imageView);
        }
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cff6db", new Object[]{this});
            return;
        }
        r rVar = this.f23899a;
        if (rVar != null && rVar.H() == 1) {
            this.f23899a.W();
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void c(View view, PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5551000a", new Object[]{this, view, media});
        } else {
            this.f23899a.O0();
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void destroyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e93784c", new Object[]{this, view});
            return;
        }
        r rVar = this.f23899a;
        if (rVar != null) {
            rVar.W();
            this.f23899a.y();
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public final void e(Context context, View view, View view2, View view3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9bb538", new Object[]{this, context, view, view2, view3});
            return;
        }
        this.f23899a.G0(new b(this, context, view2, view3));
        ViewProxy.setOnClickListener(view, new c(view3));
    }

    public final FrameLayout.LayoutParams f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("a7ebd66a", new Object[]{this});
        }
        return new FrameLayout.LayoutParams(-1, -1, 17);
    }

    public final d g(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8ada5fcd", new Object[]{this, str});
        }
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                d dVar = new d(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(24)));
                mediaMetadataRetriever.release();
                return dVar;
            } catch (Throwable unused) {
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                return null;
            }
        } catch (Throwable unused2) {
            mediaMetadataRetriever = null;
        }
    }
}
