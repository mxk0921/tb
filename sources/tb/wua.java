package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wua extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER_TYPE = "headerPic";
    public static final String KEY_DRAG_END = "dragEnd";
    public static final String KEY_FEATURE = "feature";
    public static final String KEY_GROUPS = "groups";
    public static final String KEY_LIGHTOFF_LAYER = "lightoffLayer";
    public static final String KEY_LOCATORS = "locators";
    public static final String KEY_PROPERTIES = "properties";
    public static final String KEY_SMALL_WINDOW = "smallWindow";
    public nb4 k;
    public List<och> l;
    public List<xka> m;
    public List<tx9> n;
    public List<r4q> o;
    public nb4 p;
    public c1n q;
    public b8z r;

    static {
        t2o.a(912261536);
    }

    public wua(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        E(jSONObject, qdbVar);
    }

    public static /* synthetic */ Object ipc$super(wua wuaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/HeaderComponentData");
    }

    public nb4 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("51ba7e5", new Object[]{this});
        }
        return this.p;
    }

    public List<och> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57b043ed", new Object[]{this});
        }
        return this.l;
    }

    public c1n C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c1n) ipChange.ipc$dispatch("4886f886", new Object[]{this});
        }
        return this.q;
    }

    public final boolean D() {
        List<tx9> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0a95332", new Object[]{this})).booleanValue();
        }
        List<r4q> list2 = this.o;
        if ((list2 == null || ((ArrayList) list2).isEmpty()) && ((list = this.n) == null || ((ArrayList) list).isEmpty())) {
            return false;
        }
        return true;
    }

    public b8z F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8z) ipChange.ipc$dispatch("18de7761", new Object[]{this});
        }
        return this.r;
    }

    public final void s(r4q r4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e820d19", new Object[]{this, r4qVar});
            return;
        }
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(r4qVar);
    }

    public final void t(tx9 tx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d85bcf", new Object[]{this, tx9Var});
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(tx9Var);
    }

    public final void u(xka xkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3cab1a", new Object[]{this, xkaVar});
            return;
        }
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(xkaVar);
    }

    public final void v(och ochVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3e24d7", new Object[]{this, ochVar});
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(ochVar);
    }

    public List<r4q> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ca25447", new Object[]{this});
        }
        return this.o;
    }

    public List<tx9> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4c2199d", new Object[]{this});
        }
        return this.n;
    }

    public nb4 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("490b3d54", new Object[]{this});
        }
        return this.k;
    }

    public List<xka> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0879d6", new Object[]{this});
        }
        return this.m;
    }

    public final void E(JSONObject jSONObject, qdb qdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a3dead", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_DRAG_END);
        if (jSONObject2 != null) {
            this.k = new nb4(jSONObject2, qdbVar);
        }
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_LOCATORS);
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    v(new och(jSONObject3));
                }
            }
        }
        this.r = new b8z(jSONObject.getJSONObject("feature"));
        JSONArray jSONArray2 = jSONObject.getJSONArray("groups");
        if (jSONArray2 != null) {
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                if (jSONObject4 != null) {
                    u(new xka(jSONObject4, qdbVar));
                }
            }
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray(KEY_SMALL_WINDOW);
        if (jSONArray3 != null) {
            int size3 = jSONArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
                if (jSONObject5 != null) {
                    String string = jSONObject5.getString("type");
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("data");
                    if (jSONObject6 != null) {
                        if (TextUtils.equals("detailVideo", string)) {
                            t(new tx9(jSONObject6, qdbVar));
                        } else {
                            s(new r4q(jSONObject5, qdbVar));
                        }
                    }
                }
            }
            if (!D() && Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableCompatibleSmallWindow))) {
                int size4 = jSONArray3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    JSONObject jSONObject7 = jSONArray3.getJSONObject(i4);
                    if (jSONObject7 != null) {
                        t(new tx9(jSONObject7, qdbVar));
                    }
                }
            }
        }
        JSONObject jSONObject8 = jSONObject.getJSONObject(KEY_LIGHTOFF_LAYER);
        if (jSONObject8 != null) {
            this.p = new nb4(jSONObject8, qdbVar);
        }
        JSONObject jSONObject9 = jSONObject.getJSONObject(KEY_PROPERTIES);
        if (jSONObject9 != null) {
            this.q = new c1n(jSONObject9);
        }
        this.c = "native$headerPic";
    }
}
