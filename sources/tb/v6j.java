package tb;

import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.statist.StatisticData;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.mtop.MtopBgForbiddenException;
import com.taobao.phenix.compat.mtop.MtopCertificateException;
import com.taobao.phenix.compat.mtop.MtopConnectException;
import com.taobao.phenix.compat.mtop.MtopConnectTimeoutException;
import com.taobao.phenix.compat.mtop.MtopIOException;
import com.taobao.phenix.compat.mtop.MtopIndifferentException;
import com.taobao.phenix.compat.mtop.MtopInvalidHostException;
import com.taobao.phenix.compat.mtop.MtopInvalidUrlException;
import com.taobao.phenix.compat.mtop.MtopRequestCancelException;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.loader.network.NetworkResponseException;
import java.util.List;
import java.util.Map;
import tb.n7b;
import tb.ntj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v6j implements NetworkCallBack.ResponseCodeListener, NetworkCallBack.InputStreamListener, NetworkCallBack.FinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final n7b.a f29812a;
    public final Map<String, String> b;
    public boolean c;

    public v6j(n7b.a aVar, Map<String, String> map) {
        this.f29812a = aVar;
        this.b = map;
    }

    public final String b(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5e266", new Object[]{this, map, str});
        }
        List<String> list = map.get(str);
        String lowerCase = str.toLowerCase();
        if (list == null && !str.equals(lowerCase)) {
            list = map.get(lowerCase);
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // anetwork.channel.NetworkCallBack.InputStreamListener
    public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
        } else if (!this.c && parcelableInputStream != null) {
            u6j u6jVar = new u6j(parcelableInputStream);
            try {
                i = parcelableInputStream.length();
                try {
                    fiv.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "%s get content length(%d) from stream success", h5j.MTOP_PREFIX, Integer.valueOf(i));
                } catch (RemoteException unused) {
                    fiv.c(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "%s get content length from stream failed", h5j.MTOP_PREFIX);
                    this.c = true;
                    ((ntj.a) this.f29812a).b(new t9o(u6jVar, i));
                }
            } catch (RemoteException unused2) {
                i = 0;
            }
            this.c = true;
            ((ntj.a) this.f29812a).b(new t9o(u6jVar, i));
        }
    }

    public final NetworkResponseException a(NetworkEvent.FinishEvent finishEvent) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkResponseException) ipChange.ipc$dispatch("c5ad712", new Object[]{this, finishEvent});
        }
        if (finishEvent != null) {
            i = finishEvent.getHttpCode();
        }
        if (i == -205) {
            return new MtopBgForbiddenException(i);
        }
        if (i == -204) {
            return new MtopRequestCancelException(i);
        }
        if (i != -202) {
            if (i == -102) {
                return new MtopInvalidUrlException(i);
            }
            if (i == 200) {
                return new IncompleteResponseException();
            }
            switch (i) {
                case ErrorConstant.ERROR_CONNECT_EXCEPTION /* -406 */:
                    return new MtopConnectException(i);
                case ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION /* -405 */:
                case ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR /* -403 */:
                    return new MtopInvalidHostException(i);
                case ErrorConstant.ERROR_IO_EXCEPTION /* -404 */:
                    return new MtopIOException(i);
                case ErrorConstant.ERROR_SSL_ERROR /* -402 */:
                    return new MtopCertificateException(i);
                case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                case -400:
                    break;
                default:
                    if (finishEvent != null) {
                        str = finishEvent.getDesc();
                    } else {
                        str = "unknown";
                    }
                    return new MtopIndifferentException(i, str);
            }
        }
        return new MtopConnectTimeoutException(i);
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        StatisticData statisticData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            return;
        }
        if (!(this.b == null || finishEvent == null || (statisticData = finishEvent.getStatisticData()) == null)) {
            this.b.put(h5j.MTOP_EXTRA_CONNECT_TYPE, statisticData.connectionType);
            this.b.put(h5j.MTOP_EXTRA_CDN_IP_PORT, statisticData.ip_port);
            this.b.put(h5j.MTOP_EXTRA_FIRST_DATA, String.valueOf(statisticData.firstDataTime));
            this.b.put(h5j.MTOP_EXTRA_SEND_BEFORE, String.valueOf(statisticData.sendBeforeTime));
            this.b.put(h5j.MTOP_EXTRA_SERVER_RT, String.valueOf(statisticData.serverRT));
        }
        if (!this.c) {
            this.c = true;
            ((ntj.a) this.f29812a).a(a(finishEvent));
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        if (map != null) {
            str3 = b(map, "eagleid");
            str2 = b(map, HttpConstant.CACHE_CONTROL);
            str = b(map, TBImageFlowMonitor.VIA);
        } else {
            str3 = null;
            str = null;
            str2 = null;
        }
        if (this.b != null) {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> map2 = this.b;
                if (str.contains(",H]")) {
                    str4 = "1";
                } else {
                    str4 = "0";
                }
                map2.put(h5j.MTOP_EXTRA_HIT_CDN_CACHE, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                this.b.put("eagleid", str3);
            }
            String c = c(str2);
            if (!TextUtils.isEmpty(c)) {
                this.b.put("max-age", c);
            }
            String str5 = this.b.get("inner_network_start_time");
            if (str5 != null) {
                this.b.put(h5j.MTOP_EXTRA_RESPONSE_CODE, String.valueOf(System.currentTimeMillis() - Long.parseLong(str5)));
            }
            this.b.put(TBImageFlowMonitor.VIA, str);
            if (!TextUtils.isEmpty(str2)) {
                this.b.put(HttpConstant.CACHE_CONTROL, str2);
            }
        }
        if (!this.c && i != 200) {
            this.c = true;
            ((ntj.a) this.f29812a).a(new HttpCodeResponseException(i));
        }
        return true;
    }

    public final String c(String str) {
        String[] split;
        String[] split2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("540d9d1e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (split = str.replace(" ", "").split(",")) == null || split.length <= 0) {
            return "";
        }
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && (split2 = split[i].split("=")) != null && split2.length > 1 && "max-age".equals(split2[0])) {
                return split2[1];
            }
        }
        return "";
    }
}
