package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.gme;
import tb.iw0;
import tb.n7a;
import tb.nh4;
import tb.o3s;
import tb.p8o;
import tb.q0h;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.uvd;
import tb.v2s;
import tb.z0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DoubleClickFavView2 extends View implements z0c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_DP = 60;
    private static final String TAG = "DoubleClickFavView";
    private int count;
    private final int heightLike;
    private int index;
    private ArrayList<Drawable> mBitmapDrawables;
    private ArrayList<Drawable> mDefaultDrawables;
    private final Handler mHandler;
    private boolean mHasExecute;
    private float mMaxRatio;
    private final List<e> mPointFavs;
    private final Runnable mRunnable;
    private volatile boolean mUseDefault;
    private final int maxHeight;
    private final int maxWidth;
    private final int minHeight;
    private final int minWidth;
    private final Paint outlinePaint;
    private Drawable userHeadDrawable;
    private final int widthLike;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            Iterator it = new ArrayList(DoubleClickFavView2.access$000(DoubleClickFavView2.this)).iterator();
            while (it.hasNext()) {
                ((e) it.next()).a();
            }
            DoubleClickFavView2.this.invalidate();
            DoubleClickFavView2.access$200(DoubleClickFavView2.this).removeCallbacks(DoubleClickFavView2.access$100(DoubleClickFavView2.this));
            if (!DoubleClickFavView2.access$000(DoubleClickFavView2.this).isEmpty()) {
                DoubleClickFavView2.access$200(DoubleClickFavView2.this).postDelayed(DoubleClickFavView2.access$100(DoubleClickFavView2.this), 16L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            } else {
                o3s.b(DoubleClickFavView2.TAG, "user head drawable download fail");
            }
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            DoubleClickFavView2 doubleClickFavView2 = DoubleClickFavView2.this;
            DoubleClickFavView2.access$302(doubleClickFavView2, DoubleClickFavView2.access$400(doubleClickFavView2, (BitmapDrawable) obj));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AsyncTask<Object, Object, ArrayList<Drawable>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f8390a;

        static {
            t2o.a(295698500);
        }

        public c(Context context) {
            this.f8390a = new WeakReference<>(context);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/doubleclickfav/DoubleClickFavView2$CreateDrawableAsyncTask");
        }

        /* renamed from: a */
        public ArrayList<Drawable> doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("48bbe306", new Object[]{this, objArr});
            }
            if (this.f8390a.get() != null) {
                return DoubleClickFavView2.access$1400();
            }
            return new ArrayList<>();
        }

        /* renamed from: b */
        public void onPostExecute(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb2ec0ed", new Object[]{this, arrayList});
                return;
            }
            if (DoubleClickFavView2.access$1500(DoubleClickFavView2.this)) {
                DoubleClickFavView2.access$1602(DoubleClickFavView2.this, arrayList);
                DoubleClickFavView2.access$900(DoubleClickFavView2.this).clear();
                DoubleClickFavView2.access$900(DoubleClickFavView2.this).addAll(DoubleClickFavView2.access$1600(DoubleClickFavView2.this));
            }
            DoubleClickFavView2.access$1702(DoubleClickFavView2.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<Drawable> f8391a;
        public final CountDownLatch b;

        static {
            t2o.a(295698501);
            t2o.a(620757101);
        }

        public d(ArrayList<Drawable> arrayList, CountDownLatch countDownLatch) {
            this.f8391a = arrayList;
            this.b = countDownLatch;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(this.f8391a == null || succPhenixEvent == null || succPhenixEvent.getDrawable() == null)) {
                this.f8391a.add(succPhenixEvent.getDrawable());
            }
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final PointF f8392a;
        public final long b = System.currentTimeMillis();
        public final int c;
        public final int[] d;
        public final float e;
        public final float[] f;
        public final float[] g;
        public final int[] h;
        public final int[] i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public final int o;

        static {
            t2o.a(295698502);
        }

        public e(int i, int i2, PointF pointF) {
            this.f8392a = pointF;
            this.c = i;
            this.d = new int[i];
            this.f = new float[i];
            this.g = new float[i];
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            int[] iArr4 = new int[i];
            int[] iArr5 = new int[i];
            this.h = new int[i];
            this.i = new int[i];
            Random random = new Random();
            this.e = random.nextInt(40) - 20;
            for (int i3 = 0; i3 < this.c; i3++) {
                this.d[i3] = random.nextInt(i2) % i2;
                this.f[i3] = random.nextInt(20) - 10;
                this.g[i3] = (110.0f - random.nextInt(20)) / 100.0f;
                this.h[i3] = DoubleClickFavView2.access$500(DoubleClickFavView2.this) + random.nextInt(DoubleClickFavView2.access$600(DoubleClickFavView2.this) - DoubleClickFavView2.access$500(DoubleClickFavView2.this));
                this.i[i3] = DoubleClickFavView2.access$700(DoubleClickFavView2.this) + random.nextInt(DoubleClickFavView2.access$800(DoubleClickFavView2.this) - DoubleClickFavView2.access$700(DoubleClickFavView2.this));
            }
            this.o = (int) (Math.random() * DoubleClickFavView2.access$900(DoubleClickFavView2.this).size());
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.b);
            float f = 750;
            if (currentTimeMillis > f || currentTimeMillis < 0.0f) {
                DoubleClickFavView2.access$000(DoubleClickFavView2.this).remove(this);
                if (DoubleClickFavView2.access$000(DoubleClickFavView2.this).isEmpty()) {
                    DoubleClickFavView2.access$1000(DoubleClickFavView2.this);
                    return;
                }
                return;
            }
            float f2 = currentTimeMillis / f;
            float access$1100 = DoubleClickFavView2.access$1100(DoubleClickFavView2.this) * f2;
            if (f2 > 0.5d) {
                this.n = (int) (((1.0f - f2) * 255.0f) / 0.5f);
            } else {
                this.n = 255;
            }
            float access$1200 = (DoubleClickFavView2.access$1200(DoubleClickFavView2.this) * access$1100) / 2.0f;
            float access$1300 = (DoubleClickFavView2.access$1300(DoubleClickFavView2.this) * access$1100) / 2.0f;
            PointF pointF = this.f8392a;
            float f3 = pointF.x;
            this.j = (int) (f3 - access$1200);
            this.l = (int) (f3 + access$1200);
            float f4 = pointF.y;
            this.k = (int) (f4 - access$1300);
            this.m = (int) (f4 + access$1300);
        }
    }

    static {
        t2o.a(295698497);
        t2o.a(295698504);
    }

    public DoubleClickFavView2(Context context) {
        this(context, null);
    }

    public static /* synthetic */ List access$000(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37a79f65", new Object[]{doubleClickFavView2});
        }
        return doubleClickFavView2.mPointFavs;
    }

    public static /* synthetic */ Runnable access$100(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("1e6dcc33", new Object[]{doubleClickFavView2});
        }
        return doubleClickFavView2.mRunnable;
    }

    public static /* synthetic */ void access$1000(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e89f13", new Object[]{doubleClickFavView2});
        } else {
            doubleClickFavView2.reset();
        }
    }

    public static /* synthetic */ float access$1100(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f555c22", new Object[]{doubleClickFavView2})).floatValue();
        }
        return doubleClickFavView2.mMaxRatio;
    }

    public static /* synthetic */ int access$1200(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccc21944", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.widthLike;
    }

    public static /* synthetic */ int access$1300(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a2ed663", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.heightLike;
    }

    public static /* synthetic */ ArrayList access$1400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f5474c84", new Object[0]);
        }
        return createDefaultDrawables();
    }

    public static /* synthetic */ boolean access$1500(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("150850b2", new Object[]{doubleClickFavView2})).booleanValue();
        }
        return doubleClickFavView2.mUseDefault;
    }

    public static /* synthetic */ ArrayList access$1600(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7ed40927", new Object[]{doubleClickFavView2});
        }
        return doubleClickFavView2.mDefaultDrawables;
    }

    public static /* synthetic */ ArrayList access$1602(DoubleClickFavView2 doubleClickFavView2, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("76bebd59", new Object[]{doubleClickFavView2, arrayList});
        }
        doubleClickFavView2.mDefaultDrawables = arrayList;
        return arrayList;
    }

    public static /* synthetic */ boolean access$1702(DoubleClickFavView2 doubleClickFavView2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13678b6e", new Object[]{doubleClickFavView2, new Boolean(z)})).booleanValue();
        }
        doubleClickFavView2.mHasExecute = z;
        return z;
    }

    public static /* synthetic */ Handler access$200(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a3cfede6", new Object[]{doubleClickFavView2});
        }
        return doubleClickFavView2.mHandler;
    }

    public static /* synthetic */ Drawable access$302(DoubleClickFavView2 doubleClickFavView2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbcbb9b9", new Object[]{doubleClickFavView2, drawable});
        }
        doubleClickFavView2.userHeadDrawable = drawable;
        return drawable;
    }

    public static /* synthetic */ BitmapDrawable access$400(DoubleClickFavView2 doubleClickFavView2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("b1449a89", new Object[]{doubleClickFavView2, drawable});
        }
        return doubleClickFavView2.getCircularBitmapDrawable(drawable);
    }

    public static /* synthetic */ int access$500(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ad0c30", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.minWidth;
    }

    public static /* synthetic */ int access$600(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7419c94f", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.maxWidth;
    }

    public static /* synthetic */ int access$700(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e186866e", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.minHeight;
    }

    public static /* synthetic */ int access$800(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ef3438d", new Object[]{doubleClickFavView2})).intValue();
        }
        return doubleClickFavView2.maxHeight;
    }

    public static /* synthetic */ ArrayList access$900(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d4d44e13", new Object[]{doubleClickFavView2});
        }
        return doubleClickFavView2.mBitmapDrawables;
    }

    private static ArrayList<Drawable> createDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("16715251", new Object[0]);
        }
        ArrayList<Drawable> arrayList = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        s0m B = s0m.B();
        B.T("https://gw.alicdn.com/imgextra/i2/O1CN01UNMgNM1PP6SPt2gPW_!!6000000001832-2-tps-60-60.png").succListener(new d(arrayList, countDownLatch));
        B.T("https://gw.alicdn.com/imgextra/i2/O1CN01m3OD2o27GiIRc2rTK_!!6000000007770-2-tps-60-60.png").succListener(new d(arrayList, countDownLatch));
        B.T("https://gw.alicdn.com/imgextra/i4/O1CN01HTqL5y1nTGqAolERQ_!!6000000005090-2-tps-60-60.png").succListener(new d(arrayList, countDownLatch));
        B.T("https://gw.alicdn.com/imgextra/i1/O1CN01DTGVml1eprq657njs_!!6000000003921-2-tps-60-60.png").succListener(new d(arrayList, countDownLatch));
        B.T("https://gw.alicdn.com/imgextra/i1/O1CN01pszcl823m4xHMmJ1B_!!6000000007297-2-tps-60-60.png").succListener(new d(arrayList, countDownLatch));
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            q0h.a(TAG, th.getMessage());
        }
        return arrayList;
    }

    private void drawPointFavNew(Canvas canvas, e eVar) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b067b5", new Object[]{this, canvas, eVar});
            return;
        }
        canvas.save();
        float f = eVar.e;
        PointF pointF = eVar.f8392a;
        canvas.rotate(f, pointF.x, pointF.y);
        int i = eVar.o;
        if (i >= 0 && i < this.mBitmapDrawables.size()) {
            if (enableDoubleClickFavorOpt()) {
                drawable = this.userHeadDrawable;
            } else {
                drawable = this.mBitmapDrawables.get(i);
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() == null || !bitmapDrawable.getBitmap().isRecycled()) {
                    bitmapDrawable.setBounds(eVar.j, eVar.k, eVar.l, eVar.m);
                    bitmapDrawable.setAlpha(eVar.n);
                    if (enableDoubleClickFavorOpt()) {
                        RectF rectF = new RectF(bitmapDrawable.getBounds());
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        this.outlinePaint.setAlpha(eVar.n);
                        canvas.drawCircle(centerX, centerY, (rectF.width() / 2.0f) + 2.0f, this.outlinePaint);
                    }
                    bitmapDrawable.draw(canvas);
                    canvas.restore();
                    return;
                }
                v2s.o().e().a("taolive", "DoubleClickBitmapRecycled", 1.0d);
            }
        }
    }

    private boolean enableDoubleClickFavorOpt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae21674", new Object[]{this})).booleanValue();
        }
        if (!nh4.C() || this.count % 10 != 0) {
            return false;
        }
        return true;
    }

    private BitmapDrawable getCircularBitmapDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("c628619e", new Object[]{this, drawable});
        }
        if (drawable == null) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawOval(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), paint);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    public static /* synthetic */ Object ipc$super(DoubleClickFavView2 doubleClickFavView2, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/doubleclickfav/DoubleClickFavView2");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.index = 0;
        }
    }

    public void checkFavorPicByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e8e5f5", new Object[]{this, str});
            return;
        }
        q0h.b(TAG, "checkFavorPicByUrl = " + str);
        if (!TextUtils.isEmpty(str)) {
            p8o.f().e(str, new n7a(this));
            if (nh4.C() && v2s.o() != null && v2s.o().u() != null) {
                String headPicLink = v2s.o().u().getHeadPicLink();
                if (!TextUtils.isEmpty(headPicLink)) {
                    gme.a(headPicLink).b(new b()).a();
                }
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<Drawable> arrayList = this.mBitmapDrawables;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<Drawable> it = this.mBitmapDrawables.iterator();
            while (it.hasNext()) {
                Drawable next = it.next();
                if (next instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) next;
                    if (bitmapDrawable.getBitmap() != null) {
                        bitmapDrawable.getBitmap().recycle();
                    }
                }
            }
            this.mBitmapDrawables.clear();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        for (e eVar : this.mPointFavs) {
            drawPointFavNew(canvas, eVar);
        }
    }

    public void setDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9817c5d", new Object[]{this});
        } else if (!this.mUseDefault) {
        } else {
            if (!this.mDefaultDrawables.isEmpty()) {
                this.mBitmapDrawables.clear();
                this.mBitmapDrawables.addAll(this.mDefaultDrawables);
            } else if (!this.mHasExecute) {
                this.mHasExecute = true;
                new c(getContext()).execute(new Object[0]);
            }
        }
    }

    public void setMaxRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8573aa30", new Object[]{this, new Float(f)});
        } else {
            this.mMaxRatio = f;
        }
    }

    public void showDoubleClickFav(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78091a7f", new Object[]{this, pointF});
            return;
        }
        int size = this.mBitmapDrawables.size();
        if (size != 0) {
            this.count++;
            List<e> list = this.mPointFavs;
            int i = this.index + 1;
            this.index = i;
            list.add(new e(Math.min((i % size) + 3, size), size, pointF));
            this.mHandler.post(this.mRunnable);
        }
    }

    public DoubleClickFavView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // tb.z0c
    public void setDrawables(ArrayList<Drawable> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cafcd90", new Object[]{this, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            this.mUseDefault = false;
            this.mBitmapDrawables = arrayList;
            Iterator<Drawable> it = arrayList.iterator();
            while (it.hasNext()) {
                o3s.d(TAG, "setDrawables:" + it.next().toString());
            }
        }
    }

    public DoubleClickFavView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxRatio = 1.5f;
        this.mUseDefault = true;
        this.mHasExecute = false;
        this.mRunnable = new a();
        this.mPointFavs = new ArrayList();
        this.mBitmapDrawables = new ArrayList<>();
        int a2 = iw0.a(context, 60.0f);
        this.widthLike = a2;
        int a3 = iw0.a(context, 60.0f);
        this.heightLike = a3;
        this.minHeight = (int) (a3 * 2.5d);
        this.maxHeight = (int) (a3 * 3.5d);
        this.minWidth = (int) (a2 * 0.5d);
        this.maxWidth = (int) (a2 * 1.5d);
        this.mDefaultDrawables = new ArrayList<>();
        Paint paint = new Paint();
        this.outlinePaint = paint;
        paint.setColor(Color.argb(204, 255, 255, 255));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(iw0.a(getContext(), 1.0f));
        this.mHandler = new Handler(Looper.getMainLooper());
        setDefaultDrawables();
    }
}
