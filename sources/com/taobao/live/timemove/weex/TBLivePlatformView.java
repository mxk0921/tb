package com.taobao.live.timemove.weex;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashSet;
import tb.ehd;
import tb.l6s;
import tb.t2o;
import tb.t7d;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLivePlatformView extends WeexPlatformView implements t7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ehd mRealNdView;

    static {
        t2o.a(779092244);
        t2o.a(779092238);
    }

    public TBLivePlatformView(Context context, int i) {
        super(context, i);
        l6s.a("TBLivePlatformViewApi", "TBLivePlatformView " + this);
        this.mRealNdView = new a(context, i, this);
    }

    public static /* synthetic */ Object ipc$super(TBLivePlatformView tBLivePlatformView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -12003312) {
            super.onCreated();
            return null;
        } else if (hashCode == 1056639943) {
            super.onDispose();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/timemove/weex/TBLivePlatformView");
        }
    }

    @Override // tb.t7d
    public void callPareFireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9f35d3", new Object[]{this, str});
        } else {
            fireEvent(str);
        }
    }

    @JSMethod
    public String getMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c97ea64", new Object[]{this});
        }
        return ((a) this.mRealNdView).j();
    }

    @JSGetter(name = yj4.PARAM_PLAY_VIEW_TOKEN)
    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        l6s.a("TBLivePlatformViewApi", "getPlayerToken " + this);
        return ((a) this.mRealNdView).k();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        l6s.a("TBLivePlatformViewApi", "getView");
        return ((a) this.mRealNdView).l();
    }

    @JSGetter(name = yj4.PARAM_IGNORE_PV)
    public String ignorePV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5c65aa1", new Object[]{this});
        }
        l6s.a("TBLivePlatformViewApi", "ignorePV ");
        return ((a) this.mRealNdView).m();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        super.onCreated();
        l6s.a("TBLivePlatformViewApi", "onCreated:" + this);
        ((a) this.mRealNdView).o();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        l6s.a("TBLivePlatformViewApi", "onDispose: " + this);
        ((a) this.mRealNdView).p();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "onUpdateEvents " + hashSet + this);
        ((a) this.mRealNdView).q(hashSet);
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "play mLiveId:" + this);
        ((a) this.mRealNdView).r();
    }

    @JSMethod
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "resume mLiveId:" + this);
        ((a) this.mRealNdView).t();
    }

    @JSMethod
    public void reusePlayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d5cb46", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "reusePlayer:" + str);
        ((a) this.mRealNdView).v(str);
    }

    @WXComponentProp(name = "height")
    public void setHeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde360e", new Object[]{this, new Double(d)});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setWidth " + this);
        ((a) this.mRealNdView).x(d);
    }

    @WXComponentProp(name = "liveDataSources")
    public void setMediaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec12f01", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setMediaInfo: " + str);
        ((a) this.mRealNdView).y(str);
    }

    @WXComponentProp(name = "muted")
    public void setMute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa9c5ec", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "WXComponentProp setMuted: " + str);
        ((a) this.mRealNdView).z(str);
    }

    @JSMethod
    public void setMuted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33df7fa", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "JSMethod setMuted: " + str);
        ((a) this.mRealNdView).A(str);
    }

    @WXComponentProp(name = "needPM")
    public void setNeedPM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36fe8e6", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setNeedPM " + str + this);
        ((a) this.mRealNdView).B(str);
    }

    @WXComponentProp(name = yj4.PARAM_PM_PARAMS)
    public void setPMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9558116", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setPMParams");
        ((a) this.mRealNdView).C(str);
    }

    @JSMethod
    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "JSMethod setPageId: " + obj);
        ((a) this.mRealNdView).D(obj);
    }

    @WXComponentProp(name = "poster")
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setPoster " + str + this);
        ((a) this.mRealNdView).E(str);
    }

    @WXComponentProp(name = "width")
    public void setWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f093", new Object[]{this, new Double(d)});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "setWidth " + this);
        ((a) this.mRealNdView).F(d);
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "stop mLiveId:" + this);
        ((a) this.mRealNdView).G();
    }

    @JSMethod
    public void subscribePM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92621818", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "subscribePM:" + str);
        ((a) this.mRealNdView).H(str);
    }

    @JSMethod
    public void unsubscribePM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d718009f", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "unsubscribePM:" + str);
        ((a) this.mRealNdView).J(str);
    }

    @JSMethod
    public void unsubscribePMAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7257d3a", new Object[]{this});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "unsubscribeAll");
        ((a) this.mRealNdView).K();
    }

    @JSMethod
    public void updatePMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b8f3d", new Object[]{this, str});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "updatePMParams");
        ((a) this.mRealNdView).L(str);
    }

    @JSMethod
    public void visibilityChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c4b75d", new Object[]{this, str, str2});
            return;
        }
        l6s.a("TBLivePlatformViewApi", "visibilityChanged from weex " + str);
        ((a) this.mRealNdView).M(str, str2);
    }

    @Override // tb.t7d
    public void callPareFireEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ce76ef", new Object[]{this, str, obj});
        } else {
            fireEvent(str, obj);
        }
    }
}
