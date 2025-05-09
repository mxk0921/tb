package com.taobao.android.fluid.framework.card.cards.album;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.c;
import com.taobao.kirinvideoengine.album.AlbumAdapter;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.atb;
import tb.ay1;
import tb.b3m;
import tb.b5w;
import tb.b85;
import tb.b93;
import tb.c5g;
import tb.d5g;
import tb.d5w;
import tb.dk0;
import tb.dub;
import tb.f2k;
import tb.f7l;
import tb.i5g;
import tb.ici;
import tb.ir9;
import tb.kfj;
import tb.mfj;
import tb.nwv;
import tb.oqi;
import tb.pcw;
import tb.pep;
import tb.pto;
import tb.qy0;
import tb.s19;
import tb.sj4;
import tb.t2o;
import tb.u92;
import tb.uq9;
import tb.uyr;
import tb.vj0;
import tb.vq9;
import tb.vrp;
import tb.vsk;
import tb.vu3;
import tb.xau;
import tb.ytb;
import tb.yyr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PictureAlbumCard extends ici implements dub, ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "新版图集卡";
    private static final String r0 = "AudioComponentsController";
    private static final String s0 = "music_album";
    public a.b L;
    public String M;
    private View N;
    private Context O;
    private FluidContext P;
    private boolean Q;
    private atb R;
    private String S;
    private String T;
    private String U;
    private long V;
    private long W;
    private long X;
    private long Y;
    private long Z;
    private boolean f0;
    private vj0 g0;
    private Map h0;
    private List<b3m> l0;
    private long m0;
    private final HashMap<String, String> I = new HashMap<>();
    private final Handler J = new Handler(Looper.getMainLooper());
    private final Set<atb> K = new HashSet();
    private long a0 = 0;
    private long b0 = 0;
    private long c0 = 0;
    private long d0 = 0;
    private boolean e0 = false;
    private boolean i0 = true;
    private boolean j0 = true;
    private final Set<Integer> k0 = new HashSet();
    private final Set<Integer> n0 = new HashSet();
    private final Set<Integer> o0 = new HashSet(2);
    private boolean p0 = true;
    private Runnable q0 = new a();
    public final vq9 H = new vq9(this);

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
            } else {
                ((ICardService) PictureAlbumCard.b1(PictureAlbumCard.this).getService(ICardService.class)).notifyCardHealthyChange(PictureAlbumCard.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements vsk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vsk
        public void b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f160ea30", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.vsk
        public void a(int i, int i2, boolean z) {
            ITrackService iTrackService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e90b979", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                return;
            }
            PictureAlbumCard.c1(PictureAlbumCard.this).add(Integer.valueOf(i2));
            ay1 f = PictureAlbumCard.k1(PictureAlbumCard.this).f(i2);
            if (f instanceof b3m) {
                b3m b3mVar = (b3m) f;
                HashMap hashMap = new HashMap();
                hashMap.put("width", String.valueOf(b3mVar.f()));
                hashMap.put("height", String.valueOf(b3mVar.c()));
                hashMap.put("url", b3mVar.e());
                hashMap.put("type", b3mVar.a());
                hashMap.put("targetPosition", String.valueOf(i2));
                ir9.b(PictureAlbumCard.r0, "albumPageChangedListener onChanged VSMSG_AlbumPositionStateDidChange: " + hashMap);
                ((IMessageService) PictureAlbumCard.b1(PictureAlbumCard.this).getService(IMessageService.class)).sendMessage(new vrp("VSMSG_AlbumPositionStateDidChange", pcw.i(PictureAlbumCard.b1(PictureAlbumCard.this)), hashMap));
                PictureAlbumCard.l1(PictureAlbumCard.this, hashMap);
            }
            int g = PictureAlbumCard.k1(PictureAlbumCard.this).g() - 1;
            if (!(i != g || i2 == g || (iTrackService = (ITrackService) PictureAlbumCard.b1(PictureAlbumCard.this).getService(ITrackService.class)) == null)) {
                iTrackService.triggerTrackStayTime(PictureAlbumCard.this);
            }
            if (i != i2) {
                xau.K(PictureAlbumCard.b1(PictureAlbumCard.this), i2, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements AlbumAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.b
        public void a(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe6c5550", new Object[]{this, new Integer(i), new Boolean(z)});
                return;
            }
            if (z) {
                PictureAlbumCard.q1(PictureAlbumCard.this).add(Integer.valueOf(i));
            }
            ir9.b(PictureAlbumCard.r0, "Carousel_Album_Item_LoadTime onLoadFinish position=" + i + ", success=" + z + ", hasLoadedList=" + PictureAlbumCard.q1(PictureAlbumCard.this));
            if (PictureAlbumCard.p1(PictureAlbumCard.this).contains(Integer.valueOf(i))) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 0;
                if (PictureAlbumCard.n1(PictureAlbumCard.this) > 0 && currentTimeMillis - PictureAlbumCard.n1(PictureAlbumCard.this) > 0) {
                    j = currentTimeMillis - PictureAlbumCard.n1(PictureAlbumCard.this);
                }
                PictureAlbumCard pictureAlbumCard = PictureAlbumCard.this;
                PictureAlbumCard.r1(pictureAlbumCard, i, j, true ^ PictureAlbumCard.c1(pictureAlbumCard).contains(Integer.valueOf(i)));
            }
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.b
        public void onAppear(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("117f6f88", new Object[]{this, new Integer(i)});
                return;
            }
            PictureAlbumCard.o1(PictureAlbumCard.this, System.currentTimeMillis());
            PictureAlbumCard.p1(PictureAlbumCard.this).add(Integer.valueOf(i));
            ir9.b(PictureAlbumCard.r0, "Carousel_Album_Item_LoadTime onAppear position=" + i + ". currentAppearList=" + PictureAlbumCard.p1(PictureAlbumCard.this));
            if (PictureAlbumCard.q1(PictureAlbumCard.this).contains(Integer.valueOf(i))) {
                PictureAlbumCard pictureAlbumCard = PictureAlbumCard.this;
                PictureAlbumCard.r1(pictureAlbumCard, i, 0L, true ^ PictureAlbumCard.c1(pictureAlbumCard).contains(Integer.valueOf(i)));
            }
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.b
        public void onDisappear(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6ec4558", new Object[]{this, new Integer(i)});
                return;
            }
            PictureAlbumCard.p1(PictureAlbumCard.this).remove(Integer.valueOf(i));
            ir9.b(PictureAlbumCard.r0, "Carousel_Album_Item_LoadTime onDisappear----- position=" + i + ", currentAppearList=" + PictureAlbumCard.p1(PictureAlbumCard.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements AlbumAdapter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4965547", new Object[]{this, new Integer(i)});
            } else {
                PictureAlbumCard.s1(PictureAlbumCard.this, i, "endPlay");
            }
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.c
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93a84b36", new Object[]{this, new Integer(i)});
            } else {
                PictureAlbumCard.s1(PictureAlbumCard.this, i, "startPlay");
            }
        }

        @Override // com.taobao.kirinvideoengine.album.AlbumAdapter.c
        public void c(int i, Object obj, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e18d68c", new Object[]{this, new Integer(i), obj, new Integer(i2), new Integer(i3)});
            } else {
                PictureAlbumCard.s1(PictureAlbumCard.this, i, "error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements NavigationTabModule.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.d
        public void F(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78a4f1fd", new Object[]{this, new Boolean(z)});
                return;
            }
            ir9.b(PictureAlbumCard.r0, "onNavigationShowHideStatusChanged isHideStatus=" + z + " ; mIsSeekBarLocatedUp=" + PictureAlbumCard.d1(PictureAlbumCard.this) + "; " + PictureAlbumCard.this.X());
            if (PictureAlbumCard.d1(PictureAlbumCard.this) != (!z)) {
                PictureAlbumCard.e1(PictureAlbumCard.this, !z);
                if (!b93.n(PictureAlbumCard.b1(PictureAlbumCard.this)) && pto.i(PictureAlbumCard.b1(PictureAlbumCard.this))) {
                    if (PictureAlbumCard.d1(PictureAlbumCard.this)) {
                        str = "up";
                    } else {
                        str = "down";
                    }
                    oqi.b(PictureAlbumCard.b1(PictureAlbumCard.this), str, PictureAlbumCard.this.Y());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PictureAlbumCard.f1(PictureAlbumCard.this) != null) {
                PictureAlbumCard.f1(PictureAlbumCard.this).pauseVideo();
                PictureAlbumCard.g1(PictureAlbumCard.this, "pause");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PictureAlbumCard.f1(PictureAlbumCard.this) != null) {
                PictureAlbumCard.f1(PictureAlbumCard.this).seekTo(0);
                PictureAlbumCard.f1(PictureAlbumCard.this).pauseVideo();
            }
        }
    }

    static {
        t2o.a(468713885);
        t2o.a(468713884);
        t2o.a(468714525);
        t2o.a(452985015);
        t2o.a(452985011);
    }

    public PictureAlbumCard(FluidContext fluidContext) {
        super(fluidContext);
    }

    private void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddacdc8b", new Object[]{this});
            return;
        }
        if (this.W > 0) {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(this, "audio_ff", String.valueOf(SystemClock.elapsedRealtime() - this.W), "", "", "");
        }
        V1("play");
    }

    private void I1() {
        MediaContentDetailData.Content content;
        MediaContentDetailData.MusicInfoVO musicInfoVO;
        MediaContentDetailData.MusicInfoVO.PlayPairs playPairs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd8ddf7", new Object[]{this});
            return;
        }
        a.d dVar = this.s;
        if (dVar != null && dVar.g() != null && (content = this.s.g().content) != null) {
            if (this.s.A() && (musicInfoVO = content.musicInfoVO) != null) {
                List<MediaContentDetailData.MusicInfoVO.AudioResources> list = musicInfoVO.audioResources;
                if (list != null && list.size() > 0) {
                    MediaContentDetailData.MusicInfoVO.AudioResources audioResources = musicInfoVO.audioResources.get(0);
                    this.T = audioResources.url;
                    this.S = String.valueOf(audioResources.audioId);
                    this.Z = audioResources.duration;
                    this.U = audioResources.cacheKey;
                    this.V = audioResources.fileSize;
                }
                MediaContentDetailData.MusicInfoVO.MusicParams musicParams = musicInfoVO.musicParams;
                if (!(musicParams == null || (playPairs = musicParams.playPairs) == null)) {
                    X1(playPairs.startTime, playPairs.endTime);
                }
            }
            if (!TextUtils.isEmpty(this.s.g().publishStatus) && !TextUtils.isEmpty(this.s.e().music) && TextUtils.isEmpty(this.T)) {
                this.T = this.s.e().music;
            }
        }
    }

    private void K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a9a8ee", new Object[]{this});
            return;
        }
        uyr.a(this.q0);
        uyr.c(this.q0, 1000);
    }

    private void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.p.setKeepScreenOn(false);
        w1();
    }

    private void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbc6df7", new Object[]{this});
            return;
        }
        this.m0 = 0L;
        this.o0.clear();
        this.n0.clear();
        this.k0.clear();
    }

    private void S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb41dc9", new Object[]{this});
            return;
        }
        this.a0 = 0L;
        this.c0 = 0L;
        this.b0 = 0L;
        this.d0 = 0L;
        ir9.b(s0, "onRequestMediaPlayer 重置 业务开始 时间=" + this.c0);
    }

    private void U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20bb3b7", new Object[]{this});
            return;
        }
        atb atbVar = this.R;
        if (atbVar != null) {
            long duration = atbVar.getDuration();
            ir9.b(r0, "seekToSectionStart mAudioSectionStart=" + this.X + " " + this.Y + " duration=" + duration);
            long j = this.X;
            if (j > 0 && j < duration) {
                this.R.seekTo((int) j);
            }
        }
    }

    private void V1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3848248f", new Object[]{this, str});
            return;
        }
        ir9.a(r0, "sendAudioStateMsg state= " + str);
        this.I.put("state", str);
        if (this.s != null) {
            ((IMessageService) this.P.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_audioStateChanged", this.s.c, this.I));
        }
    }

    private void W1(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5814396", new Object[]{this, new Integer(i), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("index", String.valueOf(i));
        ir9.b(r0, "sendLivePhoneStateMessage VSMSG_onLivePhotoStateChanged: " + hashMap);
        ((IMessageService) this.P.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_onLivePhotoStateChanged", pcw.i(this.P), hashMap));
    }

    private void Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.p.setKeepScreenOn(true);
        P1();
        b2();
    }

    private void Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.p.setKeepScreenOn(false);
        A1();
        O1();
    }

    public static /* synthetic */ FluidContext b1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("1d6133e5", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.P;
    }

    public static /* synthetic */ Set c1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d96ab1f3", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.k0;
    }

    private void c2(int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454d98be", new Object[]{this, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("albumLoadTime", String.valueOf(j));
        hashMap.put("albumIndex", String.valueOf(i));
        hashMap.put("albumFirstLoad", String.valueOf(z));
        hashMap.put("contentId", String.valueOf(P()));
        hashMap.put("position", String.valueOf(M()));
        ir9.b(r0, "Carousel_Album_Item_LoadTime track...>> index=" + i + ", isFirstLoad=" + z + ", spendTime=" + j);
        yyr.b("Carousel_Album_Item_LoadTime", null, null, hashMap);
    }

    public static /* synthetic */ boolean d1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa98476", new Object[]{pictureAlbumCard})).booleanValue();
        }
        return pictureAlbumCard.p0;
    }

    public static /* synthetic */ boolean e1(PictureAlbumCard pictureAlbumCard, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b61764", new Object[]{pictureAlbumCard, new Boolean(z)})).booleanValue();
        }
        pictureAlbumCard.p0 = z;
        return z;
    }

    public static /* synthetic */ atb f1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("b01679c6", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.R;
    }

    public static /* synthetic */ void g1(PictureAlbumCard pictureAlbumCard, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db01b63e", new Object[]{pictureAlbumCard, str});
        } else {
            pictureAlbumCard.V1(str);
        }
    }

    public static /* synthetic */ boolean h1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d214fff9", new Object[]{pictureAlbumCard})).booleanValue();
        }
        return pictureAlbumCard.f0;
    }

    public static /* synthetic */ boolean i1(PictureAlbumCard pictureAlbumCard, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4ba0c41", new Object[]{pictureAlbumCard, new Boolean(z)})).booleanValue();
        }
        pictureAlbumCard.f0 = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(PictureAlbumCard pictureAlbumCard, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1836003525:
                super.onWillDisActive((uq9) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1249298707:
                super.onDisActive((uq9) objArr[0]);
                return null;
            case -372824644:
                super.onDisAppear((uq9) objArr[0]);
                return null;
            case -228339441:
                super.onWillActive((uq9) objArr[0]);
                return null;
            case -147728739:
                super.onActive((uq9) objArr[0]);
                return null;
            case 610311722:
                super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 715537612:
                super.onRecycle((uq9) objArr[0]);
                return null;
            case 728745324:
                super.onAppear((uq9) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2063982600:
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/album/PictureAlbumCard");
        }
    }

    public static /* synthetic */ void j1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e37e76", new Object[]{pictureAlbumCard});
        } else {
            pictureAlbumCard.B1();
        }
    }

    public static /* synthetic */ vj0 k1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vj0) ipChange.ipc$dispatch("f57aebbd", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.g0;
    }

    public static /* synthetic */ Map l1(PictureAlbumCard pictureAlbumCard, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6e3a2e72", new Object[]{pictureAlbumCard, map});
        }
        pictureAlbumCard.h0 = map;
        return map;
    }

    public static /* synthetic */ void m1(PictureAlbumCard pictureAlbumCard, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf75b2d", new Object[]{pictureAlbumCard, new Boolean(z)});
        } else {
            pictureAlbumCard.t1(z);
        }
    }

    public static /* synthetic */ long n1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfa4e6fc", new Object[]{pictureAlbumCard})).longValue();
        }
        return pictureAlbumCard.m0;
    }

    public static /* synthetic */ long o1(PictureAlbumCard pictureAlbumCard, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9926cb6e", new Object[]{pictureAlbumCard, new Long(j)})).longValue();
        }
        pictureAlbumCard.m0 = j;
        return j;
    }

    public static /* synthetic */ Set p1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b83f5db8", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.o0;
    }

    public static /* synthetic */ Set q1(PictureAlbumCard pictureAlbumCard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7e69e679", new Object[]{pictureAlbumCard});
        }
        return pictureAlbumCard.n0;
    }

    public static /* synthetic */ void r1(PictureAlbumCard pictureAlbumCard, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527a6068", new Object[]{pictureAlbumCard, new Integer(i), new Long(j), new Boolean(z)});
        } else {
            pictureAlbumCard.c2(i, j, z);
        }
    }

    public static /* synthetic */ void s1(PictureAlbumCard pictureAlbumCard, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530f8d81", new Object[]{pictureAlbumCard, new Integer(i), str});
        } else {
            pictureAlbumCard.W1(i, str);
        }
    }

    private void v1() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d192cb", new Object[]{this});
            return;
        }
        pep sessionParams = ((ISceneConfigService) this.P.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            str = sessionParams.c;
        } else {
            str = null;
        }
        boolean c2 = c5g.c("album");
        ir9.b(r0, "album enableKirin=" + c2);
        if (c2) {
            EngineModel engineModel = new EngineModel();
            ConfigModel.a aVar = new ConfigModel.a();
            boolean d2 = c5g.d("album");
            ir9.b(r0, "album enableKirin enableStandard=" + d2);
            aVar.l(d2);
            engineModel.configModel = aVar.i();
            MediaModel.b bVar = new MediaModel.b(this.u);
            bVar.H("guangguang").f0(this.T).e0("TBAudio").c0(this.P.getInstanceConfig().getPlayScenes()).J(this.u).T("audio").S(true);
            if (kfj.b(this.P)) {
                bVar.P(Boolean.TRUE);
            }
            if (sessionParams != null) {
                bVar.W(sessionParams.c).Y(sessionParams.b);
            }
            long j = this.Z;
            long j2 = this.X;
            if (j2 > 0 && j2 < j) {
                bVar.X((int) j2);
            }
            engineModel.mediaModel = bVar.G();
            Map<String, String> thisCardCommonTrack = ((ITrackService) this.P.getService(ITrackService.class)).getThisCardCommonTrack(this);
            if (thisCardCommonTrack != null) {
                engineModel.utParams = new HashMap<>(thisCardCommonTrack);
            }
            engineModel.playExpUTParams = d5w.k(this.P, G1(), this.s, false, false);
            i5g i5gVar = new i5g(this.o);
            d5g d5gVar = new d5g(i5gVar.m(engineModel, ((IMediaService) this.P.getService(IMediaService.class)).getKirinEngineDelegate()), i5gVar, engineModel);
            this.R = d5gVar;
            if (sessionParams != null) {
                d5gVar.setBizCode(sessionParams.c);
                return;
            }
            return;
        }
        c.C0535c cVar = new c.C0535c((Activity) this.O);
        cVar.b(true);
        if (kfj.b(this.P)) {
            cVar.y(true);
            cVar.s(false);
        }
        cVar.D(this.T);
        cVar.C("TBAudio");
        long j3 = this.Z;
        long j4 = this.X;
        if (j4 > 0 && j4 < j3) {
            cVar.v((int) j4);
        }
        cVar.t(2);
        cVar.B(true);
        cVar.q(d5w.k(this.P, G1(), this.s, false, false));
        Map<String, String> thisCardCommonTrack2 = ((ITrackService) this.P.getService(ITrackService.class)).getThisCardCommonTrack(this);
        if (thisCardCommonTrack2 != null) {
            cVar.x(new HashMap<>(thisCardCommonTrack2));
        }
        cVar.r(this.P.getInstanceConfig().getPlayScenes());
        if (str != null) {
            cVar.d(str);
        }
        this.R = new b85(cVar.a());
    }

    public void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5edab4f0", new Object[]{this});
            return;
        }
        this.e0 = false;
        Q1();
    }

    public ViewGroup C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("176748e6", new Object[]{this});
        }
        vj0 vj0Var = this.g0;
        if (vj0Var != null) {
            return vj0Var.h();
        }
        return null;
    }

    @Override // tb.ulb
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a3ace76", new Object[]{this})).intValue();
        }
        return R.layout.fluid_sdk_ly_picture_album_card;
    }

    public double[] D1() {
        double d2 = vu3.b.GEO_NOT_SUPPORT;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("bd2e5610", new Object[]{this});
        }
        List<b3m> list = this.l0;
        if (list == null || list.size() <= 0) {
            ir9.b(r0, "getAlbumHeightAndMarginTop， maxPicHeight=0; marginTop=0");
            return new double[]{vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT};
        }
        int measuredWidth = this.p.getMeasuredWidth();
        int measuredHeight = this.p.getMeasuredHeight();
        for (b3m b3mVar : this.l0) {
            double c2 = b3mVar.c() / b3mVar.f();
            if (c2 > d2) {
                d2 = c2;
            }
        }
        int min = Math.min(Math.max((int) (measuredWidth * d2), 0), measuredHeight);
        int i = (measuredHeight - min) / 2;
        ir9.b(r0, "getAlbumHeightAndMarginTop， maxPicHeight=" + min + "; marginTop=" + i);
        return new double[]{min, i, d2};
    }

    public String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a4f96eb", new Object[]{this});
        }
        return this.S;
    }

    public Map F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("566eb256", new Object[]{this});
        }
        return this.h0;
    }

    public int G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        RecyclerViewHolder recyclerViewHolder = this.q;
        if (recyclerViewHolder != null) {
            return recyclerViewHolder.getAdapterPosition();
        }
        return -1;
    }

    @Override // tb.ici
    public int H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1c9b5fd", new Object[]{this})).intValue();
        }
        atb atbVar = this.R;
        if (atbVar != null) {
            return atbVar.getVideoState();
        }
        if (this.j0) {
            return 1;
        }
        return 2;
    }

    public String H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc1c161f", new Object[]{this});
        }
        if (this.p0) {
            return "up";
        }
        return "down";
    }

    @Override // tb.ulb
    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5435485a", new Object[]{this})).intValue();
        }
        return 3;
    }

    public boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba18587b", new Object[]{this})).booleanValue();
        }
        return this.i0;
    }

    public void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        t1(false);
        if (this.R != null) {
            this.J.post(new f());
        }
    }

    public void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (this.R != null) {
            this.J.post(new g());
        }
    }

    public void O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6c06b0", new Object[]{this});
            return;
        }
        atb atbVar = this.R;
        if (atbVar != null) {
            atbVar.destroy();
            this.K.remove(this.R);
            this.R = null;
            V1("destroy");
        }
    }

    public void P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cce3486", new Object[]{this});
        } else if (this.R == null && this.s != null && !TextUtils.isEmpty(this.T)) {
            v1();
            this.R.D(this);
            this.R.g(this);
            mfj.w(this.P, this.R);
            ir9.b(r0, "requestVideoPlayerIfNeeded state=" + this.R.getVideoState() + " " + this.s.A() + " section(" + this.X + "," + this.Y + f7l.BRACKET_END_STR);
            this.R.start();
            s19.x(this, this.R.t());
        }
    }

    @Override // tb.uq9
    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f5131d", new Object[]{this});
        }
        return E1();
    }

    public void T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b72ba4a", new Object[]{this});
            return;
        }
        vj0 vj0Var = this.g0;
        if (vj0Var != null) {
            vj0Var.k();
        }
    }

    public void X1(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e57ed64", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.X = j;
        this.Y = j2;
    }

    @Override // tb.ici
    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af2faec0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ici
    public void Z0(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        }
    }

    public void a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else if (this.R != null) {
            this.J.post(new h());
        }
    }

    @Override // tb.uq9
    public String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        a.d dVar = this.s;
        if (dVar != null) {
            return dVar.c;
        }
        return "";
    }

    public void b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1270ef9", new Object[]{this});
            return;
        }
        this.Q = true;
        if (this.R != null && !pcw.d(this.P)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.W = elapsedRealtime;
            this.b0 = elapsedRealtime;
            N1();
        }
    }

    @Override // tb.ici
    public void k(qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec31384", new Object[]{this, qy0Var});
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        super.onActive(uq9Var);
        if (this.t) {
            y1();
            Y1();
            vj0 vj0Var = this.g0;
            if (vj0Var != null) {
                vj0Var.i();
            }
            K1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        super.onAppear(uq9Var);
        if (this.t) {
            R1();
            if (!((IFeedsListService) this.P.getService(IFeedsListService.class)).isFastScroll()) {
                z1();
                P1();
            }
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        this.P = U();
        if (b93.f()) {
            this.g0 = new vj0(this.o);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            ((ViewGroup) this.p).addView(this.g0.h(), layoutParams);
            this.g0.d(new b());
            this.g0.c(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/album/PictureAlbumCard$3");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 1) {
                        PictureAlbumCard.m1(PictureAlbumCard.this, false);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        super.onScrolled(recyclerView, i, i2);
                    }
                }
            });
            this.g0.a(new c());
            this.g0.b(new d());
        }
        ((IHostAppService) this.P.getService(IHostAppService.class)).addNavigationShowHideStatusListener(new e());
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.t) {
            O1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        super.onDisActive(uq9Var);
        if (this.t) {
            Z1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            super.onDisAppear(uq9Var);
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (this.t && h0()) {
            L1();
        }
    }

    @Override // tb.ici, tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        M1();
        this.j0 = false;
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        super.onRecycle(uq9Var);
        if (this.t) {
            O1();
        }
    }

    @Override // tb.ici, tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
        } else {
            O1();
        }
    }

    @Override // tb.ici, tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
        } else {
            P1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.t && h0()) {
            Y1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.ici, tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
        } else if (!pcw.d(this.P)) {
            N1();
            this.j0 = true;
        }
    }

    @Override // tb.ici, tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
        } else {
            a2();
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            ir9.a(r0, "onVideoComplete");
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (this.R != null) {
            ir9.b(r0, "onVideoError " + obj + " i=" + i + " i1=" + i2);
            StringBuilder sb = new StringBuilder("error(");
            sb.append(i);
            sb.append(f7l.BRACKET_END_STR);
            s19.d(this, sb.toString());
            if (!this.K.contains(this.R)) {
                ir9.b(r0, "onVideoError  restart");
                this.K.add(this.R);
                this.R.start();
                s19.d(this, "retry");
                return;
            }
            s19.w(this, String.valueOf(i), "");
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.a(r0, "onVideoPause " + z);
        G0().onVideoPause(this, z);
        b5w.F(this, "pause");
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ir9.a(r0, "onVideoPlay");
        G0().onVideoPlay(this);
        b5w.F(this, "play");
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(r0, "onVideoSeekTo " + i);
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        ir9.a(r0, "onVideoStart");
        G0().onVideoStart(this);
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        super.onWillActive(uq9Var);
        if (this.t) {
            Y1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        super.onWillDisActive(uq9Var);
        if (this.t) {
            L1();
            uyr.a(this.q0);
        }
    }

    @Override // tb.ici
    public void u(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f2)});
        }
    }

    public void u1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f99bb", new Object[]{this, str});
        } else if (this.g0 == null) {
        } else {
            if ("play".equals(str)) {
                this.g0.i();
            } else if ("stop".equals(str)) {
                this.g0.m();
            }
        }
    }

    @Override // tb.ici
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
        }
    }

    @Override // tb.dub
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b78bc7", new Object[]{this});
            return;
        }
        ir9.a(r0, "onPreCompletion");
        s19.d(this, "complete");
        V1("finish");
        b5w.F(this, "finished");
        U1();
        V1("play");
    }

    @Override // tb.uq9
    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb0eb7d", new Object[]{this})).booleanValue();
        }
        return b93.g();
    }

    public void w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f00674a", new Object[]{this});
            return;
        }
        this.Q = false;
        if (this.R != null) {
            M1();
        }
    }

    public void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67758cc2", new Object[]{this});
            return;
        }
        this.Q = false;
        if (this.R != null) {
            a2();
        }
    }

    @Override // tb.ulb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc13a868", new Object[]{this});
        }
        return CARD_NAME;
    }

    public void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81220778", new Object[]{this});
            return;
        }
        this.c0 = SystemClock.elapsedRealtime();
        ir9.b(s0, "doActive 时间=" + this.c0);
    }

    public void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725f7687", new Object[]{this});
            return;
        }
        S1();
        this.a0 = SystemClock.elapsedRealtime();
        ir9.b(s0, "doAppear 时间=" + this.a0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PictureAlbumCard.f1(PictureAlbumCard.this) != null) {
                int videoState = PictureAlbumCard.f1(PictureAlbumCard.this).getVideoState();
                ir9.b(PictureAlbumCard.r0, "playVideo " + videoState);
                if (videoState != 1 && videoState != 8) {
                    if (videoState == 2) {
                        PictureAlbumCard.f1(PictureAlbumCard.this).playVideo();
                        if (PictureAlbumCard.h1(PictureAlbumCard.this)) {
                            PictureAlbumCard.j1(PictureAlbumCard.this);
                        } else {
                            PictureAlbumCard.g1(PictureAlbumCard.this, "resume");
                            PictureAlbumCard.m1(PictureAlbumCard.this, true);
                        }
                        PictureAlbumCard.i1(PictureAlbumCard.this, false);
                        return;
                    }
                    PictureAlbumCard.f1(PictureAlbumCard.this).start();
                }
            }
        }
    }

    private void R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23fa18", new Object[]{this});
            return;
        }
        this.i0 = true;
        vj0 vj0Var = this.g0;
        if (vj0Var != null) {
            int e2 = vj0Var.e();
            ay1 f2 = this.g0.f(e2);
            if (f2 instanceof b3m) {
                b3m b3mVar = (b3m) f2;
                HashMap hashMap = new HashMap();
                hashMap.put("width", String.valueOf(b3mVar.f()));
                hashMap.put("height", String.valueOf(b3mVar.c()));
                hashMap.put("url", b3mVar.e());
                hashMap.put("type", b3mVar.a());
                hashMap.put("targetPosition", String.valueOf(e2));
                this.h0 = hashMap;
            }
        }
        ir9.b(r0, "resetAlbumState: enableAutoPlay=" + this.i0 + "; currentPositionInfo=" + this.h0);
    }

    private void d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af556d09", new Object[]{this});
        } else if (!this.e0) {
            long j = this.a0;
            long j2 = 0;
            if (j > 0) {
                long j3 = this.d0;
                if (j3 > 0) {
                    long j4 = j3 - this.b0;
                    long j5 = j3 - j;
                    long j6 = this.c0;
                    long j7 = j6 > 0 ? j3 - j6 : 0L;
                    String valueOf = String.valueOf(j5);
                    if (j7 >= 0) {
                        j2 = j7;
                    }
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(this, "audio_start_play", valueOf, String.valueOf(j2), String.valueOf(j4), "");
                    this.e0 = true;
                    ir9.b(s0, "appear到prepared时长=" + j5 + "业务开始时间=" + this.a0 + " 体验时长 = " + j7 + " startPlay到prepared时长=" + j4);
                }
            }
        }
    }

    private void t1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cdf2ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i0 = z;
        vj0 vj0Var = this.g0;
        if (vj0Var != null) {
            vj0Var.l(z);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("interactiveStatus", Boolean.valueOf(!z));
        ir9.b(r0, "sendStopAutoPlayMessage VSMSG_AlbumUserInteractive: " + hashMap + "; position=" + M());
        ((IMessageService) this.P.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_AlbumUserInteractive", pcw.i(this.P), hashMap));
    }

    @Override // tb.ici, tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        super.onBindData(uq9Var, aVar, i);
        if (this.t) {
            ViewGroup viewGroup = (ViewGroup) this.p;
            this.N = viewGroup;
            this.O = viewGroup.getContext();
            this.Q = false;
            I1();
            if (b93.f() && this.g0 != null) {
                try {
                    if (f2k.d(this.P)) {
                        ViewGroup.LayoutParams layoutParams = this.g0.h().getLayoutParams();
                        if (layoutParams instanceof FrameLayout.LayoutParams) {
                            int e0 = e0();
                            ((FrameLayout.LayoutParams) layoutParams).bottomMargin = e0;
                            ir9.b(r0, "pictureAlbum newui onBindData bottomMargin=" + e0);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (MediaContentDetailData.Pic pic : aVar.e().g().content.picAlbum) {
                        b3m b3mVar = new b3m(pic.url, nwv.t(pic.width, 0), nwv.t(pic.height, 0));
                        if (TextUtils.equals(pic.picType, sj4.PICTURE_TYPE_LIVE_PHOTO) && (jSONObject = pic.videoResourceJsonObj) != null && !TextUtils.isEmpty(jSONObject.getString("videoUrl")) && !TextUtils.isEmpty(pic.videoResourceJsonObj.getString("photoUrl"))) {
                            b3mVar.b(b3m.LIVEPHOTO);
                            b3mVar.g(pic.videoResourceJsonObj);
                        }
                        arrayList.add(b3mVar);
                    }
                    this.l0 = arrayList;
                    this.g0.j(new dk0(arrayList, new u92()));
                    R1();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    ir9.b(r0, "error: " + e2.getMessage());
                }
            }
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.R != null) {
            this.d0 = SystemClock.elapsedRealtime();
            s19.d(this, "prepared");
            boolean u = mfj.u(this.P);
            this.R.mute(u);
            ir9.b(r0, "onVideoPrepared mIsAppear = " + this.Q + " mute=" + u);
            if (!this.Q) {
                this.f0 = true;
                this.R.pauseVideo();
            } else {
                B1();
            }
            d2();
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        long j = this.Y;
        if (j > 0 && j < i3 && i >= j) {
            this.R.seekTo(Math.max((int) this.X, 0));
            V1("play");
        }
    }
}
