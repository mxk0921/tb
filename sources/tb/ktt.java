package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ktt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Stack<a>> f22917a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f22918a;

        static {
            t2o.a(758120584);
        }

        public a(String str, long j) {
            this.f22918a = j;
        }
    }

    static {
        t2o.a(758120583);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003de7a", new Object[]{str});
            return;
        }
        HashMap hashMap = (HashMap) f22917a;
        Stack stack = (Stack) hashMap.get(str);
        if (stack == null) {
            stack = new Stack();
            hashMap.put(str, stack);
        }
        stack.push(new a(str, SystemClock.elapsedRealtime()));
    }

    public static void b(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{str});
            return;
        }
        Stack stack = (Stack) ((HashMap) f22917a).get(str);
        if (stack != null && !stack.isEmpty() && (aVar = (a) stack.pop()) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - aVar.f22918a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" cost:");
            sb.append(elapsedRealtime);
            sb.append("ms");
            HashMap hashMap = new HashMap();
            hashMap.put("cost", String.valueOf(elapsedRealtime));
            vhn.c("TimeCost-" + str, hashMap);
        }
    }
}
