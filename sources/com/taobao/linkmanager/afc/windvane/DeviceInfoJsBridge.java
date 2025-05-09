package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import org.json.JSONObject;
import tb.ah0;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DeviceInfoJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "getDeviceInfo";
    public static final String NAME = "WVBCBase";

    static {
        t2o.a(744489052);
    }

    public static /* synthetic */ Object ipc$super(DeviceInfoJsBridge deviceInfoJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/windvane/DeviceInfoJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, ACTION)) {
            ah0.d("device_info_count", "", "", null);
            if (wVCallBackContext != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    String j = AfcUtils.j(this.mContext, true);
                    String k = AfcUtils.k(this.mContext);
                    jSONObject.put("imei", j);
                    jSONObject.put("imsi", k);
                    vp9.a("linkx", "DeviceInfoJsBridge === DeviceInfoJsBridge: imei：" + j + " imsi: " + k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject);
                wVCallBackContext.success(nswVar);
                return true;
            }
        }
        return false;
    }
}
