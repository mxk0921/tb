package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile pmm b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, String>> f26187a = new HashMap();

    static {
        t2o.a(774897752);
    }

    public static pmm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmm) ipChange.ipc$dispatch("ea8e8fe7", new Object[0]);
        }
        if (b == null) {
            synchronized (pmm.class) {
                try {
                    if (b == null) {
                        b = new pmm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public synchronized Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa8336f6", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return (Map) ((HashMap) this.f26187a).get(str);
        }
    }

    public synchronized void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6763cb", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            if (map != null) {
                ((HashMap) this.f26187a).put(str, map);
            } else {
                ((HashMap) this.f26187a).remove(str);
            }
        }
    }

    public synchronized boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9e019d", new Object[]{this, str})).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Map map = (Map) ((HashMap) this.f26187a).get(str);
            if (map == null) {
                return false;
            }
            return (map.get("url") == null || map.get(VideoControllerManager.KEY_CACHEKEY) == null) ? false : true;
        }
    }
}
