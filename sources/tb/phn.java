package tb;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.detail.rate.view.SkuDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import tb.svp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class phn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SkuDialog f26102a;
    public JSONArray b;
    public svp.c d;
    public final Set<String> c = new LinkedHashSet();
    public final Map<Integer, String> e = new LinkedHashMap();
    public final Map<Integer, String> f = new LinkedHashMap();
    public final uqd g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements uqd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.uqd
        public final void a(int i, String str, boolean z, int i2, Object obj) {
            boolean z2 = z;
            int i3 = i2;
            int i4 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eea9e556", new Object[]{this, new Integer(i), str, new Boolean(z2), new Integer(i3), obj});
            } else if (obj instanceof JSONObject) {
                JSONArray g = phn.this.g();
                if (g != null) {
                    JSONObject jSONObject = g.getJSONObject(i);
                    if ((jSONObject != null ? jSONObject.getJSONArray(pg1.ATOM_values) : null) != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(pg1.ATOM_values);
                        ckf.f(jSONArray, pg1.ATOM_values);
                        int size = jSONArray.size();
                        while (i4 < size) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                            if (jSONObject2 != null) {
                                if (i3 != i4) {
                                    jSONObject2.put((JSONObject) mf6.TYPE_SELECTED, (String) Boolean.FALSE);
                                } else if (z2) {
                                    jSONObject2.put((JSONObject) mf6.TYPE_SELECTED, (String) Boolean.TRUE);
                                    Map c = phn.c(phn.this);
                                    Integer valueOf = Integer.valueOf(i);
                                    JSONObject jSONObject3 = (JSONObject) obj;
                                    String string = jSONObject3.getString(MspEventTypes.ACTION_STRING_VID);
                                    ckf.f(string, "result.getString(\"vid\")");
                                    c.put(valueOf, string);
                                    Map d = phn.d(phn.this);
                                    Integer valueOf2 = Integer.valueOf(i);
                                    String string2 = jSONObject3.getString("name");
                                    ckf.f(string2, "result.getString(\"name\")");
                                    d.put(valueOf2, string2);
                                } else {
                                    jSONObject2.put((JSONObject) mf6.TYPE_SELECTED, (String) Boolean.FALSE);
                                    phn.c(phn.this).remove(Integer.valueOf(i));
                                    phn.d(phn.this).remove(Integer.valueOf(i));
                                }
                                jSONArray.set(i4, jSONObject2);
                            }
                            i4++;
                            z2 = z;
                            i3 = i2;
                        }
                        jSONObject.put((JSONObject) pg1.ATOM_values, (String) jSONArray);
                        g.set(i, jSONObject);
                    }
                    phn.a(phn.this, i);
                }
            } else if (obj instanceof String) {
                if (tsq.x("confirm", obj.toString(), true)) {
                    JSONObject jSONObject4 = new JSONObject();
                    if (phn.c(phn.this) != null) {
                        if (!phn.c(phn.this).isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            for (Map.Entry entry : phn.c(phn.this).entrySet()) {
                                sb.append((String) entry.getValue());
                                sb.append("#");
                            }
                            jSONObject4.put((JSONObject) "vids", sb.substring(0, sb.length() - 1));
                        }
                        if (!phn.d(phn.this).isEmpty()) {
                            StringBuilder sb2 = new StringBuilder();
                            for (Map.Entry entry2 : phn.d(phn.this).entrySet()) {
                                sb2.append((String) entry2.getValue());
                                sb2.append("#");
                            }
                            jSONObject4.put((JSONObject) "name", sb2.substring(0, sb2.length() - 1));
                        }
                    }
                    svp.c b = phn.b(phn.this);
                    if (b != null) {
                        b.a(jSONObject4);
                    }
                } else if (tsq.x(DMComponent.RESET, obj.toString(), true)) {
                    phn.e(phn.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements rqd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(JSONObject jSONObject) {
        }

        @Override // tb.rqd
        public final void init() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
            } else {
                phn.a(phn.this, -1);
            }
        }
    }

    public static final /* synthetic */ void a(phn phnVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df615a30", new Object[]{phnVar, new Integer(i)});
        } else {
            phnVar.f(i);
        }
    }

    public static final /* synthetic */ svp.c b(phn phnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svp.c) ipChange.ipc$dispatch("6a091abd", new Object[]{phnVar});
        }
        return phnVar.d;
    }

    public static final /* synthetic */ Map c(phn phnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91973b50", new Object[]{phnVar});
        }
        return phnVar.e;
    }

    public static final /* synthetic */ Map d(phn phnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd8fdb05", new Object[]{phnVar});
        }
        return phnVar.f;
    }

    public static final /* synthetic */ void e(phn phnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b975b", new Object[]{phnVar});
        } else {
            phnVar.j();
        }
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2a65997b", new Object[]{this});
        }
        return this.b;
    }

    public final boolean h(Map<Integer, String> map, String str, String str2, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b86a88", new Object[]{this, map, str, str2, new Integer(i)})).booleanValue();
        }
        if (!wsq.O(str2, str, false, 2, null)) {
            return false;
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            String value = entry.getValue();
            if (i != intValue && !wsq.O(str2, value, false, 2, null)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean i(String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("588f22e0", new Object[]{this, str, map})).booleanValue();
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (ckf.b(entry.getValue(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f27e41c", new Object[]{this, new Integer(i)});
        } else if (this.f26102a != null && this.c.size() != 0 && (jSONArray = this.b) != null) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i != i2) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    ArrayList arrayList = new ArrayList();
                    if (!(jSONObject == null || (jSONArray2 = jSONObject.getJSONArray(pg1.ATOM_values)) == null || jSONArray2.size() <= 0)) {
                        int size2 = jSONArray2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                            if (jSONObject2 != null) {
                                String string = jSONObject2.getString(MspEventTypes.ACTION_STRING_VID);
                                ckf.f(string, MspEventTypes.ACTION_STRING_VID);
                                if (!i(string, this.e)) {
                                    Iterator<String> it = this.c.iterator();
                                    boolean z = false;
                                    while (it.hasNext() && !(z = h(this.e, string, it.next(), i2))) {
                                    }
                                    if (!z) {
                                        arrayList.add(Integer.valueOf(i3));
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        SkuDialog skuDialog = this.f26102a;
                        if (skuDialog != null) {
                            skuDialog.J2(i2, false, arrayList);
                        }
                    } else {
                        SkuDialog skuDialog2 = this.f26102a;
                        if (skuDialog2 != null) {
                            skuDialog2.J2(i2, false, new ArrayList());
                        }
                    }
                }
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e1b69f", new Object[]{this});
            return;
        }
        SkuDialog skuDialog = this.f26102a;
        if (skuDialog != null) {
            skuDialog.D2();
        }
        ((LinkedHashMap) this.e).clear();
        ((LinkedHashMap) this.f).clear();
        if (this.b == null) {
            this.b = new JSONArray();
        }
        JSONArray jSONArray = this.b;
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ((jSONObject != null ? jSONObject.getJSONArray(pg1.ATOM_values) : null) != null) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray(pg1.ATOM_values);
                    ckf.f(jSONArray2, pg1.ATOM_values);
                    int size2 = jSONArray2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        if (jSONObject2 != null) {
                            jSONObject2.put((JSONObject) mf6.TYPE_SELECTED, (String) Boolean.FALSE);
                        }
                        jSONArray2.set(i2, jSONObject2);
                    }
                }
            }
        }
    }

    public void k(Fragment fragment, JSONArray jSONArray, JSONObject jSONObject, JSONArray jSONArray2, JSONObject jSONObject2, svp.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a143a885", new Object[]{this, fragment, jSONArray, jSONObject, jSONArray2, jSONObject2, cVar});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(cVar, DataReceiveMonitor.CB_LISTENER);
        this.d = cVar;
        this.b = jSONArray2;
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                ckf.f(jSONObject3, "requestSkuData.getJSONObject(index)");
                if (jSONObject3.getIntValue("count") > 0 && !TextUtils.isEmpty(jSONObject3.getString("skuStr"))) {
                    Set<String> set = this.c;
                    String string = jSONObject3.getString("skuStr");
                    ckf.f(string, "item.getString(\"skuStr\")");
                    set.add(string);
                }
            }
        }
        if (this.f26102a == null) {
            SkuDialog skuDialog = new SkuDialog();
            this.f26102a = skuDialog;
            skuDialog.M2(jSONObject2);
            skuDialog.O2(this.g);
            skuDialog.Q2(new b(jSONObject2));
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            j();
        } else {
            String string2 = jSONObject.getString("vids");
            String string3 = jSONObject.getString("name");
            ckf.f(string2, "vids");
            Object[] array = wsq.z0(string2, new String[]{"#"}, false, 0, 6, null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                ckf.f(string3, "names");
                Object[] array2 = wsq.z0(string3, new String[]{"#"}, false, 0, 6, null).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    ((LinkedHashMap) this.e).clear();
                    ((LinkedHashMap) this.f).clear();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        this.e.put(Integer.valueOf(i2), strArr[i2]);
                        this.f.put(Integer.valueOf(i2), strArr2[i2]);
                    }
                    if (jSONArray2 != null) {
                        Iterator<Integer> it = yz3.j(jSONArray2).iterator();
                        while (((zdf) it).hasNext()) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(((tdf) it).nextInt());
                            if ((jSONObject4 != null ? jSONObject4.getJSONArray(pg1.ATOM_values) : null) != null) {
                                JSONArray jSONArray3 = jSONObject4.getJSONArray(pg1.ATOM_values);
                                ckf.f(jSONArray3, pg1.ATOM_values);
                                int size2 = jSONArray3.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
                                    if (jSONObject5 != null) {
                                        jSONObject5.put((JSONObject) mf6.TYPE_SELECTED, (String) Boolean.valueOf(((LinkedHashMap) this.e).containsValue(jSONObject5.getString(MspEventTypes.ACTION_STRING_VID))));
                                    }
                                    jSONArray3.set(i3, jSONObject5);
                                }
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        SkuDialog skuDialog2 = this.f26102a;
        if (skuDialog2 != null) {
            skuDialog2.K2(this.b);
        }
        SkuDialog skuDialog3 = this.f26102a;
        if (skuDialog3 != null) {
            skuDialog3.show(fragment.getFragmentManager(), "SKU_DIALOG");
        }
    }
}
