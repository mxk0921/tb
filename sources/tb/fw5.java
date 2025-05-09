package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte BranchBlock = 5;
    public static final byte Const = 3;
    public static final byte Event = 6;
    public static final byte Method = 1;
    public static final byte None = 0;
    public static final byte Script = 7;
    public static final byte SerialBlock = 4;
    public static final byte Var = 2;

    /* renamed from: a  reason: collision with root package name */
    public List<fw5> f19569a;
    public long b;
    public short c;
    public String d;

    static {
        t2o.a(444596700);
    }

    public void a(fw5 fw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1fcface", new Object[]{this, fw5Var});
        } else if (fw5Var != null) {
            if (this.f19569a == null) {
                this.f19569a = new ArrayList();
            }
            this.f19569a.add(fw5Var);
        }
    }

    public Object b(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f85463f", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        return this.d;
    }

    public short c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ac82fe", new Object[]{this})).shortValue();
        }
        return this.c;
    }

    public void d(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badc20", new Object[]{this, new Short(s)});
        } else {
            this.c = s;
        }
    }

    public String toString() {
        Object obj;
        Iterator it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.d)) {
            obj = Long.valueOf(this.b);
        } else {
            obj = this.d;
        }
        sb.append(obj);
        sb.append(":");
        String sb2 = sb.toString();
        List<fw5> list = this.f19569a;
        if (list != null) {
            while (((ArrayList) list).iterator().hasNext()) {
                sb2 = sb2 + ((fw5) it.next()).toString();
            }
        }
        return sb2;
    }
}
