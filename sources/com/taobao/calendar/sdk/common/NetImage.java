package com.taobao.calendar.sdk.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStream;
import java.util.concurrent.RejectedExecutionException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NetImage {
    protected String img;
    protected Bitmap imgBmp;
    protected LoadHandler loadHandler;
    private final Context mContext;
    private a task;
    public static int SUCCESS = 1;
    public static int FAIL = 2;
    protected int MAX_TRY = 3;
    protected int trytimes = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface LoadHandler {
        void loaded(int i, Bitmap bitmap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<String, Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public String f10281a;

        static {
            t2o.a(414187553);
        }

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
            if (r2 == null) goto L_0x005a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
            return r4.f10281a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r2 != null) goto L_0x0036;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
            r2.close();
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                com.taobao.calendar.sdk.common.NetImage r0 = com.taobao.calendar.sdk.common.NetImage.this
                java.lang.String r1 = "Couldn't load bitmap from url: "
                r2 = 0
                r5 = r5[r2]
                r4.f10281a = r5
                java.net.URL r5 = new java.net.URL     // Catch: MalformedURLException -> 0x0056
                java.lang.String r2 = r4.f10281a     // Catch: MalformedURLException -> 0x0056
                r5.<init>(r2)     // Catch: MalformedURLException -> 0x0056
                r2 = 0
                java.io.InputStream r2 = r5.openStream()     // Catch: all -> 0x0032, IOException -> 0x003a
                com.taobao.calendar.sdk.common.FileCache r5 = new com.taobao.calendar.sdk.common.FileCache     // Catch: all -> 0x0032, IOException -> 0x003a
                android.content.Context r3 = com.taobao.calendar.sdk.common.NetImage.access$000(r0)     // Catch: all -> 0x0032, IOException -> 0x003a
                r5.<init>(r3)     // Catch: all -> 0x0032, IOException -> 0x003a
                java.lang.String r3 = r4.f10281a     // Catch: all -> 0x0032, IOException -> 0x003a
                r5.put(r3, r2)     // Catch: all -> 0x0032, IOException -> 0x003a
                java.lang.String r3 = r4.f10281a     // Catch: all -> 0x0032, IOException -> 0x003a
                java.io.InputStream r5 = r5.get(r3)     // Catch: all -> 0x0032, IOException -> 0x003a
                if (r5 == 0) goto L_0x0034
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: all -> 0x0032, IOException -> 0x003a
                r0.imgBmp = r5     // Catch: all -> 0x0032, IOException -> 0x003a
                goto L_0x0034
            L_0x0032:
                r5 = move-exception
                goto L_0x0050
            L_0x0034:
                if (r2 == 0) goto L_0x005a
            L_0x0036:
                r2.close()     // Catch: IOException -> 0x005a
                goto L_0x005a
            L_0x003a:
                java.lang.String r5 = "NetImage"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0032
                r0.<init>(r1)     // Catch: all -> 0x0032
                java.lang.String r1 = r4.f10281a     // Catch: all -> 0x0032
                r0.append(r1)     // Catch: all -> 0x0032
                java.lang.String r0 = r0.toString()     // Catch: all -> 0x0032
                android.util.Log.e(r5, r0)     // Catch: all -> 0x0032
                if (r2 == 0) goto L_0x005a
                goto L_0x0036
            L_0x0050:
                if (r2 == 0) goto L_0x0055
                r2.close()     // Catch: IOException -> 0x0055
            L_0x0055:
                throw r5     // Catch: MalformedURLException -> 0x0056
            L_0x0056:
                r5 = move-exception
                r5.printStackTrace()
            L_0x005a:
                java.lang.String r5 = r4.f10281a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.common.NetImage.a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            NetImage netImage = NetImage.this;
            netImage.trytimes++;
            Bitmap bitmap = netImage.imgBmp;
            if (bitmap == null) {
                netImage.load(str, netImage.loadHandler);
                return;
            }
            netImage.trytimes = 0;
            netImage.loadHandler.loaded(NetImage.SUCCESS, bitmap);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    static {
        t2o.a(414187552);
    }

    public NetImage(Context context) {
        this.mContext = context;
    }

    public void load(String str, LoadHandler loadHandler) {
        a aVar = this.task;
        if (aVar != null) {
            aVar.cancel(true);
        }
        this.img = str;
        this.loadHandler = loadHandler;
        if (this.trytimes >= this.MAX_TRY) {
            Log.e("NetImage", "try loading image " + this.MAX_TRY + " times, never success" + str);
            loadHandler.loaded(FAIL, null);
        } else if (!str.equals("")) {
            InputStream inputStream = new FileCache(this.mContext).get(str);
            if (inputStream != null) {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                this.imgBmp = decodeStream;
                if (decodeStream != null) {
                    loadHandler.loaded(SUCCESS, decodeStream);
                    return;
                }
            }
            this.imgBmp = null;
            try {
                a aVar2 = new a();
                this.task = aVar2;
                aVar2.execute(str);
            } catch (RejectedExecutionException e) {
                Log.e("IMGVIEW", e.getStackTrace().toString());
            }
        } else {
            loadHandler.loaded(FAIL, null);
        }
    }

    public void maxRetry(int i) {
        this.MAX_TRY = i;
    }
}
