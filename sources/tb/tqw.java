package tb;

import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.performance2.WVWPManager;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class tqw implements uqw, vqw, wqw, yqw, zqw, xqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Pattern URL_FILTER_PATTERN;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28893a = tqw.class.getSimpleName();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(989856318);
        t2o.a(989856320);
        t2o.a(989856321);
        t2o.a(989856322);
        t2o.a(989856324);
        t2o.a(989856325);
        t2o.a(989856323);
    }

    public tqw() {
        AtomicBoolean atomicBoolean = b;
        try {
            if (atomicBoolean.compareAndSet(false, true)) {
                DimensionSet create = DimensionSet.create();
                create.addDimension("api");
                create.addDimension(rb.RESULT_KEY);
                create.addDimension("url");
                create.addDimension("msg");
                MeasureSet create2 = MeasureSet.create();
                AppMonitor.register("WindVane", "MtopPlugin", create2, create);
                DimensionSet create3 = DimensionSet.create();
                create3.addDimension("pageUrl");
                create3.addDimension("method");
                create3.addDimension("requestUrl");
                AppMonitor.register("WindVane", "H5FormatRequest", create2, create3);
                DimensionSet create4 = DimensionSet.create();
                create4.addDimension("pageUrl");
                create4.addDimension(jk.KEY_RET_CODE);
                create4.addDimension("requestUrl");
                create4.addDimension("isHtml");
                AppMonitor.register("WindVane", "H5HttpResponse", create2, create4);
                DimensionSet create5 = DimensionSet.create();
                create5.addDimension("pageUrl");
                create5.addDimension("isSuccess");
                create5.addDimension("requestUrl");
                create5.addDimension("mimeType");
                AppMonitor.register("WindVane", "ZCacheResponse", create2, create5);
                DimensionSet create6 = DimensionSet.create();
                create6.addDimension("url");
                create6.addDimension("Type");
                MeasureSet create7 = MeasureSet.create();
                create7.addMeasure("time");
                AppMonitor.register("WindVane", "WVPerformance", create7, create6);
            }
        } catch (Throwable unused) {
            v7t.i(f28893a, "AppMonitor not found");
            atomicBoolean.set(false);
        }
    }

    @Override // tb.wqw
    public void onFormatRequest(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f32c4de", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && b.get() && vpw.commonConfig.o0 >= Math.random()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str2);
                create.setValue("method", str3);
                create.setValue("requestUrl", str);
                AppMonitor.Stat.commit("WindVane", "H5FormatRequest", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str4 = f28893a;
                v7t.d(str4, "onFormatRequest monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // tb.uqw
    public void onJsBridgeReturn(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a49f0", new Object[]{this, str, str2, str3, str4});
        } else {
            y71.commitJsBridgeReturn(str, str2, str3, str4);
        }
    }

    @Override // tb.uqw
    public void onMtopJsBridgeReturn(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba1258", new Object[]{this, str, str2, str3, str4});
        } else if (!TextUtils.isEmpty(str) && b.get() && vpw.commonConfig.p0 >= Math.random()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("api", str);
                create.setValue(rb.RESULT_KEY, str2);
                create.setValue("url", str4);
                create.setValue("msg", str3);
                AppMonitor.Stat.commit("WindVane", "MtopPlugin", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str5 = f28893a;
                v7t.d(str5, "onMtopJsBridgeReturn monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // tb.vqw
    public void onOccurJsError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3260d7", new Object[]{this, str, str2, str3});
        } else if (vpw.commonConfig.m0 >= Math.random()) {
            y71.commitJsError(str, str2, str3);
        }
    }

    @Override // tb.yqw
    public void onOccurWhitePage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c1bea6", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                WVWPData findDataByUrl = WVWPManager.getInstance().findDataByUrl(str);
                String str3 = f28893a;
                v7t.d(str3, "onOccurWhitePage " + str + findDataByUrl);
                if (vpw.commonConfig.n0 >= Math.random()) {
                    y71.commitWPData(str, findDataByUrl);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // tb.zqw
    public void onZCacheResponse(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b80495b", new Object[]{this, str, str2, new Boolean(z), str3});
        } else if (!TextUtils.isEmpty(str) && b.get() && vpw.commonConfig.q0 >= Math.random()) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str2);
                create.setValue("isSuccess", z + "");
                create.setValue("requestUrl", str);
                create.setValue("mimeType", str3);
                AppMonitor.Stat.commit("WindVane", "ZCacheResponse", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str4 = f28893a;
                v7t.d(str4, "onZacheResponse: occur exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // tb.xqw
    public void recordDeviceCreateTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce85503", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str) && b.get()) {
            String str2 = f28893a;
            v7t.a(str2, "recordDeviceCreateTime url:" + str + " useTime=" + j);
            if (vpw.commonConfig.s0 >= Math.random()) {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("url", str);
                    create.setValue("Type", "DeviceCreate");
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("time", j);
                    AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
                } catch (Throwable th) {
                    String str3 = f28893a;
                    v7t.d(str3, "recordDeviceCreateTime monitor exception:" + th);
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // tb.xqw
    public void recordFSP(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49c9ee1", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str) && b.get()) {
            String str2 = f28893a;
            v7t.a(str2, "recordFSP url:" + str + " useTime=" + j);
            if (vpw.commonConfig.s0 >= Math.random()) {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("url", str);
                    create.setValue("Type", y71.MONITOR_POINT_FSP_TIME);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("time", j);
                    AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
                } catch (Throwable th) {
                    String str3 = f28893a;
                    v7t.d(str3, "recordFSP monitor exception:" + th);
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // tb.xqw
    public void recordTTI(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea48f7b", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str) && b.get()) {
            String str2 = f28893a;
            v7t.a(str2, "recordTTI url:" + str + " useTime=" + j);
            if (vpw.commonConfig.s0 >= Math.random()) {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("url", str);
                    create.setValue("Type", "TTI");
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("time", j);
                    AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
                } catch (Throwable th) {
                    String str3 = f28893a;
                    v7t.d(str3, "recordTTI monitor exception:" + th);
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // tb.wqw
    public void onResponse(String str, String str2, int i, boolean z, Map<String, List<String>> map) {
        String str3;
        List<String> list;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33aefb39", new Object[]{this, str, str2, new Integer(i), new Boolean(z), map});
        } else if (!TextUtils.isEmpty(str) && b.get()) {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.U0 && i == -202) {
                if (URL_FILTER_PATTERN == null) {
                    synchronized (tqw.class) {
                        URL_FILTER_PATTERN = Pattern.compile(wpwVar.V0);
                    }
                }
                if (URL_FILTER_PATTERN != null && !URL_FILTER_PATTERN.matcher(str).find()) {
                    return;
                }
            }
            if (!wpwVar.U0 || i != 404 || TextUtils.isEmpty(str) || (split = str.split("\\?")) == null || split.length < 1 || TextUtils.isEmpty(split[0]) || !split[0].contains("hybird.miniapp.taobao.com")) {
                if (!wpwVar.v2 || i != 302 || map == null || (list = map.get("x-wormhole-error")) == null || list.isEmpty() || !TextUtils.equals(list.get(0), "404")) {
                    Map<String, String> map2 = wpwVar.F0;
                    if (map2 != null) {
                        String valueOf = String.valueOf(i);
                        if (map2.containsKey(valueOf)) {
                            if (Double.parseDouble(map2.get(valueOf)) < Math.random()) {
                                return;
                            }
                        }
                    }
                    if (wpwVar.o0 < Math.random()) {
                        return;
                    }
                }
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("pageUrl", str2);
                    create.setValue(jk.KEY_RET_CODE, i + "");
                    create.setValue("requestUrl", str);
                    if (z) {
                        str3 = "true";
                    } else {
                        str3 = "false";
                    }
                    create.setValue("isHtml", str3);
                    chb g = c21.g();
                    if (g != null) {
                        String string = g.getString("lastJumpPageSchemaUrl", "unknown");
                        if (!TextUtils.isEmpty(string)) {
                            create.setValue("lastJumpPageUrl", string);
                        }
                    }
                    if (map != null) {
                        map.remove(null);
                        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                        treeMap.putAll(map);
                        Iterator it = new ArrayList(Arrays.asList("x-air-trace-id", "eagleeye-traceid", HttpConstant.Content_MD52, TBImageFlowMonitor.VIA, "content-type")).iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            List list2 = (List) treeMap.get(str4);
                            if (list2 != null && !list2.isEmpty()) {
                                String str5 = (String) list2.get(0);
                                if (!TextUtils.isEmpty(str5)) {
                                    create.setValue(str4, str5);
                                }
                            }
                        }
                    }
                    AppMonitor.Stat.commit("WindVane", "H5HttpResponse", create, MeasureValueSet.create());
                    String str6 = f28893a;
                    v7t.d(str6, "onResponse retCode:" + i + " pageUrl:" + str2 + " requestUrl:" + str);
                } catch (Throwable th) {
                    String str7 = f28893a;
                    v7t.d(str7, "onResponse monitor exception:" + th);
                    th.printStackTrace();
                }
            }
        }
    }
}
