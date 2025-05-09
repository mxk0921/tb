package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal;

import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.monitor.SignalStateHelper;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.util.AmnetLimitingHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import javax.net.ssl.SSLException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MRpcStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int j;

    /* renamed from: a  reason: collision with root package name */
    public final MRpcConnection f4205a;
    public int b;
    public MRpcResponse d;
    public int e;
    public MRpcRequest f;
    public int g;
    public MRpcResultCode c = null;
    public boolean h = false;
    public boolean i = false;

    public MRpcStream(int i, MRpcConnection mRpcConnection) {
        this.f4205a = mRpcConnection;
        this.b = i;
    }

    public final void b(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!this.i) {
            this.i = true;
            if (this.f != null) {
                ResultFeedback resultFeedback = new ResultFeedback();
                resultFeedback.id = 1L;
                resultFeedback.receipt = this.f.reqSeqId;
                resultFeedback.duration = i;
                if (z) {
                    AmnetHelper.notifyResultFeedback(resultFeedback, this);
                } else {
                    AmnetHelper.asyncNotifyResultFeedback(resultFeedback, this);
                }
            }
        }
    }

    public void close(MRpcResultCode mRpcResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb32c697", new Object[]{this, mRpcResultCode});
            return;
        }
        this.c = mRpcResultCode;
        synchronized (this) {
            try {
                notifyAll();
            }
        }
        this.f4205a.removeStream(this.b);
    }

    public int getReqSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31206183", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int getStreamId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f996ba2b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int getTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public boolean isLocalAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c62329b", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void receiveResponse(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae0481", new Object[]{this, mRpcResponse});
            return;
        }
        this.d = mRpcResponse;
        synchronized (this) {
            notifyAll();
        }
        this.f4205a.removeStream(this.b);
    }

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        this.f = mRpcRequest;
        this.f4205a.sendRequest(mRpcRequest);
    }

    public void setLocalAmnet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c57cce5", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setReqSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29353e7f", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void setStreamId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc17663f", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void setTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f41d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            int i = j + 1;
            j = i;
            if (i >= 5) {
                j = 0;
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.debug("MRpcStream", "mmtpErrorCount>=5,tryNetworkDiagnose");
                        SignalStateHelper.getInstance().reportNetStateInfo();
                        AlipayQosService.getInstance().getQosLevel();
                        DiagnoseBySystemCall.diagnoseNotify();
                    }
                });
            }
            AlipayQosService.getInstance().estimate(5000.0d, (byte) 1);
        } catch (Throwable th) {
            LogCatUtil.error("MRpcStream", "tryNetworkDiagnose ex:" + th.toString());
        }
    }

    public synchronized MRpcResponse getResponse() {
        MRpcResponse limitingMRpcResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("f375e5da", new Object[]{this});
        }
        int i = 10000;
        try {
            int i2 = this.e;
            if (i2 > 0) {
                i = i2;
            }
            if (this.d == null && this.c == null) {
                wait(i);
            }
            if (this.d != null) {
                b(-1, false);
                j = 0;
                return this.d;
            } else if (this.c != null) {
                b(i, false);
                if (this.c.code == 2001 && (limitingMRpcResponse = AmnetLimitingHelper.getLimitingMRpcResponse()) != null) {
                    return limitingMRpcResponse;
                }
                a();
                MRpcResultCode mRpcResultCode = this.c;
                throw new MMTPException(mRpcResultCode.code, mRpcResultCode.msg);
            } else {
                b(i, true);
                for (int i3 = 0; i3 < 100 && this.c == null; i3++) {
                    Thread.sleep(1L);
                }
                a();
                MRpcResultCode mRpcResultCode2 = this.c;
                if (mRpcResultCode2 == null) {
                    throw new MMTPException(1001, "stream read timeout!  timeout=[" + i + "]");
                } else if (mRpcResultCode2.code == 0) {
                    throw new MMTPException(1001, "stream read timeout!  timeout=[" + i + "]");
                } else if (MMTPException.isTlsError(mRpcResultCode2.msg)) {
                    MRpcResultCode mRpcResultCode3 = this.c;
                    throw new SSLException(new MMTPException(mRpcResultCode3.code, mRpcResultCode3.msg));
                } else {
                    MRpcResultCode mRpcResultCode4 = this.c;
                    throw new MMTPException(mRpcResultCode4.code, mRpcResultCode4.msg);
                }
            }
        } catch (MMTPException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (InterruptedException e3) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e3);
            throw interruptedIOException;
        }
    }
}
