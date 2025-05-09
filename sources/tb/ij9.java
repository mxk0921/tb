package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.preload.PreloadService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.fe8;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ij9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21343a;

        public a(long j) {
            this.f21343a = j;
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            return this.f21343a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements ytb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f21344a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ FluidContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Context e;

        public b(atb atbVar, boolean z, FluidContext fluidContext, String str, Context context) {
            this.f21344a = atbVar;
            this.b = z;
            this.c = fluidContext;
            this.d = str;
            this.e = context;
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
            }
        }

        @Override // tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            if (obj instanceof TaobaoMediaPlayer) {
                str = ((TaobaoMediaPlayer) obj).getPlayUrl();
            } else {
                str = "";
            }
            ir9.b("FirstDwInstanceCreator", "APMdata PickPreloadControllerNew,预创建播放器, onVideoError " + System.currentTimeMillis() + "; videoId=" + this.d + "; videoUrl=" + str);
            ViewGroup view = this.f21344a.getView();
            if (view != null) {
                view.setTag(R.id.fluid_sdk_tag_video_error, Boolean.TRUE);
                int i3 = R.id.fluid_sdk_tag_video_state_callback;
                PreloadService.e eVar = (PreloadService.e) view.getTag(i3);
                if (eVar != null) {
                    view.setTag(i3, null);
                    eVar.a(3);
                }
                s0j.B(view);
            }
            fe8 n = new fe8.b().o(this.e).s(this.f21344a).p(i).q(i2).z(this.d).A(str).n();
            FluidContext fluidContext = this.c;
            if (fluidContext != null) {
                s0j.o(fluidContext, n);
            }
        }

        @Override // tb.ytb
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            long j4;
            long j5;
            String str;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else if (3 == j) {
                Map z2 = nwv.z(obj2, null);
                if (z2 != null) {
                    if (nwv.t(z2.get("is_cache_hit"), 0) == 1) {
                        z = true;
                    }
                    j4 = nwv.y(z2.get("RENDER_START_TIME"), -1L);
                    j5 = nwv.y(z2.get("RENDER_END_TIME"), -1L);
                } else {
                    j4 = 0;
                    j5 = 0;
                }
                if (obj instanceof TaobaoMediaPlayer) {
                    str = ((TaobaoMediaPlayer) obj).getPlayUrl();
                } else {
                    str = "";
                }
                ir9.b("FirstDwInstanceCreator", "APMdata onVideoInfo PickPreloadControllerNew,预创建播放器, 首帧返回 " + System.currentTimeMillis() + " isCacheHit=" + z + " ; contentId=" + this.d + " prePlay=" + this.b + " ; videoUrl=" + str);
                if (this.b) {
                    fe8 n = new fe8.b().o(this.e).s(this.f21344a).x(true).u(j5).v(j4).w(j5 - j4).y(z2).t(z).z(this.d).A(str).n();
                    FluidContext fluidContext = this.c;
                    if (fluidContext != null) {
                        s0j.o(fluidContext, n);
                    }
                    if (!s0j.q(3)) {
                        s0j.D(3);
                        s0j.d(s0j.GG_VIDEOTAB_VIDEO_PRELOAD);
                    }
                    s0j.B(this.f21344a.getView());
                }
            } else if (12100 == j) {
                ir9.b("FirstDwInstanceCreator", "PickPreloadControllerNew,移除封面图时机：" + System.currentTimeMillis());
                if (this.b) {
                    ij9.b(this.f21344a);
                }
            } else if (13000 == j) {
                ir9.b("FirstDwInstanceCreator", "[preloadvideo] p2ff finish, " + System.currentTimeMillis());
                ViewGroup view = this.f21344a.getView();
                if (view != null) {
                    view.setTag(R.id.fluid_sdk_tag_play_p2ff_finish_time, Long.valueOf(System.currentTimeMillis()));
                }
                qtm.n(view);
            } else if (400 == j) {
                try {
                    r6m.b((String) ((Map) obj2).get("VideoId"), (String) ((Map) obj2).get("CacheKey"), -1, "creator");
                } catch (Exception unused) {
                    ir9.b("FirstDwInstanceCreator", "MEDIA_VIDEO_CACHE_KEY error:" + obj2);
                }
            }
        }

        @Override // tb.ytb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ytb
        public void onVideoPrepared(Object obj) {
            uq9 activeCard;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            if (!this.b) {
                if (!ij9.a()) {
                    this.f21344a.pauseVideo();
                }
                FluidContext fluidContext = this.c;
                if (fluidContext != null) {
                    this.f21344a.mute(mfj.u(fluidContext));
                }
            }
            FluidContext fluidContext2 = this.c;
            if (fluidContext2 != null && (activeCard = ((ICardService) fluidContext2.getService(ICardService.class)).getActiveCard()) != null) {
                s19.d(activeCard, "prepared");
            }
        }

        @Override // tb.ytb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
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
            }
        }

        @Override // tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            ViewGroup view = this.f21344a.getView();
            if (view != null) {
                s0j.B(view);
                int i = R.id.fluid_sdk_tag_video_state_callback;
                PreloadService.e eVar = (PreloadService.e) view.getTag(i);
                if (eVar != null) {
                    view.setTag(i, null);
                    eVar.a(1);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements ytb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f21345a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ FluidContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Context e;

        public c(atb atbVar, boolean z, FluidContext fluidContext, String str, Context context) {
            this.f21345a = atbVar;
            this.b = z;
            this.c = fluidContext;
            this.d = str;
            this.e = context;
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
            }
        }

        @Override // tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            if (obj instanceof TaobaoMediaPlayer) {
                str = ((TaobaoMediaPlayer) obj).getPlayUrl();
            } else {
                str = "";
            }
            ir9.b("FirstDwInstanceCreator", "APMdata PickPreloadControllerNew,预创建播放器, onVideoError " + System.currentTimeMillis() + "; videoId=" + this.d + "; videoUrl=" + str);
            ViewGroup view = this.f21345a.getView();
            if (view != null) {
                view.setTag(R.id.fluid_sdk_tag_video_error, Boolean.TRUE);
                int i3 = R.id.fluid_sdk_tag_video_state_callback;
                PreloadService.e eVar = (PreloadService.e) view.getTag(i3);
                if (eVar != null) {
                    view.setTag(i3, null);
                    eVar.a(3);
                }
                s0j.B(view);
            }
            fe8 n = new fe8.b().o(this.e).s(this.f21345a).p(i).q(i2).z(this.d).A(str).n();
            FluidContext fluidContext = this.c;
            if (fluidContext != null) {
                s0j.o(fluidContext, n);
            }
        }

        @Override // tb.ytb
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            long j4;
            long j5;
            String str;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else if (3 == j) {
                Map z2 = nwv.z(obj2, null);
                if (z2 != null) {
                    if (nwv.t(z2.get("is_cache_hit"), 0) == 1) {
                        z = true;
                    }
                    j4 = nwv.y(z2.get("RENDER_START_TIME"), -1L);
                    j5 = nwv.y(z2.get("RENDER_END_TIME"), -1L);
                } else {
                    j4 = 0;
                    j5 = 0;
                }
                if (obj instanceof TaobaoMediaPlayer) {
                    str = ((TaobaoMediaPlayer) obj).getPlayUrl();
                } else {
                    str = "";
                }
                ir9.b("FirstDwInstanceCreator", "APMdata onVideoInfo PickPreloadControllerNew,预创建播放器, 首帧返回 " + System.currentTimeMillis() + " isCacheHit=" + z + " ; contentId=" + this.d + " prePlay=" + this.b + " ; videoUrl=" + str);
                if (this.b) {
                    fe8 n = new fe8.b().o(this.e).s(this.f21345a).x(true).u(j5).v(j4).w(j5 - j4).y(z2).t(z).z(this.d).A(str).n();
                    FluidContext fluidContext = this.c;
                    if (fluidContext != null) {
                        s0j.o(fluidContext, n);
                    }
                    if (!s0j.q(3)) {
                        s0j.D(3);
                        s0j.d(s0j.GG_VIDEOTAB_VIDEO_PRELOAD);
                    }
                    s0j.B(this.f21345a.getView());
                }
            } else if (12100 == j) {
                ir9.b("FirstDwInstanceCreator", "PickPreloadControllerNew,移除封面图时机：" + System.currentTimeMillis());
                if (this.b) {
                    ij9.b(this.f21345a);
                }
            } else if (13000 == j) {
                ir9.b("FirstDwInstanceCreator", "[preloadvideo] p2ff finish, " + System.currentTimeMillis());
                ViewGroup view = this.f21345a.getView();
                if (view != null) {
                    view.setTag(R.id.fluid_sdk_tag_play_p2ff_finish_time, Long.valueOf(System.currentTimeMillis()));
                }
                qtm.n(view);
            } else if (400 == j) {
                try {
                    r6m.b((String) ((Map) obj2).get("VideoId"), (String) ((Map) obj2).get("CacheKey"), -1, "creator");
                } catch (Exception unused) {
                    ir9.b("FirstDwInstanceCreator", "MEDIA_VIDEO_CACHE_KEY error:" + obj2);
                }
            }
        }

        @Override // tb.ytb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ytb
        public void onVideoPrepared(Object obj) {
            uq9 activeCard;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            if (!this.b) {
                if (!ij9.a()) {
                    this.f21345a.pauseVideo();
                }
                FluidContext fluidContext = this.c;
                if (fluidContext != null) {
                    this.f21345a.mute(mfj.u(fluidContext));
                }
            }
            FluidContext fluidContext2 = this.c;
            if (fluidContext2 != null && (activeCard = ((ICardService) fluidContext2.getService(ICardService.class)).getActiveCard()) != null) {
                s19.d(activeCard, "prepared");
            }
        }

        @Override // tb.ytb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
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
            }
        }

        @Override // tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            ViewGroup view = this.f21345a.getView();
            if (view != null) {
                s0j.B(view);
                int i = R.id.fluid_sdk_tag_video_state_callback;
                PreloadService.e eVar = (PreloadService.e) view.getTag(i);
                if (eVar != null) {
                    view.setTag(i, null);
                    eVar.a(1);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21346a;

        public d(long j) {
            this.f21346a = j;
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            return this.f21346a;
        }
    }

    static {
        t2o.a(468714507);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return g();
    }

    public static /* synthetic */ void b(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c458062b", new Object[]{atbVar});
        } else {
            k(atbVar);
        }
    }

    public static atb c(FluidContext fluidContext, Context context, a.e eVar, String str, int i, int i2, String str2, String str3, String str4, HashMap<String, String> hashMap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("4b398cca", new Object[]{fluidContext, context, eVar, str, new Integer(i), new Integer(i2), str2, str3, str4, hashMap, new Boolean(z)});
        }
        if (c5g.f()) {
            return d(fluidContext, context, eVar, str, i, i2, str2, str3, str4, hashMap, z);
        }
        return e(fluidContext, context, eVar, str, i, i2, str2, str3, str4, hashMap, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[Catch: all -> 0x006a, TryCatch #4 {all -> 0x006a, blocks: (B:8:0x005d, B:13:0x0073, B:15:0x007a, B:17:0x0080, B:18:0x0085, B:20:0x008b, B:22:0x0092, B:27:0x00a1, B:31:0x00c0, B:37:0x00d0, B:40:0x00d8, B:44:0x00e9, B:46:0x00f4, B:51:0x0105, B:53:0x0112, B:55:0x0125, B:59:0x0130, B:61:0x0158, B:63:0x015f, B:65:0x0167, B:70:0x0175, B:75:0x0186, B:78:0x018e, B:80:0x0194, B:82:0x019a, B:84:0x019f, B:88:0x01a7, B:91:0x01ad, B:93:0x01b1), top: B:109:0x005d, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x006a, Exception -> 0x0124, TRY_LEAVE, TryCatch #5 {Exception -> 0x0124, blocks: (B:51:0x0105, B:53:0x0112), top: B:110:0x0105, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #4 {all -> 0x006a, blocks: (B:8:0x005d, B:13:0x0073, B:15:0x007a, B:17:0x0080, B:18:0x0085, B:20:0x008b, B:22:0x0092, B:27:0x00a1, B:31:0x00c0, B:37:0x00d0, B:40:0x00d8, B:44:0x00e9, B:46:0x00f4, B:51:0x0105, B:53:0x0112, B:55:0x0125, B:59:0x0130, B:61:0x0158, B:63:0x015f, B:65:0x0167, B:70:0x0175, B:75:0x0186, B:78:0x018e, B:80:0x0194, B:82:0x019a, B:84:0x019f, B:88:0x01a7, B:91:0x01ad, B:93:0x01b1), top: B:109:0x005d, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a A[Catch: all -> 0x006a, TryCatch #4 {all -> 0x006a, blocks: (B:8:0x005d, B:13:0x0073, B:15:0x007a, B:17:0x0080, B:18:0x0085, B:20:0x008b, B:22:0x0092, B:27:0x00a1, B:31:0x00c0, B:37:0x00d0, B:40:0x00d8, B:44:0x00e9, B:46:0x00f4, B:51:0x0105, B:53:0x0112, B:55:0x0125, B:59:0x0130, B:61:0x0158, B:63:0x015f, B:65:0x0167, B:70:0x0175, B:75:0x0186, B:78:0x018e, B:80:0x0194, B:82:0x019a, B:84:0x019f, B:88:0x01a7, B:91:0x01ad, B:93:0x01b1), top: B:109:0x005d, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.atb d(com.taobao.android.fluid.core.FluidContext r20, android.content.Context r21, com.taobao.android.fluid.framework.data.datamodel.a.e r22, java.lang.String r23, int r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.HashMap<java.lang.String, java.lang.String> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ij9.d(com.taobao.android.fluid.core.FluidContext, android.content.Context, com.taobao.android.fluid.framework.data.datamodel.a$e, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, boolean):tb.atb");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.atb e(com.taobao.android.fluid.core.FluidContext r33, android.content.Context r34, com.taobao.android.fluid.framework.data.datamodel.a.e r35, java.lang.String r36, int r37, int r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.HashMap<java.lang.String, java.lang.String> r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ij9.e(com.taobao.android.fluid.core.FluidContext, android.content.Context, com.taobao.android.fluid.framework.data.datamodel.a$e, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, boolean):tb.atb");
    }

    public static void f(FluidContext fluidContext, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd5482", new Object[]{fluidContext, hashMap});
            return;
        }
        long b2 = hol.b(fluidContext);
        long beforeDetailMtopTime = ((IDataService) fluidContext.getService(IDataService.class)).getBeforeDetailMtopTime();
        long detailMtopSuccessTIme = ((IDataService) fluidContext.getService(IDataService.class)).getDetailMtopSuccessTIme();
        hashMap.put("qpy_apm_oncreate_to_detail", String.valueOf(beforeDetailMtopTime - b2));
        hashMap.put("qpy_apm_detail_mtop", String.valueOf(detailMtopSuccessTIme - beforeDetailMtopTime));
        hashMap.put("qpy_apm_detail_mtop_to_build_dw", String.valueOf(System.currentTimeMillis() - detailMtopSuccessTIme));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc1fba3", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("fixPauseWhenPrepared0306", true);
    }

    public static HashMap<String, String> i(FluidContext fluidContext, a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3c4bb895", new Object[]{fluidContext, eVar});
        }
        if (fluidContext == null || eVar == null) {
            return null;
        }
        return xq9.i(fluidContext, 0, ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard(), eVar.f7800a, eVar.t(), eVar.a(), true, true);
    }

    public static atb j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("10b0520a", new Object[]{fluidContext});
        }
        atb dWInstance = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getDWInstance();
        if (dWInstance != null) {
            ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).setDWInstance(null);
        }
        return dWInstance;
    }

    public static void k(atb atbVar) {
        ntm ntmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2773454", new Object[]{atbVar});
        } else if (atbVar != null && (ntmVar = (ntm) atbVar.getView().getTag(R.id.fluid_sdk_tag_preloadVideo)) != null) {
            ntmVar.g();
        }
    }

    public static q8e l(FluidContext fluidContext, Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q8e) ipChange.ipc$dispatch("6b089f8d", new Object[]{fluidContext, context, new Boolean(z)});
        }
        q8e q8eVar = new q8e();
        if (fluidContext != null) {
            if (z || pto.g(fluidContext)) {
                z2 = true;
            } else {
                z2 = false;
            }
            q8eVar.f26579a = z2;
            if (z || pto.i(fluidContext)) {
                z3 = true;
            } else {
                z3 = false;
            }
            q8eVar.b = z3;
        }
        if (!z && !((IContainerService) fluidContext.getService(IContainerService.class)).isHighActionbar()) {
            z4 = false;
        }
        q8eVar.c = z4;
        if (f2k.d(fluidContext)) {
            q8eVar.e = 0;
        } else if (b93.n(fluidContext)) {
            q8eVar.e = bbw.c(fluidContext, context, pto.q(fluidContext));
        } else {
            q8eVar.e = bbw.h(fluidContext, context, q8eVar.c);
        }
        return q8eVar;
    }

    @Deprecated
    public static HashMap<String, String> h(FluidContext fluidContext, int i, a.e eVar) {
        a.d dVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e05174a6", new Object[]{fluidContext, new Integer(i), eVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(eVar == null || (dVar = eVar.f7800a) == null)) {
            String str2 = "Android_" + dVar.f() + "_" + UUID.randomUUID();
            if (((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex() == 1) {
                str = "follow";
            } else {
                str = "recommend";
            }
            hashMap.put(atb.EXP_KEY_FULL_PAGE_UID, str2);
            hashMap.put(atb.EXP_KEY_FULL_PAGE_TITLE, dVar.I());
            hashMap.put(atb.EXP_KEY_FULL_PAGE_INDEX, String.valueOf(i));
            hashMap.put(atb.EXP_KEY_FULL_PAGE_TAB_NAME, str);
            hashMap.put(atb.EXP_KEY_FULL_PAGE_CONTENT_TYPE, dVar.N());
            hashMap.put("videoActionType", "init");
            f(fluidContext, hashMap);
            Map<String, String> tintAllTrackInfoWithDetail = ((ITrackService) fluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithDetail(eVar.f7800a);
            if (tintAllTrackInfoWithDetail != null) {
                hashMap.putAll(tintAllTrackInfoWithDetail);
            }
        }
        return hashMap;
    }
}
