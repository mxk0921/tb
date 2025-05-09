package tb;

import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.RateFeedsWeexFragment;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.vivid.utils.WeexUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class egn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18564a = "RateFeedsManger";
    public ahd b;
    public boolean c;

    public Fragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        if (this.b == null) {
            this.b = c(this.c);
        }
        ahd ahdVar = this.b;
        ckf.d(ahdVar);
        return ahdVar.getFragment();
    }

    public int b() {
        long y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fadcd4c0", new Object[]{this})).intValue();
        }
        if (WeexUtils.INSTANCE.e()) {
            y = n9l.INSTANCE.z();
        } else {
            y = n9l.INSTANCE.y();
        }
        return (int) y;
    }

    public final ahd c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ahd) ipChange.ipc$dispatch("a5cd4a4a", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return new RateFeedsWeexFragment();
        }
        return new RateFeedsFragment();
    }

    public void d(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10984139", new Object[]{this, num, num2});
            return;
        }
        ahd ahdVar = this.b;
        if (ahdVar != null) {
            ahdVar.b2(num, num2);
        }
    }

    public void e(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e42072", new Object[]{this, num, num2});
            return;
        }
        ahd ahdVar = this.b;
        if (ahdVar != null) {
            ahdVar.F0(num, num2);
        }
    }

    public void f(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6deefa", new Object[]{this, lnmVar});
            return;
        }
        ckf.g(lnmVar, "preRenderContext");
        ahd ahdVar = this.b;
        if (ahdVar != null) {
            ahdVar.a0(lnmVar);
        }
    }

    public void g(RateFeedsFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2def2aab", new Object[]{this, bVar});
            return;
        }
        ahd ahdVar = this.b;
        if (ahdVar != null) {
            ahdVar.P1(bVar);
        }
    }

    public void j(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd092ef1", new Object[]{this, num});
            return;
        }
        ahd ahdVar = this.b;
        if (ahdVar != null) {
            ahdVar.K(num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(com.alibaba.fastjson.JSONObject r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.egn.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "7ce22d19"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r9
            r4[r0] = r10
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.lang.String r2 = "Page_DetailComments2"
            java.lang.String r3 = "Use_New_RateModel"
            tb.uhn.a(r2, r3)
            r2 = 0
            if (r10 == 0) goto L_0x0026
            java.lang.String r3 = "exParams"
            com.alibaba.fastjson.JSONObject r3 = r10.getJSONObject(r3)
            goto L_0x0027
        L_0x0026:
            r3 = r2
        L_0x0027:
            java.lang.String r4 = "openMode"
            java.lang.String r5 = "default"
            java.lang.String r3 = tb.qrf.m(r3, r4, r5)
            java.lang.String r4 = "pop_multi_tab"
            boolean r3 = tb.ckf.b(r3, r4)
            if (r3 != 0) goto L_0x0041
            com.taobao.detail.rate.vivid.utils.WeexUtils r3 = com.taobao.detail.rate.vivid.utils.WeexUtils.INSTANCE
            boolean r3 = r3.e()
            if (r3 != 0) goto L_0x0052
        L_0x0041:
            if (r10 == 0) goto L_0x004a
            java.lang.String r2 = "invokeSource"
            java.lang.String r2 = r10.getString(r2)
        L_0x004a:
            java.lang.String r3 = "14"
            boolean r2 = tb.ckf.b(r2, r3)
            if (r2 == 0) goto L_0x0054
        L_0x0052:
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.lang.String r3 = r9.f18564a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "rate container use weex = "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            tb.odg.c(r3, r0)
            r9.c = r2
            tb.ahd r0 = r9.c(r2)
            r9.b = r0
            if (r0 == 0) goto L_0x007a
            r0.s0(r10)
        L_0x007a:
            if (r2 == 0) goto L_0x0087
            com.taobao.detail.rate.vivid.utils.WeexUtils r3 = com.taobao.detail.rate.vivid.utils.WeexUtils.INSTANCE
            tb.ahd r5 = r9.b
            r8 = 0
            r6 = 0
            r7 = 4
            r4 = r10
            com.taobao.detail.rate.vivid.utils.WeexUtils.d(r3, r4, r5, r6, r7, r8)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.egn.h(com.alibaba.fastjson.JSONObject):void");
    }

    public void i(RateInfo rateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9ccb2", new Object[]{this, rateInfo});
            return;
        }
        uhn.a("Page_DetailComments2", "Use_Old_RateModel");
        boolean z = (!ckf.b(rateInfo != null ? rateInfo.openMode : null, dhn.POP_MULTI_TAB) && WeexUtils.INSTANCE.e()) || (rateInfo != null && rateInfo.getInvokeSource() == Integer.parseInt("14"));
        String str = this.f18564a;
        odg.c(str, "rate container use weex = " + z);
        this.c = z;
        ahd c = c(z);
        this.b = c;
        if (c != null) {
            c.d1(rateInfo);
        }
        if (z) {
            WeexUtils.INSTANCE.c(rateInfo, this.b);
        }
    }
}
