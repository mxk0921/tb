package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.ComplexUtils;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.itw;
import tb.pg1;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyInstance implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.StrategyCenter";
    public static AtomicBoolean isContainHttp3 = new AtomicBoolean(false);
    public static int detectHttp3Status = -1;
    public boolean isInitialized = false;
    public StrategyInfoHolder holder = null;
    public long lastPersistentTime = 0;
    public CopyOnWriteArraySet<IStrategyListener> listeners = new CopyOnWriteArraySet<>();
    public AtomicBoolean isLocalDns = new AtomicBoolean(false);

    static {
        t2o.a(607125868);
        t2o.a(607125839);
        t2o.a(607125910);
    }

    public static /* synthetic */ boolean access$000(StrategyInstance strategyInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c91b65", new Object[]{strategyInstance})).booleanValue();
        }
        return strategyInstance.checkHolderIsNull();
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getAccessPointByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4acca4fa", new Object[]{this, str});
        }
        if (checkHolderIsNull()) {
            return null;
        }
        return this.holder.strategyConfig.getAccessPointByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11fc59b8", new Object[]{this, str});
        }
        if (checkHolderIsNull() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.holder.getCurrStrategyTable().getCnameByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5fb6831", new Object[]{this});
        }
        if (checkHolderIsNull()) {
            return "";
        }
        return this.holder.getCurrStrategyTable().clientIp;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cd8a4c22", new Object[]{this, new Boolean(z), str}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str), false, z);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListWithoutWait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("48be98ec", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || checkHolderIsNull()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.holder.getCurrStrategyTable().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List<IConnStrategy> queryByHost = this.holder.getCurrStrategyTable().queryByHost(str);
        if (queryByHost.isEmpty()) {
            queryByHost = this.holder.localDnsStrategyTable.queryWithoutWait(str);
        }
        ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            if (!new DefaultStrategyFilter(str).accept(listIterator.next())) {
                listIterator.remove();
            }
        }
        return queryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public int getDetectHttp3Status() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf353f9e", new Object[]{this})).intValue();
        }
        return detectHttp3Status;
    }

    public String getGuessSchemeByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e37b32a", new Object[]{this, str});
        }
        String guessScheme = SchemeGuesser.getInstance().guessScheme(str);
        return guessScheme == null ? "http" : guessScheme;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getIpv4ConnStrategyListByHost(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7873c30", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        List<IConnStrategy> queryIpv4ByHost = this.holder.localDnsStrategyTable.queryIpv4ByHost(str, z, i);
        if (queryIpv4ByHost.isEmpty()) {
            return queryIpv4ByHost;
        }
        ListIterator<IConnStrategy> listIterator = queryIpv4ByHost.listIterator();
        while (listIterator.hasNext()) {
            if (!new DefaultStrategyFilter(str).accept(listIterator.next())) {
                listIterator.remove();
            }
        }
        return queryIpv4ByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getLocalDnsConnStrategyListByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35653446", new Object[]{this, str});
        }
        return this.holder.localDnsStrategyTable.queryByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("83b20dd5", new Object[]{this, str}) : getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUniqueId(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{this, networkStatus});
        }
        StrategyInfoHolder strategyInfoHolder = this.holder;
        if (strategyInfoHolder == null) {
            return "error";
        }
        return strategyInfoHolder.getUniqueId(networkStatus);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db8852d6", new Object[]{this, str});
        }
        if (checkHolderIsNull()) {
            return null;
        }
        return this.holder.strategyConfig.getUnitByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public boolean isContainHttp3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f69268c", new Object[]{this})).booleanValue();
        }
        return isContainHttp3.get();
    }

    public boolean isHttp3(IConnStrategy iConnStrategy) {
        ConnType valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9472e152", new Object[]{this, iConnStrategy})).booleanValue();
        }
        if (iConnStrategy == null || (valueOf = ConnType.valueOf(iConnStrategy.getProtocol())) == null) {
            return false;
        }
        return valueOf.isHTTP3();
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cced20", new Object[]{this});
            return;
        }
        StrategySerializeHelper.clearStrategyFolder();
        HttpDispatcher.getInstance().switchENV();
        StrategyInfoHolder strategyInfoHolder = this.holder;
        if (strategyInfoHolder != null) {
            strategyInfoHolder.clear();
            this.holder = StrategyInfoHolder.newInstance();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public boolean getAbStrategyStatusByHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf1c1a", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || checkHolderIsNull()) {
            return false;
        }
        return this.holder.getCurrStrategyTable().getAbStrategyStatusByHost(str, str2);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("310eabf6", new Object[]{this, str, new Boolean(z)}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str), z);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45b26e0b", new Object[]{this, str, str2}) : getSchemeByHost(str, str2, false);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e0d0", new Object[]{this, str, iConnStrategy, connEvent});
        } else if (!checkHolderIsNull() && iConnStrategy != null && (iConnStrategy instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.ipSource == 1) {
                this.holder.localDnsStrategyTable.notifyConnEvent(str, iConnStrategy, connEvent);
            } else if (iPConnStrategy.ipSource == 0) {
                this.holder.getCurrStrategyTable().notifyConnEvent(str, iConnStrategy, connEvent);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        ALog.i(TAG, "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastPersistentTime > 30000) {
            this.lastPersistentTime = currentTimeMillis;
            AmdcThreadPoolExecutor.scheduleTask(new Runnable() { // from class: anet.channel.strategy.StrategyInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!StrategyInstance.access$000(StrategyInstance.this)) {
                        StrategyInstance.this.holder.saveData();
                    }
                }
            }, 500L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DefaultStrategyFilter implements IStrategyFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public volatile String host;

        static {
            t2o.a(607125870);
            t2o.a(607125838);
        }

        public DefaultStrategyFilter(String str) {
            this.host = str;
        }

        @Override // anet.channel.strategy.IStrategyFilter
        public boolean accept(IConnStrategy iConnStrategy) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
            }
            String str = iConnStrategy.getProtocol().protocol;
            if (ConnType.QUIC.equals(str) || ConnType.QUIC_PLAIN.equals(str)) {
                ALog.i(StrategyInstance.TAG, "gquic strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            } else if (AwcnConfig.isSpdyOfflineEnable() && "spdy".equals(str)) {
                ALog.i(StrategyInstance.TAG, "spdy strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            } else if (AwcnConfig.isIpv6Enable() || !Utils.isIPV6Address(iConnStrategy.getIp())) {
                if (ConnType.HTTP3.equals(str) || ConnType.HTTP3_PLAIN.equals(str) || ConnType.HTTP3_1RTT.equals(str)) {
                    if (!Http3ConnectionDetector.isQuicReady()) {
                        ALog.e(StrategyInstance.TAG, "[xquic remote] xquic not ready, can't use http3", null, "strategy", iConnStrategy);
                        return false;
                    } else if (AwcnConfig.isHostInHttp3BlackList(this.host)) {
                        ALog.e(StrategyInstance.TAG, "isHostInHttp3BlackList, not use http3, host=" + this.host, null, "strategy", iConnStrategy);
                        return false;
                    } else {
                        boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
                        StrategyInstance.detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
                        if (AwcnConfig.isHostInHttp3WhiteList(this.host)) {
                            ALog.e(StrategyInstance.TAG, "isHttp3WhiteList, try use http3, host=" + this.host, null, "strategy", iConnStrategy);
                            return true;
                        }
                        boolean isHostIn1RttHttp3WhiteList = AwcnConfig.isHostIn1RttHttp3WhiteList(this.host);
                        if (!isHttp3Enable || (i = StrategyInstance.detectHttp3Status) == 0 || (i == -1 && !isHostIn1RttHttp3WhiteList)) {
                            ALog.e(StrategyInstance.TAG, "http3 strategy disabled, host=" + this.host + " globalHttp3Enable=" + isHttp3Enable + " detectHttp3Status=" + StrategyInstance.detectHttp3Status + " is1RttHttp3WhiteList=" + isHostIn1RttHttp3WhiteList, null, "strategy", iConnStrategy);
                            return false;
                        } else if (NetworkStatusHelper.isVpn() && StrategyInstance.detectHttp3Status == -1 && AwcnConfig.isHostInHttp3DisabledWhiteList(this.host)) {
                            ALog.e(StrategyInstance.TAG, "vpn http3 strategy disabled, host=" + this.host + " globalHttp3Enable=" + isHttp3Enable + " detectHttp3Status=" + StrategyInstance.detectHttp3Status + " is1RttHttp3WhiteList=" + isHostIn1RttHttp3WhiteList, null, "strategy", iConnStrategy);
                            return false;
                        } else if (!AwcnConfig.isHttp3DefaultEnable() && AwcnConfig.isHostInHttp3DefaultWhiteList(this.host)) {
                            ALog.e(StrategyInstance.TAG, "Default http3 strategy disabled, host=" + this.host, null, "strategy", iConnStrategy);
                            return false;
                        }
                    }
                }
                return true;
            } else {
                ALog.e(StrategyInstance.TAG, "isIpv6Enable = false, not use ipv6, host=" + this.host, null, "strategy", iConnStrategy);
                return false;
            }
        }
    }

    private boolean checkHolderIsNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13671d0", new Object[]{this})).booleanValue();
        }
        if (this.holder != null) {
            return false;
        }
        ALog.w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.isInitialized));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fc1e56e4", new Object[]{this, str}) : getConnStrategyListByHost(str, new DefaultStrategyFilter(str));
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13d97841", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (checkHolderIsNull()) {
            return str2 == null ? getGuessSchemeByHost(str) : str2;
        }
        String safeAislesByHost = this.holder.strategyConfig.getSafeAislesByHost(str, z);
        if (safeAislesByHost != null || TextUtils.isEmpty(str2)) {
            str2 = safeAislesByHost;
        }
        if (str2 == null) {
            str2 = getGuessSchemeByHost(str);
        }
        ALog.d(TAG, "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else if (!this.isInitialized && context != null) {
            try {
                ALog.i(TAG, "StrategyCenter initialize started.", null, new Object[0]);
                AwcnConfig.init(context);
                NetworkStatusHelper.startListener(context);
                AmdcRuntimeInfo.setContext(context);
                StrategySerializeHelper.initialize(context);
                HttpDispatcher.getInstance().addListener(this);
                this.holder = StrategyInfoHolder.newInstance();
                this.isInitialized = true;
                ALog.i(TAG, "StrategyCenter initialize finished.", null, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, "StrategyCenter initialize failed.", null, e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(anet.channel.strategy.dispatch.DispatchEvent r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInstance.onEvent(anet.channel.strategy.dispatch.DispatchEvent):void");
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5136f54", new Object[]{this, str});
        } else if (!checkHolderIsNull() && !TextUtils.isEmpty(str)) {
            ALog.i(TAG, "force refresh strategy", null, "host", str);
            this.holder.getCurrStrategyTable().sendAmdcRequest(str, true);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("66706ca0", new Object[]{this, str, iStrategyFilter}) : getConnStrategyListByHost(str, iStrategyFilter, false, true);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d1fb8f", new Object[]{this, str});
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.e(TAG, "url is invalid.", null, MonitorItemConstants.KEY_URL, str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf(itw.URL_SEPARATOR)));
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, "", null, pg1.ATOM_raw, StringUtils.simplifyString(str, 128), rb.RESULT_KEY, StringUtils.simplifyString(urlString, 128));
            }
        } catch (Exception e) {
            ALog.e(TAG, "getFormalizeUrl failed", null, e, pg1.ATOM_raw, str);
        }
        return urlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68119030", new Object[]{this, iStrategyListener});
            return;
        }
        ALog.e(TAG, "registerListener", null, DataReceiveMonitor.CB_LISTENER, this.listeners);
        if (iStrategyListener != null) {
            this.listeners.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7cf837", new Object[]{this, iStrategyListener});
            return;
        }
        ALog.e(TAG, "unregisterListener", null, DataReceiveMonitor.CB_LISTENER, this.listeners);
        this.listeners.remove(iStrategyListener);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10ff4dba", new Object[]{this, str, iStrategyFilter, new Boolean(z)}) : getConnStrategyListByHost(str, iStrategyFilter, false, true);
    }

    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter, boolean z, boolean z2) {
        String str2;
        List list;
        char c = 4;
        char c2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b84c8fe0", new Object[]{this, str, iStrategyFilter, new Boolean(z), new Boolean(z2)});
        }
        isContainHttp3.set(false);
        if (TextUtils.isEmpty(str) || checkHolderIsNull()) {
            return Collections.EMPTY_LIST;
        }
        if (z) {
            str2 = this.holder.getCellularStrategyTable().getCnameByHost(str, z);
        } else {
            str2 = this.holder.getCurrStrategyTable().getCnameByHost(str, z);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (z) {
            list = this.holder.getCellularStrategyTable().queryByHost(str2, z);
        } else {
            list = this.holder.getCurrStrategyTable().queryByHost(str2, z);
        }
        if (z2) {
            if (list.isEmpty()) {
                list = this.holder.localDnsStrategyTable.queryByHost(str2);
                this.isLocalDns.set(true);
                ALog.e("[Ipv6_H3] getConnStrategyListByHost, isLocalDns", null, "host", str2, "localStrategy", list);
            }
            if (list.isEmpty()) {
                this.isLocalDns.set(false);
                ALog.d("[Ipv6_H3] getConnStrategyListByHost", null, "host", str2, "result", list);
                return list;
            }
        }
        boolean z3 = AwcnConfig.isVpnDetectRacingOpened() && NetworkStatusHelper.isVpn();
        ListIterator<IConnStrategy> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (isHttp3(next)) {
                isContainHttp3.set(true);
            }
            if ((z3 || (NetworkStatusHelper.getStatus().isWifi() && ComplexUtils.isAllowComplexConnect(str2, next.getIp()))) && isHttp3(next)) {
                next = IPConnStrategy.create(next, ConnProtocol.valueOf(ConnType.HTTP3_1RTT, "", ""));
                listIterator.set(next);
                Boolean valueOf = Boolean.valueOf(z3);
                Object[] objArr = new Object[6];
                objArr[0] = "host";
                objArr[1] = str2;
                objArr[c2] = "useStrategy";
                objArr[3] = next;
                objArr[c] = "isVpnRacingOpened";
                objArr[5] = valueOf;
                ALog.e(TAG, "[vpn complex][Ipv6_H3] getConnStrategyListByHost, use h3_1rtt=", null, objArr);
            }
            if (iStrategyFilter != null && !iStrategyFilter.accept(next)) {
                listIterator.remove();
            }
            c = 4;
            c2 = 2;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("getConnStrategyListByHost", null, "host", str2, "result", list);
        }
        return list;
    }
}
