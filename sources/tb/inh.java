package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.DecorationProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class inh implements k83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21449a;
    public final int b = p1p.a(140.0f);

    static {
        t2o.a(815792845);
        t2o.a(815792841);
    }

    @Override // tb.k83
    public void a(BaseCellBean baseCellBean, ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3764cc1", new Object[]{this, baseCellBean, listStyle, new Integer(i)});
            return;
        }
        ckf.g(baseCellBean, "cellBean");
        ckf.g(listStyle, "style");
        MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
        if (listStyle == ListStyle.WATERFALL) {
            JSONObject jSONObject = muiseCellBean.mMuiseBean.model;
            ckf.f(jSONObject, "model");
            d(jSONObject, this.f21449a);
            return;
        }
        JSONObject jSONObject2 = muiseCellBean.mMuiseBean.model;
        ckf.f(jSONObject2, "model");
        c(jSONObject2, this.b);
    }

    @Override // tb.k83
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f750853", new Object[]{this, new Integer(i)});
        } else {
            this.f21449a = DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, i);
        }
    }

    public final void c(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb03247e", new Object[]{this, jSONObject, new Integer(i)});
        } else {
            klo.Companion.b(jSONObject.getString(mh1.PRD_PICURL), i, i, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.alibaba.fastjson.JSONObject r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.inh.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r8
            r0 = 1
            r10[r0] = r9
            r9 = 2
            r10[r9] = r2
            java.lang.String r9 = "ec1cd2c6"
            r1.ipc$dispatch(r9, r10)
            return
        L_0x001d:
            java.lang.String r1 = "uprightImgAspectRatio"
            java.lang.String r2 = r9.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0032
            tb.ckf.d(r2)     // Catch: all -> 0x0032
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: all -> 0x0032
            goto L_0x0037
        L_0x0032:
            r2 = 4604180019048437077(0x3fe5555555555555, double:0.6666666666666666)
        L_0x0037:
            java.lang.String r4 = "imageInfo"
            com.alibaba.fastjson.JSONArray r4 = r9.getJSONArray(r4)
            java.lang.String r5 = "pic_path"
            if (r4 == 0) goto L_0x0089
            int r6 = r4.size()
            if (r6 <= 0) goto L_0x0089
            com.alibaba.fastjson.JSONObject r4 = r4.getJSONObject(r0)
            java.lang.String r6 = "uprightImgImage"
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r1 = r4.getString(r1)
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 != 0) goto L_0x0066
            tb.ckf.d(r1)     // Catch: all -> 0x0065
            double r2 = java.lang.Double.parseDouble(r1)     // Catch: all -> 0x0065
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0074
            double r4 = (double) r10
            double r4 = r4 / r2
            long r1 = java.lang.Math.round(r4)
        L_0x0072:
            int r9 = (int) r1
            goto L_0x00a2
        L_0x0074:
            java.lang.String r1 = "imageUrl"
            java.lang.String r1 = r4.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0086
            java.lang.String r9 = r9.getString(r5)
            r6 = r9
            goto L_0x0087
        L_0x0086:
            r6 = r1
        L_0x0087:
            r9 = r10
            goto L_0x00a2
        L_0x0089:
            java.lang.String r1 = "uprightImg"
            java.lang.String r6 = r9.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x009d
            double r4 = (double) r10
            double r4 = r4 / r2
            long r1 = java.lang.Math.round(r4)
            goto L_0x0072
        L_0x009d:
            java.lang.String r6 = r9.getString(r5)
            goto L_0x0087
        L_0x00a2:
            tb.klo$a r1 = tb.klo.Companion
            r1.b(r6, r10, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.inh.d(com.alibaba.fastjson.JSONObject, int):void");
    }
}
