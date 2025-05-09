package tb;

import android.content.Context;
import com.taobao.trtc.call.ITrtcCallEngine;
import com.taobao.trtc.call.TrtcCallImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class c3e {
    public static ITrtcCallEngine a(Context context, ITrtcCallEngine.d dVar) {
        return new TrtcCallImpl(context, dVar);
    }
}
