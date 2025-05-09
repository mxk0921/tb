package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q6q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISmartLayerServiceProxy.a f26550a;
    public boolean b = false;

    static {
        t2o.a(779093236);
    }

    public q6q(cba cbaVar) {
        ISmartLayerServiceProxy.a smartLayerService = d9m.F().getSmartLayerService();
        this.f26550a = smartLayerService;
        if (smartLayerService != null) {
            smartLayerService.start();
            smartLayerService.a(new ehf());
            cbaVar.v = smartLayerService;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap<java.lang.String, java.lang.Object> a(android.content.Context r4, tb.cba r5, com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo r6, com.alibaba.fastjson.JSONObject r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.q6q.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "8bf9b2be"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r7
            r4 = 4
            r2[r4] = r8
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.util.HashMap r4 = (java.util.HashMap) r4
            return r4
        L_0x0021:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 == 0) goto L_0x00f2
            if (r6 != 0) goto L_0x002c
            goto L_0x00f2
        L_0x002c:
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0041
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L_0x0041
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r4 = r4.getDataString()
            goto L_0x0043
        L_0x0041:
            java.lang.String r4 = ""
        L_0x0043:
            java.lang.String r1 = "intentUrl"
            r0.put(r1, r4)
            java.lang.String r4 = "entryLiveId"
            java.lang.String r1 = tb.iba.m(r5)
            r0.put(r4, r1)
            long r1 = tb.iba.K(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "switchIndex"
            r0.put(r1, r4)
            java.lang.String r4 = "liveSource"
            java.lang.String r1 = tb.iba.B(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "entryLiveSource"
            java.lang.String r1 = tb.iba.o(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "spm"
            java.lang.String r1 = tb.iba.J(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "spmCnt"
            java.lang.String r1 = tb.rbu.s(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "entrySpm"
            java.lang.String r1 = tb.iba.r(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "entryspmpre"
            java.lang.String r1 = tb.iba.s(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "entrylivesourcepre"
            java.lang.String r1 = tb.iba.p(r5)
            r0.put(r4, r1)
            java.lang.String r4 = "liveId"
            java.lang.String r1 = r6.liveId
            r0.put(r4, r1)
            java.lang.String r4 = "accountId"
            java.lang.String r1 = r6.accountId
            r0.put(r4, r1)
            java.lang.String r4 = "dispatchItemID"
            java.lang.String r1 = r6.dispatchItemID
            r0.put(r4, r1)
            java.lang.String r4 = "actionData"
            r0.put(r4, r7)
            java.lang.String r4 = tb.iba.L(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r8 = r4
        L_0x00c9:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 == 0) goto L_0x00d1
            java.lang.String r8 = r6.disPatchTrackInfo
        L_0x00d1:
            java.lang.String r4 = "trackInfo"
            r0.put(r4, r8)
            tb.ux9 r4 = tb.vx9.d()
            if (r4 == 0) goto L_0x00f2
            java.lang.String r5 = "uniqueIdentification"
            java.lang.String r6 = r4.C()
            r0.put(r5, r6)
            tb.fif r5 = new tb.fif
            r5.<init>(r4)
            java.lang.String r4 = "track_adapter"
            r0.put(r4, r5)
        L_0x00f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q6q.a(android.content.Context, tb.cba, com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo, com.alibaba.fastjson.JSONObject, java.lang.String):java.util.HashMap");
    }

    public static HashMap<String, Object> b(ux9 ux9Var, TBLiveDataModel tBLiveDataModel, JSONObject jSONObject) {
        String str;
        VideoInfo videoInfo;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9a496e89", new Object[]{ux9Var, tBLiveDataModel, jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!(ux9Var == null || ux9Var.j() == null || ux9Var.j().k() == null)) {
            if (tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null || TextUtils.isEmpty(map.get(yj4.PARAM_INTENT_URL))) {
                str = "";
            } else {
                str = tBLiveDataModel.mInitParams.get(yj4.PARAM_INTENT_URL);
            }
            hashMap.put(yj4.PARAM_INTENT_URL, str);
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, up6.q(ux9Var));
            hashMap.put("switchIndex", Long.valueOf(up6.W(ux9Var)));
            hashMap.put("liveSource", up6.L(ux9Var));
            hashMap.put("entryLiveSource", up6.r(ux9Var));
            hashMap.put("spm", up6.U(ux9Var));
            hashMap.put("spmCnt", rbu.r(ux9Var));
            hashMap.put("entrySpm", up6.w(ux9Var));
            hashMap.put("entryspmpre", up6.x(ux9Var));
            hashMap.put("entrylivesourcepre", up6.s(ux9Var));
            hashMap.put("uniqueIdentification", ux9Var.C());
            hashMap.put("actionData", jSONObject);
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
                hashMap.put("liveId", videoInfo.liveId);
                hashMap.put("videoInfo", videoInfo);
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    hashMap.put("accountId", accountInfo.accountId);
                    hashMap.put("dispatchItemID", videoInfo.dispatchItemID);
                }
            }
            hashMap.put("track_adapter", new fif(ux9Var));
            hashMap.put("trackInfo", iba.L(ux9Var.j()));
        }
        return hashMap;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5662f8ab", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b00b7e", new Object[]{this, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.d) aVar).k(obj);
        }
    }

    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd722b8", new Object[]{this, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.d) aVar).h(obj);
        }
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b179c6", new Object[]{this, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.d) aVar).g(obj);
        }
    }

    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd4d0ba", new Object[]{this, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.d) aVar).d(obj);
        }
    }

    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256b668f", new Object[]{this, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.d) aVar).j(obj);
        }
    }

    public void i(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, ViewGroup viewGroup, ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20943134", new Object[]{this, str, hashMap, hashMap2, activity, viewGroup, bVar});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null) {
            aVar.c(str, hashMap, hashMap2, activity, viewGroup, bVar);
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994da4d5", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void k(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, Object obj, ViewGroup viewGroup, ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db529a4c", new Object[]{this, str, hashMap, hashMap2, activity, obj, viewGroup, bVar});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null) {
            aVar.b(str, hashMap, hashMap2, activity, obj, viewGroup, bVar);
        }
    }

    public void l(HashMap<String, Object> hashMap, Activity activity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c38714", new Object[]{this, hashMap, activity, obj});
            return;
        }
        ISmartLayerServiceProxy.a aVar = this.f26550a;
        if (aVar != null) {
            aVar.i(hashMap, activity, obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ISmartLayerServiceProxy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cba f26551a;
        public final String b;
        public final String c;

        static {
            t2o.a(779093237);
            t2o.a(806355258);
        }

        public a(cba cbaVar, String str, String str2) {
            this.f26551a = cbaVar;
            this.b = str;
            this.c = str2;
        }

        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81f4b3e4", new Object[]{this, str, str2, str3});
                return;
            }
            cba cbaVar = this.f26551a;
            if (!(cbaVar == null || cbaVar.u == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", (Object) "dx_smart");
                if ("SMART_DISPLAY".equals(str)) {
                    this.f26551a.u.c(this.b, this.c, true, jSONObject);
                    sj9.D("SmartLayer smartLayerStatusCallback SMART_DISPLAY");
                } else if ("SMART_CLOSE".equals(str)) {
                    this.f26551a.u.c(this.b, this.c, false, jSONObject);
                } else if (!TextUtils.isEmpty(str2)) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("name", "dx_smart");
                    hashMap.put(v4s.PARAM_UPLOAD_STAGE, str);
                    hashMap.put("errorCode", str2);
                    hashMap.put("errorMessage", str3);
                    this.f26551a.u.i(this.b, this.c, str2, str3, hashMap);
                }
            }
            x5t.c("smartLayerStatusCallback stage " + str + " errorCode " + str2 + " errorMessage " + str3);
        }
    }
}
