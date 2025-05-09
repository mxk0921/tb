package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.a;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ys9 extends a<MediaBucket> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView i;
    public TextView j;
    public TextView k;

    static {
        t2o.a(519045145);
    }

    public static /* synthetic */ Object ipc$super(ys9 ys9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/cell/FolderCellView");
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
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_bucket, (ViewGroup) null, false);
        this.i = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.tv_folder_name);
        this.k = (TextView) inflate.findViewById(R.id.tv_folder_count);
        return inflate;
    }

    /* renamed from: o */
    public void i(MediaBucket mediaBucket, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc9bf63", new Object[]{this, mediaBucket, new Boolean(z)});
            return;
        }
        this.f.b(mediaBucket, this.i);
        this.j.setText(mediaBucket.displayName);
        this.k.setText(String.valueOf(mediaBucket.count));
    }
}
