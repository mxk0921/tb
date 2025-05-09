package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ReadSettingServerUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OFF_SWITCH = "0";
    public static final String ON_SWITCH = "1";
    public static ReadSettingServerUrl i;

    /* renamed from: a  reason: collision with root package name */
    public String f4151a = "https://mobilegw.alipay.com/mgw.htm";
    public final String b = "https://mobilegw-tb-sibling.alipay.com/mgw.htm";
    public final String c = "http://amdc.alipay.com/query";
    public String d = null;
    public URL e = null;
    public String f = null;
    public Boolean g = null;
    public String h = null;

    public static synchronized ReadSettingServerUrl getInstance() {
        synchronized (ReadSettingServerUrl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ReadSettingServerUrl) ipChange.ipc$dispatch("9a93a55f", new Object[0]);
            }
            if (i == null) {
                i = new ReadSettingServerUrl();
            }
            return i;
        }
    }

    public final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        return b(context, this.f4151a);
    }

    public final String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, str});
        }
        return getValue(context, "content://com.alipay.setting/GWFServerUrl", str);
    }

    public final String getAmnetDnsSetting(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfb80da1", new Object[]{this, context});
        }
        try {
            if (isDebug(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "getAmnetDnsSetting. debug is true");
                if (!TextUtils.isEmpty(this.h)) {
                    return this.h;
                }
                String value = getValue(context, "content://com.alipay.setting/amnet_dns_conf", null);
                StringBuilder sb = new StringBuilder("getAmnetDnsSetting.  amnetDns=[");
                if (TextUtils.isEmpty(value)) {
                    str = " is null ";
                } else {
                    str = value;
                }
                sb.append(str);
                sb.append("]");
                LogCatUtil.info("ReadSettingServerUrl", sb.toString());
                if (!TextUtils.isEmpty(value)) {
                    this.h = value;
                }
                return this.h;
            }
            LogCatUtil.info("ReadSettingServerUrl", "getAmnetDnsSetting.  debug is false");
            return "";
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "getAmnetDnsSetting exception. " + th.toString());
            return "";
        }
    }

    public String getBackupGwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5814d2", new Object[]{this});
        }
        return this.b;
    }

    public final String getGWFURL(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2075be6e", new Object[]{this, context});
        }
        if (!TextUtils.isEmpty(this.f)) {
            if (MiscUtils.isDebugger(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit cust gw url = " + this.f);
            }
            return this.f;
        } else if (!TextUtils.isEmpty(this.d)) {
            if (MiscUtils.isDebugger(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit current gw url = " + this.d);
            }
            return this.d;
        } else {
            try {
                String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("mobilegw.url");
                if (!TextUtils.isEmpty(string)) {
                    this.d = string;
                    LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit meta-data, url = " + this.d);
                    return this.d;
                }
            } catch (Exception e) {
                LogCatUtil.warn("ReadSettingServerUrl", "[getGWFURL] Meta data exception = " + e, e);
            }
            if (isDebug(context)) {
                String a2 = a(context);
                if (!TextUtils.isEmpty(a2)) {
                    this.d = a2;
                    LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit set tool, url = " + this.d);
                }
                return this.d;
            }
            String str = this.f4151a;
            this.d = str;
            return str;
        }
    }

    public final URL getGWFURLObj(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("de76e0fc", new Object[]{this, context});
        }
        URL url = this.e;
        if (url != null) {
            return url;
        }
        synchronized (this) {
            try {
                URL url2 = this.e;
                if (url2 != null) {
                    return url2;
                }
                URL url3 = new URL(getGWFURL(context));
                this.e = url3;
                return url3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String getHttpdnsServerUrl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a0f3e0", new Object[]{this, context});
        }
        if (isDebug(context)) {
            return getValue(context, "content://com.alipay.setting/httpdns_url", this.c);
        }
        return this.c;
    }

    public String getmUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce709fe1", new Object[]{this});
        }
        return this.f4151a;
    }

    public final Boolean isEnableAmnetSetting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("640577d2", new Object[]{this, context});
        }
        if (isDebug(context)) {
            LogCatUtil.info("ReadSettingServerUrl", "isEnableAmnetSetting.  debug is true");
            Boolean bool = this.g;
            if (bool != null) {
                return bool;
            }
            String value = getValue(context, "content://com.alipay.setting/XmppUseMmtp", null);
            if ("1".equals(value)) {
                this.g = Boolean.TRUE;
            } else if ("0".equals(value)) {
                this.g = Boolean.FALSE;
            }
            return this.g;
        }
        LogCatUtil.info("ReadSettingServerUrl", "isEnableAmnetSetting.  debug is false");
        return null;
    }

    public final Boolean isEnabledNbnetDownloadSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc9eed30", new Object[]{this, context});
        }
        try {
            if (!isDebug(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch.  debug is false, return false.");
                return Boolean.FALSE;
            }
            LogCatUtil.info("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch. debug is true");
            String value = getValue(context, "content://com.alipay.setting/nbnet_download_switch", null);
            StringBuilder sb = new StringBuilder("isEnabledNbnetDownloadSwitch.  enable=[");
            sb.append(TextUtils.isEmpty(value) ? " is null " : value);
            sb.append("]");
            LogCatUtil.info("ReadSettingServerUrl", sb.toString());
            if (value == null) {
                return null;
            }
            return Boolean.valueOf(TextUtils.equals(value, "1"));
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch exception. " + th.toString());
            return Boolean.FALSE;
        }
    }

    public final void setAlipaySetToolPriorityMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8589e8c", new Object[]{this, context});
        } else if (context == null) {
            LogCatUtil.warn("ReadSettingServerUrl", "[setAlipaySetToolPriorityMode] context param is null.");
        } else {
            try {
                if (isDebug(context)) {
                    String b = b(context, "");
                    if (!TextUtils.isEmpty(b)) {
                        this.d = b;
                        setCustGwURL(b);
                        LogCatUtil.info("ReadSettingServerUrl", "[setAlipaySetToolPriorityMode] Hit set tool, url = " + this.d);
                    }
                }
            } finally {
                getGWFURL(context);
            }
        }
    }

    public final void setCustGwURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8250649b", new Object[]{this, str});
            return;
        }
        this.f = str;
        LogCatUtil.info("ReadSettingServerUrl", "[setCustGwURL] url = " + str);
    }

    public void setmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94229cb5", new Object[]{this, str});
        } else {
            this.f4151a = str;
        }
    }

    public static String getValue(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a052a686", new Object[]{context, str, str2});
        }
        try {
            LogCatUtil.printInfo("ReadSettingServerUrl", "getValue start.");
            Cursor query = context.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (query == null || query.getCount() <= 0) {
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                return str2;
            }
            query.moveToFirst();
            String string = query.getString(0);
            query.close();
            LogCatUtil.printInfo("ReadSettingServerUrl", "getValue.  cursor exist.  uri=[" + str + "]  ret=[" + string + "]");
            return TextUtils.isEmpty(string) ? str2 : string;
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "[getValue] Exception = " + th.toString());
            return str2;
        }
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Exception e) {
            LogCatUtil.warn("ReadSettingServerUrl", "isDebug exception.  " + e.toString());
            return false;
        }
    }
}
