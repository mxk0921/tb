package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xdw extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWCONTAINERSTORAGEREMOVE = "4075834123623453115";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031769);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public xdw build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xdw) ipChange.ipc$dispatch("95cc9402", new Object[]{this, obj});
            }
            return new xdw();
        }
    }

    static {
        t2o.a(713031768);
    }

    public static /* synthetic */ Object ipc$super(xdw xdwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/pagestorage/ViewContainerStorageRemoveAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null) {
            return new b8(new a8(1, f4w.LOAD_DATA_NULL));
        }
        JSONObject h = n8Var.h();
        if (h == null) {
            return new b8(new a8(2, "params is null"));
        }
        String string = h.getString("key");
        if (TextUtils.isEmpty(string)) {
            return new b8(new a8(3, "key is empty"));
        }
        Context d = k8Var.d();
        if (d instanceof h4d) {
            ((h4d) d).y2(string);
        } else if (!(d instanceof FragmentActivity)) {
            return new b8(new a8(5, "context of ability do not implement IOrderPageStorage"));
        } else {
            ISupportFragment h2 = qxq.h(((FragmentActivity) d).getSupportFragmentManager());
            if (h2 instanceof h4d) {
                ((h4d) h2).y2(string);
            }
        }
        return new f8();
    }
}
