package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class max {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<lax> f23905a = new ArrayList<>();

    static {
        t2o.a(961544355);
    }

    public static void a(StringBuilder sb, List<Object> list, lax laxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650ae067", new Object[]{sb, list, laxVar});
            return;
        }
        laxVar.a(sb);
        laxVar.b(list);
    }

    public static lax c(lax laxVar, lax laxVar2, lax... laxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lax) ipChange.ipc$dispatch("a91179dd", new Object[]{laxVar, laxVar2, laxVarArr});
        }
        return d(" OR ", laxVar, laxVar2, laxVarArr);
    }

    public static lax d(String str, lax laxVar, lax laxVar2, lax... laxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lax) ipChange.ipc$dispatch("cbdd6f0a", new Object[]{str, laxVar, laxVar2, laxVarArr});
        }
        StringBuilder sb = new StringBuilder(f7l.BRACKET_START_STR);
        ArrayList arrayList = new ArrayList();
        a(sb, arrayList, laxVar);
        sb.append(str);
        a(sb, arrayList, laxVar2);
        for (lax laxVar3 : laxVarArr) {
            sb.append(str);
            a(sb, arrayList, laxVar3);
        }
        sb.append(')');
        return new lax(sb.toString(), arrayList.toArray());
    }

    public lax b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lax) ipChange.ipc$dispatch("4916523c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ListIterator<lax> listIterator = this.f23905a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            a(sb, arrayList, listIterator.next());
        }
        return new lax(sb.toString(), arrayList.toArray());
    }

    public lax e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lax) ipChange.ipc$dispatch("a01f0dc6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (this.f23905a.size() > 0) {
            sb.append(f7l.BRACKET_START_STR);
        }
        ListIterator<lax> listIterator = this.f23905a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            a(sb, arrayList, listIterator.next());
        }
        if (this.f23905a.size() > 0) {
            sb.append(f7l.BRACKET_END_STR);
        }
        return new lax(sb.toString(), arrayList.toArray());
    }

    public max f(lax laxVar, lax... laxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (max) ipChange.ipc$dispatch("5b5b7045", new Object[]{this, laxVar, laxVarArr});
        }
        this.f23905a.add(laxVar);
        if (laxVarArr != null && laxVarArr.length > 0) {
            Collections.addAll(this.f23905a, laxVarArr);
        }
        return this;
    }

    public max g(lax laxVar, lax laxVar2, lax... laxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (max) ipChange.ipc$dispatch("ce56c91f", new Object[]{this, laxVar, laxVar2, laxVarArr});
        }
        this.f23905a.add(c(laxVar, laxVar2, laxVarArr));
        return this;
    }
}
