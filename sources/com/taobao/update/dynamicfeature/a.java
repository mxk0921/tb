package com.taobao.update.dynamicfeature;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.FeatureUpdateData2;
import java.util.ArrayList;
import java.util.List;
import tb.c3w;
import tb.c62;
import tb.fih;
import tb.gdh;
import tb.gjv;
import tb.kjv;
import tb.nkv;
import tb.q48;
import tb.q49;
import tb.r48;
import tb.ru1;
import tb.s49;
import tb.t2o;
import tb.t49;
import tb.vjv;
import tb.w87;
import tb.yjv;
import tb.zpt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a extends vjv implements yjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public yjv.a f14084a;
    public SharedPreferences b;
    public final c3w c;
    public final gdh d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.update.dynamicfeature.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0798a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$hisVersion;

        public RunnableC0798a(String str) {
            this.val$hisVersion = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.access$200(a.this, this.val$hisVersion);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f14085a = new a(null);

        static {
            t2o.a(951058435);
        }

        public static /* synthetic */ a access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e80cc9a1", new Object[0]);
            }
            return f14085a;
        }
    }

    static {
        t2o.a(951058433);
        t2o.a(950009883);
    }

    public /* synthetic */ a(RunnableC0798a aVar) {
        this();
    }

    public static /* synthetic */ void access$200(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7ac465", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    public static a instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aebc24dc", new Object[0]);
        }
        return b.access$000();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1621086737) {
            super.init((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dynamicfeature/DynamicFeatureUpdater");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bd2d95", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Application application = kjv.getInstance().getApplication();
            SharedPreferences sharedPreferences = application.getSharedPreferences("dynamicdeploy_features_" + str, 0);
            Application application2 = kjv.getInstance().getApplication();
            SharedPreferences sharedPreferences2 = application2.getSharedPreferences("dynamicdeploy_features_bak-" + str, 0);
            sharedPreferences.edit().clear().commit();
            sharedPreferences2.edit().clear().commit();
        }
    }

    public final String e(List<FeatureUpdateData.FeatureInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb510428", new Object[]{this, list});
        }
        for (FeatureUpdateData.FeatureInfo featureInfo : list) {
            if (!TextUtils.isEmpty(r48.h().g(featureInfo.featureName))) {
                return r48.h().g(featureInfo.featureName);
            }
        }
        return "";
    }

    public final void f(FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2474ddbf", new Object[]{this, updateFeatureInfo, str});
            return;
        }
        q49 q49Var = new q49();
        q49Var.newUpdate = true;
        q49Var.context = kjv.sContext;
        FeatureUpdateData featureUpdateData = new FeatureUpdateData();
        featureUpdateData.featureUpdateVersion = updateFeatureInfo.featureUpdateVersion;
        featureUpdateData.beta = String.valueOf(updateFeatureInfo.beta);
        featureUpdateData.httpsUrl = updateFeatureInfo.httpsUrl;
        featureUpdateData.size = updateFeatureInfo.size;
        featureUpdateData.url = updateFeatureInfo.url;
        featureUpdateData.md5 = updateFeatureInfo.md5;
        featureUpdateData.updateFeatures = updateFeatureInfo.features;
        q49Var.featureUpdateData = featureUpdateData;
        s49.getInstance().execute(q49Var, str);
    }

    public final void g(FeatureUpdateData2 featureUpdateData2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fb7d75", new Object[]{this, featureUpdateData2, str});
            return;
        }
        for (FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo : featureUpdateData2.updateFeatures) {
            if (!TextUtils.equals(updateFeatureInfo.baseVersion, nkv.getVersionName())) {
                gdh gdhVar = this.d;
                gdhVar.w("featureupdate BaseVersion :" + updateFeatureInfo.baseVersion + " is not matched!");
            } else if (updateFeatureInfo.deployed) {
                gdh gdhVar2 = this.d;
                gdhVar2.w("featureVersion :" + updateFeatureInfo.featureUpdateVersion + " has deployed");
                if (str.equals(gjv.SCAN)) {
                    s49.getInstance().showToast("该版本已经扫码部署过，清除数据重新扫码!");
                }
            } else if (!k(updateFeatureInfo.features) || new w87().compare(e(updateFeatureInfo.features), updateFeatureInfo.featureUpdateVersion) <= 0) {
                gdh gdhVar3 = this.d;
                gdhVar3.w("installupdatefeature:" + updateFeatureInfo);
                t49.stat(true, "revupdate", 0L, 0, "", String.valueOf(updateFeatureInfo.featureUpdateVersion));
                f(updateFeatureInfo, str);
            } else {
                gdh gdhVar4 = this.d;
                gdhVar4.w("has featureVersion :" + e(updateFeatureInfo.features) + " is higher than " + updateFeatureInfo.featureUpdateVersion);
            }
        }
    }

    public final boolean h(FeatureUpdateData2 featureUpdateData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fa26e0", new Object[]{this, featureUpdateData2})).booleanValue();
        }
        boolean z = true;
        for (FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo : featureUpdateData2.updateFeatures) {
            if (!TextUtils.equals(updateFeatureInfo.baseVersion, nkv.getVersionName())) {
                gdh gdhVar = this.d;
                gdhVar.w("featureupdate BaseVersion :" + updateFeatureInfo.baseVersion + " is not matched!");
            } else if (m(updateFeatureInfo)) {
                rollBack(updateFeatureInfo.featureUpdateVersion);
                updateFeatureInfo.deployed = true;
            } else if (!j(updateFeatureInfo.featureUpdateVersion) || updateFeatureInfo.rollback) {
                updateFeatureInfo.deployed = false;
                z = false;
            } else {
                updateFeatureInfo.deployed = true;
            }
        }
        return z;
    }

    public final boolean i(FeatureUpdateData featureUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a841086", new Object[]{this, featureUpdateData})).booleanValue();
        }
        if (q48.e().d(nkv.getVersionName()) == null || !q48.e().d(nkv.getVersionName()).equals(featureUpdateData.featureUpdateVersion)) {
            return false;
        }
        return true;
    }

    @Override // tb.vjv
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.mInit) {
            super.init(context);
            this.b = context.getSharedPreferences(gjv.DYNAMICUPDATE, 0);
            this.mInit = true;
        }
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4d15a5", new Object[]{this, str})).booleanValue();
        }
        return r48.h().j(str);
    }

    public final boolean k(List<FeatureUpdateData.FeatureInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abeb0d51", new Object[]{this, list})).booleanValue();
        }
        for (FeatureUpdateData.FeatureInfo featureInfo : list) {
            if (r48.h().k(featureInfo.featureName)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c1f82b", new Object[]{this, updateFeatureInfo})).booleanValue();
        }
        return updateFeatureInfo.rollback;
    }

    @Override // tb.yjv
    public void patchProcessListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d04f53", new Object[]{this, aVar});
        } else {
            this.f14084a = aVar;
        }
    }

    public void rollBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6fd295", new Object[]{this, str});
            return;
        }
        r48.h().b(str);
        s49.getInstance().rollBack(str);
    }

    public a() {
        this.c = new w87();
        this.d = fih.getLog(a.class, (gdh) null);
        kjv.getInstance().registerListener(gjv.DYNAMICUPDATE, this);
    }

    public final FeatureUpdateData b(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureUpdateData) ipChange.ipc$dispatch("3ae6372a", new Object[]{this, jSONObject});
        }
        FeatureUpdateData featureUpdateData = new FeatureUpdateData();
        if (jSONObject.containsKey("updateFeatures")) {
            JSONArray jSONArray = jSONObject.getJSONArray("updateFeatures");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                FeatureUpdateData.FeatureInfo featureInfo = new FeatureUpdateData.FeatureInfo();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String str2 = "";
                featureInfo.featureName = jSONObject2.containsKey(ru1.FEATURE_NAME) ? jSONObject2.getString(ru1.FEATURE_NAME) : str2;
                if (jSONObject2.containsKey("version")) {
                    str2 = jSONObject2.getString("version");
                }
                featureInfo.version = str2;
                if (jSONObject2.containsKey("appVersion")) {
                    str = jSONObject2.getString("appVersion");
                } else {
                    str = nkv.getVersionName();
                }
                featureInfo.appVersion = str;
                arrayList.add(featureInfo);
            }
            featureUpdateData.updateFeatures = arrayList;
        }
        if (jSONObject.containsKey("appDeployVersion")) {
            featureUpdateData.appDeployVersion = jSONObject.getString("appDeployVersion");
        }
        if (jSONObject.containsKey("featureUpdateVersion")) {
            featureUpdateData.featureUpdateVersion = jSONObject.getString("featureUpdateVersion");
        }
        if (jSONObject.containsKey("md5")) {
            featureUpdateData.md5 = jSONObject.getString("md5");
        }
        if (jSONObject.containsKey("beta")) {
            featureUpdateData.beta = jSONObject.getString("beta");
        }
        if (jSONObject.containsKey("fileSize")) {
            featureUpdateData.size = Long.parseLong(jSONObject.getString("fileSize"));
        }
        if (jSONObject.containsKey("url")) {
            featureUpdateData.url = jSONObject.getString("url");
        }
        if (jSONObject.containsKey("httpsUrl")) {
            featureUpdateData.httpsUrl = jSONObject.getString("httpsUrl");
        }
        if (jSONObject.containsKey("baseVersion")) {
            featureUpdateData.baseVersion = jSONObject.getString("baseVersion");
        }
        return featureUpdateData;
    }

    public final FeatureUpdateData2 c(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureUpdateData2) ipChange.ipc$dispatch("7053cb2c", new Object[]{this, jSONObject});
        }
        FeatureUpdateData2 featureUpdateData2 = new FeatureUpdateData2();
        if (jSONObject.containsKey("features")) {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            for (int i = 0; i < jSONArray.size(); i++) {
                FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo = new FeatureUpdateData2.UpdateFeatureInfo();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.containsKey("baseVersion")) {
                    str = jSONObject2.getString("baseVersion");
                } else {
                    str = "";
                }
                updateFeatureInfo.baseVersion = str;
                if (jSONObject2.containsKey("featureUpdateVersion")) {
                    str2 = jSONObject2.getString("featureUpdateVersion");
                } else {
                    str2 = "";
                }
                updateFeatureInfo.featureUpdateVersion = str2;
                if (jSONObject2.containsKey("httpsUrl")) {
                    str3 = jSONObject2.getString("httpsUrl");
                } else {
                    str3 = "";
                }
                updateFeatureInfo.httpsUrl = str3;
                if (jSONObject2.containsKey("url")) {
                    str4 = jSONObject2.getString("url");
                } else {
                    str4 = "";
                }
                updateFeatureInfo.url = str4;
                if (jSONObject2.containsKey("md5")) {
                    str5 = jSONObject2.getString("md5");
                } else {
                    str5 = "";
                }
                updateFeatureInfo.md5 = str5;
                updateFeatureInfo.rollback = jSONObject2.containsKey("rollback") ? jSONObject2.getBoolean("rollback").booleanValue() : false;
                updateFeatureInfo.size = jSONObject2.containsKey("fileSize") ? jSONObject2.getLong("fileSize").longValue() : 0L;
                updateFeatureInfo.beta = jSONObject2.containsKey("beta") ? jSONObject2.getBoolean("beta").booleanValue() : false;
                updateFeatureInfo.updateStrategy = jSONObject2.containsKey("updateStrategy") ? jSONObject2.getInteger("updateStrategy").intValue() : 0;
                if (jSONObject2.containsKey("updateFeatures")) {
                    this.d.w("containsKey updateFeatures");
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("updateFeatures");
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        gdh gdhVar = this.d;
                        gdhVar.w("jsonObject:" + jSONObject3);
                        FeatureUpdateData.FeatureInfo featureInfo = new FeatureUpdateData.FeatureInfo();
                        if (jSONObject3.containsKey(ru1.FEATURE_NAME)) {
                            str6 = jSONObject3.getString(ru1.FEATURE_NAME);
                        } else {
                            str6 = "";
                        }
                        featureInfo.featureName = str6;
                        if (jSONObject3.containsKey("version")) {
                            str7 = jSONObject3.getString("version");
                        } else {
                            str7 = "";
                        }
                        featureInfo.version = str7;
                        updateFeatureInfo.features.add(featureInfo);
                    }
                }
                featureUpdateData2.updateFeatures.add(updateFeatureInfo);
            }
        }
        return featureUpdateData2;
    }

    public final boolean l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e3a8", new Object[]{this, jSONObject})).booleanValue();
        }
        return !jSONObject.containsKey("featureUpdateVersion") && !jSONObject.containsKey("rollback") && jSONObject.containsKey("features");
    }

    @Override // tb.yjv
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        if (!this.mInit) {
            init(kjv.getInstance().getApplication());
        }
        String versionName = nkv.getVersionName();
        try {
            String string = this.b.getString("currentversion", "");
            if (!string.equals(versionName)) {
                this.b.edit().putString("currentversion", versionName).commit();
                if (!TextUtils.isEmpty(string)) {
                    ((zpt) c62.getInstance(zpt.class)).execute(new RunnableC0798a(string));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        gdh gdhVar = this.d;
        gdhVar.w(str + ":" + jSONObject.toJSONString());
        if (e) {
            this.d.w("dynamic update has finished  please reboot and retry");
            return;
        }
        SharedPreferences sharedPreferences = kjv.sContext.getSharedPreferences("dynamic_features_config", 0);
        if (sharedPreferences.getBoolean("disable_featureupdate_" + nkv.getVersionName(), false)) {
            this.d.w("DynamicFeatureUpdater is disabled");
        } else if (jSONObject.containsKey("baseVersion") && !versionName.equals(jSONObject.getString("baseVersion"))) {
            this.d.w("DynamicFeatureUpdater is mismatch");
        } else if (l(jSONObject)) {
            FeatureUpdateData2 c = c(jSONObject);
            if (!h(c)) {
                g(c, str);
            } else if (TextUtils.equals(gjv.SCAN, str)) {
                s49.getInstance().showToast("所有的版本已经部署过!");
            }
        } else if (!jSONObject.containsKey("rollback") || !Boolean.parseBoolean(jSONObject.getString("rollback"))) {
            this.d.w("doFeatureUpdate");
            d(jSONObject, str);
        } else {
            rollBack();
            e = true;
        }
    }

    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
        } else {
            q48.e().b();
        }
    }

    public final void d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9829bf", new Object[]{this, jSONObject, str});
            return;
        }
        FeatureUpdateData b2 = b(jSONObject);
        if (i(b2)) {
            if (str.equals(gjv.SCAN)) {
                s49.getInstance().showToast("该版本已经部署过!");
            }
            gdh gdhVar = this.d;
            gdhVar.w(b2.featureUpdateVersion + " has deployed!");
            return;
        }
        String string = this.b.getString("currentversion", "");
        if (!string.equals(nkv.getVersionName())) {
            this.b.edit().clear().commit();
        }
        boolean parseBoolean = Boolean.parseBoolean(this.b.getString("beta", ""));
        String string2 = this.b.getString("featureupdateversion", "");
        String string3 = this.b.getString("from", "");
        if (!str.equals(gjv.SCAN) && string.equals(nkv.getVersionName()) && parseBoolean && this.c.compare(string2, b2.featureUpdateVersion) > 0) {
            return;
        }
        if (!string.equals(nkv.getVersionName()) || !string3.equals(gjv.SCAN)) {
            t49.stat(true, "revupdate", 0L, 0, "", String.valueOf(b2.featureUpdateVersion));
            q49 q49Var = new q49();
            q49Var.context = kjv.sContext;
            q49Var.featureUpdateData = b2;
            s49.getInstance().execute(q49Var, str);
            if (q49Var.success) {
                this.f14084a.patchSuccess();
                this.b.edit().putString("currentversion", nkv.getVersionName()).putString("featureupdateversion", b2.featureUpdateVersion).putString("beta", b2.beta).putString("from", str).commit();
                e = true;
                return;
            }
            this.f14084a.patchFailed(q49Var.errorMsg);
        }
    }
}
