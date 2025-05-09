package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zkp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Media> f32840a = new ArrayList();
    public final List<IMediaPickClient> b = new ArrayList();

    static {
        t2o.a(519045143);
    }

    public static zkp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zkp) ipChange.ipc$dispatch("82d5157d", new Object[0]);
        }
        return new zkp();
    }

    public void a(IMediaPickClient iMediaPickClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5929c2a", new Object[]{this, iMediaPickClient});
        } else if (iMediaPickClient.d(this)) {
            ((ArrayList) this.b).add(iMediaPickClient);
        }
    }
}
