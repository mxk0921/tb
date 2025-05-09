package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.b;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xxp extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MediaBucket f;

    static {
        t2o.a(519045150);
    }

    public xxp(MediaBucket mediaBucket, int i) {
        super(i);
        this.f = mediaBucket;
    }

    public static /* synthetic */ Object ipc$super(xxp xxpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/datasource/SimpleMediaDataSource");
    }

    @Override // com.taobao.android.mediapick.b
    public List<Media> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cbd685b", new Object[]{this});
        }
        return ghi.k(c(), this.f, f(), e());
    }
}
