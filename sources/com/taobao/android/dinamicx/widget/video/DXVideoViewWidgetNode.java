package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoProgressView;
import com.taobao.android.dinamicx.widget.video.a;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.cxb;
import tb.exb;
import tb.h36;
import tb.hwb;
import tb.mw5;
import tb.qub;
import tb.wfp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXVideoViewWidgetNode extends DXWidgetNode implements hwb, exb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIDEOVIEW_BUSINESSID = 6324682256668551971L;
    public static final long DXVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DXVIDEOVIEW_CONTROLMODE = -5617586525335578991L;
    public static final int DXVIDEOVIEW_CONTROLMODE_AUTO = 0;
    public static final int DXVIDEOVIEW_CONTROLMODE_MANUAL = 1;
    public static final int DXVIDEOVIEW_CONTROLMODE_PLAYCONTROL = 2;
    public static final long DXVIDEOVIEW_COVERSCALETYPE = -2261513180223804489L;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_CENTERCROP = 2;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_FITCENTER = 0;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_FITXY = 1;
    public static final long DXVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DXVIDEOVIEW_ENABLEPREPARETOFIRSTFRAME = 969596831546698501L;
    public static final long DXVIDEOVIEW_HIDDENICONONSTOP = 2254251221971377256L;
    public static final long DXVIDEOVIEW_ICONID = 9418897494345820L;
    public static final long DXVIDEOVIEW_IGNORENETWORK = 9075198007090888571L;
    public static final long DXVIDEOVIEW_LOOP = 35880685214L;
    public static final long DXVIDEOVIEW_MUTE = 36176011951L;
    public static final long DXVIDEOVIEW_ONACTION = -8545689907459660475L;
    public static final long DXVIDEOVIEW_ONTIMEUPDATED = 1082484218474589760L;
    public static final long DXVIDEOVIEW_ONVIDEOERROR = 7340625222798644714L;
    public static final long DXVIDEOVIEW_ONVIDEOSTART = 7340629229134476526L;
    public static final long DXVIDEOVIEW_ONVIDEOSTOP = -7567658013608852091L;
    public static final long DXVIDEOVIEW_PASSONTRACK = -5458098620721369484L;
    public static final long DXVIDEOVIEW_PROGRESSBARID = -8545689907459660476L;
    public static final long DXVIDEOVIEW_PROGRESSINTERVAL = -1950664219134012726L;
    public static final long DXVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXVIDEOVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXVIDEOVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXVIDEOVIEW_SCALETYPE_FITXY = 1;
    public static final long DXVIDEOVIEW_SUBBUSINESSID = 5688343922917753936L;
    public static final long DXVIDEOVIEW_VIDEOID = 5435952498458972235L;
    public static final long DXVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long DXVIDEOVIEW_VIDEOVIEW = -4556233998858362981L;
    public static final String VIEW_TAT = "ts_video_view";
    private String businessId;
    private String coverUrl;
    private String passOnTrack;
    private String progressBarId;
    private DXProgressBarWidgetNode progressBarWidgetNode;
    private int progressInterval;
    private String subBusinessId;
    private String videoId;
    private String videoUrl;
    private boolean canPlay = true;
    private int controlMode = 0;
    private int coverScaleType = 0;
    private boolean enablePrepareToFirstFrame = false;
    private boolean hiddenIconOnStop = false;
    private boolean ignoreNetwork = false;
    private boolean loop = false;
    private boolean mute = false;
    private int scaleType = 0;
    private String iconId = "";
    private int backGroundColor = 0;
    private final DXVideoProgressView.b videoSeekToCallback = new a();
    private final a.AbstractC0403a iVideoPlayEventListener = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXVideoProgressView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3270d35", new Object[]{this, new Integer(i), new Double(d)});
                return;
            }
            if (DXVideoViewWidgetNode.access$000(DXVideoViewWidgetNode.this) != null) {
                DXVideoViewWidgetNode.access$000(DXVideoViewWidgetNode.this).setValue(d);
            }
            DXVideoViewWidgetNode.this.seekTo(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxb f7523a;
        public final /* synthetic */ String b;

        public b(cxb cxbVar, String str) {
            this.f7523a = cxbVar;
            this.b = str;
        }

        @Override // com.taobao.android.dinamicx.widget.video.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37b5e61c", new Object[]{this});
            } else {
                this.f7523a.g(DXVideoViewWidgetNode.this, this.b);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.video.a.b
        public void onPlayCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af1a25f", new Object[]{this});
            } else {
                this.f7523a.h(DXVideoViewWidgetNode.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements a.AbstractC0403a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.dinamicx.widget.video.a.AbstractC0403a
        public void a(boolean z, boolean z2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5db93fc7", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            DXEvent dXEvent = new DXEvent(DXVideoViewWidgetNode.DXVIDEOVIEW_ONVIDEOSTART);
            HashMap hashMap = new HashMap();
            hashMap.put("isPlayControlTrigger", mw5.G(z));
            hashMap.put("isResumePlay", mw5.G(z2));
            if (TextUtils.isEmpty(DXVideoViewWidgetNode.access$100(DXVideoViewWidgetNode.this))) {
                str = DXVideoViewWidgetNode.access$200(DXVideoViewWidgetNode.this);
            } else {
                str = DXVideoViewWidgetNode.access$100(DXVideoViewWidgetNode.this);
            }
            hashMap.put("videoIdentifier", mw5.O(str));
            dXEvent.setArgs(hashMap);
            DXVideoViewWidgetNode.this.postEvent(dXEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXVideoViewWidgetNode();
        }
    }

    public static /* synthetic */ DXProgressBarWidgetNode access$000(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXProgressBarWidgetNode) ipChange.ipc$dispatch("d2efd6b9", new Object[]{dXVideoViewWidgetNode});
        }
        return dXVideoViewWidgetNode.progressBarWidgetNode;
    }

    public static /* synthetic */ String access$100(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6d0515f", new Object[]{dXVideoViewWidgetNode});
        }
        return dXVideoViewWidgetNode.videoId;
    }

    public static /* synthetic */ String access$200(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92b683e", new Object[]{dXVideoViewWidgetNode});
        }
        return dXVideoViewWidgetNode.videoUrl;
    }

    private void findProgressBarNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f5d3d6", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.progressBarId)) {
            DXWidgetNode queryWTByUserId = queryRootWidgetNode().queryWTByUserId(this.progressBarId);
            if (queryWTByUserId instanceof DXProgressBarWidgetNode) {
                this.progressBarWidgetNode = (DXProgressBarWidgetNode) queryWTByUserId;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DXVideoViewWidgetNode dXVideoViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXVideoViewWidgetNode");
        }
    }

    private void resetProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac205b23", new Object[]{this});
            return;
        }
        DXProgressBarWidgetNode dXProgressBarWidgetNode = this.progressBarWidgetNode;
        if (dXProgressBarWidgetNode != null) {
            dXProgressBarWidgetNode.reset();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXVideoViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXVIDEOVIEW_COVERSCALETYPE) {
            return 1;
        }
        if (j == DXVIDEOVIEW_LOOP) {
            return 0;
        }
        if (j == 36176011951L || j == 1015096712691932083L) {
            return 1;
        }
        if (j == DXVIDEOVIEW_CONTROLMODE) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if ("isPlaying".equals(str)) {
            View D = getDXRuntimeContext().D();
            if (D instanceof com.taobao.android.dinamicx.widget.video.a) {
                return Boolean.valueOf(((com.taobao.android.dinamicx.widget.video.a) D).isPlaying());
            }
            return Boolean.FALSE;
        } else if (!"isMuted".equals(str)) {
            return null;
        } else {
            View D2 = getDXRuntimeContext().D();
            if (D2 instanceof com.taobao.android.dinamicx.widget.video.a) {
                return Boolean.valueOf(((com.taobao.android.dinamicx.widget.video.a) D2).isMuted());
            }
            return Boolean.FALSE;
        }
    }

    public boolean isPlayIgnoreNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ae4ea9", new Object[]{this})).booleanValue();
        }
        return this.ignoreNetwork;
    }

    @Override // tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
            return;
        }
        h36.g("nov_video", "onCanPlay");
        playVideo(new b(cxbVar, str));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof DXVideoViewWidgetNode) {
            super.onClone(dXWidgetNode, z);
            DXVideoViewWidgetNode dXVideoViewWidgetNode = (DXVideoViewWidgetNode) dXWidgetNode;
            this.controlMode = dXVideoViewWidgetNode.controlMode;
            this.canPlay = dXVideoViewWidgetNode.canPlay;
            this.coverScaleType = dXVideoViewWidgetNode.coverScaleType;
            this.coverUrl = dXVideoViewWidgetNode.coverUrl;
            this.loop = dXVideoViewWidgetNode.loop;
            this.mute = dXVideoViewWidgetNode.mute;
            this.scaleType = dXVideoViewWidgetNode.scaleType;
            this.videoId = dXVideoViewWidgetNode.videoId;
            this.videoUrl = dXVideoViewWidgetNode.videoUrl;
            this.hiddenIconOnStop = dXVideoViewWidgetNode.hiddenIconOnStop;
            this.ignoreNetwork = dXVideoViewWidgetNode.ignoreNetwork;
            this.enablePrepareToFirstFrame = dXVideoViewWidgetNode.enablePrepareToFirstFrame;
            this.progressBarId = dXVideoViewWidgetNode.progressBarId;
            this.subBusinessId = dXVideoViewWidgetNode.subBusinessId;
            this.progressInterval = dXVideoViewWidgetNode.progressInterval;
            this.iconId = dXVideoViewWidgetNode.iconId;
            this.progressBarWidgetNode = dXVideoViewWidgetNode.progressBarWidgetNode;
            this.businessId = dXVideoViewWidgetNode.businessId;
            this.passOnTrack = dXVideoViewWidgetNode.passOnTrack;
            this.backGroundColor = dXVideoViewWidgetNode.backGroundColor;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNewVideoView dXNewVideoView = new DXNewVideoView(context);
        dXNewVideoView.setTag(VIEW_TAT);
        return dXNewVideoView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        mw5 mw5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() != DXVIDEOVIEW_ONACTION) {
            return super.onEvent(dXEvent);
        }
        Map<String, mw5> args = dXEvent.getArgs();
        if (!(args == null || (mw5Var = args.get("action")) == null)) {
            doAction(mw5Var.p());
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        String str;
        String str2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        findProgressBarNode();
        if (view != null) {
            view.setTag(R.id.dx_video_player_event, this.iVideoPlayEventListener);
            com.taobao.android.dinamicx.widget.video.a aVar = (com.taobao.android.dinamicx.widget.video.a) view;
            DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
            if (TextUtils.isEmpty(this.iconId)) {
                aVar.setPlayButtonImage("https://gw.alicdn.com/imgextra/i4/O1CN01JbjPoN1KKufxzJk3o_!!6000000001146-2-tps-192-192.png");
            } else {
                aVar.setCustomerPlayIcon(queryRootWidgetNode.queryWidgetNodeByUserId(this.iconId));
            }
            if (TextUtils.isEmpty(this.businessId)) {
                str = "DXVideo";
            } else {
                str = this.businessId;
            }
            aVar.setBizId(str);
            if (TextUtils.isEmpty(this.subBusinessId)) {
                str2 = "";
            } else {
                str2 = this.subBusinessId;
            }
            aVar.setSubBusinessId(str2);
            aVar.setProgressInterval(this.progressInterval);
            aVar.setVideoId(this.videoId);
            aVar.setVideoUrl(this.videoUrl);
            aVar.setCoverImageScaleType(this.coverScaleType);
            aVar.setCoverImage(this.coverUrl);
            aVar.setLooping(this.loop);
            aVar.setMuted(this.mute);
            aVar.canPlay(this.canPlay);
            aVar.setScaleType(this.scaleType);
            aVar.setVideoSize(getMeasuredWidth(), getMeasuredHeight());
            aVar.setPassOnTrack(this.passOnTrack);
            aVar.setHideIconOnStop(this.hiddenIconOnStop);
            aVar.setPlayIgnoreNetwork(this.ignoreNetwork);
            if (getEnabled() == 1) {
                z = true;
            } else {
                z = false;
            }
            aVar.setClickListenerControlPlay(z);
            aVar.setBackGroundColor(this.backGroundColor);
            if (this.enablePrepareToFirstFrame) {
                aVar.prepareToFirstFrame();
            }
            int i = this.controlMode;
            if (i == 0) {
                aVar.setEnablePlayControl(false);
                aVar.setAutoControl(true);
                if (wfp.INSTANCE.a(context)) {
                    aVar.playVideo(true);
                }
            } else if (i == 2) {
                aVar.setEnablePlayControl(true);
                aVar.setAutoControl(false);
            } else {
                aVar.setEnablePlayControl(false);
                aVar.setAutoControl(false);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (j == DXVIDEOVIEW_CONTROLMODE) {
            this.controlMode = i;
        } else if (j == 4728577732966363983L) {
            if (i == 0) {
                z = false;
            }
            this.canPlay = z;
        } else if (j == DXVIDEOVIEW_COVERSCALETYPE) {
            this.coverScaleType = i;
        } else if (j == DXVIDEOVIEW_LOOP) {
            if (i == 0) {
                z = false;
            }
            this.loop = z;
        } else if (j == 36176011951L) {
            if (i == 0) {
                z = false;
            }
            this.mute = z;
        } else if (j == 1015096712691932083L) {
            this.scaleType = i;
        } else if (j == DXVIDEOVIEW_HIDDENICONONSTOP) {
            if (i != 1) {
                z = false;
            }
            this.hiddenIconOnStop = z;
        } else if (-2819959685970048978L == j) {
            this.backGroundColor = i;
        } else if (j == DXVIDEOVIEW_IGNORENETWORK) {
            if (i != 1) {
                z = false;
            }
            this.ignoreNetwork = z;
        } else if (j == DXVIDEOVIEW_ENABLEPREPARETOFIRSTFRAME) {
            if (i == 0) {
                z = false;
            }
            this.enablePrepareToFirstFrame = z;
        }
        if (j == DXVIDEOVIEW_PROGRESSINTERVAL) {
            this.progressInterval = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        if (j == DXVIDEOVIEW_BUSINESSID) {
            this.businessId = str;
        } else if (j == 1756289496339923034L) {
            this.coverUrl = str;
        } else if (j == DXVIDEOVIEW_PASSONTRACK) {
            this.passOnTrack = str;
        } else if (j == DXVIDEOVIEW_SUBBUSINESSID) {
            this.subBusinessId = str;
        } else if (j == 5435952498458972235L) {
            this.videoId = str;
        } else if (j == 7344459856848172626L) {
            this.videoUrl = str;
        }
        if (j == DXVIDEOVIEW_ICONID) {
            this.iconId = str;
        } else if (j == DXVIDEOVIEW_PROGRESSBARID) {
            this.progressBarId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.exb
    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
            return;
        }
        h36.g("nov_video", "onShouldStop");
        View D = getDXRuntimeContext().D();
        if (D instanceof com.taobao.android.dinamicx.widget.video.a) {
            com.taobao.android.dinamicx.widget.video.a aVar = (com.taobao.android.dinamicx.widget.video.a) D;
            aVar.setITSVideoStatusCallback(null);
            aVar.destroyVideo();
            resetProgress();
        }
    }

    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        DXProgressBarWidgetNode dXProgressBarWidgetNode = this.progressBarWidgetNode;
        if (dXProgressBarWidgetNode != null) {
            dXProgressBarWidgetNode.setVideoSeekToCallback(this.videoSeekToCallback);
            this.progressBarWidgetNode.onVideoProgressChanged(i, i2, i3);
        }
    }

    public void pauseVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fc628", new Object[]{this, new Boolean(z)});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof com.taobao.android.dinamicx.widget.video.a) {
            if (z) {
                ((com.taobao.android.dinamicx.widget.video.a) D).destroyVideo();
            } else {
                ((com.taobao.android.dinamicx.widget.video.a) D).pauseVideo();
            }
            ((com.taobao.android.dinamicx.widget.video.a) D).setITSVideoStatusCallback(null);
        }
    }

    public void playVideo(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599ae549", new Object[]{this, bVar});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof com.taobao.android.dinamicx.widget.video.a) {
            com.taobao.android.dinamicx.widget.video.a aVar = (com.taobao.android.dinamicx.widget.video.a) D;
            aVar.setITSVideoStatusCallback(bVar);
            aVar.playVideo();
        }
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof com.taobao.android.dinamicx.widget.video.a) {
            ((com.taobao.android.dinamicx.widget.video.a) D).seekTo(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r7.equals("play") == false) goto L_0x0031;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doAction(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "87a4be72"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            r3.ipc$dispatch(r4, r0)
            return
        L_0x0015:
            com.taobao.android.dinamicx.DXRuntimeContext r3 = r6.getDXRuntimeContext()
            android.view.View r3 = r3.D()
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            boolean r4 = r3 instanceof com.taobao.android.dinamicx.widget.video.a
            if (r4 == 0) goto L_0x0098
            com.taobao.android.dinamicx.widget.video.a r3 = (com.taobao.android.dinamicx.widget.video.a) r3
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -840405966: goto L_0x006c;
                case 3363353: goto L_0x0060;
                case 3443508: goto L_0x0056;
                case 3540994: goto L_0x004a;
                case 94750088: goto L_0x003f;
                case 106440182: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0 = -1
            goto L_0x0077
        L_0x0033:
            java.lang.String r0 = "pause"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r0 = 5
            goto L_0x0077
        L_0x003f:
            java.lang.String r0 = "click"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            r0 = 4
            goto L_0x0077
        L_0x004a:
            java.lang.String r0 = "stop"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0054
            goto L_0x0031
        L_0x0054:
            r0 = 3
            goto L_0x0077
        L_0x0056:
            java.lang.String r5 = "play"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0077
            goto L_0x0031
        L_0x0060:
            java.lang.String r0 = "mute"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x006a
            goto L_0x0031
        L_0x006a:
            r0 = 1
            goto L_0x0077
        L_0x006c:
            java.lang.String r0 = "unmute"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0076
            goto L_0x0031
        L_0x0076:
            r0 = 0
        L_0x0077:
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0091;
                case 2: goto L_0x008d;
                case 3: goto L_0x0083;
                case 4: goto L_0x007f;
                case 5: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0098
        L_0x007b:
            r3.pauseVideo()
            goto L_0x0098
        L_0x007f:
            r3.responseOnClick()
            goto L_0x0098
        L_0x0083:
            r3.seekTo(r2)
            r3.pauseVideo()
            r3.showCoverImageView()
            goto L_0x0098
        L_0x008d:
            r3.playVideo()
            goto L_0x0098
        L_0x0091:
            r3.setMuted(r1)
            goto L_0x0098
        L_0x0095:
            r3.setMuted(r2)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode.doAction(java.lang.String):void");
    }
}
