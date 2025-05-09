package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.a;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wie extends a<ImageMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView i;
    public CheckedTextView j;
    public ImageView k;

    static {
        t2o.a(519045146);
    }

    public static /* synthetic */ Object ipc$super(wie wieVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/cell/ImageCellView");
    }

    @Override // com.taobao.android.mediapick.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60755c2b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.mediapick.a
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0d48fe5", new Object[]{this});
        }
        return this.j;
    }

    @Override // com.taobao.android.mediapick.a
    public View j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10219b", new Object[]{this, activity});
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_image, (ViewGroup) null, false);
        this.i = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.j = (CheckedTextView) inflate.findViewById(R.id.tv_pickview);
        this.k = (ImageView) inflate.findViewById(R.id.iv_disable);
        return inflate;
    }

    /* renamed from: o */
    public void i(ImageMedia imageMedia, boolean z) {
        boolean z2 = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69cd04c", new Object[]{this, imageMedia, new Boolean(z)});
            return;
        }
        this.f.b(imageMedia, this.i);
        this.j.setChecked(z);
        IMediaPickClient.PickMode pickMode = IMediaPickClient.PickMode.MULTIP_REPEAT;
        String str = "";
        if (pickMode != this.d.z()) {
            int indexOf = this.d.b().indexOf(imageMedia);
            CheckedTextView checkedTextView = this.j;
            if (indexOf != -1) {
                str = String.valueOf(indexOf + 1);
            }
            checkedTextView.setText(str);
        } else {
            this.j.setText(str);
        }
        if (this.d.b().size() < this.d.y() || (!(pickMode == this.d.z() || IMediaPickClient.PickMode.MULTIP == this.d.z()) || z)) {
            z2 = false;
        }
        ImageView imageView = this.k;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
