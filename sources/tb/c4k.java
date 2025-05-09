package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c4k extends hp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static c4k f16854a = null;

    static {
        t2o.a(374341685);
    }

    public static /* synthetic */ Object ipc$super(c4k c4kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/NoOpAVFSCache");
    }

    public static synchronized c4k w() {
        synchronized (c4k.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c4k) ipChange.ipc$dispatch("17b56eaf", new Object[0]);
            }
            if (f16854a == null) {
                f16854a = new c4k();
            }
            return f16854a;
        }
    }

    @Override // tb.fdb
    public boolean G0(String str, String str2, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80aff7d9", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public <T> T I0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f86e3322", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // tb.fdb
    public boolean J0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9daf8b8", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public List<String> K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("67af1413", new Object[]{this, str});
        }
        return new ArrayList(0);
    }

    @Override // tb.fdb
    public boolean W(String str, String str2, InputStream inputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c28e6a7", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // tb.fdb
    public long e0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af8116b", new Object[]{this, str, str2})).longValue();
        }
        return -1L;
    }

    @Override // tb.fdb
    public <T> T g0(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7efbc3a5", new Object[]{this, str, str2, cls});
        }
        return null;
    }

    @Override // tb.fdb
    public InputStream j0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("4c9d72fe", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // tb.fdb
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        return null;
    }

    @Override // tb.fdb
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ac1ea7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdba1", new Object[]{this});
        }
    }

    @Override // tb.fdb
    public boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75209d08", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }
}
