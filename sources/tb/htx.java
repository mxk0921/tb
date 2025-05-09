package tb;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class htx {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, bxx> f20895a = new LruCache<>(1000);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final htx f20896a = new htx();

        static {
            t2o.a(253755457);
        }
    }

    static {
        t2o.a(253755456);
    }

    public htx() {
        new AtomicBoolean(false);
    }

    public Bundle a(Context context, String str, String str2, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr) {
        LruCache<String, bxx> lruCache = this.f20895a;
        bxx bxxVar = lruCache.get(str2);
        if (bxxVar != null) {
            try {
                return bxxVar.a(context, str, iBridgeTargetIdentify, i, objArr);
            } catch (Exception e) {
                dxx.e.a(str2, str, 101008, e.getMessage());
                return jtx.a(101008, "targetClassName:" + str2);
            }
        } else {
            try {
                Class<?> cls = Class.forName("com.opos.process.bridge.dispatch." + str2.substring(str2.lastIndexOf(".") + 1) + "$Dispatcher");
                if (!bxx.class.isAssignableFrom(cls)) {
                    return jtx.a(101007, "dispatch");
                }
                bxx bxxVar2 = (bxx) cls.newInstance();
                lruCache.put(str2, bxxVar2);
                return bxxVar2.a(context, str, iBridgeTargetIdentify, i, objArr);
            } catch (ClassNotFoundException e2) {
                dxx.e.a(str2, str, 102001, e2.getMessage());
                return jtx.a(102001, "targetClassName:".concat(str2));
            } catch (Exception e3) {
                dxx.e.a(str2, str, 101008, e3.getMessage());
                return jtx.a(101008, "targetClassName:".concat(str2));
            }
        }
    }
}
