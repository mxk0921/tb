package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fs0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;
    public String d;
    public String e;
    public drs n;
    public JSONObject o;
    public JSONObject p;
    public JSONObject q;

    /* renamed from: a  reason: collision with root package name */
    public String f19495a = null;
    public Boolean f = Boolean.FALSE;
    public String g = reu.TRANSITION_TYPE_FADE;
    public String h = null;
    public String i = null;
    public int j = -1;
    public String k = null;
    public int l = 0;
    public JSONObject m = null;

    static {
        t2o.a(1032847393);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f19495a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.i = null;
        this.l = 0;
        this.j = -1;
        this.k = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (android.text.TextUtils.isEmpty(r4.h) != false) goto L_0x0066;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fs0.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "c4a71793"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.lang.String r2 = r4.b     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            r1 = r1 ^ r2
            java.lang.String r2 = "picNoScroll"
            java.lang.String r3 = r4.b     // Catch: all -> 0x003c
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r4.f19495a     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = r4.h     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x003f
            goto L_0x003e
        L_0x003c:
            r0 = move-exception
            goto L_0x0062
        L_0x003e:
            r1 = 0
        L_0x003f:
            java.lang.String r2 = "gifAndScroll"
            java.lang.String r3 = r4.b     // Catch: all -> 0x003c
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = r4.f19495a     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = r4.i     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = r4.h     // Catch: all -> 0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0062:
            r0.printStackTrace()
        L_0x0065:
            r0 = r1
        L_0x0066:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isAlienLogo"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "tab3edlp"
            com.taobao.tao.log.TLog.loge(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fs0.b():boolean");
    }
}
