package com.taobao.artc.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcAttendee;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.ArtcException;
import com.taobao.artc.api.ArtcStats;
import com.taobao.artc.api.IArtcEngineEventHandler;
import com.taobao.artc.api.LocalVideoStats;
import com.taobao.artc.api.RemoteVideoStats;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import tb.nf;
import tb.oc1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcEngineEventProxy extends ArtcEngineEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IArtcEngineEventHandler mIArtcEngineEventHandler = null;
    public ArtcEngineEventHandler mArtcEngineEventHandler = null;
    public final String TAG = "ArtcEngineEvent";

    static {
        t2o.a(395313210);
    }

    private void executeEvent(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348ef2aa", new Object[]{this, runnable});
        } else {
            nf.h(runnable);
        }
    }

    public static /* synthetic */ Object ipc$super(ArtcEngineEventProxy artcEngineEventProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/internal/ArtcEngineEventProxy");
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswerMutli(final String str, final int i, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b745d5a", new Object[]{this, str, new Integer(i), str2, str3});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.71
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onAnswerMutli(str, i, str2, str3);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioQuality(final int i, final short s, final short s2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82536d34", new Object[]{this, new Integer(i), new Short(s), new Short(s2)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onAudioQuality(i, s, s2);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onAudioQuality(i, s, s2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCallMutli(final ArrayList<TrtcDefines.c> arrayList, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210ff3a1", new Object[]{this, arrayList, str});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.65
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onCallMutli(arrayList, str);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onChannelClosed(final String str, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c63d998", new Object[]{this, str, str2, new Integer(i)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onChannelClosed(str, str2, i);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onChannelClosed(str, str2, i);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onDegradeToTcp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.40
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onDegradeToTcp();
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(final AConstants.ArtcErrorEvent artcErrorEvent, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685e62c9", new Object[]{this, artcErrorEvent, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onError, errorEvent: " + artcErrorEvent.name() + ", errorCode: " + i, new Object[0]);
        oc1.a("onError, errorEvent: " + artcErrorEvent.name() + ", errorCode: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onError(artcErrorEvent, i);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onError(artcErrorEvent, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onKickedMutli(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5661ef6a", new Object[]{this, str, str2, str3});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.72
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onKickedMutli(str, str2, str3);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLastmileQuality(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905fc987", new Object[]{this, new Integer(i)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.39
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onLastmileQuality(i);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onLastmileQuality(i);
                    }
                }
            });
        }
    }

    public void onLocalStreamStatusUpdate(boolean z, final int i, final int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98900e3d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.69
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onUpdateSubCaptureSize(i, i2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLocalStreamUpdated(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3617597", new Object[]{this, new Integer(i), str});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.66
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onLocalStreamUpdated(i, str);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLocalVideoStats(final LocalVideoStats localVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b22c5ec", new Object[]{this, localVideoStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onLocalVideoStats(localVideoStats);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onLocalVideoStats(localVideoStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onMuteRemoteAudio(final boolean z, final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f99e15", new Object[]{this, new Boolean(z), arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.68
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onMuteRemoteAudio(z, arrayList);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRemoteSpeakingStreams(final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onRemoteSpeakingStreams(arrayList);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onRemoteVideoStats(final RemoteVideoStats remoteVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a816a4", new Object[]{this, remoteVideoStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.23
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onRemoteVideoStats(remoteVideoStats);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onRemoteVideoStats(remoteVideoStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onRtcStats(final ArtcStats artcStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bb70af", new Object[]{this, artcStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onRtcStats(artcStats);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onRtcStats(artcStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onTrtcLocalStats(final TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d167be", new Object[]{this, iVar});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                    ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onTrtcLocalStats(iVar);
                        return;
                    }
                    IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                    if (iArtcEngineEventHandler != null) {
                        iArtcEngineEventHandler.onTrtcLocalStats(iVar);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserJoinedChannelMutli(final ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35de6cca", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.59
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onUserJoinedChannelMutli(arrayList);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserLeftChannelMutli(final ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024304c", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.60
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                    if (artcEngineEventHandler != null) {
                        artcEngineEventHandler.onUserLeftChannelMutli(arrayList);
                    }
                }
            });
        }
    }

    public void setArtcEngineEventHandler(ArtcEngineEventHandler artcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eddb627", new Object[]{this, artcEngineEventHandler});
        } else {
            this.mArtcEngineEventHandler = artcEngineEventHandler;
        }
    }

    public void setIArtcEngineEventHandler(IArtcEngineEventHandler iArtcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f58d7", new Object[]{this, iArtcEngineEventHandler});
        } else {
            this.mIArtcEngineEventHandler = iArtcEngineEventHandler;
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswer2(final String str, final String str2, final int i, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4772627", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnswer ... ", new Object[0]);
        oc1.a("onAnswer, channelId: " + str + ", callId: " + str2 + ", answer: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.35
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onAnswer2(str, str2, i, str3, str4);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onAnswer(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAttendeesInChannel(final String str, final ArtcAttendee[] artcAttendeeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a824a4", new Object[]{this, str, artcAttendeeArr});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAttendeesInChannel, " + str, new Object[0]);
        oc1.a("onAttendeesInChannel, " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.57
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onAttendeesInChannel(str, artcAttendeeArr);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioRouteChanged(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAudioRouteChanged, routing: " + AConstants.ArtcAudioRouteDevice.values()[i].name(), new Object[0]);
        oc1.a("onAudioRouteChanged, routing: " + AConstants.ArtcAudioRouteDevice.values()[i].name());
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onAudioRouteChanged(i);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onAudioRouteChanged(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceDisconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onBlueToothDeviceDisconnected", new Object[0]);
        oc1.a("onBlueToothDeviceDisconnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onBlueToothDeviceDisconnected();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onBlueToothDeviceDisconnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e1748b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onBlueToothDeviceconnected", new Object[0]);
        oc1.a("onBlueToothDeviceconnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onBlueToothDeviceconnected();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onBlueToothDeviceconnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCall2(final String str, final String str2, final String str3, final int i, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757ccfd", new Object[]{this, str, str2, str3, new Integer(i), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCall, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", result: " + i, new Object[0]);
        oc1.a("onCall, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", result:" + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCall2(str, str2, str3, i, str4, str5);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCall(str, str2, str3, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCallTimeout() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61a304b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCallTimeout", new Object[0]);
        oc1.a("onCallTimeout");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.38
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCallTimeout();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCallTimeout();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCallTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428f9fb6", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCallTimeoutMutli", new Object[0]);
        oc1.a("onCallTimeoutMutli");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.74
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCallTimeoutMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCalledMutli(final String str, final String str2, final int i, final String str3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78038ef", new Object[]{this, str, str2, new Integer(i), str3, new Boolean(z)});
            return;
        }
        String str4 = "onCalledMutli, callId: " + str + ", remoteUserId: " + str2 + ", remoteRole: " + i + ", extension: " + str3 + ", isMutliChatMode: " + z;
        ArtcLog.e("ArtcEngineEvent", str4, new Object[0]);
        oc1.a(str4);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.67
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCalledMutli(str, str2, i, str3, z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCameraSwitchDone(final boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCameraSwitchDone, isFrontCamera:" + z, new Object[0]);
        oc1.a("onCameraSwitchDone, isFrontCamera:" + z);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.41
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCameraSwitchDone(z);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCameraSwitchDone(z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCanceledCall2(final String str, final String str2, final int i, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bf1200", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCancelCall,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        oc1.a("onCancelCall,  channelId: " + str + ", remoteUserId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.37
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCanceledCall2(str, str2, i, str3, str4);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCancelCall(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCaptureFreezed(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0d0493", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCaptureFreezed, errorDescription: " + str + ",captureType: " + str2 + " ,isMultiCall: " + z, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCaptureFreezed(str, str2, z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelClosed2(final String str, final String str2, final int i, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4869c31a", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelClosed, channelId: " + str + ", reason: " + str2, new Object[0]);
        oc1.a("onChannelClosed, channelId: " + str + ", reason: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onChannelClosed2(str, str2, i, str3, str4);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onChannelClosed(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelIdUpdated(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf45eed", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelIdUpdated, channel_id:" + str, new Object[0]);
        oc1.a("onChannelIdUpdated, channel_id:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.42
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onChannelIdUpdated(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelMsgBroadcastNotify(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelMsgBroadcastNotify, channelId: " + str + " ,extension: " + str2 + " ,message: " + str3 + " ,promoterUserId: " + str4, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onChannelMsgBroadcastNotify(str, str2, str3, str4);
                }
            }
        });
    }

    public void onChannelMsgBroadcastRsp(final String str, final int i, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d7bba5", new Object[]{this, str, new Integer(i), str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelMsgBroadcastRsp, channelId: " + str + " ,resultCode: " + i + " ,resultMessage: " + str2 + " ,message: " + str3 + " ,extension: " + str4, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onChannelMsgBroadcast(str, i, str2, str3, str4);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9132b3f3", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionConnected", new Object[0]);
        oc1.a("onConnectionConnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onConnectionConnected();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onConnectionConnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d8fdec", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionInterrupted", new Object[0]);
        oc1.a("onConnectionInterrupted");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onConnectionInterrupted();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onConnectionInterrupted();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionLost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd46eee8", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionLost", new Object[0]);
        oc1.a("onConnectionLost");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onConnectionLost();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onConnectionLost();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCreateBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39526b15", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCreateBackgroundView", new Object[0]);
        oc1.a("onCreateBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.45
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCreateBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCreateChannelSuccess(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bbc66c", new Object[]{this, str});
            return;
        }
        oc1.a("onCreateChannelSuccess, channelId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onCreateChannelSuccess, channelId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCreateChannelSuccess(str);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCreateChannelSuccess(str);
                }
            }
        });
    }

    public void onFirstLocalVideoFrame(final int i, final int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75129810", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        oc1.a("onFirstLocalVideoFrame, width: " + i + ", height: " + i2 + ", elapsed:" + i3);
        ArtcLog.e("ArtcEngineEvent", "onFirstLocalVideoFrame, width: " + i + ", height: " + i2 + ", elapsed:" + i3, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstLocalVideoFrame(i, i2);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onFirstLocalVideoFrame(i, i2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteAudioFrameMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d3d4ec", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteAudioFrameMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.62
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteAudioFrameMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteAudioFrameTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddd80e7", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteAudioFrameTimeoutMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.64
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteAudioFrameTimeoutMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteMediaReported(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c47cf1", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteMediaReported, " + str, new Object[0]);
        oc1.a("onFirstRemoteMediaReported, " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.56
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteMediaReported(str);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrame(final int i, final int i2, final String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01d9749", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3)});
            return;
        }
        oc1.a("onFirstRemoteVideoFrame, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrame, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteVideoFrame(i, i2, str);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onFirstRemoteVideoFrame(i, i2, str);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrameMutli(final int i, final int i2, final String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ed4cf2", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3)});
            return;
        }
        oc1.a("onFirstRemoteVideoFrameMutli, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrameMutli, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.61
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteVideoFrameMutli(i, i2, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteVideoFrameTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b048a2", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrameTimeoutMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.63
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onFirstRemoteVideoFrameTimeoutMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onHideBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7458959b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onHideBackgroundView", new Object[0]);
        oc1.a("onHideBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.47
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onHideBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onInvited2(final String str, final String str2, final int i, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11666906", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onInvited, channelId: " + str + ", userId: " + str2 + ", isVideoCall: " + i, new Object[0]);
        oc1.a("onInvited, channelId: " + str + ", userId: " + str2 + ", isVideoCall: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.33
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onInvited2(str, str2, i, str3, str4);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onInvited(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onJoinCallMutli(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800f8304", new Object[]{this, new Integer(i), str});
            return;
        }
        oc1.a("onJoinCallMutli, resultCode: " + i + ", resultMsg: " + str);
        ArtcLog.e("ArtcEngineEvent", "onJoinCallMutli, resultCode: " + i + ", resultMsg: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.58
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onJoinCallMutli(i, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onJoinChannelSuccess(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7642c373", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onJoinChannelSuccess, elapsed: " + i, new Object[0]);
        oc1.a("onJoinChannelSuccess, elapsed: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onJoinChannelSuccess(i);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onJoinChannelSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onKicked2(final String str, final String str2, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb91d13d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onKicked,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        oc1.a("onKicked, channelId: " + str + ", remoteUserId:" + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.36
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onKicked2(str, str2, str3, str4);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onKicked(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLeaveChannel2(final ArtcStats artcStats, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac388f9", new Object[]{this, artcStats, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLeaveChannel ... ", new Object[0]);
        oc1.a("onLeaveChannel ... ");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onLeaveChannel2(artcStats, str, str2);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onLeaveChannel(artcStats);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLeaveChannelSuccess(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e176aa4", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLeaveChannelSuccess, duration: " + i, new Object[0]);
        oc1.a("onLeaveChannelSuccess, duration: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.52
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onLeaveChannelSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLiveChannelIdUpdate(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLiveChannelIdUpdate, channelId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onLiveChannelIdUpdate(str);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onLiveChannelIdUpdate(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLocalSpeakingStatus(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLocalSpeakingStatus, enable: " + z, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onLocalSpeakingStatus(z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onMessage(final String str, final String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49fb43", new Object[]{this, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onMessage,  msg len: " + str.length() + ", remoteUserId: " + str2, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.73
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onMessage(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRecordFromFileEos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810a14ba", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onRecordFromFileEos", new Object[0]);
        oc1.a("onRecordFromFileEos");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.55
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onRecordFromFileEos();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRinging(final String str, final String str2, final String str3, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a374c", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onPstnRinging, channelId: " + str + ", callId: " + str2 + ", userId: " + str2 + ", deviceId: " + str4, new Object[0]);
        oc1.a("onPstnRinging, channelId: " + str + ", callId: " + str2 + ", userId: " + str2 + ", deviceId: " + str4);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.48
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onRinging(str, str2, str3, str4, str5);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onShowBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996dba96", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onShowBackgroundView", new Object[0]);
        oc1.a("onShowBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.46
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onShowBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onSignalChannelAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b87294", new Object[]{this});
            return;
        }
        oc1.a("onSignalChannelAvailable");
        ArtcLog.e("ArtcEngineEvent", "onSignalChannelAvailable", new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onSignalChannelAvailable();
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onSignalChannelAvailable();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onSwitchMedia(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bed087", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "OnUserSwitchMedia, channelId: " + str + ", userId: " + str2, new Object[0]);
        oc1.a("onUserSwitchMedia, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.51
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onSwitchMedia(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUnInitializeSuccess(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27827e1", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUnInitializeSuccess, duration: " + i, new Object[0]);
        oc1.a("onUnInitializeSuccess, duration: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.53
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUnInitializeSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserDisconnected(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b17d4", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserDisconnected,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        oc1.a("onUserDisconnected,  channelId: " + str + ", remoteUserId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.54
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserDisconnected(str, str2, str3, str4);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserJoinedChannel2(final ArtcAttendee artcAttendee, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ee321", new Object[]{this, artcAttendee, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserJoinedChannel， remoteUserId： " + artcAttendee.uid, new Object[0]);
        oc1.a("onUserJoinedChannel, remoteUserId: " + artcAttendee.uid);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserJoinedChannel2(artcAttendee, str, str2);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onUserJoinedChannel(artcAttendee.uid);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserLeftChannel2(final String str, final int i, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51607e86", new Object[]{this, str, new Integer(i), str2, str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserLeftChannel, remoteUserId: " + str + ", reason: " + i, new Object[0]);
        oc1.a("onUserLeftChannel, remoteUserId: " + str + ", reason: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserLeftChannel2(str, i, str2, str3);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onUserLeftChannel(str, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserMutedLocal(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5bd200", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserMutedLocal, channelId: " + str + ", userId: " + str2, new Object[0]);
        oc1.a("onUserMutedLocal, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.49
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserMutedLocal(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserOffline(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435be239", new Object[]{this, str, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserOffline, remoteUserId: " + str, new Object[0]);
        oc1.a("onUserOffline, remoteUserId: " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserOffline(str, i);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onUserOffline(str, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserSwitchedMedia(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6930307d", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserSwitchedMedia, channelId: " + str + ", userId: " + str2, new Object[0]);
        oc1.a("onUserSwitchedMedia, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.50
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserSwitchedMedia(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserPublishVideo(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b95a27", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserPublishVideo, info:", str);
        oc1.a("onUserPublishVideo, info:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.43
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserPublishVideo(str);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onUserPublishVideo(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserUnpublishVideo(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08c3000", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserUnpublishVideo, uid:", str);
        oc1.a("onUserUnpublishVideo, uid:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.44
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onUserUnpublishVideo(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(final AConstants.ArtcErrorEventNew artcErrorEventNew, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42116f7", new Object[]{this, artcErrorEventNew, new Integer(i), str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onError, errorEventNew: " + artcErrorEventNew.name() + ", errorCode: " + i + ", errorMsg: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onError(artcErrorEventNew, i, str);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onError(artcErrorEventNew, i, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswered2(final String str, final String str2, final String str3, final int i, final int i2, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6598af", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnswered,  role: " + i + ", answer: " + i2, new Object[0]);
        oc1.a("onAnswered, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", role: " + i + ", answer:" + i2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.34
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onAnswered2(str, str2, str3, i, i2, str4, str5);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onAnswered(str, str2, str3, i, i2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnsweredMutli(final String str, final int i, final int i2, final String str2, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa2cd6", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnsweredMutli,  remoteUserId: " + str + ", role: " + i + ", answer: " + i2 + ", extension: " + str2 + ", isMutliChatMode: " + z + ", chatChannelId: " + str3, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.70
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventHandler artcEngineEventHandler = ArtcEngineEventProxy.this.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onAnsweredMutli(str, i, i2, str2, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCalled2(final String str, final String str2, final String str3, final int i, final int i2, final int i3, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e135e0bc", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCalled, channelId: " + str + ", userId: " + str3 + ", isVideoCall: " + i2 + ", videoProfile: " + i3 + ", role: " + i, new Object[0]);
        oc1.a("onCalled, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", role: " + i + ", isVideoCall:" + i2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArtcEngineEventProxy artcEngineEventProxy = ArtcEngineEventProxy.this;
                ArtcEngineEventHandler artcEngineEventHandler = artcEngineEventProxy.mArtcEngineEventHandler;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCalled2(str, str2, str3, i, i2, i3, str4, str5);
                    return;
                }
                IArtcEngineEventHandler iArtcEngineEventHandler = artcEngineEventProxy.mIArtcEngineEventHandler;
                if (iArtcEngineEventHandler != null) {
                    iArtcEngineEventHandler.onCalled(str, str2, str3, i, i2, i3);
                }
            }
        });
    }
}
