package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hhc f32367a;
    public final hhc.a b;
    public final Context c;
    public JSONObject d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "userTrack";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
            } else if (str == null) {
                ((mvf) aVar).c("没有传入方法");
                fve.e("UserTrackerService", "没有传入方法");
            } else {
                fve.e("UserTrackerService", "executeFeature method:".concat(str));
                if (!yuv.a(yuv.this)) {
                    fve.e("UserTrackerService", "更新的时候视图没有在屏幕上");
                    return;
                }
                try {
                    yuv.b(yuv.this, str, jSONObject, aVar);
                } catch (Exception e) {
                    ((mvf) aVar).c("出现异常: " + e.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(490733608);
    }

    public yuv(hhc hhcVar, Context context) {
        this.c = context;
        this.f32367a = hhcVar;
        hhc.a c = c();
        this.b = c;
        hhcVar.a(c);
    }

    public static /* synthetic */ boolean a(yuv yuvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f0b013", new Object[]{yuvVar})).booleanValue();
        }
        return yuvVar.e;
    }

    public static /* synthetic */ void b(yuv yuvVar, String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8028d753", new Object[]{yuvVar, str, jSONObject, aVar});
        } else {
            yuvVar.e(str, jSONObject, aVar);
        }
    }

    public final hhc.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("b5ff73f", new Object[]{this});
        }
        return new a();
    }

    public final void d(Context context, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        JSONObject jSONObject2;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0155b42", new Object[]{this, context, jSONObject, aVar});
            return;
        }
        if (jSONObject != null) {
            str2 = jSONObject.getString("pageName");
            str = jSONObject.getString("spmUrl");
            jSONObject2 = jSONObject.getJSONObject("params");
        } else {
            str2 = null;
            jSONObject2 = null;
            str = null;
        }
        fve.e("UserTrackerService", "页面进入埋点,spmUrl: " + str + " pageName: " + str2 + " context: " + context);
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        defaultTracker.updatePageName(context, str2);
        defaultTracker.updatePageProperties(context, jSONObject2);
        if (!TextUtils.isEmpty(str)) {
            defaultTracker.updatePageUrl(context, Uri.parse(str));
        }
        ((mvf) aVar).d("更新页面埋点成功");
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3486068", new Object[]{this});
        }
        return this.d;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.f32367a.b(this.b);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa55fc06", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public final void j(JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cce1223", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            ((mvf) aVar).c("updateNextPageUtParam jsParams == null");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
            ((mvf) aVar).d("updateNextPageUtParam success");
        }
    }

    public final void k(JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b054085f", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            ((mvf) aVar).c("updateNextProp params == null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null) {
                ((mvf) aVar).c("updateNextProp jsParams == null");
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(jSONObject2);
            ((mvf) aVar).d("updateNextProp success");
        }
    }

    public final void l(Context context, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86550d7", new Object[]{this, context, jSONObject, aVar});
        } else if (jSONObject == null) {
            ((mvf) aVar).c("updatePageName jsParams == null");
        } else {
            String string = jSONObject.getString("pageName");
            fve.e("UserTrackerService", "updatePageName,pageName: " + string);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, string);
            ((mvf) aVar).d("updatePageName success");
        }
    }

    public void m(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da38055d", new Object[]{this, context, uri});
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (context != null && uri != null) {
            defaultTracker.updatePageUrl(context, uri);
        }
    }

    public final void n(Context context, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b95895", new Object[]{this, context, jSONObject, aVar});
        } else if (jSONObject == null) {
            ((mvf) aVar).c("updateUtParam jsParams == null");
            fve.e("UserTrackerService", "updateUtParam jsParams == null");
        } else {
            String jSONString = jSONObject.toJSONString();
            fve.e("UserTrackerService", "updateUtParam,obj: " + jSONString);
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, jSONString);
            ((mvf) aVar).d("updateUtParam success");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r8.equals("updateNextPageUtparam") == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r8, com.alibaba.fastjson.JSONObject r9, tb.hhc.a.AbstractC0939a r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 4
            com.android.alibaba.ip.runtime.IpChange r5 = tb.yuv.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "3c5314c2"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r7
            r4[r2] = r8
            r4[r1] = r9
            r4[r0] = r10
            r5.ipc$dispatch(r6, r4)
            return
        L_0x001b:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -2000505633: goto L_0x006e;
                case 859698569: goto L_0x0062;
                case 1392047779: goto L_0x0056;
                case 1421600451: goto L_0x004c;
                case 1729443235: goto L_0x0040;
                case 1850454806: goto L_0x0034;
                case 1880007478: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0079
        L_0x0028:
            java.lang.String r0 = "updatePageUtparam"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r0 = 6
            goto L_0x0079
        L_0x0034:
            java.lang.String r0 = "updatePageUtParam"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003e
            goto L_0x0026
        L_0x003e:
            r0 = 5
            goto L_0x0079
        L_0x0040:
            java.lang.String r0 = "updatePageName"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004a
            goto L_0x0026
        L_0x004a:
            r0 = 4
            goto L_0x0079
        L_0x004c:
            java.lang.String r1 = "updateNextPageUtparam"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0079
            goto L_0x0026
        L_0x0056:
            java.lang.String r0 = "updateNextPageUtParam"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0060
            goto L_0x0026
        L_0x0060:
            r0 = 2
            goto L_0x0079
        L_0x0062:
            java.lang.String r0 = "pageEnter"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x006c
            goto L_0x0026
        L_0x006c:
            r0 = 1
            goto L_0x0079
        L_0x006e:
            java.lang.String r0 = "updateNextProp"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0078
            goto L_0x0026
        L_0x0078:
            r0 = 0
        L_0x0079:
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x008d;
                case 2: goto L_0x0089;
                case 3: goto L_0x0089;
                case 4: goto L_0x0083;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0098
        L_0x007d:
            android.content.Context r8 = r7.c
            r7.n(r8, r9, r10)
            goto L_0x0098
        L_0x0083:
            android.content.Context r8 = r7.c
            r7.l(r8, r9, r10)
            goto L_0x0098
        L_0x0089:
            r7.j(r9, r10)
            goto L_0x0098
        L_0x008d:
            r7.d = r9
            android.content.Context r8 = r7.c
            r7.d(r8, r9, r10)
            goto L_0x0098
        L_0x0095:
            r7.k(r9, r10)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yuv.e(java.lang.String, com.alibaba.fastjson.JSONObject, tb.hhc$a$a):void");
    }
}
