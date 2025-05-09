package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.embed.MyTBLiveEmbedView;
import com.taobao.avplayer.embed.MyTBVideoEmbedView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20482a = false;

    static {
        t2o.a(451936281);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f51f8fc", new Object[0]);
        } else if (!f20482a) {
            f20482a = true;
            fqw.g(MyTBLiveEmbedView.NAME, MyTBLiveEmbedView.class, true);
            fqw.g(MyTBVideoEmbedView.NAME, MyTBVideoEmbedView.class, true);
        }
    }
}
