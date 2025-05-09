package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.statist.LongRequestMonitorStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.monitor.NetworkQoSCenter;
import anetwork.channel.monitor.RRPSpeedCalculator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Repeater implements Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SO_DOWNLOAD_HOST = "mtlexternal.alibabausercontent.com";
    private static final String TAG = "anet.Repeater";
    public static AtomicLong requestingCount = new AtomicLong(0);
    private boolean bInputStreamListener;
    private RequestConfig config;
    private ParcelableNetworkListener mListenerWrapper;
    private String seqNo;
    private ParcelableInputStreamImpl inputStream = null;
    private long responseCbStart = 0;
    private long responseStartTime = -1;
    private long responseCbTime = -1;
    private long cbTime = 0;

    static {
        t2o.a(607126050);
        t2o.a(607126065);
    }

    public Repeater(ParcelableNetworkListener parcelableNetworkListener, RequestConfig requestConfig) {
        this.bInputStreamListener = false;
        this.mListenerWrapper = parcelableNetworkListener;
        this.config = requestConfig;
        if (parcelableNetworkListener != null) {
            try {
                if ((parcelableNetworkListener.getListenerState() & 8) != 0) {
                    this.bInputStreamListener = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public static /* synthetic */ long access$000(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da6342f4", new Object[]{repeater})).longValue();
        }
        return repeater.responseCbStart;
    }

    public static /* synthetic */ long access$002(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20417576", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.responseCbStart = j;
        return j;
    }

    public static /* synthetic */ long access$100(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67036df5", new Object[]{repeater})).longValue();
        }
        return repeater.responseCbTime;
    }

    public static /* synthetic */ long access$102(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27a6aa95", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.responseCbTime = j;
        return j;
    }

    public static /* synthetic */ long access$200(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a398f6", new Object[]{repeater})).longValue();
        }
        return repeater.responseStartTime;
    }

    public static /* synthetic */ long access$300(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8043c3f7", new Object[]{repeater})).longValue();
        }
        return repeater.cbTime;
    }

    public static /* synthetic */ long access$302(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("367114d3", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.cbTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$400(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce3ef08", new Object[]{repeater})).booleanValue();
        }
        return repeater.bInputStreamListener;
    }

    public static /* synthetic */ RequestConfig access$500(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("dd2f6543", new Object[]{repeater});
        }
        return repeater.config;
    }

    public static /* synthetic */ String access$600(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf39c5a", new Object[]{repeater});
        }
        return repeater.seqNo;
    }

    public static /* synthetic */ ParcelableInputStreamImpl access$700(Repeater repeater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableInputStreamImpl) ipChange.ipc$dispatch("4350f282", new Object[]{repeater});
        }
        return repeater.inputStream;
    }

    public static /* synthetic */ ParcelableInputStreamImpl access$702(Repeater repeater, ParcelableInputStreamImpl parcelableInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableInputStreamImpl) ipChange.ipc$dispatch("8147c69d", new Object[]{repeater, parcelableInputStreamImpl});
        }
        repeater.inputStream = parcelableInputStreamImpl;
        return parcelableInputStreamImpl;
    }

    public static /* synthetic */ void access$800(Repeater repeater, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739741e0", new Object[]{repeater, requestStatistic});
        } else {
            repeater.checkLongRequest(requestStatistic);
        }
    }

    public static /* synthetic */ void access$900(Repeater repeater, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518aa7bf", new Object[]{repeater, requestStatistic});
        } else {
            repeater.doCheckLongRequestTask(requestStatistic);
        }
    }

    private void checkLongRequest(final RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c554856", new Object[]{this, requestStatistic});
        } else if (NetworkConfigCenter.isLongRequestMonitorEnable()) {
            ThreadPoolExecutorFactory.submitRequestMonitorTask(new Runnable() { // from class: anetwork.channel.entity.Repeater.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Repeater.access$900(Repeater.this, requestStatistic);
                    } catch (Exception e) {
                        ALog.e(Repeater.TAG, "[checkLongRequet]error", null, e, new Object[0]);
                    }
                }
            });
        }
    }

    private void dispatchCallBack(Runnable runnable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d34bb84", new Object[]{this, runnable});
        } else if (this.config.isSyncRequest()) {
            runnable.run();
        } else {
            String str = this.seqNo;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = hashCode();
            }
            RepeatProcessor.submitTask(i, runnable);
        }
    }

    private void doCheckLongRequestTask(RequestStatistic requestStatistic) {
        String urlString;
        String obj;
        int length;
        int length2;
        int length3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539a7d06", new Object[]{this, requestStatistic});
        } else if (requestStatistic != null && (length3 = (length = (urlString = this.config.getUrlString()).length()) + (length2 = (obj = this.config.getHeaders().toString()).length())) >= 6144) {
            LongRequestMonitorStat longRequestMonitorStat = new LongRequestMonitorStat(this.config.getHttpUrl().simpleUrlString());
            longRequestMonitorStat.originUrl = urlString;
            longRequestMonitorStat.header = obj;
            longRequestMonitorStat.headerSize = length2;
            longRequestMonitorStat.urlSize = length;
            longRequestMonitorStat.httpCode = requestStatistic.statusCode;
            longRequestMonitorStat.method = this.config.getAwcnRequest().getMethod();
            longRequestMonitorStat.refer = requestStatistic.f_refer;
            String str = null;
            for (Map.Entry<String, String> entry : this.config.getHeaders().entrySet()) {
                int length4 = entry.getValue().length();
                if (length4 > i) {
                    str = entry.getKey();
                    i = length4;
                }
            }
            longRequestMonitorStat.maxHeader = str;
            longRequestMonitorStat.maxHeaderSize = i;
            if (length3 >= 8192) {
                longRequestMonitorStat.reportType = 1;
            } else if (length3 >= 7168) {
                longRequestMonitorStat.reportType = 2;
            } else {
                longRequestMonitorStat.reportType = 3;
            }
            AppMonitor.getInstance().commitStat(longRequestMonitorStat);
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onDataReceiveSize(final int i, final int i2, final ByteArray byteArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30133c3", new Object[]{this, new Integer(i), new Integer(i2), byteArray});
            return;
        }
        if (byteArray != null) {
            NetworkQoSCenter.getInstance().update(this.config.getHost(), System.currentTimeMillis(), byteArray.getDataLength());
            RRPSpeedCalculator.getInstance().receive(byteArray.getDataLength());
        }
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener != null) {
            dispatchCallBack(new Runnable() { // from class: anetwork.channel.entity.Repeater.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!Repeater.access$400(Repeater.this)) {
                        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent(i, byteArray.getDataLength(), i2, byteArray.getBuffer(), byteArray.getRangeIndex());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (i == 1) {
                                Repeater.access$500(Repeater.this).rs.putExtra("firstDataCbTime", Long.valueOf(System.currentTimeMillis() - Repeater.access$200(Repeater.this)));
                            }
                            parcelableNetworkListener.onDataReceived(defaultProgressEvent);
                            Repeater repeater = Repeater.this;
                            Repeater.access$302(repeater, Repeater.access$300(repeater) + (System.currentTimeMillis() - currentTimeMillis));
                        } catch (RemoteException e) {
                            ALog.e(Repeater.TAG, "[onDataReceiveSize] fail!", Repeater.access$600(Repeater.this), "e", e);
                        }
                    } else {
                        try {
                            if (Repeater.access$700(Repeater.this) == null) {
                                Repeater.access$702(Repeater.this, new ParcelableInputStreamImpl());
                                Repeater.access$700(Repeater.this).init(Repeater.access$500(Repeater.this), i2);
                                Repeater.access$700(Repeater.this).write(byteArray);
                                parcelableNetworkListener.onInputStreamGet(Repeater.access$700(Repeater.this));
                            } else {
                                Repeater.access$700(Repeater.this).write(byteArray);
                            }
                        } catch (Throwable th) {
                            ALog.e(Repeater.TAG, "[onDataReceiveSize] fail!", Repeater.access$600(Repeater.this), "e", th);
                            if (Repeater.access$700(Repeater.this) != null) {
                                try {
                                    ALog.e(Repeater.TAG, "[onDataReceiveSize] fail! close", Repeater.access$600(Repeater.this), "e", th);
                                    Repeater.access$700(Repeater.this).close();
                                } catch (RemoteException unused) {
                                    ALog.e(Repeater.TAG, "[onDataReceiveSize] fail! close error ", Repeater.access$600(Repeater.this), "e", th);
                                }
                            }
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            if (stackTrace != null) {
                                for (int i3 = 0; i3 < stackTrace.length && i3 <= 40; i3++) {
                                    String stackTraceElement = stackTrace[i3].toString();
                                    ALog.e(Repeater.TAG, "[onDataReceiveSize] fail! i=" + i3, Repeater.access$600(Repeater.this), "str1", stackTraceElement);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onFinish(final DefaultFinishEvent defaultFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0dbf1", new Object[]{this, defaultFinishEvent});
            return;
        }
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener != null) {
            Runnable runnable = new Runnable() { // from class: anetwork.channel.entity.Repeater.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(49:42|(3:44|(2:47|45)|174)|48|(1:50)|51|(1:57)|58|(3:60|(1:62)|63)|64|(1:70)|71|(1:83)|84|(1:86)|87|(1:89)|90|(1:94)|95|(26:100|102|(1:104)(1:105)|106|(1:108)|109|(1:115)|116|(1:118)|119|(1:127)|128|(2:166|130)|131|(1:133)|134|(1:141)|142|(1:144)|172|145|(1:147)(1:148)|149|(1:153)|154|178)|101|102|(0)(0)|106|(0)|109|(1:111)|115|116|(0)|119|(4:121|123|125|127)|128|(0)|131|(0)|134|(1:136)|141|142|(0)|172|145|(0)(0)|149|(1:151)|153|154|178) */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0369  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x036c  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x038a A[Catch: all -> 0x0137, TryCatch #1 {all -> 0x0137, blocks: (B:13:0x00cd, B:17:0x0101, B:19:0x011f, B:21:0x0125, B:25:0x013c, B:29:0x014e, B:31:0x016a, B:33:0x018e, B:35:0x0199, B:36:0x019f, B:38:0x01b3, B:40:0x01bb, B:42:0x01c6, B:44:0x0204, B:45:0x0209, B:47:0x020e, B:48:0x0220, B:50:0x0226, B:51:0x0234, B:53:0x023a, B:55:0x023e, B:57:0x0242, B:58:0x0254, B:60:0x025e, B:62:0x027c, B:63:0x0281, B:64:0x0291, B:66:0x0297, B:68:0x029f, B:70:0x02a9, B:71:0x02b2, B:73:0x02cb, B:75:0x02d3, B:77:0x02de, B:79:0x02e9, B:81:0x02ef, B:83:0x02f9, B:84:0x0308, B:86:0x030c, B:87:0x0322, B:89:0x0326, B:90:0x032d, B:92:0x0336, B:94:0x033a, B:95:0x0349, B:97:0x0354, B:102:0x0365, B:106:0x036e, B:108:0x038a, B:109:0x0396, B:111:0x039b, B:113:0x039f, B:115:0x03a3, B:116:0x03af, B:118:0x03b9, B:119:0x03c5, B:121:0x03cb, B:123:0x03d8, B:125:0x03e0, B:127:0x03e4, B:128:0x043a, B:130:0x043e, B:131:0x044a, B:133:0x0482, B:134:0x0485, B:136:0x049d, B:138:0x04a5, B:141:0x04af, B:142:0x04bb, B:144:0x04bf, B:145:0x04cb, B:148:0x04d3, B:149:0x04da, B:151:0x04e0, B:153:0x04e6, B:154:0x04f2), top: B:168:0x00cd }] */
                /* JADX WARN: Removed duplicated region for block: B:118:0x03b9 A[Catch: all -> 0x0137, TryCatch #1 {all -> 0x0137, blocks: (B:13:0x00cd, B:17:0x0101, B:19:0x011f, B:21:0x0125, B:25:0x013c, B:29:0x014e, B:31:0x016a, B:33:0x018e, B:35:0x0199, B:36:0x019f, B:38:0x01b3, B:40:0x01bb, B:42:0x01c6, B:44:0x0204, B:45:0x0209, B:47:0x020e, B:48:0x0220, B:50:0x0226, B:51:0x0234, B:53:0x023a, B:55:0x023e, B:57:0x0242, B:58:0x0254, B:60:0x025e, B:62:0x027c, B:63:0x0281, B:64:0x0291, B:66:0x0297, B:68:0x029f, B:70:0x02a9, B:71:0x02b2, B:73:0x02cb, B:75:0x02d3, B:77:0x02de, B:79:0x02e9, B:81:0x02ef, B:83:0x02f9, B:84:0x0308, B:86:0x030c, B:87:0x0322, B:89:0x0326, B:90:0x032d, B:92:0x0336, B:94:0x033a, B:95:0x0349, B:97:0x0354, B:102:0x0365, B:106:0x036e, B:108:0x038a, B:109:0x0396, B:111:0x039b, B:113:0x039f, B:115:0x03a3, B:116:0x03af, B:118:0x03b9, B:119:0x03c5, B:121:0x03cb, B:123:0x03d8, B:125:0x03e0, B:127:0x03e4, B:128:0x043a, B:130:0x043e, B:131:0x044a, B:133:0x0482, B:134:0x0485, B:136:0x049d, B:138:0x04a5, B:141:0x04af, B:142:0x04bb, B:144:0x04bf, B:145:0x04cb, B:148:0x04d3, B:149:0x04da, B:151:0x04e0, B:153:0x04e6, B:154:0x04f2), top: B:168:0x00cd }] */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0482 A[Catch: all -> 0x0137, TryCatch #1 {all -> 0x0137, blocks: (B:13:0x00cd, B:17:0x0101, B:19:0x011f, B:21:0x0125, B:25:0x013c, B:29:0x014e, B:31:0x016a, B:33:0x018e, B:35:0x0199, B:36:0x019f, B:38:0x01b3, B:40:0x01bb, B:42:0x01c6, B:44:0x0204, B:45:0x0209, B:47:0x020e, B:48:0x0220, B:50:0x0226, B:51:0x0234, B:53:0x023a, B:55:0x023e, B:57:0x0242, B:58:0x0254, B:60:0x025e, B:62:0x027c, B:63:0x0281, B:64:0x0291, B:66:0x0297, B:68:0x029f, B:70:0x02a9, B:71:0x02b2, B:73:0x02cb, B:75:0x02d3, B:77:0x02de, B:79:0x02e9, B:81:0x02ef, B:83:0x02f9, B:84:0x0308, B:86:0x030c, B:87:0x0322, B:89:0x0326, B:90:0x032d, B:92:0x0336, B:94:0x033a, B:95:0x0349, B:97:0x0354, B:102:0x0365, B:106:0x036e, B:108:0x038a, B:109:0x0396, B:111:0x039b, B:113:0x039f, B:115:0x03a3, B:116:0x03af, B:118:0x03b9, B:119:0x03c5, B:121:0x03cb, B:123:0x03d8, B:125:0x03e0, B:127:0x03e4, B:128:0x043a, B:130:0x043e, B:131:0x044a, B:133:0x0482, B:134:0x0485, B:136:0x049d, B:138:0x04a5, B:141:0x04af, B:142:0x04bb, B:144:0x04bf, B:145:0x04cb, B:148:0x04d3, B:149:0x04da, B:151:0x04e0, B:153:0x04e6, B:154:0x04f2), top: B:168:0x00cd }] */
                /* JADX WARN: Removed duplicated region for block: B:144:0x04bf A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #1 {all -> 0x0137, blocks: (B:13:0x00cd, B:17:0x0101, B:19:0x011f, B:21:0x0125, B:25:0x013c, B:29:0x014e, B:31:0x016a, B:33:0x018e, B:35:0x0199, B:36:0x019f, B:38:0x01b3, B:40:0x01bb, B:42:0x01c6, B:44:0x0204, B:45:0x0209, B:47:0x020e, B:48:0x0220, B:50:0x0226, B:51:0x0234, B:53:0x023a, B:55:0x023e, B:57:0x0242, B:58:0x0254, B:60:0x025e, B:62:0x027c, B:63:0x0281, B:64:0x0291, B:66:0x0297, B:68:0x029f, B:70:0x02a9, B:71:0x02b2, B:73:0x02cb, B:75:0x02d3, B:77:0x02de, B:79:0x02e9, B:81:0x02ef, B:83:0x02f9, B:84:0x0308, B:86:0x030c, B:87:0x0322, B:89:0x0326, B:90:0x032d, B:92:0x0336, B:94:0x033a, B:95:0x0349, B:97:0x0354, B:102:0x0365, B:106:0x036e, B:108:0x038a, B:109:0x0396, B:111:0x039b, B:113:0x039f, B:115:0x03a3, B:116:0x03af, B:118:0x03b9, B:119:0x03c5, B:121:0x03cb, B:123:0x03d8, B:125:0x03e0, B:127:0x03e4, B:128:0x043a, B:130:0x043e, B:131:0x044a, B:133:0x0482, B:134:0x0485, B:136:0x049d, B:138:0x04a5, B:141:0x04af, B:142:0x04bb, B:144:0x04bf, B:145:0x04cb, B:148:0x04d3, B:149:0x04da, B:151:0x04e0, B:153:0x04e6, B:154:0x04f2), top: B:168:0x00cd }] */
                /* JADX WARN: Removed duplicated region for block: B:147:0x04d1  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x04d3 A[Catch: all -> 0x0137, Exception -> 0x04f2, TryCatch #1 {all -> 0x0137, blocks: (B:13:0x00cd, B:17:0x0101, B:19:0x011f, B:21:0x0125, B:25:0x013c, B:29:0x014e, B:31:0x016a, B:33:0x018e, B:35:0x0199, B:36:0x019f, B:38:0x01b3, B:40:0x01bb, B:42:0x01c6, B:44:0x0204, B:45:0x0209, B:47:0x020e, B:48:0x0220, B:50:0x0226, B:51:0x0234, B:53:0x023a, B:55:0x023e, B:57:0x0242, B:58:0x0254, B:60:0x025e, B:62:0x027c, B:63:0x0281, B:64:0x0291, B:66:0x0297, B:68:0x029f, B:70:0x02a9, B:71:0x02b2, B:73:0x02cb, B:75:0x02d3, B:77:0x02de, B:79:0x02e9, B:81:0x02ef, B:83:0x02f9, B:84:0x0308, B:86:0x030c, B:87:0x0322, B:89:0x0326, B:90:0x032d, B:92:0x0336, B:94:0x033a, B:95:0x0349, B:97:0x0354, B:102:0x0365, B:106:0x036e, B:108:0x038a, B:109:0x0396, B:111:0x039b, B:113:0x039f, B:115:0x03a3, B:116:0x03af, B:118:0x03b9, B:119:0x03c5, B:121:0x03cb, B:123:0x03d8, B:125:0x03e0, B:127:0x03e4, B:128:0x043a, B:130:0x043e, B:131:0x044a, B:133:0x0482, B:134:0x0485, B:136:0x049d, B:138:0x04a5, B:141:0x04af, B:142:0x04bb, B:144:0x04bf, B:145:0x04cb, B:148:0x04d3, B:149:0x04da, B:151:0x04e0, B:153:0x04e6, B:154:0x04f2), top: B:168:0x00cd }] */
                /* JADX WARN: Removed duplicated region for block: B:166:0x043e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1379
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.entity.Repeater.AnonymousClass3.run():void");
                }
            };
            RequestStatistic requestStatistic = defaultFinishEvent.rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbDispatch = System.currentTimeMillis();
                AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspCbDispatch", null);
            }
            dispatchCallBack(runnable);
        }
        this.mListenerWrapper = null;
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onResponseCode(final int i, final Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "[onResponseCode]", this.seqNo, new Object[0]);
        }
        this.responseStartTime = System.currentTimeMillis();
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener != null) {
            dispatchCallBack(new Runnable() { // from class: anetwork.channel.entity.Repeater.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Repeater.access$002(Repeater.this, System.currentTimeMillis());
                        Repeater repeater = Repeater.this;
                        Repeater.access$102(repeater, Repeater.access$000(repeater) - Repeater.access$200(Repeater.this));
                        parcelableNetworkListener.onResponseCode(i, new ParcelableHeader(i, map));
                        Repeater.access$302(Repeater.this, 0L);
                        Repeater repeater2 = Repeater.this;
                        Repeater.access$302(repeater2, Repeater.access$300(repeater2) + (System.currentTimeMillis() - Repeater.access$000(Repeater.this)));
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public void setSeqNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfc034f", new Object[]{this, str});
        } else {
            this.seqNo = str;
        }
    }
}
