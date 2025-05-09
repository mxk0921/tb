package com.alipay.mobile.common.transportext.biz.rpctest;

import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcTestService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static RpcTestService d;

    /* renamed from: a  reason: collision with root package name */
    public final String f4207a = "RpcTestService";
    public final String b = AmnetOperationManager.AMNET_HOST_SHORT;
    public int c = 0;

    public static /* synthetic */ String access$000(RpcTestService rpcTestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d121255", new Object[]{rpcTestService});
        }
        return rpcTestService.f4207a;
    }

    public static /* synthetic */ String access$100(RpcTestService rpcTestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9502ed74", new Object[]{rpcTestService});
        }
        return rpcTestService.b;
    }

    public static /* synthetic */ String access$200(RpcTestService rpcTestService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("902e3549", new Object[]{rpcTestService, str});
        }
        return rpcTestService.a(str);
    }

    public static RpcTestService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcTestService) ipChange.ipc$dispatch("2c42f478", new Object[0]);
        }
        RpcTestService rpcTestService = d;
        if (rpcTestService != null) {
            return rpcTestService;
        }
        synchronized (RpcTestService.class) {
            try {
                RpcTestService rpcTestService2 = d;
                if (rpcTestService2 != null) {
                    return rpcTestService2;
                }
                RpcTestService rpcTestService3 = new RpcTestService();
                d = rpcTestService3;
                return rpcTestService3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String a(String str) {
        HttpDns.HttpdnsIP queryLocalIPByHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient == null) {
            LogCatUtil.info(this.f4207a, "getAmnetDnsInfos. dnsClient is null.");
            return "";
        }
        try {
            queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
        } catch (Throwable th) {
            LogCatUtil.warn(this.f4207a, th);
        }
        if (queryLocalIPByHost == null) {
            LogCatUtil.info(this.f4207a, "getAmnetDnsInfos.  ipInfoByHost is null.");
            return "";
        }
        if (queryLocalIPByHost.getIpEntries() != null) {
            StringBuilder sb = new StringBuilder();
            for (HttpdnsIPEntry httpdnsIPEntry : queryLocalIPByHost.getIpEntries()) {
                sb.append(httpdnsIPEntry.getIpWithPort());
                sb.append(",");
            }
            LogCatUtil.debug(this.f4207a, "getAmnetDnsInfos,host:" + str + " ,ips: " + sb.toString());
            return sb.toString();
        }
        return "";
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
            if (dnsClient == null) {
                LogCatUtil.info(this.f4207a, "hasIPv6Address. dnsClient is null.");
                return false;
            }
            HttpDns.HttpdnsIP queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
            if (queryLocalIPByHost != null) {
                return queryLocalIPByHost.isHasIPv6();
            }
            LogCatUtil.info(this.f4207a, "hasIPv6Address. ipInfoByHost is null.");
            return false;
        } catch (Throwable th) {
            String str2 = this.f4207a;
            LogCatUtil.error(str2, "hasIPv6Address ex:" + th.toString());
            return false;
        }
    }

    public void sendTestRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f38252", new Object[]{this});
            return;
        }
        try {
            if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext()) || !MiscUtils.isMainProcessRuning(TransportEnvUtil.getContext())) {
                return;
            }
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPV6_TEST_RPC))) {
                LogCatUtil.debug(this.f4207a, "IPV6_TEST_RPC switch off");
            } else if (!TransportStrategy.isEnableBifrost()) {
                LogCatUtil.debug(this.f4207a, "can not use bifrost,don't send test rpc");
            } else {
                boolean b = b(this.b);
                if (MiscUtils.isDebugger(ExtTransportEnv.getAppContext()) || b) {
                    int i = this.c;
                    if (i < 5) {
                        this.c = i + 1;
                        NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.rpctest.RpcTestService.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                LogCatUtil.debug(RpcTestService.access$000(RpcTestService.this), "=======sendTestRpc==========");
                                MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(TransportEnvUtil.getContext());
                                SimpleRpcService simpleRpcService = (SimpleRpcService) mpaasRpcServiceImpl.getRpcProxy(SimpleRpcService.class);
                                RpcInvokeContext rpcInvokeContext = mpaasRpcServiceImpl.getRpcInvokeContext(simpleRpcService);
                                rpcInvokeContext.setRpcLoggerLevel(1);
                                rpcInvokeContext.setShortLinkOnly(true);
                                RpcTestService rpcTestService = RpcTestService.this;
                                rpcInvokeContext.setShortLinkIPList(RpcTestService.access$200(rpcTestService, RpcTestService.access$100(rpcTestService)));
                                LogCatUtil.info(RpcTestService.access$000(RpcTestService.this), simpleRpcService.executeRPC("apple.go.go", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, (Map<String, String>) null));
                            }
                        });
                        return;
                    }
                    return;
                }
                LogCatUtil.debug(this.f4207a, "no ipv6 address,don't send test rpc");
            }
        } catch (Throwable th) {
            String str = this.f4207a;
            LogCatUtil.error(str, "sendTestRpc ex:" + th.toString());
        }
    }
}
