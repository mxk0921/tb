package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hqv;
import tb.ir9;
import tb.p91;
import tb.sz3;
import tb.t2o;
import tb.uq9;
import tb.xq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO_SCROLL_VALUE = 0;
    public static final int INTERRUPT_BY_LIST_SCROLL = 2;
    public static final int INTERRUPT_BY_REFRESH = 1;
    public static final String POINT_CACHE_CLEAR = "ggpick_cache_version_clean";
    public static final String PRE_CRETE_AUTO_SCROLL = "pre_crete_auto_scroll";
    public final FluidContext b;
    public final xq9 c;
    public final a.b d;
    public long g;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public long p;

    /* renamed from: a  reason: collision with root package name */
    public String f7696a = "";
    public com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a e = new com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a();
    public int f = -1;
    public StringBuilder h = null;
    public float i = 0.0f;
    public long j = 0;
    public int q = 1;
    public int r = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface AutoScrollType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7697a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public a(String str, String str2, String str3, Map map) {
            this.f7697a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FluidSDK.getUTAdapter().withFluidContext(VideoTracker.a(VideoTracker.this)).trackCustom("ShortVideoMonitor", 19997, this.f7697a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(468713647);
    }

    public VideoTracker(FluidContext fluidContext, uq9 uq9Var) {
        this.b = fluidContext;
        if (uq9Var != null) {
            this.c = uq9Var.T();
        }
        a.b videoTrackerPageInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getVideoTrackerPageInfo();
        this.d = videoTrackerPageInfo;
        if (videoTrackerPageInfo == null) {
            a.b bVar = new a.b();
            this.d = bVar;
            ((ITrackService) fluidContext.getService(ITrackService.class)).setVideoTrackerPageInfo(bVar);
        }
    }

    public static /* synthetic */ FluidContext a(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("862fd90b", new Object[]{videoTracker});
        }
        return videoTracker.b;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void A(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d109016e", new Object[]{this, str, str2, new Long(j), str3, str4, str5, str6});
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        aVar.c = str2;
        a.C0413a c = aVar.a(this.d).b().e().c(j);
        if (!TextUtils.isEmpty(str3)) {
            c.h(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            c.i(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c.j(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            c.k(str6);
        }
        s("info", str, this.f7696a, c.a());
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4aaaa99", new Object[]{this, str});
            return;
        }
        o();
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.f7700a = SystemClock.elapsedRealtime();
            this.d.d = UUID.randomUUID().toString();
            this.d.c = c(str);
        }
        s("info", "page_start", this.f7696a, this.e.a(this.d).b().f().a());
    }

    public void D(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ceb0dfe", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        a.C0413a b = b();
        b.h(str2);
        b.i(str3);
        b.j(str4);
        b.k(str5);
        F(str, b);
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6d7081", new Object[]{this, str});
        } else {
            F(str, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r8.equals("first_frame_rendered") == false) goto L_0x0048;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(java.lang.String r8, com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a.C0413a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "error"
            r1 = 2
            r2 = 1
            r3 = 3
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001a
            java.lang.String r0 = "bdb13aa7"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r7
            r3[r2] = r8
            r3[r1] = r9
            r5.ipc$dispatch(r0, r3)
            return
        L_0x001a:
            tb.xq9 r5 = r7.c
            if (r5 != 0) goto L_0x0020
            r5 = 0
            goto L_0x0024
        L_0x0020:
            boolean r5 = r5.j()
        L_0x0024:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a r6 = r7.e
            r6.q = r5
            com.taobao.android.fluid.core.FluidContext r5 = r7.b
            int r5 = tb.xau.w(r5)
            r6.n = r5
            if (r9 != 0) goto L_0x0036
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a$a r9 = r7.b()
        L_0x0036:
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a$a r5 = r9.b()
            r5.m()
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1578631037: goto L_0x008a;
                case -1334679324: goto L_0x007f;
                case -965805898: goto L_0x0076;
                case 3135262: goto L_0x006b;
                case 96784904: goto L_0x0062;
                case 109757344: goto L_0x0056;
                case 2096179127: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r1 = -1
            goto L_0x0094
        L_0x004a:
            java.lang.String r1 = "player_qos"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0054
            goto L_0x0048
        L_0x0054:
            r1 = 6
            goto L_0x0094
        L_0x0056:
            java.lang.String r1 = "stall"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0060
            goto L_0x0048
        L_0x0060:
            r1 = 5
            goto L_0x0094
        L_0x0062:
            boolean r1 = r8.equals(r0)
            if (r1 != 0) goto L_0x0069
            goto L_0x0048
        L_0x0069:
            r1 = 4
            goto L_0x0094
        L_0x006b:
            java.lang.String r1 = "fail"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0074
            goto L_0x0048
        L_0x0074:
            r1 = 3
            goto L_0x0094
        L_0x0076:
            java.lang.String r2 = "first_frame_rendered"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0094
            goto L_0x0048
        L_0x007f:
            java.lang.String r1 = "first_video_start_play"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0088
            goto L_0x0048
        L_0x0088:
            r1 = 1
            goto L_0x0094
        L_0x008a:
            java.lang.String r1 = "cell_active"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0093
            goto L_0x0048
        L_0x0093:
            r1 = 0
        L_0x0094:
            switch(r1) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009c;
                case 6: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x00c5
        L_0x0098:
            r9.g()
            goto L_0x00c5
        L_0x009c:
            r9.l()
            goto L_0x00c5
        L_0x00a0:
            r9.d()
            goto L_0x00c7
        L_0x00a4:
            r9.d()
            java.lang.String r0 = "warning"
            goto L_0x00c7
        L_0x00ab:
            tb.xq9 r0 = r7.c
            if (r0 != 0) goto L_0x00b2
            r0 = 0
            goto L_0x00b6
        L_0x00b2:
            long r0 = r0.h()
        L_0x00b6:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.h(r0)
            goto L_0x00c5
        L_0x00c2:
            r9.n()
        L_0x00c5:
            java.lang.String r0 = "info"
        L_0x00c7:
            java.lang.String r1 = r7.f7696a
            java.util.Map r9 = r9.a()
            r7.s(r0, r8, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker.F(java.lang.String, com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a$a):void");
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9e72d7", new Object[]{this});
            return;
        }
        StringBuilder sb = this.h;
        if (sb != null && sb.length() > 0) {
            a.C0413a b = b();
            b.h(c(this.h.toString()));
            b.i(String.valueOf(Boolean.valueOf(((IMediaService) this.b.getService(IMediaService.class)).getConfig().b())));
            F("buffer_remain_duration", b);
            this.h = new StringBuilder();
        }
    }

    public void H(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8295059a", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.e.f = String.valueOf(i);
        E(str);
    }

    public void I(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9d0e19", new Object[]{this, map});
        } else if (map != null) {
            this.e.v = c(hqv.k(map));
            E("player_qos");
        }
    }

    public void J(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6eae8b", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        a.C0413a c = this.e.a(this.d).b().c(j);
        c.h(str2);
        s("error", str, this.f7696a, c.a());
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a91fb5e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.e.d = SystemClock.elapsedRealtime();
        }
        this.e.r = z ? 1 : 0;
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d61060", new Object[]{this, str});
            return;
        }
        this.e.i = str;
        a.b bVar = this.d;
        if (bVar != null) {
            String str2 = bVar.h;
            if (str2 != null && str2.length() > 0) {
                this.e.j = this.d.h;
            }
            this.d.h = str;
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13a39ae", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.q = 1;
        } else {
            this.q++;
        }
        this.e.o = this.q;
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b5403d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.r = 0;
        } else {
            this.r++;
        }
        this.e.p = this.r;
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cfb9dab", new Object[]{this, str});
        } else if (this.d != null && !TextUtils.isEmpty(str)) {
            this.d.m = str;
        }
    }

    public void P(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e1500b", new Object[]{this, str, str2});
        } else if (this.d != null) {
            if (!TextUtils.isEmpty(str)) {
                this.d.k = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.d.l = str2;
            }
        }
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be38d42d", new Object[]{this, str});
        } else if (this.d != null && !TextUtils.isEmpty(str)) {
            this.d.n = str;
        }
    }

    public void R(boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da51e06e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            String str2 = null;
            if (z) {
                str = "1";
            } else {
                str = null;
            }
            bVar.p = str;
            if (z && z2) {
                str2 = "1";
            }
            bVar.q = str2;
        }
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3fcd6d", new Object[]{this, str});
        } else if (this.d != null && !TextUtils.isEmpty(str)) {
            this.d.o = str;
        }
    }

    public void T(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab159e", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        if (aVar != null && j > 0) {
            aVar.u = j;
        }
    }

    public a.C0413a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0413a) ipChange.ipc$dispatch("ca97f8fa", new Object[]{this});
        }
        return this.e.a(this.d);
    }

    public Map d(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c9cc7375", new Object[]{this, fluidContext, str});
        }
        HashMap hashMap = new HashMap();
        if (!(this.d == null || fluidContext == null || fluidContext.getService(IUsePreloadService.class) == null)) {
            HashMap<String, String> tab3CacheTrackParams = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getTab3CacheTrackParams();
            if (!sz3.b(tab3CacheTrackParams)) {
                hashMap.put("isHitCache", tab3CacheTrackParams.get("tab3_use_cache_data"));
            }
            hashMap.put("cacheScene", this.d.m);
            hashMap.put("cacheType", this.d.k);
            hashMap.put(MergeUtil.KEY_EXPOSED, "0");
            hashMap.put("pre_playerid", str);
        }
        return hashMap;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d668f326", new Object[]{this});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.i = false;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a4561d", new Object[]{this})).booleanValue();
        }
        a.b bVar = this.d;
        if (bVar != null) {
            return bVar.i;
        }
        return false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.k = true;
        this.l = SystemClock.elapsedRealtime();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5832dbd8", new Object[]{this});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.b = SystemClock.elapsedRealtime();
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05a5d78", new Object[]{this, str});
        } else {
            this.e.x = str;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ddaadc", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        aVar.o = this.q;
        aVar.p = this.r;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5223a813", new Object[]{this});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.e = 0;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e929ca05", new Object[]{this});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.f7700a = 0L;
            bVar.b = 0L;
            bVar.c = "";
            bVar.d = "";
            bVar.f = -1;
            bVar.h = "";
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5c4d1d", new Object[]{this});
            return;
        }
        this.q = 1;
        this.r = 0;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54ad556", new Object[]{this});
        } else {
            this.e = new com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a();
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        this.g = SystemClock.elapsedRealtime();
        E("seek");
    }

    public final void s(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0bb38", new Object[]{this, str, str2, str3, map});
        } else if (p91.l()) {
            ir9.b("VideoTracker", "低端机优化，不发送19997。return。");
        } else {
            b.b(new a(str, str2, str3, map));
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14d22", new Object[]{this, str});
        } else {
            this.f7696a = str;
        }
    }

    public void u(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e2269a", new Object[]{this, new Boolean(z)});
        } else if (f()) {
            e();
            a.C0413a b = b();
            if (z) {
                j = 0;
            } else {
                j = SystemClock.elapsedRealtime() - this.d.b;
            }
            b.c(j);
            F("first_video_start_play", b);
        }
    }

    public void v(String str, String str2, int i, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716c08c7", new Object[]{this, str, str2, new Integer(i), str3, new Long(j)});
            return;
        }
        a.C0413a c = this.e.a(this.d).b().c(j);
        ((HashMap) c.b).put("httpurl", str2);
        ((HashMap) c.b).put("code", String.valueOf(i));
        ((HashMap) c.b).put("msg", str3);
        s("error", str, this.f7696a, c.a());
    }

    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf343246", new Object[]{this, str, str2});
            return;
        }
        a.C0413a b = this.e.a(this.d).b();
        ((HashMap) b.b).put("httpurl", str2);
        s("info", str, this.f7696a, b.a());
    }

    public void x(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5d2486", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        a.C0413a c = this.e.a(this.d).b().c(j);
        ((HashMap) c.b).put("httpurl", str2);
        s("info", str, this.f7696a, c.a());
    }

    public void z(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd6cf1a", new Object[]{this, str, str2, str3, str4});
            return;
        }
        a.b bVar = this.d;
        if (bVar != null) {
            bVar.f++;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        aVar.c = str2;
        a.C0413a e = aVar.a(bVar).b().e();
        if (!TextUtils.isEmpty(str3)) {
            e.i(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            e.k(str4);
        }
        s("info", str, this.f7696a, e.a());
    }

    public String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da116b7", new Object[]{this});
        }
        this.e.h = UUID.randomUUID().toString();
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        if (aVar.w < 0) {
            try {
                aVar.w = 1;
            } catch (Exception unused) {
            }
        }
        E("vv_start");
        return this.e.h;
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6fe49f", new Object[]{this, new Long(j)});
            return;
        }
        if (j > 0) {
            if (this.f >= 0) {
                this.n += j;
                this.p = SystemClock.elapsedRealtime();
            } else {
                this.n = j;
            }
        }
        if (this.m > 0 && this.f < 0) {
            a.C0413a c = b().l().c(this.p - this.m);
            long j2 = this.n;
            F("stall_end", c.h(j2 > 0 ? String.valueOf(j2) : null));
            this.m = 0L;
            this.p = 0L;
            this.n = 0L;
            this.o = false;
        }
    }

    public void y(String str, MtopResponse mtopResponse, long j, String str2, String str3, String str4) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b889617", new Object[]{this, str, mtopResponse, new Long(j), str2, str3, str4});
        } else if (mtopResponse != null) {
            this.e.c = mtopResponse.getApi();
            this.e.f = mtopResponse.getRetCode();
            this.e.g = c(mtopResponse.getRetMsg());
            a.C0413a c = this.e.a(this.d).b().e().d().c(j);
            if ("rec_mtop_error".equals(str)) {
                FluidContext fluidContext = this.b;
                if (fluidContext != null) {
                    z = ((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().e();
                }
                c.h(String.valueOf(z));
            }
            if (!TextUtils.isEmpty(str2)) {
                c.i(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                c.j(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                c.k(str4);
            }
            s("error", str, this.f7696a, c.a());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60ade0c", new Object[]{this});
        } else if (!this.o) {
            long j = 0;
            if (this.k) {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
                aVar.s = 1;
                if (this.l > 0) {
                    j = SystemClock.elapsedRealtime() - this.l;
                }
                aVar.t = j;
            } else if (this.f >= 0) {
                this.o = true;
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar2 = this.e;
                aVar2.s = 2;
                if (this.g > 0) {
                    j = SystemClock.elapsedRealtime() - this.g;
                }
                aVar2.t = j;
            } else {
                this.e.s = 0;
            }
            this.k = false;
            this.m = SystemClock.elapsedRealtime();
            E("stall");
        }
    }

    public void l(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5fddf", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a aVar = this.e;
        aVar.l = i2;
        float f = i;
        float f2 = i2;
        aVar.m = Math.round((f * 100.0f) / f2);
        if (this.f >= 0) {
            this.f = -1;
            g(-1L);
            this.o = false;
        }
        try {
            if (this.h == null) {
                this.h = new StringBuilder();
            }
            float f3 = ((((i3 * 1.0f) / 100.0f) * f2) - f) / 1000.0f;
            if (f3 > 0.0f && (f3 > this.i || SystemClock.elapsedRealtime() - this.j > 1200)) {
                if (this.h.length() > 0) {
                    this.h.append("|");
                }
                this.h.append(String.format("%.1f", Float.valueOf(f3)));
                this.j = SystemClock.elapsedRealtime();
            }
            this.i = f3;
        } catch (Exception unused) {
        }
    }

    public void C(String str, String... strArr) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e6bfbc", new Object[]{this, str, strArr});
            return;
        }
        try {
            a.C0413a b = b();
            String str2 = "info";
            switch (str.hashCode()) {
                case -1271786460:
                    if (str.equals("ggpick_cache_video_pdl_fail")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -758110180:
                    if (str.equals("ggpick_cache_video_pdl_start")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -528545893:
                    if (str.equals("ggpick_cache_hit3")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -370940924:
                    if (str.equals("ggpick_cache_video_toobject_fail")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 618450480:
                    if (str.equals("ggpick_cache_request_end")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1625560605:
                    if (str.equals("ggpick_cache_request_error")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1630575933:
                    if (str.equals("ggpick_cache_video_pdl_success")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1638533239:
                    if (str.equals("ggpick_cache_request_start")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.e.y = SystemClock.elapsedRealtime();
                    break;
                case 1:
                    b.c(SystemClock.elapsedRealtime() - this.e.y);
                    break;
                case 2:
                    b.c(SystemClock.elapsedRealtime() - this.e.y);
                    str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
                    break;
                case 3:
                    this.e.z = SystemClock.elapsedRealtime();
                    if (!TextUtils.isEmpty(strArr[0])) {
                        b.h(strArr[0]);
                    }
                    if (!TextUtils.isEmpty(strArr[1])) {
                        b.i(strArr[1]);
                        break;
                    }
                    break;
                case 4:
                    b.c(SystemClock.elapsedRealtime() - this.e.z);
                    break;
                case 5:
                    b.c(SystemClock.elapsedRealtime() - this.e.z);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        b.h(strArr[0]);
                    }
                    if (!TextUtils.isEmpty(strArr[1])) {
                        b.i(strArr[1]);
                    }
                    str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
                    break;
                case 6:
                    if (!TextUtils.isEmpty(strArr[0])) {
                        b.h(strArr[0]);
                    }
                    str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
                    break;
                case 7:
                    if (!TextUtils.isEmpty(strArr[0])) {
                        b.h(strArr[0]);
                    }
                    if (!TextUtils.isEmpty(strArr[1])) {
                        b.i(strArr[1]);
                    }
                    if (!TextUtils.isEmpty(strArr[2])) {
                        b.j(strArr[2]);
                    }
                    if (!TextUtils.isEmpty(strArr[3])) {
                        b.k(strArr[3]);
                        break;
                    }
                    break;
            }
            s(str2, str, this.f7696a, b.b().a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
