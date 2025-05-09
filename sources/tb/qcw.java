package tb;

import android.media.MediaMetadataRetriever;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f26675a;
        public final int b;
        public final int c;

        static {
            t2o.a(758120588);
        }

        public a(int i, int i2, int i3) {
            this.f26675a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        t2o.a(758120587);
    }

    public static a a(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e210486b", new Object[]{str});
        }
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                a aVar = new a(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(24)));
                mediaMetadataRetriever.release();
                return aVar;
            } catch (Throwable unused) {
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                return null;
            }
        } catch (Throwable unused2) {
            mediaMetadataRetriever = null;
        }
    }
}
