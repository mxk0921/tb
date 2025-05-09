package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcAttendee;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.IAudioRecordEventHandler;
import com.taobao.artc.internal.ArtcEngineEventProxy;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aju implements ITrtcObserver.a, ITrtcObserver.e, ITrtcObserver.f, ITrtcObserver.b, ITrtcObserver.d, ITrtcObserver.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public au2 f15781a;
    public final ArtcEngineEventProxy b = new ArtcEngineEventProxy();
    public IAudioRecordEventHandler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent;

        static {
            int[] iArr = new int[TrtcDefines.TrtcErrorEvent.values().length];
            $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent = iArr;
            try {
                iArr[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_MEDIA_CONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_NEED_RETRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_NEED_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_DNS_FAILD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_LINK_LIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_LINKLIVE_MEDIA_CONNECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_MEDIA_DEVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        t2o.a(395313372);
        t2o.a(395313390);
        t2o.a(395313394);
        t2o.a(395313395);
        t2o.a(395313391);
        t2o.a(395313393);
        t2o.a(395313392);
    }

    public aju(au2 au2Var) {
        this.f15781a = au2Var;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void A(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a155f2f", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onFirstVideoFrame userId:" + str + " w:" + i + " h:" + i2 + " ,isMutliChatMode: " + this.f15781a.p.w0());
        if (this.f15781a.p.w0()) {
            this.b.onFirstRemoteVideoFrameMutli(i, i2, str, i3);
        } else {
            this.b.onFirstRemoteVideoFrame(i, i2, str, i3);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6e88fa", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteCanceled");
        this.b.onCanceledCall2(this.f15781a.e(), str, 2, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void C(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20a9d0", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        TrtcLog.j("AdapterEvent", "onMediaConnectionChange: " + trtcMediaConnectionState);
        if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT) {
            this.b.onConnectionInterrupted();
        } else if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
            this.b.onConnectionLost();
        } else if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED) {
            this.b.onConnectionConnected();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54825390", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteJoinedChannel");
        au2 au2Var = this.f15781a;
        this.b.onUserJoinedChannel2(new ArtcAttendee(str, au2Var.j, au2Var.i), "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void E(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee6972a", new Object[]{this, trtcChannelAction, str, str2, str3});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteNotifyChannel");
        if (trtcChannelAction == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE) {
            this.b.onCalled2(str2, "default_call_id", str, 2, 1, 2, "", "");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87eb63ea", new Object[]{this, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onFirstAudioFrameTimeout remoteUserId:" + str + " ,isMutliChatMode: " + this.f15781a.p.w0());
        if (this.f15781a.p.w0()) {
            this.b.onFirstRemoteAudioFrameTimeoutMutli(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void H(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3875e64a", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        AConstants.ArtcErrorEvent a0 = a0(trtcErrorEvent);
        int Y = Y(i);
        TrtcLog.i("AdapterEvent", "onError event:" + trtcErrorEvent + ", code:" + i + " -> artc event:" + a0 + ", code:" + Y);
        this.b.onError(a0, Y);
        AConstants.ArtcErrorEventNew b0 = b0(trtcErrorEvent);
        int Z = Z(i);
        TrtcLog.i("AdapterEvent", "onError event:" + trtcErrorEvent + ", code:" + i + " -> artc event:" + a0 + ", code:" + Y);
        if (a0.ordinal() < AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MAX.ordinal()) {
            this.b.onError(b0, Z, str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void I(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98900e3d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onLocalStreamStatusUpdate isAdd:" + z + " ,width: " + i + " ,height: " + i2 + " ,fps: " + i3);
        this.b.onLocalStreamStatusUpdate(z, i, i2, i3);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void J(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43c5222", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onLinkLiveNeedMix, stream id:" + str + ", needMix: " + z);
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128938f7", new Object[]{this});
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfd7627", new Object[]{this});
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f322af", new Object[]{this});
        }
    }

    public void N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce610b6", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.i("AdapterEvent", "onCameraFreeze: " + str + " ,captureType: " + str2);
        this.b.onCaptureFreezed(str, str2, this.f15781a.p.w0());
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f9b6b", new Object[]{this, str});
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226fce65", new Object[]{this, str});
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onCameraSwitchDone: " + z);
        this.b.onCameraSwitchDone(z);
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c5941", new Object[]{this, str});
        }
    }

    public void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2f2ffd", new Object[]{this, str, str2});
        } else {
            this.b.onMessage(str2, str);
        }
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0f112c", new Object[]{this, str});
        } else {
            this.b.onUserPublishVideo(str);
        }
    }

    public void U(IAudioRecordEventHandler iAudioRecordEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09e98c", new Object[]{this, iAudioRecordEventHandler});
            return;
        }
        TrtcLog.j("AdapterEvent", "set artc audio record event handler, " + iAudioRecordEventHandler);
        this.c = iAudioRecordEventHandler;
    }

    public void V(ArtcEngineEventHandler artcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad39045", new Object[]{this, artcEngineEventHandler});
            return;
        }
        TrtcLog.j("AdapterEvent", "set artc event handler to adapter event proxy, " + artcEngineEventHandler);
        this.b.setArtcEngineEventHandler(artcEngineEventHandler);
    }

    public void W(au2 au2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc9897", new Object[]{this, au2Var});
            return;
        }
        TrtcLog.j("AdapterEvent", "set cached info handler, " + au2Var);
        this.f15781a = au2Var;
    }

    public final int X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4017f10a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        return -1;
    }

    public final int Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29869884", new Object[]{this, new Integer(i)})).intValue();
        }
        return -1;
    }

    public final int Z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc79c7a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 2000) {
            return -300;
        }
        if (i == 2001) {
            return -301;
        }
        if (i == 2100) {
            return AConstants.ArtcErrorJoinChannelErrorTimeOut;
        }
        if (i == 2200) {
            return AConstants.ArtcErrorMediaConnectionLost;
        }
        if (i == 4001) {
            return AConstants.ArtcErrorJoinChannelError;
        }
        if (i == 2300) {
            return AConstants.ArtcErrorAudioDeviceError;
        }
        if (i != 2301) {
            return i;
        }
        return AConstants.ArtcErrorVideoDeviceError;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1580a46b", new Object[]{this});
            return;
        }
        TrtcLog.j("AdapterEvent", "onBlueToothDeviceConnected");
        this.b.onBlueToothDeviceconnected();
    }

    public final AConstants.ArtcErrorEvent a0(TrtcDefines.TrtcErrorEvent trtcErrorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AConstants.ArtcErrorEvent) ipChange.ipc$dispatch("ebeffc39", new Object[]{this, trtcErrorEvent});
        }
        int i = a.$SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[trtcErrorEvent.ordinal()];
        if (i == 2) {
            return AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_JOININGCHANNEL;
        }
        if (i == 3) {
            return AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_CONNECTION;
        }
        if (i == 9) {
            IpChange ipChange2 = AConstants.ArtcErrorEvent.$ipChange;
        }
        return AConstants.ArtcErrorEvent.ARTC_EVENT_SERVER_ERROR;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3617597", new Object[]{this, new Integer(i), str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onLocalStreamUpdated, errorCode: " + i + " ,errorMsg: " + str);
        this.b.onLocalStreamUpdated(i, str);
    }

    public final AConstants.ArtcErrorEventNew b0(TrtcDefines.TrtcErrorEvent trtcErrorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AConstants.ArtcErrorEventNew) ipChange.ipc$dispatch("f8895ca7", new Object[]{this, trtcErrorEvent});
        }
        AConstants.ArtcErrorEventNew artcErrorEventNew = AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_INIT_ERROR;
        switch (a.$SwitchMap$com$taobao$trtc$api$TrtcDefines$TrtcErrorEvent[trtcErrorEvent.ordinal()]) {
            case 1:
            default:
                return artcErrorEventNew;
            case 2:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_JOINCHANNEL;
            case 3:
            case 4:
            case 5:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MEDIA_CONNECTION_ERROR;
            case 6:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_CREATE_V4_ERROR;
            case 7:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_LINKLIVE_ERROR;
            case 8:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MAX;
            case 9:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MEDIA_DEVICE_ERROR;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d023d9b", new Object[]{this, str});
            return;
        }
        TrtcLog.i("AdapterEvent", "onAudioRecordReadError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler != null) {
            iAudioRecordEventHandler.onReadError(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
        } else {
            this.b.onChannelMsgBroadcastNotify(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void e(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
        } else {
            this.b.onRemoteSpeakingStreams(arrayList);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void f(TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1e4d2", new Object[]{this, lVar});
        } else {
            TrtcLog.j("AdapterEvent", "onNetworkStats");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void g(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        TrtcLog.j("AdapterEvent", "onTrtcNetworkQuality: " + trtcNetWorkQuality);
        this.b.onLastmileQuality(trtcNetWorkQuality.ordinal());
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void h(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bd2ae", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteJoinedChannel");
        if (this.f15781a.p.w0()) {
            this.b.onUserJoinedChannelMutli(arrayList);
        } else if (arrayList != null && arrayList.size() > 0) {
            Iterator<TrtcDefines.n> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.n next = it.next();
                String str = next.f13888a;
                au2 au2Var = this.f15781a;
                this.b.onUserJoinedChannel2(new ArtcAttendee(str, au2Var.j, au2Var.i), "", next.c);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449a76a", new Object[]{this, str, new Integer(i)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onFirstAudioFrame remoteUserId:" + str + " elapsedMs:" + i + " ,isMutliChatMode: " + this.f15781a.p.w0());
        if (this.f15781a.p.w0()) {
            this.b.onFirstRemoteAudioFrameMutli(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void j(boolean z, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f99e15", new Object[]{this, new Boolean(z), arrayList});
            return;
        }
        TrtcLog.j("AdapterEvent", "onMuteRemoteAudio mute:" + z + " remoteStreamIds: " + arrayList);
        this.b.onMuteRemoteAudio(z, arrayList);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a423734f", new Object[]{this, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onFirstVideoFrameTimeout remoteUserId:" + str + " ,isMutliChatMode: " + this.f15781a.p.w0());
        if (this.f15781a.p.w0()) {
            this.b.onFirstRemoteVideoFrameTimeoutMutli(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf89f55f", new Object[]{this, str});
            return;
        }
        TrtcLog.i("AdapterEvent", "onAudioRecordStartError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler != null) {
            iAudioRecordEventHandler.onStartError(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
        } else {
            this.b.onLocalSpeakingStatus(z);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void onAudioRouteChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onAudioRouteChanged");
        this.b.onAudioRouteChanged(i);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void onBlueToothDeviceDisconnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
            return;
        }
        TrtcLog.j("AdapterEvent", "onBlueToothDeviceDisconnected");
        this.b.onBlueToothDeviceDisconnected();
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void onLiveChannelIdUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onLiveChannelIdUpdate");
        this.b.onLiveChannelIdUpdate(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb3c428", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.j("AdapterEvent", "onJoinChannelSuccess");
        this.b.onJoinChannelSuccess(i);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
            return;
        }
        TrtcLog.j("AdapterEvent", "onDegradeToTcp()");
        this.b.onDegradeToTcp();
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void u(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d7bba5", new Object[]{this, str, new Integer(i), str2, str3, str4});
        } else {
            this.b.onChannelMsgBroadcastRsp(str, i, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99dfd55", new Object[]{this, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onCallTimeout");
        if (this.f15781a.p.w0()) {
            this.b.onCallTimeoutMutli(str);
        } else {
            this.b.onCallTimeout();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e74d5e1", new Object[]{this, str});
            return;
        }
        TrtcLog.i("AdapterEvent", "onAudioRecordInitError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler != null) {
            iAudioRecordEventHandler.onInitError(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda22ffa", new Object[]{this, new Boolean(z)});
        } else {
            this.b.onSignalChannelAvailable();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void G(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08348ac", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteLeftChannel");
        if (this.f15781a.p.w0()) {
            this.b.onUserLeftChannelMutli(arrayList);
        } else if (arrayList != null && arrayList.size() > 0) {
            Iterator<TrtcDefines.n> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.n next = it.next();
                this.b.onUserLeftChannel2(next.f13888a, 1, "", next.c);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89e060d", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteHangup");
        au2 au2Var = this.f15781a;
        au2Var.u = null;
        if (au2Var.p.w0()) {
            this.b.onKickedMutli(str, "", str2);
            this.f15781a.p.q1(false);
            return;
        }
        this.b.onKicked2(this.f15781a.e(), str, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c61d2", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteLeftChannel");
        this.b.onUserLeftChannel2(str, 1, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void t(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daedd92a", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onAnswerRsp");
        if (this.f15781a.p.w0()) {
            this.b.onAnswerMutli(cVar.f13877a, trtcAnswerType.ordinal(), str, cVar.d);
            if (!this.f15781a.p.u0() && trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT) {
                this.f15781a.p.q1(false);
                return;
            }
            return;
        }
        this.b.onAnswer2(this.f15781a.e(), "", trtcAnswerType.ordinal(), "", "");
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void w(ArrayList<TrtcDefines.c> arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a61b229", new Object[]{this, arrayList, str});
            return;
        }
        TrtcLog.j("AdapterEvent", "onMakeCallRsp");
        int X = X(arrayList.get(0).b);
        if (this.f15781a.p.w0()) {
            this.b.onCallMutli(arrayList, str);
        } else {
            this.b.onCall2(this.f15781a.e(), "", arrayList.get(0).f13877a, X, "", "");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void x(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0423f27", new Object[]{this, eVar});
            return;
        }
        TrtcLog.j("AdapterEvent", "onJoinChannelRsp, channelRspInfo: " + eVar.toString());
        if (!eVar.e || !eVar.d.equals("TrtcLocalStream")) {
            int i = eVar.b;
            if (i == 0) {
                this.b.onJoinChannelSuccess(0);
            } else {
                this.b.onError(AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_JOININGCHANNEL, i);
            }
        } else {
            this.f15781a.p.o1(true);
            this.b.onJoinCallMutli(eVar.b, eVar.c);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void q(TrtcDefines.b bVar, TrtcDefines.TrtcAnswerType trtcAnswerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7316f370", new Object[]{this, bVar, trtcAnswerType});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRemoteAnswered");
        if (bVar.f) {
            this.b.onAnsweredMutli(bVar.f13876a, bVar.b.ordinal(), trtcAnswerType.ordinal(), bVar.e, true, bVar.g);
        } else {
            this.b.onAnswered2(this.f15781a.e(), "default_call_id", bVar.f13876a, bVar.b.ordinal(), trtcAnswerType.ordinal(), "", bVar.e);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void r(TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2eb917f", new Object[]{this, bVar});
            return;
        }
        TrtcLog.j("AdapterEvent", "onRecvNewCall, remote id: " + bVar.f13876a + ", role: " + bVar.b);
        if (bVar.f) {
            this.b.onCalledMutli("default_call_id", bVar.f13876a, bVar.b.ordinal(), bVar.e, true);
            return;
        }
        ArtcEngineEventProxy artcEngineEventProxy = this.b;
        String e = this.f15781a.e();
        String str = bVar.f13876a;
        int ordinal = bVar.b.ordinal();
        int ordinal2 = bVar.d.ordinal();
        String str2 = bVar.e;
        artcEngineEventProxy.onCalled2(e, "default_call_id", str, ordinal, 1, ordinal2, str2, str2);
    }
}
