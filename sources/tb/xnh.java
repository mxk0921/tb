package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;
import tb.btt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xnh extends AsyncTask<Void, Void, Bitmap> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31485a;
    public final h0e b;
    public final LocalMedia c;
    public final ImageView d;
    public final btt.a e;
    public final boolean f;

    static {
        t2o.a(519045162);
    }

    public xnh(Context context, LocalMedia localMedia, ImageView imageView, btt.a aVar, boolean z, h0e h0eVar) {
        this.c = localMedia;
        this.d = imageView;
        this.f = z;
        this.e = aVar;
        this.f31485a = context;
        this.b = h0eVar;
    }

    public static /* synthetic */ Object ipc$super(xnh xnhVar, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/util/MAsyncTask");
    }

    /* renamed from: a */
    public Bitmap doInBackground(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bb544155", new Object[]{this, voidArr});
        }
        if (Thread.interrupted()) {
            return null;
        }
        try {
            return this.b.a(this.f31485a, this.c, this.f);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void onPostExecute(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
            return;
        }
        super.onPostExecute(bitmap);
        if (bitmap == null || bitmap.isRecycled()) {
            btt.a aVar = this.e;
            if (aVar != null) {
                aVar.onFail();
                return;
            }
            return;
        }
        btt.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.onSuccess(bitmap);
        } else {
            this.d.setImageBitmap(bitmap);
        }
    }
}
