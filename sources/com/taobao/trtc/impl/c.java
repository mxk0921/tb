package com.taobao.trtc.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.a;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.impl.TrtcStreamProcessorImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import tb.aju;
import tb.nlu;
import tb.pg1;
import tb.pod;
import tb.rlu;
import tb.slu;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TrtcEngineImpl f13938a;
    public final nlu b;
    public ITrtcObserver.d c;
    public final long e;
    public long d = 0;
    public boolean f = false;
    public TrtcDefines.TrtcMediaConnectionState g = TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_NOT_USE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<ArrayList<Map<String, String>>> {
        public a(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<ArrayList<String>> {
        public b(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.impl.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0785c extends TypeReference<ArrayList<String>> {
        public C0785c(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends TypeReference<Map<String, String>> {
        public d(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType;

        static {
            int[] iArr = new int[TrtcInnerDefines.EventType.values().length];
            $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType = iArr;
            try {
                iArr[TrtcInnerDefines.EventType.ON_TRTC_LIVE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_MEDIA_CONNECTION_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CALL_NOTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CALL_RSP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_ANSWER_NOTIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_ANSWER_RSP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CANCEL_CALL_NOTIFY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_HANGUP_NOTIFY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_JOIN_CHANNEL_RSP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_PEER_JOINED_CHANNEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_PEER_LEFT_CHANNEL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_NOTIFY_CHANNEL_RSP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CHANNEL_MSG_BROADCAST_RSP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CHANNEL_MSG_BROADCAST_NOTIFY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_NOTIFY_CHANNEL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CALL_TIMEOUT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_LINK_CONFIG_UPDATE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_FIRST_MEDIA_FRAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_STATISTICS_UT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_STATS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_ERROR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_STREAM_PROCESS_RESULT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CUSTOM_MESSAGE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_STREAM_UPDATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_UPDATE_HTTPDNS_AMDC.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_CANCEL_GET_HTTPDNS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_MUTE_REMOTE_AUDIO_STREAMS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_LOCAL_STREAM_STATUS_UPDATE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_DEGRADE_TO_TCP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_LIVE_CHANNEL_ID_SUCCESS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[TrtcInnerDefines.EventType.ON_TRTC_SPEECH_DETECT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f extends TypeReference<Map<String, String>> {
        public f(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g extends TypeReference<Map<String, String>> {
        public g(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h extends TypeReference<Map<String, String>> {
        public h(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i extends TypeReference<Map<String, String>> {
        public i(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j extends TypeReference<Map<String, String>> {
        public j(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k extends TypeReference<ArrayList<Map<String, String>>> {
        public k(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l extends TypeReference<Map<String, String>> {
        public l(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m extends TypeReference<ArrayList<Map<String, String>>> {
        public m(c cVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n extends TypeReference<ArrayList<Map<String, String>>> {
        public n(c cVar) {
        }
    }

    static {
        t2o.a(395313518);
    }

    public c(TrtcEngineImpl trtcEngineImpl, nlu nluVar) {
        this.e = 0L;
        this.f13938a = trtcEngineImpl;
        this.e = System.currentTimeMillis();
        this.b = nluVar;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffa0e65", new Object[]{this});
            return;
        }
        nlu nluVar = this.b;
        if (nluVar != null) {
            nluVar.x1();
        }
    }

    public final void B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac1a63d", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("userId");
            String str2 = map.get("type");
            boolean parseBoolean = Boolean.parseBoolean(map.get("timeout"));
            String str3 = map.get("costTime");
            Objects.requireNonNull(str3);
            int parseInt = Integer.parseInt(str3);
            if ("video".equals(str2)) {
                if (parseBoolean) {
                    tmu.g("TrtcEvent", "UserId: " + str + " " + str2 + " first frame timeout");
                    this.b.z1(str);
                    return;
                }
                String str4 = map.get("width");
                Objects.requireNonNull(str4);
                int parseInt2 = Integer.parseInt(str4);
                String str5 = map.get("height");
                Objects.requireNonNull(str5);
                int parseInt3 = Integer.parseInt(str5);
                tmu.f("TrtcEvent", "first remote video frame, user id: " + str + ", " + parseInt2 + "x" + parseInt3 + ", elapsed: " + parseInt + "ms");
                this.b.j(str, parseInt2, parseInt3, parseInt);
            } else if (parseBoolean) {
                tmu.g("TrtcEvent", "UserId: " + str + " " + str2 + " first frame timeout");
                this.b.y1(str);
            } else {
                tmu.f("TrtcEvent", "first remote audio frame, user id: " + str + ", elapsed: " + parseInt + "ms");
                this.b.i(str, parseInt);
            }
        }
    }

    public final void C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c1fe6", new Object[]{this, map});
        } else if (map != null) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("isAdd"));
            String str = map.get("width");
            Objects.requireNonNull(str);
            int parseInt = Integer.parseInt(str);
            String str2 = map.get("height");
            Objects.requireNonNull(str2);
            int parseInt2 = Integer.parseInt(str2);
            String str3 = map.get("fps");
            Objects.requireNonNull(str3);
            this.b.C1(parseBoolean, parseInt, parseInt2, Integer.parseInt(str3));
        }
    }

    public final void F(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5778e9", new Object[]{this, map});
        } else if (map != null) {
            slu.d(map.get("host"), map.get(pod.IP), Boolean.parseBoolean(map.get("status")));
        }
    }

    public final void I(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd51ec", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get(tmu.MTP);
            if (str.equals(tmu.MTP_PERF) && this.f13938a.j1() != null) {
                this.f13938a.j1().a(rlu.f27461a, map);
            }
            tmu.c(str, map);
        }
    }

    public final void J(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e1f821", new Object[]{this, map});
        } else if (map != null) {
            TrtcStreamProcessorImpl.a aVar = new TrtcStreamProcessorImpl.a();
            String str = map.get("code");
            Objects.requireNonNull(str);
            aVar.d = Integer.parseInt(str);
            aVar.e = map.get("msg");
            aVar.f13931a = map.get("inputId");
            aVar.b = map.get("remoteId");
            aVar.c = TrtcStreamProcessorImpl.ProcessType.E_NONE;
            String str2 = map.get("ctrlType");
            Objects.requireNonNull(str2);
            int parseInt = Integer.parseInt(str2);
            if (parseInt >= 0 && parseInt < TrtcStreamProcessorImpl.ProcessType.values().length) {
                aVar.c = TrtcStreamProcessorImpl.ProcessType.values()[parseInt];
            }
            if (this.f13938a.v1() != null) {
                this.f13938a.v1().a(aVar);
            }
        }
    }

    public final void K(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ac1b2", new Object[]{this, map});
        } else if (map != null) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("isLocal"));
            boolean parseBoolean2 = Boolean.parseBoolean(map.get("audioEnable"));
            boolean parseBoolean3 = Boolean.parseBoolean(map.get(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
            boolean parseBoolean4 = Boolean.parseBoolean(map.get(TrtcConstants.TRTC_PARAMS_DATA_ENABLE));
            String str = map.get("code");
            Objects.requireNonNull(str);
            int parseInt = Integer.parseInt(str);
            String str2 = map.get("msg");
            if (parseInt != 0) {
                TrtcLog.i("TrtcEvent", "StreamUpdate, errorCode: " + parseInt + ", msg: " + str2 + ", ignore it");
            } else if (parseBoolean) {
                a.C0782a aVar = new a.C0782a();
                aVar.f13892a = parseBoolean2;
                aVar.b = parseBoolean3;
                aVar.c = parseBoolean4;
                this.b.m(aVar);
            } else {
                a.b bVar = new a.b();
                bVar.b = parseBoolean2;
                bVar.c = parseBoolean3;
                bVar.d = parseBoolean4;
                bVar.f13893a = map.get("remoteUserId");
                this.b.C(bVar);
            }
        }
    }

    public void M(ITrtcObserver.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7ff221", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984c525c", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcEvent", "trtc native engine init success: " + z + ", elapsed: " + (System.currentTimeMillis() - this.e) + " ms");
        this.b.f(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f581dd8", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            this.d = currentTimeMillis;
            return;
        }
        tmu.f("TrtcEvent", "live duration ms: " + (currentTimeMillis - this.d));
    }

    public final void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728f606a", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("remoteUserId");
            tmu.f("TrtcEvent", "Call timeout| userId: " + str);
            TrtcEngineImpl trtcEngineImpl = this.f13938a;
            if (trtcEngineImpl != null) {
                trtcEngineImpl.h0().b(str);
            }
            this.b.e(str);
        }
    }

    public final void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644578a1", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("channelId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            String str3 = map.get("message");
            String str4 = map.get("promoterUserId");
            TrtcLog.j("TrtcEvent", "processChannelMsgBroadcastNotify, channelId: " + str + " ,extension: " + str2 + " ,message: " + str3 + " ,promoterUserId: " + str4);
            nlu nluVar = this.b;
            if (nluVar != null) {
                nluVar.v1(str, str2, str3, str4);
            }
        }
    }

    public final void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ba0683", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("channelId");
            String str2 = map.get("resultCode");
            Objects.requireNonNull(str2);
            int parseInt = Integer.parseInt(str2);
            String str3 = map.get("resultMessage");
            String str4 = map.get("message");
            String str5 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            TrtcLog.j("TrtcEvent", "processChannelMsgBroadcastRsp, channelId: " + str + " ,resultCode: " + parseInt + " ,resultMessage: " + str3 + " ,message: " + str4 + " ,extension: " + str5);
            nlu nluVar = this.b;
            if (nluVar != null) {
                nluVar.w1(str, parseInt, str3, str4, str5);
            }
        }
    }

    public final void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e762797", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("userId");
            String str2 = map.get("customMsg");
            ITrtcObserver.d dVar = this.c;
            if (dVar != null) {
                ((aju) dVar).S(str, str2);
            } else {
                TrtcLog.i("TrtcEvent", "no observer for custom message");
            }
        }
    }

    public final void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac6bbb9", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("userId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            TrtcDefines.TrtcUserRole trtcUserRole = TrtcDefines.TrtcUserRole.E_ROLE_NONE;
            int parseInt = Integer.parseInt(map.get("role"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcUserRole.values().length) {
                trtcUserRole = TrtcDefines.TrtcUserRole.values()[parseInt];
            }
            Boolean.parseBoolean(map.get("isMultiChatMode"));
            tmu.f("TrtcEvent", "Remote hangup call, " + str + ", role: " + trtcUserRole);
            this.b.x(str, str2);
            this.f13938a.h0().a();
            this.f13938a.h().stopSubCapture();
        }
    }

    public final void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789ff4a", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.TrtcMixMode trtcMixMode = TrtcDefines.TrtcMixMode.MIX_LOCAL;
            String str = map.get("mixType");
            Objects.requireNonNull(str);
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMixMode.values().length) {
                trtcMixMode = TrtcDefines.TrtcMixMode.values()[parseInt];
            }
            tmu.f("TrtcEvent", "Link config update, mix mode: " + trtcMixMode);
            this.f13938a.c1(trtcMixMode);
        }
    }

    public final void u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793d3a32", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("channelId");
            if (this.b != null && !TextUtils.isEmpty(str)) {
                this.b.A1(str);
            }
        }
    }

    public final void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdca9ef3", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.TrtcChannelAction trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_UNKNOWN;
            int parseInt = Integer.parseInt(map.get("action"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcChannelAction.values().length) {
                trtcChannelAction = TrtcDefines.TrtcChannelAction.values()[parseInt];
            }
            TrtcDefines.d dVar = new TrtcDefines.d();
            dVar.f13878a = trtcChannelAction;
            dVar.c = map.get("channelId");
            dVar.b = map.get("remoteUserId");
            dVar.f = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            dVar.d = "1".equals(map.get("audioEnable"));
            dVar.e = "1".equals(map.get(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE));
            TrtcLog.j("TrtcEvent", "notify channel, action: " + trtcChannelAction + ", a: " + dVar.d + ", v: " + dVar.e + ", channelId:" + dVar.c + ". ext:" + dVar.f);
            this.b.t(dVar);
        }
    }

    public final void y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8891fe9a", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("code");
            Objects.requireNonNull(str);
            Integer.parseInt(str);
            map.get("msg");
            TrtcDefines.TrtcChannelAction trtcChannelAction = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_UNKNOWN;
            int parseInt = Integer.parseInt(map.get("action"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcChannelAction.values().length) {
                trtcChannelAction = TrtcDefines.TrtcChannelAction.values()[parseInt];
            }
            TrtcLog.j("TrtcEvent", "notify channel rsp, action: " + trtcChannelAction + ", channelId:" + map.get("channelId"));
        }
    }

    public final void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182401e5", new Object[]{this, map});
        } else if (map != null && Boolean.parseBoolean(map.get("status"))) {
            slu.a();
        }
    }

    public final void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4574dff4", new Object[]{this, map});
        } else if (map != null) {
            boolean parseBoolean = map.containsKey("mute") ? Boolean.parseBoolean(map.get("mute")) : false;
            if (map.containsKey("remoteStreamIds") && map.get("remoteStreamIds").length() > 0) {
                ArrayList<String> arrayList = (ArrayList) JSON.parseObject(map.get("remoteStreamIds"), new b(this), new Feature[0]);
                if (!arrayList.isEmpty()) {
                    this.b.D1(parseBoolean, arrayList);
                }
            }
        }
    }

    public final TrtcDefines.a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.a) ipChange.ipc$dispatch("3fff438c", new Object[]{this, str});
        }
        TrtcDefines.a aVar = new TrtcDefines.a();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new f(this), new Feature[0]);
            if (!map.isEmpty()) {
                Integer.parseInt((String) map.get("lostRate"));
                Integer.parseInt((String) map.get("rtt"));
                Integer.parseInt((String) map.get("volumeStats"));
                Integer.parseInt((String) map.get("reTransRate"));
            }
        }
        return aVar;
    }

    public final TrtcDefines.k e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.k) ipChange.ipc$dispatch("225b2bcd", new Object[]{this, str});
        }
        TrtcDefines.k kVar = new TrtcDefines.k();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new h(this), new Feature[0]);
            if (!str.isEmpty()) {
                String str2 = (String) map.get("codec");
                String str3 = (String) map.get("preset");
                Integer.parseInt((String) map.get("sendBps"));
                kVar.f13885a = Integer.parseInt((String) map.get("sendFps"));
                kVar.b = Integer.parseInt((String) map.get("inputFps"));
                Double.parseDouble((String) map.get("psnr"));
                Double.parseDouble((String) map.get("ssim"));
                Integer.parseInt((String) map.get("qp"));
                Integer.parseInt((String) map.get("rtt"));
                Integer.parseInt((String) map.get("lostRate"));
                Integer.parseInt((String) map.get("reTransRate"));
                Integer.parseInt((String) map.get("dropFrameByCapture"));
                Integer.parseInt((String) map.get("dropFrameByEncoder"));
                kVar.c = Integer.parseInt((String) map.get("dropFrameByEncoderQueue"));
                Integer.parseInt((String) map.get("dropFrameByRateLimiter"));
            }
        }
        return kVar;
    }

    public final TrtcDefines.a f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.a) ipChange.ipc$dispatch("884043b3", new Object[]{this, str});
        }
        TrtcDefines.a aVar = new TrtcDefines.a();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new g(this), new Feature[0]);
            if (!map.isEmpty()) {
                aVar.f13875a = (String) map.get("remoteStreamId");
                Integer.parseInt((String) map.get("lostRate"));
                Integer.parseInt((String) map.get("rtt"));
                Integer.parseInt((String) map.get("volumeStats"));
            }
        }
        return aVar;
    }

    public final TrtcDefines.q g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.q) ipChange.ipc$dispatch("b626657", new Object[]{this, str});
        }
        TrtcDefines.q qVar = new TrtcDefines.q();
        if (str != null && !str.isEmpty()) {
            Map map = (Map) JSON.parseObject(str, new i(this), new Feature[0]);
            if (!map.isEmpty()) {
                String str2 = (String) map.get("remoteStreamId");
                Integer.parseInt((String) map.get("delay"));
                Integer.parseInt((String) map.get("rtt"));
                Integer.parseInt((String) map.get("width"));
                Integer.parseInt((String) map.get("height"));
                Integer.parseInt((String) map.get("lostRate"));
                Integer.parseInt((String) map.get("recvFps"));
                Integer.parseInt((String) map.get("recvBitrate"));
                Integer.parseInt((String) map.get("ntpDelay"));
            }
        }
        return qVar;
    }

    public final void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6f7fa8", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.b bVar = new TrtcDefines.b();
            TrtcDefines.TrtcAnswerType trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE;
            int parseInt = Integer.parseInt(map.get("audioDirection"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.c = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt];
            }
            int parseInt2 = Integer.parseInt(map.get("videoDirection"));
            if (parseInt2 >= 0 && parseInt2 < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.d = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt2];
            }
            int parseInt3 = Integer.parseInt(map.get("peerRole"));
            if (parseInt3 >= 0 && parseInt3 < TrtcDefines.TrtcUserRole.values().length) {
                bVar.b = TrtcDefines.TrtcUserRole.values()[parseInt3];
            }
            int parseInt4 = Integer.parseInt(map.get(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE));
            if (parseInt4 >= 0 && parseInt4 < TrtcDefines.TrtcAnswerType.values().length) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.values()[parseInt4];
            }
            bVar.f13876a = map.get("remoteUserId");
            bVar.e = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            bVar.f = Boolean.parseBoolean(map.get("isMultiChatMode"));
            bVar.g = map.get("channelId");
            tmu.f("TrtcEvent", "Remote answer call: " + bVar.f13876a + ", role: " + bVar.b + ", answer type: " + trtcAnswerType + ", media trans profile: " + bVar.c + "-" + bVar.d + ", isMutliChatMode: " + bVar.f);
            TrtcEngineImpl trtcEngineImpl = this.f13938a;
            if (trtcEngineImpl == null || trtcAnswerType != TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE) {
                trtcEngineImpl.h0().b(bVar.f13876a);
            } else {
                trtcEngineImpl.a1(bVar.f13876a, true);
                this.f13938a.b1(true);
            }
            this.b.v(bVar, trtcAnswerType);
        }
    }

    public final void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a42948", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.b bVar = new TrtcDefines.b();
            int parseInt = Integer.parseInt(map.get("audioDirection"));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.c = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt];
            }
            int parseInt2 = Integer.parseInt(map.get("videoDirection"));
            if (parseInt2 >= 0 && parseInt2 < TrtcDefines.TrtcMediaTransportProfile.values().length) {
                bVar.d = TrtcDefines.TrtcMediaTransportProfile.values()[parseInt2];
            }
            Map map2 = (Map) JSON.parseObject(map.get(pg1.ATOM_caller), new l(this), new Feature[0]);
            bVar.f13876a = (String) map2.get("userId");
            bVar.e = (String) map2.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            int parseInt3 = Integer.parseInt((String) map2.get("role"));
            if (parseInt3 >= 0 && parseInt3 < TrtcDefines.TrtcUserRole.values().length) {
                bVar.b = TrtcDefines.TrtcUserRole.values()[parseInt3];
            }
            bVar.f = Boolean.parseBoolean(map.get("isMultiChatMode"));
            tmu.f("TrtcEvent", "New call: " + bVar.f13876a + ", role: " + bVar.b + ", media trans profile: " + bVar.c + "-" + bVar.d + ", isMutliChatMode: " + bVar.f);
            this.f13938a.h0().e(bVar.f13876a, bVar.b);
            this.b.r(bVar);
        }
    }

    public final void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3c142e", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("userId");
            String str2 = map.get(TrtcConstants.TRTC_PARAMS_EXTENSION);
            boolean parseBoolean = Boolean.parseBoolean(map.get("isMultiChatMode"));
            this.f13938a.h0().b(str);
            tmu.f("TrtcEvent", "Remote cancel call, " + str);
            if (parseBoolean) {
                this.f13938a.q1(true);
                this.b.x(str, str2);
                return;
            }
            this.b.w(str, str2);
        }
    }

    public final void q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e71ea5", new Object[]{this, map});
        } else if (map != null) {
            int parseInt = Integer.parseInt(map.get("event"));
            int parseInt2 = Integer.parseInt(map.get("code"));
            String str = map.get("msg");
            if (parseInt >= 0 && parseInt <= TrtcDefines.TrtcErrorEvent.values().length - 1) {
                TrtcDefines.TrtcErrorEvent trtcErrorEvent = TrtcDefines.TrtcErrorEvent.values()[parseInt];
                this.b.g(trtcErrorEvent, parseInt2, str);
                tmu.f("TrtcEvent", "onError| event: " + trtcErrorEvent + " code:" + parseInt2 + " msg: " + str);
            }
        }
    }

    public final void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974a4099", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.e eVar = new TrtcDefines.e();
            eVar.f13879a = map.get("channelId");
            String str = map.get("code");
            Objects.requireNonNull(str);
            eVar.b = Integer.parseInt(str);
            eVar.c = map.get("msg");
            eVar.d = map.get("localStreamId");
            eVar.e = Boolean.parseBoolean(map.get("isMultiChatMode"));
            tmu.f("TrtcEvent", "join channel rsp, id: " + eVar.f13879a + ", code: " + eVar.b + ", msg: " + eVar.c);
            this.b.k(eVar);
            int i2 = eVar.b;
            if (i2 == 0 || i2 == 200) {
                this.f13938a.b1(true);
            }
        }
    }

    public final void E(Map<String, String> map) {
        nlu nluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de1434b", new Object[]{this, map});
        } else if (map != null) {
            if (map.containsKey("localSpeakingStatus") && this.b != null) {
                boolean parseBoolean = Boolean.parseBoolean(map.get("localSpeakingStatus"));
                this.b.B1(parseBoolean);
                if (parseBoolean) {
                    this.f = true;
                }
            }
            if (map.containsKey("remoteSpeakingList") && map.get("remoteSpeakingList").length() > 0) {
                ArrayList<String> arrayList = (ArrayList) JSON.parseObject(map.get("remoteSpeakingList"), new C0785c(this), new Feature[0]);
                if (!arrayList.isEmpty() && (nluVar = this.b) != null) {
                    nluVar.F1(arrayList);
                }
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                if (this.f) {
                    arrayList2.add(this.f13938a.v0());
                }
                nlu nluVar2 = this.b;
                if (nluVar2 != null) {
                    nluVar2.p0(arrayList2);
                }
                this.f = false;
            }
        }
    }

    public final void G(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3708dbd6", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.n> arrayList = new ArrayList<>();
            String str = map.get("callStatusList");
            Objects.requireNonNull(str);
            if (str.length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new n(this), new Feature[0]);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TrtcDefines.n nVar = new TrtcDefines.n();
                    nVar.f13888a = (String) ((Map) arrayList2.get(i2)).get("userId");
                    nVar.c = (String) ((Map) arrayList2.get(i2)).get(TrtcConstants.TRTC_PARAMS_EXTENSION);
                    int parseInt = Integer.parseInt((String) ((Map) arrayList2.get(i2)).get("role"));
                    nVar.b = TrtcDefines.TrtcUserRole.values()[parseInt];
                    TrtcEngineImpl trtcEngineImpl = this.f13938a;
                    if (trtcEngineImpl != null) {
                        trtcEngineImpl.h0().e(nVar.f13888a, TrtcDefines.TrtcUserRole.values()[parseInt]);
                        this.f13938a.h0().f(nVar.f13888a, TrtcInnerDefines.CallState.E_CALL_SETUP);
                    }
                    tmu.f("TrtcEvent", "Remote joined channel| userId: " + nVar.f13888a);
                    TrtcLog.j("TrtcEvent", "processPeerJoinChannel userId: " + nVar.f13888a + " ,extension: " + nVar.c + " ,role: " + nVar.b);
                    arrayList.add(nVar);
                }
            }
            if (this.f13938a.w0()) {
                this.b.z(arrayList);
            } else if (arrayList.size() > 0) {
                Iterator<TrtcDefines.n> it = arrayList.iterator();
                while (it.hasNext()) {
                    TrtcDefines.n next = it.next();
                    this.b.y(next.f13888a, next.c);
                }
            }
        }
    }

    public final void H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b69473", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.n> arrayList = new ArrayList<>();
            String str = map.get("callStatusList");
            Objects.requireNonNull(str);
            if (str.length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new a(this), new Feature[0]);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TrtcDefines.n nVar = new TrtcDefines.n();
                    nVar.f13888a = (String) ((Map) arrayList2.get(i2)).get("userId");
                    nVar.c = (String) ((Map) arrayList2.get(i2)).get(TrtcConstants.TRTC_PARAMS_EXTENSION);
                    TrtcDefines.TrtcUserRole trtcUserRole = TrtcDefines.TrtcUserRole.E_ROLE_NONE;
                    int parseInt = Integer.parseInt((String) ((Map) arrayList2.get(i2)).get("role"));
                    if (parseInt >= 0 && parseInt < TrtcDefines.TrtcUserRole.values().length) {
                        trtcUserRole = TrtcDefines.TrtcUserRole.values()[parseInt];
                    }
                    nVar.b = trtcUserRole;
                    tmu.f("TrtcEvent", "Remote left channel| userId: " + nVar.f13888a);
                    if (!this.f13938a.w0()) {
                        TrtcEngineImpl trtcEngineImpl = this.f13938a;
                        if (trtcEngineImpl != null && trtcUserRole == TrtcDefines.TrtcUserRole.E_ROLE_ANCHOR) {
                            trtcEngineImpl.U0().d(nVar.f13888a).start();
                        }
                    } else {
                        this.f13938a.h0().b(nVar.f13888a);
                    }
                    TrtcLog.j("TrtcEvent", "processPeerLeftChannel userId: " + nVar.f13888a + " ,extension: " + nVar.c + " ,role: " + nVar.b);
                    arrayList.add(nVar);
                }
            }
            if (this.f13938a.w0()) {
                this.b.B(arrayList);
            } else if (arrayList.size() > 0) {
                Iterator<TrtcDefines.n> it = arrayList.iterator();
                while (it.hasNext()) {
                    TrtcDefines.n next = it.next();
                    this.b.A(next.f13888a, next.c);
                }
            }
        }
    }

    public final void L(Map<String, String> map) {
        nlu nluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b973d2e", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState = this.g;
            if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT || trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                this.b.p(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_BAD);
                return;
            }
            if (!map.get("networkStats").isEmpty()) {
                Map map2 = (Map) JSON.parseObject(map.get("networkStats"), new j(this), new Feature[0]);
                int parseInt = Integer.parseInt((String) map2.get("networkQuality"));
                if (parseInt >= 0 && parseInt <= TrtcDefines.TrtcNetWorkQuality.values().length - 1 && (nluVar = this.b) != null) {
                    nluVar.p(TrtcDefines.TrtcNetWorkQuality.values()[parseInt]);
                }
                if (this.b != null) {
                    TrtcDefines.l lVar = new TrtcDefines.l();
                    lVar.f13886a = Long.parseLong((String) map2.get("txByte"));
                    lVar.b = Long.parseLong((String) map2.get("rxByte"));
                    lVar.c = Integer.parseInt((String) map2.get("txKBps"));
                    lVar.d = Integer.parseInt((String) map2.get("rxKBps"));
                    lVar.e = Integer.parseInt((String) map2.get("availableSendBps"));
                    this.b.q(lVar);
                }
            }
            if (!map.get("sessionList").isEmpty()) {
                ArrayList arrayList = (ArrayList) JSON.parseObject(map.get("sessionList"), new k(this), new Feature[0]);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TrtcDefines.i iVar = new TrtcDefines.i();
                    iVar.f13883a = (String) ((Map) arrayList.get(i2)).get("localStreamId");
                    Integer.parseInt((String) ((Map) arrayList.get(i2)).get("duration"));
                    iVar.b = this.f13938a.j1().d();
                    this.f13938a.j1().e();
                    d((String) ((Map) arrayList.get(i2)).get("localAudioStats"));
                    iVar.c = e((String) ((Map) arrayList.get(i2)).get("localVideoStats"));
                    TrtcDefines.o oVar = new TrtcDefines.o();
                    oVar.b = f((String) ((Map) arrayList.get(i2)).get("remoteAudioStats"));
                    g((String) ((Map) arrayList.get(i2)).get("remoteVideoStats"));
                    oVar.f13889a = oVar.b.f13875a;
                    TrtcEngineImpl trtcEngineImpl = this.f13938a;
                    if (trtcEngineImpl != null) {
                        trtcEngineImpl.d1(iVar, oVar);
                    }
                }
            }
        }
    }

    public void c(int i2, String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cad8842", new Object[]{this, new Integer(i2), str});
        } else if (i2 < 0 || i2 > TrtcInnerDefines.EventType.values().length - 1) {
            TrtcLog.i("TrtcEvent", "invalid event type: " + i2);
        } else {
            TrtcInnerDefines.EventType eventType = TrtcInnerDefines.EventType.values()[i2];
            if (!(eventType == TrtcInnerDefines.EventType.ON_TRTC_STATISTICS_UT || eventType == TrtcInnerDefines.EventType.ON_TRTC_STATS)) {
                tmu.f("TrtcEvent", "native event: " + eventType + ", msg: " + str);
            }
            if (str.length() > 0) {
                try {
                    map = (Map) JSON.parseObject(str, new d(this), new Feature[0]);
                } catch (Exception e2) {
                    TrtcLog.i("TrtcEvent", "event parse error: " + e2.getMessage());
                    return;
                }
            } else {
                map = null;
            }
            try {
                switch (e.$SwitchMap$com$taobao$trtc$impl$TrtcInnerDefines$EventType[eventType.ordinal()]) {
                    case 1:
                        v();
                        return;
                    case 2:
                        w(map);
                        return;
                    case 3:
                        j(map);
                        return;
                    case 4:
                        k(map);
                        return;
                    case 5:
                        h(map);
                        return;
                    case 6:
                        i(map);
                        return;
                    case 7:
                        m(map);
                        return;
                    case 8:
                        r(map);
                        return;
                    case 9:
                        s(map);
                        return;
                    case 10:
                        G(map);
                        return;
                    case 11:
                        H(map);
                        return;
                    case 12:
                        y(map);
                        return;
                    case 13:
                        o(map);
                        return;
                    case 14:
                        n(map);
                        return;
                    case 15:
                        x(map);
                        return;
                    case 16:
                        l(map);
                        return;
                    case 17:
                        t(map);
                        return;
                    case 18:
                        B(map);
                        return;
                    case 19:
                        I(map);
                        return;
                    case 20:
                        L(map);
                        return;
                    case 21:
                        q(map);
                        return;
                    case 22:
                        J(map);
                        return;
                    case 23:
                        p(map);
                        return;
                    case 24:
                        K(map);
                        return;
                    case 25:
                        F(map);
                        return;
                    case 26:
                        z(map);
                        return;
                    case 27:
                        D(map);
                        return;
                    case 28:
                        C(map);
                        return;
                    case 29:
                        A();
                        return;
                    case 30:
                        u(map);
                        return;
                    case 31:
                        E(map);
                        return;
                    default:
                        TrtcLog.j("TrtcEvent", "unknown event type: " + eventType);
                        return;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                TrtcLog.i("TrtcEvent", str);
                tmu.g("TrtcEvent", "exception on native event process:" + eventType + ", msg: " + e3.getMessage());
            }
        }
    }

    public final void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be71b4dc", new Object[]{this, map});
        } else if (map != null) {
            TrtcDefines.c cVar = new TrtcDefines.c();
            TrtcDefines.TrtcAnswerType trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE;
            String str = map.get("code");
            Objects.requireNonNull(str);
            cVar.b = Integer.parseInt(str);
            cVar.c = map.get("msg");
            cVar.f13877a = map.get("remoteUserId");
            cVar.d = map.get("channelId");
            this.f13938a.q1(Boolean.parseBoolean(map.get("isMultiChatMode")));
            int parseInt = Integer.parseInt(map.get(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE));
            if (parseInt >= 0 && parseInt < TrtcDefines.TrtcAnswerType.values().length) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.values()[parseInt];
            }
            tmu.f("TrtcEvent", "Answer rsp, id: " + cVar.f13877a + ", code: " + cVar.b + ", msg: " + cVar.c);
            if (trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE) {
                this.f13938a.a1(cVar.f13877a, false);
                this.f13938a.b1(true);
            } else {
                this.f13938a.h0().b(cVar.f13877a);
            }
            this.b.c(cVar, trtcAnswerType, map.get(TrtcConstants.TRTC_PARAMS_EXTENSION));
        }
    }

    public final void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d766f3c", new Object[]{this, map});
        } else if (map != null) {
            ArrayList<TrtcDefines.c> arrayList = new ArrayList<>();
            String str = map.get("code");
            Objects.requireNonNull(str);
            int parseInt = Integer.parseInt(str);
            this.f13938a.q1(Boolean.parseBoolean(map.get("isMultiChatMode")));
            String str2 = map.get("msg");
            String str3 = map.get("callStatusList");
            Objects.requireNonNull(str3);
            if (str3.length() > 0) {
                ArrayList arrayList2 = (ArrayList) JSON.parseObject(map.get("callStatusList"), new m(this), new Feature[0]);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TrtcDefines.c cVar = new TrtcDefines.c();
                    String str4 = (String) ((Map) arrayList2.get(i2)).get("code");
                    Objects.requireNonNull(str4);
                    cVar.b = Integer.parseInt(str4);
                    cVar.c = (String) ((Map) arrayList2.get(i2)).get("msg");
                    cVar.f13877a = (String) ((Map) arrayList2.get(i2)).get("userId");
                    arrayList.add(cVar);
                    if (cVar.b != 0) {
                        this.f13938a.h0().b(cVar.f13877a);
                    } else {
                        this.f13938a.h0().f(cVar.f13877a, TrtcInnerDefines.CallState.E_CALL_ING);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                TrtcDefines.c cVar2 = new TrtcDefines.c();
                cVar2.c = str2;
                cVar2.b = parseInt;
                cVar2.f13877a = "null";
                arrayList.add(cVar2);
            } else if (parseInt != 0) {
                arrayList.get(0).c = str2;
                arrayList.get(0).b = parseInt;
            }
            tmu.f("TrtcEvent", "Call rsp: " + arrayList.toString());
            this.b.n(arrayList, map.get(TrtcConstants.TRTC_PARAMS_EXTENSION));
        }
    }

    public final void v() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef67840f", new Object[]{this});
            return;
        }
        if (this.d > 0) {
            i2 = (int) (System.currentTimeMillis() - this.d);
        }
        tmu.f("TrtcEvent", "live start success| elapsed: " + i2 + " ms");
        nlu nluVar = this.b;
        if (nluVar != null) {
            nluVar.D(i2);
            this.b.o(TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED);
            this.b.p(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_GOOD);
        }
        this.f13938a.b1(true);
    }

    public final void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5bbc82", new Object[]{this, map});
        } else if (map != null) {
            try {
                int parseInt = Integer.parseInt(map.get("state"));
                if (parseInt < 0 || parseInt > TrtcDefines.TrtcMediaConnectionState.values().length - 1) {
                    TrtcLog.i("TrtcEvent", "media connection state invalid : " + parseInt);
                    return;
                }
                this.g = TrtcDefines.TrtcMediaConnectionState.values()[parseInt];
                tmu.f("TrtcEvent", "meida connection state: " + this.g);
                nlu nluVar = this.b;
                if (nluVar != null) {
                    nluVar.o(this.g);
                }
                TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState = this.g;
                if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT || trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                    this.b.p(TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_BAD);
                }
                TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState2 = this.g;
                if (trtcMediaConnectionState2 == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
                    this.f13938a.b1(false);
                } else if (trtcMediaConnectionState2 == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED) {
                    this.f13938a.b1(true);
                }
            } catch (Exception e2) {
                TrtcLog.i("TrtcEvent", "parse media connectoin state error: " + e2.getMessage());
            }
        }
    }
}
