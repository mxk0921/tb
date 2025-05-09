package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.DecorationProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rpa implements k83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27529a;
    public int b;

    static {
        t2o.a(815792843);
        t2o.a(815792841);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    @Override // tb.k83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean r7, com.taobao.android.searchbaseframe.util.ListStyle r8, int r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rpa.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0020
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2 = 0
            r9[r2] = r6
            r2 = 1
            r9[r2] = r7
            r7 = 2
            r9[r7] = r8
            r7 = 3
            r9[r7] = r1
            java.lang.String r7 = "e3764cc1"
            r0.ipc$dispatch(r7, r9)
            return
        L_0x0020:
            java.lang.String r9 = "cellBean"
            tb.ckf.g(r7, r9)
            java.lang.String r9 = "style"
            tb.ckf.g(r8, r9)
            com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean r7 = (com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean) r7
            com.taobao.android.searchbaseframe.util.ListStyle r9 = com.taobao.android.searchbaseframe.util.ListStyle.LIST
            java.lang.String r0 = "pic_path"
            if (r8 != r9) goto L_0x0042
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r7 = r7.mMuiseBean
            com.alibaba.fastjson.JSONObject r7 = r7.model
            java.lang.String r7 = r7.getString(r0)
            int r8 = r6.f27529a
        L_0x003e:
            r1 = r7
            r2 = r8
            r3 = r2
            goto L_0x0082
        L_0x0042:
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r7 = r7.mMuiseBean
            com.alibaba.fastjson.JSONObject r7 = r7.model
            java.lang.String r8 = "model"
            tb.ckf.f(r7, r8)
            java.lang.String r8 = "uprightImgAspectRatio"
            java.lang.String r8 = r7.getString(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0061
            tb.ckf.d(r8)     // Catch: all -> 0x0061
            double r8 = java.lang.Double.parseDouble(r8)     // Catch: all -> 0x0061
            goto L_0x0066
        L_0x0061:
            r8 = 4604180019048437077(0x3fe5555555555555, double:0.6666666666666666)
        L_0x0066:
            java.lang.String r1 = "uprightImg"
            java.lang.String r1 = r7.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x007b
            int r7 = r6.b
            double r2 = (double) r7
            double r2 = r2 / r8
            int r8 = (int) r2
            r2 = r7
            r3 = r8
            goto L_0x0082
        L_0x007b:
            java.lang.String r7 = r7.getString(r0)
            int r8 = r6.b
            goto L_0x003e
        L_0x0082:
            tb.klo$a r0 = tb.klo.Companion
            r4 = 0
            r5 = 0
            r0.c(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rpa.a(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean, com.taobao.android.searchbaseframe.util.ListStyle, int):void");
    }

    @Override // tb.k83
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f750853", new Object[]{this, new Integer(i)});
            return;
        }
        this.f27529a = (int) fxh.e("280rpx");
        this.b = DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, i);
    }
}
