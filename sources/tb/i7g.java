package tb;

import com.alibaba.ability.localization.Localization;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i7g {
    public static final IMediaPickClient.b sMedia;

    static {
        t2o.a(511705572);
        IMediaPickClient.b bVar = new IMediaPickClient.b();
        sMedia = bVar;
        bVar.f8888a = 3;
        bVar.c = 2;
        bVar.b = 0;
        bVar.f = Localization.q(R.string.gg_pub_max_selectable_materials);
    }
}
