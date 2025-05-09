package com.taobao.tbliveinteractive.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.tbliveinteractive.business.tradetrack.MtopContentlivekitComponentTradeTrackResponse;
import java.util.HashMap;
import tb.b0d;
import tb.bdu;
import tb.d9m;
import tb.fxf;
import tb.jnr;
import tb.kpw;
import tb.phf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveTradeTrack extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f13382a;

        public a(TaoLiveTradeTrack taoLiveTradeTrack, jnr jnrVar) {
            this.f13382a = jnrVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.f13382a.b();
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof MtopContentlivekitComponentTradeTrackResponse) {
                this.f13382a.h(((MtopContentlivekitComponentTradeTrackResponse) netBaseOutDo).getData());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.f13382a.b();
            }
        }
    }

    static {
        t2o.a(806356591);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveTradeTrack taoLiveTradeTrack, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveinteractive/jsbridge/TaoLiveTradeTrack");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        jnr jnrVar = new jnr(str, str2, wVCallBackContext);
        str.hashCode();
        if (str.equals("requestTradeTrack")) {
            HashMap hashMap = (HashMap) fxf.b(str2);
            if (hashMap != null && phf.d()) {
                String str3 = (String) hashMap.get("liveId");
                String str4 = (String) hashMap.get("itemId");
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    new bdu(new a(this, jnrVar)).K(str3, str4, (String) hashMap.get("spmUrl"), (String) hashMap.get("entrySpm"), (String) hashMap.get("liveSource"), (String) hashMap.get("entryLiveSource"), (String) hashMap.get("sign"));
                    return true;
                }
            }
            jnrVar.b();
            return false;
        } else if (str.equals("getTradeSign")) {
            return d9m.p().getTradeSign(this.mWebView, jnrVar);
        } else {
            jnrVar.b();
            return false;
        }
    }
}
