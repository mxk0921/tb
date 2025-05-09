package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class v3k extends u0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ w3k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3k(w3k w3kVar, String str) {
        super(str);
        this.b = w3kVar;
    }

    public static /* synthetic */ Object ipc$super(v3k v3kVar, String str, Object... objArr) {
        if (str.hashCode() == 1569381830) {
            super.accept((Throwable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/speech/util/NlsWvClientImplV2$requestNlsSpeechToken$2");
    }

    @Override // tb.u0p
    /* renamed from: a */
    public void accept(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            return;
        }
        super.accept(th);
        w3k.g(this.b).set(false);
        w3k.h(this.b, "Rx request Error", 0);
    }
}
