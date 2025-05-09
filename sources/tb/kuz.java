package tb;

import com.alibaba.wireless.aliprivacyext.recommendation.e;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kuz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final muz f22942a;

    public kuz(muz muzVar) {
        this.f22942a = muzVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f22942a.a();
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        muz muzVar = this.f22942a;
        if (muzVar != null) {
            e f = muzVar.f();
            if (!f.getRecommendSwitchBooleanStatus()) {
                d("x-recommend-content-close", "true");
            } else {
                c("x-recommend-content-close");
            }
            d("cro-privacy-recommend-switch", f.getStatus());
            TrackLog.trackQueryRecommendStatusLog(this.f22942a.d(), f.getStatus(), "MTopNew", null, null, System.currentTimeMillis() - j);
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, str);
        MtopSetting.removeParam(Mtop.Id.SSR, MtopParamType.HEADER, str);
    }

    public final synchronized void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, str, str2);
        MtopSetting.setParam(Mtop.Id.SSR, MtopParamType.HEADER, str, str2);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c("cro-privacy-recommend-switch");
        c("x-recommend-content-close");
        c("cro-privacy-recommend-switch-without-uid");
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f22942a.b(str);
        }
    }
}
