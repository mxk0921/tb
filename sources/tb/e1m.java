package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import tb.ad2;
import tb.amo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e1m extends ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f = false;
    public p1m c;
    public ImageLoader.c d;
    public ImageLoader.e e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f18207a;
        public final /* synthetic */ ImageLoader.c b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ImageLoader.e d;

        public a(h hVar, ImageLoader.c cVar, boolean z, ImageLoader.e eVar) {
            this.f18207a = hVar;
            this.b = cVar;
            this.c = z;
            this.d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h.b(this.f18207a, null);
            h hVar = this.f18207a;
            hVar.f12006a = 1;
            h.c(hVar, e1m.i(e1m.this, this.b, this.c, this.d));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s8d<b1m> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.s8d
        public boolean onHappen(b1m b1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b6cca12", new Object[]{this, b1mVar})).booleanValue();
            }
            tfs.g("image", "cancel download " + b1mVar.getUrl());
            e1m.j(e1m.this, 1);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhenixCreator f18209a;
        public final /* synthetic */ ImageLoader.c b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ ImageLoader.e i;

        public c(PhenixCreator phenixCreator, ImageLoader.c cVar, boolean z, long j, int i, int i2, int i3, boolean z2, ImageLoader.e eVar) {
            this.f18209a = phenixCreator;
            this.b = cVar;
            this.c = z;
            this.d = j;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z2;
            this.i = eVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                ImageStatistics statistics = this.f18209a.getStatistics();
                if (statistics != null) {
                    f = statistics.q() / 1024.0f;
                } else {
                    f = 0.0f;
                }
                e1m.k(e1m.this, this.b, f, this.c, this.d, this.e, this.f, this.g, succPhenixEvent, this.h);
                ImageLoader.e eVar = this.i;
                if (eVar != null) {
                    if (eVar instanceof ImageLoader.d) {
                        if (drawable instanceof cy0) {
                            ((ImageLoader.d) eVar).onImageLoaded(succPhenixEvent.getUrl(), new jy0((cy0) drawable));
                        } else {
                            ((ImageLoader.d) eVar).onImageLoaded(succPhenixEvent.getUrl(), drawable);
                        }
                    } else if (drawable instanceof cy0) {
                        eVar.onImageLoaded(new jy0((cy0) drawable));
                    } else {
                        eVar.onImageLoaded(drawable);
                    }
                }
                succPhenixEvent.getTicket().d(true);
                e1m.l(e1m.this, 0);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageLoader.c f18210a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ ImageLoader.e g;

        public d(ImageLoader.c cVar, boolean z, long j, int i, int i2, int i3, ImageLoader.e eVar) {
            this.f18210a = cVar;
            this.b = z;
            this.c = j;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = eVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            e1m.m(e1m.this, this.f18210a, this.b, this.c, this.d, this.e, this.f, failPhenixEvent);
            ImageLoader.e eVar = this.g;
            if (eVar != null) {
                if (eVar instanceof ImageLoader.d) {
                    ((ImageLoader.d) eVar).onImageLoadFailed(failPhenixEvent.getResultCode());
                } else {
                    eVar.onImageLoadFailed();
                }
            }
            failPhenixEvent.getTicket().d(true);
            e1m.n(e1m.this, 1);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements s8d<dki> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageLoader.e f18211a;

        public e(ImageLoader.e eVar) {
            this.f18211a = eVar;
        }

        /* renamed from: a */
        public boolean onHappen(dki dkiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72d3ebbb", new Object[]{this, dkiVar})).booleanValue();
            }
            ImageLoader.e eVar = this.f18211a;
            if (eVar != null) {
                if (eVar instanceof ImageLoader.d) {
                    ((ImageLoader.d) eVar).onImageLoadFailed(-100);
                } else {
                    eVar.onImageLoadFailed();
                }
            }
            e1m.o(e1m.this, 1);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements qkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18212a;

        static {
            t2o.a(502267928);
            t2o.a(620757102);
        }

        public f a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("ba3d5324", new Object[]{this, str});
            }
            if (str == null || !str.endsWith("END_IMAGE_URL")) {
                this.f18212a = str;
            } else {
                this.f18212a = str.substring(0, str.length() - 13);
            }
            return this;
        }

        @Override // tb.qkd
        public Pair<String, String> getDefaultRetryUrlPair() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("101e44dd", new Object[]{this});
            }
            return null;
        }

        @Override // tb.qkd
        public String getRetryUrl(PhenixCreator phenixCreator, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bd53dee", new Object[]{this, phenixCreator, th});
            }
            if (!(th instanceof HttpCodeResponseException) || ((HttpCodeResponseException) th).getHttpCode() != 404) {
                return null;
            }
            return this.f18212a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502267929);
        }

        public g() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 40891567) {
                return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/PhenixImageLoader$MainFrontHandler");
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue();
            }
            return super.sendMessageAtTime(message, 0L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h extends ImageLoader.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Runnable c;
        public p1m d;

        static {
            t2o.a(502267930);
        }

        public h(e1m e1mVar, ImageLoader imageLoader) {
            super(e1mVar, imageLoader);
        }

        public static /* synthetic */ Runnable b(h hVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("ee12f179", new Object[]{hVar, runnable});
            }
            hVar.c = runnable;
            return runnable;
        }

        public static /* synthetic */ p1m c(h hVar, p1m p1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p1m) ipChange.ipc$dispatch("9f8305a4", new Object[]{hVar, p1mVar});
            }
            hVar.d = p1mVar;
            return p1mVar;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/PhenixImageLoader$PhenixTask");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.f
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else if (this.f12006a != 2) {
                p1m p1mVar = this.d;
                if (p1mVar != null) {
                    p1mVar.a();
                } else {
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                        if (executor instanceof ThreadPoolExecutor) {
                            ((ThreadPoolExecutor) executor).remove(runnable);
                        }
                    }
                }
                this.f12006a = 2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements ad2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502267931);
            t2o.a(620757008);
        }

        public InputStream a(Context context, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("a91437fd", new Object[]{this, context, uri});
            }
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (IOException unused) {
                return null;
            }
        }

        public int b(String str) {
            InputStream a2;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("91a60475", new Object[]{this, str})).intValue();
            }
            if (Build.VERSION.SDK_INT < 24) {
                return 0;
            }
            try {
                a2 = a(Globals.getApplication(), Uri.parse(str));
                if (a2 == null) {
                    a2 = a(Globals.getApplication(), Uri.fromFile(new File(str)));
                }
            } catch (Throwable unused) {
            }
            if (a2 == null) {
                return 0;
            }
            g1m.a();
            int attributeInt = f1m.a(a2).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
            a2.close();
            return i;
        }

        @Override // tb.ad2
        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return "rotate";
        }

        @Override // tb.ad2
        public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
            }
            try {
                int b = b(str);
                if (b != 0) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.setRotate(b);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            return bitmap;
        }
    }

    static {
        t2o.a(502267922);
    }

    public static /* synthetic */ p1m i(e1m e1mVar, ImageLoader.c cVar, boolean z, ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("4daad3d2", new Object[]{e1mVar, cVar, new Boolean(z), eVar});
        }
        return e1mVar.u(cVar, z, eVar);
    }

    public static /* synthetic */ Object ipc$super(e1m e1mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/PhenixImageLoader");
    }

    public static /* synthetic */ int j(e1m e1mVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc94ac3f", new Object[]{e1mVar, new Integer(i2)})).intValue();
        }
        e1mVar.f12002a = i2;
        return i2;
    }

    public static /* synthetic */ void k(e1m e1mVar, ImageLoader.c cVar, float f2, boolean z, long j, int i2, int i3, int i4, SuccPhenixEvent succPhenixEvent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291d1477", new Object[]{e1mVar, cVar, new Float(f2), new Boolean(z), new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), succPhenixEvent, new Boolean(z2)});
        } else {
            e1mVar.x(cVar, f2, z, j, i2, i3, i4, succPhenixEvent, z2);
        }
    }

    public static /* synthetic */ int l(e1m e1mVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aac7a41", new Object[]{e1mVar, new Integer(i2)})).intValue();
        }
        e1mVar.f12002a = i2;
        return i2;
    }

    public static /* synthetic */ void m(e1m e1mVar, ImageLoader.c cVar, boolean z, long j, int i2, int i3, int i4, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb801c13", new Object[]{e1mVar, cVar, new Boolean(z), new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), failPhenixEvent});
        } else {
            e1mVar.w(cVar, z, j, i2, i3, i4, failPhenixEvent);
        }
    }

    public static /* synthetic */ int n(e1m e1mVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8c44843", new Object[]{e1mVar, new Integer(i2)})).intValue();
        }
        e1mVar.f12002a = i2;
        return i2;
    }

    public static /* synthetic */ int o(e1m e1mVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fd02f44", new Object[]{e1mVar, new Integer(i2)})).intValue();
        }
        e1mVar.f12002a = i2;
        return i2;
    }

    public static int t(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b341cae8", new Object[]{succPhenixEvent})).intValue();
        }
        if (succPhenixEvent.isImmediate()) {
            return 2;
        }
        if (succPhenixEvent.isFromDisk()) {
            return 1;
        }
        return 0;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public String b(String str, int i2, int i3, ImageLoader.b bVar) {
        ImageStrategyConfig.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf4bd55", new Object[]{this, str, new Integer(i2), new Integer(i3), bVar});
        }
        if (bVar != null) {
            bVar2 = ImageStrategyConfig.v(bVar.e, bVar.f);
            int i4 = bVar.f12003a;
            if ((i4 & 512) != 0) {
                return ImageStrategyDecider.decideUrl(str, -1, -1, bVar2.a());
            }
            p(i4, bVar2);
            q(bVar.b, bVar2);
            r(bVar.c, bVar2);
        } else {
            bVar2 = ImageStrategyConfig.v("guangguang", 87);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(i3), bVar2.a());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader.f c(ImageLoader.c cVar, ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.f) ipChange.ipc$dispatch("dcd1f2df", new Object[]{this, cVar, eVar});
        }
        return d(cVar, false, eVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader.f d(ImageLoader.c cVar, boolean z, ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.f) ipChange.ipc$dispatch("6ed102b7", new Object[]{this, cVar, new Boolean(z), eVar});
        }
        ImageLoader.b bVar = cVar.g;
        if (bVar == null || !bVar.g) {
            h hVar = new h(this, this);
            hVar.f12006a = 1;
            h.c(hVar, u(cVar, z, eVar));
            return hVar;
        }
        h hVar2 = new h(this, this);
        a aVar = new a(hVar2, cVar, z, eVar);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(aVar);
        h.b(hVar2, aVar);
        return hVar2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public void e(Context context, String str, int i2, int i3, ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cbde9a7", new Object[]{this, context, str, new Integer(i2), new Integer(i3), eVar});
        } else {
            d(new ImageLoader.c(null, context, str, str, i2, i3, ImageLoader.b.a(), false), false, eVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader) ipChange.ipc$dispatch("e1f9308b", new Object[]{this});
        }
        return new e1m();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        ImageLoader.c cVar = this.d;
        if (cVar != null) {
            d(cVar, false, this.e);
        }
    }

    public final void p(int i2, ImageStrategyConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e16a848", new Object[]{this, new Integer(i2), bVar});
        } else if (i2 > 0) {
            if ((2 & i2) != 0) {
                bVar.e(true);
            }
            if ((i2 & 4) != 0) {
                bVar.g(true);
                bVar.f(true);
            }
            if ((i2 & 8) != 0) {
                bVar.c(true);
            }
            if ((i2 & 16) != 0) {
                bVar.c(false);
            }
            if ((i2 & 32) != 0) {
                bVar.d(true);
            }
            if ((i2 & 64) != 0) {
                bVar.d(false);
            }
            if ((i2 & 128) != 0) {
                bVar.b(true);
            }
            if ((i2 & 256) != 0) {
                bVar.b(false);
            }
        }
    }

    public final void r(String str, ImageStrategyConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14af78d3", new Object[]{this, str, bVar});
        }
    }

    public final void s(ImageLoader.c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137244c7", new Object[]{this, cVar, map});
        } else if (cVar != null) {
            ImageLoader.b bVar = cVar.g;
            if (bVar != null && !TextUtils.isEmpty(bVar.j)) {
                map.put("scene", cVar.g.j);
            }
            ImageLoader.b bVar2 = cVar.g;
            if (bVar2 == null || TextUtils.isEmpty(bVar2.i)) {
                o oVar = cVar.f12005a;
                if (oVar != null && oVar.d0() != null && oVar.d0().c0() != null && oVar.d0().c0().r() != null) {
                    map.put("pageName", oVar.d0().c0().r().a());
                    return;
                }
                return;
            }
            map.put("pageName", cVar.g.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.p1m u(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c r27, boolean r28, com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e r29) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e1m.u(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader$c, boolean, com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader$e):tb.p1m");
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2033f4d", new Object[]{this});
        } else if (!f && od0.D().e() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("totalTime");
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("imageWidth");
            arrayList2.add("imageHeight");
            arrayList2.add("mode");
            arrayList2.add("cacheType");
            arrayList2.add(TypedValues.CycleType.S_WAVE_PHASE);
            arrayList2.add("finished");
            arrayList2.add("errorCode");
            arrayList2.add("errorInfo");
            od0.D().e().b("tnode", "imageTime", arrayList, arrayList2, true);
            f = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r7.equals("q60") == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.lang.String r7, com.taobao.tao.image.ImageStrategyConfig.b r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.e1m.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "6f4223bf"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x0085
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case 110222: goto L_0x0059;
                case 110284: goto L_0x004d;
                case 110315: goto L_0x0043;
                case 110351: goto L_0x0037;
                case 110408: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x0064
        L_0x002b:
            java.lang.String r0 = "q90"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r0 = 4
            goto L_0x0064
        L_0x0037:
            java.lang.String r0 = "q75"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            r0 = 3
            goto L_0x0064
        L_0x0043:
            java.lang.String r1 = "q60"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0064
            goto L_0x0029
        L_0x004d:
            java.lang.String r0 = "q50"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0057
            goto L_0x0029
        L_0x0057:
            r0 = 1
            goto L_0x0064
        L_0x0059:
            java.lang.String r0 = "q30"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0063
            goto L_0x0029
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007a;
                case 2: goto L_0x0074;
                case 3: goto L_0x006e;
                case 4: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x0085
        L_0x0068:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r7 = com.taobao.tao.util.TaobaoImageUrlStrategy.ImageQuality.q90
            r8.i(r7)
            goto L_0x0085
        L_0x006e:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r7 = com.taobao.tao.util.TaobaoImageUrlStrategy.ImageQuality.q75
            r8.i(r7)
            goto L_0x0085
        L_0x0074:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r7 = com.taobao.tao.util.TaobaoImageUrlStrategy.ImageQuality.q60
            r8.i(r7)
            goto L_0x0085
        L_0x007a:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r7 = com.taobao.tao.util.TaobaoImageUrlStrategy.ImageQuality.q50
            r8.i(r7)
            goto L_0x0085
        L_0x0080:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r7 = com.taobao.tao.util.TaobaoImageUrlStrategy.ImageQuality.q30
            r8.i(r7)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e1m.q(java.lang.String, com.taobao.tao.image.ImageStrategyConfig$b):void");
    }

    public final void w(ImageLoader.c cVar, boolean z, long j, int i2, int i3, int i4, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac0b039", new Object[]{this, cVar, new Boolean(z), new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), failPhenixEvent});
            return;
        }
        if (z) {
            if (od0.D().e() != null) {
                HashMap hashMap = new HashMap();
                double currentTimeMillis = System.currentTimeMillis() - j;
                hashMap.put("totalTime", Double.valueOf(currentTimeMillis));
                hashMap.put("time", Double.valueOf(currentTimeMillis));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("imageWidth", String.valueOf(i2));
                hashMap2.put("imageHeight", String.valueOf(i3));
                hashMap2.put("mode", String.valueOf(i4));
                hashMap2.put("errorCode", String.valueOf(failPhenixEvent.getResultCode()));
                hashMap2.put("errorInfo", String.valueOf(failPhenixEvent.getResultCode()));
                hashMap2.put(TypedValues.CycleType.S_WAVE_PHASE, amo.c.POINT_NAME);
                od0.D().e().a("tnode", "imageTime", hashMap, hashMap2);
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("imageWidth", String.valueOf(i2));
            hashMap3.put("imageHeight", String.valueOf(i3));
            hashMap3.put("mode", String.valueOf(i4));
            hashMap3.put("errorCode", String.valueOf(failPhenixEvent.getResultCode()));
            hashMap3.put("errorInfo", String.valueOf(failPhenixEvent.getResultCode()));
            hashMap3.put(TypedValues.CycleType.S_WAVE_PHASE, amo.c.POINT_NAME);
            hashMap3.put("bizName", "guangguang");
            hashMap3.put("downloadUrl", failPhenixEvent.getUrl());
            s(cVar, hashMap3);
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            hashMap3.put("totalTime", Long.valueOf(currentTimeMillis2));
            hashMap3.put("time", Long.valueOf(currentTimeMillis2));
            l.h(cVar.f12005a, hashMap3);
        }
        tfs.g("image", "download image failed, url:" + failPhenixEvent.getUrl() + " resultCode:" + failPhenixEvent.getResultCode() + " time:" + (System.currentTimeMillis() - j));
    }

    public final void x(ImageLoader.c cVar, float f2, boolean z, long j, int i2, int i3, int i4, SuccPhenixEvent succPhenixEvent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbab3572", new Object[]{this, cVar, new Float(f2), new Boolean(z), new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), succPhenixEvent, new Boolean(z2)});
            return;
        }
        if (z) {
            if (od0.D().e() != null) {
                HashMap hashMap = new HashMap();
                double currentTimeMillis = System.currentTimeMillis() - j;
                hashMap.put("totalTime", Double.valueOf(currentTimeMillis));
                hashMap.put("time", Double.valueOf(currentTimeMillis));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("imageWidth", String.valueOf(i2));
                hashMap2.put("imageHeight", String.valueOf(i3));
                hashMap2.put("mode", String.valueOf(i4));
                hashMap2.put("cacheType", String.valueOf(t(succPhenixEvent)));
                hashMap2.put("finished", "1");
                hashMap2.put(TypedValues.CycleType.S_WAVE_PHASE, amo.c.POINT_NAME);
                od0.D().e().a("tnode", "imageTime", hashMap, hashMap2);
            }
            if (f2 > 0.0f) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("imageWidth", String.valueOf(i2));
                hashMap3.put("imageHeight", String.valueOf(i3));
                hashMap3.put("mode", String.valueOf(i4));
                hashMap3.put("cacheType", String.valueOf(t(succPhenixEvent)));
                hashMap3.put("finished", "1");
                hashMap3.put(TypedValues.CycleType.S_WAVE_PHASE, amo.c.POINT_NAME);
                hashMap3.put("bizName", "guangguang");
                hashMap3.put("downloadUrl", succPhenixEvent.getUrl());
                hashMap3.put("fileSize", Float.valueOf(f2));
                s(cVar, hashMap3);
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                hashMap3.put("totalTime", Long.valueOf(currentTimeMillis2));
                hashMap3.put("time", Long.valueOf(currentTimeMillis2));
                l.h(cVar.f12005a, hashMap3);
            }
        }
        tfs.g("image", "download image succeed, url:" + succPhenixEvent.getUrl() + " type:" + t(succPhenixEvent) + " time:" + (System.currentTimeMillis() - j) + " size：" + f2 + " cache: " + succPhenixEvent.isImmediate() + "preload:" + z2);
    }
}
