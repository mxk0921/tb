package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class skl extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<b> k;
    public int l;
    public int m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(skl sklVar) {
        }

        /* renamed from: b */
        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d1e7be6", new Object[]{this, obj});
            }
            JSONObject jSONObject = (JSONObject) obj;
            b bVar = new b();
            bVar.f28116a = jSONObject.getString("name");
            bVar.b = jSONObject.getInteger("number").intValue();
            return bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f28116a;
        public int b;

        static {
            t2o.a(912262519);
        }
    }

    static {
        t2o.a(912262517);
    }

    public skl(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(skl sklVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/PackingListViewModel");
    }

    @Override // tb.md7
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return this.b + "";
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        ArrayList<b> arrayList = this.k;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        if (!TextUtils.isEmpty(jSONObject.getString("maxNoMoreRows"))) {
            this.l = Integer.parseInt(jSONObject.getString("maxNoMoreRows"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("maxShowRows"))) {
            this.m = Integer.parseInt(jSONObject.getString("maxShowRows"));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("infoList");
        if (jSONArray != null) {
            this.k = uf7.a(jSONArray, new a(this));
        }
    }
}
