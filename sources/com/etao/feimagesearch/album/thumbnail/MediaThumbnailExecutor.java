package com.etao.feimagesearch.album.thumbnail;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.att;
import tb.ckf;
import tb.d22;
import tb.g1a;
import tb.gd2;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MediaThumbnailExecutor implements d22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<att, a> f4624a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends AsyncTask<Void, Void, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final att f4625a;
        public final g1a<? super att, xhv> b;

        static {
            t2o.a(481296474);
        }

        public a(att attVar, g1a<? super att, xhv> g1aVar) {
            ckf.g(attVar, "thumbnailLoadTask");
            ckf.g(g1aVar, "afterPostExecute");
            this.f4625a = attVar;
            this.b = g1aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/thumbnail/MediaThumbnailExecutor$ThumbnailLoadAsyncTask");
        }

        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("bb544155", new Object[]{this, voidArr});
            }
            ckf.g(voidArr, "params");
            if (!Thread.interrupted()) {
                try {
                } catch (Throwable unused) {
                    return null;
                }
            }
            return gd2.e(this.f4625a.a());
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f4625a.b().setImageBitmap(bitmap);
                this.b.invoke(this.f4625a);
            }
        }
    }

    static {
        t2o.a(481296473);
        t2o.a(481296472);
    }

    public static final /* synthetic */ Map c(MediaThumbnailExecutor mediaThumbnailExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3e7d2e4", new Object[]{mediaThumbnailExecutor});
        }
        return mediaThumbnailExecutor.f4624a;
    }

    @Override // tb.d22
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!this.f4624a.isEmpty()) {
            for (a aVar : ((LinkedHashMap) this.f4624a).values()) {
                aVar.cancel(true);
            }
            ((LinkedHashMap) this.f4624a).clear();
        }
    }

    @Override // tb.d22
    public void a(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caf5fd0", new Object[]{this, attVar});
            return;
        }
        ckf.g(attVar, "task");
        a remove = this.f4624a.remove(attVar);
        if (remove != null) {
            remove.cancel(true);
        }
    }

    @Override // tb.d22
    public void b(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf707e0b", new Object[]{this, attVar});
            return;
        }
        ckf.g(attVar, "task");
        a aVar = new a(attVar, new MediaThumbnailExecutor$executeTask$asyncTask$1(this, attVar));
        this.f4624a.put(attVar, aVar);
        try {
            aVar.execute(new Void[0]);
        } catch (Throwable unused) {
        }
    }
}
