package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoContainer;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.HashMap;
import java.util.Map;
import tb.sc7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v75 implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWVideoContainer f29821a;
    public w75 b;
    public u75 c;
    public final DWContext d;
    public ProgressBar e;
    public Animation f;
    public xtb g;
    public long h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l = true;
    public final boolean m = true;
    public boolean n;
    public boolean o;
    public boolean p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            v75.a(v75.this, false);
            v75.b(v75.this);
            v75.c(v75.this).c();
            v75.d(v75.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f29823a;

        public b(e eVar) {
            this.f29823a = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f29823a.getClass();
            if (!TextUtils.isEmpty(null) && v75.this.d.getDWEventAdapter() != null) {
                usb dWEventAdapter = v75.this.d.getDWEventAdapter();
                this.f29823a.getClass();
                dWEventAdapter.openUrl(null);
                HashMap hashMap = new HashMap();
                hashMap.put("link", "success");
                DWContext dWContext = v75.this.d;
                dWContext.mUTAdapter.a("DWVideo", "Button", "videopicLink", dWContext.getUTParams(), hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ttb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (v75.e(v75.this) != null) {
                    v75.e(v75.this).a().setVisibility(8);
                }
            }
        }

        public c() {
        }

        @Override // tb.ttb
        public void a(com.taobao.avplayer.player.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bf8fb2", new Object[]{this, aVar});
            } else if (v75.e(v75.this) != null && v75.e(v75.this).a() != null && v75.c(v75.this).getVideoState() == 1) {
                if (v75.e(v75.this).a().getVisibility() == 0 || v75.f(v75.this).getVisibility() == 0) {
                    v75 v75Var = v75.this;
                    if (v75Var.o) {
                        v75.g(v75Var);
                        v75.h(v75.this).postDelayed(new a(), 400L);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f29826a;

        static {
            t2o.a(452984855);
        }

        public d(Activity activity) {
            e eVar = new e();
            this.f29826a = eVar;
            eVar.f29827a = activity;
        }

        public d a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a2b4c409", new Object[]{this, str});
            }
            this.f29826a.c = str;
            return this;
        }

        public d b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1f074b6a", new Object[]{this, str});
            }
            this.f29826a.i = str;
            return this;
        }

        public d c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("fda568ed", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getRealPxByWidth(600.0f);
            }
            this.f29826a.f = i;
            return this;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            } else {
                this.f29826a.k = z;
            }
        }

        public d e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e0bba4c1", new Object[]{this, new Boolean(z)});
            }
            this.f29826a.h = z;
            return this;
        }

        public d f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("297656e8", new Object[]{this, new Boolean(z)});
            }
            this.f29826a.j = z;
            return this;
        }

        public d g(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("48ba01f", new Object[]{this, hashMap});
            }
            this.f29826a.g = hashMap;
            return this;
        }

        public d h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("eaf5215f", new Object[]{this, str});
            }
            this.f29826a.d = str;
            return this;
        }

        public d i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("b4d2daa", new Object[]{this, new Boolean(z)});
            }
            this.f29826a.l = z;
            return this;
        }

        public d j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("61dea1", new Object[]{this, str});
            }
            this.f29826a.b = str;
            return this;
        }

        public d k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("61732d32", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getScreenWidth();
            }
            this.f29826a.e = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Activity f29827a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public Map<String, String> g;
        public boolean h;
        public String i;
        public boolean j = false;
        public boolean k;
        public boolean l;

        static {
            t2o.a(452984856);
        }
    }

    static {
        t2o.a(452984850);
        t2o.a(452985011);
    }

    public v75(e eVar) {
        DWContext dWContext = new DWContext(eVar.f29827a);
        this.d = dWContext;
        MediaPlayControlContext mediaPlayControlContext = new MediaPlayControlContext(eVar.f29827a, "");
        dWContext.mPlayContext = mediaPlayControlContext;
        mediaPlayControlContext.setVideoUrl(eVar.b);
        MediaPlayControlContext mediaPlayControlContext2 = dWContext.mPlayContext;
        mediaPlayControlContext2.mConfigGroup = "DWInteractive";
        mediaPlayControlContext2.setPlayerType(3);
        int i = eVar.e;
        dWContext.mWidth = i;
        int i2 = eVar.f;
        dWContext.mHeight = i2;
        dWContext.mNormalWidth = i;
        dWContext.mNormalHeight = i2;
        dWContext.mDWImageAdapter = null;
        dWContext.mNetworkAdapter = null;
        dWContext.mUTAdapter = null;
        dWContext.mConfigAdapter = null;
        dWContext.mConfigParamsAdapter = null;
        dWContext.mute(eVar.k);
        dWContext.mNeedVideoCache = eVar.j;
        dWContext.mUserId = -1L;
        MediaPlayControlContext mediaPlayControlContext3 = dWContext.mPlayContext;
        String str = eVar.c;
        mediaPlayControlContext3.mFrom = str;
        dWContext.mFrom = str;
        String str2 = eVar.d;
        mediaPlayControlContext3.mVideoId = str2;
        dWContext.mVideoId = str2;
        dWContext.setInstanceType(DWInstanceType.GIF);
        dWContext.mPlayContext.mBusinessId = "DWGif";
        q(eVar);
        s(eVar);
        Map<String, String> map = eVar.g;
        if (map != null) {
            dWContext.addUtParams(map);
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWGifInstance);
    }

    public static /* synthetic */ boolean a(v75 v75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57479850", new Object[]{v75Var, new Boolean(z)})).booleanValue();
        }
        v75Var.l = z;
        return z;
    }

    public static /* synthetic */ void b(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4333dee9", new Object[]{v75Var});
        } else {
            v75Var.w();
        }
    }

    public static /* synthetic */ w75 c(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w75) ipChange.ipc$dispatch("7b0e8acc", new Object[]{v75Var});
        }
        return v75Var.b;
    }

    public static /* synthetic */ void d(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fe4927", new Object[]{v75Var});
        } else {
            v75Var.k();
        }
    }

    public static /* synthetic */ u75 e(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u75) ipChange.ipc$dispatch("693de62b", new Object[]{v75Var});
        }
        return v75Var.c;
    }

    public static /* synthetic */ ProgressBar f(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("96e26885", new Object[]{v75Var});
        }
        return v75Var.e;
    }

    public static /* synthetic */ void g(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682de884", new Object[]{v75Var});
        } else {
            v75Var.p();
        }
    }

    public static /* synthetic */ DWVideoContainer h(v75 v75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoContainer) ipChange.ipc$dispatch("4dacf9a3", new Object[]{v75Var});
        }
        return v75Var.f29821a;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d.mPlayContext.getVideoUrl())) {
            return false;
        }
        if (TextUtils.isEmpty(this.d.mFrom)) {
            this.d.mFrom = "default";
        }
        return !TextUtils.isEmpty(this.d.mVideoId);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        w75 w75Var = this.b;
        if (w75Var != null) {
            w75Var.a();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.n) {
            this.n = true;
            m();
            w75 w75Var = this.b;
            if (w75Var != null) {
                w75Var.e();
            }
        }
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f29821a;
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
            return;
        }
        xtb xtbVar = this.g;
        if (xtbVar != null) {
            ((sc7.b) xtbVar).a();
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        u75 u75Var = this.c;
        if (u75Var != null) {
            u75Var.a().setVisibility(8);
        }
        p();
        xtb xtbVar = this.g;
        if (xtbVar != null) {
            ((sc7.b) xtbVar).b(obj, i, i2);
        }
        DWContext dWContext = this.d;
        if (dWContext != null && dWContext.mDWAlarmAdapter != null) {
            DWStabilityData dWStabilityData = new DWStabilityData();
            dWStabilityData.code = String.valueOf(i);
            dWStabilityData.msg = String.valueOf(i2);
            StringBuffer stringBuffer = new StringBuffer(100);
            stringBuffer.append("bizCode=");
            stringBuffer.append(this.d.mFrom);
            stringBuffer.append(",videoId=");
            stringBuffer.append(this.d.mVideoId);
            stringBuffer.append(",useCache=");
            w75 w75Var = this.b;
            if (w75Var != null) {
                z = w75Var.q();
            } else {
                z = false;
            }
            stringBuffer.append(z);
            stringBuffer.append(",hitCache=");
            w75 w75Var2 = this.b;
            if (w75Var2 != null) {
                z2 = w75Var2.p();
            }
            stringBuffer.append(z2);
            stringBuffer.append(",url=");
            stringBuffer.append(this.d.mPlayContext.getVideoUrl());
            stringBuffer.append(",videoSource=");
            stringBuffer.append(this.d.getVideoSource());
            dWStabilityData.args = stringBuffer.toString();
            DWContext dWContext2 = this.d;
            ((k95) dWContext2.mDWAlarmAdapter).a(dWContext2.getActivity(), "DWGif", "GifPlay", false, dWStabilityData);
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 == j) {
            this.o = true;
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        xtb xtbVar = this.g;
        if (xtbVar != null) {
            ((sc7.b) xtbVar).c();
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        xtb xtbVar = this.g;
        if (xtbVar != null) {
            ((sc7.b) xtbVar).d();
        }
        this.i = System.currentTimeMillis();
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.i != 0) {
            this.h += System.currentTimeMillis() - this.i;
        }
        this.i = System.currentTimeMillis();
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
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        l();
        xtb xtbVar = this.g;
        if (xtbVar != null) {
            ((sc7.b) xtbVar).e();
        }
        this.i = System.currentTimeMillis();
        DWContext dWContext = this.d;
        if (dWContext != null && dWContext.mDWAlarmAdapter != null) {
            DWStabilityData dWStabilityData = new DWStabilityData();
            StringBuffer stringBuffer = new StringBuffer(100);
            stringBuffer.append("bizCode=");
            stringBuffer.append(this.d.mFrom);
            stringBuffer.append(",videoId=");
            stringBuffer.append(this.d.mVideoId);
            stringBuffer.append(",useCache=");
            w75 w75Var = this.b;
            if (w75Var != null) {
                z = w75Var.q();
            } else {
                z = false;
            }
            stringBuffer.append(z);
            stringBuffer.append(",hitCache=");
            w75 w75Var2 = this.b;
            if (w75Var2 != null) {
                z2 = w75Var2.p();
            }
            stringBuffer.append(z2);
            stringBuffer.append(",url=");
            stringBuffer.append(this.d.mPlayContext.getVideoUrl());
            stringBuffer.append(",videoSource=");
            stringBuffer.append(this.d.getVideoSource());
            dWStabilityData.args = stringBuffer.toString();
            DWContext dWContext2 = this.d;
            ((k95) dWContext2.mDWAlarmAdapter).a(dWContext2.getActivity(), "DWGif", "GifPlay", true, dWStabilityData);
        }
    }

    public final void p() {
        ProgressBar progressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa48b2ee", new Object[]{this});
        } else if (this.m && (progressBar = this.e) != null && progressBar.getVisibility() != 8) {
            this.e.clearAnimation();
            this.e.setVisibility(8);
        }
    }

    public void q(e eVar) {
        throw null;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d447041c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.d.mFrom)) {
            hashMap.put("page", this.d.mFrom.toLowerCase());
        }
        if (!TextUtils.isEmpty(this.d.mVideoId)) {
            hashMap.put(xau.PROPERTY_VIDEO_ID, this.d.mVideoId + "");
        }
        hashMap.put("userId", String.valueOf(this.d.mUserId));
        hashMap.put("interactId", String.valueOf(this.d.mInteractiveId));
        hashMap.put("mediaType", "4");
        this.d.addUtParams(hashMap);
    }

    public final void s(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2540175d", new Object[]{this, eVar});
            return;
        }
        this.b = new w75(this.d, eVar.l);
        this.f29821a = new DWVideoContainer(this.d);
        DWContext dWContext = this.d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dWContext.mWidth, dWContext.mHeight);
        layoutParams.gravity = 17;
        this.f29821a.addView(this.b.r(), layoutParams);
        if (eVar.h && !TextUtils.isEmpty(eVar.i)) {
            u75 u75Var = new u75(this.d, eVar.i);
            this.c = u75Var;
            ViewProxy.setOnClickListener(u75Var.a(), new a());
            DWVideoContainer dWVideoContainer = this.f29821a;
            View a2 = this.c.a();
            DWContext dWContext2 = this.d;
            dWVideoContainer.addView(a2, new FrameLayout.LayoutParams(dWContext2.mWidth, dWContext2.mHeight));
        }
        ViewProxy.setOnClickListener(this.b.r(), new b(eVar));
        if (this.e == null && this.m) {
            ProgressBar progressBar = new ProgressBar(this.d.getActivity());
            this.e = progressBar;
            progressBar.setVisibility(8);
            this.e.setIndeterminateDrawable(this.d.getActivity().getResources().getDrawable(R.drawable.tbavsdk_video_loading));
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f = rotateAnimation;
            rotateAnimation.setDuration(600L);
            this.f.setInterpolator(new LinearInterpolator());
            this.f.setRepeatCount(-1);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.d.getActivity(), 80.0f), DWViewUtil.dip2px(this.d.getActivity(), 80.0f));
            layoutParams2.gravity = 17;
            this.f29821a.addView(this.e, layoutParams2);
        }
        this.b.v(new c());
        this.b.u(this);
    }

    public void t() {
        w75 w75Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (this.b.getVideoState() != 1 && (w75Var = this.b) != null) {
            w75Var.playVideo();
        }
    }

    public void u(xtb xtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2539f11c", new Object[]{this, xtbVar});
        } else {
            this.g = xtbVar;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        if (!i()) {
            if (!MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "please set mBizcode , mVideoSource and  mVideoUrl parameters");
            } else {
                throw new RuntimeException("please set bizcode , source and  videoUrl parameters");
            }
        }
        r();
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d82d53", new Object[]{this});
        } else if (this.m && this.f != null) {
            this.e.setVisibility(0);
            this.e.setAnimation(this.f);
            this.f.start();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        w75 w75Var = this.b;
        if (w75Var != null && w75Var.d()) {
            w();
            this.b.c();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90254661", new Object[]{this});
        } else if (!this.p) {
            HashMap hashMap = new HashMap();
            hashMap.put("wifiAuto", String.valueOf(this.l));
            DWContext dWContext = this.d;
            vtb vtbVar = dWContext.mUTAdapter;
            if (vtbVar != null) {
                vtbVar.a("DWVideo", "Button", "videopicClick", dWContext.getUTParams(), hashMap);
            }
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "commitFirstPlayClickUT -->:" + this.d.getUTParams().toString() + " extendParams:" + hashMap.toString());
            }
            this.p = true;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35a873", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!this.k) {
            hashMap.put("wifiAuto", String.valueOf(this.l));
        }
        DWContext dWContext = this.d;
        vtb vtbVar = dWContext.mUTAdapter;
        if (vtbVar != null) {
            vtbVar.a("DWVideo", "Button", "videopicPlay", dWContext.getUTParams(), hashMap);
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "commitFirstPlayUT -->:" + this.d.getUTParams().toString() + " extendParams:" + hashMap.toString());
        }
        this.k = true;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc66c1e", new Object[]{this});
        } else if (!this.j) {
            if (this.d.mUTAdapter != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("playTime", String.valueOf(this.h));
                DWContext dWContext = this.d;
                dWContext.mUTAdapter.a("DWVideo", "Button", "videopicPlaytime", dWContext.getUTParams(), hashMap);
                if (MediaSystemUtils.isApkDebuggable()) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "commitPlayTimeUT -->:" + this.d.getUTParams().toString() + " extendParams:" + hashMap.toString());
                }
            }
            this.j = true;
        }
    }
}
