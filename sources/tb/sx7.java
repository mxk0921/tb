package tb;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sx7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Drawable> f28334a = new ConcurrentHashMap();

    public static Drawable a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9100e11b", new Object[]{resources, new Integer(i), theme});
        }
        Map<Integer, Drawable> map = f28334a;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            return (Drawable) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        }
        return b(resources, i, theme);
    }

    public static Drawable b(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c88ba936", new Object[]{resources, new Integer(i), theme});
        }
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, null);
        if (drawable != null) {
            ((ConcurrentHashMap) f28334a).put(Integer.valueOf(i), drawable);
        }
        return drawable;
    }

    public static void c(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa08c3ea", new Object[]{resources, new Integer(i), theme});
            return;
        }
        try {
            b(resources, i, theme);
        } catch (Resources.NotFoundException e) {
            rpj.a("preload_drawable", "failed" + e);
        }
    }
}
