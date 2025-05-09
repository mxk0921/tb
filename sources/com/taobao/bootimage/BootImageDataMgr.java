package com.taobao.bootimage;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.data.GatwaySplashRequest;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ai7;
import tb.c21;
import tb.chb;
import tb.di2;
import tb.fdb;
import tb.np;
import tb.o78;
import tb.oh2;
import tb.ph2;
import tb.qsg;
import tb.r4p;
import tb.t2o;
import tb.tm1;
import tb.usg;
import tb.uy3;
import tb.vu3;
import tb.wzi;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BootImageDataMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE = "bootimage";
    public static final String IMAGE_MODULE_NAME = "boot-image";

    /* renamed from: a  reason: collision with root package name */
    public static final BootImageDataMgr f10221a = new BootImageDataMgr();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class FatigueInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long expireTimeMs;
        public long lastTimeMs;
        public int times;

        static {
            t2o.a(736100355);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FatigueInfo{times=" + this.times + ", lastTimeMs=" + this.lastTimeMs + ", expireTimeMs=" + this.expireTimeMs + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(BootImageDataMgr bootImageDataMgr) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(736100356);
        }

        public b() {
            super("bootimageDownloadRes");
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/BootImageDataMgr$RequestBootImageInfoTask");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BootImageDataMgr.a(BootImageDataMgr.this);
            }
        }
    }

    static {
        t2o.a(736100353);
    }

    public BootImageDataMgr() {
        new HashMap();
    }

    public static /* synthetic */ void a(BootImageDataMgr bootImageDataMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc05f46c", new Object[]{bootImageDataMgr});
        } else {
            bootImageDataMgr.j();
        }
    }

    public static BootImageDataMgr g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageDataMgr) ipChange.ipc$dispatch("3b902685", new Object[0]);
        }
        return f10221a;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86b7b35", new Object[]{this, map});
            return;
        }
        fdb h = h();
        if (h != null) {
            h.N("bootimage_configs", JSON.toJSONString(map));
        }
    }

    public final String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4287aec", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Application a2 = uy3.a();
        if (TBDeviceUtils.p(a2)) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            if (TBAutoSizeConfig.x().T(a2)) {
                str = ytc.TYPE_FOLD;
            } else {
                str = "expand";
            }
            jSONObject.put("foldStatus", (Object) str);
        } else if (TBDeviceUtils.P(a2)) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
        } else {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
        }
        tm1.a("BootImageDataMgr", "上行设备参数: " + jSONObject);
        return jSONObject.toJSONString();
    }

    public Map<String, String> f() {
        Object d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3cd32731", new Object[]{this});
        }
        fdb h = h();
        if (h == null || (d0 = h.d0("bootimage_configs")) == null) {
            return null;
        }
        return (Map) JSON.parseObject((String) d0, new a(this).getType(), new Feature[0]);
    }

    public final fdb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("78cb08c7", new Object[]{this});
        }
        np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(CACHE_MODULE);
        if (cacheForModule == null) {
            return null;
        }
        return cacheForModule.C();
    }

    public final void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2162b42f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject m = ph2.m(jSONObject);
            if (m == null) {
                tm1.a("BootImageDataMgr", "notifyReceive baseData: null");
                return;
            }
            JSONObject jSONObject2 = m.getJSONObject("topViewSplashSection");
            if (jSONObject2 == null) {
                tm1.a("BootImageDataMgr", "notifyReceive topViewSplash: null");
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("sections");
            if (jSONArray == null || jSONArray.isEmpty()) {
                tm1.a("BootImageDataMgr", "notifyReceive sectionsJsonArray: null");
                return;
            }
            List<LinkedSplashData> n = di2.n(jSONArray, jSONObject3);
            if (n.isEmpty()) {
                tm1.a("BootImageDataMgr", "notifyReceive dataList: null");
                return;
            }
            qsg b2 = usg.d().b();
            for (LinkedSplashData linkedSplashData : n) {
                b2.i(linkedSplashData);
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da5f27", new Object[]{this});
            return;
        }
        tm1.a("BootImageDataMgr", "requestSplashData: start");
        try {
            MtopResponse syncRequest = RemoteBusiness.build((IMTOPDataObject) e(), TaoPackageInfo.getTTID()).syncRequest();
            wzi e = usg.d().e();
            if (syncRequest == null) {
                e.d("Market", "HotStart", wzi.SPLASH_REQUEST_ERROR, null, "responseNull", "responseNull");
                return;
            }
            org.json.JSONObject dataJsonObject = syncRequest.getDataJsonObject();
            if (dataJsonObject == null) {
                e.d("Market", "HotStart", wzi.SPLASH_REQUEST_ERROR, null, "dataJsonObjectNull", "");
                return;
            }
            JSONObject parseObject = JSON.parseObject(dataJsonObject.toString());
            i(parseObject);
            usg.d().a().i(parseObject);
            usg.d().a().c(1001);
        } catch (Exception e2) {
            tm1.b("BootImageDataMgr", "requestSplashData error", e2);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d7211", new Object[]{this});
        } else {
            Coordinator.postTask(new b());
        }
    }

    public final Double[] d() {
        NumberFormatException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double[]) ipChange.ipc$dispatch("a835c612", new Object[]{this});
        }
        TBLocationDTO d = TBLocationClient.d();
        double d2 = vu3.b.GEO_NOT_SUPPORT;
        if (d != null) {
            try {
                d2 = !TextUtils.isEmpty(d.getLatitude()) ? Double.parseDouble(d.getLatitude()) : 0.0d;
                try {
                    if (!TextUtils.isEmpty(d.getLongitude())) {
                        d2 = Double.parseDouble(d.getLongitude());
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    tm1.b(oh2.TAG, "requestSplashData createLocationParam: getLocation error.", e);
                    return new Double[]{Double.valueOf(d2), Double.valueOf(d2)};
                }
            } catch (NumberFormatException e3) {
                e = e3;
                d2 = 0.0d;
            }
        } else {
            d2 = 0.0d;
        }
        return new Double[]{Double.valueOf(d2), Double.valueOf(d2)};
    }

    public final GatwaySplashRequest e() {
        String str;
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatwaySplashRequest) ipChange.ipc$dispatch("5019b88a", new Object[]{this});
        }
        GatwaySplashRequest gatwaySplashRequest = new GatwaySplashRequest();
        Double[] d = d();
        gatwaySplashRequest.sid = Login.getSid();
        gatwaySplashRequest.userId = Login.getUserId();
        gatwaySplashRequest.latitude = d[0].doubleValue();
        gatwaySplashRequest.longitude = d[1].doubleValue();
        gatwaySplashRequest.nick = Login.getNick();
        gatwaySplashRequest.utdid = UTDevice.getUtdid(uy3.a());
        chb g = c21.g();
        gatwaySplashRequest.deviceScore = g == null ? -1 : g.getInt(ai7.KEY_OLD_SCORE, -1);
        PositionInfo i = o78.i(Globals.getApplication());
        if (i != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(r4p.KEY_EDITION_CODE, (Object) i.editionCode);
            gatwaySplashRequest.extension = jSONObject.toString();
            tm1.a(oh2.TAG, "createRequestParams editionCode is : " + i.editionCode);
            str = i.editionCode;
        } else {
            str = null;
        }
        String[] i2 = di2.i(uy3.a());
        String h = di2.h();
        if (g == null) {
            valueOf = "-1";
        } else {
            valueOf = String.valueOf(g.getInt("deviceLevel", -1));
        }
        gatwaySplashRequest.setContainerParams(h, i2[0], i2[1], str, valueOf);
        gatwaySplashRequest.setCommonBizParams(c());
        return gatwaySplashRequest;
    }
}
