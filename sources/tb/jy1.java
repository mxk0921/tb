package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class jy1 implements t0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECOGNIZRESULT = "TBNlsVoiceRecognizer.Event.onRecognizingResult";
    public static final String RECORD_AUDIO_TAG = "TBNlsVoiceRecognizer";

    /* renamed from: a  reason: collision with root package name */
    public boolean f22277a = false;
    public WVCallBackContext b;

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        WVCallBackContext wVCallBackContext = this.b;
        if (wVCallBackContext != null) {
            wVCallBackContext.fireEvent(str, str2);
            this.b.fireEvent(str.replace("TBNlsVoiceRecognizer.", "TBSearchVoice."), str2);
        }
    }

    public void c(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd7b54", new Object[]{this, wVCallBackContext});
        } else {
            this.b = wVCallBackContext;
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b24d6ec", new Object[]{this, new Integer(i)});
        } else if (this.f22277a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("success", false);
                jSONObject.put("errorCode", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            b(RECOGNIZRESULT, jSONObject.toString());
            new StringBuilder("onRecognizingResult: error").append(i);
        }
    }

    public void d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5236bb63", new Object[]{this, new Integer(i), str});
            return;
        }
        if (i == 0) {
            i = 1;
        }
        new StringBuilder("状态：").append(i);
        new StringBuilder("语音识别结果：").append(str);
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("result", str != null ? str : "");
        if (!TextUtils.isEmpty(str)) {
            try {
                hashMap.put("asr", JSON.parseObject(str).getString("result"));
            } catch (Throwable unused) {
            }
        }
        b(RECOGNIZRESULT, JSON.toJSONString(hashMap));
    }
}
