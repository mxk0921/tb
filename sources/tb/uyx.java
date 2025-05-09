package tb;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uyx extends AsyncTask<Context, Integer, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f29687a;

    public static void b() {
        if (e()) {
            x5y.d("uyx", "checkUpgradeBks, execute check task");
            new uyx().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, sq4.a());
        }
    }

    public static boolean e() {
        if (f29687a) {
            return false;
        }
        Context a2 = sq4.a();
        if (a2 == null) {
            x5y.e("uyx", "checkUpgradeBks, context is null");
            return false;
        }
        f29687a = true;
        long a3 = b8y.a("lastCheckTime", 0L, a2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - a3 > 432000000) {
            b8y.d("lastCheckTime", currentTimeMillis, a2);
            return true;
        }
        x5y.d("uyx", "checkUpgradeBks, ignore");
        return false;
    }

    /* renamed from: a */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        System.currentTimeMillis();
        try {
            inputStream = af2.m(contextArr[0]);
        } catch (Exception e) {
            x5y.c("uyx", "doInBackground: exception : " + e.getMessage());
            inputStream = null;
        }
        System.currentTimeMillis();
        if (inputStream == null) {
            return Boolean.FALSE;
        }
        r3y.b(inputStream);
        return Boolean.TRUE;
    }

    /* renamed from: c */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            x5y.d("uyx", "onPostExecute: upate done");
        } else {
            x5y.c("uyx", "onPostExecute: upate failed");
        }
    }

    /* renamed from: d */
    public void onProgressUpdate(Integer... numArr) {
        x5y.d("uyx", "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
    }
}
