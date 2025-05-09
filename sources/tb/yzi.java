package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.je4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yzi implements SharedPreferencesFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, SharedPreferences> f32430a = new ConcurrentHashMap();
    public final SharedPreferencesFactory b;

    static {
        t2o.a(408944646);
        t2o.a(409993227);
    }

    public yzi(SharedPreferencesFactory sharedPreferencesFactory) {
        this.b = sharedPreferencesFactory;
    }

    public final /* synthetic */ SharedPreferences b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("d0ee6a11", new Object[]{this, context, str, new Integer(i)});
        }
        return this.b.create(context, str, i);
    }

    @Override // com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory
    public SharedPreferences create(final Context context, final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{this, context, str, new Integer(i)});
        }
        SharedPreferences sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) this.f32430a).get(str);
        if (sharedPreferences == null) {
            synchronized (this.f32430a) {
                try {
                    sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) this.f32430a).get(str);
                    if (sharedPreferences == null) {
                        le4 c = le4.c(str, this.b.getClass().getName(), new je4.a() { // from class: tb.xzi
                            @Override // tb.je4.a
                            public final Object call() {
                                SharedPreferences b;
                                b = yzi.this.b(context, str, i);
                                return b;
                            }
                        });
                        tmp tmpVar = new tmp(c.b(), c.a());
                        ((ConcurrentHashMap) this.f32430a).put(str, tmpVar);
                        sharedPreferences = tmpVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sharedPreferences;
    }
}
