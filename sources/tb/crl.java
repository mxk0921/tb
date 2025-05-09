package tb;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class crl extends AsyncTask<Void, Void, List<EffectResConfig>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtmosphereResListResponseData.AtmosphereResItem f17262a;
    public final SparseArray<HashMap<String, List<EffectResConfig>>> b;
    public final HashMap<String, List<EffectResConfig>> c;

    static {
        t2o.a(295699420);
    }

    public crl(ux9 ux9Var, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, SparseArray<HashMap<String, List<EffectResConfig>>> sparseArray, HashMap<String, List<EffectResConfig>> hashMap) {
        this.f17262a = atmosphereResItem;
        this.b = sparseArray;
        this.c = hashMap;
    }

    public static /* synthetic */ Object ipc$super(crl crlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/atmosphere/ParseEffectResTask");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0 A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ec, blocks: (B:51:0x00e8, B:55:0x00f0), top: B:60:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig> doInBackground(java.lang.Void... r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.crl.doInBackground(java.lang.Void[]):java.util.List");
    }

    /* renamed from: b */
    public void onPostExecute(List<EffectResConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
        } else if (list != null) {
            HashMap<String, List<EffectResConfig>> hashMap = new HashMap<>();
            hashMap.put(this.f17262a.matchKey, list);
            this.c.putAll(hashMap);
            this.b.put(this.f17262a.resUrl.hashCode(), hashMap);
        }
    }

    public crl(ux9 ux9Var, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, SparseArray<HashMap<String, List<EffectResConfig>>> sparseArray, HashMap<String, List<EffectResConfig>> hashMap, s98 s98Var) {
        this.f17262a = atmosphereResItem;
        this.b = sparseArray;
        this.c = hashMap;
    }
}
