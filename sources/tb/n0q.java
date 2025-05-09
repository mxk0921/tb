package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n0q extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<SizeChartItemModel> k;
    public String l = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<SizeChartItemModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.n0q$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1001a implements zf8<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1001a(a aVar) {
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

        public a(n0q n0qVar) {
        }

        /* renamed from: b */
        public SizeChartItemModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SizeChartItemModel) ipChange.ipc$dispatch("7995c530", new Object[]{this, obj});
            }
            JSONObject jSONObject = (JSONObject) obj;
            SizeChartItemModel sizeChartItemModel = new SizeChartItemModel();
            sizeChartItemModel.title = jSONObject.getString("title");
            sizeChartItemModel.tip = jSONObject.getString("tip");
            sizeChartItemModel.maxLength = jSONObject.getInteger(Constants.Name.MAX_LENGTH).intValue();
            sizeChartItemModel.rowData = uf7.a(jSONObject.getJSONArray("rowData"), new C1001a(this));
            return sizeChartItemModel;
        }
    }

    static {
        t2o.a(912262532);
    }

    public n0q(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(n0q n0qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/SizeChartViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
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
        JSONArray jSONArray = jSONObject.getJSONArray("columnData");
        if (jSONArray != null) {
            this.l = jSONObject.getString("tableTitle");
            this.k = uf7.a(jSONArray, new a(this));
        }
    }
}
