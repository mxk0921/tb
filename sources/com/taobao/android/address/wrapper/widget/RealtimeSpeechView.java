package com.taobao.android.address.wrapper.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.f7l;
import tb.gs6;
import tb.mtv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RealtimeSpeechView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPEECH_PAGE = "PageAddressVoiceInput";
    private static final String TAG = "RealtimeSpeechView";
    private NlsSpeechClient client;
    private String finalResult;
    private boolean hasRetryAccessToken;
    private String jsParams;
    private SharedPreferences mAddressSP;
    private TUrlImageView mCloseButton;
    private Button mConfirmBtn;
    private View mConfirmLL;
    private View mImvBlurBackground;
    private boolean mIsRecordButtonReleased;
    private boolean mIsShown;
    private RelativeLayout mRealtimeSpeechLayer;
    private View mRecordBar;
    private TUrlImageView mRecordButton;
    private TextView mResultMessageHint;
    private TextView mResultMessageTitle;
    private View mRootView;
    private RealtimeSpeechVolumeView mVolumeView;
    private j realTimeSpeechListener;
    private SpeechRecognizerWithRecorder speechRecognizerWithRecorder;
    private String appKey = "";
    private String accessToken = "";
    private long accessTokenExpireTime = 0;
    private boolean mIsRecordButtonClickable = true;
    private View.OnClickListener onRecordButtonClickListener = new b();
    private int lastVolume = 0;
    private long lastVolumeTime = 0;
    private final long lastVolumeDuration = 250;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6317a;

        public a(Activity activity) {
            this.f6317a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (RealtimeSpeechView.access$1800(RealtimeSpeechView.this)) {
                RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                Toast.makeText(this.f6317a, "授权成功，请重新按住按钮说话", 0).show();
            } else {
                RealtimeSpeechView.this.showLayerWithAnimation();
                try {
                    RealtimeSpeechView.this.initSpeechSdk();
                } catch (Throwable unused) {
                    Toast.makeText(RealtimeSpeechView.this.getContext().getApplicationContext(), "语音功能初始化失败", 0).show();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RealtimeSpeechView.this.onButtonDown();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RealtimeSpeechView.this.onCancel();
            mtv.c(RealtimeSpeechView.SPEECH_PAGE, "clickCloseBtn", "", null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RealtimeSpeechView.this.onCancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RealtimeSpeechView.this.onStopButtonClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RealtimeSpeechView.access$000(RealtimeSpeechView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/wrapper/widget/RealtimeSpeechView$6");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            RealtimeSpeechView.access$100(RealtimeSpeechView.this).setVisibility(8);
            RealtimeSpeechView.access$200(RealtimeSpeechView.this).setVisibility(8);
            RealtimeSpeechView.access$300(RealtimeSpeechView.this).setVisibility(0);
            RealtimeSpeechView.access$402(RealtimeSpeechView.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements SpeechRecognizerWithRecorderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6325a;

            public a(int i) {
                this.f6325a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                int i = this.f6325a;
                if (i == 1002) {
                    RealtimeSpeechView.access$900(RealtimeSpeechView.this, 1002);
                    if (!RealtimeSpeechView.access$1200(RealtimeSpeechView.this)) {
                        RealtimeSpeechView.access$602(RealtimeSpeechView.this, "");
                        RealtimeSpeechView.access$500(RealtimeSpeechView.this).edit().remove("speech_accesstoken").apply();
                        RealtimeSpeechView.this.initSpeechSdk();
                        RealtimeSpeechView.access$1202(RealtimeSpeechView.this, true);
                        return;
                    }
                    RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                } else if (i == 40010007 || i == 41010105) {
                    RealtimeSpeechView.this.showErrorTips("未能识别，请点击麦克风重试", "");
                } else if (i >= 14000 && i <= 14002) {
                    RealtimeSpeechView.this.showErrorTips("网络连接失败", "");
                } else if (i == 14022 || i == 422) {
                    RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                } else {
                    RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6326a;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f6327a;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h$b$a$a  reason: collision with other inner class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
                public class RunnableC0330a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public RunnableC0330a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RealtimeSpeechView.access$1400(RealtimeSpeechView.this);
                        if (RealtimeSpeechView.access$1500(RealtimeSpeechView.this) != null) {
                            RealtimeSpeechView.access$1500(RealtimeSpeechView.this).onRecognizedCompleted(a.this.f6327a);
                        }
                    }
                }

                public a(String str) {
                    this.f6327a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TextUtils.isEmpty(this.f6327a)) {
                        RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                        RealtimeSpeechView.this.showErrorTips("未能识别，请点击麦克风重试", "");
                        RealtimeSpeechView.access$900(RealtimeSpeechView.this, 11);
                    } else {
                        mtv.c(RealtimeSpeechView.SPEECH_PAGE, "voice_success", "", null);
                        RealtimeSpeechView.this.hideLayerWithAnimation();
                        RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                        RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new RunnableC0330a(), 300L);
                    }
                }
            }

            public b(String str) {
                this.f6326a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!this.f6326a.equals("")) {
                    JSONObject parseObject = JSON.parseObject(this.f6326a);
                    if (parseObject.containsKey("payload")) {
                        str = parseObject.getJSONObject("payload").getString("result");
                        RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                        RealtimeSpeechView.this.showResultMessage(str, null);
                        RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new a(str), 500L);
                    }
                }
                str = null;
                RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                RealtimeSpeechView.this.showResultMessage(str, null);
                RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new a(str), 500L);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6329a;

            public c(String str) {
                this.f6329a = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.c.$ipChange
                    boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r2 == 0) goto L_0x0012
                    java.lang.String r2 = "5c510192"
                    r3 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r3[r0] = r5
                    r1.ipc$dispatch(r2, r3)
                    return
                L_0x0012:
                    java.lang.String r1 = r5.f6329a
                    java.lang.String r2 = ""
                    boolean r1 = r1.equals(r2)
                    r2 = 0
                    if (r1 != 0) goto L_0x0038
                    java.lang.String r1 = r5.f6329a
                    com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)
                    java.lang.String r3 = "payload"
                    boolean r4 = r1.containsKey(r3)
                    if (r4 == 0) goto L_0x0038
                    com.alibaba.fastjson.JSONObject r1 = r1.getJSONObject(r3)
                    java.lang.String r3 = "result"
                    java.lang.String r1 = r1.getString(r3)
                    goto L_0x0039
                L_0x0038:
                    r1 = r2
                L_0x0039:
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L_0x0058
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    android.widget.TextView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1000(r3)
                    java.lang.String r4 = "你正在说"
                    r3.setText(r4)
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    android.widget.TextView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1000(r3)
                    r3.setVisibility(r0)
                L_0x0058:
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    r0.showResultMessage(r1, r2)
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 != 0) goto L_0x0090
                    int r0 = r1.length()
                    r2 = 50
                    if (r0 < r2) goto L_0x0090
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    r0.cancelRecorder()
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1400(r0)
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$j r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1500(r0)
                    if (r0 == 0) goto L_0x0090
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$h r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                    com.taobao.android.address.wrapper.widget.RealtimeSpeechView$j r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1500(r0)
                    r0.onRecognizedCompleted(r1)
                L_0x0090:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.h.c.run():void");
            }
        }

        public h() {
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onChannelClosed(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedCompleted(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============== onRecognizedCompleted !" + str);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new b(str));
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedResultChanged(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============== onRecognizedResultChanged !" + str);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new c(str));
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35a57473", new Object[]{this});
            } else {
                Log.e(RealtimeSpeechView.TAG, "va recognize started!");
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onTaskFailed(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============ onTaskFailed: code & msg: " + i + str);
            RealtimeSpeechView.access$900(RealtimeSpeechView.this, i);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new a(i));
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
        public void onVoiceData(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
        public void onVoiceVolume(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            } else if (System.currentTimeMillis() - RealtimeSpeechView.access$1600(RealtimeSpeechView.this) > 250 || i - RealtimeSpeechView.access$1700(RealtimeSpeechView.this) > 5) {
                RealtimeSpeechView.access$1602(RealtimeSpeechView.this, System.currentTimeMillis());
                RealtimeSpeechView.access$1702(RealtimeSpeechView.this, i);
                RealtimeSpeechView.this.handleVoiceVolume(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6330a;

        public i(Activity activity) {
            this.f6330a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RealtimeSpeechView.access$900(RealtimeSpeechView.this, 403);
            RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
            Toast.makeText(this.f6330a, "没有录音权限，请先授权", 0).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface j {
        void onCancel();

        void onRecognizedCompleted(String str);
    }

    public RealtimeSpeechView(Context context, String str) {
        super(context);
        this.hasRetryAccessToken = false;
        this.jsParams = str;
        createView(context);
        this.hasRetryAccessToken = false;
        this.mAddressSP = context.getSharedPreferences("globalAddress", 0);
        initSpeechSdk();
    }

    public static /* synthetic */ void access$000(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812eafd3", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.onConfirmButtonClick();
        }
    }

    public static /* synthetic */ View access$100(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e4f52a96", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mImvBlurBackground;
    }

    public static /* synthetic */ TextView access$1000(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("832736", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mResultMessageTitle;
    }

    public static /* synthetic */ void access$1100(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255db443", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.reset();
        }
    }

    public static /* synthetic */ boolean access$1200(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16af43c8", new Object[]{realtimeSpeechView})).booleanValue();
        }
        return realtimeSpeechView.hasRetryAccessToken;
    }

    public static /* synthetic */ boolean access$1202(RealtimeSpeechView realtimeSpeechView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f815e052", new Object[]{realtimeSpeechView, new Boolean(z)})).booleanValue();
        }
        realtimeSpeechView.hasRetryAccessToken = z;
        return z;
    }

    public static /* synthetic */ TextView access$1300(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("b1853cb9", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mResultMessageHint;
    }

    public static /* synthetic */ void access$1400(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95262c6", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.release();
        }
    }

    public static /* synthetic */ j access$1500(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("ffa34b26", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.realTimeSpeechListener;
    }

    public static /* synthetic */ long access$1600(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf581bc", new Object[]{realtimeSpeechView})).longValue();
        }
        return realtimeSpeechView.lastVolumeTime;
    }

    public static /* synthetic */ long access$1602(RealtimeSpeechView realtimeSpeechView, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9726ae", new Object[]{realtimeSpeechView, new Long(j2)})).longValue();
        }
        realtimeSpeechView.lastVolumeTime = j2;
        return j2;
    }

    public static /* synthetic */ int access$1700(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd47113c", new Object[]{realtimeSpeechView})).intValue();
        }
        return realtimeSpeechView.lastVolume;
    }

    public static /* synthetic */ int access$1702(RealtimeSpeechView realtimeSpeechView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1477838b", new Object[]{realtimeSpeechView, new Integer(i2)})).intValue();
        }
        realtimeSpeechView.lastVolume = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$1800(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be98a0ce", new Object[]{realtimeSpeechView})).booleanValue();
        }
        return realtimeSpeechView.mIsRecordButtonReleased;
    }

    public static /* synthetic */ RelativeLayout access$200(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("72478925", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mRealtimeSpeechLayer;
    }

    public static /* synthetic */ View access$300(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c2034d18", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mRecordBar;
    }

    public static /* synthetic */ boolean access$402(RealtimeSpeechView realtimeSpeechView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c105789f", new Object[]{realtimeSpeechView, new Boolean(z)})).booleanValue();
        }
        realtimeSpeechView.mIsShown = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences access$500(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("521ad82c", new Object[]{realtimeSpeechView});
        }
        return realtimeSpeechView.mAddressSP;
    }

    public static /* synthetic */ String access$602(RealtimeSpeechView realtimeSpeechView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1247dddb", new Object[]{realtimeSpeechView, str});
        }
        realtimeSpeechView.accessToken = str;
        return str;
    }

    public static /* synthetic */ long access$702(RealtimeSpeechView realtimeSpeechView, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ba65e5c", new Object[]{realtimeSpeechView, new Long(j2)})).longValue();
        }
        realtimeSpeechView.accessTokenExpireTime = j2;
        return j2;
    }

    public static /* synthetic */ String access$802(RealtimeSpeechView realtimeSpeechView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6516cf99", new Object[]{realtimeSpeechView, str});
        }
        realtimeSpeechView.appKey = str;
        return str;
    }

    public static /* synthetic */ void access$900(RealtimeSpeechView realtimeSpeechView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48b2327", new Object[]{realtimeSpeechView, new Integer(i2)});
        } else {
            realtimeSpeechView.traceSpeechFail(i2);
        }
    }

    private void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.mResultMessageTitle = (TextView) findView(R.id.result_message_title);
        this.mResultMessageHint = (TextView) findView(R.id.result_message_hint);
        View findView = findView(R.id.imv_blur_background);
        this.mImvBlurBackground = findView;
        ViewProxy.setOnClickListener(findView, new c());
        this.mRealtimeSpeechLayer = (RelativeLayout) findView(R.id.ll_realtime_speech_layer);
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.v_close_button);
        this.mCloseButton = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01NmOQEc1UCnz10fJJN_!!6000000002482-2-tps-48-49.png");
        this.mCloseButton.setOnClickListener(new d());
        View findView2 = findView(R.id.record_btn);
        this.mRecordBar = findView2;
        ViewProxy.setOnClickListener(findView2, this.onRecordButtonClickListener);
        this.mRecordBar.setContentDescription("语音搜索");
        TUrlImageView tUrlImageView2 = (TUrlImageView) findView(R.id.layer_record_button);
        this.mRecordButton = tUrlImageView2;
        tUrlImageView2.setOnClickListener(this.onRecordButtonClickListener);
        this.mRecordButton.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01P78gKQ1ZHS4eJDtFO_!!6000000003169-2-tps-126-126.png");
        RealtimeSpeechVolumeView realtimeSpeechVolumeView = (RealtimeSpeechVolumeView) findView(R.id.volume_view);
        this.mVolumeView = realtimeSpeechVolumeView;
        realtimeSpeechVolumeView.setOnClickListener(new e());
        this.mConfirmLL = findView(R.id.confirm_btn_ll);
        Button button = (Button) findView(R.id.aliuser_address_btn);
        this.mConfirmBtn = button;
        button.setOnClickListener(new f());
    }

    private View findView(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i2)});
        }
        return this.mRootView.findViewById(i2);
    }

    public static /* synthetic */ Object ipc$super(RealtimeSpeechView realtimeSpeechView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/wrapper/widget/RealtimeSpeechView");
    }

    private boolean isAccessTokenValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e48f5c", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.accessToken) || TextUtils.isEmpty(this.appKey) || this.accessTokenExpireTime < System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    private void onConfirmButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1628dc", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.stop();
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.speechRecognizerWithRecorder = null;
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.mIsRecordButtonClickable = true;
        }
    }

    private void traceSpeechFail(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7350d437", new Object[]{this, new Integer(i2)});
            return;
        }
        mtv.c(SPEECH_PAGE, "voice_failure", i2 + "", null);
    }

    public void cancelRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933539df", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.cancel();
        }
    }

    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.aliuser_realtime_speech, (ViewGroup) null, false);
        this.mRootView = inflate;
        addView(inflate);
        findAllViews();
        return this.mRootView;
    }

    public void handleVoiceVolume(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3ece38", new Object[]{this, new Integer(i2)});
            return;
        }
        RealtimeSpeechVolumeView realtimeSpeechVolumeView = this.mVolumeView;
        if (realtimeSpeechVolumeView != null) {
            realtimeSpeechVolumeView.recordVolumn(i2);
        }
    }

    public void initSpeechSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6873454f", new Object[]{this});
            return;
        }
        showLayerWithAnimation();
        boolean isAccessTokenValid = isAccessTokenValid();
        if (!isAccessTokenValid) {
            String string = this.mAddressSP.getString("speech_accesstoken", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    this.accessToken = jSONObject.optJSONObject("accessToken").optString("token");
                    this.accessTokenExpireTime = jSONObject.optJSONObject("accessToken").optLong("expireTime");
                    this.appKey = jSONObject.optJSONObject("appKeys").optString("default");
                } catch (Throwable unused) {
                }
                isAccessTokenValid = isAccessTokenValid();
            }
            if (!isAccessTokenValid) {
                gs6.a(getContext(), new IRemoteBaseListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                            return;
                        }
                        RealtimeSpeechView realtimeSpeechView = RealtimeSpeechView.this;
                        realtimeSpeechView.showErrorTips("语音录制失败，请点击麦克风重试(" + i2 + f7l.BRACKET_END_STR, "");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                            try {
                                String optString = mtopResponse.getDataJsonObject().optString("returnValue");
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        RealtimeSpeechView.access$500(RealtimeSpeechView.this).edit().putString("speech_accesstoken", optString).apply();
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                                        RealtimeSpeechView.access$602(RealtimeSpeechView.this, jSONObject2.optJSONObject("accessToken").optString("token"));
                                        RealtimeSpeechView.access$702(RealtimeSpeechView.this, jSONObject2.optJSONObject("accessToken").optLong("expireTime"));
                                        RealtimeSpeechView.access$802(RealtimeSpeechView.this, jSONObject2.optJSONObject("appKeys").optString("default"));
                                        RealtimeSpeechView.this.startVaRec();
                                        return;
                                    } catch (Throwable unused2) {
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        RealtimeSpeechView realtimeSpeechView = RealtimeSpeechView.this;
                        realtimeSpeechView.showErrorTips("语音录制失败，请点击麦克风重试(" + i2 + f7l.BRACKET_END_STR, "");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        } else {
                            onError(i2, mtopResponse, obj);
                        }
                    }
                });
            }
        }
        if (isAccessTokenValid) {
            startVaRec();
        }
    }

    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.cancel();
            showResultMessage("语音搜索已取消", null);
        }
        hideLayerWithAnimation();
        if (this.realTimeSpeechListener != null) {
            release();
            this.realTimeSpeechListener.onCancel();
        }
    }

    public void onStopButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e570fa3c", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.stop();
        }
    }

    public void setRealTimeSpeechListener(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e99d05", new Object[]{this, jVar});
        } else {
            this.realTimeSpeechListener = jVar;
        }
    }

    public void showErrorTips(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9da09fe", new Object[]{this, str, str2});
            return;
        }
        this.mResultMessageHint.setTextColor(Color.parseColor("#FD6C2A"));
        this.mResultMessageHint.setText(str);
        this.mConfirmLL.setVisibility(8);
        this.mVolumeView.setVisibility(8);
        this.mRecordButton.setVisibility(0);
    }

    public void showResultMessage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a08e48", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            String charSequence = this.mResultMessageHint.getText().toString();
            if (charSequence.length() > str.length()) {
                this.mResultMessageHint.setTextColor(Color.parseColor("#333333"));
                this.mResultMessageHint.setText(str);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#333333"));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Color.parseColor("#4d333333"));
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, charSequence.length(), 17);
            spannableStringBuilder.setSpan(foregroundColorSpan2, charSequence.length(), str.length(), 17);
            this.mResultMessageHint.setText(spannableStringBuilder);
        }
    }

    public void onRecordStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5327b22", new Object[]{this, str});
            return;
        }
        mtv.c(SPEECH_PAGE, "voice_commit", "", null);
        this.mRecordButton.setVisibility(8);
        this.mVolumeView.setVisibility(0);
        this.mConfirmLL.setVisibility(0);
        resetLayer();
    }

    public void resetLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6eed4c9", new Object[]{this});
            return;
        }
        this.mResultMessageHint.setTextColor(Color.parseColor("#333333"));
        this.mResultMessageHint.setText("请对我说出你的地址···");
        this.mRealtimeSpeechLayer.setVisibility(0);
        this.mImvBlurBackground.setVisibility(0);
        this.mRecordBar.setVisibility(8);
    }

    public void hideLayerWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4f9176", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.mRealtimeSpeechLayer;
        if (relativeLayout != null && this.mImvBlurBackground != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mRealtimeSpeechLayer, "translationY", 0.0f, relativeLayout.getLayoutParams().height);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new g());
            ofFloat.start();
        }
    }

    public boolean onButtonDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95ce693e", new Object[]{this})).booleanValue();
        }
        if (!this.mIsRecordButtonClickable) {
            AdapterForTLog.logd(TAG, "语音识别进行中，禁用点击");
            return true;
        }
        mtv.c(SPEECH_PAGE, "clickRecordBtn", "", null);
        Activity activity = (Activity) getContext();
        this.mIsRecordButtonClickable = false;
        this.mIsRecordButtonReleased = false;
        com.taobao.runtimepermission.a.c(activity, new String[]{"android.permission.RECORD_AUDIO"}).w("当您使用语音输入时需要系统授权录音权限").A(new a(activity)).z(new i(activity)).m();
        return false;
    }

    public void showLayerWithAnimation() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3903c0f1", new Object[]{this});
        } else if (this.mRealtimeSpeechLayer != null && (view = this.mImvBlurBackground) != null && !this.mIsShown) {
            view.setVisibility(0);
            this.mIsShown = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mRealtimeSpeechLayer, "translationY", this.mRealtimeSpeechLayer.getLayoutParams().height, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    public void startVaRec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425f61aa", new Object[]{this});
            return;
        }
        NlsSpeechClient instance = NlsSpeechClient.getInstance("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1", this.accessToken);
        this.client = instance;
        SpeechRecognizerWithRecorder createRecognizerWithRecorder = instance.createRecognizerWithRecorder(new h());
        this.speechRecognizerWithRecorder = createRecognizerWithRecorder;
        createRecognizerWithRecorder.setAppKey(this.appKey);
        this.speechRecognizerWithRecorder.setSampleRate(16000);
        this.speechRecognizerWithRecorder.enableIntermediateResult(true);
        this.speechRecognizerWithRecorder.setFormat("opu");
        this.speechRecognizerWithRecorder.enableVoiceDetection(true);
        if (TextUtils.isEmpty(this.jsParams)) {
            this.speechRecognizerWithRecorder.setMaxEndSilence(0);
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.jsParams);
                this.speechRecognizerWithRecorder.setMaxStartSilence(jSONObject.optInt("voiceMaxStartSilence", 0));
                this.speechRecognizerWithRecorder.setMaxEndSilence(jSONObject.optInt("voiceMaxEndSilence", 0));
            } catch (Throwable unused) {
                this.speechRecognizerWithRecorder.setMaxEndSilence(0);
            }
        }
        this.speechRecognizerWithRecorder.setInverseTextNormalization(true);
        this.speechRecognizerWithRecorder.start();
        onRecordStarted("");
    }
}
