package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.NlsSpeechTokenBean;
import com.taobao.speech.util.NlsSpeechTokenResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class u3k implements hk4<NlsSpeechTokenBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w3k f29120a;

    public u3k(w3k w3kVar) {
        this.f29120a = w3kVar;
    }

    /* renamed from: a */
    public void accept(NlsSpeechTokenBean nlsSpeechTokenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7783e0d", new Object[]{this, nlsSpeechTokenBean});
            return;
        }
        ckf.h(nlsSpeechTokenBean, "nlsSpeechTokenBean");
        if (nlsSpeechTokenBean.getResult().isEmpty()) {
            w3k.g(this.f29120a).set(false);
            this.f29120a.a(0);
            return;
        }
        NlsSpeechTokenResult nlsSpeechTokenResult = nlsSpeechTokenBean.getResult().get(0);
        w3k.f(this.f29120a, nlsSpeechTokenResult.getToken());
        v4p.h("nls_speech_token_v2", JSON.toJSONString(nlsSpeechTokenResult));
    }
}
