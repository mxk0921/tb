package com.taobao.android.live.plugin.proxy.alphavideo;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.AlphaVideoProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.room.adapter.alphavideo.a;
import tb.hyb;
import tb.k2n;
import tb.r9d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AlphaVideoProxy extends k2n<IAlphaVideoProxy> implements IAlphaVideoProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AlphaVideoProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AlphaVideoProxy f8740a = new AlphaVideoProxy();

        static {
            t2o.a(806355118);
        }

        public static /* synthetic */ AlphaVideoProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlphaVideoProxy) ipChange.ipc$dispatch("5e39863d", new Object[0]);
            }
            return f8740a;
        }
    }

    static {
        t2o.a(806355116);
        t2o.a(806355119);
    }

    public static AlphaVideoProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaVideoProxy) ipChange.ipc$dispatch("b05cc97", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(AlphaVideoProxy alphaVideoProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/alphavideo/AlphaVideoProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public hyb createDataSource() {
        hyb hybVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyb) ipChange.ipc$dispatch("70b6bac1", new Object[]{this});
        }
        IAlphaVideoProxy real = getReal();
        if (real != null) {
            hybVar = real.createDataSource();
        } else {
            hybVar = null;
        }
        FlexaLiveX.w("[AlphaVideoProxy#createDataSource]  value: " + hybVar);
        return hybVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public r9d createGLTextureViewPlayerController(Context context, LifecycleOwner lifecycleOwner, a.b bVar) {
        r9d r9dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9d) ipChange.ipc$dispatch("8b47181f", new Object[]{this, context, lifecycleOwner, bVar});
        }
        IAlphaVideoProxy real = getReal();
        if (real != null) {
            r9dVar = real.createGLTextureViewPlayerController(context, lifecycleOwner, bVar);
        } else {
            r9dVar = null;
        }
        FlexaLiveX.w("[AlphaVideoProxy#createGLTextureViewPlayerController]  value: " + r9dVar);
        return r9dVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IAlphaVideoProxy real = getReal();
        if (real != null) {
            cls = real.getFrameClassMap(str);
        } else {
            cls = null;
        }
        FlexaLiveX.w("[AlphaVideoProxy#getFrameClassMap]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IAlphaVideoProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.AlphaVideoProxyX";
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
        return "AlphaVideo";
    }

    private AlphaVideoProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[AlphaVideoProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IAlphaVideoProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IAlphaVideoProxy) ipChange.ipc$dispatch("9017d5da", new Object[]{this})) : new AlphaVideoProxyX();
    }
}
