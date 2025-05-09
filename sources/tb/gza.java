package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.Revision;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gza implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f20324a = Arrays.asList("getMiniAppRelation", "setNativeStorage", "getNativeStorage", "setNativeMemoryCache", "getNativeMemoryCache", "getHomeLocalValue");
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    static {
        t2o.a(729809368);
        t2o.a(729809365);
    }

    public final boolean c(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("755fcdf8", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        String c = Revision.b().c(Revision.MINI_APP_RELATION, "null");
        nsw nswVar = new nsw();
        nswVar.b(Revision.MINI_APP_RELATION, c);
        wVCallBackContext.success(nswVar);
        return true;
    }

    public final void d(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b6f5b0", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("result", "存储失败，bizName或者key为空");
        wVCallBackContext.error(nswVar);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "getMiniAppRelation")) {
            return c(wVCallBackContext);
        }
        if (TextUtils.equals(str, "getHomeLocalValue")) {
            return b(str2, wVCallBackContext);
        }
        return g(str, str2, wVCallBackContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r9.equals("getNativeMemoryCache") == false) goto L_0x0042;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.String r9, java.lang.String r10, android.taobao.windvane.jsbridge.WVCallBackContext r11) {
        /*
            r8 = this;
            java.lang.String r0 = "getNativeStorage"
            java.lang.String r1 = "setNativeStorage"
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            com.android.alibaba.ip.runtime.IpChange r6 = tb.gza.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0028
            java.lang.String r0 = "9ae6baa2"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r8
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.Object r9 = r6.ipc$dispatch(r0, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0028:
            boolean r10 = r8.a(r10, r11)
            if (r10 != 0) goto L_0x0032
            r8.d(r11)
            return r5
        L_0x0032:
            tb.nsw r10 = new tb.nsw
            r10.<init>()
            r9.hashCode()
            r6 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case -1495419614: goto L_0x0063;
                case 336023214: goto L_0x005a;
                case 1532215848: goto L_0x004e;
                case 2143139252: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            r2 = -1
            goto L_0x006b
        L_0x0044:
            java.lang.String r3 = "getNativeMemoryCache"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x006b
            goto L_0x0042
        L_0x004e:
            java.lang.String r2 = "setNativeMemoryCache"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0058
            goto L_0x0042
        L_0x0058:
            r2 = 2
            goto L_0x006b
        L_0x005a:
            boolean r2 = r9.equals(r0)
            if (r2 != 0) goto L_0x0061
            goto L_0x0042
        L_0x0061:
            r2 = 1
            goto L_0x006b
        L_0x0063:
            boolean r2 = r9.equals(r1)
            if (r2 != 0) goto L_0x006a
            goto L_0x0042
        L_0x006a:
            r2 = 0
        L_0x006b:
            switch(r2) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x0072;
                case 2: goto L_0x00ae;
                case 3: goto L_0x0072;
                default: goto L_0x006e;
            }
        L_0x006e:
            r8.d(r11)
            return r5
        L_0x0072:
            boolean r9 = android.text.TextUtils.equals(r9, r0)
            if (r9 == 0) goto L_0x0083
            java.lang.String r9 = r8.b
            java.lang.String r0 = r8.c
            boolean r1 = r8.f
            java.lang.String r9 = tb.os6.d(r9, r0, r1)
            goto L_0x008d
        L_0x0083:
            java.lang.String r9 = r8.b
            java.lang.String r0 = r8.c
            boolean r1 = r8.f
            java.lang.String r9 = tb.os6.e(r9, r0, r1)
        L_0x008d:
            java.lang.String r0 = "bizName"
            java.lang.String r1 = r8.b
            r10.b(r0, r1)
            java.lang.String r0 = "key"
            java.lang.String r1 = r8.c
            r10.b(r0, r1)
            java.lang.String r0 = "withUser"
            java.lang.String r1 = r8.d
            r10.b(r0, r1)
            java.lang.String r0 = "value"
            r10.b(r0, r9)
            r11.success(r10)
            return r4
        L_0x00ae:
            boolean r9 = android.text.TextUtils.equals(r9, r1)
            if (r9 == 0) goto L_0x00c1
            java.lang.String r9 = r8.b
            java.lang.String r0 = r8.c
            boolean r1 = r8.f
            java.lang.String r2 = r8.e
            boolean r9 = tb.os6.l(r9, r0, r1, r2)
            goto L_0x00cd
        L_0x00c1:
            java.lang.String r9 = r8.b
            java.lang.String r0 = r8.c
            boolean r1 = r8.f
            java.lang.String r2 = r8.e
            boolean r9 = tb.os6.m(r9, r0, r1, r2)
        L_0x00cd:
            if (r9 == 0) goto L_0x00d3
            java.lang.String r9 = "存储成功"
            goto L_0x00d6
        L_0x00d3:
            java.lang.String r9 = "存储失败"
        L_0x00d6:
            java.lang.String r0 = "result"
            r10.b(r0, r9)
            r11.success(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gza.g(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return this.f20324a;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58972dbc", new Object[]{this});
            return;
        }
        this.e = null;
        this.d = null;
        this.c = null;
        this.b = null;
        this.f = false;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bfc0d0", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject.getString("bizName");
        this.c = jSONObject.getString("key");
        this.d = jSONObject.getString("withUser");
        this.e = jSONObject.getString("value");
        this.f = !TextUtils.equals(this.d, "NO");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c334949a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        h();
        if (TextUtils.isEmpty(str)) {
            d(wVCallBackContext);
            return false;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            uqa.b("Bridge", "checkParamsAndNotifyIfInvalid", "parse params exception:" + e.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            d(wVCallBackContext);
            return false;
        }
        f(jSONObject);
        return !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c);
    }

    public final boolean b(String str, WVCallBackContext wVCallBackContext) {
        Application application;
        SharedPreferences sharedPreferences;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8f8558d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str) || (application = Globals.getApplication()) == null || (sharedPreferences = application.getSharedPreferences("home_dx_data", 0)) == null) {
                return false;
            }
            String string = JSON.parseObject(str).getString("key");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                obj = sharedPreferences.getAll();
            } else {
                obj = sharedPreferences.getString(string, null);
            }
            nswVar.a("homeLocalValue", obj);
            wVCallBackContext.success(nswVar);
            uqa.b("Bridge", "getHomeLocalValue", "success; homeLocalValue:" + nswVar.e("homeLocalValue", FactoryType.TYPE_INVALID));
            return true;
        } catch (Exception e) {
            uqa.b("Bridge", "getHomeLocalValue", "parse params exception:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.success();
            return true;
        }
    }
}
