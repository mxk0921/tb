package tb;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Bitmap> f29267a = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final uaw f29268a = new uaw();

        public static /* synthetic */ uaw a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uaw) ipChange.ipc$dispatch("5d2f6a17", new Object[0]);
            }
            return f29268a;
        }
    }

    public static uaw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uaw) ipChange.ipc$dispatch("9829b9c", new Object[0]);
        }
        return a.a();
    }

    public Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b989c1d4", new Object[]{this, str});
        }
        return this.f29267a.get(str);
    }

    public void c(String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29143df", new Object[]{this, str, bitmap});
        } else {
            this.f29267a.put(str, bitmap);
        }
    }

    public Bitmap d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("92ac9002", new Object[]{this, str});
        }
        return this.f29267a.remove(str);
    }
}
