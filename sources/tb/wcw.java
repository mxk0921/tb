package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.MediaExporter;
import com.alibaba.marvel.java.AudioConfiguration;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.OnProgressListener;
import com.alibaba.marvel.java.VideoConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30618a = new Handler(Looper.getMainLooper());
    public MediaExporter b;
    public Project c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mbe f30619a;

        /* compiled from: Taobao */
        /* renamed from: tb.wcw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1086a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30620a;

            public RunnableC1086a(String str) {
                this.f30620a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((cyw) a.this.f30619a).D(this.f30620a);
                }
            }
        }

        public a(mbe mbeVar) {
            this.f30619a = mbeVar;
        }

        public void onError(String str, String str2, int i, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
                return;
            }
            new StringBuilder("errorInfo ").append(str3);
            wcw.a(wcw.this).post(new RunnableC1086a(str3));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements OnCompleteListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mbe f30621a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                b bVar = b.this;
                ((cyw) bVar.f30621a).F(bVar.b);
            }
        }

        public b(mbe mbeVar, String str) {
            this.f30621a = mbeVar;
            this.b = str;
        }

        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                wcw.a(wcw.this).post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements OnProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mbe f30623a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float f30624a;

            public a(float f) {
                this.f30624a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((cyw) c.this.f30623a).E((int) (this.f30624a * 100.0f));
                }
            }
        }

        public c(mbe mbeVar) {
            this.f30623a = mbeVar;
        }

        public void onProgress(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                return;
            }
            new StringBuilder("progress = ").append(f);
            wcw.a(wcw.this).post(new a(f));
        }
    }

    static {
        t2o.a(793772100);
    }

    public static /* synthetic */ Handler a(wcw wcwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("af7e5160", new Object[]{wcwVar});
        }
        return wcwVar.f30618a;
    }

    public final void b(Context context, String str, String str2, Bitmap bitmap, String str3, String str4, Map<String, String> map, boolean z, int i, int i2, MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4620a492", new Object[]{this, context, str, str2, bitmap, str3, str4, map, new Boolean(z), new Integer(i), new Integer(i2), meEditor});
            return;
        }
        String addMainClip = meEditor.addMainClip(str, 0L, -1L);
        long clipEndTimeUs = meEditor.getClipEndTimeUs(addMainClip);
        int b2 = tgw.b(i, i2);
        String addStickerClip = meEditor.addStickerClip("", txw.c(context, str2, str4, z), 0L, clipEndTimeUs);
        meEditor.setScale(addStickerClip, lfw.h(b2, map.get(cyw.RATIO_SCALE_MAP_KEY)));
        float[] g = lfw.g(b2, map.get(cyw.RATIO_POSITION_MAP_KEY));
        float[] f = lfw.f(b2, map.get(cyw.RATIO_ANCHOR_MAP_KEY));
        meEditor.setPosition(addStickerClip, g[0], g[1]);
        meEditor.setAnchor(addStickerClip, f[0], f[1]);
        if (!z) {
            meEditor.addMainClip(txw.a(context, str2, i, i2), 0L, 2000000L);
            meEditor.setTransitionEffect(addMainClip, str4 + "/marvel_watermark_gg/material.json", "overlay");
            meEditor.setTransitionDurationUs(addMainClip, 400000L);
            String addStickerClip2 = meEditor.addStickerClip("", txw.d(context, str2, bitmap), clipEndTimeUs, 2000000L);
            meEditor.setPosition(addStickerClip2, 0.0f, lfw.b(b2));
            meEditor.setScale(addStickerClip2, lfw.c(b2));
            String addStickerClip3 = meEditor.addStickerClip("", txw.f(context, str2, str3, str4), clipEndTimeUs, 2000000L);
            meEditor.setAnchor(addStickerClip3, 0.0f, 0.5f);
            meEditor.setPosition(addStickerClip3, 0.0f, lfw.k(b2));
            meEditor.setScale(addStickerClip3, lfw.l(b2));
            String addStickerClip4 = meEditor.addStickerClip("", str4 + "/marvel_watermark_gg/bottom_logo.png", clipEndTimeUs, 2000000L);
            meEditor.setAnchor(addStickerClip4, 0.0f, 0.5f);
            meEditor.setPosition(addStickerClip4, 0.0f, lfw.d(b2));
            meEditor.setScale(addStickerClip4, lfw.e(b2));
            String addStickerClip5 = meEditor.addStickerClip("", str4 + "/marvel_watermark_gg/icon.png", clipEndTimeUs, 2000000L);
            meEditor.setAnchor(addStickerClip5, 0.0f, 0.5f);
            meEditor.setPosition(addStickerClip5, 0.0f, lfw.i(b2));
            meEditor.setScale(addStickerClip5, lfw.j(b2));
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        MediaExporter mediaExporter = this.b;
        if (mediaExporter != null) {
            mediaExporter.cancel();
        }
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Project project = this.c;
        if (project != null) {
            project.destroy();
        }
    }

    public final void e(Project project, Context context, String str, int i, int i2, mbe mbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573b8fd9", new Object[]{this, project, context, str, new Integer(i), new Integer(i2), mbeVar});
            return;
        }
        String f = yxw.f(context, str);
        MediaExporter f2 = f(f, i, i2);
        this.b = f2;
        f2.setOnErrorListener(new a(mbeVar));
        this.b.setOnCompleteListener(new b(mbeVar, f));
        this.b.setOnProgressListener(new c(mbeVar));
        project.export(this.b);
    }

    public final MediaExporter f(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaExporter) ipChange.ipc$dispatch("88367c82", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        return new MediaExporter.Builder().setAudioConfig(new AudioConfiguration.Builder().setBps(131072).setFrequency(44100).setChannel(AudioConfiguration.ChannelType.CHANNEL_IN_STEREO).build()).setVideoConfig(new VideoConfiguration.Builder().setFps(23).setSize(i, i2).setBps(3200).build()).setOutputPath(str).setSyncPrepare(true).build();
    }

    public synchronized void g(Context context, String str, String str2, Bitmap bitmap, String str3, String str4, Map<String, String> map, boolean z, mbe mbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8786dc2", new Object[]{this, context, str, str2, bitmap, str3, str4, map, new Boolean(z), mbeVar});
            return;
        }
        if (!Marvel.isInit()) {
            Marvel.initSDK(Globals.getApplication());
        }
        Project createProject = Marvel.createProject();
        this.c = createProject;
        String createResourceIfNeeded = createProject.getMeEditor().createResourceIfNeeded(str, "resMedia");
        int resWidth = this.c.getMeEditor().getResWidth(createResourceIfNeeded);
        int resHeight = this.c.getMeEditor().getResHeight(createResourceIfNeeded);
        this.c.getMeEditor().setCanvasSize(resWidth, resHeight);
        b(context, str, str2, bitmap, str3, str4, map, z, resWidth, resHeight, this.c.getMeEditor());
        e(this.c, context, str2, resWidth, resHeight, mbeVar);
    }
}
