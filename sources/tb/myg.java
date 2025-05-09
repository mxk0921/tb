package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class myg extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f24390a;
    public String b;
    public int c;
    public float d;
    public float e;
    public Map<String, Object> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void p(int i);
    }

    static {
        t2o.a(310378556);
    }

    public static /* synthetic */ Object ipc$super(myg mygVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/LiveDxUserContext");
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d156f0", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e574ccd", new Object[]{this});
        }
        return this.f24390a;
    }

    public float getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52a09bd3", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4b44f4e", new Object[]{this});
        }
        return this.f;
    }

    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbad1fcc", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public void k(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1a5fed", new Object[]{this, aVar});
        } else {
            this.f24390a = aVar;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a0d6b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void n(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9955f798", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c3896", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
