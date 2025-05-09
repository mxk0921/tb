package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rql extends nb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPLIT_MARK_4_TYPES = "&";
    public final StringBuilder i = new StringBuilder();
    public List<nb4> j;

    static {
        t2o.a(912261542);
    }

    public rql(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(rql rqlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/ParentComponentData");
    }

    public void o(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb085aca", new Object[]{this, nb4Var});
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        nb4Var.h = this;
        this.j.add(nb4Var);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d79a0e50", new Object[]{this});
        }
        StringBuilder sb = this.i;
        sb.delete(0, sb.length());
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            StringBuilder sb2 = this.i;
            sb2.append("&");
            sb2.append(((nb4) it.next()).c);
        }
        if (this.i.length() > 0) {
            this.i.deleteCharAt(0);
        }
        return this.i.toString();
    }

    public <T extends nb4> T q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((nb4) ipChange.ipc$dispatch("501bd1b7", new Object[]{this, new Integer(i)}));
        }
        List<nb4> list = this.j;
        if (list == null) {
            return null;
        }
        return (T) ((nb4) ((ArrayList) list).get(i));
    }

    public <T extends nb4> List<T> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        List<T> list = (List<T>) this.j;
        if (list == null) {
            return null;
        }
        return list;
    }

    public rql(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
    }
}
