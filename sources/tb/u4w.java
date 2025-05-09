package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.StandardVideoFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093081);
    }

    public static n8e a(cdr cdrVar, Context context, View view, zjd zjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n8e) ipChange.ipc$dispatch("a78c885d", new Object[]{cdrVar, context, view, zjdVar});
        }
        o3s.b("VideoAdapterFrameFactory", "createVideoAdapterFrameInstance,使用播放器标准化");
        return new StandardVideoFrame(cdrVar, context, view, zjdVar);
    }
}
