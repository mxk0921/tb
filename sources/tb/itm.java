package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class itm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ftm> f21576a = new ConcurrentHashMap();
    public static gaj b;

    public static gaj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gaj) ipChange.ipc$dispatch("48d58995", new Object[0]);
        }
        if (b == null) {
            b = new gaj();
        }
        return b;
    }

    public static ftm b(String str) {
        ftm ftmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ftm) ipChange.ipc$dispatch("6ca3b341", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, ftm> map = f21576a;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return (ftm) ((ConcurrentHashMap) map).get(str);
        }
        if ("new_detail_random".equals(str)) {
            ftmVar = new wkz();
        } else {
            ftmVar = new ftm();
        }
        ((ConcurrentHashMap) map).put(str, ftmVar);
        return ftmVar;
    }
}
