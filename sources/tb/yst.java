package tb;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.tao.Globals;
import tb.btt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f32328a;
    public final ThumbnailItem b;
    public final String c;
    public final long d;
    public ImageView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements btt.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThumbnailItem f32329a;

        public a(ThumbnailItem thumbnailItem) {
            this.f32329a = thumbnailItem;
        }

        @Override // tb.btt.a
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            }
        }

        @Override // tb.btt.a
        public void onSuccess(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cb46ce3", new Object[]{this, bitmap});
                return;
            }
            if (yst.a(yst.this) != null) {
                yst.a(yst.this).setImageBitmap(bitmap);
            }
            this.f32329a.coverThumbnail = bitmap;
        }
    }

    static {
        t2o.a(511705244);
    }

    public yst(ThumbnailItem thumbnailItem, String str, long j, int i) {
        this.b = thumbnailItem;
        this.c = str;
        this.d = j;
        this.f32328a = i;
    }

    public static /* synthetic */ ImageView a(yst ystVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("2ea485fe", new Object[]{ystVar});
        }
        return ystVar.e;
    }

    public final void b(ThumbnailItem thumbnailItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0c9f0", new Object[]{this, thumbnailItem, str});
            return;
        }
        gkg gkgVar = new gkg(Globals.getApplication());
        ImageMedia imageMedia = new ImageMedia();
        imageMedia.path = str;
        gkgVar.e(imageMedia, new a(thumbnailItem), false);
    }

    public Bitmap c(ThumbnailItem thumbnailItem, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("238a83db", new Object[]{this, thumbnailItem, str, new Long(j)});
        }
        if (!d(j)) {
            return ed2.l(false, j, this.f32328a, true);
        }
        b(thumbnailItem, str);
        return null;
    }

    public final boolean d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f5f27bf", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return true;
        }
        return false;
    }

    public void e(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6eb93e7", new Object[]{this, imageView});
            return;
        }
        this.e = imageView;
        Bitmap c = c(this.b, this.c, this.d);
        if (c != null) {
            imageView.setImageBitmap(c);
        }
    }
}
