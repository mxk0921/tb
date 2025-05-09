package com.taobao.android.fluid.framework.preload.dwinstance;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a7m;
import tb.aps;
import tb.ar9;
import tb.atb;
import tb.bbw;
import tb.grm;
import tb.h3e;
import tb.ir9;
import tb.jrm;
import tb.nj9;
import tb.ntm;
import tb.nwv;
import tb.qe7;
import tb.qtm;
import tb.r8e;
import tb.re7;
import tb.ryr;
import tb.s0j;
import tb.t2o;
import tb.t7b;
import tb.usm;
import tb.vbd;
import tb.xau;
import tb.z5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PreRenderDWInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FIRST_FRAME_VIEW_TOP_LEVEL = 51;
    private static final String TAG = "PickPreloadController_PreRenderDWInstance_PreloadVideoModule";
    public static final int VIDEO_VIEW_TOP_LEVEL = 50;
    private boolean isFromLauncher;
    private boolean mColdStartGetCacheFlag;
    private ViewGroup mContainer;
    private Context mContext;
    private FluidInstance mFluidInstance;
    private grm mPreloadABConfig;
    private ntm mPreloadVideoData;
    private Uri mUri;
    private r8e mVideoCommentSizeObject;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f7893a;

        public a(atb atbVar) {
            this.f7893a = atbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ir9.b(PreRenderDWInstance.TAG, "[preloadvideo]start pause/playVideo in hot launch");
                this.f7893a.pauseVideo();
                this.f7893a.playVideo();
            } catch (Throwable th) {
                ir9.b(PreRenderDWInstance.TAG, "pause/playVideo:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (PreRenderDWInstance.access$700(PreRenderDWInstance.this).f24942a != null) {
                ViewGroup view = PreRenderDWInstance.access$700(PreRenderDWInstance.this).f24942a.getView();
                if ((PreRenderDWInstance.access$800(PreRenderDWInstance.this) instanceof TNodeView) && view != null && ((TNodeView) PreRenderDWInstance.access$800(PreRenderDWInstance.this)).containView(view)) {
                    ir9.b(PreRenderDWInstance.TAG, "detachVideoViewFromContainerSafely from tnodeview");
                    ((TNodeView) PreRenderDWInstance.access$800(PreRenderDWInstance.this)).removeUpperView(view);
                }
            }
            TUrlImageView tUrlImageView = PreRenderDWInstance.access$700(PreRenderDWInstance.this).n;
            if (tUrlImageView != null && (tUrlImageView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) tUrlImageView.getParent()).removeView(tUrlImageView);
                PreRenderDWInstance.access$700(PreRenderDWInstance.this).n = null;
                ir9.b(PreRenderDWInstance.TAG, "PickPreloadControllerNew,detachVideoViewFromContainerSafely,firstFrameImagerView移除清空");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f7895a;

        public c(PreRenderDWInstance preRenderDWInstance, long j) {
            this.f7895a = j;
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            return this.f7895a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7896a;
        public final /* synthetic */ Map b;

        public d(PreRenderDWInstance preRenderDWInstance, View view, Map map) {
            this.f7896a = view;
            this.b = map;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            if (this.f7896a.getViewTreeObserver() != null) {
                this.f7896a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            int width = this.f7896a.getWidth();
            int height = this.f7896a.getHeight();
            this.b.put("videoAttachTs", String.valueOf(System.currentTimeMillis()));
            this.b.put("videoAttachWidth", String.valueOf(width));
            this.b.put("videoAttachHeight", String.valueOf(height));
            ir9.b(PreRenderDWInstance.TAG, "[preloadvideo] videoview surface onGlobalLayout Width: " + width + ", Height: " + height);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f7898a;
        public ViewGroup b;
        public Uri c;
        public boolean d;
        public ntm e;
        public grm f;
        public FluidInstance g;

        static {
            t2o.a(468714671);
        }

        public static /* synthetic */ Context a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("7e672102", new Object[]{fVar});
            }
            return fVar.f7898a;
        }

        public static /* synthetic */ ViewGroup b(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ab8e00cc", new Object[]{fVar});
            }
            return fVar.b;
        }

        public static /* synthetic */ Uri c(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("fff5af7f", new Object[]{fVar});
            }
            return fVar.c;
        }

        public static /* synthetic */ boolean d(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d78a516b", new Object[]{fVar})).booleanValue();
            }
            return fVar.d;
        }

        public static /* synthetic */ grm e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (grm) ipChange.ipc$dispatch("3f03ab69", new Object[]{fVar});
            }
            return fVar.f;
        }

        public static /* synthetic */ ntm f(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ntm) ipChange.ipc$dispatch("81bc1aae", new Object[]{fVar});
            }
            return fVar.e;
        }

        public static /* synthetic */ FluidInstance g(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FluidInstance) ipChange.ipc$dispatch("c77490ae", new Object[]{fVar});
            }
            return fVar.g;
        }

        public PreRenderDWInstance h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreRenderDWInstance) ipChange.ipc$dispatch("5caf1ebd", new Object[]{this});
            }
            return new PreRenderDWInstance(this, null);
        }

        public f i(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("9ab7f918", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public f j(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("d8a37163", new Object[]{this, context});
            }
            this.f7898a = context;
            return this;
        }

        public f k(FluidInstance fluidInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("b510ec05", new Object[]{this, fluidInstance});
            }
            this.g = fluidInstance;
            return this;
        }

        public f l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("bd9b3fca", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public f m(grm grmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("cd3b2ac8", new Object[]{this, grmVar});
            }
            this.f = grmVar;
            return this;
        }

        public f n(ntm ntmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("9d455cb1", new Object[]{this, ntmVar});
            }
            this.e = ntmVar;
            return this;
        }

        public f o(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("b7f738c5", new Object[]{this, uri});
            }
            this.c = uri;
            return this;
        }
    }

    static {
        t2o.a(468714665);
    }

    public /* synthetic */ PreRenderDWInstance(f fVar, a aVar) {
        this(fVar);
    }

    public static /* synthetic */ ntm access$700(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("52fb8ed9", new Object[]{preRenderDWInstance});
        }
        return preRenderDWInstance.mPreloadVideoData;
    }

    public static /* synthetic */ ViewGroup access$800(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6ac3f5bc", new Object[]{preRenderDWInstance});
        }
        return preRenderDWInstance.mContainer;
    }

    public static /* synthetic */ FluidInstance access$900(PreRenderDWInstance preRenderDWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("2d47e42", new Object[]{preRenderDWInstance});
        }
        return preRenderDWInstance.mFluidInstance;
    }

    private void detachVideoViewFromContainerSafely() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6906e8b", new Object[]{this});
        } else if (this.mPreloadVideoData != null) {
            nwv.A0(new b(), 5000L);
        }
    }

    private grm getPreloadABConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (grm) ipChange.ipc$dispatch("a340840", new Object[]{this});
        }
        grm grmVar = this.mPreloadABConfig;
        if (grmVar == null) {
            return new grm(null);
        }
        return grmVar;
    }

    private static DetailCacheData getValidCacheVideoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("a9b8b256", new Object[0]);
        }
        DetailCacheData e2 = qe7.e(null);
        if (e2 != null && e2.isValid) {
            return e2;
        }
        DetailCacheData b2 = qe7.b(null);
        if (b2 != null) {
            return b2;
        }
        return null;
    }

    private static DetailCacheData getValidCacheVideoDataConvergentNew(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("86d1a35a", new Object[]{map});
        }
        DetailCacheData e2 = qe7.e(map);
        if (e2 == null || !e2.isValid || !e2.hasVideoCached) {
            DetailCacheData b2 = qe7.b(map);
            if (!aps.v() || b2 == null || !b2.isValid || !b2.hasVideoCached) {
                if (e2 == null || !e2.isValid) {
                    if (b2 == null || !b2.isValid) {
                        e2 = null;
                    }
                }
            }
            e2 = b2;
        }
        re7.b(e2, map);
        ir9.b(TAG, "查找到的最终detailCache:" + e2);
        return e2;
    }

    private boolean isDWInstanceRecycled(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f003cedd", new Object[]{this, atbVar})).booleanValue();
        }
        return atbVar.B();
    }

    private boolean isPreloadVideoValid(ntm ntmVar) {
        atb atbVar;
        ViewGroup view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db57c208", new Object[]{this, ntmVar})).booleanValue();
        }
        if (ntmVar == null || (atbVar = ntmVar.f24942a) == null || (view = atbVar.getView()) == null) {
            return false;
        }
        return !nwv.o(view.getTag(R.id.fluid_sdk_tag_video_error), false);
    }

    private void trackCacheVideo() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbfc44b", new Object[]{this});
            return;
        }
        if (!this.mColdStartGetCacheFlag) {
            this.mColdStartGetCacheFlag = true;
            z = true;
        }
        IPreloadService iPreloadService = (IPreloadService) this.mFluidInstance.getService(IPreloadService.class);
        if (iPreloadService != null && iPreloadService.getPreloadVideoTrackerManager() != null) {
            iPreloadService.getPreloadVideoTrackerManager().e(z);
        }
    }

    private boolean tryAddVideoViewToContainerAndStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a7e7c3a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ir9.b(TAG, "try add video view to container, mPreloadedVideo: " + this.mPreloadVideoData);
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidInstance.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.i(s0j.MTS_SUB_STAGE_START_VIDEO_PLAYER, s0j.MTS_TASK_START_RENDER);
        }
        boolean addVideoViewToContainerAndStart = addVideoViewToContainerAndStart(z);
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.k(s0j.MTS_SUB_STAGE_START_VIDEO_PLAYER, s0j.MTS_TASK_START_RENDER, addVideoViewToContainerAndStart);
        }
        if (addVideoViewToContainerAndStart) {
            detachVideoViewFromContainerSafely();
        }
        return addVideoViewToContainerAndStart;
    }

    public ntm executePreRender() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("75bfca68", new Object[]{this});
        }
        if (this.mPreloadVideoData != null) {
            z = renderPreloadDWInstance();
            ntm ntmVar = this.mPreloadVideoData;
            if (ntmVar.f) {
                qe7.a(ntmVar.b);
            }
        } else if (this.isFromLauncher) {
            s0j.a(s0j.GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE);
            boolean renderCacheVideo = renderCacheVideo(true);
            s0j.d(s0j.GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE);
            z = renderCacheVideo;
        } else {
            z = renderCacheVideo(false);
        }
        if (z) {
            return this.mPreloadVideoData;
        }
        return null;
    }

    public ViewGroup getPreloadVideoviewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9446f73a", new Object[]{this});
        }
        return this.mContainer;
    }

    public r8e getVideoCommentSizeObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("42367b10", new Object[]{this});
        }
        return this.mVideoCommentSizeObject;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements TNodeView.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f7897a;

        public e(boolean[] zArr) {
            this.f7897a = zArr;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.j
        public void a(TNodeView tNodeView, View view) {
            atb atbVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("253a18b8", new Object[]{this, tNodeView, view});
            } else if (view != null) {
                try {
                    if (this.f7897a[0]) {
                        ntm ntmVar = (ntm) view.getTag(R.id.fluid_sdk_tag_preloadVideo);
                        if (ntmVar != null) {
                            atbVar = ntmVar.f24942a;
                        } else {
                            atbVar = null;
                        }
                        if (atbVar != null) {
                            atbVar.playVideo();
                        }
                    }
                } catch (Exception e) {
                    FluidException.throwException(PreRenderDWInstance.access$900(PreRenderDWInstance.this), ar9.ADD_VIDEO_VIEW_TO_CONTAINER_RESUME_ERROR, e);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.j
        public void c(TNodeView tNodeView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ead75467", new Object[]{this, tNodeView, view});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.j
        public void b(TNodeView tNodeView, View view) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("415a54a3", new Object[]{this, tNodeView, view});
                return;
            }
            try {
                this.f7897a[0] = true;
                if (view != null) {
                    ntm ntmVar = (ntm) view.getTag(R.id.fluid_sdk_tag_preloadVideo);
                    atb atbVar = ntmVar != null ? ntmVar.f24942a : null;
                    if (atbVar != null) {
                        Activity k = nwv.k(tNodeView.getContext());
                        if (k == null || !k.isFinishing()) {
                            z = false;
                        }
                        ir9.b(PreRenderDWInstance.TAG, "pause preCreated DWInstance when at container, isFinish " + z);
                        atbVar.pauseVideo();
                        atbVar.b();
                        if (z) {
                            atbVar.destroy();
                            xau.u();
                        }
                    }
                }
            } catch (Exception e) {
                FluidException.throwException(PreRenderDWInstance.access$900(PreRenderDWInstance.this), ar9.ADD_VIDEO_VIEW_TO_CONTAINER_PAUSE_ERROR, e);
            }
        }
    }

    private PreRenderDWInstance(f fVar) {
        this.mContext = f.a(fVar);
        this.mContainer = f.b(fVar);
        this.mUri = f.c(fVar);
        this.isFromLauncher = f.d(fVar);
        this.mPreloadABConfig = f.e(fVar);
        this.mPreloadVideoData = f.f(fVar);
        this.mFluidInstance = f.g(fVar);
    }

    private boolean renderCacheVideo(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5382842", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ir9.b(TAG, "renderCacheVideo, fromLauncher=" + z);
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidInstance.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.e(s0j.MTS_TAG_IS_COLD_LAUNCH, Boolean.valueOf(z));
            tab2ServiceDelegate.e(s0j.MTS_TAG_PRELOAD_TYPE, -1);
            z2 = tab2ServiceDelegate.d();
        } else {
            z2 = false;
        }
        if (z || !z2 || !aps.a()) {
            this.mPreloadVideoData = buildPreloadVideoIfCacheData(this.mContext, this.mContainer, z, this.mUri);
        } else {
            ir9.b(TAG, "renderCacheVideo fail for hasInitSchedulerMsg");
        }
        boolean tryAddVideoViewToContainerAndStart = tryAddVideoViewToContainerAndStart(false);
        if (!tryAddVideoViewToContainerAndStart) {
            ir9.b(TAG, "renderCacheVideo return for added is false");
            ViewGroup viewGroup = this.mContainer;
            if (viewGroup instanceof TNodeView) {
                ((TNodeView) viewGroup).setSuspendLayoutState(false);
            }
        }
        return tryAddVideoViewToContainerAndStart;
    }

    private boolean renderPreloadDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c89126", new Object[]{this})).booleanValue();
        }
        ir9.b(TAG, "[preloadvideo]renderPreloadDWInstance, mPreloadedVideo: " + this.mPreloadVideoData);
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidInstance.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.e(s0j.MTS_TAG_PRELOAD_TYPE, Integer.valueOf(this.mPreloadVideoData.p ? 3 : 1));
        }
        boolean tryAddVideoViewToContainerAndStart = tryAddVideoViewToContainerAndStart(true);
        atb atbVar = this.mPreloadVideoData.f24942a;
        if (tryAddVideoViewToContainerAndStart && isDWInstanceRecycled(atbVar)) {
            if (!usm.c()) {
                return true;
            }
            nwv.y0(new a(atbVar));
        }
        return tryAddVideoViewToContainerAndStart;
    }

    private boolean addVideoViewToContainerAndStart(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8c7df", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ntm ntmVar = this.mPreloadVideoData;
        if (ntmVar == null) {
            ir9.b(TAG, "[preloadvideo]addVideoViewToContainer return for preloadVideoData is null");
            return false;
        }
        atb atbVar = ntmVar.f24942a;
        if (atbVar == null) {
            ir9.b(TAG, "[preloadvideo]addVideoViewToContainer return for instance is null");
            return false;
        }
        ViewGroup view = atbVar.getView();
        qtm.n(view);
        Context context = this.mContainer.getContext();
        if (view == null || view.getParent() != null || !isPreloadVideoValid(this.mPreloadVideoData) || !this.mPreloadVideoData.a(context)) {
            ir9.b(TAG, "[preloadvideo]addVideoViewToContainer return for videoView is not valid");
            return false;
        }
        view.setTag(R.id.fluid_sdk_tag_preloadVideo, this.mPreloadVideoData);
        view.setTag(R.id.fluid_sdk_tag_video_precreated, Boolean.valueOf(z));
        view.setId(R.id.fluid_sdk_preattach_videoview);
        view.setTag(R.id.fluid_sdk_tag_tnodeView, this.mContainer);
        r8e l = bbw.l(context, view, true, getPreloadABConfig().b(), this.mFluidInstance);
        this.mVideoCommentSizeObject = l;
        atbVar.f(l.d, l.c);
        atbVar.i(DWInstanceType.VIDEO);
        ir9.b(TAG, "[画幅]预加载视频 " + l);
        atbVar.l(new c(this, System.currentTimeMillis()));
        HashMap hashMap = new HashMap();
        hashMap.put("networkQuality", String.valueOf(NetworkQualityMonitor.getGlobalNetworkQuality()));
        if (NetworkStatusHelper.getStatus() != null) {
            str = NetworkStatusHelper.getStatus().getType();
        } else {
            str = "none";
        }
        hashMap.put("networkStatus", String.valueOf(str));
        hashMap.put("netLowPowerMode", String.valueOf(NetworkStatusHelper.getLowPowerMode()));
        hashMap.put("netSavePower", String.valueOf(NetworkStatusHelper.isSavePower()));
        hashMap.put("netSpeed", String.valueOf(z5r.l()));
        view.setTag(R.id.fluid_sdk_tag_preload_netinfo, hashMap);
        ir9.b(TAG, "before dw start, logToken: " + atbVar.t());
        long currentTimeMillis = System.currentTimeMillis();
        atbVar.start();
        long currentTimeMillis2 = System.currentTimeMillis();
        ir9.b(TAG, "after dw start, logToken: " + atbVar.t());
        view.setTag(R.id.fluid_sdk_tag_play_before_start_time, String.valueOf(currentTimeMillis));
        view.setTag(R.id.fluid_sdk_tag_play_start_time, Long.valueOf(currentTimeMillis2));
        ir9.b(TAG, "[preloadvideo][stagecost]预创建播放器start, cost=" + (currentTimeMillis2 - currentTimeMillis) + ";videostate:" + atbVar.getVideoState() + " ,preCreated=" + z + ", preloadedVideo=" + this.mPreloadVideoData);
        s0j.f(context, atbVar, null);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new d(this, view, hashMap));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l.d, l.c);
        layoutParams.topMargin = l.e;
        layoutParams.bottomMargin = 0;
        layoutParams.width = l.d;
        layoutParams.height = l.c;
        ir9.b(TAG, "[画幅]预加载视频 bottomMargin=0,topMargin=" + layoutParams.topMargin + ",width=" + l.d + "; height=" + l.c + ",showMarginTop=" + l.e);
        e eVar = new e(new boolean[]{false});
        ViewGroup viewGroup = this.mContainer;
        if (viewGroup instanceof TNodeView) {
            ((TNodeView) viewGroup).addUpperView(view, layoutParams, 50, eVar);
        } else if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        ir9.b(TAG, "[preloadvideo] videoview surface addView... ");
        ntm ntmVar2 = this.mPreloadVideoData;
        if (ntmVar2.m != null || (!TextUtils.isEmpty(ntmVar2.l) && z)) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            ntm ntmVar3 = this.mPreloadVideoData;
            Drawable drawable = ntmVar3.m;
            if (drawable != null) {
                tUrlImageView.setImageDrawable(drawable);
            } else {
                tUrlImageView.setImageUrl(ntmVar3.l);
            }
            tUrlImageView.setLayoutParams(layoutParams);
            tUrlImageView.setScaleType(l.f);
            ViewGroup viewGroup2 = this.mContainer;
            if (viewGroup2 instanceof TNodeView) {
                ((TNodeView) viewGroup2).addUpperView(tUrlImageView, layoutParams, 51, eVar);
            } else if (viewGroup2 != null) {
                viewGroup2.addView(tUrlImageView, layoutParams);
            }
            this.mPreloadVideoData.n = tUrlImageView;
            ir9.b(TAG, "PickPreloadControllerNew,addVideoViewToContainer,首帧图加载到container上:" + this.mPreloadVideoData.n);
        }
        this.mPreloadVideoData.j(0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ntm buildPreloadVideoIfCacheData(Context context, ViewGroup viewGroup, boolean z, Uri uri) {
        List a2;
        ntm ntmVar;
        DetailCacheData detailCacheData;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("3605d9cf", new Object[]{this, context, viewGroup, new Boolean(z), uri});
        }
        String str2 = null;
        if (!(context instanceof Activity)) {
            ir9.b(TAG, "当前的Context不是Activity的Context，return");
            return null;
        }
        Iterator it = jrm.a(uri, z).iterator();
        ntm ntmVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 0) {
                h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidInstance.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
                if (tab2ServiceDelegate != null) {
                    tab2ServiceDelegate.i(s0j.MTS_SUB_STAGE_LOAD_CACHE, s0j.MTS_TASK_START_RENDER);
                }
                ryr.b(this.mContext, str2, "gg_pickpreload_use_cache");
                IPreCacheService iPreCacheService = (IPreCacheService) this.mFluidInstance.getService(IPreCacheService.class);
                if (iPreCacheService == null || !iPreCacheService.enablePreloadVideoUseCache()) {
                    detailCacheData = str2;
                } else {
                    ir9.b(TAG, "[preloadvideo]useCache, get local video...");
                    detailCacheData = iPreCacheService.getCacheData();
                }
                HashMap hashMap = new HashMap();
                DetailCacheData detailCacheData2 = detailCacheData;
                if (detailCacheData == null) {
                    detailCacheData2 = getValidCacheVideoDataConvergentNew(hashMap);
                }
                t7b d2 = a7m.d(context);
                boolean D = d2 != null ? d2.D() : false;
                hashMap.put("isPlayerCacheValid", String.valueOf(D));
                if (z) {
                    str = "render_normal";
                } else {
                    str = "render_launcher";
                }
                hashMap.put("useCacheScene", str);
                str2 = null;
                ryr.d(this.mContext, null, "gg_pickpreload_use_cache", hashMap);
                boolean z2 = detailCacheData2 != 0 && detailCacheData2.isValid;
                boolean z3 = detailCacheData2 != 0 && detailCacheData2.hasVideoCached;
                if (tab2ServiceDelegate != null) {
                    tab2ServiceDelegate.e(s0j.MTS_TAG_IS_VIDEO_CACHED, Boolean.valueOf(z3));
                    tab2ServiceDelegate.e(s0j.MTS_TAG_IS_CACHE_VALID, Boolean.valueOf(z2));
                    tab2ServiceDelegate.e(s0j.MTS_TAG_IS_PLAYER_CACHE_VALID, Boolean.valueOf(D));
                    tab2ServiceDelegate.k(s0j.MTS_SUB_STAGE_LOAD_CACHE, s0j.MTS_TASK_START_RENDER, detailCacheData2 != 0 && detailCacheData2.isValid);
                }
                if (z2) {
                    ntmVar = qtm.a(this.mFluidInstance, context, viewGroup, z, uri, detailCacheData2);
                    if (nwv.i(detailCacheData2.sceneName, IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED)) {
                        qe7.a(detailCacheData2.contentId);
                    } else if ((detailCacheData2 instanceof vbd) && iPreCacheService != null) {
                        iPreCacheService.exposedDeleteCacheData(detailCacheData2.contentId);
                    }
                } else {
                    ntmVar = ntmVar2;
                }
            } else {
                ntmVar = intValue == 1 ? qtm.d(this.mFluidInstance, context, viewGroup, z, uri) : ntmVar2;
            }
            if (ntmVar != null) {
                ntmVar2 = ntmVar;
                break;
            }
            ntmVar2 = ntmVar;
        }
        trackCacheVideo();
        ir9.b(TAG, "[preloadvideo]buildPreloadVideoIfCacheData:" + ntmVar2 + " strategy:" + jrm.b(a2));
        return ntmVar2;
    }
}
