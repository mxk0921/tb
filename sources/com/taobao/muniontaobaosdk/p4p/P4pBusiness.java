package com.taobao.muniontaobaosdk.p4p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.net.pojo.response.P4pCpcInfoResponse;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.lhl;
import tb.t2o;
import tb.vu3;
import tb.vzo;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class P4pBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11157a;
    public final Bundle b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class P4PRemoteBusinessListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String clickId;

        static {
            t2o.a(1021313053);
            t2o.a(589299719);
        }

        public P4PRemoteBusinessListener(String str) {
            this.clickId = str;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败：" + mtopResponse.getRetCode());
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            Object data = ((P4pCpcInfoResponse) baseOutDo).getData();
            TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求成功！ result is :" + data.toString());
            String str = "";
            try {
                JSONObject jSONObject = new JSONObject(data.toString());
                if (jSONObject.get("result") != null) {
                    str = jSONObject.get("result").toString();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (vzo.l(str)) {
                try {
                    String str2 = "redirecturl=" + URLEncoder.encode(str, "UTF-8");
                    UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str2, this.clickId);
                    TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "usertrack update is [args=" + str2 + "]");
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败：" + mtopResponse.getRetCode());
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败");
            }
        }
    }

    static {
        t2o.a(1021313052);
    }

    public P4pBusiness(Context context, Bundle bundle) {
        this.f11157a = context;
        this.b = bundle;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435adfa3", new Object[]{this, str, str2});
            return;
        }
        TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Munion P4P clickurl is " + str);
        String str3 = "";
        UserTrackLogs.trackClick(9001, str3, str2);
        try {
            str3 = new vu3(this.f11157a, this.b).q(str2);
            TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "[accept] is :" + str3);
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "[traceData] error:" + e.getMessage());
        }
        lhl lhlVar = new lhl((Application) this.f11157a);
        lhlVar.registeListener(new P4PRemoteBusinessListener(str2));
        lhlVar.a(this.f11157a, "", MunionDeviceUtil.getUtdid(), str, "", "", str3, "", "", "");
    }
}
