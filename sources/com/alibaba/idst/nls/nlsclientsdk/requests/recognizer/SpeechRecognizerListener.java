package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

import android.accounts.NetworkErrorException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.t2o;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SpeechRecognizerListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecognizerListener";
    private SpeechRecognizerCallback innerCallback;
    private SpeechRecognizer recognizer;

    static {
        t2o.a(199229471);
        t2o.a(199229476);
    }

    public SpeechRecognizerListener(SpeechRecognizer speechRecognizer, SpeechRecognizerCallback speechRecognizerCallback) {
        this.recognizer = speechRecognizer;
        this.innerCallback = speechRecognizerCallback;
    }

    private boolean isRecComplete(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b21849", new Object[]{this, speechRecognizerResponse})).booleanValue();
        }
        return speechRecognizerResponse.getName().equals("RecognitionCompleted");
    }

    private boolean isRecReady(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d88e527", new Object[]{this, speechRecognizerResponse})).booleanValue();
        }
        return speechRecognizerResponse.getName().equals("RecognitionStarted");
    }

    private boolean isRecResult(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5d586ad", new Object[]{this, speechRecognizerResponse})).booleanValue();
        }
        return speechRecognizerResponse.getName().equals("RecognitionResultChanged");
    }

    private boolean isTaskFailed(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1bc856", new Object[]{this, speechRecognizerResponse})).booleanValue();
        }
        return speechRecognizerResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder sb = new StringBuilder("connection is closed due to reason:");
        sb.append(str);
        sb.append(",code:");
        sb.append(i);
        this.recognizer.setStopTag();
        this.innerCallback.onChannelClosed(str, i);
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
            str = "";
        }
        if (exc instanceof InterruptedException) {
            SpeechRecognizerCallback speechRecognizerCallback = this.innerCallback;
            speechRecognizerCallback.onTaskFailed("Connect Timeout : " + str, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_FOV);
        } else if (exc instanceof NetworkErrorException) {
            SpeechRecognizerCallback speechRecognizerCallback2 = this.innerCallback;
            speechRecognizerCallback2.onTaskFailed("Connect Failed : " + str, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_LATITUDE);
        } else {
            SpeechRecognizerCallback speechRecognizerCallback3 = this.innerCallback;
            speechRecognizerCallback3.onTaskFailed("Default Websocket Error : " + str, TaobaoMediaPlayer.FFP_PROP_INT64_PANO_TYPE);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{" + i + "},reasone:{" + str + "}");
        this.innerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
        } else {
            Log.e(TAG, "connection is ok");
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
        } else if (str != null && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder("on message:{");
            sb.append(str);
            sb.append("}");
            SpeechRecognizerResponse speechRecognizerResponse = (SpeechRecognizerResponse) JSON.parseObject(str, SpeechRecognizerResponse.class);
            if (isRecReady(speechRecognizerResponse)) {
                SpeechRecognizer.markReady();
                this.innerCallback.onRecognizedStarted();
            } else if (isRecResult(speechRecognizerResponse)) {
                this.innerCallback.onRecognizedResultChanged(str, 0);
            } else if (isRecComplete(speechRecognizerResponse)) {
                SpeechRecognizer.markComplete();
                this.recognizer.client.setStatus(JWebSocketClient.WebsocketStatus.STATUS_STOP);
                this.innerCallback.onRecognizedCompleted(str, 0);
                if (this.recognizer.getEnableVoiceDetection()) {
                    this.recognizer.close();
                }
            } else if (isTaskFailed(speechRecognizerResponse)) {
                SpeechRecognizer.markComplete();
                onFail(speechRecognizerResponse.getStatus(), speechRecognizerResponse.getStatusText());
            } else {
                Log.e(TAG, str);
            }
        }
    }
}
