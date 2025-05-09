package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pzm extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int k;
    public int l;
    public ArrayList<b> m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.pzm$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1033a implements zf8<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1033a(a aVar) {
            }

            /* renamed from: b */
            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
                }
                return (String) obj;
            }
        }

        public a(pzm pzmVar) {
        }

        /* renamed from: b */
        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("51626933", new Object[]{this, obj});
            }
            JSONObject jSONObject = (JSONObject) obj;
            b bVar = new b();
            bVar.f26413a = jSONObject.getString("name");
            bVar.b = jSONObject.getString("content");
            bVar.c = uf7.a(jSONObject.getJSONArray("image"), new C1033a(this));
            return bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f26413a;
        public String b;
        public ArrayList<String> c;

        static {
            t2o.a(912262527);
        }
    }

    static {
        t2o.a(912262524);
    }

    public pzm(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(pzm pzmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/ProductInfoViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        ArrayList<b> arrayList = this.m;
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
        this.k = jSONObject.getIntValue("maxNoMoreRows");
        this.l = jSONObject.getIntValue("maxShowRows");
        JSONArray jSONArray = jSONObject.getJSONArray("infoList");
        if (jSONArray != null) {
            this.m = uf7.a(jSONArray, new a(this));
        }
    }
}
