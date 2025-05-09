package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22261a;
    public boolean b;
    public VideoInfo c;
    public Set<String> d;
    public ux9 e;
    public TBLiveDataModel f;

    static {
        t2o.a(806356076);
    }

    public jwg(txb txbVar) {
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66facd8d", new Object[]{this});
        }
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0f2062", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.f;
        if (tBLiveDataModel != null && !TextUtils.isEmpty(tBLiveDataModel.mRawData)) {
            return this.f.mRawData;
        }
        if (d() == null || v2s.o().l() == null || !(v2s.o().l().b() instanceof TBLiveDataModel)) {
            return null;
        }
        return ((TBLiveDataModel) v2s.o().l().b()).mRawData;
    }

    public VideoInfo d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        VideoInfo videoInfo = this.c;
        if (videoInfo != null) {
            return videoInfo;
        }
        if (v2s.o().l() == null || !(v2s.o().l().b() instanceof TBLiveDataModel)) {
            return null;
        }
        return ((TBLiveDataModel) v2s.o().l().b()).mVideoInfo;
    }

    public boolean e() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d186c8d8", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.e;
        if (ux9Var == null || ux9Var.j() == null || this.e.j().k() == null) {
            return false;
        }
        w9c k = this.e.j().k();
        String L = k.q().L();
        String n = k.X0().n();
        if (!qvs.G() || (!"1".equals(k.X0().f()) && !yqq.h(k.X0().f()))) {
            z = false;
        } else {
            z = true;
        }
        if (k.X0().j() == null && k.X0().a() == null && n == null && !a().contains(L) && !z) {
            return false;
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a12679", new Object[]{this})).booleanValue();
        }
        return this.f22261a;
    }

    public boolean g(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764b7912", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo == null) {
            videoInfo = d();
        }
        if (videoInfo == null || (videoInfo.newRoomType & 256) != 256) {
            return false;
        }
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f43477f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("950655d9", new Object[]{this})).booleanValue();
        }
        VideoInfo d = d();
        if (d == null) {
            return false;
        }
        if ("1".equals(d.roomStatus) || "2".equals(d.roomStatus)) {
            return true;
        }
        return false;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453d7a1d", new Object[]{this, str});
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12581dba", new Object[]{this, new Boolean(z)});
        }
    }

    public void l(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        } else {
            this.e = ux9Var;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca772c7", new Object[]{this, new Boolean(z)});
        } else {
            this.f22261a = z;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a1ba81", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void o(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226f66", new Object[]{this, tBLiveDataModel, videoInfo});
            return;
        }
        this.f = tBLiveDataModel;
        this.c = videoInfo;
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ba5969ae", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new HashSet();
            for (String str : v2s.o().p().b("tblive", "adLivesourceList", "ad_hudong11;ad_brandzone;ad_tanx;ad_tblive_task;ad_timemove;livesource=p4p-kgb").split(";")) {
                this.d.add(str);
            }
        }
        return this.d;
    }
}
