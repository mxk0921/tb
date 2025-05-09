package tb;

import android.content.Context;
import com.nirvana.tools.logger.model.ACMLimitConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yog implements aw1 {
    public static volatile yog c;

    /* renamed from: a  reason: collision with root package name */
    public ACMLimitConfig f32240a;
    public final Context b;

    public yog(Context context) {
        this.b = context;
        this.f32240a = z2v.d(context);
    }

    public static yog c(Context context) {
        if (c == null) {
            synchronized (yog.class) {
                try {
                    if (c == null) {
                        c = new yog(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.aw1
    public synchronized boolean a() {
        ACMLimitConfig aCMLimitConfig = this.f32240a;
        if (aCMLimitConfig == null || !aCMLimitConfig.isLimited() || this.f32240a.getLimitHours() <= 0) {
            return true;
        }
        if (z2v.f(this.b, g84.a(this.f32240a.getLimitHours())) < this.f32240a.getLimitCount()) {
            return true;
        }
        return false;
    }

    public synchronized void b() {
        ACMLimitConfig aCMLimitConfig = this.f32240a;
        if (aCMLimitConfig != null && aCMLimitConfig.isLimited() && this.f32240a.getLimitHours() > 0) {
            z2v.h(this.b, g84.a(this.f32240a.getLimitHours()));
        }
    }

    public synchronized void d(ACMLimitConfig aCMLimitConfig) {
        if (aCMLimitConfig != null) {
            this.f32240a = aCMLimitConfig;
            z2v.i(this.b, aCMLimitConfig);
        }
    }
}
