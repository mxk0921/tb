package tb;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z2m extends kd7<a3m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public final DetailImageView i;
    public int j;

    static {
        t2o.a(912262388);
    }

    public z2m(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        DetailImageView detailImageView = new DetailImageView(context);
        this.i = detailImageView;
        detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        linearLayout.addView(detailImageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
    }

    public static /* synthetic */ Object ipc$super(z2m z2mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/PictureJumperViewHolder");
    }

    /* renamed from: w */
    public void h(a3m a3mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6376f5", new Object[]{this, a3mVar});
            return;
        }
        z(a3mVar);
        String str = a3mVar.k;
        hme m = new hme.a().p(R.drawable.tt_detail_img_load_fail).t(this.i.getScaleType()).m();
        DetailImageView detailImageView = this.i;
        int i = this.j;
        n(detailImageView, str, new koe(i, i), null, m);
    }

    /* renamed from: x */
    public View j(a3m a3mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("102bc669", new Object[]{this, a3mVar});
        }
        return this.h;
    }

    /* renamed from: y */
    public boolean m(a3m a3mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed07dd79", new Object[]{this, a3mVar})).booleanValue();
        }
        if (a3mVar.k == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tb.a3m r6) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.z2m.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "6e5c153a"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            android.content.Context r1 = r5.f22590a
            int r1 = tb.mr7.f(r1)
            java.lang.String r2 = r6.m
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = r6.m     // Catch: Exception -> 0x003e
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: Exception -> 0x003e
            float r3 = (float) r1     // Catch: Exception -> 0x003e
            float r3 = r3 * r2
            int r3 = (int) r3     // Catch: Exception -> 0x003e
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 / r2
            float r2 = r2 - r4
            r4 = 1077936128(0x40400000, float:3.0)
            int r4 = tb.mr7.a(r4)     // Catch: Exception -> 0x003e
            float r4 = (float) r4
            float r2 = r2 * r4
            int r2 = (int) r2
            int r3 = r3 - r2
            goto L_0x0040
        L_0x003e:
        L_0x003f:
            r3 = 0
        L_0x0040:
            java.lang.String r2 = r6.l
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0054
            java.lang.String r6 = r6.l     // Catch: Exception -> 0x0053
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: Exception -> 0x0053
            float r0 = (float) r1
            float r0 = r0 * r6
            int r0 = (int) r0
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            if (r3 > 0) goto L_0x0057
            r3 = r1
        L_0x0057:
            if (r0 > 0) goto L_0x005d
            int r1 = r1 * 19
            int r0 = r1 / 40
        L_0x005d:
            com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView r6 = r5.i
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r6.width = r3
            r6.height = r0
            r5.j = r3
            com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView r0 = r5.i
            r0.setLayoutParams(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z2m.z(tb.a3m):void");
    }
}
