package com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlowingSpeechSynthesizerListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Nls.SynthesizerListener";
    private CountDownLatch completeLatch;
    private CountDownLatch readyLatch;
    private final FlowingSpeechSynthesizer speechSynthesizer;
    private final SpeechSynthesizerCallback speechSynthesizerCallback;
    private Boolean websocketConnecting = Boolean.FALSE;

    static {
        t2o.a(199229451);
        t2o.a(199229476);
    }

    public FlowingSpeechSynthesizerListener(FlowingSpeechSynthesizer flowingSpeechSynthesizer, SpeechSynthesizerCallback speechSynthesizerCallback) {
        this.speechSynthesizer = flowingSpeechSynthesizer;
        this.speechSynthesizerCallback = speechSynthesizerCallback;
    }

    private boolean isComplete(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4eeedff", new Object[]{this, speechSynthesizerResponse})).booleanValue();
        }
        return speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TTS_COMPLETE);
    }

    private boolean isReady(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e59795", new Object[]{this, speechSynthesizerResponse})).booleanValue() : speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TTS_STARTED);
    }

    private boolean isTaskFailed(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9063a8", new Object[]{this, speechSynthesizerResponse})).booleanValue();
        }
        return speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }

    public void countDownReadyLatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1aa719", new Object[]{this});
            return;
        }
        CountDownLatch countDownLatch = this.readyLatch;
        if (countDownLatch != null && countDownLatch.getCount() > 0) {
            this.readyLatch.countDown();
        }
    }

    public Boolean isWebsocketConnecting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("249f74d9", new Object[]{this});
        }
        return this.websocketConnecting;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder sb = new StringBuilder("connection is closed due to {");
        sb.append(str);
        sb.append("},code:{");
        sb.append(i);
        sb.append("}");
        this.websocketConnecting = Boolean.FALSE;
        this.speechSynthesizerCallback.onChannelClosed(str, i);
    }

    public void onComplete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d14c9", new Object[]{this, str});
        } else {
            this.speechSynthesizerCallback.onSynthesisCompleted(str, 0);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onError(Exception exc) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "SDK Internal Error!";
        }
        this.websocketConnecting = Boolean.FALSE;
        this.speechSynthesizerCallback.onTaskFailed(str, 400);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{},reason:{}" + i + str);
        this.speechSynthesizerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
        } else if (str != null && !str.trim().isEmpty()) {
            StringBuilder sb = new StringBuilder("on message:{");
            sb.append(str);
            sb.append("}");
            SpeechSynthesizerResponse speechSynthesizerResponse = (SpeechSynthesizerResponse) JSON.parseObject(str, SpeechSynthesizerResponse.class);
            if (isComplete(speechSynthesizerResponse)) {
                this.readyLatch = null;
                this.completeLatch.countDown();
                onComplete(str);
                this.speechSynthesizer.cancel();
            } else if (isTaskFailed(speechSynthesizerResponse)) {
                onFail(speechSynthesizerResponse.getStatus(), speechSynthesizerResponse.getStatusText());
                this.readyLatch = null;
            } else if (isReady(speechSynthesizerResponse)) {
                this.speechSynthesizerCallback.onSynthesisStarted();
                this.speechSynthesizer.sendCachedTexts();
                this.readyLatch.countDown();
            } else {
                Log.e(TAG, str);
            }
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
            return;
        }
        this.readyLatch = new CountDownLatch(1);
        this.websocketConnecting = Boolean.TRUE;
    }

    public void setCompleteLatch(CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c468a66", new Object[]{this, countDownLatch});
        } else {
            this.completeLatch = countDownLatch;
        }
    }

    public boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        CountDownLatch countDownLatch = this.readyLatch;
        return countDownLatch != null && countDownLatch.getCount() <= 0;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
            return;
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        this.speechSynthesizerCallback.onBinaryReceived(bArr, 0);
    }
}
