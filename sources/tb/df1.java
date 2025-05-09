package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class df1 extends AsyncTask<Object, Object, Map<String, Map<String, String>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, String>> f17768a;

    public df1(Map<String, Map<String, String>> map) {
        this.f17768a = map;
    }

    public static /* synthetic */ Object ipc$super(df1 df1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ju/track/csv/AsyncUtCsvLoader");
    }

    /* renamed from: a */
    public Map<String, Map<String, String>> doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("844ce261", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if (obj instanceof Context) {
                Object obj2 = objArr[1];
                if (obj2 instanceof String) {
                    return new cvv().a((Context) obj, (String) obj2);
                }
            }
        }
        return new HashMap();
    }

    /* renamed from: b */
    public void onPostExecute(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c677108", new Object[]{this, map});
            return;
        }
        if (!(this.f17768a == null || map == null || map.size() <= 0)) {
            this.f17768a.clear();
            this.f17768a.putAll(map);
        }
        String simpleName = df1.class.getSimpleName();
        Map<String, Map<String, String>> map2 = this.f17768a;
        igh.a("df1", "loadPrams-Success", simpleName, Integer.valueOf(map2 != null ? map2.size() : 0));
    }
}
