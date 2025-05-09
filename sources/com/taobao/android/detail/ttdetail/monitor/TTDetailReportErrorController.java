package com.taobao.android.detail.ttdetail.monitor;

import android.app.Application;
import android.content.pm.PackageManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.ReportErrorParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.ckf;
import tb.dy3;
import tb.hjh;
import tb.j2o;
import tb.o91;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class TTDetailReportErrorController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "TTDetailReportErrorController";

    /* renamed from: a  reason: collision with root package name */
    public static String f6866a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262094);
        }

        public Companion() {
        }

        public final void a(Map<String, String> map, Integer num) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a37b82ce", new Object[]{this, map, num});
                return;
            }
            HashMap<Integer, String> b = b(num);
            if (b != null) {
                ReportErrorParams reportErrorParams = new ReportErrorParams();
                reportErrorParams.setApp(TimeCalculator.PLATFORM_ANDROID);
                String str6 = "";
                if (map == null || (str = map.get("itemId")) == null) {
                    str = str6;
                }
                reportErrorParams.setItemId(str);
                String str7 = b.get(num);
                if (str7 == null) {
                    str7 = str6;
                }
                reportErrorParams.setCode(str7);
                if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
                    str2 = str6;
                }
                reportErrorParams.setSubCode(str2);
                if (map == null || (str3 = JSON.toJSONString(map)) == null) {
                    str3 = str6;
                }
                reportErrorParams.setFeature(str3);
                if (map == null || (str4 = map.get("traceId")) == null) {
                    str4 = str6;
                }
                reportErrorParams.setTraceId(str4);
                String d = TTDetailReportErrorController.Companion.d();
                if (d == null) {
                    d = str6;
                }
                reportErrorParams.setVersion(d);
                reportErrorParams.setUserId(hjh.b());
                if (!(map == null || (str5 = map.get("sellerId")) == null)) {
                    str6 = str5;
                }
                reportErrorParams.setSellerId(str6);
                j2o j2oVar = new j2o(reportErrorParams);
                j2oVar.q(new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.monitor.TTDetailReportErrorController$Companion$commitFail$1$2$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            tgh.b(TTDetailReportErrorController.TAG, "onError");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else {
                            tgh.b(TTDetailReportErrorController.TAG, "onSuccess");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            tgh.b(TTDetailReportErrorController.TAG, "onSystemError");
                        }
                    }
                });
                j2oVar.c();
            }
        }

        public final HashMap<Integer, String> b(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("6a63881a", new Object[]{this, num});
            }
            HashMap<String, Integer[]> a2 = dy3.Companion.a();
            Set<String> keySet = a2.keySet();
            HashMap<Integer, String> hashMap = null;
            if (keySet != null) {
                for (String str : keySet) {
                    Integer[] numArr = a2.get(str);
                    if (numArr != null) {
                        for (Integer num2 : numArr) {
                            int intValue = num2.intValue();
                            if (num != null && intValue == num.intValue()) {
                                hashMap = new HashMap<>();
                                hashMap.put(num2, str);
                            }
                        }
                    }
                }
            }
            return hashMap;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return TTDetailReportErrorController.a();
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
            }
            if (c() != null) {
                return c();
            }
            try {
                Application a2 = o91.a();
                ckf.c(a2, "AppUtils.getApplication()");
                PackageManager packageManager = a2.getPackageManager();
                Application a3 = o91.a();
                ckf.c(a3, "AppUtils.getApplication()");
                e(packageManager.getPackageInfo(a3.getPackageName(), 0).versionName);
            } catch (Throwable th) {
                tgh.c(TTDetailReportErrorController.TAG, "getVersionName error", th);
            }
            return c();
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                TTDetailReportErrorController.b(str);
            }
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262093);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e7f69ea", new Object[0]);
        }
        return f6866a;
    }

    public static final /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8575acc", new Object[]{str});
        } else {
            f6866a = str;
        }
    }
}
