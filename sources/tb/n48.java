package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.impl.config.a;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n48 extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    public String f24502a = "";

    public n48() {
        this.changeType = ChangeType.DYNAMIC_FEATURE;
    }

    public static List<n48> a(Context context) {
        String a2;
        SharedPreferences b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("607e22ae", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        try {
            a2 = a.a();
            b = b(context, "dynamicdeploy_features_" + a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (b == null) {
            return arrayList;
        }
        Set<String> stringSet = b.getStringSet("deploy_versions", new HashSet());
        SharedPreferences b2 = b(context, "dynamicdeploy_features_tinct");
        Set<String> stringSet2 = b2.getStringSet("deploy_versions_" + a2, new HashSet());
        Log.e("ChangeDataManager", "deployVersions: " + stringSet + " bakDeployVersions: " + stringSet2);
        if (!stringSet.isEmpty()) {
            for (String str : stringSet) {
                if (!TextUtils.isEmpty(str) && !stringSet2.contains(str)) {
                    n48 n48Var = new n48();
                    n48Var.f24502a = str;
                    n48Var.b = b.getBoolean("beta_" + str, false);
                    arrayList.add(n48Var);
                }
            }
            b2.edit().clear().apply();
            SharedPreferences.Editor edit = b2.edit();
            edit.putStringSet("deploy_versions_" + a2, stringSet).apply();
        }
        return arrayList;
    }

    public static SharedPreferences b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3cdb9bc2", new Object[]{context, str});
        }
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(n48 n48Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/DynamicChangeInfo");
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f3b675", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.f24502a);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f1ec9c5", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        String str = this.f24502a;
        return "dynamic|bundle|" + str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DynamicChangeInfo{hasChange='" + c() + "', isBeta=" + this.b + '}';
    }
}
