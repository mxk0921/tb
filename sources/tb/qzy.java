package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321986);
    }

    public static void a(aqz aqzVar, vpz vpzVar, tpz tpzVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c5e348", new Object[]{aqzVar, vpzVar, tpzVar});
            return;
        }
        if (vpzVar.b == null) {
            vpzVar.e(true);
        }
        if (vpzVar.c == null) {
            vpzVar.d(i0z.b(aqzVar, i0z.DRESS_UP_V3_IMAGE_FADE_OUT_SPEED, 1.4f));
        }
        if (vpzVar.d == null) {
            vpzVar.c(i0z.b(aqzVar, i0z.DRESS_UP_V3_ROOT_FADE_IN_SPEED, 3.0f));
        }
        aqzVar.getClass();
        vpzVar.e = Integer.valueOf(tzy.c(aqzVar, aqzVar.d()));
        if (vpzVar.f == null) {
            if (tpzVar.c <= 0.0f || tpzVar.d <= 0.0f) {
                i = l0z.b(aqzVar.d()) - vpzVar.e.intValue();
            } else {
                i = (int) ((tpzVar.c / tpzVar.d) * l0z.c(aqzVar.d()));
            }
            vpzVar.f = Integer.valueOf(i);
        }
    }

    public static void b(aqz aqzVar, vpz vpzVar, tpz tpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c611a8f7", new Object[]{aqzVar, vpzVar, tpzVar});
            return;
        }
        String a2 = vpzVar.a();
        int hashCode = a2.hashCode();
        if (hashCode != -647792447) {
            if (hashCode == 610044960) {
                a2.equals("NewDetailPage");
            }
        } else if (a2.equals("DressUpPage") && !i0z.a(aqzVar, i0z.DRESS_UP_DOWNGRADE_BIZ_SETTING)) {
            c(aqzVar, vpzVar, tpzVar);
        }
    }

    public static void c(aqz aqzVar, vpz vpzVar, tpz tpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4372b5", new Object[]{aqzVar, vpzVar, tpzVar});
        } else if (!i0z.a(aqzVar, i0z.DRESS_UP_DOWNGRADE_WHITE_BG_TARGET_HEIGHT)) {
            a(aqzVar, vpzVar, tpzVar);
        }
    }
}
