package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.security.SecurityHelper;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mh1;
import tb.pg1;
import tb.pod;
import tb.r4p;
import tb.t2o;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyResultParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Aisles {
        public final int cto;
        public final int heartbeat;
        public final int port;
        public final String protocol;
        public final String publicKey;
        public final int retry;
        public final int rto;
        public final String rtt;
        public final int supportMultiPath;

        static {
            t2o.a(607125874);
        }

        public Aisles(JSONObject jSONObject) {
            this.port = jSONObject.optInt("port");
            this.protocol = jSONObject.optString("protocol");
            this.cto = jSONObject.optInt("cto");
            this.rto = jSONObject.optInt("rto");
            this.retry = jSONObject.optInt("retry");
            this.heartbeat = jSONObject.optInt("heartbeat");
            this.rtt = jSONObject.optString("rtt", "");
            this.publicKey = jSONObject.optString("publickey");
            this.supportMultiPath = "mp".equalsIgnoreCase(jSONObject.optString("path")) ? 1 : 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Channel {
        public ChannelAttribute[] attributes;
        public boolean hasHttp3;
        public boolean hasIpv6;
        public String[] ips;

        static {
            t2o.a(607125875);
        }

        public Channel(JSONObject jSONObject) {
            this.hasIpv6 = false;
            this.hasHttp3 = false;
            JSONArray optJSONArray = jSONObject.optJSONArray(DnsPreference.KEY_IPS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.ips = new String[length];
                for (int i = 0; i < length; i++) {
                    this.ips[i] = optJSONArray.optString(i);
                    if (Utils.isIPV6Address(this.ips[i])) {
                        this.hasIpv6 = true;
                    }
                }
            } else {
                this.ips = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("attributes");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.attributes = new ChannelAttribute[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.attributes[i2] = new ChannelAttribute(optJSONArray2.optJSONObject(i2));
                    if (this.attributes[i2].hasHttp3) {
                        this.hasHttp3 = true;
                    }
                }
                return;
            }
            this.attributes = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ChannelAttribute {
        public final int cto;
        public boolean hasHttp3;
        public final int heartbeat;
        public final int port;
        public final String protocol;
        public final String publicKey;
        public final int retry;
        public final int rto;
        public final String rtt;
        public final int supportMultiPath;
        public String unit = null;
        public String accessPoint = null;
        public String clientIp = null;

        static {
            t2o.a(607125876);
        }

        public ChannelAttribute(JSONObject jSONObject) {
            this.hasHttp3 = false;
            this.port = jSONObject.optInt("port");
            String optString = jSONObject.optString("protocol");
            this.protocol = optString;
            this.hasHttp3 = ConnType.HTTP3.equalsIgnoreCase(optString);
            this.cto = jSONObject.optInt("cto");
            this.rto = jSONObject.optInt("rto");
            this.retry = jSONObject.optInt("retry");
            this.heartbeat = jSONObject.optInt("heartbeat");
            this.publicKey = jSONObject.optString("publickey");
            this.rtt = jSONObject.optString("rtt");
            this.supportMultiPath = "mp".equalsIgnoreCase(jSONObject.optString("path")) ? 1 : 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Dns {
        public HashMap<String, Boolean> abStrategy;
        public boolean clear;
        public String cname;
        public boolean effectNow;
        public boolean hasHttp3;
        public boolean hasIPv6;
        public String host;
        public String safeAisles;
        public Server[] servers;
        public String tags;
        public int ttl;
        public String unit;
        public int updateMode;
        public int version;

        static {
            t2o.a(607125877);
        }

        public Dns(JSONObject jSONObject) {
            this.host = jSONObject.optString("host");
            this.ttl = jSONObject.optInt(RemoteMessageConst.TTL);
            this.safeAisles = jSONObject.optString("safeAisles");
            this.cname = jSONObject.optString("cname", null);
            this.unit = jSONObject.optString(mh1.PRICE_UNIT, null);
            this.clear = jSONObject.optInt(pg1.ATOM_EXT_clear) == 1;
            this.effectNow = jSONObject.optBoolean("effectNow");
            this.version = jSONObject.optInt("version");
            this.updateMode = jSONObject.optInt("um");
            String optString = jSONObject.optString("tags");
            this.tags = optString;
            if (optString != null && !optString.isEmpty()) {
                ALog.e("anet.HttpDnsResponse", "[amdc priority] tags=" + this.tags, SwitchMonitorLogUtil.SRC_AMDC, "host", this.host);
                AmdcPriorityHelper.updatePriorityHost(SwitchMonitorLogUtil.SRC_AMDC, GlobalAppRuntimeInfo.getUserId(), this.tags, this.host);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ChiTuRewriteUtils.SERVERS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.servers = new Server[length];
                for (int i = 0; i < length; i++) {
                    this.servers[i] = new Server(optJSONArray.optJSONObject(i));
                }
            } else {
                this.servers = null;
            }
            if (this.servers != null) {
                int i2 = 0;
                while (true) {
                    Server[] serverArr = this.servers;
                    if (i2 >= serverArr.length) {
                        break;
                    }
                    Channel[] channelArr = serverArr[i2].channels;
                    if (channelArr != null && channelArr.length > 0) {
                        Channel channel = channelArr[0];
                        this.hasIPv6 = channel != null && channel.hasIpv6;
                        this.hasHttp3 = channel != null && channel.hasHttp3;
                    }
                    i2++;
                }
            }
            String optString2 = jSONObject.optString(DispatchConstants.AB_STRATEGY);
            if (!TextUtils.isEmpty(optString2)) {
                this.abStrategy = new HashMap<>();
                String[] split = optString2.split(",");
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        String[] split2 = str.split("=");
                        if (split2 != null && split2.length == 2) {
                            try {
                                this.abStrategy.put(split2[0], Boolean.valueOf(Integer.parseInt(split2[1]) == 1));
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return;
                }
                return;
            }
            this.abStrategy = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class HrTask {
        public final String host;
        public final Strategy[] strategies;

        static {
            t2o.a(607125878);
        }

        public HrTask(JSONObject jSONObject) {
            this.host = jSONObject.optString("host");
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.strategies = new Strategy[length];
                for (int i = 0; i < length; i++) {
                    this.strategies[i] = new Strategy(optJSONArray.optJSONObject(i));
                }
                return;
            }
            this.strategies = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ProxyServer {
        public Channel[] proxyChannel;

        static {
            t2o.a(607125880);
        }

        public ProxyServer(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.proxyChannel = new Channel[length];
                for (int i = 0; i < length; i++) {
                    this.proxyChannel[i] = new Channel(optJSONArray.optJSONObject(i));
                }
                return;
            }
            this.proxyChannel = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Server {
        public Channel[] channels;
        public boolean isStaticBgp;
        public ProxyServer[] proxies;

        static {
            t2o.a(607125881);
        }

        public Server(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.channels = new Channel[length];
                for (int i = 0; i < length; i++) {
                    this.channels[i] = new Channel(optJSONArray.optJSONObject(i));
                }
            } else {
                this.channels = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("proxies");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.proxies = new ProxyServer[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.proxies[i2] = new ProxyServer(optJSONArray2.optJSONObject(i2));
                }
            } else {
                this.proxies = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("labels");
            if (optJSONObject != null) {
                this.isStaticBgp = "bgp-static".equalsIgnoreCase(optJSONObject.optString("networkRouteProtocolType"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Strategy {
        public final Aisles aisles;
        public final String ip;
        public final String path;

        static {
            t2o.a(607125882);
        }

        public Strategy(JSONObject jSONObject) {
            this.ip = jSONObject.optString(pod.IP);
            this.path = jSONObject.optString("path");
            this.aisles = new Aisles(jSONObject);
        }
    }

    static {
        t2o.a(607125873);
    }

    public static HttpDnsResponse parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsResponse) ipChange.ipc$dispatch("94805637", new Object[]{jSONObject});
        }
        try {
            return new HttpDnsResponse(jSONObject);
        } catch (Exception e) {
            ALog.e("StrategyResultParser", "Parse HttpDns response failed.", null, e, "JSON Content", jSONObject.toString());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HttpDnsResponse {
        public final String accessPoint;
        public String cityCode;
        public final String clientIp;
        public final int configVersion;
        public String countryCode;
        public Dns[] dns;
        public final int fcLevel;
        public final int fcTime;
        public final HrTask[] hrTasks;
        public String ispCode;
        public final String rm;
        public int statusChangeType = HttpDispatcher.AmdcConditionType.DEFAULT_AMDC.ordinal();
        public final String uPriority;
        public final long uPriorityTtl;
        public final String userId;

        static {
            t2o.a(607125879);
        }

        public HttpDnsResponse(JSONObject jSONObject) throws JSONException {
            String str;
            this.countryCode = null;
            this.cityCode = null;
            this.ispCode = null;
            this.clientIp = jSONObject.optString(pod.IP);
            this.userId = jSONObject.optString("uid", null);
            this.configVersion = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.fcLevel = jSONObject.optInt("fcl");
            this.fcTime = jSONObject.optInt("fct");
            String optString = jSONObject.optString("rm");
            this.rm = optString;
            if ("l".equalsIgnoreCase(optString)) {
                str = SecurityHelper.decryptNoDeps(SecurityHelper.getSecretKey(jSONObject.optString("st")), jSONObject.optString("secData"), null, "[amdc]");
            } else {
                str = AmdcRuntimeInfo.getSign().aesDecryptStr(jSONObject.optString("secData"));
            }
            if (str != null) {
                JSONObject jSONObject2 = new JSONObject(str);
                this.accessPoint = jSONObject2.optString(z9u.KEY_ACCESS_POINT);
                String optString2 = jSONObject2.optString(DispatchConstants.U_PRIORITY);
                this.uPriority = optString2;
                long optLong = jSONObject2.optLong("uPriorityTtl");
                this.uPriorityTtl = optLong;
                this.countryCode = jSONObject2.optString("countryCode");
                this.cityCode = jSONObject2.optString(r4p.KEY_CITY_CODE);
                String optString3 = jSONObject2.optString("ispCode");
                this.ispCode = optString3;
                GlobalAppRuntimeInfo.setAmdcInfo(this.countryCode, this.cityCode, optString3);
                if (optString2 != null && !optString2.isEmpty()) {
                    ALog.e("anet.HttpDnsResponse", "[amdc priority] uPriority=".concat(optString2), SwitchMonitorLogUtil.SRC_AMDC, RemoteMessageConst.TTL, Long.valueOf(optLong));
                    AmdcPriorityHelper.updatePriorityInfo(SwitchMonitorLogUtil.SRC_AMDC, GlobalAppRuntimeInfo.getUserId(), optString2, optLong);
                }
            } else {
                this.accessPoint = null;
                this.uPriority = null;
                this.uPriorityTtl = -1L;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("dns");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.dns = new Dns[length];
                for (int i = 0; i < length; i++) {
                    this.dns[i] = new Dns(optJSONArray.optJSONObject(i));
                }
            } else {
                this.dns = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.hrTasks = new HrTask[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.hrTasks[i2] = new HrTask(optJSONArray2.optJSONObject(i2));
                }
                return;
            }
            this.hrTasks = null;
        }
    }
}
