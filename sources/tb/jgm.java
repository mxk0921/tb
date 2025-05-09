package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jgm INSTANCE = new jgm();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, wad> f21988a = new LinkedHashMap();

    public final void a(wad wadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3792b777", new Object[]{this, wadVar});
            return;
        }
        ckf.g(wadVar, "popOperate");
        f21988a.put(Integer.valueOf(wadVar.getContext().hashCode()), wadVar);
    }

    public final wad b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wad) ipChange.ipc$dispatch("53fa6eba", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return (wad) ((LinkedHashMap) f21988a).get(Integer.valueOf(context.hashCode()));
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff0e31d", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        int hashCode = context.hashCode();
        Map<Integer, wad> map = f21988a;
        if (map.containsKey(Integer.valueOf(hashCode))) {
            map.remove(Integer.valueOf(hashCode));
        }
    }
}
