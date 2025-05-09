package com.taobao.tbpoplayer.watermask;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tbpoplayer.watermask.WaterMaskInfo;
import com.taobao.tbpoplayer.watermask.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.hst;
import tb.ing;
import tb.lto;
import tb.nim;
import tb.q71;
import tb.t2o;
import tb.ud7;
import tb.uem;
import tb.vem;
import tb.wdm;
import tb.yyb;
import tb.zjc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f13428a;
    public WaterMaskInfo b;
    public zjc c;
    public Bitmap d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tbpoplayer.watermask.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0767a implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13429a;

        public C0767a(boolean z) {
            this.f13429a = z;
        }

        @Override // tb.yyb
        public void b(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                final boolean z = this.f13429a;
                hst.b(new Runnable() { // from class: tb.wxw
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0767a.this.d(str, z);
                    }
                });
            }
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
                return;
            }
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.requestUpdateInfo.onResponseError=" + str);
            q71.f(false, "mtopFailed" + str, "");
        }

        public final /* synthetic */ void d(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("610c2d52", new Object[]{this, str, new Boolean(z)});
                return;
            }
            try {
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.fetchInfo.onResponseSuccess=" + str);
                JSONObject jSONObject = JSON.parseObject(str).getJSONObject("contentMap");
                if (jSONObject == null) {
                    q71.f(false, "notSuccess-contentMap", str);
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
                if (jSONObject2 != null && jSONObject2.getBooleanValue("success")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("content");
                    if (jSONArray != null && !jSONArray.isEmpty()) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                        if (!jSONObject3.getBooleanValue("success")) {
                            q71.f(false, "notSuccess-success", str);
                            return;
                        }
                        String jSONString = jSONObject3.toJSONString();
                        nim.v("waterMaskInfo", jSONString);
                        a.d(a.this, (WaterMaskInfo) JSON.parseObject(jSONString, WaterMaskInfo.class));
                        a aVar = a.this;
                        if (!a.e(aVar, a.c(aVar))) {
                            a.f(a.this, jSONObject3);
                        }
                        q71.f(true, "", str);
                        if (z) {
                            a.this.t();
                        }
                        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.saveData=" + jSONString);
                        return;
                    }
                    q71.f(false, "notSuccess-content", str);
                    return;
                }
                q71.f(false, "notSuccess-feedback", str);
            } catch (Throwable th) {
                wdm.h("WaterMaskInfoManager.onResponseSuccess.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13430a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f13430a = str;
            this.b = str2;
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.displayed.stopListenLifecycle");
            q71.i(true, "", this.f13430a, this.b, "");
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (!OnePopModule.OnePopLoseReasonCode.OnViewPageSwitchClose.name().equals(str2)) {
                ing.b().c(a.g(a.this));
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.onClosed.registerListener.closeReason=" + str2 + ".closeSubReason=" + str3);
                q71.i(false, "closed-" + str2 + "-" + str3, this.f13430a, this.b, "");
            }
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
                return;
            }
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.onTriggerFailed.reason=" + str);
            q71.i(false, "triggerPopFailed-" + str, this.f13430a, this.b, "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13431a;
        public WaterMaskInfo.Scene b;
        public int c = 3;

        static {
            t2o.a(790626561);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f13432a = new a();

        static {
            t2o.a(790626562);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ad4331b8", new Object[0]);
            }
            return f13432a;
        }
    }

    static {
        t2o.a(790626558);
    }

    public static /* synthetic */ WaterMaskInfo c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo) ipChange.ipc$dispatch("cc7f8f8b", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ WaterMaskInfo d(a aVar, WaterMaskInfo waterMaskInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo) ipChange.ipc$dispatch("89a23f31", new Object[]{aVar, waterMaskInfo});
        }
        aVar.b = waterMaskInfo;
        return waterMaskInfo;
    }

    public static /* synthetic */ boolean e(a aVar, WaterMaskInfo waterMaskInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c7f9bc", new Object[]{aVar, waterMaskInfo})).booleanValue();
        }
        return aVar.n(waterMaskInfo);
    }

    public static /* synthetic */ void f(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab933dd", new Object[]{aVar, jSONObject});
        } else {
            aVar.s(jSONObject);
        }
    }

    public static /* synthetic */ zjc g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zjc) ipChange.ipc$dispatch("f7dd7566", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static a m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("94f61fb3", new Object[0]);
        }
        return d.a();
    }

    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("28cb80ea", new Object[]{this});
        }
        return this.d;
    }

    public WaterMaskInfo i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo) ipChange.ipc$dispatch("7df06df9", new Object[]{this});
        }
        WaterMaskInfo waterMaskInfo = this.b;
        if (waterMaskInfo != null) {
            return waterMaskInfo;
        }
        String m = nim.m("waterMaskInfo");
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        try {
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.getCurInfo.waterMaskInfoStr=" + m);
            WaterMaskInfo waterMaskInfo2 = (WaterMaskInfo) JSON.parseObject(m, WaterMaskInfo.class);
            this.b = waterMaskInfo2;
            return waterMaskInfo2;
        } catch (Throwable th) {
            wdm.h("WaterMaskInfoManager.getCurInfo.error", th);
            return null;
        }
    }

    public File j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5fb2f183", new Object[]{this, context, str});
        }
        File filesDir = context.getFilesDir();
        return new File(filesDir.getAbsolutePath() + "/wmp/" + str);
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eea1321", new Object[]{this})).longValue();
        }
        return this.f13428a;
    }

    public void l(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec80d", new Object[]{this, new Long(j)});
        } else {
            hst.b(new Runnable() { // from class: tb.uxw
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.p(j);
                }
            });
        }
    }

    public final boolean n(WaterMaskInfo waterMaskInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bf06791", new Object[]{this, waterMaskInfo})).booleanValue();
        }
        if (waterMaskInfo == null || !waterMaskInfo.isValid()) {
            return false;
        }
        Application application = Globals.getApplication();
        File j = j(application, waterMaskInfo.imgCode + ".png");
        if (j == null || !j.exists()) {
            return false;
        }
        return true;
    }

    public final boolean o(WaterMaskInfo.Scene scene, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9496690", new Object[]{this, scene, str, str2})).booleanValue();
        }
        if (scene == null || !scene.uris.contains(str) || !lto.a(str2, scene.filter)) {
            return false;
        }
        return true;
    }

    public c q(WaterMaskInfo waterMaskInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3e8c298f", new Object[]{this, waterMaskInfo, str, str2});
        }
        c cVar = new c();
        cVar.f13431a = false;
        cVar.b = null;
        cVar.c = 3;
        if (waterMaskInfo != null && waterMaskInfo.enable && !TextUtils.isEmpty(str)) {
            boolean useBlackListMode = waterMaskInfo.useBlackListMode();
            wdm.d("WaterMask.isMatchScene.useBlackListMode=" + useBlackListMode, new Object[0]);
            if (useBlackListMode) {
                cVar.f13431a = true;
                cVar.c = waterMaskInfo.defaultAlpha;
                List<WaterMaskInfo.Scene> list = waterMaskInfo.blackPageList;
                if (list != null && !list.isEmpty()) {
                    Iterator<WaterMaskInfo.Scene> it = waterMaskInfo.blackPageList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        WaterMaskInfo.Scene next = it.next();
                        if (o(next, str, str2)) {
                            wdm.d("WaterMask.hitBlackPageList.matchId=" + next.matchId, new Object[0]);
                            cVar.f13431a = false;
                            break;
                        }
                    }
                } else {
                    wdm.d("WaterMask.blackPageList=null.hit", new Object[0]);
                }
                Iterator<WaterMaskInfo.Scene> it2 = waterMaskInfo.whitePageList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    WaterMaskInfo.Scene next2 = it2.next();
                    if (o(next2, str, str2)) {
                        wdm.d("WaterMask.hitWhitePageList.matchId=" + next2.matchId, new Object[0]);
                        cVar.b = next2;
                        cVar.c = Integer.parseInt(next2.alpha);
                        break;
                    }
                }
            } else {
                List<WaterMaskInfo.Scene> list2 = waterMaskInfo.whitePageList;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<WaterMaskInfo.Scene> it3 = waterMaskInfo.whitePageList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        WaterMaskInfo.Scene next3 = it3.next();
                        if (o(next3, str, str2)) {
                            wdm.d("WaterMask.hitWhitePageList.matchId=" + next3.matchId, new Object[0]);
                            cVar.b = next3;
                            cVar.c = Integer.parseInt(next3.alpha);
                            cVar.f13431a = true;
                            break;
                        }
                    }
                }
            }
            int i = cVar.c;
            if (i < 3) {
                cVar.c = 3;
            } else if (i > 10) {
                cVar.c = 10;
            }
        }
        return cVar;
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad90dfe", new Object[]{this, new Boolean(z)});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("screenshotTBAndroid");
        ud7.d().e("feedback", arrayList, new JSONObject(), new C0767a(z));
        nim.u("lastRequestWaterMaskTime", System.currentTimeMillis());
    }

    public final void s(JSONObject jSONObject) {
        Response syncSend;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e3382b", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Boolean bool = jSONObject.getBoolean("enable");
            String string = jSONObject.getString("imgCode");
            String string2 = jSONObject.getString("imgUrl");
            if (bool != null && bool.booleanValue() && (syncSend = new DegradableNetwork(Globals.getApplication()).syncSend(new RequestImpl(string2), null)) != null) {
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskImage.fetch.response=" + syncSend);
                if (syncSend.getStatusCode() >= 0) {
                    byte[] bytedata = syncSend.getBytedata();
                    Application application = Globals.getApplication();
                    vem.k(bytedata, j(application, string + ".png"));
                }
            }
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4265888", new Object[]{this});
        } else if (!u(TriggerControllerInfoManager.instance().getCurUri(), TriggerControllerInfoManager.instance().getCurActivityInfo())) {
            if (this.c == null) {
                this.c = new zjc() { // from class: tb.vxw
                    @Override // tb.zjc
                    public final void a(String str, String str2) {
                        a.this.u(str, str2);
                    }
                };
            }
            ing.b().c(this.c);
        }
    }

    public final boolean u(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a223fe98", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                q71.i(false, "pageUriEmpty", str, str2, "");
                return false;
            }
            WaterMaskInfo i = i();
            if (i != null && i.isValid()) {
                if ((i.useBlackListMode() || i.whitePageList != null) && !i.whitePageList.isEmpty()) {
                    c q = q(i, str, str2);
                    wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskInfoManager.hitMatchScene=" + q.f13431a);
                    if (!q.f13431a) {
                        q71.i(false, "notHitMatchScene", str, str2, "");
                        return false;
                    }
                    if (this.d == null) {
                        Application application = Globals.getApplication();
                        File j = j(application, i.imgCode + ".png");
                        if (!j.exists()) {
                            q71.i(false, "imageNotExist", str, str2, "");
                            return false;
                        }
                        this.d = vem.j(j);
                    }
                    if (this.c != null) {
                        ing.b().d(this.c);
                    }
                    uem.m("poplayer://waterMask", "").j(new b(str, str2)).l();
                    return true;
                }
                q71.i(false, "infoInValid-whiteListEmpty", str, str2, JSON.toJSONString(i));
                return false;
            }
            if (i != null) {
                str3 = JSON.toJSONString(i);
            } else {
                str3 = "noData";
            }
            q71.i(false, "infoInValid", str, str2, str3);
            return false;
        } catch (Throwable th) {
            wdm.h("WaterMaskInfoManager.lifecycleListener.error", th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void p(long r23) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.watermask.a.p(long):void");
    }
}
