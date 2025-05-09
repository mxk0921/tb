package com.taobao.android.live.plugin.proxy.voiceroom;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.VoiceRoomProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VoiceRoomProxy extends k2n<IVoiceRoomProxy> implements IVoiceRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VoiceRoomProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final VoiceRoomProxy f8775a = new VoiceRoomProxy();

        static {
            t2o.a(806355307);
        }

        public static /* synthetic */ VoiceRoomProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VoiceRoomProxy) ipChange.ipc$dispatch("247d92b9", new Object[0]);
            }
            return f8775a;
        }
    }

    static {
        t2o.a(806355305);
        t2o.a(806355304);
    }

    public static VoiceRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VoiceRoomProxy) ipChange.ipc$dispatch("d87ba793", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(VoiceRoomProxy voiceRoomProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/voiceroom/VoiceRoomProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IVoiceRoomProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.VoiceRoomProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "多人语音房连麦";
    }

    @Override // com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy
    public BaseFrame getVoiceRoomFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("3adec0cd", new Object[]{this, context, ux9Var});
        }
        IVoiceRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.getVoiceRoomFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[VoiceRoomProxy#getPkLinkFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy
    public Class<? extends BaseFrame> getVoiceRoomFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2dc2016", new Object[]{this});
        }
        IVoiceRoomProxy real = getReal();
        if (real != null) {
            cls = real.getVoiceRoomFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[VoiceRoomProxy#getVoiceRoomFrameClass]  clazz: " + cls);
        return cls;
    }

    private VoiceRoomProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[VoiceRoomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IVoiceRoomProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IVoiceRoomProxy) ipChange.ipc$dispatch("3cc760c", new Object[]{this})) : new VoiceRoomProxyX();
    }
}
