package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import io.unicorn.plugin.image.ExternalAdapterImageBridge;
import io.unicorn.plugin.image.ExternalAdapterImageProvider;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bs0 implements ExternalAdapterImageProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_DISK = 2;
    public static final int TYPE_MEMORY = 1;
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final ExecutorService c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final double f16587a = Resources.getSystem().getDisplayMetrics().density;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ExecutorService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
            }
            f9x.a(false);
            return false;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d0aab466", new Object[]{this, collection});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("8c2ecc66", new Object[]{this, collection});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue();
            }
            f9x.a(false);
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
            }
            f9x.a(false);
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            } else {
                f9x.a(false);
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e74164f2", new Object[]{this, collection, new Long(j), timeUnit});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("9962f5f2", new Object[]{this, collection, new Long(j), timeUnit});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t});
            }
            f9x.a(false);
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable});
            }
            FutureTask futureTask = new FutureTask(runnable, null);
            futureTask.run();
            return futureTask;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f16588a;

        public b(long j) {
            this.f16588a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ExternalAdapterImageBridge.dispatchAsyncRequest(this.f16588a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f16589a;
        public final /* synthetic */ PhenixCreator b;

        public c(e eVar, PhenixCreator phenixCreator) {
            this.f16589a = eVar;
            this.b = phenixCreator;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f16589a.k(this.b.fetch());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements ExternalAdapterImageProvider.AnimatedBitmap, Drawable.Callback, fy0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cy0 f16590a;
        public final Bitmap b;
        public e c;
        public final Canvas d;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public int i = 0;
        public boolean e = true;

        static {
            t2o.a(980418568);
            t2o.a(945815785);
            t2o.a(620757004);
        }

        public d(cy0 cy0Var) {
            this.f16590a = cy0Var;
            int intrinsicWidth = cy0Var.getIntrinsicWidth();
            int intrinsicHeight = cy0Var.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            this.b = createBitmap;
            Canvas canvas = new Canvas();
            this.d = canvas;
            canvas.setBitmap(createBitmap);
            cy0Var.setBounds(new Rect(0, 0, intrinsicWidth, intrinsicHeight));
            cy0Var.setCallback(this);
            cy0Var.A(this);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da1f5c02", new Object[]{this, new Integer(i)});
            } else {
                this.i = i;
            }
        }

        public void b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4628ae9", new Object[]{this, eVar});
            } else {
                this.c = eVar;
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public Bitmap getBufferBitmap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("df73b8ea", new Object[]{this});
            }
            return this.b;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public double getDuration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed837a7f", new Object[]{this})).doubleValue();
            }
            return this.f16590a.q() / 1000.0f;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public int getFrameCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue();
            }
            return this.f16590a.r();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
                return;
            }
            this.b.eraseColor(0);
            drawable.draw(this.d);
            if (this.e) {
                this.e = false;
                return;
            }
            ExternalAdapterImageProvider.Image image = new ExternalAdapterImageProvider.Image(this.b, this.f);
            image.setCacheType(this.i);
            e eVar = this.c;
            if (eVar != null) {
                eVar.e(image);
            }
        }

        @Override // tb.fy0
        public boolean onLoopCompleted(int i, int i2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i2 == 0) {
                z = true;
            }
            this.h = z;
            if (i2 == 0) {
                this.f16590a.A(null);
                return true;
            }
            if (i2 > 0 && i >= i2) {
                this.f = true;
            }
            return true;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void pause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            } else if (this.h && !this.g) {
                this.g = true;
                this.f16590a.z(false);
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void resume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            } else if (this.h && this.g) {
                this.g = false;
                this.f16590a.C();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
            } else {
                bs0.a().postAtTime(runnable, j);
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                this.f16590a.C();
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.f16590a.D();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
            } else {
                bs0.a().removeCallbacks(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements ExternalAdapterImageProvider.Request {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public WeakReference<p1m> b;
        public final ExternalAdapterImageProvider.Response c;
        public final String d;
        public String e;
        public final Map<String, String> f;
        public final Map<String, String> g;
        public boolean h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f16591a = false;
        public boolean i = false;

        static {
            t2o.a(980418569);
            t2o.a(945815787);
        }

        public e(bs0 bs0Var, String str, String str2, Map<String, String> map, ExternalAdapterImageProvider.Response response, Map<String, String> map2) {
            this.e = str;
            this.d = str2;
            this.f = map;
            this.c = response;
            this.g = map2;
        }

        public static /* synthetic */ Map a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fa4c1f42", new Object[]{eVar});
            }
            return eVar.f;
        }

        public static /* synthetic */ boolean b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("21e3fc53", new Object[]{eVar})).booleanValue();
            }
            return eVar.h;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5472669", new Object[]{this})).booleanValue();
            }
            return true ^ this.d.equals(this.e);
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.Request
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            this.f16591a = true;
            WeakReference<p1m> weakReference = this.b;
            if (weakReference != null) {
                p1m p1mVar = weakReference.get();
                if (p1mVar != null) {
                    p1mVar.a();
                }
                this.b = null;
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69eb3be5", new Object[]{this});
            } else {
                this.e = this.d;
            }
        }

        public void e(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1be5dba", new Object[]{this, image});
                return;
            }
            if (!this.i) {
                this.i = true;
            }
            this.c.finish(image);
        }

        public Map<String, String> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2c8abaa4", new Object[]{this});
            }
            return this.f;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
            }
            return this.d;
        }

        public Map<String, String> h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("367605c", new Object[]{this});
            }
            return this.g;
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.e;
        }

        public void j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9be3d4b9", new Object[]{this, new Boolean(z)});
            } else {
                this.h = z;
            }
        }

        public void k(p1m p1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ebeabc4", new Object[]{this, p1mVar});
            } else if (!this.f16591a) {
                this.b = new WeakReference<>(p1mVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<e> f16592a;
        public final WeakReference<bs0> b;

        static {
            t2o.a(980418570);
            t2o.a(620757101);
        }

        public f(e eVar, bs0 bs0Var) {
            this.f16592a = new WeakReference<>(eVar);
            this.b = new WeakReference<>(bs0Var);
        }

        public final void b(int i, String str, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6c4cc60", new Object[]{this, new Integer(i), str, eVar});
            } else if (eVar != null) {
                try {
                    String str2 = eVar.h().get("instance_id");
                    if (!TextUtils.isEmpty(str2)) {
                        int parseInt = Integer.parseInt(str2);
                        int i2 = WeexErrorType.IMAGE_ERROR.errCode;
                        WeexPlatformCommonBridge.reportExceptionInnerInfo(parseInt, i2, "IMG_" + i, str);
                    }
                } catch (Exception unused) {
                    dwh.e("image report exception");
                }
            }
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            e eVar = this.f16592a.get();
            if (eVar != null) {
                String b = bs0.b(bs0.this, e.a(eVar));
                TLog.loge(b, "onHappen/Failed", "[AliCDN] Request finish failed." + eVar.i());
                bs0 bs0Var = this.b.get();
                if (bs0Var == null || !eVar.c()) {
                    b(failPhenixEvent.getResultCode(), eVar.i(), eVar);
                    eVar.e(null);
                } else if (e.b(eVar)) {
                    bs0Var.e(eVar.i(), eVar.f(), eVar);
                    return false;
                } else {
                    eVar.d();
                    bs0Var.e(eVar.g(), eVar.f(), eVar);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<e> f16593a;
        public final String b;

        static {
            t2o.a(980418571);
            t2o.a(620757101);
        }

        public g(bs0 bs0Var, e eVar, String str) {
            this.f16593a = new WeakReference<>(eVar);
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String str = "WeexImgEnd#" + this.b;
            u8x.a(str);
            try {
                e eVar = this.f16593a.get();
                if (eVar != null) {
                    ExternalAdapterImageProvider.Image image = null;
                    if (succPhenixEvent == null) {
                        eVar.e(null);
                        return false;
                    } else if (succPhenixEvent.isIntermediate()) {
                        return false;
                    } else {
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        if (drawable != null) {
                            if (drawable instanceof cy0) {
                                d dVar = new d((cy0) drawable);
                                dVar.b(eVar);
                                if (succPhenixEvent.isImmediate()) {
                                    dVar.a(1);
                                } else if (succPhenixEvent.isFromDisk()) {
                                    dVar.a(2);
                                }
                                image = new ExternalAdapterImageProvider.Image(dVar);
                            } else {
                                if (drawable instanceof uwn) {
                                    ((uwn) drawable).l();
                                }
                                Bitmap bitmap = drawable.getBitmap();
                                if (bitmap != null) {
                                    image = new ExternalAdapterImageProvider.Image(bitmap);
                                }
                            }
                        }
                        if (image != null) {
                            if (succPhenixEvent.isImmediate()) {
                                u8x.a("WeexImg#Mem");
                                image.setCacheType(1);
                                u8x.b("WeexImg#Mem");
                            } else if (succPhenixEvent.isFromDisk()) {
                                u8x.a("WeexImg#Disk");
                                image.setCacheType(2);
                                u8x.b("WeexImg#Disk");
                            }
                        }
                        eVar.e(image);
                    }
                }
                return false;
            } finally {
                u8x.b(str);
            }
        }
    }

    static {
        t2o.a(980418564);
        t2o.a(945815784);
    }

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1554edef", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ String b(bs0 bs0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adbf2f96", new Object[]{bs0Var, map});
        }
        return bs0Var.d(map);
    }

    public final String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edd25735", new Object[]{this, map});
        }
        if (map != null) {
            return map.get("engine_id");
        }
        return "unknown";
    }

    public final String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d49677f4", new Object[]{this, map});
        }
        return "Weex/AlicdnImageProvider/" + c(map);
    }

    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    public void dispatchAsyncThread(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e007fd1", new Object[]{this, new Long(j)});
        } else {
            drt.a(new b(j));
        }
    }

    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        TLog.loge("Weex/AlicdnImageProvider/", "AlicdnImageProvider", "[AliCDN] log. %s" + str);
    }

    public void e(String str, Map<String, String> map, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c386ba82", new Object[]{this, str, map, eVar});
            return;
        }
        String d2 = d(map);
        TLog.loge(d2, "onHappen/retryRequest", "[AliCDN] retryRequest. " + str);
        PhenixCreator releasableDrawable = s0m.B().T(str).releasableDrawable(false);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                releasableDrawable.addLoaderExtra(entry.getKey(), entry.getValue());
            }
        }
        releasableDrawable.succListener(new g(this, eVar, str));
        releasableDrawable.failListener(new f(eVar, null));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(eVar, releasableDrawable));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c  */
    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.unicorn.plugin.image.ExternalAdapterImageProvider.Request request(java.lang.String r20, int r21, int r22, java.util.Map<java.lang.String, java.lang.String> r23, java.util.Map<java.lang.String, java.lang.String> r24, io.unicorn.plugin.image.ExternalAdapterImageProvider.Response r25) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bs0.request(java.lang.String, int, int, java.util.Map, java.util.Map, io.unicorn.plugin.image.ExternalAdapterImageProvider$Response):io.unicorn.plugin.image.ExternalAdapterImageProvider$Request");
    }
}
