package tb;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.performance.WMInstanceApm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static hog b;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f20780a = new JSONObject();

    static {
        t2o.a(708837411);
    }

    public static hog c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hog) ipChange.ipc$dispatch("9995c363", new Object[0]);
        }
        if (b == null) {
            synchronized (hog.class) {
                try {
                    if (b == null) {
                        b = new hog();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed7540d", new Object[]{this, str, str2});
        } else {
            this.f20780a.put(str, (Object) str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f20780a.clear();
        }
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3b5fa04", new Object[]{this});
        }
        return this.f20780a;
    }

    public void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
            return;
        }
        Intent intent = activity.getIntent();
        long longExtra = intent.getLongExtra("START_CLICK_TIME", 0L);
        if (longExtra != 0) {
            this.f20780a.put("BuyButtonClick", (Object) Long.valueOf(longExtra));
        }
        long longExtra2 = intent.getLongExtra("COUPON_FINISH", 0L);
        if (longExtra2 != 0) {
            this.f20780a.put("CouponEnd", (Object) Long.valueOf(longExtra2));
        }
        long longExtra3 = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        if (longExtra3 != 0) {
            this.f20780a.put(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_NAV_START, (Object) Long.valueOf(longExtra3));
        }
        long longExtra4 = intent.getLongExtra("NEW_BUY_ON_CREATE_TIME", 0L);
        if (longExtra4 != 0) {
            this.f20780a.put("OrderInit", (Object) Long.valueOf(longExtra4));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r8.equals(com.taobao.android.lightbuy.performance.LightBuyStage.WEEX_REQ_CALLBACK) == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.hog.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "eec45d9"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            long r3 = java.lang.System.currentTimeMillis()
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1568064630: goto L_0x0050;
                case -1566912924: goto L_0x0047;
                case -600527357: goto L_0x003c;
                case 945379533: goto L_0x0031;
                case 1082676878: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x005a
        L_0x0026:
            java.lang.String r0 = "WEEX_INIT"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r0 = 4
            goto L_0x005a
        L_0x0031:
            java.lang.String r0 = "WEEX_REQ_INVOKED"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r0 = 3
            goto L_0x005a
        L_0x003c:
            java.lang.String r0 = "MTOP_REQ_END"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            r0 = 2
            goto L_0x005a
        L_0x0047:
            java.lang.String r1 = "WEEX_REQ_CALLBACK"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x005a
            goto L_0x0024
        L_0x0050:
            java.lang.String r0 = "MTOP_REQ_START"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0059
            goto L_0x0024
        L_0x0059:
            r0 = 0
        L_0x005a:
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0082;
                case 2: goto L_0x0076;
                case 3: goto L_0x006a;
                case 4: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0099
        L_0x005e:
            com.alibaba.fastjson.JSONObject r8 = r7.f20780a
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "WeexInit"
            r8.put(r1, r0)
            goto L_0x0099
        L_0x006a:
            com.alibaba.fastjson.JSONObject r8 = r7.f20780a
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "WeexReqInvoked"
            r8.put(r1, r0)
            goto L_0x0099
        L_0x0076:
            com.alibaba.fastjson.JSONObject r8 = r7.f20780a
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "MTOPReqEnd"
            r8.put(r1, r0)
            goto L_0x0099
        L_0x0082:
            com.alibaba.fastjson.JSONObject r8 = r7.f20780a
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "WeexReqCallback"
            r8.put(r1, r0)
            goto L_0x0099
        L_0x008e:
            com.alibaba.fastjson.JSONObject r8 = r7.f20780a
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "MTOPReqStart"
            r8.put(r1, r0)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hog.f(java.lang.String):void");
    }
}
