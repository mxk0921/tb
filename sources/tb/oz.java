package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class oz implements e7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d7e f25758a;

    static {
        t2o.a(729810262);
        t2o.a(447741982);
    }

    public abstract int b(String str, JSONObject jSONObject);

    public abstract int c(String str, String str2, d7e d7eVar);

    public final int f(List<Long> list, d7e d7eVar) {
        int i;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bddc3b7", new Object[]{this, list, d7eVar})).intValue();
        }
        rpv rpvVar = (rpv) d7eVar;
        int g = rpvVar.g();
        JSONArray f = rpvVar.f();
        int size = f.size();
        int i2 = 0;
        for (Long l : list) {
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 >= f.size()) {
                    i = size;
                    break;
                }
                Object obj = f.get(i3);
                if (obj instanceof Number) {
                    j = Long.parseLong(String.valueOf(obj));
                } else {
                    j = 0;
                }
                if (longValue <= j) {
                    i = i3 + 1;
                    break;
                }
                i3++;
            }
            i2 += i * g;
        }
        return i2;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca6b8a1", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("score", String.valueOf(i));
        tve.c("", null, "1.0", "DOJOAbility", null, hashMap);
    }

    public abstract void h();

    public final String j() {
        String str;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4684be0f", new Object[]{this});
        }
        try {
            str = en1.a();
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        try {
        } catch (Exception e3) {
            e = e3;
            sdh.a(ModuleName.PRELOAD_ABILITY, "getBxFeature", "getBxFeature调用异常，" + e.getMessage());
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return k();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || parseObject.getJSONArray("data") == null) {
            str = k();
        }
        sdh.b(ModuleName.PRELOAD_ABILITY, "res：" + str);
        return str;
    }

    public abstract String k();

    public void l(d7e d7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22520c9", new Object[]{this, d7eVar});
        } else {
            this.f25758a = d7eVar;
        }
    }

    @Override // tb.e7e
    public int a(xbd xbdVar) {
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b21f0e", new Object[]{this, xbdVar})).intValue();
        }
        enm enmVar = (enm) xbdVar;
        String a2 = enmVar.a();
        String b = enmVar.b();
        if (TextUtils.isEmpty(a2) || this.f25758a == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "mRules == null,blockId: " + a2);
            return 0;
        }
        String j = j();
        if (TextUtils.isEmpty(j)) {
            d = c(a2, b, this.f25758a);
        } else {
            d = d(j, a2, b);
        }
        int i = (int) (d * 0.1d);
        g(i);
        return Math.min(i + 90, 100);
    }

    public final int d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6665ee4", new Object[]{this, str, str2, str3})).intValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "object == null,blockId: " + str2);
            return 0;
        }
        JSONArray jSONArray = parseObject.getJSONArray("data");
        if (jSONArray == null || jSONArray.isEmpty()) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "dataArray == null,blockId: " + str2);
            return 0;
        }
        int e = e(i(jSONArray, TextUtils.isEmpty(str3) ? str2 : str3), this.f25758a, str2, str3);
        sdh.b(ModuleName.PRELOAD_ABILITY, "score:" + e);
        return e;
    }

    public final int e(List<Long> list, d7e d7eVar, String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9734c", new Object[]{this, list, d7eVar, str, str2})).intValue();
        }
        sdh.b(ModuleName.PRELOAD_ABILITY, "calculateScoreForCardType blockId:" + str + ",slotId: " + str2);
        rpv rpvVar = (rpv) d7eVar;
        JSONArray e = rpvVar.e();
        if (e.contains("click")) {
            i = list.size() * rpvVar.b();
            sdh.b(ModuleName.PRELOAD_ABILITY, "clickScore:" + i);
        } else {
            i = 0;
        }
        if (e.contains("stayTime")) {
            i2 = f(list, rpvVar);
            sdh.b(ModuleName.PRELOAD_ABILITY, "stayTimeScore:" + i2);
        } else {
            i2 = 0;
        }
        if (e.contains("distance")) {
            i3 = c(str, str2, rpvVar);
            sdh.b(ModuleName.PRELOAD_ABILITY, "distanceScore:" + i3);
        } else {
            i3 = 0;
        }
        if (e.contains("biz")) {
            i4 = b(str, ((rpv) this.f25758a).a());
            sdh.b(ModuleName.PRELOAD_ABILITY, "bizScore:" + i4);
        }
        return i + i2 + i3 + i4;
    }

    public final List<Long> i(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76529d52", new Object[]{this, jSONArray, str});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                if (jSONArray2.size() <= 2) {
                    return arrayList;
                }
                String string = jSONArray2.getString(2);
                if (string.startsWith("#")) {
                    string = string.substring(1);
                }
                for (String str2 : string.split("#")) {
                    String[] split = str2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    if (split.length == 2 && !split[0].isEmpty() && !split[1].isEmpty()) {
                        String str3 = split[0];
                        long parseLong = Long.parseLong(split[1]);
                        if (TextUtils.equals(str3, str)) {
                            arrayList.add(Long.valueOf(parseLong));
                        }
                    }
                }
            } catch (Exception e) {
                sdh.a(ModuleName.PRELOAD_ABILITY, "parseException", "extractStayDurationsForClickBizCode Exception：" + e);
            }
        }
        return arrayList;
    }
}
