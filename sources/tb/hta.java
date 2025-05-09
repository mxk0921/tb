package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hta implements bta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap<String, String> f20883a = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // tb.gta
    public byte[] getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8fb14ed3", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gta
    public String getFieldValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e98f502", new Object[]{this, str});
        }
        String str2 = this.f20883a.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // tb.gta
    public boolean hasFieldValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3edaa6", new Object[]{this, str})).booleanValue();
        }
        return this.f20883a.containsKey(str);
    }

    @Override // tb.gta
    public Iterator<String> iterateHttpFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("f32d7bb5", new Object[]{this});
        }
        return Collections.unmodifiableSet(this.f20883a.keySet()).iterator();
    }

    @Override // tb.bta
    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            this.f20883a.put(str, str2);
        }
    }
}
