package tb;

import android.net.Uri;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.vivo.push.PushClientConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.android.agoo.common.Config;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class y71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_ERROR_POINT = "JavaScriptError";
    public static final String MONITOR_MATCH_URL_FAILED = "urlMatchFailed";
    public static final String MONITOR_MODULE = "WindVane";
    public static final String MONITOR_POINT_CORE_INIT_TIME = "CoreInitTime";
    public static final String MONITOR_POINT_CORE_REUSE = "CoreReuse";
    public static final String MONITOR_POINT_CORE_TYPE_BY_PV = "CoreTypeByPV";
    public static final String MONITOR_POINT_DEAL_URL_SCHEME = "dealUrlScheme";
    public static final String MONITOR_POINT_DECODER_INIT_TYPE = "DecoderInit";
    public static final String MONITOR_POINT_DECODE_IMG_TYPE = "DecodeImg";
    public static final String MONITOR_POINT_DECODE_IMG_URL_TYPE = "DecodeImgFailURL";
    public static final String MONITOR_POINT_EMBED_VIEW = "EmbedView";
    public static final String MONITOR_POINT_FSP_TIME = "FSP";
    public static final String MONITOR_POINT_GPU_PROCESS_GONE_TYPE = "GpuProcessGone";
    public static final String MONITOR_POINT_KERNEL_DECOMPRESS = "ucKernelDecompress";
    public static final String MONITOR_POINT_MULTI_PROCESS = "MultiProcess";
    public static final String MONITOR_POINT_MULTI_PROCESS_BY_PV = "MultiProcessByPV";
    public static final String MONITOR_POINT_NEW_SECURITY_BLOCK = "NewSecurityBlock";
    public static final String MONITOR_POINT_PARAM_PARSE_ERROR = "ParamParseError";
    public static final String MONITOR_POINT_SYS_WEBVIEW = "SystemWebView";
    public static final String MONITOR_POINT_URL_CONFIG_FILTER_TYPE = "UrlConfigFilterType";
    public static final String MONITOR_POINT_URL_CONFIG_JS_API_TYPE = "UrlConfigJsApiType";
    public static final String MONITOR_POINT_WEBP_RESOURCE = "WebpResource";
    public static final String MONITOR_POINT_WEBVIEW_WRAP_TYPE = "WebViewWrapType";
    public static final String MONITOR_POINT_WEB_CORE_TYPE = "WebViewCoreType";
    public static final String MONITOR_POINT_WEB_CORE_TYPE_BY_PV = "WebViewCoreTypeByPV";
    public static final String MONITOR_POINT_WHITEPAGE_DATA = "WhitePageData";
    public static final String MONITOR_POINT_WV_CONSECUTIVE_DECODE_ERROR = "WVConsecutiveDecodeError";
    public static final String MONITOR_POINT_WV_INIT_TIME = "WVInitTime";
    public static final String MONITOR_POINT_WV_PREFETCH = "WVPrefetch";
    public static final String MONITOR_POINT_ZCACHE_DOWNLOAD_TIME = "ZCacheDownLoadTime";
    public static final String MONITOR_POINT_ZCACHE_RESPONSE_TIME_OUT = "ZcacheResponseTime";
    public static final String NATIVE_ERROR_POINT = "NativeError";
    public static boolean OFF = false;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f31889a = new AtomicBoolean(false);
    public static int b = 0;

    static {
        t2o.a(989856315);
    }

    public static Measure a(String str, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("287b492c", new Object[]{str, new Double(d), new Double(d2)});
        }
        Measure measure = new Measure(str);
        measure.setRange(Double.valueOf(d), Double.valueOf(d2));
        return measure;
    }

    public static void b(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6692bb41", new Object[]{dimensionValueSet, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            dimensionValueSet.setValue(str, str2);
        }
    }

    public static void commitConifgUpdateError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ff98dc", new Object[]{str, new Integer(i), str2});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", Config.TAG, str, Integer.toString(i), str2);
        }
    }

    public static void commitConifgUpdateInfo(String str, int i, long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1582f88", new Object[]{str, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("name", str);
                create.setValue("from", Integer.toString(i));
                create.setValue("isSuccess", Integer.toString(i2));
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue(StWindow.UPDATE_TIME, j);
                create2.setValue("updateCount", i3);
                AppMonitor.Stat.commit("WindVane", Config.TAG, create, create2);
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor exception");
            }
        }
    }

    public static void commitConifgUpdateSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c820c74c", new Object[]{str});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitSuccess("WindVane", Config.TAG, str);
        }
    }

    public static void commitCoreInitTime(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62851eb4", new Object[]{new Long(j), str});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue(RVStartParams.KEY_FROM_TYPE, str);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("initTime", j);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_CORE_INIT_TIME, create, create2);
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitCoreInitTime exception");
            }
        }
    }

    public static void commitCounter(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b92fa5e", new Object[]{str, str2, new Double(d)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Counter.commit("WindVane", str, str2, d);
        }
    }

    public static void commitEmptyPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c16b20", new Object[]{str, str2});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            v7t.n("AppMonitorUtil", "Webview commitEmptyPage : " + str);
            AppMonitor.Alarm.commitFail("WindVane", "PageEmpty", str, "101", str2);
        }
    }

    public static void commitFSPInfo(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7c6db9", new Object[]{str, new Long(j)});
        } else if (str != null && j != 0) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue(MonitorItemConstants.KEY_URL, str);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_FSP_TIME, create, create2);
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor paramParseError exception");
            }
        }
    }

    public static void commitFail(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac00091", new Object[]{str, new Integer(i), str2, str3});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", str, str3, Integer.toString(i), str2);
        }
    }

    public static void commitInSecurityHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52169375", new Object[]{str});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", "insecurityHost", "101", str);
        }
    }

    public static void commitJsBridgeReturn(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304a748", new Object[]{str, str2, str3, str4});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("name", str);
                create.setValue(rb.RESULT_KEY, str2);
                create.setValue("message", str3);
                create.setValue("url", str4);
                AppMonitor.Stat.commit("WindVane", "JSBridgeReturn", create, MeasureValueSet.create());
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitJsBridgeReturn exception");
            }
        }
    }

    public static void commitJsError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c20e2d", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail("WindVane", "JsError", str, str2, str3);
        }
    }

    public static void commitOffMonitor(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c69e27", new Object[]{str, str2, str3});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", "OffMonitor", str2, str3, str);
        }
    }

    public static void commitPackageVisitStartInfo(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c997bf", new Object[]{str, new Long(j)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue(PushClientConstants.TAG_PKG_NAME, str);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                AppMonitor.Stat.commit("WindVane", "PackageVisitStart", create, create2);
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitPackageVisitStartInfo exception");
            }
        }
    }

    public static void commitParamParseError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1775567a", new Object[]{str, str2, str3, str4});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str);
                create.setValue("crashInfo", str2);
                create.setValue("params", str3);
                create.setValue("invokeMethod", str4);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_PARAM_PARSE_ERROR, create, MeasureValueSet.create());
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor paramParseError exception");
            }
        }
    }

    public static void commitPreloadMainHtmlInfo(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e97819", new Object[]{str, new Long(j), str2});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("type", str2);
                if (!TextUtils.isEmpty(str)) {
                    create.setValue("url", gtw.i(str));
                }
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                v7t.i("AppMonitorUtil", "preloadMainHtml use : " + j + "ms, url : " + gtw.i(str));
                AppMonitor.Stat.commit("WindVane", "preloadMainHtml", create, create2);
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitStartTimeInfo exception");
            }
        }
    }

    public static void commitRenderType(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fc1802", new Object[]{str, new Integer(i), new Integer(i2), str2});
            return;
        }
        if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("web_init_mode", String.valueOf(i));
                create.setValue("web_succ_mode", String.valueOf(i2));
                create.setValue("background", str2);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_MULTI_PROCESS, create, MeasureValueSet.create());
            } catch (Throwable unused) {
            }
        }
    }

    public static void commitRenderTypeByPV(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3ec307", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("web_init_mode", str);
                create.setValue("web_succ_mode", str2);
                create.setValue("web_succ_reason", str3);
                create.setValue("gpu_init_mode", str4);
                create.setValue("gpu_succ_mode", str5);
                create.setValue("gpu_succ_reason", str6);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_MULTI_PROCESS_BY_PV, create, MeasureValueSet.create());
            } catch (Throwable unused) {
            }
        }
    }

    public static void commitSecurityWarning(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a45b20", new Object[]{str, str2});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", "SecurityWarning", str2, "101", str);
        }
    }

    public static void commitStartTimeInfo(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0337ed", new Object[]{str, new Long(j)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                if (!TextUtils.isEmpty(str)) {
                    create.setValue("url", gtw.i(str));
                }
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                v7t.i("AppMonitorUtil", "Webview start after : " + j + "ms, url : " + gtw.i(str));
                AppMonitor.Stat.commit("WindVane", "WebViewStart", create, create2);
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitStartTimeInfo exception");
            }
        }
    }

    public static void commitStatusCode(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88f3ccf", new Object[]{str, str2, str3, str4, str5});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("isHTML", str4);
                create.setValue("statusCode", str3);
                create.setValue("referrer", str2);
                create.setValue("bizCode", str5);
                AppMonitor.Stat.commit("WindVane", "StatusCode", create, MeasureValueSet.create());
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitStatusCode exception");
            }
        }
    }

    public static void commitSuccess(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitSuccess("WindVane", str, str2);
        }
    }

    public static void commitUCWebviewError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97154259", new Object[]{str, str2, str3});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            AppMonitor.Alarm.commitFail("WindVane", "WVUcwebview", str3, str, str2);
        }
    }

    public static void commitUseWebgl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff54e1a", new Object[]{str});
            return;
        }
        if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                Uri parse = Uri.parse(str);
                create.setValue("url", parse.getHost() + parse.getPath());
                AppMonitor.Stat.commit("WindVane", "UseWebGl", create, MeasureValueSet.create());
            } catch (Throwable unused) {
            }
        }
    }

    public static void commitWPData(String str, WVWPData wVWPData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f3854a", new Object[]{str, wVWPData});
            return;
        }
        if (f31889a.get() && wVWPData != null) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("page_current_status", wVWPData.pageCurrentStatus);
                create.setValue("probable_reason", wVWPData.probableReason);
                create.setValue("html_error", wVWPData.htmlError);
                create.setValue("js_error_code", wVWPData.jsErrorCode);
                create.setValue("js_error", wVWPData.jsError);
                create.setValue("js_error_stack", wVWPData.stack);
                create.setValue("uc_bkpg", String.valueOf(wVWPData.ucBkpg));
                create.setValue("init_render_mode", wVWPData.initRenderType);
                create.setValue("init_gpu_mode", wVWPData.initGpuType);
                create.setValue("real_render_mode", wVWPData.realRenderType);
                create.setValue("real_gpu_mode", wVWPData.realGpuType);
                create.setValue("progress", wVWPData.progress);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue(lca.STAGE_T2, Double.parseDouble(wVWPData.t2));
                create2.setValue("loadurl", System.currentTimeMillis() - wVWPData.timeLoadurl);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_WHITEPAGE_DATA, create, create2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void commitWVInitTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9952897a", new Object[]{new Long(j), new Long(j2)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                MeasureValueSet create = MeasureValueSet.create();
                create.setValue("tbInitTime", j2);
                create.setValue("wvInitTime", j);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_WV_INIT_TIME, DimensionValueSet.create(), create);
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitWVInitTime exception");
            }
        }
    }

    public static void commitWVPrefetchInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3bf096", new Object[]{str, str2, str3, str4, str5, str6, new Boolean(z)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                b(create, "webUrl", str);
                b(create, "url", str2);
                b(create, "externalKey", str3);
                b(create, "method", str4);
                b(create, "code", str5);
                b(create, "msg", str6);
                b(create, "isSuccess", String.valueOf(z));
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_WV_PREFETCH, create, MeasureValueSet.create());
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitWVPrefetchInfo exception");
            }
        }
    }

    public static void commitWVWrapType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e799a2b", new Object[]{str});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("type", str);
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_WEBVIEW_WRAP_TYPE, create, MeasureValueSet.create());
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitWVWrapType exception");
            }
        }
    }

    public static void commitWebPerfCheckInfo(String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235e2ca1", new Object[]{str, new Long(j), str2, str3, str4});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("version", str2);
                create.setValue(UploadConstants.BIZ_CODE, str3);
                create.setValue("result", str4);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("score", j);
                AppMonitor.Stat.commit("WindVane", "WebPerformanceCheck", create, create2);
            } catch (Exception unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitPackageUpdateStartInfo exception");
            }
        }
    }

    public static void commitZCacheDownLoadTime(String str, String str2, long j, long j2, long j3, String str3, boolean z) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31906d5", new Object[]{str, str2, new Long(j), new Long(j2), new Long(j3), str3, new Boolean(z)});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                MeasureValueSet create = MeasureValueSet.create();
                create.setValue("zcacheDownLoadTime", j2);
                create.setValue("zcacheTaskTime", j3);
                create.setValue(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, j);
                DimensionValueSet create2 = DimensionValueSet.create();
                create2.setValue("ztype", str);
                create2.setValue("appName", str2);
                create2.setValue("msg", str3);
                if (z) {
                    str4 = "true";
                } else {
                    str4 = "false";
                }
                create2.setValue("isSuccess", str4);
                AppMonitor.Stat.commit("ZCache", MONITOR_POINT_ZCACHE_DOWNLOAD_TIME, create2, create);
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitZCacheDownLoadTime exception");
            }
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            if (f31889a.compareAndSet(false, true)) {
                DimensionSet create = DimensionSet.create();
                create.addDimension("url");
                create.addDimension("version");
                create.addDimension(UploadConstants.BIZ_CODE);
                create.addDimension("result");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure(a("score", vu3.b.GEO_NOT_SUPPORT, 100.0d));
                AppMonitor.register("WindVane", "WebPerformanceCheck", create2, create);
                DimensionSet create3 = DimensionSet.create();
                create3.addDimension(PushClientConstants.TAG_PKG_NAME);
                MeasureSet create4 = MeasureSet.create();
                create4.addMeasure(a("time", vu3.b.GEO_NOT_SUPPORT, 4.32E7d));
                AppMonitor.register("WindVane", "PackageVisitStart", create4, create3);
                DimensionSet create5 = DimensionSet.create();
                create5.addDimension("url");
                MeasureSet create6 = MeasureSet.create();
                create6.addMeasure(a("time", vu3.b.GEO_NOT_SUPPORT, 1800000.0d));
                AppMonitor.register("WindVane", "WebViewStart", create6, create5);
                DimensionSet create7 = DimensionSet.create();
                create7.addDimension("name");
                create7.addDimension("from");
                create7.addDimension("isSuccess");
                MeasureSet create8 = MeasureSet.create();
                create8.addMeasure(a(StWindow.UPDATE_TIME, vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create8.addMeasure(a("updateCount", vu3.b.GEO_NOT_SUPPORT, 1000.0d));
                AppMonitor.register("WindVane", Config.TAG, create8, create7);
                DimensionSet create9 = DimensionSet.create();
                create9.addDimension("url");
                create9.addDimension("isHTML");
                create9.addDimension("statusCode");
                create9.addDimension("referrer");
                create9.addDimension("bizCode");
                AppMonitor.register("WindVane", "StatusCode", MeasureSet.create(), create9);
                DimensionSet create10 = DimensionSet.create();
                create10.addDimension("name");
                create10.addDimension(rb.RESULT_KEY);
                create10.addDimension("msg");
                create10.addDimension("url");
                AppMonitor.register("WindVane", "JSBridgeReturn", MeasureSet.create(), create10);
                MeasureSet create11 = MeasureSet.create();
                create11.addMeasure("tbInitTime");
                create11.addMeasure("wvInitTime");
                AppMonitor.register("WindVane", MONITOR_POINT_WV_INIT_TIME, create11);
                MeasureSet create12 = MeasureSet.create();
                create12.addMeasure("zcacheDownLoadTime");
                create12.addMeasure("zcacheTaskTime");
                create12.addMeasure(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME);
                DimensionSet create13 = DimensionSet.create();
                create13.addDimension("appName");
                create13.addDimension("msg");
                create13.addDimension("isSuccess");
                AppMonitor.register("ZCache", MONITOR_POINT_ZCACHE_DOWNLOAD_TIME, create12, create13);
                DimensionSet create14 = DimensionSet.create();
                create14.addDimension("type");
                AppMonitor.register("WindVane", MONITOR_POINT_WEBVIEW_WRAP_TYPE, MeasureSet.create(), create14);
                DimensionSet create15 = DimensionSet.create();
                create15.addDimension(RVStartParams.KEY_FROM_TYPE);
                MeasureSet create16 = MeasureSet.create();
                create16.addMeasure("initTime");
                AppMonitor.register("WindVane", MONITOR_POINT_CORE_INIT_TIME, create16, create15);
                DimensionSet create17 = DimensionSet.create();
                create17.addDimension(RVStartParams.KEY_FROM_TYPE);
                create17.addDimension("coreType");
                create17.addDimension("version");
                create17.addDimension("url");
                AppMonitor.register("WindVane", MONITOR_POINT_CORE_TYPE_BY_PV, MeasureSet.create(), create17);
                DimensionSet create18 = DimensionSet.create();
                create18.addDimension("url");
                create18.addDimension("web_init_mode");
                create18.addDimension("web_succ_mode");
                create18.addDimension("background");
                AppMonitor.register("WindVane", MONITOR_POINT_MULTI_PROCESS, MeasureSet.create(), create18);
                DimensionSet create19 = DimensionSet.create();
                create19.addDimension("web_init_mode");
                create19.addDimension("web_succ_mode");
                create19.addDimension("web_succ_reason");
                create19.addDimension("gpu_succ_mode");
                create19.addDimension("gpu_succ_mode");
                create19.addDimension("gpu_succ_reason");
                AppMonitor.register("WindVane", MONITOR_POINT_MULTI_PROCESS_BY_PV, MeasureSet.create(), create18);
                DimensionSet create20 = DimensionSet.create();
                create20.addDimension("url");
                AppMonitor.register("WindVane", "UseWebGl", MeasureSet.create(), create20);
                DimensionSet create21 = DimensionSet.create();
                create21.addDimension("uc_bkpg");
                create21.addDimension("page_current_status");
                create21.addDimension("init_render_mode");
                create21.addDimension("init_gpu_mode");
                create21.addDimension("real_render_mode");
                create21.addDimension("real_gpu_mode");
                create21.addDimension("progress");
                create21.addDimension("url");
                create21.addDimension("probable_reason");
                create21.addDimension("html_error");
                create21.addDimension("js_error");
                create21.addDimension("js_error_stack");
                MeasureSet create22 = MeasureSet.create();
                create22.addMeasure(lca.STAGE_T2);
                create22.addMeasure("loadurl");
                AppMonitor.register("WindVane", MONITOR_POINT_WHITEPAGE_DATA, create22, create21);
                DimensionSet create23 = DimensionSet.create();
                create23.addDimension("pageUrl");
                create23.addDimension("crashInfo");
                create23.addDimension("params");
                create23.addDimension("invokeMethod");
                AppMonitor.register("WindVane", MONITOR_POINT_PARAM_PARSE_ERROR, MeasureSet.create(), create23);
                DimensionSet create24 = DimensionSet.create();
                create24.addDimension("url");
                create24.addDimension(TBImageFlowMonitor.VIA);
                create24.addDimension(PushClientConstants.TAG_PKG_NAME);
                create24.addDimension("pkgVersion");
                create24.addDimension("pkgSeq");
                create24.addDimension(RVStartParams.KEY_FROM_TYPE);
                create24.addDimension("protocolType");
                create24.addDimension("hasInit");
                create24.addDimension("isFinished");
                create24.addDimension("statusCode");
                create24.addDimension("verifyError");
                create24.addDimension("inMainProcess");
                MeasureSet create25 = MeasureSet.create();
                create25.addMeasure(a("verifyResTime", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("verifyTime", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("verifyCacheSize", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("allVerifyTime", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("initTime", vu3.b.GEO_NOT_SUPPORT, 60000.0d));
                create25.addMeasure(a("tcp", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("ssl", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("firstByte", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("domLoad", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("pageLoad", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("c", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("dc", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("dcl", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("dl", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("dns", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("lee", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("les", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("req", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("rpe", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("rps", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                create25.addMeasure(a("scs", vu3.b.GEO_NOT_SUPPORT, 600000.0d));
                AppMonitor.register("WindVane", "H5", create25, create24);
                AppMonitor.register("WindVane", "H5_2", create25, create24);
                AppMonitor.register("WindVane", "H5_3", create25, create24);
                AppMonitor.register("WindVane", "H5_4", create25, create24);
                AppMonitor.register("WindVane", "H5_5", create25, create24);
                DimensionSet create26 = DimensionSet.create();
                create26.addDimension("type");
                create26.addDimension("url");
                MeasureSet create27 = MeasureSet.create();
                create27.addMeasure(a("time", vu3.b.GEO_NOT_SUPPORT, 1800000.0d));
                AppMonitor.register("WindVane", "preloadMainHtml", create27, create26);
                DimensionSet create28 = DimensionSet.create();
                create17.addDimension("webUrl");
                create17.addDimension("url");
                create17.addDimension("externalKey");
                create17.addDimension("method");
                create17.addDimension("code");
                create17.addDimension("msg");
                create17.addDimension("isSuccess");
                AppMonitor.register("WindVane", MONITOR_POINT_WV_PREFETCH, MeasureSet.create(), create28);
            }
        } catch (Throwable unused) {
            v7t.i("AppMonitorUtil", "AppMonitor not found");
            f31889a.set(false);
        }
    }

    public static void commitCoreTypeByPV(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee480cbc", new Object[]{str, str2, str3, str4});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue(RVStartParams.KEY_FROM_TYPE, str);
                create.setValue("coreType", str2);
                create.setValue("version", str3);
                create.setValue("url", str4);
                int i = b;
                b = 1 + i;
                create.setValue("coreTypeCount", String.valueOf(i));
                AppMonitor.Stat.commit("WindVane", MONITOR_POINT_CORE_TYPE_BY_PV, create, MeasureValueSet.create());
            } catch (Throwable unused) {
                v7t.i("AppMonitorUtil", "AppMonitor commitCoreTypeByPV exception");
            }
        }
    }

    public static void commitFail(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c452e0", new Object[]{str, str2, jSONObject});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get() && jSONObject != null) {
            try {
                AppMonitor.Alarm.commitFail("WindVane", str, str2, jSONObject.toJSONString());
            } catch (Exception unused) {
            }
        }
    }

    public static void commitPerformanceInfo(qrw qrwVar) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9470dc67", new Object[]{qrwVar});
        } else if (vpw.commonConfig.f30848a != 0 && f31889a.get()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", qrwVar.url);
                create.setValue(TBImageFlowMonitor.VIA, qrwVar.args.via);
                create.setValue(PushClientConstants.TAG_PKG_NAME, qrwVar.stat.packageAppName);
                create.setValue("pkgVersion", qrwVar.stat.packageAppVersion);
                create.setValue("pkgSeq", qrwVar.stat.appSeq);
                create.setValue(RVStartParams.KEY_FROM_TYPE, String.valueOf(qrwVar.stat.fromType));
                if (qrwVar.isInit) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                create.setValue("hasInit", str2);
                create.setValue("isFinished", String.valueOf(qrwVar.stat.finish));
                create.setValue("statusCode", String.valueOf(qrwVar.args.statusCode));
                create.setValue("verifyError", String.valueOf(qrwVar.stat.verifyError));
                create.setValue("protocolType", qrwVar.protocolType);
                if (x74.l(yaa.n)) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                create.setValue("inMainProcess", str3);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("verifyResTime", qrwVar.stat.verifyResTime);
                create2.setValue("verifyTime", qrwVar.stat.verifyTime);
                create2.setValue("verifyCacheSize", qrwVar.stat.verifyCacheSize);
                create2.setValue("allVerifyTime", qrwVar.stat.allVerifyTime);
                create2.setValue("initTime", qrwVar.init);
                create2.setValue("tcp", vu3.b.GEO_NOT_SUPPORT);
                create2.setValue("ssl", vu3.b.GEO_NOT_SUPPORT);
                create2.setValue("firstByte", qrwVar.stat.firstByteTime);
                create2.setValue("domLoad", qrwVar.stat.onDomLoad);
                create2.setValue("pageLoad", qrwVar.stat.onLoad);
                org.json.JSONObject jSONObject = null;
                try {
                    if (!TextUtils.isEmpty(qrwVar.performanceInfo)) {
                        String str4 = qrwVar.performanceInfo;
                        if (str4.startsWith("\"") && str4.endsWith("\"")) {
                            str4 = qrwVar.performanceInfo.substring(1, str4.length() - 1);
                        }
                        jSONObject = new org.json.JSONObject(str4.replace("\\", ""));
                    }
                } catch (Exception unused) {
                }
                if (jSONObject != null) {
                    create2.setValue("c", jSONObject.optInt("c", 0));
                    create2.setValue("dc", jSONObject.optInt("dc", 0));
                    create2.setValue("dcl", jSONObject.optInt("dcl", 0));
                    create2.setValue("dl", jSONObject.optInt("dl", 0));
                    create2.setValue("dns", jSONObject.optInt("dns", 0));
                    create2.setValue("lee", jSONObject.optInt("lee", 0));
                    create2.setValue("les", jSONObject.optInt("les", 0));
                    create2.setValue("req", jSONObject.optInt("req", 0));
                    create2.setValue("rpe", jSONObject.optInt("rpe", 0));
                    create2.setValue("rps", jSONObject.optInt("rps", 0));
                    create2.setValue("scs", jSONObject.optInt("scs", 0));
                }
                int i = qrwVar.wvAppMonitor;
                String str5 = "H5";
                if (i != 1) {
                    if (i == 2) {
                        str5 = "H5_2";
                    } else if (i == 3) {
                        str5 = "H5_3";
                    } else if (i == 4) {
                        str5 = "H5_4";
                    } else if (i == 5) {
                        str5 = "H5_5";
                    }
                }
                AppMonitor.Stat.commit("WindVane", str5, create, create2);
                if (v7t.h() && qrwVar.stat != null) {
                    str = "AppMonitorUtil";
                    try {
                        v7t.d(str, "PERFORMANCE : " + qrwVar.url + ": pageLoad : " + qrwVar.stat.onLoad + " fromType : " + qrwVar.stat.fromType);
                    } catch (Exception unused2) {
                        v7t.i(str, "AppMonitor exception");
                    }
                }
            } catch (Exception unused3) {
                str = "AppMonitorUtil";
            }
        }
    }

    public static void commitSuccess(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53daee33", new Object[]{str, jSONObject});
            return;
        }
        if (!(str == null || jSONObject == null)) {
            try {
                commitSuccess(str, jSONObject.toJSONString());
            } catch (Exception unused) {
            }
        }
    }
}
