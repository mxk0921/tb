package tb;

import android.text.TextUtils;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u33 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u33 b = new u33();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WeakReference<TextureView>> f29104a = new HashMap(8);

    static {
        t2o.a(945815554);
    }

    public static u33 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u33) ipChange.ipc$dispatch("e13e9122", new Object[0]);
        }
        return b;
    }

    public TextureView b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("d70463de", new Object[]{this, str});
        }
        WeakReference weakReference = (WeakReference) ((HashMap) this.f29104a).get(str);
        if (weakReference == null) {
            return null;
        }
        return (TextureView) weakReference.get();
    }

    public void c(String str, TextureView textureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f927d47f", new Object[]{this, str, textureView});
        } else if (textureView != null && !TextUtils.isEmpty(str)) {
            ((HashMap) this.f29104a).put(str, new WeakReference(textureView));
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7e2c4c", new Object[]{this, str});
        } else {
            ((HashMap) this.f29104a).remove(str);
        }
    }
}
