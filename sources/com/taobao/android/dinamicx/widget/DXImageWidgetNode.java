package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.DXCartTextInputWidgetNode;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ccs;
import tb.eb5;
import tb.eb6;
import tb.ekx;
import tb.h36;
import tb.ic5;
import tb.jb6;
import tb.jn7;
import tb.lle;
import tb.mw5;
import tb.qub;
import tb.sqm;
import tb.t2o;
import tb.t56;
import tb.tz8;
import tb.vu3;
import tb.w9r;
import tb.x06;
import tb.xv5;
import tb.zg5;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXImageWidgetNode extends DXWidgetNode implements sqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BLUR_RADIUS = 0;
    public static final int DEFAULT_BLUR_SCALE_SAMPLE = 2;
    public static final long DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION = 4397440843378074969L;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_ALL = 5;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_BOTTOM = 3;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_LEFT = 2;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_NONE = 0;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_RIGHT = 4;
    public static final int DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION_TOP = 1;
    public static final long DXIMAGEVIEW_BLURRADIUS = 3773218142309533223L;
    public static final long DXIMAGEVIEW_BLURSCALE_ANDROID = -5900380239321505554L;
    public static final long DXIMAGEVIEW_ENABLESIZEINLAYOUTPARAMS = 8957926395486892723L;
    public static final long DXIMAGEVIEW_FUZZYMATCHCACHE = 4548676248953404440L;
    public static final long DXIMAGEVIEW_IMAGEBIZID = 2897469727848826591L;
    public static final long DXIMAGEVIEW_IMAGEBIZTYPE = -5713278466016543530L;
    public static final long DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID = -4509123988113507795L;
    public static final long DXIMAGEVIEW_ONIMAGELOADCOMPLETE = -7905855993384945268L;
    public static final long DXIMAGEVIEW_PROGRESSIVELOADING = -8827546786785133943L;
    public static final long DXIMAGEVIEW_STRICTMATCHCACHE_ANDROID = -776111975077593198L;
    public static final long DXIMAGEVIEW_ZOOMENABLED = -435531425157341573L;
    public static final int DX_IMAGEVIEW_FILTERTYPE_GRAY = 1;
    public static final int DX_IMAGEVIEW_FILTERTYPE_NONE = 0;
    public static final String HEIGHT_LIMIT = "heightLimit";
    private static final int IMAGE_VIEW_SCALE_TYPE_CENTER_CROP = 2;
    private static final int IMAGE_VIEW_SCALE_TYPE_FIT_CENTER = 0;
    private static final int IMAGE_VIEW_SCALE_TYPE_FIT_XY = 1;
    public static final int MAX_BLUR_RADIUS = 25;
    public static final int OPT_TYPE_DEFAULT = 0;
    public static final int OPT_TYPE_ORIGINAL = 1;
    public static final int OPT_TYPE_WEBP = 2;
    public static final String TAG = "DXImageWidgetNode";
    public static final String WIDTH_LIMIT = "widthLimit";
    public static LruCache<String, Double> imageRatioCache = new LruCache<>(1024);
    public static LruCache<String, Integer> resCache = new LruCache<>(100);
    public boolean animated;
    public String decidedUrl;
    private x06 dxImageNodeProperty;
    private boolean hasAspectRatioAttribute;
    private boolean imagePropertyDeepCloneFlag;
    public String imageUrl;
    public Drawable localImageDrawable;
    public boolean mFadeIn;
    public boolean progressiveLoading;
    public int scaleType;
    private double aspectRatio = -1.0d;
    public boolean forceOriginal = false;
    private int downloadType = 0;
    public int filterType = 0;
    private boolean zoomEnabled = false;
    private byte backgroundColorExtraction = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DOWNLOAD_TYPE {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface FILTER_TYPE {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ImageLoadCompleteEvent extends DXEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String darkImageUrl;
        private final String imageUrl;

        static {
            t2o.a(444597315);
        }

        public ImageLoadCompleteEvent(String str, String str2) {
            super(DXImageWidgetNode.DXIMAGEVIEW_ONIMAGELOADCOMPLETE);
            mw5 mw5Var;
            mw5 mw5Var2;
            this.imageUrl = str;
            this.darkImageUrl = str2;
            HashMap hashMap = new HashMap();
            if (str == null) {
                mw5Var = mw5.M();
            } else {
                mw5Var = mw5.O(str);
            }
            hashMap.put("imageUrl", mw5Var);
            if (str2 == null) {
                mw5Var2 = mw5.M();
            } else {
                mw5Var2 = mw5.O(str2);
            }
            hashMap.put(ccs.KEY_RIGHT_ITEM_DARK_IMAGE_URL, mw5Var2);
            setArgs(hashMap);
        }

        public static /* synthetic */ Object ipc$super(ImageLoadCompleteEvent imageLoadCompleteEvent, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXImageWidgetNode$ImageLoadCompleteEvent");
        }

        public String getDarkImageUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c71250d9", new Object[]{this});
            }
            return this.darkImageUrl;
        }

        public String getImageUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
            }
            return this.imageUrl;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7366a;

        public a(String str) {
            this.f7366a = str;
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            Drawable drawable = hVar.f7370a;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > 0) {
                    DXImageWidgetNode.imageRatioCache.put(this.f7366a, Double.valueOf(intrinsicWidth / intrinsicHeight));
                }
            }
            DXWidgetNode W = DXImageWidgetNode.this.getDXRuntimeContext().W();
            if (W != null) {
                if (W instanceof DXImageWidgetNode) {
                    ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
                }
                W.setNeedLayout();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            DXWidgetNode W = DXImageWidgetNode.this.getDXRuntimeContext().W();
            if (W instanceof DXImageWidgetNode) {
                ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            DXWidgetNode W = DXImageWidgetNode.this.getDXRuntimeContext().W();
            if (W instanceof DXImageWidgetNode) {
                ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597312);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXImageWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        boolean a(h hVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean A;
        public boolean B;
        public int C;
        public int D;
        public boolean E;
        public int I;
        public byte J;
        public DXEngineConfig.ImageQuality K;

        /* renamed from: a  reason: collision with root package name */
        public int[] f7369a;
        public int b;
        public int c;
        public String e;
        public int f;
        public String g;
        public int h;
        public Drawable i;
        public String j;
        public f k;
        public d l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public int t;
        public boolean u;
        public double v;
        public int w;
        public Map<String, String> x;
        public Map<String, String> y;
        public boolean z;
        public boolean d = true;
        public boolean L = false;
        public boolean F = true;
        public boolean G = false;
        public boolean H = false;

        static {
            t2o.a(444597317);
        }

        public static /* synthetic */ byte a(g gVar, byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a213e21", new Object[]{gVar, new Byte(b)})).byteValue();
            }
            gVar.J = b;
            return b;
        }

        public static /* synthetic */ int b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("229487d9", new Object[]{gVar})).intValue();
            }
            return gVar.I;
        }

        public static /* synthetic */ int c(g gVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3492518e", new Object[]{gVar, new Integer(i)})).intValue();
            }
            gVar.I = i;
            return i;
        }

        public static /* synthetic */ int d(g gVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4f034aad", new Object[]{gVar, new Integer(i)})).intValue();
            }
            gVar.w = i;
            return i;
        }

        public static /* synthetic */ boolean e(g gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("697483ae", new Object[]{gVar, new Boolean(z)})).booleanValue();
            }
            gVar.r = z;
            return z;
        }

        public boolean A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5274121", new Object[]{this})).booleanValue();
            }
            return this.s;
        }

        public boolean B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86970d06", new Object[]{this})).booleanValue();
            }
            return this.B;
        }

        public boolean C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d6e59af", new Object[]{this})).booleanValue();
            }
            return this.E;
        }

        public void D(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b81b90a", new Object[]{this, str, str2});
                return;
            }
            if (this.x == null) {
                this.x = new ConcurrentHashMap();
            }
            this.x.put(str, str2);
        }

        public void E(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67aae19b", new Object[]{this, dVar});
            } else {
                this.l = dVar;
            }
        }

        public void F(DXEngineConfig.ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb4f037", new Object[]{this, imageQuality});
            } else {
                this.K = imageQuality;
            }
        }

        public void G(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93a8c7c8", new Object[]{this, map});
            } else {
                this.y = map;
            }
        }

        public void H(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2bf7da", new Object[]{this, new Boolean(z)});
            } else {
                this.B = z;
            }
        }

        public d f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("b0466cbf", new Object[]{this});
            }
            return this.l;
        }

        public byte g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f27aab59", new Object[]{this})).byteValue();
            }
            return this.J;
        }

        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58b71cc9", new Object[]{this})).intValue();
            }
            return this.C;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c4f925e", new Object[]{this})).intValue();
            }
            return this.D;
        }

        public double j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c75f0e9f", new Object[]{this})).doubleValue();
            }
            return this.v;
        }

        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("597e72d2", new Object[]{this})).intValue();
            }
            return this.w;
        }

        public Map<String, String> l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cd0258b2", new Object[]{this});
            }
            return this.x;
        }

        public DXEngineConfig.ImageQuality m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig.ImageQuality) ipChange.ipc$dispatch("6e41c615", new Object[]{this});
            }
            return this.K;
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58ca67a8", new Object[]{this})).intValue();
            }
            return this.I;
        }

        public Map<String, String> o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("e79d2786", new Object[]{this});
            }
            return this.y;
        }

        public String p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a4f8b1c8", new Object[]{this});
            }
            return this.g;
        }

        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("110b16f8", new Object[]{this})).booleanValue();
            }
            return this.n;
        }

        public boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4eba7959", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7aeb6ae", new Object[]{this})).booleanValue();
            }
            return this.A;
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8470805d", new Object[]{this})).booleanValue();
            }
            return this.m;
        }

        public boolean u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a961b5e8", new Object[]{this})).booleanValue();
            }
            return this.G;
        }

        public boolean v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("25c1dea2", new Object[]{this})).booleanValue();
            }
            return this.o;
        }

        public boolean w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ac9cf385", new Object[]{this})).booleanValue();
            }
            return this.p;
        }

        public boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("becb1c8d", new Object[]{this})).booleanValue();
            }
            return this.q;
        }

        public boolean y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("539edfe2", new Object[]{this})).booleanValue();
            }
            return this.u;
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dc74f7e7", new Object[]{this})).booleanValue();
            }
            return this.r;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f7370a;

        static {
            t2o.a(444597318);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7371a;
        public final WeakReference<ImageView> b;
        public final Context c;

        static {
            t2o.a(444597319);
        }

        public i(ImageView imageView, String str) {
            this.b = new WeakReference<>(imageView);
            this.f7371a = str;
            this.c = imageView.getContext().getApplicationContext();
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXImageWidgetNode$LoadDrawableTask");
        }

        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("8d0ed6e3", new Object[]{this, voidArr});
            }
            return b();
        }

        public Drawable b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
            }
            int drawableId = DXImageWidgetNode.getDrawableId(this.c, this.f7371a);
            if (drawableId == 0) {
                return null;
            }
            try {
                return this.c.getDrawable(drawableId);
            } catch (Exception e) {
                Log.e(DXImageWidgetNode.TAG, "Get layout parser exception", e);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0165 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(android.graphics.drawable.Drawable r13) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXImageWidgetNode.i.onPostExecute(android.graphics.drawable.Drawable):void");
        }
    }

    static {
        t2o.a(444597307);
        t2o.a(444596626);
    }

    public static /* synthetic */ Object ipc$super(DXImageWidgetNode dXImageWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXImageWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        t56.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
        } else if (dXRenderOptions != null && dXRenderOptions.c() != null && (a2 = dXRenderOptions.c().a()) != null) {
            setFadeIn(a2.b());
            setLoadImgWhenNullClearImg_Android(a2.c());
            setAutoRelease(a2.a());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXImageWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(getDarkImageUrl()) || isNeedDarkModeOverlay()) {
            return true;
        }
        return false;
    }

    public double getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371752", new Object[]{this})).doubleValue();
        }
        return this.aspectRatio;
    }

    public int getBlurRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b71cc9", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 0;
        }
        return x06Var.i;
    }

    public int getBlurScale_android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f29097", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 2;
        }
        return x06Var.j;
    }

    public String getDarkImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71250d9", new Object[]{this});
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return null;
        }
        return x06Var.h;
    }

    public double getDarkModeOverlayOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c75f0e9f", new Object[]{this})).doubleValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 0.5d;
        }
        return x06Var.g;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (-2989625047271068027L == j || -273786109416499313L == j) {
            return 1;
        }
        if (-699001992808524026L == j || DXIMAGEVIEW_BLURRADIUS == j) {
            return 0;
        }
        if (DXIMAGEVIEW_BLURSCALE_ANDROID == j) {
            return 2;
        }
        if (8957926395486892723L == j) {
            if (zg5.r4()) {
                return 1;
            }
            return -1;
        } else if (j == DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID) {
            return 1;
        } else {
            if (-7195088064603432654L == j) {
                return 0;
            }
            return super.getDefaultValueForIntAttr(j);
        }
    }

    public int getEnableSizeInLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97f47ec9", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var != null) {
            return x06Var.c;
        }
        if (zg5.r4()) {
            return 1;
        }
        return -1;
    }

    public int getExpectedImageHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65f28bce", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 0;
        }
        return x06Var.d;
    }

    public int getExpectedImageWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("269293f3", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 0;
        }
        return x06Var.e;
    }

    public boolean getFadeIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f224c2", new Object[]{this})).booleanValue();
        }
        return this.mFadeIn;
    }

    public String getImageBiztype() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24afc091", new Object[]{this});
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return null;
        }
        return x06Var.f31047a;
    }

    public String getImageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc9bcd29", new Object[]{this});
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return null;
        }
        return x06Var.k;
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.imageUrl;
    }

    public Drawable getLocalImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("851b3bef", new Object[]{this});
        }
        return this.localImageDrawable;
    }

    public Drawable getPlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("56dea8d6", new Object[]{this});
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return null;
        }
        return x06Var.m;
    }

    public String getPlaceHolderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a92371", new Object[]{this});
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return null;
        }
        return x06Var.l;
    }

    public int getScaleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b00a2668", new Object[]{this})).intValue();
        }
        return this.scaleType;
    }

    public boolean hasAspectRatioAttribute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6d27e0e", new Object[]{this})).booleanValue();
        }
        return this.hasAspectRatioAttribute;
    }

    public boolean isAnimated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("110b16f8", new Object[]{this})).booleanValue();
        }
        return this.animated;
    }

    public boolean isAsyncImageLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40929a", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return true;
        }
        return x06Var.n;
    }

    public boolean isAutoRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eba7959", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return true;
        }
        return x06Var.o;
    }

    public boolean isFuzzyMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a961b5e8", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return false;
        }
        return x06Var.q;
    }

    public boolean isLoadImgWhenNullClearImg_Android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7849665", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return true;
        }
        return x06Var.p;
    }

    public boolean isNeedDarkModeOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539edfe2", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return false;
        }
        return x06Var.f;
    }

    public boolean isStrictMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a636363b", new Object[]{this})).booleanValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return false;
        }
        return x06Var.r;
    }

    public boolean isZoomEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b058eaef", new Object[]{this})).booleanValue();
        }
        if (!this.zoomEnabled || !zg5.e5()) {
            return false;
        }
        return true;
    }

    public boolean needDecideWithExpectedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc597888", new Object[]{this})).booleanValue();
        }
        if (getExpectedImageWidth() <= 0 || getExpectedImageHeight() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXImageWidgetNode) {
            DXImageWidgetNode dXImageWidgetNode = (DXImageWidgetNode) dXWidgetNode;
            this.dxImageNodeProperty = dXImageWidgetNode.dxImageNodeProperty;
            this.aspectRatio = dXImageWidgetNode.aspectRatio;
            this.imageUrl = dXImageWidgetNode.imageUrl;
            this.scaleType = dXImageWidgetNode.scaleType;
            this.localImageDrawable = dXImageWidgetNode.localImageDrawable;
            this.animated = dXImageWidgetNode.animated;
            this.forceOriginal = dXImageWidgetNode.forceOriginal;
            this.downloadType = dXImageWidgetNode.downloadType;
            this.filterType = dXImageWidgetNode.filterType;
            this.progressiveLoading = dXImageWidgetNode.progressiveLoading;
            this.mFadeIn = dXImageWidgetNode.mFadeIn;
            this.zoomEnabled = dXImageWidgetNode.zoomEnabled;
            this.backgroundColorExtraction = dXImageWidgetNode.backgroundColorExtraction;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        s h2 = com.taobao.android.dinamicx.g.h(getDXRuntimeContext());
        if (h2 == null) {
            imageView = new ImageView(context);
        } else {
            imageView = h2.a(context, isZoomEnabled());
        }
        imageView.setTag(R.id.dx_imageview_createview_timestamp_key, Long.valueOf(System.currentTimeMillis()));
        return imageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2 = true;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i2);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i3);
        if (a2 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 == 1073741824) {
            z2 = false;
        }
        if (z || z2) {
            double d2 = this.aspectRatio;
            if (d2 <= vu3.b.GEO_NOT_SUPPORT) {
                if (!TextUtils.isEmpty(this.imageUrl)) {
                    Double d3 = imageRatioCache.get(this.imageUrl);
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    }
                } else {
                    Drawable drawable = this.localImageDrawable;
                    if (drawable != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = this.localImageDrawable.getIntrinsicHeight();
                        if (intrinsicHeight > 0) {
                            d2 = intrinsicWidth / intrinsicHeight;
                        }
                    }
                }
            }
            if (!z || z2) {
                if (!z && z2) {
                    int size = View.MeasureSpec.getSize(i2);
                    if (d2 > vu3.b.GEO_NOT_SUPPORT) {
                        i7 = size;
                        i6 = (int) (size / d2);
                    } else {
                        i7 = size;
                    }
                }
                i6 = 0;
            } else {
                i6 = View.MeasureSpec.getSize(i3);
                if (d2 > vu3.b.GEO_NOT_SUPPORT) {
                    i7 = (int) (i6 * d2);
                }
            }
            int max = Math.max(i7, getSuggestedMinimumWidth());
            i4 = Math.max(i6, getSuggestedMinimumHeight());
            i5 = max;
        } else {
            i5 = DXWidgetNode.DXMeasureSpec.b(i2);
            i4 = DXWidgetNode.DXMeasureSpec.b(i3);
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i5, i2), DXWidgetNode.resolveSize(i4, i3));
    }

    @Override // tb.sqm
    public void onPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfda7834", new Object[]{this});
        } else if (zg5.E4()) {
            decidedUrlWithExpectedSize(true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (18039699017736L == j) {
            if (obj instanceof Drawable) {
                this.localImageDrawable = (Drawable) obj;
            }
        } else if (DXCartTextInputWidgetNode.DXCARTTEXTINPUT_PLACEHOLDER == j && (obj instanceof Drawable)) {
            setPlaceHolder((Drawable) obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == w9r.DXTRADEIMAGEVIEW_DARKMODEIMAGEURL) {
            setDarkImageUrl(str);
        } else if (3520785955321526846L == j) {
            this.decidedUrl = null;
            this.imageUrl = str;
        } else if (8842287408427345805L == j) {
            setImageName(str);
        } else if (w9r.DXTRADEIMAGEVIEW_PLACEHOLDERNAME == j) {
            setPlaceHolderName(str);
        } else if (j == -5713278466016543530L) {
            setImageBiztype(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void postImageLoadCompleteEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7028c6c7", new Object[]{this});
        } else {
            postEvent(new ImageLoadCompleteEvent(this.imageUrl, getDarkImageUrl()));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    public void setAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f4628", new Object[]{this, new Boolean(z)});
        } else {
            this.animated = z;
        }
    }

    public void setAspectRatio(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8ca66", new Object[]{this, new Double(d2)});
        } else {
            this.aspectRatio = d2;
        }
    }

    public void setAsyncImageLoad(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2348c6", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.n = z;
    }

    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.o = z;
    }

    public void setBlurRadius(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.i = i2;
    }

    public void setBlurScale_android(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da392eb", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.j = i2;
    }

    public void setDarkImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd63ebd", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.h = str;
    }

    public void setDarkModeOverlayOpacity(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3321", new Object[]{this, new Double(d2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.g = d2;
    }

    public void setDxImageNodePropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f68034", new Object[]{this});
            return;
        }
        if (this.dxImageNodeProperty == null) {
            this.dxImageNodeProperty = new x06();
            this.imagePropertyDeepCloneFlag = true;
        }
        if (!this.imagePropertyDeepCloneFlag) {
            this.dxImageNodeProperty = this.dxImageNodeProperty.a();
            this.imagePropertyDeepCloneFlag = true;
        }
    }

    public void setEnableSizeInLayoutParams(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8decd61", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.c = i2;
    }

    public void setExpectedImageHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c2b94", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.d = i2;
    }

    public void setExpectedImageWidth(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f04477", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.e = i2;
    }

    public void setFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8994a", new Object[]{this, new Boolean(z)});
        } else {
            this.mFadeIn = z;
        }
    }

    public void setFuzzyMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99f9ca8", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.q = z;
    }

    public void setImageBizId(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67367587", new Object[]{this, new Integer(i2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.b = i2;
    }

    public void setImageBiztype(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6c605", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.f31047a = str;
    }

    public void setImageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b93d5", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.k = str;
    }

    public void setImagePerformanceOption(ImageView imageView, g gVar) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f38901b", new Object[]{this, imageView, gVar});
        } else if (gVar != null && imageView != null) {
            int i2 = R.id.dx_imageview_renderview_timestamp_key;
            if (imageView.getTag(i2) != null) {
                z = true;
            } else {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            imageView.setTag(i2, Long.valueOf(currentTimeMillis));
            gVar.D("DXImageViewOnCreateTimestampKey", String.valueOf(imageView.getTag(R.id.dx_imageview_createview_timestamp_key)));
            gVar.D("DXImageViewOnRenderTimestampKey", String.valueOf(currentTimeMillis));
            gVar.D("DXImageViewIsReuseKey", String.valueOf(z));
            gVar.D("DXImageViewRenderTypeKey", String.valueOf(getDXRuntimeContext().J()));
            if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                z2 = false;
            }
            gVar.D("DXImageViewIsMainKey", String.valueOf(z2));
        }
    }

    public void setImageScaleType(ImageView imageView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920072b7", new Object[]{this, imageView, new Integer(i2)});
        } else if (i2 == 0) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i2 == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i2 != 2) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.decidedUrl = null;
        }
        this.imageUrl = str;
    }

    public void setLoadImgWhenNullClearImg_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22db5bcb", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.p = z;
    }

    public void setLocalImage(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7447257", new Object[]{this, imageView, drawable});
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLocalImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827dd9b", new Object[]{this, drawable});
        } else {
            this.localImageDrawable = drawable;
        }
    }

    public void setNeedDarkModeOverlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7355ee", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.f = z;
    }

    public void setPlaceHolder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9876fc", new Object[]{this, drawable});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.m = drawable;
    }

    public void setPlaceHolderName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca31f8d", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.l = str;
    }

    public void setScaleType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i2)});
        } else {
            this.scaleType = i2;
        }
    }

    public void setStrictMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303c745", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.r = z;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == DXImageWidgetNode.class) {
            return true;
        }
        return false;
    }

    public static int getDrawableId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{context, str})).intValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        Integer num = resCache.get(str);
        if (num == null) {
            try {
                num = Integer.valueOf(context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName()));
                resCache.put(str, num);
            } catch (Exception unused) {
                return 0;
            }
        }
        return num.intValue();
    }

    public g buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7c0ab78d", new Object[]{this});
        }
        g gVar = new g();
        DXEngineConfig f2 = getDXRuntimeContext().f();
        if (!TextUtils.isEmpty(getImageBiztype()) || f2 == null) {
            gVar.F(null);
            gVar.e = getImageBiztype();
        } else {
            gVar.e = f2.i();
            gVar.F(f2.j());
        }
        if (f2 != null) {
            gVar.L = f2.K();
        }
        if (getImageBizId() != 0 || f2 == null) {
            gVar.f = getImageBizId();
        } else {
            gVar.f = getDXRuntimeContext().f().h();
        }
        if (!(f2 == null || f2.n() == null)) {
            gVar.g = f2.n();
        }
        if (!this.animated && getBlurRadius() > 0) {
            gVar.C = Math.min(getBlurRadius(), 25);
            gVar.D = Math.max(1, getBlurScale_android());
        }
        g.d(gVar, this.downloadType);
        int i2 = this.layoutWidth;
        if (i2 == -2 && this.layoutHeight != -2) {
            gVar.j = "heightLimit";
            g.e(gVar, true);
        } else if (i2 != -2 && this.layoutHeight == -2) {
            gVar.j = "widthLimit";
            g.e(gVar, true);
        }
        return gVar;
    }

    public g decidedUrlWithExpectedSize(boolean z) {
        String str;
        int i2;
        int i3;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c8ff78a9", new Object[]{this, new Boolean(z)});
        }
        long nanoTime = System.nanoTime();
        g gVar = null;
        try {
            t i4 = com.taobao.android.dinamicx.g.i();
            if (i4 != null) {
                if (!this.animated && !this.forceOriginal && this.downloadType != 1) {
                    if (!needHandleDark(getDXRuntimeContext())) {
                        str = this.imageUrl;
                    } else if (!TextUtils.isEmpty(getDarkImageUrl())) {
                        str = getDarkImageUrl();
                    } else {
                        str = this.imageUrl;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        gVar = buildSimpleImageOption();
                        if (needDecideWithExpectedSize()) {
                            i2 = getExpectedImageWidth();
                        } else {
                            i2 = getMeasuredWidth();
                        }
                        if (needDecideWithExpectedSize()) {
                            i3 = getExpectedImageHeight();
                        } else {
                            i3 = getMeasuredHeight();
                        }
                        this.decidedUrl = i4.a(str, i2, i3, gVar);
                        if (DinamicXEngine.j0()) {
                            if (z) {
                                str2 = "执行了异步时测量阶段decideUrl";
                            } else {
                                str2 = "预先decideUrl by expectedSize " + getExpectedImageWidth() + " x " + getExpectedImageHeight();
                            }
                            h36.i("PrefetchImageUrl", str2);
                            h36.i("PrefetchImageUrl", "realImageUrl=" + str + ", \n decidedUrl=" + this.decidedUrl);
                        }
                    }
                }
                this.decidedUrl = null;
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(getDXRuntimeContext().c());
            fVar.d = this.isEnableButter;
            f.a aVar = new f.a("Engine", "Engine_Render", com.taobao.android.dinamicx.f.DX_SIMPLE_PREFETCH_LISTENER_CRASH);
            aVar.e = xv5.a(th);
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
        if (DinamicXEngine.j0()) {
            h36.i("PrefetchImageUrl", "cost " + (((float) (System.nanoTime() - nanoTime)) / 1000000.0f) + "ms");
        }
        return gVar;
    }

    public int getImageBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08734e3", new Object[]{this})).intValue();
        }
        x06 x06Var = this.dxImageNodeProperty;
        if (x06Var == null) {
            return 0;
        }
        return x06Var.b;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (7594222789952419722L == j) {
            this.aspectRatio = d2;
            this.hasAspectRatioAttribute = true;
        } else if (j == 1360906811535693304L) {
            setDarkModeOverlayOpacity(d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
        } else if (this.needSetBackground) {
            view.setBackgroundColor(tryFetchDarkModeColor("backGroundColor", 1, getBackGroundColor()));
        }
    }

    public void setLocalRes(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9e6ac2", new Object[]{this, imageView, str});
        } else if (str == null) {
            imageView.setImageDrawable(null);
            imageView.setTag(jn7.TAG_IMAGE_NAME, null);
        } else {
            int i2 = jn7.TAG_IMAGE_NAME;
            if (!str.equals((String) imageView.getTag(i2))) {
                i iVar = new i(imageView, str);
                if (isAsyncImageLoad()) {
                    imageView.setTag(jn7.TAG_CURRENT_IMAGE_NAME, str);
                    jb6.s(iVar, new Void[0]);
                    return;
                }
                imageView.setImageDrawable(iVar.b());
                imageView.setTag(i2, str);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i2)});
        } else if (1015096712691932083L == j) {
            this.scaleType = i2;
        } else if (ekx.DXMGIFIMAGEVIEW_ANIMATED == j) {
            if (i2 != 1) {
                z = false;
            }
            this.animated = z;
        } else if (-2989625047271068027L == j) {
            if (i2 != 1) {
                z = false;
            }
            setAutoRelease(z);
        } else if (-273786109416499313L == j) {
            if (i2 != 1) {
                z = false;
            }
            setAsyncImageLoad(z);
        } else if (j == eb6.DXRICHTEXT_FORCEORIGINAL) {
            if (i2 == 0) {
                z = false;
            }
            this.forceOriginal = z;
        } else if (j == -699001992808524026L) {
            this.downloadType = i2;
        } else if (j == 3833148244587386529L) {
            setExpectedImageHeight(i2);
        } else if (j == -5982835989037571513L) {
            setExpectedImageWidth(i2);
        } else if (j == -6984348415839913320L) {
            if (i2 == 0) {
                z = false;
            }
            setNeedDarkModeOverlay(z);
        } else if (j == 8957926395486892723L) {
            setEnableSizeInLayoutParams(i2);
        } else if (j == -7195088064603432654L) {
            this.filterType = i2;
        } else if (j == 2897469727848826591L) {
            setImageBizId(i2);
        } else if (j == DXIMAGEVIEW_PROGRESSIVELOADING) {
            if (i2 != 1) {
                z = false;
            }
            this.progressiveLoading = z;
        } else if (j == DXIMAGEVIEW_BLURRADIUS) {
            setBlurRadius(i2);
        } else if (j == DXIMAGEVIEW_BLURSCALE_ANDROID) {
            setBlurScale_android(i2);
        } else if (j == DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            setLoadImgWhenNullClearImg_Android(z);
        } else if (j == DXIMAGEVIEW_FUZZYMATCHCACHE) {
            if (i2 == 0) {
                z = false;
            }
            setFuzzyMatchCache(z);
        } else if (j == DXIMAGEVIEW_STRICTMATCHCACHE_ANDROID) {
            if (i2 == 0) {
                z = false;
            }
            setStrictMatchCache(z);
        } else if (j == DXIMAGEVIEW_ZOOMENABLED) {
            if (i2 != 1) {
                z = false;
            }
            this.zoomEnabled = z;
        } else if (j == DXIMAGEVIEW_BACKGROUNDCOLOREXTRACTION) {
            this.backgroundColorExtraction = (byte) i2;
        } else {
            super.onSetIntAttribute(j, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        DXTraceUtil.b(" build option ");
        ImageView imageView = (ImageView) view;
        g decidedUrlWithExpectedSize = (!needDecideWithExpectedSize() || this.decidedUrl != null) ? null : decidedUrlWithExpectedSize(false);
        if (decidedUrlWithExpectedSize == null) {
            decidedUrlWithExpectedSize = buildSimpleImageOption();
        }
        decidedUrlWithExpectedSize.z = this.decidedUrl != null;
        setImageScaleType(imageView, this.scaleType);
        g.a(decidedUrlWithExpectedSize, this.backgroundColorExtraction);
        String str = this.decidedUrl;
        if (str == null) {
            if (!needHandleDark(getDXRuntimeContext())) {
                str = this.imageUrl;
            } else if (!TextUtils.isEmpty(getDarkImageUrl())) {
                str = getDarkImageUrl();
            } else {
                str = this.imageUrl;
            }
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (!(tz8Var == null || getDXRuntimeContext().E() == null)) {
                decidedUrlWithExpectedSize.G(tz8Var.c(getDXRuntimeContext().E().a()));
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
        if (!TextUtils.isEmpty(str)) {
            decidedUrlWithExpectedSize.s = true;
            if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
                decidedUrlWithExpectedSize.k = new a(str);
            } else if (!eb5.k() || getEventHandlersExprNode() == null || getEventHandlersExprNode().indexOfKey(DXIMAGEVIEW_ONIMAGELOADCOMPLETE) < 0) {
                decidedUrlWithExpectedSize.k = new c();
            } else {
                decidedUrlWithExpectedSize.k = new b();
            }
        } else {
            Drawable drawable = this.localImageDrawable;
            if (drawable != null) {
                setLocalImage(imageView, drawable);
            } else if (!TextUtils.isEmpty(getImageName())) {
                setLocalRes(imageView, getImageName());
            } else {
                imageView.setImageDrawable(null);
                decidedUrlWithExpectedSize.s = true;
            }
        }
        if (decidedUrlWithExpectedSize.s) {
            int drawableId = getDrawableId(context, getPlaceHolderName());
            decidedUrlWithExpectedSize.h = drawableId;
            if (drawableId == 0) {
                decidedUrlWithExpectedSize.i = getPlaceHolder();
            }
        }
        if (this.needSetBackground) {
            setBorderColor(tryFetchDarkModeColor("borderColor", 2, getBorderColor()));
            if (getBorderColor() != 0) {
                decidedUrlWithExpectedSize.b = getBorderColor();
                decidedUrlWithExpectedSize.o = true;
            }
            if (getBorderWidth() > 0) {
                decidedUrlWithExpectedSize.c = getBorderWidth();
                decidedUrlWithExpectedSize.p = true;
            }
            int cornerRadius = getCornerRadius();
            int cornerRadiusLeftTop = getCornerRadiusLeftTop();
            int cornerRadiusRightTop = getCornerRadiusRightTop();
            int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
            int cornerRadiusRightBottom = getCornerRadiusRightBottom();
            if (cornerRadius > 0) {
                iArr = new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius};
            } else {
                iArr = (cornerRadiusLeftTop > 0 || cornerRadiusRightTop > 0 || cornerRadiusLeftBottom > 0 || cornerRadiusRightBottom > 0 || decidedUrlWithExpectedSize.o || decidedUrlWithExpectedSize.p) ? new int[]{cornerRadiusLeftTop, cornerRadiusRightTop, cornerRadiusRightBottom, cornerRadiusLeftBottom} : null;
            }
            if (iArr != null) {
                decidedUrlWithExpectedSize.f7369a = iArr;
                decidedUrlWithExpectedSize.q = true;
            }
        }
        decidedUrlWithExpectedSize.n = this.animated;
        decidedUrlWithExpectedSize.H(this.progressiveLoading);
        if (getDXRuntimeContext().s() != null) {
            DXEngineConfig c2 = getDXRuntimeContext().s().c();
            if (c2 != null) {
                z = c2.B();
                decidedUrlWithExpectedSize.F(c2.j());
                decidedUrlWithExpectedSize.H(this.progressiveLoading && !c2.x());
            } else {
                z = true;
            }
            decidedUrlWithExpectedSize.d = isAutoRelease() && z;
        } else {
            decidedUrlWithExpectedSize.d = isAutoRelease();
            decidedUrlWithExpectedSize.F(null);
        }
        decidedUrlWithExpectedSize.m = this.forceOriginal;
        decidedUrlWithExpectedSize.v = getDarkModeOverlayOpacity();
        decidedUrlWithExpectedSize.u = isNeedDarkModeOverlay();
        decidedUrlWithExpectedSize.F = isLoadImgWhenNullClearImg_Android();
        if (eb5.k()) {
            decidedUrlWithExpectedSize.A = true;
        } else if (getEnableSizeInLayoutParams() >= 0) {
            decidedUrlWithExpectedSize.A = getEnableSizeInLayoutParams() == 1;
        } else if (!(getDXRuntimeContext().s() == null || getDXRuntimeContext().s().c() == null)) {
            decidedUrlWithExpectedSize.A = getDXRuntimeContext().s().c().C();
        }
        DXTraceUtil.c();
        s h2 = com.taobao.android.dinamicx.g.h(getDXRuntimeContext());
        if (h2 != null) {
            if (!eb5.k()) {
                try {
                    setImagePerformanceOption(imageView, decidedUrlWithExpectedSize);
                } catch (Throwable th2) {
                    h36.d(TAG, "setImagePerformanceOption", th2);
                    xv5.b(th2);
                }
            }
            DXTraceUtil.b("uikit setImage ");
            isLoadImgWhenNullClearImg_Android();
            decidedUrlWithExpectedSize.E = getFadeIn();
            decidedUrlWithExpectedSize.G = isFuzzyMatchCache();
            decidedUrlWithExpectedSize.H = isStrictMatchCache();
            if (!(getDXRuntimeContext().r() == null || getDXRuntimeContext().r().d() == null)) {
                g.c(decidedUrlWithExpectedSize, getDXRuntimeContext().r().d().k());
            }
            if (g.b(decidedUrlWithExpectedSize) <= 0 && getDXRuntimeContext() != null && getDXRuntimeContext().s() != null && !getDXRuntimeContext().s().o()) {
                if (eb5.m()) {
                    g.c(decidedUrlWithExpectedSize, 1);
                } else if (eb5.l()) {
                    g.c(decidedUrlWithExpectedSize, 2);
                }
            }
            if (isZoomEnabled()) {
                decidedUrlWithExpectedSize.d = false;
            }
            h2.b(imageView, str, decidedUrlWithExpectedSize);
            DXTraceUtil.c();
            DXTraceUtil.b("uikit setFilterToImageView ");
            lle.b(imageView, this.filterType);
            DXTraceUtil.c();
        }
    }
}
