package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AlipayHttpDnsInitRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f4099a;
    private int b;
    private boolean c;

    public AlipayHttpDnsInitRunnable(Context context, int i) {
        this.c = true;
        this.f4099a = context;
        this.b = i;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(20);
        if (MiscUtils.isInAlipayClient(this.f4099a)) {
            Context context = this.f4099a;
            if (context != null && MiscUtils.isRCVersion(context)) {
                sb.append("mygwrc.alipay.com,");
            }
            sb.append("mygw.alipay.com,alipay.up.django.t.taobao.com,alipay.dl.django.t.taobao.com,api.django.t.taobao.com,oalipay-dl-django.alicdn.com,mobilepmgw.alipay.com,mcgw.alipay.com,img01.taobaocdn.com,");
        }
        try {
            String host = new URL(ReadSettingServerUrl.getInstance().getGWFURL(this.f4099a)).getHost();
            if (!DnsValue.DOMAIN_MOBILE_GW.equals(host)) {
                sb.append(host);
                sb.append(",");
            }
        } catch (Exception e) {
            LogCatUtil.warn("AlipayHttpDnsInitRunnable", "equals gwHost  exception : " + e.toString());
        }
        sb.append("mobilegw.alipay.com,bkmobilegw.mybank.cn,t.alipayobjects.com,tfs.alipayobjects.com,i.alipayobjects.com,pic.alipayobjects.com,mdgw.alipay.com,mugw.alipay.com,os.alipayobjects.com,mygwshort.alipay.com,zos.alipayobjects.com,dl-sh.django.t.taobao.com,amdc.alipay.com,dl.django.t.taobao.com,render.alipay.com,api-mayi.django.t.taobao.com,up-mayi.django.t.taobao.com,gw.alicdn.com,gw.alipayobjects.com,mdap.alipaylog.com,");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            AlipayHttpDnsClient.dnsClientInit(this.f4099a, a(), this.b, this.c);
        }
    }

    public AlipayHttpDnsInitRunnable(Context context, int i, boolean z) {
        this.f4099a = context;
        this.b = i;
        this.c = z;
    }
}
