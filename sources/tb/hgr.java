package tb;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/hgr;", "Ltb/jfr;", "Ltb/xfr;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class hgr extends jfr<xfr> {
    static {
        t2o.a(804257806);
    }

    public hgr(Context context) {
        ckf.g(context, "context");
        i(context);
        f().c(new sfr(context));
        b().e("dx", new wg5(this));
        b().e("weex", new t4x(c()));
        b().e("h5", new noa(c()));
        b().e("native", new jiz(c()));
        a().b("zcache", new zox());
        a().b("preloadMiniApp", new jsm());
    }
}
