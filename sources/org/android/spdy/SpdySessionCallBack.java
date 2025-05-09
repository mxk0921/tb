package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpdySessionCallBack implements Intenalcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "tnetsdk.SpdySessionCallBack";

    @Override // org.android.spdy.Intenalcb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.bioPingRecvCallback] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.bioPingRecvCallback(spdySession, i);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.bioPingRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.getSSLMeta] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            return sessionCb.getSSLMeta(spdySession);
        }
        spduLog.Loge(TAG, "[SpdySessionCallBack.getSSLMeta] - no sessionCallBack.");
        return null;
    }

    @Override // org.android.spdy.Intenalcb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.putSSLMeta] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            return sessionCb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Loge(TAG, "[SpdySessionCallBack.putSSLMeta] - no sessionCallBack.");
        return -1;
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z, long j, int i, int i2) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87af181d", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyDataSendCallback] - ");
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyDataSendCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyDataSendCallback(spdySession, z, j, i, spdyStream.streamContext);
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdySessionCloseCallback] - ", spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdySessionCloseCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, int i) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4def92c", new Object[]{this, spdySession, new Long(j), map, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyOnStreamResponse] - ", spdySession);
        NetTimeGaurd.start(3);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyOnStreamResponse] - no sessionCallBack.");
        } else {
            spdycb.spdyOnStreamResponse(spdySession, j, map, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyOnStreamResponse", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyPingRecvCallback] - ", spdySession);
        NetTimeGaurd.start(1);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdyPingRecvCallback(spdySession, j, obj);
            NetTimeGaurd.end("spdyPingRecvCallback", 1, begin);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyPingRecvCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(1);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j, int i) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f7cab", new Object[]{this, spdySession, new Long(j), new Integer(i)});
            return;
        }
        spduLog.Logd(TAG, "[SpdySessionCallBack.spdyOnStreamResponse] - ", spdySession.toString());
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyRequestRecvCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyRequestRecvCallback(spdySession, j, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyPingRecvCallback", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdySessionConnectCB] - ", spdySession);
        NetTimeGaurd.start(0);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionConnectCB(spdySession, superviseConnectInfo);
            NetTimeGaurd.end("spdySessionConnectCB", 0, begin);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdySessionConnectCB] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(0);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdySessionFailedError] - ", spdySession);
        NetTimeGaurd.start(2);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionFailedError(spdySession, i, obj);
            spdySession.clearAllStreamCb();
            NetTimeGaurd.end("spdySessionFailedError", 2, begin);
        } else {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdySessionFailedError] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdySessionOnWritable] - ", spdySession);
        NetTimeGaurd.start(2);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb == null || !(sessionCb instanceof SessionExtraCb)) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdySessionOnWritable] - no sessionCallBack.");
        } else {
            long begin = NetTimeGaurd.begin();
            ((SessionExtraCb) spdySession.sessionCallBack).spdySessionOnWritable(spdySession, obj, i);
            NetTimeGaurd.end("spdySessionOnWritable", 2, begin);
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, int i) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b58bc17", new Object[]{this, spdySession, new Boolean(z), new Long(j), spdyByteArray, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyDataChunkRecvCB] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyDataChunkRecvCB] - no sessionCallBack.");
        } else {
            spdycb.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyDataChunkRecvCB", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z, long j, int i, int i2) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce72dfb", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyDataRecvCallback] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyDataRecvCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyDataRecvCallback(spdySession, z, j, i, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyDataRecvCallback", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, int i2, SuperviseData superviseData) {
        Spdycb spdycb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808b770c", new Object[]{this, spdySession, new Long(j), new Integer(i), new Integer(i2), superviseData});
            return;
        }
        spduLog.Logi(TAG, "[SpdySessionCallBack.spdyStreamCloseCallback] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge(TAG, "[SpdySessionCallBack.spdyStreamCloseCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyStreamCloseCallback(spdySession, j, i, spdyStream.streamContext, superviseData);
            spdySession.removeSpdyStream(i2);
        }
        NetTimeGaurd.end("spdyStreamCloseCallback", 3, begin);
        NetTimeGaurd.finish(3);
    }
}
