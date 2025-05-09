package com.taobao.speech.jsbridgeStatic;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.runtimepermission.a;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.hpv;
import tb.jy1;
import tb.kpw;
import tb.t0d;
import tb.t4p;
import tb.w3k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBNlsVoiceRecognizer extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUDIO_PERMISSION = "android.permission.RECORD_AUDIO";
    private static String TAG = "TBNlsVoiceRecognizer";
    private t0d nlsWVClient = new w3k();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11789a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f11789a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f11789a;
            if (wVCallBackContext != null) {
                TBNlsVoiceRecognizer.access$000(TBNlsVoiceRecognizer.this, wVCallBackContext, false, "Permission Fail");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11790a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f11790a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f11790a;
            if (wVCallBackContext != null) {
                TBNlsVoiceRecognizer.access$000(TBNlsVoiceRecognizer.this, wVCallBackContext, true, "Permission Success");
            }
        }
    }

    public static /* synthetic */ void access$000(TBNlsVoiceRecognizer tBNlsVoiceRecognizer, WVCallBackContext wVCallBackContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0b4afb", new Object[]{tBNlsVoiceRecognizer, wVCallBackContext, new Boolean(z), str});
        } else {
            tBNlsVoiceRecognizer.sendResult(wVCallBackContext, z, str);
        }
    }

    public static /* synthetic */ Object ipc$super(TBNlsVoiceRecognizer tBNlsVoiceRecognizer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/speech/jsbridgeStatic/TBNlsVoiceRecognizer");
    }

    private void jsCheckAudioPermission(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc053ad4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a.C0649a z = com.taobao.runtimepermission.a.c(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).A(new b(wVCallBackContext)).z(new a(wVCallBackContext));
        if (!TextUtils.isEmpty(str)) {
            z.w(str);
        }
        z.m();
    }

    private void sendResult(WVCallBackContext wVCallBackContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14007f5", new Object[]{this, wVCallBackContext, new Boolean(z), str});
        } else if (wVCallBackContext != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (z) {
                    jSONObject.put("status", "1");
                } else {
                    jSONObject.put("status", PreRequestPresenter.SOURCE_RATE_HISTORY);
                }
                jSONObject.put("message", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            wVCallBackContext.fireEvent("TBNlsVoiceRecognizer.Event.onVoicePermission", JSON.toJSONString(jSONObject));
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            ((w3k) this.nlsWVClient).k();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        hpv.a(wVCallBackContext, "TBNlsVoiceRecognizerUsage");
        if (!t4p.a(this.mContext, "android.permission.RECORD_AUDIO")) {
            jsCheckAudioPermission("", null);
        }
        ((jy1) this.nlsWVClient).e(this.mContext);
        try {
            if ("startVoiceRecognition".equals(str)) {
                ((w3k) this.nlsWVClient).c(wVCallBackContext);
                if (((w3k) this.nlsWVClient).s(str2)) {
                    wVCallBackContext.success();
                } else {
                    wVCallBackContext.error();
                }
                return true;
            } else if ("stopVoiceRecognition".equals(str)) {
                ((w3k) this.nlsWVClient).t();
                return true;
            } else if ("cancelVoiceRecognition".equals(str)) {
                ((w3k) this.nlsWVClient).i();
                return true;
            } else if (!"getVoicePermission".equals(str)) {
                return false;
            } else {
                jsCheckAudioPermission(((JSONObject) new JSONTokener(str2).nextValue()).optString("tip", ""), wVCallBackContext);
                return true;
            }
        } catch (Throwable unused) {
            wVCallBackContext.error();
            return true;
        }
    }
}
