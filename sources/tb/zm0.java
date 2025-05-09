package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.handler.popupWindow.stream")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zm0 extends ys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public io0 c;

    static {
        t2o.a(301990016);
    }

    public static /* synthetic */ Object ipc$super(zm0 zm0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/popupwindow/AliBuyLinkageEventHandlerExtension");
    }

    public final io0 B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io0) ipChange.ipc$dispatch("ea1f99eb", new Object[]{this});
        }
        if (this.c == null) {
            this.c = (io0) x().get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        }
        return this.c;
    }

    @Override // tb.ys
    public boolean r(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf80ccc7", new Object[]{this, aURAEventIO})).booleanValue();
        }
        io0 B = B();
        if (B == null || !B.r()) {
            ck.g().e("stream", "流式数据已经返回，不需要等待");
            return false;
        }
        rbb g = ck.g();
        g.e("stream", aURAEventIO.getEventType() + " 未执行，原因：流式数据未返回，需要等待");
        B.B(aURAEventIO);
        jo0.d("OPEN_POPUP_WINDOW_WITH_LOADING");
        return true;
    }
}
