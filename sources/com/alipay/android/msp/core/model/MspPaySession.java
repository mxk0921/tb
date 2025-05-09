package com.alipay.android.msp.core.model;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.InstallationUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderStrUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspPaySession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AP_LINK_TOKEN_EXT_INFO_KEY = "ap_link_token";
    public static final String AP_LINK_TOKEN_KEY_FROM_SCAN_CODE = "ap_scan_codec_link_token";
    public static final int DEFAULT_CALLING_ID = -2;

    /* renamed from: a  reason: collision with root package name */
    public String f3554a;
    public final String b;
    public String d;
    public String e;
    public String f;
    public String g;
    public Map<String, String> h;
    public CertPayModel i;
    public SchemePayModel j;
    public String k;
    public final boolean s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public final List<String> z;
    public Map<String, String> c = new ConcurrentHashMap(12);
    public boolean l = true;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public int p = -2;
    public int q = -2;
    public int r = 0;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.core.model.MspPaySession$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String nameForUid = GlobalHelper.getInstance().getContext().getPackageManager().getNameForUid(MspPaySession.access$000(MspPaySession.this));
                String orderSuffix = MspPaySession.this.getOrderSuffix();
                if (!TextUtils.isEmpty(nameForUid) && !TextUtils.isEmpty(orderSuffix)) {
                    MspPaySession.this.setOuterPackageName(nameForUid, true);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder sb = new StringBuilder("callingUid=");
                sb.append(MspPaySession.access$000(MspPaySession.this));
                sb.append(",pkgName=");
                sb.append(nameForUid);
                sb.append(" , costtime=");
                long j = elapsedRealtime2 - elapsedRealtime;
                sb.append(j);
                LogUtil.record(2, "MspPaySession.updateOuterPackageNameByCallingUid", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                EventLogUtil.logPayEvent("10101081", HiAnalyticsConstant.BI_KEY_COST_TIME, sb2.toString(), "content_type", "getSourcePkg");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CertPayModel {
        public final String callbackUrl;
        public final String packageName;
        public final String pid;
        public final String session;

        public CertPayModel(String str, String str2, String str3, String str4) {
            this.session = str;
            this.callbackUrl = str2;
            this.pid = str3;
            this.packageName = str4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SchemePayModel {
        public final String desKey;
        public final String packageName;
        public final String session;

        public SchemePayModel(String str, String str2, String str3) {
            this.session = str;
            this.desKey = str2;
            this.packageName = str3;
        }
    }

    public MspPaySession(String str, String str2, boolean z) {
        this.s = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = GlobalHelper.getInstance().getContext();
        FastStartActivityHelper.init(MspExperimentHelper.isGray(FastStartActivityHelper.CONFIG_KEY));
        if (context != null) {
            this.s = FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_NEW_AP_LINK_TOKEN_CREATE_100370);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 > 300) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "readSpSlow", String.valueOf(elapsedRealtime2));
        }
        setOrderSuffix(str);
        this.b = str2;
        setFromWallet(z);
        this.z = InstallationUtil.getInstalledThirdPayTypes(GlobalHelper.getInstance().getContext());
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == -2 || i == -1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int access$000(MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883d35bf", new Object[]{mspPaySession})).intValue();
        }
        return mspPaySession.q;
    }

    public void ensureCallingPidUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9144fc12", new Object[]{this});
            return;
        }
        if (a(this.p)) {
            setCallingPid(Binder.getCallingPid());
        }
        if (a(this.q)) {
            CashierSceneDictionary.MspSchemePayContext mspSchemePayContext = CashierSceneDictionary.getInstance().getMspSchemePayContext(Utils.AliyunSlot(this.f3554a));
            if (!this.l && mspSchemePayContext == null) {
                setCallingUid(Binder.getCallingUid());
            }
        }
    }

    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            setApLinkToken(ApLinkTokenUtils.generateFallbackTradeToken(this.f3554a));
        }
        return this.d;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        if (this.r < 0) {
            this.r = Utils.getBizId(this.f3554a);
        }
        return this.r;
    }

    public int getCallingPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa45a017", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public int getCallingUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2c4c85c", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public CertPayModel getCertPayModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CertPayModel) ipChange.ipc$dispatch("bb335178", new Object[]{this});
        }
        return this.i;
    }

    public String getEncodeOrderSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16c1946", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty(this.f3554a)) {
                return URLEncoder.encode(this.f3554a, "utf8");
            }
            return "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public Map<String, String> getExtInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7858875", new Object[]{this});
        }
        return this.c;
    }

    public String getExtendParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff4c103", new Object[]{this});
        }
        return this.b;
    }

    public String getExternalPkgName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79f08ec3", new Object[]{this});
        }
        return this.e;
    }

    public String getFromApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31462d5f", new Object[]{this});
        }
        return this.t;
    }

    public String getFromSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb75c97e", new Object[]{this});
        }
        return this.u;
    }

    public List<String> getInstalled3rdAppList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e16a962", new Object[]{this});
        }
        return this.z;
    }

    public String getInvokeFromAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6c285", new Object[]{this});
        }
        return this.x;
    }

    public String getInvokeFromAppSign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a73eb293", new Object[]{this});
        }
        return this.y;
    }

    public String getInvokeFromClientAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("681341e0", new Object[]{this});
        }
        return this.v;
    }

    public String getInvokeFromUrlRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("399665f0", new Object[]{this});
        }
        return this.w;
    }

    public Map<String, String> getLocalInvokeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3af9e297", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        return this.h;
    }

    public String getOrderSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5de49f90", new Object[]{this});
        }
        return this.f3554a;
    }

    public String getOuterPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d9268d", new Object[]{this});
        }
        return this.g;
    }

    public String getSceneType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229325c9", new Object[]{this});
        }
        return this.k;
    }

    public SchemePayModel getSchemePayModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SchemePayModel) ipChange.ipc$dispatch("d38285f6", new Object[]{this});
        }
        return this.j;
    }

    public String getSchemeTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39e3fff4", new Object[]{this});
        }
        return this.f;
    }

    public boolean isFromEntranceActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84db7c04", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean isFromOutScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ddfea0a", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean isFromWalletH5Pay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d829ad19", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void setApLinkToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9eccff", new Object[]{this, str});
        } else if (!TextUtils.equals(str, this.d) && !TextUtils.isEmpty(str)) {
            this.d = str;
            if (this.c == null) {
                this.c = new ConcurrentHashMap(12);
            }
            this.c.put("ap_link_token", str);
        }
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void setCallingUid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcab512e", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public void setCertPayModel(CertPayModel certPayModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a120c32", new Object[]{this, certPayModel});
        } else {
            this.i = certPayModel;
        }
    }

    public void setExternalPkgName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e491e7b", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setFromApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe83075f", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public void setFromEntranceActivity(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6110169c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void setFromOutScheme(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f75ac6", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void setFromSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2cedb8", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public void setFromWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void setFromWalletH5Pay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d68b97", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void setInvokeFromAppName(String str) {
        Signature signature;
        String signatureString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa095f9", new Object[]{this, str});
            return;
        }
        this.x = str;
        Signature[] rawSignature = Utils.getRawSignature(GlobalHelper.getInstance().getContext(), this.g);
        if (rawSignature != null && rawSignature.length > 0 && (signature = rawSignature[0]) != null && (signatureString = Utils.getSignatureString(signature, "MD5")) != null && signatureString.length() > 0) {
            this.y = signatureString;
        }
    }

    public void setInvokeFromClientAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b027fe", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public void setInvokeFromUrlRefer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d081386", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public void setLocalInvokeInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2016f", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public void setOrderSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7666814e", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f3554a)) {
            String AliyunSlot = Utils.AliyunSlot(str);
            this.f3554a = AliyunSlot;
            setBizId(Utils.getBizId(AliyunSlot));
            if (!TextUtils.isEmpty(this.f3554a)) {
                Map<String, String> extractExtInfoMapFromExternalInfo = OrderStrUtil.extractExtInfoMapFromExternalInfo(this.f3554a);
                if (extractExtInfoMapFromExternalInfo == null || extractExtInfoMapFromExternalInfo.size() == 0) {
                    extractExtInfoMapFromExternalInfo = new HashMap<>();
                }
                String str2 = extractExtInfoMapFromExternalInfo.get("ap_link_token");
                if (TextUtils.isEmpty(str2)) {
                    this.d = ApLinkTokenUtils.generateFallbackTradeToken(this.f3554a);
                } else if (this.s) {
                    this.d = str2 + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(this.f3554a);
                } else {
                    this.d = str2;
                }
                extractExtInfoMapFromExternalInfo.put("ap_link_token", this.d);
                this.c = extractExtInfoMapFromExternalInfo;
            }
        }
    }

    public void setOuterPackageName(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5239aa6b", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(this.g)) {
            this.g = str;
            setInvokeFromAppName(str);
        }
    }

    public void setSceneType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20f4f35", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setSchemePayModel(SchemePayModel schemePayModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9117d2", new Object[]{this, schemePayModel});
        } else {
            this.j = schemePayModel;
        }
    }

    public void setSchemeTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373be06a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<MspPaySession orderSuffix=" + this.f3554a + " extendParams=" + this.b + " externalPkgName=" + this.e + " outerPackageName=" + this.g + " fromSource=" + this.u + " fromApi=" + this.t + " apLinkToken=" + this.d + " sceneType=" + this.k + " isFromWallet=" + this.l + " isFromEntranceActivity=" + this.m + " isFromWalletH5Pay=" + this.n + " isFromOutScheme=" + this.o + " callingPid=" + this.p + " callingUid=" + this.q + ">";
    }

    public void updateOuterPackageNameByCallingUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5aed29", new Object[]{this});
        }
    }

    public void updateExtInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e51cf8", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            String str = map.get("ap_link_token");
            if (TextUtils.isEmpty(str)) {
                str = map.get("ap_scan_codec_link_token");
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.s && !str.contains("_INR") && !str.startsWith("UK")) {
                    str = str + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(this.f3554a);
                }
                this.d = str;
            }
            Map<String, String> map2 = this.c;
            if (map2 == null || map2.isEmpty()) {
                this.c = new HashMap(map);
            } else {
                this.c.putAll(map);
            }
            if (!TextUtils.isEmpty(str)) {
                this.c.put("ap_link_token", this.d);
            }
            Map<String, String> map3 = this.c;
            if (map3 != null && map3.size() != 0) {
                String str2 = map3.get(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
                String str3 = map3.get(MspGlobalDefine.INVOKE_FROM_API_KEY);
                String str4 = map3.get(MspGlobalDefine.INVOKE_FROM_ID_KEY);
                String str5 = map3.get(MspGlobalDefine.INVOKE_FROM_REFER_URL);
                LogUtil.record(2, "parseInvokeFromSuite", "invokeFromSource=" + str2 + " ，invokeFromApi=" + str3 + " ， invokeFromId=" + str4 + " ，invokeFromUrlRefer=" + str5);
                if (!TextUtils.isEmpty(str2)) {
                    setFromSource(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    setFromApi(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    setInvokeFromClientAppId(str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    setInvokeFromUrlRefer(str5);
                }
            }
        }
    }
}
