package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class btt implements h0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16626a;
    public xnh b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void onFail();

        void onSuccess(Bitmap bitmap);
    }

    static {
        t2o.a(519045167);
        t2o.a(519045161);
    }

    public btt(Context context) {
        this.f16626a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    @Override // tb.h0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap a(android.content.Context r7, com.taobao.android.mediapick.media.LocalMedia r8, boolean r9) {
        /*
            r6 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.btt.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0023
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r9)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r5 = 0
            r9[r5] = r6
            r9[r2] = r7
            r9[r1] = r8
            r9[r0] = r4
            java.lang.String r7 = "5edf3fce"
            java.lang.Object r7 = r3.ipc$dispatch(r7, r9)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            return r7
        L_0x0023:
            int r3 = r8.mediaType
            r4 = 0
            if (r3 != r0) goto L_0x0060
            if (r9 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: IllegalArgumentException -> 0x0038
            int r9 = r8.id     // Catch: IllegalArgumentException -> 0x0038
            long r2 = (long) r9     // Catch: IllegalArgumentException -> 0x0038
            android.graphics.Bitmap r7 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r7, r2, r1, r4)     // Catch: IllegalArgumentException -> 0x0038
            return r7
        L_0x0038:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch: all -> 0x004f, Exception -> 0x0051
            r7.<init>()     // Catch: all -> 0x004f, Exception -> 0x0051
            java.lang.String r8 = r8.path     // Catch: all -> 0x004a, Exception -> 0x004d
            r7.setDataSource(r8)     // Catch: all -> 0x004a, Exception -> 0x004d
            android.graphics.Bitmap r8 = r7.getFrameAtTime()     // Catch: all -> 0x004a, Exception -> 0x004d
            r7.release()
            return r8
        L_0x004a:
            r8 = move-exception
            r4 = r7
            goto L_0x0054
        L_0x004d:
            goto L_0x005a
        L_0x004f:
            r8 = move-exception
            goto L_0x0054
        L_0x0051:
            r7 = r4
            goto L_0x005a
        L_0x0054:
            if (r4 == 0) goto L_0x0059
            r4.release()
        L_0x0059:
            throw r8
        L_0x005a:
            if (r7 == 0) goto L_0x005f
            r7.release()
        L_0x005f:
            return r4
        L_0x0060:
            if (r3 != r2) goto L_0x0072
            if (r9 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 1
        L_0x0066:
            android.content.ContentResolver r7 = r7.getContentResolver()
            int r8 = r8.id
            long r8 = (long) r8
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r7, r8, r1, r4)
            return r7
        L_0x0072:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.btt.a(android.content.Context, com.taobao.android.mediapick.media.LocalMedia, boolean):android.graphics.Bitmap");
    }

    public void b(LocalMedia localMedia, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5175d60d", new Object[]{this, localMedia, imageView});
        } else {
            d(localMedia, imageView, false);
        }
    }

    public void c(LocalMedia localMedia, ImageView imageView, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ec32af", new Object[]{this, localMedia, imageView, aVar, new Boolean(z)});
            return;
        }
        xnh xnhVar = this.b;
        if (xnhVar != null) {
            xnhVar.cancel(true);
        }
        xnh xnhVar2 = new xnh(this.f16626a, localMedia, imageView, aVar, z, this);
        this.b = xnhVar2;
        try {
            xnhVar2.execute(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    public void d(LocalMedia localMedia, ImageView imageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd459e67", new Object[]{this, localMedia, imageView, new Boolean(z)});
        } else {
            c(localMedia, imageView, null, z);
        }
    }

    public void e(LocalMedia localMedia, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7526e9", new Object[]{this, localMedia, aVar, new Boolean(z)});
        } else if (aVar != null) {
            c(localMedia, null, aVar, z);
        }
    }
}
