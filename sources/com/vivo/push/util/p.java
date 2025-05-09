package com.vivo.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.vivo.push.f.u;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.t;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class p extends AsyncTask<String, Void, List<Bitmap>> {

    /* renamed from: a  reason: collision with root package name */
    private Context f14670a;
    private InsideNotificationItem b;
    private long c;
    private boolean d;
    private int e = 0;
    private NotifyArriveCallbackByUser f;
    private u.a g;

    public p(Context context, InsideNotificationItem insideNotificationItem, long j, boolean z, u.a aVar, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        this.f14670a = context;
        this.b = insideNotificationItem;
        this.c = j;
        this.d = z;
        this.g = aVar;
        this.f = notifyArriveCallbackByUser;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(List<Bitmap> list) {
        List<Bitmap> list2 = list;
        super.onPostExecute(list2);
        u.c("ImageDownTask", "onPostExecute");
        t.c(new q(this, list2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r5 == null) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r5 == null) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        r6 = null;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<android.graphics.Bitmap> doInBackground(java.lang.String... r10) {
        /*
            r9 = this;
            com.vivo.push.model.InsideNotificationItem r0 = r9.b
            int r0 = r0.getNotifyDisplayStatus()
            r9.e = r0
            boolean r0 = r9.d
            r1 = 0
            java.lang.String r2 = "ImageDownTask"
            if (r0 != 0) goto L_0x0015
            java.lang.String r10 = "bitmap is not display by forbid net"
            com.vivo.push.util.u.d(r2, r10)
            return r1
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
            r4 = 0
        L_0x001c:
            r5 = 2
            if (r4 >= r5) goto L_0x00ae
            r5 = r10[r4]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "imgUrl="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = " i="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.vivo.push.util.u.d(r2, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00a5
            java.net.URL r6 = new java.net.URL     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r6.<init>(r5)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            java.net.URLConnection r5 = r6.openConnection()     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r6 = 30000(0x7530, float:4.2039E-41)
            r5.setConnectTimeout(r6)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r6 = 1
            r5.setDoInput(r6)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r5.setUseCaches(r3)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r5.connect()     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            int r6 = r5.getResponseCode()     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            java.lang.String r7 = "code="
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            java.lang.String r7 = r7.concat(r8)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            com.vivo.push.util.u.c(r2, r7)     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x007d
            java.io.InputStream r5 = r5.getInputStream()     // Catch: all -> 0x007b, IOException -> 0x0085, MalformedURLException -> 0x0091
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: all -> 0x0078, IOException -> 0x0086, MalformedURLException -> 0x0092
            goto L_0x007f
        L_0x0078:
            r10 = move-exception
            r1 = r5
            goto L_0x009f
        L_0x007b:
            r10 = move-exception
            goto L_0x009f
        L_0x007d:
            r5 = r1
            r6 = r5
        L_0x007f:
            if (r5 == 0) goto L_0x009b
            r5.close()     // Catch: Exception -> 0x009b
            goto L_0x009b
        L_0x0085:
            r5 = r1
        L_0x0086:
            java.lang.String r6 = "IOException"
            com.vivo.push.util.u.a(r2, r6)     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x009a
        L_0x008d:
            r5.close()     // Catch: Exception -> 0x009a
            goto L_0x009a
        L_0x0091:
            r5 = r1
        L_0x0092:
            java.lang.String r6 = "MalformedURLException"
            com.vivo.push.util.u.a(r2, r6)     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x009a
            goto L_0x008d
        L_0x009a:
            r6 = r1
        L_0x009b:
            r0.add(r6)
            goto L_0x00aa
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()     // Catch: Exception -> 0x00a4
        L_0x00a4:
            throw r10
        L_0x00a5:
            if (r4 != 0) goto L_0x00aa
            r0.add(r1)
        L_0x00aa:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.p.doInBackground(java.lang.String[]):java.util.List");
    }
}
