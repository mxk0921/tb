package com.taobao.mediaplay;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaDeviceUtils;
import com.taobao.media.MediaMeasureAdapter;
import com.taobao.mediaplay.model.MediaConfig;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.a7m;
import tb.a9e;
import tb.ba5;
import tb.ca5;
import tb.cq;
import tb.ew0;
import tb.feh;
import tb.gf4;
import tb.itw;
import tb.ja1;
import tb.jsc;
import tb.mfi;
import tb.pg1;
import tb.pmm;
import tb.qs2;
import tb.t2o;
import tb.tfb;
import tb.vu3;
import tb.wrc;
import tb.yj4;
import tb.z5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public String B;
    public boolean W;
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final feh a0;
    public volatile boolean b;
    public final MediaPlayControlContext c;
    public long x;
    public long y;
    public int z;

    /* renamed from: a  reason: collision with root package name */
    public int f11020a = 0;
    public final String[] d = {MediaConstant.DEFINITION_UD, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD};
    public final String[] e = {MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_UD};
    public final String[] f = {MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_UD};
    public final String[] g = {MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_UD};
    public final String[] h = {MediaConstant.DEFINITION_UD_H264_FULL, MediaConstant.DEFINITION_HD_H264_FULL, MediaConstant.DEFINITION_SD_H264_FULL, MediaConstant.DEFINITION_LD_H264_FULL};
    public final String[] i = {MediaConstant.DEFINITION_HD_H264_FULL, MediaConstant.DEFINITION_SD_H264_FULL, MediaConstant.DEFINITION_LD_H264_FULL, MediaConstant.DEFINITION_UD_H264_FULL};
    public final String[] j = {MediaConstant.DEFINITION_SD_H264_FULL, MediaConstant.DEFINITION_LD_H264_FULL, MediaConstant.DEFINITION_HD_H264_FULL, MediaConstant.DEFINITION_UD_H264_FULL};
    public final String[] k = {MediaConstant.DEFINITION_LD_H264_FULL, MediaConstant.DEFINITION_SD_H264_FULL, MediaConstant.DEFINITION_HD_H264_FULL, MediaConstant.DEFINITION_UD_H264_FULL};
    public final String[][] l = {new String[]{MediaConstant.DEFINITION_UD_H265, MediaConstant.DEFINITION_UD}, new String[]{MediaConstant.DEFINITION_HD_H265, MediaConstant.DEFINITION_HD}, new String[]{MediaConstant.DEFINITION_SD_H265, MediaConstant.DEFINITION_SD}, new String[]{MediaConstant.DEFINITION_LD_H265, MediaConstant.DEFINITION_LD}};
    public final String[][] m = {new String[]{MediaConstant.DEFINITION_UD_H265_FULL, MediaConstant.DEFINITION_UD_H264_FULL}, new String[]{MediaConstant.DEFINITION_HD_H265_FULL, MediaConstant.DEFINITION_HD_H264_FULL}, new String[]{MediaConstant.DEFINITION_SD_H265_FULL, MediaConstant.DEFINITION_SD_H264_FULL}, new String[]{MediaConstant.DEFINITION_LD_H265_FULL, MediaConstant.DEFINITION_LD_H264_FULL}};
    public final String[][] n = {new String[]{MediaConstant.DEFINITION_HD_H265, MediaConstant.DEFINITION_HD}, new String[]{MediaConstant.DEFINITION_SD_H265, MediaConstant.DEFINITION_SD}, new String[]{MediaConstant.DEFINITION_LD_H265, MediaConstant.DEFINITION_LD}};
    public final String[][] o = {new String[]{MediaConstant.DEFINITION_HD_H265_FULL, MediaConstant.DEFINITION_HD_H264_FULL}, new String[]{MediaConstant.DEFINITION_SD_H265_FULL, MediaConstant.DEFINITION_SD_H264_FULL}, new String[]{MediaConstant.DEFINITION_LD_H265_FULL, MediaConstant.DEFINITION_LD_H264_FULL}};
    public final String[][] p = {new String[]{MediaConstant.DEFINITION_SD_H265, MediaConstant.DEFINITION_SD}, new String[]{MediaConstant.DEFINITION_LD_H265, MediaConstant.DEFINITION_LD}};
    public final String[][] q = {new String[]{MediaConstant.DEFINITION_SD_H265_FULL, MediaConstant.DEFINITION_SD_H264_FULL}, new String[]{MediaConstant.DEFINITION_LD_H265_FULL, MediaConstant.DEFINITION_LD_H264_FULL}};
    public final String[][] r = {new String[]{MediaConstant.DEFINITION_LD_H265, MediaConstant.DEFINITION_LD}};
    public final String[][] s = {new String[]{MediaConstant.DEFINITION_LD_H265_FULL, MediaConstant.DEFINITION_LD_H264_FULL}};
    public final String[] t = {MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_MD};
    public final String[] u = {MediaConstant.DEFINITION_MD};
    public final String[] v = {MediaConstant.DEFINITION_LLD};
    public final String[] w = {MediaConstant.DEFINITION_UD, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_MD, MediaConstant.DEFINITION_2K, MediaConstant.DEFINITION_4K};
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public double F = -1.0d;
    public double G = -1.0d;
    public String H = "";
    public String I = "";
    public String J = "";
    public String K = "-1";
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = 2;
    public String U = "";
    public long V = 0;

    static {
        t2o.a(774897726);
    }

    public static /* synthetic */ long a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0bac28e", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.y = j;
        return j;
    }

    public static /* synthetic */ MediaPlayControlContext b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayControlContext) ipChange.ipc$dispatch("ccb7463c", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ void c(a aVar, ca5 ca5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3902c76", new Object[]{aVar, ca5Var});
        } else {
            aVar.r(ca5Var);
        }
    }

    public static /* synthetic */ int d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b51685c", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.z = i;
        return i;
    }

    public static /* synthetic */ boolean e(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24f1fbec", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("201bba6f", new Object[]{aVar})).booleanValue();
        }
        aVar.getClass();
        return true;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad566bf0", new Object[]{aVar})).booleanValue();
        }
        return aVar.Y;
    }

    public static /* synthetic */ feh h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("1271ca28", new Object[]{aVar});
        }
        return aVar.a0;
    }

    public static /* synthetic */ void i(a aVar, ca5 ca5Var, MediaPlayControlContext mediaPlayControlContext, Map map, Map map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbadecb", new Object[]{aVar, ca5Var, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else {
            aVar.l0(ca5Var, mediaPlayControlContext, map, map2, z, i);
        }
    }

    public static /* synthetic */ void j(a aVar, ca5 ca5Var, MediaPlayControlContext mediaPlayControlContext, Map map, Map map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4ff50c", new Object[]{aVar, ca5Var, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else {
            aVar.k0(ca5Var, mediaPlayControlContext, map, map2, z, i);
        }
    }

    public static /* synthetic */ void k(a aVar, ca5 ca5Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b4e591", new Object[]{aVar, ca5Var, new Float(f)});
        } else {
            aVar.Q(ca5Var, f);
        }
    }

    public static /* synthetic */ void l(a aVar, ca5 ca5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6833810", new Object[]{aVar, ca5Var});
        } else {
            aVar.j0(ca5Var);
        }
    }

    public static int w(MediaLiveInfo mediaLiveInfo) {
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8e5687", new Object[]{mediaLiveInfo})).intValue();
        }
        if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        if (arrayList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public double E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b875904", new Object[]{this})).doubleValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Double> Q = ja1.Q();
        ArrayList<Double> G = ja1.G();
        ArrayList<Double> A = ja1.A();
        double netSpeed = this.c.getNetSpeed();
        if (!(Q == null || A == null || G == null)) {
            for (int i = 0; i < Q.size(); i++) {
                double doubleValue = Q.get(i).doubleValue() / 1000.0d;
                arrayList.add(Double.valueOf((doubleValue / (Math.max(Math.max(A.get(i).doubleValue(), 1.0d) - G.get(i).doubleValue(), 1.0d) / 1000.0d)) * 8.0d * 1000.0d * doubleValue));
            }
            double d = 0.0d;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d += ((Double) arrayList.get(i2)).doubleValue();
            }
            Iterator<Double> it = Q.iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                d2 += it.next().doubleValue();
            }
            if (this.c.mCheckInvalidCalBitRateByAB) {
                double max = d / Math.max(d2, 1.0d);
                if (Double.compare(max, vu3.b.GEO_NOT_SUPPORT) != 0 && max > netSpeed) {
                    this.E = 0;
                    return max;
                }
            } else {
                this.E = 0;
                return d / Math.max(d2, 1.0d);
            }
        }
        this.E = 1;
        return netSpeed;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7567ac5", new Object[]{this})).booleanValue();
        }
        if (ew0.n(this.c.getFrom(), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_1080P_MP4_FROM_WHITELIST, "[\"TimeMovingPlay\"]"))) {
            return !((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).isLowPerformanceByAB(this.c);
        }
        if (ew0.n(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "UDModelWhiteList", "[\"LIO-AN00\",\"ELE-TL00\",\"HMA-TL00\",\"EML-AL00\",\"LIO-AL00\",\"X9\",\"PBAM00\",\"PACM00\",\"MIX 3\",\"VOG-AL10\"]"))) {
            return true;
        }
        return false;
    }

    public final void H(jsc jscVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16082a29", new Object[]{this, jscVar, new Boolean(z), new Integer(i)});
            return;
        }
        jscVar.onPick(e0(z, i), "");
        this.b = false;
    }

    public final boolean I(jsc jscVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4525b7fe", new Object[]{this, jscVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!i0(z, i)) {
            return false;
        }
        jscVar.onPick(true, "");
        this.b = false;
        return true;
    }

    public final void M(jsc jscVar, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9732bf9b", new Object[]{this, jscVar, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        AVSDKLog.e(this.a0, "enter queryAndPickVideoUrl");
        this.c.setRateAdaptePriority(B(i, z2));
        MediaPlayControlContext mediaPlayControlContext = this.c;
        mediaPlayControlContext.mHasQueryMediaInfo = true;
        if (!mediaPlayControlContext.mLocalVideo && TextUtils.isEmpty(mediaPlayControlContext.getVideoToken())) {
            this.c.setVideoUrl("");
            this.c.setVideoDefinition("");
            this.c.setPlayableBytes(0);
        }
        this.x = System.currentTimeMillis();
        this.c.mTBVideoSourceAdapter.a(new C0593a(jscVar, z, i));
    }

    public final void N(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586c3908", new Object[]{this, qualityLiveItem});
            return;
        }
        this.c.mQualityLiveItem = qualityLiveItem;
        feh fehVar = this.a0;
        AVSDKLog.e(fehVar, "setLiveUrl rtcLiveUrl: " + qualityLiveItem.rtcLiveUrl + ", bfrtcUrl: " + qualityLiveItem.bfrtcUrl + ", liveUrlMiniBfrtc: " + qualityLiveItem.liveUrlMiniBfrtc);
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            P();
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.c.unselectS266OfPlay();
        }
    }

    public final void Q(ca5 ca5Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20d9f9c", new Object[]{this, ca5Var, new Float(f)});
        } else if (ca5Var != null && this.c != null) {
            int d = ca5Var.d();
            if (this.c.getNetSpeed() >= 3.0f * f && f > 10.0f && ca5Var.h() > 0 && ca5Var.k() > ca5Var.h()) {
                d = ca5Var.h() * ((int) (d / ca5Var.k()));
            }
            this.c.setMaxLevel(ca5Var.k());
            this.c.setCurrentLevel(ca5Var.h());
            this.c.setAvdataBufferedMaxMBytes(d);
            this.c.setAvdataBufferedMaxTime(ca5Var.c());
        }
    }

    public final boolean R(MediaPlayControlContext mediaPlayControlContext, Map<String, ba5> map) {
        ba5 ba5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47775c97", new Object[]{this, mediaPlayControlContext, map})).booleanValue();
        }
        if (map == null || map.size() == 0 || (ba5Var = map.get("custom")) == null || TextUtils.isEmpty(ba5Var.i())) {
            return false;
        }
        mediaPlayControlContext.setVideoUrl(m(ba5Var.i()));
        mediaPlayControlContext.setVideoDefinition(ew0.m("h264", "custom"));
        mediaPlayControlContext.setCacheKey(ba5Var.b());
        mediaPlayControlContext.setCurrentBitRate(ba5Var.g());
        if (this.c.getEnableRealLength()) {
            mediaPlayControlContext.setVideoLength(ba5Var.f());
        } else {
            mediaPlayControlContext.setVideoLength(ba5Var.h());
        }
        mediaPlayControlContext.setPlayableBytes(ba5Var.e());
        return true;
    }

    public final void T() {
        boolean z;
        gf4 gf4Var;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bead34", new Object[]{this});
            return;
        }
        gf4 gf4Var2 = MediaAdapteManager.mConfigAdapter;
        if (gf4Var2 == null || !ew0.s(gf4Var2.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"))) {
            z = false;
        } else {
            z = true;
        }
        boolean isEmpty = TextUtils.isEmpty(this.c.getFrom());
        int i = Build.VERSION.SDK_INT;
        if (((i >= 23 && this.c.mTBLive) || !this.c.mTBLive) && (gf4Var = MediaAdapteManager.mConfigAdapter) != null) {
            String config = gf4Var.getConfig("", MediaConstant.ORANGE_HARDWARE_H264_BLACK, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            String config2 = MediaAdapteManager.mConfigAdapter.getConfig("", MediaConstant.ORANGE_HARDWARE_H264_BIZCODE_BLACK, "[\"WEITAO\"]");
            String str = Build.MODEL;
            boolean n = ew0.n(str, config);
            if (i >= 23 || !ew0.n(this.c.getFrom(), config2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!n && ((!isEmpty || !z) && z2)) {
                this.c.setHardwareAvc(true);
            }
            if (ew0.n(str, config) || !z2) {
                this.c.setHardwareAvc(false);
            }
        }
        this.c.setH264AuthenStrategy(H264AuthenStrategy.BLACKLIST);
    }

    public final void U() {
        boolean z;
        gf4 gf4Var;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87b4419", new Object[]{this});
            return;
        }
        gf4 gf4Var2 = MediaAdapteManager.mConfigAdapter;
        if (gf4Var2 == null || !ew0.s(gf4Var2.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"))) {
            z = false;
        } else {
            z = true;
        }
        boolean isEmpty = TextUtils.isEmpty(this.c.getFrom());
        int i = Build.VERSION.SDK_INT;
        if (((i >= 23 && this.c.mTBLive) || !this.c.mTBLive) && (gf4Var = MediaAdapteManager.mConfigAdapter) != null && ew0.n(ew0.e(), gf4Var.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_WHITE, ""))) {
            String config = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_BLACK, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_BIZCODE_BLACK, "[\"WEITAO\"]");
            boolean n = ew0.n(Build.MODEL, config);
            if (i >= 23 || !ew0.n(this.c.getFrom(), config2)) {
                z2 = true;
            }
            if (!n && ((!isEmpty || !z) && z2)) {
                this.c.setHardwareAvc(true);
            }
        }
        this.c.setH264AuthenStrategy(H264AuthenStrategy.WHITLIST);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(com.taobao.mediaplay.MediaPlayControlContext r12, java.util.Map<java.lang.String, tb.ba5> r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.V(com.taobao.mediaplay.MediaPlayControlContext, java.util.Map, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(com.taobao.mediaplay.MediaPlayControlContext r18, java.util.Map<java.lang.String, tb.ba5> r19, int r20) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.Y(com.taobao.mediaplay.MediaPlayControlContext, java.util.Map, int):void");
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948cbe76", new Object[]{this});
        } else {
            this.c.setHandleVVCError();
        }
    }

    public final void a0(MediaPlayControlContext mediaPlayControlContext, Map<String, qs2> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8e480", new Object[]{this, mediaPlayControlContext, map, str, str2});
        } else if (!TextUtils.isEmpty(str) && map != null && map.get(str) != null) {
            String b = map.get(str).b();
            if (!TextUtils.isEmpty(b)) {
                String a2 = a7m.a(mediaPlayControlContext.mContext, b);
                if (!TextUtils.isEmpty(a2)) {
                    mediaPlayControlContext.setHighCachePath(a2);
                    mediaPlayControlContext.mHighVideoDefinition = str2;
                }
            }
        }
    }

    public final boolean g0(HashMap<String, Integer> hashMap, MediaLiveInfo mediaLiveInfo, boolean z, String[] strArr) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c653a6", new Object[]{this, hashMap, mediaLiveInfo, new Boolean(z), strArr})).booleanValue();
        }
        AVSDKLog.e(this.a0, "enter setLiveUrlByRecom ");
        if (hashMap.size() == 0) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (hashMap.containsKey(strArr[i])) {
                int intValue = hashMap.get(strArr[i]).intValue();
                boolean z3 = mediaLiveInfo.h265;
                QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(intValue);
                if (!z || !this.c.mH265Enable) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (f0(z3, qualityLiveItem, z2)) {
                    this.c.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(intValue), intValue);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i0(boolean z, int i) {
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6766e492", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        MediaLiveInfo mediaLiveInfo = this.c.mMediaLiveInfo;
        if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return false;
        }
        return d0(this.c.mMediaLiveInfo, z);
    }

    public final void j0(ca5 ca5Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98142073", new Object[]{this, ca5Var});
            return;
        }
        this.A = ca5Var.s();
        String videoDefinition = this.c.getVideoDefinition();
        String str = "";
        if (videoDefinition != null) {
            while (true) {
                String[] strArr = this.w;
                if (i >= strArr.length) {
                    break;
                } else if (videoDefinition.contains(strArr[i])) {
                    str = str + this.w[i];
                    break;
                } else {
                    i++;
                }
            }
            if (videoDefinition.contains("265")) {
                str = str + "_265";
            }
        }
        this.B = ca5Var.m(str);
    }

    public final String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8bbc35", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(itw.URL_SEPARATOR)) {
            return str;
        }
        return "http:".concat(str);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1c3002", new Object[]{this})).booleanValue();
        }
        return this.c.canSelectHDRUrlForVideo();
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cabbf7c", new Object[]{this})).booleanValue();
        }
        return this.c.canSelectS266UrlForLive();
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf0421", new Object[]{this})).booleanValue();
        }
        return this.c.canSelectS266UrlForVideo();
    }

    public void q(int i, jsc jscVar) {
        int w;
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea17e6c", new Object[]{this, new Integer(i), jscVar});
            return;
        }
        v();
        u();
        this.c.setH265(this.W);
        MediaPlayControlContext mediaPlayControlContext = this.c;
        mediaPlayControlContext.mSVCEnable = false;
        mediaPlayControlContext.mLowQualityUrl = "";
        wrc wrcVar = MediaAdapteManager.mMeasureAdapter;
        if (wrcVar != null) {
            this.c.setNetSpeed(wrcVar.getNetSpeedValue());
        }
        this.c.setVideoUrl("");
        MediaLiveInfo mediaLiveInfo = this.c.mMediaLiveInfo;
        if (mediaLiveInfo != null && (arrayList = mediaLiveInfo.liveUrlList) != null && arrayList.get(i) != null) {
            QualityLiveItem qualityLiveItem = this.c.mMediaLiveInfo.liveUrlList.get(i);
            AVSDKLog.d("MediaPlayControlManager", "change live quality index: " + i);
            m0(qualityLiveItem);
            boolean f0 = f0(this.c.mMediaLiveInfo.h265, qualityLiveItem, this.W);
            if (f0) {
                this.c.setCurrentPlayerQualityItem(qualityLiveItem, i);
            }
            jscVar.onPick(f0, "");
        } else if (TextUtils.isEmpty(this.c.getVideoUrl()) && (w = w(this.c.mMediaLiveInfo)) > 0) {
            QualityLiveItem qualityLiveItem2 = this.c.mMediaLiveInfo.liveUrlList.get(w);
            AVSDKLog.d("MediaPlayControlManager", "get default live index: " + w);
            m0(qualityLiveItem2);
            if (f0(this.c.mMediaLiveInfo.h265, qualityLiveItem2, this.W)) {
                this.c.setCurrentPlayerQualityItem(qualityLiveItem2, i);
            }
        }
    }

    public final void r(ca5 ca5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6270eb4", new Object[]{this, ca5Var});
            return;
        }
        this.c.setAudioGainEnble(true);
        this.c.setAudioGainCoef(ca5Var.b());
    }

    public final void s() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8a995b", new Object[]{this});
            return;
        }
        if (this.c.getPlayerType() != 2) {
            z = true;
        }
        this.W = z;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("926524e5", new Object[]{this})).booleanValue();
        }
        return ew0.s(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_PC_UNIT, "false"));
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1feb71", new Object[]{this});
            return;
        }
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        if (gf4Var == null) {
            return;
        }
        if (ew0.s(gf4Var.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H264_BLACKLIST_POLICY, "true"))) {
            T();
        } else {
            U();
        }
    }

    public final int x(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d0c0a70", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        MediaPlayControlContext mediaPlayControlContext = this.c;
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.setVdeoDeviceMeaseureEnable(true);
        }
        if (F()) {
            return 4;
        }
        if ("WIFI".equals(str) && i > 1500 && this.c.mTBLive) {
            return 5;
        }
        if (("WIFI".equals(str) && i > 1500) || (("4G".equals(str) || ("5G".equals(str) && i > 2000)) && !z)) {
            return 1;
        }
        if (i <= 1000 || "2G".equals(str)) {
            return 3;
        }
        return 2;
    }

    public final void y(MediaPlayControlContext mediaPlayControlContext, Map<String, qs2> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb69cbfa", new Object[]{this, mediaPlayControlContext, map});
        } else if (!TextUtils.isEmpty(this.c.getVideoDefinition())) {
            if (mediaPlayControlContext.isH265()) {
                if (ew0.m("h265", MediaConstant.DEFINITION_SD).equals(this.c.getVideoDefinition())) {
                    a0(mediaPlayControlContext, map, MediaConstant.DEFINITION_HD_H265, ew0.m("h265", MediaConstant.DEFINITION_HD));
                }
            } else if (ew0.m("h264", MediaConstant.DEFINITION_SD).equals(this.c.getVideoDefinition())) {
                a0(mediaPlayControlContext, map, MediaConstant.DEFINITION_HD, ew0.m("h264", MediaConstant.DEFINITION_HD));
            } else if (ew0.m("h264", MediaConstant.DEFINITION_LD).equals(this.c.getVideoDefinition())) {
                a0(mediaPlayControlContext, map, MediaConstant.DEFINITION_HD, ew0.m("h264", MediaConstant.DEFINITION_HD));
                if (TextUtils.isEmpty(mediaPlayControlContext.getHighCachePath())) {
                    a0(mediaPlayControlContext, map, MediaConstant.DEFINITION_SD, ew0.m("h264", MediaConstant.DEFINITION_SD));
                }
            }
        }
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("282a29dd", new Object[]{this})).intValue();
        }
        return this.f11020a;
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.mediaplay.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0593a implements a9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jsc f11021a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        public C0593a(jsc jscVar, boolean z, int i) {
            this.f11021a = jscVar;
            this.b = z;
            this.c = i;
        }

        @Override // tb.a9e
        public void a(MediaVideoResponse mediaVideoResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d149e9", new Object[]{this, mediaVideoResponse});
                return;
            }
            a.d(a.this, -2);
            feh h = a.h(a.this);
            if (("pickTBVideoUrl.onError##Response msg:" + mediaVideoResponse) == null) {
                str = null;
            } else {
                str = mediaVideoResponse.errorMsg + "code:" + mediaVideoResponse.errorCode;
            }
            AVSDKLog.e(h, str);
            a.e(a.this, false);
            this.f11021a.onPick(true, mediaVideoResponse.errorCode);
        }

        @Override // tb.a9e
        public void b(MediaVideoResponse mediaVideoResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf7cd44e", new Object[]{this, mediaVideoResponse});
                return;
            }
            a.a(a.this, System.currentTimeMillis());
            if (mediaVideoResponse == null || mediaVideoResponse.data == null) {
                a.d(a.this, -1);
                AVSDKLog.e(a.h(a.this), "pickTBVideoUrl.onSuccess##Response no data");
            } else if (!TextUtils.isEmpty(a.b(a.this).getVideoToken())) {
                a.e(a.this, false);
                this.f11021a.onPick(true, "");
                return;
            } else {
                if (a.f(a.this) && a.g(a.this)) {
                    mfi.d(a.b(a.this).mVideoId, mediaVideoResponse.data);
                }
                ca5 ca5Var = new ca5(mediaVideoResponse.data, a.h(a.this).b());
                a.b(a.this).setUseTBNet(true);
                if (ca5Var.i() || ew0.s(ja1.K(a.b(a.this).mContext, "DWInteractive", "useNewNetPolicy", "true"))) {
                    a aVar = a.this;
                    a.i(aVar, ca5Var, a.b(aVar), ca5Var.q(), ca5Var.e(), this.b, this.c);
                } else {
                    a aVar2 = a.this;
                    a.j(aVar2, ca5Var, a.b(aVar2), ca5Var.q(), ca5Var.e(), this.b, this.c);
                }
                a aVar3 = a.this;
                a.k(aVar3, ca5Var, a.b(aVar3).getCurrentBitRate());
                a.l(a.this, ca5Var);
                a.c(a.this, ca5Var);
                a.b(a.this).setForceMuteMode(ca5Var.j());
            }
            if (a.b(a.this) != null) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "pickTBVideoUrl.onSuccess##UseH265:" + this.b + " videoUrl:" + a.b(a.this).getVideoUrl() + " BackupVideoUrl:" + a.b(a.this).getBackupVideoUrl() + " playerType:" + a.b(a.this).getPlayerType());
            }
            a.e(a.this, false);
            this.f11021a.onPick(true, "");
        }
    }

    public void L(jsc jscVar) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e1c69b", new Object[]{this, jscVar});
            return;
        }
        AVSDKLog.e(this.a0, "enter pickVideoUrl");
        if (!this.b) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "pickVideoUrl##VideoSource:" + this.c.getVideoSource());
            if (jscVar == null) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "pickVideoUrl##videoUrlPickCallBack = null");
                return;
            }
            MediaPlayControlContext mediaPlayControlContext2 = this.c;
            if (mediaPlayControlContext2 != null && !mediaPlayControlContext2.mTBLive) {
                wrc wrcVar = MediaAdapteManager.mMeasureAdapter;
                if (wrcVar != null) {
                    mediaPlayControlContext2.setNetSpeed(wrcVar.getNetSpeedValue());
                }
                this.c.setNetWorkQuality(z5r.d());
                this.c.setGlobalCurrentBandWidth(z5r.c());
                this.c.setGlobalPredictBandWidth(z5r.e());
            }
            this.c.setTopAnchor(false);
            boolean equals = "TBVideo".equals(this.c.getVideoSource());
            boolean equals2 = "TBAudio".equals(this.c.getVideoSource());
            if (this.Y && this.c.getMediaInfoParams() == null) {
                JSONObject a2 = mfi.a(this.c.mVideoId);
                if ((equals || equals2) && a2 != null) {
                    this.c.setMediaInfoParams(a2);
                }
            }
            if ((equals || equals2) && this.c.getMediaInfoParams() != null) {
                AVSDKLog.e(this.a0, "pickVideoUrl contains MediaInfoParams");
                if (MediaAdapteManager.mConfigAdapter == null || !ew0.n(this.c.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.USE_INPUT_MEDIA_INFO_BLACK_LIST, ""))) {
                    K(jscVar);
                    return;
                } else if (this.c != null) {
                    AVSDKLog.e(this.a0, "pickTBMediaUrlFromMediaInfo##mFrom is in useInputMediaInfo blacklist");
                }
            }
            if (TextUtils.isEmpty(this.c.mVideoId) || !equals) {
                MediaPlayControlContext mediaPlayControlContext3 = this.c;
                if (!mediaPlayControlContext3.mTBLive) {
                    if (mediaPlayControlContext3.mEmbed) {
                        u();
                        v();
                    }
                    jscVar.onPick(false, "");
                    return;
                }
            }
            if (!equals && !this.c.mTBLive) {
                return;
            }
            if (!equals || !((mediaPlayControlContext = this.c) == null || MediaAdapteManager.mConfigAdapter == null || ew0.n(mediaPlayControlContext.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.PLAY_MANAGER_BIZCODES_BLACK_LIST, "[\"TRAVEL_HOME\"]")))) {
                J(jscVar);
                return;
            }
            jscVar.onPick(false, "");
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "pickTBVideoUrl##PlayManager is not available");
        }
    }

    public final void m0(QualityLiveItem qualityLiveItem) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cbf8d8", new Object[]{this, qualityLiveItem});
            return;
        }
        if (!TextUtils.isEmpty(qualityLiveItem.unitType) && qualityLiveItem.unitType.startsWith("sub_")) {
            try {
                i = Integer.parseInt(qualityLiveItem.unitType.substring(4));
            } catch (NumberFormatException unused) {
                AVSDKLog.w("MediaPlayControlManager", "exception parsing unit number from " + qualityLiveItem.unitType);
            }
        }
        this.f11020a = i;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76217a50", new Object[]{this});
            return;
        }
        s();
        this.c.setHardwareHevc(true);
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        if (gf4Var == null) {
            return;
        }
        if (ew0.s(gf4Var.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H265_BLACKLIST_POLICY, "true"))) {
            W();
        } else {
            X();
        }
    }

    public Map<String, String> A() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a43e49c3", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pctime", "" + (this.y - this.x));
        hashMap.put("pcend", "" + this.y);
        hashMap.put("pcerror", "" + this.z);
        hashMap.put("videoPassThroughData", "" + this.A);
        hashMap.put("resourcePassThroughData", "" + this.B);
        hashMap.put("mSelectVodUrlReason", "" + this.C);
        hashMap.put("SelectVodUrlReasonNew", "" + this.D);
        hashMap.put("NetSpeedCalReason", "" + this.E);
        hashMap.put("BitRateForVodSelect", "" + this.F);
        hashMap.put("BitRateForVodSelectByRobust", "" + this.G);
        hashMap.put("defSelectByCache", "" + this.I);
        hashMap.put("defSelectByPolicy", "" + this.H);
        hashMap.put("selectReasonAtPreDL", this.K);
        hashMap.put("defDegradeReason", "" + this.L);
        hashMap.put("ud265BitRate", "" + this.M);
        hashMap.put("hd265BitRate", "" + this.O);
        hashMap.put("ud266BitRate", "" + this.R);
        hashMap.put("hd266BitRate", "" + this.S);
        hashMap.put("hd264BitRate", "" + this.Q);
        hashMap.put("clientVerify", "" + this.T);
        hashMap.put("pre_cache_bytes", "" + this.V);
        try {
            String replaceAll = this.J.replaceAll(",", "*");
            hashMap.put("bitRateMap", "" + replaceAll);
            if (!TextUtils.isEmpty(replaceAll)) {
                if (!replaceAll.contains(MediaConstant.DEFINITION_UD)) {
                    if (!replaceAll.contains(MediaConstant.DEFINITION_2K)) {
                        if (replaceAll.contains(MediaConstant.DEFINITION_4K)) {
                        }
                    }
                }
                z = true;
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("has_1080p_url", str);
        } catch (Exception e) {
            feh fehVar = this.a0;
            AVSDKLog.e(fehVar, "BitRateMap replace failed." + e.toString());
        }
        return hashMap;
    }

    public final String B(int i, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9b4ae2b", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (this.Z) {
            if (i == 1) {
                str = "hd_264_sdr#sd_264_sdr#ld_264_sdr#ud_264_sdr";
            } else if (i == 2) {
                str = "sd_264_sdr#ld_264_sdr#hd_264_sdr#ud_264_sdr";
            } else if (i != 4) {
                str = "ld_264_sdr#sd_264_sdr#hd_264_sdr#ud_264_sdr";
            } else {
                str = "ud_264_sdr#hd_264_sdr#sd_264_sdr#ld_264_sdr";
            }
        } else if (i == 1) {
            str = "hd#sd#ld#ud";
        } else if (i == 2) {
            str = "sd#ld#hd#ud";
        } else if (i != 4) {
            str = "ld#sd#hd#ud";
        } else {
            str = "ud#hd#sd#ld";
        }
        return z ? "custom#".concat(str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(tb.jsc r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.J(tb.jsc):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(tb.jsc r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.mediaplay.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "7c0efc54"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            tb.feh r2 = r8.a0
            java.lang.String r3 = "enter pickTBMediaUrlFromMediaInfo"
            com.taobao.taobaoavsdk.AVSDKLog.e(r2, r3)
            r8.b = r0
            tb.g0d r2 = com.taobao.media.MediaAdapteManager.mMediaNetworkUtilsAdapter
            com.taobao.mediaplay.MediaPlayControlContext r3 = r8.c
            android.content.Context r3 = r3.mContext
            java.lang.String r2 = tb.z5r.n(r2, r3)
            tb.wrc r3 = com.taobao.media.MediaAdapteManager.mMeasureAdapter
            if (r3 == 0) goto L_0x007a
            int r3 = r3.getNetSpeedValue()
            com.taobao.mediaplay.MediaPlayControlContext r4 = r8.c
            if (r4 == 0) goto L_0x0078
            tb.wrc r5 = com.taobao.media.MediaAdapteManager.mMeasureAdapter
            com.taobao.media.MediaMeasureAdapter r5 = (com.taobao.media.MediaMeasureAdapter) r5
            boolean r4 = r5.isLowPerformanceByAB(r4)
            tb.wrc r5 = com.taobao.media.MediaAdapteManager.mMeasureAdapter
            com.taobao.media.MediaMeasureAdapter r5 = (com.taobao.media.MediaMeasureAdapter) r5
            com.taobao.mediaplay.MediaPlayControlContext r6 = r8.c
            r5.addLowDeviceExpInfo(r6)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            r5.setLowPerformance(r4)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            if (r4 == 0) goto L_0x0052
            java.lang.String r6 = "low"
            goto L_0x0054
        L_0x0052:
            java.lang.String r6 = "high"
        L_0x0054:
            r5.setDevicePerformanceLevel(r6)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            r5.setNetSpeed(r3)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            int r6 = tb.z5r.d()
            r5.setNetWorkQuality(r6)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            double r6 = tb.z5r.c()
            r5.setGlobalCurrentBandWidth(r6)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            double r6 = tb.z5r.e()
            r5.setGlobalPredictBandWidth(r6)
            goto L_0x007e
        L_0x0078:
            r4 = 0
            goto L_0x007e
        L_0x007a:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0078
        L_0x007e:
            r8.v()
            r8.u()
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            boolean r6 = r8.W
            r5.setH265(r6)
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            org.json.JSONObject r5 = r5.getMediaInfoParams()
            if (r5 != 0) goto L_0x009b
            java.lang.String r0 = ""
            r9.onPick(r1, r0)
            r8.b = r1
            goto L_0x00d5
        L_0x009b:
            com.taobao.mediaplay.MediaPlayControlContext r5 = r8.c
            boolean r6 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.isDecoderLoaded()
            if (r6 == 0) goto L_0x00a6
            boolean r6 = r8.W
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            r5.setH265(r6)
            int r2 = r8.C(r2, r3, r4)
            tb.feh r3 = r8.a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "rateAdapterLevel is "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r3, r4)
            com.taobao.mediaplay.MediaPlayControlContext r3 = r8.c
            boolean r4 = r3.mHighPerformancePlayer
            if (r4 == 0) goto L_0x00cd
            boolean r4 = r3.mBackgroundMode
            if (r4 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            boolean r1 = r3.isH265()
            r8.G(r9, r1, r2, r0)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.K(tb.jsc):void");
    }

    public final boolean S(MediaPlayControlContext mediaPlayControlContext, Map<String, ba5> map, List<String> list) {
        int i;
        String str;
        boolean z;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42cbb28b", new Object[]{this, mediaPlayControlContext, map, list})).booleanValue();
        }
        String str2 = null;
        String str3 = null;
        ba5 ba5Var = null;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                i = -1;
                str = null;
                z = false;
                i2 = 0;
                break;
            }
            str3 = list.get(i3);
            if (str3 == null || str3.isEmpty() || (ba5Var = map.get(str3)) == null || TextUtils.isEmpty(ba5Var.i())) {
                i3++;
            } else {
                str2 = ba5Var.i();
                str = ba5Var.b();
                z = !TextUtils.isEmpty(ba5Var.d()) ? ba5Var.d().contains("hdr") : false;
                i2 = ba5Var.g();
                if (this.c.getEnableRealLength()) {
                    i = ba5Var.f();
                } else {
                    i = ba5Var.h();
                }
                AVSDKLog.e(this.a0, "the chosen DWVideoDefinition=" + ba5Var.c());
            }
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            AVSDKLog.e(this.a0, "setDefinitionPriorityAdapterUrl failed with priority=" + str3 + ",videoUrl=" + str2);
            return false;
        }
        mediaPlayControlContext.setVideoUrl(m(str2));
        mediaPlayControlContext.setVideoDefinition(str3);
        mediaPlayControlContext.setCacheKey(str);
        mediaPlayControlContext.setCurrentBitRate(i2);
        mediaPlayControlContext.setVideoLength(i);
        mediaPlayControlContext.setPlayableBytes(ba5Var.e());
        mediaPlayControlContext.setVideoIsHDR(z);
        return true;
    }

    public final void W() {
        gf4 gf4Var;
        gf4 gf4Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4467d3", new Object[]{this});
            return;
        }
        if (this.W && (gf4Var = MediaAdapteManager.mConfigAdapter) != null) {
            boolean s = ew0.s(gf4Var.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
            int i = Build.VERSION.SDK_INT;
            String config = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BLACK, MediaConstant.DEFAULT_H265_HW_DECODE_BLACK_LIST_NEW);
            String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BIZCODE_BLACK, "[\"WEITAO\"]");
            String str = Build.MODEL;
            boolean n = ew0.n(str, config);
            boolean isEmpty = TextUtils.isEmpty(this.c.getFrom());
            boolean z = i < 23 && ew0.n(this.c.getFrom(), config2);
            if (n || ((isEmpty && s) || z)) {
                this.c.setHardwareHevc(false);
            } else {
                this.c.setHardwareHevc(true);
            }
            if (!this.c.isHardwareHevc()) {
                this.W = MediaDeviceUtils.isSupportH265(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, "h265MaxFreq", "1.8"));
            }
            if (!this.W) {
                MediaPlayControlContext mediaPlayControlContext = this.c;
                if (mediaPlayControlContext.mTBLive && (gf4Var2 = MediaAdapteManager.mConfigAdapter) != null) {
                    this.W = ew0.s(gf4Var2.getConfig(mediaPlayControlContext.mConfigGroup, "lowDeviceH265Enable", "true"));
                    String config3 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_LIVE_HARDWARE_HEVC_BLACK, "");
                    if (ew0.n(str, config3) || ew0.n(ew0.e(), config3)) {
                        this.W = false;
                    }
                    if (this.W && "low".equals(this.c.getDevicePerformanceLevel())) {
                        this.c.mDropFrameForH265 = true;
                    }
                }
            }
        }
        this.c.setH265AuthenStrategy(H265AuthenStrategy.BLACKLIST);
    }

    public final void X() {
        gf4 gf4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd1127d", new Object[]{this});
            return;
        }
        if (this.W) {
            int i = Build.VERSION.SDK_INT;
            gf4 gf4Var2 = MediaAdapteManager.mConfigAdapter;
            if (gf4Var2 != null) {
                boolean s = ew0.s(gf4Var2.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
                String config = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_WHITE, "");
                MediaPlayControlContext mediaPlayControlContext = this.c;
                mediaPlayControlContext.setHardwareHevc(((i >= 23 && mediaPlayControlContext.mTBLive) || !mediaPlayControlContext.mTBLive) && ew0.n(ew0.e(), config));
                boolean isEmpty = TextUtils.isEmpty(this.c.getFrom());
                if (this.c.isHardwareHevc()) {
                    String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BLACK, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
                    String config3 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BIZCODE_BLACK, "[\"WEITAO\"]");
                    boolean n = ew0.n(Build.MODEL, config2);
                    boolean z = i < 23 && ew0.n(this.c.getFrom(), config3);
                    if (n || ((isEmpty && s) || z)) {
                        this.c.setHardwareHevc(false);
                    }
                }
                if (!this.c.isHardwareHevc()) {
                    this.W = MediaDeviceUtils.isSupportH265(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, "h265MaxFreq", "1.8"));
                }
            }
            if (!this.W) {
                MediaPlayControlContext mediaPlayControlContext2 = this.c;
                if (mediaPlayControlContext2.mTBLive && (gf4Var = MediaAdapteManager.mConfigAdapter) != null) {
                    this.W = ew0.s(gf4Var.getConfig(mediaPlayControlContext2.mConfigGroup, "lowDeviceH265Enable", "true"));
                    String config4 = MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_LIVE_HARDWARE_HEVC_BLACK, "");
                    if (ew0.n(Build.MODEL, config4) || ew0.n(ew0.e(), config4)) {
                        this.W = false;
                    }
                    if (this.W && "low".equals(this.c.getDevicePerformanceLevel())) {
                        this.c.mDropFrameForH265 = true;
                    }
                }
            }
        }
        this.c.setH265AuthenStrategy(H265AuthenStrategy.WHITLIST);
    }

    public final boolean d0(MediaLiveInfo mediaLiveInfo, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb83aa41", new Object[]{this, mediaLiveInfo, new Boolean(z)})).booleanValue();
        }
        this.c.setVideoUrl("");
        mediaLiveInfo.rateAdapte = false;
        this.c.setTopAnchor(false);
        this.c.setRateAdapte(false);
        if (!TextUtils.isEmpty(mediaLiveInfo.mediaSourceType)) {
            this.c.mMediaSourceType = mediaLiveInfo.mediaSourceType;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.liveId)) {
            this.c.mVideoId = mediaLiveInfo.liveId;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.anchorId)) {
            this.c.mAccountId = mediaLiveInfo.anchorId;
        }
        for (int i = 0; i < mediaLiveInfo.liveUrlList.size(); i++) {
            String str = "sub_" + z();
            if (mediaLiveInfo.liveUrlList.get(i) != null && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i).flvUrl) && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i).unitType) && mediaLiveInfo.liveUrlList.get(i).unitType.equals(str)) {
                boolean z3 = mediaLiveInfo.h265;
                QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i);
                if (z && this.c.mH265Enable) {
                    z2 = true;
                }
                if (h0(z3, qualityLiveItem, z2)) {
                    this.c.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(i), i);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e0(boolean z, int i) {
        ArrayList<QualityLiveItem> arrayList;
        MediaConfig mediaConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38ba2adb", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        MediaLiveInfo mediaLiveInfo = this.c.mMediaLiveInfo;
        if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return false;
        }
        b0(this.c.mMediaLiveInfo, z, i);
        String n = z5r.n(MediaAdapteManager.mMediaNetworkUtilsAdapter, this.c.mContext);
        if (MediaAdapteManager.mConfigAdapter != null && !TextUtils.isEmpty(this.c.getVideoUrl()) && !this.c.getVideoUrl().contains(".m3u8")) {
            MediaPlayControlContext mediaPlayControlContext = this.c;
            if (mediaPlayControlContext.mTBLive && mediaPlayControlContext.getVideoUrl().contains("liveng.alicdn.com") && ew0.s(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, "lowDeviceSVCEnable", "false"))) {
                MediaPlayControlContext mediaPlayControlContext2 = this.c;
                MediaConfig mediaConfig2 = mediaPlayControlContext2.mMediaLiveInfo.mMediaConfigData;
                if (mediaConfig2 != null && mediaConfig2.enableSVC(mediaPlayControlContext2.getFrom()) && this.c.isLiveRoom() && !TextUtils.isEmpty(n) && ("low".equals(this.c.getDevicePerformanceLevel()) || n.equals("3G") || n.equals("2G") || (this.c.getNetSpeed() > 0 && ((("WIFI".equals(n) && this.c.getNetSpeed() <= 1500) || (("4G".equals(n) || "5G".equals(n)) && this.c.getNetSpeed() <= 2000)) && ew0.s(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, "lowNetSpeedSVCEnable", "false")))))) {
                    this.c.mSVCEnable = true;
                }
            }
        }
        MediaPlayControlContext mediaPlayControlContext3 = this.c;
        if (mediaPlayControlContext3 != null && mediaPlayControlContext3.getNetSpeed() > 2000 && !TextUtils.isEmpty(this.c.getVideoUrl()) && !this.c.getVideoUrl().contains(".m3u8") && !this.c.getVideoUrl().contains("artp") && !this.c.getVideoUrl().contains("artc")) {
            MediaPlayControlContext mediaPlayControlContext4 = this.c;
            if (mediaPlayControlContext4.mTBLive && (mediaConfig = mediaPlayControlContext4.mMediaLiveInfo.mMediaConfigData) != null && mediaConfig.getplayBuffer(mediaPlayControlContext4.getFrom()) > 0) {
                MediaPlayControlContext mediaPlayControlContext5 = this.c;
                mediaPlayControlContext5.setAvdataBufferedMaxMBytes(mediaPlayControlContext5.mMediaLiveInfo.mMediaConfigData.getplayBuffer(mediaPlayControlContext5.getFrom()));
            }
        }
        return true;
    }

    public final boolean h0(boolean z, QualityLiveItem qualityLiveItem, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ad9019c", new Object[]{this, new Boolean(z), qualityLiveItem, new Boolean(z2)})).booleanValue();
        }
        this.c.mSVCEnable = false;
        String str2 = qualityLiveItem.newDefinition;
        if (str2 == null || str2.equals("")) {
            str = qualityLiveItem.definition;
        } else {
            str = qualityLiveItem.newDefinition;
        }
        if (!TextUtils.isEmpty(qualityLiveItem.videoUrl)) {
            this.c.setVideoUrl(qualityLiveItem.videoUrl);
            this.c.setVideoDefinition(ew0.m("h264", str));
            this.c.mSelectedUrlName = "videoUrl";
            return true;
        } else if (!TextUtils.isEmpty(qualityLiveItem.replayUrl)) {
            this.c.setVideoUrl(qualityLiveItem.replayUrl);
            this.c.setVideoDefinition(ew0.m("h264", str));
            this.c.mSelectedUrlName = "replayUrl";
            return true;
        } else {
            if (z2 && z && this.c.useArtp() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl)) {
                this.c.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H265_ARTP, str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl;
            } else if (z2 && z && !TextUtils.isEmpty(qualityLiveItem.wholeH265FlvUrl)) {
                this.c.setVideoUrl(qualityLiveItem.wholeH265FlvUrl);
                this.c.setVideoDefinition(ew0.m("h265", str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl;
                return true;
            } else if (z2 && !z && !TextUtils.isEmpty(qualityLiveItem.h265Url) && this.c.useTransH265()) {
                this.c.setVideoUrl(qualityLiveItem.h265Url);
                this.c.setVideoDefinition(ew0.m("h265", str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_H265URL;
                return true;
            } else if (this.c.useBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                this.c.setVideoUrl(qualityLiveItem.bfrtcUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_BFRTC, str));
                this.c.mSelectedUrlName = MediaConstant.BFRTC_URL_NAME;
                return true;
            } else if (this.c.useArtp() && !z && !TextUtils.isEmpty(qualityLiveItem.artpUrl)) {
                this.c.setVideoUrl(qualityLiveItem.artpUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_ARTP, str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_ARTPURL;
                return true;
            } else if (!TextUtils.isEmpty(qualityLiveItem.flvUrl)) {
                this.c.setVideoUrl(qualityLiveItem.flvUrl);
                this.c.setVideoDefinition(ew0.m("h264", str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_FLVURL;
                return true;
            }
            return false;
        }
    }

    public final void b0(MediaLiveInfo mediaLiveInfo, boolean z, int i) {
        int w;
        String[] strArr;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6419755", new Object[]{this, mediaLiveInfo, new Boolean(z), new Integer(i)});
            return;
        }
        AVSDKLog.e(this.a0, "enter setLiveRateAdapteUrl");
        this.c.setVideoUrl("");
        mediaLiveInfo.rateAdapte = false;
        this.c.setTopAnchor(false);
        this.c.setRateAdapte(false);
        if (!TextUtils.isEmpty(mediaLiveInfo.mediaSourceType)) {
            this.c.mMediaSourceType = mediaLiveInfo.mediaSourceType;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.liveId)) {
            this.c.mVideoId = mediaLiveInfo.liveId;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.anchorId)) {
            this.c.mAccountId = mediaLiveInfo.anchorId;
        }
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        if (gf4Var != null && ew0.s(gf4Var.getConfig(this.c.mConfigGroup, "useRateAdapte", "true"))) {
            if (!mediaLiveInfo.rateAdapte) {
                strArr = this.u;
            } else if (i == 1 || i == 2) {
                strArr = this.u;
            } else {
                this.c.setRateAdapte(true);
                strArr = this.t;
            }
            if (!this.c.isLowPerformance() && Build.VERSION.SDK_INT >= 23) {
                for (String str : this.v) {
                    for (int i2 = 0; i2 < mediaLiveInfo.liveUrlList.size(); i2++) {
                        String str2 = mediaLiveInfo.liveUrlList.get(i2).definition;
                        if (mediaLiveInfo.liveUrlList.get(i2) != null && str.equals(str2) && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i2).flvUrl)) {
                            this.c.mLowQualityUrl = mediaLiveInfo.liveUrlList.get(i2).flvUrl;
                        }
                    }
                }
            }
            c0(mediaLiveInfo, z, i);
            if (TextUtils.isEmpty(this.c.getVideoUrl())) {
                for (String str3 : strArr) {
                    for (int i3 = 0; i3 < mediaLiveInfo.liveUrlList.size(); i3++) {
                        String str4 = mediaLiveInfo.liveUrlList.get(i3).definition;
                        if (mediaLiveInfo.liveUrlList.get(i3) != null && str3.equals(str4)) {
                            if (f0(mediaLiveInfo.h265, mediaLiveInfo.liveUrlList.get(i3), z && this.c.mH265Enable)) {
                                this.c.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(i3), i3);
                                MediaPlayControlContext mediaPlayControlContext = this.c;
                                mediaPlayControlContext.mSelectDefinitionReason = mediaPlayControlContext.mSelectDefinitionReason;
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.c.getVideoUrl()) && (w = w(this.c.mMediaLiveInfo)) >= 0) {
            boolean z3 = mediaLiveInfo.h265;
            QualityLiveItem qualityLiveItem = this.c.mMediaLiveInfo.liveUrlList.get(w);
            if (z && this.c.mH265Enable) {
                z2 = true;
            }
            if (f0(z3, qualityLiveItem, z2)) {
                this.c.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(w), w);
                MediaPlayControlContext mediaPlayControlContext2 = this.c;
                mediaPlayControlContext2.mSelectDefinitionReason = mediaPlayControlContext2.mSelectDefinitionReason;
            }
        }
    }

    public a(MediaPlayControlContext mediaPlayControlContext) {
        this.X = "*";
        this.Y = false;
        this.Z = false;
        this.c = mediaPlayControlContext;
        this.a0 = new feh(toString(), mediaPlayControlContext.mPlayToken);
        z5r.u(mediaPlayControlContext.mPlayToken);
        this.X = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_FALLBACK_IN_PLAY_CONTROL, "*");
        this.Y = ew0.n(mediaPlayControlContext.getFrom(), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE_SBT, "[\"newdetail_main\", \"newdetail_native\", \"myorder\"]"));
        this.Z = mediaPlayControlContext.mEnableFullPCMediaInfo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
        if (r10.equals("3G") == false) goto L_0x0082;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int C(java.lang.String r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 4
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.mediaplay.a.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x002c
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Boolean r11 = new java.lang.Boolean
            r11.<init>(r12)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r0] = r9
            r12[r3] = r10
            r12[r2] = r6
            r12[r1] = r11
            java.lang.String r10 = "f99d5968"
            java.lang.Object r10 = r5.ipc$dispatch(r10, r12)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            return r10
        L_0x002c:
            com.taobao.mediaplay.MediaPlayControlContext r5 = r9.c
            boolean r5 = r5.getEnableSelectHdByClickLoad()
            if (r5 == 0) goto L_0x003d
            tb.feh r10 = r9.a0
            java.lang.String r11 = "select RATE_ADAPTER_HD by click load"
            com.taobao.taobaoavsdk.AVSDKLog.e(r10, r11)
            return r3
        L_0x003d:
            boolean r5 = r9.F()
            if (r5 == 0) goto L_0x0044
            return r4
        L_0x0044:
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 != 0) goto L_0x0077
            if (r11 <= 0) goto L_0x0077
            com.taobao.mediaplay.MediaPlayControlContext r5 = r9.c
            if (r5 == 0) goto L_0x0077
            tb.wrc r6 = com.taobao.media.MediaAdapteManager.mMeasureAdapter
            if (r6 == 0) goto L_0x0077
            tb.gf4 r6 = com.taobao.media.MediaAdapteManager.mConfigAdapter
            if (r6 == 0) goto L_0x0077
            java.lang.String r5 = r5.mConfigGroup
            java.lang.String r7 = "videoDeviceMeaseureEnable"
            java.lang.String r8 = "true"
            java.lang.String r5 = r6.getConfig(r5, r7, r8)
            boolean r5 = tb.ew0.s(r5)
            if (r5 == 0) goto L_0x0077
            com.taobao.mediaplay.MediaPlayControlContext r0 = r9.c
            boolean r0 = r0.mTBLive
            if (r0 == 0) goto L_0x0072
            r11 = 20000(0x4e20, float:2.8026E-41)
        L_0x0072:
            int r10 = r9.x(r10, r11, r12)
            return r10
        L_0x0077:
            r10.hashCode()
            r11 = -1
            int r12 = r10.hashCode()
            switch(r12) {
                case 1652: goto L_0x00b0;
                case 1683: goto L_0x00a5;
                case 1714: goto L_0x009a;
                case 2664213: goto L_0x008f;
                case 1379812394: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            r0 = -1
            goto L_0x00b9
        L_0x0084:
            java.lang.String r12 = "Unknown"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x008d
            goto L_0x0082
        L_0x008d:
            r0 = 4
            goto L_0x00b9
        L_0x008f:
            java.lang.String r12 = "WIFI"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0098
            goto L_0x0082
        L_0x0098:
            r0 = 3
            goto L_0x00b9
        L_0x009a:
            java.lang.String r12 = "5G"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00a3
            goto L_0x0082
        L_0x00a3:
            r0 = 2
            goto L_0x00b9
        L_0x00a5:
            java.lang.String r12 = "4G"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00ae
            goto L_0x0082
        L_0x00ae:
            r0 = 1
            goto L_0x00b9
        L_0x00b0:
            java.lang.String r12 = "3G"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00b9
            goto L_0x0082
        L_0x00b9:
            switch(r0) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bf;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            return r1
        L_0x00bd:
            r10 = 5
            return r10
        L_0x00bf:
            return r3
        L_0x00c0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.C(java.lang.String, int, boolean):int");
    }

    public final void k0(ca5 ca5Var, MediaPlayControlContext mediaPlayControlContext, Map<String, ba5> map, Map<String, qs2> map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41c321a", new Object[]{this, ca5Var, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
            return;
        }
        AVSDKLog.e(this.a0, "enter setVideoUrl ");
        if (map == null || map.size() == 0 || mediaPlayControlContext == null) {
            if (mediaPlayControlContext != null) {
                AVSDKLog.e(this.a0, "pickTBVideoUrl.setVideoUrl##VideoDefinitionMap empty");
            }
            this.C = 0;
            return;
        }
        boolean p = p();
        boolean n = n();
        if (!p && map.size() > 0) {
            map.remove(MediaConstant.DEFINITION_UD_H266_FULL);
            map.remove(MediaConstant.DEFINITION_HD_H266_FULL);
            map.remove(MediaConstant.DEFINITION_SD_H266_FULL);
            map.remove(MediaConstant.DEFINITION_LD_H266_FULL);
            map.remove(MediaConstant.DEFINITION_UD_H266);
            map.remove(MediaConstant.DEFINITION_HD_H266);
            map.remove(MediaConstant.DEFINITION_SD_H266);
            map.remove(MediaConstant.DEFINITION_LD_H266);
        }
        if (!n && map.size() > 0) {
            map.remove(MediaConstant.DEFINITION_HD_H265_HDR);
            map.remove(MediaConstant.DEFINITION_UD_H265_HDR);
        }
        if (TextUtils.isEmpty(this.c.mVideoId) || !pmm.b().c(this.c.mVideoId)) {
            MediaPlayControlContext mediaPlayControlContext2 = this.c;
            if (!mediaPlayControlContext2.mHighPerformancePlayer || !mediaPlayControlContext2.mBackgroundMode || !R(mediaPlayControlContext, map)) {
                if (ca5Var.p() != null) {
                    this.J = ca5Var.p().toString();
                }
                if (!ja1.e0() || ja1.k0()) {
                    this.C = 3;
                    V(mediaPlayControlContext, map, false, i);
                    y(mediaPlayControlContext, map2);
                    return;
                }
                if (ca5Var.n() != null && ca5Var.n().size() > 0) {
                    boolean S = S(mediaPlayControlContext, map, ca5Var.n());
                    y(mediaPlayControlContext, map2);
                    if (S) {
                        this.C = 4;
                        V(mediaPlayControlContext, map, true, i);
                        return;
                    }
                }
                if (z) {
                    Y(mediaPlayControlContext, map, i);
                    y(mediaPlayControlContext, map2);
                    if (mediaPlayControlContext.isH265()) {
                        this.C = 5;
                        V(mediaPlayControlContext, map, true, i);
                        return;
                    }
                }
                V(mediaPlayControlContext, map, false, i);
                this.C = 6;
                y(mediaPlayControlContext, map2);
                return;
            }
            this.C = 2;
            return;
        }
        Map<String, String> a2 = pmm.b().a(this.c.mVideoId);
        String str = a2.get(VideoControllerManager.KEY_CACHEKEY);
        if (!TextUtils.isEmpty(str) && ca5Var.g() != null) {
            String str2 = ca5Var.g().get(str);
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, a2.get("url"))) {
                mediaPlayControlContext.setVideoUrl(str2);
                feh fehVar = this.a0;
                AVSDKLog.e(fehVar, "setVideoUrl: use new url=" + mediaPlayControlContext.getVideoUrl() + " insteadOf cacheUrl=" + a2.get("url") + "when getCache.");
            }
        }
        if (TextUtils.isEmpty(mediaPlayControlContext.getVideoUrl())) {
            mediaPlayControlContext.setVideoUrl(a2.get("url"));
            feh fehVar2 = this.a0;
            AVSDKLog.e(fehVar2, "setVideoUrl: getUrl From New MediaInfo failed, set url in cache, url=" + mediaPlayControlContext.getVideoUrl());
        }
        mediaPlayControlContext.setVideoDefinition(a2.get("videoDefinition"));
        mediaPlayControlContext.setCacheKey(a2.get(VideoControllerManager.KEY_CACHEKEY));
        mediaPlayControlContext.setCurrentBitRate(Integer.parseInt(a2.get(VideoControllerManager.KEY_BITRATE)));
        mediaPlayControlContext.setVideoLength(Integer.parseInt(a2.get(pg1.ATOM_length)));
        this.C = 1;
    }

    public final void G(jsc jscVar, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f41ac6", new Object[]{this, jscVar, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        feh fehVar = this.a0;
        AVSDKLog.e(fehVar, "enter parseAndPickVideoUrl, video token is " + this.c.getVideoToken());
        this.c.setRateAdaptePriority(B(i, z2));
        MediaPlayControlContext mediaPlayControlContext = this.c;
        if (!mediaPlayControlContext.mLocalVideo && TextUtils.isEmpty(mediaPlayControlContext.getVideoToken())) {
            this.c.setVideoUrl("");
            this.c.setVideoDefinition("");
            this.c.setPlayableBytes(0);
        }
        if (this.c.getMediaInfoParams() == null) {
            AVSDKLog.e(this.a0, "parseAndPickVideoUrl.onError## mediaInfoParam is empty");
            M(jscVar, z, i, z2);
        } else if (!TextUtils.isEmpty(this.c.getVideoToken())) {
            this.b = false;
            jscVar.onPick(true, "");
        } else {
            ca5 ca5Var = new ca5(this.c.getMediaInfoParams(), this.a0.b());
            this.c.setUseTBNet(true);
            int u = ew0.u(MediaAdapteManager.mConfigAdapter.getConfig(this.c.mConfigGroup, MediaConstant.ORANGE_PC_CLOUD_SIGNATURE_CHECK_TYPE, "1"));
            if (u >= 1) {
                this.T = ca5Var.o() ? 1 : 0;
            }
            if (this.T == 0) {
                if (u == 2) {
                    this.c.setVideoUrl("");
                    jscVar.onPick(true, "4002");
                    return;
                } else if (u == 3) {
                    this.U = "4002";
                }
            }
            if (ca5Var.i() || ew0.s(ja1.K(this.c.mContext, "DWInteractive", "useNewNetPolicy", "true"))) {
                l0(ca5Var, this.c, ca5Var.q(), ca5Var.e(), z, i);
            } else {
                k0(ca5Var, this.c, ca5Var.q(), ca5Var.e(), z, i);
            }
            Q(ca5Var, this.c.getCurrentBitRate());
            j0(ca5Var);
            r(ca5Var);
            if (this.c.getEnableMediaInfoLength()) {
                String cacheKey = this.c.getCacheKey();
                feh fehVar2 = this.a0;
                AVSDKLog.e(fehVar2, "selectCacheKey is :" + cacheKey);
                feh fehVar3 = this.a0;
                AVSDKLog.e(fehVar3, "selectLength is :" + this.c.getVideoLength());
                mfi.c(cacheKey, this.c.getVideoLength());
            }
            this.c.setForceMuteMode(ca5Var.j());
            this.b = false;
            jscVar.onPick(true, this.U);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a6, code lost:
        if (r19 == false) goto L_0x0116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(com.taobao.mediaplay.model.MediaLiveInfo r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.a.c0(com.taobao.mediaplay.model.MediaLiveInfo, boolean, int):void");
    }

    public final boolean f0(boolean z, QualityLiveItem qualityLiveItem, boolean z2) {
        String str;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c6e24b", new Object[]{this, new Boolean(z), qualityLiveItem, new Boolean(z2)})).booleanValue();
        }
        if (qualityLiveItem == null) {
            return false;
        }
        this.c.mSVCEnable = false;
        N(qualityLiveItem);
        boolean a2 = cq.a();
        feh fehVar = this.a0;
        AVSDKLog.e(fehVar, "artcSoReady is " + a2);
        if (TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
            str = qualityLiveItem.definition;
        } else {
            str = qualityLiveItem.newDefinition;
        }
        if (!TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
            feh fehVar2 = this.a0;
            AVSDKLog.e(fehVar2, "newDefinition is " + qualityLiveItem.newDefinition);
            if (!TextUtils.isEmpty(this.c.getDisableDefinition())) {
                feh fehVar3 = this.a0;
                AVSDKLog.e(fehVar3, "getDisableDefinition is " + this.c.getDisableDefinition());
                if (this.c.getDisableDefinition().contains(str)) {
                    return false;
                }
            }
        }
        if (this.c.useTransCodeRtcLive()) {
            this.c.mSelectFlvUrlReason = 1;
            if (o()) {
                try {
                    com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(qualityLiveItem.additionUrlMap);
                    if (ja1.B() && a2 && !TextUtils.isEmpty(parseObject.getString("rtc266Url")) && parseObject.getString("rtc266Url").contains("encoder_type=266")) {
                        this.c.selecte266ToPlay();
                        this.c.setVideoUrl(parseObject.getString("rtc266Url"));
                        this.c.setVideoDefinition(ew0.m(MediaConstant.H266, str));
                        MediaPlayControlContext mediaPlayControlContext = this.c;
                        mediaPlayControlContext.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
                        mediaPlayControlContext.isRtcVVC = true;
                        return true;
                    } else if (!TextUtils.isEmpty(parseObject.getString("rtmp266Url")) && parseObject.getString("rtmp266Url").contains("encoder_type=266")) {
                        this.c.selecte266ToPlay();
                        this.c.setVideoUrl(parseObject.getString("rtmp266Url"));
                        this.c.setVideoDefinition(ew0.m(MediaConstant.H266, str));
                        this.c.mSelectedUrlName = "266FlvUrl";
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            if (ja1.B() && a2 && o() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl) && qualityLiveItem.wholeH265ArtpUrl.contains("encoder_type=266")) {
                this.c.selecte266ToPlay();
                this.c.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H266, str));
                MediaPlayControlContext mediaPlayControlContext2 = this.c;
                mediaPlayControlContext2.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
                mediaPlayControlContext2.isRtcVVC = true;
                return true;
            } else if (o() && !TextUtils.isEmpty(qualityLiveItem.h265Url) && qualityLiveItem.h265Url.contains("encoder_type=266")) {
                this.c.selecte266ToPlay();
                this.c.setVideoUrl(qualityLiveItem.h265Url);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H266, str));
                this.c.mSelectedUrlName = "266FlvUrl";
                return true;
            } else if (!TextUtils.isEmpty(qualityLiveItem.videoUrl)) {
                this.c.setVideoUrl(qualityLiveItem.videoUrl);
                this.c.setVideoDefinition(ew0.m("h264", str));
                this.c.mSelectedUrlName = "videoUrl";
                return true;
            } else if (!TextUtils.isEmpty(qualityLiveItem.replayUrl)) {
                this.c.setVideoUrl(qualityLiveItem.replayUrl);
                this.c.setVideoDefinition(ew0.m("h264", str));
                this.c.mSelectedUrlName = "replayUrl";
                return true;
            } else if (a2 && z2 && z && this.c.useArtp() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl)) {
                this.c.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H265_ARTP, str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl;
                return false;
            } else if (z2 && z && !TextUtils.isEmpty(qualityLiveItem.wholeH265FlvUrl)) {
                this.c.setVideoUrl(qualityLiveItem.wholeH265FlvUrl);
                this.c.setVideoDefinition(ew0.m("h265", str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl;
                return true;
            } else if (z2 && !z && !TextUtils.isEmpty(qualityLiveItem.h265Url) && this.c.useTransH265() && !qualityLiveItem.h265Url.contains("encoder_type=266")) {
                this.c.setVideoUrl(qualityLiveItem.h265Url);
                this.c.setVideoDefinition(ew0.m("h265", str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_H265URL;
                return true;
            } else if (a2 && this.c.useMiniBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.liveUrlMiniBfrtc)) {
                this.c.setVideoUrl(qualityLiveItem.liveUrlMiniBfrtc);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_MINI_BFRTC, str));
                this.c.mSelectedUrlName = MediaConstant.MINI_BFRTC_URL_NAME;
                return true;
            } else if (a2 && this.c.useRtcLive() && !z && !TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
                MediaPlayControlContext mediaPlayControlContext3 = this.c;
                mediaPlayControlContext3.setVideoUrl(qualityLiveItem.rtcLiveUrl + "&grtn_fix_ts_reset=off");
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_RTCLIVE, str));
                MediaPlayControlContext mediaPlayControlContext4 = this.c;
                mediaPlayControlContext4.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
                mediaPlayControlContext4.isRtcVVC = false;
                return true;
            } else if (a2 && this.c.useBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                this.c.setVideoUrl(qualityLiveItem.bfrtcUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_BFRTC, str));
                this.c.mSelectedUrlName = MediaConstant.BFRTC_URL_NAME;
                return true;
            } else if (a2 && this.c.useArtp() && !z && !TextUtils.isEmpty(qualityLiveItem.artpUrl)) {
                this.c.setVideoUrl(qualityLiveItem.artpUrl);
                this.c.setVideoDefinition(ew0.m(MediaConstant.H264_ARTP, str));
                this.c.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_ARTPURL;
                return true;
            } else if (TextUtils.isEmpty(qualityLiveItem.flvUrl)) {
                return false;
            } else {
                this.c.setVideoUrl(qualityLiveItem.flvUrl);
                this.c.setVideoDefinition(ew0.m("h264", str));
                MediaPlayControlContext mediaPlayControlContext5 = this.c;
                mediaPlayControlContext5.mSelectedUrlName = yj4.PARAM_MEDIA_INFO_FLVURL;
                if (!mediaPlayControlContext5.useRtcLive()) {
                    this.c.mSelectFlvUrlReason = 2;
                } else if (z) {
                    this.c.mSelectFlvUrlReason = 3;
                } else if (TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
                    this.c.mSelectFlvUrlReason = 4;
                }
                if (!a2) {
                    MediaPlayControlContext mediaPlayControlContext6 = this.c;
                    z3 = true;
                    mediaPlayControlContext6.mDegradeToFlvByArtoSoNoReady = true;
                    mediaPlayControlContext6.mSelectFlvUrlReason = 9;
                } else {
                    z3 = true;
                }
                this.c.isRtcVVC = false;
                return z3;
            }
        } else if ((!"蓝光".equals(qualityLiveItem.newDefinition) && !MediaConstant.DEFINITION_MD.equals(qualityLiveItem.newName)) || !a2 || !this.c.useRtcLive() || z || TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || ew0.n("transcode", qualityLiveItem.rtcLiveUrl)) {
            return false;
        } else {
            MediaPlayControlContext mediaPlayControlContext7 = this.c;
            mediaPlayControlContext7.setVideoUrl(qualityLiveItem.rtcLiveUrl + "&grtn_fix_ts_reset=off");
            this.c.setVideoDefinition(ew0.m(MediaConstant.H264_RTCLIVE, str));
            this.c.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
            return true;
        }
    }

    public final String D(boolean z, boolean z2, Map<String, Integer> map, double d) {
        String str;
        boolean z3;
        boolean z4 = z;
        boolean z5 = z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d20147c", new Object[]{this, new Boolean(z4), new Boolean(z5), map, new Double(d)});
        }
        double E = E() * d;
        this.F = E;
        AVSDKLog.e(this.a0, "getSelectedDefinitionByBitratePolicy bitRateMap=" + map.toString());
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = MediaConstant.DEFINITION_UD_H266_FULL;
            if (!hasNext) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            if (MediaConstant.DEFINITION_UD_H265.equals(next.getKey()) || MediaConstant.DEFINITION_UD_H265_FULL.equals(next.getKey())) {
                this.M = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_UD_H265_HDR.equals(next.getKey())) {
                this.N = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_UD_H266.equals(next.getKey()) || str.equals(next.getKey())) {
                this.R = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_HD_H265.equals(next.getKey()) || MediaConstant.DEFINITION_HD_H265_FULL.equals(next.getKey())) {
                this.O = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_HD.equals(next.getKey()) || MediaConstant.DEFINITION_HD_H264_FULL.equals(next.getKey())) {
                this.Q = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_HD_H266.equals(next.getKey()) || MediaConstant.DEFINITION_HD_H266_FULL.equals(next.getKey())) {
                this.S = next.getValue().intValue();
            } else if (MediaConstant.DEFINITION_HD_H265_HDR.equals(next.getKey())) {
                this.P = next.getValue().intValue();
            }
        }
        if (!z4 || (!map.containsKey(MediaConstant.DEFINITION_UD_H266) && !map.containsKey(str))) {
            str = "";
        } else {
            this.c.selecte266ToPlay();
            if (!this.Z) {
                str = MediaConstant.DEFINITION_UD_H266;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        double d2 = vu3.b.GEO_NOT_SUPPORT;
        if (isEmpty) {
            Iterator<Map.Entry<String, Integer>> it2 = map.entrySet().iterator();
            double d3 = Double.MAX_VALUE;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next2 = it2.next();
                if ((z4 || !next2.getKey().contains("266")) && (z5 || !next2.getKey().contains("hdr"))) {
                    double intValue = E - next2.getValue().intValue();
                    int i = (intValue > d2 ? 1 : (intValue == d2 ? 0 : -1));
                    if (i >= 0 && next2.getKey() != null && next2.getKey().contains(MediaConstant.DEFINITION_UD)) {
                        str = next2.getKey();
                        break;
                    }
                    if (d3 > intValue && i >= 0 && next2.getKey() != null && next2.getKey().contains("265")) {
                        d3 = intValue;
                        str = next2.getKey();
                    }
                    d2 = vu3.b.GEO_NOT_SUPPORT;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            double d4 = Double.MAX_VALUE;
            boolean z6 = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (z4 || !entry.getKey().contains("266")) {
                    if (z5 || !entry.getKey().contains("hdr")) {
                        double intValue2 = entry.getValue().intValue();
                        if (intValue2 >= d4 || intValue2 <= vu3.b.GEO_NOT_SUPPORT || TextUtils.isEmpty(entry.getKey()) || entry.getKey() == "null") {
                            AVSDKLog.e(this.a0, "getSelectedDefinitionByBitratePolicy failed with currBitRate=" + intValue2 + ",minBitRate=" + d4 + ",entry.getKey()=" + entry.getKey());
                        } else {
                            str = entry.getKey();
                            d4 = intValue2;
                            z6 = true;
                        }
                        z4 = z;
                        z5 = z2;
                    }
                }
            }
            if (!TextUtils.isEmpty(str) && !str.contains(MediaConstant.DEFINITION_UD)) {
                this.L = 1;
            }
            z3 = z6;
        } else {
            if (!str.contains(MediaConstant.DEFINITION_UD)) {
                if (Double.compare(this.M, -1.0d) == 0) {
                    this.L = 3;
                } else {
                    int i2 = this.M;
                    if (i2 < this.O) {
                        this.L = 2;
                    } else if (E < i2) {
                        this.L = 0;
                        z3 = false;
                    }
                }
            }
            z3 = false;
        }
        AVSDKLog.e(this.a0, "getSelectedDefinitionByBitratePolicy speedEst=" + E + ",selectedDefinition=" + str + ",selectWithLowNetspeed=" + z3);
        return str;
    }

    public final void l0(ca5 ca5Var, MediaPlayControlContext mediaPlayControlContext, Map<String, ba5> map, Map<String, qs2> map2, boolean z, int i) {
        String str;
        String str2;
        int i2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54992a0", new Object[]{this, ca5Var, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
            return;
        }
        AVSDKLog.e(this.a0, "enter setVideoUrlByNewNetPolicy ");
        if (map == null || map.size() == 0 || mediaPlayControlContext == null) {
            if (mediaPlayControlContext != null) {
                AVSDKLog.e(this.a0, "pickTBVideoUrl.setVideoUrlByNewNetPolicy##VideoDefinitionMap empty");
            }
            this.D = 0;
            return;
        }
        boolean p = p();
        feh fehVar = this.a0;
        AVSDKLog.e(fehVar, "setVideoUrlByNewNetPolicy canSelectVVC is " + p);
        if (TextUtils.isEmpty(this.c.mVideoId) || !pmm.b().c(this.c.mVideoId)) {
            str2 = tfb.MODULE_SDK_PAGE;
            str = "not select vvc by canSelectVVC is ";
        } else {
            String str3 = this.c.mVideoId;
            Map<String, String> a2 = pmm.b().a(str3);
            this.I = a2.get("videoDefinition");
            boolean parseBoolean = Boolean.parseBoolean(a2.get("videoIsHDR"));
            boolean z3 = !parseBoolean || n();
            if (this.c.mForceHDR) {
                z3 = true;
            }
            if (TextUtils.isEmpty(a2.get("url")) || !a2.get("url").contains("266") || p) {
                z2 = true;
            } else {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "not select vvc by canSelectVVC is " + p);
                z2 = false;
            }
            feh fehVar2 = this.a0;
            str2 = tfb.MODULE_SDK_PAGE;
            str = "not select vvc by canSelectVVC is ";
            AVSDKLog.e(fehVar2, "HDR setVideoUrlByNewNetPolicy PreDownloadCache videoID " + str3 + " video_definition " + this.I + " videoIsHDR " + parseBoolean + " enableUsePre " + z3 + ", enableUsePreDownloadByVVC is" + z2);
            if (z3 && z2) {
                String str4 = a2.get(VideoControllerManager.KEY_CACHEKEY);
                String str5 = a2.get("url");
                if (this.c.getEnableCacheLengthNew()) {
                    this.V = ja1.x(mediaPlayControlContext.mContext, str4, str5);
                } else {
                    this.V = ja1.w(mediaPlayControlContext.mContext, str4, str5);
                }
                if (!TextUtils.isEmpty(str4) && ca5Var.g() != null) {
                    String str6 = ca5Var.g().get(str4);
                    if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, str5)) {
                        mediaPlayControlContext.setVideoUrl(str6);
                        feh fehVar3 = this.a0;
                        AVSDKLog.e(fehVar3, "setVideoUrlByNewNetPolicy: use new url=" + mediaPlayControlContext.getVideoUrl() + " insteadOf cacheUrl=" + a2.get("url") + "when getCache.");
                    }
                }
                if (TextUtils.isEmpty(mediaPlayControlContext.getVideoUrl())) {
                    mediaPlayControlContext.setVideoUrl(str5);
                    feh fehVar4 = this.a0;
                    AVSDKLog.e(fehVar4, "setVideoUrlByNewNetPolicy: getUrl From New MediaInfo failed, set url in cache, url=" + mediaPlayControlContext.getVideoUrl());
                }
                mediaPlayControlContext.setVideoDefinition(a2.get("videoDefinition"));
                mediaPlayControlContext.setCacheKey(a2.get(VideoControllerManager.KEY_CACHEKEY));
                mediaPlayControlContext.setCurrentBitRate(Integer.parseInt(a2.get(VideoControllerManager.KEY_BITRATE)));
                mediaPlayControlContext.setVideoLength(Integer.parseInt(a2.get(pg1.ATOM_length)));
                mediaPlayControlContext.setVideoIsHDR(Boolean.parseBoolean(a2.get("videoIsHDR")));
                feh fehVar5 = this.a0;
                AVSDKLog.e(fehVar5, "HLG setVideoUrlByNewNetPolicy hit PreDownloadCache videoIsHDR " + a2.get("videoIsHDR"));
                this.K = a2.get("selectReason");
                this.D = 1;
                this.J = a2.get("bitRateMap");
                this.F = Double.valueOf(a2.get("calNetSpeed")).doubleValue();
                this.G = Double.valueOf(a2.get("calNetSpeedByRobust")).doubleValue();
                this.E = Integer.parseInt(a2.get("calNetSpeedReason"));
                this.L = Integer.parseInt(a2.get("defDegradeReason"));
                this.M = Integer.parseInt(a2.get("ud265BitRate"));
                this.O = Integer.parseInt(a2.get("hd265BitRate"));
                this.R = Integer.parseInt(a2.get("ud266BitRate"));
                this.S = Integer.parseInt(a2.get("hd266BitRate"));
                this.Q = Integer.parseInt(a2.get("hd264BitRate"));
                feh fehVar6 = this.a0;
                AVSDKLog.e(fehVar6, "HDR setVideoUrlByNewNetPolicy hit PreDownloadCache videoID " + str3 + " videoDefiniton " + a2.get("videoDefinition") + " videovideoIsHDR and bitrate " + a2.get("videoIsHDR") + a2.get(VideoControllerManager.KEY_BITRATE));
                if (ew0.s(a2.get("hasChooseS266"))) {
                    this.c.selecte266ToPlay();
                }
                mediaPlayControlContext.mSelectReasonForPreDownload = 1;
                return;
            }
        }
        if (!(ca5Var == null || ca5Var.g() == null)) {
            for (Map.Entry<String, String> entry : ca5Var.g().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (ca5Var.f() == null || TextUtils.isEmpty(ca5Var.f().get(key)) || !ca5Var.f().get(key).contains("hdr") || n()) {
                    if (!value.contains("266") || p) {
                        if (this.c.getEnableCacheLengthNew()) {
                            this.V = ja1.x(mediaPlayControlContext.mContext, key, value);
                        } else {
                            this.V = ja1.w(mediaPlayControlContext.mContext, key, value);
                        }
                        feh fehVar7 = this.a0;
                        AVSDKLog.e(fehVar7, "setVideoUrlByNewNetPolicy: mCacheLengthAtSelect=" + this.V + ", ApplicationUtils.mMinLengthToUseCache=0");
                        if (this.V > 0) {
                            mediaPlayControlContext.setVideoUrl(value);
                            mediaPlayControlContext.setCacheKey(key);
                            if (ca5Var.f() != null) {
                                String str7 = ca5Var.f().get(key);
                                if (!TextUtils.isEmpty(str7)) {
                                    mediaPlayControlContext.setVideoDefinition(str7);
                                    mediaPlayControlContext.setVideoIsHDR(str7.contains("hdr"));
                                    ba5 ba5Var = map.get(str7);
                                    if (ba5Var != null && !TextUtils.isEmpty(ba5Var.i())) {
                                        mediaPlayControlContext.setCurrentBitRate(ba5Var.g());
                                        if (this.c.getEnableRealLength()) {
                                            mediaPlayControlContext.setVideoLength(ba5Var.f());
                                        } else {
                                            mediaPlayControlContext.setVideoLength(ba5Var.h());
                                        }
                                        this.D = 11;
                                        mediaPlayControlContext.mSelectReasonForPreDownload = 11;
                                        feh fehVar8 = this.a0;
                                        AVSDKLog.e(fehVar8, "HDR setVideoUrlByNewNetPolicy hit localCache videoId " + ca5Var.r() + "video_definition=" + str7 + " bitrate " + ba5Var.g() + " videoIsHDR " + str7.contains("hdr"));
                                        return;
                                    }
                                    str = str;
                                    str2 = str2;
                                }
                            }
                        }
                        str = str;
                        str2 = str2;
                    } else {
                        AVSDKLog.e(str2, str + p);
                    }
                }
            }
        }
        if (!ja1.e0() || ja1.k0() || ja1.q) {
            if (!ja1.e0()) {
                mediaPlayControlContext.mSelectReasonForPreDownload = 10;
                this.D = 10;
            } else if (ja1.k0()) {
                mediaPlayControlContext.mSelectReasonForPreDownload = 3;
                this.D = 3;
            } else if (ja1.q) {
                mediaPlayControlContext.mSelectReasonForPreDownload = 9;
                this.D = 9;
            }
            V(mediaPlayControlContext, map, false, i);
            y(mediaPlayControlContext, map2);
            return;
        }
        boolean n = n();
        if (ca5Var.p() != null) {
            i2 = 7;
            this.H = D(p, n, ca5Var.p(), this.c.mBetaForVodSelect);
            String obj = ca5Var.p().toString();
            this.J = obj;
            mediaPlayControlContext.mBitRateMapStr = obj;
            mediaPlayControlContext.mNetSpeedForPreDownload = this.F;
            mediaPlayControlContext.mNetSpeedByRobustAtPreDL = this.G;
            mediaPlayControlContext.mNetSpeedCalReasonForPreDL = this.E;
            mediaPlayControlContext.mDefDegradeReason = this.L;
            mediaPlayControlContext.mUD265BitRate = this.M;
            mediaPlayControlContext.mUD265HDRBitrate = this.N;
            mediaPlayControlContext.mHD265BitRate = this.O;
            mediaPlayControlContext.mHD265HDRBitRate = this.P;
            mediaPlayControlContext.mUD266BitRate = this.R;
            mediaPlayControlContext.mHD266BitRate = this.S;
            mediaPlayControlContext.mHD264BitRate = this.Q;
        } else {
            i2 = 7;
        }
        ArrayList arrayList = new ArrayList();
        mediaPlayControlContext.mSelectReasonForPreDownload = i2;
        this.D = i2;
        arrayList.add(this.H);
        boolean S = S(mediaPlayControlContext, map, arrayList);
        y(mediaPlayControlContext, map2);
        if (S) {
            AVSDKLog.e(this.a0, "setDefinitionPriorityAdapterUrl success and return.");
            if (!mediaPlayControlContext.getVideoDefinition().contains("266")) {
                this.c.unselectS266OfPlay();
            }
            V(mediaPlayControlContext, map, true, i);
            return;
        }
        if (z) {
            Y(mediaPlayControlContext, map, i);
            y(mediaPlayControlContext, map2);
            if (mediaPlayControlContext.isH265()) {
                mediaPlayControlContext.mSelectReasonForPreDownload = 5;
                this.D = 5;
                V(mediaPlayControlContext, map, true, i);
                return;
            }
        }
        V(mediaPlayControlContext, map, false, i);
        mediaPlayControlContext.mSelectReasonForPreDownload = 6;
        this.D = 6;
        y(mediaPlayControlContext, map2);
    }
}
