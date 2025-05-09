package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class da3 extends ju {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_KEY_ANIMATION_FIELDS = "animationFields";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17675a;
        public final /* synthetic */ RecyclerView b;

        public a(int i, RecyclerView recyclerView) {
            this.f17675a = i;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                int n0 = da3.this.f22215a.e().n0(this.f17675a);
                int measuredHeight = this.b.getMeasuredHeight() / 3;
                if (n0 > measuredHeight) {
                    ((LinearLayoutManager) this.b.getLayoutManager()).scrollToPositionWithOffset(this.f17675a, measuredHeight);
                }
            } catch (Exception e) {
                e.printStackTrace();
                hav.a("CartAutoScrollAbility", "iCart scroll exception:" + e.getMessage());
            }
        }
    }

    static {
        t2o.a(479199255);
    }

    public da3(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(da3 da3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/CartAutoScrollAbility");
    }

    public int a(String str) {
        zxb zxbVar;
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6d24662", new Object[]{this, str})).intValue();
        }
        if (!TextUtils.isEmpty(str) && (zxbVar = this.b) != null && (a2 = zxbVar.d().a()) != null && !a2.isEmpty()) {
            for (int i = 0; i < a2.size(); i++) {
                IDMComponent iDMComponent = a2.get(i);
                if (iDMComponent != null && iDMComponent.isNormalComponent() && str.equals(iDMComponent.getKey())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean b(int i) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ad2638", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || (recyclerView = (RecyclerView) this.f22215a.e().o()) == null) {
            return false;
        }
        recyclerView.post(new a(i, recyclerView));
        return true;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9da11ebd", new Object[]{this, str})).booleanValue();
        }
        int a2 = a(str);
        if (a2 == -1) {
            return false;
        }
        return b(a2);
    }

    public boolean d(String str, JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b10aa54", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (this.b.c().getComponentByName(str) == null || (a2 = a(str)) == -1) {
            return false;
        }
        e(str, jSONObject);
        return b(a2);
    }

    public void e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95520956", new Object[]{this, str, jSONObject});
            return;
        }
        IDMComponent componentByName = this.b.c().getComponentByName(str);
        if (componentByName != null && (jSONObject2 = jSONObject.getJSONObject(PARAMS_KEY_ANIMATION_FIELDS)) != null) {
            componentByName.getFields().putAll(jSONObject2);
            this.f22215a.e().z0(componentByName);
        }
    }
}
