package com.tmall.wireless.mirrorlife.base.bridge;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import java.lang.ref.WeakReference;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WeexACCS extends TBACCS {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1037041679);
    }

    public static /* synthetic */ Object ipc$super(WeexACCS weexACCS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/wireless/mirrorlife/base/bridge/WeexACCS");
    }

    @Override // com.taobao.accs.windvane.TBACCS, android.taobao.windvane.extra.jsbridge.WVACCS, tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mContext = context;
        this.mWebView = iWVWebView;
        TBACCS.mWeb = new WeakReference<>(iWVWebView);
        lqw.d().b(new a(this.mWebView));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<IWVWebView> f14226a;

        static {
            t2o.a(1037041680);
            t2o.a(989856388);
        }

        public a(IWVWebView iWVWebView) {
            this.f14226a = new WeakReference<>(iWVWebView);
        }

        public void a(IWVWebView iWVWebView, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b044543", new Object[]{this, iWVWebView, str, str2});
            }
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            IWVWebView iWVWebView = this.f14226a.get();
            if (iWVWebView == null) {
                return null;
            }
            switch (i) {
                case 5001:
                    String str = (String) objArr[0];
                    String str2 = new String((byte[]) objArr[1]);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("serviceId", (Object) str);
                        jSONObject.put("resultData", (Object) str2);
                        a(iWVWebView, "Weex.Event.ACCS.OnData", jSONObject.toString());
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
                case 5002:
                    a(iWVWebView, "Weex.Event.ACCS.OnConnected", "{}");
                    break;
                case 5003:
                    a(iWVWebView, "Weex.Event.ACCS.OnDisConnected", "{}");
                    break;
            }
            return null;
        }
    }
}
