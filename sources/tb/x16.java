package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x16<Data> implements pic<Data> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Set<Integer> f31070a;
    public Set<Integer> b;
    public int[] c;
    public final Map<Integer, Data> d;
    public final Map<Integer, Integer> e;
    public int f;

    static {
        t2o.a(444597092);
        t2o.a(444597091);
    }

    public x16() {
        this(10);
    }

    public static int q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e62c61ea", new Object[]{new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > 2147483639) {
            return Integer.MAX_VALUE;
        } else {
            return 2147483639;
        }
    }

    @Override // tb.pic
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07828c4", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i <= this.f - 1 && !this.b.contains(Integer.valueOf(i))) {
            this.f31070a.add(Integer.valueOf(i));
            this.b.add(Integer.valueOf(i));
        }
    }

    @Override // tb.pic
    public void b(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70812ce2", new Object[]{this, data});
            return;
        }
        int indexOf = indexOf(data);
        if (indexOf >= 0) {
            this.f31070a.remove(Integer.valueOf(indexOf));
            this.b.add(Integer.valueOf(indexOf));
        }
    }

    @Override // tb.pic
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a9ec27", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i <= this.f - 1 && this.f31070a.contains(Integer.valueOf(i))) {
            this.f31070a.remove(Integer.valueOf(i));
        }
    }

    @Override // tb.pic
    public boolean contains(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, data})).booleanValue();
        }
        if (indexOf(data) > -1) {
            return true;
        }
        return false;
    }

    @Override // tb.pic
    public Data d(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("9034df3b", new Object[]{this, data});
        }
        int indexOf = indexOf(data);
        if (indexOf < 0) {
            return null;
        }
        return l(indexOf + 1);
    }

    @Override // tb.pic
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20ae87e", new Object[]{this});
            return;
        }
        this.b.clear();
        this.b.addAll(this.f31070a);
    }

    @Override // tb.pic
    public Data f(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("d1ed762d", new Object[]{this, data});
        }
        int indexOf = indexOf(data);
        if (indexOf < 0) {
            return null;
        }
        this.f31070a.remove(Integer.valueOf(indexOf));
        return l(indexOf + 1);
    }

    @Override // tb.pic
    public List<Data> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf33025a", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.b) {
            Data data = get(num.intValue());
            if (data != null) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    @Override // tb.pic
    public Data get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i > this.f - 1) {
            return null;
        }
        return (Data) ((HashMap) this.d).get(Integer.valueOf(this.c[i]));
    }

    @Override // tb.pic
    public Data h() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("4e6058b5", new Object[]{this});
        }
        int size = size() - 1;
        if (size >= 0 && (iArr = this.c) != null) {
            return (Data) ((HashMap) this.d).get(Integer.valueOf(iArr[size]));
        }
        return null;
    }

    @Override // tb.pic
    public List<Data> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9a521c87", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            Object obj = ((HashMap) this.d).get(Integer.valueOf(i));
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // tb.pic
    public int indexOf(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e3a7a1f", new Object[]{this, data})).intValue();
        }
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(data.hashCode()));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // tb.pic
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.pic
    public void j(int i, List<Data> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562b7973", new Object[]{this, new Integer(i), list});
            return;
        }
        o(this.f + list.size());
        for (Data data : list) {
            r(i, data);
        }
    }

    @Override // tb.pic
    public Integer k(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("63c89ba0", new Object[]{this, data});
        }
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(data.hashCode()));
        if (num != null && num.intValue() >= 0 && num.intValue() <= this.f - 1) {
            return Integer.valueOf(m(data, this.c[num.intValue()]));
        }
        return null;
    }

    public final Data l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("5cd5d2e3", new Object[]{this, new Integer(i)});
        }
        while (this.b.contains(Integer.valueOf(i)) && i < this.f) {
            i++;
        }
        Data data = get(i);
        if (data != null) {
            this.b.add(Integer.valueOf(i));
            this.f31070a.add(Integer.valueOf(i));
        }
        return data;
    }

    public int m(Data data, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36110327", new Object[]{this, data, new Integer(i)})).intValue();
        }
        return (i / data.hashCode()) - 1;
    }

    public int n(int i, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("579d6d4b", new Object[]{this, new Integer(i), data})).intValue();
        }
        return data.hashCode() * (i + 1);
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633ae687", new Object[]{this, new Integer(i)});
        } else if (i - this.c.length > 0) {
            p(i);
        }
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74e8729", new Object[]{this, new Integer(i)});
            return;
        }
        int length = this.c.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = q(i);
        }
        this.c = Arrays.copyOf(this.c, i2);
    }

    @Override // tb.pic
    public List<Data> peek() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef96f1a5", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f31070a) {
            Data data = get(num.intValue());
            if (data != null) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    public final void r(int i, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d463aa61", new Object[]{this, new Integer(i), data});
            return;
        }
        ((HashMap) this.d).put(Integer.valueOf(n(i, data)), data);
        ((HashMap) this.e).put(Integer.valueOf(data.hashCode()), Integer.valueOf(this.f));
        int[] iArr = this.c;
        int i2 = this.f;
        this.f = 1 + i2;
        iArr[i2] = n(i, data);
    }

    @Override // tb.pic
    public Data remove(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, data});
        }
        return s(indexOf(data));
    }

    @Override // tb.pic
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            t(null);
        }
    }

    public Data s(int i) {
        Data data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i > this.f - 1 || (data = (Data) ((HashMap) this.d).remove(Integer.valueOf(this.c[i]))) == null) {
            return null;
        }
        int i2 = (this.f - i) - 1;
        this.f31070a.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
        ((HashMap) this.e).remove(Integer.valueOf(data.hashCode()));
        if (i2 > 0) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i + 1, iArr, i, i2);
            for (Map.Entry entry : ((HashMap) this.e).entrySet()) {
                if (((Integer) entry.getValue()).intValue() > i) {
                    ((HashMap) this.e).put(entry.getKey(), Integer.valueOf(((Integer) entry.getValue()).intValue() - 1));
                }
            }
            this.f31070a = u(this.f31070a, i);
            this.b = u(this.b, i);
        }
        int[] iArr2 = this.c;
        int i3 = this.f - 1;
        this.f = i3;
        iArr2[i3] = 0;
        return data;
    }

    @Override // tb.pic
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void t(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67898347", new Object[]{this, list});
            return;
        }
        this.b.clear();
        this.f31070a.clear();
        if (list != null) {
            for (Integer num : list) {
                Integer valueOf = Integer.valueOf(Math.max(num.intValue(), 0));
                this.f31070a.add(valueOf);
                this.b.add(valueOf);
            }
        }
    }

    public final Set<Integer> u(Set<Integer> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("81522693", new Object[]{this, set, new Integer(i)});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Integer num : set) {
            int intValue = num.intValue();
            if (intValue > i) {
                intValue--;
            }
            linkedHashSet.add(Integer.valueOf(intValue));
        }
        return linkedHashSet;
    }

    public x16(int i) {
        this.f31070a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.d = new HashMap();
        this.e = new HashMap();
        this.c = new int[i];
    }
}
