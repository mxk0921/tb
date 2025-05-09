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
public class n2m extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int k;
    public int l;
    public String m;
    public ArrayList<a> n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String LEFT = "left";
        public static final String RIGHT = "right";

        /* renamed from: a  reason: collision with root package name */
        public String f24468a;
        public String b;
        public float c;
        public float d;
        public String e;
        public String f;

        static {
            t2o.a(912262521);
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("87e94dee", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            a aVar = new a();
            aVar.f24468a = jSONObject.getString("url");
            aVar.b = jSONObject.getString("text");
            aVar.c = jSONObject.getFloatValue("x");
            aVar.d = jSONObject.getFloatValue("y");
            aVar.e = jSONObject.getString("direction");
            aVar.f = jSONObject.getString("itemId");
            return aVar;
        }
    }

    static {
        t2o.a(912262520);
    }

    public n2m(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(n2m n2mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/PicContainerModel");
    }

    @Override // tb.md7
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        if (this.h.size() <= 0) {
            return this.d;
        }
        return this.b + "";
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.m);
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.m = jSONObject.getString("picUrl");
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            this.l = jSONObject2.getIntValue("height");
            this.k = jSONObject2.getIntValue("width");
        }
        if (this.l <= 0 || this.k <= 0) {
            this.l = 1;
            this.k = 1;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("anchorPoints");
        if (jSONArray != null) {
            this.n = new ArrayList<>();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.n.add(a.a(jSONArray.getJSONObject(i)));
            }
        }
    }
}
