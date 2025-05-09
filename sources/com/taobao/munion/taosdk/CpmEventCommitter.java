package com.taobao.munion.taosdk;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.pojo.request.SendCpmInfoRequest;
import com.taobao.alimama.net.pojo.response.P4pCpmInfoResponse;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.business.mtop.MunionRemoteBusiness;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.aw4;
import tb.i4g;
import tb.t2o;
import tb.vzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CpmEventCommitter extends MunionRemoteBusiness implements MunionEventCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    private static final int REQUEST_TYPE = 0;
    private String aurl;
    private String eadt;
    private String epid;
    private String eurl;
    private boolean mIsOpenPage;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class CpmCommitterResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String clickId;
        private long clickTime = SystemClock.uptimeMillis();
        private String epid;

        static {
            t2o.a(1017118851);
            t2o.a(589299719);
        }

        public CpmCommitterResponseListener(String str, String str2) {
            this.clickId = str;
            this.epid = str2;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                if (("Cpm 请求失败：Response Code: " + mtopResponse.getResponseCode() + ";ret code: " + mtopResponse.getRetCode() + ";ret msg: " + bytedata) != null) {
                    str = bytedata.toString();
                } else {
                    str = "null";
                }
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, str);
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSuccess(int r7, mtopsdk.mtop.domain.MtopResponse r8, mtopsdk.mtop.domain.BaseOutDo r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.munion.taosdk.CpmEventCommitter.CpmCommitterResponseListener.onSuccess(int, mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                if (("Cpm 请求失败 System Error：Response Code: " + mtopResponse.getResponseCode() + ";ret code: " + mtopResponse.getRetCode() + ";ret msg: " + bytedata) != null) {
                    str = bytedata.toString();
                } else {
                    str = "null";
                }
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, str);
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败 System Error");
            }
        }
    }

    static {
        t2o.a(1017118850);
        t2o.a(1017118853);
    }

    public CpmEventCommitter(Application application) {
        this(application, true);
    }

    public static /* synthetic */ String access$000(CpmEventCommitter cpmEventCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("431779cd", new Object[]{cpmEventCommitter});
        }
        return cpmEventCommitter.eurl;
    }

    private String genClickid(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d786b9c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(this.eadt)) {
            str2 = "";
        } else {
            str2 = this.eadt + "_";
        }
        if (TextUtils.isEmpty(str) || !str.contains("click.mz.simba.taobao.com/brand")) {
            return "A17_" + str2 + vzo.e(this.mApplication);
        }
        return "A42_" + str2 + vzo.e(this.mApplication);
    }

    public static /* synthetic */ Object ipc$super(CpmEventCommitter cpmEventCommitter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/munion/taosdk/CpmEventCommitter");
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public String commitEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("133d892c", new Object[]{this, str});
        }
        if (str == null || str.trim().length() == 0) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return "";
        }
        try {
            Pair<Long, Long> b = aw4.b(str);
            if (b != null) {
                long longValue = ((Long) b.first).longValue();
                long longValue2 = ((Long) b.second).longValue();
                long currentTimeMillis = System.currentTimeMillis() - longValue;
                if (currentTimeMillis > longValue2) {
                    UserTrackLogs.trackLog(19999, "munionAdForClickExpired", String.valueOf(currentTimeMillis), str, null);
                }
            }
            String genClickid = genClickid(str);
            registeListener(new CpmCommitterResponseListener(genClickid, this.epid));
            SendCpmInfoRequest cpmInfoRequest = MunionRequestHelper.getCpmInfoRequest(this.mApplication, genClickid, str);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_cid", vzo.o(str));
            hashMap.put("epid", this.epid);
            hashMap.put("aurl", this.aurl);
            hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
            UserTrackLogs.trackClick(9001, vzo.c(hashMap), genClickid);
            String c = vzo.c(hashMap);
            i4g.a("cpm_click_before", c, "clickid=" + genClickid);
            startRequest(0, cpmInfoRequest, P4pCpmInfoResponse.class);
            if (this.mIsOpenPage) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("clickid", genClickid);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                    UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", genClickid);
                    UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
                }
            }
            return genClickid;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }

    public CpmEventCommitter setEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmEventCommitter) ipChange.ipc$dispatch("b958d8b3", new Object[]{this, str});
        }
        this.eadt = vzo.f(str);
        return this;
    }

    public CpmEventCommitter(Application application, boolean z) {
        super(application);
        this.epid = "";
        this.aurl = "";
        this.eadt = "";
        this.eurl = "";
        this.mIsOpenPage = z;
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public String commitEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5c61a2", new Object[]{this, str, str2});
        }
        if (str2 != null && str2.trim().length() > 0) {
            try {
                this.aurl = URLEncoder.encode(str2, "UTF-8");
            } catch (Exception unused) {
            }
            Uri parse = Uri.parse(str2);
            if (parse != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("epid");
                this.epid = queryParameter;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.epid = queryParameter;
            }
        }
        this.eurl = str;
        return MunionUrlBuilder.appendClickidToTargetUrl(str2, commitEvent(str));
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public Uri commitEvent(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("89baed0a", new Object[]{this, str, uri});
        }
        if (uri != null && uri.isHierarchical()) {
            try {
                this.aurl = URLEncoder.encode(uri.toString(), "UTF-8");
            } catch (Exception unused) {
            }
            String queryParameter = uri.getQueryParameter("epid");
            this.epid = queryParameter;
            if (queryParameter == null) {
                queryParameter = "";
            }
            this.epid = queryParameter;
        }
        this.eurl = str;
        return MunionUrlBuilder.appendClickidToTargetUrl(uri, commitEvent(str));
    }
}
