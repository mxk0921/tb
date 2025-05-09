package tb;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.x8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31000a;
    public final String b;
    public final ven c;

    public wxn(Context context, String str, ven venVar) {
        this.f31000a = context;
        this.b = str;
        this.c = venVar;
    }

    public Map<String, tij> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d0d2f839", new Object[]{this, str});
        }
        return new a(this.c, this.b).h(str);
    }

    public Map<String, tij> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("809aab36", new Object[]{this, str});
        }
        kva.d("RemoteConfigPuller", "syncPullFromRemote: " + str);
        Response syncSend = new DegradableNetwork(this.f31000a).syncSend(new RequestImpl(str), this);
        if (syncSend == null || syncSend.getStatusCode() != 200) {
            kva.d("RemoteConfigPuller", "syncPullFromRemote: " + str + " failed");
            return null;
        }
        byte[] bytedata = syncSend.getBytedata();
        if (bytedata == null) {
            return null;
        }
        String str2 = new String(bytedata);
        if (!TextUtils.isEmpty(str2)) {
            return a(str2);
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, ifj> f31001a = new HashMap();
        public final ven b;
        public final String c;

        public a(ven venVar, String str) {
            this.b = venVar;
            this.c = str;
        }

        public boolean a(JSONArray jSONArray, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fda6ea5c", new Object[]{this, jSONArray, new Long(j)})).booleanValue();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                String[] split = optString.split(",");
                if (split.length >= 2) {
                    try {
                        long parseLong = Long.parseLong(split[0].trim());
                        long parseLong2 = Long.parseLong(split[1].trim());
                        if (j >= parseLong && j < parseLong2) {
                            return true;
                        }
                        kva.d("RemoteConfigPuller.Parser", "bucketId " + j + " is not in range " + optString);
                    } catch (NumberFormatException e) {
                        kva.d("RemoteConfigPuller.Parser", "checkBucketRange failed due to " + e.getMessage());
                    }
                }
            }
            kva.d("RemoteConfigPuller.Parser", "bucketId " + j + " is not in any range");
            return false;
        }

        public boolean b(JSONObject jSONObject) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("202cae08", new Object[]{this, jSONObject})).booleanValue();
            }
            try {
                kva.d("RemoteConfigPuller.Parser", "checkCondition, condition: " + jSONObject.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("app_version");
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                z = Pattern.compile(string).matcher(this.c).matches();
                            } catch (PatternSyntaxException e) {
                                kva.d("RemoteConfigPuller.Parser", "compile pattern " + e.getPattern() + " failed due to:" + e.getMessage());
                                z = false;
                            }
                            if (z) {
                                kva.d("RemoteConfigPuller.Parser", "appVersion(" + this.c + ") matches " + string);
                                return true;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                kva.d("RemoteConfigPuller.Parser", "checkCondition failed when parse json string: " + e2.toString());
            }
            kva.d("RemoteConfigPuller.Parser", "condition check failed");
            return false;
        }

        public void c(tij tijVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e72558c", new Object[]{this, tijVar, str, str2});
                return;
            }
            p2w d = t2w.d(str, str2);
            kva.d("RemoteConfigPuller.Parser", "create variation " + d.getName() + ":" + d.getValue());
            String valueOf = String.valueOf(tijVar.getExperimentId());
            ifj ifjVar = (ifj) ((HashMap) this.f31001a).get(valueOf);
            if (ifjVar != null) {
                kva.d("RemoteConfigPuller.Parser", "updated variationSet: " + tijVar.getName());
                ifjVar.b(d);
                return;
            }
            ifj c = t2w.c(tijVar);
            kva.d("RemoteConfigPuller.Parser", "created variationSet: " + tijVar.getName());
            c.b(d);
            ((HashMap) this.f31001a).put(valueOf, c);
        }

        public Map<String, tij> d(Map<String, ifj> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f01870db", new Object[]{this, map});
            }
            HashMap hashMap = new HashMap(map.size());
            ifj c = t2w.c(tij.EMPTY);
            for (Map.Entry<String, ifj> entry : map.entrySet()) {
                ifj value = entry.getValue();
                c.d(value);
                value.clear();
                hashMap.put(entry.getKey(), value);
            }
            hashMap.put(r1r.KEY_AGE_VARIATIONS, c);
            return Collections.unmodifiableMap(hashMap);
        }

        public long f(JSONObject jSONObject, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3bd03245", new Object[]{this, jSONObject, new Long(j)})).longValue();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null && a(optJSONArray, j)) {
                    try {
                        return Long.parseLong(next);
                    } catch (NumberFormatException e) {
                        kva.d("RemoteConfigPuller.Parser", "gatherGroup failed due to " + e.getMessage());
                    }
                }
            }
            return -1L;
        }

        public r2w g(JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r2w) ipChange.ipc$dispatch("ca41361d", new Object[]{this, jSONObject, jSONObject2});
            }
            long optLong = jSONObject2.optLong("exp_id", -1L);
            String optString = jSONObject2.optString("group_id");
            if (optLong == -1 || TextUtils.isEmpty(optString)) {
                return tij.EMPTY;
            }
            String valueOf = String.valueOf(optLong);
            r2w r2wVar = (r2w) ((HashMap) this.f31001a).get(valueOf);
            if (r2wVar != null) {
                return r2wVar;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(valueOf);
            if (optJSONObject == null) {
                return tij.EMPTY;
            }
            tij e = e(jSONObject, optLong, optJSONObject);
            if (e != tij.EMPTY) {
                ((HashMap) this.f31001a).put(valueOf, t2w.c(e));
            }
            return e;
        }

        public Map<String, tij> h(String str) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d0d2f839", new Object[]{this, str});
            }
            try {
                jSONObject = new JSONObject(str);
                optJSONObject = jSONObject.optJSONObject("var_config");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (optJSONObject == null) {
                return Collections.emptyMap();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("exp_infos");
            if (optJSONObject2 == null) {
                return Collections.emptyMap();
            }
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject.optJSONObject(next);
                if (optJSONObject3 != null) {
                    i(optJSONObject2, next, optJSONObject3);
                }
            }
            return d(this.f31001a);
        }

        public void i(JSONObject jSONObject, String str, JSONObject jSONObject2) {
            long j;
            JSONObject optJSONObject;
            tij e;
            JSONObject optJSONObject2;
            String optString;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("225ffe9f", new Object[]{this, jSONObject, str, jSONObject2});
                return;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        j = Integer.parseInt(next);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                    if (!(j == -1 || (optJSONObject = jSONObject.optJSONObject(next)) == null || (e = e(jSONObject, j, optJSONObject)) == tij.EMPTY || (optJSONObject2 = jSONObject2.optJSONObject(next)) == null || (optString = optJSONObject2.optString(String.valueOf(e.getGroupId()), null)) == null)) {
                        c(e, str, optString);
                    }
                }
            }
        }

        public tij e(JSONObject jSONObject, long j, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tij) ipChange.ipc$dispatch("7b2d0657", new Object[]{this, jSONObject, new Long(j), jSONObject2});
            }
            tij tijVar = (tij) ((HashMap) this.f31001a).get(String.valueOf(j));
            if (tijVar != null) {
                return tijVar;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("conditions");
            if (optJSONObject == null) {
                return tij.EMPTY;
            }
            if (!b(optJSONObject)) {
                return tij.EMPTY;
            }
            int optInt = jSONObject2.optInt("bucket_num");
            if (optInt <= 0) {
                return tij.EMPTY;
            }
            String optString = jSONObject2.optString("exp_hash_factor");
            if (TextUtils.isEmpty(optString)) {
                return tij.EMPTY;
            }
            long c = kva.c(((x8l.d) this.b).a(jSONObject2.optString("exp_hash_key")), optString, optInt);
            if (c == -1) {
                return tij.EMPTY;
            }
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("parent_exp");
            if (optJSONObject2 != null) {
                r2w g = g(jSONObject, optJSONObject2);
                tij tijVar2 = tij.EMPTY;
                if (g == tijVar2) {
                    return tijVar2;
                }
            }
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("groups");
            if (optJSONObject3 == null) {
                return tij.EMPTY;
            }
            long f = f(optJSONObject3, c);
            if (f == -1) {
                return tij.EMPTY;
            }
            long optLong = jSONObject2.optLong("exp_version", -1L);
            if (optLong == -1) {
                return tij.EMPTY;
            }
            return t2w.b(jSONObject2.optString("exp_name", ""), j, optLong, f, c);
        }
    }
}
