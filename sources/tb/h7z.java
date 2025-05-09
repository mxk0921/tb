package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Typeface> f20462a = new HashMap();

    public static Typeface a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("66c00820", new Object[]{str, context});
        }
        Map<String, Typeface> map = f20462a;
        Typeface typeface = (Typeface) ((HashMap) map).get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
            ((HashMap) map).put(str, createFromAsset);
            return createFromAsset;
        } catch (Exception unused) {
            return null;
        }
    }
}
