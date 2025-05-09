package com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechReqProtocol;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SpeechSynthesizer extends SpeechReqProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_FORMAT = "";
    private static final Integer DEFAULT_SAMPLE_RATE = 16000;
    private static final Integer DEFAULT_VOICE_VOLUME = 50;
    private static final String TAG = "SpeechSynthesizer";
    private JWebSocketClient client;
    private CountDownLatch completeLatch;
    private Connection conn;
    private Map<String, String> httpHeaderMap;
    private SpeechSynthesizerListener innerListener;
    private URI serverUri;
    private Handler speechSynthesizerHandler;
    private LinkedList ttsTextList = new LinkedList();

    static {
        t2o.a(199229452);
    }

    public SpeechSynthesizer(URI uri, Map<String, String> map, SpeechSynthesizerCallback speechSynthesizerCallback) {
        this.serverUri = uri;
        this.httpHeaderMap = map;
        initSynthesizerHandler();
        this.innerListener = new SpeechSynthesizerListener(this, speechSynthesizerCallback);
        this.header.put("namespace", "SpeechSynthesizer");
        this.header.put("name", Constant.VALUE_NAME_TTS_START);
        this.payload.put("format", "");
        this.payload.put("sample_rate", DEFAULT_SAMPLE_RATE);
        this.payload.put(Constant.PROP_TTS_VOLUME, DEFAULT_VOICE_VOLUME);
    }

    public static /* synthetic */ Handler access$002(SpeechSynthesizer speechSynthesizer, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7611c90b", new Object[]{speechSynthesizer, handler});
        }
        speechSynthesizer.speechSynthesizerHandler = handler;
        return handler;
    }

    public static /* synthetic */ void access$100(SpeechSynthesizer speechSynthesizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c388faa", new Object[]{speechSynthesizer});
        } else {
            speechSynthesizer.doStart();
        }
    }

    public static /* synthetic */ LinkedList access$200(SpeechSynthesizer speechSynthesizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("78f7af63", new Object[]{speechSynthesizer});
        }
        return speechSynthesizer.ttsTextList;
    }

    private void doStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        LinkedList linkedList = this.ttsTextList;
        if (linkedList != null && !linkedList.isEmpty()) {
            this.ttsTextList.removeFirst();
        }
        setTaskId(IdGen.genId());
        JWebSocketClient instance = JWebSocketClient.getInstance(this.serverUri, this.httpHeaderMap);
        this.client = instance;
        Connection connect = instance.connect(this.innerListener);
        this.conn = connect;
        if (connect != null) {
            try {
                connect.sendText(serialize());
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.completeLatch = countDownLatch;
                this.innerListener.setCompleteLatch(countDownLatch);
            } catch (Exception e) {
                Log.e("SpeechSynthesizer", "SpeechSynthesizer :" + e.getMessage());
            }
        }
    }

    private void initSynthesizerHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0df959", new Object[]{this});
        } else if (this.speechSynthesizerHandler == null) {
            new Thread(new Runnable() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Looper.prepare();
                    SpeechSynthesizer.access$002(SpeechSynthesizer.this, new Handler() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizer.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(HandlerC00841 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/requests/Synthesizer/SpeechSynthesizer$1$1");
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("282a8c19", new Object[]{this, message});
                            } else if (message.what == 1) {
                                SpeechSynthesizer.access$100(SpeechSynthesizer.this);
                            }
                        }
                    });
                    if (SpeechSynthesizer.access$200(SpeechSynthesizer.this) != null && !SpeechSynthesizer.access$200(SpeechSynthesizer.this).isEmpty()) {
                        SpeechSynthesizer.access$100(SpeechSynthesizer.this);
                    }
                    Looper.loop();
                }
            }, "SpeechSynthesizerThread").start();
        }
    }

    public static /* synthetic */ Object ipc$super(SpeechSynthesizer speechSynthesizer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/requests/Synthesizer/SpeechSynthesizer");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.conn != null) {
            this.client.shutdown();
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.speechSynthesizerHandler.removeCallbacksAndMessages(null);
        this.speechSynthesizerHandler.getLooper().quitSafely();
        this.speechSynthesizerHandler = null;
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient != null) {
            jWebSocketClient.shutdown();
        }
    }

    public void enbableLongSynthesizer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78f7794", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.header.put("namespace", Constant.VALUE_NAMESPACE_LONG_TTS);
        }
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else if (str != null && !str.equals("")) {
            this.payload.put("format", str);
        }
    }

    public void setPitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9f781e", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_TTS_PITCH_RATE, Integer.valueOf(i));
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            this.payload.put("sample_rate", Integer.valueOf(i));
        }
    }

    public void setSpeechRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0659ef8", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_TTS_SPEECH_RATE, Integer.valueOf(i));
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        LinkedList linkedList = this.ttsTextList;
        if (linkedList != null) {
            linkedList.add(str);
        }
        this.payload.put("text", str);
    }

    public void setVoice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901ac881", new Object[]{this, str});
        } else {
            this.payload.put("voice", str);
        }
    }

    public void setVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515e6872", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.payload.put(Constant.PROP_TTS_VOLUME, Integer.valueOf(i));
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Message message = new Message();
        message.what = 1;
        Handler handler = this.speechSynthesizerHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    public void waitForComplete(int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3731e70f", new Object[]{this, new Integer(i)});
        } else {
            this.completeLatch.await(i, TimeUnit.SECONDS);
        }
    }

    public void waitForComplete() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09da74", new Object[]{this});
        } else {
            this.completeLatch.await();
        }
    }
}
