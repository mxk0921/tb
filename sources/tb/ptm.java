package tb;

import android.text.TextUtils;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ptm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEGIN_USE_CACHE = "begin_use_cache";

    /* renamed from: a  reason: collision with root package name */
    public VideoTracker f26294a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.C0413a f26295a;

        public a(a.C0413a aVar) {
            this.f26295a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ShortVideoMonitor", 19997, "info", ptm.BEGIN_USE_CACHE, "", this.f26295a.a()).build());
            }
        }
    }

    static {
        t2o.a(468714673);
    }

    public String a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0bf1441", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MergeUtil.KEY_EXPOSED, "0");
        atb dWInstance = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getDWInstance();
        if (dWInstance != null) {
            String t = dWInstance.t();
            if (TextUtils.isEmpty(t)) {
                t = "";
            }
            hashMap.put("pre_playerid", t);
        }
        return hxf.d(hashMap);
    }

    public VideoTracker b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("e234c093", new Object[]{this});
        }
        return this.f26294a;
    }

    public void c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7acb541", new Object[]{this, fluidContext});
        } else if (this.f26294a == null) {
            VideoTracker videoTracker = new VideoTracker(fluidContext, null);
            this.f26294a = videoTracker;
            videoTracker.t("gg_pick_native_cache");
        }
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91f8dd4", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        try {
            if (b() != null) {
                a.C0413a b = b().b().b();
                b.h(String.valueOf(z));
                b.i(String.valueOf(z2));
                b.j(String.valueOf(z3));
                b.b(new a(b));
            }
        } catch (Throwable th) {
            ir9.c("PreloadVideoTracker", "trackBeginUseCache error", th);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83977e9", new Object[]{this, new Boolean(z)});
        } else if (b() != null) {
            d(z, false, true);
            ir9.b("PreloadVideoTracker", "getCache埋点,isFirstStartRender:" + z + ",enableUseUnexposedCache:true");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r18.equals("ggpick_cache_hit3") == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.lang.String r18, java.lang.String... r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "ggpick_cache_request_start"
            java.lang.String r4 = "ggpick_cache_video_pdl_success"
            java.lang.String r5 = "ggpick_cache_request_error"
            java.lang.String r6 = "ggpick_cache_request_end"
            java.lang.String r7 = "ggpick_cache_video_toobject_fail"
            java.lang.String r8 = "ggpick_cache_hit3"
            java.lang.String r9 = "ggpick_cache_video_pdl_start"
            java.lang.String r10 = "ggpick_cache_video_pdl_fail"
            r12 = 1
            r13 = 3
            r14 = 0
            com.android.alibaba.ip.runtime.IpChange r15 = tb.ptm.$ipChange
            boolean r11 = r15 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r11 == 0) goto L_0x002e
            java.lang.String r3 = "689abd61"
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r14] = r0
            r4[r12] = r1
            r11 = 2
            r4[r11] = r2
            r15.ipc$dispatch(r3, r4)
            return
        L_0x002e:
            r11 = 2
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r15 = r0.f26294a
            if (r15 == 0) goto L_0x00be
            r18.hashCode()
            r15 = -1
            int r16 = r18.hashCode()
            switch(r16) {
                case -1271786460: goto L_0x007d;
                case -758110180: goto L_0x0074;
                case -528545893: goto L_0x006d;
                case -370940924: goto L_0x0064;
                case 618450480: goto L_0x005b;
                case 1625560605: goto L_0x0052;
                case 1630575933: goto L_0x0049;
                case 1638533239: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            r11 = -1
            goto L_0x0085
        L_0x0040:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0047
            goto L_0x003e
        L_0x0047:
            r11 = 7
            goto L_0x0085
        L_0x0049:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0050
            goto L_0x003e
        L_0x0050:
            r11 = 6
            goto L_0x0085
        L_0x0052:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0059
            goto L_0x003e
        L_0x0059:
            r11 = 5
            goto L_0x0085
        L_0x005b:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0062
            goto L_0x003e
        L_0x0062:
            r11 = 4
            goto L_0x0085
        L_0x0064:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x006b
            goto L_0x003e
        L_0x006b:
            r11 = 3
            goto L_0x0085
        L_0x006d:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0085
            goto L_0x003e
        L_0x0074:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x007b
            goto L_0x003e
        L_0x007b:
            r11 = 1
            goto L_0x0085
        L_0x007d:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0084
            goto L_0x003e
        L_0x0084:
            r11 = 0
        L_0x0085:
            switch(r11) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00a7;
                case 4: goto L_0x009f;
                case 5: goto L_0x0097;
                case 6: goto L_0x0091;
                case 7: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x00be
        L_0x0089:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            java.lang.String[] r2 = new java.lang.String[r14]
            r1.C(r3, r2)
            goto L_0x00be
        L_0x0091:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            r1.C(r4, r2)
            goto L_0x00be
        L_0x0097:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            java.lang.String[] r2 = new java.lang.String[r14]
            r1.C(r5, r2)
            goto L_0x00be
        L_0x009f:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            java.lang.String[] r2 = new java.lang.String[r14]
            r1.C(r6, r2)
            goto L_0x00be
        L_0x00a7:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            r1.C(r7, r2)
            goto L_0x00be
        L_0x00ad:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            r1.C(r8, r2)
            goto L_0x00be
        L_0x00b3:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            r1.C(r9, r2)
            goto L_0x00be
        L_0x00b9:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker r1 = r0.f26294a
            r1.C(r10, r2)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ptm.f(java.lang.String, java.lang.String[]):void");
    }

    public void g(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a6d6dc", new Object[]{this, videoTracker});
            return;
        }
        ir9.a("PreloadVideoTracker", "更新tracker");
        this.f26294a = videoTracker;
    }
}
