package tb;

import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ku9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ku9 b = new ku9();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Typeface> f22928a = new ConcurrentHashMap<>();

    static {
        t2o.a(444597201);
    }

    public static ku9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ku9) ipChange.ipc$dispatch("6e1cd17f", new Object[0]);
        }
        return b;
    }

    public Typeface b(String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("86d18d5", new Object[]{this, str, typeface});
        }
        Typeface typeface2 = this.f22928a.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        this.f22928a.put(str, typeface);
        return typeface;
    }
}
