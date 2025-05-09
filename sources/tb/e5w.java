package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.a;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5w extends a<VideoMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView i;
    public TextView j;

    static {
        t2o.a(519045147);
    }

    public static /* synthetic */ Object ipc$super(e5w e5wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/cell/VideoCellView");
    }

    public static String o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d327d2b", new Object[]{new Long(j)});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    @Override // com.taobao.android.mediapick.a
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0d48fe5", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.mediapick.a
    public View j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10219b", new Object[]{this, activity});
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_video, (ViewGroup) null, false);
        this.i = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.tv_video_duration);
        return inflate;
    }

    /* renamed from: p */
    public void i(VideoMedia videoMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfde92c", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        this.f.b(videoMedia, this.i);
        this.j.setText(o(videoMedia.duration));
    }
}
