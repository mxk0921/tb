package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ErrorConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.ParcelableFuture;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConnectionDelegate extends Connection.Stub implements NetworkCallBack.InputStreamListener, NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener {
    private RequestConfig config;
    private String desc;
    private ParcelableFuture future;
    private Map<String, List<String>> header;
    private ParcelableInputStreamImpl inputStream;
    private StatisticData statisticData;
    private int statusCode;
    private CountDownLatch statusLatch = new CountDownLatch(1);
    private CountDownLatch streamLatch = new CountDownLatch(1);

    static {
        t2o.a(607126011);
        t2o.a(607125967);
        t2o.a(607125966);
        t2o.a(607125969);
    }

    public ConnectionDelegate(int i) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
    }

    private RemoteException buildRemoteException(String str) {
        return new RemoteException(str);
    }

    private void waitCountDownLatch(CountDownLatch countDownLatch) throws RemoteException {
        try {
            RequestConfig requestConfig = this.config;
            if (requestConfig == null) {
                throw buildRemoteException("illegal request");
            } else if (!countDownLatch.await(requestConfig.getWaitTimeout() + 1000, TimeUnit.MILLISECONDS)) {
                ParcelableFuture parcelableFuture = this.future;
                if (parcelableFuture != null) {
                    parcelableFuture.cancel(true);
                }
                throw buildRemoteException("wait time out");
            }
        } catch (InterruptedException unused) {
            throw buildRemoteException("thread interrupt");
        }
    }

    @Override // anetwork.channel.aidl.Connection
    public void cancel() throws RemoteException {
        ParcelableFuture parcelableFuture = this.future;
        if (parcelableFuture != null) {
            parcelableFuture.cancel(true);
        }
    }

    @Override // anetwork.channel.aidl.Connection
    public Map<String, List<String>> getConnHeadFields() throws RemoteException {
        waitCountDownLatch(this.statusLatch);
        return this.header;
    }

    @Override // anetwork.channel.aidl.Connection
    public String getDesc() throws RemoteException {
        waitCountDownLatch(this.statusLatch);
        return this.desc;
    }

    @Override // anetwork.channel.aidl.Connection
    public ParcelableInputStream getInputStream() throws RemoteException {
        waitCountDownLatch(this.streamLatch);
        return this.inputStream;
    }

    @Override // anetwork.channel.aidl.Connection
    public StatisticData getStatisticData() {
        return this.statisticData;
    }

    @Override // anetwork.channel.aidl.Connection
    public int getStatusCode() throws RemoteException {
        waitCountDownLatch(this.statusLatch);
        return this.statusCode;
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        String str;
        this.statusCode = finishEvent.getHttpCode();
        if (finishEvent.getDesc() != null) {
            str = finishEvent.getDesc();
        } else {
            str = ErrorConstant.getErrMsg(this.statusCode);
        }
        this.desc = str;
        this.statisticData = finishEvent.getStatisticData();
        ParcelableInputStreamImpl parcelableInputStreamImpl = this.inputStream;
        if (parcelableInputStreamImpl != null) {
            parcelableInputStreamImpl.writeEnd();
        }
        this.streamLatch.countDown();
        this.statusLatch.countDown();
    }

    @Override // anetwork.channel.NetworkCallBack.InputStreamListener
    public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
        this.inputStream = (ParcelableInputStreamImpl) parcelableInputStream;
        this.streamLatch.countDown();
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        this.statusCode = i;
        this.desc = ErrorConstant.getErrMsg(i);
        this.header = map;
        this.statusLatch.countDown();
        return false;
    }

    public void setFuture(ParcelableFuture parcelableFuture) {
        this.future = parcelableFuture;
    }

    public ConnectionDelegate(RequestConfig requestConfig) {
        this.config = requestConfig;
    }
}
