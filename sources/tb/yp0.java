package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ONLY_CACHE = 8;
    public static final int PRELOAD_WITH_SMALL = 1;
    public static final int SCALE_FROM_LARGE = 2;
    public static final int SKIP_CACHE = 4;
    public static final int USE_ORIGIN_IF_THUMB_NOT_EXIST = 16;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f32252a;
    public Map<String, String> b;

    public yp0 a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yp0) ipChange.ipc$dispatch("2fdc2e40", new Object[]{this, str, str2});
        }
        if (this.f32252a == null) {
            this.f32252a = new ConcurrentHashMap();
        }
        this.f32252a.put(str, str2);
        return this;
    }

    public yp0 b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yp0) ipChange.ipc$dispatch("a92c0b4f", new Object[]{this, map});
        }
        this.b = map;
        return this;
    }
}
