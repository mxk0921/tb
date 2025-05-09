package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cfn extends bjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f17030a = new LinkedList();
    public final List<com.alibaba.android.ultron.ext.vlayout.a> b = new LinkedList();
    public final List<com.alibaba.android.ultron.ext.vlayout.a> c = new LinkedList();
    public b[] d = null;
    public final Comparator<b> e = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Comparator<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cfn cfnVar) {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc1ae9f", new Object[]{this, bVar, bVar2})).intValue();
            }
            return bVar.b() - bVar2.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.alibaba.android.ultron.ext.vlayout.a f17031a;

        static {
            t2o.a(156237955);
        }

        public b(com.alibaba.android.ultron.ext.vlayout.a aVar) {
            this.f17031a = aVar;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c2e9f68", new Object[]{this})).intValue();
            }
            return this.f17031a.n().e().intValue();
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85a27def", new Object[]{this})).intValue();
            }
            return this.f17031a.n().d().intValue();
        }
    }

    static {
        t2o.a(156237953);
    }

    public static /* synthetic */ Object ipc$super(cfn cfnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/RangeLayoutHelperFinder");
    }

    @Override // tb.bjg
    public com.alibaba.android.ultron.ext.vlayout.a a(int i) {
        b bVar;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.ext.vlayout.a) ipChange.ipc$dispatch("34977710", new Object[]{this, new Integer(i)});
        }
        b[] bVarArr = this.d;
        if (bVarArr == null || bVarArr.length == 0) {
            return null;
        }
        int length = bVarArr.length - 1;
        while (true) {
            if (i2 > length) {
                bVar = null;
                break;
            }
            int i3 = (i2 + length) / 2;
            bVar = this.d[i3];
            if (bVar.b() <= i) {
                if (bVar.a() >= i) {
                    if (bVar.b() <= i && bVar.a() >= i) {
                        break;
                    }
                } else {
                    i2 = i3 + 1;
                }
            } else {
                length = i3 - 1;
            }
        }
        if (bVar == null) {
            return null;
        }
        return bVar.f17031a;
    }

    @Override // tb.bjg
    public List<com.alibaba.android.ultron.ext.vlayout.a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efcada7b", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.bjg
    public List<com.alibaba.android.ultron.ext.vlayout.a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f95f7cbe", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.bjg
    public void d(List<com.alibaba.android.ultron.ext.vlayout.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c26dbf", new Object[]{this, list});
            return;
        }
        ((LinkedList) this.b).clear();
        ((LinkedList) this.c).clear();
        ((LinkedList) this.f17030a).clear();
        if (list != null) {
            ListIterator<com.alibaba.android.ultron.ext.vlayout.a> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                com.alibaba.android.ultron.ext.vlayout.a next = listIterator.next();
                ((LinkedList) this.b).add(next);
                ((LinkedList) this.f17030a).add(new b(next));
            }
            while (listIterator.hasPrevious()) {
                ((LinkedList) this.c).add(listIterator.previous());
            }
            LinkedList linkedList = (LinkedList) this.f17030a;
            b[] bVarArr = (b[]) linkedList.toArray(new b[linkedList.size()]);
            this.d = bVarArr;
            Arrays.sort(bVarArr, this.e);
        }
    }
}
