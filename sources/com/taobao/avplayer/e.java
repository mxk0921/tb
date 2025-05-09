package com.taobao.avplayer;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWHighPerformanceInstanceNew;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tb.asc;
import tb.b75;
import tb.d75;
import tb.dq;
import tb.feh;
import tb.ftb;
import tb.gov;
import tb.k95;
import tb.psb;
import tb.qsb;
import tb.r65;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.utb;
import tb.v85;
import tb.y95;
import tb.ytb;
import tb.z75;
import tb.z95;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e implements asc, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f10163a;
    public DWHighPerformanceInstanceNew b;
    public final Activity c;
    public final d d;
    public ImageView e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public JSONObject l;
    public final ytb m;
    public final ftb n;
    public feh o = new feh(toString(), "");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            e.this.n.c();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            e.this.n.b();
            AVSDKLog.e(e.a(e.this), "livePhoto: cover showed suceessfully by phenix");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d f10166a;

        static {
            t2o.a(451936276);
        }

        public c(Activity activity) {
            d dVar = new d();
            this.f10166a = dVar;
            dVar.f10167a = activity;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("b0df1262", new Object[]{this});
            }
            return new e(this.f10166a);
        }

        public c b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("92464cd7", new Object[]{this, str});
            }
            this.f10166a.c = str;
            return this;
        }

        public c c(psb psbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("bf58232", new Object[]{this, psbVar});
            }
            this.f10166a.getClass();
            return this;
        }

        public c d(qsb qsbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("512eee94", new Object[]{this, qsbVar});
            }
            this.f10166a.getClass();
            return this;
        }

        public c e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f3a148bb", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getRealPxByWidth(600.0f);
            }
            this.f10166a.i = i;
            return this;
        }

        public c f(ftb ftbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("adc8983a", new Object[]{this, ftbVar});
            }
            this.f10166a.m = ftbVar;
            return this;
        }

        public c g(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("7fe47aeb", new Object[]{this, dWVideoScreenType});
            }
            this.f10166a.getClass();
            return this;
        }

        public c h(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("bb11778d", new Object[]{this, jSONObject});
            }
            this.f10166a.n = jSONObject;
            return this;
        }

        public c i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e4ca53da", new Object[]{this, new Boolean(z)});
            }
            this.f10166a.b = z;
            return this;
        }

        public c j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e1b87047", new Object[]{this, new Boolean(z)});
            }
            this.f10166a.g = z;
            return this;
        }

        public c k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("63f6e640", new Object[]{this, str});
            }
            this.f10166a.getClass();
            return this;
        }

        public c l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d4a3f1f6", new Object[]{this, str});
            }
            this.f10166a.e = str;
            return this;
        }

        public c m(utb utbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("4affc8f6", new Object[]{this, utbVar});
            }
            this.f10166a.k = utbVar;
            return this;
        }

        public c n(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("765824ee", new Object[]{this, dWAspectRatio});
            }
            this.f10166a.d = dWAspectRatio;
            return this;
        }

        public c o(ytb ytbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2031c5b2", new Object[]{this, ytbVar});
            }
            this.f10166a.l = ytbVar;
            return this;
        }

        public c p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b9a6332d", new Object[]{this, str});
            }
            this.f10166a.f = str;
            return this;
        }

        public c q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("3917216f", new Object[]{this, str});
            }
            this.f10166a.getClass();
            return this;
        }

        public c r(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9b0f0fc0", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getScreenWidth();
            }
            this.f10166a.h = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Activity f10167a;
        public String c;
        public DWAspectRatio d;
        public String e;
        public String f;
        public int h;
        public int i;
        public utb k;
        public ytb l;
        public ftb m;
        public JSONObject n;
        public boolean b = true;
        public boolean g = true;
        public final DWInstanceType j = DWInstanceType.VIDEO;

        static {
            t2o.a(451936277);
        }

        public d() {
            IpChange ipChange = DWVideoScreenType.$ipChange;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.e$e  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class RunnableC0536e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ftb> f10168a;
        private WeakReference<Bitmap> b;
        public int c;

        static {
            t2o.a(451936278);
        }

        public RunnableC0536e(ftb ftbVar, int i, Bitmap bitmap) {
            this.c = -1;
            this.f10168a = new WeakReference<>(ftbVar);
            this.b = new WeakReference<>(bitmap);
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c == 0 && this.b.get() != null) {
                e eVar = e.this;
                eVar.g = e.c(eVar, this.b.get(), e.b(e.this), e.this.j);
                if (this.f10168a.get() != null) {
                    this.f10168a.get().a(e.this.g);
                }
            } else if (this.c == 1) {
                e eVar2 = e.this;
                eVar2.i = e.d(eVar2, e.b(eVar2), e.this.j);
                if (this.f10168a.get() != null) {
                    this.f10168a.get().g(e.this.i);
                }
            }
        }
    }

    static {
        t2o.a(451936273);
        t2o.a(774897787);
    }

    public e(d dVar) {
        this.d = dVar;
        this.c = dVar.f10167a;
        FrameLayout frameLayout = new FrameLayout(dVar.f10167a);
        this.f10163a = frameLayout;
        this.m = dVar.l;
        this.n = dVar.m;
        m(dVar.n);
        if (!TextUtils.isEmpty(this.f) && this.e == null) {
            this.e = new ImageView(dVar.f10167a);
            PhenixCreator T = s0m.B().N0(dVar.f10167a).T(this.f);
            a aVar = new a();
            b bVar = new b();
            T.failListener(aVar);
            T.succListener(bVar);
            T.into(this.e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            DWAspectRatio dWAspectRatio = dVar.d;
            if (dWAspectRatio != null) {
                if (dWAspectRatio == DWAspectRatio.DW_FIT_CENTER) {
                    this.e.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (dWAspectRatio == DWAspectRatio.DW_CENTER_CROP) {
                    this.e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else if (dWAspectRatio == DWAspectRatio.DW_FIT_X_Y) {
                    this.e.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            this.e.setLayoutParams(layoutParams);
            if (dVar.g) {
                this.e.setOnLongClickListener(this);
            }
            this.e.bringToFront();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            frameLayout.addView(imageView);
        }
    }

    public static /* synthetic */ feh a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("99ee4bd3", new Object[]{eVar});
        }
        return eVar.o;
    }

    public static /* synthetic */ Activity b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("363defd1", new Object[]{eVar});
        }
        return eVar.c;
    }

    public static /* synthetic */ String c(e eVar, Bitmap bitmap, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3afb25a6", new Object[]{eVar, bitmap, context, str});
        }
        return eVar.g(bitmap, context, str);
    }

    public static /* synthetic */ String d(e eVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9298c7c3", new Object[]{eVar, context, str});
        }
        return eVar.i(context, str);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.y();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.e = null;
        }
    }

    public final String g(Bitmap bitmap, Context context, String str) {
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("945ada22", new Object[]{this, bitmap, context, str});
        }
        File file = new File(StorageUtils.getIndividualCacheDirectory(context), "livePhotoCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str + ".jpg");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file2.createNewFile()) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        String absolutePath = file2.getAbsolutePath();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return absolutePath;
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        AVSDKLog.e(this.o, "livePhoto: coverCache file to FileOutputStream failed!");
                        e.printStackTrace();
                        if (fileOutputStream == null) {
                            return "";
                        }
                        try {
                            fileOutputStream.close();
                            return "";
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    AVSDKLog.e(this.o, "livePhoto: coverCache.createNewFile() failed.");
                    return "";
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public ViewGroup k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.f10163a;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.V(z);
        }
    }

    public final void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54a8436", new Object[]{this, jSONObject});
            return;
        }
        this.l = jSONObject;
        if (jSONObject != null) {
            Object opt = jSONObject.opt("photoUrl");
            String str = null;
            this.f = opt == null ? null : String.valueOf(opt);
            Object opt2 = this.l.opt("videoUrl");
            this.h = opt2 == null ? null : String.valueOf(opt2);
            Object opt3 = this.l.opt(VideoControllerManager.KEY_CACHEKEY);
            this.j = opt3 == null ? null : String.valueOf(opt3);
            Object opt4 = this.l.opt("passThroughData");
            if (opt4 != null) {
                String.valueOf(opt4);
            }
            Object opt5 = this.l.opt("videoBytes");
            if (opt5 != null) {
                str = String.valueOf(opt5);
            }
            this.k = str;
        }
    }

    public void n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.M0(f);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (this.b == null) {
            AVSDKLog.e(this.o, "livephoto: mVideoInstance=null when call start, create one new instance.");
            e(this.d);
        }
        if (this.b != null) {
            AVSDKLog.e(this.o, "livephoto: mVideoInstance is not null when call start.");
            this.b.p0(this);
            this.b.O0();
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoClose();
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (!(imageView == null || imageView.getVisibility() == 0)) {
            this.e.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoComplete();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoError(iMediaPlayer, i, i2);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoPause(z);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoPlay();
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoPrepared(iMediaPlayer);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoProgressChanged(i, i2, i3);
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            return;
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoSeekTo(i);
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoStart();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.u();
        }
    }

    public final void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b744b887", new Object[]{this, dVar});
            return;
        }
        DWHighPerformanceInstanceNew.h hVar = new DWHighPerformanceInstanceNew.h(dVar.f10167a);
        hVar.Y("dwLivePhoto");
        if (!TextUtils.isEmpty(this.h)) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "livePhoto:set videourl = " + this.h);
            hVar.f0(this.h);
        }
        if (!TextUtils.isEmpty(this.j)) {
            feh fehVar2 = this.o;
            AVSDKLog.e(fehVar2, "livePhoto:set mCacheKey = " + this.j);
            hVar.i(this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            feh fehVar3 = this.o;
            AVSDKLog.e(fehVar3, "livePhoto:set mVideoBytes = " + this.k);
            hVar.a0(this.k);
        }
        hVar.q(dVar.j);
        hVar.c0(false);
        hVar.d0(dVar.f);
        hVar.g0(dVar.h);
        hVar.t(dVar.i);
        hVar.P(null);
        hVar.v(null);
        if (dVar.c != null) {
            hVar.g("livephoto_" + dVar.c);
        } else {
            hVar.g("livephoto_default");
        }
        hVar.T(null);
        hVar.K(null);
        hVar.m(null);
        hVar.A(dVar.b);
        hVar.G(false);
        hVar.e0(null);
        hVar.L(dVar.e);
        hVar.Z(dVar.d);
        hVar.f(false);
        hVar.J(false);
        hVar.Q(0);
        hVar.V(false);
        if (r65.b == null) {
            r65.b = new b75();
        }
        hVar.j(r65.b);
        hVar.k(new d75());
        hVar.u(new DWNetworkAdapter());
        hVar.v(new z95());
        hVar.o(new k95());
        hVar.H(new v85());
        hVar.p(new z75(dVar.f10167a));
        hVar.X(new y95());
        DWHighPerformanceInstanceNew a2 = hVar.a();
        this.b = a2;
        feh fehVar4 = this.o;
        if (fehVar4 == null) {
            this.o = new feh(toString(), this.b.D());
        } else {
            fehVar4.c(a2.D());
        }
        this.b.p0(this);
        this.f10163a.addView(this.b.K());
        this.e.bringToFront();
    }

    public final String i(Context context, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fac3a4a4", new Object[]{this, context, str});
        }
        File file = new File(StorageUtils.getIndividualCacheDirectory(context), "livePhotoCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str + gov.SUFFIX_MP4);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            File file3 = new File(StorageUtils.getIndividualCacheDirectory(context), str);
            if (!file3.exists()) {
                return "";
            }
            if (file2.exists() || !file2.createNewFile()) {
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(file3);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream2 = fileOutputStream;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    AVSDKLog.e(this.o, "livePhoto: copy video file failed!");
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return "";
                        }
                    }
                    if (fileInputStream == null) {
                        return "";
                    }
                    fileInputStream.close();
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
            String absolutePath = file2.getAbsolutePath();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return absolutePath;
        } catch (IOException e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6768d3f2", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.i)) {
            ftb ftbVar = this.n;
            if (ftbVar != null) {
                ftbVar.g(this.i);
            }
        } else {
            try {
                feh fehVar = this.o;
                AVSDKLog.e(fehVar, "livePhoto: getVideoLocalPath mDWActivity=" + this.c + ", mCacheKey=" + this.j);
                if (this.c == null || TextUtils.isEmpty(this.j)) {
                    AVSDKLog.e(this.o, "livePhoto: getVideoLocalPath failed!");
                    ftb ftbVar2 = this.n;
                    if (ftbVar2 != null) {
                        ftbVar2.g("");
                    }
                } else {
                    dq.b().submit(new RunnableC0536e(this.n, 1, null));
                }
            } catch (Exception unused) {
                AVSDKLog.e(this.o, "livePhoto:write drawble to local failed.");
                ftb ftbVar3 = this.n;
                if (ftbVar3 != null) {
                    ftbVar3.g("");
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Vibrator vibrator;
        VibrationEffect createOneShot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        Activity activity = this.c;
        if (!(activity == null || (vibrator = (Vibrator) activity.getSystemService("vibrator")) == null || !vibrator.hasVibrator())) {
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(200L, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(200L);
            }
        }
        o();
        return true;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c0eb2a", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.g)) {
            ftb ftbVar = this.n;
            if (ftbVar != null) {
                ftbVar.a(this.g);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null) {
                try {
                    imageView.setDrawingCacheEnabled(true);
                    this.e.buildDrawingCache();
                    Bitmap drawingCache = this.e.getDrawingCache();
                    feh fehVar = this.o;
                    AVSDKLog.e(fehVar, "livePhoto:getImgLocalPath bitmap=" + drawingCache + ", mDWActivity=" + this.c + ", mCacheKey=" + this.j);
                    if (drawingCache != null && this.c != null && !TextUtils.isEmpty(this.j)) {
                        dq.b().submit(new RunnableC0536e(this.n, 0, drawingCache));
                    } else if (this.n != null) {
                        AVSDKLog.e(this.o, "livePhoto:getImgLocalPath failed!");
                        this.n.a("");
                    }
                } catch (Exception unused) {
                    AVSDKLog.e(this.o, "livePhoto:write drawble to local failed.");
                    ftb ftbVar2 = this.n;
                    if (ftbVar2 != null) {
                        ftbVar2.a("");
                    }
                }
            }
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        feh fehVar = this.o;
        AVSDKLog.e(fehVar, "livephoto:onvideoinfo=" + j);
        if ((j == 12100 || j == 3) && (imageView = this.e) != null) {
            imageView.setVisibility(4);
        }
        ytb ytbVar = this.m;
        if (ytbVar != null) {
            ytbVar.onVideoInfo(iMediaPlayer, j, j2, j3, obj);
        }
    }
}
