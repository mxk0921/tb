package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ln5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_ITEMINFO;

    /* renamed from: a  reason: collision with root package name */
    public Context f23435a;
    public DinamicXEngine b;

    static {
        t2o.a(912261749);
        long a2 = k06.a("itemInfo");
        DX_EVENT_ID = a2;
        DX_PARSER_ITEMINFO = a2;
    }

    public static /* synthetic */ Object ipc$super(ln5 ln5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserItemInfo");
    }

    public final float a(float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65e2aabf", new Object[]{this, new Float(f), str})).floatValue();
        }
        if ("viewNpWidth".equals(str)) {
            return pb6.C(this.f23435a, (int) f);
        }
        if (nj7.h()) {
            return pb6.A(this.b, this.f23435a, f);
        }
        return 375.0f;
    }

    public final String b(Object[] objArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6826234", new Object[]{this, objArr, context});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String c = c(context);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if (obj instanceof String) {
                return b5m.D().a(c, (String) obj);
            }
        }
        return b5m.D().a(c, (String) null);
    }

    public final String c(Context context) {
        ze7 q3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56aec523", new Object[]{this, context});
        }
        if (context == null || !(context instanceof TTDetailBaseActivity) || (q3 = ((TTDetailBaseActivity) context).q3()) == null) {
            return null;
        }
        return DataUtils.w((Item) q3.e().f(Item.class), "");
    }

    public final float d(float f, DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff995e63", new Object[]{this, new Float(f), dXRuntimeContext, str})).floatValue();
        }
        if (nj7.i(this.f23435a)) {
            int measuredWidth = dXRuntimeContext.L().getMeasuredWidth();
            if (measuredWidth == 0) {
                f = (f / 2.0f) - pb6.f(this.f23435a, 16.0f);
            } else {
                f = measuredWidth;
            }
        }
        return a(f, str);
    }

    public final float e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("998be2c9", new Object[]{this, new Float(f)})).floatValue();
        }
        if (!nj7.h()) {
            return 375.0f;
        }
        if (nj7.i(this.f23435a)) {
            return f / 2.0f;
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r4.equals("viewNpWidth") == false) goto L_0x0059;
     */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            r7 = this;
            java.lang.String r0 = "viewApWidth"
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.ln5.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001c
            java.lang.String r0 = "ccd8bd96"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r7
            r5[r2] = r8
            r5[r1] = r9
            java.lang.Object r8 = r4.ipc$dispatch(r0, r5)
            return r8
        L_0x001c:
            android.content.Context r4 = r9.h()
            r7.f23435a = r4
            com.taobao.android.dinamicx.DinamicXEngine r4 = r9.r()
            r7.b = r4
            if (r8 == 0) goto L_0x0032
            int r4 = r8.length
            if (r4 == 0) goto L_0x0032
            r4 = r8[r3]
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0033
        L_0x0032:
            r4 = r0
        L_0x0033:
            java.lang.String r5 = "collectSummary"
            boolean r5 = android.text.TextUtils.equals(r5, r4)
            if (r5 == 0) goto L_0x0047
            android.content.Context r9 = r7.f23435a
            java.lang.String r8 = r7.b(r8, r9)
            if (r8 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            java.lang.String r8 = ""
        L_0x0046:
            return r8
        L_0x0047:
            android.content.Context r8 = r7.f23435a
            int r8 = tb.pb6.s(r8)
            float r8 = (float) r8
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1132453283: goto L_0x006e;
                case -825982862: goto L_0x0065;
                case 2121630399: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            r1 = -1
            goto L_0x0079
        L_0x005b:
            java.lang.String r0 = "viewNpWidth"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x0059
        L_0x0065:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            r1 = 1
            goto L_0x0079
        L_0x006e:
            java.lang.String r0 = "splitApWidth"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x0059
        L_0x0078:
            r1 = 0
        L_0x0079:
            switch(r1) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                default: goto L_0x007c;
            }
        L_0x007c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r0 = " width : "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "DXDataParserItemInfo"
            tb.tgh.b(r9, r8)
            r8 = 0
            return r8
        L_0x0097:
            float r8 = r7.d(r8, r9, r4)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            return r8
        L_0x00a0:
            float r8 = r7.e(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ln5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
