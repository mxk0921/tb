package com.alipay.mobile.common.transport.monitor.lbs;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.data.QrCodeData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LBSManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LBSManager d;

    /* renamed from: a  reason: collision with root package name */
    public Object f4123a;
    public long b;
    public final long c = QrCodeData.QR_CODE_VALID_PERIOD;

    public LBSManager() {
        this.b = System.currentTimeMillis();
        this.b = System.currentTimeMillis();
    }

    public static LBSManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSManager) ipChange.ipc$dispatch("a149ab38", new Object[0]);
        }
        LBSManager lBSManager = d;
        if (lBSManager != null) {
            return lBSManager;
        }
        synchronized (LBSManager.class) {
            try {
                if (d == null) {
                    d = new LBSManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final synchronized Object a() {
        try {
            if (System.currentTimeMillis() - this.b > this.c) {
                this.f4123a = null;
            }
            Object obj = this.f4123a;
            if (obj != null) {
                return obj;
            }
            this.b = System.currentTimeMillis();
            Class<?> cls = Class.forName("com.alipay.mobile.common.lbs.LBSLocationManagerProxy");
            Object invoke = cls.getMethod("getLastKnownLocation", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), TransportEnvUtil.getContext());
            this.f4123a = invoke;
            return invoke;
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getLBSLocation ex:" + th.toString());
            return null;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return "1";
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String d2 = d();
        if (TextUtils.equals("-", d2)) {
            return "-";
        }
        return ((System.currentTimeMillis() - Long.parseLong(d2)) / 1000) + "";
    }

    public final String d() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getLocationtime", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getLocationtime,ex:" + th.toString());
            return "-";
        }
    }

    public final String e() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getLatitude", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getLatitude,ex:" + th.toString());
            return "-";
        }
    }

    public final String f() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getLongitude", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getLongitude,ex:" + th.toString());
            return "-";
        }
    }

    public final String g() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getCityCode", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getCityCode,ex:" + th.toString());
            return "-";
        }
    }

    public String getReportLBSInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b900ed18", new Object[]{this});
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getReportLBSInfo ex:" + th.toString());
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.LBS_DUMP))) {
            LogCatUtil.debug("LBSManager", "lbsDump off");
            return "";
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.LBS_LEVEL);
        if (!TextUtils.equals(stringValue, "1")) {
            if (TextUtils.equals(stringValue, "2")) {
                if (q()) {
                    return LbsInfoUtil.getKeyLBSInfo() + LbsInfoUtil.getExtLbsInfo();
                }
                return o() + p();
            }
            return "";
        } else if (q()) {
            return LbsInfoUtil.getKeyLBSInfo();
        } else {
            return o();
        }
    }

    public final String h() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getAdCode", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getAdCode,ex:" + th.toString());
            return "-";
        }
    }

    public final String i() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getAccuracy", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getAccuracy,ex:" + th.toString());
            return "-";
        }
    }

    public final String j() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getCountry", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getCountry,ex:" + th.toString());
            return "-";
        }
    }

    public final String k() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getProvince", new Class[0]).invoke(a2, new Object[0]));
            return !TextUtils.isEmpty(valueOf) ? valueOf : "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getProvince,ex:" + th.toString());
            return "-";
        }
    }

    public final String l() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getCity", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getCity,ex:" + th.toString());
            return "-";
        }
    }

    public final String m() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getDistrict", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getDistrict,ex:" + th.toString());
            return "-";
        }
    }

    public final String n() {
        try {
            Object a2 = a();
            if (a2 == null) {
                return "-";
            }
            String valueOf = String.valueOf(a2.getClass().getMethod("getAoiname", new Class[0]).invoke(a2, new Object[0]));
            if (!TextUtils.isEmpty(valueOf)) {
                return !"null".equalsIgnoreCase(valueOf) ? valueOf : "-";
            }
            return "-";
        } catch (Throwable th) {
            LogCatUtil.error("LBSManager", "getAoiname,ex:" + th.toString());
            return "-";
        }
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        if (a() == null) {
            LogCatUtil.debug("LBSManager", "getLBSLocation is null,return");
            return "";
        }
        return b() + "_" + c() + "_" + e() + "_" + f() + "_" + g() + "_" + h() + "_" + i() + "_";
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        if (a() == null) {
            LogCatUtil.debug("LBSManager", "getLBSLocation is null,return");
            return "";
        }
        return j() + "_" + k() + "_" + l() + "_" + m() + "_" + n();
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.USE_NEW_LBS))) {
            return false;
        }
        LogCatUtil.debug("LBSManager", "newlbsSwitch is on,use new lbs");
        return true;
    }
}
