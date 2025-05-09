package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class teg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28661a;
    public final JSONObject b;
    public final List<peg> c;
    public final List<ydg> d;
    public final String e;

    static {
        t2o.a(295699217);
    }

    public teg(String str, JSONObject jSONObject, List<peg> list, List<ydg> list2, String str2) {
        this.f28661a = str;
        this.b = jSONObject;
        this.c = list;
        this.d = list2;
        this.e = str2;
    }

    public boolean a() {
        List<peg> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f614f7", new Object[]{this})).booleanValue();
        }
        if (this.b == null || (list = this.c) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b80f3a", new Object[]{this});
        }
        return this.e;
    }

    public List<ydg> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1dc3c344", new Object[]{this});
        }
        return this.d;
    }

    public peg d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (peg) ipChange.ipc$dispatch("904268ba", new Object[]{this, str});
        }
        List<peg> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (peg pegVar : this.c) {
                if (TextUtils.equals(pegVar.c, str)) {
                    return pegVar;
                }
            }
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eec3fba7", new Object[]{this});
        }
        return this.f28661a;
    }
}
