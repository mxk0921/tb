package com.taobao.themis.kernel.metaInfo;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.util.List;
import tb.ckf;
import tb.ges;
import tb.q9s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMetaInfoWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AppModel f13589a;
    public final AppManifest b;
    public final Type c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type AppInfo = new Type("AppInfo", 0);
        public static final Type Manifest = new Type("Manifest", 1);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static final /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("87d8be9d", new Object[0]) : new Type[]{AppInfo, Manifest};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper$Type");
        }

        public static Type valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b3fd0b52", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Type.class, str);
            }
            return (Type) valueOf;
        }

        public static Type[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("884b2841", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Type[]) clone;
        }
    }

    static {
        t2o.a(839909763);
    }

    public TMSMetaInfoWrapper(AppModel appModel) {
        ckf.g(appModel, RVConstants.EXTRA_APPINFO);
        this.c = Type.AppInfo;
        this.f13589a = appModel;
    }

    public final String a() {
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856685d", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            ckf.d(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getDesc();
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null || (bizInfo = appInfo.getBizInfo()) == null) {
            return null;
        }
        return bizInfo.getString("appDesc");
    }

    public final String b() {
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            ckf.d(appModel);
            return appModel.getAppId();
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null || (bizInfo = appInfo.getBizInfo()) == null) {
            return null;
        }
        return bizInfo.getString("id");
    }

    public final AppModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppModel) ipChange.ipc$dispatch("ed0b06f7", new Object[]{this});
        }
        return this.f13589a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("422b902f", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getAppInfoModel().getBytePackageUrl();
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f8f6128", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getExtendInfos();
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("320bb5d7", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getAppInfoModel().getPackageUrl();
    }

    public final List<PluginModel> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a726059", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getAppInfoModel().getPlugins();
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e274526", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getAppInfoModel().getByteSubPackages();
    }

    public final String i() {
        AppManifest.AppInfo appInfo;
        JSONObject bizInfo;
        AppInfoModel appInfoModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            if (appModel == null || (appInfoModel = appModel.getAppInfoModel()) == null) {
                return null;
            }
            return appInfoModel.getAppKey();
        }
        AppManifest appManifest = this.b;
        if (appManifest == null || (appInfo = appManifest.getAppInfo()) == null || (bizInfo = appInfo.getBizInfo()) == null) {
            return null;
        }
        return bizInfo.getString("appKey");
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5d9f583", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            ckf.d(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getLogo();
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getLogo();
    }

    public final String k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            ckf.d(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                str = null;
            } else {
                str = appInfoModel.getAlias();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            AppModel appModel2 = this.f13589a;
            ckf.d(appModel2);
            AppInfoModel appInfoModel2 = appModel2.getAppInfoModel();
            if (appInfoModel2 == null) {
                return null;
            }
            return appInfoModel2.getName();
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getName();
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            ckf.d(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getDeveloperVersion();
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getVersion();
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37245c0d", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        JSONObject extendInfos = appModel.getExtendInfos();
        if (extendInfos == null) {
            return null;
        }
        return extendInfos.getString("ascriptionType");
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f644dd1b", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        JSONObject extendInfos = appModel.getExtendInfos();
        if (extendInfos == null) {
            return null;
        }
        return extendInfos.getString("belongBiz");
    }

    public final String o() {
        AppManifest.AppInfo appInfo;
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f13589a;
            if (ckf.b((appModel == null || (extendInfos = appModel.getExtendInfos()) == null) ? null : extendInfos.getString("frameTempType"), "pubArea")) {
                return "TinyApp";
            }
            return null;
        }
        AppManifest appManifest = this.b;
        if (appManifest == null || (appInfo = appManifest.getAppInfo()) == null) {
            return null;
        }
        return appInfo.getBizType();
    }

    public final String p() {
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65a8d827", new Object[]{this});
        }
        AppModel appModel = this.f13589a;
        if (appModel == null || (extendInfos = appModel.getExtendInfos()) == null) {
            return null;
        }
        return extendInfos.getString("deviceOrientation");
    }

    public final boolean q() {
        AppManifest.AppInfo appInfo;
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef45a76f", new Object[]{this})).booleanValue();
        }
        String str = null;
        if (this.c == Type.AppInfo) {
            JSONObject e = e();
            if (e != null) {
                str = e.getString("hideAboutPageButton");
            }
            return ckf.b(str, "true");
        }
        AppManifest appManifest = this.b;
        if (!(appManifest == null || (appInfo = appManifest.getAppInfo()) == null || (bizInfo = appInfo.getBizInfo()) == null)) {
            str = bizInfo.getString("hideAboutPage");
        }
        return ckf.b(str, "true");
    }

    public final AppManifest r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest) ipChange.ipc$dispatch("a1f624e9", new Object[]{this});
        }
        return this.b;
    }

    public final List<AppManifest.Page> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f39d161", new Object[]{this});
        }
        if (this.c != Type.Manifest) {
            return null;
        }
        AppManifest appManifest = this.b;
        ckf.d(appManifest);
        AppManifest.Container container = appManifest.getContainer();
        if (container == null) {
            return null;
        }
        return container.getPages();
    }

    public final JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("55b5af7f", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getPermissionControl();
    }

    public final PermissionModel w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionModel) ipChange.ipc$dispatch("37a4dc12", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        return appModel.getPermissionModel();
    }

    public final JSONObject x() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25451742", new Object[]{this});
        }
        try {
            String str = null;
            if (this.c != Type.AppInfo) {
                jSONObject = new JSONObject();
                AppManifest appManifest = this.b;
                ckf.d(appManifest);
                AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                jSONObject.put((JSONObject) "appId", appInfo == null ? null : appInfo.getAppId());
                AppManifest appManifest2 = this.b;
                ckf.d(appManifest2);
                AppManifest.AppInfo appInfo2 = appManifest2.getAppInfo();
                jSONObject.put((JSONObject) "appName", appInfo2 == null ? null : appInfo2.getName());
                AppManifest appManifest3 = this.b;
                ckf.d(appManifest3);
                AppManifest.AppInfo appInfo3 = appManifest3.getAppInfo();
                if (appInfo3 != null) {
                    str = appInfo3.getVersion();
                }
                jSONObject.put((JSONObject) "appVersion", str);
            } else if (q9s.INSTANCE.s0()) {
                Object json = JSON.toJSON(this.f13589a);
                if (json != null) {
                    jSONObject = (JSONObject) json;
                    jSONObject.remove(AttributionReporter.SYSTEM_PERMISSION);
                    jSONObject.remove("permissionControl");
                    JSONObject jSONObject3 = jSONObject.getJSONObject(MspGlobalDefine.EXTENDINFO);
                    if (jSONObject3 != null) {
                        jSONObject3.remove("chargeInfo");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            } else {
                jSONObject = new JSONObject();
                AppModel appModel = this.f13589a;
                ckf.d(appModel);
                jSONObject.put((JSONObject) "appId", appModel.getAppId());
                AppModel appModel2 = this.f13589a;
                ckf.d(appModel2);
                AppInfoModel appInfoModel = appModel2.getAppInfoModel();
                jSONObject.put((JSONObject) "appName", appInfoModel == null ? null : appInfoModel.getName());
                AppModel appModel3 = this.f13589a;
                ckf.d(appModel3);
                AppInfoModel appInfoModel2 = appModel3.getAppInfoModel();
                jSONObject.put((JSONObject) "appVersion", appInfoModel2 == null ? null : appInfoModel2.getDeveloperVersion());
                AppModel appModel4 = this.f13589a;
                ckf.d(appModel4);
                JSONObject extendInfos = appModel4.getExtendInfos();
                jSONObject.put((JSONObject) "engineType", extendInfos == null ? null : extendInfos.getString("engineType"));
                AppModel appModel5 = this.f13589a;
                ckf.d(appModel5);
                AppInfoModel appInfoModel3 = appModel5.getAppInfoModel();
                jSONObject.put((JSONObject) "packageSize", appInfoModel3 == null ? null : appInfoModel3.getPackageSize());
                AppModel appModel6 = this.f13589a;
                ckf.d(appModel6);
                AppInfoModel appInfoModel4 = appModel6.getAppInfoModel();
                if (appInfoModel4 != null) {
                    str = appInfoModel4.getPackageUrl();
                }
                jSONObject.put((JSONObject) "packageUrl", str);
                AppModel appModel7 = this.f13589a;
                ckf.d(appModel7);
                if (appModel7.getExtendInfos() != null) {
                    AppModel appModel8 = this.f13589a;
                    ckf.d(appModel8);
                    jSONObject2 = (JSONObject) appModel8.getExtendInfos().clone();
                    jSONObject2.remove("chargeInfo");
                } else {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put((JSONObject) MspGlobalDefine.EXTENDINFO, (String) jSONObject2);
            }
            return jSONObject;
        } catch (Throwable th) {
            TMSLogger.d("TMSMetaInfoWrapper", th);
            return new JSONObject();
        }
    }

    public final TemplateConfigModel y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateConfigModel) ipChange.ipc$dispatch("9997e5b1", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        if (appInfoModel == null) {
            return null;
        }
        return appInfoModel.getTemplateConfig();
    }

    public final boolean t() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("125dd75f", new Object[]{this})).booleanValue();
        }
        if (this.c != Type.AppInfo) {
            return false;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        JSONObject permissionControl = appModel.getPermissionControl();
        if (permissionControl == null || (bool = permissionControl.getBoolean("needAuth")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean u() {
        Boolean bool;
        Boolean bool2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fccf41e7", new Object[]{this})).booleanValue();
        }
        if (this.c != Type.AppInfo) {
            return false;
        }
        AppModel appModel = this.f13589a;
        ckf.d(appModel);
        JSONObject permissionControl = appModel.getPermissionControl();
        if (permissionControl != null && (bool2 = permissionControl.getBoolean("needCheck")) != null) {
            return bool2.booleanValue();
        }
        AppModel appModel2 = this.f13589a;
        ckf.d(appModel2);
        JSONObject extendInfos = appModel2.getExtendInfos();
        if (extendInfos == null || (bool = extendInfos.getBoolean("needCheck")) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public TMSMetaInfoWrapper(AppManifest appManifest, ges.a aVar) {
        ckf.g(appManifest, "appManifest");
        this.c = Type.Manifest;
        this.b = z(appManifest, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
        if (r3.isEmpty() != false) goto L_0x01cf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0156, code lost:
        r1 = (java.lang.String) r3.get(r3.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
        if ((r15 instanceof com.alibaba.fastjson.JSONArray) == false) goto L_0x01a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
        r1 = tb.ssq.m(tb.wsq.R0(r1, '[', ']'));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
        if (r1 == null) goto L_0x0129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
        if (r1.intValue() < 0) goto L_0x0129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
        if (r1.intValue() < ((com.alibaba.fastjson.JSONArray) r15).size()) goto L_0x0184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
        if ((((com.alibaba.fastjson.JSONArray) r15).get(r1.intValue()) instanceof java.lang.String) == false) goto L_0x0129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
        r1 = r1.intValue();
        tb.ckf.f(r0, "value");
        ((com.alibaba.fastjson.JSONArray) r15).set(r1, r9.invoke((com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper$transformManifest$valueParser$1) r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a9, code lost:
        if ((r15 instanceof com.alibaba.fastjson.JSONObject) == false) goto L_0x01c4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b4, code lost:
        if ((((com.alibaba.fastjson.JSONObject) r15).get(r1) instanceof java.lang.String) == false) goto L_0x0129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
        tb.ckf.f(r0, "value");
        ((java.util.Map) r15).put(r1, r9.invoke((com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper$transformManifest$valueParser$1) r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c4, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed, currentValue is not JSONObject or JSONArray");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.themis.kernel.metaInfo.manifest.AppManifest z(com.taobao.themis.kernel.metaInfo.manifest.AppManifest r20, tb.ges.a r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper.z(com.taobao.themis.kernel.metaInfo.manifest.AppManifest, tb.ges$a):com.taobao.themis.kernel.metaInfo.manifest.AppManifest");
    }
}
