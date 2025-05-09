package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.mmad.data.BaseMmAdModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ygm implements eld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571135);
        t2o.a(573571134);
    }

    public static void b(nwi nwiVar) {
        Activity a2;
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f7fdbb", new Object[]{nwiVar});
        } else if (nwiVar != null && nwiVar.d() != null && nwiVar.d().a() != null && TextUtils.equals(rr6.TYPE_POPVIEW, nwiVar.d().a().getDataType()) && (a2 = qq4.a(nwiVar)) != null && (intent = a2.getIntent()) != null) {
            intent.putExtra(ScheduleComposer.PARCEL_KEY_BOOT_IMAGE_AD, true);
        }
    }

    @Override // tb.eld
    public boolean a(nwi nwiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb21e5f9", new Object[]{this, nwiVar, new Integer(i)})).booleanValue();
        }
        jgh.a("PopRule", "PopRule verify start.");
        BaseMmAdModel a2 = nwiVar.d().a();
        u5v.b().d();
        if (!TextUtils.isEmpty(a2.animationType) && "1".equals(a2.animationType)) {
            if (rf9.c(a2.animationLottie) == null) {
                i4v.f(nwiVar);
                jgh.a("PopRule", "PopRule verify error, animationLottie not exist local.");
                m0j.d(nwiVar, "resource_not_ready", "animationLottie");
                return false;
            } else if ("commercialAdVideo".equals(a2.bizType) && rf9.c(a2.videoUrl) == null) {
                i4v.k(nwiVar);
                jgh.a("PopRule", "PopRule verify error, videoUrl not exist local.");
                return false;
            }
        }
        jgh.a("PopRule", "PopRule verify end. ret=true");
        return true;
    }
}
