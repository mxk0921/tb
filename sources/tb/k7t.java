package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.TaoLiveVideoActivity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k7t implements muk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveVideoActivity f22455a;

    public k7t(TaoLiveVideoActivity taoLiveVideoActivity) {
        this.f22455a = taoLiveVideoActivity;
    }

    @Override // tb.muk
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af77910", new Object[]{this, map});
        } else {
            TaoLiveVideoActivity.y3(this.f22455a, map);
        }
    }

    @Override // tb.muk
    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad69777", new Object[]{this, map});
        } else {
            TaoLiveVideoActivity.y3(this.f22455a, map);
        }
    }
}
