package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Random;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ujl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = ujl.class.getSimpleName();
    public static ujl e;

    /* renamed from: a  reason: collision with root package name */
    public final Random f29417a = new Random();
    public cpr b;
    public String c;

    static {
        t2o.a(779093476);
    }

    public static ujl d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ujl) ipChange.ipc$dispatch("7b262b7c", new Object[0]);
        }
        if (e == null) {
            e = new ujl();
        }
        return e;
    }

    public void a(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef6cf7", new Object[]{this, hbdVar});
            return;
        }
        cpr cprVar = this.b;
        if (cprVar != null) {
            cprVar.q(hbdVar);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d314cac8", new Object[]{this, str});
            return;
        }
        String str2 = d;
        cir.a(str2, "destroyPM init mPMID = " + this.c + " newPMID = " + str);
        if (str != null) {
            String str3 = this.c;
            if (str3 == null || str3.equals(str)) {
                cpr cprVar = this.b;
                if (cprVar != null) {
                    cprVar.z();
                    this.b.l0();
                    this.b = null;
                }
                this.c = null;
                cir.a(str2, "destroyPM stop mPMID = " + this.c + " newPMID = " + str);
            }
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc2064c", new Object[]{this});
        }
        return this.f29417a.nextInt(1000) + "_" + System.currentTimeMillis();
    }

    public cpr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpr) ipChange.ipc$dispatch("b11000e1", new Object[]{this});
        }
        return this.b;
    }

    public boolean f(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, LiveEmbedType liveEmbedType, ncc nccVar, boolean z5, cpr.b bVar) {
        boolean z6;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a32eb48", new Object[]{this, ux9Var, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4, new Boolean(z4), liveEmbedType, nccVar, new Boolean(z5), bVar})).booleanValue();
        }
        String str6 = d;
        cir.a(str6, "initLiveRoomPM init mPMID = " + this.c + " newPMID = " + str);
        cpr cprVar = this.b;
        if (cprVar != null) {
            cprVar.z();
            this.b.l0();
            cir.a(str6, "initLiveRoomPM destroyLastPM mPMID = " + this.c + " newPMID = " + str);
            z6 = true;
        } else {
            z6 = false;
        }
        this.c = str;
        if (z3) {
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            str5 = " newPMID = ";
            this.b = new cpr(1, videoInfo.topic, str4, z2, z, videoInfo.forceCommentsUseCdn, false, bVar);
        } else {
            str5 = " newPMID = ";
            up6.Y0(cxg.c(tBLiveDataModel.mVideoInfo), ux9Var);
            boolean z7 = !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl) || (tBLiveDataModel.mVideoInfo.fetchItemUseCdn && qvs.n0() && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl));
            VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
            this.b = new flr(1, str2, str4, str3, z2, z, videoInfo2.forceCommentsUseCdn, false, "1".equals(videoInfo2.roomStatus), z4, z7, bVar);
            igq.n().s("Page_TaobaoLiveWatch", "LiveRoomInit", igq.n().m());
        }
        if (tBLiveDataModel.mVideoInfo.isOfficialType()) {
            this.b.b0(true);
            this.b.e0(tBLiveDataModel.mVideoInfo.officialLiveInfo.encryptAnchorId);
            this.b.f0(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            this.b.g0(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveTopic);
        }
        this.b.h0(liveEmbedType);
        this.b.a0(nccVar);
        this.b.J(z5);
        this.b.d0(tBLiveDataModel.mVideoInfo.liveId);
        this.b.c0(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl);
        this.b.Z(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl);
        this.b.i0();
        this.b.y();
        cir.a(str6, "initLiveRoomPM start mPMID = " + this.c + str5 + str);
        return z6;
    }

    public boolean g(String str, String str2, boolean z, String str3, String str4, ncc nccVar, cpr.b bVar) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("907a3271", new Object[]{this, str, str2, new Boolean(z), str3, str4, nccVar, bVar})).booleanValue();
        }
        String str5 = d;
        cir.a(str5, "initPM init mPMID = " + this.c + " newPMID = " + str);
        cpr cprVar = this.b;
        if (cprVar != null) {
            cprVar.z();
            this.b = null;
            cir.a(str5, "initPM destroyLastPM mPMID = " + this.c + " newPMID = " + str);
        } else {
            z2 = false;
        }
        this.c = str;
        flr flrVar = new flr(1, str2, null, str3, false, true, false, false, z, false, false, bVar);
        this.b = flrVar;
        flrVar.d0(str4);
        this.b.a0(nccVar);
        this.b.i0();
        this.b.y();
        cir.a(str5, "initPM start mPMID = " + this.c + " newPMID = " + str);
        return z2;
    }
}
