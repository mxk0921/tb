package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.NlsSpeechTokenBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p3k extends g5p<NlsSpeechTokenBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(p3k p3kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/speech/util/NlsSpeechTokenConverter");
    }

    /* renamed from: d */
    public NlsSpeechTokenBean b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsSpeechTokenBean) ipChange.ipc$dispatch("3fc5714d", new Object[]{this, jSONObject, v5pVar});
        }
        NlsSpeechTokenBean e = c();
        if (jSONObject == null) {
            return e;
        }
        try {
            Object parseObject = JSON.parseObject(jSONObject.toString(), NlsSpeechTokenBean.class);
            ckf.c(parseObject, "JSON.parseObject(it.toSt…echTokenBean::class.java)");
            return (NlsSpeechTokenBean) parseObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return e;
        }
    }

    /* renamed from: e */
    public NlsSpeechTokenBean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsSpeechTokenBean) ipChange.ipc$dispatch("bf3912ce", new Object[]{this});
        }
        return new NlsSpeechTokenBean();
    }
}
