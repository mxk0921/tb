package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19323a;
    public final String b;
    public final List<String> c;
    public final List<String> d;
    public final List<SectionModel> e;

    static {
        t2o.a(487588010);
    }

    public fix(String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<SectionModel> list3, int i, int i2) {
        this.f19323a = str3;
        this.b = str4;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e4c4e8", new Object[]{this});
        }
        return this.f19323a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("704e4310", new Object[]{this});
        }
        return this.b;
    }

    public List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39e3708f", new Object[]{this});
        }
        return this.c;
    }

    public List<SectionModel> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5323ca4b", new Object[]{this});
        }
        return this.e;
    }

    public List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e4b2496b", new Object[]{this});
        }
        return this.d;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dac814be", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ad1b68", new Object[]{this})).intValue();
        }
        return 0;
    }
}
