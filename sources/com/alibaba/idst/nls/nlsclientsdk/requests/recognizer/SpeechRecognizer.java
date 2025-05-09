package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

import android.accounts.NetworkErrorException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.VoiceCodecs;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechReqProtocol;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.alibaba.idst.nls.nlsclientsdk.util.BytesTransUtil;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SpeechRecognizer extends SpeechReqProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_FORMAT = "pcm";
    private static final Integer DEFAULT_SAMPLE_RATE = 16000;
    private static final String TAG = "AliSpeechSDK.Recognizer";
    private static CountDownLatch completeLatch;
    private static boolean isHandshaking;
    private static CountDownLatch readyLatch;
    private BytesTransUtil bytesTransUtil;
    public JWebSocketClient client;
    private Connection conn;
    private String currentTaskId;
    private Map<String, String> httpHeaderMap;
    private SpeechRecognizerListener innerLister;
    private VoiceCodecs mVoiceCodecs;
    private byte[] sendBuffer;
    private int sendBufferCount;
    private URI serverUri;
    private Handler speechRecognizerHandler;
    private JWebSocketClient.WebsocketStatus state;
    private byte[] opu = new byte[640];
    private Lock lock = new ReentrantLock();
    private LinkedBlockingQueue<byte[]> queue = new LinkedBlockingQueue<>();
    private short[] transData = new short[320];
    private boolean onRequesting = false;
    private byte[] audioInput = new byte[0];

    static {
        t2o.a(199229467);
    }

    public SpeechRecognizer(URI uri, Map<String, String> map, SpeechRecognizerCallback speechRecognizerCallback) {
        this.mVoiceCodecs = null;
        this.bytesTransUtil = null;
        this.serverUri = uri;
        this.httpHeaderMap = map;
        initSpeechRecognizerHandler();
        this.innerLister = new SpeechRecognizerListener(this, speechRecognizerCallback);
        this.header.put("namespace", Constant.VALUE_NAMESPACE_ASR);
        this.header.put("name", "StartRecognition");
        this.payload.put("format", DEFAULT_FORMAT);
        this.payload.put("sample_rate", DEFAULT_SAMPLE_RATE);
        this.mVoiceCodecs = VoiceCodecs.getInstance();
        this.bytesTransUtil = BytesTransUtil.getInstance();
    }

    public static /* synthetic */ Handler access$002(SpeechRecognizer speechRecognizer, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("996ff51d", new Object[]{speechRecognizer, handler});
        }
        speechRecognizer.speechRecognizerHandler = handler;
        return handler;
    }

    public static /* synthetic */ void access$100(SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0087f98", new Object[]{speechRecognizer});
        } else {
            speechRecognizer.doStart();
        }
    }

    public static /* synthetic */ void access$200(SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73161d9", new Object[]{speechRecognizer});
        } else {
            speechRecognizer.doStop();
        }
    }

    public static /* synthetic */ void access$300(SpeechRecognizer speechRecognizer, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb12fab9", new Object[]{speechRecognizer, inputStream});
        } else {
            speechRecognizer.doSend(inputStream);
        }
    }

    private static byte[] appendBytes(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9fd8c57", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private void doSend(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b57d19", new Object[]{this, inputStream});
            return;
        }
        try {
            if (getFormat().equals(DEFAULT_FORMAT)) {
                byte[] bArr = new byte[JosStatusCodes.RTN_CODE_COMMON_ERROR];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        this.conn.sendBinary(Arrays.copyOfRange(bArr, 0, read));
                    } else {
                        return;
                    }
                }
            } else if (getFormat().equals("opu")) {
                byte[] bArr2 = new byte[640];
                while (inputStream.read(bArr2) > 0) {
                    short[] Bytes2Shorts = this.bytesTransUtil.Bytes2Shorts(bArr2);
                    this.transData = Bytes2Shorts;
                    int bufferFrame = this.mVoiceCodecs.bufferFrame(Bytes2Shorts, this.opu);
                    byte[] bArr3 = new byte[bufferFrame];
                    System.arraycopy(this.opu, 0, bArr3, 0, bufferFrame);
                    if (bufferFrame != 0) {
                        this.conn.sendBinary(bArr3);
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "fail to send binary,current_task_id:{},state:{}" + this.currentTaskId + this.state + e.getMessage());
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognizer speechRecognizer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/requests/recognizer/SpeechRecognizer");
    }

    public static void markComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f00ad", new Object[0]);
            return;
        }
        CountDownLatch countDownLatch = completeLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void markReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1705445d", new Object[0]);
            return;
        }
        CountDownLatch countDownLatch = readyLatch;
        if (countDownLatch != null) {
            isHandshaking = true;
            countDownLatch.countDown();
        }
    }

    private static byte[] subBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cae38884", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            if (this.lock.tryLock(100L, TimeUnit.MILLISECONDS)) {
                this.onRequesting = false;
                this.lock.unlock();
            }
            if (this.conn != null) {
                this.client.shutdown();
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Recognizer close warning!");
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.speechRecognizerHandler.removeCallbacksAndMessages(null);
        this.speechRecognizerHandler.getLooper().quitSafely();
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient != null) {
            jWebSocketClient.shutdown();
        }
    }

    public void enableIntermediateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b7174", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put("enable_intermediate_result", Boolean.valueOf(z));
        }
    }

    public void enablePunctuation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c781b6", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put("enable_punctuation_prediction", Boolean.valueOf(z));
        }
    }

    public void enableVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a78a317", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put(Constant.PROP_ASR_ENABLE_VAD, Boolean.valueOf(z));
        }
    }

    public boolean getEnableVoiceDetection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4840cd7", new Object[]{this})).booleanValue();
        }
        if (this.payload.containsKey(Constant.PROP_ASR_ENABLE_VAD)) {
            return ((Boolean) this.payload.get(Constant.PROP_ASR_ENABLE_VAD)).booleanValue();
        }
        return false;
    }

    public String getFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cf61a2c", new Object[]{this});
        }
        return (String) this.payload.get("format");
    }

    public Integer getSampleRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3742c18e", new Object[]{this});
        }
        return (Integer) this.payload.get("sample_rate");
    }

    public void initSpeechRecognizerHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918cf79b", new Object[]{this});
        } else if (this.speechRecognizerHandler == null) {
            new Thread(new Runnable() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Looper.prepare();
                    SpeechRecognizer.access$002(SpeechRecognizer.this, new Handler() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizer.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(HandlerC00861 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/requests/recognizer/SpeechRecognizer$1$1");
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("282a8c19", new Object[]{this, message});
                                return;
                            }
                            int i = message.what;
                            if (i == 1) {
                                SpeechRecognizer.access$100(SpeechRecognizer.this);
                            } else if (i == 2) {
                                SpeechRecognizer.access$200(SpeechRecognizer.this);
                            } else if (i == 3) {
                                SpeechRecognizer.access$300(SpeechRecognizer.this, (InputStream) message.obj);
                            }
                        }
                    });
                    Looper.loop();
                }
            }, "SpeechRecognizerThread").start();
        }
    }

    public void send(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce569e4", new Object[]{this, inputStream});
            return;
        }
        Message message = new Message();
        message.what = 3;
        message.obj = inputStream;
        Handler handler = this.speechRecognizerHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    public void setClassVocabulary(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cd9ae2", new Object[]{this, map});
        } else {
            this.payload.put(Constant.PROP_ASR_CLASS_VOCABULARY, map);
        }
    }

    public void setCustomizationId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8973d1d", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_CUSTOMIZATION_ID, str);
        }
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else {
            this.payload.put("format", str);
        }
    }

    public void setInverseTextNormalization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49838dcb", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put(Constant.PROP_ASR_ENABLE_ITN, Boolean.valueOf(z));
        }
    }

    public void setKeywordListId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ed16f1", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_KEYWORD_LIST_ID, str);
        }
    }

    public void setMaxEndSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff21b5d4", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_ASR_MAX_END_SILENCE, Integer.valueOf(i));
        }
    }

    public void setMaxStartSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a575b", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_ASR_MAX_START_SILENCE, Integer.valueOf(i));
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put("sample_rate", Integer.valueOf(i));
        }
    }

    public void setStopTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7418afd", new Object[]{this});
        } else {
            this.onRequesting = false;
        }
    }

    public void setVocabulary(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f440836", new Object[]{this, map});
        } else {
            this.payload.put("vocabulary", map);
        }
    }

    public void setVocabularyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6af474", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_VOCABULARY_ID, str);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.onRequesting) {
            Log.e(TAG, "Still on speech recognizing, please waiting for right request over !");
        } else {
            isHandshaking = false;
            this.audioInput = new byte[0];
            Handler handler = this.speechRecognizerHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Message message = new Message();
            message.what = 1;
            Handler handler2 = this.speechRecognizerHandler;
            if (handler2 != null) {
                handler2.sendMessage(message);
            } else {
                Log.e(TAG, "");
            }
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Message message = new Message();
        message.what = 2;
        Handler handler = this.speechRecognizerHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    private void doStop() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
            return;
        }
        try {
            if (!(this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_FAILED || this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_CLOSED)) {
                if (readyLatch.getCount() > 0) {
                    this.onRequesting = false;
                    this.client.shutdown();
                }
                this.audioInput = new byte[0];
                SpeechReqProtocol speechReqProtocol = new SpeechReqProtocol();
                speechReqProtocol.setAppKey(getAppKey());
                speechReqProtocol.header.put("namespace", Constant.VALUE_NAMESPACE_ASR);
                speechReqProtocol.header.put("name", "StopRecognition");
                speechReqProtocol.header.put("task_id", this.currentTaskId);
                try {
                    if (this.lock.tryLock(100L, TimeUnit.MILLISECONDS)) {
                        this.lock.unlock();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Connection connection = this.conn;
                if (connection != null) {
                    connection.sendText(speechReqProtocol.serialize());
                    this.client.setStatus(JWebSocketClient.WebsocketStatus.STATUS_STOP);
                    CountDownLatch countDownLatch = completeLatch;
                    if (!(countDownLatch == null || this.conn == null || countDownLatch.getCount() <= 0)) {
                        try {
                            z = completeLatch.await(10L, TimeUnit.SECONDS);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                            z = false;
                        }
                        if (!z) {
                            String str = this.currentTaskId;
                            JWebSocketClient.WebsocketStatus websocketStatus = this.state;
                            Log.e(TAG, "timeout after 10 seconds waiting for complete confirmation.task_id:" + str + ",state:" + websocketStatus);
                        }
                    }
                    this.onRequesting = false;
                    close();
                    return;
                }
                return;
            }
            this.onRequesting = false;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void doStart() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        try {
            if (this.onRequesting) {
                Log.e(TAG, "Still on speech recognizing, please waiting for right request over !");
                return;
            }
            JWebSocketClient instance = JWebSocketClient.getInstance(this.serverUri, this.httpHeaderMap);
            this.client = instance;
            Connection connect = instance.connect(this.innerLister);
            this.conn = connect;
            if (connect != null) {
                this.sendBufferCount = 0;
                this.sendBuffer = new byte[0];
                this.onRequesting = true;
                completeLatch = new CountDownLatch(1);
                readyLatch = new CountDownLatch(1);
                String genId = IdGen.genId();
                this.currentTaskId = genId;
                setTaskId(genId);
                this.conn.sendText(serialize());
                if (readyLatch.getCount() > 0) {
                    try {
                        z = readyLatch.await(10L, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (!(z || this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_CLOSED || this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_FAILED)) {
                        String str = "timeout after 10 seconds waiting for start confirmation.task_id:" + this.currentTaskId + ",state:" + this.state;
                        Log.e(TAG, str);
                        this.innerLister.onError(new NetworkErrorException(str));
                        return;
                    }
                    return;
                }
                Log.e(TAG, "readyLatch count 0 ,just skip it!");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            doSend(bArr);
        }
    }

    private void doSend(byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0eaf401", new Object[]{this, bArr});
            return;
        }
        byte[] appendBytes = appendBytes(this.audioInput, bArr);
        this.audioInput = appendBytes;
        int length = appendBytes.length;
        try {
            JWebSocketClient jWebSocketClient = this.client;
            if (jWebSocketClient != null && jWebSocketClient.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_CONNECTED && isHandshaking) {
                int i = length;
                while (i >= 640) {
                    byte[] subBytes = subBytes(this.audioInput, length - i, 640);
                    if (getFormat().equals("opu")) {
                        short[] Bytes2Shorts = this.bytesTransUtil.Bytes2Shorts(subBytes);
                        this.transData = Bytes2Shorts;
                        int bufferFrame = this.mVoiceCodecs.bufferFrame(Bytes2Shorts, this.opu);
                        bArr2 = new byte[bufferFrame];
                        System.arraycopy(this.opu, 0, bArr2, 0, bufferFrame);
                        if (bufferFrame == 0) {
                            return;
                        }
                    } else {
                        bArr2 = bArr;
                    }
                    byte[] appendBytes2 = appendBytes(this.sendBuffer, bArr2);
                    this.sendBuffer = appendBytes2;
                    int i2 = this.sendBufferCount + 1;
                    this.sendBufferCount = i2;
                    if (i2 > 5) {
                        this.conn.sendBinary(appendBytes2);
                        this.sendBuffer = new byte[0];
                        this.sendBufferCount = 0;
                    }
                    i -= 640;
                }
                this.audioInput = subBytes(this.audioInput, length - i, i);
            }
        } catch (Exception e) {
            Log.e(TAG, "dosend voice failed! call self stop");
            e.printStackTrace();
            stop();
        }
    }
}
