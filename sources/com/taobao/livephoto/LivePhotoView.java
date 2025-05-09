package com.taobao.livephoto;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.e;
import com.taobao.livephoto.watermask.WaterMaskView;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import tb.ayw;
import tb.b75;
import tb.d75;
import tb.ftb;
import tb.nbe;
import tb.q8d;
import tb.t2o;
import tb.ulc;
import tb.utb;
import tb.y95;
import tb.ytb;
import tb.zxw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LivePhotoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LivePhotoView";
    private String mCoverLocalPath;
    private e.c mDwBuilder;
    private com.taobao.avplayer.e mDwLivePhotoView;
    private ImageView mLiveIcon;
    private String mVideoLocalPath;
    private boolean mWidthAndHeightSet = false;
    private boolean mNeedShowLiveIcon = false;
    private boolean isPlaying = false;
    private Pair<Drawable, String> unSavedWaterMask = null;
    private final nbe mWaterMaskListener = getWaterMaskListener();
    private final List<ulc> mListeners = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zxw f11001a;

        public a(LivePhotoView livePhotoView, zxw zxwVar) {
            this.f11001a = zxwVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                this.f11001a.m();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            int i10 = i4 - i2;
            AdapterForTLog.loge(LivePhotoView.TAG, "onLayoutChange: newWidth = " + i9 + ", newHeight = " + i10 + ", oldWidth = " + (i7 - i5) + ", oldHeight = " + (i8 - i6));
            if (i9 > 0 && i10 > 0) {
                LivePhotoView.this.setWidthAndHeight(i9, i10);
                LivePhotoView.this.start();
                LivePhotoView.this.removeOnLayoutChangeListener(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements ytb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ytb
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                return;
            }
            if (LivePhotoView.access$000(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                LivePhotoView.access$300(LivePhotoView.this).setVisibility(8);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoInfo(obj, j, j2, j3, obj2);
            }
        }

        @Override // tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPlay");
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoPlay();
            }
        }

        @Override // tb.ytb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPrepared");
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoPrepared(obj);
            }
        }

        @Override // tb.ytb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.ytb
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoScreenChanged, screenType=" + dWVideoScreenType);
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoScreenChanged(dWVideoScreenType);
            }
        }

        @Override // tb.ytb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoSeekTo, currentPosition=" + i);
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoSeekTo(i);
            }
        }

        @Override // tb.ytb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoClose, cover visible");
            LivePhotoView.access$002(LivePhotoView.this, false);
            if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoClose();
            }
        }

        @Override // tb.ytb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoComplete, cover visible");
            LivePhotoView.access$002(LivePhotoView.this, false);
            if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
            }
            if (LivePhotoView.access$400(LivePhotoView.this) != null) {
                LivePhotoView.access$400(LivePhotoView.this).h();
                LivePhotoView.access$400(LivePhotoView.this).j();
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoComplete();
            }
        }

        @Override // tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoError, cover visible, what=" + i + ", extra=" + i2);
            LivePhotoView.access$002(LivePhotoView.this, false);
            if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoError(obj, i, i2);
            }
        }

        @Override // tb.ytb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPause, cover visible");
            LivePhotoView.access$002(LivePhotoView.this, false);
            if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoPause(z);
            }
        }

        @Override // tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoStart");
            LivePhotoView.access$002(LivePhotoView.this, true);
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.onVideoStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements ftb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ftb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12779940", new Object[]{this, str});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onCoverImgSavedCompleted: imgUrl=" + str);
            LivePhotoView.access$502(LivePhotoView.this, str);
            if (LivePhotoView.access$600(LivePhotoView.this) && LivePhotoView.access$700(LivePhotoView.this) != null) {
                LivePhotoView livePhotoView = LivePhotoView.this;
                livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                LivePhotoView.access$702(LivePhotoView.this, null);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.a(str);
            }
        }

        @Override // tb.ftb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("347ceed6", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onCoverShowedSuccess: onCoverShowedSuccess");
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.b();
            }
        }

        @Override // tb.ftb
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("364424f8", new Object[]{this});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onCoverShowedFailed: onCoverShowedFailed");
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.c();
            }
        }

        @Override // tb.ftb
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fd82f11", new Object[]{this, str});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onVideoSavedCompleted: videoLocalPath=" + LivePhotoView.access$800(LivePhotoView.this));
            LivePhotoView.access$802(LivePhotoView.this, str);
            if (LivePhotoView.access$600(LivePhotoView.this) && LivePhotoView.access$700(LivePhotoView.this) != null) {
                LivePhotoView livePhotoView = LivePhotoView.this;
                livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                LivePhotoView.access$702(LivePhotoView.this, null);
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.g(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements nbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.nbe
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94045c6f", new Object[]{this, str});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onWaterMaskFileFail: errorInfo=" + str);
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.d(str);
            }
        }

        @Override // tb.nbe
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd59a914", new Object[]{this, str});
                return;
            }
            AdapterForTLog.logd(LivePhotoView.TAG, "onWaterMaskFileSuccess: filePath=" + str);
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.e(str);
            }
        }

        @Override // tb.nbe
        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2efbf40f", new Object[]{this, new Integer(i)});
                return;
            }
            for (ulc ulcVar : LivePhotoView.access$100(LivePhotoView.this)) {
                ulcVar.f(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements q8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.q8d
        public void a(String[] strArr, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e648db2a", new Object[]{this, strArr, iArr});
            } else if (!ayw.a(LivePhotoView.this.getContext())) {
                Toast.makeText(LivePhotoView.this.getContext(), LivePhotoView.this.getContext().getString(R.string.request_permission), 1).show();
            } else if (LivePhotoView.access$700(LivePhotoView.this) != null) {
                LivePhotoView livePhotoView = LivePhotoView.this;
                livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                LivePhotoView.access$702(LivePhotoView.this, null);
            }
        }
    }

    static {
        t2o.a(732954628);
    }

    public LivePhotoView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ boolean access$000(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2882519b", new Object[]{livePhotoView})).booleanValue();
        }
        return livePhotoView.isPlaying;
    }

    public static /* synthetic */ boolean access$002(LivePhotoView livePhotoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f692fe5f", new Object[]{livePhotoView, new Boolean(z)})).booleanValue();
        }
        livePhotoView.isPlaying = z;
        return z;
    }

    public static /* synthetic */ List access$100(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84ee56ef", new Object[]{livePhotoView});
        }
        return livePhotoView.mListeners;
    }

    public static /* synthetic */ boolean access$200(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3052f1d", new Object[]{livePhotoView})).booleanValue();
        }
        return livePhotoView.mNeedShowLiveIcon;
    }

    public static /* synthetic */ ImageView access$300(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("dc2f4af6", new Object[]{livePhotoView});
        }
        return livePhotoView.mLiveIcon;
    }

    public static /* synthetic */ com.taobao.avplayer.e access$400(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.avplayer.e) ipChange.ipc$dispatch("9fda2b7a", new Object[]{livePhotoView});
        }
        return livePhotoView.mDwLivePhotoView;
    }

    public static /* synthetic */ String access$502(LivePhotoView livePhotoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cfb99f8", new Object[]{livePhotoView, str});
        }
        livePhotoView.mCoverLocalPath = str;
        return str;
    }

    public static /* synthetic */ boolean access$600(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880aea21", new Object[]{livePhotoView})).booleanValue();
        }
        return livePhotoView.isResourcesReady();
    }

    public static /* synthetic */ Pair access$700(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8a150fa8", new Object[]{livePhotoView});
        }
        return livePhotoView.unSavedWaterMask;
    }

    public static /* synthetic */ Pair access$702(LivePhotoView livePhotoView, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9fe9fdc4", new Object[]{livePhotoView, pair});
        }
        livePhotoView.unSavedWaterMask = pair;
        return pair;
    }

    public static /* synthetic */ String access$800(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fae7ee1", new Object[]{livePhotoView});
        }
        return livePhotoView.mVideoLocalPath;
    }

    public static /* synthetic */ String access$802(LivePhotoView livePhotoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7ff8ed5", new Object[]{livePhotoView, str});
        }
        livePhotoView.mVideoLocalPath = str;
        return str;
    }

    private int getCoverViewIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4166ae0", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar == null) {
            return 0;
        }
        View childAt = eVar.k().getChildAt(1);
        if (childAt instanceof ImageView) {
            return ((ImageView) childAt).getDrawable().getIntrinsicHeight();
        }
        return 0;
    }

    private int getCoverViewIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfcd8aa1", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar == null) {
            return 0;
        }
        View childAt = eVar.k().getChildAt(1);
        if (childAt instanceof ImageView) {
            return ((ImageView) childAt).getDrawable().getIntrinsicWidth();
        }
        return 0;
    }

    private ftb getLivePhotoListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ftb) ipChange.ipc$dispatch("1fcb2496", new Object[]{this});
        }
        return new d();
    }

    private q8d getPermissionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q8d) ipChange.ipc$dispatch("c5af5968", new Object[]{this});
        }
        return new f();
    }

    private ytb getVideoLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytb) ipChange.ipc$dispatch("efa5900c", new Object[]{this});
        }
        return new c();
    }

    private nbe getWaterMaskListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbe) ipChange.ipc$dispatch("7ae8fe47", new Object[]{this});
        }
        return new e();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mLiveIcon = (ImageView) ((FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.live_photo_view, this)).findViewById(R.id.live_icon);
        this.mDwBuilder = new e.c((Activity) getContext()).j(false).o(getVideoLifecycleListener()).f(getLivePhotoListener()).d(new d75()).m(new y95()).c(new b75()).n(DWAspectRatio.DW_CENTER_CROP).p("NonTBVideo").b("DWTEST").i(true);
    }

    public static /* synthetic */ Object ipc$super(LivePhotoView livePhotoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/livephoto/LivePhotoView");
    }

    private boolean isResourcesReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9556e2d3", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mVideoLocalPath) || TextUtils.isEmpty(this.mCoverLocalPath)) {
            return false;
        }
        return true;
    }

    public void addListener(ulc ulcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4382d8", new Object[]{this, ulcVar});
        } else if (ulcVar != null) {
            this.mListeners.add(ulcVar);
        }
    }

    public void autoStartAfterLayoutChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b9e6ca", new Object[]{this});
        } else {
            addOnLayoutChangeListener(new b());
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mDwLivePhotoView != null) {
            ((FrameLayout) findViewById(R.id.live_photo_container)).removeView(this.mDwLivePhotoView.k());
            this.mDwLivePhotoView.f();
            this.mDwLivePhotoView = null;
            this.mWidthAndHeightSet = false;
            this.mListeners.clear();
        }
    }

    public String getCoverPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25093cf3", new Object[]{this});
        }
        return this.mCoverLocalPath;
    }

    public View getLivePhotoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b6afbfe", new Object[]{this});
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar != null) {
            return eVar.k();
        }
        return null;
    }

    public String getVideoPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45bc20af", new Object[]{this});
        }
        return this.mVideoLocalPath;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.isPlaying;
    }

    public void loadVideoAndImagePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4203565", new Object[]{this});
            return;
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar != null) {
            eVar.h();
            this.mDwLivePhotoView.j();
        }
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "prepare() height = " + getHeight() + ", width = " + getWidth());
        this.mDwLivePhotoView = this.mDwBuilder.a();
        ((FrameLayout) findViewById(R.id.live_photo_container)).addView(this.mDwLivePhotoView.k(), new FrameLayout.LayoutParams(-1, -1));
    }

    public void removeListener(ulc ulcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccccaad5", new Object[]{this, ulcVar});
        } else if (ulcVar != null) {
            this.mListeners.remove(ulcVar);
        }
    }

    public boolean saveToAlbum(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1261e6f0", new Object[]{this, drawable, str})).booleanValue();
        }
        if (drawable == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!ayw.a(getContext())) {
            this.unSavedWaterMask = new Pair<>(drawable, str);
            ayw.c(getContext(), getPermissionListener());
            return false;
        } else if (!isResourcesReady()) {
            this.unSavedWaterMask = new Pair<>(drawable, str);
            return false;
        } else {
            String saveBitmapAsFile = WaterMaskView.saveBitmapAsFile(getContext(), drawable, str);
            zxw zxwVar = new zxw(getContext());
            zxwVar.j(this.mVideoLocalPath, saveBitmapAsFile, this.mWaterMaskListener);
            zxwVar.i(this.mCoverLocalPath, saveBitmapAsFile, getCoverViewIntrinsicWidth(), getCoverViewIntrinsicHeight(), this.mWaterMaskListener);
            addOnAttachStateChangeListener(new a(this, zxwVar));
            return true;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mDwBuilder.b(str);
        }
    }

    public void setConfigAdapter(b75 b75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683c23b", new Object[]{this, b75Var});
        } else {
            this.mDwBuilder.c(b75Var);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        e.c cVar = this.mDwBuilder;
        if (cVar != null) {
            cVar.k(str);
        }
    }

    public void setInitVideoScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702c0303", new Object[]{this, dWVideoScreenType});
        } else {
            this.mDwBuilder.g(dWVideoScreenType);
        }
    }

    public void setIsMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cdd0e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDwBuilder.i(z);
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar != null) {
            eVar.l(z);
        }
    }

    public void setLiveIconDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982adef0", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLiveIconLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d260935f", new Object[]{this, layoutParams});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
    }

    public void setLiveIconVisible(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204771a2", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView != null) {
            this.mNeedShowLiveIcon = z;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setLivePhotoInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5c6aa5", new Object[]{this, jSONObject});
            return;
        }
        e.c cVar = this.mDwBuilder;
        if (cVar != null) {
            cVar.h(jSONObject);
        }
    }

    public void setNeedLongClickStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef94925f", new Object[]{this, new Boolean(z)});
        } else {
            this.mDwBuilder.j(z);
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mDwBuilder.l(str);
        }
    }

    public void setUserInfoAdapter(utb utbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b58e", new Object[]{this, utbVar});
        } else {
            this.mDwBuilder.m(utbVar);
        }
    }

    public void setVideoAspectRatio(DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89072586", new Object[]{this, dWAspectRatio});
        } else {
            this.mDwBuilder.n(dWAspectRatio);
        }
    }

    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mDwBuilder.p(str);
        }
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        e.c cVar = this.mDwBuilder;
        if (cVar != null) {
            cVar.q(str);
        }
    }

    public void setVolume(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar != null) {
            eVar.n(f2);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "start() mDwLivePhotoView = " + this.mDwLivePhotoView + ", height = " + getHeight() + ", width = " + getWidth());
        if (this.mDwLivePhotoView == null) {
            prepare();
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            autoStartAfterLayoutChange();
            return;
        }
        if (!this.mWidthAndHeightSet) {
            this.mDwBuilder.e(getHeight()).r(getWidth());
        }
        this.mDwLivePhotoView.o();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        com.taobao.avplayer.e eVar = this.mDwLivePhotoView;
        if (eVar != null) {
            eVar.p();
        }
    }

    public void setWidthAndHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701eeb61", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AdapterForTLog.logd(TAG, "setWidthAndHeight() width = " + i + ", height = " + i2);
        e.c cVar = this.mDwBuilder;
        if (cVar != null) {
            cVar.r(i).e(i2);
            this.mWidthAndHeightSet = true;
        }
    }

    public LivePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
