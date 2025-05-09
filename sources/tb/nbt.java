package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.uc.webview.export.WebView;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nbt extends df implements q3d, TBLOpenPlatformView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = nbt.class.getSimpleName();
    public final TBLOpenPlatformView f;
    public final String g;
    public final IWVWebView h;
    public String i;

    static {
        t2o.a(779093059);
        t2o.a(806355743);
        t2o.a(779093468);
    }

    public nbt(Context context, Object obj) {
        d0("init");
        X(this);
        TBLOpenPlatformView tBLOpenPlatformView = new TBLOpenPlatformView(context);
        this.f = tBLOpenPlatformView;
        tBLOpenPlatformView.setOpenPlatformViewEvent(this);
        tBLOpenPlatformView.setEnableCoverFade(true);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.get("id") instanceof String) {
                this.g = (String) map.get("id");
            }
            if (map.get("webView") instanceof WebView) {
                this.h = (IWVWebView) map.get("webView");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(nbt nbtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/openh5/impl/TaoliveOpenH5PlatformViewImpl");
    }

    @Override // tb.q3d
    public void A(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54481957", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            try {
                if (obj instanceof Map) {
                    String valueOf = String.valueOf(((Map) obj).get("params"));
                    this.i = valueOf;
                    if (!TextUtils.isEmpty(valueOf)) {
                        JSONObject d = fkx.d(this.i);
                        TBLOpenPlatformView tBLOpenPlatformView = this.f;
                        if (tBLOpenPlatformView != null) {
                            tBLOpenPlatformView.setData(d);
                        }
                    }
                    d0("setConfiguration mOriginParams = " + this.i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            c0.success();
        }
    }

    @Override // tb.q3d
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae27c01", new Object[]{this, obj});
            return;
        }
        d0("onDetachedFromWebView");
        TBLOpenPlatformView tBLOpenPlatformView = this.f;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
        }
    }

    @Override // tb.q3d
    public void C(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3d3b25", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            d0("stop");
            TBLOpenPlatformView tBLOpenPlatformView = this.f;
            if (tBLOpenPlatformView != null) {
                tBLOpenPlatformView.stopVideo();
            }
            c0.success();
        }
    }

    @Override // tb.q3d
    public void F(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e6b151", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            if (this.f != null) {
                nsw nswVar = new nsw();
                nswVar.b("playerSession", this.f.getPlayerSession());
                nswVar.b(yj4.PARAM_PLAYER_TOKEN, this.f.getPlayerToken());
                c0.success(nswVar);
                return;
            }
            c0.error();
        }
    }

    @Override // tb.q3d
    public void G(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a3044", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            if (this.f != null) {
                nsw nswVar = new nsw();
                nswVar.b("result", String.valueOf(this.f.isMuted()));
                c0.success(nswVar);
                return;
            }
            c0.error();
        }
    }

    @Override // tb.q3d
    public void I(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8996c6b1", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            d0("unsubscribePM");
            this.f.stopSubscribePM();
            c0.success();
        }
    }

    @Override // tb.q3d
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256b668f", new Object[]{this, obj});
        } else {
            d0("onResume");
        }
    }

    @Override // tb.q3d
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd4d0ba", new Object[]{this, obj});
        } else {
            d0("onPause");
        }
    }

    @Override // tb.q3d
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b00b7e", new Object[]{this, obj});
            return;
        }
        d0("onDestroy");
        TBLOpenPlatformView tBLOpenPlatformView = this.f;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
        }
    }

    public final WVCallBackContext c0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("4688135", new Object[]{this, obj});
        }
        try {
            if (obj instanceof Map) {
                return (WVCallBackContext) ((Map) obj).get("callback");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        TLog.loge(str2, hashCode() + " " + str);
    }

    public final void e0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80397869", new Object[]{this, str, str2, str3});
            return;
        }
        d0("notifyH5Event type = " + str + " eventCode = " + str2 + " extra = " + str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("code", (Object) str2);
        jSONObject.put("extra", (Object) str3);
        IWVWebView iWVWebView = this.h;
        if (iWVWebView != null) {
            WVStandardEventCenter.postNotificationToJS(iWVWebView, "TLOVideoPlayer_event_" + this.g, jSONObject.toString());
        }
    }

    @Override // tb.q3d
    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bcbe0c", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            if (obj instanceof Map) {
                String valueOf = String.valueOf(((Map) obj).get("params"));
                TBLOpenPlatformView tBLOpenPlatformView = this.f;
                if (tBLOpenPlatformView != null) {
                    tBLOpenPlatformView.setMuted(arq.c(valueOf));
                }
                d0("setMuted mute = ".concat(valueOf));
            }
            c0.success();
        }
    }

    @Override // tb.q3d
    public void l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616c421e", new Object[]{this, obj});
        } else {
            d0("onAttachedToWebView");
        }
    }

    @Override // tb.q3d
    public void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d370df86", new Object[]{this, obj});
            return;
        }
        d0("onVisibilityChanged: " + obj.toString());
    }

    @Override // tb.q3d
    public void n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad76cd7", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            d0("play");
            TBLOpenPlatformView tBLOpenPlatformView = this.f;
            if (tBLOpenPlatformView != null) {
                tBLOpenPlatformView.playVideo();
            }
            c0.success();
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView.a
    public void onEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44d8360", new Object[]{this, str, str2, str3});
        } else {
            e0(str, str2, str3);
        }
    }

    @Override // tb.q3d
    public void q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c468c1e3", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            try {
                new nsw().h(new org.json.JSONObject(this.i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            c0.success();
        }
    }

    @Override // tb.q3d
    public void w(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3459b910", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            c0.success();
        }
    }

    @Override // tb.q3d
    public void p(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e0de2a", new Object[]{this, obj});
            return;
        }
        WVCallBackContext c0 = c0(obj);
        if (c0 != null) {
            d0("subscribePM");
            this.f.startSubscribePM("h5Card", true);
            c0.success();
        }
    }
}
