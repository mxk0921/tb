package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IGreyFilterService;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view.NewPlayControlVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view.PlayControlDwVideoView;
import com.taobao.tao.log.TLog;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fra extends DXWidgetNode implements IVideoPlayControllerService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOVIEW_HVIDEOID = 3199987006404765204L;
    public static final long DXHVIDEOVIEW_HVIDEOPLAYINFO = 6814434335289370511L;
    public static final long DXHVIDEOVIEW_PLAYCONTROLLERENABLE = -8795905679455764171L;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONSIZE = 3509390040415201356L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "HVideoViewWidgetNodeByService";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String j;
    public JSONObject k;
    public String l;
    public String m;

    /* renamed from: a  reason: collision with root package name */
    public double f19481a = vu3.b.GEO_NOT_SUPPORT;
    public boolean b = true;
    public boolean h = true;
    public int i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements gbw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e9e f19482a;
        public final /* synthetic */ IVideoPlayControllerService.b b;

        public a(e9e e9eVar, IVideoPlayControllerService.b bVar) {
            this.f19482a = e9eVar;
            this.b = bVar;
        }

        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdfd530d", new Object[]{this, new Integer(i), str, str2});
            } else if (i == 1) {
                fra.u(fra.this, this.f19482a);
                fra.x(fra.this, this.b, str2);
            } else if (i == 2 || i == 4) {
                fra.u(fra.this, this.f19482a);
                fra.v(fra.this, this.b, str2);
                fra.w(fra.this, i, str, str2);
            } else if (i == 5) {
                ((y9w) this.b).H(fra.this);
            } else if (i == 6) {
                ((y9w) this.b).I(fra.this);
            } else if (i == 7) {
                fra.u(fra.this, this.f19482a);
                ((y9w) this.b).J(fra.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782211);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new fra();
        }
    }

    static {
        t2o.a(491782209);
        t2o.a(488636619);
    }

    public static /* synthetic */ void b(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c841f18", new Object[]{bVar});
        } else {
            ((y9w) bVar).K();
        }
    }

    public static /* synthetic */ Object ipc$super(fra fraVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/widget/HVideoViewWidgetNodeByService");
        }
    }

    public static /* synthetic */ void u(fra fraVar, e9e e9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239608df", new Object[]{fraVar, e9eVar});
        } else {
            fraVar.K(e9eVar);
        }
    }

    public static /* synthetic */ void v(fra fraVar, IVideoPlayControllerService.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774d937d", new Object[]{fraVar, bVar, str});
        } else {
            fraVar.H(bVar, str);
        }
    }

    public static /* synthetic */ void w(fra fraVar, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea170902", new Object[]{fraVar, new Integer(i), str, str2});
        } else {
            fraVar.A(i, str, str2);
        }
    }

    public static /* synthetic */ void x(fra fraVar, IVideoPlayControllerService.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43920e3b", new Object[]{fraVar, bVar, str});
        } else {
            fraVar.G(bVar, str);
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115a4391", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final DWAspectRatio C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("3e720d5b", new Object[]{this});
        }
        int i = this.i;
        if (i == 1) {
            return DWAspectRatio.DW_FIT_X_Y;
        }
        if (i != 2) {
            return DWAspectRatio.DW_FIT_CENTER;
        }
        return DWAspectRatio.DW_CENTER_CROP;
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf570ea", new Object[]{this})).booleanValue();
        }
        IGreyFilterService iGreyFilterService = (IGreyFilterService) j18.c(getDXRuntimeContext()).a(IGreyFilterService.class);
        BaseSectionModel<?> e = j18.e(getDXRuntimeContext());
        if (iGreyFilterService == null || e == null) {
            return false;
        }
        return iGreyFilterService.isNeedGreyCard(e);
    }

    public final void G(IVideoPlayControllerService.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3b2cba", new Object[]{this, bVar, str});
            return;
        }
        ((y9w) bVar).F(this);
        fve.e(TAG, "onPlayComplete, msg : " + str);
    }

    public final void H(IVideoPlayControllerService.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b24de43", new Object[]{this, bVar, str});
            return;
        }
        ((y9w) bVar).G(this);
        fve.e(TAG, "onPlayError, msg : " + str);
    }

    public final void I(e9e e9eVar, IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d707a4a", new Object[]{this, e9eVar, bVar});
        } else {
            e9eVar.registerVideoStatusListener(new a(e9eVar, bVar));
        }
    }

    public final void J(e9e e9eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac39a7d2", new Object[]{this, e9eVar, new Integer(i)});
        } else if (i == 1) {
            e9eVar.setScaleType(3);
            e9eVar.setCoverScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i != 2) {
            e9eVar.setScaleType(0);
            e9eVar.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            e9eVar.setScaleType(1);
            e9eVar.setCoverScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void K(e9e e9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3bdd4", new Object[]{this, e9eVar});
        } else {
            e9eVar.registerVideoStatusListener(null);
        }
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd3f3b4a", new Object[]{this})).booleanValue();
        }
        String str = this.m;
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new fra();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 4728577732966363983L || j == -8795905679455764171L) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c12dcadd", new Object[]{this})).booleanValue();
        }
        return B();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public void o(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19b28e9", new Object[]{this, bVar});
        } else if (B()) {
            if (E()) {
                fve.e(TAG, "置灰不播放视频");
                ((y9w) bVar).G(this);
                return;
            }
            View D = getDXRuntimeContext().D();
            if (!(D instanceof e9e)) {
                fve.e(TAG, "onCanPlay, view invalid");
                return;
            }
            e9e e9eVar = (e9e) D;
            I(e9eVar, bVar);
            final y9w y9wVar = (y9w) bVar;
            int E = y9wVar.E();
            fve.e(TAG, "seekTime: " + E);
            if (E != -1) {
                e9eVar.seekTo(E);
            }
            fve.e(TAG, "onCanPlay, videoUrl: " + this.j + ", coverUrl : " + this.c);
            e9eVar.playVideo();
            if (E != -1) {
                D.postDelayed(new Runnable() { // from class: tb.era
                    @Override // java.lang.Runnable
                    public final void run() {
                        fra.b(IVideoPlayControllerService.b.this);
                    }
                }, 2000L);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof fra) {
            fra fraVar = (fra) dXWidgetNode;
            this.i = fraVar.i;
            this.g = fraVar.g;
            this.j = fraVar.j;
            this.l = fraVar.l;
            this.m = fraVar.m;
            this.e = fraVar.e;
            this.f = fraVar.f;
            this.d = fraVar.d;
            this.c = fraVar.c;
            this.f19481a = fraVar.f19481a;
            this.h = fraVar.h;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.f19481a, vu3.b.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.f19481a);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.f19481a), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        y();
        if (view instanceof e9e) {
            e9e e9eVar = (e9e) view;
            z(e9eVar, context);
            a18.e().b(context, this.m, new o6w(this.j, this.l));
            JSONObject i = getDXRuntimeContext().i();
            this.k = i;
            e9eVar.updateData(i);
            e9eVar.setVideoUrl(this.j);
            e9eVar.setVideoID(this.l);
            e9eVar.setVideoPlayInfo(this.m);
            e9eVar.setIconOffsetY(this.e);
            e9eVar.setIconSize(this.f);
            e9eVar.setCoverImage(this.c);
            e9eVar.setPlayButtonImage(this.g);
            e9eVar.setDurationTime(this.d);
            J(e9eVar, this.i);
            e9eVar.canPlay(this.b);
            fve.e(TAG, "video_load_url=" + this.j + " video_id=" + this.l);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f19481a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.i = i;
        } else if (j == 4728577732966363983L) {
            if (i != 1) {
                z = false;
            }
            this.b = z;
        } else if (j == -8795905679455764171L) {
            if (i != 1) {
                z = false;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.c = str;
        } else if (j == 2057626925900400238L) {
            this.d = str;
        } else if (j == 8577182346642010996L) {
            this.e = str;
        } else if (j == 3509390040415201356L) {
            this.f = str;
        } else if (j == 7344459856848172626L) {
            this.j = str;
        } else if (j == 4951885508200836195L) {
            this.g = str;
        } else if (j == DXHVIDEOVIEW_HVIDEOID) {
            this.l = str;
        } else if (j == DXHVIDEOVIEW_HVIDEOPLAYINFO) {
            this.m = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public void s(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0376478", new Object[]{this, bVar});
        } else if (B()) {
            View D = getDXRuntimeContext().D();
            if (D instanceof e9e) {
                e9e e9eVar = (e9e) D;
                K(e9eVar);
                e9eVar.stopVideo();
                fve.e(TAG, "onShouldStop, videoUrl: " + this.j + ", coverUrl : " + this.c);
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8081bb", new Object[]{this});
        } else if (E()) {
            this.h = true;
        }
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23ce3e54", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) mza.d().c(wzi.NEW_VIDEO_PLAYER, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        y();
        if (!B()) {
            return new HVideoView(context);
        }
        if (M()) {
            NewPlayControlVideoView newPlayControlVideoView = new NewPlayControlVideoView(context);
            String str = this.m;
            if (str == null || str.isEmpty()) {
                newPlayControlVideoView.setVideoUrl(this.j);
            } else {
                newPlayControlVideoView.setVideoPlayInfo(this.m);
                String str2 = this.l;
                if (str2 != null && !str2.isEmpty()) {
                    newPlayControlVideoView.setVideoID(this.l);
                    TLog.logd("TB_Service", TAG, "setVideoID succeed");
                }
                TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
            }
            newPlayControlVideoView.init(context, true, C());
            return newPlayControlVideoView;
        } else if (!L()) {
            return new PlayControlVideoView(context, true);
        } else {
            PlayControlDwVideoView playControlDwVideoView = new PlayControlDwVideoView(context);
            String str3 = this.m;
            if (str3 == null || str3.isEmpty()) {
                playControlDwVideoView.setVideoUrl(this.j);
            } else {
                playControlDwVideoView.setVideoPlayInfo(this.m);
                String str4 = this.l;
                if (str4 != null && !str4.isEmpty()) {
                    playControlDwVideoView.setVideoID(this.l);
                    TLog.logd("TB_Service", TAG, "setVideoID succeed");
                }
                TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
            }
            playControlDwVideoView.init(context, true, C());
            return playControlDwVideoView;
        }
    }

    public final void z(e9e e9eVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce70a0ef", new Object[]{this, e9eVar, context});
            return;
        }
        if (e9eVar instanceof NewPlayControlVideoView) {
            NewPlayControlVideoView newPlayControlVideoView = (NewPlayControlVideoView) e9eVar;
            if (!TextUtils.equals(newPlayControlVideoView.getVideoID(), this.l) || !TextUtils.equals(newPlayControlVideoView.getVideoUrl(), this.j)) {
                newPlayControlVideoView.release();
                String str = this.m;
                if (str == null || str.isEmpty()) {
                    newPlayControlVideoView.setVideoUrl(this.j);
                } else {
                    newPlayControlVideoView.setVideoPlayInfo(this.m);
                    String str2 = this.l;
                    if (str2 != null && !str2.isEmpty()) {
                        newPlayControlVideoView.setVideoID(this.l);
                        TLog.logd("TB_Service", TAG, "setVideoID succeed");
                    }
                    TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
                }
                newPlayControlVideoView.init(context, true, C());
            }
        }
        if (e9eVar instanceof PlayControlDwVideoView) {
            PlayControlDwVideoView playControlDwVideoView = (PlayControlDwVideoView) e9eVar;
            if (!TextUtils.equals(playControlDwVideoView.getVideoID(), this.l) || !TextUtils.equals(playControlDwVideoView.getVideoUrl(), this.j)) {
                playControlDwVideoView.release();
                String str3 = this.m;
                if (str3 == null || str3.isEmpty()) {
                    playControlDwVideoView.setVideoUrl(this.j);
                } else {
                    playControlDwVideoView.setVideoPlayInfo(this.m);
                    String str4 = this.l;
                    if (str4 != null && !str4.isEmpty()) {
                        playControlDwVideoView.setVideoID(this.l);
                        TLog.logd("TB_Service", TAG, "setVideoID succeed");
                    }
                    TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
                }
                playControlDwVideoView.init(context, true, C());
            }
        }
    }

    public final void A(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0063d99", new Object[]{this, new Integer(i), str, str2});
        } else if (i == 2) {
            tve.b("video", "video_playFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
        } else if (i == 4) {
            if (TextUtils.equals("pre_download_failed", str)) {
                tve.b("video", "video_downloadFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
            } else {
                tve.b("video", "video_fetchFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
            }
        }
    }

    public final boolean D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8857b09", new Object[]{this, str})).booleanValue();
        }
        View D = getDXRuntimeContext().D();
        if (!(D instanceof HVideoView)) {
            return false;
        }
        String str2 = "";
        if (TextUtils.equals(str, "play")) {
            ((HVideoView) D).playVideo();
            JSONObject jSONObject = this.k;
            if (jSONObject != null) {
                str2 = jSONObject.getString("sectionBizCode");
            }
            fve.e(TAG, "start video: section:", str2);
        } else if (TextUtils.equals(str, "pause")) {
            ((HVideoView) D).pauseVideo();
            JSONObject jSONObject2 = this.k;
            if (jSONObject2 != null) {
                str2 = jSONObject2.getString("sectionBizCode");
            }
            fve.e(TAG, "pause video: section:", str2);
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (B()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == 5288671110273408574L) {
            return D("play");
        }
        if (eventId == 5388973340095122049L) {
            return D("pause");
        }
        return false;
    }
}
