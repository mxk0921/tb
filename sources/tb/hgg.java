package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import java.io.File;
import java.util.Date;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hgg extends AsyncTask<Void, Void, List<AlbumMediaItem>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PREVIEW_ID = "plt:preview_id";

    /* renamed from: a  reason: collision with root package name */
    public final a f20624a;
    public final int b;
    public final boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        boolean isResumed();

        void onRecentImageShow(List<AlbumMediaItem> list);
    }

    static {
        t2o.a(481296907);
    }

    public hgg(a aVar, int i) {
        this.f20624a = aVar;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(hgg hggVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/capture/components/LatestImageTask");
    }

    /* renamed from: a */
    public List<AlbumMediaItem> doInBackground(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f9c7edf0", new Object[]{this, voidArr});
        }
        List<AlbumMediaItem> d = d(caa.c());
        if (d == null || d.isEmpty()) {
            return null;
        }
        AlbumMediaItem albumMediaItem = d.get(0);
        if (new File(albumMediaItem.imgFilePath).exists() || new File(albumMediaItem.imgUri.toString()).exists()) {
            return d;
        }
        return null;
    }

    public final List<AlbumMediaItem> b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b96c779", new Object[]{this, context, new Integer(i)});
        }
        if (i == 0) {
            return null;
        }
        return rdi.h(10L);
    }

    public final List<AlbumMediaItem> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("70a1b76d", new Object[]{this, context});
        }
        return b(context, this.b);
    }

    /* renamed from: e */
    public void onPostExecute(List<AlbumMediaItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
        } else if (lvm.a() || list == null || list.isEmpty()) {
            this.f20624a.onRecentImageShow(null);
        } else {
            AlbumMediaItem albumMediaItem = list.get(0);
            if (albumMediaItem.canShow) {
                if (TextUtils.equals(lvm.f23595a, albumMediaItem.id)) {
                    albumMediaItem.canShow = false;
                } else if (this.c) {
                    lvm.f23595a = albumMediaItem.id;
                    mno.h(caa.c(), KEY_PREVIEW_ID, albumMediaItem.id);
                }
            }
            if (this.f20624a.isResumed()) {
                this.f20624a.onRecentImageShow(list);
            }
        }
    }

    public final List<AlbumMediaItem> d(Context context) {
        long j;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35789b2b", new Object[]{this, context});
        }
        if (!u7m.d(context)) {
            return null;
        }
        List<AlbumMediaItem> c = c(context);
        AlbumMediaItem albumMediaItem = (c == null || c.size() <= 0) ? null : c.get(0);
        if (albumMediaItem == null || TextUtils.isEmpty(albumMediaItem.imgFilePath)) {
            return null;
        }
        if (albumMediaItem.imgFilePath.contains("拍立淘")) {
            albumMediaItem.canShow = false;
        } else if (TextUtils.isEmpty(albumMediaItem.lastUpdateTime) || lvm.f23595a.equals(albumMediaItem.id)) {
            albumMediaItem.canShow = false;
        } else {
            try {
                j = Long.parseLong(albumMediaItem.lastUpdateTime) * 1000;
            } catch (Exception unused) {
                j = -1;
            }
            if ((new Date().getTime() - j) / 1000 > lvm.b) {
                z = false;
            }
            albumMediaItem.canShow = z;
        }
        return c;
    }
}
