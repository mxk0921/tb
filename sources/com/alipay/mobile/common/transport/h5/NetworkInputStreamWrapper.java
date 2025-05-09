package com.alipay.mobile.common.transport.h5;

import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.io.RpcBufferedInputStream;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorLogRecordUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkInputStreamWrapper extends RpcBufferedInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final HttpManager b;
    public final HttpWorker d;
    public Throwable e;
    public TransportContext mTransportContext;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4066a = false;
    public long c = -1;

    public NetworkInputStreamWrapper(InputStream inputStream, TransportContext transportContext, HttpManager httpManager, HttpWorker httpWorker) {
        super(inputStream);
        this.mTransportContext = transportContext;
        this.b = httpManager;
        this.d = httpWorker;
    }

    public static /* synthetic */ void access$000(NetworkInputStreamWrapper networkInputStreamWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b30b21", new Object[]{networkInputStreamWrapper});
        } else {
            networkInputStreamWrapper.g();
        }
    }

    public static /* synthetic */ Object ipc$super(NetworkInputStreamWrapper networkInputStreamWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -483678593) {
            super.close();
            return null;
        } else if (hashCode == 862063607) {
            return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/h5/NetworkInputStreamWrapper");
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        LogCatUtil.warn("NetworkInputStreamWrapper", "H5InputStream invoke close.");
        if (!this.f4066a) {
            monitorLog();
        }
        super.close();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.mTransportContext.taskFinishedTimeMillis = System.currentTimeMillis();
        NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.transport.h5.NetworkInputStreamWrapper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NetworkInputStreamWrapper.access$000(NetworkInputStreamWrapper.this);
                }
            }
        });
    }

    public void monitorLog() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1ee711", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f4066a = true;
                this.mTransportContext.getCurrentDataContainer().timeItemRelease("ALL_TIME");
                long currentTimeMillis2 = System.currentTimeMillis();
                long j = this.c;
                long j2 = currentTimeMillis2 - j;
                if (j == -1) {
                    j2 = 0;
                }
                this.mTransportContext.getCurrentDataContainer().putDataItem(RPCDataItems.READ_TIME, String.valueOf(j2));
                if (w()) {
                    e();
                } else {
                    g();
                }
                sb = new StringBuilder("cost:");
            } catch (Exception e) {
                LogCatUtil.error("NetworkInputStreamWrapper", e);
                sb = new StringBuilder("cost:");
            }
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            LogCatUtil.info("NetworkInputStreamWrapper", sb.toString());
        } catch (Throwable th) {
            LogCatUtil.info("NetworkInputStreamWrapper", "cost:" + (System.currentTimeMillis() - currentTimeMillis));
            throw th;
        }
    }

    @Override // com.alipay.mobile.common.transport.io.RpcBufferedInputStream, java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        IOException e;
        Throwable th;
        long currentTimeMillis;
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.c == -1) {
            this.c = System.currentTimeMillis();
        }
        try {
            currentTimeMillis = System.currentTimeMillis();
            read = super.read(bArr, i, i2);
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            AlipayQosService.getInstance().estimateByStartTime(currentTimeMillis, (byte) 5);
            if ((read == -1 || this.e != null) && !this.f4066a) {
                monitorLog();
            }
            return read;
        } catch (IOException e3) {
            e = e3;
            LogCatUtil.debug("NetworkInputStreamWrapper", "read ex:" + e.toString());
            if (e instanceof SocketTimeoutException) {
                AlipayQosService.getInstance().estimate(5000.0d, (byte) 5);
            }
            this.e = e;
            throw e;
        } catch (Throwable th3) {
            th = th3;
            this.e = th;
            InterruptedIOException interruptedIOException = new InterruptedIOException(th.getMessage());
            interruptedIOException.initCause(th);
            throw interruptedIOException;
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            HttpUrlRequest originRequest = this.d.getOriginRequest();
            if (originRequest == null || !(originRequest instanceof H5HttpUrlRequest)) {
                return false;
            }
            return ((H5HttpUrlRequest) originRequest).isAsyncMonitorLog();
        } catch (Throwable th) {
            LogCatUtil.error("NetworkInputStreamWrapper", "isAsyncMonitorLog error. ", th);
            return false;
        }
    }

    public final void g() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Throwable th = this.e;
        if (th != null) {
            LogCatUtil.error("NetworkInputStreamWrapper", "Read fail, exception: ", th);
            this.mTransportContext.getCurrentDataContainer().putDataItem("ERROR", this.e.toString());
        }
        if (this.d.getOriginRequest().isCanceled()) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "CANCEL", "T");
        }
        this.mTransportContext.getCurrentDataContainer().putDataItem(RPCDataItems.RES_SIZE, String.valueOf(getReaded()));
        this.d.doMonitorLog();
        try {
            TransportContext transportContext = this.mTransportContext;
            byte b = transportContext.bizType;
            if (b == 3) {
                i = 2;
            }
            if (b == 5) {
                i = 5;
            }
            String str = transportContext.url;
            String dataItem = transportContext.getCurrentDataContainer().getDataItem(RPCDataItems.REQ_SIZE);
            TraficConsumeModel obtain = TraficConsumeModel.obtain(i, str, !TextUtils.isEmpty(dataItem) ? Long.valueOf(dataItem).longValue() : 0L, getReaded(), null);
            obtain.isUpload = false;
            obtain.bizId = this.d.getOriginRequest().getTag("bizId");
            obtain.reqHeaders = this.d.getOriginRequest().getHttpUriRequest().getAllHeaders();
            obtain.respHeaders = this.d.getHttpResponse().getAllHeaders();
            HttpUrlRequest originRequest = this.d.getOriginRequest();
            if (originRequest != null && (originRequest instanceof H5HttpUrlRequest)) {
                H5HttpUrlRequest h5HttpUrlRequest = (H5HttpUrlRequest) originRequest;
                MonitorLogRecordUtil.recordCtrlPrintURLFlagToDataflow(obtain, h5HttpUrlRequest.isPrintUrlToMonitorLog());
                if (!TextUtils.isEmpty(h5HttpUrlRequest.getRefer())) {
                    obtain.extParams.put("h5_refer", h5HttpUrlRequest.getRefer());
                }
            }
            MonitorInfoUtil.noteTraficConsume(obtain);
        } catch (Throwable th2) {
            LogCatUtil.warn("NetworkInputStreamWrapper", "NetworkISW.outer", th2);
        }
        String dataItem2 = this.mTransportContext.getCurrentDataContainer().getDataItem(RPCDataItems.READ_TIME);
        if (!TextUtils.isEmpty(dataItem2)) {
            try {
                this.b.addSocketTime(Long.parseLong(dataItem2));
            } catch (Throwable unused) {
            }
        }
    }
}
