package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.racebase.RaceChecker$NPUPlatform;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xdn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RaceChecker";
    public static final String TLOG_MODULE = "Race";
    public static Throwable b;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31322a = false;
    public static boolean f = false;
    public static final List<String> c = Arrays.asList("MNN", "MNN_CL", "MNN_Express", "mnnkitcore");
    public static final List<String> d = Arrays.asList("freetype", "tbffmpegmarvel", pg1.ATOM_EXT_race);
    public static final List<String> e = Arrays.asList("freetype", pg1.ATOM_EXT_race);
    public static final List<String> g = Arrays.asList("hiai_ir", "hiai");
    public static final List<String> h = Arrays.asList("SNPE", "SnpeDspV66Stub", "SnpeHtpPrepare", "SnpeHtpV68CalculatorStub", "SnpeHtpV68Stub", "SnpeHtpV69CalculatorStub", "SnpeHtpV69Stub", "SnpeHtpV73CalculatorStub", "SnpeHtpV73Stub", "SnpeHtpV75CalculatorStub", "SnpeHtpV75Stub", "hiai_ir_build", "ai_fmk_dnnacl", "hiai_aar_adapter", "cpucl", "hiai_binary_model_runtime", "hiai_v1cl", "hcl", "hiai_hcl_model_runtime", "modelcrypto", "neuron_adapter.7");
    public static final List<String> i = Arrays.asList("SNPE", "SnpeDspV66Stub", "SnpeHtpPrepare", "SnpeHtpV68CalculatorStub", "SnpeHtpV68Stub", "SnpeHtpV69CalculatorStub", "SnpeHtpV69Stub", "SnpeHtpV73CalculatorStub", "SnpeHtpV73Stub", "SnpeHtpV75CalculatorStub", "SnpeHtpV75Stub");
    public static final List<String> j = Arrays.asList("hiai_ir_build", "ai_fmk_dnnacl", "hiai_aar_adapter", "cpucl", "hiai_binary_model_runtime", "hiai_v1cl", "hcl", "hiai_hcl_model_runtime", "modelcrypto");
    public static final List<String> k = Arrays.asList("neuron_adapter.7");
    public static final List<String> l = Arrays.asList("20221112LD", "21091116C", "21121119SC", "22081212C", "22101316C", "2211133C", "22120RN86C", "23013RK75C", "23046PNC9C", "23046RP50C", "23054RA19C", "23113RKC6C", "23116PN5BC", "23127PN0CC", "2312DRAABC", "24031PN0DC", "2407FRK8EC", "2410DPN6CC", "2411DRN47C", "ANP-AN00", "AQM-AL10", "ASUS_I001DB", "BMH-AN10", "BVL-AN16", "CMA-AN00", "GM1910", "HJC-AN90", "JLH-AN00", "KOZ-AL00", "LYN-AN00", "M2006C3LC", "M2006J10C", "M2007J17C", "M2007J3SC", "M2010J19SC", "M2012K11AC", "M2104K10AC", "M60 Pro", "MAA-AN10", "MI 9 Transparent Edition", "MI CC 9e", "MI MAX", "MIX 3", "Mi 10", "NM2020808", "NTN-AN20", "NX651J", "OPPO R11", "OPPO R11 Plus", "OXF-AN10", "PBET00", "PCAM00", "PCHM10", "PCKM00", "PDKT00", "PECM30", "PEDM00", "PEFM00", "PEGM00", "PEMM00", "PENM00", "PFFM10", "PFTM10", "PFVM10", "PGZ110", "PHB110", "PHF110", "PHM110", "PHY110", "PJB110", "PJE110", "PJF110", "PJG110", "PJH110", "PJJ110", "PJV110", "PJW110", "PKB110", "PTP-AN00", "RMX2173", "RMX3031", "RMX3350", "RMX3475", "RMX3560", "RMX3888", "Redmi K20 Pro", "Redmi K30", "Redmi Note 8 Pro", "SM-F9360", "SM-G9910", "SM-G998N", "SM-N9600", "SM-S9160", "SP200", "SUP-BD00", "TFY-AN00", "TNA-AN00", "V1818CT", "V1832A", "V1911A", "V1932A", "V1962A", "V1965A", "V2002A", "V2020A", "V2023A", "V2054A", "V2055A", "V2057A", "V2066A", "V2073A", "V2080A", "V2102A", "V2111A", "V2134A", "V2157A", "V2162A", "V2164KA", "V2166BA", "V2170A", "V2178A", "V2185A", "V2203A", "V2217A", "V2227A", "V2230EA", "V2232A", "V2243A", "V2245A", "V2256A", "V2278A", "V2283A", "V2301A", "V2303A", "V2312BA", "V2318A", "V2323A", "V2324A", "V2329A", "V2357A", "V2405A", "V2410A", "V2415A", "YAL-AL10", "ZTE 7541N", "vivo NEX A", "vivo X9", "21051182C", "2106118C", "2107119DC", "21091116AC", "22011211C", "2201122C", "2201123C", "22041211AC", "2206122SC", "22101317C", "2210132C", "2311DRK48C", "2312CRAD3C", "2312DRA50C", "2405CPX3DC", "24069RA21C", "24090RA29C", "AGT-AN00", "ANN-AN00", "ANY-AN00", "ASK-AL00x", "BVL-AN00", "COR-AL10", "CRT-AN00", "EBG-AN10", "ELI-AN00", "ELP-AN00", "FNE-AN00", "GAR-AN60", "HD1900", "HRY-AL00a", "Hebe-BD00", "JDY-AN00", "KOZ-AL40", "LGE-AN10", "LGN-AN00", "LRA-AL00", "M2002J9E", "M2007J1SC", "M2012K10C", "M2012K11C", "MAA-AN00", "MI 9", "MXW-AN00", "Mi 10 Pro", "NOH-AN00", "NX702J", "ONEPLUS A5000", "OPD2101", "OPPO R11s", "OW2023789", "OXF-AN00", "PAFM00", "PCAM10", "PCDM10", "PCNM00", "PCRT01", "PCT-AL10", "PDHM00", "PDYM20", "PDYT20", "PECM20", "PEGT00", "PEHM00", "PEMM20", "PERM00", "PERM10", "PESM10", "PEYM00", "PFDM00", "PFEM10", "PFGM00", "PFJM10", "PFTM20", "PFUM10", "PGAM10", "PGBM10", "PGCM10", "PGJM10", "PGKM10", "PGP110", "PGT-AN00", "PGT-AN10", "PGT110", "PHA120", "PHJ110", "PHK110", "PHP110", "PHS110", "PHW110", "PHZ110", "PJC110", "PJD110", "PJS110", "PJY110", "PKA110", "REA-AN00", "RKY-AN00", "RKY-AN10", "RMO-AN00", "RMX3615", "RMX3706", "RMX3740", "ROD-W09", "RVL-AL09", "Redmi K30 Pro", "Redmi K30 Pro Zoom Edition", "Redmi Note 7", "Redmi Note 7 Pro", "SDY-AN00", "SM-F7110", "SM-F7410", "SM-F9000", "SM-G9980", "SM-S9010", "SM-S9080", "SM-S9210", "SM-S928N", "SM-W2022", "T700-IM1075", "TEL-AN00a", "TEL-AN10", "TFY-AN40", "V1829A", "V1836A", "V1838A", "V1938CT", "V2031A", "V2031EA", "V2034A", "V2046A", "V2065A", "V2072A", "V2115A", "V2118A", "V2121A", "V2130A", "V2143A", "V2148A", "V2154A", "V2164A", "V2166A", "V2180GA", "V2199A", "V2219A", "V2239A", "V2241A", "V2271A", "V2309A", "V2337A", "V2354A", "V2359A", "V2364A", "VNE-AN40", "YAL-AL00", "vivo X21i A", "21091116AG", "21091116UC", "2109119BC", "21121210C", "2112123AC", "22021211RC", "22041216C", "2209129SC", "22095RA98C", "23049RAD8C", "2304FPN6DC", "23078RKD5C", "23090RA98C", "23117RK66C", "23124RN87C", "24018RPACC", "24053PY09C", "24115RA8EC", "ALA-AN70", "ALI-AN00", "ALP-AN00", "AiBoo-V188", "BRC-AN00", "CDY-AN90", "CHL-AN00", "DIO-AN00", "EBG-AN00", "ELZ-AN00", "ELZ-AN20", "FRI-AN00", "GDI-W09", "GIA-AN00", "HLK-AL00", "HLK-AL10", "HPB-AN00", "Hera-BD00", "LE2100", "LGE-AN00", "LLY-AN00", "LSA-AN00", "M2004J7AC", "M2007J22C", "M2011K2C", "M2101K9C", "M2102J2SC", "MAG-AN00", "Mi9 Pro 5G", "NE2210", "NTH-AN00", "OXP-AN00", "PACM00", "PADM00", "PBCM10", "PBEM00", "PCPM00", "PCRM00", "PDKM00", "PDNM00", "PDPM00", "PDRM00", "PDSM00", "PDVM00", "PEAM00", "PEAT00", "PEGM10", "PEHT00", "PEQM00", "PEUM00", "PEXM00", "PGGM10", "PGW110", "PGX110", "PHQ110", "PHU110", "PJA110", "PJU110", "REP-AN00", "RMX2205", "RMX3122", "RMX3618", "RMX3700", "RMX3708", "RMX3820", "RMX3841", "RNA-AN00", "Redmi K20 Pro Premium Edition", "Redmi K30 5G", "Redmi K30i 5G", "SM-A5260", "SM-G9750", "SM-G977N", "SM-N9860", "SM-S9180", "SM-S9280", "TDT-MA01", "TNY-AL00", "TYH601M", "TYH641M", "V1816A", "V1831A", "V1901A", "V1916A", "V1921A", "V1930A", "V1981A", "V2001A", "V2009A", "V2012A", "V2020CA", "V2036A", "V2048A", "V2049A", "V2059A", "V2068A", "V2123A", "V2131A", "V2133A", "V2156A", "V2171A", "V2183A", "V2190A", "V2207A", "V2220A", "V2229A", "V2230A", "V2238A", "V2241HA", "V2244A", "V2270A", "V2279A", "V2282A", "V2284A", "V2302A", "V2304A", "V2307A", "V2313A", "V2338A", "V2343A", "V2344A", "V2352A", "V2361A", "VCA-AN00", "VER-AN00", "VNE-AN00", "WDY-AN00");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements c52 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f31323a;
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable, Runnable runnable2) {
            this.f31323a = runnable;
            this.b = runnable2;
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
                return;
            }
            boolean d = d52Var.d();
            StringBuilder sb = new StringBuilder();
            if (d) {
                str = "fetch success!";
            } else {
                str = "fetch failed!";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(d52Var.b());
            TLog.loge(xdn.TLOG_MODULE, xdn.TAG, sb.toString());
            xdn.a(d);
            if (!d) {
                xdn.b = new Throwable(d52Var.b().toString());
                this.f31323a.run();
                return;
            }
            this.b.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform;

        static {
            int[] iArr = new int[RaceChecker$NPUPlatform.values().length];
            $SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform = iArr;
            try {
                iArr[RaceChecker$NPUPlatform.SNPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform[RaceChecker$NPUPlatform.NEURON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform[RaceChecker$NPUPlatform.HIAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform[RaceChecker$NPUPlatform.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(636485634);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        f31322a = z;
        return z;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3044c0a3", new Object[0])).booleanValue();
        }
        if (f31322a) {
            return true;
        }
        return c();
    }

    public static synchronized boolean c() {
        synchronized (xdn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db088452", new Object[0])).booleanValue();
            }
            TLog.logi(TLOG_MODULE, TAG, "RaceChecker_start");
            d52 a2 = bzn.b().a(c);
            if (!a2.d()) {
                TLog.loge(TLOG_MODULE, TAG, a2.b() + " fetch failed!");
                f31322a = false;
                return false;
            }
            f31322a = true;
            return f31322a;
        }
    }

    public static /* synthetic */ boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        f = z;
        return z;
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return l();
    }

    public static RaceChecker$NPUPlatform g() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return (RaceChecker$NPUPlatform) ipChange.ipc$dispatch("2cab75ea", new Object[0]);
        }
        String upperCase = Build.HARDWARE.toUpperCase();
        String upperCase2 = Build.MODEL.toUpperCase();
        String upperCase3 = Build.BRAND.toUpperCase();
        if (upperCase.contains("MT") || upperCase.contains("MEDIATEK")) {
            z = true;
        } else {
            z = false;
        }
        if (upperCase.contains("QCOM") || upperCase2.contains("QUALCOMM")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (upperCase3.contains(SystemUtils.PRODUCT_HUAWEI) || upperCase3.contains(SystemUtils.PRODUCT_HONOR)) {
            z3 = true;
        }
        if (z) {
            return RaceChecker$NPUPlatform.NEURON;
        }
        if (z2) {
            return RaceChecker$NPUPlatform.SNPE;
        }
        if (z3) {
            return RaceChecker$NPUPlatform.HIAI;
        }
        return RaceChecker$NPUPlatform.UNKNOWN;
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f63e971", new Object[]{str})).booleanValue();
        }
        List<String> list = l;
        if (list.contains(str) || list.contains(str.toUpperCase()) || list.contains(str.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ee23982", new Object[0])).booleanValue();
        }
        TLog.logi(TLOG_MODULE, TAG, "RaceNPUChecker_start");
        return f;
    }

    public static void j(List<String> list, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860706e8", new Object[]{list, runnable, runnable2});
        } else {
            bzn.b().e(list, new a(runnable2, runnable));
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{str});
            return;
        }
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            TLog.loge(TAG, Build.MODEL + "load library error", th);
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f115697", new Object[0])).booleanValue();
        }
        try {
            int i2 = c.$SwitchMap$com$taobao$android$racebase$RaceChecker$NPUPlatform[g().ordinal()];
            if (i2 == 1) {
                for (String str : i) {
                    k(str);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    for (String str2 : j) {
                        k(str2);
                    }
                }
                return false;
            } else {
                for (String str3 : k) {
                    k(str3);
                }
            }
            return true;
        } catch (Throwable th) {
            b = th;
            TLog.loge(TAG, Build.HARDWARE + "load library error", th);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f31324a;
        public final /* synthetic */ ucq b;
        public final /* synthetic */ Runnable c;

        public b(Runnable runnable, ucq ucqVar, Runnable runnable2) {
            this.f31324a = runnable;
            this.b = ucqVar;
            this.c = runnable2;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.f().contains("SNPE4Android")) {
                int i = bdqVar.i();
                if (i == 5) {
                    this.f31324a.run();
                    TLog.logi(xdn.TAG, "模块安装完成：SNPE4Android");
                    xdn.e(true);
                    this.b.e(this);
                    String str = BundleInfoManager.instance().getDynamicFeatureInfo("SNPE4Android").url;
                    if (xdn.f()) {
                        TLog.logi(xdn.TAG, "npu库加载完成: SNPE4Android url: " + str);
                        return;
                    }
                    TLog.logi(xdn.TAG, "npu库加载失败: SNPE4Android url: " + str);
                } else if (i == 6) {
                    TLog.loge(xdn.TAG, "模块下载失败：SNPE4Android");
                    this.c.run();
                    xdn.e(false);
                } else if (i == 13) {
                    TLog.logi(xdn.TAG, "模块下载完成：SNPE4Android");
                }
            }
        }
    }

    public static void d(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b9f7fb", new Object[]{runnable, runnable2});
        } else if (f31322a) {
            runnable.run();
        } else {
            try {
                j(c, runnable, runnable2);
            } catch (Throwable th) {
                b = th;
                f31322a = false;
                TLog.loge(TAG, "prepareRace error", th);
            }
            TLog.logi(TLOG_MODULE, TAG, "prepareRace success");
        }
    }

    public static void m(Runnable runnable, Runnable runnable2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f2ac20", new Object[]{runnable, runnable2});
            return;
        }
        TLog.logi(TLOG_MODULE, TAG, "prepareRaceNPUDepByFlexa begin");
        if (f) {
            runnable.run();
            return;
        }
        String str = Build.MODEL;
        if (!h(str)) {
            TLog.logd(TLOG_MODULE, TAG, "prepareRaceNPUDepByFlexe: " + str + " not in whitelist: ");
            f = false;
            runnable2.run();
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo("SNPE4Android") == null) {
            TLog.logd(TLOG_MODULE, TAG, "SNPE4Android不是dynamicFeature");
            f = true;
        } else {
            try {
                ucq h2 = com.taobao.appbundle.a.Companion.a().h();
                if (h2 == null) {
                    runnable2.run();
                    f = false;
                } else if (h2.f().contains("SNPE4Android")) {
                    TLog.loge(TAG, "模块已经安装完成：SNPE4Android");
                    f = true;
                } else {
                    h2.g(new b(runnable, h2, runnable2));
                    h2.c(xcq.c().l("SNPE4Android").n());
                    TLog.logi(TAG, "模块开始下载：SNPE4Android");
                }
            } catch (Throwable th) {
                b = th;
                f = false;
                TLog.loge(TAG, Build.HARDWARE + "prepareRaceNpuDep error", th);
            }
        }
    }
}
