package tb;

import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class zgt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f32763a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ xgt c;

    public zgt(xgt xgtVar, String str, Throwable th) {
        this.c = xgtVar;
        this.f32763a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        TLog.logw("TbLottie_Module", k6g.TAG, this.f32763a, this.b);
    }
}
