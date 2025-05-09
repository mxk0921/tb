package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, mem> b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f23991a;

    static {
        t2o.a(626000049);
    }

    public mem(String str) {
        this.f23991a = Pattern.compile(str).matcher("");
    }

    public static synchronized boolean a(String str, String str2) {
        synchronized (mem.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f7065ab", new Object[]{str, str2})).booleanValue();
            }
            try {
                HashMap<String, mem> hashMap = b;
                mem memVar = hashMap.get(str);
                if (memVar == null) {
                    memVar = new mem(str);
                    hashMap.put(str, memVar);
                }
                return memVar.f23991a.reset(str2).find();
            } catch (Exception e) {
                wdm.d("PatternMatcher.match %s --> %s error", str, str2);
                wdm.h("PatternMatcher.match", e);
                return false;
            }
        }
    }
}
