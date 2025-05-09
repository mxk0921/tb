package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f16291a;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf04181", new Object[]{str});
        }
        return f16291a.get(str);
    }

    static {
        t2o.a(444597684);
        HashMap<String, String> hashMap = new HashMap<>();
        f16291a = hashMap;
        hashMap.put(pg1.ATOM_EXT_button, sqj.DEFAULT_BUTTON);
        hashMap.put("img", "图片");
        hashMap.put("input", "编辑框");
        hashMap.put("link", "链接");
        hashMap.put("search", "搜索栏");
    }
}
