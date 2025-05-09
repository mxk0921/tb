package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.exporter.MediaExporter;
import com.alibaba.marvel.java.AudioConfiguration;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.OnProgressListener;
import com.alibaba.marvel.java.VideoConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f33083a;
    public final List<Exporter> b = new ArrayList();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ImageExporter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbe f33084a;

        /* compiled from: Taobao */
        /* renamed from: tb.zxw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC1119a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f33085a;

            public RunnableC1119a(String str) {
                this.f33085a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.f33084a.e(this.f33085a);
                }
            }
        }

        public a(nbe nbeVar) {
            this.f33084a = nbeVar;
        }

        public void a(long j, int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d61e62", new Object[]{this, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), byteBuffer});
                return;
            }
            AdapterForTLog.loge("VideoWaterMask", "onFrame, width = " + i3 + ", height = " + i4);
            if (!zxw.a(zxw.this)) {
                this.f33084a.d("context is invalid in callback");
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            zxw.c(zxw.this).post(new RunnableC1119a(ayw.e(zxw.b(zxw.this), createBitmap)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbe f33086a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f33087a;

            public a(String str) {
                this.f33087a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (zxw.a(zxw.this)) {
                    Toast.makeText(zxw.b(zxw.this), zxw.b(zxw.this).getString(R.string.save_fail), 1).show();
                    b.this.f33086a.d(this.f33087a);
                }
            }
        }

        public b(nbe nbeVar) {
            this.f33086a = nbeVar;
        }

        public void onError(String str, String str2, int i, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
                return;
            }
            AdapterForTLog.loge("VideoWaterMask", "errorInfo " + str3);
            zxw.c(zxw.this).post(new a(str3));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements OnProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbe f33088a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float f33089a;

            public a(float f) {
                this.f33089a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.this.f33088a.f((int) (this.f33089a * 100.0f));
                }
            }
        }

        public c(nbe nbeVar) {
            this.f33088a = nbeVar;
        }

        public void onProgress(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                return;
            }
            AdapterForTLog.loge("VideoWaterMask", "progress = " + f);
            zxw.c(zxw.this).post(new a(f));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements OnCompleteListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f33090a;
        public final /* synthetic */ nbe b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f33091a;

            public a(String str) {
                this.f33091a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (zxw.a(zxw.this)) {
                    Toast.makeText(zxw.b(zxw.this), zxw.b(zxw.this).getString(R.string.save_success), 1).show();
                    d.this.b.e(this.f33091a);
                }
            }
        }

        public d(String str, nbe nbeVar) {
            this.f33090a = str;
            this.b = nbeVar;
        }

        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            String b = ayw.b(zxw.b(zxw.this), this.f33090a);
            AdapterForTLog.loge("VideoWaterMask", "onComplete, outputPath = " + b);
            zxw.c(zxw.this).post(new a(b));
        }
    }

    static {
        t2o.a(732954636);
    }

    public zxw(Context context) {
        this.f33083a = context;
    }

    public static /* synthetic */ boolean a(zxw zxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a077aa", new Object[]{zxwVar})).booleanValue();
        }
        return zxwVar.l();
    }

    public static /* synthetic */ Context b(zxw zxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9298431f", new Object[]{zxwVar});
        }
        return zxwVar.f33083a;
    }

    public static /* synthetic */ Handler c(zxw zxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4c60431e", new Object[]{zxwVar});
        }
        return zxwVar.c;
    }

    public final void d(MeEditor meEditor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d5146f", new Object[]{this, meEditor, str, str2});
            return;
        }
        String addMainClip = meEditor.addMainClip(str, 0L, -1L);
        AdapterForTLog.loge("VideoWaterMask", "clipId = " + addMainClip);
        String addPipClip = meEditor.addPipClip("", str2, 0L, 0L, -1L);
        meEditor.setScale(addPipClip, 0.321f);
        meEditor.setPosition(addPipClip, 0.473f, 0.466f);
        meEditor.setAnchor(addPipClip, 0.5f, 0.5f);
    }

    public final void e(Exporter exporter, String str, nbe nbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83036d00", new Object[]{this, exporter, str, nbeVar});
        } else if (nbeVar != null) {
            exporter.setOnErrorListener(new b(nbeVar));
            exporter.setOnProgressListener(new c(nbeVar));
            exporter.setOnCompleteListener(new d(str, nbeVar));
        }
    }

    public final void f(MeEditor meEditor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a387bd4f", new Object[]{this, meEditor, str, str2});
            return;
        }
        String addStickerClip = meEditor.addStickerClip("", str2, 0L, meEditor.getClipEndTimeUs(meEditor.addMainClip(str, 0L, -1L)));
        meEditor.setScale(addStickerClip, 0.321f);
        meEditor.setPosition(addStickerClip, 0.473f, 0.466f);
        meEditor.setAnchor(addStickerClip, 0.5f, 0.5f);
    }

    public final ImageExporter g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageExporter) ipChange.ipc$dispatch("65ae4429", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ImageExporter imageExporter = new ImageExporter();
        imageExporter.setWidth(i);
        imageExporter.setHeight(i2);
        return imageExporter;
    }

    public final MediaExporter h(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaExporter) ipChange.ipc$dispatch("4510f26a", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        return new MediaExporter.Builder().setAudioConfig(new AudioConfiguration.Builder().setBps(131072).setFrequency(44100).setChannel(AudioConfiguration.ChannelType.CHANNEL_IN_STEREO).build()).setVideoConfig(new VideoConfiguration.Builder().setFps(23).setSize(i, i2).setBps(3200).build()).setOutputPath(str).setSyncPrepare(true).build();
    }

    public synchronized void i(String str, String str2, int i, int i2, nbe nbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebb2d50", new Object[]{this, str, str2, new Integer(i), new Integer(i2), nbeVar});
            return;
        }
        AdapterForTLog.loge("VideoWaterMask", "doImageExport,imagePath:" + str + ", width:" + i + ", height:" + i2);
        if (l() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Project k = k();
            k.getMeEditor().setCanvasSize(i, i2);
            d(k.getMeEditor(), str, str2);
            ImageExporter g = g(i, i2);
            ((ArrayList) this.b).add(g);
            g.setBitmapListener(new a(nbeVar));
            k.export(g);
            return;
        }
        nbeVar.d("params is invalid, imagePath = " + str + ", mediaWidth = " + i + ", mediaHeight = " + i2);
    }

    public synchronized void j(String str, String str2, nbe nbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f39e6d0", new Object[]{this, str, str2, nbeVar});
            return;
        }
        AdapterForTLog.loge("VideoWaterMask", "doVideoExport, videoPath = " + str + ", waterMaskPath = " + str2);
        if (l() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Project k = k();
            String createResourceIfNeeded = k.getMeEditor().createResourceIfNeeded(str, "resMedia");
            int resWidth = k.getMeEditor().getResWidth(createResourceIfNeeded);
            int resHeight = k.getMeEditor().getResHeight(createResourceIfNeeded);
            k.getMeEditor().setCanvasSize(resWidth, resHeight);
            f(k.getMeEditor(), str, str2);
            String str3 = this.f33083a.getFilesDir().getPath() + File.separator + Login.getUserId() + "_" + System.currentTimeMillis() + gov.SUFFIX_MP4;
            MediaExporter h = h(str3, resWidth, resHeight);
            ((ArrayList) this.b).add(h);
            e(h, str3, nbeVar);
            k.export(h);
        }
    }

    public final Project k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("aaeb180b", new Object[]{this});
        }
        if (!Marvel.isInit()) {
            Marvel.initSDK(Globals.getApplication());
        }
        return Marvel.createProject();
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e552e2", new Object[]{this})).booleanValue();
        }
        Context context = this.f33083a;
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return false;
        }
        return true;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c111327", new Object[]{this});
            return;
        }
        this.f33083a = null;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((Exporter) it.next()).cancel();
        }
    }
}
