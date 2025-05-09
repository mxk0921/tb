package com.alibaba.idst.nls.nlsclientsdk.requests;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.VoiceCodecs;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.FlowingSpeechSynthesizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizerCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequestWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogWithRecorderCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NlsSpeechClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SERVER_ADDR = "wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1";
    public static final int SAMPLE_RATE_16K = 16000;
    private static final String TAG = "NlsSpeechClient";
    private static NlsSpeechClient thisClient = null;
    public JWebSocketClient client;
    private Map<String, String> httpHeaderMap;
    public String token;
    private URI uri;
    public VoiceCodecs voiceCodecs;

    static {
        t2o.a(199229445);
    }

    public NlsSpeechClient(String str) {
        try {
            this.token = str;
            HashMap hashMap = new HashMap();
            this.httpHeaderMap = hashMap;
            if (str != null) {
                hashMap.put("X-NLS-Token", str);
            }
            this.uri = URI.create("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1");
            VoiceCodecs instance = VoiceCodecs.getInstance();
            this.voiceCodecs = instance;
            instance.open(true);
        } catch (Exception e) {
            Log.e(TAG, "fail to create NlsClient" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static NlsSpeechClient getInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsSpeechClient) ipChange.ipc$dispatch("8fd3f73f", new Object[]{str, str2});
        }
        if (thisClient == null) {
            thisClient = new NlsSpeechClient(str, str2);
        }
        return thisClient;
    }

    public DialogRequest createDialogRequest(DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogRequest) ipChange.ipc$dispatch("601a5e9e", new Object[]{this, dialogCallback});
        }
        return new DialogRequest(this.uri, this.httpHeaderMap, dialogCallback);
    }

    public DialogRequestWithRecorder createDialogRequestWithRecorder(DialogWithRecorderCallback dialogWithRecorderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogRequestWithRecorder) ipChange.ipc$dispatch("3f645b5a", new Object[]{this, dialogWithRecorderCallback});
        }
        return new DialogRequestWithRecorder(this.uri, this.token, dialogWithRecorderCallback);
    }

    public FlowingSpeechSynthesizer createFlowingSpeechSynthesizer(SpeechSynthesizerCallback speechSynthesizerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowingSpeechSynthesizer) ipChange.ipc$dispatch("ddc963d8", new Object[]{this, speechSynthesizerCallback});
        }
        return new FlowingSpeechSynthesizer(this.uri, this.httpHeaderMap, speechSynthesizerCallback);
    }

    public SpeechRecognizer createRecognizerRequest(SpeechRecognizerCallback speechRecognizerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeechRecognizer) ipChange.ipc$dispatch("35f995c5", new Object[]{this, speechRecognizerCallback});
        }
        return new SpeechRecognizer(this.uri, this.httpHeaderMap, speechRecognizerCallback);
    }

    public SpeechRecognizerWithRecorder createRecognizerWithRecorder(SpeechRecognizerWithRecorderCallback speechRecognizerWithRecorderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeechRecognizerWithRecorder) ipChange.ipc$dispatch("c011b650", new Object[]{this, speechRecognizerWithRecorderCallback});
        }
        return new SpeechRecognizerWithRecorder(this.uri, this.token, speechRecognizerWithRecorderCallback);
    }

    public SpeechSynthesizer createSpeechSynthesizer(SpeechSynthesizerCallback speechSynthesizerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeechSynthesizer) ipChange.ipc$dispatch("fc58972a", new Object[]{this, speechSynthesizerCallback});
        }
        return new SpeechSynthesizer(this.uri, this.httpHeaderMap, speechSynthesizerCallback);
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
            return;
        }
        this.token = str;
        Map<String, String> map = this.httpHeaderMap;
        if (map != null && str != null) {
            map.put("X-NLS-Token", str);
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.httpHeaderMap = null;
        this.voiceCodecs.close();
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient != null) {
            jWebSocketClient.shutdown();
        }
    }

    public NlsSpeechClient(String str, String str2) {
        try {
            this.token = str2;
            HashMap hashMap = new HashMap();
            this.httpHeaderMap = hashMap;
            if (str2 != null) {
                hashMap.put("X-NLS-Token", str2);
            }
            if (str == null || str.equals("")) {
                this.uri = URI.create("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1");
            } else {
                this.uri = URI.create(str);
            }
            new StringBuilder("Connect to host:").append(str);
            VoiceCodecs instance = VoiceCodecs.getInstance();
            this.voiceCodecs = instance;
            instance.open(true);
        } catch (Exception e) {
            Log.e(TAG, "fail to create NlsClient" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public NlsSpeechClient(String str, String str2, boolean z) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    str = str + "?token=" + str2;
                    this.uri = URI.create(str);
                    new StringBuilder("Connect to host:").append(str);
                }
            } catch (Exception e) {
                Log.e(TAG, "fail to create NlsClient" + e.getMessage());
                throw new RuntimeException(e);
            }
        }
        this.uri = URI.create("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1");
        new StringBuilder("Connect to host:").append(str);
    }
}
