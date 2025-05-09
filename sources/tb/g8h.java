package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;
import tb.kec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g8h<T extends LocalMedia, S extends kec> extends q7<T, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BitmapFactory.Options d;

    static {
        t2o.a(511705590);
        BitmapFactory.Options options = new BitmapFactory.Options();
        d = options;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
    }

    public static /* synthetic */ Object ipc$super(g8h g8hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/loader/LocalImageLoader");
    }

    @Override // tb.q7
    public BitmapDrawable c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("807880ce", new Object[]{this, str});
        }
        return sb2.sAlbumDrawableCache.get(str);
    }

    @Override // tb.q7
    public void i(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2995ddf9", new Object[]{this, str, bitmapDrawable});
        } else {
            sb2.sAlbumDrawableCache.put(str, bitmapDrawable);
        }
    }

    /* renamed from: k */
    public String a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7674004", new Object[]{this, t});
        }
        return String.valueOf(t.id);
    }

    /* renamed from: l */
    public BitmapDrawable b(T t, Context context) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("fb74cf4f", new Object[]{this, t, context});
        }
        int i = t.mediaType;
        if (i == 3) {
            bitmap = MediaStore.Video.Thumbnails.getThumbnail(context.getContentResolver(), t.id, 1, d);
        } else if (i == 1) {
            bitmap = MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), t.id, 1, d);
        } else {
            bitmap = null;
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }
}
