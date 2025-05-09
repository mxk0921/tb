package com.taobao.muniontaobaosdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.cpm.CpmBusiness;
import com.taobao.muniontaobaosdk.p4p.P4pBusiness;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import tb.t2o;
import tb.vzo;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Munion {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Munion instance;
    private Context appContext;
    private Bundle infoList;

    static {
        t2o.a(1021313049);
    }

    private Munion(Context context, Bundle bundle) {
        this.appContext = context;
        this.infoList = bundle;
        MunionDeviceUtil.setAppContext(context);
    }

    private void cpmClick(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f731e3", new Object[]{this, str, str2});
        } else {
            new CpmBusiness(this.appContext, this.infoList).a(str, str2);
        }
    }

    public static synchronized Munion getInstance(Context context, Bundle bundle) {
        synchronized (Munion.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Munion) ipChange.ipc$dispatch("bc4ae655", new Object[]{context, bundle});
            }
            if (instance == null) {
                instance = new Munion(context, bundle);
            }
            return instance;
        }
    }

    private void p4pClick(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39071bd7", new Object[]{this, str, str2});
        } else {
            new P4pBusiness(this.appContext, this.infoList).a(str, str2);
        }
    }

    public synchronized String commitCpmEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eddd5dde", new Object[]{this, str});
        }
        try {
            String str2 = "A17_" + vzo.d();
            if (!TextUtils.isEmpty(str)) {
                cpmClick(str, str2);
            }
            return str2;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }

    public synchronized String commitP4pEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cee656a", new Object[]{this, str});
        }
        try {
            String str2 = "A1_" + vzo.d();
            if (!TextUtils.isEmpty(str)) {
                p4pClick(str, str2);
            }
            return str2;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }
}
