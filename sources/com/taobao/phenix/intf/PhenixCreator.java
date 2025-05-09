package com.taobao.phenix.intf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.request.ImageStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import tb.ad2;
import tb.b1m;
import tb.dki;
import tb.dtl;
import tb.ex;
import tb.fiv;
import tb.huo;
import tb.j1m;
import tb.l0n;
import tb.lzm;
import tb.nd2;
import tb.ouo;
import tb.oyi;
import tb.p1m;
import tb.q6k;
import tb.qkd;
import tb.rs2;
import tb.s0m;
import tb.s8d;
import tb.t15;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PhenixCreator extends ex {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PhenixCreator";
    public static int[] gScreenSize = null;
    private ExecutorService executorService;
    private s8d<b1m> mCancelListener;
    private Drawable mErrorDrawable;
    private int mErrorResId;
    private s8d<FailPhenixEvent> mFailListener;
    private Handler mHandler;
    private final com.taobao.phenix.request.a mImageRequest;
    private WeakReference<ImageView> mIntoImageRef;
    private s8d<dki> mMemMissListener;
    private Drawable mPlaceholderDrawable;
    private int mPlaceholderResId;
    private s8d<l0n> mProgressListener;
    private qkd mRetryHandlerOnFailure;
    private s8d<SuccPhenixEvent> mSuccessListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            ImageView imageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                return false;
            }
            if (succPhenixEvent.getDrawable() != null) {
                imageView.setImageDrawable(succPhenixEvent.getDrawable());
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements s8d<dki> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(dki dkiVar) {
            ImageView imageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72d3ebbb", new Object[]{this, dkiVar})).booleanValue();
            }
            if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                return false;
            }
            if (PhenixCreator.access$100(PhenixCreator.this) != 0) {
                imageView.setImageResource(PhenixCreator.access$100(PhenixCreator.this));
            } else if (PhenixCreator.access$200(PhenixCreator.this) != null) {
                imageView.setImageDrawable(PhenixCreator.access$200(PhenixCreator.this));
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            ImageView imageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                return false;
            }
            if (PhenixCreator.access$300(PhenixCreator.this) != 0) {
                imageView.setImageResource(PhenixCreator.access$300(PhenixCreator.this));
            } else if (PhenixCreator.access$400(PhenixCreator.this) != null) {
                imageView.setImageDrawable(PhenixCreator.access$400(PhenixCreator.this));
            }
            return true;
        }
    }

    static {
        t2o.a(620757094);
    }

    public PhenixCreator(oyi oyiVar, String str, rs2 rs2Var) {
        com.taobao.phenix.request.a aVar = new com.taobao.phenix.request.a(str, rs2Var, s0m.B().R0());
        this.mImageRequest = aVar;
        if (oyiVar != null) {
            aVar.y0(oyiVar.f25749a);
            aVar.q(oyiVar.b);
            aVar.x0(oyiVar.c);
            aVar.t0(oyiVar.d);
            preloadWithSmall(oyiVar.e);
            scaleFromLarge(oyiVar.f);
            return;
        }
        preloadWithSmall(s0m.B().L());
        scaleFromLarge(s0m.B().M());
    }

    public static /* synthetic */ WeakReference access$000(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("240c32c4", new Object[]{phenixCreator});
        }
        return phenixCreator.mIntoImageRef;
    }

    public static /* synthetic */ int access$100(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21eef56a", new Object[]{phenixCreator})).intValue();
        }
        return phenixCreator.mPlaceholderResId;
    }

    public static /* synthetic */ Drawable access$200(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("a589aec2", new Object[]{phenixCreator});
        }
        return phenixCreator.mPlaceholderDrawable;
    }

    public static /* synthetic */ int access$300(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57307a6c", new Object[]{phenixCreator})).intValue();
        }
        return phenixCreator.mErrorResId;
    }

    public static /* synthetic */ Drawable access$400(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("61707a80", new Object[]{phenixCreator});
        }
        return phenixCreator.mErrorDrawable;
    }

    private p1m fetchInto(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("cb2fb0e4", new Object[]{this, imageView});
        }
        this.mIntoImageRef = new WeakReference<>(imageView);
        return failListener(new c()).memCacheMissListener(new b()).succListener(new a()).fetch();
    }

    public static int[] getScreenSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cff6f726", new Object[]{context});
        }
        if (gScreenSize == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            gScreenSize = new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        }
        return gScreenSize;
    }

    public static /* synthetic */ Object ipc$super(PhenixCreator phenixCreator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/intf/PhenixCreator");
    }

    public PhenixCreator asThumbnail(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("1c8ccc43", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (i == 1 || i == 3) {
            this.mImageRequest.w(i, z);
        }
        return this;
    }

    public PhenixCreator bitmapProcessors(ad2... ad2VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("d0371af7", new Object[]{this, ad2VarArr});
        }
        if (ad2VarArr != null && ad2VarArr.length > 0) {
            this.mImageRequest.r0(ad2VarArr);
        }
        return this;
    }

    public PhenixCreator cancelListener(s8d<b1m> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("25c6f33d", new Object[]{this, s8dVar});
        }
        this.mCancelListener = s8dVar;
        return this;
    }

    public PhenixCreator diskCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("8b214ce2", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.t0(i);
        return this;
    }

    public PhenixCreator executorService(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("684c49e7", new Object[]{this, executorService});
        }
        this.executorService = executorService;
        return this;
    }

    public PhenixCreator failListener(s8d<FailPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("3c05619", new Object[]{this, s8dVar});
        }
        this.mFailListener = s8dVar;
        return this;
    }

    @Override // tb.ex
    public p1m fetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p1m) ipChange.ipc$dispatch("3bb80bea", new Object[]{this}) : fetch("", -1L);
    }

    public PhenixCreator forceAnimationToBeStatic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("3b9d65ed", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.y(z);
        return this;
    }

    public PhenixCreator forceHighQualityAccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("2a7297de", new Object[]{this, new Boolean(z)});
        }
        if (!s0m.B().X() && !TextUtils.isEmpty(url()) && url().contains("0x0q0")) {
            this.mImageRequest.P0(z);
        }
        return this;
    }

    public PhenixCreator fuzzyMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("69f3eea7", new Object[]{this});
        }
        this.mImageRequest.u0(true);
        return this;
    }

    public s8d<b1m> getCancelListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("4b94b2ae", new Object[]{this});
        }
        return this.mCancelListener;
    }

    public s8d<FailPhenixEvent> getFailureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("ddb58f4a", new Object[]{this});
        }
        return this.mFailListener;
    }

    public s8d<dki> getMemCacheMissListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("d5cee33f", new Object[]{this});
        }
        return this.mMemMissListener;
    }

    public s8d<l0n> getProgressListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("68a5fdb", new Object[]{this});
        }
        return this.mProgressListener;
    }

    public qkd getRetryHandlerOnFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qkd) ipChange.ipc$dispatch("da2c942a", new Object[]{this});
        }
        return this.mRetryHandlerOnFailure;
    }

    public ImageStatistics getStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStatistics) ipChange.ipc$dispatch("946a835f", new Object[]{this});
        }
        com.taobao.phenix.request.a aVar = this.mImageRequest;
        if (aVar != null) {
            return aVar.Y();
        }
        return null;
    }

    public s8d<SuccPhenixEvent> getSuccessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("adb02ef1", new Object[]{this});
        }
        return this.mSuccessListener;
    }

    public PhenixCreator handler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("794bfa74", new Object[]{this, handler});
        }
        this.mHandler = handler;
        return this;
    }

    public PhenixCreator heightScale(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("d7a156eb", new Object[]{this, new Boolean(z)});
        }
        if (!s0m.B().X()) {
            this.mImageRequest.M0(z);
        }
        return this;
    }

    public int id() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8c38c15", new Object[]{this})).intValue();
        }
        com.taobao.phenix.request.a aVar = this.mImageRequest;
        if (aVar != null) {
            return aVar.d();
        }
        return -1;
    }

    @Override // tb.ex
    public p1m into(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p1m) ipChange.ipc$dispatch("33b018a", new Object[]{this, imageView}) : into(imageView, 1.0f);
    }

    public PhenixCreator limitSize(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("11f2fa6", new Object[]{this, view});
        }
        int[] screenSize = getScreenSize(view.getContext());
        return limitSize(view, screenSize[0], screenSize[1]);
    }

    public PhenixCreator memCacheMissListener(s8d<dki> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("15168e8e", new Object[]{this, s8dVar});
        }
        this.mMemMissListener = s8dVar;
        return this;
    }

    public PhenixCreator memOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("412b2829", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.m0(z);
        return this;
    }

    public PhenixCreator memoryCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("1e0d1cfe", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.x0(i);
        return this;
    }

    @Deprecated
    public PhenixCreator notSharedDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("c181949e", new Object[]{this, new Boolean(z)});
        }
        return this;
    }

    public PhenixCreator preRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("907dbdb4", new Object[]{this, new Boolean(z)});
        }
        ImageStatistics statistics = getStatistics();
        if (statistics != null) {
            statistics.O = z;
        }
        return this;
    }

    public PhenixCreator preloadWithSmall(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("58b6f820", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.v(z, 2);
        return this;
    }

    public PhenixCreator progressListener(int i, s8d<l0n> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("6eef5657", new Object[]{this, new Integer(i), s8dVar});
        }
        this.mImageRequest.C0(i);
        this.mProgressListener = s8dVar;
        return this;
    }

    public PhenixCreator releasableDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("86be95fe", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.p0(z);
        return this;
    }

    public PhenixCreator retryHandler(qkd qkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("894e183e", new Object[]{this, qkdVar});
        }
        this.mRetryHandlerOnFailure = qkdVar;
        return this;
    }

    public PhenixCreator scaleFromLarge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("d341d90f", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.v(z, 4);
        return this;
    }

    public PhenixCreator sceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("d9241dcd", new Object[]{this, str});
        }
        com.taobao.phenix.request.a aVar = this.mImageRequest;
        if (aVar != null) {
            aVar.F0(str);
        }
        return this;
    }

    public PhenixCreator schedulePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("99856314", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.q(i);
        return this;
    }

    public PhenixCreator secondary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("865e0370", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mImageRequest.G0(str);
        }
        return this;
    }

    @Deprecated
    public PhenixCreator setCacheKey4PlaceHolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("9864b666", new Object[]{this, str});
        }
        secondary(str);
        return this;
    }

    @Deprecated
    public PhenixCreator setImageStrategyInfo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("2b8d0ad8", new Object[]{this, obj});
        }
        if (obj != null) {
            addLoaderExtra(nd2.BUNDLE_BIZ_CODE, obj.toString());
        }
        return this;
    }

    public PhenixCreator setOpenTraceContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("e1fb268d", new Object[]{this, map});
        }
        this.mImageRequest.z0(map);
        return this;
    }

    public PhenixCreator skipCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("58205b4b", new Object[]{this});
        }
        this.mImageRequest.I0();
        return this;
    }

    public PhenixCreator skipMemCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("985fd962", new Object[]{this});
        }
        this.mImageRequest.J0(true);
        return this;
    }

    public PhenixCreator strictMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("eb25c72e", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.K0(z);
        return this;
    }

    public PhenixCreator succListener(s8d<SuccPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("200bde75", new Object[]{this, s8dVar});
        }
        this.mSuccessListener = s8dVar;
        return this;
    }

    @Override // tb.ex
    public String url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae8274ea", new Object[]{this});
        }
        return this.mImageRequest.G().l();
    }

    public p1m fetch(String str, long j) {
        huo huoVar;
        String str2;
        ArrayList<String> O0;
        ArrayList<String> Q0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("ea45d802", new Object[]{this, str, new Long(j)});
        }
        p1m Q = this.mImageRequest.Q();
        if (TextUtils.isEmpty(this.mImageRequest.O())) {
            s8d<FailPhenixEvent> s8dVar = this.mFailListener;
            if (s8dVar != null) {
                s8dVar.onHappen(new FailPhenixEvent(Q));
            }
            return Q;
        }
        if (!TextUtils.isEmpty(str) && j != -1) {
            this.mImageRequest.E0(str);
            this.mImageRequest.D0(j);
        }
        Map<String, String> I = this.mImageRequest.I();
        if (!(I == null || (str2 = I.get(nd2.BUNDLE_BIZ_CODE)) == null)) {
            this.mImageRequest.Y().t = str2;
            if (!TextUtils.isEmpty(str2)) {
                if (this.mImageRequest.N0()) {
                    ArrayList<String> P0 = s0m.B().P0();
                    if (P0 != null && ((!TextUtils.isEmpty(str2) && P0.contains(str2)) || P0.contains("*"))) {
                        this.mImageRequest.Y().P = true;
                    } else if (s0m.B().X0() && (Q0 = s0m.B().Q0()) != null && Q0.size() > 0 && (Q0.contains(str2) || Q0.contains("*"))) {
                        this.mImageRequest.Y().P = true;
                    }
                }
                if (this.mImageRequest.O0()) {
                    ArrayList<String> E = s0m.B().E();
                    if (E != null && ((!TextUtils.isEmpty(str2) && E.contains(str2)) || E.contains("*"))) {
                        this.mImageRequest.Y().Q = true;
                    } else if (s0m.B().X0() && (O0 = s0m.B().O0()) != null && O0.size() > 0 && (O0.contains(str2) || O0.contains("*"))) {
                        this.mImageRequest.Y().Q = true;
                    }
                }
            }
        }
        q6k x = s0m.B().x();
        lzm<dtl, com.taobao.phenix.request.a> b2 = x.b();
        ouo c2 = x.c();
        j1m j1mVar = new j1m(this.mImageRequest, this, s0m.B().s(), c2, s0m.B().r());
        Handler handler = this.mHandler;
        if (handler != null) {
            huoVar = new t15(handler);
        } else {
            ExecutorService executorService = this.executorService;
            huoVar = executorService != null ? new t15(executorService) : c2.a();
        }
        b2.a(j1mVar.e(huoVar));
        return Q;
    }

    public p1m into(ImageView imageView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("ae30e6a8", new Object[]{this, imageView, new Float(f)});
        }
        limitSize(imageView);
        if (f > 1.0f) {
            com.taobao.phenix.request.a aVar = this.mImageRequest;
            aVar.w0((int) (aVar.K() / f));
            com.taobao.phenix.request.a aVar2 = this.mImageRequest;
            aVar2.v0((int) (aVar2.J() / f));
        }
        return fetchInto(imageView);
    }

    @Override // tb.ex
    public PhenixCreator onlyCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("5ec1ceb8", new Object[]{this});
        }
        this.mImageRequest.n0(true);
        return this;
    }

    public PhenixCreator addLoaderExtra(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("7d2e513e", new Object[]{this, str, str2});
        }
        this.mImageRequest.t(str, str2);
        if (s0m.B().H0() && nd2.BUNDLE_BIZ_CODE.equals(str) && !TextUtils.isEmpty(str2)) {
            String[] strArr = nd2.INDEPENDENT_STORAGE_BIZS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (TextUtils.equals(strArr[i], str2)) {
                    fiv.c(TAG, "image independent Cache bizId=%s", str2);
                    this.mImageRequest.t0(102);
                    break;
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    public PhenixCreator bitmapProcessors(boolean z, ad2... ad2VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("bbd0d63d", new Object[]{this, new Boolean(z), ad2VarArr});
        }
        if (ad2VarArr != null && ad2VarArr.length > 0) {
            this.mImageRequest.r0(ad2VarArr);
        }
        if (z) {
            this.mImageRequest.B0(true);
        }
        return this;
    }

    @Override // tb.ex
    public PhenixCreator error(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("fbab2381", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.mErrorDrawable == null) {
            this.mErrorResId = i;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public PhenixCreator limitSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("f2013b06", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            int i3 = layoutParams.width;
            if (i3 > 0) {
                this.mImageRequest.w0(i3);
            } else if (i3 != -2) {
                this.mImageRequest.w0(view.getWidth());
            }
            int i4 = layoutParams.height;
            if (i4 > 0) {
                this.mImageRequest.v0(i4);
            } else if (i4 != -2) {
                this.mImageRequest.v0(view.getHeight());
            }
        }
        if (this.mImageRequest.K() <= 0) {
            this.mImageRequest.w0(i);
        }
        if (this.mImageRequest.J() <= 0) {
            this.mImageRequest.v0(i2);
        }
        return this;
    }

    @Override // tb.ex
    public PhenixCreator placeholder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("a098612c", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.mPlaceholderDrawable == null) {
            this.mPlaceholderResId = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public p1m into(ImageView imageView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("c2545daa", new Object[]{this, imageView, new Integer(i), new Integer(i2)});
        }
        limitSize(imageView, i, i2);
        return fetchInto(imageView);
    }

    @Override // tb.ex
    public PhenixCreator error(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("8bdf4b02", new Object[]{this, drawable});
        }
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.mErrorResId == 0) {
            this.mErrorDrawable = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    @Override // tb.ex
    public PhenixCreator placeholder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("4e7b9577", new Object[]{this, drawable});
        }
        if (this.mPlaceholderResId == 0) {
            this.mPlaceholderDrawable = drawable;
            return this;
        }
        throw new IllegalStateException("Placeholder image already set.");
    }

    public PhenixCreator limitSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("6a7ce2b2", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        this.mImageRequest.w0(i);
        this.mImageRequest.v0(i2);
        return this;
    }
}
