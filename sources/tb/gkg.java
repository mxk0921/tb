package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.android.mediapick.media.VideoMedia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gkg extends btt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int c = 512;
    public static final int d = 720;

    static {
        t2o.a(511705625);
    }

    public gkg(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(gkg gkgVar, String str, Object... objArr) {
        if (str.hashCode() == 1591689166) {
            return super.a((Context) objArr[0], (LocalMedia) objArr[1], ((Boolean) objArr[2]).booleanValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/util/LcThumbnailLoader");
    }

    @Override // tb.btt, tb.h0e
    public Bitmap a(Context context, LocalMedia localMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5edf3fce", new Object[]{this, context, localMedia, new Boolean(z)});
        }
        if (!(localMedia == null || !h(localMedia) || localMedia.path == null)) {
            if (localMedia instanceof VideoMedia) {
                return g(localMedia);
            }
            if (localMedia instanceof ImageMedia) {
                return f(localMedia, z);
            }
        }
        return super.a(context, localMedia, z);
    }

    public final Bitmap f(LocalMedia localMedia, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5b3a60e3", new Object[]{this, localMedia, new Boolean(z)});
        }
        String str = localMedia.path;
        if (z) {
            i = d;
        } else {
            i = c;
        }
        return ed2.f(str, i, true);
    }

    public final Bitmap g(LocalMedia localMedia) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fda76a6d", new Object[]{this, localMedia});
        }
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
        } catch (Exception unused) {
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            mediaMetadataRetriever.setDataSource(localMedia.path);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
            mediaMetadataRetriever.release();
            return frameAtTime;
        } catch (Exception unused2) {
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
            throw th;
        }
    }

    public final boolean h(LocalMedia localMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec4e838b", new Object[]{this, localMedia})).booleanValue();
        }
        if (localMedia.id <= 0) {
            return true;
        }
        return false;
    }
}
