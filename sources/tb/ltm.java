package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ltm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ktm> f23558a = new ConcurrentHashMap();

    public static ktm a(String str) {
        ktm ktmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ktm) ipChange.ipc$dispatch("3b3645bf", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, ktm> map = f23558a;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return (ktm) ((ConcurrentHashMap) map).get(str);
        }
        if ("new_detail_random".equals(str)) {
            ktmVar = new xkz();
        } else {
            ktmVar = new ktm();
        }
        ((ConcurrentHashMap) map).put(str, ktmVar);
        return ktmVar;
    }
}
