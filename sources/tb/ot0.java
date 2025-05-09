package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.b;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ot0 extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(519045148);
    }

    public ot0(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ot0 ot0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/datasource/AllMediaDataSource");
    }

    @Override // com.taobao.android.mediapick.b
    public List<Media> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cbd685b", new Object[]{this});
        }
        MediaBucket g = ghi.g(c(), f(), ghi.ALL_MEDIA);
        if (g == null) {
            return new ArrayList();
        }
        return ghi.k(c(), g, f(), e());
    }
}
