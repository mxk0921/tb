package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HMSPackageManager {
    private static HMSPackageManager o;
    private static final Object p = new Object();
    private static final Object q = new Object();
    private static final Object r = new Object();
    private static final Map<String, String> s;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5512a;
    private final PackageManagerHelper b;
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private int n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: a  reason: collision with root package name */
        private String f5513a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Long f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j) {
            this.f5513a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = Long.valueOf(j);
        }

        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            if (TextUtils.equals(this.e, packagePriorityInfo.e)) {
                return this.f.compareTo(packagePriorityInfo.f);
            }
            return this.e.compareTo(packagePriorityInfo.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Comparator<ResolveInfo> {
        public a() {
        }

        /* renamed from: a */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.s.containsKey(str) && HMSPackageManager.s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.s.containsKey(str)) {
                return -1;
            }
            if (HMSPackageManager.s.containsKey(str2)) {
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> queryIntentServices = HMSPackageManager.this.f5512a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (!(queryIntentServices == null || queryIntentServices.size() == 0)) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if ("com.huawei.hwid".equals(resolveInfo.serviceInfo.applicationInfo.packageName)) {
                            HMSPackageManager.this.d();
                        }
                    }
                    HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
                }
            } catch (Exception e) {
                HMSLog.e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e.getMessage());
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        s = hashMap;
        hashMap.put("com.huawei.hwid", "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        hashMap.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    private HMSPackageManager(Context context) {
        this.f5512a = context;
        this.b = new PackageManagerHelper(context);
    }

    private boolean c(String str, String str2) {
        return Objects.equals(str2, this.b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.b.getPackageSignature(str));
    }

    private Pair<String, String> d(String str, String str2) {
        if (!s.containsKey(str) || !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(str2)) {
            return null;
        }
        this.n = 3;
        return new Pair<>(str, str2);
    }

    private void e(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.f5512a, str) || Build.VERSION.SDK_INT < 28 || b(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    private void f() {
        synchronized (q) {
            this.c = null;
            this.d = null;
            this.e = 0;
        }
    }

    private Pair<String, String> g() {
        try {
            List<ResolveInfo> queryIntentServices = this.f5512a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (queryIntentServices == null || queryIntentServices.size() == 0) {
                HMSLog.e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            a(queryIntentServices);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSigningCertificate = this.b.getPackageSigningCertificate(str);
                String packageSignature = this.b.getPackageSignature(str);
                Pair<String, String> d = d(str, packageSigningCertificate);
                if (d != null) {
                    HMSLog.i("HMSPackageManager", "signature V3 check success");
                    return d;
                }
                Pair<String, String> a2 = a(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                if (a2 != null) {
                    HMSLog.i("HMSPackageManager", "DSS signature check success");
                    return a2;
                }
                Pair<String, String> a3 = a(str, packageSignature);
                if (a3 != null) {
                    HMSLog.i("HMSPackageManager", "signature V2 check success");
                    return a3;
                }
            }
            return null;
        } catch (Exception e) {
            HMSLog.e("HMSPackageManager", "getHmsPackageName query hms action failed. " + e.getMessage());
            return null;
        }
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (p) {
            try {
                if (o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        o = new HMSPackageManager(context);
                    }
                    o.k();
                    o.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    private Pair<String, String> h() {
        Pair<String, String> g = g();
        if (g != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) g.first));
            this.h = "com.huawei.hms.core.aidlservice";
            this.i = null;
            return g;
        }
        ArrayList<PackagePriorityInfo> i = i();
        if (i == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<PackagePriorityInfo> it = i.iterator();
        while (it.hasNext()) {
            PackagePriorityInfo next = it.next();
            String str = next.f5513a;
            String str2 = next.b;
            String str3 = next.c;
            String str4 = next.d;
            String packageSignature = this.b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + next.f);
                this.h = PackageConstants.GENERAL_SERVICES_ACTION;
                d(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    private ArrayList<PackagePriorityInfo> i() {
        try {
            List<ResolveInfo> queryIntentServices = this.f5512a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                HMSLog.e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String a2 = a(bundle, "hms_app_checker_config");
                    String a3 = a(a2);
                    if (TextUtils.isEmpty(a3)) {
                        HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + a2);
                    } else {
                        String a4 = a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(a4)) {
                            HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String a5 = a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(a5)) {
                                HMSLog.i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.i("HMSPackageManager", "add: " + str + ", " + a2 + ", " + packageFirstInstallTime);
                                arrayList.add(new PackagePriorityInfo(str, a2, a4, a5, a3, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e) {
            HMSLog.e("HMSPackageManager", "query aglite action failed. " + e.getMessage());
            return null;
        }
    }

    private void j() {
        synchronized (q) {
            try {
                Pair<String, String> g = g();
                if (g == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    f();
                    return;
                }
                String str = (String) g.first;
                this.c = str;
                this.d = (String) g.second;
                this.e = this.b.getPackageVersionCode(str);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.c + " version: " + this.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        synchronized (q) {
            try {
                Pair<String, String> h = h();
                if (h == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    e();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                    return;
                }
                this.f = (String) h.first;
                this.g = (String) h.second;
                this.j = this.b.getPackageVersionCode(getHMSPackageNameForMultiService());
                e(this.f);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f + " version: " + this.j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean l() {
        Bundle bundle;
        PackageManager packageManager = this.f5512a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e);
        }
        if (TextUtils.isEmpty(this.h) || (!this.h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.i("HMSPackageManager", "action = " + this.h + " exist");
        return false;
    }

    public String getHMSFingerprint() {
        String str = this.d;
        if (str == null) {
            return "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";
        }
        return str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                j();
            }
            String str2 = this.c;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                k();
            }
            String str2 = this.f;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    f();
                    return packageStates2;
                } else if (!"com.huawei.hwid".equals(this.c) || d() != 1) {
                    return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.c, this.d)) ? packageStates : packageStates2;
                } else {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    e();
                    return packageStates2;
                } else if (!"com.huawei.hwid".equals(this.f) || d() != 1) {
                    return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f, this.g)) ? packageStates : packageStates2;
                } else {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        if (!TextUtils.isEmpty(this.h)) {
            return this.h;
        }
        return "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.e >= i || !l()) {
            return true;
        }
        int packageVersionCode = this.b.getPackageVersionCode(getHMSPackageName());
        this.e = packageVersionCode;
        if (packageVersionCode >= i) {
            return true;
        }
        return false;
    }

    public boolean isApkNeedUpdate(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i);
        return hmsVersionCode < i;
    }

    public boolean isApkUpdateNecessary(int i) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        return l() && hmsVersionCode < i;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return "com.huawei.hwid".equals(this.f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            j();
        }
        c(this.c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
            k();
        }
        c(this.f);
    }

    public void resetMultiServiceState() {
        e();
    }

    public void setUseOldCertificate(boolean z) {
        this.m = z;
    }

    private boolean b(String str) {
        return !"com.huawei.hwid".equals(str) || this.n == 3;
    }

    private void a(List<ResolveInfo> list) {
        if (list.size() > 1) {
            Collections.sort(list, new a());
        }
    }

    private boolean b(String str, String str2) {
        Map<String, String> map = s;
        return map.containsKey(str) && map.get(str).equalsIgnoreCase(str2);
    }

    private void c(String str) {
        if ("com.huawei.hwid".equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
            HMSLog.i("HMSPackageManager", "refresh update state for HMS V3");
        }
    }

    private Pair<String, String> a(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            HMSLog.e("HMSPackageManager", "DSS check: " + str + " for metadata is null");
            return null;
        }
        this.n = 2;
        if (a(bundle, str, str2)) {
            HMSLog.i("HMSPackageManager", "support DSS V3 check");
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4)) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no " + str4);
            return null;
        } else if (!bundle.containsKey("hms_app_cert_chain")) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            return null;
        } else {
            if (!a(str + "&" + str3, bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
                HMSLog.e("HMSPackageManager", "checkSigner failed");
                return null;
            }
            if (str4.equals("hms_app_signer_v3")) {
                this.n = 3;
            }
            return new Pair<>(str, str3);
        }
    }

    private void b() {
        new Thread(new b(), "Thread-asyncOnceCheckMDMState").start();
    }

    private void d(String str) {
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            this.i = a2.substring(9);
        }
    }

    private void e() {
        synchronized (q) {
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        synchronized (r) {
            try {
                HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.k != 3 && this.l == packageFirstInstallTime) {
                    HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.k));
                    return this.k;
                }
                this.k = c() ? 2 : 1;
                this.l = this.b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.k));
                return this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean c() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f5512a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        } else if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        } else if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        } else if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        } else {
            HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
            return false;
        }
    }

    private Pair<String, String> a(String str, String str2) {
        if (b(str, str2)) {
            return new Pair<>(str, str2);
        }
        HMSLog.w("HMSPackageManager", "check sign fail: " + str + "_" + str2);
        return null;
    }

    private boolean a(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !b(str, str2) && Build.VERSION.SDK_INT >= 28;
    }

    private String a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
        return null;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("priority=");
        if (indexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    private boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMSLog.e("HMSPackageManager", "args is invalid");
            return false;
        }
        List<X509Certificate> b2 = com.huawei.hms.device.a.b(str3);
        if (b2.size() == 0) {
            HMSLog.e("HMSPackageManager", "certChain is empty");
            return false;
        } else if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f5512a), b2)) {
            HMSLog.e("HMSPackageManager", "failed to verify cert chain");
            return false;
        } else {
            X509Certificate x509Certificate = b2.get(b2.size() - 1);
            if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.e("HMSPackageManager", "CN is invalid");
                return false;
            } else if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.e("HMSPackageManager", "OU is invalid");
                return false;
            } else if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
                return true;
            } else {
                HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
                return false;
            }
        }
    }

    private static String a(int i) {
        if (i == 1) {
            return "SPOOFED";
        }
        if (i == 2) {
            return "SUCCESS";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i);
        return "";
    }
}
