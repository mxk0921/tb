package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import tb.hxf;
import tb.ir9;
import tb.ncp;
import tb.pto;
import tb.t2o;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RenderTrackUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String detailEnd = "detailEnd";
    public static final String detailStart = "detailStart";
    public static final String pageCreate = "pageCreate";
    public static final String pageNav = "pageNav";
    public static final String renderEnd = "renderEnd";
    public static final String renderStart = "renderStart";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface TimePoint {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f7695a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;

        static {
            t2o.a(468713638);
        }
    }

    static {
        t2o.a(468713637);
    }

    public static void b(FluidContext fluidContext, uq9 uq9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e082b92", new Object[]{fluidContext, uq9Var, str, str2});
            return;
        }
        a trackerRenderInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackerRenderInfo();
        if (trackerRenderInfo != null) {
            try {
                HashMap hashMap = new HashMap(7);
                hashMap.put("beforeCreate", Long.valueOf(trackerRenderInfo.b - trackerRenderInfo.f7695a));
                hashMap.put("beforeDetail", Long.valueOf(trackerRenderInfo.c - trackerRenderInfo.b));
                hashMap.put("detailCost", Long.valueOf(trackerRenderInfo.d - trackerRenderInfo.c));
                hashMap.put("beforeRender", Long.valueOf(trackerRenderInfo.e - trackerRenderInfo.d));
                hashMap.put("renderCost", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.e));
                hashMap.put("totalCost", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.b));
                hashMap.put("totalCostNav", Long.valueOf(trackerRenderInfo.f - trackerRenderInfo.f7695a));
                hashMap.put("isTab3", Boolean.valueOf(pto.g(fluidContext)));
                ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
                if (str.equals("interact_first_cost")) {
                    hashMap.put(IStorage.TYPE_DSL, j.f24645a);
                } else {
                    hashMap.put(IStorage.TYPE_DSL, j.b);
                }
                hashMap.put("contentId", str2);
                String d = hxf.d(hashMap);
                ir9.a("RenderTrackUtils", "report json:" + d);
                boolean p = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getConfig().p();
                boolean isFragmentMode = fluidContext.getInstanceConfig().isFragmentMode();
                boolean isQuickOpenMode = ((IQuickOpenService) fluidContext.getService(IQuickOpenService.class)).isQuickOpenMode();
                ir9.b("RenderTrackUtils", "report enablePrefetchMtop:" + p + " enableFragment:" + isFragmentMode + " enableQuickOpen:" + isQuickOpenMode);
                b.I(uq9Var, str, String.valueOf(p), String.valueOf(isFragmentMode), String.valueOf(isQuickOpenMode), d);
            } catch (Exception e) {
                ir9.b("RenderTrackUtils", "report e:" + e.getMessage());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r8.equals(com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils.detailEnd) == false) goto L_0x0043;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.fluid.core.FluidContext r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "ae2e6b32"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            int r3 = tb.xau.w(r7)
            if (r3 <= 0) goto L_0x001c
            return
        L_0x001c:
            java.lang.Class<com.taobao.android.fluid.business.usertrack.ITrackService> r3 = com.taobao.android.fluid.business.usertrack.ITrackService.class
            com.taobao.android.fluid.core.FluidService r4 = r7.getService(r3)
            com.taobao.android.fluid.business.usertrack.ITrackService r4 = (com.taobao.android.fluid.business.usertrack.ITrackService) r4
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils$a r4 = r4.getTrackerRenderInfo()
            if (r4 != 0) goto L_0x0038
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils$a r4 = new com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils$a
            r4.<init>()
            com.taobao.android.fluid.core.FluidService r5 = r7.getService(r3)
            com.taobao.android.fluid.business.usertrack.ITrackService r5 = (com.taobao.android.fluid.business.usertrack.ITrackService) r5
            r5.setTrackerRenderInfo(r4)
        L_0x0038:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -2061154671: goto L_0x007e;
                case -1973105974: goto L_0x0075;
                case -1638653844: goto L_0x0069;
                case -803565548: goto L_0x005d;
                case 826837099: goto L_0x0051;
                case 1839619941: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r0 = -1
            goto L_0x0088
        L_0x0045:
            java.lang.String r0 = "renderEnd"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004f
            goto L_0x0043
        L_0x004f:
            r0 = 5
            goto L_0x0088
        L_0x0051:
            java.lang.String r0 = "pageCreate"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005b
            goto L_0x0043
        L_0x005b:
            r0 = 4
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "pageNav"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0067
            goto L_0x0043
        L_0x0067:
            r0 = 3
            goto L_0x0088
        L_0x0069:
            java.lang.String r0 = "renderStart"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0073
            goto L_0x0043
        L_0x0073:
            r0 = 2
            goto L_0x0088
        L_0x0075:
            java.lang.String r1 = "detailEnd"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0088
            goto L_0x0043
        L_0x007e:
            java.lang.String r0 = "detailStart"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0087
            goto L_0x0043
        L_0x0087:
            r0 = 0
        L_0x0088:
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00bd;
                case 3: goto L_0x009a;
                case 4: goto L_0x0093;
                case 5: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00d1
        L_0x008c:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r4.f = r7
            goto L_0x00d1
        L_0x0093:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r4.b = r7
            goto L_0x00d1
        L_0x009a:
            com.taobao.android.fluid.core.FluidService r7 = r7.getService(r3)
            com.taobao.android.fluid.business.usertrack.ITrackService r7 = (com.taobao.android.fluid.business.usertrack.ITrackService) r7
            long r7 = r7.getNavElapsdorealTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x00b6
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
        L_0x00b6:
            long r7 = r0.longValue()
            r4.f7695a = r7
            goto L_0x00d1
        L_0x00bd:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r4.e = r7
            goto L_0x00d1
        L_0x00c4:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r4.d = r7
            goto L_0x00d1
        L_0x00cb:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r4.c = r7
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils.a(com.taobao.android.fluid.core.FluidContext, java.lang.String):void");
    }
}
