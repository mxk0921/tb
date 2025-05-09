package com.alibaba.security.realidentity;

import android.app.Activity;
import com.alibaba.fastjson.JSONException;
import com.alibaba.security.realidentity.biz.dynamic.model.CtidConfigResponse;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;
import tb.bbo;
import tb.cpw;
import tb.ppk;
import tb.sow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class i2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "C0000000";
    public static final String c = "C0412002";
    public static final String d = "C0412003";
    public static final String e = "C0412004";
    public static final String f = "C0412005";
    public static final String g = "C0412006";
    public static final String h = "C0412007";
    public static final String i = "C0400001";
    public static final String j = "C0405001";
    public static final String k = "C0401009";
    public static final String l = "C0401010";
    public static final String m = "C0402001";
    public static final String n = "C0401001";
    public static final String o = "C0401003";
    public static final String p = "C0401004";
    public static final String q = "i2";

    /* renamed from: a  reason: collision with root package name */
    public c4 f2739a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CtidConfigResponse f2740a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ j2 d;

        public a(CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
            this.f2740a = ctidConfigResponse;
            this.b = str;
            this.c = activity;
            this.d = j2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i2.a(i2.this, this.f2740a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ppk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2741a;
        public final /* synthetic */ j2 b;

        public b(String str, j2 j2Var) {
            this.f2741a = str;
            this.b = j2Var;
        }

        @Override // tb.ppk
        public void onResult(bbo bboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("578dc643", new Object[]{this, bboVar});
                return;
            }
            String a2 = i2.a();
            com.alibaba.security.realidentity.a.a(a2, "CTID result: " + bboVar.a() + ", resultDesc: " + bboVar.c());
            i2.a(i2.this, bboVar, this.f2741a);
            int a3 = i2.a(i2.this, bboVar.a());
            String a4 = bboVar.b().a();
            j2 j2Var = this.b;
            if (j2Var != null) {
                j2Var.a(a3, a4);
            }
        }
    }

    public static /* synthetic */ void a(i2 i2Var, CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae00f0", new Object[]{i2Var, ctidConfigResponse, str, activity, j2Var});
        } else {
            i2Var.a(ctidConfigResponse, str, activity, j2Var);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : q;
    }

    public static /* synthetic */ void a(i2 i2Var, bbo bboVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01424b3", new Object[]{i2Var, bboVar, str});
        } else {
            i2Var.a(bboVar, str);
        }
    }

    public static /* synthetic */ int a(i2 i2Var, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf667dc6", new Object[]{i2Var, str})).intValue() : i2Var.a(str);
    }

    public void a(c4 c4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26cd001", new Object[]{this, c4Var});
        } else {
            this.f2739a = c4Var;
        }
    }

    public void a(Activity activity, CtidConfigResponse ctidConfigResponse, String str, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4f2d8f", new Object[]{this, activity, ctidConfigResponse, str, j2Var});
        } else {
            activity.runOnUiThread(new a(ctidConfigResponse, str, activity, j2Var));
        }
    }

    private void a(CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728497cf", new Object[]{this, ctidConfigResponse, str, activity, j2Var});
            return;
        }
        cpw cpwVar = new cpw(ctidConfigResponse.orgId, ctidConfigResponse.androidAppId, str, ctidConfigResponse.type);
        a(ctidConfigResponse, str);
        new sow(activity, cpwVar).a(new b(str, j2Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r7.equals(com.alibaba.security.realidentity.i2.i) == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.i2.a(java.lang.String):int");
    }

    private void a(CtidConfigResponse ctidConfigResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f6131b", new Object[]{this, ctidConfigResponse, str});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("orgId", ctidConfigResponse.orgId);
            hashMap.put("appId", ctidConfigResponse.androidAppId);
            hashMap.put("bizSeq", str);
            hashMap.put("type", String.valueOf(ctidConfigResponse.type));
        } catch (JSONException e2) {
            com.alibaba.security.realidentity.a.a(q, e2);
        }
        a(str, TrackLog.createCtidAppStartLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(bbo bboVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3368612", new Object[]{this, bboVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("resultCode", bboVar.a());
        hashMap.put("idAuthData", bboVar.b().a());
        hashMap.put("resultMsg", bboVar.c());
        a(str, TrackLog.createCtidAppEndLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.addTag9(g2.f2719a + "/3.3.0");
        trackLog.addTag10(TimeCalculator.PLATFORM_ANDROID);
        this.f2739a.a(str, trackLog);
    }
}
