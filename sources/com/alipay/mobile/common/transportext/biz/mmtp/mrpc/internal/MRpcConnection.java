package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MRpcConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static MRpcConnection k;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, MRpcStream> f4204a = Collections.synchronizedMap(new HashMap());
    public int b = 0;
    public String c = "";
    public String d = "";
    public int e = -1;
    public long f = -1;
    public String g = "";
    public String h = "";
    public ReaderListener i = null;
    public final Map<String, String> j = new HashMap();

    public MRpcConnection() {
        c();
    }

    public static /* synthetic */ int access$002(MRpcConnection mRpcConnection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("948cf2ed", new Object[]{mRpcConnection, new Integer(i)})).intValue();
        }
        mRpcConnection.e = i;
        return i;
    }

    public static /* synthetic */ String access$100(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a648296", new Object[]{mRpcConnection});
        }
        return mRpcConnection.h;
    }

    public static /* synthetic */ String access$102(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8effe78e", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.h = str;
        return str;
    }

    public static /* synthetic */ String access$200(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf6d61cd", new Object[]{mRpcConnection, str});
        }
        return mRpcConnection.b(str);
    }

    public static /* synthetic */ int access$300(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a8a3c5", new Object[]{mRpcConnection, str})).intValue();
        }
        return mRpcConnection.f(str);
    }

    public static /* synthetic */ Map access$400(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4631c5c", new Object[]{mRpcConnection});
        }
        return mRpcConnection.j;
    }

    public static /* synthetic */ String access$500(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de91b09a", new Object[]{mRpcConnection});
        }
        return mRpcConnection.c;
    }

    public static /* synthetic */ String access$502(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6271c92", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.c = str;
        return str;
    }

    public static /* synthetic */ String access$600(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("379cfc1b", new Object[]{mRpcConnection});
        }
        return mRpcConnection.d;
    }

    public static /* synthetic */ String access$602(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cff0e9d3", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.d = str;
        return str;
    }

    public static /* synthetic */ void access$700(MRpcConnection mRpcConnection, MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ec81e8", new Object[]{mRpcConnection, mRpcResponse});
        } else {
            mRpcConnection.d(mRpcResponse);
        }
    }

    public static /* synthetic */ long access$802(MRpcConnection mRpcConnection, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53f062b7", new Object[]{mRpcConnection, new Long(j)})).longValue();
        }
        mRpcConnection.f = j;
        return j;
    }

    public static /* synthetic */ String access$902(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d4e5196", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.g = str;
        return str;
    }

    public static MRpcConnection getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcConnection) ipChange.ipc$dispatch("7706aa44", new Object[0]);
        }
        MRpcConnection mRpcConnection = k;
        if (mRpcConnection != null) {
            return mRpcConnection;
        }
        synchronized (MRpcConnection.class) {
            try {
                MRpcConnection mRpcConnection2 = k;
                if (mRpcConnection2 != null) {
                    return mRpcConnection2;
                }
                MRpcConnection mRpcConnection3 = new MRpcConnection();
                k = mRpcConnection3;
                return mRpcConnection3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MRpcStream a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcStream) ipChange.ipc$dispatch("f48872eb", new Object[]{this, new Integer(i)});
        }
        MRpcStream mRpcStream = new MRpcStream(i, this);
        this.f4204a.put(Integer.valueOf(i), mRpcStream);
        return mRpcStream;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            if (TextUtils.isEmpty(str) || !str.contains("_")) {
                return "";
            }
            return str.substring(str.indexOf("_") + 1);
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", th);
            return "";
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AmnetHelper.getAmnetManager().addGeneraEventListener(getReaderListener());
        AmnetHelper.getAmnetManager().addRpcAcceptDataListener(getReaderListener());
    }

    public final void d(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff59b84", new Object[]{this, mRpcResponse});
            return;
        }
        try {
            if (this.f4204a.isEmpty()) {
                LogCatUtil.debug("MRpcConnection", "[processResponse] There is no stream!");
            } else if (mRpcResponse.resultCode == 2000) {
                h(mRpcResponse);
            } else {
                g(mRpcResponse);
            }
        } catch (Exception e) {
            LogCatUtil.error("MRpcConnection", e);
        }
    }

    public final boolean e(AmnetPost amnetPost, int i, MMTPException mMTPException) {
        MRpcStream stream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f113bdf8", new Object[]{this, amnetPost, new Integer(i), mMTPException})).booleanValue();
        }
        if (i > 0 || mMTPException.errorCode != 1003 || amnetPost.localAmnet || !ExtTransportStrategy.isEnabledTransportByLocalAmnet() || (stream = getStream(amnetPost.reqSeqId)) == null) {
            return false;
        }
        stream.setLocalAmnet(true);
        amnetPost.localAmnet = true;
        TransportContextThreadLocalUtils.getValue().transportByLocalAmnet = true;
        AmnetHelper.post(amnetPost);
        return true;
    }

    public final void g(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f6ed23", new Object[]{this, mRpcResponse});
            return;
        }
        LogCatUtil.info("MRpcConnection", "[handleFailure] Enter.");
        synchronized (this) {
            try {
                MRpcResultCode mRpcResultCode = new MRpcResultCode();
                mRpcResultCode.code = mRpcResponse.resultCode;
                mRpcResultCode.msg = mRpcResponse.resultMsg;
                int i = mRpcResponse.streamId;
                if (i != -1) {
                    MRpcStream mRpcStream = this.f4204a.get(Integer.valueOf(i));
                    if (mRpcStream != null) {
                        try {
                            mRpcStream.close(mRpcResultCode);
                        } catch (Exception e) {
                            LogCatUtil.debug("MRpcConnection", "error message : " + e.toString());
                        }
                    }
                    return;
                } else if (!this.f4204a.isEmpty()) {
                    MRpcStream[] mRpcStreamArr = (MRpcStream[]) this.f4204a.values().toArray(new MRpcStream[this.f4204a.size()]);
                    this.f4204a.clear();
                    for (MRpcStream mRpcStream2 : mRpcStreamArr) {
                        try {
                            mRpcStream2.close(mRpcResultCode);
                        } catch (Exception e2) {
                            LogCatUtil.debug("MRpcConnection", "error message : " + e2.toString());
                        }
                    }
                    LogCatUtil.info("MRpcConnection", "[handleFailure] Clear stream map.");
                    return;
                } else {
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
            throw th;
        }
    }

    public int getConnectionState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b54f017", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String getCurrentTargetHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40288bfd", new Object[]{this});
        }
        return this.c;
    }

    public String getCurrentTargetPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17795ac4", new Object[]{this});
        }
        return this.d;
    }

    public String getLimitPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b9b36d0", new Object[]{this});
        }
        if (!isServerLimiting()) {
            this.g = "";
            return "";
        } else if (TextUtils.isEmpty(this.g)) {
            return "";
        } else {
            return this.g;
        }
    }

    public long getLimitingEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("151cbec6", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public Map<String, String> getMrpcConnContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd40dc71", new Object[]{this});
        }
        return this.j;
    }

    public ReaderListener getReaderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReaderListener) ipChange.ipc$dispatch("94e5e8d5", new Object[]{this});
        }
        ReaderListener readerListener = this.i;
        if (readerListener != null) {
            return readerListener;
        }
        synchronized (this) {
            try {
                ReaderListener readerListener2 = this.i;
                if (readerListener2 != null) {
                    return readerListener2;
                }
                ReaderListener readerListener3 = new ReaderListener();
                this.i = readerListener3;
                return readerListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MRpcStream getStream(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcStream) ipChange.ipc$dispatch("790f2f6", new Object[]{this, new Integer(i)});
        }
        return this.f4204a.get(Integer.valueOf(i));
    }

    public final void h(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f83ec2", new Object[]{this, mRpcResponse});
            return;
        }
        LogCatUtil.info("MRpcConnection", "handleSuccess");
        String str = mRpcResponse.headers.get(HeaderConstant.HEADER_KEY_RPCID);
        if (!TextUtils.isEmpty(str)) {
            MRpcStream stream = getStream(Integer.parseInt(str));
            if (stream != null) {
                mRpcResponse.reqSize = stream.getReqSize();
                stream.receiveResponse(mRpcResponse);
                return;
            }
            throw new IllegalArgumentException("stream no exist,  streamId=[" + str + "]");
        }
        throw new IllegalArgumentException("stream no exist,  streamId=[" + str + "]");
    }

    public boolean hasLocalAmnetStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d773fab", new Object[]{this})).booleanValue();
        }
        try {
            for (Map.Entry<Integer, MRpcStream> entry : this.f4204a.entrySet()) {
                if (entry.getValue().isLocalAmnet()) {
                    LogCatUtil.info("MRpcConnection", "[hasLocalAmnetStream] Find the local amnet stream, id = " + entry.getValue());
                    return true;
                }
            }
            LogCatUtil.info("MRpcConnection", "[hasLocalAmnetStream] Not found local amnet stream.");
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", "[hasLocalAmnetStream] Exception = " + th.toString(), th);
            return true;
        }
    }

    public boolean isServerLimiting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7fac0ff", new Object[]{this})).booleanValue();
        }
        if (this.f == -1) {
            return false;
        }
        if (System.currentTimeMillis() < this.f) {
            return true;
        }
        this.f = -1L;
        return false;
    }

    public void letUsDisband(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f2177c", new Object[]{this, new Integer(i), str});
            return;
        }
        MRpcResponse mRpcResponse = new MRpcResponse();
        mRpcResponse.resultCode = i;
        mRpcResponse.resultMsg = str;
        mRpcResponse.streamId = -1;
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d)) {
            String str2 = this.c;
            String str3 = this.d;
            mRpcResponse.targetHost = str2 + ":" + str3;
        }
        d(mRpcResponse);
    }

    public synchronized MRpcStream newMRpcStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcStream) ipChange.ipc$dispatch("fe60716f", new Object[]{this});
        }
        int i = this.b;
        if (i == 0 || i >= 2147483646) {
            this.b = (((int) ((System.currentTimeMillis() % 1000000) / 1000)) * 1000) + 1;
        }
        MRpcStream a2 = a(this.b);
        this.b++;
        return a2;
    }

    public void removeStream(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8d4b8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            MRpcStream remove = this.f4204a.remove(Integer.valueOf(i));
            StringBuilder sb = new StringBuilder("[removeStream] Finished. streamId = ");
            sb.append(i);
            sb.append(", is hit = ");
            if (remove == null) {
                z = false;
            }
            sb.append(z);
            LogCatUtil.info("MRpcConnection", sb.toString());
        } catch (Throwable th) {
            LogCatUtil.warn("MRpcConnection", "[removeStream] Exception: " + th.toString() + ", streamId = " + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ReaderListener extends AmnetListenerAdpter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Map<String, Double> g = Collections.synchronizedMap(new HashMap(5));

        public ReaderListener() {
        }

        public static /* synthetic */ Object ipc$super(ReaderListener readerListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/mrpc/internal/MRpcConnection$ReaderListener");
        }

        public final void b(AcceptedData acceptedData, MRpcResponse mRpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bc4452b", new Object[]{this, acceptedData, mRpcResponse});
                return;
            }
            mRpcResponse.readTiming = (int) Math.round(acceptedData.readTiming);
            mRpcResponse.ipcP2m = (int) Math.round(acceptedData.ipcP2m);
            mRpcResponse.jtcTiming = (int) Math.round(acceptedData.jtcTIme);
            mRpcResponse.amnetWaitTiming = (int) Math.round(acceptedData.amnetWaitTime);
            mRpcResponse.retried = acceptedData.retried;
            mRpcResponse.amnetStalledTime = (int) Math.round(acceptedData.amnetStalledTime);
            mRpcResponse.airTime = (int) Math.round(acceptedData.airTime);
            mRpcResponse.streamId = (int) acceptedData.receipt;
            mRpcResponse.saTime = (int) Math.round(acceptedData.saTime);
            mRpcResponse.isOnShort = acceptedData.isOnShort;
            mRpcResponse.useShort = acceptedData.useShort;
            mRpcResponse.targetHostShort = acceptedData.targetHostShort;
            mRpcResponse.mtag = acceptedData.mtag;
            mRpcResponse.qoeCur = acceptedData.qoeCur;
            mRpcResponse.queneStorage = acceptedData.queneStorage;
            mRpcResponse.ctjOutTime = (int) Math.round(acceptedData.ctjOutTime);
            mRpcResponse.ntIOTime = (int) Math.round(acceptedData.ntIOTime);
            mRpcResponse.queueOutTime = (int) Math.round(acceptedData.queueOutTime);
            mRpcResponse.amnetHungTime = (int) Math.round(acceptedData.amnetHungTime);
            mRpcResponse.amnetEncodeTime = (int) Math.round(acceptedData.amnetEncodeTime);
            mRpcResponse.amnetAllTime = (int) Math.round(acceptedData.amnetAllTime);
            mRpcResponse.cid = acceptedData.cid;
            mRpcResponse.isFlexible = acceptedData.isFlexible;
            mRpcResponse.targetHost = acceptedData.targetHostLong;
            mRpcResponse.reqZipType = acceptedData.reqZipType;
            mRpcResponse.rspZipType = acceptedData.rspZipType;
            mRpcResponse.isUseBifrost = acceptedData.isUseBifrost;
            mRpcResponse.isUseHttp2 = acceptedData.isUseHttp2;
            mRpcResponse.ipStack = acceptedData.ipStack;
            if (!this.g.isEmpty()) {
                Double d = this.g.get(Baggage.Linkage.RPT_DNS);
                if (d != null) {
                    mRpcResponse.dnsTiming = (int) d.doubleValue();
                }
                Double d2 = this.g.get(Baggage.Linkage.RPT_JVM_TCP_INIT);
                if (d2 != null) {
                    mRpcResponse.tcpTiming = (int) d2.doubleValue();
                }
                Double d3 = this.g.get(Baggage.Linkage.RPT_JVM_SSL_INIT);
                if (d3 != null) {
                    mRpcResponse.sslTiming = (int) d3.doubleValue();
                }
                Double d4 = this.g.get(Baggage.Linkage.RPT_NTV_TCP_INIT);
                if (d4 != null) {
                    mRpcResponse.tcpNtv = (int) d4.doubleValue();
                }
                Double d5 = this.g.get(Baggage.Linkage.RPT_NTV_SSL_INIT);
                if (d5 != null) {
                    mRpcResponse.sslNtv = (int) d5.doubleValue();
                }
                this.g.clear();
            }
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void change(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#change");
            MRpcConnection.access$002(MRpcConnection.this, i);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void notifyInitResponse(Initialization.RspInit rspInit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
            } else {
                MRpcConnection.access$102(MRpcConnection.this, rspInit.clientIp);
            }
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
        public void onAcceptedDataEvent(AcceptedData acceptedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#onAcceptedDataEvent. rpc_id = " + acceptedData.receipt);
            MRpcResponse mRpcResponse = new MRpcResponse();
            mRpcResponse.body = acceptedData.data;
            mRpcResponse.headers = acceptedData.headers;
            mRpcResponse.respSize = acceptedData.compressSize;
            mRpcResponse.resultCode = 2000;
            acceptedData.ipcP2m = System.currentTimeMillis() - acceptedData.ipcP2m;
            mRpcResponse.clientIp = MRpcConnection.access$100(MRpcConnection.this);
            b(acceptedData, mRpcResponse);
            MRpcConnection.access$700(MRpcConnection.this, mRpcResponse);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void onFinalErrorEvent(long j, int i, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87a4b5ec", new Object[]{this, new Long(j), new Integer(i), str, map});
                return;
            }
            MRpcResponse mRpcResponse = new MRpcResponse();
            mRpcResponse.resultCode = i;
            mRpcResponse.resultMsg = str;
            mRpcResponse.streamId = (int) j;
            mRpcResponse.clientIp = MRpcConnection.access$100(MRpcConnection.this);
            a(j, mRpcResponse, map);
            String access$200 = MRpcConnection.access$200(MRpcConnection.this, str);
            int access$300 = MRpcConnection.access$300(MRpcConnection.this, str);
            if (!TextUtils.isEmpty(access$200)) {
                mRpcResponse.mtag = access$200;
            }
            if (access$300 >= 0) {
                mRpcResponse.ipStack = access$300;
                MRpcConnection.access$400(MRpcConnection.this).put(RPCDataItems.IP_STACK, String.valueOf(access$300));
            }
            if (!TextUtils.isEmpty(MRpcConnection.access$500(MRpcConnection.this)) && !TextUtils.isEmpty(MRpcConnection.access$600(MRpcConnection.this))) {
                String access$500 = MRpcConnection.access$500(MRpcConnection.this);
                String access$600 = MRpcConnection.access$600(MRpcConnection.this);
                mRpcResponse.targetHost = access$500 + ":" + access$600;
            }
            MRpcConnection.access$700(MRpcConnection.this, mRpcResponse);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void panic(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            } else {
                LogCatUtil.debug("MRpcConnection", "ReaderListener#panic");
            }
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void report(String str, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#report,key:" + str + ",val:" + d);
            this.g.put(str, Double.valueOf(d));
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void restrict(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
                return;
            }
            LogCatUtil.info("MRpcConnection", "restrict delay=[" + i + "] inf=[" + str + "]");
            MRpcConnection.access$802(MRpcConnection.this, System.currentTimeMillis() + ((long) (i * 1000)));
            MRpcConnection.access$902(MRpcConnection.this, str);
            MRpcConnection.this.letUsDisband(2001, str);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
        public void tell(byte b, long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39d83fa0", new Object[]{this, new Byte(b), new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            LogCatUtil.printInfo("MRpcConnection", "tell reqId=[" + j + "] uncompressSize=[" + i + "]  compressSize=[" + i2 + "]");
            MRpcStream stream = MRpcConnection.this.getStream((int) j);
            if (stream == null) {
                LogCatUtil.info("MRpcConnection", "tell.  Not found reqId=[" + j + "]");
                return;
            }
            stream.setReqSize(i2);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void touch(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
                return;
            }
            MRpcConnection.access$502(MRpcConnection.this, str2);
            MRpcConnection.access$602(MRpcConnection.this, str4);
            LogCatUtil.debug("MRpcConnection", "touch,currentTargetHost:" + str2);
        }

        public final void a(long j, MRpcResponse mRpcResponse, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4db83675", new Object[]{this, new Long(j), mRpcResponse, map});
            } else if (map != null) {
                String str = map.get(AmnetConstant.KEY_AMNET_LIB_VERSION);
                LogCatUtil.debug("MRpcConnection", "onFinalErrorEvent, receiptId:" + j + ", LIBV:" + str);
                if (TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST, str)) {
                    mRpcResponse.isUseBifrost = true;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
                } else if (TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST_HTTP2, str)) {
                    mRpcResponse.isUseBifrost = true;
                    mRpcResponse.isUseHttp2 = true;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                } else if (TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_OLD, str)) {
                    mRpcResponse.isUseBifrost = false;
                    mRpcResponse.isUseHttp2 = false;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_OLD);
                }
            }
        }
    }

    public final int f(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(":")) > -1) {
                return Integer.valueOf(str.substring(indexOf + 1)).intValue();
            }
            return -2;
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", "splitIPstack ex:" + th.toString());
            return -2;
        }
    }

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        AmnetPost amnetPost = new AmnetPost();
        amnetPost.body = mRpcRequest.getDatas();
        amnetPost.header = mRpcRequest.getHeaders();
        amnetPost.channel = (byte) 1;
        amnetPost.reqSeqId = mRpcRequest.reqSeqId;
        amnetPost.important = mRpcRequest.important;
        amnetPost.localAmnet = mRpcRequest.localAmnet;
        amnetPost.isUrgent = mRpcRequest.isUrgent;
        Map<String, String> map = mRpcRequest.extParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : mRpcRequest.extParams.entrySet()) {
                amnetPost.addParam(entry.getKey(), entry.getValue());
            }
        }
        amnetPost.addParam(AmnetConstant.KEY_DATA_TIMEOUT, String.valueOf(mRpcRequest.taskTimeout));
        if (TextUtils.equals(amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK), "1") && mRpcRequest.isCustGwUrl) {
            amnetPost.addParam("url", mRpcRequest.getUrl());
            LogCatUtil.debug("MRpcConnection", "add param KEY_BIFROST_POST_URL");
        }
        try {
            AmnetHelper.post(amnetPost);
        } catch (MMTPException e) {
            if (!e(amnetPost, 0, e)) {
                throw e;
            }
        }
    }
}
