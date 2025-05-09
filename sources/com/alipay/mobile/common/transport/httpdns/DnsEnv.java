package com.alipay.mobile.common.transport.httpdns;

import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DnsEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DnsEnv d;

    /* renamed from: a  reason: collision with root package name */
    public String f4100a = "";
    public String b = "";
    public boolean c = false;

    public static DnsEnv getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DnsEnv) ipChange.ipc$dispatch("4b47b17d", new Object[0]);
        }
        DnsEnv dnsEnv = d;
        if (dnsEnv != null) {
            return dnsEnv;
        }
        synchronized (DnsEnv.class) {
            try {
                DnsEnv dnsEnv2 = d;
                if (dnsEnv2 != null) {
                    return dnsEnv2;
                }
                DnsEnv dnsEnv3 = new DnsEnv();
                d = dnsEnv3;
                return dnsEnv3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getAmdcUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("288973ea", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f4100a)) {
            this.f4100a = SharedPreUtils.getStringData(TransportEnvUtil.getContext(), "httpdns_uid");
        }
        return this.f4100a;
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = SharedPreUtils.getStringData(TransportEnvUtil.getContext(), "httpdns_tradeNo");
        }
        return this.b;
    }

    public boolean isDisableHttpDNS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4d664e", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void setAmdcUid(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa89234", new Object[]{this, str});
            return;
        }
        this.f4100a = str;
        NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.DnsEnv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SharedPreUtils.putData(TransportEnvUtil.getContext(), "httpdns_uid", str);
                }
            }
        });
    }

    public void setDisableHttpDNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b0eb92", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        LogCatUtil.info("DnsEnv", "setDisableHttpDNS value= " + z);
        if (z) {
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.DNS_SWITCH, UTConstant.Args.UT_SUCCESS_F);
        }
    }

    public void setTradeNo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
            return;
        }
        this.b = str;
        NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.DnsEnv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SharedPreUtils.putData(TransportEnvUtil.getContext(), "httpdns_tradeNo", str);
                }
            }
        });
    }
}
