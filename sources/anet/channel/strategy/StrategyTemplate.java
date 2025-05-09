package anet.channel.strategy;

import android.content.Context;
import android.net.Uri;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyTemplate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "anet.StrategyTemplate";
    public Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum LocalDnsSessionType {
        SHORT_LINK,
        USE_HTT2,
        USE_HTT3;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LocalDnsSessionType localDnsSessionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyTemplate$LocalDnsSessionType");
        }

        public static LocalDnsSessionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocalDnsSessionType) ipChange.ipc$dispatch("80ece114", new Object[]{str});
            }
            return (LocalDnsSessionType) Enum.valueOf(LocalDnsSessionType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class holder {
        public static StrategyTemplate instance = new StrategyTemplate();

        static {
            t2o.a(607125892);
        }
    }

    static {
        t2o.a(607125889);
    }

    public static StrategyTemplate getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTemplate) ipChange.ipc$dispatch("ea56c8e9", new Object[0]);
        }
        return holder.instance;
    }

    public ConnProtocol getConnProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("6ae4f379", new Object[]{this, str});
        }
        return this.templateMap.get(str);
    }

    public void loadStrategyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f4330", new Object[]{this});
            return;
        }
        try {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.strategy.StrategyTemplate.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IStrategyInstance instance = StrategyCenter.getInstance();
                    if ((instance instanceof StrategyInstance) && ((StrategyInstance) instance).holder == null) {
                        ALog.e(StrategyTemplate.TAG, "[Launcher] loadStrategyInit, StrategyInstance initialize start!!!", null, new Object[0]);
                        instance.initialize(GlobalAppRuntimeInfo.getContext());
                        ALog.e(StrategyTemplate.TAG, "[Launcher] loadStrategyInit, StrategyInstance initialize end!!!", null, new Object[0]);
                    }
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "[Launcher] loadStrategyInit start fail", null, e, e.toString());
        }
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86841926", new Object[]{this, str, connProtocol});
        } else {
            registerConnProtocol(GlobalAppRuntimeInfo.getContext(), str, connProtocol, null);
        }
    }

    public void registerConnProtocol(Context context, String str, ConnProtocol connProtocol, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69526a9c", new Object[]{this, context, str, connProtocol, str2});
            return;
        }
        ALog.e(TAG, "registerConnProtocol", null, "protocol=", connProtocol, " host=", str);
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance instance = StrategyCenter.getInstance();
                if (instance instanceof StrategyInstance) {
                    if (((StrategyInstance) instance).holder == null) {
                        instance.initialize(context);
                    }
                    if (((StrategyInstance) instance).holder != null) {
                        ((StrategyInstance) instance).holder.localDnsStrategyTable.setProtocolForHost(str, connProtocol, str2);
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "registerConnProtocol fail", null, e, e.toString());
            }
        }
    }

    public void registerLocalDnsLookup(Uri uri, String str) {
        List<String> matchHostListByOption;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835b4eaf", new Object[]{this, uri, str});
            return;
        }
        try {
            IStrategyInstance instance = StrategyCenter.getInstance();
            if (instance instanceof StrategyInstance) {
                if (((StrategyInstance) instance).holder == null) {
                    instance.initialize(GlobalAppRuntimeInfo.getContext());
                }
                if (!(((StrategyInstance) instance).holder == null || (matchHostListByOption = AwcnConfig.getMatchHostListByOption(uri, str)) == null || matchHostListByOption.isEmpty())) {
                    for (String str2 : matchHostListByOption) {
                        ((StrategyInstance) instance).holder.localDnsStrategyTable.queryLocalDnsByHost(str2);
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "registerLocalDnsLookup fail", null, e, e.toString());
        }
    }

    public void sendAmdcRequest(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23701c", new Object[]{this, set});
        } else if (set != null) {
            try {
                if (!set.isEmpty()) {
                    IStrategyInstance instance = StrategyCenter.getInstance();
                    if (instance instanceof StrategyInstance) {
                        if (((StrategyInstance) instance).holder == null) {
                            ALog.e(TAG, "[Launcher] sendAmdcRequest, StrategyInstance initialize start!!!", null, new Object[0]);
                            instance.initialize(GlobalAppRuntimeInfo.getContext());
                            ALog.e(TAG, "[Launcher] sendAmdcRequest, StrategyInstance initialize end!!!", null, new Object[0]);
                        }
                        if (((StrategyInstance) instance).holder != null) {
                            ((StrategyInstance) instance).holder.getCurrStrategyTable().sendAmdcRequest(set, HttpDispatcher.AmdcConditionType.LAUNCH_AMDC.ordinal(), false, true);
                            ALog.e(TAG, "[Launcher] force amdc start!!!", null, new Object[0]);
                        }
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "[Launcher] force amdc start fail", null, e, e.toString());
            }
        }
    }

    public void localDnsLookupByHost(List<String> list) {
        boolean z;
        int i;
        int i2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c290f8f", new Object[]{this, list});
        } else if (list != null) {
            try {
                if (!list.isEmpty()) {
                    IStrategyInstance instance = StrategyCenter.getInstance();
                    if (instance instanceof StrategyInstance) {
                        if (((StrategyInstance) instance).holder == null) {
                            instance.initialize(GlobalAppRuntimeInfo.getContext());
                        }
                        if (((StrategyInstance) instance).holder != null) {
                            for (String str2 : list) {
                                int ordinal = LocalDnsSessionType.SHORT_LINK.ordinal();
                                List<IConnStrategy> queryByHost = ((StrategyInstance) instance).holder.getCurrStrategyTable().queryByHost(str2);
                                for (IConnStrategy iConnStrategy : queryByHost) {
                                    if (!("http".equalsIgnoreCase(iConnStrategy.getProtocol().protocol) || "https".equalsIgnoreCase(iConnStrategy.getProtocol().protocol))) {
                                        ALog.e(TAG, "[strategy listener opt] exist strategy! return! ", null, "strategies", queryByHost);
                                        return;
                                    }
                                }
                                ConcurrentHashMap<String, List<String>> presetHostWhiteList = AwcnConfig.getPresetHostWhiteList();
                                if (presetHostWhiteList == null || presetHostWhiteList.isEmpty()) {
                                    str = null;
                                    i2 = ordinal;
                                    i = 0;
                                    z = false;
                                } else {
                                    List<String> list2 = presetHostWhiteList.get(str2);
                                    int parseInt = Integer.parseInt(list2.get(1));
                                    boolean parseBoolean = Boolean.parseBoolean(list2.get(2));
                                    i = Integer.parseInt(list2.get(3));
                                    z = parseBoolean;
                                    i2 = parseInt;
                                    str = list2.get(0);
                                }
                                ((StrategyInstance) instance).holder.localDnsStrategyTable.localDnsLookupByHost(str2, str, i2, i, z);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "[Ipv6_H3] localDnsLookupByHost fail", null, e, e.toString());
            }
        }
    }

    public void registerHTTP3ConnProtocol(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c1a6da", new Object[]{this, context, str, str2, new Integer(i)});
        } else if (str != null && context != null) {
            ALog.e(TAG, "registerHTTP3ConnProtocol", null, "host=", str, "degradeHTTP2Publickey=", str2);
            try {
                IStrategyInstance instance = StrategyCenter.getInstance();
                if (instance instanceof StrategyInstance) {
                    if (((StrategyInstance) instance).holder == null) {
                        instance.initialize(context);
                    }
                    if (((StrategyInstance) instance).holder == null) {
                        return;
                    }
                    if (SessionCenter.getInstance().isExistH3Session(str)) {
                        ALog.e(TAG, "registerHTTP3ConnProtocol, exist avail h3 strategy", null, new Object[0]);
                    } else {
                        ((StrategyInstance) instance).holder.localDnsStrategyTable.setHTTP3ProtocolForHost(str, str2, i);
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "registerHTTP3ConnProtocol fail", null, e, e.toString());
            }
        }
    }
}
