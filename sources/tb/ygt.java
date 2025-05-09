package tb;

import android.util.Log;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class ygt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f32080a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ xgt c;

    public ygt(xgt xgtVar, String str, Throwable th) {
        this.c = xgtVar;
        this.f32080a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        TLog.logd("TbLottie_Module", k6g.TAG, this.f32080a + '\n' + Log.getStackTraceString(this.b));
    }
}
