package tb;

import android.os.Handler;
import android.os.Message;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eby implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lby f18465a;

    public eby(lby lbyVar) {
        this.f18465a = lbyVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null || message.what != 1001) {
            return false;
        }
        this.f18465a.b(8002003);
        return true;
    }
}
