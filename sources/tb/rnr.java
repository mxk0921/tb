package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.ui.TBLiveVideoView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import mtopsdk.mtop.util.ErrorConstant;
import tb.bpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rnr implements k9e, bpr.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveVideoView f27489a;
    public final Context b;
    public bpr.c c;
    public TBLiveDataModel d;
    public lkr e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(rnr rnrVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/ui/TBLiveWeexVideoController$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(779092084);
        t2o.a(806356094);
        t2o.a(779092002);
    }

    public rnr(Context context, String str, String str2, gjr gjrVar) {
        a aVar = new a(this);
        this.b = context;
        nmr.e().l(str, v2s.o().u().getUserId(), null, null, null, str2, null);
        gjrVar.f = str2;
        TBLiveVideoView tBLiveVideoView = new TBLiveVideoView(context);
        this.f27489a = tBLiveVideoView;
        tBLiveVideoView.setViewConfig(gjrVar);
        nmr.e().j(this);
        nmr.e().i(this, aVar);
        nmr.e().m();
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        lkr lkrVar = this.e;
        if (lkrVar != null) {
            lkrVar.d();
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.destroy();
        }
        nmr.e().o(this);
        nmr.e().n(this);
        nmr.e().a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81a547c", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.d;
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mRawData;
        }
        return null;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f27489a;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (f3s.d()) {
            mmr.p().m();
            mmr.p().n();
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            return tBLiveVideoView.isPlaying();
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.pause();
        }
        nmr.e().h();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b889444", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.setCoverImageVisible();
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.setMuted(z);
        }
    }

    public void i(bpr.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f016b8", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public final void j(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4349f686", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            this.d = tBLiveDataModel;
            int i = videoInfo.status;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                        }
                    }
                }
                k(videoInfo);
                return;
            }
            TBLiveVideoView tBLiveVideoView = this.f27489a;
            if (tBLiveVideoView != null) {
                tBLiveVideoView.destroy();
            }
        }
    }

    public final void k(VideoInfo videoInfo) {
        boolean z;
        TBLiveVideoView tBLiveVideoView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53073f3d", new Object[]{this, videoInfo});
            return;
        }
        if (this.e == null) {
            this.e = new lkr(this.f27489a, (Activity) this.b, false);
        }
        PreloadParams.a F = new PreloadParams.a(this.b).F("TBMiniLive");
        TBLiveVideoView tBLiveVideoView2 = this.f27489a;
        if (tBLiveVideoView2 == null || tBLiveVideoView2.isMute()) {
            z = true;
        } else {
            z = false;
        }
        r4d g = s7t.j().g(F.N(z).h0(videoInfo).U(PreloadParams.PlayerType.LIVE_ZOOM_WINDOW_TYPE).W(-1).g0(true).a0(pvs.z1()).G());
        TBLiveVideoView tBLiveVideoView3 = this.f27489a;
        if (tBLiveVideoView3 != null) {
            tBLiveVideoView3.setVideoView(g);
            this.f27489a.init(this.b);
            this.f27489a.setVideoCover(videoInfo.coverImg);
            this.f27489a.setVideoInfo(videoInfo);
        }
        int n = this.e.n(videoInfo, false);
        String i = this.e.i(videoInfo, n);
        this.e.m(false);
        int i2 = videoInfo.status;
        if ((i2 == 0 || i2 == 3) && (tBLiveVideoView = this.f27489a) != null) {
            tBLiveVideoView.setVideoDefinition(this.e.j(videoInfo, n));
            this.f27489a.playStreamUrl(i, this.e.b(), this.e.l(), -1, true);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f27489a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.start();
        }
        nmr.e().k();
    }

    @Override // tb.bpr.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        bpr.c cVar = this.c;
        if (cVar != null) {
            cVar.onMessageReceived(i, obj);
        }
    }

    @Override // tb.k9e
    public void onStatusChange(int i, Object obj) {
        TBLiveVideoView tBLiveVideoView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        } else if (i == 1) {
            cwd A = v2s.o().A();
            A.a("vanda", "STATUS_INIT_SUCCESS info = " + obj);
            j((TBLiveDataModel) obj);
            Log.e("TaoLiveRoomTest", "livedetail end:" + System.currentTimeMillis());
        } else if (i == 2) {
            String str = (String) obj;
            if (qsj.k(str)) {
                Toast.makeText(this.b, ErrorConstant.MappingMsg.FLOW_LIMIT_MAPPING_MSG, 0).show();
            } else if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
                Toast.makeText(this.b, R.string.minilive_network_error, 1).show();
            }
        } else if (i == 3 && (tBLiveVideoView = this.f27489a) != null) {
            tBLiveVideoView.destroy();
        }
    }
}
