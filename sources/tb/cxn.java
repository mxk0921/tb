package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cxn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_CANCELLED = 1003;
    public static final int CODE_FAILURE = 1002;
    public static final int CODE_KNOWN = 1000;
    public static final int CODE_SUCCESS = 1001;
    public static final int CODE_TIMEOUT = 1004;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f17419a = new ArrayList();
    public int b = 1000;
    public String c = null;
    public final Map<String, String> d = new ConcurrentHashMap();

    public static cxn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("59ec5606", new Object[0]);
        }
        cxn cxnVar = new cxn();
        cxnVar.b = 1003;
        cxnVar.c = "cancelled";
        return cxnVar;
    }

    public static cxn c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("a90922ac", new Object[]{str});
        }
        cxn cxnVar = new cxn();
        cxnVar.b = 1002;
        cxnVar.c = str;
        return cxnVar;
    }

    public static cxn g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("8101d34c", new Object[]{list});
        }
        cxn cxnVar = new cxn();
        cxnVar.b = 1001;
        cxnVar.f().addAll(list);
        return cxnVar;
    }

    public static cxn h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("5078ef5", new Object[]{str});
        }
        cxn cxnVar = new cxn();
        cxnVar.b = 1004;
        cxnVar.c = str;
        return cxnVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa59bdff", new Object[]{this})).booleanValue();
        }
        if (this.b != 1001 || !trq.c(this.c) || ((ArrayList) this.f17419a).size() <= 0) {
            return false;
        }
        return true;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.c;
    }

    public List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("892479c", new Object[]{this});
        }
        return this.f17419a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoResult@" + Integer.toHexString(hashCode()) + "{installedModules=" + this.f17419a + ", code=" + this.b + ", errorMsg=" + this.c + ", sourceMap=" + this.d + "}";
    }
}
