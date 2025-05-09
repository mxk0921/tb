package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bwa extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String ITEM_HIDE_DATE = "ItemHideDate";
    public static final Map<String, Object> j = new HashMap();
    public static boolean k = false;

    static {
        t2o.a(155189311);
    }

    public static /* synthetic */ Object ipc$super(bwa bwaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/HideItemrSubscriber");
    }

    public static Object q(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d532962", new Object[]{context, iDMComponent});
        }
        if (context == null || iDMComponent == null) {
            return "";
        }
        return ((HashMap) j).get(iDMComponent.getKey());
    }

    public static void r(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ae63b2", new Object[]{iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getData() != null) {
            iDMComponent.getData().put("status", "hidden");
        }
    }

    public static void s(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77197425", new Object[]{context, iDMComponent});
        } else if (context != null && iDMComponent != null && !p(context, iDMComponent)) {
            r(iDMComponent);
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        r(this.e);
        this.c.e().D();
        t(this.b, this.e);
    }

    public final void t(Context context, IDMComponent iDMComponent) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7c315c", new Object[]{this, context, iDMComponent});
        } else if (context != null && iDMComponent != null) {
            try {
                j2 = Long.parseLong(g().getFields().getString("hideSeconds"));
            } catch (Exception unused) {
                j2 = 0;
            }
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(new Date().getTime() + (j2 * 1000)));
            context.getSharedPreferences("HideItem", 0).edit().putString(iDMComponent.getKey(), format).apply();
            ((HashMap) j).put(iDMComponent.getKey(), format);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    public static boolean p(android.content.Context r5, com.taobao.android.ultron.common.model.IDMComponent r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bwa.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "7ee28be2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            boolean r2 = tb.bwa.k
            if (r2 != 0) goto L_0x0033
            tb.bwa.k = r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = tb.bwa.j
            java.lang.String r3 = "HideItem"
            android.content.SharedPreferences r3 = r5.getSharedPreferences(r3, r1)
            java.util.Map r3 = r3.getAll()
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.putAll(r3)
        L_0x0033:
            java.lang.Object r5 = q(r5, r6)
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0042
            goto L_0x0067
        L_0x0042:
            java.util.Date r6 = new java.util.Date     // Catch: ParseException -> 0x0067
            r6.<init>()     // Catch: ParseException -> 0x0067
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: ParseException -> 0x0067
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: ParseException -> 0x0067
            r2.<init>(r3, r4)     // Catch: ParseException -> 0x0067
            java.lang.String r5 = (java.lang.String) r5     // Catch: ParseException -> 0x0067
            java.util.Date r5 = r2.parse(r5)     // Catch: ParseException -> 0x0067
            long r2 = r6.getTime()     // Catch: ParseException -> 0x0067
            long r5 = r5.getTime()     // Catch: ParseException -> 0x0067
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bwa.p(android.content.Context, com.taobao.android.ultron.common.model.IDMComponent):boolean");
    }
}
