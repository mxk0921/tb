package com.taobao.android.tab2liveroom.liveroom;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import tb.akt;
import tb.f0o;
import tb.g9c;
import tb.mcd;
import tb.n6r;
import tb.o3s;
import tb.q6f;
import tb.s0j;
import tb.scd;
import tb.sj9;
import tb.t2o;
import tb.tfi;
import tb.tfs;
import tb.ufi;
import tb.ugw;
import tb.x3h;
import tb.znm;
import tb.zrm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class LiveRoomRenderInterceptDelegate extends f0o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE = 12101;
    public static final int STATE_REUSED = 100;
    private static boolean liveRoomRenderIntercepted = false;
    private ViewGroup frameLayout;
    private boolean isInitialization;
    private boolean mediaHasReleaseAndDestroy = false;
    private mcd preloadLiveInstance;
    private ViewGroup rootView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9496a;
        public final /* synthetic */ ViewGroup b;

        public a(Context context, ViewGroup viewGroup) {
            this.f9496a = context;
            this.b = viewGroup;
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
            } else {
                tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onGetVideoInfoFail");
            }
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            ArrayList<MediaData.QualityLiveItem> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
                return;
            }
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onGetVideoInfoSuccess");
            MediaData m = znm.m(simpleVideoInfo);
            if (m != null && (arrayList = m.liveUrlList) != null && !arrayList.isEmpty()) {
                LiveRoomRenderInterceptDelegate.access$000(LiveRoomRenderInterceptDelegate.this, this.f9496a, m, null, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
                return;
            }
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onGetVideoInfoFail");
            LiveRoomRenderInterceptDelegate.this.setState(-1, null);
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            ArrayList<MediaData.QualityLiveItem> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
                return;
            }
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onGetVideoInfoSuccess");
            MediaData m = znm.m(simpleVideoInfo);
            if (m == null || (arrayList = m.liveUrlList) == null || arrayList.isEmpty()) {
                LiveRoomRenderInterceptDelegate.this.setState(-1, null);
                return;
            }
            LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate = LiveRoomRenderInterceptDelegate.this;
            LiveRoomRenderInterceptDelegate.access$000(liveRoomRenderInterceptDelegate, LiveRoomRenderInterceptDelegate.access$100(liveRoomRenderInterceptDelegate).getContext(), m, null, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements scd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9498a;

        public c(View view) {
            this.f9498a = view;
        }

        @Override // tb.scd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe17d436", new Object[]{this});
                return;
            }
            LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate = LiveRoomRenderInterceptDelegate.this;
            liveRoomRenderInterceptDelegate.setState(100, LiveRoomRenderInterceptDelegate.access$300(liveRoomRenderInterceptDelegate));
        }

        @Override // tb.scd
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
                return;
            }
            View view = this.f9498a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        @Override // tb.scd
        public void c(BaseStatePlayer baseStatePlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdb6d58f", new Object[]{this, baseStatePlayer, new Long(j), new Long(j2), new Long(j3), obj});
            }
        }

        @Override // tb.scd
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7d615fd", new Object[]{this});
                return;
            }
            View view = this.f9498a;
            if (view != null && view.getVisibility() == 0) {
                this.f9498a.setVisibility(8);
            }
        }

        @Override // tb.scd
        public void e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97b6435a", new Object[]{this, viewGroup});
            } else if (LiveRoomRenderInterceptDelegate.access$200(LiveRoomRenderInterceptDelegate.this) != null && viewGroup != null) {
                LiveRoomRenderInterceptDelegate.access$200(LiveRoomRenderInterceptDelegate.this).addView(viewGroup, 0);
            }
        }

        @Override // tb.scd
        public void f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93f493d0", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.scd
        public void g(mcd mcdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616bf76b", new Object[]{this, mcdVar});
            } else {
                LiveRoomRenderInterceptDelegate.this.setState(-1, null);
            }
        }

        @Override // tb.scd
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bed2268", new Object[]{this});
                return;
            }
            LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate = LiveRoomRenderInterceptDelegate.this;
            liveRoomRenderInterceptDelegate.setState(2, LiveRoomRenderInterceptDelegate.access$300(liveRoomRenderInterceptDelegate));
            ugw.c(LiveRoomRenderInterceptDelegate.access$300(LiveRoomRenderInterceptDelegate.this));
        }

        @Override // tb.scd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate = LiveRoomRenderInterceptDelegate.this;
            liveRoomRenderInterceptDelegate.setState(3, LiveRoomRenderInterceptDelegate.access$300(liveRoomRenderInterceptDelegate));
        }

        @Override // tb.scd
        public void onTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13bc209", new Object[]{this});
                return;
            }
            LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate = LiveRoomRenderInterceptDelegate.this;
            liveRoomRenderInterceptDelegate.setState(4, LiveRoomRenderInterceptDelegate.access$300(liveRoomRenderInterceptDelegate));
        }
    }

    static {
        t2o.a(779092120);
    }

    public LiveRoomRenderInterceptDelegate(TNodeView tNodeView, Uri uri) {
        super(tNodeView, uri);
    }

    public static /* synthetic */ void access$000(LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate, Context context, MediaData mediaData, String str, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae8cd7d", new Object[]{liveRoomRenderInterceptDelegate, context, mediaData, str, viewGroup});
        } else {
            liveRoomRenderInterceptDelegate.createMediaPlayer(context, mediaData, str, viewGroup);
        }
    }

    public static /* synthetic */ TNodeView access$100(LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("d1cf066a", new Object[]{liveRoomRenderInterceptDelegate});
        }
        return liveRoomRenderInterceptDelegate.container;
    }

    public static /* synthetic */ ViewGroup access$200(LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("29fc45c7", new Object[]{liveRoomRenderInterceptDelegate});
        }
        return liveRoomRenderInterceptDelegate.frameLayout;
    }

    public static /* synthetic */ ViewGroup access$300(LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5363bea6", new Object[]{liveRoomRenderInterceptDelegate});
        }
        return liveRoomRenderInterceptDelegate.rootView;
    }

    private int checkState(int i) {
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("375b0486", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == -1 ? (i3 = this.state) == 0 || i3 == 1 : i == 100 ? this.state == 3 : !(i == 1 ? this.state != 0 : i == 2 ? this.state != 1 : i == 3 ? this.state != 2 : !(i != 4 || (i4 = this.state) == 2 || i4 == 3))) {
            i2 = i;
        } else {
            i2 = this.state;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "checkState finalState:" + i2 + " oldState:" + this.state + " newState:" + i);
        return i2;
    }

    private void createMediaPlayer(Context context, MediaData mediaData, String str, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b1341", new Object[]{this, context, mediaData, str, viewGroup});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "createMediaPlayer");
        ufi ufiVar = new ufi();
        if (!TextUtils.isEmpty(str)) {
            ufiVar.f29342a = str;
        } else {
            String b2 = com.taobao.taolive.sdk.ui.media.a.b(mediaData, null);
            ufiVar.b = b2;
            ufiVar.f29342a = tfi.h(b2);
        }
        if (viewGroup == null) {
            this.rootView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tab2_liveroom_layoutmanager_liveroom_root, (ViewGroup) null, false);
        } else {
            this.rootView = viewGroup;
        }
        this.frameLayout = (ViewGroup) this.rootView.findViewById(R.id.rootVideoFrameLayout);
        mcd a2 = zrm.a(new PreloadParams.a(context).f0(ufiVar).Q(mediaData).b0(1).V(new c(this.rootView.findViewById(R.id.taolive_top_afc_loading))).H(0L).G());
        this.preloadLiveInstance = a2;
        a2.b();
    }

    public static void init(Context context, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0247a0", new Object[]{context, uri, str});
            return;
        }
        try {
            q6f.d((Application) context.getApplicationContext(), x3h.b(uri, str));
        } catch (Throwable th) {
            o3s.b("InitTaoLiveColdLaunch", "executeLiveTabPreloadTask:" + th.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(LiveRoomRenderInterceptDelegate liveRoomRenderInterceptDelegate, String str, Object... objArr) {
        if (str.hashCode() == -904412663) {
            super.setState(((Number) objArr[0]).intValue(), objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveRoomRenderInterceptDelegate");
    }

    @Override // tb.f0o
    public void setState(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca17c209", new Object[]{this, new Integer(i), obj});
            return;
        }
        int checkState = checkState(i);
        if (checkState == 3 || checkState == 4 || checkState == -1) {
            updateRootViewRenderFinish(this.rootView);
        }
        if (checkState == 100 || checkState == 4) {
            releaseMediaPlay(this.preloadLiveInstance, this.rootView, this.frameLayout);
        }
        if (checkState == 100) {
            this.container.removeUpperView(this.rootView);
        }
        super.setState(checkState, obj);
    }

    public void startRenderForNative(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91f42d8", new Object[]{this, context, viewGroup});
        } else if (akt.p2("enableReuseLivePlayer", true) && !liveRoomRenderIntercepted) {
            liveRoomRenderIntercepted = true;
            if (znm.k().p() && n6r.d(context)) {
                TaoLiveLaunchInitializer.init();
                znm.k().v(new a(context, viewGroup));
            }
        }
    }

    private void updateRootViewRenderFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dee852", new Object[]{this, view});
        } else if (!this.isInitialization) {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "updateRootViewRenderFinish");
            sj9.g(null);
            ugw.d(view);
            this.isInitialization = true;
        }
    }

    @Override // tb.f0o
    public void startRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e191f", new Object[]{this});
        } else if (!znm.k().p() || !n6r.d(this.container.getContext())) {
            setState(-1, null);
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, s0j.MTS_TASK_START_RENDER);
            TaoLiveLaunchInitializer.init();
            setState(1, null);
            znm.k().v(new b());
        }
    }

    private void releaseMediaPlay(mcd mcdVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2eae9e", new Object[]{this, mcdVar, viewGroup, viewGroup2});
        } else if (!this.mediaHasReleaseAndDestroy) {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "releaseMediaPlay");
            if (mcdVar != null) {
                mcdVar.a(false);
            }
            if (!(viewGroup == null || viewGroup2 == null)) {
                viewGroup.removeView(viewGroup2);
            }
            this.mediaHasReleaseAndDestroy = true;
        }
    }
}
